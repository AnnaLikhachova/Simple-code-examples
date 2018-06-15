package lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {

		String[] arr = { "This is the most incradable occasion I have ever dealt with.",
				"Вы поможете мне разобраться в нем?", "Hello" };

		String row = "Unbeleavable situation in this area.";

		System.out.println(Lab1.less(arr));
		System.out.println(Lab1.more(arr));
		System.out.println(Lab1.minSymbol(row));

	}

	/*
	 * Завдання1 варіант 2 Визначити ті рядки, довжина яких менша (більша)
	 * середньої. На вхід поступає масив String. На виході – масив String.
	 */

	public static String[] lessThanAvarage(String[] strings) {
		int avarage = findAvarage(strings);
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() < avarage) {
				list.add(strings[i]);
			}
		}

		return list.toArray(new String[0]);
	}

	// Метод, який знаходіть середню довжіну
	public static int findAvarage(String[] strings) {
		int total = 0;
		for (int i = 0; i < strings.length; i++) {
			total += strings[i].length();
		}

		return total / strings.length;
	}

	public static String[] mockStringArray() {
		String[] arr = { "This is the most incradable occasion I have ever dealt with.",
				"Вы поможете мне разобраться в нем?", "Hello" };
		return arr;
	}

	/*
	 * Завдання1 варіант 2 Визначити ті рядки, довжина яких менша (більша)
	 * середньої. На вхід поступає масив String. На виході – масив String.
	 */

	// Метод, який знаходить рядки, довжина яких менша середньої
	public static String less(String[] arr) {
		int avarage = findAvarage(arr);
		String less = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < avarage) {
				less = arr[i];
			}
		}
		return less;
	}

	// Метод, який знаходить рядки, довжина яких більша середньої
	public static String more(String[] arr) {
		int avarage = findAvarage(arr);
		String more = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > avarage) {
				more = arr[i];
			}
		}
		return more;
	}

	/*
	 * Визначити слово, в якому кількість різних символів мінімальна. Якщо таких
	 * слів декілька, то визначити перше з таких. На вхід поступає рядок із словами.
	 * Словом вважається послідовність символів між пробілами та символами «white
	 * space». На виході – масив String.
	 */

	public static String minSymbol(String row) {

		String found = null;
		String word = null;
		char[] charArr;
		int count = 0;
		int min = 1000;
		char equalChar;
		String[] arr = new String[1];

		// У першому циклі перебіраємо слова, у другому та третьому ціклах перебіраємо
		// символи у слові та шукаємо несхожі символи.
		for (int i = 0; i < row.length(); i++) {
			if (row.charAt(i) == ' ' && i != 0) {
				word = row.substring(0, i);
				row = row.substring(i + 1);
				charArr = word.toCharArray();
				for (int j = 0; j < charArr.length; j++) {
					equalChar = charArr[j];
					for (int k = j; k < charArr.length; k++) {
						if (equalChar != charArr[k]) {
							count++;
						}
					}
				}
				if (count < min) {
					min = count;
					found = word;
				}
				i = 0;
			}

			count = 0;
		}

		arr[0] = found;
		return found;
	}

}

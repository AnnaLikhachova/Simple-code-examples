package lab2;

import java.math.BigInteger;

public class lab2 {

	// Серед простих чисел, які не перевищують заданий n, знайти таке,
	// в двійковій формі якого максимальна кількість одиниць. Просте число – це
	// натуральне число, яке ділиться на 1 та на себе.

	public static int findNumberNull(int integer) {
		int bigger0 = 0;
		int biggerInteger0 = 0;
		for (int j = 3; j <= integer; j++) {
			BigInteger bigInteger = BigInteger.valueOf(j);
			boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(j));
			if (probablePrime) {
				String convert = Integer.toBinaryString(j);
				char[] array = convert.toCharArray();
				int number0 = 0;
				for (int i = 0; i < array.length; i++) {
					if (array[i] == '0') {
						number0 += 1;
					}
				}

				if (number0 > bigger0) {
					bigger0 = number0;
					biggerInteger0 = j;
				}
			}
		}
		System.out.println("Наибольшее количество нолей " + bigger0);
		System.out.println("Простое число " + biggerInteger0);
		return biggerInteger0;
	}

	// Серед простих чисел, які не перевищують заданий n, знайти таке, в
	// двійковій формі якого максимальна кількість нулів. Просте число – це
	// натуральне число, яке ділиться на 1 та на себе.

	public static int findNumberOne(int integer) {
		int bigger1 = 1;
		int biggerInteger1 = 1;
		for (int j = 3; j <= integer; j++) {
			BigInteger bigInteger = BigInteger.valueOf(j);
			boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(j));
			if (probablePrime) {
				String convert = Integer.toBinaryString(j);
				char[] array = convert.toCharArray();
				int number1 = 0;
				for (int i = 0; i < array.length; i++) {
					if (array[i] == '1') {
						number1 += 1;
					}
				}
				if (number1 > bigger1) {
					bigger1 = number1;
					biggerInteger1 = j;
				}
			}
		}
		System.out.println("Наибольшее количество едениц " + bigger1);
		System.out.println("Простое число " + biggerInteger1);
		return biggerInteger1;
	}

	// Розробити функцію, яка визначає кількість надпростих чисел в натуральному
	// ряді. Функція приймає на вхід натуральне число не більше 1000. Надпростим
	// називається число, якщо воно є простим та число, яке отримане з нього записом
	// цифр у зворотному порядку, теж є простим.

	public static int findSimple(int integ) {
		int sum = 0;

		if (integ <= 1000) {
			for (int k = integ; k >= 10; k--) {
				String a = Integer.toString(integ);
				StringBuffer b = new StringBuffer(a);
				b.reverse();
				int number = Integer.parseInt(b.toString());
				BigInteger bigInteger = BigInteger.valueOf(integ);
				boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integ));
				BigInteger bigInteger1 = BigInteger.valueOf(number);
				boolean probablePrime1 = bigInteger1.isProbablePrime((int) Math.log(number));
				System.out.println(probablePrime + "   " + integ);
				System.out.println(probablePrime1 + "   " + number);
				if (probablePrime1 && probablePrime) {
					sum=sum+ 1;	
				}
				integ--;
			}
			System.out.println("Колличество сверхпростых чисел " + sum);

		} else
			System.out.println("Ви ввели недопустимое число");
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(lab2.findNumberNull(25));
		System.out.println(lab2.findNumberOne(25));
		System.out.println(lab2.findSimple(25));
	}

}

package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Processor {

	// Реалізувати процесор касового апарату супермаркету. Процесор отримує на вхід
	// товари разом із кількістю та формує чек. В чеку товар має зустрічатися тільки
	// один раз разом із сумарною кількістю. Навіть якщо процесор отримає однаковий
	// товар декілька разів, то в чеку цей товар має бути надрукований один раз із
	// сумарною кількістю.

	private int totalPrice = 0;
	Product product;
	
	Map<String, Integer> cashDesk = new HashMap<String, Integer>();
	List<Product> products = new ArrayList<Product>();
	
	Iterator<Product> iterator = products.iterator();

	public void processing(Product product) {
		if (cashDesk.containsKey(product.getName())) {
			product.setQuantity(product.getQuantity() + 1);
			cashDesk.put(product.getName(), product.getPrice() * product.getQuantity());
			totalPrice = totalPrice + product.getPrice();
		} else {
			cashDesk.put(product.getName(), product.getPrice());
			totalPrice = totalPrice + product.getQuantity() * product.getPrice();
		}
	}

	public void process(Product product) {
		System.out.println("we begin adding");
		if (products.isEmpty()) {
			System.out.println("we add one product inside sycle");
			products.add(product);
		} else {
			for (Product prod : products) {
				System.out.println("we inside the sycle");
				if (prod.getName() == ((Product) product).getName()) {
					System.out.println("we begin evaluate names");
					prod.setQuantity(prod.getQuantity() + 1);
					System.out.println("we add the same product");
					System.out.println(products.toString());
				} else
					products.add(product);
			}
		}
	}

	public void addProduct(Product product) {
		System.out.println("we begin adding");
		if (products.isEmpty()) {
			System.out.println("we add one product inside sycle");
			products.add(product);
		} else {
			while (iterator.hasNext()) {
				System.out.println("we inside");
				if (iterator.next().getName() == product.getName()) {
					product.setQuantity(product.getQuantity() + 1);
				} else
					products.add(product);
			}
		}
	}

	public void finalCheck() {
		System.out.println("CHECK");
		System.out.println("---------------------");
		for (Map.Entry<String, Integer> entry : cashDesk.entrySet())
			System.out.println("Product: " + entry.getKey() + ". Price: " + entry.getValue());
		System.out.println("---------------------");
		System.out.println("Total price: " + totalPrice);

	}
	


}

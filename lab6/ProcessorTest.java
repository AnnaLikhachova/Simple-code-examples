package lab6;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProcessorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Processor process = new Processor();
		Product product =generateProduct();
		process.processing(product);
		Assert.assertFalse(process.cashDesk.isEmpty());
	
	}

	public Product generateProduct() {
		List<Product> products = new ArrayList<Product>();
		Product apple = new Product("Apple", 45, 1);
		Product melon = new Product("Melon", 20, 1);
		Product cheese = new Product("Cheese", 13, 1);
		Product bri = new Product("Cheese", 42, 1);
		Product salami = new Product("Cheese", 56, 1);
		Product tomato = new Product("Cheese", 12, 1);
		Product cucember = new Product("Cheese", 10, 1);
		Product onion = new Product("Cheese", 5, 1);
		Product parsley = new Product("Cheese", 3, 1);
		products.add(apple);
		products.add(melon);
		products.add(cheese);
		products.add(bri);
		products.add(salami);
		products.add(tomato);
		products.add(cucember);
		products.add(onion);
		products.add(parsley);
		return products.get((int) (Math.random() * 10));

	}
}

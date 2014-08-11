import junit.framework.TestCase;

import org.junit.Test;

import com.agilebootcamp.tw.service.OrderService;

public class TestPricingEngine extends TestCase {

	// BRAZIL:B123AB1234567:IPHONE:20:IPOD:10
	// 2650:90:100:80:50
	@Test
	public void testInput1() {
		String inputString = "BRAZIL:B123AB1234567:IPHONE:20:IPOD:10";
		String actual = OrderService.fulfill(inputString);
		assertEquals("2650:90:100:80:50", actual);
	}

	// ARGENTINA:B123AB1234567:IPHONE:22:IPOD:10
	// 3910:90:100:80:48
	@Test
	public void testInput2() {
		String inputString = "ARGENTINA:B123AB1234567:IPHONE:22:IPOD:10";
		String actual = OrderService.fulfill(inputString);
		assertEquals("3910:90:100:80:48", actual);
	}

	// INPUT 3:
	// BRAZIL:AAB123456789:IPHONE:125:IPOD:70
	// OUTPUT 3:
	// 19260:30:100:0:25
	@Test
	public void testInput3() {

		String inputString = "BRAZIL:AAB123456789:IPHONE:125:IPOD:70";

		String actual = OrderService.fulfill(inputString);
		assertEquals("19260:30:100:0:25", actual);

	}

	// INPUT 4:
	// ARGENTINA:AAB123456789:IPOD:50:IPHONE:25
	// OUTPUT 4:
	// 8550:100:50:80:45
	@Test
	public void testInput4() {
		String inputString = "ARGENTINA:AAB123456789:IPOD:50:IPHONE:25";

		String actual = OrderService.fulfill(inputString);
		assertEquals("8550:100:50:80:45", actual);

	}

	//	
	// INPUT 5:
	// BRAZIL:IPHONE:50:IPOD:150
	// OUTPUT 5:
	// 18500:0:50:50:50
	@Test
	public void testInput5() {
		String inputString = "BRAZIL:IPHONE:50:IPOD:150";

		String actual = OrderService.fulfill(inputString);
		assertEquals("18500:0:50:50:50", actual);
	}

	//	
	// INPUT 6:
	// BRAZIL:IPHONE:250:IPOD:150
	// OUTPUT 6:
	// OUT_OF_STOCK:100:100:100:50
	//	
	@Test
	public void testInput6() {
		String inputString = "BRAZIL:IPHONE:250:IPOD:150";

		String actual = OrderService.fulfill(inputString);
		assertEquals("OUT_OF_STOCK:100:100:100:50", actual);
	}

}

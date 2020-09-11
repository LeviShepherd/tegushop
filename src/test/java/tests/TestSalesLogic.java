package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.SalesLogic;
import model.Tegu;

public class TestSalesLogic {
	Tegu tegu = new Tegu();
	SalesLogic sl = new SalesLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSalePrice() {
		tegu.setPrice(500);
		double salePrice = sl.calculateSalePrice(tegu);
		assertEquals(535.00, salePrice, 0.0);
	}
	
	@Test
	public void testCalculateShipping() {
		tegu.setPrice(500);
		double shipRate = sl.calculateShipping(tegu);
		assertEquals(50.00, shipRate, 0.0);
	}
	
	@Test
	public void testCalculateTotal() {
		tegu.setPrice(500);
		double total = sl.calculateTotal(tegu);
		assertEquals(585.00, total, 0.0);
	}

}

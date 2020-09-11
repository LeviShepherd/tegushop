package model;

public class SalesLogic {
	
	/**
	 * 
	 * @param tegu
	 * @return
	 */
	public double calculateSalePrice(Tegu tegu) {
		double taxRate = 1.07;
		double salePrice = tegu.getPrice() * taxRate;
		
		return salePrice;
	}
	
	/**
	 * 
	 * @param tegu
	 * @return
	 */
	public double calculateShipping(Tegu tegu) {
		double shipRate = 0;
		
		if(tegu.getPrice() >= 500) {
			shipRate = 50.00;
		} else {
			shipRate = 20.00;
		}
		
		return shipRate;
	}
	
	/**
	 * 
	 * @param tegu
	 * @return
	 */
	public double calculateTotal(Tegu tegu) {
		double total = 0;
		total = (calculateSalePrice(tegu) + calculateShipping(tegu));
		
		return total;
	}
}

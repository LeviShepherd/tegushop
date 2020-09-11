package model;

public class TeguRequest {
	
	/**
	 * 
	 * @param color
	 * @param age
	 */
	public void sendRequest(String color, int age) {
		Tegu tegu = new Tegu();
		tegu.setColor(color);
		tegu.setAge(age);
	}
	
	/**
	 * 
	 * @param tegu
	 * @return string
	 */
	public String getRequest(Tegu tegu) {
		String request = "";
		request = "There is a request for a " + tegu.getColor() + " tegu around " + Integer.toString(tegu.getAge()) + " years old.";
		
		return request;
	}
	
	/**
	 * 
	 * @param tegu
	 * @return true/false
	 */
	public boolean wildCaughtPreference(Tegu tegu) {
		boolean wild = tegu.isWildCaught();
		if(wild == true) {
			return true;
		} else {
			return false;
		}
	}
}

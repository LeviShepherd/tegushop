package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Tegu;
import model.TeguRequest;

public class TestTeguRequest {
	Tegu tegu = new Tegu();
	TeguRequest tr = new TeguRequest();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetRequest() {
		tegu.setColor("Blue");
		tegu.setAge(3);
		String request = tr.getRequest(tegu);
		assertEquals("There is a request for a Blue tegu around 3 years old.", request);
	}
	
	@Test
	public void testWildCaughtPreferenceTrue() {
		tegu.setWildCaught(true);
		boolean isWild = tr.wildCaughtPreference(tegu);
		assertTrue(isWild == true);
	}
	
	@Test
	public void testWildCaughtPreferenceFalse() {
		tegu.setWildCaught(true);
		boolean isWild = tr.wildCaughtPreference(tegu);
		assertFalse(isWild == false);
	}

}

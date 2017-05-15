package tests;

import org.junit.Assert;
import org.junit.Test;

import vikingos.Vikingo;

public class TestVikingo {

	@Test
	public void testConstruye() {
		
		Vikingo v1 = new Vikingo(10,100);
		Assert.assertEquals(10,v1.getAtaque());
		Assert.assertEquals(100,v1.getSalud());
	}
	
	

}

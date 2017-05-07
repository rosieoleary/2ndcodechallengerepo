package rosieOLeary;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {
	Boat testboat = new Boat("testname", "testcoo", 0);
	

	@Test
	public void testgetName() {
		assertEquals(testboat.getName(), "testname");
	}
	@Test
	public void testsetName(){
		testboat.setName("newtestname");
		assertEquals(testboat.getName(), "newtestname");
	}
	@Test
	public void  testgetCoo(){
		assertEquals(testboat.getCountryoforigin(), "testcoo");
	}
	@Test
	public void testsetCoo(){
		testboat.setCountryoforigin("newtestcoo");
		assertEquals(testboat.getCountryoforigin(),"newtestcoo");
	}
	@Test
	public void testgetSize(){
		assertEquals(testboat.getSize(), 0);
	}
	@Test
	public void testsetSize(){
		testboat.setSize(100);
		assertEquals(testboat.getSize(),100);
	}
	@Test
	public void testsetSpeed(){
		testboat.speed = 100;
		assertEquals(testboat.getSpeed(),100);
		
		}
	public void testaccelerate(){
		testboat.speed=100;
		testboat.accelerate();
		
		assertEquals(testboat.getSpeed(),101);
	}
	@Test 
	public void testdecelerate(){
		testboat.speed= 100;
		testboat.deccelerate();
		
		assertEquals(testboat.getSpeed(),99);
	}
	@Test
	public void testgetpersonlist(){
		assertNotNull(testboat.getPersonList());
	}

}

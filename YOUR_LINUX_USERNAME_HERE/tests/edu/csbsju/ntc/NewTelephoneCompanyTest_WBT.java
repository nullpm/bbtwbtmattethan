package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}
	  
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidLength1() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidLength2() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidLength3() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testDiscountedStartimeAndDuration1(){
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1768.0",1768.0 == charge);
	}
	@Test
	public void testDiscountedStartimeAndDuration2(){
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1078.48",1078.48 == charge);
	}
	@Test
	public void testDiscountedStartimeAndDuration3(){
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1078.48",1078.48 == charge);
	}
	@Test
	public void testDiscountedStartimeAndDuration4(){
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1149.20",1149.20 == charge);
	}
	
	@Test
	public void testDiscountedStartTimeOnly(){
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1248.00", 1248.00==charge);
	}
	
	@Test
	public void testDiscountedStartTimeOnly2(){
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1227.20", 1227.20==charge);
	}

	@Test
	public void testDiscountedStartTimeOnly3(){
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double charge = ntc.computeCharge();
		assertTrue("charge is 20.80", 20.80==charge);
	}

	@Test
	public void testDiscountedStartTimeOnly4(){
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue("charge is 208.80", 208.00==charge);
	}
	
	@Test
	public void testDiscountedStartTimeOnly5(){
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue("charge is 208.80", 208.00==charge);
	}
	
	@Test
	public void testDiscountedStartTimeOnly6(){
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue("charge is 208.80", 208.00==charge);
	}
	
	@Test
	public void testDiscountedDurationOnly(){
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double charge = ntc.computeCharge();
		assertTrue("charge is 2298.40", 2298.40==charge);
	}
	
	@Test
	public void testDiscountedDurationOnly2(){
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue("charge is 2156.96", 2156.96==charge);
	}
	
	@Test
	public void testNoDiscounts(){
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double charge = ntc.computeCharge();
		assertTrue("charge is 1664.00", 1664.00==charge);
	}
	
	@Test
	public void testNoDiscounts2(){
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double charge = ntc.computeCharge();
		assertTrue("charge is 41.60", 41.60==charge);
	}
	
	@Test
	public void testNoDiscounts3(){
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double charge = ntc.computeCharge();
		assertTrue("charge is 2454.40", 2454.40==charge);
	}
	
	@Test
	public void testNoDiscounts4(){
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double charge = ntc.computeCharge();
		assertTrue("charge is 2496.00", 2496.00==charge);
	}
}

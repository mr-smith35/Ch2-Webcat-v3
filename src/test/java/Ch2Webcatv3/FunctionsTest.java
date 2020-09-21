import static org.junit.Assert.*;

import org.junit.Test;


public class FunctionsTest {

	@Test
	public void testSlope() {
		assertEquals(-0.161463 , Functions.slope(-8.7, 6.7, 103.4, -11.4),0.0001);
	}

	@Test
	public void testGeometricMean() {
		assertEquals(5.96389, Functions.geometricMean(3.12, 11.4),0.0001);
	}

	@Test
	public void testQuadraticSolution() {
		assertEquals(4.36031, Functions.quadraticSolution(1.8,-7.0,-3.7),0.0001);
	}
	
	@Test
	public void testQuadraticSolutionZero() {
		assertEquals(1.43372, Functions.quadraticSolution(1.8,0,-3.7),0.0001);
	}

	@Test
	public void testFirstAndLast() {
		assertEquals("#K", Functions.firstAndLast("#ijghidilfKK"));
	}
	
	@Test
	public void testFirstAndLastSingleLetter() {
		assertEquals("TT", Functions.firstAndLast("T"));
	}

	@Test
	public void testMiddleCapitalization() {
		assertEquals("cKIHELKd", Functions.middleCapitalization("CkIHelKD"));
	}
	
	@Test
	public void testMiddleCapitalizationTwoLetters() {
		assertEquals("xy", Functions.middleCapitalization("xY"));
	}
	
	@Test
	public void testMiddleCapitalizationOneLetter() {
		assertEquals("q", Functions.middleCapitalization("Q"));
	}
	
	@Test
	public void testMiddleCapitalizationNoLetters() {
		assertEquals("", Functions.middleCapitalization(""));
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1; 
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5); 
		g2 = new GradeBook(5);
		g1.addScore(10);
		g1.addScore(20);
		g2.addScore(50);
		g2.addScore(60);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1=g2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("10.0 20.0 0.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("50.0 60.0 0.0 0.0 0.0 "));
		
		assertEquals(g1.getScoreSize(), 2);
		assertEquals(g2.getScoreSize(), 2);
	}

	@Test
	void testSum() {
		assertEquals(g1.sum(), 30);
		assertEquals(g2.sum(), 110);
	}

	@Test
	void testMinimum() {
		assertEquals(g1.minimum(), 10);
		assertEquals(g2.minimum(), 50);
	}

	@Test
	void testFinalScore() {
		assertEquals(g1.finalScore(), 20);
		assertEquals(g2.finalScore(), 60);
	}

	@Test
	void testScoreSize() {
		assertEquals(g1.getScoreSize(), 2);
		assertEquals(g2.getScoreSize(), 2);
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("10.0 20.0 0.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("50.0 60.0 0.0 0.0 0.0 "));
	}

}

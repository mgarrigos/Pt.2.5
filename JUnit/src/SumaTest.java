import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumaTest {

	Suma suma=new Suma(2,3);
	public SumaTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(5==suma.sumar());
	}
	@Test
	public void test2() {
		assertTrue(3==suma.sumar());
	}
	@Test
	public void test3() {
		assertTrue(-1== suma.sumar());
	}

	@Test
	public void test4() {
		assertTrue('d'== suma.sumar());
	}

}

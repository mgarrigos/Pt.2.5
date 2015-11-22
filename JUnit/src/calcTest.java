import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class calcTest {
	calc calc=new calc();
	
	public calcTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	System.out.println("Inicio pruebas");
	System.out.println("-----------------------------------------------------");
	}
	
	@AfterClass
	public static void tearDownClass() {
	System.out.println("------------------------------------------------");
	System.out.println("Fin pruebas");
	}
	
	@Before
	public void setUp()
	{
	System.out.println("Comienza el test");
	}
	@After
	public void tearDown()
	{
	System.out.println("Termina el test");
	}

	@Test
	public void test() {
		assertEquals(3,calc.add(2, 1));	
	}
	@Test
	public void test2() {
		assertEquals(3,calc.add(1, 1));	
	}
	@Test
	public void test3() {
		assertEquals(-2,calc.add(-1, -1));	
	}
	@Test
	public void test4() {
		assertEquals(3,calc.sub(4, 1));	
	}
	@Test
	public void test5() {
		assertEquals(1,calc.sub(3, 1));	
	}
	public void test6() {
		assertEquals(-4,calc.sub(-3, -1));	
	}
	@Test
	public void test7() {
		assertEquals(1,calc.mul(1, 1));	
	}
	@Test
	public void test8() {
		assertEquals(5,calc.mul(2, 2));	
	}
	@Test
	public void test9() {
		assertEquals(0,calc.mul(0, 0));	
	}
	@Test
	public void test10() {
		assertEquals(1,calc.mul(-1, -1));	
	}
	@Test
	public void test11() {
		assertEquals(2,calc.div(4, 2));	
	}
	@Test
	public void test12() {
		assertEquals(0,calc.div(2, 2));	
	}
	@Test
	public void test13() {
		assertEquals(-2,calc.div(-4, 2));	
	}

}

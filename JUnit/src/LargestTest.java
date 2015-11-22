import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestTest {
	Largest largest=new Largest();
	
	
	
	
	
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
	public void testLargest() {
		int list[]= {3, 7, 9, 8};
		assertEquals(9,largest.largest(list));
		
	}	
	@Test
	public void testLargest2() {
		int list1[]= {9, 7, 8};
		int list2[]= {7, 9, 8};
		int list3[]={7, 8, 9};
		assertEquals(9,largest.largest(list1));
		assertEquals(9,largest.largest(list2));
		assertEquals(9,largest.largest(list3));
	}	
		@Test
		public void testLargest3() {
			int listduplicados[]={9, 7, 9, 8};
			assertEquals(9,largest.largest(listduplicados));
		}
		@Test
		public void testLargest4() {
			int unvalor[]={7};
			assertEquals(7,largest.largest(unvalor));
		}
		
		@Test
		public void testLargest5() {
			int negativos[]={-4, -6, -7, -22};
			assertEquals(-4,largest.largest(negativos));
		}
		public void testLargest6() {
			int vacio[]={};
		try {
			largest.largest(vacio);
			} catch (Exception e) {
				System.out.println("Error"+e);
	}
		}
		

}

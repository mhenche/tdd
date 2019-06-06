/**
 * 
 */
package es.orange;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

/**
 * @author mad-alumno
 *
 */
public class AddTest {

	@Test
	public void existsAdd() {
		App.add("");
//		fail("Not yet implemented");
	}

	@Test
	public void esVAcio() {
		assertTrue("Pues no es cero!!", App.add("") == 0);
		
	}
	
	@Test
	public void sumauno() {
		assertTrue("Pues no es cero!!", App.add("1") == 1);
	}
	
	@Test
	public void sumados() {
		assertTrue("Pues no es cero!!", App.add("1,3") == 4);
	}
	
	@Test(expected=Exception.class)
	public void sumaLetras() {
		App.add("1,3,A");
	}
	
	
	@Test(expected=Exception.class)
	public void controlMilenials() {
		assertTrue("Pues no es cero!!", App.add("1000,3") == 3);
	}
}

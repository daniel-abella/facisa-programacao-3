package br.cesed.si.p3.ed.warray;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestWarray {

	/**
	 * Comments for this test
	 */
	@Test
	public void testInitialList() {

		Warray w = new Warray(1);
		Assert.assertEquals(w.size(), 0);
	}

	/**
	 * Comments for this test
	 */
	@Test
	public void testAdd1() {

		try {

			Warray w = new Warray(1);
			w.add("Element 1");
			Assert.assertEquals(w.size(), 1);

		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Comments for this test
	 * @throws InvalidValueException 
	 */
	@Test(expected=InvalidValueException.class)
	public void testAdd2() throws InvalidValueException {

		Warray w = new Warray(1);
		w.add(null);
	}

}

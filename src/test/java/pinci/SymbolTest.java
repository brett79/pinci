package pinci;

import static org.junit.Assert.*;

import org.junit.Test;

public class SymbolTest {

	@Test
	public void testGetSymbol() {
		
		Symbol s1 = new Symbol('A');
		char g1 = s1.getSymbol();
		assertEquals('A', g1);
	}

	@Test
	public void testSetSymbol() {
		Symbol s1 = new Symbol('A');
		s1.setSymbol('B');
		char g1 = s1.getSymbol();
		assertEquals('B', g1);
	}

	@Test
	public void testSymbol() {
		Symbol s1 = new Symbol('Z');
		assertEquals('Z',s1.symbol);
	}

}

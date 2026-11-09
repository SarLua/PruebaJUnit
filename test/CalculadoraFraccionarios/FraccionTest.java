package CalculadoraFraccionarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FraccionTest {

	@Test
	void test() {
		Fraccion f,g, h, i, j;
		f=new Fraccion(3,4);
		g=new Fraccion(5,6);
		h=new Fraccion(12,15);
		h.simplificar();
		i=new Fraccion(1,12);
		j=new Fraccion(5,8);
		
		assertAll(
				() -> assertEquals(3,f.minimo(3,5)),
				() -> assertEquals(3,f.mcd(15,12,f.minimo(15,12))),
				() -> assertEquals(3,f.minimo(3,5)),
				() -> assertEquals(4,h.getNum()),
				() -> assertEquals(5,h.getDen()),
				() -> assertEquals(19,f.sumar(g).getNum()),
				() -> assertEquals(12,f.sumar(g).getDen()),
				() -> assertEquals(i,g.restar(f)),
				//() -> assertEquals(i,g.multiplicar(f), "No nos dió la multiplicación"),
				() -> assertEquals(j,g.multiplicar(f), "OMG, nos la multiplicación")
		);
	}
	
	@Test
	void testDivision() {
		Fraccion f,g, h;
		f=new Fraccion(3,4);
		g=new Fraccion(5,6);
		h=new Fraccion(9,10);
		
		assertEquals(h,f.dividir(g));
	}

}

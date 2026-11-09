package CalculadoraFraccionarios;

public class Fraccion {
	private int num;
	private int den;
	
	
	
	/**
	 * Constructor por defecto de una fracción
	 */
	public Fraccion() {
		den=1;
	}

	/**
	 * @param n: numerador del fraccionario
	 * @param d: denominador del fraccionario
	 */
	public Fraccion(int n, int d) {
		num=n;
		den=d;
	}
	
	public boolean equals(Object o) {
		Fraccion f=(Fraccion)o;
		if ((num==f.num) && (den==f.den))
			return true;
		return false;			
	}
	

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the den
	 */
	public int getDen() {
		return den;
	}

	/**
	 * @param den the den to set
	 */
	public void setDen(int den) {
		this.den = den;
	}

	@Override
	public String toString() {
		return "Fraccion [num=" + num + ", den=" + den + "]";
	}
	
	/**
	 * @param f El segundo sumando
	 * @return suma que es la suma entre this y f
	 */
	public Fraccion sumar (Fraccion f) {
		Fraccion suma=new Fraccion();
		suma.setNum(num*f.getDen()+den*f.getNum());
		suma.setDen(den*f.getDen());
		suma.simplificar();
		return suma;
	}
	
	/**
	 * @param f El sustraendo
	 * @return resta que es la resta entre this y f
	 */
	public Fraccion restar (Fraccion f) {
		Fraccion resta=new Fraccion();
		resta.setNum(num*f.getDen()-den*f.getNum());
		resta.setDen(den*f.getDen());
		resta.simplificar();
		return resta;
	}
	
	/**
	 * @param f El segundo multiplicando
	 * @return prod que es el producto entre this y f
	 */
	public Fraccion multiplicar (Fraccion f) {
		Fraccion prod=new Fraccion();
		prod.setNum(num*f.getNum());
		prod.setDen(den*f.getDen());
		prod.simplificar();
		return prod;
	}
	
	/**
	 * @param f es el divisor
	 * @return div que es la división entre this y f
	 */
	public Fraccion dividir (Fraccion f) {
		Fraccion div=new Fraccion();
		div.setNum(num*f.getDen());
		div.setDen(den*f.getNum());
		div.simplificar();
		return div;
	}
	
	
	
	/**
	 * @return retorna la fracción simplificada
	 */
	public void simplificar() {
		
		int m=mcd(num,den, minimo(num,den));
		setNum(num/m);
		setDen(den/m);
	}
	
	
	/**
	 * @param a: primer número
	 * @param b: segundo número
	 * @return el menor entre a y b
	 */
	public int minimo(int a, int b) {
		if (a<b)
			return a;
		return b;
	}
	
	/**
	 * @param a: primer número
	 * @param b: segundo número
	 * @param min: es el mínimo entre a y b
	 * @return: el mcd entre a y b
	 */
	public int mcd (int a, int b, int min) {
		if (min == 1)
			return min;
		if ((a%min==0) && (b%min==0))
			return min;
		return mcd(a,b,min-1);
	}
	
	
	
}

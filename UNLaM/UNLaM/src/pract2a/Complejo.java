package pract2a;

import java.util.Random;

public class Complejo implements Comparable<Complejo> {
	double  re, im;
	public Complejo() {
		Random r = new Random();
		re = r.nextDouble() * 100;
		im = r.nextDouble() * 100;
	}
	public Complejo(double r, double i){
		re = r;
		im = i;
	}
	public Complejo(double r){
		re = r;
		im = 0;
	}
	public Complejo sumar(Complejo c1, Complejo c2){
		return new Complejo(c1.re + c2.re, c1.im + c2.im);
	}
	public void sumar(Complejo c){
		this.re += c.re;
		this.im += c.im;
	}
	public void sumar(double r){
		this.re += r;
	}
	
	
	public Complejo restar(Complejo c1, Complejo c2){
		return new Complejo(c1.re - c2.re, c1.im - c2.im);
	}
	public void restar(Complejo c){
		this.re -= c.re;
		this.im -= c.im;
	}
	public void restar(double r){
		this.re -= r;
	}
	
	public Complejo multiplicar(Complejo c1, Complejo c2){
		return new Complejo(
				c1.re * c2.re - c1.im * c2.im, 
				c1.re * c2.im + c1.im * c2.re);
	}
	public void multiplicar(Complejo c){
		this.re = this.re * c.re - this.im * c.im;
		this.im = this.re * c.im + this.im * c.re;
	}
	
	public boolean equals(Complejo c){
		if (this.re == c.re && this.im == c.im)
			return true;
		return false;
	}
	
	public Complejo clone(){
		return new Complejo (this.re, this.im);
	}
	
	public double modulo(){
		return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
	}
	public String tostring(){
		String r, i;
		r = Double.toString(this.re);
		r = r.substring(0, r.indexOf('.') + 3 > r.length() - 2 ? 3: 2);
		i = Double.toString(this.im);
		i = i.substring(0, i.indexOf('.') + 3 > i.length() - 2 ? 3: 2);
		//System.out.println("indexof \'.\': " + i.indexOf('.'));
		//System.out.println("substring con el valor de arriba coma 5: \n" + i.substring(0,i.indexOf('.') + 3));
		//i = i.substring(i.indexOf('.'), 2);
		return "( " + r + ", " + i + " )";
		//return  "( " + Double.toString(this.re) + ", " + Double.toString(this.im) + " )";
		//return System.out.printf("( %.2d, %2d )",this.re, this.im);
		
	}
	@Override
	public int compareTo(Complejo c) {
		// TODO Auto-generated method stub
		if (modulo() < c.modulo())
			return -1;
		if (modulo() > c.modulo())
			return 1;
		return 0;
	}
	
	
	
}

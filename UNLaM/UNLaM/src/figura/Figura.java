package figura;

public abstract class Figura {
	private String color;
	
	public Figura() {
		// TODO Auto-generated constructor stub
		color = "azul";
	}
	
	public abstract double area();

	public String dameColor(){
		return color;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c = new Cuadrado (4);
		System.out.println(c.dameColor() + ", area: " +  c.area());
		Figura f1 = new Cuadrado(5);
		System.out.println(f1.dameColor() + ", area: " + f1.area());
	}

}

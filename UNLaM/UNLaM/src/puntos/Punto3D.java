package puntos;

public class Punto3D extends Punto2D {
	private int z;
	public Punto3D() {
		super();
		z = 0;
	}
	
	public Punto3D(int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if ( obj != null && obj.getClass() == this.getClass() ){
			Punto3D miobj = (Punto3D)obj;			
			return miobj.x == this.x && miobj.y == this.y && miobj.z == this.z;
		}
		return false;
	}

}

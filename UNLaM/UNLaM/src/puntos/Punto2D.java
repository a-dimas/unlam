package puntos;

public class Punto2D {
	protected int x;
	protected int y;
	
	public Punto2D() {
		x = 0;
		y = 0;
	}

	public Punto2D(int vx, int vy){
		x = vx;
		y = vy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if ( obj != null && obj.getClass() == this.getClass() ){
			Punto2D miobj = (Punto2D)obj;			
			return miobj.x == this.x && miobj.y == this.y;
		}
		return false;
	}
	
	
	

}

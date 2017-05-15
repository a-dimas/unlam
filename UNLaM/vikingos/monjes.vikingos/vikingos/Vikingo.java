package vikingos;


public class Vikingo {
	
	private Estado estado;
	private int ataque;
	private int salud;
	private EstadoActual estadoActual;
	


	public Vikingo(int atq, int sld) {
		ataque = atq;
		salud = sld;
		estadoActual = EstadoActual.NATURAL;
		
	}
	
	public void calmarse() {
		this.estado = this.estado.calmarse();
	}
	
	public void recibirAtaque(int ataque) {
		this.estado = this.estado.recibirAtaque(ataque);
	}
	
	
	
	
	
	


	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public EstadoActual getEstado() {
		return estadoActual;
	}

	public void setEstado(EstadoActual estado) {
		this.estadoActual = estado;
	}

	

	
	public static void main(String[] args) {
		Vikingo v = new Vikingo(10,100);		
		System.out.println(v.estado.estadoActual.toString());
		v.calmarse();
		System.out.println(v.estado.estadoActual.toString());
		
	}
	

	

}

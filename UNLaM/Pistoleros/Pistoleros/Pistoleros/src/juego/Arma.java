package juego;

public class Arma {
	int daño;
	double alcance;
	int tiros;
	int duracion;
	int balas;
	
	public Arma(int tiros, int daño, double alcance){
		this.tiros = this.balas = tiros;
		this.daño = daño;
		this.alcance = alcance;
	}
	
	protected int getBalas(){
		return balas;
	}
	
	public boolean disparar(Pistolero oponente){
		if (!trabada() && balas > 0){
			System.out.println("\t\tcan shoot! " + balas + " bullets left");
			this.balas--;
			oponente.recibirDisparo(daño);
			return true;
		}
		else {
			System.out.println("\t\tcan't shoot! darn!");
		}
		return false;
	}
	
	public void recargar(){
		this.balas = this.tiros;
	}
	
	private boolean trabada(){
		return false;
	}
}



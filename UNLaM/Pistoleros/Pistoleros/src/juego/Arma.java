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
		if(this.balas > 0) {
			this.balas--;
			oponente.recibirDisparo(daño);
			return true;
		}
		return false;
	}
	
	public void recargar(){
		this.balas = this.tiros;
	}
}



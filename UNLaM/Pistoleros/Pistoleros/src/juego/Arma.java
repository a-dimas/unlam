package juego;

public class Arma {
	int da�o;
	double alcance;
	int tiros;
	int duracion;
	int balas;
	
	public Arma(int tiros, int da�o, double alcance){
		this.tiros = this.balas = tiros;
		this.da�o = da�o;
		this.alcance = alcance;
	}
	
	protected int getBalas(){
		return balas;
	}
	
	public boolean disparar(Pistolero oponente){
		if(this.balas > 0) {
			this.balas--;
			oponente.recibirDisparo(da�o);
			return true;
		}
		return false;
	}
	
	public void recargar(){
		this.balas = this.tiros;
	}
}



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
		if (!trabada() && balas > 0){
			System.out.println("\t\tcan shoot! " + balas + " bullets left");
			this.balas--;
			oponente.recibirDisparo(da�o);
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



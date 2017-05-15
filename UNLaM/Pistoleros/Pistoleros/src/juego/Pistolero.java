package juego;

public class Pistolero {
	short salud;
	int posicion;
	Arma arma;
	
	protected Pistolero(short salud, int posicion, Arma arma){
		this.salud = salud;
		this.posicion = posicion;
		this.arma = arma;
	}
	
	public boolean estaVivo(){
		return (salud > 0);
	}
	
	public void dispara(Pistolero oponente){
		this.arma.disparar(oponente);
	}
	
	public void recibirDisparo(int daño){
		salud -= daño;
	}
	
	public void desplazar (Pistolero oponente){
		if (distancia(oponente) > 0){
			this.posicion++;
		} else {
			this.posicion--;
		}			
	}
	
	private int distancia(Pistolero oponente){
		return oponente.posicion - this.posicion;
	}
	
	public void jugar(Pistolero oponente){
		if(Math.abs(distancia(oponente)) < this.arma.alcance){
			dispara(oponente);
		} else {
			desplazar(oponente);
		}
	}
	
}

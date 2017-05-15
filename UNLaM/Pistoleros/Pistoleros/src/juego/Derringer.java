package juego;

public class Derringer extends Arma {

	public Derringer() {
		super(2, 1, 1.5);
		this.duracion = 8;
	}

	@Override
	public boolean disparar(Pistolero oponente){
		if(this.duracion > 0) {
			this.duracion--;
			return super.disparar(oponente);
		}
		return false;
	}
	
}

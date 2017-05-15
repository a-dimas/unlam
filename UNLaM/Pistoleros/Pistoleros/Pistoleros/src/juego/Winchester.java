package juego;

public class Winchester extends Arma {
	boolean trabada = false;
	public Winchester() {
		super(2, 3, 4);
	}

	@Override
	public void recargar() {
		// TODO Auto-generated method stub
		super.recargar();
		trabada = true;
	}

	@Override
	public boolean disparar(Pistolero oponente) {
		// TODO Auto-generated method stub
		if (trabada) {
			trabada = false;
			return false;
		}
		return super.disparar(oponente);
	}
	
	/*
	 * después de recargar, la Winchester se traba, siempre.
	 */

	
	
}

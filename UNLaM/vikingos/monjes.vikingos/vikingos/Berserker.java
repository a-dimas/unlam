package vikingos;


public class Berserker implements Estado {

	public Berserker(int at, int sl){
		super(at, sl);
	}
	private short cantCalmas = 0;
	
	@Override
	public Estado calmarse() {
		if (++cantCalmas >= 3){
			//((Vikingo)this).setEstado(EstadoActual.NATURAL);
			return new Natural();
		}
		
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

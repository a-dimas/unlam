package vikingos;

public class Natural implements Estado {

	public Natural() {

	}
	
	@Override
	public Estado calmarse() {
		return new Meditacion();
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		
		return null;
	}

}

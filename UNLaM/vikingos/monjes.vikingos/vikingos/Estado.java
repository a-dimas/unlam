package vikingos;

public interface Estado {
	
	public EstadoActual estadoActual = EstadoActual.NATURAL;
	public Estado calmarse();
	public Estado recibirAtaque(int ataque);
	
}

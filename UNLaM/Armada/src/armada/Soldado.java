package armada;

public class Soldado  {

	public enum TropaSoldado{
		HOPLITA, LANZADOR, HONDERO, CABALLERO, ARQUERO
	}
	
	public enum RangoSoldado{
		SOLDADITO, GENERAL
	}
	
	private RangoSoldado rango;
	private TropaSoldado tropa;
	private double velocidad;
	
	public Soldado(RangoSoldado rango, TropaSoldado tropa, double velocidad) {
		this.rango = rango;
		this.tropa = tropa;
		this.velocidad = velocidad;
	}
	
	public RangoSoldado getRango(){ return this.rango; }
	public TropaSoldado getTropa(){ return this.tropa; }
	public double getVelocidad(){ return this.velocidad; }

	@Override
	public String toString() {
		return "\nSoldado [rango=" + rango + ", tropa=" + tropa + ", velocidad=" + velocidad + "]";
	}
	
	
	
}

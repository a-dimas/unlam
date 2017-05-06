package vagones.de.tren;

public class Animal implements Comparable<Animal> {
	private final String nombre;
	private final int agg;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  nombre + agg ;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the agg
	 */
	public int getAgg() {
		return agg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Animal otro) {		
		return otro.agg - agg;
	}

	public Animal(String n, int ag) {
		nombre = n;
		agg = ag;
	}

}

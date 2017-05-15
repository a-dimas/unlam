package armada;

import java.util.*;

public class Armada {

	public static void main(String[] args){
		Armada armada = new Armada();
		
		Soldado soldado1 = new Soldado(
				Soldado.RangoSoldado.GENERAL,
				Soldado.TropaSoldado.ARQUERO,
				10.5
		);
		
		Soldado soldado2 = new Soldado(
				Soldado.RangoSoldado.GENERAL,
				Soldado.TropaSoldado.HOPLITA,
				5.0
		);
		
		Soldado soldado3 = new Soldado(
				Soldado.RangoSoldado.SOLDADITO,
				Soldado.TropaSoldado.HONDERO,
				8.5
		);
		
		
		armada.agregar(soldado1);
		armada.agregar(soldado2);
		armada.agregar(soldado3);
		
		//System.out.println(armada);
		
		armada.formar(TipoFormacion.TROPA);
		
		Map<Soldado.TropaSoldado , List<Soldado>> map = armada.agrupar();
		
		System.out.println(map);
		
	}
	
	public enum TipoFormacion{
		RANGO, VELOCIDAD, TROPA
	}
	
	ArrayList<Soldado> soldados;

	public Armada() {
		this.soldados = new ArrayList<Soldado>();
	}

	public void agregar(Soldado soldado){
		soldados.add(soldado);
	}
	
	public void formar(TipoFormacion formacion){

		switch(formacion){
		case RANGO:
			soldados.sort(new ComparaRango());
			break;
		case VELOCIDAD:
			soldados.sort(new ComparaVelocidad());
			break;
		case TROPA:
			soldados.sort(new ComparaTropa());
			break;
		default:
			break;
		}
		
	}

	public Map<Soldado.TropaSoldado, List<Soldado>> agrupar(){
		Map<Soldado.TropaSoldado, List<Soldado>> grupos = new HashMap<Soldado.TropaSoldado, List<Soldado>>();
		soldados.sort(new ComparaTropa());
		for(Soldado s: soldados){
			List<Soldado> grupo = grupos.get(s.getTropa());
			grupo.add(s);
			grupos.put(s.getTropa(), grupo);
		}
		
		return grupos;
	}
	
	@Override
	public String toString() {
		return "Armada [soldados=" + soldados + "]";
	}
	
}

class ComparaRango implements Comparator<Soldado> {
    @Override
    public int compare(Soldado a, Soldado b) {
        return a.getRango().ordinal() - b.getRango().ordinal();
    }
}

class ComparaVelocidad implements Comparator<Soldado> {
    @Override
    public int compare(Soldado a, Soldado b) {
        return (int)(a.getVelocidad() - b.getVelocidad());
    }
}

class ComparaTropa implements Comparator<Soldado> {
    @Override
    public int compare(Soldado a, Soldado b) {
        return a.getTropa().ordinal() - b.getTropa().ordinal();
    }
}


package ordenamiento;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void qsort(int[] valores){
		int mediana[] = {valores[0], valores[valores.length - 1], valores[(valores.length - 1) / 2]};
		ordenarMediana(mediana);
	}
	
	private static void ordenarMediana(int[] mediana){
		int menor = mediana[0];
		for (int i = 1; i < 3; i++){
			//if (mediana[i])
		}
			
	}

}

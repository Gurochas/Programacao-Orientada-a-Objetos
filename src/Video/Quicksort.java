package Video;

import java.util.Arrays;

public class Quicksort {
	
	public static void main(String[] args) {
		int [] v = {12, 4, 15, 7, 10, 2, 1, 6, 18, 20};
		quicksort(v, 0, v.length-1);
		System.out.println(Arrays.toString(v));
	}

	private static void quicksort(int[] v, int esq, int dir) {
		if(esq < dir) {
			int pivo = dividir(v, esq, dir);;
			quicksort(v, esq, pivo - 1);
			quicksort(v, pivo + 1, dir);
		}
	}

	private static int dividir(int[] v, int esq, int dir) {
		int pivo = v[esq];
		int i = esq + 1;
		int j = dir;
		while(i <= j) {
			if(v[i] <= pivo) i++;
			else if (v[j] > pivo) j--;
			else if (i <= j) {
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esq, j);
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
}

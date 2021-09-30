import java.util.Arrays;

public class QuickSort {
	
	public static int[] quickSort(int[] a, int lowPos, int highPos ) {
		
		if (a.length < 2)
			return a;
 
		if (lowPos >= highPos)
			return a;
 
		
		int middle = lowPos + (highPos - lowPos) / 2;
		int pivot = a[middle];
 
		
		int i = lowPos, j = highPos;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
 
			while (a[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
 
		if (lowPos < j)
			quickSort(a, lowPos, j);
 
		if (highPos > i)
			quickSort(a, i, highPos);
		
		return a;
	}
	
	public static void main(String arg[]) {
		
		int[] a = {22, 91, 24, 78, 6, 89,  98, 99};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	
	}
	
}
 
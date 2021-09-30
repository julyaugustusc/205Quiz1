import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] a) {
		
		if (a.length < 2)
			return a;
		
		for(int i = 0; i < a.length-1; i++) {
			int minPos = i;
			for( int j = i+1; j < a.length-1; j++) {
				if(a[j] < a[minPos]) {
					minPos = j;
				}
			}
			if (minPos != i) {
				int temp = a[minPos];
				a[minPos] = a[i];
				a[i] = temp;	
			}
		}
		
		return a;
		
	}
	
	public static void main(String arg[]) {
		
		int[] a = {22, 91, 24, 78, 6, 89,  98, 99};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}

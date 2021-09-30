import java.util.Arrays;

public class MergeSort {
	
	public static int[] mergeSort(int[] a) {
		
		if (a.length < 2)
			return a;
		
		int midPos = a.length/2;
		int[] b = new int[midPos];
		int[] c = new int[a.length - midPos];
		for (int i = 0; i < midPos; i++) {
			b[i] = a[i];
		}
		for (int i = midPos; i < a.length; i++) {
			c[i - midPos] = a[i];
		}
		mergeSort(b);
		mergeSort(c);
		
		mergeArrays(a, b, c, midPos, a.length - midPos);
		return a;
		
		
	}
	
	public static void mergeArrays(int[] a, int[] b, int[] c, int leftPos, int rightPos) {
		int i = 0, j = 0, k = 0;
		while (i < leftPos && j < rightPos) {
			if (b[i] < c[j]) {
				a[k++] = b[i++];
			}
			else {
				a[k++] = c[j++];
			}
		}
		while (i < leftPos) {
			a[k++] = b[i++];
		}
		while (j < rightPos) {
			a[k++] = c[j++];
		}
	}
	
	public static void main(String arg[]) {
		
		int[] a = {22, 91, 24, 78, 6, 89,  98, 99};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}

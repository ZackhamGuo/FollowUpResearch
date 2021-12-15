
public class ArrayCalculation {
	public static int max(int[] array) {
		int result = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}
	
	public static float average(int[] array) {
		float result = 0;
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		result = (float)sum/array.length;
		
		return result;
	}
	
	public static int min(int[] array) {
		int result = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}
		return result;
	}
	
	public static int countBoolean(boolean[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]) {
				result++;
			}
		}
		return result;
	}
}

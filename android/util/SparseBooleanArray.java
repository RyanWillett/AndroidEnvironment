package android.util;

public class SparseBooleanArray {

	private boolean[] arr;
	public SparseBooleanArray(int count) {
		arr = new boolean[count];
	}
	public void put(int index, boolean b) {
		arr[index] = b;
		
	}
	public boolean get(int i) {
		return arr[i];
	}

}

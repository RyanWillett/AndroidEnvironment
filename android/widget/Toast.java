package android.widget;

public class Toast {

	public static final int LENGTH_LONG = 3;
	public static final int LENGTH_SHORT = 0;

	public static Toast makeText(Object baseContext, String s, int lengthLong) {
		System.out.println("TOAST \t" + s);
		return new Toast();
	}

	public void show() {
		
	}

}

package android.util;

public class Log {

	public static void e(String string, String string2) {
		//System.out.println(string + "\t" + string2.replace("\n", ""));
	}

	public static void d(String string, String string2) {
		//System.out.println(string + "\t" + string2);
	}
	
	static String lastString = null;
	private static long time = 0;
	private static int seconds = 0;
	
	public static void m(String string, String string2) {
		if(!string2.equals(lastString)){
			System.out.println(string + "\t" + string2);
			time = System.currentTimeMillis();
			lastString = string2;
			seconds = 0;
			return;
		}
		long curTime = System.currentTimeMillis();
		if((curTime - time)/1000 > seconds){
			System.out.println(string + "\t" + string2 + "\t" + seconds);
			seconds++;
		}
	}
	
	public static void i(String player, String command){
		System.out.println(player + "\t" + command);
	}
}

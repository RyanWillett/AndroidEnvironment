package android.content;

import android.content.res.Resources;

public class Context{

	public static final int MODE_PRIVATE = 4;
	public static final int BIND_AUTO_CREATE = 0;

	public Resources getResources() {

		return new Resources();
	}

	public void sendBroadcast(Intent i) {
		
		
	}

}

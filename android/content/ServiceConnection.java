package android.content;

import android.os.IBinder;

public interface ServiceConnection {

	public void onServiceConnected(ComponentName className, IBinder binder);
	public void onServiceDisconnected(ComponentName className);
}

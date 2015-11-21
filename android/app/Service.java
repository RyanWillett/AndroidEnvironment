package android.app;

import android.content.Intent;
import android.os.IBinder;
import android.app.Environment;

public abstract class Service {

	public abstract IBinder onBind(Intent i);
	
	public static final int START_STICKY = 0;

	private Environment e;
	public void setEnv(Environment environment) {
		e = environment;
		
	}
	
	private Intent intent;
	public void setIntent(Intent intent) {
		this.intent = intent;
		
	}
	
	public int onStartCommand(Intent i, int flags, int startId){
		return 0;
	}

	public abstract void shutdown();

}

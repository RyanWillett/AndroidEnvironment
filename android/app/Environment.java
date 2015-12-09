package android.app;

import java.util.HashMap;

import android.content.Intent;
import voss.shared.logic.Narrator;

public class Environment {

	public Environment(){
		
	}
	
	private int i = -1;
	private Activity a;
	public Activity startActivity(Class<?> class1, Intent i) {
		String name = class1.getName();
		try {
			a = (Activity) Class.forName(name).newInstance();
			a.setEnv(this);
			a.setIntent(i);
			a.onCreate(null);
			i.a = null;
			
			
			return a;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Activity getActive() {
		return a;
	}

	

	public HashMap<Class<?>, Service> services = new HashMap<>();
	public Service startService(Class<?> class1, Intent intent) {
		if(services.containsKey(class1))
			return services.get(class1);
		String name = class1.getName();
		try {
			Service s = (Service) Class.forName(name).newInstance();
			s.setEnv(this);
			s.setIntent(intent);
			intent.a = null;
			
			services.put(class1, s);
			return s;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Service getService(Class<?> c1) {
		return services.get(c1);
	}

	public void close() {
		for(Service s : services.values()){
			s.shutdown();
		}
	}

	

}

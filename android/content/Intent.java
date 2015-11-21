package android.content;

import java.util.HashMap;

import android.app.Activity;
import android.app.Environment;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import voss.logic.Narrator;
import voss.packaging.Box;
import voss.packaging.Deliverer;
import voss.packaging.Packager;

public class Intent {

	public Activity a;
	public Class<?> c1;
	public Intent(Activity a, Class<?> class1) {
		this();
		this.a = a;	
		this.c1 = class1;
	}

	public Intent() {
		bundle = new Bundle();
	}
	
	public void setBundle(Bundle b){
		bundle = b;
	}

	public Parcelable getParcelableExtra(String key) {
		Parcel p = (Parcel) map.get(key);
		if(p == null)
			return null;
		return p.getParcelable();
	}
	
	public void putExtra(String key, Parcelable b) {
		Parcel parcel = new Parcel();
		b.writeToParcel(parcel, 0);
		map.put(key, parcel);
	}

	public void putExtra(String key, boolean b) {
		map.put(key, b);
	}

	public void putExtra(String key, String val) {
		map.put(key, val);
	}

	private HashMap<String, Object> map = new HashMap<String, Object>();

	
	public void startActivity(){
		Environment e = a.getEnvironment();
		e.startActivity(c1, this);
	}
	
	public void startService(){
		Environment e = a.getEnvironment();
		e.startService(c1, this);
	}

	public boolean getBooleanExtra(String ishost, boolean b) {
		Object o = map.get(ishost);
		if(o == null)
			return b;
		else
			return (Boolean) o;
	}

	public String getStringExtra(String myname) {
		return (String) map.get(myname);
	}

	private Bundle bundle;
	public Bundle getExtras() {
		return bundle;
	}

	public void setAction(String string) {
		
		
	}

}

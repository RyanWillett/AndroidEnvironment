package android.os;

import java.util.HashMap;


public class Bundle {

	public Parcelable getParcelable(String key) {
		return null;
	}

	public HashMap<String, Object> map = new HashMap<>();
	public void putString(String key, String obj) {
		map.put(key, obj);
	}

	public String getString(String key) {
		return (String) map.get(key);
	}

	public void putParcelable(String key, Parcelable getParcel) {

		
	}

	public boolean getBoolean(String key, boolean b) {
		Object o = map.get(key);
		if(o == null)
			return b;
		else
			return (Boolean) o;
	}

	public Object[] get(String key) {
		return (Object[]) map.get(key);
	}
	
	public void putObjectArray(String key, Object[] val){
		map.put(key, val);
	}

}

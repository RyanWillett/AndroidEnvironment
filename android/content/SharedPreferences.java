package android.content;

import java.util.HashMap;

public class SharedPreferences {

	public SharedPreferences(){
		editor = new Editor();
	}
	
	public class Editor {

		public HashMap<String, Object> map = new HashMap<>();
		public void putString(String key, String name) {
			map.put(key,  name);
			
		}

		public void commit() {
			
		}

		public Editor putBoolean(String id, boolean b) {
			map.put(id, b);
			return this;
		}

	}

	
	Editor editor;
	public Editor edit() {
		return editor;
	}

	public String getString(String key, Object object) {
		return (String) editor.map.get(key);
	}

	public boolean getBoolean(String key, boolean b) {
		Object o = editor.map.get(key);
		if(o == null){
			return b;
		}
		return (Boolean) o;
	}

}

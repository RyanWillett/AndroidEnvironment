package android.app;

import java.util.HashMap;

public class FragmentManager {

	Activity a;
	public FragmentManager(Activity a){
		this.a = a;
	}
	
	private HashMap<String, DialogFragment> map = new HashMap<String, DialogFragment>();
	public void put(DialogFragment dialogFragment, String string) {
		map.put(string, dialogFragment);

		
	}
	public DialogFragment get(String string) {
		return map.get(string);
		
	}
	public Activity getActivity() {
		return a;
	}

}

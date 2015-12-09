package android.widget;

import android.view.View;
import android.view.ViewGroup;

public abstract class BaseAdapter {

	public abstract int getCount();

	
	public View getView(int position, View convertView, ViewGroup parent) {
		
		return null;
	}


	public abstract Object getItem(int i);
	

}

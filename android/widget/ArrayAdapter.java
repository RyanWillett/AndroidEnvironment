package android.widget;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class ArrayAdapter<T> extends BaseAdapter{

	private List<T> data;
	public ArrayAdapter(Context applicationContext, int simple_list_item_1, T[] players) {
		data = new ArrayList<T>();
		for(T t: players){
			data.add(t);
		}
	}

	public ArrayAdapter(Context applicationContext, int voteItem, List<T> targetables) {
		 data = targetables; 
	}

	public void setDropDownViewResource(int createRolesRightItem) {
		
	}

	public int getCount(){
		return data.size();
	}

	public Object getItem(int i) {
		return data.get(i);
	}
	
	
}

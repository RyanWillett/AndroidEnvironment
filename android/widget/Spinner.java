package android.widget;

import java.util.ArrayList;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;

public class Spinner extends View{

	public Spinner(int i) {
		super(i);

	}

	public void setOnItemSelectedListener(OnItemSelectedListener activityDay) {
		
	}

	public ArrayList<String> data;
	public void setAdapter(BaseAdapter adapter) {
		data = new ArrayList<String>();
		for(int i = 0; i < adapter.getCount(); i++){
			data.add(adapter.getItem(i).toString());//patchwork job
		}
		index = 0;
	}

	public String getSelectedItem() {
		return data.get(index);//TODO
	}


	private int index = 0;
	public void setSelection(int id) {
		index = id;
	}
	

}

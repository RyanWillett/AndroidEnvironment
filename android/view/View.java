package android.view;

import java.util.HashMap;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class View {
	
	public interface OnClickListener{
		public void onClick(View v);
	}

	public static final int GONE = 0;

	public static final int VISIBLE = 0;

	public static final int FOCUS_DOWN = 0;

	public static final int INVISIBLE = 0;
	
	private int id;
	public View(int i){
		id = i;
	}
	
	public int getId(){
		return id;
	}

	public void setEnabled(boolean isHost) {
		
	}
	
	public HashMap<Integer, View> map = new HashMap<Integer, View>();
	public View findViewById(int homeNameet) {
		return map.get(homeNameet);
	}

	public void addEditText(int id) {
		map.put(id, new EditText(id));
		
	}

	public void setOnClickListener(OnClickListener activityCreateGame) {
		// TODO Auto-generated method stub
		
	}

	public void setVisibility(int gone2) {
		// TODO Auto-generated method stub
		
	}

	public int getVisibility() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addListView(int id) {
		map.put(id, new ListView(id));
		
	}

	public void addButton(int id) {
		map.put(id, new Button(id));
		
	}
}

package android.view;

import voss.narrator.R;

public class LayoutInflater {

	public View inflate(int id, Object object) {
		View v = new View(id);
		if (id == R.layout.alert_name_prompt)
			v.addEditText(R.id.home_nameET);
		
		if( id == R.layout.create_player_list){
			v.addEditText(R.id.addPlayerContent);
			v.addListView(R.id.listView1);
			v.addButton(R.id.addPlayerConfirm);
		}
		return v;
	}

	public static LayoutInflater from(Object context) {
		return new LayoutInflater();
	}

	public View inflate(int playerItem, ViewGroup parent, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}

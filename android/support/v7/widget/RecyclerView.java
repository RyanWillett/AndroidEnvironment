package android.support.v7.widget;

import android.app.ID;
import android.view.View;

public class RecyclerView extends View{

	
	
	protected void setHasStableIds(boolean b) {
		
	}
	
	public static class ViewHolder {

		public ViewHolder(View v) {
		}

	}

	public static class Adapter<T> {

		public ID android;
		public void setHasStableIds(boolean b) {
			
		}
	}

	public RecyclerView(int i) {
		super(i);

	}

	public void setLayoutManager(LinearLayoutManager layoutManager) {
		
	}

	public RecyclerView.Adapter<?> adapter;
	public void setAdapter(RecyclerView.Adapter<?> playerDrawerAdapter) {
		this.adapter = playerDrawerAdapter;
	}

}

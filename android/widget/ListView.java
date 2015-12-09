package android.widget;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class ListView extends View{

	public static final int TRANSCRIPT_MODE_NORMAL = 3;

	public ListView(int i) {
		super(i);
	}

	public void setTranscriptMode(int transcriptModeNormal) {
		
	}

	public void setStackFromBottom(boolean b) {
		
	}

	boolean[] checkedItems;
	public void setAdapter(BaseAdapter listingAdapter) {
		checkedItems = new boolean[listingAdapter.getCount()];
	}

	public void setOnItemClickListener(OnItemClickListener o){
		
	}

	public void setSelection(int i) {
		
	}

	public void setChoiceMode(String choiceModeSingle) {
		
	}

	public void setItemsCanFocus(boolean b) {
		
	}

	public int getCheckedItemPosition() {

		return 0;
	}

	public void post(Runnable runnable) {
		
	}

	public void setItemChecked(int index, boolean b) {
		checkedItems[index] = b;
	}

	public android.view.ViewGroup.LayoutParams getLayoutParams() {
		return new android.view.ViewGroup.LayoutParams();
	}

	public boolean[] getCheckedItemPositions() {
		return checkedItems;
	}

}

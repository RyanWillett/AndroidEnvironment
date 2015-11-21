package android.support.v4.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class DrawerLayout extends View{

	public static final int LOCK_MODE_LOCKED_CLOSED = 0;

	public DrawerLayout(int i) {
		super(i);

	}

	public interface DrawerListener{
	}

	public void setDrawerListener(DrawerListener activityDay) {
		
	}

	public void setDrawerLockMode(int lockModeLockedClosed) {
		
	}

	public void openDrawer(RecyclerView playerMenu) {
		
	}

	public void closeDrawer(RecyclerView playerMenu) {
		
	}
}

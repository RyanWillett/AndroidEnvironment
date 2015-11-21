package android.app;

import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

public class LoaderManager {

	public interface LoaderCallbacks<T> {

		void onLoadFinished(Loader<Cursor> loader, Cursor cursor);

	}

	public void restartLoader(int contactQueryLoader, Bundle bundle, DialogFragment hi) {
		
	}

}

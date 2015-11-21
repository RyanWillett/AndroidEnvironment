package android.os;

import java.util.ArrayList;
import java.util.concurrent.Executor;

public abstract class AsyncTask <Params, Progress, Result> {

	

	
	public void dismiss(){
		
	}
	
	public final AsyncTask<Params, Progress, Result> execute(Params... params) {
        Result r = doInBackground(params);
        onPostExecute(r);
		return this;
    }
	
	protected abstract Result doInBackground(Params... params);
	protected abstract void onPostExecute(Result r);
}

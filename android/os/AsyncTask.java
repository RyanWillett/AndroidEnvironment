package android.os;

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

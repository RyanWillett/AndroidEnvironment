package android.app;

import android.content.DialogInterface;
import android.os.Bundle;

public class DialogFragment {

	public DialogFragment(){
		
	}
	
	public Dialog onCreateDialog(Bundle b){
		return null;
	}
	
	public ID android = new ID();
	
	public void setArguments(Bundle bundle) {
		this.bundle = bundle;
	}

	private Dialog dialog;
	private Activity a;
	private Bundle bundle;
	public void show(FragmentManager fm, String string) {
		this.a = fm.getActivity();
		onAttach(a);
		dialog = onCreateDialog(null);
		fm.put(this, string);
	}
	
	public void dismiss() {
		
	}
	
	protected Activity getActivity() {
		return a;
	}
	
	protected Bundle getArguments() {
		return bundle;
	}
	
	protected Dialog getDialog() {
		return new Dialog();
	}

	public void onAttach(Activity a) {

		
	}
	
	public void posClick(){
		dialog.pos.onClick(null, 0);
	}

	protected LoaderManager getLoaderManager() {
		return new LoaderManager();
	}

	public void onActivityCreated(Bundle savedInstanceState) {

		
	}

	public void onDismiss(DialogInterface arg0) {
		
	}
}

package android.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;

public class AlertDialog extends Dialog{

	public static class Builder {

		Dialog d = new Dialog();
		public Builder(Activity activity) {
			
		}

		public void setView(View mainView) {

			
		}

		public Builder setMessage(String string) {
			return this;
		}

		public Builder setPositiveButton(String buttonName, OnClickListener onClickListener) {
			d.pos = onClickListener;
			return this;
		}

		public void setNegativeButton(String string, OnClickListener onClickListener) {
			d.neg = onClickListener;
			
		}

		public Dialog create() {
			return d;
		}

	}

}

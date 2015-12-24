package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.NotificationCompat.Builder;

public class NotificationCompat {

	public static class Builder {

		public Builder(Context context) {
		}

		public Builder setSmallIcon(int home) {
			return this;
		}

		public Builder setContentTitle(String string) {

			return this;
		}

		public Builder setContentText(String s) {
			return this;
		}

		public Builder setColor(int parseColor) {
			return this;
		}

		public void setContentIntent(PendingIntent resultPendingIntent) {
			// TODO Auto-generated method stub
			
		}

		public Object build() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}

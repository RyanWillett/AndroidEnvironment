package android.os;

public class Handler {

	private Callback c;
	public Handler(Callback wifiHost) {
		this.c = wifiHost;
	}

	public interface Callback {
		boolean handleMessage(Message msg);
	}
	
	public Callback getCallback(){
		return c;
	}

	public Message obtainMessage(int what, int bytes, int i, Object[] objects) {
		return new Message(this, what, objects, bytes);
	}

}

package android.os;

public class Message {

	public int what;
	public Object[] obj;
	public int arg1;
	private Handler handler;
	
	public Message(Handler handler, int what, Object[] objects, int arg1) {
		this.handler = handler;
		this.what = what;
		this.obj = objects;
		this.arg1 = arg1;
	}
	public void sendToTarget() {
		handler.getCallback().handleMessage(this);
	}

}

package android.net.wifi;

import java.net.InetAddress;

public class WifiInfo {

	private InetAddress ipAddr;
	public WifiInfo(InetAddress ipAddr) {
		this.ipAddr = ipAddr;
	}

	public int getIpAddress() {
		String ip_ =  ipAddr.getHostAddress();
		ip_ = ip_.replace(".", "-");
		int ip = 0;
	    String[] split = ip_.split("-");
	    for (int i = 0; i < split.length; i++){
	    	int p = Integer.parseInt(split[i]);
	    	ip += p * (int) Math.pow(2, i*8);
	    }
	    return ip;
	}

}

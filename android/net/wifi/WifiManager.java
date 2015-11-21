package android.net.wifi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WifiManager {

	public WifiInfo getConnectionInfo() {
		InetAddress ipAddr = null;
		try {
			ipAddr = InetAddress.getLocalHost();
			return new WifiInfo(ipAddr);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

}

package net.chrislehmann.common.util;

import android.util.Log;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: clehmann
 * Date: 7/14/11
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class NetworkUtils {

    private static final String LOGTAG = NetworkUtils.class.getSimpleName();

    public static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException e) {
            Log.e(LOGTAG, "Error getting ip address", e);
        }
        return null;
    }
}

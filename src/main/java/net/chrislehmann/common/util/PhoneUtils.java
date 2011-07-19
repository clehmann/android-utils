package net.chrislehmann.common.util;

import android.content.Context;
import android.telephony.TelephonyManager;


public class PhoneUtils {
    public static String getPhoneNumber(Context context)
    {
        return ((TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE)).getLine1Number();
    }
}

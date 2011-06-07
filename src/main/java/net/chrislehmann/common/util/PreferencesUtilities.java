package net.chrislehmann.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by IntelliJ IDEA.
 * User: clehmann
 * Date: 5/26/11
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class PreferencesUtilities {


    public static String getPrefereceAsString(Context context, int preferenceId, String defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(context.getText(preferenceId).toString(), defaultValue);
    }

    public static int getPrefereceAsIntRefactored(Context context, int preferenceId, int defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(context.getText(preferenceId).toString(), defaultValue);
    }


}

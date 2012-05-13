package net.chrislehmann.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class PreferencesUtilities {


    public static String getPreferenceAsString(Context context, int preferenceId, String defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(context.getText(preferenceId).toString(), defaultValue);
    }

    public static int getPreferenceAsInt(Context context, int preferenceId, int defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(context.getText(preferenceId).toString(), defaultValue);
    }

    public static long getPreferenceAsLong(Context context, int preferenceId, int defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getLong(context.getText(preferenceId).toString(), defaultValue);
    }

    public static boolean getPreferenceAsBoolean(Context context, int preferenceId, boolean defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(context.getText(preferenceId).toString(), defaultValue);
    }

    public static void savePreference(Context context, int preferenceId, String value) {
        SharedPreferences.Editor editor = getEditor(context);
        editor.putString(context.getString(preferenceId), value);
        editor.commit();
    }
    
    public static void savePreference(Context context, int preferenceId, boolean value) {
        SharedPreferences.Editor editor = getEditor(context);
        editor.putBoolean(context.getString(preferenceId), value);
        editor.commit();
    }

    public static void savePreference(Context context, int preferenceId, int value) {
        SharedPreferences.Editor editor = getEditor(context);
        editor.putInt(context.getString(preferenceId), value);
        editor.commit();
    }

    public static void savePreference(Context context, int preferenceId, long value) {
        SharedPreferences.Editor editor = getEditor(context);
        editor.putLong(context.getString(preferenceId), value);
        editor.commit();
    }
    private static SharedPreferences.Editor getEditor(Context context) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences.edit();
    }

    public static boolean isPreferenceSet(Context context, int preferenceId) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences.contains(context.getString(preferenceId));
    }

}

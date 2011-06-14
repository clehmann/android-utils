package net.chrislehmann.common.util;

import android.os.Environment;
import android.os.StatFs;


public class FileSystemUtils {
    public final static int BYTES_IN_GB = 1073741824;

    public static double getFreeSpaceInGb() {
        StatFs stat = new StatFs(Environment.getExternalStorageDirectory().getPath());
        double sdAvailSize = (double) stat.getAvailableBlocks() * (double) stat.getBlockSize();
        return sdAvailSize / BYTES_IN_GB;
    }
    public static double getTotalSpaceInGb() {
        StatFs stat = new StatFs(Environment.getExternalStorageDirectory().getPath());
        double sdTotalSize = (double) stat.getBlockCount() * (double) stat.getBlockSize();
        return sdTotalSize / BYTES_IN_GB;
    }

    public static double getUsedSpaceInGb() {
        return getTotalSpaceInGb() - getFreeSpaceInGb();
    }

}

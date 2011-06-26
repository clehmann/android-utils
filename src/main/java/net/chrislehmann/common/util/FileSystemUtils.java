package net.chrislehmann.common.util;

import android.os.Environment;
import android.os.StatFs;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


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


    public static boolean doesFileExist(String path){
        return new File(path).exists();
    }

    public static void forceDeleteFile(String path) {
        if(doesFileExist(path))
        try {
            FileUtils.forceDelete(new File(path));
        } catch (IOException e) {
            throw new RuntimeException("Error deleting file: " + path, e);
        }

    }
}

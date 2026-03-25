package com.engagelab.privates.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import com.engagelab.privates.common.constants.MTCommonConstants;
import j$.time.ZoneId;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceUtil {
    private static String ANDROID_ID_CACHE = null;
    private static String CARRIER_CACHE = null;
    private static long CARRIER_CACHE_LAST_TIME = 0;
    private static final FileFilter CPU_FILTER = new a();
    private static String CPU_HARDWARE = "";
    private static String CPU_INFO = "";
    private static final String TAG = "DeviceUtil";

    public static final class a implements FileFilter {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int extractValue(byte[] bArr, int i) {
        byte b;
        byte b2;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            try {
                if (b >= 48 && b <= 57) {
                    int i2 = i + 1;
                    while (i2 < bArr.length && (b2 = bArr[i2]) >= 48 && b2 <= 57) {
                        i2++;
                    }
                    return Integer.parseInt(new String(bArr, 0, i, i2 - i));
                }
                i++;
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getBrand() {
        return String.format(Locale.ENGLISH, Build.BRAND, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getCPUMaxFreqKHz() {
        for (int i = 0; i < getCpuCoreCount(); i++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    if (-1 == fileInputStream.read(bArr)) {
                        return -1;
                    }
                    int i2 = 0;
                    while (true) {
                        byte b = bArr[i2];
                        if (b < 48 || b > 57) {
                            break;
                        }
                        i2++;
                    }
                    int i3 = Integer.parseInt(new String(bArr, 0, i2));
                    fileInputStream.close();
                    return i3;
                }
            } catch (Throwable unused) {
                return -1;
            }
        }
        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
        int fileForValue = parseFileForValue("cpu MHz", fileInputStream2);
        fileInputStream2.close();
        return fileForValue * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getCarrierImp(Context context) {
        try {
            CARRIER_CACHE_LAST_TIME = System.currentTimeMillis();
            return ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getCpuHardwareInfo() {
        if (!TextUtils.isEmpty(CPU_HARDWARE)) {
            return CPU_HARDWARE;
        }
        matchCpuInfo();
        return CPU_HARDWARE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getCpuInfo() {
        if (!TextUtils.isEmpty(CPU_INFO)) {
            return CPU_INFO;
        }
        matchCpuInfo();
        return CPU_INFO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getLanguage(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getManufacturer() {
        return String.format(Locale.ENGLISH, Build.MANUFACTURER, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getModel() {
        return String.format(Locale.ENGLISH, Build.MODEL, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getProduct() {
        return String.format(Locale.ENGLISH, Build.PRODUCT, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getResolution(Context context) {
        DisplayMetrics displayMetrics;
        try {
            if (context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return "0*0";
            }
            return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        } catch (Throwable unused) {
            return "0*0";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getRomSize(Context context) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double getScreenSize(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSsid(Context context) {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getSystemDevice() {
        return Build.DEVICE.toLowerCase();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getSystemVersionRelease() {
        return String.format(Locale.ENGLISH, Build.VERSION.RELEASE, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getSystemVersionSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getTimeZone() {
        String str;
        long rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset > 0) {
            str = Marker.ANY_NON_NULL_MARKER + rawOffset;
        } else if (rawOffset < 0) {
            str = "-" + rawOffset;
        } else {
            str = "" + rawOffset;
        }
        return str.replace("--", "-");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void matchCpuInfo() {
        try {
            File file = new File("/proc/cpuinfo");
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                if (line.contains("Processor")) {
                    StringBuilder sb = new StringBuilder();
                    int iIndexOf = line.indexOf(":");
                    if (iIndexOf >= 0 && iIndexOf < line.length() - 1) {
                        sb.append(line.substring(iIndexOf + 1).trim());
                    }
                    CPU_INFO = sb.toString();
                }
                if (line.contains("Hardware")) {
                    CPU_HARDWARE = line.substring(line.indexOf(":") + 1).trim();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String getAndroidId(Context context) {
        if (ANDROID_ID_CACHE == null) {
            ANDROID_ID_CACHE = Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return ANDROID_ID_CACHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String getCarrier(Context context) {
        try {
            if (CARRIER_CACHE == null || System.currentTimeMillis() - CARRIER_CACHE_LAST_TIME > 7200000) {
                CARRIER_CACHE = getCarrierImp(context);
            }
        } catch (Throwable unused) {
            CARRIER_CACHE = "";
        }
        return CARRIER_CACHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static long getRamSize(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            activityManager.getProcessMemoryInfo(new int[]{0});
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String getTimeZoneId() {
        return Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        try {
            byte[] bArr = new byte[1024];
            int i = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                if (b == 10 || i2 == 0) {
                    if (b == 10) {
                        i2++;
                    }
                    for (int i3 = i2; i3 < i; i3++) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            break;
                        }
                        if (i4 == str.length() - 1) {
                            return extractValue(bArr, i3);
                        }
                    }
                }
                i2++;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int getCpuCoreCount() {
        File[] fileArrListFiles;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(CPU_FILTER)) != null && fileArrListFiles.length != 0) {
                return fileArrListFiles.length;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}

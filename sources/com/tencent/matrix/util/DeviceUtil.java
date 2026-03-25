package com.tencent.matrix.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.camera.video.AudioStats;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C58013ytK;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class DeviceUtil {
    public static int AEQbTJ;
    public static LEVEL EZpvd;
    public static final FileFilter KWHzl = new FileFilter() { // from class: com.tencent.matrix.util.DeviceUtil.4
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    };
    public static long OLrzqt;
    public static long copydefault;

    public enum LEVEL {
        BEST(5),
        HIGH(4),
        MIDDLE(3),
        LOW(2),
        BAD(1),
        UN_KNOW(-1);

        int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getValue() {
            return this.value;
        }

        LEVEL(int i) {
            this.value = i;
        }
    }

    public static JSONObject AEQbTJ(JSONObject jSONObject, Application application) {
        try {
            jSONObject.put("machine", EZpvd(application));
            jSONObject.put("cpu_app", copydefault());
            jSONObject.put("mem", copydefault(application));
            jSONObject.put("mem_free", KWHzl(application));
        } catch (JSONException e) {
            C58013ytK.OLrzqt("Matrix.DeviceUtil", "[JSONException for stack, error: %s", e);
        }
        return jSONObject;
    }

    public static LEVEL EZpvd(Context context) throws Throwable {
        LEVEL level = EZpvd;
        if (level != null) {
            return level;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCopydefault = copydefault(context);
        int iAEQbTJ = AEQbTJ();
        C58013ytK.EZpvd("Matrix.DeviceUtil", "[getLevel] totalMemory:%s coresNum:%s", Long.valueOf(jCopydefault), Integer.valueOf(iAEQbTJ));
        if (jCopydefault >= 8589934592L) {
            EZpvd = LEVEL.BEST;
        } else if (jCopydefault >= 6442450944L) {
            EZpvd = LEVEL.HIGH;
        } else if (jCopydefault >= 4294967296L) {
            EZpvd = LEVEL.MIDDLE;
        } else if (jCopydefault >= 2147483648L) {
            if (iAEQbTJ >= 4) {
                EZpvd = LEVEL.MIDDLE;
            } else if (iAEQbTJ > 0) {
                EZpvd = LEVEL.LOW;
            }
        } else if (jCopydefault >= 0) {
            EZpvd = LEVEL.BAD;
        } else {
            EZpvd = LEVEL.UN_KNOW;
        }
        C58013ytK.EZpvd("Matrix.DeviceUtil", "getLevel, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", level:" + EZpvd, new Object[0]);
        return EZpvd;
    }

    public static int OLrzqt() {
        return Process.myPid();
    }

    public static long copydefault(Context context) {
        long j = copydefault;
        if (0 != j) {
            return j;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        activityManager.getMemoryInfo(memoryInfo);
        copydefault = memoryInfo.totalMem;
        OLrzqt = memoryInfo.threshold;
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory == Long.MAX_VALUE) {
            AEQbTJ = activityManager.getMemoryClass();
        } else {
            AEQbTJ = (int) (jMaxMemory / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        }
        C58013ytK.EZpvd("Matrix.DeviceUtil", "getTotalMemory cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", total_mem:" + copydefault + ", LowMemoryThresold:" + OLrzqt + ", Memory Class:" + AEQbTJ, new Object[0]);
        return copydefault;
    }

    public static long KWHzl(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double copydefault() throws Throwable {
        RandomAccessFile randomAccessFile;
        long j;
        Throwable th;
        RandomAccessFile randomAccessFile2;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RandomAccessFile randomAccessFile3 = null;
        try {
            randomAccessFile = new RandomAccessFile("/proc/stat", "r");
        } catch (Exception e) {
            e = e;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (randomAccessFile3 == null) {
            }
        }
        try {
            try {
                String[] strArrSplit = randomAccessFile.readLine().split(" ");
                long j3 = Long.parseLong(strArrSplit[2]);
                long j4 = Long.parseLong(strArrSplit[3]);
                j = j3 + j4 + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[7]) + Long.parseLong(strArrSplit[8]);
                try {
                    randomAccessFile.close();
                } catch (Exception e2) {
                    C58013ytK.EZpvd("Matrix.DeviceUtil", "close process reader %s", e2.toString());
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile3 = randomAccessFile;
                Throwable th32 = th;
                if (randomAccessFile3 == null) {
                    try {
                        randomAccessFile3.close();
                        throw th32;
                    } catch (Exception e3) {
                        C58013ytK.EZpvd("Matrix.DeviceUtil", "close process reader %s", e3.toString());
                        throw th32;
                    }
                }
                throw th32;
            }
        } catch (Exception e4) {
            e = e4;
            C58013ytK.EZpvd("Matrix.DeviceUtil", "RandomAccessFile(Process Stat) reader fail, error: %s", e.toString());
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception e5) {
                    C58013ytK.EZpvd("Matrix.DeviceUtil", "close process reader %s", e5.toString());
                }
            }
            j = 0;
        }
        try {
            try {
                randomAccessFile2 = new RandomAccessFile("/proc/" + OLrzqt() + "/stat", "r");
                try {
                    String[] strArrSplit2 = randomAccessFile2.readLine().split(" ");
                    j2 = Long.parseLong(strArrSplit2[13]) + Long.parseLong(strArrSplit2[14]);
                    try {
                        randomAccessFile2.close();
                    } catch (Exception e6) {
                        C58013ytK.EZpvd("Matrix.DeviceUtil", "close app reader %s", e6.toString());
                    }
                } catch (Exception e7) {
                    e = e7;
                    randomAccessFile3 = randomAccessFile2;
                    C58013ytK.EZpvd("Matrix.DeviceUtil", "RandomAccessFile(App Stat) reader fail, error: %s", e.toString());
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                        } catch (Exception e8) {
                            C58013ytK.EZpvd("Matrix.DeviceUtil", "close app reader %s", e8.toString());
                        }
                    }
                    j2 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                            throw th;
                        } catch (Exception e9) {
                            C58013ytK.EZpvd("Matrix.DeviceUtil", "close app reader %s", e9.toString());
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                randomAccessFile2 = randomAccessFile3;
            }
        } catch (Exception e10) {
            e = e10;
        }
        double d = 0 != j ? (j2 / j) * 100.0d : AudioStats.AUDIO_AMPLITUDE_NONE;
        C58013ytK.EZpvd("Matrix.DeviceUtil", "getAppCpuRate cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ",rate:" + d, new Object[0]);
        return d;
    }

    public static int AEQbTJ() throws Throwable {
        int iOLrzqt;
        try {
            iOLrzqt = OLrzqt("/sys/devices/system/cpu/possible");
            if (iOLrzqt == 0) {
                iOLrzqt = OLrzqt("/sys/devices/system/cpu/present");
            }
            if (iOLrzqt == 0) {
                iOLrzqt = copydefault("/sys/devices/system/cpu/");
            }
        } catch (Exception unused) {
            iOLrzqt = 0;
        }
        if (iOLrzqt == 0) {
            return 1;
        }
        return iOLrzqt;
    }

    public static int copydefault(String str) {
        File[] fileArrListFiles = new File(str).listFiles(KWHzl);
        if (fileArrListFiles == null) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [340=4, 343=4] */
    public static int OLrzqt(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C.UTF8_NAME));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        int i = Integer.parseInt(line.substring(2));
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            C58013ytK.EZpvd("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e.toString());
                        }
                        return i + 1;
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        C58013ytK.EZpvd("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e2.toString());
                    }
                    return 0;
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    C58013ytK.EZpvd("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e.toString());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            C58013ytK.EZpvd("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e4.toString());
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            C58013ytK.EZpvd("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e5.toString());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    public static long EZpvd() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1024;
    }

    public static long KWHzl() {
        return Debug.getNativeHeapAllocatedSize() / 1024;
    }

    public static long gEmmrt() {
        try {
            String[] strArrSplit = AEQbTJ(String.format("/proc/%s/status", Integer.valueOf(OLrzqt()))).trim().split("\n");
            for (String str : strArrSplit) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (strArrSplit.length <= 12) {
                return -1L;
            }
            Matcher matcher2 = Pattern.compile("\\d+").matcher(strArrSplit[12]);
            if (matcher2.find()) {
                return Long.parseLong(matcher2.group());
            }
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static String OLrzqt(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static String AEQbTJ(String str) throws Exception {
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            String strOLrzqt = OLrzqt(fileInputStream);
            fileInputStream.close();
            return strOLrzqt;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static boolean AhwBna() {
        String str = Build.CPU_ABI;
        return "arm64-v8a".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }
}

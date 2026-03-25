package net.zetetic.database.sqlcipher;

import android.os.StatFs;
import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteGlobal {
    public static int OLrzqt = 4096;
    public static final Object copydefault = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String AhwBna() {
        return "normal";
    }

    public static int EZpvd() {
        return 10000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String OLrzqt() {
        return "normal";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String copydefault() {
        return RequestParameters.SUBRESOURCE_DELETE;
    }

    private static native int nativeReleaseMemory();

    private SQLiteGlobal() {
    }

    public static int KWHzl() {
        synchronized (copydefault) {
            if (OLrzqt == 0) {
                OLrzqt = new StatFs("/data").getBlockSize();
            }
        }
        return 4096;
    }

    public static int AEQbTJ() {
        return Math.max(1, 1000);
    }

    public static int djBIcL() {
        return Math.max(2, 10);
    }
}

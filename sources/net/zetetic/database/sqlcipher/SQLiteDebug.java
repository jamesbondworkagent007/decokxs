package net.zetetic.database.sqlcipher;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteDebug {
    public static final boolean KWHzl = Log.isLoggable("SQLiteLog", 2);
    public static final boolean copydefault = Log.isLoggable("SQLiteStatements", 2);
    public static final boolean OLrzqt = Log.isLoggable("SQLiteTime", 2);

    /* JADX INFO: loaded from: classes17.dex */
    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    private SQLiteDebug() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class DbStats {
        public long AEQbTJ;
        public String EZpvd;
        public int KWHzl;
        public String OLrzqt;
        public long copydefault;

        public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.EZpvd = str;
            this.AEQbTJ = j2 / 1024;
            this.copydefault = (j * j2) / 1024;
            this.KWHzl = i;
            this.OLrzqt = i2 + "/" + i3 + "/" + i4;
        }
    }
}

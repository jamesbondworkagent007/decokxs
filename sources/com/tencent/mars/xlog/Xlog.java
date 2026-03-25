package com.tencent.mars.xlog;

import androidx.annotation.NonNull;
import o.InterfaceC38340pVd;

/* JADX INFO: loaded from: classes12.dex */
public class Xlog implements InterfaceC38340pVd {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int COMPRESS_LEVEL1 = 1;
    public static final int COMPRESS_LEVEL2 = 2;
    public static final int COMPRESS_LEVEL3 = 3;
    public static final int COMPRESS_LEVEL4 = 4;
    public static final int COMPRESS_LEVEL5 = 5;
    public static final int COMPRESS_LEVEL6 = 6;
    public static final int COMPRESS_LEVEL7 = 7;
    public static final int COMPRESS_LEVEL8 = 8;
    public static final int COMPRESS_LEVEL9 = 9;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_MODE = 1;
    private volatile boolean isLoad = false;

    public static class XLogConfig {
        public String cachedir;
        public String logdir;
        public String nameprefix;
        public int level = 2;
        public int mode = 0;
        public String pubkey = "";
        public int compressmode = 0;
        public int compresslevel = 0;
        public int cachedays = 0;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    public static native void appenderOpen(XLogConfig xLogConfig);

    private static String decryptTag(String str) {
        return str;
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static native void logWrite2(long j, int i, String str, String str2, String str3, int i2, int i3, long j2, long j3, String str4);

    public native void appenderClose();

    @Override // o.InterfaceC38340pVd
    public native void appenderFlush(long j, boolean z);

    @Override // o.InterfaceC38340pVd
    public native int getLogLevel(long j);

    public native long getXlogInstance(String str);

    public native long newXlogInstance(XLogConfig xLogConfig);

    public native void releaseXlogInstance(String str);

    public native void setAppenderMode(long j, int i);

    @Override // o.InterfaceC38340pVd
    public native void setConsoleLogOpen(long j, boolean z);

    @Override // o.InterfaceC38340pVd
    public native void setMaxAliveTime(long j, long j2);

    @Override // o.InterfaceC38340pVd
    public native void setMaxFileSize(long j, long j2);

    @Override // o.InterfaceC38340pVd
    public void openLog(@NonNull XLogConfig xLogConfig) {
        synchronized (this) {
            if (!this.isLoad) {
                this.isLoad = true;
                System.loadLibrary("c++_shared");
                System.loadLibrary("marsxlog");
            }
        }
        appenderOpen(xLogConfig);
    }

    @Override // o.InterfaceC38340pVd
    public void logV(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 0, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    @Override // o.InterfaceC38340pVd
    public void logD(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 1, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    @Override // o.InterfaceC38340pVd
    public void logI(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 2, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    @Override // o.InterfaceC38340pVd
    public void logW(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 3, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    @Override // o.InterfaceC38340pVd
    public void logE(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 4, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    @Override // o.InterfaceC38340pVd
    public void logF(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logWrite2(j, 5, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    public long openLogInstance(@NonNull XLogConfig xLogConfig) {
        return newXlogInstance(xLogConfig);
    }
}

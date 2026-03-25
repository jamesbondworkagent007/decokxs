package o;

import com.tencent.mars.xlog.Xlog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38340pVd {
    void appenderFlush(long j, boolean z);

    int getLogLevel(long j);

    void logD(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void logE(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void logF(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void logI(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void logV(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void logW(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, java.lang.String str4);

    void openLog(@NotNull Xlog.XLogConfig xLogConfig);

    void setConsoleLogOpen(long j, boolean z);

    void setMaxAliveTime(long j, long j2);

    void setMaxFileSize(long j, long j2);
}

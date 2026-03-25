package com.bytedance.bdtracker;

import android.os.SystemClock;
import com.bytedance.applog.log.IAppLogLogger;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IAppLogLogger f209a;
    public final String b;
    public long c = -1;
    public long d = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public l0(IAppLogLogger iAppLogLogger, String str) {
        this.f209a = iAppLogLogger;
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(long j) {
        if (j <= 0 || this.c <= 0) {
            return;
        }
        IAppLogLogger iAppLogLogger = this.f209a;
        if (iAppLogLogger != null) {
            iAppLogLogger.debug(4, "[DurationEvent:{}] Pause at:{}", this.b, Long.valueOf(j));
        }
        long j2 = this.d;
        if (j <= this.c) {
            j = SystemClock.elapsedRealtime();
        }
        this.d = (j - this.c) + j2;
        this.c = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(long j) {
        if (j <= 0 || this.c >= 0) {
            return;
        }
        c(j);
        IAppLogLogger iAppLogLogger = this.f209a;
        if (iAppLogLogger != null) {
            iAppLogLogger.debug(4, "[DurationEvent:{}] Resume at:{}", this.b, Long.valueOf(j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void c(long j) {
        this.c = j;
        IAppLogLogger iAppLogLogger = this.f209a;
        if (iAppLogLogger != null) {
            iAppLogLogger.debug(4, "[DurationEvent:{}] Start at:{}", this.b, Long.valueOf(j));
        }
    }
}

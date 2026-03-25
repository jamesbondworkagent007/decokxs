package com.bytedance.bdtracker;

import com.bytedance.applog.log.IAppLogLogger;
import com.okinc.liveness.lca.EopTrackEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155a;
    public volatile boolean b;
    public long c;
    public volatile boolean d;
    public final f0 e;
    public final d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0(f0 f0Var) {
        this.e = f0Var;
        this.f = f0Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        long jG;
        long j;
        long jCurrentTimeMillis;
        if (!f() || i5.b(this.e.b(), this.e.n.a()).a()) {
            if (this.b) {
                j = 0;
                this.c = 0L;
                this.b = false;
            } else {
                int i = this.f155a;
                if (i > 0) {
                    long[] jArrE = e();
                    jG = jArrE[(i - 1) % jArrE.length];
                } else {
                    jG = g();
                }
                j = jG;
            }
            jCurrentTimeMillis = this.c;
        } else {
            this.e.d.D.debug("Check work time is not net available.", new Object[0]);
            jCurrentTimeMillis = System.currentTimeMillis();
            j = 5000;
        }
        return jCurrentTimeMillis + j;
    }

    public abstract boolean c();

    public abstract String d();

    public abstract long[] e();

    public abstract boolean f();

    public abstract long g();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final long a() {
        String str = EopTrackEvent.KEY_RESULT_FAILED;
        long jB = b();
        if (jB > System.currentTimeMillis()) {
            return jB;
        }
        this.e.d.D.debug("The worker:{} start to work...", d());
        try {
            boolean zC = c();
            this.c = System.currentTimeMillis();
            if (zC) {
                this.f155a = 0;
            } else {
                this.f155a++;
            }
            IAppLogLogger iAppLogLogger = this.e.d.D;
            Object[] objArr = new Object[2];
            objArr[0] = d();
            if (zC) {
                str = "success";
            }
            objArr[1] = str;
            iAppLogLogger.debug("The worker:{} worked:{}.", objArr);
        } catch (Throwable th) {
            try {
                this.e.d.D.error("Work do failed.", th, new Object[0]);
            } finally {
                this.c = System.currentTimeMillis();
                this.f155a++;
                this.e.d.D.debug("The worker:{} worked:{}.", d(), EopTrackEvent.KEY_RESULT_FAILED);
            }
        }
        return b();
    }

    public d0(f0 f0Var, long j) {
        this.e = f0Var;
        this.f = f0Var.d;
        this.c = j;
    }
}

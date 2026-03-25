package o;

import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import o.C58044ytp;

/* JADX INFO: renamed from: o.ytr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@java.lang.Deprecated
public class RunnableC58046ytr implements java.lang.Runnable {
    public static final RunnableC58046ytr AEQbTJ = new RunnableC58046ytr();
    public android.view.Choreographer AYXKKw;
    public java.lang.Object[] AhwBna;
    public java.lang.reflect.Method EZpvd;
    public java.lang.reflect.Method KWHzl;
    public java.lang.reflect.Method OLrzqt;
    public java.lang.Object ejfBZ;
    public java.lang.Object gEmmrt;
    public C58043yto valueOf;
    public volatile boolean DbNXlk = false;
    public long[] djBIcL = new long[4];
    public final java.util.HashSet<AbstractC58053yty> fIwbmz = new java.util.HashSet<>();
    public volatile long AuCTel = 0;
    public boolean values = false;
    public long fetchVPNInfo = 16666666;
    public int[] fARcdN = new int[3];
    public boolean[] copydefault = new boolean[3];
    public long[] fJNWhG = new long[3];
    public boolean AkhnZx = false;
    public long[] isConnected = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static RunnableC58046ytr AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.values = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long copydefault() {
        return this.fetchVPNInfo;
    }

    public void EZpvd(C58043yto c58043yto) {
        this.valueOf = c58043yto;
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            throw new java.lang.AssertionError("must be init in main thread!");
        }
        C58044ytp.copydefault(new C58044ytp.StateListAnimator(c58043yto.values, c58043yto.djBIcL) { // from class: o.ytr.2
            @Override // o.C58044ytp.StateListAnimator
            public boolean copydefault() {
                return RunnableC58046ytr.this.DbNXlk;
            }

            @Override // o.C58044ytp.StateListAnimator
            public void OLrzqt() {
                super.OLrzqt();
                RunnableC58046ytr.this.OLrzqt();
            }

            @Override // o.C58044ytp.StateListAnimator
            public void KWHzl() throws java.lang.Throwable {
                super.KWHzl();
                RunnableC58046ytr.this.KWHzl();
            }
        });
        this.AkhnZx = true;
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        this.AYXKKw = choreographer;
        this.fetchVPNInfo = ((java.lang.Long) C58020ytR.KWHzl(choreographer, "mFrameIntervalNanos", 16666667L)).longValue();
        this.gEmmrt = C58020ytR.KWHzl(this.AYXKKw, "mLock", new java.lang.Object());
        java.lang.Object[] objArr = (java.lang.Object[]) C58020ytR.KWHzl(this.AYXKKw, "mCallbackQueues", (java.lang.Object) null);
        this.AhwBna = objArr;
        if (objArr != null) {
            java.lang.Object obj = objArr[0];
            java.lang.Class cls = java.lang.Long.TYPE;
            this.EZpvd = C58020ytR.KWHzl(obj, "addCallbackLocked", (java.lang.Class<?>[]) new java.lang.Class[]{cls, java.lang.Object.class, java.lang.Object.class});
            this.KWHzl = C58020ytR.KWHzl(this.AhwBna[1], "addCallbackLocked", (java.lang.Class<?>[]) new java.lang.Class[]{cls, java.lang.Object.class, java.lang.Object.class});
            this.OLrzqt = C58020ytR.KWHzl(this.AhwBna[2], "addCallbackLocked", (java.lang.Class<?>[]) new java.lang.Class[]{cls, java.lang.Object.class, java.lang.Object.class});
        }
        this.ejfBZ = C58020ytR.KWHzl(this.AYXKKw, "mDisplayEventReceiver", (java.lang.Object) null);
        java.lang.Object[] objArr2 = new java.lang.Object[7];
        objArr2[0] = java.lang.Boolean.valueOf(this.gEmmrt == null);
        objArr2[1] = java.lang.Boolean.valueOf(this.AhwBna == null);
        objArr2[2] = java.lang.Boolean.valueOf(this.EZpvd == null);
        objArr2[3] = java.lang.Boolean.valueOf(this.OLrzqt == null);
        objArr2[4] = java.lang.Boolean.valueOf(this.KWHzl == null);
        objArr2[5] = java.lang.Boolean.valueOf(this.ejfBZ == null);
        objArr2[6] = java.lang.Long.valueOf(this.fetchVPNInfo);
        C58013ytK.EZpvd("Matrix.UIThreadMonitor", "[UIThreadMonitor] %s %s %s %s %s %s frameIntervalNanos:%s", objArr2);
        if (c58043yto.values()) {
            OLrzqt(new AbstractC58053yty() { // from class: o.ytr.3
                @Override // o.AbstractC58053yty
                public void EZpvd(java.lang.String str, long j, long j2, boolean z, long j3, long j4, long j5, long j6) {
                    C58013ytK.EZpvd("Matrix.UIThreadMonitor", "focusedActivity[%s] frame cost:%sms isVsyncFrame=%s intendedFrameTimeNs=%s [%s|%s|%s]ns", str, java.lang.Long.valueOf((j2 - j) / 1000000), java.lang.Boolean.valueOf(z), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j6));
                }
            });
        }
    }

    public final void EZpvd(int i, java.lang.Runnable runnable, boolean z) {
        synchronized (this) {
            if (this.copydefault[i]) {
                C58013ytK.AEQbTJ("Matrix.UIThreadMonitor", "[addFrameCallback] this type %s callback has exist! isAddHeader:%s", java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
                return;
            }
            if (!this.DbNXlk && i == 0) {
                C58013ytK.AEQbTJ("Matrix.UIThreadMonitor", "[addFrameCallback] UIThreadMonitor is not alive!", new java.lang.Object[0]);
                return;
            }
            try {
                synchronized (this.gEmmrt) {
                    java.lang.reflect.Method method = i != 0 ? i != 1 ? i != 2 ? null : this.OLrzqt : this.KWHzl : this.EZpvd;
                    if (method != null) {
                        java.lang.Object obj = this.AhwBna[i];
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = java.lang.Long.valueOf(!z ? android.os.SystemClock.uptimeMillis() : -1L);
                        objArr[1] = runnable;
                        objArr[2] = null;
                        method.invoke(obj, objArr);
                        this.copydefault[i] = true;
                    }
                }
            } catch (java.lang.Exception e) {
                C58013ytK.OLrzqt("Matrix.UIThreadMonitor", e.toString(), new java.lang.Object[0]);
            }
        }
    }

    public void OLrzqt(AbstractC58053yty abstractC58053yty) {
        if (!this.DbNXlk) {
            valueOf();
        }
        synchronized (this.fIwbmz) {
            this.fIwbmz.add(abstractC58053yty);
        }
    }

    public final void OLrzqt() {
        long[] jArr = this.djBIcL;
        long jNanoTime = java.lang.System.nanoTime();
        jArr[0] = jNanoTime;
        this.AuCTel = jNanoTime;
        this.djBIcL[2] = android.os.SystemClock.currentThreadTimeMillis();
        if (this.valueOf.AkhnZx()) {
            AppMethodBeat.i(AppMethodBeat.METHOD_ID_DISPATCH);
        }
        synchronized (this.fIwbmz) {
            for (AbstractC58053yty abstractC58053yty : this.fIwbmz) {
                if (!abstractC58053yty.KWHzl()) {
                    long[] jArr2 = this.djBIcL;
                    abstractC58053yty.EZpvd(jArr2[0], jArr2[2], this.AuCTel);
                }
            }
        }
        if (this.valueOf.values()) {
            C58013ytK.copydefault("Matrix.UIThreadMonitor", "[dispatchBegin#run] inner cost:%sns", java.lang.Long.valueOf(java.lang.System.nanoTime() - this.AuCTel));
        }
    }

    public final void AEQbTJ(long j) {
        EZpvd(2);
        for (int i : this.fARcdN) {
            if (i != 2) {
                this.fJNWhG[i] = -100;
                if (this.valueOf.fetchVPNInfo) {
                    throw new java.lang.RuntimeException(java.lang.String.format("UIThreadMonitor happens type[%s] != DO_QUEUE_END", java.lang.Integer.valueOf(i)));
                }
            }
        }
        this.fARcdN = new int[3];
        EZpvd(0, this, true);
    }

    public final void KWHzl() throws java.lang.Throwable {
        long jEZpvd;
        java.util.HashSet<AbstractC58053yty> hashSet;
        long j;
        long jNanoTime = this.valueOf.values() ? java.lang.System.nanoTime() : 0L;
        char c = 2;
        char c2 = 1;
        if (this.valueOf.isConnected()) {
            long j2 = this.AuCTel;
            if (this.values) {
                AEQbTJ(this.AuCTel);
                jEZpvd = EZpvd(j2);
            } else {
                jEZpvd = j2;
            }
            long jNanoTime2 = java.lang.System.nanoTime();
            java.util.HashSet<AbstractC58053yty> hashSet2 = this.fIwbmz;
            synchronized (hashSet2) {
                try {
                    try {
                        for (AbstractC58053yty abstractC58053yty : this.fIwbmz) {
                            if (abstractC58053yty.KWHzl()) {
                                java.lang.String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
                                boolean z = this.values;
                                long[] jArr = this.fJNWhG;
                                hashSet = hashSet2;
                                j = j2;
                                abstractC58053yty.EZpvd(visibleScene, j2, jNanoTime2, z, jEZpvd, jArr[0], jArr[1], jArr[2]);
                            } else {
                                hashSet = hashSet2;
                                j = j2;
                            }
                            hashSet2 = hashSet;
                            j2 = j;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        java.util.HashSet<AbstractC58053yty> hashSet3 = hashSet2;
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        char c3 = 3;
        if (this.valueOf.fetchVPNInfo() || this.valueOf.values()) {
            this.djBIcL[3] = android.os.SystemClock.currentThreadTimeMillis();
            this.djBIcL[1] = java.lang.System.nanoTime();
        }
        AppMethodBeat.o(AppMethodBeat.METHOD_ID_DISPATCH);
        synchronized (this.fIwbmz) {
            for (AbstractC58053yty abstractC58053yty2 : this.fIwbmz) {
                if (abstractC58053yty2.KWHzl()) {
                    long[] jArr2 = this.djBIcL;
                    abstractC58053yty2.EZpvd(jArr2[0], jArr2[c], jArr2[c2], jArr2[c3], this.AuCTel, this.values);
                }
                c = 2;
                c2 = 1;
                c3 = 3;
            }
        }
        this.values = false;
        if (this.valueOf.values()) {
            C58013ytK.copydefault("Matrix.UIThreadMonitor", "[dispatchEnd#run] inner cost:%sns", java.lang.Long.valueOf(java.lang.System.nanoTime() - jNanoTime));
        }
    }

    public final void copydefault(int i) {
        this.fARcdN[i] = 1;
        this.fJNWhG[i] = java.lang.System.nanoTime();
    }

    public final void EZpvd(int i) {
        this.fARcdN[i] = 2;
        this.fJNWhG[i] = java.lang.System.nanoTime() - this.fJNWhG[i];
        synchronized (this) {
            this.copydefault[i] = false;
        }
    }

    public void valueOf() {
        synchronized (this) {
            if (!this.AkhnZx) {
                C58013ytK.OLrzqt("Matrix.UIThreadMonitor", "[onStart] is never init.", new java.lang.Object[0]);
                return;
            }
            if (!this.DbNXlk) {
                this.DbNXlk = true;
                synchronized (this) {
                    C58013ytK.EZpvd("Matrix.UIThreadMonitor", "[onStart] callbackExist:%s %s", java.util.Arrays.toString(this.copydefault), C58009ytG.AEQbTJ());
                    this.copydefault = new boolean[3];
                    this.fARcdN = new int[3];
                    this.fJNWhG = new long[3];
                    EZpvd(0, this, true);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long jNanoTime = java.lang.System.nanoTime();
        try {
            OLrzqt(this.AuCTel);
            copydefault(0);
            EZpvd(1, new java.lang.Runnable() { // from class: o.ytr.5
                @Override // java.lang.Runnable
                public void run() {
                    RunnableC58046ytr.this.EZpvd(0);
                    RunnableC58046ytr.this.copydefault(1);
                }
            }, true);
            EZpvd(2, new java.lang.Runnable() { // from class: o.ytr.4
                @Override // java.lang.Runnable
                public void run() {
                    RunnableC58046ytr.this.EZpvd(1);
                    RunnableC58046ytr.this.copydefault(2);
                }
            }, true);
        } finally {
            if (this.valueOf.values()) {
                C58013ytK.copydefault("Matrix.UIThreadMonitor", "[UIThreadMonitor#run] inner cost:%sns", java.lang.Long.valueOf(java.lang.System.nanoTime() - jNanoTime));
            }
        }
    }

    public final long EZpvd(long j) {
        try {
            return ((java.lang.Long) C58020ytR.KWHzl(this.ejfBZ, "mTimestampNanos", java.lang.Long.valueOf(j))).longValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C58013ytK.OLrzqt("Matrix.UIThreadMonitor", e.toString(), new java.lang.Object[0]);
            return j;
        }
    }
}

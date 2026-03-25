package o;

/* JADX INFO: loaded from: classes9.dex */
public class pJE {
    public java.lang.String AEQbTJ;
    public long AYXKKw;
    public long AhwBna;
    public long EZpvd;
    public long KWHzl;
    public long OLrzqt;
    public long djBIcL;
    public long gEmmrt;
    public java.lang.String valueOf;
    public long values;
    public boolean copydefault = false;
    public final java.util.List<java.lang.String> isConnected = new java.util.ArrayList(1024);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.gEmmrt = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.copydefault = z;
    }

    public void copydefault() {
        this.gEmmrt = android.os.SystemClock.elapsedRealtime();
        this.AhwBna = 0L;
        this.AYXKKw = 0L;
        this.KWHzl = 0L;
        this.OLrzqt = 0L;
        this.EZpvd = 0L;
        this.values = 0L;
        this.valueOf = null;
        android.app.Activity activityValueOf = C38053pKm.copydefault().valueOf();
        if (activityValueOf != null) {
            this.valueOf = activityValueOf.getClass().getCanonicalName();
        }
    }

    public void AEQbTJ() {
        this.AhwBna = android.os.SystemClock.elapsedRealtime() - this.gEmmrt;
    }

    public void KWHzl() {
        if (this.gEmmrt == 0) {
            this.gEmmrt = android.os.SystemClock.elapsedRealtime();
            this.AhwBna = 0L;
            this.AYXKKw = 0L;
            this.KWHzl = 0L;
            this.OLrzqt = 0L;
            this.EZpvd = 0L;
            this.values = 0L;
        }
        this.EZpvd = android.os.SystemClock.elapsedRealtime();
        this.OLrzqt = 0L;
    }

    public void OLrzqt(pJT pjt) {
        this.OLrzqt = android.os.SystemClock.elapsedRealtime() - this.EZpvd;
        AEQbTJ(pjt);
    }

    public void AEQbTJ(final pJT pjt) {
        this.djBIcL = android.os.SystemClock.elapsedRealtime();
        android.app.Activity activityValueOf = C38053pKm.copydefault().valueOf();
        if (activityValueOf != null && activityValueOf.getWindow() != null) {
            this.AEQbTJ = activityValueOf.getClass().getCanonicalName();
            activityValueOf.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pJD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.copydefault.EZpvd(pjt);
                }
            });
        } else {
            EZpvd(pjt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/pJT;)V */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public final void EZpvd(pJT pjt) {
        if (this.gEmmrt > 0) {
            this.AYXKKw = android.os.SystemClock.elapsedRealtime() - this.djBIcL;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.gEmmrt;
            this.values = jElapsedRealtime;
            this.KWHzl = ((jElapsedRealtime - this.AYXKKw) - this.AhwBna) - this.OLrzqt;
            copydefault(pjt);
        }
    }

    public void copydefault(pJT pjt) {
        com.okinc.lib.monitor.bean.ActivityInfo activityInfo = new com.okinc.lib.monitor.bean.ActivityInfo();
        activityInfo.time = android.os.SystemClock.elapsedRealtime();
        activityInfo.title = this.valueOf + " -> " + this.AEQbTJ;
        java.lang.String str = this.AEQbTJ;
        activityInfo.activityName = str;
        activityInfo.launchCost = this.OLrzqt;
        activityInfo.pauseCost = this.AhwBna;
        activityInfo.renderCost = this.AYXKKw;
        activityInfo.totalCost = this.values;
        activityInfo.otherCost = this.KWHzl;
        if (pjt != null && this.copydefault && !this.isConnected.contains(str)) {
            this.isConnected.add(this.AEQbTJ);
            pjt.OLrzqt(activityInfo);
        }
        this.copydefault = false;
    }
}

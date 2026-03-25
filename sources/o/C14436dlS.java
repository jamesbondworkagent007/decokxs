package o;

/* JADX INFO: renamed from: o.dlS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14436dlS {
    public static long AEQbTJ;
    public static long OLrzqt;
    public static long copydefault;
    public static final C14436dlS KWHzl = new C14436dlS();
    public static final int EZpvd = 8;

    private C14436dlS() {
    }

    public final void copydefault(long j) {
        copydefault = j;
        pUU.KWHzl("ForegroundPasswordTimerManager", "App went to background at: " + j);
    }

    public final void AEQbTJ(long j) {
        AEQbTJ = j;
        pUU.KWHzl("ForegroundPasswordTimerManager", "App came to foreground at: " + j + ", background time: " + copydefault);
        if (AEQbTJ()) {
            C8342bAs.Companion.EZpvd().EZpvd();
        }
    }

    public final boolean AEQbTJ() {
        if (copydefault == 0) {
            pUU.KWHzl("ForegroundPasswordTimerManager", "No background time recorded");
            return false;
        }
        long j = 1000;
        long jEZpvd = C14450dlg.copydefault.EZpvd() * j;
        if (jEZpvd <= 0) {
            pUU.KWHzl("ForegroundPasswordTimerManager", "Invalid background threshold");
            return false;
        }
        long j2 = AEQbTJ - copydefault;
        boolean z = j2 > jEZpvd;
        pUU.KWHzl("ForegroundPasswordTimerManager", "Background duration: " + (j2 / j) + "s, exceeded: " + z);
        return z;
    }

    public final void EZpvd(long j) {
        OLrzqt = j;
        pUU.KWHzl("ForegroundPasswordTimerManager", "Last auth time updated: " + j);
    }

    public final boolean OLrzqt() {
        if (OLrzqt == 0) {
            pUU.KWHzl("ForegroundPasswordTimerManager", "No auth time recorded");
            return true;
        }
        long j = 1000;
        long jKWHzl = C14450dlg.copydefault.KWHzl() * j;
        if (jKWHzl <= 0) {
            pUU.KWHzl("ForegroundPasswordTimerManager", "Invalid expire time threshold");
            return false;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - OLrzqt;
        boolean z = jCurrentTimeMillis > jKWHzl;
        pUU.KWHzl("ForegroundPasswordTimerManager", "Duration after last auth: " + (jCurrentTimeMillis / j) + "s, expired: " + z);
        return z;
    }
}

package o;

/* JADX INFO: renamed from: o.arC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7824arC {
    public long OLrzqt = 0;
    public long KWHzl = C7330ahm.KWHzl;

    public boolean OLrzqt() {
        if (this.KWHzl <= 0) {
            return true;
        }
        long jEZpvd = EZpvd();
        long j = jEZpvd - this.OLrzqt;
        if (j < this.KWHzl && j >= 0) {
            return false;
        }
        this.OLrzqt = jEZpvd;
        return true;
    }

    public final long EZpvd() {
        return java.lang.System.currentTimeMillis();
    }
}

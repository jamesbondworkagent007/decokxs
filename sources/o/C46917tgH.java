package o;

/* JADX INFO: renamed from: o.tgH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46917tgH {
    public static final boolean EZpvd(C46915tgF c46915tgF) {
        if (c46915tgF == null || c46915tgF.EZpvd().length() == 0 || !OLrzqt(c46915tgF)) {
            return false;
        }
        return C59449zhJ.gEmmrt("CN", c46915tgF.EZpvd(), true);
    }

    public static final boolean AEQbTJ(C46915tgF c46915tgF) {
        if (c46915tgF == null || c46915tgF.EZpvd().length() == 0) {
            return false;
        }
        return C59449zhJ.gEmmrt("CN", c46915tgF.EZpvd(), true);
    }

    public static final boolean OLrzqt(C46915tgF c46915tgF) {
        if (c46915tgF == null) {
            return false;
        }
        return c46915tgF.OLrzqt() == 0 || c46915tgF.OLrzqt() == 1;
    }
}

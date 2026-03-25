package o;

/* JADX INFO: renamed from: o.afq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7228afq {
    public static final C7228afq KWHzl = new C7228afq(1, -1);
    public final int OLrzqt;
    public final int copydefault;

    public C7228afq(int i, int i2) {
        this.OLrzqt = i;
        this.copydefault = i2;
    }

    public static C7228afq KWHzl(int i) {
        if (i == 1) {
            return KWHzl;
        }
        if (i >= 0 && i <= 999) {
            return new C7228afq(i, -1);
        }
        throw new java.lang.IllegalArgumentException("Integer digits must be between 0 and 999 (inclusive)");
    }

    public C7228afq AEQbTJ(int i) {
        int i2;
        if (i == this.copydefault) {
            return this;
        }
        if (i >= 0 && i <= 999 && i >= (i2 = this.OLrzqt)) {
            return new C7228afq(i2, i);
        }
        int i3 = this.OLrzqt;
        if (i3 == 1 && i == -1) {
            return KWHzl;
        }
        if (i == -1) {
            return new C7228afq(i3, -1);
        }
        throw new java.lang.IllegalArgumentException("Integer digits must be between -1 and 999 (inclusive)");
    }
}

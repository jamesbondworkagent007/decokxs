package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35193nqh {
    public final int AEQbTJ;
    public final int AhwBna;
    public final int EZpvd;
    public final java.lang.Integer KWHzl;
    public final int OLrzqt;
    public final java.lang.Integer copydefault;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35193nqh copy$default(C35193nqh c35193nqh, int i, int i2, int i3, int i4, int i5, java.lang.Integer num, java.lang.Integer num2, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            i = c35193nqh.AEQbTJ;
        }
        if ((i6 & 2) != 0) {
            i2 = c35193nqh.OLrzqt;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = c35193nqh.EZpvd;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = c35193nqh.valueOf;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = c35193nqh.AhwBna;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            num = c35193nqh.KWHzl;
        }
        java.lang.Integer num3 = num;
        if ((i6 & 64) != 0) {
            num2 = c35193nqh.copydefault;
        }
        return c35193nqh.copydefault(i, i7, i8, i9, i10, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35193nqh copydefault(int i, int i2, int i3, int i4, int i5, java.lang.Integer num, java.lang.Integer num2) {
        return new C35193nqh(i, i2, i3, i4, i5, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35193nqh)) {
            return false;
        }
        C35193nqh c35193nqh = (C35193nqh) obj;
        return this.AEQbTJ == c35193nqh.AEQbTJ && this.OLrzqt == c35193nqh.OLrzqt && this.EZpvd == c35193nqh.EZpvd && this.valueOf == c35193nqh.valueOf && this.AhwBna == c35193nqh.AhwBna && Intrinsics.EZpvd(this.KWHzl, c35193nqh.KWHzl) && Intrinsics.EZpvd(this.copydefault, c35193nqh.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode3 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode4 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode5 = java.lang.Integer.hashCode(this.AhwBna);
        java.lang.Integer num = this.KWHzl;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "P2PViewIdHolder(itemLayoutId=" + this.AEQbTJ + ", iconImage=" + this.OLrzqt + ", price=" + this.EZpvd + ", tradeSide=" + this.valueOf + ", tradeSideBgImage=" + this.AhwBna + ", title=" + this.KWHzl + ", subTitle=" + this.copydefault + ")";
    }

    public C35193nqh(int i, int i2, int i3, int i4, int i5, java.lang.Integer num, java.lang.Integer num2) {
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        this.valueOf = i4;
        this.AhwBna = i5;
        this.KWHzl = num;
        this.copydefault = num2;
    }
}

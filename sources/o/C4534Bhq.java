package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4534Bhq {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<? extends BhD> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.Integer djBIcL;
    public java.lang.String gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4534Bhq EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, boolean z, java.util.List<? extends BhD> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C4534Bhq(str, str2, num, str3, str4, z, list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.BhD>, java.util.List<o.BhD> */
    public final java.util.List<BhD> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4534Bhq)) {
            return false;
        }
        C4534Bhq c4534Bhq = (C4534Bhq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4534Bhq.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4534Bhq.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c4534Bhq.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c4534Bhq.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4534Bhq.AEQbTJ) && this.copydefault == c4534Bhq.copydefault && Intrinsics.EZpvd(this.EZpvd, c4534Bhq.EZpvd) && this.valueOf == c4534Bhq.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.djBIcL;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.copydefault);
        java.util.List<? extends BhD> list = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketEventReq(instId=" + this.OLrzqt + ", cursor=" + this.KWHzl + ", pageSize=" + this.djBIcL + ", unit=" + this.gEmmrt + ", displayInstName=" + this.AEQbTJ + ", isWsForceRequest=" + this.copydefault + ", currentList=" + this.EZpvd + ", useNewTemp=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C4534Bhq(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, boolean z, java.util.List<? extends BhD> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.djBIcL = num;
        this.gEmmrt = str3;
        this.AEQbTJ = str4;
        this.copydefault = z;
        this.EZpvd = list;
        this.valueOf = i;
    }
}

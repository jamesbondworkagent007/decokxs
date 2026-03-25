package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18063fbN {
    public final int AEQbTJ;
    public final java.lang.Integer AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<java.lang.Integer> AkhnZx;
    public final java.lang.Integer EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final boolean gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18063fbN OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.util.List<java.lang.Integer> list, boolean z, java.lang.Integer num, java.lang.String str5, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C18063fbN(i, str, str2, str3, str4, i2, list, z, num, str5, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18063fbN)) {
            return false;
        }
        C18063fbN c18063fbN = (C18063fbN) obj;
        return this.AEQbTJ == c18063fbN.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c18063fbN.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18063fbN.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c18063fbN.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18063fbN.copydefault) && this.KWHzl == c18063fbN.KWHzl && Intrinsics.EZpvd(this.AkhnZx, c18063fbN.AkhnZx) && this.gEmmrt == c18063fbN.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, c18063fbN.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c18063fbN.valueOf) && Intrinsics.EZpvd(this.EZpvd, c18063fbN.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode7 = this.AkhnZx.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.gEmmrt);
        java.lang.Integer num = this.AYXKKw;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        java.lang.String str = this.valueOf;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        java.lang.Integer num2 = this.EZpvd;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MoreFunctionItem(id=" + this.AEQbTJ + ", name=" + this.AhwBna + ", dayIcon=" + this.OLrzqt + ", nightIcon=" + this.djBIcL + ", jumpUrl=" + this.copydefault + ", jumpType=" + this.KWHzl + ", supportWalletType=" + this.AkhnZx + ", recommendFlag=" + this.gEmmrt + ", projectCount=" + this.AYXKKw + ", projectCountText=" + this.valueOf + ", localeBuildEnum=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    public C18063fbN(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.util.List<java.lang.Integer> list, boolean z, java.lang.Integer num, java.lang.String str5, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = i;
        this.AhwBna = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
        this.copydefault = str4;
        this.KWHzl = i2;
        this.AkhnZx = list;
        this.gEmmrt = z;
        this.AYXKKw = num;
        this.valueOf = str5;
        this.EZpvd = num2;
    }
}

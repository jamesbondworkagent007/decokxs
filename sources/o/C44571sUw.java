package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44571sUw {
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.Integer djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44571sUw KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C44571sUw(str, str2, str3, str4, num, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44571sUw)) {
            return false;
        }
        C44571sUw c44571sUw = (C44571sUw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c44571sUw.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c44571sUw.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c44571sUw.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44571sUw.EZpvd) && Intrinsics.EZpvd(this.djBIcL, c44571sUw.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c44571sUw.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c44571sUw.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c44571sUw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.djBIcL;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        java.lang.String str3 = this.gEmmrt;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.Boolean bool = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenTagData(symbol=" + this.AYXKKw + ", change=" + this.copydefault + ", iconUrl=" + this.KWHzl + ", instId=" + this.EZpvd + ", tokenType=" + this.djBIcL + ", tokenLogoUrl=" + this.gEmmrt + ", chainLogoUrl=" + this.OLrzqt + ", isCeFi=" + this.AEQbTJ + ")";
    }

    public C44571sUw(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.EZpvd = str4;
        this.djBIcL = num;
        this.gEmmrt = str5;
        this.OLrzqt = str6;
        this.AEQbTJ = bool;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.akH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7458akH {
    public final java.lang.String AEQbTJ;
    public final int AhwBna;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final double OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7458akH copydefault(@NotNull java.lang.String str, double d, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C7458akH(str, d, str2, str3, i, i2, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7458akH)) {
            return false;
        }
        C7458akH c7458akH = (C7458akH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c7458akH.KWHzl) && java.lang.Double.compare(this.OLrzqt, c7458akH.OLrzqt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c7458akH.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c7458akH.copydefault) && this.EZpvd == c7458akH.EZpvd && this.AhwBna == c7458akH.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c7458akH.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c7458akH.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = java.lang.Double.hashCode(this.OLrzqt);
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode6 = java.lang.Integer.hashCode(this.AhwBna);
        java.lang.String str = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TreeMapData(name=" + this.KWHzl + ", displayPercent=" + this.OLrzqt + ", price=" + this.gEmmrt + ", changePercent=" + this.copydefault + ", backgroundColor=" + this.EZpvd + ", textColor=" + this.AhwBna + ", tokenAddress=" + this.valueOf + ", chainId=" + this.AEQbTJ + ")";
    }

    public C7458akH(@NotNull java.lang.String str, double d, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.OLrzqt = d;
        this.gEmmrt = str2;
        this.copydefault = str3;
        this.EZpvd = i;
        this.AhwBna = i2;
        this.valueOf = str4;
        this.AEQbTJ = str5;
    }
}

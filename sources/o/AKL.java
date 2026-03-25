package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AKL {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<java.lang.String> AYXKKw;
    public java.lang.Integer AhwBna;
    public boolean AkhnZx;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Integer copydefault;
    public java.lang.Integer djBIcL;
    public boolean gEmmrt;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AKL KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, boolean z2, boolean z3, java.lang.String str5, java.lang.Integer num3, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AKL(z, str, str2, str3, str4, num, num2, z2, z3, str5, num3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKL)) {
            return false;
        }
        AKL akl = (AKL) obj;
        return this.gEmmrt == akl.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) akl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) akl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) akl.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) akl.values) && Intrinsics.EZpvd(this.djBIcL, akl.djBIcL) && Intrinsics.EZpvd(this.AhwBna, akl.AhwBna) && this.EZpvd == akl.EZpvd && this.AkhnZx == akl.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) akl.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, akl.copydefault) && Intrinsics.EZpvd(this.AYXKKw, akl.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.gEmmrt);
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.valueOf;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.values;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.Integer num = this.djBIcL;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.AhwBna;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode9 = java.lang.Boolean.hashCode(this.AkhnZx);
        java.lang.String str5 = this.AEQbTJ;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num3 = this.copydefault;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeatureRestrictionConfigModel(limit=" + this.gEmmrt + ", country=" + this.KWHzl + ", displayCountryName=" + this.OLrzqt + ", province=" + this.valueOf + ", provinceCode=" + this.values + ", kycLevel=" + this.djBIcL + ", politStatus=" + this.AhwBna + ", hidden=" + this.EZpvd + ", removeUserFlag=" + this.AkhnZx + ", action=" + this.AEQbTJ + ", content=" + this.copydefault + ", mode=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AkhnZx;
    }

    public AKL(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, boolean z2, boolean z3, java.lang.String str5, java.lang.Integer num3, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = z;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.valueOf = str3;
        this.values = str4;
        this.djBIcL = num;
        this.AhwBna = num2;
        this.EZpvd = z2;
        this.AkhnZx = z3;
        this.AEQbTJ = str5;
        this.copydefault = num3;
        this.AYXKKw = list;
    }
}

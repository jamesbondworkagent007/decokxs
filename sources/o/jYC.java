package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jYC {
    public final java.lang.String AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public final float AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final float djBIcL;
    public final java.lang.String gEmmrt;
    public final float valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jYC copydefault(@NotNull java.lang.String str, float f, float f2, float f3, float f4, float f5, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new jYC(str, f, f2, f3, f4, f5, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jYC)) {
            return false;
        }
        jYC jyc = (jYC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) jyc.values) && java.lang.Float.compare(this.AkhnZx, jyc.AkhnZx) == 0 && java.lang.Float.compare(this.AhwBna, jyc.AhwBna) == 0 && java.lang.Float.compare(this.valueOf, jyc.valueOf) == 0 && java.lang.Float.compare(this.djBIcL, jyc.djBIcL) == 0 && java.lang.Float.compare(this.AYXKKw, jyc.AYXKKw) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jyc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) jyc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jyc.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) jyc.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) jyc.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) jyc.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.values.hashCode() * 31) + java.lang.Float.hashCode(this.AkhnZx)) * 31) + java.lang.Float.hashCode(this.AhwBna)) * 31) + java.lang.Float.hashCode(this.valueOf)) * 31) + java.lang.Float.hashCode(this.djBIcL)) * 31) + java.lang.Float.hashCode(this.AYXKKw)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HolderSummaryModel(totalHolder=" + this.values + ", top100Percentage=" + this.AkhnZx + ", suspiciousCount=" + this.AhwBna + ", suspiciousPercentage=" + this.valueOf + ", sniperCount=" + this.djBIcL + ", sniperPercentage=" + this.AYXKKw + ", greaterThan10Amount=" + this.OLrzqt + ", greaterThan10AmountPercentage=" + this.KWHzl + ", holderAvgBoughtPrice=" + this.copydefault + ", holderAvgBoughtPercentage=" + this.AEQbTJ + ", holderAvgSoldPrice=" + this.gEmmrt + ", holderAvgSoldPercentage=" + this.EZpvd + ")";
    }

    public jYC(@NotNull java.lang.String str, float f, float f2, float f3, float f4, float f5, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.values = str;
        this.AkhnZx = f;
        this.AhwBna = f2;
        this.valueOf = f3;
        this.djBIcL = f4;
        this.AYXKKw = f5;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.copydefault = str4;
        this.AEQbTJ = str5;
        this.gEmmrt = str6;
        this.EZpvd = str7;
    }
}

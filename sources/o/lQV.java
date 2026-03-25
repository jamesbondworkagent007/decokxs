package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQV {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lQV copy$default(lQV lqv, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = lqv.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = lqv.OLrzqt;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = lqv.gEmmrt;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            z = lqv.EZpvd;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = lqv.AEQbTJ;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = lqv.copydefault;
        }
        return lqv.EZpvd(str, str6, str7, z2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQV EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new lQV(str, str2, str3, z, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lQV)) {
            return false;
        }
        lQV lqv = (lQV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) lqv.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) lqv.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) lqv.gEmmrt) && this.EZpvd == lqv.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) lqv.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) lqv.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EditAmountUiModel(currentAmount=" + this.KWHzl + ", quoteCurrency=" + this.OLrzqt + ", quoteSymbol=" + this.gEmmrt + ", displayQuoteCurrencyAfterAmount=" + this.EZpvd + ", minLimitAmount=" + this.AEQbTJ + ", maxLimitAmount=" + this.copydefault + ")";
    }

    public lQV(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.gEmmrt = str3;
        this.EZpvd = z;
        this.AEQbTJ = str4;
        this.copydefault = str5;
    }
}

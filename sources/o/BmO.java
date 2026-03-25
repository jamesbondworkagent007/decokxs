package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BmO {
    public static final int $stable = 8;
    public int AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public double OLrzqt;
    public boolean copydefault;
    public java.lang.Double djBIcL;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BmO copydefault(int i, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, double d, java.lang.Double d2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BmO(i, z, str, str2, str3, i2, d, d2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BmO)) {
            return false;
        }
        BmO bmO = (BmO) obj;
        return this.AEQbTJ == bmO.AEQbTJ && this.EZpvd == bmO.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) bmO.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bmO.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) bmO.AYXKKw) && this.gEmmrt == bmO.gEmmrt && java.lang.Double.compare(this.OLrzqt, bmO.OLrzqt) == 0 && Intrinsics.EZpvd(this.djBIcL, bmO.djBIcL) && this.copydefault == bmO.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.gEmmrt);
        int iHashCode7 = java.lang.Double.hashCode(this.OLrzqt);
        java.lang.Double d = this.djBIcL;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (d == null ? 0 : d.hashCode())) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CurrencyModel(currencyId=" + this.AEQbTJ + ", isDefault=" + this.EZpvd + ", isoCode=" + this.AhwBna + ", displayName=" + this.KWHzl + ", symbol=" + this.AYXKKw + ", precision=" + this.gEmmrt + ", exchangeRate=" + this.OLrzqt + ", usdToThisRatePremium=" + this.djBIcL + ", isPremium=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    public BmO(int i, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, double d, java.lang.Double d2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = i;
        this.EZpvd = z;
        this.AhwBna = str;
        this.KWHzl = str2;
        this.AYXKKw = str3;
        this.gEmmrt = i2;
        this.OLrzqt = d;
        this.djBIcL = d2;
        this.copydefault = z2;
    }
}

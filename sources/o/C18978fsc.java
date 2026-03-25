package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18978fsc {
    public final java.lang.String AEQbTJ;
    public final long AYXKKw;
    public final java.lang.String AhwBna;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18978fsc AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C18978fsc(str, str2, j, str3, str4, i, i2, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18978fsc)) {
            return false;
        }
        C18978fsc c18978fsc = (C18978fsc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c18978fsc.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c18978fsc.valueOf) && this.AYXKKw == c18978fsc.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c18978fsc.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c18978fsc.gEmmrt) && this.OLrzqt == c18978fsc.OLrzqt && this.EZpvd == c18978fsc.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18978fsc.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18978fsc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18978fsc.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = java.lang.Long.hashCode(this.AYXKKw);
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = this.gEmmrt.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode7 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode8 = this.copydefault.hashCode();
        int iHashCode9 = this.KWHzl.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomChainWalletCoinAssetUiModel(metaId=" + this.AhwBna + ", walletId=" + this.valueOf + ", generalChainId=" + this.AYXKKw + ", symbol=" + this.djBIcL + ", iconUrl=" + this.gEmmrt + ", decimalNum=" + this.OLrzqt + ", displayPrecision=" + this.EZpvd + ", amount=" + this.copydefault + ", currencyAmount=" + this.KWHzl + ", chainLogoUrl=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public C18978fsc(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AhwBna = str;
        this.valueOf = str2;
        this.AYXKKw = j;
        this.djBIcL = str3;
        this.gEmmrt = str4;
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.copydefault = str5;
        this.KWHzl = str6;
        this.AEQbTJ = str7;
    }
}

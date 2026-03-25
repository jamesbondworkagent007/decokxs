package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21041gsK {
    public final C10854bwM AEQbTJ;
    public final boolean AYXKKw;
    public final C21033gsC EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final java.lang.String djBIcL;
    public final android.graphics.Bitmap gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21033gsC EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21041gsK EZpvd(@NotNull java.lang.String str, android.graphics.Bitmap bitmap, @NotNull java.lang.String str2, C10854bwM c10854bwM, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.CharSequence charSequence, C21033gsC c21033gsC, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C21041gsK(str, bitmap, str2, c10854bwM, str3, z, charSequence, c21033gsC, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof C21041gsK)) {
            return false;
        }
        C21041gsK c21041gsK = (C21041gsK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c21041gsK.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c21041gsK.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c21041gsK.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c21041gsK.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c21041gsK.valueOf) && this.AYXKKw == c21041gsK.AYXKKw && Intrinsics.EZpvd(this.copydefault, c21041gsK.copydefault) && Intrinsics.EZpvd(this.EZpvd, c21041gsK.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c21041gsK.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        android.graphics.Bitmap bitmap = this.gEmmrt;
        int iHashCode2 = bitmap == null ? 0 : bitmap.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        C10854bwM c10854bwM = this.AEQbTJ;
        int iHashCode4 = c10854bwM == null ? 0 : c10854bwM.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode7 = this.copydefault.hashCode();
        C21033gsC c21033gsC = this.EZpvd;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c21033gsC != null ? c21033gsC.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.djBIcL;
        android.graphics.Bitmap bitmap = this.gEmmrt;
        java.lang.String str2 = this.OLrzqt;
        C10854bwM c10854bwM = this.AEQbTJ;
        java.lang.String str3 = this.valueOf;
        boolean z = this.AYXKKw;
        java.lang.CharSequence charSequence = this.copydefault;
        return "ShareReceiveInfo(qrInfo=" + str + ", qrDrawable=" + bitmap + ", address=" + str2 + ", coinMeta=" + c10854bwM + ", tag=" + str3 + ", showPrice=" + z + ", mTip=" + ((java.lang.Object) charSequence) + ", priceInfo=" + this.EZpvd + ", coinSymbol=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Bitmap valueOf() {
        return this.gEmmrt;
    }

    public C21041gsK(@NotNull java.lang.String str, android.graphics.Bitmap bitmap, @NotNull java.lang.String str2, C10854bwM c10854bwM, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.CharSequence charSequence, C21033gsC c21033gsC, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = str;
        this.gEmmrt = bitmap;
        this.OLrzqt = str2;
        this.AEQbTJ = c10854bwM;
        this.valueOf = str3;
        this.AYXKKw = z;
        this.copydefault = charSequence;
        this.EZpvd = c21033gsC;
        this.KWHzl = str4;
    }
}

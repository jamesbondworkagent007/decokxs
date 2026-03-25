package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35201nqp {
    public final android.graphics.Bitmap AEQbTJ;
    public final java.lang.String AYXKKw;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final android.graphics.Bitmap copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Bitmap EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35201nqp EZpvd(android.graphics.Bitmap bitmap, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, android.graphics.Bitmap bitmap2, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C35201nqp(bitmap, str, str2, str3, str4, bitmap2, i, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Bitmap OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof C35201nqp)) {
            return false;
        }
        C35201nqp c35201nqp = (C35201nqp) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c35201nqp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c35201nqp.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35201nqp.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c35201nqp.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c35201nqp.AYXKKw) && Intrinsics.EZpvd(this.copydefault, c35201nqp.copydefault) && this.EZpvd == c35201nqp.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35201nqp.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.Bitmap bitmap = this.AEQbTJ;
        int iHashCode = bitmap == null ? 0 : bitmap.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        android.graphics.Bitmap bitmap2 = this.copydefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WidgetListViewItem(icon=" + this.AEQbTJ + ", price=" + this.djBIcL + ", changePercent=" + this.KWHzl + ", title=" + this.gEmmrt + ", subTitle=" + this.AYXKKw + ", klineImage=" + this.copydefault + ", changePercentColor=" + this.EZpvd + ", crypto=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C35201nqp(android.graphics.Bitmap bitmap, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, android.graphics.Bitmap bitmap2, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = bitmap;
        this.djBIcL = str;
        this.KWHzl = str2;
        this.gEmmrt = str3;
        this.AYXKKw = str4;
        this.copydefault = bitmap2;
        this.EZpvd = i;
        this.OLrzqt = str5;
    }
}

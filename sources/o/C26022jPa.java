package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26022jPa {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final int copydefault;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26022jPa copy$default(C26022jPa c26022jPa, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Integer num, java.lang.Integer num2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c26022jPa.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i = c26022jPa.copydefault;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = c26022jPa.KWHzl;
        }
        java.lang.String str3 = str2;
        if ((i3 & 8) != 0) {
            i2 = c26022jPa.gEmmrt;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            num = c26022jPa.AEQbTJ;
        }
        java.lang.Integer num3 = num;
        if ((i3 & 32) != 0) {
            num2 = c26022jPa.OLrzqt;
        }
        return c26022jPa.KWHzl(str, i4, str3, i5, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26022jPa KWHzl(java.lang.String str, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str2, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new C26022jPa(str, i, str2, i2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26022jPa)) {
            return false;
        }
        C26022jPa c26022jPa = (C26022jPa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c26022jPa.EZpvd) && this.copydefault == c26022jPa.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26022jPa.KWHzl) && this.gEmmrt == c26022jPa.gEmmrt && Intrinsics.EZpvd(this.AEQbTJ, c26022jPa.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c26022jPa.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.copydefault);
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = java.lang.Integer.hashCode(this.gEmmrt);
        java.lang.Integer num = this.AEQbTJ;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenTagUiItem(tagIconUrl=" + this.EZpvd + ", tagIconResource=" + this.copydefault + ", tagText=" + this.KWHzl + ", tokenTagColor=" + this.gEmmrt + ", tagIconColor=" + this.AEQbTJ + ", tagTextColor=" + this.OLrzqt + ")";
    }

    public C26022jPa(java.lang.String str, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str2, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = i;
        this.KWHzl = str2;
        this.gEmmrt = i2;
        this.AEQbTJ = num;
        this.OLrzqt = num2;
    }
}

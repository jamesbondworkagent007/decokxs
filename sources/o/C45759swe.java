package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45759swe {
    public final int AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final java.lang.String djBIcL;
    public final boolean gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45759swe KWHzl(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @NotNull java.lang.String str2, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C45759swe(i, i2, str, i3, i4, str2, i5, i6, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45759swe)) {
            return false;
        }
        C45759swe c45759swe = (C45759swe) obj;
        return this.copydefault == c45759swe.copydefault && this.OLrzqt == c45759swe.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c45759swe.EZpvd) && this.valueOf == c45759swe.valueOf && this.AEQbTJ == c45759swe.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c45759swe.KWHzl) && this.AhwBna == c45759swe.AhwBna && this.AYXKKw == c45759swe.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c45759swe.djBIcL) && this.gEmmrt == c45759swe.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BannerModelContent(backgroundColorLight=" + this.copydefault + ", backgroundColorDark=" + this.OLrzqt + ", icon=" + this.EZpvd + ", iconTintColorLight=" + this.valueOf + ", iconTintColorDark=" + this.AEQbTJ + ", content=" + this.KWHzl + ", textColorDark=" + this.AhwBna + ", textColorLight=" + this.AYXKKw + ", position=" + this.djBIcL + ", isSticky=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AhwBna;
    }

    public C45759swe(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @NotNull java.lang.String str2, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = i;
        this.OLrzqt = i2;
        this.EZpvd = str;
        this.valueOf = i3;
        this.AEQbTJ = i4;
        this.KWHzl = str2;
        this.AhwBna = i5;
        this.AYXKKw = i6;
        this.djBIcL = str3;
        this.gEmmrt = z;
    }
}

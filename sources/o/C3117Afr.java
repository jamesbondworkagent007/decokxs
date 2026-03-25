package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.PreferenceType;

/* JADX INFO: renamed from: o.Afr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3117Afr {
    public static final int $stable = 8;
    public zCC AEQbTJ;
    public PreferenceType AYXKKw;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.Boolean OLrzqt;
    public boolean copydefault;
    public zCC djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3117Afr copy$default(C3117Afr c3117Afr, PreferenceType preferenceType, zCC zcc, boolean z, zCC zcc2, java.lang.String str, java.lang.Boolean bool, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            preferenceType = c3117Afr.AYXKKw;
        }
        if ((i & 2) != 0) {
            zcc = c3117Afr.djBIcL;
        }
        zCC zcc3 = zcc;
        if ((i & 4) != 0) {
            z = c3117Afr.EZpvd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            zcc2 = c3117Afr.AEQbTJ;
        }
        zCC zcc4 = zcc2;
        if ((i & 16) != 0) {
            str = c3117Afr.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            bool = c3117Afr.OLrzqt;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 64) != 0) {
            z2 = c3117Afr.copydefault;
        }
        return c3117Afr.copydefault(preferenceType, zcc3, z3, zcc4, str2, bool2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zCC KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zCC OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3117Afr copydefault(@NotNull PreferenceType preferenceType, @NotNull zCC zcc, boolean z, @NotNull zCC zcc2, @NotNull java.lang.String str, java.lang.Boolean bool, boolean z2) {
        Intrinsics.checkNotNullParameter(preferenceType, "");
        Intrinsics.checkNotNullParameter(zcc, "");
        Intrinsics.checkNotNullParameter(zcc2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3117Afr(preferenceType, zcc, z, zcc2, str, bool, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreferenceType copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3117Afr)) {
            return false;
        }
        C3117Afr c3117Afr = (C3117Afr) obj;
        return this.AYXKKw == c3117Afr.AYXKKw && Intrinsics.EZpvd(this.djBIcL, c3117Afr.djBIcL) && this.EZpvd == c3117Afr.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c3117Afr.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3117Afr.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3117Afr.OLrzqt) && this.copydefault == c3117Afr.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        java.lang.Boolean bool = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingItem(itemId=" + this.AYXKKw + ", title=" + this.djBIcL + ", isEntrance=" + this.EZpvd + ", content=" + this.AEQbTJ + ", itemContentDescription=" + this.KWHzl + ", isSwitchOn=" + this.OLrzqt + ", hasInfo=" + this.copydefault + ")";
    }

    public C3117Afr(@NotNull PreferenceType preferenceType, @NotNull zCC zcc, boolean z, @NotNull zCC zcc2, @NotNull java.lang.String str, java.lang.Boolean bool, boolean z2) {
        Intrinsics.checkNotNullParameter(preferenceType, "");
        Intrinsics.checkNotNullParameter(zcc, "");
        Intrinsics.checkNotNullParameter(zcc2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = preferenceType;
        this.djBIcL = zcc;
        this.EZpvd = z;
        this.AEQbTJ = zcc2;
        this.KWHzl = str;
        this.OLrzqt = bool;
        this.copydefault = z2;
    }
}

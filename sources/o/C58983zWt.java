package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58983zWt {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public java.lang.Double AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.util.List<C60244zzA> OLrzqt;
    public java.util.List<C60244zzA> copydefault;
    public boolean djBIcL;
    public boolean gEmmrt;
    public java.lang.Double valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C60244zzA> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58983zWt EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, java.lang.Double d, java.lang.Double d2, boolean z3, @NotNull java.util.List<C60244zzA> list, @NotNull java.util.List<C60244zzA> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C58983zWt(str, str2, str3, z, z2, d, d2, z3, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C60244zzA> KWHzl() {
        return this.OLrzqt;
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
    public final java.lang.Double djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58983zWt)) {
            return false;
        }
        C58983zWt c58983zWt = (C58983zWt) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58983zWt.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c58983zWt.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58983zWt.AEQbTJ) && this.gEmmrt == c58983zWt.gEmmrt && this.djBIcL == c58983zWt.djBIcL && Intrinsics.EZpvd(this.valueOf, c58983zWt.valueOf) && Intrinsics.EZpvd(this.AhwBna, c58983zWt.AhwBna) && this.AYXKKw == c58983zWt.AYXKKw && Intrinsics.EZpvd(this.copydefault, c58983zWt.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c58983zWt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode5 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.Double d = this.valueOf;
        int iHashCode6 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.AhwBna;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (d2 != null ? d2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyListItem(credentialId=" + this.KWHzl + ", displayName=" + this.EZpvd + ", credentialType=" + this.AEQbTJ + ", isInHouse=" + this.gEmmrt + ", isCurrentDevice=" + this.djBIcL + ", lastUsedTimestamp=" + this.valueOf + ", registrationTimestamp=" + this.AhwBna + ", isDexPasskey=" + this.AYXKKw + ", dexChainList=" + this.copydefault + ", chainList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double valueOf() {
        return this.valueOf;
    }

    public C58983zWt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, java.lang.Double d, java.lang.Double d2, boolean z3, @NotNull java.util.List<C60244zzA> list, @NotNull java.util.List<C60244zzA> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.gEmmrt = z;
        this.djBIcL = z2;
        this.valueOf = d;
        this.AhwBna = d2;
        this.AYXKKw = z3;
        this.copydefault = list;
        this.OLrzqt = list2;
    }
}

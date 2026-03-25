package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58484zEb {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58484zEb KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C58484zEb(str, str2, str3, str4, z, str5, z2, z3, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
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
        if (!(obj instanceof C58484zEb)) {
            return false;
        }
        C58484zEb c58484zEb = (C58484zEb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c58484zEb.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c58484zEb.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c58484zEb.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58484zEb.OLrzqt) && this.copydefault == c58484zEb.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c58484zEb.AYXKKw) && this.AEQbTJ == c58484zEb.AEQbTJ && this.EZpvd == c58484zEb.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58484zEb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str3 = this.AYXKKw;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode8 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.String str4 = this.KWHzl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginRegisterResult(uid=" + this.valueOf + ", token=" + this.djBIcL + ", tk=" + this.gEmmrt + ", passkeyEasyRegToken=" + this.OLrzqt + ", bindSuccessful=" + this.copydefault + ", preferredMode=" + this.AYXKKw + ", isRegister=" + this.AEQbTJ + ", isSocialAccount=" + this.EZpvd + ", channel=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C58484zEb(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.djBIcL = str2;
        this.gEmmrt = str3;
        this.OLrzqt = str4;
        this.copydefault = z;
        this.AYXKKw = str5;
        this.AEQbTJ = z2;
        this.EZpvd = z3;
        this.KWHzl = str6;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zDG {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zDG copy$default(zDG zdg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zdg.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = zdg.OLrzqt;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = zdg.AEQbTJ;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = zdg.AYXKKw;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = zdg.EZpvd;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            bool = zdg.valueOf;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 64) != 0) {
            str6 = zdg.KWHzl;
        }
        return zdg.EZpvd(str, str7, str8, str9, str10, bool2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zDG EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new zDG(str, str2, str3, str4, str5, bool, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zDG)) {
            return false;
        }
        zDG zdg = (zDG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zdg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) zdg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zdg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) zdg.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zdg.EZpvd) && Intrinsics.EZpvd(this.valueOf, zdg.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) zdg.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        java.lang.String str4 = this.EZpvd;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.Boolean bool = this.valueOf;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        java.lang.String str5 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginNameResult(email=" + this.copydefault + ", areaCode=" + this.OLrzqt + ", phone=" + this.AEQbTJ + ", registerType=" + this.AYXKKw + ", flow=" + this.EZpvd + ", showNewUserRewardRiskBanner=" + this.valueOf + ", nextStep=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean valueOf() {
        return this.valueOf;
    }

    public zDG(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.AYXKKw = str4;
        this.EZpvd = str5;
        this.valueOf = bool;
        this.KWHzl = str6;
    }
}

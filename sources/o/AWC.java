package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class AWC {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AWC copy$default(AWC awc, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = awc.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = awc.AEQbTJ;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = awc.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = awc.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = awc.KWHzl;
        }
        return awc.OLrzqt(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AWC(str, str2, str3, str4, str5);
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
        if (!(obj instanceof AWC)) {
            return false;
        }
        AWC awc = (AWC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) awc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) awc.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) awc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) awc.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) awc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UtmParamModel(utmMedium=" + this.EZpvd + ", utmSource=" + this.AEQbTJ + ", utmCampaign=" + this.OLrzqt + ", utmContent=" + this.copydefault + ", utmTerm=" + this.KWHzl + ")";
    }

    public AWC(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.KWHzl = str5;
    }
}

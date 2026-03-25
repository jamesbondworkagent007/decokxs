package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pKM {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pKM copy$default(pKM pkm, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pkm.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = pkm.KWHzl;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = pkm.copydefault;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = pkm.EZpvd;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = pkm.AEQbTJ;
        }
        return pkm.AEQbTJ(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pKM AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new pKM(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pKM)) {
            return false;
        }
        pKM pkm = (pKM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pkm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pkm.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pkm.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pkm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pkm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UTMParamModel(utmMedium=" + this.OLrzqt + ", utmSource=" + this.KWHzl + ", utmCampaign=" + this.copydefault + ", utmContent=" + this.EZpvd + ", utmTerm=" + this.AEQbTJ + ")";
    }

    public pKM(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.copydefault = str3;
        this.EZpvd = str4;
        this.AEQbTJ = str5;
    }
}

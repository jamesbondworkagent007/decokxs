package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AGJ {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AGJ copy$default(AGJ agj, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = agj.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = agj.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = agj.EZpvd;
        }
        return agj.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGJ copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new AGJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGJ)) {
            return false;
        }
        AGJ agj = (AGJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) agj.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) agj.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) agj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SummaryDetail(summary=" + this.KWHzl + ", translatedSummary=" + this.AEQbTJ + ", updatedTime=" + this.EZpvd + ")";
    }

    public AGJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
    }
}

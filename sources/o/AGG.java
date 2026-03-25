package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AGG {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public AGJ KWHzl;
    public boolean OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AGG copy$default(AGG agg, java.lang.String str, boolean z, java.lang.String str2, AGJ agj, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = agg.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = agg.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = agg.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            agj = agg.KWHzl;
        }
        AGJ agj2 = agj;
        if ((i & 16) != 0) {
            str3 = agg.copydefault;
        }
        return agg.OLrzqt(str, z2, str4, agj2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGJ AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGG OLrzqt(java.lang.String str, boolean z, java.lang.String str2, AGJ agj, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new AGG(str, z, str2, agj, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGG)) {
            return false;
        }
        AGG agg = (AGG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) agg.AEQbTJ) && this.OLrzqt == agg.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) agg.EZpvd) && Intrinsics.EZpvd(this.KWHzl, agg.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) agg.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        AGJ agj = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (agj != null ? agj.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SummaryData(beta=" + this.AEQbTJ + ", isTranslate=" + this.OLrzqt + ", mentionDetail=" + this.EZpvd + ", summaryDetail=" + this.KWHzl + ", taskId=" + this.copydefault + ")";
    }

    public AGG(java.lang.String str, boolean z, java.lang.String str2, AGJ agj, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.OLrzqt = z;
        this.EZpvd = str2;
        this.KWHzl = agj;
        this.copydefault = str3;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BjW {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BjW copy$default(BjW bjW, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bjW.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = bjW.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bjW.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bjW.KWHzl;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = bjW.EZpvd;
        }
        return bjW.AEQbTJ(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BjW AEQbTJ(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new BjW(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
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
        if (!(obj instanceof BjW)) {
            return false;
        }
        BjW bjW = (BjW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) bjW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) bjW.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) bjW.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bjW.KWHzl) && this.EZpvd == bjW.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        java.lang.String str3 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FuturesUnitVo(text=" + this.AEQbTJ + ", ccyType=" + this.OLrzqt + ", ctType=" + this.copydefault + ", sort=" + this.KWHzl + ", isNeedSortByUsd=" + this.EZpvd + ")";
    }

    public BjW(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.KWHzl = str4;
        this.EZpvd = z;
    }
}

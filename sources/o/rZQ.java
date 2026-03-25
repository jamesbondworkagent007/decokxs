package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZQ {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rZQ copy$default(rZQ rzq, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = rzq.valueOf;
        }
        if ((i & 2) != 0) {
            str = rzq.AEQbTJ;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = rzq.KWHzl;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = rzq.AhwBna;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = rzq.OLrzqt;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            z = rzq.EZpvd;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = rzq.copydefault;
        }
        return rzq.copydefault(num, str5, str6, str7, str8, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rZQ copydefault(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new rZQ(num, str, str2, str3, str4, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rZQ)) {
            return false;
        }
        rZQ rzq = (rZQ) obj;
        return Intrinsics.EZpvd(this.valueOf, rzq.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) rzq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) rzq.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) rzq.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) rzq.OLrzqt) && this.EZpvd == rzq.EZpvd && this.copydefault == rzq.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.valueOf;
        int iHashCode = num == null ? 0 : num.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        java.lang.String str = this.AhwBna;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedSettingsItem(msgType=" + this.valueOf + ", categoryName=" + this.AEQbTJ + ", categoryDetail=" + this.KWHzl + ", lightIconLink=" + this.AhwBna + ", darkIconLink=" + this.OLrzqt + ", isSubCategory=" + this.EZpvd + ", isChannelOff=" + this.copydefault + ")";
    }

    public rZQ(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = num;
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.AhwBna = str3;
        this.OLrzqt = str4;
        this.EZpvd = z;
        this.copydefault = z2;
    }
}

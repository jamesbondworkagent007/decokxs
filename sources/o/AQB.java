package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AQB {
    public static final int $stable = 8;
    public int AEQbTJ;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AQB copy$default(AQB aqb, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = aqb.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = aqb.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = aqb.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i2 & 8) != 0) {
            z = aqb.KWHzl;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = aqb.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = aqb.gEmmrt;
        }
        return aqb.OLrzqt(str, str5, str6, z2, i3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AQB OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AQB(str, str2, str3, z, i, str4);
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
        if (!(obj instanceof AQB)) {
            return false;
        }
        AQB aqb = (AQB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) aqb.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) aqb.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) aqb.copydefault) && this.KWHzl == aqb.KWHzl && this.AEQbTJ == aqb.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) aqb.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode5 = java.lang.Integer.hashCode(this.AEQbTJ);
        java.lang.String str2 = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UniversalLinkRequest(originalLink=" + this.EZpvd + ", contentScene=" + this.OLrzqt + ", deeplink=" + this.copydefault + ", attachChannelCode=" + this.KWHzl + ", redirectBehavior=" + this.AEQbTJ + ", utmScene=" + this.gEmmrt + ")";
    }

    public AQB(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.KWHzl = z;
        this.AEQbTJ = i;
        this.gEmmrt = str4;
    }
}

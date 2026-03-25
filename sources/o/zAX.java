package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zAX {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public double OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zAX copy$default(zAX zax, java.lang.String str, java.lang.String str2, java.lang.String str3, double d, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zax.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = zax.AEQbTJ;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = zax.KWHzl;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            d = zax.OLrzqt;
        }
        double d2 = d;
        if ((i & 16) != 0) {
            str4 = zax.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = zax.djBIcL;
        }
        return zax.KWHzl(str, str6, str7, d2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAX KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new zAX(str, str2, str3, d, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
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
        if (!(obj instanceof zAX)) {
            return false;
        }
        zAX zax = (zAX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zax.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zax.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) zax.KWHzl) && java.lang.Double.compare(this.OLrzqt, zax.OLrzqt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zax.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) zax.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Double.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CrossDevicePasskeyInfo(challenge=" + this.EZpvd + ", credentialId=" + this.AEQbTJ + ", deviceName=" + this.KWHzl + ", lastUsedTimestamp=" + this.OLrzqt + ", rpId=" + this.copydefault + ", uid=" + this.djBIcL + ")";
    }

    public zAX(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.OLrzqt = d;
        this.copydefault = str4;
        this.djBIcL = str5;
    }
}

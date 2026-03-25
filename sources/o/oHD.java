package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oHD {
    public final java.lang.String AEQbTJ;
    public int EZpvd;
    public final java.lang.String KWHzl;
    public final oHM OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oHD copy$default(oHD ohd, int i, int i2, java.lang.String str, java.lang.String str2, oHM ohm, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = ohd.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = ohd.copydefault;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = ohd.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = ohd.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i3 & 16) != 0) {
            ohm = ohd.OLrzqt;
        }
        return ohd.copydefault(i, i4, str3, str4, ohm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oHM EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oHD copydefault(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull oHM ohm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(ohm, "");
        return new oHD(i, i2, str, str2, ohm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oHD)) {
            return false;
        }
        oHD ohd = (oHD) obj;
        return this.EZpvd == ohd.EZpvd && this.copydefault == ohd.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ohd.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ohd.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, ohd.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AutoLinkItem(startPoint=" + this.EZpvd + ", endPoint=" + this.copydefault + ", originalText=" + this.KWHzl + ", transformedText=" + this.AEQbTJ + ", mode=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public oHD(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull oHM ohm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(ohm, "");
        this.EZpvd = i;
        this.copydefault = i2;
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.OLrzqt = ohm;
    }
}

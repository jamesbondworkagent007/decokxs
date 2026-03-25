package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fLD {
    public java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final long OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ fLD copy$default(fLD fld, java.lang.String str, int i, long j, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = fld.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = fld.copydefault;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = fld.OLrzqt;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            str2 = fld.AEQbTJ;
        }
        return fld.copydefault(str, i3, j2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final fLD copydefault(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new fLD(str, i, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fLD)) {
            return false;
        }
        fLD fld = (fLD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fld.EZpvd) && this.copydefault == fld.copydefault && this.OLrzqt == fld.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fld.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EscapeAuthenticationAddressData(chainGroupName=" + this.EZpvd + ", chainType=" + this.copydefault + ", chainIndex=" + this.OLrzqt + ", newAddress=" + this.AEQbTJ + ")";
    }

    public fLD(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = i;
        this.OLrzqt = j;
        this.AEQbTJ = str2;
    }
}

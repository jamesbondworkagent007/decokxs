package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zAY {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zAY copy$default(zAY zay, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zay.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = zay.AEQbTJ;
        }
        return zay.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAY copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new zAY(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zAY)) {
            return false;
        }
        zAY zay = (zAY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zay.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zay.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CrossDeviceStartResponse(crossDeviceSessionId=" + this.EZpvd + ", shortlink=" + this.AEQbTJ + ")";
    }

    public zAY(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
    }
}

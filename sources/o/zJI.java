package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zJI {
    public static final int $stable = 8;
    public long AEQbTJ;
    public java.lang.String KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zJI copy$default(zJI zji, int i, java.lang.String str, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = zji.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = zji.KWHzl;
        }
        if ((i2 & 4) != 0) {
            j = zji.AEQbTJ;
        }
        return zji.OLrzqt(i, str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zJI OLrzqt(int i, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new zJI(i, str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zJI)) {
            return false;
        }
        zJI zji = (zJI) obj;
        return this.copydefault == zji.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) zji.KWHzl) && this.AEQbTJ == zji.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewDeviceAuthInfo(authType=" + this.copydefault + ", authName=" + this.KWHzl + ", lastActiveTime=" + this.AEQbTJ + ")";
    }

    public zJI(int i, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = i;
        this.KWHzl = str;
        this.AEQbTJ = j;
    }
}

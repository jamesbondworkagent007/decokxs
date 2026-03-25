package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zKM {
    public static final int $stable = 8;
    public java.lang.String KWHzl;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zKM copy$default(zKM zkm, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zkm.KWHzl;
        }
        if ((i & 2) != 0) {
            j = zkm.copydefault;
        }
        return zkm.copydefault(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zKM copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new zKM(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zKM)) {
            return false;
        }
        zKM zkm = (zKM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) zkm.KWHzl) && this.copydefault == zkm.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewDeviceConfirmInteractorInput(deviceName=" + this.KWHzl + ", lastActiveTime=" + this.copydefault + ")";
    }

    public zKM(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = j;
    }
}

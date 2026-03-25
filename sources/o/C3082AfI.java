package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3082AfI {
    public static final int $stable = 8;
    public java.lang.String EZpvd;
    public long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3082AfI copy$default(C3082AfI c3082AfI, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3082AfI.EZpvd;
        }
        if ((i & 2) != 0) {
            j = c3082AfI.OLrzqt;
        }
        return c3082AfI.EZpvd(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3082AfI EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C3082AfI(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3082AfI)) {
            return false;
        }
        C3082AfI c3082AfI = (C3082AfI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c3082AfI.EZpvd) && this.OLrzqt == c3082AfI.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SyncDeviceInfo(deviceName=" + this.EZpvd + ", lastActiveTime=" + this.OLrzqt + ")";
    }

    public C3082AfI(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = j;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31253lqY {
    public final java.lang.String AEQbTJ;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31253lqY copy$default(C31253lqY c31253lqY, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c31253lqY.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c31253lqY.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c31253lqY.AEQbTJ;
        }
        return c31253lqY.AEQbTJ(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31253lqY AEQbTJ(long j, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new C31253lqY(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31253lqY)) {
            return false;
        }
        C31253lqY c31253lqY = (C31253lqY) obj;
        return this.OLrzqt == c31253lqY.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31253lqY.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31253lqY.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.OLrzqt);
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EmailContact(id=" + this.OLrzqt + ", displayName=" + this.copydefault + ", email=" + this.AEQbTJ + ")";
    }

    public C31253lqY(long j, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = j;
        this.copydefault = str;
        this.AEQbTJ = str2;
    }
}

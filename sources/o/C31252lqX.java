package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31252lqX {
    public final java.lang.String AEQbTJ;
    public final long EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31252lqX copy$default(C31252lqX c31252lqX, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c31252lqX.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c31252lqX.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = c31252lqX.AEQbTJ;
        }
        return c31252lqX.KWHzl(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31252lqX KWHzl(long j, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new C31252lqX(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31252lqX)) {
            return false;
        }
        C31252lqX c31252lqX = (C31252lqX) obj;
        return this.EZpvd == c31252lqX.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31252lqX.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31252lqX.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.EZpvd);
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PhoneContact(id=" + this.EZpvd + ", displayName=" + this.OLrzqt + ", phone=" + this.AEQbTJ + ")";
    }

    public C31252lqX(long j, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }
}

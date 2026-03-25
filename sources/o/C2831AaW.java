package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AaW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2831AaW {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2831AaW copy$default(C2831AaW c2831AaW, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2831AaW.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c2831AaW.AEQbTJ;
        }
        return c2831AaW.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2831AaW KWHzl(java.lang.String str, java.lang.String str2) {
        return new C2831AaW(str, str2);
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
        if (!(obj instanceof C2831AaW)) {
            return false;
        }
        C2831AaW c2831AaW = (C2831AaW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2831AaW.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2831AaW.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReferralInfo(channelId=" + this.copydefault + ", channelFlag=" + this.AEQbTJ + ")";
    }

    public C2831AaW(java.lang.String str, java.lang.String str2) {
        this.copydefault = str;
        this.AEQbTJ = str2;
    }
}

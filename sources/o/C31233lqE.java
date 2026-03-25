package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.lqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31233lqE {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31233lqE copy$default(C31233lqE c31233lqE, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31233lqE.copydefault;
        }
        return c31233lqE.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31233lqE KWHzl(java.lang.String str) {
        return new C31233lqE(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31233lqE) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C31233lqE) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserKycInfo(maskedName=" + this.copydefault + ")";
    }

    public C31233lqE(java.lang.String str) {
        this.copydefault = str;
    }
}

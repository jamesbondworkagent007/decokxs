package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58508zEz {
    public static final int $stable = 8;
    public C2829AaU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58508zEz copy$default(C58508zEz c58508zEz, C2829AaU c2829AaU, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2829AaU = c58508zEz.copydefault;
        }
        return c58508zEz.copydefault(c2829AaU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2829AaU KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58508zEz copydefault(C2829AaU c2829AaU) {
        return new C58508zEz(c2829AaU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58508zEz) && Intrinsics.EZpvd(this.copydefault, ((C58508zEz) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C2829AaU c2829AaU = this.copydefault;
        if (c2829AaU == null) {
            return 0;
        }
        return c2829AaU.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginWithPasskeyStartResponse(publicKey=" + this.copydefault + ")";
    }

    public C58508zEz(C2829AaU c2829AaU) {
        this.copydefault = c2829AaU;
    }
}

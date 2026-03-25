package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2783AZb {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2783AZb copy$default(C2783AZb c2783AZb, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2783AZb.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c2783AZb.EZpvd;
        }
        return c2783AZb.KWHzl(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2783AZb KWHzl(java.lang.String str, boolean z) {
        return new C2783AZb(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783AZb)) {
            return false;
        }
        C2783AZb c2783AZb = (C2783AZb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2783AZb.AEQbTJ) && this.EZpvd == c2783AZb.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EncryptConfig(key=" + this.AEQbTJ + ", ignoreExtraBodyParam=" + this.EZpvd + ")";
    }

    public C2783AZb(java.lang.String str, boolean z) {
        this.AEQbTJ = str;
        this.EZpvd = z;
    }
}

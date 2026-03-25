package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Bck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4393Bck {
    public static final int $stable = 8;
    public C4396Bcn EZpvd;
    public C2783AZb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4393Bck copy$default(C4393Bck c4393Bck, C4396Bcn c4396Bcn, C2783AZb c2783AZb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c4396Bcn = c4393Bck.EZpvd;
        }
        if ((i & 2) != 0) {
            c2783AZb = c4393Bck.copydefault;
        }
        return c4393Bck.AEQbTJ(c4396Bcn, c2783AZb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4393Bck AEQbTJ(C4396Bcn c4396Bcn, C2783AZb c2783AZb) {
        return new C4393Bck(c4396Bcn, c2783AZb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4396Bcn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2783AZb OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4393Bck)) {
            return false;
        }
        C4393Bck c4393Bck = (C4393Bck) obj;
        return Intrinsics.EZpvd(this.EZpvd, c4393Bck.EZpvd) && Intrinsics.EZpvd(this.copydefault, c4393Bck.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C4396Bcn c4396Bcn = this.EZpvd;
        int iHashCode = c4396Bcn == null ? 0 : c4396Bcn.hashCode();
        C2783AZb c2783AZb = this.copydefault;
        return (iHashCode * 31) + (c2783AZb != null ? c2783AZb.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityConfig(sign=" + this.EZpvd + ", encrypt=" + this.copydefault + ")";
    }

    public C4393Bck(C4396Bcn c4396Bcn, C2783AZb c2783AZb) {
        this.EZpvd = c4396Bcn;
        this.copydefault = c2783AZb;
    }
}

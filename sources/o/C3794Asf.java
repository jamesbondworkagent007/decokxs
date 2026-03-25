package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Asf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3794Asf {
    public static final int $stable = 8;
    public C3810Asv EZpvd;
    public C3810Asv KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3794Asf copy$default(C3794Asf c3794Asf, C3810Asv c3810Asv, C3810Asv c3810Asv2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3810Asv = c3794Asf.KWHzl;
        }
        if ((i & 2) != 0) {
            c3810Asv2 = c3794Asf.EZpvd;
        }
        return c3794Asf.KWHzl(c3810Asv, c3810Asv2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3794Asf KWHzl(@NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        return new C3794Asf(c3810Asv, c3810Asv2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3794Asf)) {
            return false;
        }
        C3794Asf c3794Asf = (C3794Asf) obj;
        return Intrinsics.EZpvd(this.KWHzl, c3794Asf.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c3794Asf.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexTradeLimitInfo(remainingDailyLimit=" + this.KWHzl + ", maxDailyLimit=" + this.EZpvd + ")";
    }

    public C3794Asf(@NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        this.KWHzl = c3810Asv;
        this.EZpvd = c3810Asv2;
    }
}

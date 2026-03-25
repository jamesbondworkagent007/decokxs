package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3092AfS {
    public static final int $stable = 8;
    public zAW KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3092AfS copy$default(C3092AfS c3092AfS, zAW zaw, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zaw = c3092AfS.KWHzl;
        }
        return c3092AfS.KWHzl(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3092AfS KWHzl(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        return new C3092AfS(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAW KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3092AfS) && Intrinsics.EZpvd(this.KWHzl, ((C3092AfS) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrustedDeviceJourneyInput(newDeviceInfo=" + this.KWHzl + ")";
    }

    public C3092AfS(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        this.KWHzl = zaw;
    }
}

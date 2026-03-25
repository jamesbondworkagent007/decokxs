package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.BaI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4259BaI {
    public static final int $stable = 8;
    public AbstractC4260BaJ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4259BaI copy$default(C4259BaI c4259BaI, AbstractC4260BaJ abstractC4260BaJ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC4260BaJ = c4259BaI.KWHzl;
        }
        return c4259BaI.KWHzl(abstractC4260BaJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC4260BaJ AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4259BaI KWHzl(@NotNull AbstractC4260BaJ abstractC4260BaJ) {
        Intrinsics.checkNotNullParameter(abstractC4260BaJ, "");
        return new C4259BaI(abstractC4260BaJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4259BaI) && Intrinsics.EZpvd(this.KWHzl, ((C4259BaI) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NetworkState(networkType=" + this.KWHzl + ")";
    }

    public C4259BaI(@NotNull AbstractC4260BaJ abstractC4260BaJ) {
        Intrinsics.checkNotNullParameter(abstractC4260BaJ, "");
        this.KWHzl = abstractC4260BaJ;
    }
}

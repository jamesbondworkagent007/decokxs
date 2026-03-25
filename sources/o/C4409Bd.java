package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4409Bd {
    public final DT AEQbTJ;
    public final CoroutineContext EZpvd;
    public final AK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4409Bd copy$default(C4409Bd c4409Bd, DT dt, CoroutineContext coroutineContext, AK ak, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dt = c4409Bd.AEQbTJ;
        }
        if ((i & 2) != 0) {
            coroutineContext = c4409Bd.EZpvd;
        }
        if ((i & 4) != 0) {
            ak = c4409Bd.OLrzqt;
        }
        return c4409Bd.OLrzqt(dt, coroutineContext, ak);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AK AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineContext EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4409Bd OLrzqt(@NotNull DT dt, @NotNull CoroutineContext coroutineContext, @NotNull AK ak) {
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(ak, "");
        return new C4409Bd(dt, coroutineContext, ak);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DT copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4409Bd)) {
            return false;
        }
        C4409Bd c4409Bd = (C4409Bd) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c4409Bd.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c4409Bd.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c4409Bd.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SdkRequestTag(execContext=" + this.AEQbTJ + ", callContext=" + this.EZpvd + ", metrics=" + this.OLrzqt + ')';
    }

    public C4409Bd(@NotNull DT dt, @NotNull CoroutineContext coroutineContext, @NotNull AK ak) {
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(ak, "");
        this.AEQbTJ = dt;
        this.EZpvd = coroutineContext;
        this.OLrzqt = ak;
    }
}

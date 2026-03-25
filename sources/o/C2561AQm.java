package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2561AQm {
    public static final int $stable = 8;
    public APL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2561AQm copy$default(C2561AQm c2561AQm, APL apl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            apl = c2561AQm.KWHzl;
        }
        return c2561AQm.AEQbTJ(apl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APL AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2561AQm AEQbTJ(@NotNull APL apl) {
        Intrinsics.checkNotNullParameter(apl, "");
        return new C2561AQm(apl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2561AQm) && Intrinsics.EZpvd(this.KWHzl, ((C2561AQm) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TextShareParams(common=" + this.KWHzl + ")";
    }

    public C2561AQm(@NotNull APL apl) {
        Intrinsics.checkNotNullParameter(apl, "");
        this.KWHzl = apl;
    }
}

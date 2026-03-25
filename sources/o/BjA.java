package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BjA {
    public static final int $stable = 8;
    public BlE KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BjA copy$default(BjA bjA, BlE blE, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            blE = bjA.KWHzl;
        }
        return bjA.OLrzqt(blE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BjA OLrzqt(@NotNull BlE blE) {
        Intrinsics.checkNotNullParameter(blE, "");
        return new BjA(blE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlE copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BjA) && Intrinsics.EZpvd(this.KWHzl, ((BjA) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CategoryGroupVo(rawCategoryGroupData=" + this.KWHzl + ")";
    }

    public BjA(@NotNull BlE blE) {
        Intrinsics.checkNotNullParameter(blE, "");
        this.KWHzl = blE;
    }
}

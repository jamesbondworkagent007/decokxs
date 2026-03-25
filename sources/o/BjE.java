package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BjE {
    public static final int $stable = 8;
    public BjB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BjE copy$default(BjE bjE, BjB bjB, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bjB = bjE.copydefault;
        }
        return bjE.AEQbTJ(bjB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BjE AEQbTJ(@NotNull BjB bjB) {
        Intrinsics.checkNotNullParameter(bjB, "");
        return new BjE(bjB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BjB OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BjE) && Intrinsics.EZpvd(this.copydefault, ((BjE) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChargeGroupVo(rawChargeGroupData=" + this.copydefault + ")";
    }

    public BjE(@NotNull BjB bjB) {
        Intrinsics.checkNotNullParameter(bjB, "");
        this.copydefault = bjB;
    }
}

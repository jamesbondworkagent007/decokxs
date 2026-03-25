package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ApG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3610ApG {
    public static final int $stable = 8;
    public C3807Ass AEQbTJ;
    public C3807Ass OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3610ApG copy$default(C3610ApG c3610ApG, C3807Ass c3807Ass, C3807Ass c3807Ass2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3807Ass = c3610ApG.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c3807Ass2 = c3610ApG.OLrzqt;
        }
        return c3610ApG.copydefault(c3807Ass, c3807Ass2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3807Ass AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3807Ass EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3610ApG copydefault(@NotNull C3807Ass c3807Ass, @NotNull C3807Ass c3807Ass2) {
        Intrinsics.checkNotNullParameter(c3807Ass, "");
        Intrinsics.checkNotNullParameter(c3807Ass2, "");
        return new C3610ApG(c3807Ass, c3807Ass2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3610ApG)) {
            return false;
        }
        C3610ApG c3610ApG = (C3610ApG) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c3610ApG.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c3610ApG.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuyInputRanges(currentLimit=" + this.AEQbTJ + ", fiatTradeRange=" + this.OLrzqt + ")";
    }

    public C3610ApG(@NotNull C3807Ass c3807Ass, @NotNull C3807Ass c3807Ass2) {
        Intrinsics.checkNotNullParameter(c3807Ass, "");
        Intrinsics.checkNotNullParameter(c3807Ass2, "");
        this.AEQbTJ = c3807Ass;
        this.OLrzqt = c3807Ass2;
    }
}

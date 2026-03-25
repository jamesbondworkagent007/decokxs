package o;

import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24694iif {
    public final int AEQbTJ;
    public final DexSwapLiquiditySource KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24694iif copy$default(C24694iif c24694iif, int i, DexSwapLiquiditySource dexSwapLiquiditySource, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c24694iif.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            dexSwapLiquiditySource = c24694iif.KWHzl;
        }
        return c24694iif.EZpvd(i, dexSwapLiquiditySource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24694iif EZpvd(int i, @NotNull DexSwapLiquiditySource dexSwapLiquiditySource) {
        Intrinsics.checkNotNullParameter(dexSwapLiquiditySource, "");
        return new C24694iif(i, dexSwapLiquiditySource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSwapLiquiditySource OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24694iif)) {
            return false;
        }
        C24694iif c24694iif = (C24694iif) obj;
        return this.AEQbTJ == c24694iif.AEQbTJ && this.KWHzl == c24694iif.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LiquidityPoolsDetails(selectedPoolsCount=" + this.AEQbTJ + ", liquiditySource=" + this.KWHzl + ")";
    }

    public C24694iif(int i, @NotNull DexSwapLiquiditySource dexSwapLiquiditySource) {
        Intrinsics.checkNotNullParameter(dexSwapLiquiditySource, "");
        this.AEQbTJ = i;
        this.KWHzl = dexSwapLiquiditySource;
    }
}

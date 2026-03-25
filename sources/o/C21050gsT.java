package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21050gsT {
    public final java.util.List<C10854bwM> AEQbTJ;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C21050gsT() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gsT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C21050gsT copy$default(C21050gsT c21050gsT, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c21050gsT.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c21050gsT.AEQbTJ;
        }
        return c21050gsT.OLrzqt(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10854bwM> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21050gsT OLrzqt(boolean z, @NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C21050gsT(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21050gsT)) {
            return false;
        }
        C21050gsT c21050gsT = (C21050gsT) obj;
        return this.KWHzl == c21050gsT.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c21050gsT.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SmartWalletChainInfoViewState(isAaWallet=" + this.KWHzl + ", aaWalletCoins=" + this.AEQbTJ + ")";
    }

    public C21050gsT(boolean z, @NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = z;
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:43)) : (r2v0 java.util.List))
 A[MD:(boolean, java.util.List<o.bwM>):void (m)] (LINE:41) call: o.gsT.<init>(boolean, java.util.List):void type: THIS */
    public /* synthetic */ C21050gsT(boolean z, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list);
    }

    public final int AEQbTJ() {
        return this.AEQbTJ.size();
    }
}

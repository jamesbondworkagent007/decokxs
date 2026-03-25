package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26088jRm {
    public final java.util.List<LiquidityPoolPairUIItem> AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26088jRm() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jRm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26088jRm copy$default(C26088jRm c26088jRm, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c26088jRm.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c26088jRm.KWHzl;
        }
        if ((i & 4) != 0) {
            list = c26088jRm.AEQbTJ;
        }
        return c26088jRm.AEQbTJ(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26088jRm AEQbTJ(boolean z, boolean z2, java.util.List<LiquidityPoolPairUIItem> list) {
        return new C26088jRm(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LiquidityPoolPairUIItem> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26088jRm)) {
            return false;
        }
        C26088jRm c26088jRm = (C26088jRm) obj;
        return this.EZpvd == c26088jRm.EZpvd && this.KWHzl == c26088jRm.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c26088jRm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.util.List<LiquidityPoolPairUIItem> list = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LiquidityPoolUiState(loading=" + this.EZpvd + ", error=" + this.KWHzl + ", data=" + this.AEQbTJ + ")";
    }

    public C26088jRm(boolean z, boolean z2, java.util.List<LiquidityPoolPairUIItem> list) {
        this.EZpvd = z;
        this.KWHzl = z2;
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(boolean, boolean, java.util.List<com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem>):void (m)] (LINE:13) call: o.jRm.<init>(boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C26088jRm(boolean z, boolean z2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : list);
    }
}

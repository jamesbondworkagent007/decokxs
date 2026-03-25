package o;

import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27721kAx {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final TraderPnLFilter OLrzqt;
    public final C26211jWa copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27721kAx() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27721kAx copy$default(C27721kAx c27721kAx, C26211jWa c26211jWa, TraderPnLFilter traderPnLFilter, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c26211jWa = c27721kAx.copydefault;
        }
        if ((i & 2) != 0) {
            traderPnLFilter = c27721kAx.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = c27721kAx.AEQbTJ;
        }
        if ((i & 8) != 0) {
            z = c27721kAx.EZpvd;
        }
        return c27721kAx.copydefault(c26211jWa, traderPnLFilter, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraderPnLFilter AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26211jWa KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27721kAx copydefault(@NotNull C26211jWa c26211jWa, @NotNull TraderPnLFilter traderPnLFilter, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C27721kAx(c26211jWa, traderPnLFilter, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27721kAx)) {
            return false;
        }
        C27721kAx c27721kAx = (C27721kAx) obj;
        return Intrinsics.EZpvd(this.copydefault, c27721kAx.copydefault) && this.OLrzqt == c27721kAx.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27721kAx.AEQbTJ) && this.EZpvd == c27721kAx.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradersFilter(labelFilter=" + this.copydefault + ", pnlFilter=" + this.OLrzqt + ", addressFilter=" + this.AEQbTJ + ", pnlDescending=" + this.EZpvd + ")";
    }

    public C27721kAx(@NotNull C26211jWa c26211jWa, @NotNull TraderPnLFilter traderPnLFilter, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = c26211jWa;
        this.OLrzqt = traderPnLFilter;
        this.AEQbTJ = str;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:o.jWa:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.jWa:0x000c: CONSTRUCTOR (0 int), (null java.lang.String), (null java.lang.String), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: o.jWa.<init>(int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.jWa))
  (wrap:com.okinc.business.market.features.trader.ui.model.TraderPnLFilter:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.trader.ui.model.TraderPnLFilter:0x0013: SGET  A[WRAPPED] (LINE:11) com.okinc.business.market.features.trader.ui.model.TraderPnLFilter.TOTAL com.okinc.business.market.features.trader.ui.model.TraderPnLFilter) : (r8v0 com.okinc.business.market.features.trader.ui.model.TraderPnLFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
 A[MD:(o.jWa, com.okinc.business.market.features.trader.ui.model.TraderPnLFilter, java.lang.String, boolean):void (m)] (LINE:9) call: o.kAx.<init>(o.jWa, com.okinc.business.market.features.trader.ui.model.TraderPnLFilter, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C27721kAx(C26211jWa c26211jWa, TraderPnLFilter traderPnLFilter, java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C26211jWa(0, null, null, 7, null) : c26211jWa, (i & 2) != 0 ? TraderPnLFilter.TOTAL : traderPnLFilter, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? true : z);
    }
}

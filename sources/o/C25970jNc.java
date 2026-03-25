package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25970jNc extends AbstractC49408unw<C25970jNc> {
    public java.util.List<PnlDetailVo.PnlListItem> AEQbTJ;
    public PnlDetailListSortType OLrzqt;
    public java.util.List<PnlDetailVo.PnlListItem> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25970jNc() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jNc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25970jNc copy$default(C25970jNc c25970jNc, PnlDetailListSortType pnlDetailListSortType, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pnlDetailListSortType = c25970jNc.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c25970jNc.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list2 = c25970jNc.copydefault;
        }
        return c25970jNc.OLrzqt(pnlDetailListSortType, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.util.List<PnlDetailVo.PnlListItem> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PnlDetailVo.PnlListItem> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.List<PnlDetailVo.PnlListItem> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PnlDetailVo.PnlListItem> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull PnlDetailListSortType pnlDetailListSortType) {
        Intrinsics.checkNotNullParameter(pnlDetailListSortType, "");
        this.OLrzqt = pnlDetailListSortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25970jNc OLrzqt(@NotNull PnlDetailListSortType pnlDetailListSortType, java.util.List<PnlDetailVo.PnlListItem> list, java.util.List<PnlDetailVo.PnlListItem> list2) {
        Intrinsics.checkNotNullParameter(pnlDetailListSortType, "");
        return new C25970jNc(pnlDetailListSortType, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnlDetailListSortType copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25970jNc)) {
            return false;
        }
        C25970jNc c25970jNc = (C25970jNc) obj;
        return this.OLrzqt == c25970jNc.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c25970jNc.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c25970jNc.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.util.List<PnlDetailVo.PnlListItem> list = this.AEQbTJ;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<PnlDetailVo.PnlListItem> list2 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SpotAnalysisPnlDetailItemUiState(pnlDetailListSortType=" + this.OLrzqt + ", pnlList=" + this.AEQbTJ + ", originPnlList=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType:0x0004: SGET  A[WRAPPED] (LINE:7) com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType.NONE com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType) : (r2v0 com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType, java.util.List<com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo$PnlListItem>, java.util.List<com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo$PnlListItem>):void (m)] (LINE:6) call: o.jNc.<init>(com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C25970jNc(PnlDetailListSortType pnlDetailListSortType, java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PnlDetailListSortType.NONE : pnlDetailListSortType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25970jNc(@NotNull PnlDetailListSortType pnlDetailListSortType, java.util.List<PnlDetailVo.PnlListItem> list, java.util.List<PnlDetailVo.PnlListItem> list2) {
        super(new Function1() { // from class: o.jNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25970jNc.KWHzl((C25970jNc) obj);
            }
        });
        Intrinsics.checkNotNullParameter(pnlDetailListSortType, "");
        this.OLrzqt = pnlDetailListSortType;
        this.AEQbTJ = list;
        this.copydefault = list2;
    }

    public static final C25970jNc KWHzl(C25970jNc c25970jNc) {
        Intrinsics.checkNotNullParameter(c25970jNc, "");
        return copy$default(c25970jNc, null, null, null, 7, null);
    }
}

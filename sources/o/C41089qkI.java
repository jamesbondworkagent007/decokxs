package o;

import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41089qkI {
    public final MarketDiscoverFlowPo.MinimizedFlowPo AEQbTJ;
    public final MarketDiscoverFlowPo.ExpandedFlowPo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41089qkI() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41089qkI copy$default(C41089qkI c41089qkI, MarketDiscoverFlowPo.MinimizedFlowPo minimizedFlowPo, MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            minimizedFlowPo = c41089qkI.AEQbTJ;
        }
        if ((i & 2) != 0) {
            expandedFlowPo = c41089qkI.copydefault;
        }
        return c41089qkI.OLrzqt(minimizedFlowPo, expandedFlowPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDiscoverFlowPo.MinimizedFlowPo OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41089qkI OLrzqt(MarketDiscoverFlowPo.MinimizedFlowPo minimizedFlowPo, MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo) {
        return new C41089qkI(minimizedFlowPo, expandedFlowPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDiscoverFlowPo.ExpandedFlowPo copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41089qkI)) {
            return false;
        }
        C41089qkI c41089qkI = (C41089qkI) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c41089qkI.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c41089qkI.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MarketDiscoverFlowPo.MinimizedFlowPo minimizedFlowPo = this.AEQbTJ;
        int iHashCode = minimizedFlowPo == null ? 0 : minimizedFlowPo.hashCode();
        MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo = this.copydefault;
        return (iHashCode * 31) + (expandedFlowPo != null ? expandedFlowPo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverFlowVo(minimizedVo=" + this.AEQbTJ + ", expandedVo=" + this.copydefault + ")";
    }

    public C41089qkI(MarketDiscoverFlowPo.MinimizedFlowPo minimizedFlowPo, MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo) {
        this.AEQbTJ = minimizedFlowPo;
        this.copydefault = expandedFlowPo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$MinimizedFlowPo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$MinimizedFlowPo) : (r2v0 com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$MinimizedFlowPo))
  (wrap:com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$ExpandedFlowPo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$ExpandedFlowPo) : (r3v0 com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$ExpandedFlowPo))
 A[MD:(com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$MinimizedFlowPo, com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$ExpandedFlowPo):void (m)] (LINE:5) call: o.qkI.<init>(com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$MinimizedFlowPo, com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo$ExpandedFlowPo):void type: THIS */
    public /* synthetic */ C41089qkI(MarketDiscoverFlowPo.MinimizedFlowPo minimizedFlowPo, MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : minimizedFlowPo, (i & 2) != 0 ? null : expandedFlowPo);
    }
}

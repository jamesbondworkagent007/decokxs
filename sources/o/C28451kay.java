package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28451kay {
    public final boolean AEQbTJ;
    public final HomeChainFilterUiModel EZpvd;
    public final TimeIntervalType KWHzl;
    public final java.util.List<MarketChainBean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28451kay() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kay */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28451kay copy$default(C28451kay c28451kay, HomeChainFilterUiModel homeChainFilterUiModel, TimeIntervalType timeIntervalType, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            homeChainFilterUiModel = c28451kay.EZpvd;
        }
        if ((i & 2) != 0) {
            timeIntervalType = c28451kay.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c28451kay.AEQbTJ;
        }
        if ((i & 8) != 0) {
            list = c28451kay.copydefault;
        }
        return c28451kay.copydefault(homeChainFilterUiModel, timeIntervalType, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeChainFilterUiModel AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<MarketChainBean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28451kay copydefault(@NotNull HomeChainFilterUiModel homeChainFilterUiModel, TimeIntervalType timeIntervalType, boolean z, @NotNull java.util.List<MarketChainBean> list) {
        Intrinsics.checkNotNullParameter(homeChainFilterUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C28451kay(homeChainFilterUiModel, timeIntervalType, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28451kay)) {
            return false;
        }
        C28451kay c28451kay = (C28451kay) obj;
        return Intrinsics.EZpvd(this.EZpvd, c28451kay.EZpvd) && this.KWHzl == c28451kay.KWHzl && this.AEQbTJ == c28451kay.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c28451kay.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        TimeIntervalType timeIntervalType = this.KWHzl;
        return (((((iHashCode * 31) + (timeIntervalType == null ? 0 : timeIntervalType.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeSharedFilter(selectedChain=" + this.EZpvd + ", selectedInterval=" + this.KWHzl + ", isDefaultInterval=" + this.AEQbTJ + ", popularChains=" + this.copydefault + ")";
    }

    public C28451kay(@NotNull HomeChainFilterUiModel homeChainFilterUiModel, TimeIntervalType timeIntervalType, boolean z, @NotNull java.util.List<MarketChainBean> list) {
        Intrinsics.checkNotNullParameter(homeChainFilterUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = homeChainFilterUiModel;
        this.KWHzl = timeIntervalType;
        this.AEQbTJ = z;
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel:0x000d: CONSTRUCTOR ("all"), (null java.lang.String), (null java.lang.String), (6 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.TimeIntervalType) : (r8v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r10v0 java.util.List))
 A[MD:(com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List<com.okinc.business.dexlogic.main.market.chain.MarketChainBean>):void (m)] (LINE:8) call: o.kay.<init>(com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C28451kay(HomeChainFilterUiModel homeChainFilterUiModel, TimeIntervalType timeIntervalType, boolean z, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HomeChainFilterUiModel("all", null, null, 6, null) : homeChainFilterUiModel, (i & 2) != 0 ? null : timeIntervalType, (i & 4) != 0 ? true : z, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}

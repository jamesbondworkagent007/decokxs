package com.okinc.business.dexui.main.swap.route.dag.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RouteNodeMeta {
    public static final int $stable = 8;
    private final String logoUrl;
    private final List<PoolInfo> pools;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteNodeMeta copy$default(RouteNodeMeta routeNodeMeta, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = routeNodeMeta.symbol;
        }
        if ((i & 2) != 0) {
            str2 = routeNodeMeta.logoUrl;
        }
        if ((i & 4) != 0) {
            list = routeNodeMeta.pools;
        }
        return routeNodeMeta.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PoolInfo> component3() {
        return this.pools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta copy(@NotNull String str, @NotNull String str2, @NotNull List<PoolInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RouteNodeMeta(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNodeMeta)) {
            return false;
        }
        RouteNodeMeta routeNodeMeta = (RouteNodeMeta) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) routeNodeMeta.symbol) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) routeNodeMeta.logoUrl) && Intrinsics.EZpvd(this.pools, routeNodeMeta.pools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PoolInfo> getPools() {
        return this.pools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.symbol.hashCode() * 31) + this.logoUrl.hashCode()) * 31) + this.pools.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteNodeMeta(symbol=" + this.symbol + ", logoUrl=" + this.logoUrl + ", pools=" + this.pools + ")";
    }

    public RouteNodeMeta(@NotNull String str, @NotNull String str2, @NotNull List<PoolInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.symbol = str;
        this.logoUrl = str2;
        this.pools = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:60)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo>):void (m)] (LINE:57) call: com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ RouteNodeMeta(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}

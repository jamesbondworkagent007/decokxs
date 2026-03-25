package com.okinc.business.dex.api.bean.sa_small_assets;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DexRouter {
    public static final int $stable = 8;
    private final List<SubRouter> subRouterList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexRouter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.api.bean.sa_small_assets.DexRouter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexRouter copy$default(DexRouter dexRouter, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexRouter.subRouterList;
        }
        return dexRouter.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubRouter> component1() {
        return this.subRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRouter copy(@NotNull List<SubRouter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DexRouter(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DexRouter) && Intrinsics.EZpvd(this.subRouterList, ((DexRouter) obj).subRouterList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubRouter> getSubRouterList() {
        return this.subRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.subRouterList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRouter(subRouterList=" + this.subRouterList + ")";
    }

    public DexRouter(@NotNull List<SubRouter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.subRouterList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:65)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dex.api.bean.sa_small_assets.SubRouter>):void (m)] (LINE:64) call: com.okinc.business.dex.api.bean.sa_small_assets.DexRouter.<init>(java.util.List):void type: THIS */
    public /* synthetic */ DexRouter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}

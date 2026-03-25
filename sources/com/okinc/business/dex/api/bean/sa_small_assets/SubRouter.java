package com.okinc.business.dex.api.bean.sa_small_assets;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SubRouter {
    public static final int $stable = 8;
    private final List<DexQuoteInfo> dexQuoteInfoList;
    private final SimpleTokenInfo fromToken;
    private final SimpleTokenInfo toToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubRouter() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.api.bean.sa_small_assets.SubRouter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubRouter copy$default(SubRouter subRouter, SimpleTokenInfo simpleTokenInfo, SimpleTokenInfo simpleTokenInfo2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleTokenInfo = subRouter.fromToken;
        }
        if ((i & 2) != 0) {
            simpleTokenInfo2 = subRouter.toToken;
        }
        if ((i & 4) != 0) {
            list = subRouter.dexQuoteInfoList;
        }
        return subRouter.copy(simpleTokenInfo, simpleTokenInfo2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTokenInfo component1() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTokenInfo component2() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexQuoteInfo> component3() {
        return this.dexQuoteInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubRouter copy(@NotNull SimpleTokenInfo simpleTokenInfo, @NotNull SimpleTokenInfo simpleTokenInfo2, @NotNull List<DexQuoteInfo> list) {
        Intrinsics.checkNotNullParameter(simpleTokenInfo, "");
        Intrinsics.checkNotNullParameter(simpleTokenInfo2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SubRouter(simpleTokenInfo, simpleTokenInfo2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubRouter)) {
            return false;
        }
        SubRouter subRouter = (SubRouter) obj;
        return Intrinsics.EZpvd(this.fromToken, subRouter.fromToken) && Intrinsics.EZpvd(this.toToken, subRouter.toToken) && Intrinsics.EZpvd(this.dexQuoteInfoList, subRouter.dexQuoteInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexQuoteInfo> getDexQuoteInfoList() {
        return this.dexQuoteInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fromToken.hashCode() * 31) + this.toToken.hashCode()) * 31) + this.dexQuoteInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubRouter(fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", dexQuoteInfoList=" + this.dexQuoteInfoList + ")";
    }

    public SubRouter(@NotNull SimpleTokenInfo simpleTokenInfo, @NotNull SimpleTokenInfo simpleTokenInfo2, @NotNull List<DexQuoteInfo> list) {
        Intrinsics.checkNotNullParameter(simpleTokenInfo, "");
        Intrinsics.checkNotNullParameter(simpleTokenInfo2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.fromToken = simpleTokenInfo;
        this.toToken = simpleTokenInfo2;
        this.dexQuoteInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo:0x000c: CONSTRUCTOR (null java.lang.String), (null java.lang.String), (0 int), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:70) call: com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo))
  (wrap:com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo:0x001b: CONSTRUCTOR (null java.lang.String), (null java.lang.String), (0 int), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:71) call: com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0022: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r9v0 java.util.List))
 A[MD:(com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo, com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo, java.util.List<com.okinc.business.dex.api.bean.sa_small_assets.DexQuoteInfo>):void (m)] (LINE:69) call: com.okinc.business.dex.api.bean.sa_small_assets.SubRouter.<init>(com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo, com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo, java.util.List):void type: THIS */
    public /* synthetic */ SubRouter(SimpleTokenInfo simpleTokenInfo, SimpleTokenInfo simpleTokenInfo2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SimpleTokenInfo(null, null, 0, 7, null) : simpleTokenInfo, (i & 2) != 0 ? new SimpleTokenInfo(null, null, 0, 7, null) : simpleTokenInfo2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}

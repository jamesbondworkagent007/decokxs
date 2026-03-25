package com.okinc.business.dexlogic.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SwapOrderInfoReq {
    public static final int $stable = 8;
    private final List<UpdateMultiOrderInfo> broadcastOrderInfos;
    private final DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam;
    private final Object traceData;
    private final UpdateMultiOrderInfo updateMultiOrderInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapOrderInfoReq() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.SwapOrderInfoReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwapOrderInfoReq copy$default(SwapOrderInfoReq swapOrderInfoReq, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, UpdateMultiOrderInfo updateMultiOrderInfo, List list, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            defiMultiSwapOrderInfoReq = swapOrderInfoReq.dexMultiMetaSaveOrderParam;
        }
        if ((i & 2) != 0) {
            updateMultiOrderInfo = swapOrderInfoReq.updateMultiOrderInfo;
        }
        if ((i & 4) != 0) {
            list = swapOrderInfoReq.broadcastOrderInfos;
        }
        if ((i & 8) != 0) {
            obj = swapOrderInfoReq.traceData;
        }
        return swapOrderInfoReq.copy(defiMultiSwapOrderInfoReq, updateMultiOrderInfo, list, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiMultiSwapOrderInfoReq component1() {
        return this.dexMultiMetaSaveOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateMultiOrderInfo component2() {
        return this.updateMultiOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UpdateMultiOrderInfo> component3() {
        return this.broadcastOrderInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapOrderInfoReq copy(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, UpdateMultiOrderInfo updateMultiOrderInfo, List<UpdateMultiOrderInfo> list, Object obj) {
        return new SwapOrderInfoReq(defiMultiSwapOrderInfoReq, updateMultiOrderInfo, list, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwapOrderInfoReq)) {
            return false;
        }
        SwapOrderInfoReq swapOrderInfoReq = (SwapOrderInfoReq) obj;
        return Intrinsics.EZpvd(this.dexMultiMetaSaveOrderParam, swapOrderInfoReq.dexMultiMetaSaveOrderParam) && Intrinsics.EZpvd(this.updateMultiOrderInfo, swapOrderInfoReq.updateMultiOrderInfo) && Intrinsics.EZpvd(this.broadcastOrderInfos, swapOrderInfoReq.broadcastOrderInfos) && Intrinsics.EZpvd(this.traceData, swapOrderInfoReq.traceData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UpdateMultiOrderInfo> getBroadcastOrderInfos() {
        return this.broadcastOrderInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiMultiSwapOrderInfoReq getDexMultiMetaSaveOrderParam() {
        return this.dexMultiMetaSaveOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateMultiOrderInfo getUpdateMultiOrderInfo() {
        return this.updateMultiOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq = this.dexMultiMetaSaveOrderParam;
        int iHashCode = defiMultiSwapOrderInfoReq == null ? 0 : defiMultiSwapOrderInfoReq.hashCode();
        UpdateMultiOrderInfo updateMultiOrderInfo = this.updateMultiOrderInfo;
        int iHashCode2 = updateMultiOrderInfo == null ? 0 : updateMultiOrderInfo.hashCode();
        List<UpdateMultiOrderInfo> list = this.broadcastOrderInfos;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Object obj = this.traceData;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapOrderInfoReq(dexMultiMetaSaveOrderParam=" + this.dexMultiMetaSaveOrderParam + ", updateMultiOrderInfo=" + this.updateMultiOrderInfo + ", broadcastOrderInfos=" + this.broadcastOrderInfos + ", traceData=" + this.traceData + ")";
    }

    public SwapOrderInfoReq(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, UpdateMultiOrderInfo updateMultiOrderInfo, List<UpdateMultiOrderInfo> list, Object obj) {
        this.dexMultiMetaSaveOrderParam = defiMultiSwapOrderInfoReq;
        this.updateMultiOrderInfo = updateMultiOrderInfo;
        this.broadcastOrderInfos = list;
        this.traceData = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq) : (r2v0 com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq))
  (wrap:com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo) : (r3v0 com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r5v0 java.lang.Object))
 A[MD:(com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq, com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo, java.util.List<com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo>, java.lang.Object):void (m)] (LINE:2309) call: com.okinc.business.dexlogic.bean.SwapOrderInfoReq.<init>(com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq, com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo, java.util.List, java.lang.Object):void type: THIS */
    public /* synthetic */ SwapOrderInfoReq(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, UpdateMultiOrderInfo updateMultiOrderInfo, List list, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : defiMultiSwapOrderInfoReq, (i & 2) != 0 ? null : updateMultiOrderInfo, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : obj);
    }

    public final boolean isSingleChain() {
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq = this.dexMultiMetaSaveOrderParam;
        String chainId = defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getChainId() : null;
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq2 = this.dexMultiMetaSaveOrderParam;
        return Intrinsics.EZpvd((Object) chainId, (Object) (defiMultiSwapOrderInfoReq2 != null ? defiMultiSwapOrderInfoReq2.getToChainId() : null));
    }
}

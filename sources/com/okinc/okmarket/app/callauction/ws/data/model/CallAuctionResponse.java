package com.okinc.okmarket.app.callauction.ws.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CallAuctionResponse {
    public static final int $stable = 8;
    private final List<CallAuctionData> callAuctionInstList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallAuctionResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallAuctionResponse copy$default(CallAuctionResponse callAuctionResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = callAuctionResponse.callAuctionInstList;
        }
        return callAuctionResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CallAuctionData> component1() {
        return this.callAuctionInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallAuctionResponse copy(List<CallAuctionData> list) {
        return new CallAuctionResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallAuctionResponse) && Intrinsics.EZpvd(this.callAuctionInstList, ((CallAuctionResponse) obj).callAuctionInstList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CallAuctionData> getCallAuctionInstList() {
        return this.callAuctionInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<CallAuctionData> list = this.callAuctionInstList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallAuctionResponse(callAuctionInstList=" + this.callAuctionInstList + ")";
    }

    public CallAuctionResponse(List<CallAuctionData> list) {
        this.callAuctionInstList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData>):void (m)] (LINE:7) call: com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ CallAuctionResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

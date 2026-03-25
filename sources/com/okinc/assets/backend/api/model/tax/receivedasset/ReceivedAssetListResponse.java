package com.okinc.assets.backend.api.model.tax.receivedasset;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.yDY;

/* JADX INFO: loaded from: classes22.dex */
public final class ReceivedAssetListResponse {
    public static final int $stable = 8;
    private final Long floorTime;
    private final Integer maxPurchases;
    private final Integer total;
    private final List<ReceivedAssetTransaction> transactions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReceivedAssetListResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFloorTime() {
        return this.floorTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxPurchases() {
        return this.maxPurchases;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReceivedAssetTransaction> getTransactions() {
        return this.transactions;
    }

    public ReceivedAssetListResponse(List<ReceivedAssetTransaction> list, Integer num, Integer num2, Long l) {
        this.transactions = list;
        this.total = num;
        this.maxPurchases = num2;
        this.floorTime = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r2v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetTransaction>, java.lang.Integer, java.lang.Integer, java.lang.Long):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetListResponse.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ ReceivedAssetListResponse(List list, Integer num, Integer num2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l);
    }
}

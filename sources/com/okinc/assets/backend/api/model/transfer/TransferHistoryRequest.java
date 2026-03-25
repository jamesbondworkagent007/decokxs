package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TransferHistoryRequest {
    public static final int $stable = 0;
    private final Integer currencyId;
    private final int currentPage;
    private final Long endTime;
    private final int pageLength;
    private final Long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferHistoryRequest() {
        this(null, null, null, 0, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferHistoryRequest copy$default(TransferHistoryRequest transferHistoryRequest, Integer num, Long l, Long l2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = transferHistoryRequest.currencyId;
        }
        if ((i3 & 2) != 0) {
            l = transferHistoryRequest.startTime;
        }
        Long l3 = l;
        if ((i3 & 4) != 0) {
            l2 = transferHistoryRequest.endTime;
        }
        Long l4 = l2;
        if ((i3 & 8) != 0) {
            i = transferHistoryRequest.currentPage;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = transferHistoryRequest.pageLength;
        }
        return transferHistoryRequest.copy(num, l3, l4, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferHistoryRequest copy(Integer num, Long l, Long l2, int i, int i2) {
        return new TransferHistoryRequest(num, l, l2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferHistoryRequest)) {
            return false;
        }
        TransferHistoryRequest transferHistoryRequest = (TransferHistoryRequest) obj;
        return Intrinsics.EZpvd(this.currencyId, transferHistoryRequest.currencyId) && Intrinsics.EZpvd(this.startTime, transferHistoryRequest.startTime) && Intrinsics.EZpvd(this.endTime, transferHistoryRequest.endTime) && this.currentPage == transferHistoryRequest.currentPage && this.pageLength == transferHistoryRequest.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.startTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageLength);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferHistoryRequest(currencyId=" + this.currencyId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ")";
    }

    public TransferHistoryRequest(Integer num, Long l, Long l2, int i, int i2) {
        this.currencyId = num;
        this.startTime = l;
        this.endTime = l2;
        this.currentPage = i;
        this.pageLength = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.Long) : (null java.lang.Long))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r8v0 int))
 A[MD:(java.lang.Integer, java.lang.Long, java.lang.Long, int, int):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.transfer.TransferHistoryRequest.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, int, int):void type: THIS */
    public /* synthetic */ TransferHistoryRequest(Integer num, Long l, Long l2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : l, (i3 & 4) == 0 ? l2 : null, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 10 : i2);
    }
}

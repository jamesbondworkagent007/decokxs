package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TransactionHistoryReq {
    public static final int $stable = 0;
    private final Integer currencyId;
    private final int currentPage;
    private final Long endTime;
    private final int pageLength;
    private final Long startTime;
    private final Integer status;
    private final Boolean useNewStatus;
    private final String valuationUnit;

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
    public final Integer component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.useNewStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionHistoryReq copy(Integer num, Long l, Long l2, Integer num2, int i, int i2, String str, Boolean bool) {
        return new TransactionHistoryReq(num, l, l2, num2, i, i2, str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionHistoryReq)) {
            return false;
        }
        TransactionHistoryReq transactionHistoryReq = (TransactionHistoryReq) obj;
        return Intrinsics.EZpvd(this.currencyId, transactionHistoryReq.currencyId) && Intrinsics.EZpvd(this.startTime, transactionHistoryReq.startTime) && Intrinsics.EZpvd(this.endTime, transactionHistoryReq.endTime) && Intrinsics.EZpvd(this.status, transactionHistoryReq.status) && this.currentPage == transactionHistoryReq.currentPage && this.pageLength == transactionHistoryReq.pageLength && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) transactionHistoryReq.valuationUnit) && Intrinsics.EZpvd(this.useNewStatus, transactionHistoryReq.useNewStatus);
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
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseNewStatus() {
        return this.useNewStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.startTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Integer num2 = this.status;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        int iHashCode5 = Integer.hashCode(this.currentPage);
        int iHashCode6 = Integer.hashCode(this.pageLength);
        String str = this.valuationUnit;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Boolean bool = this.useNewStatus;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionHistoryReq(currencyId=" + this.currencyId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", valuationUnit=" + this.valuationUnit + ", useNewStatus=" + this.useNewStatus + ")";
    }

    public TransactionHistoryReq(Integer num, Long l, Long l2, Integer num2, int i, int i2, String str, Boolean bool) {
        this.currencyId = num;
        this.startTime = l;
        this.endTime = l2;
        this.status = num2;
        this.currentPage = i;
        this.pageLength = i2;
        this.valuationUnit = str;
        this.useNewStatus = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r12v0 java.lang.Integer)
  (r13v0 java.lang.Long)
  (r14v0 java.lang.Long)
  (r15v0 java.lang.Integer)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, int, int, java.lang.String, java.lang.Boolean):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.TransactionHistoryReq.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, int, int, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TransactionHistoryReq(Integer num, Long l, Long l2, Integer num2, int i, int i2, String str, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l, l2, num2, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? 10 : i2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? Boolean.FALSE : bool);
    }
}

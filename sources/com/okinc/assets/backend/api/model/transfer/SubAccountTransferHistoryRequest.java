package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SubAccountTransferHistoryRequest {
    public static final int $stable = 0;
    private final Integer currencyId;
    private final int currentPage;
    private final Long endTime;
    private final int pageLength;
    private final Long startTime;
    private final String subAccountName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubAccountTransferHistoryRequest() {
        this(null, null, null, null, 0, 0, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubAccountTransferHistoryRequest copy$default(SubAccountTransferHistoryRequest subAccountTransferHistoryRequest, Integer num, Long l, Long l2, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = subAccountTransferHistoryRequest.currencyId;
        }
        if ((i3 & 2) != 0) {
            l = subAccountTransferHistoryRequest.startTime;
        }
        Long l3 = l;
        if ((i3 & 4) != 0) {
            l2 = subAccountTransferHistoryRequest.endTime;
        }
        Long l4 = l2;
        if ((i3 & 8) != 0) {
            str = subAccountTransferHistoryRequest.subAccountName;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            i = subAccountTransferHistoryRequest.currentPage;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = subAccountTransferHistoryRequest.pageLength;
        }
        return subAccountTransferHistoryRequest.copy(num, l3, l4, str2, i4, i2);
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
    public final String component4() {
        return this.subAccountName;
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
    public final SubAccountTransferHistoryRequest copy(Integer num, Long l, Long l2, String str, int i, int i2) {
        return new SubAccountTransferHistoryRequest(num, l, l2, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountTransferHistoryRequest)) {
            return false;
        }
        SubAccountTransferHistoryRequest subAccountTransferHistoryRequest = (SubAccountTransferHistoryRequest) obj;
        return Intrinsics.EZpvd(this.currencyId, subAccountTransferHistoryRequest.currencyId) && Intrinsics.EZpvd(this.startTime, subAccountTransferHistoryRequest.startTime) && Intrinsics.EZpvd(this.endTime, subAccountTransferHistoryRequest.endTime) && Intrinsics.EZpvd((Object) this.subAccountName, (Object) subAccountTransferHistoryRequest.subAccountName) && this.currentPage == subAccountTransferHistoryRequest.currentPage && this.pageLength == subAccountTransferHistoryRequest.pageLength;
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
    public final String getSubAccountName() {
        return this.subAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.startTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str = this.subAccountName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageLength);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountTransferHistoryRequest(currencyId=" + this.currencyId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", subAccountName=" + this.subAccountName + ", currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ")";
    }

    public SubAccountTransferHistoryRequest(Integer num, Long l, Long l2, String str, int i, int i2) {
        this.currencyId = num;
        this.startTime = l;
        this.endTime = l2;
        this.subAccountName = str;
        this.currentPage = i;
        this.pageLength = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r10v0 int))
 A[MD:(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, int, int):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.transfer.SubAccountTransferHistoryRequest.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ SubAccountTransferHistoryRequest(Integer num, Long l, Long l2, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? null : l2, (i3 & 8) == 0 ? str : null, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? 10 : i2);
    }
}

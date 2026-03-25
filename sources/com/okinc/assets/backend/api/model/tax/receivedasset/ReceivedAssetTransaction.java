package com.okinc.assets.backend.api.model.tax.receivedasset;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ReceivedAssetTransaction {
    public static final int $stable = 8;
    private final String amount;
    private final String avgCost;
    private final List<CostBasisDetail> costBasisDetails;
    private final String costBasisStatus;
    private final String currency;
    private final Long deadline;
    private final Boolean editable;
    private final String totalCost;
    private final String transactionId;
    private final String transactionLabel;
    private final String transactionTime;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReceivedAssetTransaction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.totalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.costBasisStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisDetail> component7() {
        return this.costBasisDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.transactionLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceivedAssetTransaction copy(String str, String str2, String str3, String str4, String str5, String str6, List<CostBasisDetail> list, String str7, String str8, Boolean bool, Long l, String str9) {
        return new ReceivedAssetTransaction(str, str2, str3, str4, str5, str6, list, str7, str8, bool, l, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedAssetTransaction)) {
            return false;
        }
        ReceivedAssetTransaction receivedAssetTransaction = (ReceivedAssetTransaction) obj;
        return Intrinsics.EZpvd((Object) this.transactionId, (Object) receivedAssetTransaction.transactionId) && Intrinsics.EZpvd((Object) this.transactionTime, (Object) receivedAssetTransaction.transactionTime) && Intrinsics.EZpvd((Object) this.currency, (Object) receivedAssetTransaction.currency) && Intrinsics.EZpvd((Object) this.amount, (Object) receivedAssetTransaction.amount) && Intrinsics.EZpvd((Object) this.costBasisStatus, (Object) receivedAssetTransaction.costBasisStatus) && Intrinsics.EZpvd((Object) this.avgCost, (Object) receivedAssetTransaction.avgCost) && Intrinsics.EZpvd(this.costBasisDetails, receivedAssetTransaction.costBasisDetails) && Intrinsics.EZpvd((Object) this.transactionLabel, (Object) receivedAssetTransaction.transactionLabel) && Intrinsics.EZpvd((Object) this.type, (Object) receivedAssetTransaction.type) && Intrinsics.EZpvd(this.editable, receivedAssetTransaction.editable) && Intrinsics.EZpvd(this.deadline, receivedAssetTransaction.deadline) && Intrinsics.EZpvd((Object) this.totalCost, (Object) receivedAssetTransaction.totalCost);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgCost() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisDetail> getCostBasisDetails() {
        return this.costBasisDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostBasisStatus() {
        return this.costBasisStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEditable() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCost() {
        return this.totalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionLabel() {
        return this.transactionLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionTime() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.transactionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.transactionTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.amount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.costBasisStatus;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.avgCost;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<CostBasisDetail> list = this.costBasisDetails;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        String str7 = this.transactionLabel;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.type;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.editable;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Long l = this.deadline;
        int iHashCode11 = l == null ? 0 : l.hashCode();
        String str9 = this.totalCost;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceivedAssetTransaction(transactionId=" + this.transactionId + ", transactionTime=" + this.transactionTime + ", currency=" + this.currency + ", amount=" + this.amount + ", costBasisStatus=" + this.costBasisStatus + ", avgCost=" + this.avgCost + ", costBasisDetails=" + this.costBasisDetails + ", transactionLabel=" + this.transactionLabel + ", type=" + this.type + ", editable=" + this.editable + ", deadline=" + this.deadline + ", totalCost=" + this.totalCost + ")";
    }

    public ReceivedAssetTransaction(String str, String str2, String str3, String str4, String str5, String str6, List<CostBasisDetail> list, String str7, String str8, Boolean bool, Long l, String str9) {
        this.transactionId = str;
        this.transactionTime = str2;
        this.currency = str3;
        this.amount = str4;
        this.costBasisStatus = str5;
        this.avgCost = str6;
        this.costBasisDetails = list;
        this.transactionLabel = str7;
        this.type = str8;
        this.editable = bool;
        this.deadline = l;
        this.totalCost = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisDetail>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.String):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ ReceivedAssetTransaction(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, Boolean bool, Long l, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : l, (i & 2048) == 0 ? str9 : null);
    }
}

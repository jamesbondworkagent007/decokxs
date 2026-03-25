package com.okinc.assets.backend.api.model.tax.receivedasset;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CostBasisEstimate {
    public static final int $stable = 0;
    private final String amount;
    private final String currency;
    private final Integer currencyId;
    private final String estAmountPaid;
    private final String transactionId;
    private final String transactionLabel;
    private final String transactionTime;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CostBasisEstimate() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionId;
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
    public final Integer component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estAmountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.transactionLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostBasisEstimate copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7) {
        return new CostBasisEstimate(str, str2, str3, num, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostBasisEstimate)) {
            return false;
        }
        CostBasisEstimate costBasisEstimate = (CostBasisEstimate) obj;
        return Intrinsics.EZpvd((Object) this.transactionId, (Object) costBasisEstimate.transactionId) && Intrinsics.EZpvd((Object) this.transactionTime, (Object) costBasisEstimate.transactionTime) && Intrinsics.EZpvd((Object) this.currency, (Object) costBasisEstimate.currency) && Intrinsics.EZpvd(this.currencyId, costBasisEstimate.currencyId) && Intrinsics.EZpvd((Object) this.amount, (Object) costBasisEstimate.amount) && Intrinsics.EZpvd((Object) this.estAmountPaid, (Object) costBasisEstimate.estAmountPaid) && Intrinsics.EZpvd((Object) this.transactionLabel, (Object) costBasisEstimate.transactionLabel) && Intrinsics.EZpvd((Object) this.type, (Object) costBasisEstimate.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAmountPaid() {
        return this.estAmountPaid;
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
        Integer num = this.currencyId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.amount;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estAmountPaid;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.transactionLabel;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.type;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CostBasisEstimate(transactionId=" + this.transactionId + ", transactionTime=" + this.transactionTime + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", amount=" + this.amount + ", estAmountPaid=" + this.estAmountPaid + ", transactionLabel=" + this.transactionLabel + ", type=" + this.type + ")";
    }

    public CostBasisEstimate(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7) {
        this.transactionId = str;
        this.transactionTime = str2;
        this.currency = str3;
        this.currencyId = num;
        this.amount = str4;
        this.estAmountPaid = str5;
        this.transactionLabel = str6;
        this.type = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisEstimate.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CostBasisEstimate(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}

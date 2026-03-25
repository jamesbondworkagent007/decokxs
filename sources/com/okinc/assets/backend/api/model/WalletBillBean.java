package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WalletBillBean {
    public static final int $stable = 0;
    private final String afterBalance;
    private final String createTime;
    private final String currency;
    private final int currencyId;
    private final String fee;
    private final String fiatTransactionId;
    private final String icon;
    private final String note;
    private final String size;
    private final Long transactionId;
    private final Integer typeCode;
    private final String typeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletBillBean() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.afterBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fiatTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.note;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.typeCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBillBean copy(String str, String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, String str6, String str7, Integer num, Long l, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WalletBillBean(str, str2, str3, i, str4, str5, str6, str7, num, l, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBillBean)) {
            return false;
        }
        WalletBillBean walletBillBean = (WalletBillBean) obj;
        return Intrinsics.EZpvd((Object) this.afterBalance, (Object) walletBillBean.afterBalance) && Intrinsics.EZpvd((Object) this.createTime, (Object) walletBillBean.createTime) && Intrinsics.EZpvd((Object) this.currency, (Object) walletBillBean.currency) && this.currencyId == walletBillBean.currencyId && Intrinsics.EZpvd((Object) this.fee, (Object) walletBillBean.fee) && Intrinsics.EZpvd((Object) this.size, (Object) walletBillBean.size) && Intrinsics.EZpvd((Object) this.note, (Object) walletBillBean.note) && Intrinsics.EZpvd((Object) this.typeName, (Object) walletBillBean.typeName) && Intrinsics.EZpvd(this.typeCode, walletBillBean.typeCode) && Intrinsics.EZpvd(this.transactionId, walletBillBean.transactionId) && Intrinsics.EZpvd((Object) this.fiatTransactionId, (Object) walletBillBean.fiatTransactionId) && Intrinsics.EZpvd((Object) this.icon, (Object) walletBillBean.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfterBalance() {
        return this.afterBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatTransactionId() {
        return this.fiatTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNote() {
        return this.note;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTypeCode() {
        return this.typeCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.afterBalance;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.createTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.currency.hashCode();
        int iHashCode4 = Integer.hashCode(this.currencyId);
        int iHashCode5 = this.fee.hashCode();
        int iHashCode6 = this.size.hashCode();
        String str3 = this.note;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.typeName;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.typeCode;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Long l = this.transactionId;
        int iHashCode10 = l == null ? 0 : l.hashCode();
        String str5 = this.fiatTransactionId;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.icon;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletBillBean(afterBalance=" + this.afterBalance + ", createTime=" + this.createTime + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", fee=" + this.fee + ", size=" + this.size + ", note=" + this.note + ", typeName=" + this.typeName + ", typeCode=" + this.typeCode + ", transactionId=" + this.transactionId + ", fiatTransactionId=" + this.fiatTransactionId + ", icon=" + this.icon + ")";
    }

    public WalletBillBean(String str, String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, String str6, String str7, Integer num, Long l, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.afterBalance = str;
        this.createTime = str2;
        this.currency = str3;
        this.currencyId = i;
        this.fee = str4;
        this.size = str5;
        this.note = str6;
        this.typeName = str7;
        this.typeCode = num;
        this.transactionId = l;
        this.fiatTransactionId = str8;
        this.icon = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.WalletBillBean.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletBillBean(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, Integer num, Long l, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) == 0 ? str9 : null);
    }
}

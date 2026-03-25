package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsDynamicsBillBean {
    public static final int $stable = 0;
    private final String amount;
    private final String currency;
    private final Integer currencyId;
    private final String desc;
    private final String fiatTransactionId;
    private final String icon;
    private final Boolean negate;
    private final Integer status;
    private final Long timestamp;
    private final Long transactionId;
    private final Integer type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsDynamicsBillBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.negate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fiatTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
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
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsDynamicsBillBean copy(String str, String str2, String str3, Integer num, String str4, Integer num2, Long l, Long l2, Integer num3, Boolean bool, String str5) {
        return new AssetsDynamicsBillBean(str, str2, str3, num, str4, num2, l, l2, num3, bool, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetsDynamicsBillBean)) {
            return false;
        }
        AssetsDynamicsBillBean assetsDynamicsBillBean = (AssetsDynamicsBillBean) obj;
        return Intrinsics.EZpvd((Object) this.desc, (Object) assetsDynamicsBillBean.desc) && Intrinsics.EZpvd((Object) this.amount, (Object) assetsDynamicsBillBean.amount) && Intrinsics.EZpvd((Object) this.currency, (Object) assetsDynamicsBillBean.currency) && Intrinsics.EZpvd(this.currencyId, assetsDynamicsBillBean.currencyId) && Intrinsics.EZpvd((Object) this.icon, (Object) assetsDynamicsBillBean.icon) && Intrinsics.EZpvd(this.status, assetsDynamicsBillBean.status) && Intrinsics.EZpvd(this.timestamp, assetsDynamicsBillBean.timestamp) && Intrinsics.EZpvd(this.transactionId, assetsDynamicsBillBean.transactionId) && Intrinsics.EZpvd(this.type, assetsDynamicsBillBean.type) && Intrinsics.EZpvd(this.negate, assetsDynamicsBillBean.negate) && Intrinsics.EZpvd((Object) this.fiatTransactionId, (Object) assetsDynamicsBillBean.fiatTransactionId);
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
    public final String getDesc() {
        return this.desc;
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
    public final Boolean getNegate() {
        return this.negate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.desc;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.currencyId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.icon;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.status;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Long l = this.timestamp;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Long l2 = this.transactionId;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        Integer num3 = this.type;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        Boolean bool = this.negate;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        String str5 = this.fiatTransactionId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsDynamicsBillBean(desc=" + this.desc + ", amount=" + this.amount + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", icon=" + this.icon + ", status=" + this.status + ", timestamp=" + this.timestamp + ", transactionId=" + this.transactionId + ", type=" + this.type + ", negate=" + this.negate + ", fiatTransactionId=" + this.fiatTransactionId + ")";
    }

    public AssetsDynamicsBillBean(String str, String str2, String str3, Integer num, String str4, Integer num2, Long l, Long l2, Integer num3, Boolean bool, String str5) {
        this.desc = str;
        this.amount = str2;
        this.currency = str3;
        this.currencyId = num;
        this.icon = str4;
        this.status = num2;
        this.timestamp = l;
        this.transactionId = l2;
        this.type = num3;
        this.negate = bool;
        this.fiatTransactionId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.String):void (m)] (LINE:68) call: com.okinc.assets.backend.api.model.AssetsDynamicsBillBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AssetsDynamicsBillBean(String str, String str2, String str3, Integer num, String str4, Integer num2, Long l, Long l2, Integer num3, Boolean bool, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool, (i & 1024) == 0 ? str5 : null);
    }
}

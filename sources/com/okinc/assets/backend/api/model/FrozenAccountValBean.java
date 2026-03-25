package com.okinc.assets.backend.api.model;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FrozenAccountValBean {
    public static final int $stable = 0;
    private final String amount;
    private final Boolean appeal;
    private final Integer appealStatus;
    private final Integer bizType;
    private final String btcValuation;
    private final Long expireTime;
    private final String publicOrderId;
    private final String usdValuation;
    private final String usdtValuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FrozenAccountValBean() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.publicOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.appealStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.appeal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrozenAccountValBean copy(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Long l, Boolean bool) {
        return new FrozenAccountValBean(num, str, str2, str3, str4, str5, num2, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrozenAccountValBean)) {
            return false;
        }
        FrozenAccountValBean frozenAccountValBean = (FrozenAccountValBean) obj;
        return Intrinsics.EZpvd(this.bizType, frozenAccountValBean.bizType) && Intrinsics.EZpvd((Object) this.publicOrderId, (Object) frozenAccountValBean.publicOrderId) && Intrinsics.EZpvd((Object) this.amount, (Object) frozenAccountValBean.amount) && Intrinsics.EZpvd((Object) this.btcValuation, (Object) frozenAccountValBean.btcValuation) && Intrinsics.EZpvd((Object) this.usdValuation, (Object) frozenAccountValBean.usdValuation) && Intrinsics.EZpvd((Object) this.usdtValuation, (Object) frozenAccountValBean.usdtValuation) && Intrinsics.EZpvd(this.appealStatus, frozenAccountValBean.appealStatus) && Intrinsics.EZpvd(this.expireTime, frozenAccountValBean.expireTime) && Intrinsics.EZpvd(this.appeal, frozenAccountValBean.appeal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAppeal() {
        return this.appeal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAppealStatus() {
        return this.appealStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcValuation() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicOrderId() {
        return this.publicOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValuation() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtValuation() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.bizType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.publicOrderId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.btcValuation;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdValuation;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.usdtValuation;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Integer num2 = this.appealStatus;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Long l = this.expireTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Boolean bool = this.appeal;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FrozenAccountValBean(bizType=" + this.bizType + ", publicOrderId=" + this.publicOrderId + ", amount=" + this.amount + ", btcValuation=" + this.btcValuation + ", usdValuation=" + this.usdValuation + ", usdtValuation=" + this.usdtValuation + ", appealStatus=" + this.appealStatus + ", expireTime=" + this.expireTime + ", appeal=" + this.appeal + ")";
    }

    public FrozenAccountValBean(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Long l, Boolean bool) {
        this.bizType = num;
        this.publicOrderId = str;
        this.amount = str2;
        this.btcValuation = str3;
        this.usdValuation = str4;
        this.usdtValuation = str5;
        this.appealStatus = num2;
        this.expireTime = l;
        this.appeal = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Boolean):void (m)] (LINE:55) call: com.okinc.assets.backend.api.model.FrozenAccountValBean.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FrozenAccountValBean(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : l, (i & 256) == 0 ? bool : null);
    }
}

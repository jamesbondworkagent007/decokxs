package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AccountValBean {
    public static final int $stable = 0;
    private final String btcValuation;
    private final Boolean canBuy;
    private final Boolean canDeposit;
    private final Boolean canEarn;
    private final Boolean canLoan;
    private final Boolean canReserve;
    private final Boolean canTrade;
    private final Boolean canTransfer;
    private final Boolean canWithdraw;
    private final String cnyValuation;
    private final String icon;
    private final String rate;
    private final Integer target;
    private final String usdValuation;
    private final String usdtValuation;
    private final String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountValBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.canTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.canEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.canLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.canReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.cnyValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.canBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.canDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountValBean copy(Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str5, String str6, String str7) {
        return new AccountValBean(num, str, str2, str3, str4, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountValBean)) {
            return false;
        }
        AccountValBean accountValBean = (AccountValBean) obj;
        return Intrinsics.EZpvd(this.target, accountValBean.target) && Intrinsics.EZpvd((Object) this.valuation, (Object) accountValBean.valuation) && Intrinsics.EZpvd((Object) this.btcValuation, (Object) accountValBean.btcValuation) && Intrinsics.EZpvd((Object) this.rate, (Object) accountValBean.rate) && Intrinsics.EZpvd((Object) this.icon, (Object) accountValBean.icon) && Intrinsics.EZpvd(this.canBuy, accountValBean.canBuy) && Intrinsics.EZpvd(this.canTrade, accountValBean.canTrade) && Intrinsics.EZpvd(this.canDeposit, accountValBean.canDeposit) && Intrinsics.EZpvd(this.canWithdraw, accountValBean.canWithdraw) && Intrinsics.EZpvd(this.canTransfer, accountValBean.canTransfer) && Intrinsics.EZpvd(this.canEarn, accountValBean.canEarn) && Intrinsics.EZpvd(this.canLoan, accountValBean.canLoan) && Intrinsics.EZpvd(this.canReserve, accountValBean.canReserve) && Intrinsics.EZpvd((Object) this.cnyValuation, (Object) accountValBean.cnyValuation) && Intrinsics.EZpvd((Object) this.usdValuation, (Object) accountValBean.usdValuation) && Intrinsics.EZpvd((Object) this.usdtValuation, (Object) accountValBean.usdtValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcValuation() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanBuy() {
        return this.canBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanDeposit() {
        return this.canDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanEarn() {
        return this.canEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanLoan() {
        return this.canLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanReserve() {
        return this.canReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTrade() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTransfer() {
        return this.canTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanWithdraw() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyValuation() {
        return this.cnyValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTarget() {
        return this.target;
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
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.target;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.valuation;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.btcValuation;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rate;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.icon;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.canBuy;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canTrade;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.canDeposit;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.canWithdraw;
        int iHashCode9 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.canTransfer;
        int iHashCode10 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.canEarn;
        int iHashCode11 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.canLoan;
        int iHashCode12 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.canReserve;
        int iHashCode13 = bool8 == null ? 0 : bool8.hashCode();
        String str5 = this.cnyValuation;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.usdValuation;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.usdtValuation;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str7 == null ? 0 : str7.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountValBean(target=" + this.target + ", valuation=" + this.valuation + ", btcValuation=" + this.btcValuation + ", rate=" + this.rate + ", icon=" + this.icon + ", canBuy=" + this.canBuy + ", canTrade=" + this.canTrade + ", canDeposit=" + this.canDeposit + ", canWithdraw=" + this.canWithdraw + ", canTransfer=" + this.canTransfer + ", canEarn=" + this.canEarn + ", canLoan=" + this.canLoan + ", canReserve=" + this.canReserve + ", cnyValuation=" + this.cnyValuation + ", usdValuation=" + this.usdValuation + ", usdtValuation=" + this.usdtValuation + ")";
    }

    public AccountValBean(Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str5, String str6, String str7) {
        this.target = num;
        this.valuation = str;
        this.btcValuation = str2;
        this.rate = str3;
        this.icon = str4;
        this.canBuy = bool;
        this.canTrade = bool2;
        this.canDeposit = bool3;
        this.canWithdraw = bool4;
        this.canTransfer = bool5;
        this.canEarn = bool6;
        this.canLoan = bool7;
        this.canReserve = bool8;
        this.cnyValuation = str5;
        this.usdValuation = str6;
        this.usdtValuation = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.assets.backend.api.model.AccountValBean.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountValBean(Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : bool5, (i & 1024) != 0 ? null : bool6, (i & 2048) != 0 ? null : bool7, (i & 4096) != 0 ? null : bool8, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : str7);
    }
}

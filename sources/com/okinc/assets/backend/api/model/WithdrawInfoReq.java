package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawInfoReq {
    public static final int $stable = 8;
    private String address;
    private int currencyId;
    private Boolean invalidAsset;
    public Boolean isAddress;
    private boolean needAmounts;
    private Integer subCurrencyId;
    private Integer targetType;
    private Boolean useUsdtFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.useUsdtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawInfoReq copy(int i, Boolean bool, Integer num, Integer num2, boolean z, Boolean bool2, Boolean bool3, String str) {
        return new WithdrawInfoReq(i, bool, num, num2, z, bool2, bool3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawInfoReq)) {
            return false;
        }
        WithdrawInfoReq withdrawInfoReq = (WithdrawInfoReq) obj;
        return this.currencyId == withdrawInfoReq.currencyId && Intrinsics.EZpvd(this.isAddress, withdrawInfoReq.isAddress) && Intrinsics.EZpvd(this.targetType, withdrawInfoReq.targetType) && Intrinsics.EZpvd(this.subCurrencyId, withdrawInfoReq.subCurrencyId) && this.needAmounts == withdrawInfoReq.needAmounts && Intrinsics.EZpvd(this.invalidAsset, withdrawInfoReq.invalidAsset) && Intrinsics.EZpvd(this.useUsdtFee, withdrawInfoReq.useUsdtFee) && Intrinsics.EZpvd((Object) this.address, (Object) withdrawInfoReq.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedAmounts() {
        return this.needAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseUsdtFee() {
        return this.useUsdtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        Boolean bool = this.isAddress;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.targetType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.subCurrencyId;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        int iHashCode5 = Boolean.hashCode(this.needAmounts);
        Boolean bool2 = this.invalidAsset;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.useUsdtFee;
        int iHashCode7 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.address;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(Boolean bool) {
        this.invalidAsset = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedAmounts(boolean z) {
        this.needAmounts = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(Integer num) {
        this.subCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(Integer num) {
        this.targetType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseUsdtFee(Boolean bool) {
        this.useUsdtFee = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawInfoReq(currencyId=" + this.currencyId + ", isAddress=" + this.isAddress + ", targetType=" + this.targetType + ", subCurrencyId=" + this.subCurrencyId + ", needAmounts=" + this.needAmounts + ", invalidAsset=" + this.invalidAsset + ", useUsdtFee=" + this.useUsdtFee + ", address=" + this.address + ")";
    }

    public WithdrawInfoReq(int i, Boolean bool, Integer num, Integer num2, boolean z, Boolean bool2, Boolean bool3, String str) {
        this.currencyId = i;
        this.isAddress = bool;
        this.targetType = num;
        this.subCurrencyId = num2;
        this.needAmounts = z;
        this.invalidAsset = bool2;
        this.useUsdtFee = bool3;
        this.address = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r13v0 int)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (r17v0 boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(int, java.lang.Boolean, java.lang.Integer, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:86) call: com.okinc.assets.backend.api.model.WithdrawInfoReq.<init>(int, java.lang.Boolean, java.lang.Integer, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawInfoReq(int i, Boolean bool, Integer num, Integer num2, boolean z, Boolean bool2, Boolean bool3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, z, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : bool3, (i2 & 128) != 0 ? null : str);
    }
}

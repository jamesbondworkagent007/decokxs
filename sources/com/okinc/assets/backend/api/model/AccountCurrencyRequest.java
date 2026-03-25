package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AccountCurrencyRequest {
    public static final int $stable = 8;
    private Boolean filterCash;
    private Boolean filterLtk;
    private Boolean filterOutEntityUnsupportedCcy;
    private Boolean filterZeroBalance;
    private Boolean isDeposit;
    public Boolean isTransfer;
    private Boolean isWithdraw;
    private Boolean recentDeposit;
    private String valuationUnit;
    private String web3AccountId;
    private Boolean withCash;
    private Boolean withFavorite;
    private Boolean withNetwork;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountCurrencyRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.isTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.filterCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.isDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.withFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.filterLtk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.withNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.filterZeroBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.recentDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.withCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.filterOutEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountCurrencyRequest copy(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str2, Boolean bool11) {
        return new AccountCurrencyRequest(bool, bool2, bool3, str, bool4, bool5, bool6, bool7, bool8, bool9, bool10, str2, bool11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCurrencyRequest)) {
            return false;
        }
        AccountCurrencyRequest accountCurrencyRequest = (AccountCurrencyRequest) obj;
        return Intrinsics.EZpvd(this.isWithdraw, accountCurrencyRequest.isWithdraw) && Intrinsics.EZpvd(this.withFavorite, accountCurrencyRequest.withFavorite) && Intrinsics.EZpvd(this.filterLtk, accountCurrencyRequest.filterLtk) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) accountCurrencyRequest.valuationUnit) && Intrinsics.EZpvd(this.withNetwork, accountCurrencyRequest.withNetwork) && Intrinsics.EZpvd(this.filterZeroBalance, accountCurrencyRequest.filterZeroBalance) && Intrinsics.EZpvd(this.recentDeposit, accountCurrencyRequest.recentDeposit) && Intrinsics.EZpvd(this.withCash, accountCurrencyRequest.withCash) && Intrinsics.EZpvd(this.filterOutEntityUnsupportedCcy, accountCurrencyRequest.filterOutEntityUnsupportedCcy) && Intrinsics.EZpvd(this.isTransfer, accountCurrencyRequest.isTransfer) && Intrinsics.EZpvd(this.filterCash, accountCurrencyRequest.filterCash) && Intrinsics.EZpvd((Object) this.web3AccountId, (Object) accountCurrencyRequest.web3AccountId) && Intrinsics.EZpvd(this.isDeposit, accountCurrencyRequest.isDeposit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFilterCash() {
        return this.filterCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFilterLtk() {
        return this.filterLtk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFilterOutEntityUnsupportedCcy() {
        return this.filterOutEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFilterZeroBalance() {
        return this.filterZeroBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecentDeposit() {
        return this.recentDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountId() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithCash() {
        return this.withCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithFavorite() {
        return this.withFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithNetwork() {
        return this.withNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isWithdraw;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.withFavorite;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.filterLtk;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.valuationUnit;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool4 = this.withNetwork;
        int iHashCode5 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.filterZeroBalance;
        int iHashCode6 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.recentDeposit;
        int iHashCode7 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.withCash;
        int iHashCode8 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.filterOutEntityUnsupportedCcy;
        int iHashCode9 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.isTransfer;
        int iHashCode10 = bool9 == null ? 0 : bool9.hashCode();
        Boolean bool10 = this.filterCash;
        int iHashCode11 = bool10 == null ? 0 : bool10.hashCode();
        String str2 = this.web3AccountId;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        Boolean bool11 = this.isDeposit;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool11 != null ? bool11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDeposit() {
        return this.isDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isWithdraw() {
        return this.isWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeposit(Boolean bool) {
        this.isDeposit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterCash(Boolean bool) {
        this.filterCash = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterLtk(Boolean bool) {
        this.filterLtk = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterOutEntityUnsupportedCcy(Boolean bool) {
        this.filterOutEntityUnsupportedCcy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterZeroBalance(Boolean bool) {
        this.filterZeroBalance = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecentDeposit(Boolean bool) {
        this.recentDeposit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AccountId(String str) {
        this.web3AccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithCash(Boolean bool) {
        this.withCash = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithFavorite(Boolean bool) {
        this.withFavorite = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithNetwork(Boolean bool) {
        this.withNetwork = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdraw(Boolean bool) {
        this.isWithdraw = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountCurrencyRequest(isWithdraw=" + this.isWithdraw + ", withFavorite=" + this.withFavorite + ", filterLtk=" + this.filterLtk + ", valuationUnit=" + this.valuationUnit + ", withNetwork=" + this.withNetwork + ", filterZeroBalance=" + this.filterZeroBalance + ", recentDeposit=" + this.recentDeposit + ", withCash=" + this.withCash + ", filterOutEntityUnsupportedCcy=" + this.filterOutEntityUnsupportedCcy + ", isTransfer=" + this.isTransfer + ", filterCash=" + this.filterCash + ", web3AccountId=" + this.web3AccountId + ", isDeposit=" + this.isDeposit + ")";
    }

    public AccountCurrencyRequest(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str2, Boolean bool11) {
        this.isWithdraw = bool;
        this.withFavorite = bool2;
        this.filterLtk = bool3;
        this.valuationUnit = str;
        this.withNetwork = bool4;
        this.filterZeroBalance = bool5;
        this.recentDeposit = bool6;
        this.withCash = bool7;
        this.filterOutEntityUnsupportedCcy = bool8;
        this.isTransfer = bool9;
        this.filterCash = bool10;
        this.web3AccountId = str2;
        this.isDeposit = bool11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0087: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.AccountCurrencyRequest.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AccountCurrencyRequest(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str2, Boolean bool11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) != 0 ? null : bool7, (i & 256) != 0 ? Boolean.TRUE : bool8, (i & 512) != 0 ? null : bool9, (i & 1024) != 0 ? Boolean.FALSE : bool10, (i & 2048) == 0 ? str2 : null, (i & 4096) != 0 ? Boolean.FALSE : bool11);
    }
}

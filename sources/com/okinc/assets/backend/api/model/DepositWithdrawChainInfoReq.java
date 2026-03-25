package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositWithdrawChainInfoReq {
    public static final int $stable = 8;
    private String address;
    private int currencyId;
    public boolean isWithdraw;
    private String valuationUnit;
    private String walletType;
    private String web3AccountId;
    private Boolean withLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositWithdrawChainInfoReq copy$default(DepositWithdrawChainInfoReq depositWithdrawChainInfoReq, int i, boolean z, Boolean bool, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositWithdrawChainInfoReq.currencyId;
        }
        if ((i2 & 2) != 0) {
            z = depositWithdrawChainInfoReq.isWithdraw;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            bool = depositWithdrawChainInfoReq.withLimit;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            str = depositWithdrawChainInfoReq.valuationUnit;
        }
        String str5 = str;
        if ((i2 & 16) != 0) {
            str2 = depositWithdrawChainInfoReq.address;
        }
        String str6 = str2;
        if ((i2 & 32) != 0) {
            str3 = depositWithdrawChainInfoReq.walletType;
        }
        String str7 = str3;
        if ((i2 & 64) != 0) {
            str4 = depositWithdrawChainInfoReq.web3AccountId;
        }
        return depositWithdrawChainInfoReq.copy(i, z2, bool2, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.withLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositWithdrawChainInfoReq copy(int i, boolean z, Boolean bool, String str, String str2, String str3, String str4) {
        return new DepositWithdrawChainInfoReq(i, z, bool, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositWithdrawChainInfoReq)) {
            return false;
        }
        DepositWithdrawChainInfoReq depositWithdrawChainInfoReq = (DepositWithdrawChainInfoReq) obj;
        return this.currencyId == depositWithdrawChainInfoReq.currencyId && this.isWithdraw == depositWithdrawChainInfoReq.isWithdraw && Intrinsics.EZpvd(this.withLimit, depositWithdrawChainInfoReq.withLimit) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) depositWithdrawChainInfoReq.valuationUnit) && Intrinsics.EZpvd((Object) this.address, (Object) depositWithdrawChainInfoReq.address) && Intrinsics.EZpvd((Object) this.walletType, (Object) depositWithdrawChainInfoReq.walletType) && Intrinsics.EZpvd((Object) this.web3AccountId, (Object) depositWithdrawChainInfoReq.web3AccountId);
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
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountId() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithLimit() {
        return this.withLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        int iHashCode2 = Boolean.hashCode(this.isWithdraw);
        Boolean bool = this.withLimit;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.valuationUnit;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.walletType;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.web3AccountId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
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
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(String str) {
        this.walletType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AccountId(String str) {
        this.web3AccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithLimit(Boolean bool) {
        this.withLimit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositWithdrawChainInfoReq(currencyId=" + this.currencyId + ", isWithdraw=" + this.isWithdraw + ", withLimit=" + this.withLimit + ", valuationUnit=" + this.valuationUnit + ", address=" + this.address + ", walletType=" + this.walletType + ", web3AccountId=" + this.web3AccountId + ")";
    }

    public DepositWithdrawChainInfoReq(int i, boolean z, Boolean bool, String str, String str2, String str3, String str4) {
        this.currencyId = i;
        this.isWithdraw = z;
        this.withLimit = bool;
        this.valuationUnit = str;
        this.address = str2;
        this.walletType = str3;
        this.web3AccountId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 boolean)
  (r13v0 java.lang.Boolean)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(int, boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.assets.backend.api.model.DepositWithdrawChainInfoReq.<init>(int, boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DepositWithdrawChainInfoReq(int i, boolean z, Boolean bool, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, bool, str, str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4);
    }
}

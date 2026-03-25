package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositAddressReq {
    public static final int $stable = 8;
    private int currencyId;
    private Integer subCurrencyId;
    private final Boolean xAddrEnabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositAddressReq copy$default(DepositAddressReq depositAddressReq, int i, Integer num, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositAddressReq.currencyId;
        }
        if ((i2 & 2) != 0) {
            num = depositAddressReq.subCurrencyId;
        }
        if ((i2 & 4) != 0) {
            bool = depositAddressReq.xAddrEnabled;
        }
        return depositAddressReq.copy(i, num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.xAddrEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositAddressReq copy(int i, Integer num, Boolean bool) {
        return new DepositAddressReq(i, num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAddressReq)) {
            return false;
        }
        DepositAddressReq depositAddressReq = (DepositAddressReq) obj;
        return this.currencyId == depositAddressReq.currencyId && Intrinsics.EZpvd(this.subCurrencyId, depositAddressReq.subCurrencyId) && Intrinsics.EZpvd(this.xAddrEnabled, depositAddressReq.xAddrEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getXAddrEnabled() {
        return this.xAddrEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        Integer num = this.subCurrencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool = this.xAddrEnabled;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(Integer num) {
        this.subCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositAddressReq(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", xAddrEnabled=" + this.xAddrEnabled + ")";
    }

    public DepositAddressReq(int i, Integer num, Boolean bool) {
        this.currencyId = i;
        this.subCurrencyId = num;
        this.xAddrEnabled = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.Integer)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(int, java.lang.Integer, java.lang.Boolean):void (m)] (LINE:79) call: com.okinc.assets.backend.api.model.DepositAddressReq.<init>(int, java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DepositAddressReq(int i, Integer num, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i2 & 4) != 0 ? Boolean.TRUE : bool);
    }
}

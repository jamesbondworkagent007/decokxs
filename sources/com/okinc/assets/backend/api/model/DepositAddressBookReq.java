package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositAddressBookReq {
    public static final int $stable = 8;
    private Boolean all;
    private int currencyId;
    public Boolean isIsolation;
    private Integer subCurrencyId;
    private final Boolean xAddrEnabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositAddressBookReq copy$default(DepositAddressBookReq depositAddressBookReq, int i, Boolean bool, Integer num, Boolean bool2, Boolean bool3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositAddressBookReq.currencyId;
        }
        if ((i2 & 2) != 0) {
            bool = depositAddressBookReq.isIsolation;
        }
        Boolean bool4 = bool;
        if ((i2 & 4) != 0) {
            num = depositAddressBookReq.subCurrencyId;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            bool2 = depositAddressBookReq.all;
        }
        Boolean bool5 = bool2;
        if ((i2 & 16) != 0) {
            bool3 = depositAddressBookReq.xAddrEnabled;
        }
        return depositAddressBookReq.copy(i, bool4, num2, bool5, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isIsolation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.all;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.xAddrEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositAddressBookReq copy(int i, Boolean bool, Integer num, Boolean bool2, Boolean bool3) {
        return new DepositAddressBookReq(i, bool, num, bool2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAddressBookReq)) {
            return false;
        }
        DepositAddressBookReq depositAddressBookReq = (DepositAddressBookReq) obj;
        return this.currencyId == depositAddressBookReq.currencyId && Intrinsics.EZpvd(this.isIsolation, depositAddressBookReq.isIsolation) && Intrinsics.EZpvd(this.subCurrencyId, depositAddressBookReq.subCurrencyId) && Intrinsics.EZpvd(this.all, depositAddressBookReq.all) && Intrinsics.EZpvd(this.xAddrEnabled, depositAddressBookReq.xAddrEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAll() {
        return this.all;
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
        Boolean bool = this.isIsolation;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.subCurrencyId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.all;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.xAddrEnabled;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAll(Boolean bool) {
        this.all = bool;
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
        return "DepositAddressBookReq(currencyId=" + this.currencyId + ", isIsolation=" + this.isIsolation + ", subCurrencyId=" + this.subCurrencyId + ", all=" + this.all + ", xAddrEnabled=" + this.xAddrEnabled + ")";
    }

    public DepositAddressBookReq(int i, Boolean bool, Integer num, Boolean bool2, Boolean bool3) {
        this.currencyId = i;
        this.isIsolation = bool;
        this.subCurrencyId = num;
        this.all = bool2;
        this.xAddrEnabled = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 int)
  (r8v0 java.lang.Boolean)
  (r9v0 java.lang.Integer)
  (r10v0 java.lang.Boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(int, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:69) call: com.okinc.assets.backend.api.model.DepositAddressBookReq.<init>(int, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DepositAddressBookReq(int i, Boolean bool, Integer num, Boolean bool2, Boolean bool3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bool, num, bool2, (i2 & 16) != 0 ? Boolean.TRUE : bool3);
    }
}

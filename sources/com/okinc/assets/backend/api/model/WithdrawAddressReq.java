package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressReq {
    public static final int $stable = 8;
    private int currencyId;
    private Integer subCurrencyId;
    private int type;
    private final boolean upgradeAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawAddressReq copy$default(WithdrawAddressReq withdrawAddressReq, int i, int i2, Integer num, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = withdrawAddressReq.currencyId;
        }
        if ((i3 & 2) != 0) {
            i2 = withdrawAddressReq.type;
        }
        if ((i3 & 4) != 0) {
            num = withdrawAddressReq.subCurrencyId;
        }
        if ((i3 & 8) != 0) {
            z = withdrawAddressReq.upgradeAddress;
        }
        return withdrawAddressReq.copy(i, i2, num, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.upgradeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddressReq copy(int i, int i2, Integer num, boolean z) {
        return new WithdrawAddressReq(i, i2, num, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawAddressReq)) {
            return false;
        }
        WithdrawAddressReq withdrawAddressReq = (WithdrawAddressReq) obj;
        return this.currencyId == withdrawAddressReq.currencyId && this.type == withdrawAddressReq.type && Intrinsics.EZpvd(this.subCurrencyId, withdrawAddressReq.subCurrencyId) && this.upgradeAddress == withdrawAddressReq.upgradeAddress;
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
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUpgradeAddress() {
        return this.upgradeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        int iHashCode2 = Integer.hashCode(this.type);
        Integer num = this.subCurrencyId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.upgradeAddress);
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
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddressReq(currencyId=" + this.currencyId + ", type=" + this.type + ", subCurrencyId=" + this.subCurrencyId + ", upgradeAddress=" + this.upgradeAddress + ")";
    }

    public WithdrawAddressReq(int i, int i2, Integer num, boolean z) {
        this.currencyId = i;
        this.type = i2;
        this.subCurrencyId = num;
        this.upgradeAddress = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 java.lang.Integer)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, int, java.lang.Integer, boolean):void (m)] (LINE:60) call: com.okinc.assets.backend.api.model.WithdrawAddressReq.<init>(int, int, java.lang.Integer, boolean):void type: THIS */
    public /* synthetic */ WithdrawAddressReq(int i, int i2, Integer num, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, num, (i3 & 8) != 0 ? false : z);
    }
}

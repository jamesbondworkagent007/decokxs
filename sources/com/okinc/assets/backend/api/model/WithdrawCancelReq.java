package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawCancelReq {
    public static final int $stable = 8;
    private int currencyId;
    private long id;
    private final boolean invalidAsset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawCancelReq() {
        this(0L, 0, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawCancelReq copy$default(WithdrawCancelReq withdrawCancelReq, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = withdrawCancelReq.id;
        }
        if ((i2 & 2) != 0) {
            i = withdrawCancelReq.currencyId;
        }
        if ((i2 & 4) != 0) {
            z = withdrawCancelReq.invalidAsset;
        }
        return withdrawCancelReq.copy(j, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawCancelReq copy(long j, int i, boolean z) {
        return new WithdrawCancelReq(j, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawCancelReq)) {
            return false;
        }
        WithdrawCancelReq withdrawCancelReq = (WithdrawCancelReq) obj;
        return this.id == withdrawCancelReq.id && this.currencyId == withdrawCancelReq.currencyId && this.invalidAsset == withdrawCancelReq.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + Integer.hashCode(this.currencyId)) * 31) + Boolean.hashCode(this.invalidAsset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawCancelReq(id=" + this.id + ", currencyId=" + this.currencyId + ", invalidAsset=" + this.invalidAsset + ")";
    }

    public WithdrawCancelReq(long j, int i, boolean z) {
        this.id = j;
        this.currencyId = i;
        this.invalidAsset = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(long, int, boolean):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.WithdrawCancelReq.<init>(long, int, boolean):void type: THIS */
    public /* synthetic */ WithdrawCancelReq(long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}

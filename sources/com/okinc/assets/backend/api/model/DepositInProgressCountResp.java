package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositInProgressCountResp {
    public static final int $stable = 8;
    private int count;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositInProgressCountResp() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositInProgressCountResp copy$default(DepositInProgressCountResp depositInProgressCountResp, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositInProgressCountResp.count;
        }
        return depositInProgressCountResp.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositInProgressCountResp copy(int i) {
        return new DepositInProgressCountResp(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositInProgressCountResp) && this.count == ((DepositInProgressCountResp) obj).count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(int i) {
        this.count = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositInProgressCountResp(count=" + this.count + ")";
    }

    public DepositInProgressCountResp(int i) {
        this.count = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.DepositInProgressCountResp.<init>(int):void type: THIS */
    public /* synthetic */ DepositInProgressCountResp(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

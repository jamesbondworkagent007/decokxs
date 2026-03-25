package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckRepeatResult {
    public static final int $stable = 0;
    private final boolean canOrder;
    private final ConflictDetailBean conflictDetails;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckRepeatResult() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckRepeatResult copy$default(CheckRepeatResult checkRepeatResult, boolean z, ConflictDetailBean conflictDetailBean, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkRepeatResult.canOrder;
        }
        if ((i & 2) != 0) {
            conflictDetailBean = checkRepeatResult.conflictDetails;
        }
        return checkRepeatResult.copy(z, conflictDetailBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.canOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConflictDetailBean component2() {
        return this.conflictDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckRepeatResult copy(boolean z, ConflictDetailBean conflictDetailBean) {
        return new CheckRepeatResult(z, conflictDetailBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckRepeatResult)) {
            return false;
        }
        CheckRepeatResult checkRepeatResult = (CheckRepeatResult) obj;
        return this.canOrder == checkRepeatResult.canOrder && Intrinsics.EZpvd(this.conflictDetails, checkRepeatResult.conflictDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanOrder() {
        return this.canOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConflictDetailBean getConflictDetails() {
        return this.conflictDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canOrder);
        ConflictDetailBean conflictDetailBean = this.conflictDetails;
        return (iHashCode * 31) + (conflictDetailBean == null ? 0 : conflictDetailBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckRepeatResult(canOrder=" + this.canOrder + ", conflictDetails=" + this.conflictDetails + ")";
    }

    public CheckRepeatResult(boolean z, ConflictDetailBean conflictDetailBean) {
        this.canOrder = z;
        this.conflictDetails = conflictDetailBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean) : (r2v0 com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean))
 A[MD:(boolean, com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean):void (m)] (LINE:8) call: com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult.<init>(boolean, com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean):void type: THIS */
    public /* synthetic */ CheckRepeatResult(boolean z, ConflictDetailBean conflictDetailBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : conflictDetailBean);
    }
}

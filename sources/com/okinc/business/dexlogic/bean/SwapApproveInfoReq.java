package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapApproveInfoReq {
    public static final int $stable = 8;
    private final ApproveDataParam dexApproveDataParam;
    private final MultiApproveInfoParam dexMultiApproveInfoParam;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapApproveInfoReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwapApproveInfoReq copy$default(SwapApproveInfoReq swapApproveInfoReq, ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam, int i, Object obj) {
        if ((i & 1) != 0) {
            approveDataParam = swapApproveInfoReq.dexApproveDataParam;
        }
        if ((i & 2) != 0) {
            multiApproveInfoParam = swapApproveInfoReq.dexMultiApproveInfoParam;
        }
        return swapApproveInfoReq.copy(approveDataParam, multiApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveDataParam component1() {
        return this.dexApproveDataParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiApproveInfoParam component2() {
        return this.dexMultiApproveInfoParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapApproveInfoReq copy(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam) {
        return new SwapApproveInfoReq(approveDataParam, multiApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwapApproveInfoReq)) {
            return false;
        }
        SwapApproveInfoReq swapApproveInfoReq = (SwapApproveInfoReq) obj;
        return Intrinsics.EZpvd(this.dexApproveDataParam, swapApproveInfoReq.dexApproveDataParam) && Intrinsics.EZpvd(this.dexMultiApproveInfoParam, swapApproveInfoReq.dexMultiApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveDataParam getDexApproveDataParam() {
        return this.dexApproveDataParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiApproveInfoParam getDexMultiApproveInfoParam() {
        return this.dexMultiApproveInfoParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ApproveDataParam approveDataParam = this.dexApproveDataParam;
        int iHashCode = approveDataParam == null ? 0 : approveDataParam.hashCode();
        MultiApproveInfoParam multiApproveInfoParam = this.dexMultiApproveInfoParam;
        return (iHashCode * 31) + (multiApproveInfoParam != null ? multiApproveInfoParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapApproveInfoReq(dexApproveDataParam=" + this.dexApproveDataParam + ", dexMultiApproveInfoParam=" + this.dexMultiApproveInfoParam + ")";
    }

    public SwapApproveInfoReq(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam) {
        this.dexApproveDataParam = approveDataParam;
        this.dexMultiApproveInfoParam = multiApproveInfoParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ApproveDataParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ApproveDataParam) : (r2v0 com.okinc.business.dexlogic.bean.ApproveDataParam))
  (wrap:com.okinc.business.dexlogic.bean.MultiApproveInfoParam:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.MultiApproveInfoParam) : (r3v0 com.okinc.business.dexlogic.bean.MultiApproveInfoParam))
 A[MD:(com.okinc.business.dexlogic.bean.ApproveDataParam, com.okinc.business.dexlogic.bean.MultiApproveInfoParam):void (m)] (LINE:2297) call: com.okinc.business.dexlogic.bean.SwapApproveInfoReq.<init>(com.okinc.business.dexlogic.bean.ApproveDataParam, com.okinc.business.dexlogic.bean.MultiApproveInfoParam):void type: THIS */
    public /* synthetic */ SwapApproveInfoReq(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : approveDataParam, (i & 2) != 0 ? null : multiApproveInfoParam);
    }
}

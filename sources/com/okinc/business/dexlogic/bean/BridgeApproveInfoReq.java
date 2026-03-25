package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgeApproveInfoReq {
    public static final int $stable = 8;
    private final ApproveDataParam dexBridgeApproveDataParam;
    private final MultiApproveInfoParam dexBridgeApproveInfoParam;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BridgeApproveInfoReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeApproveInfoReq copy$default(BridgeApproveInfoReq bridgeApproveInfoReq, ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam, int i, Object obj) {
        if ((i & 1) != 0) {
            approveDataParam = bridgeApproveInfoReq.dexBridgeApproveDataParam;
        }
        if ((i & 2) != 0) {
            multiApproveInfoParam = bridgeApproveInfoReq.dexBridgeApproveInfoParam;
        }
        return bridgeApproveInfoReq.copy(approveDataParam, multiApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveDataParam component1() {
        return this.dexBridgeApproveDataParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiApproveInfoParam component2() {
        return this.dexBridgeApproveInfoParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeApproveInfoReq copy(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam) {
        return new BridgeApproveInfoReq(approveDataParam, multiApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeApproveInfoReq)) {
            return false;
        }
        BridgeApproveInfoReq bridgeApproveInfoReq = (BridgeApproveInfoReq) obj;
        return Intrinsics.EZpvd(this.dexBridgeApproveDataParam, bridgeApproveInfoReq.dexBridgeApproveDataParam) && Intrinsics.EZpvd(this.dexBridgeApproveInfoParam, bridgeApproveInfoReq.dexBridgeApproveInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveDataParam getDexBridgeApproveDataParam() {
        return this.dexBridgeApproveDataParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiApproveInfoParam getDexBridgeApproveInfoParam() {
        return this.dexBridgeApproveInfoParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ApproveDataParam approveDataParam = this.dexBridgeApproveDataParam;
        int iHashCode = approveDataParam == null ? 0 : approveDataParam.hashCode();
        MultiApproveInfoParam multiApproveInfoParam = this.dexBridgeApproveInfoParam;
        return (iHashCode * 31) + (multiApproveInfoParam != null ? multiApproveInfoParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeApproveInfoReq(dexBridgeApproveDataParam=" + this.dexBridgeApproveDataParam + ", dexBridgeApproveInfoParam=" + this.dexBridgeApproveInfoParam + ")";
    }

    public BridgeApproveInfoReq(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam) {
        this.dexBridgeApproveDataParam = approveDataParam;
        this.dexBridgeApproveInfoParam = multiApproveInfoParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ApproveDataParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ApproveDataParam) : (r2v0 com.okinc.business.dexlogic.bean.ApproveDataParam))
  (wrap:com.okinc.business.dexlogic.bean.MultiApproveInfoParam:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.MultiApproveInfoParam) : (r3v0 com.okinc.business.dexlogic.bean.MultiApproveInfoParam))
 A[MD:(com.okinc.business.dexlogic.bean.ApproveDataParam, com.okinc.business.dexlogic.bean.MultiApproveInfoParam):void (m)] (LINE:2303) call: com.okinc.business.dexlogic.bean.BridgeApproveInfoReq.<init>(com.okinc.business.dexlogic.bean.ApproveDataParam, com.okinc.business.dexlogic.bean.MultiApproveInfoParam):void type: THIS */
    public /* synthetic */ BridgeApproveInfoReq(ApproveDataParam approveDataParam, MultiApproveInfoParam multiApproveInfoParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : approveDataParam, (i & 2) != 0 ? null : multiApproveInfoParam);
    }
}

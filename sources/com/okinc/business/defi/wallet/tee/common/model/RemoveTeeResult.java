package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class RemoveTeeResult {
    public static final int $stable = 0;
    private final TeeReqAndResultData teeResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RemoveTeeResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RemoveTeeResult copy$default(RemoveTeeResult removeTeeResult, TeeReqAndResultData teeReqAndResultData, int i, Object obj) {
        if ((i & 1) != 0) {
            teeReqAndResultData = removeTeeResult.teeResult;
        }
        return removeTeeResult.copy(teeReqAndResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeReqAndResultData component1() {
        return this.teeResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoveTeeResult copy(TeeReqAndResultData teeReqAndResultData) {
        return new RemoveTeeResult(teeReqAndResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoveTeeResult) && Intrinsics.EZpvd(this.teeResult, ((RemoveTeeResult) obj).teeResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeReqAndResultData getTeeResult() {
        return this.teeResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TeeReqAndResultData teeReqAndResultData = this.teeResult;
        if (teeReqAndResultData == null) {
            return 0;
        }
        return teeReqAndResultData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RemoveTeeResult(teeResult=" + this.teeResult + ")";
    }

    public RemoveTeeResult(TeeReqAndResultData teeReqAndResultData) {
        this.teeResult = teeReqAndResultData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData) : (r1v0 com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData))
 A[MD:(com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData):void (m)] (LINE:191) call: com.okinc.business.defi.wallet.tee.common.model.RemoveTeeResult.<init>(com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData):void type: THIS */
    public /* synthetic */ RemoveTeeResult(TeeReqAndResultData teeReqAndResultData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : teeReqAndResultData);
    }
}

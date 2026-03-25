package com.okinc.business.dex.trade.common.boost.model;

import com.okinc.business.dex.trade.order.domain.model.BoostInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class LimitOrderConfirmResponse {
    public static final int $stable = 0;
    private final BoostInfo boostInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderConfirmResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderConfirmResponse copy$default(LimitOrderConfirmResponse limitOrderConfirmResponse, BoostInfo boostInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            boostInfo = limitOrderConfirmResponse.boostInfo;
        }
        return limitOrderConfirmResponse.copy(boostInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostInfo component1() {
        return this.boostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderConfirmResponse copy(BoostInfo boostInfo) {
        return new LimitOrderConfirmResponse(boostInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitOrderConfirmResponse) && Intrinsics.EZpvd(this.boostInfo, ((LimitOrderConfirmResponse) obj).boostInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostInfo getBoostInfo() {
        return this.boostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BoostInfo boostInfo = this.boostInfo;
        if (boostInfo == null) {
            return 0;
        }
        return boostInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderConfirmResponse(boostInfo=" + this.boostInfo + ")";
    }

    public LimitOrderConfirmResponse(BoostInfo boostInfo) {
        this.boostInfo = boostInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.order.domain.model.BoostInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.order.domain.model.BoostInfo) : (r1v0 com.okinc.business.dex.trade.order.domain.model.BoostInfo))
 A[MD:(com.okinc.business.dex.trade.order.domain.model.BoostInfo):void (m)] (LINE:13) call: com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmResponse.<init>(com.okinc.business.dex.trade.order.domain.model.BoostInfo):void type: THIS */
    public /* synthetic */ LimitOrderConfirmResponse(BoostInfo boostInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : boostInfo);
    }
}

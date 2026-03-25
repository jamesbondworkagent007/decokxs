package com.okinc.business.trade.features.home.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class BridgeForceUpdateState {
    public static final int $stable = 0;
    private final boolean bridgeForceUpgrade;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BridgeForceUpdateState() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeForceUpdateState copy$default(BridgeForceUpdateState bridgeForceUpdateState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bridgeForceUpdateState.bridgeForceUpgrade;
        }
        return bridgeForceUpdateState.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.bridgeForceUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeForceUpdateState copy(boolean z) {
        return new BridgeForceUpdateState(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BridgeForceUpdateState) && this.bridgeForceUpgrade == ((BridgeForceUpdateState) obj).bridgeForceUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBridgeForceUpgrade() {
        return this.bridgeForceUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.bridgeForceUpgrade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeForceUpdateState(bridgeForceUpgrade=" + this.bridgeForceUpgrade + ")";
    }

    public BridgeForceUpdateState(boolean z) {
        this.bridgeForceUpgrade = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:51) call: com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState.<init>(boolean):void type: THIS */
    public /* synthetic */ BridgeForceUpdateState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

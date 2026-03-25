package com.okinc.business.trade.features.home.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleForceUpdateState {
    public static final int $stable = 0;
    private final int advancedModeForceUpdateState;
    private final int memeModeForceUpdateState;
    private final int simpleModeForceUpdateState;
    private final int swapModeForceUpdateState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleForceUpdateState() {
        this(0, 0, 0, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleForceUpdateState copy$default(SingleForceUpdateState singleForceUpdateState, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = singleForceUpdateState.advancedModeForceUpdateState;
        }
        if ((i5 & 2) != 0) {
            i2 = singleForceUpdateState.memeModeForceUpdateState;
        }
        if ((i5 & 4) != 0) {
            i3 = singleForceUpdateState.simpleModeForceUpdateState;
        }
        if ((i5 & 8) != 0) {
            i4 = singleForceUpdateState.swapModeForceUpdateState;
        }
        return singleForceUpdateState.copy(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.advancedModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.memeModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.simpleModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.swapModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleForceUpdateState copy(int i, int i2, int i3, int i4) {
        return new SingleForceUpdateState(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleForceUpdateState)) {
            return false;
        }
        SingleForceUpdateState singleForceUpdateState = (SingleForceUpdateState) obj;
        return this.advancedModeForceUpdateState == singleForceUpdateState.advancedModeForceUpdateState && this.memeModeForceUpdateState == singleForceUpdateState.memeModeForceUpdateState && this.simpleModeForceUpdateState == singleForceUpdateState.simpleModeForceUpdateState && this.swapModeForceUpdateState == singleForceUpdateState.swapModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAdvancedModeForceUpdateState() {
        return this.advancedModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMemeModeForceUpdateState() {
        return this.memeModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSimpleModeForceUpdateState() {
        return this.simpleModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwapModeForceUpdateState() {
        return this.swapModeForceUpdateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.advancedModeForceUpdateState) * 31) + Integer.hashCode(this.memeModeForceUpdateState)) * 31) + Integer.hashCode(this.simpleModeForceUpdateState)) * 31) + Integer.hashCode(this.swapModeForceUpdateState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleForceUpdateState(advancedModeForceUpdateState=" + this.advancedModeForceUpdateState + ", memeModeForceUpdateState=" + this.memeModeForceUpdateState + ", simpleModeForceUpdateState=" + this.simpleModeForceUpdateState + ", swapModeForceUpdateState=" + this.swapModeForceUpdateState + ")";
    }

    public SingleForceUpdateState(int i, int i2, int i3, int i4) {
        this.advancedModeForceUpdateState = i;
        this.memeModeForceUpdateState = i2;
        this.simpleModeForceUpdateState = i3;
        this.swapModeForceUpdateState = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(int, int, int, int):void (m)] (LINE:43) call: com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState.<init>(int, int, int, int):void type: THIS */
    public /* synthetic */ SingleForceUpdateState(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}

package com.okinc.business.dexui.main.swap.route.dag.model.lane;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class LaneLayoutConfig {
    public static final int $stable = 0;
    private final boolean preferNoDownstreamSplitOnTop;
    private final boolean sortFirstByWeight;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public LaneLayoutConfig() {
        boolean z = false;
        this(z, z, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LaneLayoutConfig copy$default(LaneLayoutConfig laneLayoutConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = laneLayoutConfig.sortFirstByWeight;
        }
        if ((i & 2) != 0) {
            z2 = laneLayoutConfig.preferNoDownstreamSplitOnTop;
        }
        return laneLayoutConfig.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.sortFirstByWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.preferNoDownstreamSplitOnTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LaneLayoutConfig copy(boolean z, boolean z2) {
        return new LaneLayoutConfig(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneLayoutConfig)) {
            return false;
        }
        LaneLayoutConfig laneLayoutConfig = (LaneLayoutConfig) obj;
        return this.sortFirstByWeight == laneLayoutConfig.sortFirstByWeight && this.preferNoDownstreamSplitOnTop == laneLayoutConfig.preferNoDownstreamSplitOnTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPreferNoDownstreamSplitOnTop() {
        return this.preferNoDownstreamSplitOnTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSortFirstByWeight() {
        return this.sortFirstByWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.sortFirstByWeight) * 31) + Boolean.hashCode(this.preferNoDownstreamSplitOnTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LaneLayoutConfig(sortFirstByWeight=" + this.sortFirstByWeight + ", preferNoDownstreamSplitOnTop=" + this.preferNoDownstreamSplitOnTop + ")";
    }

    public LaneLayoutConfig(boolean z, boolean z2) {
        this.sortFirstByWeight = z;
        this.preferNoDownstreamSplitOnTop = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:14) call: com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ LaneLayoutConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }
}

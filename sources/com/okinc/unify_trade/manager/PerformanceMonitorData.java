package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class PerformanceMonitorData {
    public static final int $stable = 0;
    private final long cTime;
    private final int frameRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PerformanceMonitorData() {
        this(0L, 0, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PerformanceMonitorData copy$default(PerformanceMonitorData performanceMonitorData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = performanceMonitorData.cTime;
        }
        if ((i2 & 2) != 0) {
            i = performanceMonitorData.frameRate;
        }
        return performanceMonitorData.copy(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.frameRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PerformanceMonitorData copy(long j, int i) {
        return new PerformanceMonitorData(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMonitorData)) {
            return false;
        }
        PerformanceMonitorData performanceMonitorData = (PerformanceMonitorData) obj;
        return this.cTime == performanceMonitorData.cTime && this.frameRate == performanceMonitorData.frameRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.cTime) * 31) + Integer.hashCode(this.frameRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PerformanceMonitorData(cTime=" + this.cTime + ", frameRate=" + this.frameRate + ")";
    }

    public PerformanceMonitorData(long j, int i) {
        this.cTime = j;
        this.frameRate = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(long, int):void (m)] (LINE:144) call: com.okinc.unify_trade.manager.PerformanceMonitorData.<init>(long, int):void type: THIS */
    public /* synthetic */ PerformanceMonitorData(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}

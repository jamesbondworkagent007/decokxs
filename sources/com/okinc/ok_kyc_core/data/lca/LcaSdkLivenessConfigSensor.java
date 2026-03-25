package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfigSensor {
    public static final int $stable = 0;
    private final Long motionSamplingIntervalFarToCloseMs;
    private final Long motionSamplingIntervalMs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaSdkLivenessConfigSensor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaSdkLivenessConfigSensor copy$default(LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lcaSdkLivenessConfigSensor.motionSamplingIntervalMs;
        }
        if ((i & 2) != 0) {
            l2 = lcaSdkLivenessConfigSensor.motionSamplingIntervalFarToCloseMs;
        }
        return lcaSdkLivenessConfigSensor.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.motionSamplingIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.motionSamplingIntervalFarToCloseMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigSensor copy(Long l, Long l2) {
        return new LcaSdkLivenessConfigSensor(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfigSensor)) {
            return false;
        }
        LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor = (LcaSdkLivenessConfigSensor) obj;
        return Intrinsics.EZpvd(this.motionSamplingIntervalMs, lcaSdkLivenessConfigSensor.motionSamplingIntervalMs) && Intrinsics.EZpvd(this.motionSamplingIntervalFarToCloseMs, lcaSdkLivenessConfigSensor.motionSamplingIntervalFarToCloseMs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMotionSamplingIntervalFarToCloseMs() {
        return this.motionSamplingIntervalFarToCloseMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMotionSamplingIntervalMs() {
        return this.motionSamplingIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.motionSamplingIntervalMs;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.motionSamplingIntervalFarToCloseMs;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfigSensor(motionSamplingIntervalMs=" + this.motionSamplingIntervalMs + ", motionSamplingIntervalFarToCloseMs=" + this.motionSamplingIntervalFarToCloseMs + ")";
    }

    public LcaSdkLivenessConfigSensor(Long l, Long l2) {
        this.motionSamplingIntervalMs = l;
        this.motionSamplingIntervalFarToCloseMs = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long):void (m)] (LINE:39) call: com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor.<init>(java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ LcaSdkLivenessConfigSensor(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}

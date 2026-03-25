package com.okinc.business.dex.trade.common.boost.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BoostEstimateVolumeResponse {
    public static final int $stable = 0;
    private final String boostVolume;
    private final String boostWeight;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BoostEstimateVolumeResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoostEstimateVolumeResponse copy$default(BoostEstimateVolumeResponse boostEstimateVolumeResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boostEstimateVolumeResponse.boostVolume;
        }
        if ((i & 2) != 0) {
            str2 = boostEstimateVolumeResponse.boostWeight;
        }
        return boostEstimateVolumeResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostEstimateVolumeResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BoostEstimateVolumeResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostEstimateVolumeResponse)) {
            return false;
        }
        BoostEstimateVolumeResponse boostEstimateVolumeResponse = (BoostEstimateVolumeResponse) obj;
        return Intrinsics.EZpvd((Object) this.boostVolume, (Object) boostEstimateVolumeResponse.boostVolume) && Intrinsics.EZpvd((Object) this.boostWeight, (Object) boostEstimateVolumeResponse.boostWeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostVolume() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostWeight() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.boostVolume.hashCode() * 31) + this.boostWeight.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoostEstimateVolumeResponse(boostVolume=" + this.boostVolume + ", boostWeight=" + this.boostWeight + ")";
    }

    public BoostEstimateVolumeResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.boostVolume = str;
        this.boostWeight = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BoostEstimateVolumeResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

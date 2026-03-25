package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfigOvalParameters {
    public static final int $stable = 0;
    private final Float faceOvalHeightRatio;
    private final Float faceOvalWidthScreenRatio;
    private final Float farOvalHeightRatio;
    private final Float farOvalWidthScreenRatio;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaSdkLivenessConfigOvalParameters copy$default(LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters, Float f, Float f2, Float f3, Float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lcaSdkLivenessConfigOvalParameters.farOvalWidthScreenRatio;
        }
        if ((i & 2) != 0) {
            f2 = lcaSdkLivenessConfigOvalParameters.farOvalHeightRatio;
        }
        if ((i & 4) != 0) {
            f3 = lcaSdkLivenessConfigOvalParameters.faceOvalWidthScreenRatio;
        }
        if ((i & 8) != 0) {
            f4 = lcaSdkLivenessConfigOvalParameters.faceOvalHeightRatio;
        }
        return lcaSdkLivenessConfigOvalParameters.copy(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.farOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.farOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.faceOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.faceOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigOvalParameters copy(Float f, Float f2, Float f3, Float f4) {
        return new LcaSdkLivenessConfigOvalParameters(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfigOvalParameters)) {
            return false;
        }
        LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters = (LcaSdkLivenessConfigOvalParameters) obj;
        return Intrinsics.EZpvd(this.farOvalWidthScreenRatio, lcaSdkLivenessConfigOvalParameters.farOvalWidthScreenRatio) && Intrinsics.EZpvd(this.farOvalHeightRatio, lcaSdkLivenessConfigOvalParameters.farOvalHeightRatio) && Intrinsics.EZpvd(this.faceOvalWidthScreenRatio, lcaSdkLivenessConfigOvalParameters.faceOvalWidthScreenRatio) && Intrinsics.EZpvd(this.faceOvalHeightRatio, lcaSdkLivenessConfigOvalParameters.faceOvalHeightRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceOvalHeightRatio() {
        return this.faceOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceOvalWidthScreenRatio() {
        return this.faceOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFarOvalHeightRatio() {
        return this.farOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFarOvalWidthScreenRatio() {
        return this.farOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.farOvalWidthScreenRatio;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.farOvalHeightRatio;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.faceOvalWidthScreenRatio;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.faceOvalHeightRatio;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f4 != null ? f4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfigOvalParameters(farOvalWidthScreenRatio=" + this.farOvalWidthScreenRatio + ", farOvalHeightRatio=" + this.farOvalHeightRatio + ", faceOvalWidthScreenRatio=" + this.faceOvalWidthScreenRatio + ", faceOvalHeightRatio=" + this.faceOvalHeightRatio + ")";
    }

    public LcaSdkLivenessConfigOvalParameters(Float f, Float f2, Float f3, Float f4) {
        this.farOvalWidthScreenRatio = f;
        this.farOvalHeightRatio = f2;
        this.faceOvalWidthScreenRatio = f3;
        this.faceOvalHeightRatio = f4;
    }
}

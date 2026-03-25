package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfigFaceQcConfig {
    public static final int $stable = 8;
    private Float faceQcBlockThreshold;
    private Float faceQcBlurThreshold;
    private Float faceQcBrightThreshold;
    private Float faceQcDarkThreshold;
    private Float faceQcOkThreshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaSdkLivenessConfigFaceQcConfig copy$default(LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig, Float f, Float f2, Float f3, Float f4, Float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lcaSdkLivenessConfigFaceQcConfig.faceQcOkThreshold;
        }
        if ((i & 2) != 0) {
            f2 = lcaSdkLivenessConfigFaceQcConfig.faceQcBlurThreshold;
        }
        Float f6 = f2;
        if ((i & 4) != 0) {
            f3 = lcaSdkLivenessConfigFaceQcConfig.faceQcBlockThreshold;
        }
        Float f7 = f3;
        if ((i & 8) != 0) {
            f4 = lcaSdkLivenessConfigFaceQcConfig.faceQcBrightThreshold;
        }
        Float f8 = f4;
        if ((i & 16) != 0) {
            f5 = lcaSdkLivenessConfigFaceQcConfig.faceQcDarkThreshold;
        }
        return lcaSdkLivenessConfigFaceQcConfig.copy(f, f6, f7, f8, f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.faceQcOkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.faceQcBlurThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.faceQcBlockThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.faceQcBrightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.faceQcDarkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceQcConfig copy(Float f, Float f2, Float f3, Float f4, Float f5) {
        return new LcaSdkLivenessConfigFaceQcConfig(f, f2, f3, f4, f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfigFaceQcConfig)) {
            return false;
        }
        LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig = (LcaSdkLivenessConfigFaceQcConfig) obj;
        return Intrinsics.EZpvd(this.faceQcOkThreshold, lcaSdkLivenessConfigFaceQcConfig.faceQcOkThreshold) && Intrinsics.EZpvd(this.faceQcBlurThreshold, lcaSdkLivenessConfigFaceQcConfig.faceQcBlurThreshold) && Intrinsics.EZpvd(this.faceQcBlockThreshold, lcaSdkLivenessConfigFaceQcConfig.faceQcBlockThreshold) && Intrinsics.EZpvd(this.faceQcBrightThreshold, lcaSdkLivenessConfigFaceQcConfig.faceQcBrightThreshold) && Intrinsics.EZpvd(this.faceQcDarkThreshold, lcaSdkLivenessConfigFaceQcConfig.faceQcDarkThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBlockThreshold() {
        return this.faceQcBlockThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBlurThreshold() {
        return this.faceQcBlurThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBrightThreshold() {
        return this.faceQcBrightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcDarkThreshold() {
        return this.faceQcDarkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcOkThreshold() {
        return this.faceQcOkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.faceQcOkThreshold;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.faceQcBlurThreshold;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.faceQcBlockThreshold;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.faceQcBrightThreshold;
        int iHashCode4 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.faceQcDarkThreshold;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f5 != null ? f5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceQcBlockThreshold(Float f) {
        this.faceQcBlockThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceQcBlurThreshold(Float f) {
        this.faceQcBlurThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceQcBrightThreshold(Float f) {
        this.faceQcBrightThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceQcDarkThreshold(Float f) {
        this.faceQcDarkThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceQcOkThreshold(Float f) {
        this.faceQcOkThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfigFaceQcConfig(faceQcOkThreshold=" + this.faceQcOkThreshold + ", faceQcBlurThreshold=" + this.faceQcBlurThreshold + ", faceQcBlockThreshold=" + this.faceQcBlockThreshold + ", faceQcBrightThreshold=" + this.faceQcBrightThreshold + ", faceQcDarkThreshold=" + this.faceQcDarkThreshold + ")";
    }

    public LcaSdkLivenessConfigFaceQcConfig(Float f, Float f2, Float f3, Float f4, Float f5) {
        this.faceQcOkThreshold = f;
        this.faceQcBlurThreshold = f2;
        this.faceQcBlockThreshold = f3;
        this.faceQcBrightThreshold = f4;
        this.faceQcDarkThreshold = f5;
    }
}

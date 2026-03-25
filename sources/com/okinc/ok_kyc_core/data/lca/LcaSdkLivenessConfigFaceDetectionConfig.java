package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfigFaceDetectionConfig {
    public static final int $stable = 0;
    private final Long colorFlashingTimeout;
    private final Float faceDetectionScoreThreshold;
    private final Integer farHoldDuration;
    private final Float freshFaceDistanceThresholdMax;
    private final Float freshFaceDistanceThresholdMin;
    private final Integer freshnessQcDelayDuration;
    private final Float initialFaceDistanceThresholdMax;
    private final Float initialFaceDistanceThresholdMin;
    private final Float notFrontalFaceEyeDistanceRatioThreshold;
    private final Float notFrontalFaceHeadPitchAngelThreshold;
    private final Float notFrontalFaceHeadTiltAngelThreshold;
    private final Float onHoldThresholdMaxRatio;
    private final Float onHoldThresholdMinRatio;
    private final Integer ovalFitTimeout;
    private final Float positionBottomThreshold;
    private final Float positionTopThreshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.faceDetectionScoreThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.positionTopThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.positionBottomThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.notFrontalFaceHeadTiltAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.notFrontalFaceHeadPitchAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.notFrontalFaceEyeDistanceRatioThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.freshnessQcDelayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.colorFlashingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.initialFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.initialFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.freshFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.freshFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.farHoldDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.onHoldThresholdMaxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.onHoldThresholdMinRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceDetectionConfig copy(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l) {
        return new LcaSdkLivenessConfigFaceDetectionConfig(f, f2, f3, f4, f5, num, num2, f6, f7, f8, f9, f10, f11, f12, num3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfigFaceDetectionConfig)) {
            return false;
        }
        LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig = (LcaSdkLivenessConfigFaceDetectionConfig) obj;
        return Intrinsics.EZpvd(this.faceDetectionScoreThreshold, lcaSdkLivenessConfigFaceDetectionConfig.faceDetectionScoreThreshold) && Intrinsics.EZpvd(this.initialFaceDistanceThresholdMax, lcaSdkLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMax) && Intrinsics.EZpvd(this.initialFaceDistanceThresholdMin, lcaSdkLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMin) && Intrinsics.EZpvd(this.freshFaceDistanceThresholdMax, lcaSdkLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMax) && Intrinsics.EZpvd(this.freshFaceDistanceThresholdMin, lcaSdkLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMin) && Intrinsics.EZpvd(this.ovalFitTimeout, lcaSdkLivenessConfigFaceDetectionConfig.ovalFitTimeout) && Intrinsics.EZpvd(this.farHoldDuration, lcaSdkLivenessConfigFaceDetectionConfig.farHoldDuration) && Intrinsics.EZpvd(this.onHoldThresholdMaxRatio, lcaSdkLivenessConfigFaceDetectionConfig.onHoldThresholdMaxRatio) && Intrinsics.EZpvd(this.onHoldThresholdMinRatio, lcaSdkLivenessConfigFaceDetectionConfig.onHoldThresholdMinRatio) && Intrinsics.EZpvd(this.positionTopThreshold, lcaSdkLivenessConfigFaceDetectionConfig.positionTopThreshold) && Intrinsics.EZpvd(this.positionBottomThreshold, lcaSdkLivenessConfigFaceDetectionConfig.positionBottomThreshold) && Intrinsics.EZpvd(this.notFrontalFaceHeadTiltAngelThreshold, lcaSdkLivenessConfigFaceDetectionConfig.notFrontalFaceHeadTiltAngelThreshold) && Intrinsics.EZpvd(this.notFrontalFaceHeadPitchAngelThreshold, lcaSdkLivenessConfigFaceDetectionConfig.notFrontalFaceHeadPitchAngelThreshold) && Intrinsics.EZpvd(this.notFrontalFaceEyeDistanceRatioThreshold, lcaSdkLivenessConfigFaceDetectionConfig.notFrontalFaceEyeDistanceRatioThreshold) && Intrinsics.EZpvd(this.freshnessQcDelayDuration, lcaSdkLivenessConfigFaceDetectionConfig.freshnessQcDelayDuration) && Intrinsics.EZpvd(this.colorFlashingTimeout, lcaSdkLivenessConfigFaceDetectionConfig.colorFlashingTimeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getColorFlashingTimeout() {
        return this.colorFlashingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceDetectionScoreThreshold() {
        return this.faceDetectionScoreThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFarHoldDuration() {
        return this.farHoldDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFreshFaceDistanceThresholdMax() {
        return this.freshFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFreshFaceDistanceThresholdMin() {
        return this.freshFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFreshnessQcDelayDuration() {
        return this.freshnessQcDelayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getInitialFaceDistanceThresholdMax() {
        return this.initialFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getInitialFaceDistanceThresholdMin() {
        return this.initialFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceEyeDistanceRatioThreshold() {
        return this.notFrontalFaceEyeDistanceRatioThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceHeadPitchAngelThreshold() {
        return this.notFrontalFaceHeadPitchAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceHeadTiltAngelThreshold() {
        return this.notFrontalFaceHeadTiltAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getOnHoldThresholdMaxRatio() {
        return this.onHoldThresholdMaxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getOnHoldThresholdMinRatio() {
        return this.onHoldThresholdMinRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOvalFitTimeout() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPositionBottomThreshold() {
        return this.positionBottomThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPositionTopThreshold() {
        return this.positionTopThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.faceDetectionScoreThreshold;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.initialFaceDistanceThresholdMax;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.initialFaceDistanceThresholdMin;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.freshFaceDistanceThresholdMax;
        int iHashCode4 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.freshFaceDistanceThresholdMin;
        int iHashCode5 = f5 == null ? 0 : f5.hashCode();
        Integer num = this.ovalFitTimeout;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.farHoldDuration;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Float f6 = this.onHoldThresholdMaxRatio;
        int iHashCode8 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.onHoldThresholdMinRatio;
        int iHashCode9 = f7 == null ? 0 : f7.hashCode();
        Float f8 = this.positionTopThreshold;
        int iHashCode10 = f8 == null ? 0 : f8.hashCode();
        Float f9 = this.positionBottomThreshold;
        int iHashCode11 = f9 == null ? 0 : f9.hashCode();
        Float f10 = this.notFrontalFaceHeadTiltAngelThreshold;
        int iHashCode12 = f10 == null ? 0 : f10.hashCode();
        Float f11 = this.notFrontalFaceHeadPitchAngelThreshold;
        int iHashCode13 = f11 == null ? 0 : f11.hashCode();
        Float f12 = this.notFrontalFaceEyeDistanceRatioThreshold;
        int iHashCode14 = f12 == null ? 0 : f12.hashCode();
        Integer num3 = this.freshnessQcDelayDuration;
        int iHashCode15 = num3 == null ? 0 : num3.hashCode();
        Long l = this.colorFlashingTimeout;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfigFaceDetectionConfig(faceDetectionScoreThreshold=" + this.faceDetectionScoreThreshold + ", initialFaceDistanceThresholdMax=" + this.initialFaceDistanceThresholdMax + ", initialFaceDistanceThresholdMin=" + this.initialFaceDistanceThresholdMin + ", freshFaceDistanceThresholdMax=" + this.freshFaceDistanceThresholdMax + ", freshFaceDistanceThresholdMin=" + this.freshFaceDistanceThresholdMin + ", ovalFitTimeout=" + this.ovalFitTimeout + ", farHoldDuration=" + this.farHoldDuration + ", onHoldThresholdMaxRatio=" + this.onHoldThresholdMaxRatio + ", onHoldThresholdMinRatio=" + this.onHoldThresholdMinRatio + ", positionTopThreshold=" + this.positionTopThreshold + ", positionBottomThreshold=" + this.positionBottomThreshold + ", notFrontalFaceHeadTiltAngelThreshold=" + this.notFrontalFaceHeadTiltAngelThreshold + ", notFrontalFaceHeadPitchAngelThreshold=" + this.notFrontalFaceHeadPitchAngelThreshold + ", notFrontalFaceEyeDistanceRatioThreshold=" + this.notFrontalFaceEyeDistanceRatioThreshold + ", freshnessQcDelayDuration=" + this.freshnessQcDelayDuration + ", colorFlashingTimeout=" + this.colorFlashingTimeout + ")";
    }

    public LcaSdkLivenessConfigFaceDetectionConfig(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l) {
        this.faceDetectionScoreThreshold = f;
        this.initialFaceDistanceThresholdMax = f2;
        this.initialFaceDistanceThresholdMin = f3;
        this.freshFaceDistanceThresholdMax = f4;
        this.freshFaceDistanceThresholdMin = f5;
        this.ovalFitTimeout = num;
        this.farHoldDuration = num2;
        this.onHoldThresholdMaxRatio = f6;
        this.onHoldThresholdMinRatio = f7;
        this.positionTopThreshold = f8;
        this.positionBottomThreshold = f9;
        this.notFrontalFaceHeadTiltAngelThreshold = f10;
        this.notFrontalFaceHeadPitchAngelThreshold = f11;
        this.notFrontalFaceEyeDistanceRatioThreshold = f12;
        this.freshnessQcDelayDuration = num3;
        this.colorFlashingTimeout = l;
    }
}

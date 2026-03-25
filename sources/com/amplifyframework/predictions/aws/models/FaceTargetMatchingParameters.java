package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class FaceTargetMatchingParameters {
    private final float faceIouHeightThreshold;
    private final float faceIouWidthThreshold;
    private final int ovalFitTimeout;
    private final float targetIouHeightThreshold;
    private final float targetIouThreshold;
    private final float targetIouWidthThreshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceTargetMatchingParameters copy$default(FaceTargetMatchingParameters faceTargetMatchingParameters, float f, float f2, float f3, float f4, float f5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = faceTargetMatchingParameters.targetIouThreshold;
        }
        if ((i2 & 2) != 0) {
            f2 = faceTargetMatchingParameters.targetIouWidthThreshold;
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = faceTargetMatchingParameters.targetIouHeightThreshold;
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = faceTargetMatchingParameters.faceIouWidthThreshold;
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            f5 = faceTargetMatchingParameters.faceIouHeightThreshold;
        }
        float f9 = f5;
        if ((i2 & 32) != 0) {
            i = faceTargetMatchingParameters.ovalFitTimeout;
        }
        return faceTargetMatchingParameters.copy(f, f6, f7, f8, f9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.targetIouThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.targetIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.targetIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.faceIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component5() {
        return this.faceIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceTargetMatchingParameters copy(float f, float f2, float f3, float f4, float f5, int i) {
        return new FaceTargetMatchingParameters(f, f2, f3, f4, f5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceTargetMatchingParameters)) {
            return false;
        }
        FaceTargetMatchingParameters faceTargetMatchingParameters = (FaceTargetMatchingParameters) obj;
        return Float.compare(this.targetIouThreshold, faceTargetMatchingParameters.targetIouThreshold) == 0 && Float.compare(this.targetIouWidthThreshold, faceTargetMatchingParameters.targetIouWidthThreshold) == 0 && Float.compare(this.targetIouHeightThreshold, faceTargetMatchingParameters.targetIouHeightThreshold) == 0 && Float.compare(this.faceIouWidthThreshold, faceTargetMatchingParameters.faceIouWidthThreshold) == 0 && Float.compare(this.faceIouHeightThreshold, faceTargetMatchingParameters.faceIouHeightThreshold) == 0 && this.ovalFitTimeout == faceTargetMatchingParameters.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceIouHeightThreshold() {
        return this.faceIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFaceIouWidthThreshold() {
        return this.faceIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOvalFitTimeout() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTargetIouHeightThreshold() {
        return this.targetIouHeightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTargetIouThreshold() {
        return this.targetIouThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTargetIouWidthThreshold() {
        return this.targetIouWidthThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Float.hashCode(this.targetIouThreshold) * 31) + Float.hashCode(this.targetIouWidthThreshold)) * 31) + Float.hashCode(this.targetIouHeightThreshold)) * 31) + Float.hashCode(this.faceIouWidthThreshold)) * 31) + Float.hashCode(this.faceIouHeightThreshold)) * 31) + Integer.hashCode(this.ovalFitTimeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceTargetMatchingParameters(targetIouThreshold=" + this.targetIouThreshold + ", targetIouWidthThreshold=" + this.targetIouWidthThreshold + ", targetIouHeightThreshold=" + this.targetIouHeightThreshold + ", faceIouWidthThreshold=" + this.faceIouWidthThreshold + ", faceIouHeightThreshold=" + this.faceIouHeightThreshold + ", ovalFitTimeout=" + this.ovalFitTimeout + ")";
    }

    public FaceTargetMatchingParameters(float f, float f2, float f3, float f4, float f5, int i) {
        this.targetIouThreshold = f;
        this.targetIouWidthThreshold = f2;
        this.targetIouHeightThreshold = f3;
        this.faceIouWidthThreshold = f4;
        this.faceIouHeightThreshold = f5;
        this.ovalFitTimeout = i;
    }
}

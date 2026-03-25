package com.okinc.liveness.lca.ai;

import android.graphics.RectF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FaceInfo {
    public static final int $stable = 8;
    private final float[] landmarks;
    private final float probability;
    private final String qcLabel;
    private final float qcScore;
    private final RectF rect;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceInfo copy$default(FaceInfo faceInfo, RectF rectF, float[] fArr, float f, String str, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = faceInfo.rect;
        }
        if ((i & 2) != 0) {
            fArr = faceInfo.landmarks;
        }
        float[] fArr2 = fArr;
        if ((i & 4) != 0) {
            f = faceInfo.probability;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            str = faceInfo.qcLabel;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            f2 = faceInfo.qcScore;
        }
        return faceInfo.copy(rectF, fArr2, f3, str2, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component1() {
        return this.rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float[] component2() {
        return this.landmarks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.probability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.qcLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component5() {
        return this.qcScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceInfo copy(@NotNull RectF rectF, @NotNull float[] fArr, float f, @NotNull String str, float f2) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new FaceInfo(rectF, fArr, f, str, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float[] getLandmarks() {
        return this.landmarks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getProbability() {
        return this.probability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQcLabel() {
        return this.qcLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getQcScore() {
        return this.qcScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getRect() {
        return this.rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceInfo(rect=" + this.rect + ", landmarks=" + Arrays.toString(this.landmarks) + ", probability=" + this.probability + ", qcLabel=" + this.qcLabel + ", qcScore=" + this.qcScore + ")";
    }

    public FaceInfo(@NotNull RectF rectF, @NotNull float[] fArr, float f, @NotNull String str, float f2) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.rect = rectF;
        this.landmarks = fArr;
        this.probability = f;
        this.qcLabel = str;
        this.qcScore = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(FaceInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        FaceInfo faceInfo = (FaceInfo) obj;
        return Intrinsics.EZpvd(this.rect, faceInfo.rect) && Arrays.equals(this.landmarks, faceInfo.landmarks) && this.probability == faceInfo.probability && this.qcScore == faceInfo.qcScore;
    }

    public int hashCode() {
        int iHashCode = this.rect.hashCode();
        int iHashCode2 = Arrays.hashCode(this.landmarks);
        return (((((iHashCode * 31) + iHashCode2) * 31) + Float.hashCode(this.probability)) * 31) + Float.hashCode(this.qcScore);
    }
}

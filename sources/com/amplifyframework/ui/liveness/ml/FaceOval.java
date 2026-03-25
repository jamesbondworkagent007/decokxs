package com.amplifyframework.ui.liveness.ml;

import android.graphics.RectF;
import com.amplifyframework.predictions.aws.models.FaceTargetChallenge;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceOval {
    public static final int $stable = 0;
    public static final FaceOval INSTANCE = new FaceOval();

    private FaceOval() {
    }

    public final RectF createBoundingRect(@NotNull FaceTargetChallenge faceTargetChallenge) {
        Intrinsics.checkNotNullParameter(faceTargetChallenge, "");
        float f = 2;
        float targetCenterX = faceTargetChallenge.getTargetCenterX() - (faceTargetChallenge.getTargetWidth() / f);
        float targetCenterY = faceTargetChallenge.getTargetCenterY() - (faceTargetChallenge.getTargetHeight() / f);
        return new RectF(targetCenterX, targetCenterY, faceTargetChallenge.getTargetWidth() + targetCenterX, faceTargetChallenge.getTargetHeight() + targetCenterY);
    }

    public final RectF convertMirroredRectangle(@NotNull RectF rectF, int i) {
        Intrinsics.checkNotNullParameter(rectF, "");
        float f = i - 1;
        return new RectF(Math.max(0.0f, f - rectF.right), rectF.top, f - rectF.left, rectF.bottom);
    }

    public final FaceDetector.Landmark convertMirroredLandmark(@NotNull FaceDetector.Landmark landmark, int i) {
        Intrinsics.checkNotNullParameter(landmark, "");
        return new FaceDetector.Landmark(Math.max(0.0f, (i - 1) - landmark.getX()), landmark.getY());
    }
}

package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: loaded from: classes2.dex */
public class PathKeyframe extends Keyframe<PointF> {
    private Path path;
    private final Keyframe<PointF> pointKeyFrame;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Path getPath() {
        return this.path;
    }

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.pointKeyFrame = keyframe;
        createPath();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createPath() {
        boolean z;
        T t;
        T t2;
        T t3 = this.endValue;
        if (t3 == 0 || (t2 = this.startValue) == 0) {
            z = false;
        } else {
            PointF pointF = (PointF) t3;
            if (((PointF) t2).equals(pointF.x, pointF.y)) {
                z = true;
            }
        }
        T t4 = this.startValue;
        if (t4 == 0 || (t = this.endValue) == 0 || z) {
            return;
        }
        Keyframe<PointF> keyframe = this.pointKeyFrame;
        this.path = Utils.createPath((PointF) t4, (PointF) t, keyframe.pathCp1, keyframe.pathCp2);
    }
}

package o;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37878pEa {
    public static final C37878pEa EZpvd = new C37878pEa();

    private C37878pEa() {
    }

    public final Triple<android.graphics.Path, java.lang.Float, java.lang.Float> AEQbTJ(@NotNull android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        android.graphics.Path path2 = new android.graphics.Path();
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 = length; f3 >= 0.0f; f3 -= 5.0f) {
            if (pathMeasure.getPosTan(f3, fArr, null)) {
                if (f3 == length) {
                    path2.moveTo(fArr[0], fArr[1]);
                    f = fArr[0];
                    f2 = fArr[1];
                } else {
                    path2.lineTo(fArr[0], fArr[1]);
                }
            }
        }
        return new Triple<>(path2, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
    }

    public final PointF KWHzl(@NotNull android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(0.0f, fArr, null);
        return new PointF(fArr[0], fArr[1]);
    }
}

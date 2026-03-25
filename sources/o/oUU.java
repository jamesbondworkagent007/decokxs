package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oUU {
    public static final oUU copydefault = new oUU();

    private oUU() {
    }

    public final float[] copydefault(int i, double d, double d2, double d3, double d4) {
        float f = i;
        double d5 = d3 - d;
        double d6 = d4 - d2;
        return new float[]{(float) (d3 - ((((double) AbstractC36302oWt.copydefault(f)) * d5) / java.lang.Math.sqrt(java.lang.Math.pow(d5, 2.0d) + java.lang.Math.pow(d6, 2.0d)))), (float) (d4 - ((((double) AbstractC36302oWt.copydefault(f)) * d6) / java.lang.Math.sqrt(java.lang.Math.pow(d5, 2.0d) + java.lang.Math.pow(d6, 2.0d))))};
    }

    public final double OLrzqt(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d5 - d3;
        double d8 = d - d3;
        double d9 = d6 - d4;
        double d10 = d2 - d4;
        double d11 = (d7 * d8) + (d9 * d10);
        if (d11 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return java.lang.Math.sqrt((d8 * d8) + (d10 * d10));
        }
        double d12 = (d7 * d7) + (d9 * d9);
        if (d11 >= d12) {
            double d13 = d - d5;
            double d14 = d2 - d6;
            return java.lang.Math.sqrt((d13 * d13) + (d14 * d14));
        }
        double d15 = d11 / d12;
        double d16 = d - (d3 + (d7 * d15));
        double d17 = (d4 + (d9 * d15)) - d2;
        return java.lang.Math.sqrt((d16 * d16) + (d17 * d17));
    }

    public final double copydefault(@NotNull android.view.MotionEvent motionEvent, @NotNull java.util.ArrayList<DrawLineData.Line> arrayList) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator<DrawLineData.Line> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            DrawLineData.Line next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            DrawLineData.Line line = next;
            double dOLrzqt = OLrzqt(motionEvent.getX(), motionEvent.getY(), line.getX1(), line.getY1(), line.getX2(), line.getY2());
            if (dOLrzqt < AbstractC36302oWt.copydefault(15.0f)) {
                return dOLrzqt;
            }
        }
        return -1.0d;
    }

    public final double copydefault(@NotNull android.view.MotionEvent motionEvent, double d, double d2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        double dSqrt = java.lang.Math.sqrt(((((double) motionEvent.getX()) - d) * (((double) motionEvent.getX()) - d)) + ((((double) motionEvent.getY()) - d2) * (((double) motionEvent.getY()) - d2)));
        if (dSqrt <= AbstractC36302oWt.copydefault(15.0f)) {
            return dSqrt;
        }
        return -1.0d;
    }
}

package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7509alF extends LineChartRenderer {
    public java.lang.Float AEQbTJ;
    public java.lang.Float KWHzl;
    public java.lang.Integer OLrzqt;
    public java.lang.Float copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7509alF(@NotNull LineDataProvider lineDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
    }

    public final void KWHzl(int i, float f, float f2, float f3) {
        this.mRenderPaint.setShadowLayer(C55298xhM.dp2pxFloat$default(f3, null, 1, null), C55298xhM.dp2pxFloat$default(f, null, 1, null), C55298xhM.dp2pxFloat$default(f2, null, 1, null), i);
    }

    public final void copydefault(int i) {
        this.mRenderPaint.setStrokeCap(Paint.Cap.values()[i]);
    }

    public final void AEQbTJ(int i, float f, float f2, float f3) {
        this.OLrzqt = java.lang.Integer.valueOf(i);
        this.AEQbTJ = java.lang.Float.valueOf(C55298xhM.dp2pxFloat$default(f, null, 1, null));
        this.copydefault = java.lang.Float.valueOf(C55298xhM.dp2pxFloat$default(f2, null, 1, null));
        this.KWHzl = java.lang.Float.valueOf(C55298xhM.dp2pxFloat$default(f3, null, 1, null));
    }

    @Override // com.github.mikephil.charting.renderer.LineRadarRenderer
    public void drawFilledPath(android.graphics.Canvas canvas, android.graphics.Path path, int i, int i2) {
        if (this.OLrzqt != null && this.AEQbTJ != null && this.copydefault != null && this.KWHzl != null && canvas != null && path != null) {
            RectF rectF = new RectF();
            path.computeBounds(rectF, false);
            if (rectF.right > rectF.left) {
                android.graphics.Paint paint = new android.graphics.Paint();
                java.lang.Integer num = this.OLrzqt;
                Intrinsics.copydefault(num);
                paint.setColor(num.intValue());
                java.lang.Float f = this.KWHzl;
                Intrinsics.copydefault(f);
                paint.setStrokeWidth(f.floatValue());
                java.lang.Float f2 = this.KWHzl;
                Intrinsics.copydefault(f2);
                float fFloatValue = f2.floatValue();
                java.lang.Float f3 = this.copydefault;
                Intrinsics.copydefault(f3);
                paint.setPathEffect(new DashPathEffect(new float[]{fFloatValue, f3.floatValue()}, 0.0f));
                java.lang.Float f4 = this.AEQbTJ;
                Intrinsics.copydefault(f4);
                float fFloatValue2 = f4.floatValue();
                java.lang.Float f5 = this.KWHzl;
                Intrinsics.copydefault(f5);
                float fFloatValue3 = f5.floatValue();
                float f6 = rectF.left;
                java.lang.Float f7 = this.KWHzl;
                Intrinsics.copydefault(f7);
                float fFloatValue4 = f7.floatValue() / 2;
                int iSave = canvas.save();
                canvas.clipPath(path);
                for (float f8 = f6 + fFloatValue4; f8 <= rectF.right; f8 += fFloatValue2 + fFloatValue3) {
                    canvas.drawLine(f8, rectF.bottom, f8, rectF.top, paint);
                }
                canvas.restoreToCount(iSave);
                return;
            }
            return;
        }
        super.drawFilledPath(canvas, path, i, i2);
    }
}

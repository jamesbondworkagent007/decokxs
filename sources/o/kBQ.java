package o;

import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBQ extends BarChartRenderer {
    public final int AEQbTJ;
    public final int KWHzl;
    public final float copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kBQ(@NotNull BarDataProvider barDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(barDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.KWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fkESqH);
        this.copydefault = 8.0f;
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(@NotNull android.graphics.Canvas canvas, @NotNull IBarDataSet iBarDataSet, int i) {
        IBarDataSet iBarDataSet2 = iBarDataSet;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(iBarDataSet2, "");
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i2 = 0;
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float barWidth = this.mChart.getBarData().getBarWidth();
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(barWidth);
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z2 = iBarDataSet.getColors().size() == 1;
        if (z2) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i2 < barBuffer.size()) {
            int i3 = i2 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i3])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i2])) {
                    break;
                }
                if (!z2) {
                    this.mRenderPaint.setColor(iBarDataSet2.getColor(i2 / 4));
                }
                float[] fArr = barBuffer.buffer;
                float f = fArr[i2];
                float f2 = fArr[i2 + 1];
                float f3 = fArr[i3];
                float f4 = fArr[i2 + 3];
                this.mRenderPaint.setShader(new LinearGradient(f, f4, f, f2, this.AEQbTJ, this.KWHzl, Shader.TileMode.CLAMP));
                RectF rectF = new RectF(f, f2, f3, f4);
                float f5 = this.copydefault;
                canvas.drawRoundRect(rectF, f5, f5, this.mRenderPaint);
                if (z) {
                    float f6 = this.copydefault;
                    canvas.drawRoundRect(rectF, f6, f6, this.mBarBorderPaint);
                }
            }
            i2 += 4;
            iBarDataSet2 = iBarDataSet;
        }
        this.mRenderPaint.setShader(null);
    }
}

package o;

import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27223jrD extends BarChartRenderer {
    public final RectF AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27223jrD(@NotNull BarDataProvider barDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(barDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.AEQbTJ = new RectF();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(@NotNull android.graphics.Canvas canvas, @NotNull IBarDataSet iBarDataSet, int i) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(iBarDataSet, "");
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = java.lang.Math.min((int) java.lang.Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i2 = 0; i2 < iMin; i2++) {
                float x = ((BarEntry) iBarDataSet.getEntryForIndex(i2)).getX();
                RectF rectF = this.AEQbTJ;
                rectF.left = x - barWidth;
                rectF.right = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.AEQbTJ.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.AEQbTJ.left)) {
                        break;
                    }
                    this.AEQbTJ.top = this.mViewPortHandler.contentTop();
                    this.AEQbTJ.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.AEQbTJ, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z2 = iBarDataSet.getColors().size() == 1;
        if (z2) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        int i3 = 0;
        while (i3 < barBuffer.size()) {
            int i4 = i3 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i4])) {
                i3 += 4;
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    return;
                }
                if (!z2) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    com.github.mikephil.charting.model.GradientColor gradientColor = iBarDataSet.getGradientColor();
                    android.graphics.Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    float f = fArr[i3];
                    paint.setShader(new LinearGradient(f, fArr[i3 + 3], f, fArr[i3 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    android.graphics.Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f2 = fArr2[i3];
                    float f3 = fArr2[i3 + 3];
                    float f4 = fArr2[i3 + 1];
                    int i5 = i3 / 4;
                    paint2.setShader(new LinearGradient(f2, f3, f2, f4, iBarDataSet.getGradientColor(i5).getStartColor(), iBarDataSet.getGradientColor(i5).getEndColor(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = barBuffer.buffer;
                Intrinsics.checkNotNullExpressionValue(fArr3, "");
                int i6 = i3 + 4;
                float f5 = (i6 < 0 || i6 >= fArr3.length) ? barBuffer.buffer[i4] : fArr3[i6];
                float[] fArr4 = barBuffer.buffer;
                int i7 = i3 + 1;
                int i8 = i3 + 3;
                canvas.drawRect(fArr4[i3], fArr4[i7], (float) java.lang.Math.ceil(f5), barBuffer.buffer[i8], this.mRenderPaint);
                if (z) {
                    float[] fArr5 = barBuffer.buffer;
                    canvas.drawRect(fArr5[i3], fArr5[i7], fArr5[i4], fArr5[i8], this.mBarBorderPaint);
                }
                i3 = i6;
            }
        }
    }
}

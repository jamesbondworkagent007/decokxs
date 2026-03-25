package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.renderer.RadarChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27471jvn extends RadarChartRenderer {
    public android.graphics.Path EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27471jvn(@NotNull RadarChart radarChart, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(radarChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(radarChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.EZpvd = new android.graphics.Path();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(android.graphics.Canvas canvas) {
        RadarData radarData = (RadarData) this.mChart.getData();
        int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                Intrinsics.copydefault(canvas);
                Intrinsics.copydefault(iRadarDataSet);
                EZpvd(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(android.graphics.Canvas canvas, IRadarDataSet iRadarDataSet, int i) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        android.graphics.Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        int entryCount = iRadarDataSet.getEntryCount();
        boolean z = false;
        for (int i2 = 0; i2 < entryCount; i2++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i2));
            com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i2)).getY() - this.mChart.getYChartMin()) * factor * phaseY, (i2 * sliceAngle * phaseX) + this.mChart.getRotationAngle(), mPPointF);
            if (!java.lang.Float.isNaN(mPPointF.x)) {
                if (!z) {
                    path.moveTo(mPPointF.x, mPPointF.y);
                    z = true;
                } else {
                    path.lineTo(mPPointF.x, mPPointF.y);
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i) {
            path.lineTo(centerOffsets.x, centerOffsets.y);
        }
        path.close();
        this.EZpvd = path;
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    @Override // com.github.mikephil.charting.renderer.RadarChartRenderer
    public void drawDataSet(@NotNull android.graphics.Canvas canvas, @NotNull IRadarDataSet iRadarDataSet, int i) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(iRadarDataSet, "");
        this.mRenderPaint.setStrokeWidth(iRadarDataSet.getLineWidth());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(this.EZpvd, this.mRenderPaint);
    }

    public final void KWHzl(@NotNull android.graphics.Canvas canvas, int i) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Paint paint = new android.graphics.Paint(this.mRenderPaint);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.SOLID));
        paint.setAlpha(255);
        for (int i2 = 0; i2 < 3; i2++) {
            canvas.drawPath(this.EZpvd, paint);
        }
    }

    public final void EZpvd(@NotNull android.graphics.Canvas canvas, int i) {
        Intrinsics.checkNotNullParameter(canvas, "");
        drawFilledPath(canvas, this.EZpvd, i, 255);
    }
}

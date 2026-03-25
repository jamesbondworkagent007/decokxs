package o;

import android.graphics.BlurMaskFilter;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19623gJf extends LineChartRenderer {
    public int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19623gJf(@NotNull LineDataProvider lineDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        android.graphics.Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(chartWidth, chartHeight, getBitmapConfig());
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new android.graphics.Canvas(bitmapCreateBitmap);
        }
        Intrinsics.copydefault(bitmapCreateBitmap);
        bitmapCreateBitmap.eraseColor(0);
        for (T t : this.mChart.getLineData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
                LineDataSet lineDataSet = t instanceof LineDataSet ? (LineDataSet) t : null;
                copydefault(canvas, C33129mqd.AhwBna(lineDataSet != null ? java.lang.Integer.valueOf(lineDataSet.getColor()) : null));
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    private final void copydefault(android.graphics.Canvas canvas, int i) {
        if (i == 0 || !C33492mxV.OLrzqt()) {
            return;
        }
        android.graphics.Paint paint = new android.graphics.Paint(this.mRenderPaint);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter(50.0f, BlurMaskFilter.Blur.OUTER));
        paint.setAlpha(this.AEQbTJ);
        canvas.drawPath(this.cubicPath, paint);
    }
}

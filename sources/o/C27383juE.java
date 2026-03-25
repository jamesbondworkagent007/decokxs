package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27383juE extends LineChartRenderer {
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.OLrzqt = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27383juE(@NotNull LineChart lineChart, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(lineChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.drawValues(canvas);
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
        LineData lineData = this.mChart.getLineData();
        if ((lineData != null ? lineData.getDataSets() : null) == null) {
            return;
        }
        for (T t : lineData.getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
    }
}

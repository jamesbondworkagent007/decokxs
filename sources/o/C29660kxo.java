package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.SignalOverviewChartRenderer$drawCubicBezier$1;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.SignalOverviewChartRenderer$drawHorizontalBezier$1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29660kxo extends LineChartRenderer {
    public Entry AEQbTJ;
    public final ChartAnimator EZpvd;
    public final float KWHzl;
    public final LineChart OLrzqt;
    public final ViewPortHandler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Entry AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Entry entry) {
        this.AEQbTJ = entry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinear(@NotNull android.graphics.Canvas canvas, @NotNull ILineDataSet iLineDataSet) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(iLineDataSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29660kxo(@NotNull LineChart lineChart, @NotNull ViewPortHandler viewPortHandler, @NotNull ChartAnimator chartAnimator, float f) {
        super(lineChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        this.OLrzqt = lineChart;
        this.copydefault = viewPortHandler;
        this.EZpvd = chartAnimator;
        this.KWHzl = f;
    }

    public final void EZpvd() {
        Entry entry = this.AEQbTJ;
        android.graphics.drawable.Drawable icon = entry != null ? entry.getIcon() : null;
        BuySellMarker.Activity activity = icon instanceof BuySellMarker.Activity ? (BuySellMarker.Activity) icon : null;
        if (activity != null) {
            activity.AEQbTJ();
        }
        this.AEQbTJ = null;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(@NotNull android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable icon;
        android.graphics.drawable.Drawable icon2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.drawExtras(canvas);
        LineData lineData = this.OLrzqt.getLineData();
        if (lineData != null && lineData.getDataSetCount() > 0) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(0);
            Transformer transformer = this.OLrzqt.getTransformer(iLineDataSet.getAxisDependency());
            Entry entry = this.AEQbTJ;
            int entryCount = iLineDataSet.getEntryCount();
            for (int i = 0; i < entryCount; i++) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
                if (!Intrinsics.EZpvd((java.lang.Object) entryForIndex, entry) && (icon2 = entryForIndex.getIcon()) != null) {
                    MPPointD pixelForValues = transformer.getPixelForValues(entryForIndex.getX(), entryForIndex.getY() * this.EZpvd.getPhaseY());
                    if (this.copydefault.isInBounds((float) pixelForValues.x, (float) pixelForValues.y)) {
                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon2, ((int) (pixelForValues.x - ((double) (icon2.getIntrinsicWidth() / 2.0f)))) + C55298xhM.dpInt$default(17.0f, (android.content.Context) null, 1, (java.lang.Object) null), ((int) (pixelForValues.y - ((double) (icon2.getIntrinsicHeight() / 2.0f)))) + C55298xhM.dpInt$default(17.0f, (android.content.Context) null, 1, (java.lang.Object) null), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                    }
                }
            }
            if (entry == null || (icon = entry.getIcon()) == null) {
                return;
            }
            MPPointD pixelForValues2 = transformer.getPixelForValues(entry.getX(), entry.getY() * this.EZpvd.getPhaseY());
            if (this.copydefault.isInBounds((float) pixelForValues2.x, (float) pixelForValues2.y)) {
                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, ((int) (pixelForValues2.x - ((double) (icon.getIntrinsicWidth() / 2.0f)))) + C55298xhM.dpInt$default(17.0f, (android.content.Context) null, 1, (java.lang.Object) null), ((int) (pixelForValues2.y - ((double) (icon.getIntrinsicHeight() / 2.0f)))) + C55298xhM.dpInt$default(17.0f, (android.content.Context) null, 1, (java.lang.Object) null), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCubicBezier(@NotNull ILineDataSet iLineDataSet) {
        Intrinsics.checkNotNullParameter(iLineDataSet, "");
        OLrzqt(iLineDataSet, new SignalOverviewChartRenderer$drawCubicBezier$1(this));
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawHorizontalBezier(@NotNull ILineDataSet iLineDataSet) {
        Intrinsics.checkNotNullParameter(iLineDataSet, "");
        OLrzqt(iLineDataSet, new SignalOverviewChartRenderer$drawHorizontalBezier$1(this));
    }

    public final void OLrzqt(ILineDataSet iLineDataSet, Function2<? super ILineDataSet, ? super java.lang.Float, ? extends android.graphics.Path> function2) {
        if (iLineDataSet.getEntryCount() < 2) {
            return;
        }
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        android.graphics.Path pathInvoke = function2.invoke(iLineDataSet, java.lang.Float.valueOf(this.EZpvd.getPhaseY()));
        transformer.pathValueToPixel(pathInvoke);
        RectF contentRect = this.mViewPortHandler.getContentRect();
        Intrinsics.copydefault(contentRect);
        LinearGradient linearGradientAEQbTJ = AEQbTJ(contentRect, iLineDataSet.getColor());
        android.graphics.Paint paint = this.mRenderPaint;
        paint.setStrokeWidth(iLineDataSet.getLineWidth());
        paint.setStyle(Paint.Style.STROKE);
        paint.setShader(linearGradientAEQbTJ);
        paint.setAntiAlias(true);
        this.mBitmapCanvas.drawPath(pathInvoke, this.mRenderPaint);
        this.mRenderPaint.setShader(null);
    }

    public final LinearGradient AEQbTJ(RectF rectF, int i) {
        float fWidth = rectF.width();
        float f = rectF.left;
        float f2 = this.KWHzl;
        float f3 = rectF.right;
        int alphaComponent = ColorUtils.setAlphaComponent(i, 25);
        float f4 = rectF.left;
        return new LinearGradient(f4, 0.0f, rectF.right, 0.0f, new int[]{alphaComponent, i, i, alphaComponent}, new float[]{0.0f, ((f + f2) - f4) / fWidth, ((f3 - f2) - f4) / fWidth, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final android.graphics.Path copydefault(ILineDataSet iLineDataSet, float f) {
        android.graphics.Path path = new android.graphics.Path();
        int entryCount = iLineDataSet.getEntryCount();
        if (entryCount < 2) {
            return path;
        }
        LineDataSet lineDataSet = iLineDataSet instanceof LineDataSet ? (LineDataSet) iLineDataSet : null;
        float cubicIntensity = lineDataSet != null ? lineDataSet.getCubicIntensity() : 0.3f;
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, entryCount);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(iLineDataSet.getEntryForIndex(((AbstractC56415yEn) it).nextInt()));
        }
        path.moveTo(((Entry) arrayList.get(0)).getX(), ((Entry) arrayList.get(0)).getY() * f);
        int i = 1;
        while (i < entryCount) {
            Entry entry = (Entry) arrayList.get(i - 1);
            Entry entry2 = (Entry) arrayList.get(i);
            int i2 = i + 1;
            Entry entry3 = i2 < entryCount ? (Entry) arrayList.get(i2) : entry2;
            path.cubicTo(((entry2.getX() - entry.getX()) * cubicIntensity) + entry.getX(), (((entry2.getY() * f) - (entry.getY() * f)) * cubicIntensity) + (entry.getY() * f), entry2.getX() - ((entry3.getX() - entry.getX()) * cubicIntensity), (entry2.getY() * f) - (((entry3.getY() * f) - (entry.getY() * f)) * cubicIntensity), entry2.getX(), entry2.getY() * f);
            i = i2;
        }
        return path;
    }

    public final android.graphics.Path OLrzqt(ILineDataSet iLineDataSet, float f) {
        android.graphics.Path path = new android.graphics.Path();
        int entryCount = iLineDataSet.getEntryCount();
        if (entryCount < 2) {
            return path;
        }
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, entryCount);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(iLineDataSet.getEntryForIndex(((AbstractC56415yEn) it).nextInt()));
        }
        path.moveTo(((Entry) arrayList.get(0)).getX(), ((Entry) arrayList.get(0)).getY() * f);
        for (int i = 1; i < entryCount; i++) {
            Entry entry = (Entry) arrayList.get(i - 1);
            Entry entry2 = (Entry) arrayList.get(i);
            float x = (entry.getX() + entry2.getX()) / 2;
            path.cubicTo(x, entry.getY() * f, x, entry2.getY() * f, entry2.getX(), entry2.getY() * f);
        }
        return path;
    }
}

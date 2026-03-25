package o;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;

/* JADX INFO: renamed from: o.vta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC51785vta<T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> extends BarLineChartBase<T> {
    public long AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public long OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void resetTracking() {
        this.AEQbTJ = 0L;
        this.OLrzqt = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClipDataToContent(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.charts.Chart
    public void setNoDataText(java.lang.String str) {
        this.copydefault = str;
    }

    public AbstractC51785vta(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = "No chart data available.";
        this.KWHzl = false;
        this.EZpvd = true;
        this.AEQbTJ = 0L;
        this.OLrzqt = 0L;
    }

    public AbstractC51785vta(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = "No chart data available.";
        this.KWHzl = false;
        this.EZpvd = true;
        this.AEQbTJ = 0L;
        this.OLrzqt = 0L;
    }

    public AbstractC51785vta(android.content.Context context) {
        super(context);
        this.copydefault = "No chart data available.";
        this.KWHzl = false;
        this.EZpvd = true;
        this.AEQbTJ = 0L;
        this.OLrzqt = 0L;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Lcom/github/mikephil/charting/data/ChartData;)V */
    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(T t) {
        this.mData = t;
        this.KWHzl = false;
        if (t == null) {
            return;
        }
        setupDefaultFormatter(t.getYMin(), t.getYMax());
        for (T t2 : ((BarLineScatterCandleBubbleData) this.mData).getDataSets()) {
            if (t2.needsFormatter() || t2.getValueFormatter() == this.mDefaultValueFormatter) {
                t2.setValueFormatter(this.mDefaultValueFormatter);
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void clear() {
        this.mData = null;
        this.KWHzl = false;
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.setLastHighlighted(null);
        invalidate();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        pUU.EZpvd("maolin_test", "onDraw: " + java.lang.System.currentTimeMillis());
        if (this.mData == 0) {
            if (!android.text.TextUtils.isEmpty(this.copydefault)) {
                MPPointF center = getCenter();
                canvas.drawText(this.copydefault, center.x, center.y, this.mInfoPaint);
                return;
            }
            return;
        }
        if (!this.KWHzl) {
            calculateOffsets();
            this.KWHzl = true;
        }
        if (this.mData == 0) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        drawGridBackground(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            autoScale();
        }
        if (this.mAxisLeft.isEnabled()) {
            YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
            YAxis yAxis = this.mAxisLeft;
            yAxisRenderer.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        }
        if (this.mAxisRight.isEnabled()) {
            YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
            YAxis yAxis2 = this.mAxisRight;
            yAxisRenderer2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.isInverted());
        }
        if (this.mXAxis.isEnabled()) {
            XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
            XAxis xAxis = this.mXAxis;
            xAxisRenderer.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        if (this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        int iSave = canvas.save();
        if (AEQbTJ()) {
            canvas.clipRect(this.mViewPortHandler.getContentRect());
        }
        this.mRenderer.drawData(canvas);
        if (!this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (!this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (!this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        canvas.restoreToCount(iSave);
        this.mRenderer.drawExtras(canvas);
        if (this.mXAxis.isEnabled() && !this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && !this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && !this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererLeft.renderAxisLabels(canvas);
        this.mAxisRendererRight.renderAxisLabels(canvas);
        if (isClipValuesToContentEnabled()) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.mViewPortHandler.getContentRect());
            this.mRenderer.drawValues(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            this.mRenderer.drawValues(canvas);
        }
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
        if (this.mLogEnabled) {
            long jCurrentTimeMillis2 = this.AEQbTJ + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            this.AEQbTJ = jCurrentTimeMillis2;
            long j = this.OLrzqt + 1;
            this.OLrzqt = j;
            long j2 = jCurrentTimeMillis2 / j;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    @Override // com.github.mikephil.charting.charts.Chart
    public void drawMarkers(android.graphics.Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i];
            ?? dataSetByIndex = ((BarLineScatterCandleBubbleData) this.mData).getDataSetByIndex(highlight.getDataSetIndex());
            Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.mData).getEntryForHighlight(this.mIndicesToHighlight[i]);
            int entryIndex = dataSetByIndex.getEntryIndex(entryForHighlight);
            if (entryForHighlight != null && entryIndex <= dataSetByIndex.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(highlight);
                if (markerPosition[1] < this.mViewPortHandler.offsetTop()) {
                    markerPosition[1] = this.mViewPortHandler.offsetTop();
                } else if (markerPosition[1] > this.mViewPortHandler.contentBottom()) {
                    markerPosition[1] = this.mViewPortHandler.contentBottom();
                }
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, highlight);
                    this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i++;
        }
    }
}

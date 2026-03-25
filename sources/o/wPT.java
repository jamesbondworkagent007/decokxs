package o;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52588wQz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPT extends LineChart {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.wPT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wPT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class TaskDescription extends YAxisRenderer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ViewPortHandler viewPortHandler, @NotNull YAxis yAxis, @NotNull Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            Intrinsics.checkNotNullParameter(viewPortHandler, "");
            Intrinsics.checkNotNullParameter(yAxis, "");
            Intrinsics.checkNotNullParameter(transformer, "");
            this.mZeroLinePaint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        }
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        setHighlighter(new C51291vkJ(this));
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        YAxis axisLeft = getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft, "");
        Transformer transformer = this.mLeftAxisTransformer;
        Intrinsics.checkNotNullExpressionValue(transformer, "");
        setRendererLeftYAxis(new TaskDescription(viewPortHandler, axisLeft, transformer));
        this.mRenderer = new C51350vlP(this, this.mAnimator, this.mViewPortHandler);
        setOnChartGestureListener(new Application());
    }

    public static final class Application implements OnChartGestureListener {
        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        public Application() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            wPT.this.setHighlightPerTapEnabled(true);
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
            IMarker marker = wPT.this.getMarker();
            C52588wQz.ActionBar actionBar = marker instanceof C52588wQz.ActionBar ? (C52588wQz.ActionBar) marker : null;
            if (actionBar == null || motionEvent == null || !actionBar.KWHzl(motionEvent.getX(), motionEvent.getY())) {
                return;
            }
            wPT.this.highlightValue(null);
            actionBar.AEQbTJ();
            wPT.this.setHighlightPerTapEnabled(false);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet, java.lang.Object] */
    @Override // com.github.mikephil.charting.charts.Chart
    public void drawMarkers(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.mMarker != null && isDrawMarkersEnabled() && valuesToHighlight()) {
            pUU.EZpvd("charleeeee", "mIndicesToHighlight 的大小： " + this.mIndicesToHighlight.length);
            java.util.Iterator itEZpvd = yHX.EZpvd(this.mIndicesToHighlight);
            while (itEZpvd.hasNext()) {
                Highlight highlight = (Highlight) itEZpvd.next();
                pUU.EZpvd("charleeeee", "highlight 的： " + highlight.getDataSetIndex() + "   " + highlight.getDataIndex() + "   " + highlight.getX() + "   " + highlight.getY());
                ?? dataSetByIndex = ((LineData) this.mData).getDataSetByIndex(highlight.getDataSetIndex());
                Intrinsics.checkNotNullExpressionValue(dataSetByIndex, "");
                Entry entryForHighlight = KWHzl().getEntryForHighlight(highlight);
                int entryIndex = dataSetByIndex.getEntryIndex(entryForHighlight);
                if (entryForHighlight != null && entryIndex <= dataSetByIndex.getEntryCount() * this.mAnimator.getPhaseX()) {
                    Intrinsics.copydefault(highlight);
                    float[] markerPosition = getMarkerPosition(highlight);
                    if (this.mViewPortHandler.isInBounds(highlight.getXPx(), highlight.getYPx())) {
                        this.mMarker.refreshContent(entryForHighlight, highlight);
                        IMarker iMarker = this.mMarker;
                        Intrinsics.copydefault(markerPosition);
                        iMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                    }
                }
            }
        }
    }

    private final LineData KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : ((LineData) this.mData).getDataSets()) {
            Intrinsics.copydefault(t, "");
            java.util.Collection values = ((LineDataSet) t).getValues();
            Intrinsics.copydefault(values);
            arrayList.addAll(values);
        }
        return new LineData(new LineDataSet(arrayList, ""));
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        T t = this.mData;
        Intrinsics.checkNotNullExpressionValue(t, "");
        return (LineData) t;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] getMarkerPosition(@NotNull Highlight highlight) {
        Intrinsics.checkNotNullParameter(highlight, "");
        if (highlight.getDrawX() > C33570myu.AEQbTJ() / 2) {
            return new float[]{highlight.getDrawX() - 300, highlight.getDrawY()};
        }
        return new float[]{highlight.getDrawX() + 300, highlight.getDrawY()};
    }
}

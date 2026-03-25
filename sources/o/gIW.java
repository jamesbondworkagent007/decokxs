package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.defi.api.bean.CurvePrice;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gIW extends LineChart {
    public LineDataSet AEQbTJ;
    public C19618gJa EZpvd;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super Highlight, Unit> KWHzl;
    public InterfaceC19621gJd OLrzqt;

    /* JADX INFO: loaded from: classes15.dex */
    public static class Application implements OnChartGestureListener {
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
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectCallback(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super Highlight, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.KWHzl = yho;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gIW(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C19619gJb(context2, "0");
        OLrzqt(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gIW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C19619gJb(context2, "0");
        OLrzqt(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gIW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C19619gJb(context2, "0");
        OLrzqt(context);
    }

    public final void setStyle(@NotNull InterfaceC19621gJd interfaceC19621gJd) {
        Intrinsics.checkNotNullParameter(interfaceC19621gJd, "");
        this.OLrzqt = interfaceC19621gJd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C19626gJi c19626gJi = new C19626gJi(context, interfaceC19621gJd.KWHzl(), interfaceC19621gJd.EZpvd(), interfaceC19621gJd.copydefault(), interfaceC19621gJd.AEQbTJ());
        c19626gJi.copydefault(this);
        setMarker(c19626gJi);
    }

    public final void OLrzqt(android.content.Context context) {
        OLrzqt(context, this);
        setHighlighter(new C19620gJc(this));
        ChartAnimator animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C19623gJf(this, animator, viewPortHandler));
        setOnTouchListener(new View.OnTouchListener() { // from class: o.gJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return gIW.KWHzl(this.EZpvd, view, motionEvent);
            }
        });
        setOnChartGestureListener(new Activity());
        setOnChartValueSelectedListener(new TaskDescription());
    }

    public static final boolean KWHzl(gIW giw, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            giw.requestDisallowInterceptTouchEvent(false);
        } else {
            giw.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    public static final class Activity extends Application {
        public Activity() {
        }

        @Override // o.gIW.Application, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            gIW.this.copydefault(true, null);
            yHO yho = gIW.this.KWHzl;
            if (yho != null) {
                yho.invoke("", "", null);
            }
        }

        @Override // o.gIW.Application, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            if (motionEvent != null) {
                gIW giw = gIW.this;
                giw.copydefault(false, giw.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
            }
        }
    }

    public static final class TaskDescription implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            yHO yho;
            java.lang.Object data = entry != null ? entry.getData() : null;
            CurvePrice curvePrice = data instanceof CurvePrice ? (CurvePrice) data : null;
            if (curvePrice != null && (yho = gIW.this.KWHzl) != null) {
                yho.invoke(curvePrice.getPrice(), pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(curvePrice.getTimestamp())), null, 1, null), highlight);
            }
            C14724dqp.EZpvd.AEQbTJ(3L);
        }
    }

    public final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void OLrzqt(android.content.Context context, BarLineChartBase<T> barLineChartBase) {
        barLineChartBase.setExtraOffsets(0.0f, 6.0f, 0.0f, 6.0f);
        barLineChartBase.setMinOffset(0.0f);
        barLineChartBase.setLogEnabled(false);
        XAxis xAxis = barLineChartBase.getXAxis();
        if (xAxis != null) {
            xAxis.setEnabled(false);
        }
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
        }
        YAxis axisRight = barLineChartBase.getAxisRight();
        if (axisRight != null) {
            axisRight.setDrawGridLines(false);
        }
        YAxis axisRight2 = barLineChartBase.getAxisRight();
        if (axisRight2 != null) {
            axisRight2.setDrawAxisLine(false);
        }
        barLineChartBase.setNoDataText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.adwzgZ));
        barLineChartBase.setNoDataTextColor(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        barLineChartBase.setTouchEnabled(true);
        barLineChartBase.setDrawGridBackground(false);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setPinchZoom(false);
        Legend legend = barLineChartBase.getLegend();
        if (legend != null) {
            legend.setEnabled(false);
        }
        Description description = barLineChartBase.getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
    }

    public final void setChartData(@NotNull java.util.ArrayList<Entry> arrayList, float f, java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        DataRenderer renderer = getRenderer();
        C19623gJf c19623gJf = renderer instanceof C19623gJf ? (C19623gJf) renderer : null;
        if (c19623gJf != null) {
            c19623gJf.AEQbTJ((int) (255 * f));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setStyle(new C19619gJb(context, str));
        C19618gJa c19618gJa = new C19618gJa(C56402yEa.EZpvd(KWHzl(arrayList)), f);
        this.EZpvd = c19618gJa;
        setData(c19618gJa.OLrzqt());
        animateX(300);
    }

    public final LineDataSet KWHzl(java.util.ArrayList<Entry> arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setFormSize(1.0f);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setColor(this.OLrzqt.AEQbTJ());
        lineDataSet.setLineWidth(3.0f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        this.AEQbTJ = lineDataSet;
        return lineDataSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z, Highlight highlight) {
        C19618gJa c19618gJa = this.EZpvd;
        if (c19618gJa != null) {
            c19618gJa.copydefault(z ? this.OLrzqt.AEQbTJ() : this.OLrzqt.OLrzqt());
        }
        highlightValue(highlight, true);
    }
}

package o;

import android.graphics.Color;
import android.view.View;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39790pyw extends LineChart {
    public final int AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public Function0<Unit> OLrzqt;
    public Function1<? super Entry, Unit> copydefault;

    /* JADX INFO: renamed from: o.pyw$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity implements OnChartGestureListener {
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

    public static final float AEQbTJ(C39790pyw c39790pyw) {
        return (c39790pyw.getHeight() / (c39790pyw.AEQbTJ - 1)) - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39790pyw(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = 6;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(getResources().getColor(C32113mPz.ActionBar.fJNWhG));
        this.EZpvd = paint;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C39790pyw.AEQbTJ(this.KWHzl));
            }
        });
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39790pyw(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AEQbTJ = 6;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(getResources().getColor(C32113mPz.ActionBar.fJNWhG));
        this.EZpvd = paint;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C39790pyw.AEQbTJ(this.KWHzl));
            }
        });
        AEQbTJ(context);
    }

    private final void AEQbTJ(android.content.Context context) {
        setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setNoDataTextColor(getResources().getColor(C32113mPz.ActionBar.gEmmrt));
        setDrawGridBackground(false);
        setScaleEnabled(false);
        setPinchZoom(true);
        setDrawBorders(false);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        setDragEnabled(true);
        getXAxis().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getAxisRight().setDrawGridLines(false);
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setEnabled(true);
        setOnTouchListener(new View.OnTouchListener() { // from class: o.pyv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C39790pyw.EZpvd(this.EZpvd, view, motionEvent);
            }
        });
        setOnChartGestureListener(new TaskDescription());
    }

    public static final boolean EZpvd(C39790pyw c39790pyw, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            c39790pyw.requestDisallowInterceptTouchEvent(false);
        } else {
            c39790pyw.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.pyw$TaskDescription */
    public static final class TaskDescription extends Activity {
        public TaskDescription() {
        }

        @Override // o.C39790pyw.Activity, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            C39790pyw.this.highlightValue(null);
            Function0 function0 = C39790pyw.this.OLrzqt;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // o.C39790pyw.Activity, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
            C39790pyw c39790pyw;
            Highlight highlightByTouchPoint;
            if (motionEvent == null || (highlightByTouchPoint = (c39790pyw = C39790pyw.this).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY())) == null) {
                return;
            }
            Function1 function1 = c39790pyw.copydefault;
            if (function1 != null) {
                Entry entryByTouchPoint = c39790pyw.getEntryByTouchPoint(motionEvent.getX(), motionEvent.getY());
                Intrinsics.checkNotNullExpressionValue(entryByTouchPoint, "");
                function1.invoke(entryByTouchPoint);
            }
            c39790pyw.highlightValue(highlightByTouchPoint);
        }
    }

    public static /* synthetic */ void setData$default(C39790pyw c39790pyw, java.util.List list, java.util.List list2, Function0 function0, Function1 function1, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c39790pyw.setData(list, list2, function0, function1, bool);
    }

    public final void setData(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull Function0<Unit> function0, @NotNull Function1<? super Entry, Unit> function1, java.lang.Boolean bool) {
        int iTradeFallGraph$default;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function0;
        this.copydefault = function1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new Entry(i * 1.0f, C33129mqd.djBIcL(list2.get(i)), list.get(i)));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setFormSize(0.0f);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setColor(Color.parseColor("#2E61E3"));
        if (!list2.isEmpty()) {
            if (C33129mqd.djBIcL(CollectionsKt___CollectionsKt.AubY(list2)) >= C33129mqd.djBIcL(CollectionsKt___CollectionsKt.AuCTelauCTel(list2))) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iTradeFallGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
            }
            lineDataSet.setColor(iTradeFallGraph$default);
        }
        lineDataSet.setLineWidth(3.0f);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.01f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setHighLightColor(Color.parseColor("#9AA1B1"));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.enableDashedHighlightLine(15.0f, 10.0f, 0.0f);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        setData(new LineData(lineDataSet));
        notifyDataSetChanged();
        invalidate();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
    }
}

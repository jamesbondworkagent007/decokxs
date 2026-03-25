package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C41349qpD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41349qpD {
    public static /* synthetic */ void setAutoHideHighlightWhenTouchEnd$default(LineChart lineChart, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        AEQbTJ(lineChart, (Function1<? super android.view.MotionEvent, Unit>) function1, (Function1<? super android.view.MotionEvent, Unit>) function12);
    }

    /* JADX INFO: renamed from: o.qpD$ActionBar */
    public static final class ActionBar extends C41367qpV {
        public final /* synthetic */ Function1<android.view.MotionEvent, Unit> AEQbTJ;
        public final /* synthetic */ Function1<android.view.MotionEvent, Unit> EZpvd;
        public final /* synthetic */ LineChart copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super android.view.MotionEvent, Unit> function1, LineChart lineChart, Function1<? super android.view.MotionEvent, Unit> function12) {
            this.EZpvd = function1;
            this.copydefault = lineChart;
            this.AEQbTJ = function12;
        }

        @Override // o.C41367qpV, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            Function1<android.view.MotionEvent, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(motionEvent);
            }
        }

        @Override // o.C41367qpV, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(final android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            this.copydefault.highlightValue((Highlight) null, true);
            LineChart lineChart = this.copydefault;
            final Function1<android.view.MotionEvent, Unit> function1 = this.AEQbTJ;
            lineChart.postDelayed(new java.lang.Runnable() { // from class: o.qpO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C41349qpD.ActionBar.OLrzqt(function1, motionEvent);
                }
            }, 100L);
        }

        public static final void OLrzqt(Function1 function1, android.view.MotionEvent motionEvent) {
            if (function1 != null) {
                function1.invoke(motionEvent);
            }
        }
    }

    public static final void AEQbTJ(@NotNull LineChart lineChart, Function1<? super android.view.MotionEvent, Unit> function1, Function1<? super android.view.MotionEvent, Unit> function12) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        lineChart.setOnChartGestureListener(new ActionBar(function1, lineChart, function12));
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setOnEntryHighlighted$default(LineChart lineChart, Function0 function0, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.qpG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C41349qpD.OLrzqt();
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: o.qpI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C41349qpD.KWHzl((Entry) obj2, (Highlight) obj3);
                }
            };
        }
        AEQbTJ(lineChart, (Function0<Unit>) function0, (Function2<? super Entry, ? super Highlight, Unit>) function2);
    }

    public static final Unit KWHzl(Entry entry, Highlight highlight) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qpD$TaskDescription */
    public static final class TaskDescription extends C41366qpU {
        public final /* synthetic */ Function2<Entry, Highlight, Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super com.github.mikephil.charting.data.Entry, ? super com.github.mikephil.charting.highlight.Highlight, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function2<? super Entry, ? super Highlight, Unit> function2, Function0<Unit> function0) {
            this.EZpvd = function2;
            this.OLrzqt = function0;
        }

        @Override // o.C41366qpU, com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            this.EZpvd.invoke(entry, highlight);
        }

        @Override // o.C41366qpU, com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            this.OLrzqt.invoke();
        }
    }

    public static final void AEQbTJ(@NotNull LineChart lineChart, @NotNull Function0<Unit> function0, @NotNull Function2<? super Entry, ? super Highlight, Unit> function2) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        lineChart.setOnChartValueSelectedListener(new TaskDescription(function2, function0));
    }

    public static /* synthetic */ void setLeftYAxisLimitRange$default(LineChart lineChart, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.9f;
        }
        if ((i & 2) != 0) {
            f2 = 1.1f;
        }
        copydefault(lineChart, f, f2);
    }

    public static final void copydefault(@NotNull LineChart lineChart, float f, float f2) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        YAxis axisLeft = lineChart.getAxisLeft();
        float yMin = lineChart.getLineData().getYMin();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        axisLeft.setAxisMinimum(yMin * java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f), 2, bool, RoundingMode.FLOOR)));
        lineChart.getAxisLeft().setAxisMaximum(lineChart.getLineData().getYMax() * java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f2), 2, bool, RoundingMode.CEILING)));
    }

    public static final Unit AEQbTJ(LineDataSet lineDataSet) {
        Intrinsics.checkNotNullParameter(lineDataSet, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LineData lineData) {
        Intrinsics.checkNotNullParameter(lineData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(XAxis xAxis) {
        Intrinsics.checkNotNullParameter(xAxis, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(YAxis yAxis) {
        Intrinsics.checkNotNullParameter(yAxis, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LineChart lineChart) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull LineChart lineChart, @NotNull java.util.List<? extends Entry> list, kotlin.Pair<java.lang.Float, java.lang.Float> pair, @NotNull Function1<? super LineDataSet, Unit> function1, @NotNull Function1<? super LineData, Unit> function12, @NotNull Function1<? super XAxis, Unit> function13, @NotNull Function1<? super YAxis, Unit> function14, @NotNull Function1<? super LineChart, Unit> function15) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        LineDataSet lineDataSet = new LineDataSet(list, lineChart.getClass().getSimpleName());
        function1.invoke(lineDataSet);
        LineData lineData = new LineData(yDY.copydefault(lineDataSet));
        function12.invoke(lineData);
        lineChart.setData(lineData);
        if (lineChart.getXAxis().isEnabled()) {
            function13.invoke(lineChart.getXAxis());
        }
        if (lineChart.getAxisLeft().isEnabled()) {
            function14.invoke(lineChart.getAxisLeft());
            if (pair != null) {
                copydefault(lineChart, pair.getFirst().floatValue(), pair.getSecond().floatValue());
            }
        }
        function15.invoke(lineChart);
    }

    public static /* synthetic */ int getThemeChartColor$default(LineChart lineChart, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return KWHzl(lineChart, z, z2);
    }

    public static final int KWHzl(@NotNull LineChart lineChart, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        c33512mxp.isConnected();
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55365xia c55365xia = new C55365xia(context, 32);
        if (z2) {
            if (z) {
                return C55366xib.KWHzl(C52761wXj.ActionBar.swzYdv, c55365xia);
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return C55366xib.KWHzl(C52761wXj.ActionBar.fLIjIY, c55365xia);
        }
        if (z) {
            android.content.Context context2 = lineChart.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return C33512mxp.tradeRiseGraph$default(c33512mxp, context2, 0.0f, 2, null);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        android.content.Context context3 = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        return C33512mxp.tradeFallGraph$default(c33512mxp, context3, 0.0f, 2, null);
    }

    public static final GradientDrawable OLrzqt(@androidx.annotation.ColorInt int i) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(76, Color.red(i), Color.green(i), Color.blue(i)), Color.argb(0, Color.red(i), Color.green(i), Color.blue(i))});
    }

    public static final void AEQbTJ(@NotNull LineDataSet lineDataSet, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(lineDataSet, "");
        lineDataSet.setFillDrawable(OLrzqt(i));
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setOnEntryHighlighted$default(BarChart barChart, Function0 function0, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.qpQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C41349qpD.EZpvd();
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: o.qpP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C41349qpD.OLrzqt((Entry) obj2, (Highlight) obj3);
                }
            };
        }
        copydefault(barChart, (Function0<Unit>) function0, (Function2<? super Entry, ? super Highlight, Unit>) function2);
    }

    public static final Unit OLrzqt(Entry entry, Highlight highlight) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qpD$Application */
    public static final class Application extends C41366qpU {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Function2<Entry, Highlight, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super com.github.mikephil.charting.data.Entry, ? super com.github.mikephil.charting.highlight.Highlight, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super Entry, ? super Highlight, Unit> function2, Function0<Unit> function0) {
            this.KWHzl = function2;
            this.AEQbTJ = function0;
        }

        @Override // o.C41366qpU, com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            this.KWHzl.invoke(entry, highlight);
        }

        @Override // o.C41366qpU, com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            this.AEQbTJ.invoke();
        }
    }

    public static final void copydefault(@NotNull BarChart barChart, @NotNull Function0<Unit> function0, @NotNull Function2<? super Entry, ? super Highlight, Unit> function2) {
        Intrinsics.checkNotNullParameter(barChart, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        barChart.setOnChartValueSelectedListener(new Application(function2, function0));
    }
}

package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27424jut extends BarChart {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public Application EZpvd;
    public C27421juq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27424jut(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27424jut(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.jut.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27424jut(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27424jut(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C27421juq.copydefault;
        copydefault();
    }

    /* JADX INFO: renamed from: o.jut$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jut.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ BarDataSet createBarDataSet$default(StateListAnimator stateListAnimator, java.util.List list, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 8) != 0) {
                i3 = 255;
            }
            return stateListAnimator.EZpvd(list, i, i2, i3);
        }

        public final BarDataSet EZpvd(@NotNull java.util.List<? extends BarEntry> list, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, int i3) {
            Intrinsics.checkNotNullParameter(list, "");
            BarDataSet barDataSet = new BarDataSet(list, "");
            barDataSet.setVisible(true);
            barDataSet.setDrawIcons(false);
            barDataSet.setColor(i);
            barDataSet.setDrawValues(false);
            barDataSet.setHighlightEnabled(true);
            barDataSet.setHighLightColor(i2);
            barDataSet.setHighLightAlpha(i3);
            return barDataSet;
        }

        public final java.util.List<BarEntry> KWHzl(java.util.List<InvestKLineDataPoint> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InvestKLineDataPoint investKLineDataPoint : list) {
                arrayList.add(new BarEntry(investKLineDataPoint.EZpvd(), C33129mqd.djBIcL(investKLineDataPoint.AEQbTJ()), investKLineDataPoint));
            }
            return arrayList;
        }
    }

    public final void copydefault() {
        getDescription().setEnabled(false);
        setDrawGridBackground(false);
        setTouchEnabled(true);
        getLegend().setEnabled(false);
        getXAxis().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getAxisRight().setEnabled(false);
        setDoubleTapToZoomEnabled(false);
        this.mDoubleTapToZoomEnabled = false;
        setPinchZoom(false);
        setScaleXEnabled(false);
        setScaleYEnabled(false);
        setDragEnabled(false);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setHighlightPerTapEnabled(false);
        setHighlightPerDragEnabled(false);
        setHighlightFullBarEnabled(true);
        getXAxis().setAxisMinimum(-0.5f);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setSpaceTop(0.0f);
        axisLeft.setSpaceBottom(0.0f);
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(0.0f);
        axisRight.setSpaceTop(0.0f);
        axisRight.setSpaceBottom(0.0f);
        ChartAnimator chartAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C27426juv(this, chartAnimator, viewPortHandler));
    }

    public static /* synthetic */ void setChartData$default(C27424jut c27424jut, java.util.List list, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        c27424jut.setChartData(list, num);
    }

    public final void setChartData(@NotNull java.util.List<InvestKLineDataPoint> list, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        BarDataSet barDataSetAEQbTJ = AEQbTJ(list);
        OLrzqt(AEQbTJ(list, num));
        EZpvd(C56402yEa.EZpvd(barDataSetAEQbTJ));
        OLrzqt();
    }

    public final BarDataSet AEQbTJ(java.util.List<InvestKLineDataPoint> list) {
        StateListAnimator stateListAnimator = Companion;
        return stateListAnimator.EZpvd(stateListAnimator.KWHzl(list), copydefault(false), copydefault(false), 255);
    }

    public final int AEQbTJ(java.util.List<InvestKLineDataPoint> list, java.lang.Integer num) {
        java.lang.Integer num2;
        if (list.isEmpty()) {
            return 0;
        }
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((InvestKLineDataPoint) it.next()).EZpvd());
            while (it.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((InvestKLineDataPoint) it.next()).EZpvd());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num2 = numValueOf;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final void OLrzqt(int i) {
        getXAxis().setAxisMaximum(i + 0.5f);
    }

    public final void EZpvd(java.util.List<? extends BarDataSet> list) {
        Application application = new Application(list);
        setData(application.AEQbTJ());
        this.EZpvd = application;
    }

    public final void OLrzqt() {
        invalidate();
    }

    public final void AEQbTJ(boolean z, Highlight highlight) {
        int iCopydefault = copydefault(!z);
        Application application = this.EZpvd;
        if (application != null) {
            application.OLrzqt(iCopydefault);
        }
        highlightValue(highlight, true);
    }

    public final int copydefault(boolean z) {
        C27421juq c27421juq = this.OLrzqt;
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c27421juq.EZpvd(context);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c27421juq.KWHzl(context2);
    }

    /* JADX INFO: renamed from: o.jut$Application */
    public static final class Application {
        public final java.util.List<BarDataSet> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jut$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.AEQbTJ;
            }
            return application.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.util.List<? extends BarDataSet> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BarChartUIData(barDataSets=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.BarDataSet> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull java.util.List<? extends BarDataSet> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        public final BarData AEQbTJ() {
            BarData barData = new BarData(this.AEQbTJ);
            barData.setBarWidth(0.75f);
            return barData;
        }

        public final void OLrzqt(@androidx.annotation.ColorInt int i) {
            java.util.Iterator<T> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                ((BarDataSet) it.next()).setColor(i);
            }
        }
    }
}

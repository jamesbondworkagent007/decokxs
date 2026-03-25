package o;

import androidx.core.graphics.ColorUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27411jug;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27382juD extends LineChart {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public StateListAnimator AEQbTJ;
    public C27421juq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27382juD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27382juD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStyle(@NotNull C27421juq c27421juq) {
        Intrinsics.checkNotNullParameter(c27421juq, "");
        this.EZpvd = c27421juq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.juD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27382juD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27382juD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C27421juq.copydefault;
        KWHzl();
    }

    /* JADX INFO: renamed from: o.juD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final LineDataSet copydefault(java.util.List<? extends Entry> list, @androidx.annotation.ColorInt int i) {
            LineDataSet lineDataSet = new LineDataSet(list, "");
            lineDataSet.setVisible(true);
            lineDataSet.setDrawIcons(false);
            lineDataSet.setColor(i);
            lineDataSet.setLineWidth(3.0f);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawFilled(false);
            lineDataSet.setDrawVerticalHighlightIndicator(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet.setHighlightEnabled(true);
            return lineDataSet;
        }

        public final java.util.List<Entry> EZpvd(java.util.List<InvestKLineDataPoint> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InvestKLineDataPoint investKLineDataPoint : list) {
                arrayList.add(new Entry(investKLineDataPoint.EZpvd(), investKLineDataPoint.KWHzl(), investKLineDataPoint));
            }
            return arrayList;
        }
    }

    private final void KWHzl() {
        C27411jug.StateListAnimator stateListAnimator = C27411jug.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        stateListAnimator.KWHzl(context, this, null);
        setStyle(C27421juq.copydefault);
        ChartAnimator animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C27383juE(this, animator, viewPortHandler));
        setHighlighter(new C27415juk(this));
    }

    public final void setChartData(@NotNull C23949iPh c23949iPh, float f) {
        Intrinsics.checkNotNullParameter(c23949iPh, "");
        DataRenderer renderer = getRenderer();
        C27383juE c27383juE = renderer instanceof C27383juE ? (C27383juE) renderer : null;
        if (c27383juE != null) {
            c27383juE.OLrzqt((int) (255 * f));
        }
        StateListAnimator stateListAnimator = new StateListAnimator(OLrzqt(c23949iPh.copydefault(), f), copydefault(c23949iPh.EZpvd(), f), OLrzqt(c23949iPh.AEQbTJ()));
        this.AEQbTJ = stateListAnimator;
        setData(stateListAnimator.copydefault());
        AEQbTJ(c23949iPh);
        EZpvd(c23949iPh);
        animateX(300);
    }

    public final void AEQbTJ(C23949iPh c23949iPh) {
        java.lang.Integer num;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = c23949iPh.copydefault().iterator();
        while (it.hasNext()) {
            arrayList.addAll((java.util.List) it.next());
        }
        java.util.Iterator<T> it2 = c23949iPh.EZpvd().iterator();
        while (it2.hasNext()) {
            arrayList.addAll((java.util.List) it2.next());
        }
        java.util.Iterator<T> it3 = c23949iPh.AEQbTJ().iterator();
        while (it3.hasNext()) {
            arrayList.addAll((java.util.List) it3.next());
        }
        if (arrayList.isEmpty()) {
            getXAxis().setAxisMinimum(-0.5f);
            getXAxis().setAxisMaximum(0.5f);
            return;
        }
        java.util.Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((InvestKLineDataPoint) it4.next()).EZpvd());
            while (it4.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((InvestKLineDataPoint) it4.next()).EZpvd());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        getXAxis().setAxisMinimum(-0.5f);
        getXAxis().setAxisMaximum(iIntValue + 0.5f);
    }

    public final void EZpvd(C23949iPh c23949iPh) {
        java.lang.Float fValueOf;
        float fAbs;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = c23949iPh.copydefault().iterator();
        while (it.hasNext()) {
            arrayList.addAll((java.util.List) it.next());
        }
        java.util.Iterator<T> it2 = c23949iPh.EZpvd().iterator();
        while (it2.hasNext()) {
            arrayList.addAll((java.util.List) it2.next());
        }
        java.util.Iterator<T> it3 = c23949iPh.AEQbTJ().iterator();
        while (it3.hasNext()) {
            arrayList.addAll((java.util.List) it3.next());
        }
        if (arrayList.isEmpty()) {
            YAxis axisLeft = getAxisLeft();
            axisLeft.setEnabled(false);
            axisLeft.resetAxisMinimum();
            axisLeft.resetAxisMaximum();
            YAxis axisRight = getAxisRight();
            axisRight.setEnabled(false);
            axisRight.resetAxisMinimum();
            axisRight.resetAxisMaximum();
            return;
        }
        java.util.Iterator it4 = arrayList.iterator();
        java.lang.Float fValueOf2 = null;
        if (it4.hasNext()) {
            float fKWHzl = ((InvestKLineDataPoint) it4.next()).KWHzl();
            while (it4.hasNext()) {
                fKWHzl = java.lang.Math.min(fKWHzl, ((InvestKLineDataPoint) it4.next()).KWHzl());
            }
            fValueOf = java.lang.Float.valueOf(fKWHzl);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        java.util.Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            float fKWHzl2 = ((InvestKLineDataPoint) it5.next()).KWHzl();
            while (it5.hasNext()) {
                fKWHzl2 = java.lang.Math.max(fKWHzl2, ((InvestKLineDataPoint) it5.next()).KWHzl());
            }
            fValueOf2 = java.lang.Float.valueOf(fKWHzl2);
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        float f = fFloatValue2 - fFloatValue;
        if (f > 0.0f) {
            fAbs = f * 0.05f;
        } else {
            fAbs = fFloatValue2 == 0.0f ? 0.01f : java.lang.Math.abs(fFloatValue2) * 0.05f;
        }
        float f2 = fFloatValue - fAbs;
        float f3 = fFloatValue2 + fAbs;
        YAxis axisLeft2 = getAxisLeft();
        axisLeft2.setEnabled(true);
        axisLeft2.setAxisMinimum(f2);
        axisLeft2.setAxisMaximum(f3);
        axisLeft2.setDrawLabels(false);
        axisLeft2.setDrawGridLines(false);
        axisLeft2.setDrawAxisLine(false);
        YAxis axisRight2 = getAxisRight();
        axisRight2.setEnabled(true);
        axisRight2.setAxisMinimum(f2);
        axisRight2.setAxisMaximum(f3);
        axisRight2.setDrawLabels(false);
        axisRight2.setDrawGridLines(false);
        axisRight2.setDrawAxisLine(false);
    }

    public final java.util.List<LineDataSet> OLrzqt(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list, float f) {
        int alphaComponent = ColorUtils.setAlphaComponent(KWHzl(false), (int) (f * 255));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Application application = Companion;
            arrayList.add(application.copydefault(application.EZpvd(list2), alphaComponent));
        }
        return arrayList;
    }

    public final java.util.List<LineDataSet> copydefault(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list, float f) {
        int alphaComponent = ColorUtils.setAlphaComponent(EZpvd(false), (int) (f * 255));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Application application = Companion;
            arrayList.add(application.copydefault(application.EZpvd(list2), alphaComponent));
        }
        return arrayList;
    }

    private final int KWHzl(boolean z) {
        C27421juq c27421juq = this.EZpvd;
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c27421juq.EZpvd(context);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c27421juq.KWHzl(context2);
    }

    private final int EZpvd(boolean z) {
        C27421juq c27421juq = this.EZpvd;
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c27421juq.copydefault(context);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c27421juq.OLrzqt(context2);
    }

    private final int EZpvd() {
        C27421juq c27421juq = this.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return c27421juq.AEQbTJ(context);
    }

    public final void OLrzqt(boolean z, Highlight highlight) {
        highlightValue(highlight, true);
    }

    /* JADX INFO: renamed from: o.juD$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.List<LineDataSet> EZpvd;
        public final java.util.List<LineDataSet> OLrzqt;
        public final java.util.List<LineDataSet> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.juD$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                list2 = stateListAnimator.EZpvd;
            }
            if ((i & 4) != 0) {
                list3 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.List<? extends LineDataSet> list, @NotNull java.util.List<? extends LineDataSet> list2, @NotNull java.util.List<? extends LineDataSet> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new StateListAnimator(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "KLineUIData(normalDataSets=" + this.copydefault + ", bonusDataSets=" + this.EZpvd + ", normalDataSetsDuringBonus=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull java.util.List<? extends LineDataSet> list, @NotNull java.util.List<? extends LineDataSet> list2, @NotNull java.util.List<? extends LineDataSet> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.copydefault = list;
            this.EZpvd = list2;
            this.OLrzqt = list3;
        }

        public final LineData copydefault() {
            return new LineData((java.util.List<ILineDataSet>) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.copydefault, (java.lang.Iterable) this.EZpvd));
        }
    }

    private final java.util.List<LineDataSet> OLrzqt(java.util.List<? extends java.util.List<InvestKLineDataPoint>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            Application application = Companion;
            arrayList.add(application.copydefault(application.EZpvd(list2), EZpvd()));
        }
        return arrayList;
    }
}

package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26085jRj extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final java.util.List<java.lang.String> AEQbTJ;
    public final int AhwBna;
    public java.util.Map<java.lang.String, java.util.List<C26093jRr>> KWHzl;
    public final C23502hzT OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.Boolean> copydefault;
    public final java.util.Map<java.lang.String, LineDataSet> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26085jRj(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:29) call: o.jRj.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C26085jRj(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26085jRj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23502hzT c23502hzTKWHzl = C23502hzT.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c23502hzTKWHzl, "");
        this.OLrzqt = c23502hzTKWHzl;
        this.AhwBna = C52761wXj.Activity.DQYQgr;
        this.AEQbTJ = C56402yEa.EZpvd("avgPrice");
        this.copydefault = C56424yEw.djBIcL(C56390yDp.OLrzqt("avgPrice", java.lang.Boolean.TRUE));
        this.gEmmrt = new LinkedHashMap();
        this.KWHzl = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        this.OLrzqt.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.jRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.copydefault("avgPrice");
            }
        });
    }

    public final void copydefault(java.lang.String str) {
        java.lang.Boolean bool = this.copydefault.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.copydefault.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.gEmmrt.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            KWHzl(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.copydefault.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.OLrzqt.AEQbTJ.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.OLrzqt.AEQbTJ.setVisibility(8);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "avgPrice")) {
                Group group = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(z ? 0 : 8);
            }
            this.OLrzqt.AhwBna.invalidate();
        }
    }

    public final void KWHzl(java.lang.String str, boolean z) {
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
        this.OLrzqt.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(z ? C25382ivf.KWHzl(this.AhwBna) : iKWHzl));
        this.OLrzqt.values.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : iKWHzl);
        this.OLrzqt.AYXKKw.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : iKWHzl);
        AppCompatTextView appCompatTextView = this.OLrzqt.AkhnZx;
        if (z) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        appCompatTextView.setTextColor(iKWHzl);
    }

    public final void copydefault(@NotNull java.util.List<ChartDataUIItem> list) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(list, "");
        copydefault();
        boolean zIsEmpty = list.isEmpty();
        C21970hTb c21970hTb = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c21970hTb, "");
        c21970hTb.setVisibility(zIsEmpty ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(zIsEmpty ? 0 : 8);
        if (zIsEmpty) {
            invalidate();
            return;
        }
        this.OLrzqt.djBIcL.setVisibility(0);
        this.gEmmrt.clear();
        this.KWHzl.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData = new LineData();
        if (!list.isEmpty()) {
            AEQbTJ(list, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView = this.OLrzqt.AYXKKw;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            java.lang.String scientificCurrency$default = (chartDataUIItem == null || (value = chartDataUIItem.getValue()) == null) ? null : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, value, true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            if (scientificCurrency$default == null || scientificCurrency$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) scientificCurrency$default)) {
                scientificCurrency$default = "--";
            }
            appCompatTextView.setText(scientificCurrency$default);
        }
        this.KWHzl = linkedHashMap;
        this.OLrzqt.AhwBna.setData(lineData);
        AEQbTJ(linkedHashMap2);
        KWHzl();
        copydefault(linkedHashMap);
    }

    public final void AEQbTJ(java.util.List<ChartDataUIItem> list, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C26093jRr>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C26093jRr> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            C25322iuY c25322iuY = C25322iuY.OLrzqt;
            java.lang.String strOLrzqt = c25322iuY.OLrzqt(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strOLrzqt);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C26093jRr(c25322iuY.gEmmrt(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i++;
        }
        map2.put(this.AEQbTJ.get(0), arrayList2);
        LineDataSet lineDataSetEZpvd = EZpvd(arrayList, this.AEQbTJ.get(0), this.AhwBna);
        this.gEmmrt.put(this.AEQbTJ.get(0), lineDataSetEZpvd);
        java.lang.Boolean bool = this.copydefault.get(this.AEQbTJ.get(0));
        lineDataSetEZpvd.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetEZpvd);
    }

    public final LineDataSet EZpvd(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(C25382ivf.copydefault(i, context));
        lineDataSet.setHighLightColor(0);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        return lineDataSet;
    }

    public final void AEQbTJ(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.OLrzqt.AhwBna.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new ActionBar(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    /* JADX INFO: renamed from: o.jRj$ActionBar */
    public static final class ActionBar extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> copydefault;

        public ActionBar(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.copydefault = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.copydefault.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void KWHzl() {
        YAxis axisRight = this.OLrzqt.AhwBna.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new Activity());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.OLrzqt.AhwBna.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    /* JADX INFO: renamed from: o.jRj$Activity */
    public static final class Activity extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, java.lang.String.valueOf(f), true, RoundingMode.UP, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void copydefault(java.util.Map<java.lang.String, java.util.List<C26093jRr>> map) {
        LineChart lineChart = this.OLrzqt.AhwBna;
        lineChart.setDragEnabled(true);
        lineChart.setScaleXEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setScaleEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.setTouchEnabled(true);
        lineChart.setHighlightPerTapEnabled(true);
        lineChart.setExtraBottomOffset(5.0f);
        Intrinsics.copydefault(lineChart);
        ConstraintLayout constraintLayout = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C26094jRs(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        jRG jrg = new jRG(context);
        jrg.setChartView(lineChart);
        lineChart.setMarker(jrg);
        LineChart lineChart2 = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        jrg.AEQbTJ(lineChart2, view, new Function0() { // from class: o.jRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26085jRj.AEQbTJ(this.copydefault));
            }
        });
        lineChart.invalidate();
        this.OLrzqt.AhwBna.requestLayout();
    }

    public static final boolean AEQbTJ(C26085jRj c26085jRj) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = c26085jRj.copydefault.values();
        if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((java.lang.Boolean) it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return !z;
    }

    public final void copydefault() {
        XAxis xAxis = this.OLrzqt.AhwBna.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.OLrzqt.AEQbTJ.setVisibility(8);
        this.OLrzqt.AhwBna.invalidate();
    }

    /* JADX INFO: renamed from: o.jRj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

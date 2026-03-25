package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
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
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26092jRq extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public java.util.Map<java.lang.String, java.util.List<C26093jRr>> AEQbTJ;
    public final java.util.List<java.lang.Integer> AYXKKw;
    public final java.util.Map<java.lang.String, LineDataSet> AhwBna;
    public final C21530hCu KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26092jRq(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.jRq.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C26092jRq(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26092jRq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21530hCu c21530hCuOLrzqt = C21530hCu.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21530hCuOLrzqt, "");
        this.KWHzl = c21530hCuOLrzqt;
        this.AYXKKw = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.OqFWZa), java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr));
        this.OLrzqt = yDY.gEmmrt("holders", "holding10u");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.copydefault = C56424yEw.djBIcL(C56390yDp.OLrzqt("holders", bool), C56390yDp.OLrzqt("holding10u", bool));
        this.AhwBna = new LinkedHashMap();
        this.AEQbTJ = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        C21530hCu c21530hCu = this.KWHzl;
        c21530hCu.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.jRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.EZpvd("holders");
            }
        });
        c21530hCu.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.jRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.EZpvd.EZpvd("holding10u");
            }
        });
    }

    public final void EZpvd(java.lang.String str) {
        java.lang.Boolean bool = this.copydefault.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.copydefault.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.AhwBna.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            OLrzqt(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.copydefault.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.KWHzl.KWHzl.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.KWHzl.KWHzl.setVisibility(8);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holders")) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holding10u")) {
                    Group group = this.KWHzl.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(group, "");
                    group.setVisibility(z ? 0 : 8);
                }
            } else {
                Group group2 = this.KWHzl.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(group2, "");
                group2.setVisibility(z ? 0 : 8);
            }
            this.KWHzl.valueOf.invalidate();
        }
    }

    public final void OLrzqt(java.lang.String str, boolean z) {
        int iCopydefault;
        int iCopydefault2;
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holders")) {
            if (z) {
                int iIntValue = this.AYXKKw.get(0).intValue();
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault2 = C25382ivf.copydefault(iIntValue, context);
            } else {
                iCopydefault2 = iKWHzl;
            }
            this.KWHzl.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
            AppCompatTextView appCompatTextView = this.KWHzl.iwGUEr;
            if (z) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView.setTextColor(iKWHzl);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holding10u")) {
            if (z) {
                int iIntValue2 = this.AYXKKw.get(1).intValue();
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iCopydefault = C25382ivf.copydefault(iIntValue2, context2);
            } else {
                iCopydefault = iKWHzl;
            }
            this.KWHzl.OLrzqt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
            AppCompatTextView appCompatTextView2 = this.KWHzl.getNewProxyInstance;
            if (z) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView2.setTextColor(iKWHzl);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2) {
        int i;
        java.lang.String value;
        java.lang.String value2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        EZpvd();
        boolean z = list.isEmpty() && list2.isEmpty();
        C21970hTb c21970hTb = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c21970hTb, "");
        c21970hTb.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.KWHzl.AkhnZx.setVisibility(0);
        this.AhwBna.clear();
        this.AEQbTJ.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData = new LineData();
        java.lang.String iCUCompact$default = null;
        if (!list.isEmpty()) {
            i = 2;
            OLrzqt(list, 0, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView = this.KWHzl.getFieldNames;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            java.lang.String iCUCompact$default2 = (chartDataUIItem == null || (value2 = chartDataUIItem.getValue()) == null) ? null : pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value2)), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
            if (iCUCompact$default2 == null || iCUCompact$default2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default2)) {
                iCUCompact$default2 = "--";
            }
            appCompatTextView.setText(iCUCompact$default2);
        } else {
            i = 2;
        }
        ConstraintLayout constraintLayout = this.KWHzl.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        Group group = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            OLrzqt(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView2 = this.KWHzl.fJNWhG;
            ChartDataUIItem chartDataUIItem2 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
            if (chartDataUIItem2 != null && (value = chartDataUIItem2.getValue()) != null) {
                iCUCompact$default = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value)), null, C38307pTy.Companion.AEQbTJ(i), null, null, 13, null);
            }
            appCompatTextView2.setText((iCUCompact$default == null || iCUCompact$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default)) ? "--" : iCUCompact$default);
            this.KWHzl.fARcdN.setVisibility(8);
        }
        this.AEQbTJ = linkedHashMap;
        this.KWHzl.valueOf.setData(lineData);
        AEQbTJ(linkedHashMap2);
        copydefault();
        OLrzqt(linkedHashMap);
    }

    public final void OLrzqt(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C26093jRr>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C26093jRr> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            C25322iuY c25322iuY = C25322iuY.OLrzqt;
            java.lang.String strOLrzqt = c25322iuY.OLrzqt(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i2;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strOLrzqt);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C26093jRr(c25322iuY.gEmmrt(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i2++;
        }
        map2.put(this.OLrzqt.get(i), arrayList2);
        LineDataSet lineDataSetKWHzl = KWHzl(arrayList, this.OLrzqt.get(i), this.AYXKKw.get(i).intValue());
        this.AhwBna.put(this.OLrzqt.get(i), lineDataSetKWHzl);
        java.lang.Boolean bool = this.copydefault.get(this.OLrzqt.get(i));
        lineDataSetKWHzl.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetKWHzl);
    }

    public final LineDataSet KWHzl(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
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
        XAxis xAxis = this.KWHzl.valueOf.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setValueFormatter(new ActionBar(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    /* JADX INFO: renamed from: o.jRq$ActionBar */
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

    public final void copydefault() {
        YAxis axisRight = this.KWHzl.valueOf.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new C21963hSv());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.KWHzl.valueOf.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
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
    public final void OLrzqt(java.util.Map<java.lang.String, java.util.List<C26093jRr>> map) {
        LineChart lineChart = this.KWHzl.valueOf;
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
        ConstraintLayout constraintLayout = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C26094jRs(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        jRG jrg = new jRG(context);
        jrg.setChartView(lineChart);
        lineChart.setMarker(jrg);
        LineChart lineChart2 = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        jrg.AEQbTJ(lineChart2, view, new Function0() { // from class: o.jRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26092jRq.AEQbTJ(this.AEQbTJ));
            }
        });
        lineChart.invalidate();
        this.KWHzl.valueOf.requestLayout();
    }

    public static final boolean AEQbTJ(C26092jRq c26092jRq) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = c26092jRq.copydefault.values();
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

    public final void EZpvd() {
        XAxis xAxis = this.KWHzl.valueOf.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.KWHzl.KWHzl.setVisibility(8);
        this.KWHzl.valueOf.invalidate();
    }

    /* JADX INFO: renamed from: o.jRq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

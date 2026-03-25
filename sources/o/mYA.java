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
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mYA extends android.widget.FrameLayout {
    public final java.util.Map<java.lang.String, LineDataSet> AhwBna;
    public final java.util.List<java.lang.String> EZpvd;
    public final C36073oOg KWHzl;
    public final java.util.Map<java.lang.String, java.lang.Boolean> OLrzqt;
    public java.util.Map<java.lang.String, java.util.List<C32349mYs>> copydefault;
    public final java.util.List<java.lang.Integer> djBIcL;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mYA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.mYA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mYA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mYA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36073oOg c36073oOgCopydefault = C36073oOg.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36073oOgCopydefault, "");
        this.KWHzl = c36073oOgCopydefault;
        this.djBIcL = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.OqFWZa), java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr));
        this.EZpvd = yDY.gEmmrt("holders", "holding10u");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.OLrzqt = C56424yEw.djBIcL(C56390yDp.OLrzqt("holders", bool), C56390yDp.OLrzqt("holding10u", bool));
        this.AhwBna = new LinkedHashMap();
        this.copydefault = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        C36073oOg c36073oOg = this.KWHzl;
        c36073oOg.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.mYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.KWHzl("holders");
            }
        });
        c36073oOg.values.setOnClickListener(new View.OnClickListener() { // from class: o.mYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.KWHzl("holding10u");
            }
        });
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.Boolean bool = this.OLrzqt.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.OLrzqt.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.AhwBna.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            OLrzqt(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.OLrzqt.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.KWHzl.copydefault.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.KWHzl.copydefault.setVisibility(8);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holders")) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holding10u")) {
                    Group group = this.KWHzl.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(group, "");
                    group.setVisibility(z ? 0 : 8);
                }
            } else {
                Group group2 = this.KWHzl.valueOf;
                Intrinsics.checkNotNullExpressionValue(group2, "");
                group2.setVisibility(z ? 0 : 8);
            }
            this.KWHzl.djBIcL.invalidate();
        }
    }

    public final void OLrzqt(java.lang.String str, boolean z) {
        int iEZpvd;
        int iEZpvd2;
        int iCopydefault = mUM.copydefault(C52761wXj.Activity.UlJrfe);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holders")) {
            if (z) {
                int iIntValue = this.djBIcL.get(0).intValue();
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iEZpvd2 = mUM.EZpvd(iIntValue, context);
            } else {
                iEZpvd2 = iCopydefault;
            }
            this.KWHzl.KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd2));
            AppCompatTextView appCompatTextView = this.KWHzl.uzCIH;
            if (z) {
                iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView.setTextColor(iCopydefault);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "holding10u")) {
            if (z) {
                int iIntValue2 = this.djBIcL.get(1).intValue();
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iEZpvd = mUM.EZpvd(iIntValue2, context2);
            } else {
                iEZpvd = iCopydefault;
            }
            this.KWHzl.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd));
            AppCompatTextView appCompatTextView2 = this.KWHzl.hDKMBd;
            if (z) {
                iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView2.setTextColor(iCopydefault);
        }
    }

    public final void KWHzl(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2) {
        int i;
        java.lang.String value;
        java.lang.String value2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        KWHzl();
        boolean z = list.isEmpty() && list2.isEmpty();
        C32238mUp c32238mUp = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c32238mUp, "");
        c32238mUp.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.KWHzl.isConnected.setVisibility(0);
        this.AhwBna.clear();
        this.copydefault.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData = new LineData();
        java.lang.String iCUCompact$default = null;
        if (!list.isEmpty()) {
            i = 2;
            KWHzl(list, 0, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView = this.KWHzl.getNewProxyInstance;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            java.lang.String iCUCompact$default2 = (chartDataUIItem == null || (value2 = chartDataUIItem.getValue()) == null) ? null : pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value2)), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
            if (iCUCompact$default2 == null || iCUCompact$default2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default2)) {
                iCUCompact$default2 = "--";
            }
            appCompatTextView.setText(iCUCompact$default2);
        } else {
            i = 2;
        }
        ConstraintLayout constraintLayout = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        Group group = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            KWHzl(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView2 = this.KWHzl.fJNWhG;
            ChartDataUIItem chartDataUIItem2 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
            if (chartDataUIItem2 != null && (value = chartDataUIItem2.getValue()) != null) {
                iCUCompact$default = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value)), null, C38307pTy.Companion.AEQbTJ(i), null, null, 13, null);
            }
            appCompatTextView2.setText((iCUCompact$default == null || iCUCompact$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default)) ? "--" : iCUCompact$default);
            this.KWHzl.fIwbmz.setVisibility(8);
        }
        this.copydefault = linkedHashMap;
        this.KWHzl.djBIcL.setData(lineData);
        KWHzl(linkedHashMap2);
        copydefault();
        EZpvd(linkedHashMap);
    }

    public final void KWHzl(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C32349mYs>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C32349mYs> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            mUK muk = mUK.AEQbTJ;
            java.lang.String strKWHzl = muk.KWHzl(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i2;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strKWHzl);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C32349mYs(muk.copydefault(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i2++;
        }
        map2.put(this.EZpvd.get(i), arrayList2);
        LineDataSet lineDataSetAEQbTJ = AEQbTJ(arrayList, this.EZpvd.get(i), this.djBIcL.get(i).intValue());
        this.AhwBna.put(this.EZpvd.get(i), lineDataSetAEQbTJ);
        java.lang.Boolean bool = this.OLrzqt.get(this.EZpvd.get(i));
        lineDataSetAEQbTJ.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetAEQbTJ);
    }

    public final LineDataSet AEQbTJ(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(mUM.EZpvd(i, context));
        lineDataSet.setHighLightColor(0);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        return lineDataSet;
    }

    public final void KWHzl(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.KWHzl.djBIcL.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setValueFormatter(new StateListAnimator(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    public static final class StateListAnimator extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> copydefault;

        public StateListAnimator(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.copydefault = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.copydefault.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void copydefault() {
        YAxis axisRight = this.KWHzl.djBIcL.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new C32225mUc());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(mUM.copydefault(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.KWHzl.djBIcL.getAxisLeft();
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
    public final void EZpvd(java.util.Map<java.lang.String, java.util.List<C32349mYs>> map) {
        LineChart lineChart = this.KWHzl.djBIcL;
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
        ConstraintLayout constraintLayout = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C32354mYx(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mYL myl = new mYL(context);
        myl.setChartView(lineChart);
        lineChart.setMarker(myl);
        LineChart lineChart2 = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        myl.EZpvd(lineChart2, view, new Function0() { // from class: o.mYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mYA.AEQbTJ(this.KWHzl));
            }
        });
        lineChart.invalidate();
        this.KWHzl.djBIcL.requestLayout();
    }

    public static final boolean AEQbTJ(mYA mya) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = mya.OLrzqt.values();
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

    public final void KWHzl() {
        XAxis xAxis = this.KWHzl.djBIcL.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.KWHzl.copydefault.setVisibility(8);
        this.KWHzl.djBIcL.invalidate();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mYA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

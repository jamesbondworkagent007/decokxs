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
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mYK extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final oNQ AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.Map<java.lang.String, java.lang.Boolean> KWHzl;
    public java.util.Map<java.lang.String, java.util.List<C32349mYs>> copydefault;
    public final java.util.Map<java.lang.String, LineDataSet> gEmmrt;
    public final java.util.List<java.lang.Integer> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mYK(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.mYK.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mYK(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mYK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oNQ onqCopydefault = oNQ.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(onqCopydefault, "");
        this.AEQbTJ = onqCopydefault;
        this.valueOf = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr), java.lang.Integer.valueOf(C52761wXj.ActionBar.zuWLRA), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq));
        this.EZpvd = yDY.gEmmrt("dev", "suspicious", "insider");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.KWHzl = C56424yEw.djBIcL(C56390yDp.OLrzqt("dev", bool), C56390yDp.OLrzqt("suspicious", bool), C56390yDp.OLrzqt("insider", bool));
        this.gEmmrt = new LinkedHashMap();
        this.copydefault = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        oNQ onq = this.AEQbTJ;
        onq.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.mYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.OLrzqt("dev");
            }
        });
        onq.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.mYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.KWHzl.OLrzqt("suspicious");
            }
        });
        onq.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: o.mYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.EZpvd.OLrzqt("insider");
            }
        });
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.Boolean bool = this.KWHzl.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.KWHzl.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.gEmmrt.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            AEQbTJ(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.KWHzl.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.AEQbTJ.OLrzqt.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.AEQbTJ.OLrzqt.setVisibility(8);
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 99349) {
                if (iHashCode != 133626717) {
                    if (iHashCode == 1957244918 && str.equals("insider")) {
                        Group group = this.AEQbTJ.AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(z ? 0 : 8);
                    }
                } else if (str.equals("suspicious")) {
                    Group group2 = this.AEQbTJ.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(z ? 0 : 8);
                }
            } else if (str.equals("dev")) {
                Group group3 = this.AEQbTJ.djBIcL;
                Intrinsics.checkNotNullExpressionValue(group3, "");
                group3.setVisibility(z ? 0 : 8);
            }
            this.AEQbTJ.fetchVPNInfo.invalidate();
        }
    }

    public final void AEQbTJ(java.lang.String str, boolean z) {
        int iEZpvd;
        int iEZpvd2;
        int iEZpvd3;
        int iCopydefault = mUM.copydefault(C52761wXj.Activity.UlJrfe);
        int iHashCode = str.hashCode();
        if (iHashCode == 99349) {
            if (str.equals("dev")) {
                if (z) {
                    int iIntValue = this.valueOf.get(0).intValue();
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iEZpvd = mUM.EZpvd(iIntValue, context);
                } else {
                    iEZpvd = iCopydefault;
                }
                this.AEQbTJ.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd));
                AppCompatTextView appCompatTextView = this.AEQbTJ.uzCIH;
                if (z) {
                    iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
                }
                appCompatTextView.setTextColor(iCopydefault);
                return;
            }
            return;
        }
        if (iHashCode == 133626717) {
            if (str.equals("suspicious")) {
                if (z) {
                    int iIntValue2 = this.valueOf.get(1).intValue();
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iEZpvd2 = mUM.EZpvd(iIntValue2, context2);
                } else {
                    iEZpvd2 = iCopydefault;
                }
                this.AEQbTJ.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd2));
                AppCompatTextView appCompatTextView2 = this.AEQbTJ.wlaJM;
                if (z) {
                    iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
                }
                appCompatTextView2.setTextColor(iCopydefault);
                return;
            }
            return;
        }
        if (iHashCode == 1957244918 && str.equals("insider")) {
            if (z) {
                int iIntValue3 = this.valueOf.get(2).intValue();
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iEZpvd3 = mUM.EZpvd(iIntValue3, context3);
            } else {
                iEZpvd3 = iCopydefault;
            }
            this.AEQbTJ.KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd3));
            AppCompatTextView appCompatTextView3 = this.AEQbTJ.wlaJM;
            if (z) {
                iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView3.setTextColor(iCopydefault);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2, @NotNull java.util.List<ChartDataUIItem> list3) {
        java.lang.CharSequence charSequence;
        LineData lineData;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        AEQbTJ();
        boolean z = list.isEmpty() && list2.isEmpty() && list3.isEmpty();
        C32238mUp c32238mUp = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c32238mUp, "");
        c32238mUp.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.AEQbTJ.AuCTel.setVisibility(0);
        this.gEmmrt.clear();
        this.copydefault.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData2 = new LineData();
        ConstraintLayout constraintLayout = this.AEQbTJ.isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        Group group = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        if (!list.isEmpty()) {
            charSequence = "--";
            lineData = lineData2;
            EZpvd(list, 0, linkedHashMap2, linkedHashMap, lineData2);
            this.AEQbTJ.AkhnZx.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list)).getValue()));
            this.AEQbTJ.AkhnZx.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            charSequence = "--";
            lineData = lineData2;
            this.AEQbTJ.AkhnZx.setText(charSequence);
        }
        ConstraintLayout constraintLayout2 = this.AEQbTJ.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        Group group2 = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            EZpvd(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            this.AEQbTJ.AubY.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list2)).getValue()));
            this.AEQbTJ.AubY.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            this.AEQbTJ.AubY.setText(charSequence);
        }
        ConstraintLayout constraintLayout3 = this.AEQbTJ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group3 = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        group3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list3.isEmpty()) {
            EZpvd(list3, 2, linkedHashMap2, linkedHashMap, lineData);
            this.AEQbTJ.getFieldNames.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list3)).getValue()));
            this.AEQbTJ.getFieldNames.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            this.AEQbTJ.getFieldNames.setText(charSequence);
        }
        this.copydefault = linkedHashMap;
        this.AEQbTJ.fetchVPNInfo.setData(lineData);
        copydefault(linkedHashMap2);
        KWHzl();
        EZpvd(linkedHashMap);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C32163mRv.formatPercentWithoutSymbol$default(str, false, 0, new BigDecimal(0.01d), false, null, 27, null) : "--";
    }

    public final void EZpvd(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C32349mYs>> map2, LineData lineData) {
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
        LineDataSet lineDataSetAEQbTJ = AEQbTJ(arrayList, this.EZpvd.get(i), this.valueOf.get(i).intValue());
        this.gEmmrt.put(this.EZpvd.get(i), lineDataSetAEQbTJ);
        java.lang.Boolean bool = this.KWHzl.get(this.EZpvd.get(i));
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

    public final void copydefault(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.AEQbTJ.fetchVPNInfo.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
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
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> KWHzl;

        public StateListAnimator(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.KWHzl = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.KWHzl.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void KWHzl() {
        YAxis axisRight = this.AEQbTJ.fetchVPNInfo.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new Application());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(mUM.copydefault(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.AEQbTJ.fetchVPNInfo.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    public static final class Application extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.formatICUPercent$default(java.lang.Float.valueOf(f), null, null, null, null, null, 31, null);
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
        LineChart lineChart = this.AEQbTJ.fetchVPNInfo;
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
        ConstraintLayout constraintLayout = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C32354mYx(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mYL myl = new mYL(context);
        myl.setChartView(lineChart);
        lineChart.setMarker(myl);
        LineChart lineChart2 = this.AEQbTJ.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        myl.EZpvd(lineChart2, view, new Function0() { // from class: o.mYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mYK.AEQbTJ(this.AEQbTJ));
            }
        });
        lineChart.invalidate();
        this.AEQbTJ.fetchVPNInfo.requestLayout();
    }

    public static final boolean AEQbTJ(mYK myk) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = myk.KWHzl.values();
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

    public final void AEQbTJ() {
        XAxis xAxis = this.AEQbTJ.fetchVPNInfo.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.AEQbTJ.OLrzqt.setVisibility(8);
        this.AEQbTJ.fetchVPNInfo.invalidate();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mYK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

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
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26101jRz extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public java.util.Map<java.lang.String, java.util.List<C26093jRr>> AEQbTJ;
    public final java.util.Map<java.lang.String, LineDataSet> AhwBna;
    public final java.util.Map<java.lang.String, java.lang.Boolean> EZpvd;
    public final hAF OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final java.util.List<java.lang.Integer> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26101jRz(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.jRz.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C26101jRz(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26101jRz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hAF hafOLrzqt = hAF.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hafOLrzqt, "");
        this.OLrzqt = hafOLrzqt;
        this.valueOf = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr), java.lang.Integer.valueOf(C52761wXj.ActionBar.zuWLRA), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq));
        this.copydefault = yDY.gEmmrt("dev", "suspicious", "insider");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.EZpvd = C56424yEw.djBIcL(C56390yDp.OLrzqt("dev", bool), C56390yDp.OLrzqt("suspicious", bool), C56390yDp.OLrzqt("insider", bool));
        this.AhwBna = new LinkedHashMap();
        this.AEQbTJ = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        hAF haf = this.OLrzqt;
        haf.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.jRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.copydefault("dev");
            }
        });
        haf.fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.jRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.copydefault("suspicious");
            }
        });
        haf.AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.jRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.copydefault.copydefault("insider");
            }
        });
    }

    public final void copydefault(java.lang.String str) {
        java.lang.Boolean bool = this.EZpvd.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.EZpvd.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.AhwBna.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            AEQbTJ(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.EZpvd.values();
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
            int iHashCode = str.hashCode();
            if (iHashCode != 99349) {
                if (iHashCode != 133626717) {
                    if (iHashCode == 1957244918 && str.equals("insider")) {
                        Group group = this.OLrzqt.valueOf;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(z ? 0 : 8);
                    }
                } else if (str.equals("suspicious")) {
                    Group group2 = this.OLrzqt.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(z ? 0 : 8);
                }
            } else if (str.equals("dev")) {
                Group group3 = this.OLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(group3, "");
                group3.setVisibility(z ? 0 : 8);
            }
            this.OLrzqt.DbNXlk.invalidate();
        }
    }

    public final void AEQbTJ(java.lang.String str, boolean z) {
        int iCopydefault;
        int iCopydefault2;
        int iCopydefault3;
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
        int iHashCode = str.hashCode();
        if (iHashCode == 99349) {
            if (str.equals("dev")) {
                if (z) {
                    int iIntValue = this.valueOf.get(0).intValue();
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iCopydefault = C25382ivf.copydefault(iIntValue, context);
                } else {
                    iCopydefault = iKWHzl;
                }
                this.OLrzqt.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
                AppCompatTextView appCompatTextView = this.OLrzqt.hDKMBd;
                if (z) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
                }
                appCompatTextView.setTextColor(iKWHzl);
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
                    iCopydefault2 = C25382ivf.copydefault(iIntValue2, context2);
                } else {
                    iCopydefault2 = iKWHzl;
                }
                this.OLrzqt.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
                AppCompatTextView appCompatTextView2 = this.OLrzqt.AuCTelauCTel;
                if (z) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
                }
                appCompatTextView2.setTextColor(iKWHzl);
                return;
            }
            return;
        }
        if (iHashCode == 1957244918 && str.equals("insider")) {
            if (z) {
                int iIntValue3 = this.valueOf.get(2).intValue();
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iCopydefault3 = C25382ivf.copydefault(iIntValue3, context3);
            } else {
                iCopydefault3 = iKWHzl;
            }
            this.OLrzqt.KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault3));
            AppCompatTextView appCompatTextView3 = this.OLrzqt.AuCTelauCTel;
            if (z) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            }
            appCompatTextView3.setTextColor(iKWHzl);
        }
    }

    public final void KWHzl(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2, @NotNull java.util.List<ChartDataUIItem> list3) {
        java.lang.CharSequence charSequence;
        LineData lineData;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        copydefault();
        boolean z = list.isEmpty() && list2.isEmpty() && list3.isEmpty();
        C21970hTb c21970hTb = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c21970hTb, "");
        c21970hTb.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.OLrzqt.fJNWhG.setVisibility(0);
        this.AhwBna.clear();
        this.AEQbTJ.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData2 = new LineData();
        ConstraintLayout constraintLayout = this.OLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        Group group = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        if (!list.isEmpty()) {
            charSequence = "--";
            lineData = lineData2;
            KWHzl(list, 0, linkedHashMap2, linkedHashMap, lineData2);
            this.OLrzqt.isConnected.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list)).getValue()));
            this.OLrzqt.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        } else {
            charSequence = "--";
            lineData = lineData2;
            this.OLrzqt.isConnected.setText(charSequence);
        }
        ConstraintLayout constraintLayout2 = this.OLrzqt.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        Group group2 = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            KWHzl(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            this.OLrzqt.wlaJM.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list2)).getValue()));
            this.OLrzqt.wlaJM.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        } else {
            this.OLrzqt.wlaJM.setText(charSequence);
        }
        ConstraintLayout constraintLayout3 = this.OLrzqt.AuCTel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group3 = this.OLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        group3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list3.isEmpty()) {
            KWHzl(list3, 2, linkedHashMap2, linkedHashMap, lineData);
            this.OLrzqt.uzCIH.setText(KWHzl(((ChartDataUIItem) CollectionsKt___CollectionsKt.AubY(list3)).getValue()));
            this.OLrzqt.uzCIH.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        } else {
            this.OLrzqt.uzCIH.setText(charSequence);
        }
        this.AEQbTJ = linkedHashMap;
        this.OLrzqt.DbNXlk.setData(lineData);
        EZpvd(linkedHashMap2);
        KWHzl();
        copydefault(linkedHashMap);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C23311hvo.formatPercentWithoutSymbol$default(str, false, 0, new BigDecimal(0.01d), false, null, 27, null) : "--";
    }

    public final void KWHzl(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C26093jRr>> map2, LineData lineData) {
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
        map2.put(this.copydefault.get(i), arrayList2);
        LineDataSet lineDataSetCopydefault = copydefault(arrayList, this.copydefault.get(i), this.valueOf.get(i).intValue());
        this.AhwBna.put(this.copydefault.get(i), lineDataSetCopydefault);
        java.lang.Boolean bool = this.EZpvd.get(this.copydefault.get(i));
        lineDataSetCopydefault.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetCopydefault);
    }

    public final LineDataSet copydefault(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
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

    public final void EZpvd(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.OLrzqt.DbNXlk.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new StateListAnimator(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    /* JADX INFO: renamed from: o.jRz$StateListAnimator */
    public static final class StateListAnimator extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> OLrzqt;

        public StateListAnimator(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.OLrzqt = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.OLrzqt.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void KWHzl() {
        YAxis axisRight = this.OLrzqt.DbNXlk.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new TaskDescription());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.OLrzqt.DbNXlk.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    /* JADX INFO: renamed from: o.jRz$TaskDescription */
    public static final class TaskDescription extends ValueFormatter {
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
    public final void copydefault(java.util.Map<java.lang.String, java.util.List<C26093jRr>> map) {
        LineChart lineChart = this.OLrzqt.DbNXlk;
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
        LineChart lineChart2 = this.OLrzqt.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        jrg.AEQbTJ(lineChart2, view, new Function0() { // from class: o.jRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26101jRz.OLrzqt(this.copydefault));
            }
        });
        lineChart.invalidate();
        this.OLrzqt.DbNXlk.requestLayout();
    }

    public static final boolean OLrzqt(C26101jRz c26101jRz) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = c26101jRz.EZpvd.values();
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
        XAxis xAxis = this.OLrzqt.DbNXlk.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.OLrzqt.AEQbTJ.setVisibility(8);
        this.OLrzqt.DbNXlk.invalidate();
    }

    /* JADX INFO: renamed from: o.jRz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

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
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32348mYr extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final java.util.List<java.lang.String> AEQbTJ;
    public final int AhwBna;
    public final java.util.Map<java.lang.String, java.lang.Boolean> EZpvd;
    public final oNG KWHzl;
    public java.util.Map<java.lang.String, java.util.List<C32349mYs>> copydefault;
    public final java.util.Map<java.lang.String, LineDataSet> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32348mYr(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:29) call: o.mYr.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32348mYr(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32348mYr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oNG ongAEQbTJ = oNG.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(ongAEQbTJ, "");
        this.KWHzl = ongAEQbTJ;
        this.AhwBna = C52761wXj.Activity.DQYQgr;
        this.AEQbTJ = C56402yEa.EZpvd("avgPrice");
        this.EZpvd = C56424yEw.djBIcL(C56390yDp.OLrzqt("avgPrice", java.lang.Boolean.TRUE));
        this.djBIcL = new LinkedHashMap();
        this.copydefault = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        this.KWHzl.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.mYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.EZpvd("avgPrice");
            }
        });
    }

    public final void EZpvd(java.lang.String str) {
        java.lang.Boolean bool = this.EZpvd.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.EZpvd.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.djBIcL.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            copydefault(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.EZpvd.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.KWHzl.AEQbTJ.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.KWHzl.AEQbTJ.setVisibility(8);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "avgPrice")) {
                Group group = this.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(z ? 0 : 8);
            }
            this.KWHzl.valueOf.invalidate();
        }
    }

    public final void copydefault(java.lang.String str, boolean z) {
        int iCopydefault = mUM.copydefault(C52761wXj.Activity.UlJrfe);
        this.KWHzl.KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(z ? mUM.copydefault(this.AhwBna) : iCopydefault));
        this.KWHzl.DbNXlk.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.fdOvFl) : iCopydefault);
        this.KWHzl.AhwBna.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.fdOvFl) : iCopydefault);
        AppCompatTextView appCompatTextView = this.KWHzl.AkhnZx;
        if (z) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        appCompatTextView.setTextColor(iCopydefault);
    }

    public final void OLrzqt(@NotNull java.util.List<ChartDataUIItem> list) {
        java.lang.String strOLrzqt;
        java.lang.String value;
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ();
        boolean zIsEmpty = list.isEmpty();
        C32238mUp c32238mUp = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c32238mUp, "");
        c32238mUp.setVisibility(zIsEmpty ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(zIsEmpty ? 0 : 8);
        if (zIsEmpty) {
            invalidate();
            return;
        }
        this.KWHzl.gEmmrt.setVisibility(0);
        this.djBIcL.clear();
        this.copydefault.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData = new LineData();
        if (!list.isEmpty()) {
            copydefault(list, linkedHashMap2, linkedHashMap, lineData);
            AppCompatTextView appCompatTextView = this.KWHzl.AhwBna;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            if (chartDataUIItem == null || (value = chartDataUIItem.getValue()) == null) {
                strOLrzqt = null;
            } else {
                strOLrzqt = mRJ.AEQbTJ.OLrzqt(value, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
            }
            if (strOLrzqt == null || strOLrzqt.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                strOLrzqt = "--";
            }
            appCompatTextView.setText(strOLrzqt);
        }
        this.copydefault = linkedHashMap;
        this.KWHzl.valueOf.setData(lineData);
        KWHzl(linkedHashMap2);
        EZpvd();
        OLrzqt(linkedHashMap);
    }

    public final void copydefault(java.util.List<ChartDataUIItem> list, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C32349mYs>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C32349mYs> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            mUK muk = mUK.AEQbTJ;
            java.lang.String strKWHzl = muk.KWHzl(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strKWHzl);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C32349mYs(muk.copydefault(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i++;
        }
        map2.put(this.AEQbTJ.get(0), arrayList2);
        LineDataSet lineDataSetKWHzl = KWHzl(arrayList, this.AEQbTJ.get(0), this.AhwBna);
        this.djBIcL.put(this.AEQbTJ.get(0), lineDataSetKWHzl);
        java.lang.Boolean bool = this.EZpvd.get(this.AEQbTJ.get(0));
        lineDataSetKWHzl.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetKWHzl);
    }

    public final LineDataSet KWHzl(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
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
        XAxis xAxis = this.KWHzl.valueOf.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new Activity(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    /* JADX INFO: renamed from: o.mYr$Activity */
    public static final class Activity extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> EZpvd;

        public Activity(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.EZpvd = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.EZpvd.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void EZpvd() {
        YAxis axisRight = this.KWHzl.valueOf.getAxisRight();
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
        YAxis axisLeft = this.KWHzl.valueOf.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    /* JADX INFO: renamed from: o.mYr$Application */
    public static final class Application extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return mRJ.AEQbTJ.OLrzqt(java.lang.String.valueOf(f), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.UP, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
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
    public final void OLrzqt(java.util.Map<java.lang.String, java.util.List<C32349mYs>> map) {
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
        ConstraintLayout constraintLayout = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C32354mYx(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mYL myl = new mYL(context);
        myl.setChartView(lineChart);
        lineChart.setMarker(myl);
        LineChart lineChart2 = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(lineChart2, "");
        android.view.View view = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        myl.EZpvd(lineChart2, view, new Function0() { // from class: o.mYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C32348mYr.EZpvd(this.copydefault));
            }
        });
        lineChart.invalidate();
        this.KWHzl.valueOf.requestLayout();
    }

    public static final boolean EZpvd(C32348mYr c32348mYr) {
        boolean z;
        java.util.Collection<java.lang.Boolean> collectionValues = c32348mYr.EZpvd.values();
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
        XAxis xAxis = this.KWHzl.valueOf.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.KWHzl.AEQbTJ.setVisibility(8);
        this.KWHzl.valueOf.invalidate();
    }

    /* JADX INFO: renamed from: o.mYr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mYr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.find_ui.data.ContractLongShortRatioData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pWU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34873nkf extends AbstractC34832njr {
    public int AuCTelauCTel;
    public C34857nkP AubY;
    public int AwvSrB;
    public int AxsJAY;
    public C42659rab gHZMYf;
    public java.util.ArrayList<java.lang.Long> zuBGHE = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> sSMYrx = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> DTwDnp = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.nkf$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.DTwDnp;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gHZMYf = C42659rab.EZpvd(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        android.content.Context context = getContext();
        C42659rab c42659rab = null;
        if (context != null) {
            C34857nkP c34857nkP = new C34857nkP(context);
            this.AubY = c34857nkP;
            Intrinsics.copydefault(c34857nkP);
            c34857nkP.setLayoutDirection(C55296xhK.AEQbTJ(context));
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            this.AwvSrB = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            this.AuCTelauCTel = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
            this.AxsJAY = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            C42659rab c42659rab2 = this.gHZMYf;
            if (c42659rab2 == null) {
                Intrinsics.gEmmrt("");
                c42659rab2 = null;
            }
            c42659rab2.KWHzl.setFirstTitle(C33070mpX.AYXKKw(qZH.PendingIntent.aWuQzD));
            C42659rab c42659rab3 = this.gHZMYf;
            if (c42659rab3 == null) {
                Intrinsics.gEmmrt("");
                c42659rab3 = null;
            }
            c42659rab3.KWHzl.setSecondTitle(C33070mpX.AYXKKw(qZH.PendingIntent.QzqeNH));
            C42659rab c42659rab4 = this.gHZMYf;
            if (c42659rab4 == null) {
                Intrinsics.gEmmrt("");
                c42659rab4 = null;
            }
            c42659rab4.KWHzl.setThirdTitle(C33070mpX.AYXKKw(qZH.PendingIntent.hKJZrr));
            C42659rab c42659rab5 = this.gHZMYf;
            if (c42659rab5 == null) {
                Intrinsics.gEmmrt("");
                c42659rab5 = null;
            }
            c42659rab5.KWHzl.setFirstBgColor(this.AwvSrB);
            C42659rab c42659rab6 = this.gHZMYf;
            if (c42659rab6 == null) {
                Intrinsics.gEmmrt("");
                c42659rab6 = null;
            }
            c42659rab6.KWHzl.setSecondBgColor(this.AuCTelauCTel);
            C42659rab c42659rab7 = this.gHZMYf;
            if (c42659rab7 == null) {
                Intrinsics.gEmmrt("");
                c42659rab7 = null;
            }
            c42659rab7.KWHzl.setThirdBgColor(this.AxsJAY);
            pWU.Application application = pWU.Companion;
            C42659rab c42659rab8 = this.gHZMYf;
            if (c42659rab8 == null) {
                Intrinsics.gEmmrt("");
                c42659rab8 = null;
            }
            C34887nkt c34887nkt = c42659rab8.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c34887nkt, "");
            application.OLrzqt(context, c34887nkt, this.AubY, false);
        }
        C42659rab c42659rab9 = this.gHZMYf;
        if (c42659rab9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42659rab = c42659rab9;
        }
        C34887nkt c34887nkt2 = c42659rab.OLrzqt;
        c34887nkt2.getLegend().setEnabled(false);
        c34887nkt2.getAxisLeft().setEnabled(true);
        c34887nkt2.getAxisRight().setEnabled(true);
        c34887nkt2.setDrawBarShadow(true);
        c34887nkt2.setNoDataText("");
        c34887nkt2.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.LINE});
        c34887nkt2.setOnChartValueSelectedListener(new ActionBar());
    }

    /* JADX INFO: renamed from: o.nkf$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public ActionBar() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            C34873nkf.this.copydefault("KLine_TradingData_ContractLongShortRatio_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().EZpvd().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.nkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34873nkf.KWHzl(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        C42659rab c42659rab = this.gHZMYf;
        if (c42659rab == null) {
            Intrinsics.gEmmrt("");
            c42659rab = null;
        }
        c42659rab.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34873nkf.KWHzl(this.copydefault, view);
            }
        });
    }

    public static final Unit KWHzl(C34873nkf c34873nkf, java.util.ArrayList arrayList) {
        c34873nkf.getNewProxyInstance();
        if (arrayList == null) {
            c34873nkf.zuBGHE();
        } else {
            c34873nkf.hDKMBd();
            c34873nkf.KWHzl((java.util.ArrayList<ContractLongShortRatioData>) arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C34873nkf c34873nkf, android.view.View view) {
        android.content.Context context = c34873nkf.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.RbVjfb, qZH.PendingIntent.GhqvEQ);
            java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "FUTURES")) {
            AwvSrB();
            AkhnZx().AEQbTJ(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd(), Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? "init" : "futures_ratio_chart");
        }
    }

    public final void KWHzl(java.util.ArrayList<ContractLongShortRatioData> arrayList) {
        C42659rab c42659rab = this.gHZMYf;
        if (c42659rab == null) {
            Intrinsics.gEmmrt("");
            c42659rab = null;
        }
        c42659rab.OLrzqt.clear();
        this.zuBGHE.clear();
        this.sSMYrx.clear();
        this.DTwDnp.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            uzCIH();
            AxsJAY();
            return;
        }
        getFieldNames();
        gHZMYf();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.zuBGHE.add(java.lang.Long.valueOf(C33129mqd.valueOf(((ContractLongShortRatioData) it.next()).getTs())));
        }
        for (ContractLongShortRatioData contractLongShortRatioData : C56405yEd.zLjUOn(arrayList)) {
            this.sSMYrx.add(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(contractLongShortRatioData.getShortPercent()) / 100)));
            this.DTwDnp.add(contractLongShortRatioData.getRatio());
        }
        copydefault(this.zuBGHE);
        OLrzqt(C56405yEd.zLjUOn(arrayList), this.sSMYrx, this.DTwDnp);
    }

    private final void copydefault(java.util.ArrayList<java.lang.Long> arrayList) {
        C42659rab c42659rab = this.gHZMYf;
        if (c42659rab == null) {
            Intrinsics.gEmmrt("");
            c42659rab = null;
        }
        XAxis xAxis = c42659rab.OLrzqt.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setLabelCount(5, true);
        xAxis.setAxisMinimum(-0.5f);
        xAxis.setAxisMaximum(C33129mqd.djBIcL(java.lang.Integer.valueOf(arrayList.size())) - 0.5f);
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) copydefault()) ? 2 : 1);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
    }

    private final void OLrzqt(java.util.List<ContractLongShortRatioData> list, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        java.lang.Float fValueOf;
        java.lang.Float fValueOf2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList3.add(new BarEntry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)), C33129mqd.djBIcL(arrayList.get(i)), list.get(i)));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList4.add(new Entry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)), C33129mqd.djBIcL(arrayList2.get(i2)), list.get(i2)));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList3, "");
        barDataSet.setColor(this.AuCTelauCTel);
        barDataSet.setBarShadowColor(this.AwvSrB);
        barDataSet.setDrawValues(false);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
        barDataSet.setHighLightAlpha(0);
        barDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.5f);
        C42659rab c42659rab = null;
        LineDataSet lineDataSet = new LineDataSet(arrayList4, null);
        lineDataSet.setColor(this.AxsJAY);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.dXcUrg));
        lineDataSet.setHighlightLineWidth(0.5f);
        lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        LineData lineData = new LineData(lineDataSet);
        C42659rab c42659rab2 = this.gHZMYf;
        if (c42659rab2 == null) {
            Intrinsics.gEmmrt("");
            c42659rab2 = null;
        }
        YAxis axisLeft = c42659rab2.OLrzqt.getAxisLeft();
        C55051xce c55051xce = C55051xce.OLrzqt;
        axisLeft.setTypeface(c55051xce.valueOf());
        axisLeft.setLabelCount(3, true);
        axisLeft.setValueFormatter(new C34893nkz(0));
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(1.0f);
        C42659rab c42659rab3 = this.gHZMYf;
        if (c42659rab3 == null) {
            Intrinsics.gEmmrt("");
            c42659rab3 = null;
        }
        YAxis axisRight = c42659rab3.OLrzqt.getAxisRight();
        axisRight.setTypeface(c55051xce.valueOf());
        axisRight.setLabelCount(3, true);
        java.util.Iterator<T> it = arrayList2.iterator();
        if (it.hasNext()) {
            float fDjBIcL = C33129mqd.djBIcL((java.lang.String) it.next());
            while (it.hasNext()) {
                fDjBIcL = java.lang.Math.min(fDjBIcL, C33129mqd.djBIcL((java.lang.String) it.next()));
            }
            fValueOf = java.lang.Float.valueOf(fDjBIcL);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        java.util.Iterator<T> it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            float fDjBIcL2 = C33129mqd.djBIcL((java.lang.String) it2.next());
            while (it2.hasNext()) {
                fDjBIcL2 = java.lang.Math.max(fDjBIcL2, C33129mqd.djBIcL((java.lang.String) it2.next()));
            }
            fValueOf2 = java.lang.Float.valueOf(fDjBIcL2);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 1.0f;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        axisRight.setAxisMinimum(java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(fFloatValue * 0.98f), 2, bool, RoundingMode.FLOOR)));
        axisRight.setAxisMaximum(java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(fFloatValue2 * 1.02f), 2, bool, RoundingMode.CEILING)));
        axisRight.setValueFormatter(new DefaultValueFormatter(2));
        CombinedData combinedData = new CombinedData();
        combinedData.setData(barData);
        combinedData.setData(lineData);
        C42659rab c42659rab4 = this.gHZMYf;
        if (c42659rab4 == null) {
            Intrinsics.gEmmrt("");
            c42659rab4 = null;
        }
        c42659rab4.OLrzqt.setData(combinedData);
        C42659rab c42659rab5 = this.gHZMYf;
        if (c42659rab5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42659rab = c42659rab5;
        }
        c42659rab.OLrzqt.animateX(AEQbTJ());
    }
}

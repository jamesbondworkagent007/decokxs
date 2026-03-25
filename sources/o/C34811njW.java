package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.jobs.MoveViewJob;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.find_ui.data.BigDataTimeIntervalItem;
import com.okinc.find_ui.data.KlineCapitalFlowData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47244tmQ;
import o.C52761wXj;
import o.pWU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34811njW extends AbstractC34832njr {
    public C42661rad AuCTelauCTel;
    public int AubY;
    public int AxsJAY;
    public C34850nkI sSMYrx;
    public java.util.ArrayList<java.lang.Long> AwvSrB = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> zuBGHE = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> gHZMYf = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.njW$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.AxsJAY;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AuCTelauCTel = C42661rad.EZpvd(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.sSMYrx = new C34850nkI(contextRequireContext);
        android.content.Context context = getContext();
        if (context != null) {
            C34850nkI c34850nkI = this.sSMYrx;
            C42661rad c42661rad = null;
            if (c34850nkI == null) {
                Intrinsics.gEmmrt("");
                c34850nkI = null;
            }
            c34850nkI.setLayoutDirection(C55296xhK.AEQbTJ(context));
            pWU.Application application = pWU.Companion;
            C42661rad c42661rad2 = this.AuCTelauCTel;
            if (c42661rad2 == null) {
                Intrinsics.gEmmrt("");
                c42661rad2 = null;
            }
            C34887nkt c34887nkt = c42661rad2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c34887nkt, "");
            C34850nkI c34850nkI2 = this.sSMYrx;
            if (c34850nkI2 == null) {
                Intrinsics.gEmmrt("");
                c34850nkI2 = null;
            }
            application.OLrzqt(context, c34887nkt, c34850nkI2, false);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            this.AxsJAY = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            this.AubY = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
            C42661rad c42661rad3 = this.AuCTelauCTel;
            if (c42661rad3 == null) {
                Intrinsics.gEmmrt("");
                c42661rad3 = null;
            }
            c42661rad3.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.AxsJAY));
            C42661rad c42661rad4 = this.AuCTelauCTel;
            if (c42661rad4 == null) {
                Intrinsics.gEmmrt("");
                c42661rad4 = null;
            }
            c42661rad4.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.AubY));
            C42661rad c42661rad5 = this.AuCTelauCTel;
            if (c42661rad5 == null) {
                Intrinsics.gEmmrt("");
                c42661rad5 = null;
            }
            c42661rad5.KWHzl.getAxisLeft().setEnabled(true);
            C42661rad c42661rad6 = this.AuCTelauCTel;
            if (c42661rad6 == null) {
                Intrinsics.gEmmrt("");
                c42661rad6 = null;
            }
            c42661rad6.KWHzl.getAxisLeft().resetAxisMinimum();
            C42661rad c42661rad7 = this.AuCTelauCTel;
            if (c42661rad7 == null) {
                Intrinsics.gEmmrt("");
                c42661rad7 = null;
            }
            c42661rad7.KWHzl.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.LINE});
            C42661rad c42661rad8 = this.AuCTelauCTel;
            if (c42661rad8 == null) {
                Intrinsics.gEmmrt("");
                c42661rad8 = null;
            }
            c42661rad8.KWHzl.setNoDataText("");
            C42661rad c42661rad9 = this.AuCTelauCTel;
            if (c42661rad9 == null) {
                Intrinsics.gEmmrt("");
                c42661rad9 = null;
            }
            c42661rad9.KWHzl.getPaint(7).setTextSize(C55298xhM.EZpvd(16.0f, context));
            C42661rad c42661rad10 = this.AuCTelauCTel;
            if (c42661rad10 == null) {
                Intrinsics.gEmmrt("");
                c42661rad10 = null;
            }
            c42661rad10.KWHzl.setNoDataTextColor(ContextCompat.getColor(context, C52761wXj.Activity.DeEinT));
            C42661rad c42661rad11 = this.AuCTelauCTel;
            if (c42661rad11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c42661rad = c42661rad11;
            }
            c42661rad.KWHzl.setOnChartValueSelectedListener(new StateListAnimator());
        }
    }

    /* JADX INFO: renamed from: o.njW$StateListAnimator */
    public static final class StateListAnimator implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public StateListAnimator() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            C34811njW.this.copydefault("KLine_TradingData_MoneyFlow_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.njT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34811njW.copydefault(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C42661rad c42661rad = this.AuCTelauCTel;
        if (c42661rad == null) {
            Intrinsics.gEmmrt("");
            c42661rad = null;
        }
        c42661rad.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.njV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34811njW.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final Unit copydefault(C34811njW c34811njW, java.util.ArrayList arrayList) {
        c34811njW.getNewProxyInstance();
        if (arrayList == null) {
            c34811njW.zuBGHE();
        } else {
            c34811njW.hDKMBd();
            c34811njW.EZpvd((java.util.ArrayList<KlineCapitalFlowData>) arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C34811njW c34811njW, android.view.View view) {
        android.content.Context context = c34811njW.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.OKSWiw, qZH.PendingIntent.OAjjVP);
            java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    private final void EZpvd(java.util.ArrayList<KlineCapitalFlowData> arrayList) {
        C42661rad c42661rad = this.AuCTelauCTel;
        if (c42661rad == null) {
            Intrinsics.gEmmrt("");
            c42661rad = null;
        }
        c42661rad.KWHzl.clear();
        this.AwvSrB.clear();
        this.zuBGHE.clear();
        this.gHZMYf.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            uzCIH();
            AxsJAY();
            return;
        }
        gHZMYf();
        getFieldNames();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.AwvSrB.add(java.lang.Long.valueOf(C33129mqd.valueOf(((KlineCapitalFlowData) it.next()).getTs())));
        }
        java.util.List<KlineCapitalFlowData> listZLjUOn = C56405yEd.zLjUOn(arrayList);
        for (KlineCapitalFlowData klineCapitalFlowData : listZLjUOn) {
            this.zuBGHE.add(klineCapitalFlowData.getNetVol());
            this.gHZMYf.add(klineCapitalFlowData.getClosePrice());
            klineCapitalFlowData.setNetVolTitle(new C54536xML().isConnected().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(klineCapitalFlowData.getNetVol()))))) + " " + OLrzqt());
            if (AYXKKw() == -1) {
                klineCapitalFlowData.setClosePrice(pTB.formatLocalized$default(klineCapitalFlowData.getClosePrice(), null, 1, null) + " " + gEmmrt());
            } else {
                klineCapitalFlowData.setClosePrice(OLrzqt(C33129mqd.AEQbTJ(klineCapitalFlowData.getClosePrice()), AYXKKw()) + " " + gEmmrt());
                C43296rmc.KWHzl("wgtwgt", "converAndShowData: digits != -1 ");
            }
        }
        EZpvd(listZLjUOn, this.AwvSrB, this.zuBGHE, this.gHZMYf);
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
            AwvSrB();
            AkhnZx().AEQbTJ(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd());
        }
    }

    @Override // o.AbstractC34832njr
    public void zsXlph() {
        EZpvd("1D");
        int i = 0;
        for (java.lang.Object obj : isConnected()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((BigDataTimeIntervalItem) obj).setSelect(i == 0);
            i++;
        }
        C35144npl c35144nplAhwBna = AhwBna();
        if (c35144nplAhwBna != null) {
            c35144nplAhwBna.setData(isConnected());
        }
    }

    public final void EZpvd(java.util.List<KlineCapitalFlowData> list, java.util.ArrayList<java.lang.Long> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.util.ArrayList<java.lang.String> arrayList3) {
        if (list.size() == 0) {
            return;
        }
        java.util.ArrayList<BarEntry> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList<Entry> arrayList5 = new java.util.ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f = i * 1.0f;
            arrayList4.add(new BarEntry(f, C33129mqd.djBIcL(arrayList2.get(i)), list.get(i)));
            arrayList5.add(new Entry(f, C33129mqd.djBIcL(arrayList3.get(i)), list.get(i)));
        }
        C42661rad c42661rad = this.AuCTelauCTel;
        C42661rad c42661rad2 = null;
        if (c42661rad == null) {
            Intrinsics.gEmmrt("");
            c42661rad = null;
        }
        c42661rad.KWHzl.getXAxis().setDrawAxisLine(false);
        C42661rad c42661rad3 = this.AuCTelauCTel;
        if (c42661rad3 == null) {
            Intrinsics.gEmmrt("");
            c42661rad3 = null;
        }
        c42661rad3.KWHzl.getXAxis().setSpaceMin(1.0f);
        C42661rad c42661rad4 = this.AuCTelauCTel;
        if (c42661rad4 == null) {
            Intrinsics.gEmmrt("");
            c42661rad4 = null;
        }
        c42661rad4.KWHzl.getXAxis().setSpaceMax(1.0f);
        C42661rad c42661rad5 = this.AuCTelauCTel;
        if (c42661rad5 == null) {
            Intrinsics.gEmmrt("");
            c42661rad5 = null;
        }
        c42661rad5.KWHzl.getXAxis().setAxisMaximum((arrayList4.size() - 1) + 0.5f);
        C42661rad c42661rad6 = this.AuCTelauCTel;
        if (c42661rad6 == null) {
            Intrinsics.gEmmrt("");
            c42661rad6 = null;
        }
        c42661rad6.KWHzl.getXAxis().setAxisMinimum(-0.5f);
        C42661rad c42661rad7 = this.AuCTelauCTel;
        if (c42661rad7 == null) {
            Intrinsics.gEmmrt("");
            c42661rad7 = null;
        }
        c42661rad7.KWHzl.getXAxis().setGranularity(1.0f);
        C42661rad c42661rad8 = this.AuCTelauCTel;
        if (c42661rad8 == null) {
            Intrinsics.gEmmrt("");
            c42661rad8 = null;
        }
        c42661rad8.KWHzl.getXAxis().setGranularityEnabled(true);
        C42661rad c42661rad9 = this.AuCTelauCTel;
        if (c42661rad9 == null) {
            Intrinsics.gEmmrt("");
            c42661rad9 = null;
        }
        c42661rad9.KWHzl.getAxisLeft().setValueFormatter(new C34891nkx());
        C42661rad c42661rad10 = this.AuCTelauCTel;
        if (c42661rad10 == null) {
            Intrinsics.gEmmrt("");
            c42661rad10 = null;
        }
        c42661rad10.KWHzl.getAxisLeft().setTextColor(getResources().getColor(C47244tmQ.Application.copydefault));
        C42661rad c42661rad11 = this.AuCTelauCTel;
        if (c42661rad11 == null) {
            Intrinsics.gEmmrt("");
            c42661rad11 = null;
        }
        c42661rad11.KWHzl.getAxisLeft().setDrawZeroLine(true);
        C42661rad c42661rad12 = this.AuCTelauCTel;
        if (c42661rad12 == null) {
            Intrinsics.gEmmrt("");
            c42661rad12 = null;
        }
        c42661rad12.KWHzl.getAxisLeft().setZeroLineWidth(1.0f);
        C42661rad c42661rad13 = this.AuCTelauCTel;
        if (c42661rad13 == null) {
            Intrinsics.gEmmrt("");
            c42661rad13 = null;
        }
        c42661rad13.KWHzl.getAxisLeft().setZeroLineColor(getResources().getColor(C52761wXj.Activity.fZc));
        C42661rad c42661rad14 = this.AuCTelauCTel;
        if (c42661rad14 == null) {
            Intrinsics.gEmmrt("");
            c42661rad14 = null;
        }
        c42661rad14.KWHzl.getXAxis().setTypeface(C55051xce.OLrzqt.valueOf());
        C42661rad c42661rad15 = this.AuCTelauCTel;
        if (c42661rad15 == null) {
            Intrinsics.gEmmrt("");
            c42661rad15 = null;
        }
        XAxis xAxis = c42661rad15.KWHzl.getXAxis();
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(2);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
        C42661rad c42661rad16 = this.AuCTelauCTel;
        if (c42661rad16 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42661rad2 = c42661rad16;
        }
        C34887nkt c34887nkt = c42661rad2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c34887nkt, "");
        AEQbTJ(c34887nkt, arrayList4, arrayList5);
    }

    public final void AEQbTJ(CombinedChart combinedChart, java.util.ArrayList<BarEntry> arrayList, java.util.ArrayList<Entry> arrayList2) {
        combinedChart.getLegend().setForm(Legend.LegendForm.NONE);
        LineData lineData = new LineData();
        LineDataSet lineDataSet = new LineDataSet(arrayList2, null);
        lineDataSet.setColor(getResources().getColor(C52761wXj.Activity.Dff));
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setHighlightLineWidth(0.5f);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet.setHighLightColor(getResources().getColor(C52761wXj.Activity.dXcUrg));
        lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineData.addDataSet(lineDataSet);
        YAxis axisRight = combinedChart.getAxisRight();
        float yMin = lineData.getYMin();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        axisRight.setAxisMinimum(java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(yMin), 12, bool, RoundingMode.FLOOR)) * 0.9f);
        axisRight.setAxisMaximum(java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(lineData.getYMax()), 12, bool, RoundingMode.CEILING)) * 1.1f);
        BarDataSet barDataSet = new BarDataSet(arrayList, null);
        barDataSet.setDrawIcons(false);
        barDataSet.setHighlightEnabled(false);
        barDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).getY() > 0.0f) {
                android.content.Context context = getContext();
                if (context != null) {
                    arrayList4.add(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)));
                }
                android.content.Context context2 = getContext();
                if (context2 != null) {
                    arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeRise$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)));
                }
            } else {
                android.content.Context context3 = getContext();
                if (context3 != null) {
                    arrayList4.add(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                }
                android.content.Context context4 = getContext();
                if (context4 != null) {
                    arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeFall$default(C33512mxp.AEQbTJ, context4, 0.0f, 2, null)));
                }
            }
        }
        barDataSet.setColors(arrayList4);
        barDataSet.setDrawValues(true);
        barDataSet.setValueFormatter(new C34892nky());
        barDataSet.setValueTextColors(arrayList3);
        barDataSet.setValueTextSize(9.0f);
        barDataSet.setValueTypeface(C55051xce.OLrzqt.valueOf());
        BarData barData = new BarData(barDataSet);
        CombinedData combinedData = new CombinedData();
        barData.setBarWidth(0.4f);
        combinedData.setData(barData);
        combinedData.setData(lineData);
        combinedChart.setData(combinedData);
        combinedChart.moveViewToX(C33129mqd.djBIcL(java.lang.Integer.valueOf(arrayList.size() - 1)));
        combinedChart.animateX(AEQbTJ());
        combinedChart.setVisibleXRangeMaximum(5.0f);
        combinedChart.setVisibleXRangeMinimum(5.0f);
        combinedChart.setViewPortOffsets(0.0f, combinedChart.getViewPortHandler().offsetTop(), 0.0f, combinedChart.getXAxis().mLabelHeight + 20.0f);
        combinedChart.invalidate();
    }

    @Override // o.AbstractC34832njr
    public void zLjUOn() {
        isConnected().clear();
        java.util.ArrayList<BigDataTimeIntervalItem> arrayListIsConnected = isConnected();
        arrayListIsConnected.add(new BigDataTimeIntervalItem(-1440, "1D", java.lang.Boolean.TRUE));
        arrayListIsConnected.add(new BigDataTimeIntervalItem(-10080, "1W", null, 4, null));
        arrayListIsConnected.add(new BigDataTimeIntervalItem(-44640, "1M", null, 4, null));
        C35144npl c35144nplAhwBna = AhwBna();
        if (c35144nplAhwBna != null) {
            c35144nplAhwBna.setData(isConnected());
        }
        C35144npl c35144nplAhwBna2 = AhwBna();
        if (c35144nplAhwBna2 != null) {
            c35144nplAhwBna2.setTimeSelectCallBack(new Function1() { // from class: o.njX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34811njW.EZpvd(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.njr.initData$default(o.njr, java.lang.Boolean, int, java.lang.Object):void */
    public static final Unit EZpvd(final C34811njW c34811njW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c34811njW.EZpvd(str);
        AbstractC34832njr.initData$default(c34811njW, null, 1, null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_TradingData_MoneyFlowTimeInterval_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.njU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34811njW.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34811njW c34811njW, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("time_interval", c34811njW.EZpvd(), true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MoveViewJob.getInstance(null, 0.0f, 0.0f, null, null);
    }
}

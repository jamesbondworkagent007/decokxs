package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47244tmQ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34800njL extends AbstractC34832njr {
    public C34853nkL AuCTelauCTel;
    public int AwvSrB;
    public int AxsJAY;
    public int gHZMYf;
    public qZZ sSMYrx;
    public int zuBGHE;
    public java.util.ArrayList<java.lang.Long> DTwDnp = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> QOLQEE = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> OcIXYQ = new java.util.ArrayList<>();
    public int AubY = 1;

    /* JADX INFO: renamed from: o.njL$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.AwvSrB;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.sSMYrx = qZZ.copydefault(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        qZZ qzz = this.sSMYrx;
        qZZ qzz2 = null;
        if (qzz == null) {
            Intrinsics.gEmmrt("");
            qzz = null;
        }
        qzz.copydefault.setLeftTitle(C33070mpX.AYXKKw(qZH.PendingIntent.DAgZj));
        qZZ qzz3 = this.sSMYrx;
        if (qzz3 == null) {
            Intrinsics.gEmmrt("");
            qzz3 = null;
        }
        qzz3.copydefault.setRightTitle(C33070mpX.AYXKKw(qZH.PendingIntent.onProviderDisabled));
        android.content.Context context = getContext();
        if (context != null) {
            C34853nkL c34853nkL = new C34853nkL(context);
            this.AuCTelauCTel = c34853nkL;
            Intrinsics.copydefault(c34853nkL);
            c34853nkL.setLayoutDirection(C55296xhK.AEQbTJ(context));
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            this.AxsJAY = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            this.zuBGHE = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        }
        qZZ qzz4 = this.sSMYrx;
        if (qzz4 == null) {
            Intrinsics.gEmmrt("");
            qzz4 = null;
        }
        qzz4.copydefault.setLeftBgColor(this.AxsJAY);
        qZZ qzz5 = this.sSMYrx;
        if (qzz5 == null) {
            Intrinsics.gEmmrt("");
            qzz5 = null;
        }
        qzz5.copydefault.setRightBgColor(this.zuBGHE);
        android.content.Context context2 = getContext();
        if (context2 != null) {
            C34847nkF c34847nkF = C34847nkF.EZpvd;
            qZZ qzz6 = this.sSMYrx;
            if (qzz6 == null) {
                Intrinsics.gEmmrt("");
                qzz6 = null;
            }
            C34890nkw c34890nkw = qzz6.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c34890nkw, "");
            c34847nkF.EZpvd(context2, c34890nkw, this.AuCTelauCTel);
        }
        qZZ qzz7 = this.sSMYrx;
        if (qzz7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzz2 = qzz7;
        }
        C34890nkw c34890nkw2 = qzz2.KWHzl;
        c34890nkw2.getAxisLeft().setEnabled(true);
        c34890nkw2.getAxisRight().setEnabled(false);
        c34890nkw2.setDrawBarShadow(false);
        c34890nkw2.setNoDataText("");
        c34890nkw2.getLegend().setEnabled(false);
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.njQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34800njL.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        qZZ qzz = this.sSMYrx;
        if (qzz == null) {
            Intrinsics.gEmmrt("");
            qzz = null;
        }
        qzz.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.njO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34800njL.OLrzqt(this.copydefault, view);
            }
        });
    }

    public static final Unit AEQbTJ(C34800njL c34800njL, java.util.ArrayList arrayList) {
        c34800njL.getNewProxyInstance();
        if (arrayList == null) {
            c34800njL.zuBGHE();
        } else {
            c34800njL.hDKMBd();
            c34800njL.KWHzl((java.util.ArrayList<LongShortRatioData>) arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C34800njL c34800njL, android.view.View view) {
        android.content.Context context = c34800njL.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(context.getString(qZH.PendingIntent.RkASWs), C33069mpW.copydefault(c34800njL, qZH.PendingIntent.RSDDiY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("quoteccy", c34800njL.gEmmrt()), C56390yDp.OLrzqt("baseccy", c34800njL.OLrzqt()))));
            java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
            if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
                AwvSrB();
                AkhnZx().OLrzqt(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd(), "margin_borrow_chart");
            }
        }
    }

    public final void KWHzl(java.util.ArrayList<LongShortRatioData> arrayList) {
        qZZ qzz = this.sSMYrx;
        if (qzz == null) {
            Intrinsics.gEmmrt("");
            qzz = null;
        }
        qzz.KWHzl.clear();
        this.DTwDnp.clear();
        this.QOLQEE.clear();
        this.OcIXYQ.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            uzCIH();
            AxsJAY();
            return;
        }
        getFieldNames();
        gHZMYf();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.DTwDnp.add(java.lang.Long.valueOf(C33129mqd.valueOf(((LongShortRatioData) it.next()).getTs())));
        }
        java.util.List<LongShortRatioData> listZLjUOn = C56405yEd.zLjUOn(arrayList);
        for (LongShortRatioData longShortRatioData : listZLjUOn) {
            java.util.ArrayList<java.lang.String> arrayList2 = this.QOLQEE;
            java.lang.String longAmt = longShortRatioData.getLongAmt();
            if (longAmt == null) {
                longAmt = "";
            }
            arrayList2.add(longAmt);
            java.util.ArrayList<java.lang.String> arrayList3 = this.OcIXYQ;
            java.lang.String shortAmt = longShortRatioData.getShortAmt();
            if (shortAmt == null) {
                shortAmt = "";
            }
            arrayList3.add(shortAmt);
            if (C33129mqd.AhwBna(C33129mqd.EZpvd(longShortRatioData.getLongAmt())) > this.AwvSrB) {
                this.AwvSrB = C33129mqd.AhwBna(C33129mqd.EZpvd(longShortRatioData.getLongAmt()));
            }
            if (C33129mqd.AhwBna(C33129mqd.EZpvd(longShortRatioData.getShortAmt())) > this.gHZMYf) {
                this.gHZMYf = C33129mqd.AhwBna(C33129mqd.EZpvd(longShortRatioData.getShortAmt()));
            }
        }
        sSMYrx();
        C34853nkL c34853nkL = this.AuCTelauCTel;
        if (c34853nkL != null) {
            c34853nkL.setBaseSymbol(OLrzqt());
        }
        copydefault(this.DTwDnp);
        KWHzl(listZLjUOn, this.QOLQEE, this.OcIXYQ);
    }

    public final void copydefault(java.util.ArrayList<java.lang.Long> arrayList) {
        qZZ qzz = this.sSMYrx;
        if (qzz == null) {
            Intrinsics.gEmmrt("");
            qzz = null;
        }
        XAxis xAxis = qzz.KWHzl.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.mAxisMaximum = C33129mqd.djBIcL(java.lang.Integer.valueOf(arrayList.size()));
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) copydefault()) ? 2 : 1);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
    }

    public final void KWHzl(java.util.List<LongShortRatioData> list, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(i));
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(C33129mqd.djBIcL(arrayList.get(i))));
            arrayList4.add(java.lang.Float.valueOf(-C33129mqd.djBIcL(arrayList2.get(i))));
            Unit unit = Unit.INSTANCE;
            arrayList3.add(new BarEntry(fDjBIcL, CollectionsKt___CollectionsKt.AkhnZx(arrayList4), list.get(i)));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList3, "");
        barDataSet.setColors(yDY.copydefault(java.lang.Integer.valueOf(this.AxsJAY), java.lang.Integer.valueOf(this.zuBGHE)));
        barDataSet.setDrawValues(false);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(getResources().getColor(C47244tmQ.Application.copydefault));
        barDataSet.setHighLightAlpha(0);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(barDataSet);
        BarData barData = new BarData(arrayList5);
        barData.setBarWidth(0.5f);
        qZZ qzz = this.sSMYrx;
        qZZ qzz2 = null;
        if (qzz == null) {
            Intrinsics.gEmmrt("");
            qzz = null;
        }
        qzz.KWHzl.setData(barData);
        qZZ qzz3 = this.sSMYrx;
        if (qzz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzz2 = qzz3;
        }
        YAxis axisLeft = qzz2.KWHzl.getAxisLeft();
        axisLeft.setLabelCount(3, true);
        axisLeft.setDrawZeroLine(true);
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setValueFormatter(new C34843nkB(2));
        float yMax = barData.getYMax() >= java.lang.Math.abs(barData.getYMin()) ? barData.getYMax() : java.lang.Math.abs(barData.getYMin());
        axisLeft.setAxisMinimum(-yMax);
        axisLeft.setAxisMaximum(yMax);
    }

    public final void sSMYrx() {
        if (this.gHZMYf >= 1000000) {
            java.util.ArrayList<java.lang.String> arrayList = this.QOLQEE;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(C33129mqd.AhwBna(C33129mqd.EZpvd((java.lang.String) it.next()))));
            }
            java.util.ArrayList<java.lang.String> arrayList3 = this.OcIXYQ;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            java.util.Iterator<T> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(java.lang.String.valueOf(C33129mqd.AhwBna(C33129mqd.EZpvd((java.lang.String) it2.next()))));
            }
        }
    }
}

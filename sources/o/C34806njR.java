package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.find_ui.data.BuySellBean;
import com.okinc.find_ui.data.KlineBuySellData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34806njR extends AbstractC34832njr {
    public qZW AuCTelauCTel;
    public C34852nkK gHZMYf;
    public java.util.ArrayList<java.lang.Long> zuBGHE = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> AwvSrB = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> AxsJAY = new java.util.ArrayList<>();
    public java.util.ArrayList<BuySellBean> AubY = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.njR$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.zuBGHE;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AuCTelauCTel = qZW.EZpvd(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        C34883nkp c34883nkp;
        C34883nkp c34883nkp2;
        qZW qzw = this.AuCTelauCTel;
        C34852nkK c34852nkK = null;
        if (qzw == null) {
            Intrinsics.gEmmrt("");
            qzw = null;
        }
        qzw.KWHzl.setLeftTitle(C33070mpX.AYXKKw(qZH.PendingIntent.adwzgZ));
        qZW qzw2 = this.AuCTelauCTel;
        if (qzw2 == null) {
            Intrinsics.gEmmrt("");
            qzw2 = null;
        }
        qzw2.KWHzl.setRightTitle(C33070mpX.AYXKKw(qZH.PendingIntent.apLTlu));
        qZW qzw3 = this.AuCTelauCTel;
        if (qzw3 == null) {
            Intrinsics.gEmmrt("");
            qzw3 = null;
        }
        qzw3.KWHzl.setLeftBgStyle(true);
        qZW qzw4 = this.AuCTelauCTel;
        if (qzw4 == null) {
            Intrinsics.gEmmrt("");
            qzw4 = null;
        }
        qzw4.KWHzl.setRightBgStyle(true);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.gHZMYf = new C34852nkK(contextRequireContext);
        android.content.Context context = getContext();
        if (context != null) {
            C34852nkK c34852nkK2 = this.gHZMYf;
            if (c34852nkK2 == null) {
                Intrinsics.gEmmrt("");
                c34852nkK2 = null;
            }
            c34852nkK2.setLayoutDirection(C55296xhK.AEQbTJ(context));
            qZW qzw5 = this.AuCTelauCTel;
            if (qzw5 == null) {
                Intrinsics.gEmmrt("");
                qzw5 = null;
            }
            if (qzw5 != null && (c34883nkp2 = qzw5.KWHzl) != null) {
                c34883nkp2.setLeftBgColor(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
            }
            qZW qzw6 = this.AuCTelauCTel;
            if (qzw6 == null) {
                Intrinsics.gEmmrt("");
                qzw6 = null;
            }
            if (qzw6 != null && (c34883nkp = qzw6.KWHzl) != null) {
                c34883nkp.setRightBgColor(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
            }
        }
        qZW qzw7 = this.AuCTelauCTel;
        if (qzw7 == null) {
            Intrinsics.gEmmrt("");
            qzw7 = null;
        }
        C34888nku c34888nku = qzw7.EZpvd;
        c34888nku.getAxisLeft().setEnabled(true);
        c34888nku.getAxisRight().setEnabled(false);
        C34846nkE c34846nkE = C34846nkE.OLrzqt;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Intrinsics.copydefault(c34888nku);
        C34852nkK c34852nkK3 = this.gHZMYf;
        if (c34852nkK3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c34852nkK = c34852nkK3;
        }
        c34846nkE.KWHzl(contextRequireContext2, c34888nku, c34852nkK, false);
        c34888nku.setNoDataText("");
        c34888nku.setOnChartValueSelectedListener(new ActionBar());
    }

    /* JADX INFO: renamed from: o.njR$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public ActionBar() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            C34806njR.this.copydefault("KLine_TradingData_ActiveBuySell_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().copydefault().observe(this, new StateListAnimator(new Function1() { // from class: o.njP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34806njR.KWHzl(this.KWHzl, (KlineBuySellData) obj);
            }
        }));
        qZW qzw = this.AuCTelauCTel;
        if (qzw == null) {
            Intrinsics.gEmmrt("");
            qzw = null;
        }
        qzw.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.njS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34806njR.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final Unit KWHzl(C34806njR c34806njR, KlineBuySellData klineBuySellData) {
        c34806njR.getNewProxyInstance();
        if (klineBuySellData == null) {
            c34806njR.zuBGHE();
        } else {
            c34806njR.hDKMBd();
            c34806njR.OLrzqt(klineBuySellData);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C34806njR c34806njR, android.view.View view) {
        android.content.Context context = c34806njR.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.iMXFZQ, qZH.PendingIntent.icKaHr);
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
            AkhnZx().copydefault(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd(), fIwbmz());
        }
    }

    public final void OLrzqt(KlineBuySellData klineBuySellData) {
        java.util.ArrayList<BuySellBean> cont;
        qZW qzw = this.AuCTelauCTel;
        if (qzw == null) {
            Intrinsics.gEmmrt("");
            qzw = null;
        }
        qzw.EZpvd.clear();
        this.zuBGHE.clear();
        this.AwvSrB.clear();
        this.AxsJAY.clear();
        if (klineBuySellData != null) {
            java.lang.String strFIwbmz = fIwbmz();
            if (Intrinsics.EZpvd((java.lang.Object) strFIwbmz, (java.lang.Object) AuCTel())) {
                cont = klineBuySellData.getCrypto();
            } else {
                cont = Intrinsics.EZpvd((java.lang.Object) strFIwbmz, (java.lang.Object) ejfBZ()) ? klineBuySellData.getCont() : klineBuySellData.getUsds();
            }
            this.AubY = cont;
            if (cont == null || cont.isEmpty()) {
                uzCIH();
                AxsJAY();
            } else {
                gHZMYf();
                getFieldNames();
            }
            java.util.ArrayList<BuySellBean> arrayList = this.AubY;
            if (arrayList.size() < 2) {
                return;
            }
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                this.zuBGHE.add(java.lang.Long.valueOf(C33129mqd.valueOf(((BuySellBean) it.next()).getTs())));
            }
            java.util.List<BuySellBean> listZLjUOn = C56405yEd.zLjUOn(this.AubY);
            for (BuySellBean buySellBean : listZLjUOn) {
                this.AwvSrB.add(buySellBean.getBuyVol());
                this.AxsJAY.add(buySellBean.getSellVol());
                buySellBean.setBuyVol(new C54536xML().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(buySellBean.getBuyVol())))) + " " + fJNWhG());
                buySellBean.setSellVol(new C54536xML().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(buySellBean.getSellVol())))) + " " + fJNWhG());
            }
            OLrzqt(this.zuBGHE);
            copydefault(listZLjUOn, this.AwvSrB, this.AxsJAY);
        }
    }

    private final void OLrzqt(java.util.ArrayList<java.lang.Long> arrayList) {
        qZW qzw = this.AuCTelauCTel;
        if (qzw == null) {
            Intrinsics.gEmmrt("");
            qzw = null;
        }
        XAxis xAxis = qzw.EZpvd.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setSpaceMin(1.0f);
        xAxis.setSpaceMax(1.0f);
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) copydefault()) ? 2 : 1);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
    }

    private final void copydefault(java.util.List<BuySellBean> list, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        qZW qzw;
        java.lang.String str;
        float f;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f2 = i;
            arrayList4.add(new Entry(f2, C33129mqd.djBIcL(arrayList.get(i)), list.get(i)));
            arrayList5.add(new Entry(f2, C33129mqd.djBIcL(arrayList2.get(i)), list.get(i)));
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        android.content.Context context = getContext();
        if (context != null) {
            C34846nkE c34846nkE = C34846nkE.OLrzqt;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            arrayList6.add(c34846nkE.EZpvd(context, (java.util.ArrayList<Entry>) arrayList4, iTradeRiseGraph$default, (992 & 8) != 0 ? YAxis.AxisDependency.LEFT : axisDependency, (992 & 16) != 0 ? false : true, (992 & 32) != 0 ? false : false, (992 & 64) != 0 ? false : false, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? 6 : 0));
            android.content.Context contextRequireContext = requireContext();
            str = "";
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, str);
            qzw = null;
            f = 0.0f;
            arrayList3 = arrayList6;
            arrayList3.add(c34846nkE.EZpvd(contextRequireContext, (java.util.ArrayList<Entry>) arrayList5, C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null), (992 & 8) != 0 ? YAxis.AxisDependency.LEFT : axisDependency, (992 & 16) != 0 ? false : true, (992 & 32) != 0 ? false : false, (992 & 64) != 0 ? false : false, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? 6 : 0));
        } else {
            qzw = null;
            str = "";
            f = 0.0f;
            arrayList3 = arrayList6;
        }
        LineData lineData = new LineData(arrayList3);
        qZW qzw2 = this.AuCTelauCTel;
        if (qzw2 == null) {
            Intrinsics.gEmmrt(str);
            qzw2 = qzw;
        }
        YAxis axisLeft = qzw2.EZpvd.getAxisLeft();
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setLabelCount(5, true);
        axisLeft.setValueFormatter(new C34892nky());
        axisLeft.setAxisMinimum(f);
        qZW qzw3 = this.AuCTelauCTel;
        if (qzw3 == null) {
            Intrinsics.gEmmrt(str);
            qzw3 = qzw;
        }
        qzw3.EZpvd.setData(lineData);
        qZW qzw4 = this.AuCTelauCTel;
        if (qzw4 == null) {
            Intrinsics.gEmmrt(str);
            qzw4 = qzw;
        }
        qzw4.EZpvd.animateX(AEQbTJ());
    }
}

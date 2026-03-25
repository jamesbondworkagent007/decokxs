package o;

import android.view.View;
import androidx.camera.video.AudioStats;
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
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.find_ui.data.InterestAndTradingUnionItem;
import com.okinc.find_ui.data.VolumeBean;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pWU;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34881nkn extends AbstractC34832njr {
    public C42664rag AuCTelauCTel;
    public C34855nkN AxsJAY;
    public java.util.ArrayList<VolumeBean> AubY = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Long> AwvSrB = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> zuBGHE = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> gHZMYf = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.nkn$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.ORxRYg;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42664rag c42664ragKWHzl = C42664rag.KWHzl(view);
        this.AuCTelauCTel = c42664ragKWHzl;
        if (c42664ragKWHzl == null) {
            Intrinsics.gEmmrt("");
            c42664ragKWHzl = null;
        }
        c42664ragKWHzl.copydefault.setHelperLabelType(0);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        C42664rag c42664rag = this.AuCTelauCTel;
        C42664rag c42664rag2 = null;
        if (c42664rag == null) {
            Intrinsics.gEmmrt("");
            c42664rag = null;
        }
        c42664rag.OLrzqt.setLeftTitle(C33070mpX.AYXKKw(qZH.PendingIntent.OCdtug));
        C42664rag c42664rag3 = this.AuCTelauCTel;
        if (c42664rag3 == null) {
            Intrinsics.gEmmrt("");
            c42664rag3 = null;
        }
        c42664rag3.OLrzqt.setRightTitle(C33070mpX.AYXKKw(qZH.PendingIntent.iKEqwx));
        C42664rag c42664rag4 = this.AuCTelauCTel;
        if (c42664rag4 == null) {
            Intrinsics.gEmmrt("");
            c42664rag4 = null;
        }
        c42664rag4.OLrzqt.setLeftBgColor(C33070mpX.copydefault(C52761wXj.Activity.QKudOq));
        C42664rag c42664rag5 = this.AuCTelauCTel;
        if (c42664rag5 == null) {
            Intrinsics.gEmmrt("");
            c42664rag5 = null;
        }
        c42664rag5.OLrzqt.setRightBgColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C42664rag c42664rag6 = this.AuCTelauCTel;
        if (c42664rag6 == null) {
            Intrinsics.gEmmrt("");
            c42664rag6 = null;
        }
        c42664rag6.OLrzqt.setRightBgStyle(true);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.AxsJAY = new C34855nkN(contextRequireContext);
        android.content.Context context = getContext();
        if (context != null) {
            C34855nkN c34855nkN = this.AxsJAY;
            if (c34855nkN == null) {
                Intrinsics.gEmmrt("");
                c34855nkN = null;
            }
            c34855nkN.setLayoutDirection(C55296xhK.AEQbTJ(context));
            pWU.Application application = pWU.Companion;
            C42664rag c42664rag7 = this.AuCTelauCTel;
            if (c42664rag7 == null) {
                Intrinsics.gEmmrt("");
                c42664rag7 = null;
            }
            C34887nkt c34887nkt = c42664rag7.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c34887nkt, "");
            C34855nkN c34855nkN2 = this.AxsJAY;
            if (c34855nkN2 == null) {
                Intrinsics.gEmmrt("");
                c34855nkN2 = null;
            }
            application.OLrzqt(context, c34887nkt, c34855nkN2, false);
        }
        C42664rag c42664rag8 = this.AuCTelauCTel;
        if (c42664rag8 == null) {
            Intrinsics.gEmmrt("");
            c42664rag8 = null;
        }
        c42664rag8.AEQbTJ.getAxisRight().setEnabled(true);
        C42664rag c42664rag9 = this.AuCTelauCTel;
        if (c42664rag9 == null) {
            Intrinsics.gEmmrt("");
            c42664rag9 = null;
        }
        c42664rag9.AEQbTJ.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.LINE});
        C42664rag c42664rag10 = this.AuCTelauCTel;
        if (c42664rag10 == null) {
            Intrinsics.gEmmrt("");
            c42664rag10 = null;
        }
        c42664rag10.AEQbTJ.setNoDataText("");
        C42664rag c42664rag11 = this.AuCTelauCTel;
        if (c42664rag11 == null) {
            Intrinsics.gEmmrt("");
            c42664rag11 = null;
        }
        android.graphics.Paint paint = c42664rag11.AEQbTJ.getPaint(7);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        paint.setTextSize(C55298xhM.EZpvd(16.0f, contextRequireContext2));
        C42664rag c42664rag12 = this.AuCTelauCTel;
        if (c42664rag12 == null) {
            Intrinsics.gEmmrt("");
            c42664rag12 = null;
        }
        c42664rag12.AEQbTJ.setNoDataTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DeEinT));
        C42664rag c42664rag13 = this.AuCTelauCTel;
        if (c42664rag13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42664rag2 = c42664rag13;
        }
        c42664rag2.AEQbTJ.setOnChartValueSelectedListener(new Application());
    }

    /* JADX INFO: renamed from: o.nkn$Application */
    public static final class Application implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public Application() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            C34881nkn.this.copydefault("KLine_TradingData_OpenInterest_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().valueOf().observe(this, new StateListAnimator(new Function1() { // from class: o.nkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34881nkn.copydefault(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        C42664rag c42664rag = this.AuCTelauCTel;
        if (c42664rag == null) {
            Intrinsics.gEmmrt("");
            c42664rag = null;
        }
        C55258xgZ c55258xgZ = c42664rag.copydefault;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static final Unit copydefault(C34881nkn c34881nkn, java.util.ArrayList arrayList) {
        c34881nkn.getNewProxyInstance();
        if (arrayList == null) {
            c34881nkn.zuBGHE();
        } else {
            c34881nkn.hDKMBd();
            c34881nkn.copydefault((java.util.ArrayList<InterestAndTradingUnionItem>) arrayList);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "FUTURES")) {
            AwvSrB();
            AkhnZx().copydefault(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd());
        }
    }

    private final void copydefault(java.util.ArrayList<InterestAndTradingUnionItem> arrayList) {
        C42664rag c42664rag = this.AuCTelauCTel;
        if (c42664rag == null) {
            Intrinsics.gEmmrt("");
            c42664rag = null;
        }
        c42664rag.AEQbTJ.clear();
        this.AwvSrB.clear();
        this.zuBGHE.clear();
        this.gHZMYf.clear();
        if (arrayList != null) {
            this.AubY = new java.util.ArrayList<>();
            for (InterestAndTradingUnionItem interestAndTradingUnionItem : arrayList) {
                this.AubY.add(new VolumeBean(interestAndTradingUnionItem.getOiUsds(), interestAndTradingUnionItem.getTs(), interestAndTradingUnionItem.getOiCrypto()));
            }
            if (this.AubY.isEmpty() || this.AubY.size() < 2) {
                uzCIH();
                AxsJAY();
                return;
            }
            getFieldNames();
            gHZMYf();
            java.util.Iterator<T> it = this.AubY.iterator();
            while (it.hasNext()) {
                this.AwvSrB.add(java.lang.Long.valueOf(C33129mqd.valueOf(((VolumeBean) it.next()).getTs())));
            }
            java.util.List<VolumeBean> listZLjUOn = C56405yEd.zLjUOn(this.AubY);
            for (VolumeBean volumeBean : listZLjUOn) {
                this.zuBGHE.add(volumeBean.getOi());
                this.gHZMYf.add(volumeBean.getVol());
                volumeBean.setOi(new C54536xML().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(volumeBean.getOi())))) + " " + fARcdN());
                volumeBean.setVol(new C54536xML().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(volumeBean.getVol())))) + " " + OLrzqt());
            }
            KWHzl(listZLjUOn, this.AwvSrB, this.zuBGHE, this.gHZMYf);
        }
    }

    /* JADX INFO: renamed from: o.nkn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C34881nkn AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C34881nkn c34881nkn) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c34881nkn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.onStatusChanged, qZH.PendingIntent.DcMfJK);
                    java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    private final void KWHzl(java.util.List<VolumeBean> list, java.util.ArrayList<java.lang.Long> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.util.ArrayList<java.lang.String> arrayList3) {
        java.lang.Double dValueOf;
        java.lang.Double dValueOf2;
        java.lang.Float fValueOf;
        java.lang.Float fValueOf2;
        C42664rag c42664rag;
        if (list.isEmpty() || arrayList2.isEmpty() || arrayList3.isEmpty()) {
            return;
        }
        java.util.ArrayList<Entry> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList<BarEntry> arrayList5 = new java.util.ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f = i * 1.0f;
            arrayList4.add(new Entry(f, C33129mqd.djBIcL(arrayList2.get(i)), list.get(i)));
            arrayList5.add(new BarEntry(f, C33129mqd.djBIcL(arrayList3.get(i)), list.get(i)));
        }
        C42664rag c42664rag2 = this.AuCTelauCTel;
        if (c42664rag2 == null) {
            Intrinsics.gEmmrt("");
            c42664rag2 = null;
        }
        XAxis xAxis = c42664rag2.AEQbTJ.getXAxis();
        C55051xce c55051xce = C55051xce.OLrzqt;
        xAxis.setTypeface(c55051xce.valueOf());
        C42664rag c42664rag3 = this.AuCTelauCTel;
        if (c42664rag3 == null) {
            Intrinsics.gEmmrt("");
            c42664rag3 = null;
        }
        c42664rag3.AEQbTJ.getAxisLeft().setTypeface(c55051xce.valueOf());
        C42664rag c42664rag4 = this.AuCTelauCTel;
        if (c42664rag4 == null) {
            Intrinsics.gEmmrt("");
            c42664rag4 = null;
        }
        c42664rag4.AEQbTJ.getAxisRight().setTypeface(c55051xce.valueOf());
        C42664rag c42664rag5 = this.AuCTelauCTel;
        if (c42664rag5 == null) {
            Intrinsics.gEmmrt("");
            c42664rag5 = null;
        }
        c42664rag5.AEQbTJ.getXAxis().setSpaceMin(1.0f);
        C42664rag c42664rag6 = this.AuCTelauCTel;
        if (c42664rag6 == null) {
            Intrinsics.gEmmrt("");
            c42664rag6 = null;
        }
        c42664rag6.AEQbTJ.getXAxis().setSpaceMax(1.0f);
        C42664rag c42664rag7 = this.AuCTelauCTel;
        if (c42664rag7 == null) {
            Intrinsics.gEmmrt("");
            c42664rag7 = null;
        }
        c42664rag7.AEQbTJ.getAxisLeft().setValueFormatter(new C34892nky());
        C42664rag c42664rag8 = this.AuCTelauCTel;
        if (c42664rag8 == null) {
            Intrinsics.gEmmrt("");
            c42664rag8 = null;
        }
        c42664rag8.AEQbTJ.getAxisRight().setValueFormatter(new C34892nky());
        C42664rag c42664rag9 = this.AuCTelauCTel;
        if (c42664rag9 == null) {
            Intrinsics.gEmmrt("");
            c42664rag9 = null;
        }
        XAxis xAxis2 = c42664rag9.AEQbTJ.getXAxis();
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) copydefault()) ? 2 : 1);
        c34831njq.OLrzqt(unitType);
        xAxis2.setValueFormatter(c34831njq);
        java.util.Iterator<T> it = arrayList3.iterator();
        if (it.hasNext()) {
            double dAEQbTJ = C33129mqd.AEQbTJ((java.lang.String) it.next());
            while (it.hasNext()) {
                dAEQbTJ = java.lang.Math.max(dAEQbTJ, C33129mqd.AEQbTJ((java.lang.String) it.next()));
            }
            dValueOf = java.lang.Double.valueOf(dAEQbTJ);
        } else {
            dValueOf = null;
        }
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
        java.util.Iterator<T> it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            double dAEQbTJ2 = C33129mqd.AEQbTJ((java.lang.String) it2.next());
            while (it2.hasNext()) {
                dAEQbTJ2 = java.lang.Math.min(dAEQbTJ2, C33129mqd.AEQbTJ((java.lang.String) it2.next()));
            }
            dValueOf2 = java.lang.Double.valueOf(dAEQbTJ2);
        } else {
            dValueOf2 = null;
        }
        double dDoubleValue2 = dValueOf2 != null ? dValueOf2.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
        java.util.Iterator<T> it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            float fDjBIcL = C33129mqd.djBIcL((java.lang.String) it3.next());
            while (it3.hasNext()) {
                fDjBIcL = java.lang.Math.min(fDjBIcL, C33129mqd.djBIcL((java.lang.String) it3.next()));
            }
            fValueOf = java.lang.Float.valueOf(fDjBIcL);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        java.util.Iterator<T> it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            float fDjBIcL2 = C33129mqd.djBIcL((java.lang.String) it4.next());
            while (it4.hasNext()) {
                fDjBIcL2 = java.lang.Math.max(fDjBIcL2, C33129mqd.djBIcL((java.lang.String) it4.next()));
            }
            fValueOf2 = java.lang.Float.valueOf(fDjBIcL2);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        C42664rag c42664rag10 = this.AuCTelauCTel;
        if (c42664rag10 == null) {
            Intrinsics.gEmmrt("");
            c42664rag10 = null;
        }
        c42664rag10.AEQbTJ.getAxisLeft().setLabelCount(5, true);
        float f2 = (fFloatValue2 - fFloatValue) * 0.1f;
        C42664rag c42664rag11 = this.AuCTelauCTel;
        if (c42664rag11 == null) {
            Intrinsics.gEmmrt("");
            c42664rag11 = null;
        }
        c42664rag11.AEQbTJ.getAxisLeft().setAxisMinimum(fFloatValue - f2);
        C42664rag c42664rag12 = this.AuCTelauCTel;
        if (c42664rag12 == null) {
            Intrinsics.gEmmrt("");
            c42664rag12 = null;
        }
        c42664rag12.AEQbTJ.getAxisLeft().setAxisMaximum(fFloatValue2 + f2);
        C42664rag c42664rag13 = this.AuCTelauCTel;
        if (c42664rag13 == null) {
            Intrinsics.gEmmrt("");
            c42664rag13 = null;
        }
        c42664rag13.AEQbTJ.getAxisRight().setLabelCount(5, true);
        double d = (dDoubleValue - dDoubleValue2) * 0.2d;
        C42664rag c42664rag14 = this.AuCTelauCTel;
        if (c42664rag14 == null) {
            Intrinsics.gEmmrt("");
            c42664rag14 = null;
        }
        c42664rag14.AEQbTJ.getAxisRight().setAxisMinimum((float) (dDoubleValue2 - d));
        C42664rag c42664rag15 = this.AuCTelauCTel;
        if (c42664rag15 == null) {
            Intrinsics.gEmmrt("");
            c42664rag15 = null;
        }
        c42664rag15.AEQbTJ.getAxisRight().setAxisMaximum((float) (dDoubleValue + d));
        C42664rag c42664rag16 = this.AuCTelauCTel;
        if (c42664rag16 == null) {
            Intrinsics.gEmmrt("");
            c42664rag = null;
        } else {
            c42664rag = c42664rag16;
        }
        C34887nkt c34887nkt = c42664rag.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c34887nkt, "");
        OLrzqt(c34887nkt, arrayList4, arrayList5);
    }

    private final void OLrzqt(CombinedChart combinedChart, java.util.ArrayList<Entry> arrayList, java.util.ArrayList<BarEntry> arrayList2) {
        combinedChart.getLegend().setForm(Legend.LegendForm.NONE);
        LineData lineData = new LineData();
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setHighlightLineWidth(0.5f);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.dXcUrg));
        lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineData.addDataSet(lineDataSet);
        BarDataSet barDataSet = new BarDataSet(arrayList2, null);
        barDataSet.setDrawIcons(false);
        barDataSet.setHighlightEnabled(false);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        barDataSet.setColor(C33070mpX.copydefault(C52761wXj.Activity.QKudOq));
        barDataSet.setDrawValues(false);
        BarData barData = new BarData(barDataSet);
        CombinedData combinedData = new CombinedData();
        barData.setBarWidth(0.5f);
        combinedData.setData(lineData);
        combinedData.setData(barData);
        combinedChart.setData(combinedData);
        combinedChart.getXAxis().setLabelCount(arrayList2.size() / 6);
        combinedChart.animateX(AEQbTJ());
    }
}

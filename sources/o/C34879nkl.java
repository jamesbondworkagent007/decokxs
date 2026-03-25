package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34879nkl extends AbstractC34832njr {
    public int AuCTelauCTel;
    public C34858nkQ AubY;
    public C42660rac AwvSrB;
    public int sSMYrx;
    public java.util.ArrayList<java.lang.Long> gHZMYf = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> zuBGHE = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.nkl$StateListAnimator */
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
        return qZH.ActionBar.OcIXYQ;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42660rac c42660racEZpvd = C42660rac.EZpvd(view);
        Intrinsics.copydefault(c42660racEZpvd);
        this.AwvSrB = c42660racEZpvd;
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        android.content.Context context = getContext();
        if (context != null) {
            C34858nkQ c34858nkQ = new C34858nkQ(context);
            this.AubY = c34858nkQ;
            c34858nkQ.setLayoutDirection(C55296xhK.AEQbTJ(context));
            this.sSMYrx = C33508mxl.copydefault(context);
            this.AuCTelauCTel = C33508mxl.AEQbTJ(context);
        }
        C42660rac c42660rac = this.AwvSrB;
        if (c42660rac == null) {
            Intrinsics.gEmmrt("");
            c42660rac = null;
        }
        C34888nku c34888nku = c42660rac.copydefault;
        c34888nku.getAxisLeft().setEnabled(true);
        c34888nku.getAxisRight().setEnabled(false);
        C34846nkE c34846nkE = C34846nkE.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.copydefault(c34888nku);
        c34846nkE.KWHzl(contextRequireContext, c34888nku, this.AubY, false);
        c34888nku.setNoDataText("");
        c34888nku.getLegend().setEnabled(false);
        c34888nku.setOnChartValueSelectedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.nkl$TaskDescription */
    public static final class TaskDescription implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            C34879nkl.this.copydefault("KLine_TradingData_MarginLongShortRatio_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().AYXKKw().observe(this, new StateListAnimator(new Function1() { // from class: o.nki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34879nkl.EZpvd(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        C42660rac c42660rac = this.AwvSrB;
        if (c42660rac == null) {
            Intrinsics.gEmmrt("");
            c42660rac = null;
        }
        c42660rac.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34879nkl.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final Unit EZpvd(C34879nkl c34879nkl, java.util.ArrayList arrayList) {
        c34879nkl.getNewProxyInstance();
        if (arrayList == null) {
            c34879nkl.zuBGHE();
        } else {
            c34879nkl.hDKMBd();
            c34879nkl.copydefault((java.util.ArrayList<LongShortRatioData>) arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C34879nkl c34879nkl, android.view.View view) {
        android.content.Context context = c34879nkl.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(context.getString(qZH.PendingIntent.RgLUBD), C33069mpW.copydefault(c34879nkl, qZH.PendingIntent.RIuxYh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("quoteccy", c34879nkl.gEmmrt()), C56390yDp.OLrzqt("baseccy", c34879nkl.OLrzqt()))));
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
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
            AwvSrB();
            AkhnZx().OLrzqt(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd(), Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? "init" : "margin_ratio_chart");
        }
    }

    private final void copydefault(java.util.ArrayList<LongShortRatioData> arrayList) {
        C42660rac c42660rac = this.AwvSrB;
        if (c42660rac == null) {
            Intrinsics.gEmmrt("");
            c42660rac = null;
        }
        c42660rac.copydefault.clear();
        this.gHZMYf.clear();
        this.zuBGHE.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            uzCIH();
            AxsJAY();
            return;
        }
        getFieldNames();
        gHZMYf();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.gHZMYf.add(java.lang.Long.valueOf(C33129mqd.valueOf(((LongShortRatioData) it.next()).getTs())));
        }
        java.util.List<LongShortRatioData> listZLjUOn = C56405yEd.zLjUOn(arrayList);
        for (LongShortRatioData longShortRatioData : listZLjUOn) {
            java.util.ArrayList<java.lang.String> arrayList2 = this.zuBGHE;
            java.lang.String ratio = longShortRatioData.getRatio();
            if (ratio == null) {
                ratio = "";
            }
            arrayList2.add(ratio);
            longShortRatioData.setRatio(pTB.formatICUCompact$default(C33129mqd.EZpvd(longShortRatioData.getRatio()), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2), null, null, 12, null));
        }
        OLrzqt(this.gHZMYf);
        AEQbTJ(listZLjUOn, this.zuBGHE);
    }

    private final void OLrzqt(java.util.ArrayList<java.lang.Long> arrayList) {
        C42660rac c42660rac = this.AwvSrB;
        if (c42660rac == null) {
            Intrinsics.gEmmrt("");
            c42660rac = null;
        }
        XAxis xAxis = c42660rac.copydefault.getXAxis();
        xAxis.mAxisMaximum = C33129mqd.djBIcL(java.lang.Integer.valueOf(arrayList.size()));
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) copydefault()) ? 2 : 1);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
    }

    private final void AEQbTJ(java.util.List<LongShortRatioData> list, java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new Entry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)), C33129mqd.djBIcL(arrayList.get(i)), list.get(i)));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        C34846nkE c34846nkE = C34846nkE.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        arrayList3.add(c34846nkE.EZpvd(contextRequireContext, (java.util.ArrayList<Entry>) arrayList2, getResources().getColor(C32113mPz.ActionBar.zLjUOn), (992 & 8) != 0 ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.LEFT, (992 & 16) != 0 ? false : true, (992 & 32) != 0 ? false : false, (992 & 64) != 0 ? false : false, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? 6 : 0));
        LineData lineData = new LineData(arrayList3);
        C42660rac c42660rac = this.AwvSrB;
        C42660rac c42660rac2 = null;
        if (c42660rac == null) {
            Intrinsics.gEmmrt("");
            c42660rac = null;
        }
        YAxis axisLeft = c42660rac.copydefault.getAxisLeft();
        axisLeft.setLabelCount(3, true);
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setValueFormatter(new DefaultValueFormatter(2));
        float yMin = lineData.getYMin();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        axisLeft.setAxisMinimum(yMin * java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(0.9f), 2, bool, RoundingMode.FLOOR)));
        axisLeft.setAxisMaximum(lineData.getYMax() * java.lang.Float.parseFloat(C33129mqd.AEQbTJ(java.lang.Float.valueOf(1.1f), 2, bool, RoundingMode.CEILING)));
        C42660rac c42660rac3 = this.AwvSrB;
        if (c42660rac3 == null) {
            Intrinsics.gEmmrt("");
            c42660rac3 = null;
        }
        c42660rac3.copydefault.setData(lineData);
        C42660rac c42660rac4 = this.AwvSrB;
        if (c42660rac4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42660rac2 = c42660rac4;
        }
        c42660rac2.copydefault.animateX(AEQbTJ());
    }
}

package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.find_ui.data.KlineFundingRateData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.UnitType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47244tmQ;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34868nka extends AbstractC34832njr {
    public C42662rae AuCTelauCTel;
    public C34856nkO AubY;
    public java.util.ArrayList<java.lang.Long> AwvSrB = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> AxsJAY = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.nka$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
        return qZH.ActionBar.gHZMYf;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AuCTelauCTel = C42662rae.AEQbTJ(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        C42662rae c42662rae = this.AuCTelauCTel;
        C34856nkO c34856nkO = null;
        if (c42662rae == null) {
            Intrinsics.gEmmrt("");
            c42662rae = null;
        }
        c42662rae.KWHzl.setLeftTitle(C33070mpX.AYXKKw(qZH.PendingIntent.gwwzsY));
        C42662rae c42662rae2 = this.AuCTelauCTel;
        if (c42662rae2 == null) {
            Intrinsics.gEmmrt("");
            c42662rae2 = null;
        }
        c42662rae2.KWHzl.setRightTitle(C33070mpX.AYXKKw(qZH.PendingIntent.setProfilesSinceInitCount));
        C42662rae c42662rae3 = this.AuCTelauCTel;
        if (c42662rae3 == null) {
            Intrinsics.gEmmrt("");
            c42662rae3 = null;
        }
        c42662rae3.KWHzl.setLeftBgStyle(true);
        C42662rae c42662rae4 = this.AuCTelauCTel;
        if (c42662rae4 == null) {
            Intrinsics.gEmmrt("");
            c42662rae4 = null;
        }
        c42662rae4.KWHzl.setRightBgStyle(true);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.AubY = new C34856nkO(contextRequireContext);
        android.content.Context context = getContext();
        if (context != null) {
            C34856nkO c34856nkO2 = this.AubY;
            if (c34856nkO2 == null) {
                Intrinsics.gEmmrt("");
                c34856nkO2 = null;
            }
            c34856nkO2.setLayoutDirection(C55296xhK.AEQbTJ(context));
            C42662rae c42662rae5 = this.AuCTelauCTel;
            if (c42662rae5 == null) {
                Intrinsics.gEmmrt("");
                c42662rae5 = null;
            }
            C34883nkp c34883nkp = c42662rae5.KWHzl;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            c34883nkp.setLeftBgColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
            C42662rae c42662rae6 = this.AuCTelauCTel;
            if (c42662rae6 == null) {
                Intrinsics.gEmmrt("");
                c42662rae6 = null;
            }
            c42662rae6.KWHzl.setRightBgColor(C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null));
        }
        C42662rae c42662rae7 = this.AuCTelauCTel;
        if (c42662rae7 == null) {
            Intrinsics.gEmmrt("");
            c42662rae7 = null;
        }
        C34888nku c34888nku = c42662rae7.copydefault;
        c34888nku.getAxisLeft().setEnabled(true);
        c34888nku.getAxisRight().setEnabled(false);
        c34888nku.getAxisLeft().setDrawZeroLine(true);
        c34888nku.getAxisLeft().setZeroLineColor(c34888nku.getResources().getColor(C52761wXj.Activity.putInt));
        c34888nku.setNoDataText("");
        C34846nkE c34846nkE = C34846nkE.OLrzqt;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Intrinsics.copydefault(c34888nku);
        C34856nkO c34856nkO3 = this.AubY;
        if (c34856nkO3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c34856nkO = c34856nkO3;
        }
        c34846nkE.KWHzl(contextRequireContext2, c34888nku, c34856nkO, false);
        c34888nku.setOnChartValueSelectedListener(new ActionBar(c34888nku, this));
    }

    /* JADX INFO: renamed from: o.nka$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        public final /* synthetic */ C34888nku KWHzl;
        public final /* synthetic */ C34868nka copydefault;

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public ActionBar(C34888nku c34888nku, C34868nka c34868nka) {
            this.KWHzl = c34888nku;
            this.copydefault = c34868nka;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (Intrinsics.EZpvd(entry != null ? java.lang.Float.valueOf(entry.getY()) : null, 0.0f)) {
                T dataSetByIndex = this.KWHzl.getLineData().getDataSetByIndex(0);
                Intrinsics.copydefault(dataSetByIndex, "");
                ((LineDataSet) dataSetByIndex).setHighLightColor(ContextCompat.getColor(this.KWHzl.getContext(), C47244tmQ.Application.copydefault));
            } else {
                T dataSetByIndex2 = this.KWHzl.getLineData().getDataSetByIndex(0);
                Intrinsics.copydefault(dataSetByIndex2, "");
                ((LineDataSet) dataSetByIndex2).setHighLightColor(ContextCompat.getColor(this.KWHzl.getContext(), C52761wXj.Activity.dXcUrg));
            }
            this.copydefault.copydefault("KLine_TradingData_FundingRate_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().AhwBna().observe(this, new Activity(new Function1() { // from class: o.nkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34868nka.EZpvd(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        C42662rae c42662rae = this.AuCTelauCTel;
        if (c42662rae == null) {
            Intrinsics.gEmmrt("");
            c42662rae = null;
        }
        C55258xgZ c55258xgZ = c42662rae.EZpvd;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
    }

    public static final Unit EZpvd(C34868nka c34868nka, java.util.ArrayList arrayList) {
        c34868nka.getNewProxyInstance();
        if (arrayList == null) {
            c34868nka.zuBGHE();
        } else {
            c34868nka.hDKMBd();
            c34868nka.OLrzqt(arrayList);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SWAP")) {
            AwvSrB();
            AkhnZx().AEQbTJ(marketCoinInfoFetchVPNInfo.getInstrumentId());
        }
    }

    private final void OLrzqt(java.util.ArrayList<KlineFundingRateData> arrayList) {
        C42662rae c42662rae = this.AuCTelauCTel;
        if (c42662rae == null) {
            Intrinsics.gEmmrt("");
            c42662rae = null;
        }
        c42662rae.copydefault.clear();
        this.AwvSrB.clear();
        this.AxsJAY.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            uzCIH();
            AxsJAY();
            return;
        }
        getFieldNames();
        gHZMYf();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.AwvSrB.add(java.lang.Long.valueOf(C33129mqd.valueOf(((KlineFundingRateData) it.next()).getTs())));
        }
        java.util.List<KlineFundingRateData> listZLjUOn = C56405yEd.zLjUOn(arrayList);
        java.util.Iterator<T> it2 = listZLjUOn.iterator();
        while (it2.hasNext()) {
            this.AxsJAY.add(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(((KlineFundingRateData) it2.next()).getRate()))));
        }
        AEQbTJ(this.AwvSrB);
        AEQbTJ(listZLjUOn, this.AxsJAY);
    }

    private final void AEQbTJ(java.util.ArrayList<java.lang.Long> arrayList) {
        C42662rae c42662rae = this.AuCTelauCTel;
        if (c42662rae == null) {
            Intrinsics.gEmmrt("");
            c42662rae = null;
        }
        XAxis xAxis = c42662rae.copydefault.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setSpaceMin(1.0f);
        xAxis.setSpaceMax(1.0f);
        C34831njq c34831njq = new C34831njq(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(2);
        c34831njq.OLrzqt(unitType);
        xAxis.setValueFormatter(c34831njq);
    }

    public final void AEQbTJ(java.util.List<KlineFundingRateData> list, java.util.ArrayList<java.lang.String> arrayList) {
        C42662rae c42662rae;
        java.util.ArrayList<Entry> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = list.size();
        float fDjBIcL = 0.0f;
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                if (C33129mqd.djBIcL(arrayList.get(i)) > 0.0f && fDjBIcL < 0.0f) {
                    EZpvd(arrayList, arrayList2, i, fDjBIcL);
                    android.content.Context context = getContext();
                    if (context != null) {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)));
                    }
                } else if (C33129mqd.djBIcL(arrayList.get(i)) < 0.0f && fDjBIcL > 0.0f) {
                    EZpvd(arrayList, arrayList2, i, fDjBIcL);
                    android.content.Context context2 = getContext();
                    if (context2 != null) {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)));
                    }
                }
            }
            fDjBIcL = C33129mqd.djBIcL(arrayList.get(i));
            arrayList2.add(new Entry(i, C33129mqd.djBIcL(arrayList.get(i)), list.get(i)));
            android.content.Context context3 = getContext();
            if (context3 != null) {
                if (i == 0) {
                    arrayList3.add(java.lang.Integer.valueOf(C33129mqd.djBIcL(arrayList.get(1)) > 0.0f ? C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null) : C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                } else {
                    arrayList3.add(java.lang.Integer.valueOf(C33129mqd.djBIcL(arrayList.get(i)) > 0.0f ? C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null) : C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                }
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        C34846nkE c34846nkE = C34846nkE.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        arrayList4.add(c34846nkE.EZpvd(contextRequireContext, (java.util.ArrayList<Entry>) arrayList2, (java.util.ArrayList<java.lang.Integer>) arrayList3, (992 & 8) != 0 ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.LEFT, (992 & 16) != 0 ? false : true, (992 & 32) != 0 ? false : false, (992 & 64) != 0 ? false : false, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? 6 : 0));
        LineData lineData = new LineData(arrayList4);
        C42662rae c42662rae2 = this.AuCTelauCTel;
        if (c42662rae2 == null) {
            Intrinsics.gEmmrt("");
            c42662rae2 = null;
        }
        YAxis axisLeft = c42662rae2.copydefault.getAxisLeft();
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setValueFormatter(new C34893nkz(3));
        axisLeft.setLabelCount(5, true);
        C42662rae c42662rae3 = this.AuCTelauCTel;
        if (c42662rae3 == null) {
            Intrinsics.gEmmrt("");
            c42662rae3 = null;
        }
        c42662rae3.copydefault.setData(lineData);
        C42662rae c42662rae4 = this.AuCTelauCTel;
        if (c42662rae4 == null) {
            Intrinsics.gEmmrt("");
            c42662rae = null;
        } else {
            c42662rae = c42662rae4;
        }
        c42662rae.copydefault.animateX(AEQbTJ());
    }

    /* JADX INFO: renamed from: o.nka$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C34868nka EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34868nka c34868nka) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c34868nka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.DPVBvL, qZH.PendingIntent.jFiva);
                    java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public final void EZpvd(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<Entry> arrayList2, int i, float f) {
        float fDjBIcL = C33129mqd.djBIcL(arrayList.get(i)) - f;
        arrayList2.add(new Entry((0 - (C33129mqd.djBIcL(arrayList.get(i)) - (i * fDjBIcL))) / fDjBIcL, 0.0f, ""));
    }
}

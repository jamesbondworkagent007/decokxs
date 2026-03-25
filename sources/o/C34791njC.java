package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.find_ui.data.AssetDistributionData;
import com.okinc.find_ui.data.ListType;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34791njC extends AbstractC34832njr {
    public qZV gHZMYf;
    public static final Activity Companion = new Activity(null);
    public static final int AubY = 8;
    public java.util.ArrayList<java.lang.String> AxsJAY = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Integer> sSMYrx = new java.util.ArrayList<>();
    public java.util.ArrayList<C34928nlh> zuBGHE = new java.util.ArrayList<>();
    public java.util.ArrayList<ListType> ORxRYg = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AwvSrB = C56392yDr.copydefault(new Function0() { // from class: o.njD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34791njC.OcIXYQ();
        }
    });
    public final java.lang.String AuCTelauCTel = "1D";

    /* JADX INFO: renamed from: o.njC$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return qZH.ActionBar.sSMYrx;
    }

    /* JADX INFO: renamed from: o.njC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.njC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip OcIXYQ() {
        return new C59534zip();
    }

    private final C59534zip QKVWgx() {
        return (C59534zip) this.AwvSrB.getValue();
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gHZMYf = qZV.KWHzl(view);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        android.content.Context context = getContext();
        qZV qzv = null;
        if (context != null) {
            C34849nkH c34849nkH = C34849nkH.EZpvd;
            qZV qzv2 = this.gHZMYf;
            if (qzv2 == null) {
                Intrinsics.gEmmrt("");
                qzv2 = null;
            }
            C34886nks c34886nks = qzv2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c34886nks, "");
            c34849nkH.AEQbTJ(context, c34886nks);
        }
        QOLQEE();
        ORxRYg();
        qZV qzv3 = this.gHZMYf;
        if (qzv3 == null) {
            Intrinsics.gEmmrt("");
            qzv3 = null;
        }
        qzv3.AEQbTJ.setNoDataText("");
        qZV qzv4 = this.gHZMYf;
        if (qzv4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzv = qzv4;
        }
        qzv.AEQbTJ.setOnChartValueSelectedListener(new ActionBar());
    }

    /* JADX INFO: renamed from: o.njC$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        public ActionBar() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (entry != null) {
                C34791njC c34791njC = C34791njC.this;
                java.lang.Object data = entry.getData();
                Intrinsics.copydefault(data, "");
                ListType listTypeKWHzl = ((C34928nlh) data).KWHzl();
                if (listTypeKWHzl == null) {
                    listTypeKWHzl = ListType.NULL;
                }
                c34791njC.AEQbTJ(listTypeKWHzl);
            }
            C34791njC.this.copydefault("KLine_TradingData_MoneyDistribution_Click");
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            C34791njC.this.AEQbTJ(ListType.NULL);
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        AkhnZx().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.njA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34791njC.KWHzl(this.KWHzl, (AssetDistributionData) obj);
            }
        }));
        qZV qzv = this.gHZMYf;
        if (qzv == null) {
            Intrinsics.gEmmrt("");
            qzv = null;
        }
        qzv.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.njF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34791njC.AEQbTJ(this.KWHzl, view);
            }
        });
    }

    public static final Unit KWHzl(C34791njC c34791njC, AssetDistributionData assetDistributionData) {
        c34791njC.getNewProxyInstance();
        if (assetDistributionData == null) {
            c34791njC.zuBGHE();
        } else {
            c34791njC.hDKMBd();
            c34791njC.AEQbTJ(assetDistributionData);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C34791njC c34791njC, android.view.View view) {
        android.content.Context context = c34791njC.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.adevsa, qZH.PendingIntent.fJk);
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
            AkhnZx().EZpvd(marketCoinInfoFetchVPNInfo.getInstrumentId(), EZpvd());
        }
    }

    public final void AEQbTJ(AssetDistributionData assetDistributionData) {
        qZV qzv = this.gHZMYf;
        qZV qzv2 = null;
        if (qzv == null) {
            Intrinsics.gEmmrt("");
            qzv = null;
        }
        qzv.AEQbTJ.clear();
        this.AxsJAY.clear();
        this.sSMYrx.clear();
        this.ORxRYg.clear();
        this.zuBGHE.clear();
        Intrinsics.copydefault(assetDistributionData);
        if (assetDistributionData.getTs().length() == 0 || (C33129mqd.djBIcL(assetDistributionData.getBuyXLargePerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getBuyLargePerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getBuyMidPerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getBuySmallPerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getSellXLargePerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getSellLargePerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getSellMidPerc()) == 0.0f && C33129mqd.djBIcL(assetDistributionData.getSellSmallPerc()) == 0.0f)) {
            uzCIH();
            AxsJAY();
            return;
        }
        getFieldNames();
        gHZMYf();
        Date date = new Date(C33129mqd.valueOf(assetDistributionData.getTs()));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
        OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        java.lang.String str = pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null);
        java.lang.String str2 = pTA.format$default(new Date(C33129mqd.valueOf(assetDistributionData.getEndTs())), OKDateEnum.NONE, oKTimeEnum, null, null, false, 28, null);
        java.lang.String string = getString(qZH.PendingIntent.fkESqH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        qZV qzv3 = this.gHZMYf;
        if (qzv3 == null) {
            Intrinsics.gEmmrt("");
            qzv3 = null;
        }
        qzv3.fetchVPNInfo.setText(str + " - " + str2 + " " + string);
        if (Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) this.AuCTelauCTel)) {
            java.lang.String str3 = pTA.format$default(new Date(C33129mqd.valueOf(assetDistributionData.getTs())), oKDateEnum, OKTimeEnum.NONE, null, null, false, 28, null);
            qZV qzv4 = this.gHZMYf;
            if (qzv4 == null) {
                Intrinsics.gEmmrt("");
                qzv4 = null;
            }
            qzv4.fetchVPNInfo.setText(str3 + " " + string);
        }
        android.content.Context context = getContext();
        if (context != null) {
            if (C33129mqd.djBIcL(assetDistributionData.getSellXLargePerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getSellXLargePerc());
                this.ORxRYg.add(ListType.SELLXLARGE);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.isConnected(context, 1.0f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getSellLargePerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getSellLargePerc());
                this.ORxRYg.add(ListType.SELLLARGE);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.isConnected(context, 0.75f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getSellMidPerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getSellMidPerc());
                this.ORxRYg.add(ListType.SELLMID);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.isConnected(context, 0.5f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getSellSmallPerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getSellSmallPerc());
                this.ORxRYg.add(ListType.SELLSMALL);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.isConnected(context, 0.3f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getBuySmallPerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getBuySmallPerc());
                this.ORxRYg.add(ListType.BUYSMALL);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.zLjUOn(context, 0.3f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getBuyMidPerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getBuyMidPerc());
                this.ORxRYg.add(ListType.BUYMID);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.zLjUOn(context, 0.5f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getBuyLargePerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getBuyLargePerc());
                this.ORxRYg.add(ListType.BUYLARGE);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.zLjUOn(context, 0.75f)));
            }
            if (C33129mqd.djBIcL(assetDistributionData.getBuyXLargePerc()) > 0.0f) {
                this.AxsJAY.add(assetDistributionData.getBuyXLargePerc());
                this.ORxRYg.add(ListType.BUYXLARGE);
                this.sSMYrx.add(java.lang.Integer.valueOf(C33512mxp.AEQbTJ.zLjUOn(context, 1.0f)));
            }
        }
        this.zuBGHE.add(new C34928nlh(ListType.BUYXLARGE, assetDistributionData.getBuyXLargeVol(), assetDistributionData.getBuyXLargePerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.SELLXLARGE, assetDistributionData.getSellXLargeVol(), assetDistributionData.getSellXLargePerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.BUYLARGE, assetDistributionData.getBuyLargeVol(), assetDistributionData.getBuyLargePerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.SELLLARGE, assetDistributionData.getSellLargeVol(), assetDistributionData.getSellLargePerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.BUYMID, assetDistributionData.getBuyMidVol(), assetDistributionData.getBuyMidPerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.SELLMID, assetDistributionData.getSellMidVol(), assetDistributionData.getSellMidPerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.BUYSMALL, assetDistributionData.getBuySmallVol(), assetDistributionData.getBuySmallPerc(), false, 8, null));
        this.zuBGHE.add(new C34928nlh(ListType.SELLSMALL, assetDistributionData.getSellSmallVol(), assetDistributionData.getSellSmallPerc(), false, 8, null));
        QKVWgx().notifyDataSetChanged();
        android.content.Context context2 = getContext();
        if (context2 != null) {
            C34849nkH c34849nkH = C34849nkH.EZpvd;
            java.util.ArrayList<java.lang.String> arrayList = this.AxsJAY;
            java.util.ArrayList<java.lang.Integer> arrayList2 = this.sSMYrx;
            java.util.ArrayList<ListType> arrayList3 = this.ORxRYg;
            qZV qzv5 = this.gHZMYf;
            if (qzv5 == null) {
                Intrinsics.gEmmrt("");
                qzv5 = null;
            }
            C34886nks c34886nks = qzv5.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c34886nks, "");
            PieData pieDataKWHzl = c34849nkH.KWHzl(context2, arrayList, arrayList2, arrayList3, c34886nks);
            qZV qzv6 = this.gHZMYf;
            if (qzv6 == null) {
                Intrinsics.gEmmrt("");
                qzv6 = null;
            }
            qzv6.AEQbTJ.setData(pieDataKWHzl);
            qZV qzv7 = this.gHZMYf;
            if (qzv7 == null) {
                Intrinsics.gEmmrt("");
                qzv7 = null;
            }
            qzv7.AEQbTJ.notifyDataSetChanged();
            qZV qzv8 = this.gHZMYf;
            if (qzv8 == null) {
                Intrinsics.gEmmrt("");
                qzv8 = null;
            }
            qzv8.AEQbTJ.animateY(AEQbTJ());
        }
        java.lang.String strOLrzqt = new C54536xML().OLrzqt(C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(assetDistributionData.getNetVol())))));
        if (C33129mqd.djBIcL(assetDistributionData.getNetVol()) < 0.0f) {
            qZV qzv9 = this.gHZMYf;
            if (qzv9 == null) {
                Intrinsics.gEmmrt("");
                qzv9 = null;
            }
            qzv9.gEmmrt.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(this, qZH.PendingIntent.OFqMGB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.QUANTITY, strOLrzqt), C56390yDp.OLrzqt("USDT", OLrzqt()))), new java.lang.String[]{strOLrzqt}, 0, null, false, new Function1() { // from class: o.njG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34791njC.fJNWhG(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{OLrzqt()}, 0, null, false, new Function1() { // from class: o.njI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34791njC.valueOf(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null));
        } else {
            qZV qzv10 = this.gHZMYf;
            if (qzv10 == null) {
                Intrinsics.gEmmrt("");
                qzv10 = null;
            }
            qzv10.gEmmrt.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(this, qZH.PendingIntent.hpmliR, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.QUANTITY, strOLrzqt), C56390yDp.OLrzqt("USDT", OLrzqt()))), new java.lang.String[]{strOLrzqt}, 0, null, false, new Function1() { // from class: o.njE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34791njC.AYXKKw(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{OLrzqt()}, 0, null, false, new Function1() { // from class: o.njK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34791njC.DbNXlk(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null));
        }
        java.lang.String strOLrzqt2 = new C54536xML().OLrzqt(assetDistributionData.getBuyTotalVol());
        qZV qzv11 = this.gHZMYf;
        if (qzv11 == null) {
            Intrinsics.gEmmrt("");
            qzv11 = null;
        }
        qzv11.djBIcL.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(this, qZH.PendingIntent.DzOuPm, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.QUANTITY, strOLrzqt2), C56390yDp.OLrzqt("USDT", OLrzqt()))), new java.lang.String[]{strOLrzqt2}, 0, null, false, new Function1() { // from class: o.njM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34791njC.isConnected(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{OLrzqt()}, 0, null, false, new Function1() { // from class: o.njN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34791njC.values(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null));
        java.lang.String strOLrzqt3 = new C54536xML().OLrzqt(assetDistributionData.getSellTotalVol());
        qZV qzv12 = this.gHZMYf;
        if (qzv12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzv2 = qzv12;
        }
        qzv2.AYXKKw.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(this, qZH.PendingIntent.aWJMta, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.QUANTITY, strOLrzqt3), C56390yDp.OLrzqt("USDT", OLrzqt()))), new java.lang.String[]{strOLrzqt3}, 0, null, false, new Function1() { // from class: o.njJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34791njC.fetchVPNInfo(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{OLrzqt()}, 0, null, false, new Function1() { // from class: o.njH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34791njC.AkhnZx(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit fJNWhG(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.AEQbTJ(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.AEQbTJ(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.copydefault(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.copydefault(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.copydefault(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit values(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.copydefault(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.AEQbTJ(activity) : 0));
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C34791njC c34791njC, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = c34791njC.getActivity();
        list.add(new android.text.style.ForegroundColorSpan(activity != null ? C33508mxl.AEQbTJ(activity) : 0));
        return Unit.INSTANCE;
    }

    private final void QOLQEE() {
        android.content.Context context = getContext();
        if (context != null) {
            QKVWgx().register(C34928nlh.class, new C34845nkD(context));
        }
    }

    private final void ORxRYg() {
        QKVWgx().setItems(this.zuBGHE);
        qZV qzv = this.gHZMYf;
        qZV qzv2 = null;
        if (qzv == null) {
            Intrinsics.gEmmrt("");
            qzv = null;
        }
        qzv.valueOf.setLayoutManager(new GridLayoutManager(getContext(), 2));
        qZV qzv3 = this.gHZMYf;
        if (qzv3 == null) {
            Intrinsics.gEmmrt("");
            qzv3 = null;
        }
        qzv3.valueOf.setAdapter(QKVWgx());
        qZV qzv4 = this.gHZMYf;
        if (qzv4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            qzv2 = qzv4;
        }
        qzv2.valueOf.addItemDecoration(new Application());
    }

    /* JADX INFO: renamed from: o.njC$Application */
    public static final class Application extends RecyclerView.ItemDecoration {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
                android.content.Context context = C34791njC.this.getContext();
                if (context != null && C55296xhK.OLrzqt(context)) {
                    rect.left = C55298xhM.dp2px$default(6.0f, null, 1, null);
                    return;
                } else {
                    rect.right = C55298xhM.dp2px$default(6.0f, null, 1, null);
                    return;
                }
            }
            android.content.Context context2 = C34791njC.this.getContext();
            if (context2 != null && C55296xhK.OLrzqt(context2)) {
                rect.right = C55298xhM.dp2px$default(6.0f, null, 1, null);
            } else {
                rect.left = C55298xhM.dp2px$default(6.0f, null, 1, null);
            }
        }
    }

    @Override // o.AbstractC34832njr
    public void uzCIH() {
        android.widget.LinearLayout linearLayoutDbNXlk = DbNXlk();
        if (linearLayoutDbNXlk != null) {
            linearLayoutDbNXlk.setVisibility(8);
        }
    }

    public final void AEQbTJ(ListType listType) {
        for (C34928nlh c34928nlh : this.zuBGHE) {
            c34928nlh.AEQbTJ(c34928nlh.KWHzl() == listType);
        }
        QKVWgx().notifyDataSetChanged();
    }
}

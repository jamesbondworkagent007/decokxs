package o;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.find_ui.data.BigDataTimeIntervalItem;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.CandlesRequest;
import com.okinc.unify_find.data.GapData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34814njZ extends AbstractC34832njr {
    public C42658raa gHZMYf;
    public java.lang.String sSMYrx = "BTC-USD-SWAP";
    public final C55528xle AubY = new C55528xle();
    public java.lang.String AuCTelauCTel = "300";
    public java.lang.String AxsJAY = "1";
    public java.lang.String AwvSrB = values();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC34832njr
    public int wlaJM() {
        return qZH.ActionBar.QKVWgx;
    }

    @Override // o.AbstractC34832njr
    public void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42658raa c42658raaKWHzl = C42658raa.KWHzl(view);
        Intrinsics.copydefault(c42658raaKWHzl);
        this.gHZMYf = c42658raaKWHzl;
        if (c42658raaKWHzl == null) {
            Intrinsics.gEmmrt("");
            c42658raaKWHzl = null;
        }
        c42658raaKWHzl.EZpvd.setHelperLabelType(0);
    }

    @Override // o.AbstractC34832njr
    public void AuCTelauCTel() {
        C42658raa c42658raa = this.gHZMYf;
        if (c42658raa == null) {
            Intrinsics.gEmmrt("");
            c42658raa = null;
        }
        c42658raa.copydefault.setResId(qZH.PendingIntent.ORxRYg);
    }

    /* JADX INFO: renamed from: o.njZ$Activity */
    public static final class Activity implements InterfaceC46660tbP {
        public Activity() {
        }

        @Override // o.InterfaceC46660tbP
        public void OLrzqt(Entry entry, Highlight highlight) {
            C34814njZ.this.copydefault("KLine_TradingData_FuturesBasis_Click");
        }
    }

    @Override // o.AbstractC34832njr
    public void iwGUEr() {
        C42658raa c42658raa = this.gHZMYf;
        C42658raa c42658raa2 = null;
        if (c42658raa == null) {
            Intrinsics.gEmmrt("");
            c42658raa = null;
        }
        c42658raa.copydefault.setOnValueSelectedListener(new Activity());
        C42658raa c42658raa3 = this.gHZMYf;
        if (c42658raa3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42658raa2 = c42658raa3;
        }
        C55258xgZ c55258xgZ = c42658raa2.EZpvd;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
    }

    @Override // o.AbstractC34832njr
    public void AEQbTJ(java.lang.Boolean bool) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        java.lang.String usdToThisRate;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        MarketCoinInfo marketCoinInfoFetchVPNInfo = fetchVPNInfo();
        C42658raa c42658raa = this.gHZMYf;
        if (c42658raa == null) {
            Intrinsics.gEmmrt("");
            c42658raa = null;
        }
        C46663tbS c46663tbS = c42658raa.copydefault;
        c46663tbS.setMarketViewType(gEmmrt());
        c46663tbS.setTimeType(sSMYrx());
        this.sSMYrx = marketCoinInfoFetchVPNInfo.getInstrumentId();
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfoFetchVPNInfo.getInstrumentType(), (java.lang.Object) "SWAP")) {
            c46663tbS.setPricePrecision(C46666tbV.AEQbTJ(this.sSMYrx, true));
        } else {
            c46663tbS.setPricePrecision(C46666tbV.AEQbTJ(this.sSMYrx, false));
        }
        AwvSrB();
        CandlesRequest candlesRequest = new CandlesRequest(marketCoinInfoFetchVPNInfo.getInstrumentId(), (java.lang.String) null, (java.lang.String) null, this.AwvSrB, this.AuCTelauCTel, 6, (DefaultConstructorMarker) null);
        CandlesRequest candlesRequest2 = new CandlesRequest(AEQbTJ(marketCoinInfoFetchVPNInfo.getInstrumentId()), (java.lang.String) null, (java.lang.String) null, this.AwvSrB, this.AuCTelauCTel, 6, (DefaultConstructorMarker) null);
        if (AubY() || (interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault()) == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (usdToThisRate = value.getUsdToThisRate()) == null) {
            usdToThisRate = this.AxsJAY;
        }
        AbstractC58185ywX<GapData> abstractC58185ywXOLrzqt = this.AubY.OLrzqt(candlesRequest, candlesRequest2, usdToThisRate, true ^ AubY());
        final Function1 function1 = new Function1() { // from class: o.njY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34814njZ.OLrzqt(this.EZpvd, (GapData) obj);
            }
        };
        InterfaceC58227yxM<? super GapData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C34814njZ.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.nkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34814njZ.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C34814njZ.EZpvd(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C34814njZ c34814njZ, GapData gapData) {
        c34814njZ.getNewProxyInstance();
        c34814njZ.hDKMBd();
        C42658raa c42658raa = null;
        if (gapData != null) {
            if (gapData.getDate().isEmpty() || gapData.getFutureData().isEmpty() || gapData.getIndexData().isEmpty()) {
                c34814njZ.AxsJAY();
                C42658raa c42658raa2 = c34814njZ.gHZMYf;
                if (c42658raa2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c42658raa = c42658raa2;
                }
                c42658raa.copydefault.copydefault();
            } else {
                c34814njZ.getFieldNames();
                C42658raa c42658raa3 = c34814njZ.gHZMYf;
                if (c42658raa3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c42658raa = c42658raa3;
                }
                c42658raa.copydefault.setData(gapData.getDate(), gapData.getFutureData(), gapData.getIndexData(), "", false);
            }
        } else {
            c34814njZ.AxsJAY();
            C42658raa c42658raa4 = c34814njZ.gHZMYf;
            if (c42658raa4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c42658raa = c42658raa4;
            }
            c42658raa.copydefault.copydefault();
            pUU.copydefault(c34814njZ.getTAG(), "initData: futures basis data is null");
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C34814njZ c34814njZ, java.lang.Throwable th) {
        C42658raa c42658raa = c34814njZ.gHZMYf;
        if (c42658raa == null) {
            Intrinsics.gEmmrt("");
            c42658raa = null;
        }
        c42658raa.copydefault.copydefault();
        c34814njZ.zuBGHE();
        c34814njZ.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public final java.lang.String sSMYrx() {
        java.lang.String str = this.AwvSrB;
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) values()) ? MultiTransferSignData.DEFAULT_INTERVAL : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) valueOf()) ? "0" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) djBIcL()) ? "1" : "2";
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String uly;
        java.lang.String uly2;
        if (Intrinsics.EZpvd((java.lang.Object) fetchVPNInfo().getInstrumentType(), (java.lang.Object) "SWAP")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str, null, null, 12, null) : null;
            SwapInstrument swapInstrument = suggestedInstrument$default instanceof SwapInstrument ? (SwapInstrument) suggestedInstrument$default : null;
            if (swapInstrument != null && (uly2 = swapInstrument.getUly()) != null) {
                return uly2;
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            BizInstrument suggestedInstrument$default2 = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, "FUTURES", str, null, null, 12, null) : null;
            FutureInstrument futureInstrument = suggestedInstrument$default2 instanceof FutureInstrument ? (FutureInstrument) suggestedInstrument$default2 : null;
            if (futureInstrument != null && (uly = futureInstrument.getUly()) != null) {
                return uly;
            }
        }
        return "";
    }

    @Override // o.AbstractC34832njr
    public void zsXlph() {
        super.zsXlph();
        this.AwvSrB = values();
    }

    @Override // o.AbstractC34832njr
    public void zLjUOn() {
        isConnected().clear();
        isConnected().addAll(yDY.gEmmrt(new BigDataTimeIntervalItem(1, values(), java.lang.Boolean.TRUE), new BigDataTimeIntervalItem(5, valueOf(), null, 4, null), new BigDataTimeIntervalItem(60, djBIcL(), null, 4, null), new BigDataTimeIntervalItem(1440, copydefault(), null, 4, null)));
        C35144npl c35144nplAhwBna = AhwBna();
        if (c35144nplAhwBna != null) {
            c35144nplAhwBna.setData(isConnected());
        }
        C35144npl c35144nplAhwBna2 = AhwBna();
        if (c35144nplAhwBna2 != null) {
            c35144nplAhwBna2.setTimeSelectCallBack(new Function1() { // from class: o.nkb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34814njZ.KWHzl(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.njZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C34814njZ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34814njZ c34814njZ) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c34814njZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.AEQbTJ(qZH.PendingIntent.DQzvGNdrmXxudrmXxu, qZH.PendingIntent.DTeKQX);
                    java.lang.String string = context.getString(qZH.PendingIntent.IYdWPz);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final Unit KWHzl(C34814njZ c34814njZ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c34814njZ.AwvSrB = str;
        AbstractC34832njr.initData$default(c34814njZ, null, 1, null);
        return Unit.INSTANCE;
    }
}

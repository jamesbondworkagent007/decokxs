package o;

import android.os.MessageQueue;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KLineOrderStatusBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.features.kline.indicator.viewmodel.KlineIndicatorViewModel;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.library.tradingview.TradingViewManager;
import com.okinc.kline.ui.BaseKlineFragment$changeTime$1;
import com.okinc.kline.ui.BaseKlineFragment$getKlineEventList$1;
import com.okinc.kline.ui.BaseKlineFragment$getKlineStartTime$1;
import com.okinc.kline.ui.BaseKlineFragment$initData$5$1;
import com.okinc.kline.ui.BaseKlineFragment$loadBiz$1;
import com.okinc.kline.ui.BaseKlineFragment$onResume$1;
import com.okinc.kline.ui.BaseKlineFragment$updateMarketCoin$1;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.formula.ui.KLineFormulaFragment;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradelite.bean.OrderBeanData;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeHistoryOrderData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.widget.data.TradeMenuItemBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C36250oUv;
import o.C39402pre;
import o.C52761wXj;
import o.InterfaceC39272ppF;
import o.InterfaceC39274ppH;
import o.InterfaceC39563puh;
import o.InterfaceC49499uph;
import o.InterfaceC54581xNr;
import o.oYA;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oYA extends AbstractC38554pbd implements InterfaceC39563puh.Application, InterfaceC36340oYd {
    public final int AEQbTJ;
    public InterfaceC39502ptZ AYXKKw;
    public InterfaceC39499ptW AhwBna;
    public C36250oUv.StateListAnimator AkhnZx;
    public final java.lang.Runnable AuCTel;
    public boolean AuCTelauCTel;
    public final boolean AubY;
    public final InterfaceC56387yDm AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public final InterfaceC56387yDm AxsJAYaxsJAY;
    public JsonObject AxsJAYsNCnLh;
    public C36344oYh DCUTEI;
    public C36250oUv DTwDnp;
    public TemplateSetting DXXBbs;
    public C39828pzh DarRvM;
    public AbstractC54531xLw DbNXlk;
    public final java.lang.String KWHzl;
    public android.widget.TextView OBJEWx;
    public boolean ODWQjV;
    public C39756pyO ORxRYg;
    public final InterfaceC56387yDm OcIXYQ;
    public Observer<java.lang.Boolean> OuxcSI;
    public long QKVWgx;
    public InterfaceC49506upo QKudOq;
    public InterfaceC58217yxC QOLQEE;
    public boolean QUSxYX;
    public boolean QVAiDq;
    public java.lang.String QbewEr;
    public java.lang.String QfsBiF;
    public java.lang.String RJOkX;
    public final InterfaceC56387yDm RcXXUw;
    public final InterfaceC56387yDm UeEOUB;
    public C39816pzV aKErDB;
    public final java.lang.String copydefault;
    public C36250oUv dNCPSb;
    public ChartViewOutSideConfig djBIcL;
    public C36250oUv djSkpj;
    public C39810pzP dvKsVJ;
    public InterfaceC39563puh.StateListAnimator dxcTrN;
    public boolean ejfBZ;
    public KlineFormulaData fARcdN;
    public java.lang.String fFgQHt;
    public final MessageQueue.IdleHandler fIwbmz;
    public java.lang.String fJNWhG;
    public MarketCoinInfo fZBcTu;
    public C37928pFx ffGIBT;
    public MarketCoinInfo finit;
    public C36312oXc flVtFt;
    public final InterfaceC56387yDm fvQaOB;
    public final int gEmmrt;
    public InterfaceC36254oUz gGvvIC;
    public final InterfaceC56387yDm gHZMYf;
    public boolean gasjUx;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public MutableLiveData<java.lang.Boolean> getPostValueLengthLimit;
    public C55113xdn giSNqX;
    public android.os.Handler gkJEwt;
    public boolean hDKMBd;
    public android.widget.TextView iRxXKY;
    public BizInstrument isConnected;
    public java.lang.String iwGUEr;
    public WeakReference<InterfaceC39272ppF> sSMYrx;
    public final int valueOf;
    public android.content.Context values;
    public C39295ppc wlaJM;
    public boolean zLjUOn;
    public final InterfaceC56387yDm zuBGHE;
    public KLineOrderStatusBean DAIeex = new KLineOrderStatusBean();
    public java.util.List<? extends TradeAllOrderApi> iZzfmt = new java.util.ArrayList();
    public java.util.ArrayList<TradeAllOrderApi> RlQdEF = new java.util.ArrayList<>();
    public java.util.ArrayList<KlineOpenOrderBean> hUfVAv = new java.util.ArrayList<>();
    public java.util.List<? extends TradePositionManager.PositionItem> zuWLRA = new java.util.ArrayList();
    public boolean uzCIH = true;
    public java.util.List<? extends oLY> zsXlph = yDY.AhwBna();
    public java.lang.String accept = "";
    public java.util.ArrayList<DrawLineData.DrawLineItem> fetchVPNInfo = new java.util.ArrayList<>();
    public java.util.ArrayList<LineDataBean> DCJXGO = new java.util.ArrayList<>();
    public java.util.ArrayList<LineFibDataBean> OqFWZa = new java.util.ArrayList<>();
    public final java.lang.String OLrzqt = "klineNeedLoad";
    public final java.lang.String EZpvd = "klineFromArb";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.QfsBiF = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C39295ppc c39295ppc) {
        Intrinsics.checkNotNullParameter(c39295ppc, "");
        this.wlaJM = c39295ppc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC39563puh.StateListAnimator stateListAnimator) {
        this.dxcTrN = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C39756pyO c39756pyO) {
        this.ORxRYg = c39756pyO;
    }

    public abstract void AYXKKw(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(java.lang.String str) {
        this.QbewEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.hDKMBd = z;
    }

    public void AuCTel() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<InterfaceC39272ppF> AubY() {
        return this.sSMYrx;
    }

    public void AxsJAYsNCnLh() {
    }

    public void DAIeex() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DTwDnp() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DXXBbs() {
        return this.zLjUOn;
    }

    public void DarRvM() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(WeakReference<InterfaceC39272ppF> weakReference) {
        this.sSMYrx = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C36312oXc c36312oXc) {
        this.flVtFt = c36312oXc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(KlineFormulaData klineFormulaData) {
        this.fARcdN = klineFormulaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InterfaceC49506upo interfaceC49506upo) {
        this.QKudOq = interfaceC49506upo;
    }

    public boolean ODWQjV() {
        return false;
    }

    @Override // o.InterfaceC39563puh.Application
    public void ODXsMY() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.QKVWgx = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull DrawingDataBean drawingDataBean) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ChartViewOutSideConfig chartViewOutSideConfig) {
        Intrinsics.checkNotNullParameter(chartViewOutSideConfig, "");
        this.djBIcL = chartViewOutSideConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TemplateSetting templateSetting) {
        this.DXXBbs = templateSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.fJNWhG = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC39502ptZ interfaceC39502ptZ) {
        this.AYXKKw = interfaceC39502ptZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OqFWZa() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36250oUv QVAiDq() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo QbewEr() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36250oUv QfsBiF() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39816pzV RJOkX() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36312oXc RcXXUw() {
        return this.flVtFt;
    }

    public void RlQdEF() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String aKErDB() {
        return this.fFgQHt;
    }

    public abstract void accept();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC36254oUz interfaceC36254oUz) {
        this.gGvvIC = interfaceC36254oUz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(C39810pzP c39810pzP) {
        this.dvKsVJ = c39810pzP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39563puh.StateListAnimator dNCPSb() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.QUSxYX = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39810pzP djSkpj() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView dvKsVJ() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39563puh.StateListAnimator dxcTrN() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context ejfBZ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC54531xLw fARcdN() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49506upo fFgQHt() {
        return this.QKudOq;
    }

    public void fJNWhG() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39502ptZ fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(boolean z) {
        this.gasjUx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC36254oUz finit() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int flVtFt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<LineDataBean> fvQaOB() {
        return this.DCJXGO;
    }

    public abstract void gEmmrt(java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.QVAiDq = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gGvvIC() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gHZMYf() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<LineFibDataBean> gasjUx() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TemplateSetting giSNqX() {
        return this.DXXBbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView gkJEwt() {
        return this.OBJEWx;
    }

    public void gwTjWJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument hDKMBd() {
        return this.isConnected;
    }

    public abstract void hUfVAv();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int iZzfmt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39499ptW isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.fJNWhG;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39756pyO sSMYrx() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFormulaData uzCIH() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fFgQHt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.getNewProxyInstance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(boolean z) {
        this.uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
        InterfaceC39563puh.Application.C0921Application.EZpvd((InterfaceC39563puh.Application) this, arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf() {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf(@NotNull java.util.List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, list);
    }

    public oYA() {
        final Function0 function0 = null;
        this.RcXXUw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.UeEOUB = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCT.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AwvSrB = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineQuoteViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.gHZMYf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineIndicatorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.OcIXYQ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C39263pox.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function0;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$viewModels$default$15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.oYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oYA.uzCIH(this.copydefault);
            }
        });
        this.gEmmrt = 1;
        this.AEQbTJ = 2;
        this.ffGIBT = new C37928pFx();
        this.AxsJAYaxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function0;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$special$$inlined$activityViewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.fIwbmz = new MessageQueue.IdleHandler() { // from class: o.oYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return oYA.hDKMBd(this.AEQbTJ);
            }
        };
        this.AxsJAY = C56392yDr.copydefault(new Function0() { // from class: o.oYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oYA.AEQbTJ();
            }
        });
        this.fFgQHt = "TYPE_KLINE";
        this.fvQaOB = C56392yDr.copydefault(new Function0() { // from class: o.oYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oYA.AuCTelauCTel(this.EZpvd);
            }
        });
        this.AubY = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
        this.copydefault = "chart_axis";
        this.KWHzl = "M";
        this.zLjUOn = true;
        this.OuxcSI = new Observer() { // from class: o.oZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                oYA.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.getPostValueLengthLimit = new MutableLiveData<>();
        this.gkJEwt = new android.os.Handler(android.os.Looper.getMainLooper());
        this.AuCTel = new java.lang.Runnable() { // from class: o.oZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oYA.getNewProxyInstance(this.EZpvd);
            }
        };
    }

    public final ChartViewOutSideConfig AxsJAYaxsJAY() {
        ChartViewOutSideConfig chartViewOutSideConfig = this.djBIcL;
        if (chartViewOutSideConfig != null) {
            return chartViewOutSideConfig;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final pCW QUSxYX() {
        return (pCW) this.RcXXUw.getValue();
    }

    public final pCT QOLQEE() {
        return (pCT) this.UeEOUB.getValue();
    }

    public final KlineQuoteViewModel zuBGHE() {
        return (KlineQuoteViewModel) this.AwvSrB.getValue();
    }

    public final KlineIndicatorViewModel AuCTelauCTel() {
        return (KlineIndicatorViewModel) this.gHZMYf.getValue();
    }

    public final C39263pox AxsJAY() {
        return (C39263pox) this.OcIXYQ.getValue();
    }

    public final InterfaceC56387yDm<KlineTimeAnchorViewModel> AwvSrB() {
        return (InterfaceC56387yDm) this.zuBGHE.getValue();
    }

    public final C37854pDd fZBcTu() {
        return (C37854pDd) this.AxsJAYaxsJAY.getValue();
    }

    public static final boolean hDKMBd(oYA oya) {
        pEH.copydefault.EZpvd(oya.QUSxYX().OLrzqt(), false);
        return false;
    }

    public static final C36348oYl AEQbTJ() {
        return new C36348oYl();
    }

    public final C36348oYl zLjUOn() {
        return (C36348oYl) this.AxsJAY.getValue();
    }

    public final java.util.ArrayList<TradeMenuItemBean> UeEOUB() {
        return (java.util.ArrayList) this.fvQaOB.getValue();
    }

    public static final java.util.ArrayList AuCTelauCTel(oYA oya) {
        java.lang.String string = oya.getResources().getString(C35964oKf.Fragment.zOIQXb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TradeMenuItemBean tradeMenuItemBean = new TradeMenuItemBean(string, Intrinsics.EZpvd((java.lang.Object) oya.fFgQHt, (java.lang.Object) "TYPE_KLINE"), java.lang.Integer.valueOf(oya.valueOf), null, false, null, 56, null);
        java.lang.String string2 = oya.getResources().getString(C35964oKf.Fragment.hlkKmr);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String str = null;
        boolean z = false;
        java.lang.String str2 = null;
        int i = 56;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TradeMenuItemBean tradeMenuItemBean2 = new TradeMenuItemBean(string2, Intrinsics.EZpvd((java.lang.Object) oya.fFgQHt, (java.lang.Object) "TYPE_MARK_PRICE_KLINE"), java.lang.Integer.valueOf(oya.gEmmrt), str, z, str2, i, defaultConstructorMarker);
        java.lang.String string3 = oya.getResources().getString(C35964oKf.Fragment.DGUQLIhJrIAr);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return yDY.copydefault(tradeMenuItemBean, tradeMenuItemBean2, new TradeMenuItemBean(string3, Intrinsics.EZpvd((java.lang.Object) oya.fFgQHt, (java.lang.Object) "TYPE_INDEX_KLINE"), java.lang.Integer.valueOf(oya.AEQbTJ), str, z, str2, i, defaultConstructorMarker));
    }

    public final void copydefault(MarketCoinInfo marketCoinInfo) {
        this.finit = marketCoinInfo;
        KWHzl(marketCoinInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(MarketCoinInfo marketCoinInfo) {
        BizInstrument bizInstrumentValueOf;
        if (marketCoinInfo == null) {
            bizInstrumentValueOf = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
                AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
                if (abstractC54531xLwKWHzl != null) {
                    bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId());
                }
            }
        }
        this.isConnected = bizInstrumentValueOf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.values = context;
        InterfaceC39499ptW interfaceC39499ptW = null;
        if (!(getActivity() instanceof ActivityC38834pgs)) {
            if (context instanceof InterfaceC39499ptW) {
                interfaceC39499ptW = (InterfaceC39499ptW) context;
            }
        } else {
            if (this instanceof InterfaceC39499ptW) {
                obj = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC39499ptW)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (InterfaceC39499ptW) (parentFragment instanceof InterfaceC39499ptW ? parentFragment : null);
            }
            interfaceC39499ptW = (InterfaceC39499ptW) obj;
        }
        this.AhwBna = interfaceC39499ptW;
    }

    public final C39295ppc zsXlph() {
        C39295ppc c39295ppc = this.wlaJM;
        if (c39295ppc != null) {
            return c39295ppc;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ(new C39295ppc());
        zsXlph().copydefault(this);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OFhtUX();
    }

    private final void OFhtUX() {
        getChildFragmentManager().setFragmentResultListener("re_open_eco_calendar", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.oYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                oYA.OLrzqt(this.copydefault, str, bundle);
            }
        });
    }

    public static final void OLrzqt(oYA oya, java.lang.String str, android.os.Bundle bundle) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        C36250oUv c36250oUvFIwbmz = oya.fIwbmz();
        java.util.ArrayList<KLineEventBean> klineEventList = (c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getKlineEventList();
        if (klineEventList == null || klineEventList.isEmpty()) {
            oya.onResume();
            return;
        }
        C36250oUv c36250oUvFIwbmz2 = oya.fIwbmz();
        if (c36250oUvFIwbmz2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        C36250oUv c36250oUvFIwbmz3 = oya.fIwbmz();
        if (c36250oUvFIwbmz3 != null) {
            c36250oUvFIwbmz3.QfsBiF();
        }
        C36250oUv c36250oUvFIwbmz4 = oya.fIwbmz();
        if (c36250oUvFIwbmz4 != null) {
            c36250oUvFIwbmz4.invalidate();
        }
    }

    public final void gEmmrt() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            stateListAnimator.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.oYB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.AhwBna(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AhwBna(oYA oya, boolean z) {
        boolean z2 = !z && pFS.KWHzl.AEQbTJ();
        android.widget.TextView textView = oya.iRxXKY;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 8);
        }
        if (!z2 && C36246oUr.copydefault().zLjUOn().isCeFiMCapMode()) {
            oya.AYXKKw(false);
            C36250oUv c36250oUv = oya.DTwDnp;
            if (c36250oUv != null) {
                changeTime$default(oya, c36250oUv, (TimeIntervalItem) CollectionsKt___CollectionsKt.AubY(pEW.EZpvd.copydefault()), false, 4, null);
                oya.QOLQEE().AhwBna().setValue(Unit.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractC54531xLw abstractC54531xLw) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        final MarketCoinInfo marketCoinInfo = this.finit;
        if (marketCoinInfo != null) {
            this.DbNXlk = abstractC54531xLw;
            KWHzl(marketCoinInfo);
            java.lang.String str = this.QfsBiF;
            if (str != null) {
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(str);
                if (bizInstrumentValueOf != null && (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) != null) {
                    abstractC54531xLwOLrzqt.AEQbTJ(bizInstrumentValueOf, new Function1() { // from class: o.oZe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.OLrzqt(this.EZpvd, marketCoinInfo, abstractC54531xLw, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                }
                if (bizInstrumentValueOf == null) {
                    abstractC54531xLw.AEQbTJ(str, new Function1() { // from class: o.oZb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.KWHzl(this.OLrzqt, marketCoinInfo, abstractC54531xLw, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                }
            }
            dHguZz();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(oYA oya, MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw, boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (z) {
            C36250oUv c36250oUv = oya.djSkpj;
            boolean z2 = false;
            boolean z3 = (c36250oUv == null || (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx2.isFullScreenMode()) ? false : true;
            C36250oUv c36250oUv2 = oya.dNCPSb;
            if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isFullScreenMode()) {
                z2 = true;
            }
            if (z3 | z2) {
                pFS pfs = pFS.KWHzl;
                if (pfs.AEQbTJ(marketCoinInfo) || pfs.KWHzl(marketCoinInfo) || pfs.OLrzqt(marketCoinInfo)) {
                    InterfaceC39499ptW interfaceC39499ptW = oya.AhwBna;
                    if (interfaceC39499ptW != null) {
                        interfaceC39499ptW.setPortraitNormal(null);
                    }
                } else {
                    if (oya.getNewProxyInstance) {
                        oya.iRxXKY();
                    } else {
                        oya.EZpvd(abstractC54531xLw);
                    }
                    pUU.copydefault("BaseKlineFragment", "重新拉取新币信息: " + z);
                }
            }
        } else {
            oya.gwTjWJ();
            pUU.copydefault(oya.getTAG(), "loadBizInfoDetail failed");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(oYA oya, MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw, boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (z) {
            C36250oUv c36250oUv = oya.djSkpj;
            boolean z2 = false;
            boolean z3 = (c36250oUv == null || (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx2.isFullScreenMode()) ? false : true;
            C36250oUv c36250oUv2 = oya.dNCPSb;
            if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isFullScreenMode()) {
                z2 = true;
            }
            if (z3 | z2) {
                pFS pfs = pFS.KWHzl;
                if (pfs.AEQbTJ(marketCoinInfo) || pfs.KWHzl(marketCoinInfo) || pfs.OLrzqt(marketCoinInfo)) {
                    InterfaceC39499ptW interfaceC39499ptW = oya.AhwBna;
                    if (interfaceC39499ptW != null) {
                        interfaceC39499ptW.setPortraitNormal(null);
                    }
                } else {
                    oya.EZpvd(abstractC54531xLw);
                    pUU.copydefault("BaseKlineFragment", "重新拉取新币信息: " + z);
                }
            }
        } else {
            oya.gwTjWJ();
            pUU.copydefault(oya.getTAG(), "loadBizInfoDetail failed");
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        C36250oUv c36250oUv = null;
        this.QfsBiF = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.QbewEr = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        android.os.Bundle arguments3 = getArguments();
        this.uzCIH = arguments3 != null && arguments3.getBoolean(this.OLrzqt, true);
        android.os.Bundle arguments4 = getArguments();
        this.fJNWhG = arguments4 != null ? arguments4.getString("klineFormulaName") : null;
        android.os.Bundle arguments5 = getArguments();
        KlineFormulaData klineFormulaData = arguments5 != null ? (KlineFormulaData) arguments5.getParcelable("formulaInfo") : null;
        if (!(klineFormulaData instanceof KlineFormulaData)) {
            klineFormulaData = null;
        }
        this.fARcdN = klineFormulaData;
        this.djSkpj = (C36250oUv) view.findViewById(C35964oKf.StateListAnimator.RsCxkX);
        this.giSNqX = (C55113xdn) view.findViewById(C35964oKf.StateListAnimator.DcMfJKDSqxTE);
        this.dNCPSb = (C36250oUv) view.findViewById(C35964oKf.StateListAnimator.sFt);
        this.OBJEWx = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setCaptioningEnabled);
        this.iRxXKY = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.zeUJxr);
        this.DarRvM = (C39828pzh) view.findViewById(C35964oKf.StateListAnimator.SFHvfSaKzXkR);
        this.aKErDB = (C39816pzV) view.findViewById(C35964oKf.StateListAnimator.invokespecialhrnhsO);
        djBIcL();
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.setVisibility(0);
        }
        if (this.getNewProxyInstance) {
            java.lang.String str = this.fJNWhG;
            copydefault(new MarketCoinInfo(str == null ? "" : str, "formula", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
            this.dxcTrN = new C39562pug(this, this.finit, true, false, 8, null);
        } else {
            java.lang.String str2 = this.QfsBiF;
            if (str2 != null && this.QbewEr != null) {
                Intrinsics.copydefault((java.lang.Object) str2);
                java.lang.String str3 = this.QbewEr;
                Intrinsics.copydefault((java.lang.Object) str3);
                copydefault(new MarketCoinInfo(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
                this.dxcTrN = new C39562pug(this, this.finit, false, this.hDKMBd, 4, null);
            }
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        if (interfaceC39509ptgDjBIcL != null) {
            interfaceC39509ptgDjBIcL.valueOf();
        }
        Application application = new Application();
        this.AkhnZx = application;
        C36250oUv c36250oUv3 = this.djSkpj;
        if (c36250oUv3 != null) {
            c36250oUv3.setChartStateListener(application);
        }
        C36250oUv c36250oUv4 = this.dNCPSb;
        if (c36250oUv4 != null) {
            c36250oUv4.setChartStateListener(this.AkhnZx);
        }
        C36250oUv c36250oUv5 = this.djSkpj;
        if (c36250oUv5 != null) {
            c36250oUv5.setChartHistoryOrder(true);
        }
        C36250oUv c36250oUv6 = this.dNCPSb;
        if (c36250oUv6 != null) {
            c36250oUv6.setChartHistoryOrder(true);
        }
        final C36250oUv c36250oUv7 = this.djSkpj;
        if (c36250oUv7 != null) {
            c36250oUv7.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.oYI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.PendingIntent
                public final void AEQbTJ() {
                    oYA.EZpvd(this.OLrzqt, c36250oUv7);
                }
            });
            c36250oUv7.setReloadKlineListener(new C36250oUv.Fragment() { // from class: o.oYJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.Fragment
                public final void KWHzl() {
                    oYA.iwGUEr(this.AEQbTJ);
                }
            });
            c36250oUv7.setKlineTradeDragListener(new Activity());
        }
        final C36250oUv c36250oUv8 = this.dNCPSb;
        if (c36250oUv8 != null) {
            c36250oUv8.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.oYP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.PendingIntent
                public final void AEQbTJ() {
                    oYA.copydefault(this.EZpvd, c36250oUv8);
                }
            });
        }
        C36250oUv c36250oUv9 = ODWQjV() ? this.djSkpj : this.dNCPSb;
        if (c36250oUv9 != null) {
            zsXlph().copydefault(c36250oUv9);
            c36250oUv = c36250oUv9;
        }
        this.DTwDnp = c36250oUv;
        if (c36250oUv != null) {
            c36250oUv.setDrawUpdateListener(new C36250oUv.Application() { // from class: o.oYM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.Application
                public final void copydefault(AbstractC36302oWt abstractC36302oWt) {
                    oYA.KWHzl(this.OLrzqt, abstractC36302oWt);
                }
            });
        }
    }

    public static final class Application implements C36250oUv.StateListAnimator {
        public Application() {
        }

        @Override // o.C36250oUv.StateListAnimator
        public void EZpvd() {
            java.lang.String strORxRYg = oYA.this.ORxRYg();
            java.lang.String str = "";
            if (strORxRYg != null) {
                java.lang.String lowerCase = strORxRYg.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    str = lowerCase;
                }
            }
            C37908pFd.djBIcL(str);
        }

        @Override // o.C36250oUv.StateListAnimator
        public void KWHzl() {
            java.lang.String strORxRYg = oYA.this.ORxRYg();
            java.lang.String str = "";
            if (strORxRYg != null) {
                java.lang.String lowerCase = strORxRYg.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    str = lowerCase;
                }
            }
            C37908pFd.copydefault(str);
        }

        @Override // o.C36250oUv.StateListAnimator
        public void OLrzqt(PriceWarningItemBean priceWarningItemBean, java.lang.String str) {
            Intrinsics.checkNotNullParameter(priceWarningItemBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode == -1361636432) {
                if (str.equals("change")) {
                    C32866mlf.onEvent$default("KLine_Chart_PriceAlertLine_Drag", (TrackChannel[]) null, new Function1() { // from class: o.oZn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.Application.AEQbTJ((EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                    pEY.copydefault(oYA.this, priceWarningItemBean, str);
                    return;
                }
                return;
            }
            if (iHashCode != -1335458389) {
                if (iHashCode == 97618667 && str.equals("force")) {
                    C32866mlf.onEvent$default("KLine_Chart_PriceAlertLine_Click", (TrackChannel[]) null, new Function1() { // from class: o.oZp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.Application.gEmmrt((EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                    return;
                }
                return;
            }
            if (str.equals(RequestParameters.SUBRESOURCE_DELETE)) {
                C32866mlf.onEvent$default("KLine_Chart_DeletePriceAlert_Click", (TrackChannel[]) null, new Function1() { // from class: o.oZl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oYA.Application.KWHzl((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                oYA.this.EZpvd(priceWarningItemBean);
            }
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }
    }

    public static final void EZpvd(oYA oya, C36250oUv c36250oUv) {
        oya.EZpvd(c36250oUv);
    }

    public static final void iwGUEr(oYA oya) {
        oya.DCUTEI();
    }

    public static final class Activity implements InterfaceC36253oUy {
        public Activity() {
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(final KlineOpenOrderBean klineOpenOrderBean) {
            InterfaceC49506upo interfaceC49506upoFFgQHt;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            android.content.Context contextEjfBZ = oYA.this.ejfBZ();
            if (contextEjfBZ != null) {
                final oYA oya = oYA.this;
                try {
                    AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                    if (abstractC54531xLwFARcdN != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        java.lang.String strOcIXYQ = oya.OcIXYQ();
                        if (strOcIXYQ == null) {
                            strOcIXYQ = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFx.KWHzl(abstractC54531xLwFARcdN, strOcIXYQ, klineOpenOrderBean.getPrice()));
                        C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                        if (c36250oUvQVAiDq != null && (listHDKMBd = c36250oUvQVAiDq.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setChangePrice(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oya.iZzfmt, klineOpenOrderBean.getOriginPos());
                        C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                        if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx.getMode()), (java.lang.Object) "lite_mode")) {
                            oya.DbNXlk();
                            OrderBeanData orderBeanDataEZpvd = tradeAllOrderApi != null ? C37944pGm.KWHzl.EZpvd(tradeAllOrderApi, java.lang.Double.valueOf(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice()))) : null;
                            if (orderBeanDataEZpvd != null && (interfaceC49506upoFFgQHt = oya.fFgQHt()) != null) {
                                interfaceC49506upoFFgQHt.EZpvd(orderBeanDataEZpvd);
                            }
                            oya.ODWQjV = false;
                            oya.copydefault(klineOpenOrderBean.getOriginPos());
                            return;
                        }
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFx2 = oya.ffGIBT;
                            androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFx2.EZpvd(contextEjfBZ, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, false, false, new Function1() { // from class: o.oZo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return oYA.Activity.djBIcL(oya, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            oya.QUSxYX().fetchVPNInfo(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (java.lang.Exception e) {
                    oya.ODWQjV = false;
                    oya.OLrzqt();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("order_line", "order_price_change");
        }

        public static final Unit djBIcL(oYA oya, KlineOpenOrderBean klineOpenOrderBean, int i) {
            TradeAllOrderApi tradeAllOrderApi;
            java.util.List<? extends InterfaceC39510pth> listAubY;
            if (i != 2) {
                C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                if (c36250oUvQVAiDq != null && (listAubY = c36250oUvQVAiDq.AubY()) != null) {
                    C37928pFx c37928pFx = oya.ffGIBT;
                    java.util.List<? extends TradePositionManager.PositionItem> list = oya.zuWLRA;
                    C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                    c37928pFx.OLrzqt(listAubY, list, c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.hDKMBd() : null);
                }
                if (!klineOpenOrderBean.isMainOrder() && (tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oya.iZzfmt, klineOpenOrderBean.getOriginPos())) != null) {
                    oya.ffGIBT.OLrzqt(klineOpenOrderBean, (InterfaceC55726xpQ) tradeAllOrderApi, klineOpenOrderBean.getMainPrice(), false);
                }
                C36250oUv c36250oUvQVAiDq3 = oya.QVAiDq();
                if (c36250oUvQVAiDq3 != null) {
                    c36250oUvQVAiDq3.invalidate();
                }
            }
            oya.ODWQjV = false;
            oya.OLrzqt();
            if (i == 2) {
                oya.EZpvd("yes", "modify_order");
                oya.QUSxYX().isConnected(1);
            } else if (i == 3) {
                oya.EZpvd("no", "modify_order");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AhwBna(final KlineOpenOrderBean klineOpenOrderBean) {
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            android.content.Context contextEjfBZ = oYA.this.ejfBZ();
            if (contextEjfBZ != null) {
                final oYA oya = oYA.this;
                try {
                    oya.DAIeex.setNeedRelevanceCost(false);
                    AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                    if (abstractC54531xLwFARcdN != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        java.lang.String strOcIXYQ = oya.OcIXYQ();
                        if (strOcIXYQ == null) {
                            strOcIXYQ = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFx.KWHzl(abstractC54531xLwFARcdN, strOcIXYQ, klineOpenOrderBean.getPrice()));
                        C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                        if (c36250oUvQVAiDq != null && (listHDKMBd = c36250oUvQVAiDq.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setDragging(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oya.iZzfmt, klineOpenOrderBean.getOriginPos());
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFx2 = oya.ffGIBT;
                            androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFx2.EZpvd(contextEjfBZ, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, true, false, new Function1() { // from class: o.oZx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return oYA.Activity.AYXKKw(oya, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            oya.QUSxYX().AkhnZx(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (java.lang.Exception e) {
                    oya.ODWQjV = false;
                    oya.OLrzqt();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("order_line", "order_tp");
        }

        public static final Unit AYXKKw(oYA oya, KlineOpenOrderBean klineOpenOrderBean, int i) {
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            try {
                if (i == 2) {
                    oya.DAIeex.setNeedRelevanceCost(true);
                    oya.DAIeex.setCost(false);
                    oya.DAIeex.setOrdId(klineOpenOrderBean.getOrdId());
                    oya.DAIeex.setTP(true);
                } else {
                    C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                    if (c36250oUvQVAiDq != null && (listHDKMBd = c36250oUvQVAiDq.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                        klineOpenOrderBean2.setShowSolid(true);
                    }
                    C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                    if (c36250oUvQVAiDq2 != null) {
                        c36250oUvQVAiDq2.invalidate();
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("onOrderLineDragFinish", java.lang.String.valueOf(e.getMessage()));
            }
            oya.ODWQjV = false;
            oya.OLrzqt();
            if (i == 2) {
                oya.EZpvd("yes", "order_tpsl");
                oya.QUSxYX().AuCTel(1);
            } else if (i == 3) {
                oya.EZpvd("no", "order_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void OLrzqt(final KlineOpenOrderBean klineOpenOrderBean) {
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            android.content.Context contextEjfBZ = oYA.this.ejfBZ();
            if (contextEjfBZ != null) {
                final oYA oya = oYA.this;
                try {
                    oya.DAIeex.setNeedRelevanceCost(false);
                    AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                    if (abstractC54531xLwFARcdN != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        java.lang.String strOcIXYQ = oya.OcIXYQ();
                        if (strOcIXYQ == null) {
                            strOcIXYQ = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFx.KWHzl(abstractC54531xLwFARcdN, strOcIXYQ, klineOpenOrderBean.getPrice()));
                        C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                        if (c36250oUvQVAiDq != null && (listHDKMBd = c36250oUvQVAiDq.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setDragging(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oya.iZzfmt, klineOpenOrderBean.getOriginPos());
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFx2 = oya.ffGIBT;
                            androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFx2.EZpvd(contextEjfBZ, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, false, true, new Function1() { // from class: o.oZz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return oYA.Activity.valueOf(oya, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            oya.QUSxYX().DbNXlk(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (java.lang.Exception e) {
                    oya.ODWQjV = false;
                    oya.OLrzqt();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("order_line", "order_sl");
        }

        public static final Unit valueOf(oYA oya, KlineOpenOrderBean klineOpenOrderBean, int i) {
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            try {
                if (i == 2) {
                    oya.DAIeex.setNeedRelevanceCost(true);
                    oya.DAIeex.setCost(false);
                    oya.DAIeex.setOrdId(klineOpenOrderBean.getOrdId());
                    oya.DAIeex.setTP(false);
                } else {
                    C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                    if (c36250oUvQVAiDq != null && (listHDKMBd = c36250oUvQVAiDq.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                        klineOpenOrderBean2.setShowSolid(true);
                    }
                    C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                    if (c36250oUvQVAiDq2 != null) {
                        c36250oUvQVAiDq2.invalidate();
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("onOrderLineSLDragFinish", java.lang.String.valueOf(e.getMessage()));
            }
            oya.ODWQjV = false;
            oya.OLrzqt();
            if (i == 2) {
                oya.EZpvd("yes", "order_tpsl");
                oya.QUSxYX().values(1);
            } else if (i == 3) {
                oya.EZpvd("no", "order_tpsl");
            }
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pGm.toOrderBeanData$default(o.pGm, com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi, java.lang.Double, int, java.lang.Object):com.okinc.tradelite.bean.OrderBeanData */
        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            if (oYA.this.ejfBZ() != null) {
                final oYA oya = oYA.this;
                try {
                    TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oya.iZzfmt, klineOpenOrderBean.getOriginPos());
                    if (tradeAllOrderApi != null) {
                        C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                        if (!Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getMode()), (java.lang.Object) "lite_mode")) {
                            C36250oUv c36250oUv = oya.DTwDnp;
                            if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMOrderCancelConfirm()) {
                                FragmentActivity activity = oya.getActivity();
                                if (activity != null) {
                                    oya.ffGIBT.OLrzqt(activity, klineOpenOrderBean, tradeAllOrderApi, oya, activity, new Function1() { // from class: o.oZt
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return oYA.Activity.KWHzl(oya, ((java.lang.Boolean) obj).booleanValue());
                                        }
                                    });
                                }
                            } else {
                                FragmentActivity activity2 = oya.getActivity();
                                if (activity2 != null) {
                                    oya.ffGIBT.EZpvd(klineOpenOrderBean, tradeAllOrderApi, oya, activity2, new Function1() { // from class: o.oZs
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return oYA.Activity.EZpvd(oya, ((java.lang.Boolean) obj).booleanValue());
                                        }
                                    });
                                }
                            }
                            oya.QUSxYX().KWHzl(1);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            OrderBeanData orderBeanData$default = C37944pGm.toOrderBeanData$default(C37944pGm.KWHzl, tradeAllOrderApi, null, 1, null);
                            if (orderBeanData$default != null) {
                                InterfaceC49505upn interfaceC49505upn = (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
                                androidx.fragment.app.FragmentManager supportFragmentManager = oya.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                interfaceC49505upn.copydefault(supportFragmentManager, orderBeanData$default);
                                return;
                            }
                            return;
                        }
                    }
                } catch (java.lang.Exception e) {
                    pUU.copydefault("onOrderLineCancelClick 取消订单", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("order_line", "order_cancel");
        }

        public static final Unit KWHzl(oYA oya, boolean z) {
            oya.EZpvd(z ? "yes" : "no", "cancel_order");
            if (z) {
                oya.QUSxYX().OLrzqt(1);
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(oYA oya, boolean z) {
            oya.EZpvd(z ? "yes" : "no", "cancel_order");
            if (z) {
                oya.QUSxYX().OLrzqt(1);
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void copydefault(final KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            try {
                oYA.this.DAIeex.setNeedRelevanceCost(false);
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(oYA.this.zuWLRA, klineOpenOrderBean.getOriginPos());
                if (positionItem != null) {
                    final oYA oya = oYA.this;
                    C37928pFx c37928pFx = oya.ffGIBT;
                    androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFx.OLrzqt(childFragmentManager, Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit"), klineOpenOrderBean, positionItem, new Function1() { // from class: o.oZy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.Activity.AhwBna(oya, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    oya.QUSxYX().djBIcL(1);
                }
            } catch (java.lang.Exception e) {
                oYA.this.ODWQjV = false;
                oYA.this.OLrzqt();
                pUU.copydefault("onCostLineTPDragFinish 仓位线 TP拖拽", java.lang.String.valueOf(e.getMessage()));
            }
            oYA.this.copydefault("position_line", "position_tl");
        }

        public static final Unit AhwBna(oYA oya, KlineOpenOrderBean klineOpenOrderBean, int i) {
            java.util.List<? extends InterfaceC39510pth> listAubY;
            InterfaceC39510pth interfaceC39510pth;
            java.util.List<? extends InterfaceC39510pth> listAubY2;
            InterfaceC39510pth interfaceC39510pth2;
            try {
                C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                if (c36250oUvQVAiDq != null && (listAubY2 = c36250oUvQVAiDq.AubY()) != null && (interfaceC39510pth2 = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY2, klineOpenOrderBean.getOriginPos())) != null) {
                    interfaceC39510pth2.setDragTP(false);
                }
                if (i == 2) {
                    oya.DAIeex.setNeedRelevanceCost(true);
                    oya.DAIeex.setCost(true);
                    oya.DAIeex.setOrdId(klineOpenOrderBean.getOrdId());
                } else {
                    C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                    if (c36250oUvQVAiDq2 != null && (listAubY = c36250oUvQVAiDq2.AubY()) != null && (interfaceC39510pth = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY, klineOpenOrderBean.getOriginPos())) != null) {
                        interfaceC39510pth.setShowSolid(true);
                    }
                    C36250oUv c36250oUvQVAiDq3 = oya.QVAiDq();
                    if (c36250oUvQVAiDq3 != null) {
                        c36250oUvQVAiDq3.invalidate();
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("onCostLineTPDragFinish", java.lang.String.valueOf(e.getMessage()));
            }
            oya.ODWQjV = false;
            oya.OLrzqt();
            if (i == 2) {
                oya.EZpvd("yes", "position_tpsl");
                oya.QUSxYX().AYXKKw(1);
            } else if (i == 3) {
                oya.EZpvd("no", "position_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void KWHzl(final KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            try {
                oYA.this.DAIeex.setNeedRelevanceCost(false);
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(oYA.this.zuWLRA, klineOpenOrderBean.getOriginPos());
                if (positionItem != null) {
                    final oYA oya = oYA.this;
                    C37928pFx c37928pFx = oya.ffGIBT;
                    androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFx.OLrzqt(childFragmentManager, Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit"), klineOpenOrderBean, positionItem, new Function1() { // from class: o.oZw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.Activity.gEmmrt(oya, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    oya.QUSxYX().valueOf(1);
                }
            } catch (java.lang.Exception e) {
                oYA.this.ODWQjV = false;
                oYA.this.OLrzqt();
                pUU.copydefault("onCostLineSLDragFinish 仓位线 SL拖拽", java.lang.String.valueOf(e.getMessage()));
            }
            oYA.this.copydefault("position_line", "position_sl");
        }

        public static final Unit gEmmrt(oYA oya, KlineOpenOrderBean klineOpenOrderBean, int i) {
            java.util.List<? extends InterfaceC39510pth> listAubY;
            InterfaceC39510pth interfaceC39510pth;
            java.util.List<? extends InterfaceC39510pth> listAubY2;
            InterfaceC39510pth interfaceC39510pth2;
            try {
                C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                if (c36250oUvQVAiDq != null && (listAubY2 = c36250oUvQVAiDq.AubY()) != null && (interfaceC39510pth2 = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY2, klineOpenOrderBean.getOriginPos())) != null) {
                    interfaceC39510pth2.setDragSL(false);
                }
                if (i == 2) {
                    oya.DAIeex.setNeedRelevanceCost(true);
                    oya.DAIeex.setCost(true);
                    oya.DAIeex.setOrdId(klineOpenOrderBean.getOrdId());
                } else {
                    C36250oUv c36250oUvQVAiDq2 = oya.QVAiDq();
                    if (c36250oUvQVAiDq2 != null && (listAubY = c36250oUvQVAiDq2.AubY()) != null && (interfaceC39510pth = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY, klineOpenOrderBean.getOriginPos())) != null) {
                        interfaceC39510pth.setShowSolid(true);
                    }
                    C36250oUv c36250oUvQVAiDq3 = oya.QVAiDq();
                    if (c36250oUvQVAiDq3 != null) {
                        c36250oUvQVAiDq3.invalidate();
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("onCostLineSLDragFinish", java.lang.String.valueOf(e.getMessage()));
            }
            oya.ODWQjV = false;
            oya.OLrzqt();
            if (i == 2) {
                oya.EZpvd("yes", "position_tpsl");
                oya.QUSxYX().AhwBna(1);
            } else if (i == 3) {
                oya.EZpvd("no", "position_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
            try {
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(oYA.this.zuWLRA, interfaceC39510pth.getIndex());
                if (positionItem != null) {
                    final oYA oya = oYA.this;
                    C37928pFx c37928pFx = oya.ffGIBT;
                    androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFx.AEQbTJ(positionItem, childFragmentManager, oya.getFieldNames(), new Function1() { // from class: o.oZA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.Activity.KWHzl(oya, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    oya.QUSxYX().EZpvd(1);
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("onCostLineCancelClick 显示平仓弹框", java.lang.String.valueOf(e.getMessage()));
            }
            oYA.this.copydefault("position_line", "position_close");
        }

        public static final Unit KWHzl(oYA oya, int i) {
            if (i == 2) {
                oya.EZpvd("yes", "close_position");
                oya.QUSxYX().AEQbTJ(1);
            } else if (i == 3) {
                oya.EZpvd("no", "close_position");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
            android.content.Context contextEjfBZ = oYA.this.ejfBZ();
            if (contextEjfBZ != null) {
                final oYA oya = oYA.this;
                try {
                    TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(oya.zuWLRA, interfaceC39510pth.getIndex());
                    if (positionItem != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        androidx.fragment.app.FragmentManager childFragmentManager = oya.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        c37928pFx.AEQbTJ(contextEjfBZ, childFragmentManager, positionItem, new Function1() { // from class: o.oZr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return oYA.Activity.AEQbTJ(oya, ((java.lang.Integer) obj).intValue());
                            }
                        });
                        oya.QUSxYX().copydefault(1);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (java.lang.Exception e) {
                    pUU.copydefault("onCostLineOppositeClick 显示一键反仓弹框", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("position_line", "position_reverse");
        }

        public static final Unit AEQbTJ(oYA oya, int i) {
            if (i == 2) {
                oya.EZpvd("yes", "reverse_position");
                oya.QUSxYX().gEmmrt(1);
            } else if (i == 3) {
                oya.EZpvd("no", "reverse_position");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean, java.lang.String str, boolean z, boolean z2, int i) {
            java.util.List<KlineOpenOrderBean> listHDKMBd;
            java.util.List<? extends InterfaceC39510pth> listAubY;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.Integer numValueOf = null;
            if (z) {
                if (!oYA.this.zuWLRA.isEmpty()) {
                    TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(oYA.this.zuWLRA, i);
                    if (positionItem != null) {
                        oYA.this.ffGIBT.OLrzqt(klineOpenOrderBean, positionItem, str, z2);
                        return;
                    }
                    oYA oya = oYA.this;
                    int size = oya.zuWLRA.size();
                    C36250oUv c36250oUvQVAiDq = oya.QVAiDq();
                    if (c36250oUvQVAiDq != null && (listAubY = c36250oUvQVAiDq.AubY()) != null) {
                        numValueOf = java.lang.Integer.valueOf(listAubY.size());
                    }
                    pUU.copydefault("OKKLine", "tradePositionOriginList.size = " + size + " tradePositionDataList.size = " + numValueOf + " costIndex = " + i + "}");
                    return;
                }
                return;
            }
            if (!oYA.this.iZzfmt.isEmpty()) {
                TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(oYA.this.iZzfmt, klineOpenOrderBean.getOriginPos());
                if (tradeAllOrderApi != null) {
                    oYA.this.ffGIBT.OLrzqt(klineOpenOrderBean, tradeAllOrderApi, str, z2);
                    return;
                }
                oYA oya2 = oYA.this;
                int size2 = oya2.iZzfmt.size();
                C36250oUv c36250oUvQVAiDq2 = oya2.QVAiDq();
                if (c36250oUvQVAiDq2 != null && (listHDKMBd = c36250oUvQVAiDq2.hDKMBd()) != null) {
                    numValueOf = java.lang.Integer.valueOf(listHDKMBd.size());
                }
                pUU.copydefault("OKKLine", "openOrderOriginList.size = " + size2 + " openOrderDataList.size = " + numValueOf + " tempOrderBean.originPos = " + klineOpenOrderBean.getOriginPos() + "}");
            }
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ() {
            oYA.this.ODWQjV = true;
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(final KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = oYA.this.getChildFragmentManager();
            final oYA oya = oYA.this;
            try {
                AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                if (abstractC54531xLwFARcdN != null) {
                    MarketCoinInfo marketCoinInfoQbewEr = oya.QbewEr();
                    java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                    Intrinsics.copydefault((java.lang.Object) instrumentId);
                    BizInstrument bizInstrumentValueOf = abstractC54531xLwFARcdN.valueOf(instrumentId);
                    if (bizInstrumentValueOf != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        Intrinsics.copydefault(childFragmentManager);
                        c37928pFx.copydefault(childFragmentManager, bizInstrumentValueOf, klineOpenOrderBean, (128 & 8) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (128 & 16) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (128 & 32) != 0 ? "" : klineSpotAverageBean.getTpOrdPx(), (128 & 64) != 0 ? "" : klineSpotAverageBean.getSlOrdPx(), (128 & 128) != 0 ? TradeType.SELL_CLOSE : null, (128 & 256) != 0 ? null : new Function1() { // from class: o.oZu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return oYA.Activity.EZpvd(oya, klineSpotAverageBean, ((java.lang.Integer) obj).intValue());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                oya.AEQbTJ(klineSpotAverageBean);
                pUU.copydefault("onSpotLineTPDragFinish", java.lang.String.valueOf(e.getMessage()));
                Unit unit2 = Unit.INSTANCE;
            }
            oYA.this.copydefault("spot_cost_line", "position_tl");
        }

        public static final Unit EZpvd(oYA oya, KlineSpotAverageBean klineSpotAverageBean, int i) {
            oya.AEQbTJ(klineSpotAverageBean);
            oya.KWHzl();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pFx.showSpotTpSlDialog$default(o.pFx, androidx.fragment.app.FragmentManager, com.okinc.unify_trade.biz.BizInstrument, com.okinc.kline.data.KlineOpenOrderBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.biz.TradeType, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(final KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = oYA.this.getChildFragmentManager();
            final oYA oya = oYA.this;
            try {
                AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                if (abstractC54531xLwFARcdN != null) {
                    MarketCoinInfo marketCoinInfoQbewEr = oya.QbewEr();
                    java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                    Intrinsics.copydefault((java.lang.Object) instrumentId);
                    BizInstrument bizInstrumentValueOf = abstractC54531xLwFARcdN.valueOf(instrumentId);
                    if (bizInstrumentValueOf != null) {
                        C37928pFx c37928pFx = oya.ffGIBT;
                        Intrinsics.copydefault(childFragmentManager);
                        c37928pFx.copydefault(childFragmentManager, bizInstrumentValueOf, klineOpenOrderBean, (128 & 8) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (128 & 16) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (128 & 32) != 0 ? "" : klineSpotAverageBean.getTpOrdPx(), (128 & 64) != 0 ? "" : klineSpotAverageBean.getSlOrdPx(), (128 & 128) != 0 ? TradeType.SELL_CLOSE : null, (128 & 256) != 0 ? null : new Function1() { // from class: o.oZv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return oYA.Activity.AEQbTJ(oya, klineSpotAverageBean, ((java.lang.Integer) obj).intValue());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                oya.AEQbTJ(klineSpotAverageBean);
                pUU.copydefault("onSpotLineTPDragFinish", java.lang.String.valueOf(e.getMessage()));
                Unit unit2 = Unit.INSTANCE;
            }
            oYA.this.copydefault("spot_cost_line", "position_sl");
        }

        public static final Unit AEQbTJ(oYA oya, KlineSpotAverageBean klineSpotAverageBean, int i) {
            oya.AEQbTJ(klineSpotAverageBean);
            oya.KWHzl();
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void copydefault(KlineSpotAverageBean klineSpotAverageBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = oYA.this.getChildFragmentManager();
            if (childFragmentManager != null) {
                final oYA oya = oYA.this;
                try {
                    AbstractC54531xLw abstractC54531xLwFARcdN = oya.fARcdN();
                    if (abstractC54531xLwFARcdN != null) {
                        MarketCoinInfo marketCoinInfoQbewEr = oya.QbewEr();
                        java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId);
                        BizInstrument bizInstrumentValueOf = abstractC54531xLwFARcdN.valueOf(instrumentId);
                        if (bizInstrumentValueOf != null) {
                            oya.ffGIBT.copydefault(childFragmentManager, bizInstrumentValueOf, (64 & 4) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (64 & 8) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (64 & 16) != 0 ? TradeType.SELL_CLOSE : TradeType.SELL_CLOSE, (64 & 32) != 0 ? null : new Function1() { // from class: o.oZq
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return oYA.Activity.AhwBna(oya, ((java.lang.Integer) obj).intValue());
                                }
                            }, (64 & 64) != 0);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (java.lang.Exception e) {
                    pUU.copydefault("onSpotLineTPDragFinish", java.lang.String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            oYA.this.copydefault("spot_cost_line", "position_close");
        }

        public static final Unit AhwBna(oYA oya, int i) {
            oya.KWHzl();
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(oYA oya, C36250oUv c36250oUv) {
        oya.EZpvd(c36250oUv);
    }

    public static final void KWHzl(oYA oya, AbstractC36302oWt abstractC36302oWt) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (abstractC36302oWt instanceof C36291oWi) {
            C36250oUv c36250oUv = oya.DTwDnp;
            if (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
                return;
            }
            oya.zuBGHE().OLrzqt(chartViewOutSideConfigAkhnZx.getKlineEventList());
            return;
        }
        if (abstractC36302oWt instanceof C36295oWm) {
            oya.AuCTelauCTel().KWHzl();
        }
    }

    public final void DCUTEI() {
        C36250oUv c36250oUv = this.DTwDnp;
        if (c36250oUv != null) {
            KWHzl(c36250oUv, new TimeIntervalItem(C36246oUr.copydefault().ODWQjV(), "", "", "", ""), true);
        }
    }

    public final void copydefault(int i) {
        this.ffGIBT.copydefault();
        this.ffGIBT.KWHzl(i);
        this.ffGIBT.copydefault(i);
    }

    public final void AEQbTJ(KlineSpotAverageBean klineSpotAverageBean) {
        klineSpotAverageBean.setTDragSL(false);
        klineSpotAverageBean.setTDragTP(false);
        klineSpotAverageBean.setTSelected(true);
        klineSpotAverageBean.setTShowSolid(true);
        this.ODWQjV = false;
        OLrzqt();
    }

    public final void DbNXlk() {
        android.view.ViewGroup viewGroup;
        if (this.QKudOq == null && (viewGroup = (android.view.ViewGroup) requireView().findViewById(C35964oKf.StateListAnimator.gdwsGQ)) != null) {
            InterfaceC49505upn interfaceC49505upn = (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            this.QKudOq = interfaceC49505upn.copydefault(fragmentActivityRequireActivity, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), viewGroup, new Function0() { // from class: o.oYV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oYA.AuCTel(this.OLrzqt);
                }
            }, new Function1() { // from class: o.oZf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.OLrzqt(this.EZpvd, ((java.lang.Double) obj).doubleValue());
                }
            }, new Function0() { // from class: o.oZh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oYA.fJNWhG(this.copydefault);
                }
            });
        }
    }

    public static final java.lang.String AuCTel(oYA oya) {
        java.lang.String str = oya.QfsBiF;
        if (str != null) {
            return str;
        }
        BizInstrument bizInstrument = oya.isConnected;
        java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
        return instId == null ? "" : instId;
    }

    public static final Unit OLrzqt(oYA oya, double d) {
        oya.djBIcL(C33129mqd.gEmmrt(java.lang.Double.valueOf(d)));
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(oYA oya) {
        oya.djBIcL("");
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("PlaceOrder_Pop_TradeOrderStatus_View", (TrackChannel[]) null, new Function1() { // from class: o.oYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.AEQbTJ(this.AEQbTJ, str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(oYA oya, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str3 = oya.QbewEr;
        eventParamsList.put("biz_type", str3 != null ? str3 : "", true);
        eventParamsList.put("is_success", str, true);
        eventParamsList.put(BotWebHook.KEY_ACTION, str2, true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        eventParamsList.put("page", "chart", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt() {
        EZpvd((java.util.List<KlineOpenOrderBean>) this.hUfVAv);
        OLrzqt(this.RlQdEF);
    }

    public final void KWHzl() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.AhwBna((EventParamsList) obj);
            }
        });
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "spot_cost_line", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str, final java.lang.String str2) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.EZpvd(str, str2, this, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, oYA oya, EventParamsList eventParamsList) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", str, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        java.lang.String str4 = oya.QbewEr;
        if (str4 != null) {
            java.lang.String lowerCase = str4.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str3 = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str3, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(C36250oUv c36250oUv) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        TemplateSetting templateSetting = this.DXXBbs;
        if (templateSetting != null) {
            int sPTimeInterval = templateSetting.getSPTimeInterval();
            C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.fARcdN()));
            if (this.getNewProxyInstance) {
                KlineFormulaData klineFormulaData = this.fARcdN;
                if (klineFormulaData == null || (stateListAnimator = this.dxcTrN) == null) {
                    return;
                }
                stateListAnimator.copydefault(this, klineFormulaData.getCalcExpression(), klineFormulaData.getInstIdArray(), pEF.OLrzqt.OLrzqt(sPTimeInterval), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.fARcdN())), oLT.AYXKKw());
                return;
            }
            if (this.hDKMBd) {
                fJNWhG();
                return;
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.dxcTrN;
            if (stateListAnimator2 != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(stateListAnimator2, this, pEF.OLrzqt.OLrzqt(sPTimeInterval), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.fARcdN())), oLT.djBIcL(), false, null, 48, null);
            }
        }
    }

    public void djBIcL() {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ2;
        if (this.uzCIH) {
            C36250oUv c36250oUv = this.djSkpj;
            if (c36250oUv != null && (mapEjfBZ2 = c36250oUv.ejfBZ()) != null) {
                C36250oUv c36250oUv2 = this.djSkpj;
                com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ2.get(c36250oUv2 != null ? c36250oUv2.fIwbmz() : null);
                if (dataSource != null) {
                    dataSource.KWHzl();
                }
            }
            C36250oUv c36250oUv3 = this.dNCPSb;
            if (c36250oUv3 == null || (mapEjfBZ = c36250oUv3.ejfBZ()) == null) {
                return;
            }
            C36250oUv c36250oUv4 = this.dNCPSb;
            com.okinc.kline.library.data.DataSource dataSource2 = mapEjfBZ.get(c36250oUv4 != null ? c36250oUv4.fIwbmz() : null);
            if (dataSource2 != null) {
                dataSource2.KWHzl();
            }
        }
    }

    public final C36250oUv fIwbmz() {
        return ODWQjV() ? this.djSkpj : this.dNCPSb;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        FragmentActivity activity;
        android.view.Window window;
        if (SPUtils.getBoolean("key_screen_on", false) && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (!Intrinsics.EZpvd((java.lang.Object) ((c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx.getChartTag()), (java.lang.Object) "sp_timeinterval_okx_pro") && !this.QVAiDq) {
            C36250oUv c36250oUvFIwbmz2 = fIwbmz();
            pFS.KWHzl.KWHzl("ds0", AEQbTJ(c36250oUvFIwbmz2 != null ? c36250oUvFIwbmz2.wlaJM() : null));
            pFN pfn = pFN.OLrzqt;
            C37830pCg c37830pCg = C37830pCg.EZpvd;
            java.lang.String strCopydefault = c37830pCg.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            pfn.EZpvd(strCopydefault, c37830pCg);
        }
        if (!pFS.KWHzl.KWHzl(getParentFragment()) || this.QVAiDq || this.QUSxYX) {
            hUfVAv();
        }
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (str == null || str2 == null) {
            return;
        }
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setCurrentMode("NORMAL");
        }
        C36250oUv c36250oUvFIwbmz2 = fIwbmz();
        if (c36250oUvFIwbmz2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setAutoYScaleClick(false);
        }
        this.QfsBiF = str;
        this.QbewEr = str2;
        copydefault(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        if (pFS.KWHzl.KWHzl(getParentFragment()) && !this.QVAiDq) {
            getPostValueLengthLimit();
            AYXKKw();
            dmfpNf();
        }
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.gEmmrt();
        }
        C36250oUv c36250oUvFIwbmz3 = fIwbmz();
        TemplateSetting templateSettingWlaJM = c36250oUvFIwbmz3 != null ? c36250oUvFIwbmz3.wlaJM() : null;
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.setCurrentDataSource(AEQbTJ(templateSettingWlaJM));
        }
        if (isVisibled()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseKlineFragment$updateMarketCoin$1(this, null));
            MarketCoinInfo marketCoinInfo = this.finit;
            Intrinsics.copydefault(marketCoinInfo);
            EZpvd(marketCoinInfo);
            InterfaceC39499ptW interfaceC39499ptW = this.AhwBna;
            if (interfaceC39499ptW == null || interfaceC39499ptW == null) {
                return;
            }
            interfaceC39499ptW.EZpvd(this.finit);
        }
    }

    public final java.lang.String AEQbTJ(TemplateSetting templateSetting) {
        if (this.getNewProxyInstance) {
            return this.fJNWhG + JwtUtilsKt.JWT_DELIMITER + (templateSetting != null ? java.lang.Integer.valueOf(templateSetting.getSPTimeInterval()) : null);
        }
        MarketCoinInfo marketCoinInfo = this.finit;
        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo2 = this.finit;
        return instrumentId + (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null) + JwtUtilsKt.JWT_DELIMITER + (templateSetting != null ? java.lang.Integer.valueOf(templateSetting.getSPTimeInterval()) : null);
    }

    public final void EZpvd(@NotNull java.lang.Object obj) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseKlineFragment$loadBiz$1(this, obj, null));
    }

    public final void iRxXKY() {
        TemplateSetting templateSetting;
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (ODWQjV()) {
            C36250oUv c36250oUv = this.djSkpj;
            this.DXXBbs = c36250oUv != null ? c36250oUv.wlaJM() : null;
            DarRvM();
        } else {
            DAIeex();
            C36250oUv c36250oUv2 = this.dNCPSb;
            this.DXXBbs = c36250oUv2 != null ? c36250oUv2.wlaJM() : null;
        }
        ffGIBT();
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (c36250oUvFIwbmz != null) {
            c36250oUvFIwbmz.AEQbTJ();
        }
        if ((!pFS.KWHzl.KWHzl(getParentFragment()) || this.QVAiDq) && (templateSetting = this.DXXBbs) != null) {
            final int sPTimeInterval = templateSetting.getSPTimeInterval();
            if (this.uzCIH) {
                RdAHlO();
            }
            C36250oUv c36250oUvFIwbmz2 = fIwbmz();
            if (c36250oUvFIwbmz2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowCostLine(false);
                chartViewOutSideConfigAkhnZx.setMShowPriceWarning(false);
                chartViewOutSideConfigAkhnZx.setShowBe(false);
                chartViewOutSideConfigAkhnZx.setShowLiq(false);
            }
            C36250oUv c36250oUvFIwbmz3 = fIwbmz();
            if (c36250oUvFIwbmz3 != null) {
                c36250oUvFIwbmz3.AwvSrB();
                c36250oUvFIwbmz3.sSMYrx();
            }
            KlineFormulaData klineFormulaData = this.fARcdN;
            if (klineFormulaData != null && (stateListAnimator = this.dxcTrN) != null) {
                stateListAnimator.EZpvd((LifecycleOwner) this, klineFormulaData, sPTimeInterval, false, new Function1() { // from class: o.oZa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oYA.AEQbTJ(sPTimeInterval, this, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
            if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || sPTimeInterval == -2) {
                return;
            }
            if (this.uzCIH) {
                C36250oUv c36250oUvFIwbmz4 = fIwbmz();
                if (c36250oUvFIwbmz4 != null) {
                    c36250oUvFIwbmz4.AYXKKw();
                }
            } else {
                this.uzCIH = true;
            }
            if (ODWQjV()) {
                java.lang.String string = SPUtils.getString("kline_indicator_version", "0");
                InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.dxcTrN;
                if (stateListAnimator2 != null) {
                    Intrinsics.copydefault((java.lang.Object) string);
                    stateListAnimator2.copydefault(this, "ALL", string);
                }
            }
        }
    }

    public static final Unit AEQbTJ(int i, oYA oya, boolean z) {
        C36250oUv c36250oUv;
        if (z && i != -2 && (c36250oUv = oya.DTwDnp) != null) {
            C39295ppc c39295ppcZsXlph = oya.zsXlph();
            java.lang.String str = oya.fJNWhG;
            if (str == null) {
                str = "";
            }
            c39295ppcZsXlph.copydefault(c36250oUv, str, (LifecycleOwner) oya, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        TemplateSetting templateSetting;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C39756pyO c39756pyO;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Unit unit;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        java.lang.String instFamily;
        MarketCoinInfo marketCoinInfo = this.finit;
        if (marketCoinInfo != null) {
            if (abstractC54531xLw != null) {
                java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                    this.RJOkX = instFamily;
                }
                if (bizInstrumentValueOf != null) {
                    C36250oUv c36250oUvFIwbmz = fIwbmz();
                    if (c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz.AkhnZx()) == null) {
                        unit = null;
                    } else {
                        if (!this.QVAiDq) {
                            C36246oUr.copydefault(pDX.KWHzl());
                            chartViewOutSideConfigAkhnZx2.setAmountDisplaySymbol(C33129mqd.gEmmrt(bizInstrumentValueOf.getTradeSymbol()));
                            chartViewOutSideConfigAkhnZx2.setTurnoverDisplaySymbol(C33129mqd.gEmmrt(bizInstrumentValueOf.getQuoteSymbol()));
                        }
                        chartViewOutSideConfigAkhnZx2.setTradeSymbol(bizInstrumentValueOf.getTradeSymbol());
                        unit = Unit.INSTANCE;
                    }
                }
                gwTjWJ();
                pUU.copydefault(getTAG(), "initData : instrument = null");
                return;
            }
            if (ODWQjV()) {
                C36250oUv c36250oUv = this.djSkpj;
                TemplateSetting templateSettingWlaJM = c36250oUv != null ? c36250oUv.wlaJM() : null;
                Intrinsics.copydefault(templateSettingWlaJM);
                this.DXXBbs = templateSettingWlaJM;
                DarRvM();
                C36250oUv c36250oUv2 = this.DTwDnp;
                if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setScreenChange(false);
                }
            } else {
                DAIeex();
                C36250oUv c36250oUv3 = this.dNCPSb;
                TemplateSetting templateSettingWlaJM2 = c36250oUv3 != null ? c36250oUv3.wlaJM() : null;
                Intrinsics.copydefault(templateSettingWlaJM2);
                this.DXXBbs = templateSettingWlaJM2;
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.dxcTrN;
            if (stateListAnimator2 != null) {
                MarketCoinInfo marketCoinInfo2 = this.finit;
                Intrinsics.copydefault(marketCoinInfo2);
                stateListAnimator2.AEQbTJ(marketCoinInfo2);
            }
            if (!this.uzCIH) {
                if (Intrinsics.EZpvd((java.lang.Object) QOLQEE().gEmmrt(), (java.lang.Object) "TYPE_KLINE")) {
                    QHmsKR();
                    AEQbTJ(this.valueOf);
                    this.zuWLRA = QOLQEE().DbNXlk();
                    this.iZzfmt = QOLQEE().AYXKKw();
                } else {
                    InterfaceC39563puh.StateListAnimator stateListAnimator3 = this.dxcTrN;
                    if (stateListAnimator3 != null) {
                        stateListAnimator3.KWHzl(QOLQEE().gEmmrt());
                    }
                    C36250oUv c36250oUvFIwbmz2 = fIwbmz();
                    if (c36250oUvFIwbmz2 != null) {
                        c36250oUvFIwbmz2.AwvSrB();
                        c36250oUvFIwbmz2.sSMYrx();
                    }
                    AEQbTJ(Intrinsics.EZpvd((java.lang.Object) QOLQEE().gEmmrt(), (java.lang.Object) "TYPE_INDEX_KLINE") ? this.AEQbTJ : this.gEmmrt);
                }
            } else {
                MarketCoinInfo marketCoinInfo3 = this.finit;
                Intrinsics.copydefault(marketCoinInfo3);
                if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo3.getInstrumentType(), (java.lang.Object) "OPTION")) {
                    InterfaceC39563puh.StateListAnimator stateListAnimator4 = this.dxcTrN;
                    if (stateListAnimator4 != null) {
                        stateListAnimator4.KWHzl("TYPE_MARK_PRICE_KLINE");
                    }
                    C36250oUv c36250oUvFIwbmz3 = fIwbmz();
                    if (c36250oUvFIwbmz3 != null) {
                        c36250oUvFIwbmz3.AwvSrB();
                        c36250oUvFIwbmz3.sSMYrx();
                    }
                    QOLQEE().OLrzqt("TYPE_MARK_PRICE_KLINE");
                } else {
                    QHmsKR();
                    QOLQEE().OLrzqt("TYPE_KLINE");
                }
            }
            TemplateSetting templateSetting2 = this.DXXBbs;
            if (templateSetting2 != null && (sideIndicatorNames = templateSetting2.getSideIndicatorNames()) != null && (c39756pyO = this.ORxRYg) != null) {
                c39756pyO.setSideIndicators(sideIndicatorNames);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator5 = this.dxcTrN;
            if (stateListAnimator5 != null) {
                stateListAnimator5.AEQbTJ(this);
            }
            C36250oUv c36250oUvFIwbmz4 = fIwbmz();
            if (c36250oUvFIwbmz4 != null) {
                c36250oUvFIwbmz4.AEQbTJ();
            }
            if ((!pFS.KWHzl.KWHzl(getParentFragment()) || this.QVAiDq) && (templateSetting = this.DXXBbs) != null) {
                int sPTimeInterval = templateSetting.getSPTimeInterval();
                if (this.uzCIH && DCJXGO()) {
                    RdAHlO();
                }
                if (sPTimeInterval == -2) {
                    AYXKKw(true);
                } else {
                    isConnected(false);
                }
                gEmmrt();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKlineFragment$initData$5$1(this, sPTimeInterval, abstractC54531xLw, null), 3, null);
            }
            this.fZBcTu = this.finit;
        }
    }

    public final boolean DCJXGO() {
        return !Intrinsics.EZpvd(this.finit, this.fZBcTu);
    }

    public static /* synthetic */ void initKlineData$default(oYA oya, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initKlineData");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        oya.OLrzqt(i, z);
    }

    public final void OLrzqt(final int i, boolean z) {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(this, i, i != -2, z, new Function1() { // from class: o.oYS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.OLrzqt(i, this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(int i, oYA oya, boolean z) {
        if (z && i != -2) {
            oya.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        java.lang.String instrumentId;
        C36250oUv c36250oUv = this.DTwDnp;
        if (c36250oUv != null) {
            C39295ppc c39295ppcZsXlph = zsXlph();
            MarketCoinInfo marketCoinInfo = this.finit;
            if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                instrumentId = "";
            }
            InterfaceC39274ppH.ActionBar.getDrawingData$default(c39295ppcZsXlph, c36250oUv, instrumentId, this, false, 8, null);
        }
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.setQuickOrderPrice(new KlineQuickOrderPriceBean(str, null, 2, 0 == true ? 1 : 0));
        }
        C36250oUv c36250oUv2 = this.djSkpj;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
    }

    public final void AEQbTJ(int i) {
        java.lang.String str;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C39756pyO c39756pyO;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv;
        if (i == this.valueOf) {
            QOLQEE().OLrzqt("TYPE_KLINE");
            str = "TYPE_KLINE";
        } else if (i == this.gEmmrt) {
            str = "TYPE_MARK_PRICE_KLINE";
            QOLQEE().OLrzqt("TYPE_MARK_PRICE_KLINE");
        } else {
            str = "TYPE_INDEX_KLINE";
            QOLQEE().OLrzqt("TYPE_INDEX_KLINE");
        }
        this.fFgQHt = str;
        OLrzqt(i);
        C36250oUv c36250oUv2 = this.djSkpj;
        TemplateSetting templateSettingWlaJM = c36250oUv2 != null ? c36250oUv2.wlaJM() : null;
        if (templateSettingWlaJM == null || templateSettingWlaJM.getSPTimeInterval() != -2) {
            if (Intrinsics.EZpvd((java.lang.Object) this.fFgQHt, (java.lang.Object) "TYPE_KLINE")) {
                C36250oUv c36250oUvFIwbmz = fIwbmz();
                if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMShowVolume() && (c36250oUv = this.djSkpj) != null) {
                    c36250oUv.fZBcTu();
                }
                ffGIBT();
            } else {
                C36250oUv c36250oUv3 = this.djSkpj;
                if (c36250oUv3 != null) {
                    c36250oUv3.AwvSrB();
                }
                C36250oUv c36250oUv4 = this.djSkpj;
                if (c36250oUv4 != null) {
                    c36250oUv4.sSMYrx();
                }
            }
            if (templateSettingWlaJM == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null || (c39756pyO = this.ORxRYg) == null) {
                return;
            }
            c39756pyO.setSideIndicators(sideIndicatorNames);
        }
    }

    public final void QHmsKR() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl("TYPE_KLINE");
        }
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMShowVolume()) {
            C36250oUv c36250oUv = this.djSkpj;
            if (c36250oUv != null) {
                c36250oUv.fZBcTu();
            }
            C36250oUv c36250oUv2 = this.dNCPSb;
            if (c36250oUv2 != null) {
                c36250oUv2.fZBcTu();
            }
        }
        ffGIBT();
    }

    public final void ffGIBT() {
        TemplateSetting templateSetting = this.DXXBbs;
        if (templateSetting != null) {
            if (templateSetting.getSPTimeInterval() != -1) {
                C36250oUv c36250oUv = this.djSkpj;
                if (c36250oUv != null) {
                    c36250oUv.aKErDB();
                }
                C36250oUv c36250oUv2 = this.dNCPSb;
                if (c36250oUv2 != null) {
                    c36250oUv2.aKErDB();
                    return;
                }
                return;
            }
            C36250oUv c36250oUv3 = this.djSkpj;
            if (c36250oUv3 != null) {
                c36250oUv3.sSMYrx();
            }
            C36250oUv c36250oUv4 = this.dNCPSb;
            if (c36250oUv4 != null) {
                c36250oUv4.sSMYrx();
            }
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = new C31947mJv().KWHzl(str);
        if (abstractC58260yxtKWHzl != null) {
            final Function1 function1 = new Function1() { // from class: o.oYG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.EZpvd((java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oYE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    oYA.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.oYH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oYK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    oYA.EZpvd(function12, obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        pUU.copydefault("OKKLine", "deleteDbByInstId 画线数据删除失败: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void uploadDrawingData$default(oYA oya, java.util.ArrayList arrayList, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDrawingData");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        oya.copydefault((java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList, z, z2);
    }

    public final void copydefault(@NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, boolean z, boolean z2) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        java.lang.String indexId;
        java.lang.String json;
        Intrinsics.checkNotNullParameter(arrayList, "");
        JsonObject jsonObject = new JsonObject();
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
            LineDataBean lineDataBean = new LineDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            LineFibDataBean lineFibDataBean = new LineFibDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            if (drawLineItem.getIndexId().length() == 0) {
                indexId = C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis() + ((long) i));
            } else {
                indexId = drawLineItem.getIndexId();
            }
            getTAG();
            Objects.toString(indexId);
            if (z || drawLineItem.isDelete()) {
                json = "";
            } else if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                lineFibDataBean.setId(indexId);
                C37895pEr c37895pEr = C37895pEr.copydefault;
                lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                java.lang.String str = this.QfsBiF;
                if (str == null) {
                    str = "";
                }
                lineFibDataBean.setState(c37895pEr.KWHzl(drawLineItem, str, true));
                lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                json = new Gson().toJson(lineFibDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo)) {
                    this.OqFWZa.add(lineFibDataBean);
                }
            } else {
                lineDataBean.setId(indexId);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                java.lang.String str2 = this.QfsBiF;
                if (str2 == null) {
                    str2 = "";
                }
                lineDataBean.setState(c37895pEr2.EZpvd(drawLineItem, str2, true));
                lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo)) {
                    this.DCJXGO.add(lineDataBean);
                }
            }
            jsonObject.addProperty(indexId, json);
            i++;
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true) && (stateListAnimator = this.dxcTrN) != null) {
            java.lang.String str3 = this.QfsBiF;
            if (str3 == null) {
                str3 = "";
            }
            stateListAnimator.AEQbTJ(this, str3, jsonObject, z, z2);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        super.onResume();
        this.ejfBZ = false;
        InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.dxcTrN;
        if (stateListAnimator2 != null) {
            stateListAnimator2.AYXKKw();
        }
        if (this.getNewProxyInstance) {
            iRxXKY();
            if (!pFS.KWHzl.KWHzl(getParentFragment()) || this.QVAiDq) {
                QSBOWP();
                return;
            }
            return;
        }
        if (this.finit != null) {
            OBJEWx();
            MarketCoinInfo marketCoinInfo = this.finit;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "INDEX")) {
                EZpvd((AbstractC54531xLw) null);
            } else {
                LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseKlineFragment$onResume$1(this, null));
            }
        }
        if (!pFS.KWHzl.KWHzl(getParentFragment()) || this.QVAiDq) {
            if (Intrinsics.EZpvd(fZBcTu().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
                QSBOWP();
                accept();
            }
        } else {
            InterfaceC39499ptW interfaceC39499ptW = this.AhwBna;
            if (interfaceC39499ptW != null && Intrinsics.EZpvd(interfaceC39499ptW.values(), java.lang.Boolean.TRUE)) {
                InterfaceC39499ptW interfaceC39499ptW2 = this.AhwBna;
                if (interfaceC39499ptW2 != null) {
                    interfaceC39499ptW2.fARcdN();
                }
                getPostValueLengthLimit();
                AYXKKw();
                dmfpNf();
            } else if (this.getFieldNames || this.AuCTelauCTel) {
                JsonObject jsonObject = this.AxsJAYsNCnLh;
                if (jsonObject != null && (stateListAnimator = this.dxcTrN) != null) {
                    InterfaceC39563puh.StateListAnimator.TaskDescription.requestOriginData$default(stateListAnimator, this, this.accept, jsonObject, null, 8, null);
                }
            } else {
                getPostValueLengthLimit();
                AYXKKw();
                dmfpNf();
            }
        }
        C32866mlf.onEvent$default("app_kline_page_view", (TrackChannel[]) null, new Function1() { // from class: o.oYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.EZpvd(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(oYA oya, EventParamsList eventParamsList) {
        java.lang.String instrumentType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        MarketCoinInfo marketCoinInfo = oya.finit;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "-";
        }
        eventParamsList.put("biztype", instrumentType, true);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(oYA oya, boolean z) {
        oya.getPostValueLengthLimit();
        oya.AYXKKw();
        oya.dmfpNf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && intent.getBooleanExtra(oLT.EZpvd(), false)) {
            this.AuCTelauCTel = true;
            this.getFieldNames = false;
            getPostValueLengthLimit();
            AYXKKw();
            dmfpNf();
        }
    }

    public final void dmfpNf() {
        this.gkJEwt.postDelayed(new java.lang.Runnable() { // from class: o.oYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oYA.zsXlph(this.KWHzl);
            }
        }, 50L);
        accept();
    }

    public static final void zsXlph(oYA oya) {
        if (oya.DCUTEI == null) {
            android.content.Context context = oya.values;
            Intrinsics.copydefault(context);
            C36344oYh c36344oYh = new C36344oYh(context, oya);
            oya.DCUTEI = c36344oYh;
            c36344oYh.EZpvd();
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity activity;
        android.view.Window window;
        super.onPause();
        this.ejfBZ = true;
        pUU.copydefault("BaseKline------", EopTrackEvent.ONPAUSE);
        hBpjJd();
        if (SPUtils.getBoolean("key_screen_on", false) && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        zuWLRA();
    }

    public final void zuWLRA() {
        this.DAIeex.setNeedRelevanceCost(false);
        this.DAIeex.setCost(false);
        this.DAIeex.setTP(true);
    }

    public static /* synthetic */ void isShowPriceType$default(oYA oya, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isShowPriceType");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        oya.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        android.widget.TextView textView;
        C36250oUv c36250oUvFIwbmz;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        MarketCoinInfo marketCoinInfo = this.finit;
        if (marketCoinInfo == null || (textView = this.OBJEWx) == null) {
            return;
        }
        int i = 0;
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "OPTION") || pFS.KWHzl.AEQbTJ(marketCoinInfo.getInstrumentId())) {
            OuxcSI();
            if (z && (c36250oUvFIwbmz = fIwbmz()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowPriceType(true);
            }
        } else {
            C36250oUv c36250oUvFIwbmz2 = fIwbmz();
            if (c36250oUvFIwbmz2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setShowPriceType(false);
            }
            i = 8;
        }
        textView.setVisibility(i);
    }

    public static final class ActionBar implements C39402pre.TaskDescription {
        public ActionBar() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.ppF.ActionBar.setState$default(o.ppF, com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior$States, boolean, int, java.lang.Object):void */
        @Override // o.C39402pre.TaskDescription
        public void KWHzl(TradeMenuItemBean tradeMenuItemBean) {
            InterfaceC39272ppF interfaceC39272ppF;
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), java.lang.Integer.valueOf(oYA.this.flVtFt()))) {
                oYA oya = oYA.this;
                oya.KWHzl(oya.flVtFt());
                objectRef.element = "last_price";
            } else if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), java.lang.Integer.valueOf(oYA.this.iZzfmt()))) {
                oYA oya2 = oYA.this;
                oya2.KWHzl(oya2.iZzfmt());
                objectRef.element = "mark_price";
            } else if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), java.lang.Integer.valueOf(oYA.this.gGvvIC()))) {
                oYA oya3 = oYA.this;
                oya3.KWHzl(oya3.gGvvIC());
                objectRef.element = "index_price";
            }
            oYA.this.copydefault(true);
            WeakReference<InterfaceC39272ppF> weakReferenceAubY = oYA.this.AubY();
            if (weakReferenceAubY != null && (interfaceC39272ppF = weakReferenceAubY.get()) != null) {
                InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_PriceTypePop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oZm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.ActionBar.EZpvd(objectRef, (EventParamsList) obj);
                }
            });
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit EZpvd(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("price_type", (java.lang.String) objectRef.element, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pre.ActionBar.newInstance$default(o.pre$ActionBar, java.util.List, java.lang.String, boolean, int, java.lang.Object):o.pre */
    public final C39402pre QKudOq() {
        C39402pre c39402preNewInstance$default = C39402pre.ActionBar.newInstance$default(C39402pre.Companion, UeEOUB(), null, false, 6, null);
        c39402preNewInstance$default.EZpvd(new ActionBar());
        c39402preNewInstance$default.EZpvd(new Function0() { // from class: o.oYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oYA.getFieldNames(this.AEQbTJ);
            }
        });
        return c39402preNewInstance$default;
    }

    public static final Unit getFieldNames(oYA oya) {
        oya.copydefault(true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        TemplateSetting templateSettingWlaJM;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        KlineSpotAverageBean klineSpotAverageBean;
        AEQbTJ(i);
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && (klineSpotAverageBean = chartViewOutSideConfigAkhnZx.getKlineSpotAverageBean()) != null) {
            klineSpotAverageBean.setShowSpotAverageLine(i == this.valueOf);
        }
        C36250oUv c36250oUv2 = this.djSkpj;
        if (c36250oUv2 != null) {
            c36250oUv2.djBIcL();
        }
        AbstractC54531xLw abstractC54531xLw = this.DbNXlk;
        if (abstractC54531xLw != null) {
            MarketCoinInfo marketCoinInfo = this.finit;
            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
            if (bizInstrumentValueOf != null) {
                java.lang.String instFamily = bizInstrumentValueOf.getInstFamily();
                C36250oUv c36250oUv3 = this.djSkpj;
                if (c36250oUv3 != null) {
                    c36250oUv3.setPriceFractionDigits(C33129mqd.AhwBna(abstractC54531xLw.fIwbmz(instFamily)));
                }
            }
        }
        C36250oUv c36250oUv4 = this.djSkpj;
        if (c36250oUv4 == null || (templateSettingWlaJM = c36250oUv4.wlaJM()) == null) {
            return;
        }
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        RdAHlO();
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(this, this.fFgQHt, sPTimeInterval, new Function1() { // from class: o.oYL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit copydefault(oYA oya, boolean z) {
        java.lang.String instrumentType;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        java.lang.String instrumentId;
        KlineQuoteViewModel klineQuoteViewModelZuBGHE = oya.zuBGHE();
        java.lang.String str = oya.fFgQHt;
        MarketCoinInfo marketCoinInfo = oya.finit;
        java.lang.String str2 = "";
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "";
        }
        MarketCoinInfo marketCoinInfo2 = oya.finit;
        if (marketCoinInfo2 != null && (instrumentId = marketCoinInfo2.getInstrumentId()) != null) {
            str2 = instrumentId;
        }
        klineQuoteViewModelZuBGHE.KWHzl(new C39105ply(str, instrumentType, str2));
        C36250oUv c36250oUv = oya.djSkpj;
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            C36250oUv c36250oUv2 = oya.djSkpj;
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUv2 != null ? c36250oUv2.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUvFIwbmz = oya.fIwbmz();
        if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        C36250oUv c36250oUv3 = oya.djSkpj;
        if (c36250oUv3 != null) {
            c36250oUv3.QfsBiF();
        }
        oya.fZBcTu().EZpvd();
        return Unit.INSTANCE;
    }

    public void OLrzqt(int i) {
        if (i == this.valueOf) {
            android.widget.TextView textView = this.OBJEWx;
            if (textView != null) {
                textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
                return;
            }
            return;
        }
        if (i == this.gEmmrt) {
            android.widget.TextView textView2 = this.OBJEWx;
            if (textView2 != null) {
                textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hlkKmr));
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.OBJEWx;
        if (textView3 != null) {
            textView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLIhJrIAr));
        }
    }

    public final void copydefault(boolean z) {
        android.widget.TextView textView = this.OBJEWx;
        if (textView != null) {
            pFQ.KWHzl(textView, z ? C35964oKf.Activity.wlaJM : C35964oKf.Activity.zsXlph);
        }
    }

    public void OuxcSI() {
        int i;
        if (!this.uzCIH) {
            this.fFgQHt = QOLQEE().gEmmrt();
            int size = UeEOUB().size();
            int i2 = 0;
            while (i2 < size) {
                TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(UeEOUB(), i2);
                if (tradeMenuItemBean != null) {
                    java.lang.String str = this.fFgQHt;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_KLINE")) {
                        i = this.valueOf;
                    } else {
                        i = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? this.gEmmrt : this.AEQbTJ;
                    }
                    tradeMenuItemBean.setSelect(i2 == i);
                }
                i2++;
            }
            return;
        }
        MarketCoinInfo marketCoinInfo = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
            this.fFgQHt = "TYPE_MARK_PRICE_KLINE";
            android.widget.TextView textView = this.OBJEWx;
            if (textView != null) {
                textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hlkKmr));
            }
            int size2 = UeEOUB().size();
            int i3 = 0;
            while (i3 < size2) {
                TradeMenuItemBean tradeMenuItemBean2 = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(UeEOUB(), i3);
                if (tradeMenuItemBean2 != null) {
                    tradeMenuItemBean2.setSelect(i3 == 1);
                }
                i3++;
            }
            QOLQEE().OLrzqt("TYPE_MARK_PRICE_KLINE");
            return;
        }
        this.fFgQHt = "TYPE_KLINE";
        android.widget.TextView textView2 = this.OBJEWx;
        if (textView2 != null) {
            textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
        }
        int size3 = UeEOUB().size();
        int i4 = 0;
        while (i4 < size3) {
            TradeMenuItemBean tradeMenuItemBean3 = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(UeEOUB(), i4);
            if (tradeMenuItemBean3 != null) {
                tradeMenuItemBean3.setSelect(i4 == 0);
            }
            i4++;
        }
        QOLQEE().OLrzqt("TYPE_KLINE");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull C36250oUv c36250oUv) {
        boolean z;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        if (Intrinsics.EZpvd(fZBcTu().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            MarketCoinInfo marketCoinInfo = this.finit;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                z = true;
            } else {
                MarketCoinInfo marketCoinInfo2 = this.finit;
                if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                    z = false;
                }
            }
            c36250oUv.setFuturesWithOutOption(z);
            KWHzl(c36250oUv);
        }
    }

    private final void gEmmrt(C36250oUv c36250oUv) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (templateSettingWlaJM.getSPTimeInterval() < 0) {
            c36250oUv.setChartStyle(1);
            return;
        }
        int timelineScale = templateSettingWlaJM.getTimelineScale();
        int i = oWN.AEQbTJ;
        if (timelineScale < i) {
            C36250oUv c36250oUvFIwbmz = fIwbmz();
            if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isColumnChart()) {
                oWN own = c36250oUv.zLjUOn().get("ds0");
                if (own != null) {
                    own.OLrzqt(i);
                }
                c36250oUv.setChartStyle(0);
                return;
            }
            c36250oUv.setChartStyle(2);
            return;
        }
        c36250oUv.setChartStyle(0);
    }

    public final void OLrzqt(@NotNull C36250oUv c36250oUv) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        pEX pex = pEX.OLrzqt;
        OLrzqt(new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, pex.OLrzqt(), pex.AEQbTJ(), false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -3073, -1, -1, Integer.MAX_VALUE, null));
        AxsJAYaxsJAY().setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
        ChartViewOutSideConfig chartViewOutSideConfigAxsJAYaxsJAY = AxsJAYaxsJAY();
        pFP pfp = pFP.OLrzqt;
        chartViewOutSideConfigAxsJAYaxsJAY.setSimulateLine(pFP.isUserInDemoTrading$default(pfp, null, 1, null));
        AxsJAYaxsJAY().setChartTag(this.QVAiDq ? "sp_timeinterval_okx_lite" : "sp_timeinterval_okx_pro");
        AxsJAYaxsJAY().setMode(this.QVAiDq ? "lite_mode" : "pro_mode");
        AxsJAYaxsJAY().setOrderSupportClick(true);
        AxsJAYaxsJAY().setSpotCostSupportClick(!this.QVAiDq);
        AxsJAYaxsJAY().setCurrentMode("NORMAL");
        AxsJAYaxsJAY().setAutoYScaleClick(false);
        AxsJAYaxsJAY().setHideTradeDrawingLine(false);
        AxsJAYaxsJAY().setScreenType(0);
        ChartViewOutSideConfig chartViewOutSideConfigAxsJAYaxsJAY2 = AxsJAYaxsJAY();
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        chartViewOutSideConfigAxsJAYaxsJAY2.setMPriceFractionDigits((c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) == null) ? 2 : chartViewOutSideConfigAkhnZx.getMPriceFractionDigits());
        AxsJAYaxsJAY().setCeFiMCapMode(C36246oUr.copydefault().zLjUOn().isCeFiMCapMode());
        AxsJAYaxsJAY().setFastKLineMode(C36246oUr.copydefault().zLjUOn().isFastKLineMode());
        AxsJAYaxsJAY().setScreenChange(AwvSrB().getValue().copydefault());
        AxsJAYaxsJAY().setUtc8(pfp.AEQbTJ());
        c36250oUv.OLrzqt(AxsJAYaxsJAY());
        if (!AxsJAYaxsJAY().isCeFiMCapMode()) {
            c36250oUv.QOLQEE();
        }
        AxsJAYsNCnLh();
        KWHzl(c36250oUv);
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx2 == null || !chartViewOutSideConfigAkhnZx2.isShowCountdown()) {
            return;
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.valueOf((EventParamsList) obj);
            }
        });
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "countdown", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(C36250oUv c36250oUv) {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        boolean z;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        android.content.Context context = this.values;
        int iAhwBna = 2;
        if (context != null) {
            numValueOf = java.lang.Integer.valueOf(this.QVAiDq ? C33512mxp.tradeRiseAlternative$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
        } else {
            numValueOf = null;
        }
        Intrinsics.copydefault(numValueOf);
        chartViewOutSideConfigAkhnZx.setMPositiveColor(numValueOf.intValue());
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx();
        android.content.Context context2 = this.values;
        if (context2 != null) {
            numValueOf2 = java.lang.Integer.valueOf(this.QVAiDq ? C33512mxp.tradeFallAlternative$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null) : C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null));
        } else {
            numValueOf2 = null;
        }
        Intrinsics.copydefault(numValueOf2);
        chartViewOutSideConfigAkhnZx2.setMNegativeColor(numValueOf2.intValue());
        c36250oUv.AkhnZx().setMChartOffsetInit(false);
        MarketCoinInfo marketCoinInfo = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null))) {
            MarketCoinInfo marketCoinInfo2 = this.finit;
            java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null).AEQbTJ();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 66097) {
                if (upperCase.equals("BTC")) {
                }
                c36250oUv.setPriceFractionDigits(iAhwBna);
            } else {
                if (iHashCode != 84326) {
                    if (iHashCode == 2614190 && upperCase.equals("USDT")) {
                        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        iAhwBna = C33129mqd.AhwBna((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(upperCase)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig());
                    }
                } else if (upperCase.equals("USD")) {
                    InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    iAhwBna = C33129mqd.AhwBna((interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ.getPrecision());
                }
                c36250oUv.setPriceFractionDigits(iAhwBna);
            }
        } else {
            AbstractC54531xLw abstractC54531xLw = this.DbNXlk;
            if (abstractC54531xLw != null) {
                MarketCoinInfo marketCoinInfo3 = this.finit;
                java.lang.String instrumentId = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null) {
                    c36250oUv.setPriceFractionDigits(C33129mqd.AhwBna(abstractC54531xLw.fIwbmz(bizInstrumentValueOf.getInstFamily())));
                    c36250oUv.setCoinVol(C33129mqd.AhwBna(abstractC54531xLw.gEmmrt(bizInstrumentValueOf)));
                }
            }
        }
        MarketCoinInfo marketCoinInfo4 = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
            z = true;
        } else {
            MarketCoinInfo marketCoinInfo5 = this.finit;
            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo5 != null ? marketCoinInfo5.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                MarketCoinInfo marketCoinInfo6 = this.finit;
                if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo6 != null ? marketCoinInfo6.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                    z = false;
                }
            }
        }
        c36250oUv.setFutures(z);
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        c36250oUv.setCurrentDataSource(AEQbTJ(templateSettingWlaJM));
        AEQbTJ(c36250oUv);
        java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        if (num != null && num.intValue() == 0) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx3 != null) {
                chartViewOutSideConfigAkhnZx3.setMOrdinateType(0);
            }
        } else {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx4 != null) {
                chartViewOutSideConfigAkhnZx4.setMOrdinateType(1);
            }
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx5 != null) {
            chartViewOutSideConfigAkhnZx5.setMShowVolume(templateSettingWlaJM.hasVolumeIndicator());
        }
        java.lang.Integer num2 = SPUtils.getInt("kline_abstract_type", 1);
        if ((num2 != null && num2.intValue() == 1) || this.QVAiDq) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx6 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx6 != null) {
                chartViewOutSideConfigAkhnZx6.setMKlineAbstractType(1);
            }
        } else {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx7 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx7 != null) {
                chartViewOutSideConfigAkhnZx7.setMKlineAbstractType(0);
            }
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx8 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx8 != null) {
            chartViewOutSideConfigAkhnZx8.setMShowAxis(SPUtils.getBoolean(this.copydefault, true));
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx9 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx9 != null) {
            chartViewOutSideConfigAkhnZx9.setMCandlestickType(SPUtils.getInt("chart_model", 0).intValue());
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx10 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx10 != null) {
            chartViewOutSideConfigAkhnZx10.setMChartPosition(SPUtils.getInt("chart_position", 1).intValue());
        }
        MarketCoinInfo marketCoinInfo7 = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo7 != null ? marketCoinInfo7.getInstrumentType() : null), (java.lang.Object) "INDEX")) {
            c36250oUv.AwvSrB();
        } else {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx11 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx11 != null && chartViewOutSideConfigAkhnZx11.getMShowVolume() && templateSettingWlaJM.getSPTimeInterval() != -2) {
                c36250oUv.fZBcTu();
            }
        }
        gEmmrt(c36250oUv);
    }

    public final void AEQbTJ(C36250oUv c36250oUv) {
        if (this.QVAiDq || this.QUSxYX) {
            int iEZpvd = C33492mxV.EZpvd();
            if (iEZpvd == -1) {
                if (C33492mxV.OLrzqt()) {
                    OLrzqt(c36250oUv, true);
                    return;
                } else {
                    OLrzqt(c36250oUv, false);
                    return;
                }
            }
            if (iEZpvd == 1) {
                OLrzqt(c36250oUv, false);
                return;
            } else {
                if (iEZpvd != 2) {
                    return;
                }
                OLrzqt(c36250oUv, true);
                return;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                OLrzqt(c36250oUv, true);
                return;
            } else {
                OLrzqt(c36250oUv, false);
                return;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            OLrzqt(c36250oUv, true);
        } else {
            OLrzqt(c36250oUv, false);
        }
    }

    public final void OLrzqt(C36250oUv c36250oUv, boolean z) {
        InterfaceC39502ptZ interfaceC39502ptZ = this.AYXKKw;
        if (interfaceC39502ptZ != null && interfaceC39502ptZ != null) {
            interfaceC39502ptZ.AkhnZx(z);
        }
        c36250oUv.djBIcL(z ? "dark" : "light");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uef.getPremarketTitle$default(o.uef, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OBJEWx() {
        java.lang.String titleByIdAndType$default;
        MarketCoinInfo marketCoinInfo = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null))) {
            MarketCoinInfo marketCoinInfo2 = this.finit;
            gEmmrt(marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null);
            return;
        }
        BizInstrument bizInstrument = this.isConnected;
        if (bizInstrument == null || !bizInstrument.isPreMarketPair()) {
            C48914uef c48914uef = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfo3 = this.finit;
            java.lang.String instrumentId = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo4 = this.finit;
            titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null, false, false, this.values, false, true, 44, null);
        } else {
            BizInstrument bizInstrument2 = this.isConnected;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "FUTURES")) {
                C48914uef c48914uef2 = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfo5 = this.finit;
                titleByIdAndType$default = C48914uef.getPremarketTitle$default(c48914uef2, marketCoinInfo5 != null ? marketCoinInfo5.getInstrumentId() : null, false, 2, null);
                if (titleByIdAndType$default == null) {
                    titleByIdAndType$default = "";
                }
            }
        }
        AYXKKw(titleByIdAndType$default);
    }

    public static /* synthetic */ void changeTime$default(oYA oya, C36250oUv c36250oUv, TimeIntervalItem timeIntervalItem, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeTime");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        oya.KWHzl(c36250oUv, timeIntervalItem, z);
    }

    public final void KWHzl(@NotNull C36250oUv c36250oUv, @NotNull TimeIntervalItem timeIntervalItem, boolean z) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ2;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        if (sPTimeInterval != timeIntervalItem.timeInterval || z) {
            QUSxYX().copydefault(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
            c36250oUv.RcXXUw();
            templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
            if (pEI.EZpvd.AEQbTJ() && !this.QVAiDq && !this.QUSxYX) {
                if (this.gGvvIC instanceof C36327oXr) {
                    int i = timeIntervalItem.timeInterval;
                    int i2 = i == -1 ? 3 : 1;
                    java.lang.String strOLrzqt = pFS.KWHzl.OLrzqt(i);
                    InterfaceC36254oUz interfaceC36254oUz = this.gGvvIC;
                    C36327oXr c36327oXr = interfaceC36254oUz instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz : null;
                    if (c36327oXr != null) {
                        c36327oXr.loadUrl(pFX.AEQbTJ.KWHzl("onHistoryDataUpdate", false, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                    }
                    InterfaceC36254oUz interfaceC36254oUz2 = this.gGvvIC;
                    C36327oXr c36327oXr2 = interfaceC36254oUz2 instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz2 : null;
                    if (c36327oXr2 != null) {
                        c36327oXr2.loadUrl(pFX.AEQbTJ.copydefault("onNeedResetBarCache", new java.lang.String[0]));
                    }
                    InterfaceC36254oUz interfaceC36254oUz3 = this.gGvvIC;
                    C36327oXr c36327oXr3 = interfaceC36254oUz3 instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz3 : null;
                    if (c36327oXr3 != null) {
                        c36327oXr3.loadUrl("javascript:window.tvWidget.activeChart().setChartType(" + i2 + ");window.tvWidget.activeChart().setResolution('" + strOLrzqt + "', null)");
                        return;
                    }
                    return;
                }
                return;
            }
            long jAxsJAYsNCnLh = C36246oUr.copydefault().AxsJAYsNCnLh();
            RdAHlO();
            RlQdEF();
            QSBOWP();
            c36250oUv.setCurrentDataSource(AEQbTJ(templateSettingWlaJM));
            if (templateSettingWlaJM.getSPTimeInterval() < 0) {
                c36250oUv.setChartStyle(1);
            } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
                c36250oUv.setChartStyle(2);
            } else {
                c36250oUv.setChartStyle(0);
            }
            C36250oUv c36250oUv2 = this.djSkpj;
            if (c36250oUv2 != null && (mapEjfBZ2 = c36250oUv2.ejfBZ()) != null) {
                C36250oUv c36250oUv3 = this.djSkpj;
                com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ2.get(c36250oUv3 != null ? c36250oUv3.fIwbmz() : null);
                if (dataSource != null) {
                    dataSource.KWHzl();
                }
            }
            C36250oUv c36250oUv4 = this.dNCPSb;
            if (c36250oUv4 != null && (mapEjfBZ = c36250oUv4.ejfBZ()) != null) {
                C36250oUv c36250oUv5 = this.dNCPSb;
                com.okinc.kline.library.data.DataSource dataSource2 = mapEjfBZ.get(c36250oUv5 != null ? c36250oUv5.fIwbmz() : null);
                if (dataSource2 != null) {
                    dataSource2.KWHzl();
                }
            }
            if (!z && (this instanceof ViewOnClickListenerC38659pdc)) {
                KlineTimeAnchorViewModel value = AwvSrB().getValue();
                java.lang.String mode = c36250oUv.AkhnZx().getMode();
                int sPTimeInterval2 = templateSettingWlaJM.getSPTimeInterval();
                java.lang.String str = this.QbewEr;
                if (value.KWHzl(mode, jAxsJAYsNCnLh, sPTimeInterval2, sPTimeInterval, str == null ? "" : str)) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKlineFragment$changeTime$1(this, jAxsJAYsNCnLh, timeIntervalItem, null), 3, null);
                    return;
                }
            }
            AEQbTJ(timeIntervalItem);
        }
    }

    public final void AEQbTJ(TimeIntervalItem timeIntervalItem) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        if (this.getNewProxyInstance) {
            KlineFormulaData klineFormulaData = this.fARcdN;
            if (klineFormulaData == null || (stateListAnimator = this.dxcTrN) == null) {
                return;
            }
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadFormulaKline$default(stateListAnimator, this, klineFormulaData, timeIntervalItem.timeInterval, false, null, 16, null);
            return;
        }
        if (this.hDKMBd) {
            AuCTel();
            return;
        }
        InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.dxcTrN;
        if (stateListAnimator2 != null) {
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimator2, this, timeIntervalItem.timeInterval, false, false, null, 24, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.kline.library.data.ChartViewOutSideConfig.copy$default(com.okinc.kline.library.data.ChartViewOutSideConfig, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.util.ArrayList, java.util.ArrayList, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, boolean, boolean, boolean, float, float, float, float, int, int, android.graphics.RectF, boolean, android.graphics.RectF, boolean, java.util.List, java.util.List, java.util.List, java.util.List, com.okinc.kline.data.KlineQuickOrderPriceBean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, int, com.okinc.kline.data.BotPendingLineVo, o.ptd, com.okinc.kline.data.BotPendingLineVo, o.oLZ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean, o.oUO, o.oUI, boolean, int, boolean, boolean, boolean, boolean, double, int, int, int, int, java.lang.String, int, boolean, java.lang.String, java.lang.String, boolean, java.util.HashMap, java.util.HashMap, java.util.HashMap, java.util.LinkedHashMap, java.util.HashMap, java.util.HashMap, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, com.okinc.kline.data.KlineSpotAverageBean, boolean, boolean, o.oUL, boolean, boolean, boolean, boolean, int, int, int, int, java.lang.Object):com.okinc.kline.library.data.ChartViewOutSideConfig */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(boolean z) {
        java.lang.String instrumentId;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        android.widget.TextView textView;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        pFS pfs = pFS.KWHzl;
        if (pfs.KWHzl(getParentFragment())) {
            return;
        }
        C36250oUv c36250oUv = this.DTwDnp;
        int i = 0;
        if (c36250oUv == null || (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) == null) {
            instrumentId = null;
        } else {
            if (z) {
                QOLQEE().OLrzqt(ChartViewOutSideConfig.copy$default(chartViewOutSideConfigAkhnZx2, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null));
                chartViewOutSideConfigAkhnZx2.setMShowCostLine(false);
                chartViewOutSideConfigAkhnZx2.setShowSpotAveragePrice(false);
                chartViewOutSideConfigAkhnZx2.setMShowCountdown(false);
                chartViewOutSideConfigAkhnZx2.setMChartHistoryOrder(false);
                chartViewOutSideConfigAkhnZx2.setMShowCurrentOrder(false);
                chartViewOutSideConfigAkhnZx2.setMShowOpenOrderExtendedLine(false);
                chartViewOutSideConfigAkhnZx2.setMShowPriceWarning(false);
                chartViewOutSideConfigAkhnZx2.setMOrdinateType(0);
                chartViewOutSideConfigAkhnZx2.setMKlineAbstractType(1);
                chartViewOutSideConfigAkhnZx2.setCeFiMCapMode(true);
            } else {
                ChartViewOutSideConfig chartViewOutSideConfigValueOf = QOLQEE().valueOf();
                if (chartViewOutSideConfigValueOf != null) {
                    chartViewOutSideConfigAkhnZx2.setMShowCostLine(chartViewOutSideConfigValueOf.getMShowCostLine());
                    chartViewOutSideConfigAkhnZx2.setShowSpotAveragePrice(chartViewOutSideConfigValueOf.isShowSpotAveragePrice());
                    chartViewOutSideConfigAkhnZx2.setMShowCountdown(chartViewOutSideConfigValueOf.getMShowCountdown());
                    chartViewOutSideConfigAkhnZx2.setMChartHistoryOrder(chartViewOutSideConfigValueOf.getMChartHistoryOrder());
                    chartViewOutSideConfigAkhnZx2.setMShowCurrentOrder(chartViewOutSideConfigValueOf.getMShowCurrentOrder());
                    chartViewOutSideConfigAkhnZx2.setMShowOpenOrderExtendedLine(chartViewOutSideConfigValueOf.getMShowOpenOrderExtendedLine());
                    chartViewOutSideConfigAkhnZx2.setMShowPriceWarning(chartViewOutSideConfigValueOf.getMShowPriceWarning());
                    chartViewOutSideConfigAkhnZx2.setMOrdinateType(chartViewOutSideConfigValueOf.getMOrdinateType());
                    chartViewOutSideConfigAkhnZx2.setMKlineAbstractType(chartViewOutSideConfigValueOf.getMKlineAbstractType());
                    chartViewOutSideConfigAkhnZx2.setCeFiMCapMode(false);
                    instrumentId = null;
                    QOLQEE().OLrzqt((ChartViewOutSideConfig) null);
                }
            }
            instrumentId = null;
        }
        EZpvd(z);
        C39756pyO c39756pyO = this.ORxRYg;
        if (c39756pyO != null) {
            c39756pyO.setVisibility(z ^ true ? 0 : 8);
        }
        C39828pzh c39828pzh = this.DarRvM;
        if (c39828pzh != null) {
            c39828pzh.copydefault(z);
        }
        C39816pzV c39816pzV = this.aKErDB;
        if (c39816pzV != null) {
            c39816pzV.OLrzqt(z);
        }
        C36250oUv c36250oUv2 = this.DTwDnp;
        if (c36250oUv2 != null) {
            c36250oUv2.QfsBiF();
        }
        C36250oUv c36250oUv3 = this.DTwDnp;
        if (c36250oUv3 != null) {
            c36250oUv3.invalidate();
        }
        isConnected(z);
        C36250oUv c36250oUv4 = this.djSkpj;
        if (c36250oUv4 == null || (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx.isFullScreenMode() || (textView = this.OBJEWx) == null) {
            return;
        }
        if (z) {
            i = 8;
        } else {
            MarketCoinInfo marketCoinInfo = this.finit;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : instrumentId), (java.lang.Object) oLT.fetchVPNInfo())) {
                MarketCoinInfo marketCoinInfo2 = this.finit;
                if (marketCoinInfo2 != null) {
                    instrumentId = marketCoinInfo2.getInstrumentId();
                }
                if (!pfs.AEQbTJ(instrumentId)) {
                }
            }
        }
        textView.setVisibility(i);
    }

    public final void EZpvd(boolean z) {
        C39816pzV c39816pzV;
        C39816pzV c39816pzV2;
        C39828pzh c39828pzh = this.DarRvM;
        if (((c39828pzh != null && c39828pzh.KWHzl()) || ((c39816pzV = this.aKErDB) != null && c39816pzV.KWHzl())) && z) {
            C36250oUv c36250oUv = this.DTwDnp;
            if (c36250oUv != null) {
                c36250oUv.gHZMYf();
            }
            C36250oUv c36250oUv2 = this.DTwDnp;
            if (c36250oUv2 != null) {
                c36250oUv2.sSMYrx();
                return;
            }
            return;
        }
        C39828pzh c39828pzh2 = this.DarRvM;
        if (((c39828pzh2 == null || c39828pzh2.KWHzl()) && ((c39816pzV2 = this.aKErDB) == null || c39816pzV2.KWHzl())) || z) {
            MutableLiveData<java.lang.Integer> mutableLiveDataCopydefault = QOLQEE().copydefault();
            C36250oUv c36250oUv3 = this.DTwDnp;
            mutableLiveDataCopydefault.setValue(c36250oUv3 != null ? java.lang.Integer.valueOf(c36250oUv3.copydefault(z)) : null);
        }
    }

    private final void isConnected(boolean z) {
        final android.widget.TextView textView = this.iRxXKY;
        if (textView != null) {
            final int i = z ? C35964oKf.Dialog.KWHzl : C35964oKf.Dialog.EZpvd;
            java.lang.String string = textView.getText().toString();
            textView.setText(C33061mpO.setupSpanStyles$default(string, new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.oYQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.EZpvd(textView, i, (java.util.List) obj);
                }
            }, 14, null));
            textView.setSelected(z);
        }
    }

    public static final Unit EZpvd(android.widget.TextView textView, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(textView.getContext(), i));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (ODWQjV()) {
            C36250oUv c36250oUv = this.djSkpj;
            if (c36250oUv != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMDrawLineEnable(z);
            }
        } else {
            C36250oUv c36250oUv2 = this.dNCPSb;
            if (c36250oUv2 != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMDrawLineEnable(z);
            }
        }
        C36312oXc c36312oXc = this.flVtFt;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(z);
        }
    }

    public final void QSBOWP() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        oWO owo;
        oWO owo2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5;
        oWO owo3;
        if (Intrinsics.EZpvd(fZBcTu().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            C36312oXc c36312oXc = this.flVtFt;
            if (c36312oXc != null) {
                if (!(this instanceof ViewOnClickListenerC38659pdc) && !(this instanceof KLineFormulaFragment)) {
                    C36250oUv c36250oUvFIwbmz = fIwbmz();
                    if (c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx5 = c36250oUvFIwbmz.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx5.getMDrawLineEnable()) {
                        C36312oXc c36312oXc2 = this.flVtFt;
                        if (c36312oXc2 != null && (owo2 = c36312oXc2.zLjUOn) != null && c36312oXc2 != null) {
                            c36312oXc2.EZpvd(owo2);
                        }
                    } else {
                        C36312oXc c36312oXc3 = this.flVtFt;
                        if (c36312oXc3 != null && (owo3 = c36312oXc3.getFieldNames) != null && c36312oXc3 != null) {
                            c36312oXc3.EZpvd(owo3);
                        }
                    }
                } else if (c36312oXc != null && (owo = c36312oXc.wlaJM) != null && c36312oXc != null) {
                    c36312oXc.EZpvd(owo);
                }
            }
            if (ODWQjV()) {
                C36250oUv c36250oUv = this.djSkpj;
                if (c36250oUv != null && (chartViewOutSideConfigAkhnZx4 = c36250oUv.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx4.setCurrentMode("NORMAL");
                }
                C36250oUv c36250oUv2 = this.djSkpj;
                if (c36250oUv2 == null || (chartViewOutSideConfigAkhnZx3 = c36250oUv2.AkhnZx()) == null) {
                    return;
                }
                chartViewOutSideConfigAkhnZx3.setAutoYScaleClick(false);
                return;
            }
            C36250oUv c36250oUv3 = this.dNCPSb;
            if (c36250oUv3 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setCurrentMode("NORMAL");
            }
            C36250oUv c36250oUv4 = this.dNCPSb;
            if (c36250oUv4 == null || (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setAutoYScaleClick(false);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gkJEwt.post(new java.lang.Runnable() { // from class: o.oZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oYA.EZpvd(this.copydefault, str);
            }
        });
    }

    public static final void EZpvd(oYA oya, java.lang.String str) {
        if (oya.gGvvIC instanceof C36327oXr) {
            oya.AkhnZx();
            InterfaceC36254oUz interfaceC36254oUz = oya.gGvvIC;
            C36327oXr c36327oXr = interfaceC36254oUz instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz : null;
            if (c36327oXr != null) {
                c36327oXr.loadUrl(str);
            }
            oya.getFieldNames = true;
            oya.AuCTelauCTel = false;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) oya, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x00e2 */
    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.kline.data.KlineOpenOrderBean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        java.util.List<KlineOpenOrderBean> listHDKMBd;
        java.lang.Object next;
        java.util.List<KlineOpenOrderBean> listHDKMBd2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<KlineOpenOrderBean> arrayList = (java.util.ArrayList) list;
        this.hUfVAv = arrayList;
        if (this.ODWQjV) {
            return;
        }
        C36250oUv c36250oUv = ODWQjV() ? this.djSkpj : this.dNCPSb;
        if (arrayList.isEmpty()) {
            if (c36250oUv != null) {
                c36250oUv.setOpenOrderDataList(list);
            }
        } else if (c36250oUv == null || (listHDKMBd2 = c36250oUv.hDKMBd()) == null || !listHDKMBd2.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ?? r3 = (KlineOpenOrderBean) it.next();
                if (c36250oUv != null && (listHDKMBd = c36250oUv.hDKMBd()) != null) {
                    java.util.Iterator it2 = listHDKMBd.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) next;
                        if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdId(), (java.lang.Object) r3.getOrdId()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) r3.getOrdType()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getAmount(), (java.lang.Object) r3.getAmount()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getPrice(), (java.lang.Object) r3.getPrice())) {
                            break;
                        }
                    }
                    KlineOpenOrderBean klineOpenOrderBean2 = (KlineOpenOrderBean) next;
                    if (klineOpenOrderBean2 != null) {
                        r3.setLongClick(klineOpenOrderBean2.getLongClick());
                        r3.setSelected(klineOpenOrderBean2.getSelected());
                        r3.setShowSolid(klineOpenOrderBean2.getShowSolid());
                        r3.setLineColor(klineOpenOrderBean2.getLineColor());
                        r3.setCostPrice(klineOpenOrderBean2.getCostPrice());
                        r3.setCostLiq(klineOpenOrderBean2.getCostLiq());
                        r3.setCostBE(klineOpenOrderBean2.getCostBE());
                        r3 = Unit.INSTANCE;
                    }
                }
                arrayList2.add(r3);
            }
            if (c36250oUv != null) {
                c36250oUv.setOpenOrderDataList(list);
            }
        } else if (c36250oUv != null) {
            c36250oUv.setOpenOrderDataList(list);
        }
        if (this.DAIeex.isNeedRelevanceCost()) {
            if (this.DAIeex.isCost()) {
                C37932pGa.AEQbTJ.AEQbTJ(this.ffGIBT.AEQbTJ(this.DAIeex.getOrdId()));
            } else {
                C37932pGa.AEQbTJ.EZpvd(this.ffGIBT.copydefault(this.DAIeex.getOrdId()));
            }
        }
        C36250oUv c36250oUv2 = this.djSkpj;
        if (c36250oUv2 != null) {
            c36250oUv2.invalidate();
        }
        C36250oUv c36250oUv3 = this.dNCPSb;
        if (c36250oUv3 != null) {
            c36250oUv3.invalidate();
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        if (this.ODWQjV) {
            return;
        }
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setKlineSpotAverageBean(klineSpotAverageBean);
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 == null || (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setKlineSpotAverageBean(klineSpotAverageBean);
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.RlQdEF = (java.util.ArrayList) list;
        if (this.ODWQjV) {
            return;
        }
        this.iZzfmt = list;
        QOLQEE().OLrzqt(list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.ODWQjV) {
            return;
        }
        this.zuWLRA = list;
        QOLQEE().copydefault(list);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b5 */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.kline.data.OkxTradePositionBean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList) {
        java.util.List<? extends InterfaceC39510pth> listAubY;
        java.lang.Object next;
        java.util.List<? extends InterfaceC39510pth> listAubY2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (this.ODWQjV) {
            return;
        }
        MarketCoinInfo marketCoinInfo = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "SPOT")) {
            return;
        }
        if (arrayList.isEmpty()) {
            C36250oUv c36250oUv = this.DTwDnp;
            if (c36250oUv != null) {
                c36250oUv.setTradePositionDataList(arrayList);
            }
        } else {
            C36250oUv c36250oUv2 = this.DTwDnp;
            if (c36250oUv2 == null || (listAubY2 = c36250oUv2.AubY()) == null || !listAubY2.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ?? r3 = (OkxTradePositionBean) it.next();
                    C36250oUv c36250oUv3 = this.DTwDnp;
                    if (c36250oUv3 != null && (listAubY = c36250oUv3.AubY()) != null) {
                        java.util.Iterator it2 = listAubY.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC39510pth) next).getPosId(), (java.lang.Object) r3.getPosId())) {
                                    break;
                                }
                            }
                        }
                        InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) next;
                        if (interfaceC39510pth != null) {
                            r3.setLongClick(interfaceC39510pth.getLongClick());
                            r3.setSelected(interfaceC39510pth.getSelected());
                            r3.setShowSolid(interfaceC39510pth.getShowSolid());
                            r3.setDragTP(interfaceC39510pth.isDragTP());
                            r3.setDragSL(interfaceC39510pth.isDragSL());
                            r3 = Unit.INSTANCE;
                        }
                    }
                    arrayList2.add(r3);
                }
                C36250oUv c36250oUv4 = this.DTwDnp;
                if (c36250oUv4 != null) {
                    c36250oUv4.setTradePositionDataList(arrayList);
                }
            } else {
                C36250oUv c36250oUv5 = this.DTwDnp;
                if (c36250oUv5 != null) {
                    c36250oUv5.setTradePositionDataList(arrayList);
                }
            }
        }
        C36250oUv c36250oUv6 = this.DTwDnp;
        if (c36250oUv6 != null) {
            c36250oUv6.invalidate();
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.copydefault(arrayList);
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.copydefault(arrayList);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            KWHzl(list);
            final DrawLineBean drawLineBeanAEQbTJ = oUJ.KWHzl.AEQbTJ();
            if (drawLineBeanAEQbTJ != null) {
                DrawLineData.copydefault.OLrzqt(new Function1() { // from class: o.oYx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oYA.copydefault(drawLineBeanAEQbTJ, (java.util.ArrayList) obj);
                    }
                });
            }
        }
        TemplateSetting templateSetting = this.DXXBbs;
        if (templateSetting != null) {
            C39263pox c39263poxAxsJAY = AxsJAY();
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSetting.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames, this.QfsBiF, this.QbewEr, templateSetting.getSPTimeInterval());
        }
        AEQbTJ(list);
        QUSxYX().EZpvd(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
        android.view.View view = getView();
        if (view != null) {
            view.post(this.AuCTel);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(DrawLineData.DrawLineItem drawLineItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt(drawLineItem.getLineType().getStrName()), true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<? extends oLY> list) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (C36246oUr.copydefault().DcqEDu() || C36246oUr.copydefault().DNMMPQ()) {
            C36250oUv c36250oUv = this.DTwDnp;
            java.util.ArrayList<KLineEventBean> klineEventList = (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx.getKlineEventList();
            if ((klineEventList == null || klineEventList.isEmpty()) && (!list.isEmpty())) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKlineFragment$getKlineEventList$1(this, list, null), 3, null);
            }
        }
    }

    public final void KWHzl(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        TemplateSetting templateSetting = this.DXXBbs;
        if (templateSetting != null) {
            int sPTimeInterval = templateSetting.getSPTimeInterval();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(((oLY) CollectionsKt___CollectionsKt.AubY(list)).EZpvd));
            java.lang.String strAddS$default = C33129mqd.addS$default(strGEmmrt, java.lang.Long.valueOf(pEW.EZpvd.AEQbTJ(sPTimeInterval)), null, null, null, 14, null);
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
            if (stateListAnimator != null) {
                pEF pef = pEF.OLrzqt;
                stateListAnimator.KWHzl(this, pef.copydefault(sPTimeInterval), pef.KWHzl(), strGEmmrt, strAddS$default);
            }
        }
    }

    public static final void getNewProxyInstance(oYA oya) {
        android.os.Looper.myQueue().removeIdleHandler(oya.fIwbmz);
        android.os.Looper.myQueue().addIdleHandler(oya.fIwbmz);
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
        if (ODWQjV()) {
            C36250oUv c36250oUv = this.djSkpj;
            if (c36250oUv != null) {
                c36250oUv.setShowEmptyUi(true);
                return;
            }
            return;
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.setShowEmptyUi(true);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str) {
        DrawLineData drawLineData;
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.QfsBiF != null) {
            pUU.KWHzl(getTAG(), "uploadDrawingDataCallBack: timeVersion = " + str);
            C37895pEr c37895pEr = C37895pEr.copydefault;
            C36250oUv c36250oUv = this.DTwDnp;
            if (c36250oUv == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || (arrayList = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2 = arrayList;
            java.lang.String str2 = this.QfsBiF;
            c37895pEr.AEQbTJ(arrayList2, str, str2 == null ? "" : str2, this.DCJXGO, this.OqFWZa);
        }
        if (z && C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo) && !z2) {
            AhwBna();
        }
        if (!z && (drawLineItemIsConnected = (drawLineData = DrawLineData.copydefault).isConnected()) != null) {
            drawLineData.EZpvd().remove(drawLineItemIsConnected);
            drawLineData.EZpvd().add(drawLineItemIsConnected);
            drawLineData.EZpvd(drawLineData.EZpvd());
        }
        if (z && z3) {
            DrawLineData.DrawLineItem drawLineItemIsConnected2 = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected2 != null) {
                uploadDrawingData$default(this, yDY.copydefault(drawLineItemIsConnected2), false, false, 6, null);
            }
            C36250oUv c36250oUv2 = this.dNCPSb;
            if (c36250oUv2 != null) {
                c36250oUv2.invalidate();
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.ArrayList<PriceWarningItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.setPriceWarningDataList(arrayList);
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.setPriceWarningDataList(arrayList);
        }
        QSBOWP();
        C36250oUv c36250oUv3 = this.djSkpj;
        if (c36250oUv3 != null) {
            c36250oUv3.invalidate();
        }
        C36250oUv c36250oUv4 = this.dNCPSb;
        if (c36250oUv4 != null) {
            c36250oUv4.invalidate();
        }
    }

    public void KWHzl(boolean z) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (c36250oUvFIwbmz == null || (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setOpenCoolTime(z);
    }

    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList) {
        TemplateSetting templateSetting;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        java.util.ArrayList<java.lang.String> sideIndicatorNames2;
        C39756pyO c39756pyO;
        TemplateSetting templateSetting2;
        java.util.ArrayList<java.lang.String> sideIndicatorNames3;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                Triple triple = (Triple) it.next();
                AbstractC36262oVg first = (AbstractC36262oVg) triple.getFirst();
                KlineIndicatorBean klineIndicatorBean = (KlineIndicatorBean) triple.getThird();
                if (((java.lang.Boolean) triple.getSecond()).booleanValue()) {
                    C36250oUv c36250oUv = this.djSkpj;
                    if (c36250oUv != null) {
                        c36250oUv.AEQbTJ(first);
                    }
                    C36250oUv c36250oUv2 = this.dNCPSb;
                    if (c36250oUv2 != null) {
                        c36250oUv2.AEQbTJ(first);
                    }
                    pEV pev = pEV.OLrzqt;
                    java.lang.String strEjfBZ = first.ejfBZ();
                    Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
                    pev.OLrzqt(strEjfBZ, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0"));
                    C39756pyO c39756pyO2 = this.ORxRYg;
                    if (c39756pyO2 != null) {
                        c39756pyO2.setMainIndicatorSelect();
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "VOLUME")) {
                        if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) ("VOLUME" + C37957pGz.copydefault.OLrzqt()))) {
                        }
                    }
                    AbstractC36262oVg first2 = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                    C36250oUv c36250oUv3 = this.djSkpj;
                    if (c36250oUv3 != null) {
                        c36250oUv3.copydefault(first2);
                    }
                    C36250oUv c36250oUv4 = this.dNCPSb;
                    if (c36250oUv4 != null) {
                        c36250oUv4.copydefault(first2);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "1")) {
                        C36250oUv c36250oUv5 = this.djSkpj;
                        if (c36250oUv5 != null) {
                            c36250oUv5.dNCPSb();
                        }
                        C36250oUv c36250oUv6 = this.dNCPSb;
                        if (c36250oUv6 != null) {
                            c36250oUv6.dNCPSb();
                        }
                    }
                } else {
                    if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "VOLUME")) {
                        first = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                    }
                    C36250oUv c36250oUv7 = this.djSkpj;
                    if (c36250oUv7 != null) {
                        c36250oUv7.OLrzqt(first);
                    }
                    C36250oUv c36250oUv8 = this.dNCPSb;
                    if (c36250oUv8 != null) {
                        c36250oUv8.OLrzqt(first);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0") && ((templateSetting2 = this.DXXBbs) == null || (sideIndicatorNames3 = templateSetting2.getSideIndicatorNames()) == null || !sideIndicatorNames3.contains(first.ejfBZ()))) {
                        java.lang.String strEjfBZ2 = first.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
                        EZpvd(true, strEjfBZ2);
                    } else if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "1") && (templateSetting = this.DXXBbs) != null && (sideIndicatorNames = templateSetting.getSideIndicatorNames()) != null && sideIndicatorNames.contains(first.ejfBZ())) {
                        java.lang.String strEjfBZ3 = first.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ3, "");
                        EZpvd(false, strEjfBZ3);
                    }
                    pEV pev2 = pEV.OLrzqt;
                    java.lang.String strEjfBZ4 = first.ejfBZ();
                    Intrinsics.checkNotNullExpressionValue(strEjfBZ4, "");
                    pev2.KWHzl(strEjfBZ4, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0"));
                    TemplateSetting templateSetting3 = this.DXXBbs;
                    if (templateSetting3 != null && (sideIndicatorNames2 = templateSetting3.getSideIndicatorNames()) != null && (c39756pyO = this.ORxRYg) != null) {
                        c39756pyO.setSideIndicators(sideIndicatorNames2);
                    }
                }
            }
        }
    }

    public void values() {
        try {
            C36344oYh c36344oYh = this.DCUTEI;
            if (c36344oYh != null) {
                if (c36344oYh != null) {
                    c36344oYh.OLrzqt();
                }
                this.DCUTEI = null;
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            getTAG();
        }
    }

    public void getPostValueLengthLimit() {
        try {
            C36344oYh c36344oYh = this.DCUTEI;
            if (c36344oYh != null) {
                if (c36344oYh != null) {
                    c36344oYh.OLrzqt();
                }
                this.DCUTEI = null;
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void AYXKKw() {
        TradingViewManager tradingViewManagerOLrzqt = TradingViewManager.Companion.OLrzqt();
        if (tradingViewManagerOLrzqt != null) {
            tradingViewManagerOLrzqt.removeTradingView();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uph.StateListAnimator.routeMoreActivity$default(o.uph, android.content.Context, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TradeHistoryOrderData, int, java.lang.Object):void */
    public final void EZpvd(int i) {
        C36250oUv c36250oUv;
        java.lang.String strIwGUEr;
        C36250oUv c36250oUv2;
        java.lang.String strFJNWhG;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        TradeHistoryOrderData tradeHistoryOrderData = new TradeHistoryOrderData();
        tradeHistoryOrderData.setInstType(java.lang.String.valueOf(this.QbewEr));
        tradeHistoryOrderData.setInstId(java.lang.String.valueOf(this.QfsBiF));
        java.lang.String str = "0";
        if (!ODWQjV() ? (c36250oUv = this.dNCPSb) == null || (strIwGUEr = c36250oUv.iwGUEr()) == null : (c36250oUv4 = this.djSkpj) == null || (strIwGUEr = c36250oUv4.iwGUEr()) == null) {
            strIwGUEr = "0";
        }
        tradeHistoryOrderData.setStartTime(strIwGUEr);
        if (!ODWQjV() ? !((c36250oUv2 = this.dNCPSb) == null || (strFJNWhG = c36250oUv2.fJNWhG()) == null) : !((c36250oUv3 = this.djSkpj) == null || (strFJNWhG = c36250oUv3.fJNWhG()) == null)) {
            str = strFJNWhG;
        }
        tradeHistoryOrderData.setEndTime(str);
        tradeHistoryOrderData.setSubTabPosition(0);
        tradeHistoryOrderData.setHideCanceled(true);
        tradeHistoryOrderData.setSortType("filledTime");
        android.content.Context context = getContext();
        if (context != null) {
            InterfaceC49499uph.StateListAnimator.routeMoreActivity$default((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class), context, "history_type", null, null, null, null, this.QbewEr, this.QfsBiF, tradeHistoryOrderData, 60, null);
        }
        oWO owo = C36312oXc.AEQbTJ(this.djSkpj).AubY;
        Intrinsics.copydefault(owo, "");
        C36311oXb c36311oXb = (C36311oXb) owo;
        if (c36311oXb != null) {
            c36311oXb.djBIcL();
        }
        if (i == 1) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_trade_kroder1_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oZi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.djBIcL((EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_trade_kroder2_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oZg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oYA.gEmmrt((EventParamsList) obj);
                }
            });
        }
        TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oYA.AYXKKw((EventParamsList) obj);
            }
        });
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "trade_history_pin", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "trade_history_view_more", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void RdAHlO() {
        C55113xdn c55113xdn = this.giSNqX;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.giSNqX;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.giSNqX;
        if (c55113xdn3 != null) {
            c55113xdn3.KWHzl(0L);
        }
    }

    public final void AkhnZx() {
        C55113xdn c55113xdn = this.giSNqX;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.giSNqX;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AYXKKw();
        android.os.Handler handler = this.gkJEwt;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.QOLQEE;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        SubHelper.AEQbTJ(this);
        values();
        getPostValueLengthLimit();
        AYXKKw();
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.AhwBna();
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.AhwBna();
        }
        android.os.Looper.myQueue().removeIdleHandler(this.fIwbmz);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pUU.copydefault("BaseKline------", "onDestroy");
        boolean z = this.ejfBZ;
        if (z) {
            return;
        }
        pUU.copydefault("BaseKline------", "hasPause = " + z);
        hBpjJd();
    }

    public final void hBpjJd() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
        if (stateListAnimator != null) {
            stateListAnimator.gEmmrt();
        }
        InterfaceC39499ptW interfaceC39499ptW = this.AhwBna;
        if (interfaceC39499ptW != null) {
            interfaceC39499ptW.copydefault(null);
        }
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv != null) {
            c36250oUv.QUSxYX();
        }
        C36250oUv c36250oUv2 = this.dNCPSb;
        if (c36250oUv2 != null) {
            c36250oUv2.QUSxYX();
        }
        C36250oUv c36250oUv3 = this.djSkpj;
        if (c36250oUv3 != null) {
            c36250oUv3.OLrzqt();
        }
    }

    public void dHguZz() {
        BizInstrument bizInstrument = this.isConnected;
        if (bizInstrument == null || !bizInstrument.isPreMarketPair()) {
            return;
        }
        MarketCoinInfo marketCoinInfo = this.finit;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
            C48914uef c48914uef = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfo2 = this.finit;
            java.lang.String premarketTitle$default = C48914uef.getPremarketTitle$default(c48914uef, marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null, false, 2, null);
            if (premarketTitle$default == null) {
                premarketTitle$default = "";
            }
            AYXKKw(premarketTitle$default);
        }
    }

    public final void KWHzl(@NotNull C36250oUv c36250oUv, @NotNull MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (!marketTypeSelect.isSelect()) {
            AEQbTJ(marketTypeSelect.getSelectTypeName(), false, marketTypeSelect.getGroup() == 0);
        }
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (marketTypeSelect.getGroup() == 0) {
            if (marketTypeSelect.isSelect()) {
                if (templateSettingWlaJM.getSPTimeInterval() > -1) {
                    c36250oUv.setMainIndicator(marketTypeSelect.getSelectTypeName());
                }
            } else if (templateSettingWlaJM.getSPTimeInterval() > -1 && Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME")) {
                c36250oUv.dNCPSb();
            } else {
                c36250oUv.OLrzqt(marketTypeSelect.getSelectTypeName());
            }
            if (marketTypeSelect.isSelect()) {
                AEQbTJ(marketTypeSelect.getSelectTypeName(), true, marketTypeSelect.getGroup() == 0);
                return;
            }
            return;
        }
        EZpvd(marketTypeSelect.isSelect(), marketTypeSelect.getSelectTypeName());
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        Intrinsics.checkNotNullParameter(str, "");
        IndicatorDataReq indicatorDataReqCopydefault = copydefault(str, z, z2);
        if (indicatorDataReqCopydefault == null || (stateListAnimator = this.dxcTrN) == null) {
            return;
        }
        stateListAnimator.KWHzl(this, indicatorDataReqCopydefault);
    }

    public final void AhwBna(@NotNull java.util.ArrayList<IndicatorDataReq> arrayList) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!arrayList.isEmpty()) && (stateListAnimator = this.dxcTrN) != null) {
            stateListAnimator.EZpvd(this, arrayList);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IndicatorDataReq copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        java.lang.String str2;
        AbstractC36262oVg abstractC36262oVgAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            switch (str.hashCode()) {
                case -2040464843:
                    str2 = !str.equals("LSAcco") ? str : "ELITE_LSR";
                    break;
                case 2044557:
                    str2 = !str.equals("BOLL") ? str : "BB";
                    break;
                case 63511234:
                    str2 = !str.equals("BSVol") ? str : "TAKER_BS";
                    break;
                case 72740685:
                    str2 = !str.equals("LSPos") ? str : "ELITE_OI_LSR";
                    break;
                case 1185755844:
                    str2 = !str.equals("LSRatio") ? str : "LSR";
                    break;
                case 1768025685:
                    str2 = !str.equals("StochRSI") ? str : "STOCH_RSI";
                    break;
                default:
                    str2 = str;
                    break;
            }
            IndicatorBean indicatorBean = new IndicatorBean(str2, z2, null, java.lang.Boolean.valueOf(z));
            C37957pGz c37957pGz = C37957pGz.copydefault;
            InterfaceC37953pGv interfaceC37953pGvOLrzqt = c37957pGz.OLrzqt(str2);
            if (z2) {
                C36250oUv c36250oUvFIwbmz = fIwbmz();
                abstractC36262oVgAEQbTJ = c36250oUvFIwbmz != null ? c36250oUvFIwbmz.OLrzqt("ds0", str) : null;
                if (abstractC36262oVgAEQbTJ != null) {
                    java.lang.String strOLrzqt = interfaceC37953pGvOLrzqt != null ? interfaceC37953pGvOLrzqt.OLrzqt(abstractC36262oVgAEQbTJ, indicatorBean, z) : null;
                    if (strOLrzqt != null) {
                        if (z2) {
                            str2 = ((java.lang.Object) str2) + c37957pGz.OLrzqt();
                        }
                        return new IndicatorDataReq(str2, strOLrzqt, z ? "0" : "1", null, 8, null);
                    }
                }
            } else {
                C36250oUv c36250oUvFIwbmz2 = fIwbmz();
                if (c36250oUvFIwbmz2 != null) {
                    abstractC36262oVgAEQbTJ = c36250oUvFIwbmz2.AEQbTJ("ds0.indic" + str);
                }
                if (abstractC36262oVgAEQbTJ != null) {
                }
            }
        }
        return null;
    }

    public final void EZpvd(final PriceWarningItemBean priceWarningItemBean) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC39407prj viewOnClickListenerC39407prj = new ViewOnClickListenerC39407prj(context);
            viewOnClickListenerC39407prj.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.OAhWiU));
            viewOnClickListenerC39407prj.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.GGlJim));
            viewOnClickListenerC39407prj.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.aKErDB), new View.OnClickListener() { // from class: o.oYD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    oYA.EZpvd(this.OLrzqt, priceWarningItemBean, viewOnClickListenerC39407prj, view);
                }
            });
            viewOnClickListenerC39407prj.copydefault(C33070mpX.AYXKKw(C35964oKf.Fragment.RcXXUw), null);
            if (this instanceof C38795pgF) {
                viewOnClickListenerC39407prj.AEQbTJ(2);
            }
            viewOnClickListenerC39407prj.setCanceledOnTouchOutside(true);
            viewOnClickListenerC39407prj.show();
        }
    }

    public static final void EZpvd(oYA oya, PriceWarningItemBean priceWarningItemBean, ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, android.view.View view) {
        java.lang.String str = oya.QbewEr;
        if (str != null) {
            priceWarningItemBean.setBizType(pEU.copydefault.copydefault(str));
        }
        pEY.copydefault(oya, priceWarningItemBean, RequestParameters.SUBRESOURCE_DELETE);
        viewOnClickListenerC39407prj.dismiss();
    }

    public final void KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.String> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        C37908pFd.KWHzl(arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:12:0x002c, B:32:0x0071, B:34:0x0076, B:35:0x0081, B:37:0x0091, B:38:0x0095, B:40:0x009b, B:44:0x00ae, B:46:0x00b2, B:48:0x00b8, B:50:0x00be, B:17:0x003b, B:19:0x0041, B:22:0x0049, B:24:0x0059, B:26:0x005f, B:28:0x0063), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:12:0x002c, B:32:0x0071, B:34:0x0076, B:35:0x0081, B:37:0x0091, B:38:0x0095, B:40:0x009b, B:44:0x00ae, B:46:0x00b2, B:48:0x00b8, B:50:0x00be, B:17:0x003b, B:19:0x0041, B:22:0x0049, B:24:0x0059, B:26:0x005f, B:28:0x0063), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        BaseKlineFragment$getKlineStartTime$1 baseKlineFragment$getKlineStartTime$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.List<KlineStartTimeVo> value;
        oYA oya;
        long jValueOf;
        java.lang.Object next;
        if (continuation instanceof BaseKlineFragment$getKlineStartTime$1) {
            baseKlineFragment$getKlineStartTime$1 = (BaseKlineFragment$getKlineStartTime$1) continuation;
            int i = baseKlineFragment$getKlineStartTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseKlineFragment$getKlineStartTime$1.label = i - Integer.MIN_VALUE;
            } else {
                baseKlineFragment$getKlineStartTime$1 = new BaseKlineFragment$getKlineStartTime$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = baseKlineFragment$getKlineStartTime$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseKlineFragment$getKlineStartTime$1.label;
        java.lang.String ts = null;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            Result.Application application2 = Result.Companion;
            java.lang.String str = this.QfsBiF;
            if (str != null && str.length() != 0) {
                value = fZBcTu().AEQbTJ().getValue();
                if (value == null || value.isEmpty()) {
                    InterfaceC39563puh.StateListAnimator stateListAnimator = this.dxcTrN;
                    if (stateListAnimator != null) {
                        java.lang.String str2 = this.QfsBiF;
                        baseKlineFragment$getKlineStartTime$1.L$0 = this;
                        baseKlineFragment$getKlineStartTime$1.label = 1;
                        objAEQbTJ = stateListAnimator.AEQbTJ(str2, baseKlineFragment$getKlineStartTime$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        oya = this;
                    } else {
                        oya = this;
                        value = null;
                        oya.fZBcTu().AEQbTJ().setValue(value);
                    }
                }
                java.lang.String strOLrzqt = pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV());
                if (value != null) {
                    java.util.Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((KlineStartTimeVo) next).getBar(), (java.lang.Object) strOLrzqt)) {
                            break;
                        }
                    }
                    KlineStartTimeVo klineStartTimeVo = (KlineStartTimeVo) next;
                    if (klineStartTimeVo != null) {
                        ts = klineStartTimeVo.getTs();
                    }
                }
                if (ts == null) {
                    jValueOf = C33129mqd.valueOf(ts);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                    return objM7377constructorimpl;
                }
                pUU.AEQbTJ("KLineQuotesFullScreenFragment", "getKlineStartTime failed: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                return C56443yFo.KWHzl(0L);
            }
            jValueOf = 0;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oya = (oYA) baseKlineFragment$getKlineStartTime$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        value = (java.util.ArrayList) objAEQbTJ;
        oya.fZBcTu().AEQbTJ().setValue(value);
        java.lang.String strOLrzqt2 = pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV());
        if (value != null) {
        }
        if (ts == null) {
            jValueOf = 0;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
        }
    }

    public static /* synthetic */ void dealWithFastKlineTime$default(oYA oya, long j, long j2, KlineTimeAnchorType klineTimeAnchorType, KlineTimeToolType klineTimeToolType, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dealWithFastKlineTime");
        }
        oya.AEQbTJ(j, j2, (i & 4) != 0 ? KlineTimeAnchorType.AnchorCenter : klineTimeAnchorType, (i & 8) != 0 ? KlineTimeToolType.KLineJump : klineTimeToolType, (i & 16) != 0 ? true : z);
    }

    public final void AEQbTJ(long j, long j2, @NotNull KlineTimeAnchorType klineTimeAnchorType, @NotNull KlineTimeToolType klineTimeToolType, boolean z) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        Intrinsics.checkNotNullParameter(klineTimeAnchorType, "");
        Intrinsics.checkNotNullParameter(klineTimeToolType, "");
        C36250oUv c36250oUv = this.djSkpj;
        if (c36250oUv == null || (stateListAnimator = this.dxcTrN) == null) {
            return;
        }
        C36348oYl c36348oYlZLjUOn = zLjUOn();
        MarketCoinInfo marketCoinInfo = this.finit;
        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo2 = this.finit;
        c36348oYlZLjUOn.OLrzqt(c36250oUv, this, instrumentId, marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null, j, j2, pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV()), new TaskDescription(stateListAnimator), klineTimeToolType, klineTimeAnchorType, z);
    }

    public static final class TaskDescription implements InterfaceC36351oYo {
        public final /* synthetic */ InterfaceC39563puh.StateListAnimator AEQbTJ;

        public TaskDescription(InterfaceC39563puh.StateListAnimator stateListAnimator) {
            this.AEQbTJ = stateListAnimator;
        }

        @Override // o.InterfaceC36351oYo
        public void AEQbTJ() {
            oYA.this.RdAHlO();
        }

        @Override // o.InterfaceC36351oYo
        public void EZpvd() {
            oYA.this.AkhnZx();
        }

        @Override // o.InterfaceC36351oYo
        public void KWHzl() {
            this.AEQbTJ.AEQbTJ();
        }

        @Override // o.InterfaceC36351oYo
        public void EZpvd(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(this.AEQbTJ, fragment, str, str2, str3, false, function1, 16, null);
        }

        @Override // o.InterfaceC36351oYo
        public void OLrzqt(androidx.fragment.app.Fragment fragment, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(this.AEQbTJ, fragment, i, z, z2, null, 16, null);
        }
    }

    public final void QkdxfA() {
        oWO owo;
        C36312oXc c36312oXc = this.flVtFt;
        if (c36312oXc == null || (owo = c36312oXc.wlaJM) == null || c36312oXc == null) {
            return;
        }
        c36312oXc.EZpvd(owo);
    }

    public final void AhwBna() {
        java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            DrawLineData.copydefault.EZpvd().remove((DrawLineData.DrawLineItem) it.next());
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
    }

    public static final InterfaceC56387yDm uzCIH(final oYA oya) {
        final Function0 function0 = null;
        return FragmentViewModelLazyKt.createViewModelLazy(oya, C56524yIo.AEQbTJ(KlineTimeAnchorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.BaseKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = oya.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.BaseKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = oya.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.BaseKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = oya.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final Unit copydefault(DrawLineBean drawLineBean, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) drawLineItem.getContract(), (java.lang.Object) drawLineBean.getCoinId())) {
                int klineType = drawLineItem.getKlineType();
                java.lang.Integer type = drawLineBean.getType();
                if (type != null && klineType == type.intValue()) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KLine_Mid_DrawingTool_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oZj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oYA.KWHzl(drawLineItem, (EventParamsList) obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}

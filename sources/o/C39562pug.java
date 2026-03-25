package o;

import android.graphics.Color;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.biz.StrategyType;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.CompareCandlesItem;
import com.okinc.kline.data.CompareCandlesReq;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineDrawingDataReq;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.tradingview.TradingViewReq;
import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getCompareCandles$1;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getCompareHistoryCandles$1;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getCoolingInfo$1;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getHistoryFormulaCandles$1$1;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getIndicatorList$2$1;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getKlineActiveList$2;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getKlineContentFlashData$2;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getKlineEvent$2;
import com.okinc.kline.ui.mvp.MarketDetailPresent$getKlineStartTime$2;
import com.okinc.kline.ui.mvp.MarketDetailPresent$loadFormulaKline$1;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorData;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionCoolState;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.AccountDetailData;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.BizTradeOrderReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyOrderReq;
import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.unify_trade.net.BizApiService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import o.C35964oKf;
import o.C38358pVv;
import o.C52761wXj;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import o.pDT;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39562pug implements InterfaceC39563puh.StateListAnimator {
    public int AEQbTJ;
    public java.lang.String AYXKKw;
    public Job AhwBna;
    public int AkhnZx;
    public InterfaceC58217yxC AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public C38358pVv AubY;
    public java.lang.String AwvSrB;
    public java.util.List<? extends TradePositionManager.PositionItem> AxsJAY;
    public Job DbNXlk;
    public AbstractC54531xLw EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public int copydefault;
    public boolean djBIcL;
    public InterfaceC58217yxC ejfBZ;
    public InterfaceC58217yxC fARcdN;
    public Job fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public java.lang.String fetchVPNInfo;
    public boolean gEmmrt;
    public java.lang.String getFieldNames;
    public InterfaceC58217yxC getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public InterfaceC58217yxC isConnected;
    public InterfaceC58217yxC iwGUEr;
    public MarketCoinInfo uzCIH;
    public java.lang.String valueOf;
    public Job values;
    public InterfaceC39563puh.Application wlaJM;
    public InterfaceC58217yxC zLjUOn;
    public InterfaceC58217yxC zsXlph;
    public C37928pFx zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ(AbstractC54531xLw abstractC54531xLw) {
        this.EZpvd = abstractC54531xLw;
    }

    @Override // o.InterfaceC46879tfW
    public void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault() {
        this.wlaJM = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.pug$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((KlineOpenOrderBean) t).getPrice(), ((KlineOpenOrderBean) t2).getPrice());
        }
    }

    /* JADX INFO: renamed from: o.pug$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((TradeAllOrderApi) t).getUTimeValue())), java.lang.Long.valueOf(C33129mqd.valueOf(((TradeAllOrderApi) t2).getUTimeValue())));
        }
    }

    /* JADX INFO: renamed from: o.pug$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((TradeAllOrderApi) t).getUTimeValue())), java.lang.Long.valueOf(C33129mqd.valueOf(((TradeAllOrderApi) t2).getUTimeValue())));
        }
    }

    /* JADX INFO: renamed from: o.pug$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((KlineOpenOrderBean) t2).getPrice(), ((KlineOpenOrderBean) t).getPrice());
        }
    }

    /* JADX INFO: renamed from: o.pug$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((HistoryOrderData) t2).getTime(), ((HistoryOrderData) t).getTime());
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 o.puh$Application)
  (r3v0 com.okinc.kline.api.bean.MarketCoinInfo)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(o.puh$Application, com.okinc.kline.api.bean.MarketCoinInfo, boolean, boolean):void (m)] (LINE:250) call: o.pug.<init>(o.puh$Application, com.okinc.kline.api.bean.MarketCoinInfo, boolean, boolean):void type: THIS */
    public /* synthetic */ C39562pug(InterfaceC39563puh.Application application, MarketCoinInfo marketCoinInfo, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, marketCoinInfo, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public C39562pug(InterfaceC39563puh.Application application, MarketCoinInfo marketCoinInfo, boolean z, boolean z2) {
        this.OLrzqt = "MarketDetailPresent";
        this.AkhnZx = 5;
        this.getFieldNames = "";
        this.fetchVPNInfo = "";
        this.valueOf = "";
        this.AYXKKw = "";
        this.AwvSrB = "limit,market,post_only,fok,ioc,optimal_limit_ioc";
        this.AubY = new C38358pVv();
        this.AEQbTJ = 20;
        this.KWHzl = MultiTransferSignData.DEFAULT_INTERVAL;
        this.zuBGHE = new C37928pFx();
        this.AxsJAY = yDY.AhwBna();
        this.uzCIH = marketCoinInfo;
        this.wlaJM = application;
        this.gEmmrt = z;
        this.djBIcL = z2;
        djBIcL();
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, int i, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getFieldNames = str;
        C36246oUr.copydefault().AuCTel(str);
        AhwBna();
        InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(this, lifecycleOwner, i, false, false, function1, 8, null);
        AEQbTJ(lifecycleOwner);
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            if (Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_KLINE")) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadTradePosition$default(this, lifecycleOwner, false, 2, null);
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadOpenOrder$default(this, lifecycleOwner, false, 2, null);
                return;
            }
            InterfaceC58217yxC interfaceC58217yxC = this.zsXlph;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            InterfaceC58217yxC interfaceC58217yxC2 = this.hDKMBd;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        this.uzCIH = marketCoinInfo;
        djBIcL();
        if (this.djBIcL) {
            return;
        }
        AkhnZx();
    }

    public final void djBIcL() {
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            this.fetchVPNInfo = marketCoinInfo.getInstrumentId();
            this.getFieldNames = Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "INDEX") ? "TYPE_INDEX_KLINE" : "TYPE_KLINE";
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public boolean KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            return interfaceC58217yxC.isDisposed();
        }
        return false;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            MarketCoinInfo marketCoinInfo2 = this.uzCIH;
            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null), (java.lang.Object) "OPTION") && !Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                AbstractC58185ywX<C38358pVv.ActionBar> abstractC58185ywXKWHzl = this.AubY.KWHzl(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), this.getFieldNames);
                final Function1 function1 = new Function1() { // from class: o.puD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.KWHzl(this.OLrzqt, (C38358pVv.ActionBar) obj);
                    }
                };
                this.AuCTelauCTel = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.puC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39562pug.uzCIH(function1, obj);
                    }
                });
            } else {
                AbstractC58185ywX<C37936pGe> abstractC58185ywXOLrzqt = this.AubY.OLrzqt(this.getFieldNames, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), true);
                final Function1 function12 = new Function1() { // from class: o.puE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.copydefault(marketCoinInfo, this, (C37936pGe) obj);
                    }
                };
                this.AuCTelauCTel = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.puA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39562pug.iwGUEr(function12, obj);
                    }
                });
            }
        }
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C39562pug c39562pug, C38358pVv.ActionBar actionBar) {
        Intrinsics.copydefault(actionBar);
        c39562pug.OLrzqt(actionBar);
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MarketCoinInfo marketCoinInfo, C39562pug c39562pug, C37936pGe c37936pGe) {
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "INDEX")) {
            Intrinsics.copydefault(c37936pGe);
            c39562pug.copydefault(c37936pGe);
        } else {
            Intrinsics.copydefault(c37936pGe);
            c39562pug.OLrzqt(c37936pGe);
        }
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        InterfaceC58217yxC interfaceC58217yxC = this.zLjUOn;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.valueOf = "";
        this.AYXKKw = "";
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            java.lang.String instrumentId = marketCoinInfo.getInstrumentId();
            if (!Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                instrumentId = null;
            }
            if (instrumentId != null && (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instrumentId)) != null) {
                bizInstrumentValueOf.getUnderlying();
            }
            AbstractC58185ywX<C37936pGe> abstractC58185ywXOLrzqt = this.AubY.OLrzqt("TYPE_KLINE", marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), false);
            final Function1 function1 = new Function1() { // from class: o.puJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.EZpvd(marketCoinInfo, this, (C37936pGe) obj);
                }
            };
            this.zLjUOn = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.puK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39562pug.wlaJM(function1, obj);
                }
            });
        }
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(MarketCoinInfo marketCoinInfo, C39562pug c39562pug, C37936pGe c37936pGe) {
        if (!Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "INDEX")) {
            Intrinsics.copydefault(c37936pGe);
            c39562pug.EZpvd(c37936pGe);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C37936pGe c37936pGe) {
        xMJ.Application applicationKWHzl = c37936pGe.KWHzl();
        if (applicationKWHzl != null) {
            this.valueOf = applicationKWHzl.djBIcL();
            this.AYXKKw = applicationKWHzl.AhwBna();
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
            java.lang.String instrumentId = marketCoinInfo.getInstrumentId();
            java.lang.String instrumentType = marketCoinInfo.getInstrumentType();
            long jValueOf = C33129mqd.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(klineBizMarketService.queryAllOrderKLine(instrumentId, instrumentType, str, java.lang.Long.valueOf(jValueOf), str2, this.AwvSrB, str3, str4, "filled"), lifecycleOwner), new Function1() { // from class: o.pva
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.djBIcL(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pvh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.gEmmrt(this.copydefault, marketCoinInfo, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "trade_history_pin", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C39562pug c39562pug, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.AEQbTJ(new java.util.ArrayList<>());
        }
        pUU.KWHzl("ChartView", "买卖点位数据: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(this.AubY.KWHzl(lifecycleOwner, this.fetchVPNInfo), lifecycleOwner), new Function1() { // from class: o.puj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.gEmmrt(function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.puu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.EZpvd(function1, (kotlin.Pair) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        function1.invoke(java.lang.Boolean.valueOf(((java.util.List) pair.getSecond()).isEmpty()));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<TickersData> copydefault(java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXKWHzl = ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketCupTickers(str).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.pvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C39562pug.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC58185ywXAEQbTJ, (Function1) null, 1, (java.lang.Object) null);
        final Function1 function12 = new Function1() { // from class: o.pvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.AEQbTJ((java.util.List) obj);
            }
        };
        AbstractC58185ywX<TickersData> abstractC58185ywXAEQbTJ2 = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C39562pug.hDKMBd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final TickersData hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TickersData) function1.invoke(obj);
    }

    public static final TickersData AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (TickersData) list.get(0);
    }

    public final void AEQbTJ(LifecycleOwner lifecycleOwner, final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3, final boolean z) {
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) oLT.fetchVPNInfo())) {
                this.isConnected = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(this.AubY.copydefault(str), lifecycleOwner), (Function1) null, (Function0) null, new Function1() { // from class: o.pvA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.copydefault(str, this, booleanRef, z, str3, str2, i, marketCoinInfo, (AccountBalanceData) obj);
                    }
                }, 3, (java.lang.Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.okinc.kline.data.KlineSpotAverageBean] */
    public static final Unit copydefault(java.lang.String str, C39562pug c39562pug, Ref.BooleanRef booleanRef, boolean z, java.lang.String str2, java.lang.String str3, int i, final MarketCoinInfo marketCoinInfo, AccountBalanceData accountBalanceData) {
        AccountDetailData accountDetailData;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(accountBalanceData, "");
        Objects.toString(accountBalanceData);
        java.util.ArrayList<AccountDetailData> details = accountBalanceData.getDetails();
        java.lang.String strDjBIcL = null;
        if (details != null) {
            java.util.Iterator<T> it = details.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AccountDetailData) next).getCcy(), (java.lang.Object) str)) {
                    break;
                }
            }
            accountDetailData = (AccountDetailData) next;
        } else {
            accountDetailData = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? klineSpotAverageBean = new KlineSpotAverageBean();
        klineSpotAverageBean.setShowSpotAverageLine(false);
        objectRef.element = klineSpotAverageBean;
        KlineSpotAverageBean klineSpotAverageBean2 = C36246oUr.copydefault().zLjUOn().getKlineSpotAverageBean();
        if (accountDetailData != null) {
            C37925pFu c37925pFu = C37925pFu.KWHzl;
            java.lang.String strKWHzl = c37925pFu.KWHzl();
            java.lang.String strEZpvd = c37925pFu.EZpvd(accountDetailData.getOpenAvgPx(), str2, str3, i);
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            java.lang.String strEZpvd2 = c37925pFu.EZpvd(accountDetailData.getAccAvgPx(), str2, str3, i);
            if (strEZpvd2 == null) {
                strEZpvd2 = "";
            }
            KlineSpotAverageBean klineSpotAverageBean3 = (KlineSpotAverageBean) objectRef.element;
            klineSpotAverageBean3.ccy = accountDetailData.getCcy();
            klineSpotAverageBean3.setQuoteUnit(str2);
            klineSpotAverageBean3.setFormatOpenAvgPx(strEZpvd);
            klineSpotAverageBean3.setFormatAccAvgPx(strEZpvd2);
            klineSpotAverageBean3.setOriginOpenAvgPx(accountDetailData.getOpenAvgPx());
            klineSpotAverageBean3.setOriginAccAvgPx(accountDetailData.getAccAvgPx());
            java.lang.String strCopydefault = c37925pFu.copydefault(accountDetailData.getOpenAvgPx(), str3, i);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            klineSpotAverageBean3.setOpenAvgPx(strCopydefault);
            java.lang.String strCopydefault2 = c37925pFu.copydefault(accountDetailData.getAccAvgPx(), str3, i);
            if (strCopydefault2 == null) {
                strCopydefault2 = "";
            }
            klineSpotAverageBean3.setAccAvgPx(strCopydefault2);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt2.valueOf(marketCoinInfo.getInstrumentId())) == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(marketCoinInfo.getInstrumentType())) != null) {
                strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(instFamily);
            }
            klineSpotAverageBean3.setCashBal(((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(accountDetailData.getCashBal(), accountDetailData.getCcy(), strDjBIcL == null ? "0" : strDjBIcL));
            InterfaceC49493upb interfaceC49493upb = (InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class);
            java.lang.String spotBal = accountDetailData.getSpotBal();
            java.lang.String ccy = accountDetailData.getCcy();
            if (strDjBIcL == null) {
                strDjBIcL = "0";
            }
            klineSpotAverageBean3.setSpotBal(interfaceC49493upb.KWHzl(spotBal, ccy, strDjBIcL));
            klineSpotAverageBean3.setTotalPnlRatio(((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(accountDetailData.getTotalPnlRatio()));
            klineSpotAverageBean3.setSpotUplRatio(((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(accountDetailData.getSpotUplRatio()));
            klineSpotAverageBean3.setOpenAvgPx(Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) strKWHzl));
            klineSpotAverageBean3.setShowSpotAverageLine(Intrinsics.EZpvd((java.lang.Object) c39562pug.getFieldNames, (java.lang.Object) "TYPE_KLINE"));
            java.lang.String strCopydefault3 = c37925pFu.copydefault(accountDetailData.getTotalPnl(), str3, i);
            if (strCopydefault3 == null) {
                strCopydefault3 = "";
            }
            klineSpotAverageBean3.setTotalPnl(strCopydefault3);
            java.lang.String strCopydefault4 = c37925pFu.copydefault(accountDetailData.getSpotUpl(), str3, i);
            klineSpotAverageBean3.setSpotUpl(strCopydefault4 == null ? "" : strCopydefault4);
            if (klineSpotAverageBean2 != null) {
                klineSpotAverageBean3.setTSelected(klineSpotAverageBean2.getTSelected());
                klineSpotAverageBean3.setTLongClick(klineSpotAverageBean2.getTLongClick());
                klineSpotAverageBean3.setTShowSolid(klineSpotAverageBean2.getTShowSolid());
                klineSpotAverageBean3.setSLLeft(klineSpotAverageBean2.getSLLeft());
                klineSpotAverageBean3.setTPLeft(klineSpotAverageBean2.getTPLeft());
                klineSpotAverageBean3.setTDragTP(klineSpotAverageBean2.getTDragTP());
                klineSpotAverageBean3.setTDragSL(klineSpotAverageBean2.getTDragSL());
            }
        }
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.KWHzl((KlineSpotAverageBean) objectRef.element);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((KlineSpotAverageBean) objectRef.element).getOpenAvgPx()) && !booleanRef.element && z) {
            booleanRef.element = true;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PlaceOrder_PositionOrder_Line_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pvC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.AEQbTJ(marketCoinInfo, (EventParamsList) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MarketCoinInfo marketCoinInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("feature_type", "spot_cost", true);
        eventParamsList.put("biz_type", marketCoinInfo.getInstrumentType(), true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd(@NotNull final LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, final int i, final boolean z) {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str2);
        java.lang.String str3 = (bizInstrumentValueOf == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) ? "" : tradeSymbol;
        final java.lang.String str4 = (bizInstrumentValueOf == null || (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) == null) ? "" : quoteSymbol;
        final java.lang.String str5 = str3;
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(copydefault(str4), lifecycleOwner), new Function1() { // from class: o.pum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.fetchVPNInfo((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.OLrzqt(this.EZpvd, lifecycleOwner, str5, i, str4, z, (TickersData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C39562pug c39562pug, LifecycleOwner lifecycleOwner, java.lang.String str, int i, java.lang.String str2, boolean z, TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        c39562pug.AEQbTJ(lifecycleOwner, str, tickersData.getLast(), i, str2, z);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, final boolean z) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.zsXlph;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) oLT.fetchVPNInfo())) {
                this.zsXlph = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(this.AubY.AEQbTJ(marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId()), lifecycleOwner), (Function1) null, (Function0) null, new Function1() { // from class: o.puG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.copydefault(this.OLrzqt, marketCoinInfo, z, (Triple) obj);
                    }
                }, 3, (java.lang.Object) null);
                return;
            }
            InterfaceC39563puh.Application application = this.wlaJM;
            if (application != null) {
                application.KWHzl(new java.util.ArrayList<>());
            }
        }
    }

    public static final Unit copydefault(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, boolean z, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        java.util.List<TradePositionManager.PositionItem> listEZpvd = xOJ.AEQbTJ.EZpvd((java.util.List<TradePositionData>) triple.getSecond(), (java.util.List<TradeUserPositionInfo>) triple.getThird());
        c39562pug.AxsJAY = listEZpvd;
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.gEmmrt(listEZpvd);
        }
        java.util.ArrayList<OkxTradePositionBean> arrayListOLrzqt = c39562pug.OLrzqt(marketCoinInfo.getInstrumentType(), (java.util.List<TradePositionData>) triple.getSecond(), c39562pug.AxsJAY);
        InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
        if (application2 != null) {
            application2.KWHzl(arrayListOLrzqt);
        }
        if (C33129mqd.KWHzl((java.util.Collection) C36246oUr.copydefault().gasjUx())) {
            c39562pug.zuBGHE.OLrzqt(arrayListOLrzqt, c39562pug.AxsJAY, null);
        }
        if (((java.lang.Boolean) triple.getFirst()).booleanValue() && C33129mqd.KWHzl((java.util.Collection) arrayListOLrzqt) && z) {
            if (C36246oUr.copydefault().run()) {
                c39562pug.KWHzl("position_line", marketCoinInfo.getInstrumentType());
            }
            if (C36246oUr.copydefault().DCUTEIddSDPG() && c39562pug.AEQbTJ(arrayListOLrzqt)) {
                c39562pug.KWHzl("liquidation_price", marketCoinInfo.getInstrumentType());
            }
            if (C36246oUr.copydefault().DCUTEIdCUTEI() && c39562pug.OLrzqt(arrayListOLrzqt)) {
                c39562pug.KWHzl("breakeven_price", marketCoinInfo.getInstrumentType());
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_PositionOrder_Line_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.KWHzl(str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("feature_type", str, true);
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("biz_type", lowerCase, true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, final boolean z) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            BizAllOrderReq allStrategyTypeRequestParams$default = getAllStrategyTypeRequestParams$default(this, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), StrategyType.ALL, null, 8, null);
            InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.EZpvd(this.AubY.EZpvd(allStrategyTypeRequestParams$default, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), lifecycleOwner).KWHzl(C58266yxz.OLrzqt());
            final Function1 function1 = new Function1() { // from class: o.puW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.OLrzqt(this.OLrzqt, (java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.puX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39562pug.fJNWhG(function1, obj);
                }
            }).KWHzl(yBP.AEQbTJ());
            final Function1 function12 = new Function1() { // from class: o.puU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.copydefault(this.EZpvd, (java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pvc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C39562pug.fARcdN(function12, obj);
                }
            }).KWHzl(C58266yxz.OLrzqt());
            final Function1 function13 = new Function1() { // from class: o.pvb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.AEQbTJ(this.EZpvd, booleanRef, z, marketCoinInfo, (java.util.List) obj);
                }
            };
            this.hDKMBd = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.puZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39562pug.ejfBZ(function13, obj);
                }
            });
        }
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C39562pug c39562pug, java.util.List list) {
        Intrinsics.copydefault(list);
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, c39562pug.AEQbTJ));
        Intrinsics.copydefault(listFJNWhG, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) listFJNWhG;
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new Fragment());
        }
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.OLrzqt((java.util.List<? extends TradeAllOrderApi>) arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final java.util.List fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(C39562pug c39562pug, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List listAhwBna = yDY.AhwBna();
        if (!C33129mqd.KWHzl((java.util.Collection) list)) {
            return listAhwBna;
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, c39562pug.AEQbTJ));
        Intrinsics.copydefault(listFJNWhG, "");
        return c39562pug.KWHzl((java.util.ArrayList<TradeAllOrderApi>) listFJNWhG);
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C39562pug c39562pug, Ref.BooleanRef booleanRef, boolean z, final MarketCoinInfo marketCoinInfo, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            if (C33129mqd.KWHzl((java.util.Collection) C36246oUr.copydefault().DCUTEI())) {
                C37928pFx c37928pFx = c39562pug.zuBGHE;
                java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
                Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
                c37928pFx.OLrzqt(listDCUTEI, c39562pug.AxsJAY, list);
            }
            InterfaceC39563puh.Application application = c39562pug.wlaJM;
            if (application != null) {
                Intrinsics.copydefault(list);
                application.EZpvd((java.util.List<KlineOpenOrderBean>) list);
            }
            if (!booleanRef.element && C36246oUr.copydefault().WS() && z) {
                booleanRef.element = true;
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("PlaceOrder_PositionOrder_Line_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.puB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.KWHzl(marketCoinInfo, (EventParamsList) obj);
                    }
                });
            }
        } else {
            InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
            if (application2 != null) {
                application2.EZpvd((java.util.List<KlineOpenOrderBean>) new java.util.ArrayList());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MarketCoinInfo marketCoinInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("feature_type", "order_line", true);
        eventParamsList.put("biz_type", marketCoinInfo.getInstrumentType(), true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [717=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.List<KlineOpenOrderBean> KWHzl(java.util.ArrayList<TradeAllOrderApi> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new StateListAnimator());
        }
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) obj;
            if (tradeAllOrderApi instanceof TradeOrderData) {
                TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
                java.lang.String ordType = tradeOrderData.getOrdType();
                if (Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "limit") || Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "post_only")) {
                    arrayList2.addAll(EZpvd(i, tradeOrderData));
                }
            } else if (tradeAllOrderApi instanceof BizTradeStrategyInfo) {
                BizTradeStrategyInfo bizTradeStrategyInfo = (BizTradeStrategyInfo) tradeAllOrderApi;
                java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
                switch (orderType.hashCode()) {
                    case -1727670399:
                        if (orderType.equals("move_order_stop")) {
                            arrayList2.add(EZpvd(i, bizTradeStrategyInfo));
                        }
                        break;
                    case -1059891784:
                        if (orderType.equals("trigger")) {
                            arrayList2.addAll(OLrzqt(i, bizTradeStrategyInfo));
                        }
                        break;
                    case 109851:
                        if (orderType.equals("oco")) {
                            arrayList2.addAll(KWHzl(i, bizTradeStrategyInfo));
                        }
                        break;
                    case 1208131206:
                        if (orderType.equals("conditional")) {
                            arrayList2.add(AEQbTJ(i, bizTradeStrategyInfo));
                        }
                        break;
                }
            }
            i++;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oLX.getEntrustAmount$default(com.okinc.unify_trade.biz.subscribe.TradeOrderData, boolean, int, java.lang.Object):java.lang.String */
    public final java.util.List<KlineOpenOrderBean> EZpvd(int i, TradeOrderData tradeOrderData) {
        java.lang.String strAEQbTJ;
        java.lang.String entrustAmount$default;
        java.lang.String strCopydefault;
        java.lang.String strAEQbTJ2;
        java.lang.String entrustAmount$default2;
        java.lang.String strCopydefault2;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        klineOpenOrderBean.setInstType(tradeOrderData.getInstType());
        klineOpenOrderBean.setOriginPos(i);
        klineOpenOrderBean.setOrdId(tradeOrderData.getOrdId());
        klineOpenOrderBean.setOrdType(tradeOrderData.getOrdType());
        int i3 = 0;
        klineOpenOrderBean.setAmount(oLX.getEntrustAmount$default(tradeOrderData, false, 1, null));
        klineOpenOrderBean.setNotionalUsd(oLX.KWHzl(tradeOrderData));
        klineOpenOrderBean.setAmountNoSign(oLX.copydefault(tradeOrderData, false));
        klineOpenOrderBean.setOrderSize(tradeOrderData.getOrderSz());
        klineOpenOrderBean.setCTime(tradeOrderData.getCTime());
        klineOpenOrderBean.setPrice(oLX.EZpvd(tradeOrderData));
        klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
        klineOpenOrderBean.setSide(tradeOrderData.getSide());
        klineOpenOrderBean.setPosSide(tradeOrderData.getPosSide());
        klineOpenOrderBean.setLineColor(tradeOrderData.getSide());
        klineOpenOrderBean.setReduceOnly(tradeOrderData.getReduceOnly());
        klineOpenOrderBean.setTpLimit(tradeOrderData.isTpLimit());
        klineOpenOrderBean.setTdMode(tradeOrderData.getTdMode());
        arrayList.add(klineOpenOrderBean);
        java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
        if (attachAlgoOrds != null) {
            for (TradeOrderStopParam tradeOrderStopParam : attachAlgoOrds) {
                strAEQbTJ = "";
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getTpTriggerPx()) || (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getTpOrdPx()) && !Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getTpOrdPx(), (java.lang.Object) this.KWHzl))) {
                    KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
                    klineOpenOrderBean2.setInstType(tradeOrderData.getInstType());
                    klineOpenOrderBean2.setOriginPos(i);
                    java.lang.String attachAlgoId = tradeOrderStopParam.getAttachAlgoId();
                    if (attachAlgoId == null) {
                        attachAlgoId = "";
                    }
                    klineOpenOrderBean2.setAttachAlgoId(attachAlgoId);
                    klineOpenOrderBean2.setOrdId(tradeOrderData.getOrdId());
                    klineOpenOrderBean2.setOrdType(Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getTpOrdPx(), (java.lang.Object) this.KWHzl) ? "TP_Market" : "TP_Limit");
                    java.lang.String sz = tradeOrderStopParam.getSz();
                    if (sz == null || sz.length() == 0) {
                        entrustAmount$default = oLX.getEntrustAmount$default(tradeOrderData, false, 1, null);
                    } else {
                        java.lang.String sz2 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) sz2);
                        entrustAmount$default = copydefault(sz2, tradeOrderData);
                    }
                    klineOpenOrderBean2.setAmount(entrustAmount$default);
                    klineOpenOrderBean2.setNotionalUsd(oLX.KWHzl(tradeOrderData));
                    java.lang.String sz3 = tradeOrderStopParam.getSz();
                    if (sz3 == null || sz3.length() == 0) {
                        strCopydefault = oLX.copydefault(tradeOrderData, false);
                    } else {
                        java.lang.String sz4 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) sz4);
                        strCopydefault = copydefault(sz4, tradeOrderData);
                    }
                    klineOpenOrderBean2.setAmountNoSign(strCopydefault);
                    klineOpenOrderBean2.setCTime(tradeOrderData.getCTime());
                    klineOpenOrderBean2.setPrice(AEQbTJ(tradeOrderData.getOrderInstType(), C33129mqd.gEmmrt(C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getTpTriggerPx()) ? tradeOrderStopParam.getTpTriggerPx() : tradeOrderStopParam.getTpOrdPx())));
                    klineOpenOrderBean2.setOldPrice(klineOpenOrderBean2.getPrice());
                    java.lang.String tpOrdPx = tradeOrderStopParam.getTpOrdPx();
                    if (tpOrdPx == null) {
                        tpOrdPx = "";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) tpOrdPx, (java.lang.Object) this.KWHzl)) {
                        strAEQbTJ2 = tradeOrderStopParam.getTpOrdPx();
                        if (strAEQbTJ2 == null) {
                            strAEQbTJ2 = "";
                        }
                    } else {
                        java.lang.String orderInstType = tradeOrderData.getOrderInstType();
                        java.lang.String tpOrdPx2 = tradeOrderStopParam.getTpOrdPx();
                        if (tpOrdPx2 == null) {
                            tpOrdPx2 = "";
                        }
                        strAEQbTJ2 = AEQbTJ(orderInstType, tpOrdPx2);
                    }
                    klineOpenOrderBean2.setTpOrdPx(strAEQbTJ2);
                    klineOpenOrderBean2.setSide(Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getSide(), (java.lang.Object) "buy") ? "sell" : "buy");
                    klineOpenOrderBean2.setTriggerPxType(tradeOrderStopParam.getTpTriggerPxType());
                    klineOpenOrderBean2.setLineColor(tradeOrderData.getSide());
                    klineOpenOrderBean2.setMainOrder(false);
                    klineOpenOrderBean2.setMultipleOrder(C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSz()));
                    klineOpenOrderBean2.setMainPrice(oLX.EZpvd(tradeOrderData));
                    this.zuBGHE.OLrzqt(klineOpenOrderBean2, (InterfaceC55726xpQ) tradeOrderData, klineOpenOrderBean2.getMainPrice(), true);
                    arrayList.add(klineOpenOrderBean2);
                    klineOpenOrderBean.setHaveTP(true);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSz())) {
                        arrayList2.add(klineOpenOrderBean2);
                    }
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSlTriggerPx()) || (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSlOrdPx()) && !Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getSlOrdPx(), (java.lang.Object) this.KWHzl))) {
                    KlineOpenOrderBean klineOpenOrderBean3 = new KlineOpenOrderBean();
                    klineOpenOrderBean3.setInstType(tradeOrderData.getInstType());
                    klineOpenOrderBean3.setOriginPos(i);
                    java.lang.String attachAlgoId2 = tradeOrderStopParam.getAttachAlgoId();
                    if (attachAlgoId2 == null) {
                        attachAlgoId2 = "";
                    }
                    klineOpenOrderBean3.setAttachAlgoId(attachAlgoId2);
                    klineOpenOrderBean3.setOrdId(tradeOrderData.getOrdId());
                    klineOpenOrderBean3.setOrdType(Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getSlOrdPx(), (java.lang.Object) this.KWHzl) ? "SL_Market" : "SL_Limit");
                    java.lang.String sz5 = tradeOrderStopParam.getSz();
                    if (sz5 == null || sz5.length() == 0) {
                        entrustAmount$default2 = oLX.getEntrustAmount$default(tradeOrderData, false, 1, null);
                    } else {
                        entrustAmount$default2 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) entrustAmount$default2);
                    }
                    klineOpenOrderBean3.setAmount(entrustAmount$default2);
                    klineOpenOrderBean3.setNotionalUsd(oLX.KWHzl(tradeOrderData));
                    java.lang.String sz6 = tradeOrderStopParam.getSz();
                    if (sz6 == null || sz6.length() == 0) {
                        strCopydefault2 = oLX.copydefault(tradeOrderData, false);
                    } else {
                        strCopydefault2 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) strCopydefault2);
                    }
                    klineOpenOrderBean3.setAmountNoSign(strCopydefault2);
                    klineOpenOrderBean3.setCTime(tradeOrderData.getCTime());
                    klineOpenOrderBean3.setPrice(AEQbTJ(tradeOrderData.getOrderInstType(), C33129mqd.gEmmrt(C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSlTriggerPx()) ? tradeOrderStopParam.getSlTriggerPx() : tradeOrderStopParam.getSlOrdPx())));
                    klineOpenOrderBean3.setOldPrice(klineOpenOrderBean3.getPrice());
                    java.lang.String slOrdPx = tradeOrderStopParam.getSlOrdPx();
                    if (slOrdPx == null) {
                        slOrdPx = "";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) slOrdPx, (java.lang.Object) this.KWHzl)) {
                        java.lang.String slOrdPx2 = tradeOrderStopParam.getSlOrdPx();
                        if (slOrdPx2 != null) {
                            strAEQbTJ = slOrdPx2;
                        }
                    } else {
                        java.lang.String orderInstType2 = tradeOrderData.getOrderInstType();
                        java.lang.String slOrdPx3 = tradeOrderStopParam.getSlOrdPx();
                        strAEQbTJ = AEQbTJ(orderInstType2, slOrdPx3 != null ? slOrdPx3 : "");
                    }
                    klineOpenOrderBean3.setSlOrdPx(strAEQbTJ);
                    klineOpenOrderBean3.setSide(Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getSide(), (java.lang.Object) "buy") ? "sell" : "buy");
                    klineOpenOrderBean3.setTriggerPxType(tradeOrderStopParam.getSlTriggerPxType());
                    klineOpenOrderBean3.setLineColor(tradeOrderData.getSide());
                    i2 = 0;
                    klineOpenOrderBean3.setMainOrder(false);
                    klineOpenOrderBean3.setMainPrice(oLX.EZpvd(tradeOrderData));
                    this.zuBGHE.OLrzqt(klineOpenOrderBean3, (InterfaceC55726xpQ) tradeOrderData, klineOpenOrderBean3.getMainPrice(), false);
                    arrayList.add(klineOpenOrderBean3);
                    klineOpenOrderBean.setHaveSL(true);
                } else {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        int i4 = i3;
        if (!arrayList2.isEmpty()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getSide(), (java.lang.Object) "buy")) {
                int i5 = i4;
                for (java.lang.Object obj : CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Application())) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        yDY.AYXKKw();
                    }
                    ((KlineOpenOrderBean) obj).setMultipleOrderNum(i6);
                    i5 = i6;
                }
            } else {
                int i7 = i4;
                for (java.lang.Object obj2 : CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Activity())) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        yDY.AYXKKw();
                    }
                    ((KlineOpenOrderBean) obj2).setMultipleOrderNum(i8);
                    i7 = i8;
                }
            }
        }
        return arrayList;
    }

    public final java.lang.String copydefault(java.lang.String str, TradeOrderData tradeOrderData) {
        TradeOrderData tradeOrderData2 = tradeOrderData instanceof TradeOrderData ? tradeOrderData : null;
        if (tradeOrderData2 == null) {
            return "";
        }
        java.lang.String tpTriggerPx = tradeOrderData2.getTpTriggerPx();
        if (tpTriggerPx == null) {
            tpTriggerPx = "";
        }
        java.lang.String strCopydefault = oLX.copydefault(tradeOrderData2, str, oLX.OLrzqt(tradeOrderData2, tradeOrderData, tpTriggerPx));
        return strCopydefault == null ? "" : strCopydefault;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oMb.getEntrustAmount$default(com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, java.lang.Boolean, boolean, int, java.lang.Object):java.lang.String */
    public final KlineOpenOrderBean AEQbTJ(int i, BizTradeStrategyInfo bizTradeStrategyInfo) {
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        java.lang.String orderTpTriggerPx = bizTradeStrategyInfo.getOrderTpTriggerPx();
        if (orderTpTriggerPx == null || orderTpTriggerPx.length() == 0) {
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                klineOpenOrderBean.setOrdType("SL_Market");
            } else {
                klineOpenOrderBean.setOrdType("SL_Limit");
            }
            klineOpenOrderBean.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSlTriggerPx()));
            klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
            klineOpenOrderBean.setSlOrdPx(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) this.KWHzl) ? bizTradeStrategyInfo.getOrderSlOrderPx() : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSlOrderPx()));
            klineOpenOrderBean.setTriggerPxType(bizTradeStrategyInfo.getOrderSlTriggerPxType());
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                klineOpenOrderBean.setOrdType("TP_Market");
            } else {
                klineOpenOrderBean.setOrdType("TP_Limit");
            }
            klineOpenOrderBean.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderTpTriggerPx()));
            klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
            klineOpenOrderBean.setTpOrdPx(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) this.KWHzl) ? bizTradeStrategyInfo.getOrderTpOrderPx() : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderTpOrderPx()));
            klineOpenOrderBean.setTriggerPxType(bizTradeStrategyInfo.getOrderTpTriggerPxType());
        }
        klineOpenOrderBean.setInstType(bizTradeStrategyInfo.getOrderInstType());
        klineOpenOrderBean.setOriginPos(i);
        klineOpenOrderBean.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
        klineOpenOrderBean.setAmount(C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null));
        klineOpenOrderBean.setOrderSize(bizTradeStrategyInfo.getOrderSz());
        klineOpenOrderBean.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
        klineOpenOrderBean.setAmountNoSign(C36014oMb.KWHzl(bizTradeStrategyInfo, java.lang.Boolean.FALSE, false));
        klineOpenOrderBean.setCTime(bizTradeStrategyInfo.getOrderCTime());
        klineOpenOrderBean.setSide(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setPosSide(bizTradeStrategyInfo.getOrderPosSide());
        klineOpenOrderBean.setLineColor(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setReduceOnly(bizTradeStrategyInfo.getOrderReduceOnly());
        klineOpenOrderBean.setTdMode(bizTradeStrategyInfo.getOrderTdMode());
        klineOpenOrderBean.setTdMode(bizTradeStrategyInfo.getOrderTdMode());
        return klineOpenOrderBean;
    }

    public final java.util.List<KlineOpenOrderBean> KWHzl(int i, BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            klineOpenOrderBean.setOrdType("TP_Market");
        } else {
            klineOpenOrderBean.setOrdType("TP_Limit");
        }
        klineOpenOrderBean.setOriginOrdType(bizTradeStrategyInfo.getOrderType());
        klineOpenOrderBean.setInstType(bizTradeStrategyInfo.getOrderInstType());
        klineOpenOrderBean.setOriginPos(i);
        klineOpenOrderBean.setAmount(C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null));
        klineOpenOrderBean.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        klineOpenOrderBean.setAmountNoSign(C36014oMb.KWHzl(bizTradeStrategyInfo, bool, false));
        klineOpenOrderBean.setCTime(bizTradeStrategyInfo.getOrderCTime());
        klineOpenOrderBean.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderTpTriggerPx()));
        klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
        klineOpenOrderBean.setTpOrdPx(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderTpOrderPx(), (java.lang.Object) this.KWHzl) ? bizTradeStrategyInfo.getOrderTpOrderPx() : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderTpOrderPx()));
        klineOpenOrderBean.setSide(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setPosSide(bizTradeStrategyInfo.getOrderPosSide());
        klineOpenOrderBean.setTriggerPxType(bizTradeStrategyInfo.getOrderTpTriggerPxType());
        klineOpenOrderBean.setLineColor(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
        klineOpenOrderBean.setReduceOnly(bizTradeStrategyInfo.getOrderReduceOnly());
        klineOpenOrderBean.setTdMode(bizTradeStrategyInfo.getOrderTdMode());
        klineOpenOrderBean.setOrderSize(bizTradeStrategyInfo.getOrderSz());
        arrayList.add(klineOpenOrderBean);
        KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            klineOpenOrderBean2.setOrdType("SL_Market");
        } else {
            klineOpenOrderBean2.setOrdType("SL_Limit");
        }
        klineOpenOrderBean2.setOriginOrdType(bizTradeStrategyInfo.getOrderType());
        klineOpenOrderBean2.setInstType(bizTradeStrategyInfo.getOrderInstType());
        klineOpenOrderBean2.setOriginPos(i);
        klineOpenOrderBean2.setAmount(C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null));
        klineOpenOrderBean2.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
        klineOpenOrderBean2.setAmountNoSign(C36014oMb.KWHzl(bizTradeStrategyInfo, bool, false));
        klineOpenOrderBean2.setCTime(bizTradeStrategyInfo.getOrderCTime());
        klineOpenOrderBean2.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSlTriggerPx()));
        klineOpenOrderBean2.setOldPrice(klineOpenOrderBean2.getPrice());
        klineOpenOrderBean2.setSlOrdPx(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSlOrderPx(), (java.lang.Object) this.KWHzl) ? bizTradeStrategyInfo.getOrderSlOrderPx() : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSlOrderPx()));
        klineOpenOrderBean2.setSide(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean2.setPosSide(bizTradeStrategyInfo.getOrderPosSide());
        klineOpenOrderBean2.setTriggerPxType(bizTradeStrategyInfo.getOrderSlTriggerPxType());
        klineOpenOrderBean2.setLineColor(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean2.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
        klineOpenOrderBean2.setReduceOnly(bizTradeStrategyInfo.getOrderReduceOnly());
        klineOpenOrderBean2.setTdMode(bizTradeStrategyInfo.getOrderTdMode());
        klineOpenOrderBean2.setOrderSize(bizTradeStrategyInfo.getOrderSz());
        arrayList.add(klineOpenOrderBean2);
        return arrayList;
    }

    public final KlineOpenOrderBean EZpvd(int i, BizTradeStrategyInfo bizTradeStrategyInfo) {
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        klineOpenOrderBean.setInstType(bizTradeStrategyInfo.getOrderInstType());
        klineOpenOrderBean.setOriginPos(i);
        klineOpenOrderBean.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
        klineOpenOrderBean.setOrdType(bizTradeStrategyInfo.getOrderType());
        klineOpenOrderBean.setAmount(C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null));
        klineOpenOrderBean.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
        klineOpenOrderBean.setAmountNoSign(C36014oMb.KWHzl(bizTradeStrategyInfo, java.lang.Boolean.FALSE, false));
        klineOpenOrderBean.setCTime(bizTradeStrategyInfo.getOrderCTime());
        klineOpenOrderBean.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C33129mqd.OLrzqt((java.lang.CharSequence) bizTradeStrategyInfo.getOrderActivePx()) ? bizTradeStrategyInfo.getOrderActivePx() : bizTradeStrategyInfo.getOrderTriggerPx()));
        klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
        java.lang.String orderTriggerPx = bizTradeStrategyInfo.getOrderTriggerPx();
        java.lang.String str = "";
        klineOpenOrderBean.setMoveTriggerPx((orderTriggerPx == null || orderTriggerPx.length() == 0) ? "" : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderTriggerPx()));
        java.lang.String orderActivePx = bizTradeStrategyInfo.getOrderActivePx();
        klineOpenOrderBean.setActivePx((orderActivePx == null || orderActivePx.length() == 0) ? "" : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderActivePx()));
        java.lang.String activePx = klineOpenOrderBean.getActivePx();
        if (activePx != null && activePx.length() != 0) {
            str = "active";
        }
        klineOpenOrderBean.setTriggerPxType(str);
        klineOpenOrderBean.setCallbackRatio(bizTradeStrategyInfo.getOrderCallbackRatio());
        klineOpenOrderBean.setCallbackSpread(C36014oMb.copydefault(bizTradeStrategyInfo));
        klineOpenOrderBean.setCallback(C36014oMb.AEQbTJ(bizTradeStrategyInfo));
        klineOpenOrderBean.setSide(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setPosSide(bizTradeStrategyInfo.getOrderPosSide());
        klineOpenOrderBean.setLineColor(bizTradeStrategyInfo.getOrderSide());
        return klineOpenOrderBean;
    }

    public final java.util.List<KlineOpenOrderBean> OLrzqt(int i, BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String strAEQbTJ;
        java.lang.Boolean bool;
        boolean z;
        java.lang.String entrustAmount$default;
        java.lang.String strKWHzl;
        java.lang.String entrustAmount$default2;
        java.lang.String strKWHzl2;
        java.lang.String strAEQbTJ2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        klineOpenOrderBean.setInstType(bizTradeStrategyInfo.getOrderInstType());
        klineOpenOrderBean.setOriginPos(i);
        klineOpenOrderBean.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
        klineOpenOrderBean.setOrdType(bizTradeStrategyInfo.getOrderType());
        java.lang.Boolean bool2 = null;
        boolean z2 = false;
        klineOpenOrderBean.setAmount(C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null));
        klineOpenOrderBean.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
        klineOpenOrderBean.setAmountNoSign(C36014oMb.KWHzl(bizTradeStrategyInfo, java.lang.Boolean.FALSE, false));
        klineOpenOrderBean.setCTime(bizTradeStrategyInfo.getOrderCTime());
        klineOpenOrderBean.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C36014oMb.AYXKKw(bizTradeStrategyInfo)));
        klineOpenOrderBean.setOldPrice(klineOpenOrderBean.getPrice());
        klineOpenOrderBean.setOrdPx(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderOrdPx(), (java.lang.Object) this.KWHzl) ? bizTradeStrategyInfo.getOrderOrdPx() : AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderOrdPx()));
        klineOpenOrderBean.setSide(bizTradeStrategyInfo.getOrderSide());
        klineOpenOrderBean.setPosSide(bizTradeStrategyInfo.getOrderPosSide());
        klineOpenOrderBean.setTriggerPxType(bizTradeStrategyInfo.getOrderTriggerPxType());
        klineOpenOrderBean.setLineColor(bizTradeStrategyInfo.getOrderSide());
        arrayList.add(klineOpenOrderBean);
        java.util.List<TradeOrderStopParam> attachAlgoOrders = bizTradeStrategyInfo.getAttachAlgoOrders();
        if (attachAlgoOrders != null) {
            for (TradeOrderStopParam tradeOrderStopParam : attachAlgoOrders) {
                strAEQbTJ = "";
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getTpTriggerPx())) {
                    KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
                    klineOpenOrderBean2.setInstType(bizTradeStrategyInfo.getOrderInstType());
                    klineOpenOrderBean2.setOriginPos(i);
                    klineOpenOrderBean2.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
                    klineOpenOrderBean2.setOrdType(Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getTpOrdPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? "TP_Market" : "TP_Limit");
                    java.lang.String sz = tradeOrderStopParam.getSz();
                    if (sz == null || sz.length() == 0) {
                        entrustAmount$default2 = C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, bool2, z2, 3, bool2);
                    } else {
                        entrustAmount$default2 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) entrustAmount$default2);
                    }
                    klineOpenOrderBean2.setAmount(entrustAmount$default2);
                    klineOpenOrderBean2.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
                    java.lang.String sz2 = tradeOrderStopParam.getSz();
                    if (sz2 == null || sz2.length() == 0) {
                        strKWHzl2 = C36014oMb.KWHzl(bizTradeStrategyInfo, java.lang.Boolean.FALSE, z2);
                    } else {
                        strKWHzl2 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) strKWHzl2);
                    }
                    klineOpenOrderBean2.setAmountNoSign(strKWHzl2);
                    klineOpenOrderBean2.setCTime(bizTradeStrategyInfo.getOrderCTime());
                    klineOpenOrderBean2.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C33129mqd.gEmmrt(C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getTpTriggerPx()) ? tradeOrderStopParam.getTpTriggerPx() : tradeOrderStopParam.getTpOrdPx())));
                    klineOpenOrderBean2.setOldPrice(klineOpenOrderBean2.getPrice());
                    java.lang.String tpOrdPx = tradeOrderStopParam.getTpOrdPx();
                    if (tpOrdPx == null) {
                        tpOrdPx = "";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) tpOrdPx, (java.lang.Object) this.KWHzl)) {
                        strAEQbTJ2 = tradeOrderStopParam.getTpOrdPx();
                        if (strAEQbTJ2 == null) {
                            strAEQbTJ2 = "";
                        }
                    } else {
                        java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
                        java.lang.String tpOrdPx2 = tradeOrderStopParam.getTpOrdPx();
                        if (tpOrdPx2 == null) {
                            tpOrdPx2 = "";
                        }
                        strAEQbTJ2 = AEQbTJ(orderInstType, tpOrdPx2);
                    }
                    klineOpenOrderBean2.setTpOrdPx(strAEQbTJ2);
                    klineOpenOrderBean2.setSide(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSide(), (java.lang.Object) "buy") ? "sell" : "buy");
                    klineOpenOrderBean2.setTriggerPxType(tradeOrderStopParam.getTpTriggerPxType());
                    klineOpenOrderBean2.setLineColor(bizTradeStrategyInfo.getOrderSide());
                    klineOpenOrderBean2.setMainOrder(z2);
                    klineOpenOrderBean2.setSupportDragAndCancel(z2);
                    klineOpenOrderBean2.setMainPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C36014oMb.AYXKKw(bizTradeStrategyInfo)));
                    arrayList.add(klineOpenOrderBean2);
                    this.zuBGHE.OLrzqt(klineOpenOrderBean2, (InterfaceC55726xpQ) bizTradeStrategyInfo, klineOpenOrderBean2.getMainPrice(), true);
                    klineOpenOrderBean.setHaveTP(true);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSlTriggerPx())) {
                    KlineOpenOrderBean klineOpenOrderBean3 = new KlineOpenOrderBean();
                    klineOpenOrderBean3.setInstType(bizTradeStrategyInfo.getOrderInstType());
                    klineOpenOrderBean3.setOriginPos(i);
                    klineOpenOrderBean3.setOrdId(bizTradeStrategyInfo.getOrderAlgoId());
                    klineOpenOrderBean3.setOrdType(Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getSlOrdPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? "SL_Market" : "SL_Limit");
                    java.lang.String sz3 = tradeOrderStopParam.getSz();
                    if (sz3 == null || sz3.length() == 0) {
                        bool = null;
                        entrustAmount$default = C36014oMb.getEntrustAmount$default(bizTradeStrategyInfo, null, false, 3, null);
                    } else {
                        java.lang.String sz4 = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) sz4);
                        entrustAmount$default = sz4;
                        bool = null;
                    }
                    klineOpenOrderBean3.setAmount(entrustAmount$default);
                    klineOpenOrderBean3.setNotionalUsd(C36014oMb.KWHzl(bizTradeStrategyInfo));
                    java.lang.String sz5 = tradeOrderStopParam.getSz();
                    if (sz5 == null || sz5.length() == 0) {
                        strKWHzl = C36014oMb.KWHzl(bizTradeStrategyInfo, java.lang.Boolean.FALSE, false);
                    } else {
                        strKWHzl = tradeOrderStopParam.getSz();
                        Intrinsics.copydefault((java.lang.Object) strKWHzl);
                    }
                    klineOpenOrderBean3.setAmountNoSign(strKWHzl);
                    klineOpenOrderBean3.setCTime(bizTradeStrategyInfo.getOrderCTime());
                    klineOpenOrderBean3.setPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C33129mqd.gEmmrt(C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderStopParam.getSlTriggerPx()) ? tradeOrderStopParam.getSlTriggerPx() : tradeOrderStopParam.getSlOrdPx())));
                    klineOpenOrderBean3.setOldPrice(klineOpenOrderBean3.getPrice());
                    java.lang.String slOrdPx = tradeOrderStopParam.getSlOrdPx();
                    if (slOrdPx == null) {
                        slOrdPx = "";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) slOrdPx, (java.lang.Object) this.KWHzl)) {
                        java.lang.String slOrdPx2 = tradeOrderStopParam.getSlOrdPx();
                        if (slOrdPx2 != null) {
                            strAEQbTJ = slOrdPx2;
                        }
                    } else {
                        java.lang.String orderInstType2 = bizTradeStrategyInfo.getOrderInstType();
                        java.lang.String slOrdPx3 = tradeOrderStopParam.getSlOrdPx();
                        strAEQbTJ = AEQbTJ(orderInstType2, slOrdPx3 != null ? slOrdPx3 : "");
                    }
                    klineOpenOrderBean3.setSlOrdPx(strAEQbTJ);
                    klineOpenOrderBean3.setSide(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderSide(), (java.lang.Object) "buy") ? "sell" : "buy");
                    klineOpenOrderBean3.setTriggerPxType(tradeOrderStopParam.getSlTriggerPxType());
                    klineOpenOrderBean3.setLineColor(bizTradeStrategyInfo.getOrderSide());
                    z = false;
                    klineOpenOrderBean3.setMainOrder(false);
                    klineOpenOrderBean3.setSupportDragAndCancel(false);
                    klineOpenOrderBean3.setMainPrice(AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), C36014oMb.AYXKKw(bizTradeStrategyInfo)));
                    arrayList.add(klineOpenOrderBean3);
                    this.zuBGHE.OLrzqt(klineOpenOrderBean3, (InterfaceC55726xpQ) bizTradeStrategyInfo, klineOpenOrderBean3.getMainPrice(), false);
                    klineOpenOrderBean.setHaveSL(true);
                } else {
                    bool = null;
                    z = false;
                }
                bool2 = bool;
                z2 = z;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ BizAllOrderReq getAllStrategyTypeRequestParams$default(C39562pug c39562pug, java.lang.String str, java.lang.String str2, StrategyType strategyType, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return c39562pug.AEQbTJ(str, str2, strategyType, str3);
    }

    public final BizAllOrderReq AEQbTJ(java.lang.String str, java.lang.String str2, StrategyType strategyType, java.lang.String str3) {
        return new BizAllOrderReq(str2, str, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE, null, null, null, null, null, null, str3, null, null, 7152, null);
    }

    public static /* synthetic */ Triple getRequestParam$default(C39562pug c39562pug, java.lang.String str, java.lang.String str2, StrategyType strategyType, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return c39562pug.KWHzl(str, str2, strategyType, str3);
    }

    public final Triple<java.lang.Boolean, BizTradeOrderReq, BizTradeStrategyOrderReq> KWHzl(java.lang.String str, java.lang.String str2, StrategyType strategyType, java.lang.String str3) {
        if (yDV.valueOf(new StrategyType[]{StrategyType.LIMIT, StrategyType.MARKET, StrategyType.ADVANCED_LIMIT}, strategyType)) {
            java.lang.String str4 = C56119xwm.EZpvd().get(strategyType);
            return new Triple<>(java.lang.Boolean.TRUE, new BizTradeOrderReq(str2, null, str, str4 == null ? "" : str4, "", false, true, null, null, null, null, null, str3, null, strategyType, null, null, null, 241536, null), null);
        }
        java.lang.String str5 = C56119xwm.EZpvd().get(strategyType);
        return new Triple<>(java.lang.Boolean.FALSE, null, new BizTradeStrategyOrderReq(str2, str, null, str5 == null ? "" : str5, "", false, true, null, null, null, null, null, strategyType, null, null, null, null, 126848, null));
    }

    public final java.util.ArrayList<OkxTradePositionBean> OLrzqt(java.lang.String str, java.util.List<TradePositionData> list, java.util.List<? extends TradePositionManager.PositionItem> list2) {
        C39562pug c39562pug = this;
        java.util.ArrayList<OkxTradePositionBean> arrayList = new java.util.ArrayList<>();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TradePositionData tradePositionData = (TradePositionData) obj;
            tradePositionData.setAvgPx(C33129mqd.gEmmrt(java.lang.Float.valueOf(c39562pug.KWHzl(str, C33129mqd.djBIcL(tradePositionData.getAvgPx())))));
            tradePositionData.setLiqPx(C33129mqd.gEmmrt(java.lang.Float.valueOf(c39562pug.KWHzl(str, C33129mqd.djBIcL(tradePositionData.getLiqPx())))));
            boolean zAEQbTJ = ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).AEQbTJ(c39562pug.AxsJAY.get(i));
            arrayList.add(new OkxTradePositionBean(i, tradePositionData.getInstId(), tradePositionData.getInstType(), tradePositionData.getLast(), tradePositionData.getPosCcy(), tradePositionData.getPosId(), tradePositionData.getPosSide(), c39562pug.EZpvd(tradePositionData), tradePositionData.getPos(), tradePositionData.getCcy(), tradePositionData.getImr(), tradePositionData.getMargin(), tradePositionData.getMgnMode(), tradePositionData.getLiqPx(), tradePositionData.getBePx(), tradePositionData.getAvgPx(), tradePositionData.getUpl(), tradePositionData.getUplRatio(), tradePositionData.getUplLastPx(), tradePositionData.getUplRatioLastPx(), zAEQbTJ));
            i++;
            c39562pug = this;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull TradePositionData tradePositionData) {
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo == null) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
            if (!Intrinsics.EZpvd((java.lang.Object) tradePositionData.getPosCcy(), (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                return tradePositionData.getPosCcy().length() == 0 ? "" : "sell";
            }
        }
        java.lang.String posSide = tradePositionData.getPosSide();
        int iHashCode = posSide.hashCode();
        if (iHashCode == 108957) {
            if (!posSide.equals("net")) {
                return "";
            }
            if (C33129mqd.AEQbTJ(tradePositionData.getPos()) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (C33129mqd.AEQbTJ(tradePositionData.getPos()) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return "";
                }
            }
        }
        if (iHashCode == 3327612) {
            return !posSide.equals("long") ? "" : "buy";
        }
        if (iHashCode != 109413500 || !posSide.equals("short")) {
            return "";
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return C33129mqd.gEmmrt(java.lang.Float.valueOf(KWHzl(str, C33129mqd.djBIcL(str2))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1231=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float KWHzl(java.lang.String str, float f) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xMW xmwKWHzl2;
        AbstractC54531xLw abstractC54531xLw;
        AbstractC54531xLw abstractC54531xLw2;
        if (!Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            switch (str.hashCode()) {
                case -2027980370:
                    str.equals("MARGIN");
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        AbstractC54531xLw abstractC54531xLw3 = this.EZpvd;
                        Intrinsics.copydefault(abstractC54531xLw3, "");
                        xLJ xlj = (xLJ) abstractC54531xLw3;
                        BizInstrument bizInstrumentValueOf = xlj.valueOf(this.fetchVPNInfo);
                        strAhwBna = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) strAhwBna);
                        return C33129mqd.djBIcL(xlj.gEmmrt(strAhwBna).AhwBna(C33129mqd.gEmmrt(java.lang.Float.valueOf(f))));
                    }
                    break;
                case 2552066:
                    str.equals("SPOT");
                    break;
                case 2558355:
                    if (str.equals("SWAP") && (abstractC54531xLw = this.EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo = this.uzCIH;
                        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId);
                        if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(abstractC54531xLw.valueOf(instrumentId)), (java.lang.Object) "inverse")) {
                            return f;
                        }
                        xLU xlu = (xLU) abstractC54531xLw;
                        BizInstrument bizInstrumentValueOf2 = xlu.valueOf(this.fetchVPNInfo);
                        strAhwBna = bizInstrumentValueOf2 != null ? bizInstrumentValueOf2.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) strAhwBna);
                        return C33129mqd.djBIcL(xlu.gEmmrt(strAhwBna).AhwBna(C33129mqd.gEmmrt(java.lang.Float.valueOf(f))));
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES") && (abstractC54531xLw2 = this.EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo2 = this.uzCIH;
                        java.lang.String instrumentId2 = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId2);
                        if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw2.copydefault(abstractC54531xLw2.valueOf(instrumentId2)), (java.lang.Object) "inverse")) {
                            return f;
                        }
                        xLC xlc = (xLC) abstractC54531xLw2;
                        BizInstrument bizInstrumentValueOf3 = xlc.valueOf(this.fetchVPNInfo);
                        strAhwBna = bizInstrumentValueOf3 != null ? bizInstrumentValueOf3.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) strAhwBna);
                        return C33129mqd.djBIcL(xlc.gEmmrt(strAhwBna).AhwBna(C33129mqd.gEmmrt(java.lang.Float.valueOf(f))));
                    }
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2027980370:
                    str.equals("MARGIN");
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) != null) {
                            strAhwBna = xmwKWHzl.AhwBna(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
                        }
                        return C33129mqd.djBIcL(strAhwBna);
                    }
                    break;
                case 2552066:
                    str.equals("SPOT");
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        AbstractC54531xLw abstractC54531xLw4 = this.EZpvd;
                        if (abstractC54531xLw4 != null) {
                            MarketCoinInfo marketCoinInfo3 = this.uzCIH;
                            java.lang.String instrumentId3 = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
                            Intrinsics.copydefault((java.lang.Object) instrumentId3);
                            if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw4.copydefault(abstractC54531xLw4.valueOf(instrumentId3)), (java.lang.Object) "inverse")) {
                                return f;
                            }
                            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            if (interfaceC49425uoM2 != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) != null && (xmwKWHzl2 = interfaceC54581xNrOLrzqt2.KWHzl()) != null) {
                                strAhwBna = xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
                            }
                            return C33129mqd.djBIcL(strAhwBna);
                        }
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                    }
                    break;
            }
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1299=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<HistoryOrderData> EZpvd(java.lang.String str, java.util.List<? extends java.util.List<java.lang.String>> list) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xMW xmwKWHzl2;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        xMW xmwKWHzl3;
        InterfaceC54577xNn interfaceC54577xNn4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4;
        xMW xmwKWHzl4;
        AbstractC54531xLw abstractC54531xLw;
        AbstractC54531xLw abstractC54531xLw2;
        java.util.ArrayList<HistoryOrderData> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        if (list != null) {
                            java.util.Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                java.util.List list2 = (java.util.List) it.next();
                                arrayList.add(new HistoryOrderData((java.lang.String) list2.get(0), (java.lang.String) list2.get(1), (java.lang.String) list2.get(2), (java.lang.String) list2.get(3), (java.lang.String) list2.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list2.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list2.get(4)))), null, null, false, false, 1920, null));
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION") && list != null) {
                        java.util.Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            java.util.List list3 = (java.util.List) it2.next();
                            java.lang.String str2 = (java.lang.String) list3.get(0);
                            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            java.lang.String strGEmmrt = C33129mqd.gEmmrt((interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt2.KWHzl()) == null) ? null : xmwKWHzl2.AhwBna((java.lang.String) list3.get(1)));
                            java.lang.String str3 = (java.lang.String) list3.get(2);
                            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            arrayList.add(new HistoryOrderData(str2, strGEmmrt, str3, C33129mqd.gEmmrt((interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null) ? null : xmwKWHzl.AhwBna((java.lang.String) list3.get(3))), (java.lang.String) list3.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list3.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list3.get(4)))), null, null, false, false, 1920, null));
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    break;
                case 2552066:
                    if (str.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        AbstractC54531xLw abstractC54531xLw3 = this.EZpvd;
                        if (abstractC54531xLw3 != null) {
                            MarketCoinInfo marketCoinInfo = this.uzCIH;
                            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                            Intrinsics.copydefault((java.lang.Object) instrumentId);
                            if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw3.copydefault(abstractC54531xLw3.valueOf(instrumentId)), (java.lang.Object) "inverse")) {
                                if (list != null) {
                                    java.util.Iterator<T> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        java.util.List list4 = (java.util.List) it3.next();
                                        arrayList.add(new HistoryOrderData((java.lang.String) list4.get(0), (java.lang.String) list4.get(1), (java.lang.String) list4.get(2), (java.lang.String) list4.get(3), (java.lang.String) list4.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list4.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list4.get(4)))), null, null, false, false, 1920, null));
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } else if (list != null) {
                                java.util.Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    java.util.List list5 = (java.util.List) it4.next();
                                    java.lang.String str4 = (java.lang.String) list5.get(0);
                                    InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                    java.lang.String strGEmmrt2 = C33129mqd.gEmmrt((interfaceC49425uoM3 == null || (interfaceC54577xNn4 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt4 = interfaceC54577xNn4.OLrzqt()) == null || (xmwKWHzl4 = interfaceC54581xNrOLrzqt4.KWHzl()) == null) ? null : xmwKWHzl4.AhwBna((java.lang.String) list5.get(1)));
                                    java.lang.String str5 = (java.lang.String) list5.get(2);
                                    InterfaceC49425uoM interfaceC49425uoM4 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                    arrayList.add(new HistoryOrderData(str4, strGEmmrt2, str5, C33129mqd.gEmmrt((interfaceC49425uoM4 == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM4.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) == null || (xmwKWHzl3 = interfaceC54581xNrOLrzqt3.KWHzl()) == null) ? null : xmwKWHzl3.AhwBna((java.lang.String) list5.get(3))), (java.lang.String) list5.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list5.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list5.get(4)))), null, null, false, false, 1920, null));
                                }
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                    }
                    break;
            }
            Unit unit5 = Unit.INSTANCE;
        } else {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        if (list != null) {
                            java.util.Iterator<T> it5 = list.iterator();
                            while (it5.hasNext()) {
                                java.util.List list6 = (java.util.List) it5.next();
                                arrayList.add(new HistoryOrderData((java.lang.String) list6.get(0), (java.lang.String) list6.get(1), (java.lang.String) list6.get(2), (java.lang.String) list6.get(3), (java.lang.String) list6.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list6.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list6.get(4)))), null, null, false, false, 1920, null));
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        AbstractC54531xLw abstractC54531xLw4 = this.EZpvd;
                        Intrinsics.copydefault(abstractC54531xLw4, "");
                        xLJ xlj = (xLJ) abstractC54531xLw4;
                        BizInstrument bizInstrumentValueOf = xlj.valueOf(this.fetchVPNInfo);
                        java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) instFamily);
                        if (list != null) {
                            java.util.Iterator<T> it6 = list.iterator();
                            while (it6.hasNext()) {
                                java.util.List list7 = (java.util.List) it6.next();
                                arrayList.add(new HistoryOrderData((java.lang.String) list7.get(0), xlj.gEmmrt(instFamily).AhwBna((java.lang.String) list7.get(1)), (java.lang.String) list7.get(2), xlj.gEmmrt(instFamily).AhwBna((java.lang.String) list7.get(3)), (java.lang.String) list7.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list7.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list7.get(4)))), null, null, false, false, 1920, null));
                            }
                            Unit unit7 = Unit.INSTANCE;
                        }
                    }
                    break;
                case 2552066:
                    if (str.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP") && (abstractC54531xLw = this.EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo2 = this.uzCIH;
                        java.lang.String instrumentId2 = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId2);
                        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(abstractC54531xLw.valueOf(instrumentId2)), (java.lang.Object) "inverse")) {
                            xLU xlu = (xLU) abstractC54531xLw;
                            BizInstrument bizInstrumentValueOf2 = xlu.valueOf(this.fetchVPNInfo);
                            java.lang.String instFamily2 = bizInstrumentValueOf2 != null ? bizInstrumentValueOf2.getInstFamily() : null;
                            Intrinsics.copydefault((java.lang.Object) instFamily2);
                            if (list != null) {
                                java.util.Iterator<T> it7 = list.iterator();
                                while (it7.hasNext()) {
                                    java.util.List list8 = (java.util.List) it7.next();
                                    arrayList.add(new HistoryOrderData((java.lang.String) list8.get(0), xlu.gEmmrt(instFamily2).AhwBna((java.lang.String) list8.get(1)), (java.lang.String) list8.get(2), xlu.gEmmrt(instFamily2).AhwBna((java.lang.String) list8.get(3)), (java.lang.String) list8.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list8.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list8.get(4)))), null, null, false, false, 1920, null));
                                }
                                Unit unit8 = Unit.INSTANCE;
                            }
                        } else if (list != null) {
                            java.util.Iterator<T> it8 = list.iterator();
                            while (it8.hasNext()) {
                                java.util.List list9 = (java.util.List) it8.next();
                                arrayList.add(new HistoryOrderData((java.lang.String) list9.get(0), (java.lang.String) list9.get(1), (java.lang.String) list9.get(2), (java.lang.String) list9.get(3), (java.lang.String) list9.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list9.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list9.get(4)))), null, null, false, false, 1920, null));
                            }
                            Unit unit9 = Unit.INSTANCE;
                        }
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES") && (abstractC54531xLw2 = this.EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo3 = this.uzCIH;
                        java.lang.String instrumentId3 = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId3);
                        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw2.copydefault(abstractC54531xLw2.valueOf(instrumentId3)), (java.lang.Object) "inverse")) {
                            xLC xlc = (xLC) abstractC54531xLw2;
                            BizInstrument bizInstrumentValueOf3 = xlc.valueOf(this.fetchVPNInfo);
                            java.lang.String instFamily3 = bizInstrumentValueOf3 != null ? bizInstrumentValueOf3.getInstFamily() : null;
                            Intrinsics.copydefault((java.lang.Object) instFamily3);
                            if (list != null) {
                                java.util.Iterator<T> it9 = list.iterator();
                                while (it9.hasNext()) {
                                    java.util.List list10 = (java.util.List) it9.next();
                                    arrayList.add(new HistoryOrderData((java.lang.String) list10.get(0), xlc.gEmmrt(instFamily3).AhwBna((java.lang.String) list10.get(1)), (java.lang.String) list10.get(2), xlc.gEmmrt(instFamily3).AhwBna((java.lang.String) list10.get(3)), (java.lang.String) list10.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list10.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list10.get(4)))), null, null, false, false, 1920, null));
                                }
                                Unit unit10 = Unit.INSTANCE;
                            }
                        } else if (list != null) {
                            java.util.Iterator<T> it10 = list.iterator();
                            while (it10.hasNext()) {
                                java.util.List list11 = (java.util.List) it10.next();
                                arrayList.add(new HistoryOrderData((java.lang.String) list11.get(0), (java.lang.String) list11.get(1), (java.lang.String) list11.get(2), (java.lang.String) list11.get(3), (java.lang.String) list11.get(4), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list11.get(2)))), C33069mpW.copydefault(C35964oKf.Fragment.OTwTPd, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", list11.get(4)))), null, null, false, false, 1920, null));
                            }
                            Unit unit11 = Unit.INSTANCE;
                        }
                    }
                    break;
            }
            Unit unit12 = Unit.INSTANCE;
        }
        return arrayList;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull final java.lang.String str, java.lang.String str2, java.lang.String str3, final boolean z, final Function1<? super java.lang.String, Unit> function1) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            C36246oUr.copydefault().isConnected(true);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(marketCoinInfo.getInstrumentId());
            java.lang.String underlying = bizInstrumentValueOf != null ? bizInstrumentValueOf.getUnderlying() : null;
            InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            java.lang.String str4 = this.getFieldNames;
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "TYPE_KLINE")) {
                this.AuCTel = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getHistoryMarketCandles$default((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null), marketCoinInfo.getInstrumentId(), str, str2, str3, null, 16, null), lifecycleOwner), new Function1() { // from class: o.pvr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.djBIcL(function1, (java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.pvt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.EZpvd(z, this, marketCoinInfo, str, function1, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                this.AuCTel = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getHistoryMarketIndexCandles$default((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null), underlying == null ? "" : underlying, str, str2, str3, null, 16, null), lifecycleOwner), new Function1() { // from class: o.pvu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.AEQbTJ(function1, (java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.pvx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.OLrzqt(z, this, marketCoinInfo, str, function1, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
            } else {
                this.AuCTel = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getHistoryMarketPriceCandles$default((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null), marketCoinInfo.getInstrumentId(), str, str2, str3, null, 16, null), lifecycleOwner), new Function1() { // from class: o.pvv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.AYXKKw(function1, (java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.pvz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.AYXKKw(z, this, marketCoinInfo, str, function1, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
            }
        }
    }

    public static final Unit EZpvd(boolean z, C39562pug c39562pug, MarketCoinInfo marketCoinInfo, java.lang.String str, Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (z) {
            java.lang.String strEZpvd = c39562pug.EZpvd((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType(), str);
            if (function1 != null) {
                function1.invoke(strEZpvd);
            }
        } else {
            c39562pug.OLrzqt((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                if (function1 != null) {
                    function1.invoke("");
                }
            } else if (function1 != null) {
                java.util.List list = (java.util.List) responseData.getData();
                function1.invoke(C33129mqd.gEmmrt(list != null ? java.lang.Integer.valueOf(list.size()) : null));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke(MultiTransferSignData.DEFAULT_INTERVAL);
        }
        C36246oUr.copydefault().isConnected(false);
        pUU.KWHzl("MarketDetailPresent", "getHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(boolean z, C39562pug c39562pug, MarketCoinInfo marketCoinInfo, java.lang.String str, Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (z) {
            java.lang.String strEZpvd = c39562pug.EZpvd((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType(), str);
            if (function1 != null) {
                function1.invoke(strEZpvd);
            }
        } else {
            c39562pug.OLrzqt((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                if (function1 != null) {
                    function1.invoke("");
                }
            } else if (function1 != null) {
                java.util.List list = (java.util.List) responseData.getData();
                function1.invoke(C33129mqd.gEmmrt(list != null ? java.lang.Integer.valueOf(list.size()) : null));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke("");
        }
        C36246oUr.copydefault().isConnected(false);
        pUU.KWHzl("MarketDetailPresent", "getHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(boolean z, C39562pug c39562pug, MarketCoinInfo marketCoinInfo, java.lang.String str, Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (z) {
            java.lang.String strEZpvd = c39562pug.EZpvd((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType(), str);
            if (function1 != null) {
                function1.invoke(strEZpvd);
            }
        } else {
            c39562pug.OLrzqt((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                if (function1 != null) {
                    function1.invoke("");
                }
            } else if (function1 != null) {
                java.util.List list = (java.util.List) responseData.getData();
                function1.invoke(C33129mqd.gEmmrt(list != null ? java.lang.Integer.valueOf(list.size()) : null));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke("");
        }
        C36246oUr.copydefault().isConnected(false);
        pUU.KWHzl("MarketDetailPresent", "getHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        double dDXXBbs = C36246oUr.copydefault().DXXBbs();
        if (str2 == null) {
            str2 = oLT.djBIcL();
        }
        return C33129mqd.addS$default(str, java.lang.Double.valueOf(dDXXBbs * C33129mqd.addD$default(str2, 1, null, null, null, 14, null)), null, null, null, 14, null);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, Function1<? super java.lang.String, Unit> function1) {
        java.lang.String str4;
        java.lang.String underlying;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            C36246oUr.copydefault().values(true);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(marketCoinInfo.getInstrumentId());
            if (bizInstrumentValueOf != null) {
                underlying = bizInstrumentValueOf.getUnderlying();
                str4 = str3;
            } else {
                str4 = str3;
                underlying = null;
            }
            java.lang.String strCopydefault = copydefault(str2, str4);
            InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            java.lang.String str5 = this.getFieldNames;
            if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "TYPE_KLINE")) {
                this.iwGUEr = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getHistoryMarketCandles(marketCoinInfo.getInstrumentId(), str, strCopydefault, str3, str2), lifecycleOwner), new Function1() { // from class: o.puq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.AhwBna((java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.pus
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.AhwBna(this.EZpvd, marketCoinInfo, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                if (underlying == null) {
                    underlying = "";
                }
                this.iwGUEr = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getHistoryMarketIndexCandles$default(klineBizMarketService, underlying, str, null, str3, str2, 4, null), lifecycleOwner), new Function1() { // from class: o.pur
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.djBIcL((java.lang.Throwable) obj);
                    }
                }, (Function0) null, new Function1() { // from class: o.puy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.djBIcL(this.AEQbTJ, marketCoinInfo, (ResponseData) obj);
                    }
                }, 2, (java.lang.Object) null);
                return;
            }
            this.iwGUEr = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getHistoryMarketPriceCandles$default((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null), marketCoinInfo.getInstrumentId(), str, null, str3, str2, 4, null), lifecycleOwner), new Function1() { // from class: o.pux
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.valueOf((java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.puz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.AYXKKw(this.copydefault, marketCoinInfo, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AhwBna(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c39562pug.KWHzl((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C36246oUr.copydefault().values(false);
        pUU.copydefault("MarketDetailPresent", "getRightHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c39562pug.KWHzl((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C36246oUr.copydefault().values(false);
        pUU.KWHzl("MarketDetailPresent", "getRightHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c39562pug.KWHzl((ResponseData<java.util.List<java.util.List<java.lang.String>>>) responseData, marketCoinInfo.getInstrumentType());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C36246oUr.copydefault().values(false);
        pUU.KWHzl("MarketDetailPresent", "getRightHistoryMarketCandles: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            Job job = this.fIwbmz;
            if (job == null || !job.isActive()) {
                C36246oUr.copydefault().isConnected(true);
                InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                Job job2 = this.fIwbmz;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.fIwbmz = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarketDetailPresent$getHistoryFormulaCandles$1$1(str, str2, str3, str4, str5, this, marketCoinInfo, null), 3, null);
            }
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList, int i, boolean z, Function1<? super java.util.ArrayList<CompareCandlesItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Job job = this.DbNXlk;
        if (job == null || !job.isActive()) {
            C36246oUr.copydefault().isConnected(false);
            C36246oUr.copydefault().KWHzl();
            Job job2 = this.DbNXlk;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (MarketCoinInfo marketCoinInfo : arrayList) {
                CompareCandlesReq compareCandlesReq = new CompareCandlesReq(null, null, null, null, null, 0, 63, null);
                compareCandlesReq.setInstId(marketCoinInfo.getInstrumentId());
                compareCandlesReq.setBar(copydefault(i));
                compareCandlesReq.setLimit(C33129mqd.AhwBna("1440"));
                arrayList2.add(compareCandlesReq);
            }
            this.DbNXlk = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarketDetailPresent$getCompareCandles$1(arrayList2, this, arrayList, function1, null), 3, null);
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Job job = this.values;
        if (job == null || !job.isActive()) {
            C36246oUr.copydefault().isConnected(true);
            Job job2 = this.values;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (MarketCoinInfo marketCoinInfo : arrayList) {
                CompareCandlesReq compareCandlesReq = new CompareCandlesReq(null, null, null, null, null, 0, 63, null);
                compareCandlesReq.setInstId(marketCoinInfo.getInstrumentId());
                compareCandlesReq.setBar(copydefault(i));
                compareCandlesReq.setAfter(str);
                compareCandlesReq.setLimit(C33129mqd.AhwBna(oLT.djBIcL()));
                arrayList2.add(compareCandlesReq);
            }
            this.values = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarketDetailPresent$getCompareHistoryCandles$1(arrayList2, this, arrayList, null), 3, null);
        }
    }

    public final void OLrzqt(ResponseData<java.util.ArrayList<CompareCandlesItem>> responseData, java.util.ArrayList<MarketCoinInfo> arrayList) {
        java.util.ArrayList<CompareCandlesItem> data = responseData.getData();
        if (data != null) {
            for (CompareCandlesItem compareCandlesItem : data) {
                java.util.List<oLY> listDataToOkxProRawDataItem = compareCandlesItem.dataToOkxProRawDataItem();
                java.util.List<oLY> listOLrzqt = OLrzqt(AEQbTJ(arrayList, compareCandlesItem.getInstId()), listDataToOkxProRawDataItem, compareCandlesItem.getInstId());
                java.lang.String instId = compareCandlesItem.getInstId();
                MarketCoinInfo marketCoinInfo = this.uzCIH;
                if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null))) {
                    InterfaceC39563puh.Application application = this.wlaJM;
                    if (application != null) {
                        application.AYXKKw(C56405yEd.hDKMBd(listOLrzqt));
                    }
                    InterfaceC39563puh.Application application2 = this.wlaJM;
                    if (application2 != null) {
                        application2.copydefault(listDataToOkxProRawDataItem);
                    }
                } else {
                    InterfaceC39563puh.Application application3 = this.wlaJM;
                    if (application3 != null) {
                        application3.KWHzl(compareCandlesItem.getInstId(), C56405yEd.hDKMBd(listOLrzqt));
                    }
                }
            }
            InterfaceC39563puh.Application application4 = this.wlaJM;
            if (application4 != null) {
                application4.valueOf();
            }
            InterfaceC39563puh.Application application5 = this.wlaJM;
            if (application5 != null) {
                application5.copydefault(arrayList);
            }
        }
    }

    public final void copydefault(ResponseData<java.util.ArrayList<CompareCandlesItem>> responseData, java.util.ArrayList<MarketCoinInfo> arrayList) {
        java.util.ArrayList<CompareCandlesItem> data = responseData.getData();
        if (data != null) {
            for (CompareCandlesItem compareCandlesItem : data) {
                java.util.List<? extends oLY> listConvertData$default = convertData$default(this, AEQbTJ(arrayList, compareCandlesItem.getInstId()), compareCandlesItem.dataToOkxProRawDataItem(), null, 4, null);
                java.lang.String instId = compareCandlesItem.getInstId();
                MarketCoinInfo marketCoinInfo = this.uzCIH;
                if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null))) {
                    InterfaceC39563puh.Application application = this.wlaJM;
                    if (application != null) {
                        application.AhwBna(listConvertData$default);
                    }
                    if (listConvertData$default.size() < C33129mqd.AhwBna(oLT.djBIcL())) {
                        C36246oUr.copydefault().isConnected(true);
                    } else {
                        C36246oUr.copydefault().isConnected(false);
                    }
                } else {
                    InterfaceC39563puh.Application application2 = this.wlaJM;
                    if (application2 != null) {
                        application2.KWHzl(compareCandlesItem.getInstId(), C56405yEd.hDKMBd(listConvertData$default));
                    }
                }
            }
            InterfaceC39563puh.Application application3 = this.wlaJM;
            if (application3 != null) {
                application3.valueOf();
            }
        }
    }

    public final java.lang.String AEQbTJ(java.util.ArrayList<MarketCoinInfo> arrayList, java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((MarketCoinInfo) next).getInstrumentId(), (java.lang.Object) str)) {
                break;
            }
        }
        MarketCoinInfo marketCoinInfo = (MarketCoinInfo) next;
        if (marketCoinInfo != null) {
            return marketCoinInfo.getInstrumentType();
        }
        return oLT.fetchVPNInfo();
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getDrawingData(str, str2), lifecycleOwner), new Function1() { // from class: o.puH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.puI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C39562pug c39562pug, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.ODXsMY();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull JsonObject jsonObject, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).uploadDrawingData(new KlineDrawingDataReq(str, jsonObject)), lifecycleOwner), new Function1() { // from class: o.puF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.copydefault(this.OLrzqt, z, z2, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.puS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.AEQbTJ(this.KWHzl, z, z2, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C39562pug c39562pug, boolean z, boolean z2, ResponseData responseData) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(responseData, "");
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) {
                str = "0";
            }
            application.KWHzl(true, z, z2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C39562pug c39562pug, boolean z, boolean z2, java.lang.Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            InterfaceC39563puh.Application.C0921Application.uploadDrawingDataCallBack$default(application, false, z, z2, null, 8, null);
        }
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            pUU.copydefault("OKKLine", "uploadDrawingData: code = " + code + "errorMessage = " + ((response == null || (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) ? null : asJsonPrimitive.getAsString()));
        } else {
            pUU.copydefault("OKKLine", "uploadDrawingData: error+" + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull IndicatorDataReq indicatorDataReq) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(indicatorDataReq, "");
        java.util.ArrayList<IndicatorDataReq> arrayList = new java.util.ArrayList<>();
        arrayList.add(indicatorDataReq);
        EZpvd(lifecycleOwner, arrayList);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<IndicatorDataReq> arrayList) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).uploadIndicatorData(arrayList), lifecycleOwner), new Function1() { // from class: o.pvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.values((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.copydefault((ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        SPUtils.put("kline_indicator_version", responseData.getData());
        return Unit.INSTANCE;
    }

    public static final Unit values(java.lang.Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            pUU.copydefault("ChartView", "uploadIndicatorDataList: code = " + code + "errorMessage = " + ((response == null || (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) ? null : asJsonPrimitive.getAsString()));
        } else {
            pUU.copydefault("ChartView", "uploadIndicatorDataList: error+" + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            java.lang.String instrumentType = marketCoinInfo.getInstrumentType();
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    str = "MARGIN";
                    break;
                case 2552066:
                    str = "SPOT";
                    break;
                case 2558355:
                    str = "SWAP";
                    break;
                case 214415088:
                    str = "FUTURES";
                    break;
                default:
                    C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getListByInstrument(null, null), lifecycleOwner), new Function1() { // from class: o.pvo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C39562pug.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
                        }
                    }, (Function0) null, new Function1() { // from class: o.pvp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C39562pug.valueOf(this.copydefault, marketCoinInfo, (ResponseData) obj);
                        }
                    }, 2, (java.lang.Object) null);
            }
            instrumentType.equals(str);
            C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getListByInstrument(null, null), lifecycleOwner), new Function1() { // from class: o.pvo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pvp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.valueOf(this.copydefault, marketCoinInfo, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(C39562pug c39562pug, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c39562pug.copydefault = 0;
        InterfaceC39563puh.Application application = c39562pug.wlaJM;
        if (application != null) {
            application.OLrzqt(new java.util.ArrayList<>());
        }
        pUU.copydefault("wwwwww", "getPriceWarningList: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<PriceWarningItemBean> EZpvd(java.util.ArrayList<AlertRemindPo> arrayList) {
        AbstractC54531xLw abstractC54531xLw;
        java.lang.String instFamily;
        java.util.ArrayList<PriceWarningItemBean> arrayList2 = new java.util.ArrayList<>();
        for (AlertRemindPo alertRemindPo : arrayList) {
            if (alertRemindPo.getSourceType() == 1) {
                arrayList2.add(new PriceWarningItemBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(alertRemindPo.getRuleId())), 0, alertRemindPo.getInstrumentName(), alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), alertRemindPo.getPromptThreshold(), 0L, false, alertRemindPo.getActive(), false, 0, 1730, (DefaultConstructorMarker) null));
            }
        }
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP")) {
                AbstractC54531xLw abstractC54531xLw2 = this.EZpvd;
                if (abstractC54531xLw2 != null && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw2.copydefault(abstractC54531xLw2.valueOf(marketCoinInfo.getInstrumentId())), (java.lang.Object) "inverse")) {
                    Intrinsics.copydefault(abstractC54531xLw2, "");
                    xLU xlu = (xLU) abstractC54531xLw2;
                    BizInstrument bizInstrumentValueOf = xlu.valueOf(this.fetchVPNInfo);
                    instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                    Intrinsics.copydefault((java.lang.Object) instFamily);
                    xMS xmsGEmmrt = xlu.gEmmrt(instFamily);
                    for (PriceWarningItemBean priceWarningItemBean : arrayList2) {
                        priceWarningItemBean.setPromptThreshold(C33129mqd.gEmmrt(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(priceWarningItemBean.getPromptThreshold()))));
                    }
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES") && (abstractC54531xLw = this.EZpvd) != null && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(abstractC54531xLw.valueOf(marketCoinInfo.getInstrumentId())), (java.lang.Object) "inverse")) {
                Intrinsics.copydefault(abstractC54531xLw, "");
                xLC xlc = (xLC) abstractC54531xLw;
                BizInstrument bizInstrumentValueOf2 = xlc.valueOf(this.fetchVPNInfo);
                instFamily = bizInstrumentValueOf2 != null ? bizInstrumentValueOf2.getInstFamily() : null;
                Intrinsics.copydefault((java.lang.Object) instFamily);
                xMS xmsGEmmrt2 = xlc.gEmmrt(instFamily);
                for (PriceWarningItemBean priceWarningItemBean2 : arrayList2) {
                    priceWarningItemBean2.setPromptThreshold(C33129mqd.gEmmrt(xmsGEmmrt2.AhwBna(C33129mqd.gEmmrt(priceWarningItemBean2.getPromptThreshold()))));
                }
            }
        }
        return arrayList2;
    }

    public final java.util.List<BizKLineData> OLrzqt(java.util.List<? extends java.util.List<java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<? extends java.util.List<java.lang.String>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BizKLineData.Companion.EZpvd(it.next()));
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull KlineFormulaData klineFormulaData, int i, boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(klineFormulaData, "");
        C36246oUr.copydefault().isConnected(false);
        C36246oUr.copydefault().KWHzl();
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = true;
        Job job = this.AhwBna;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AhwBna = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarketDetailPresent$loadFormulaKline$1(lifecycleOwner, this, klineFormulaData, i, booleanRef2, function1, z, booleanRef, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // o.InterfaceC39563puh.StateListAnimator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, int i, @NotNull final java.util.ArrayList<MarketCoinInfo> arrayList) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        AbstractC58185ywX abstractC58185ywXKWHzl;
        AbstractC58185ywX abstractC58185ywXKWHzl2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        InterfaceC58217yxC interfaceC58217yxC = this.getNewProxyInstance;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MarketCoinInfo) it.next()).getInstrumentId());
        }
        java.util.ArrayList<java.lang.String> arrayList3 = (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList2, new java.util.ArrayList());
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = java.lang.System.currentTimeMillis();
        AbstractC58185ywX<java.util.Map<java.lang.String, java.util.List<oLY>>> abstractC58185ywXAEQbTJ = this.AubY.AEQbTJ(arrayList3, KWHzl(i));
        if (abstractC58185ywXAEQbTJ == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, lifecycleOwner)) == null || (abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(yBP.AEQbTJ())) == null) {
            interfaceC58217yxCAEQbTJ = null;
        } else {
            final Function1 function1 = new Function1() { // from class: o.pvi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.OLrzqt(this.OLrzqt, arrayList, (java.util.Map) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pvf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C39562pug.zsXlph(function1, obj);
                }
            });
            if (abstractC58185ywXAEQbTJ2 != null && (abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ2.KWHzl(C58266yxz.OLrzqt())) != null) {
                final Function1 function12 = new Function1() { // from class: o.pvj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.EZpvd(longRef, this, (java.util.List) obj);
                    }
                };
                interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pvl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39562pug.AubY(function12, obj);
                    }
                });
            }
        }
        this.getNewProxyInstance = interfaceC58217yxCAEQbTJ;
    }

    public static final java.util.List zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Ref.LongRef longRef, C39562pug c39562pug, java.util.List list) {
        java.lang.String str;
        java.lang.System.currentTimeMillis();
        long j = longRef.element;
        list.size();
        longRef.element = java.lang.System.currentTimeMillis();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.List<? extends oLY> list2 = (java.util.List) ((kotlin.Pair) it.next()).component2();
            oLY oly = (oLY) CollectionsKt___CollectionsKt.firstOrNull(list2);
            if (oly != null && (str = oly.uzCIH) != null) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c39562pug.fetchVPNInfo)) {
                    InterfaceC39563puh.Application application = c39562pug.wlaJM;
                    if (application != null) {
                        application.AYXKKw(list2);
                    }
                } else {
                    InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
                    if (application2 != null) {
                        application2.KWHzl(str, list2);
                    }
                }
            }
        }
        InterfaceC39563puh.Application application3 = c39562pug.wlaJM;
        if (application3 != null) {
            application3.valueOf();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.getNewProxyInstance;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, final int i, final boolean z, boolean z2, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> abstractC58185ywXKWHzl;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String underlying;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        C36246oUr.copydefault().values(false);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = !z2;
        if (z2) {
            C36246oUr.copydefault().isConnected(false);
            C36246oUr.copydefault().KWHzl();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.iwGUEr;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        final MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            java.lang.String instrumentId = marketCoinInfo.getInstrumentId();
            java.lang.String str2 = null;
            if (!Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                instrumentId = null;
            }
            if (instrumentId != null) {
                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instrumentId)) != null && (underlying = bizInstrumentValueOf.getUnderlying()) != null) {
                    str = underlying;
                }
                str2 = str;
            }
            InterfaceC58217yxC interfaceC58217yxC3 = this.ejfBZ;
            if (interfaceC58217yxC3 != null) {
                interfaceC58217yxC3.dispose();
            }
            if (i == -2) {
                C38358pVv c38358pVv = this.AubY;
                if (str2 == null) {
                    str2 = this.fetchVPNInfo;
                }
                abstractC58185ywXKWHzl = c38358pVv.KWHzl(lifecycleOwner, str2);
            } else {
                C38358pVv c38358pVv2 = this.AubY;
                java.lang.String str3 = this.getFieldNames;
                if (str2 == null) {
                    str2 = this.fetchVPNInfo;
                }
                abstractC58185ywXKWHzl = c38358pVv2.KWHzl(str3, str2, KWHzl(i), z2);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl, lifecycleOwner).KWHzl(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.pvw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.EZpvd(function1, z, this, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pvy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C39562pug.DbNXlk(function12, obj);
                }
            }).KWHzl(yBP.KWHzl());
            final Function1 function13 = new Function1() { // from class: o.pvB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.EZpvd(i, this, marketCoinInfo, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.puk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C39562pug.AuCTel(function13, obj);
                }
            }).KWHzl(C58266yxz.OLrzqt());
            final Function1 function14 = new Function1() { // from class: o.pup
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.KWHzl(this.AEQbTJ, booleanRef, i, (java.util.List) obj);
                }
            };
            this.ejfBZ = abstractC58185ywXKWHzl4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pul
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39562pug.fIwbmz(function14, obj);
                }
            });
        }
    }

    public static final kotlin.Pair DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(Function1 function1, boolean z, C39562pug c39562pug, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) ((java.util.List) pair.getFirst()).get(0)).booleanValue()) {
            if (function1 != null) {
                function1.invoke(((java.util.List) pair.getFirst()).get(1));
            }
            if (!((java.lang.Boolean) ((java.util.List) pair.getFirst()).get(1)).booleanValue()) {
                if (z) {
                    InterfaceC39563puh.Application application = c39562pug.wlaJM;
                    if (application != null) {
                        application.gwTjWJ();
                    }
                } else {
                    InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
                    if (application2 != null) {
                        application2.RKDWNf();
                    }
                }
            }
        }
        return pair;
    }

    public static final java.util.List AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(int i, C39562pug c39562pug, MarketCoinInfo marketCoinInfo, kotlin.Pair pair) {
        java.util.List<oLY> listConvertData$default;
        Intrinsics.checkNotNullParameter(pair, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (i == -2) {
            listConvertData$default = c39562pug.KWHzl(marketCoinInfo.getInstrumentType(), (java.util.List<? extends oLY>) pair.getSecond());
        } else {
            listConvertData$default = convertData$default(c39562pug, marketCoinInfo.getInstrumentType(), (java.util.List) pair.getSecond(), null, 4, null);
        }
        C33129mqd.subS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(jCurrentTimeMillis), null, null, null, 14, null);
        return listConvertData$default;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C39562pug c39562pug, Ref.BooleanRef booleanRef, int i, java.util.List list) {
        InterfaceC39563puh.Application application;
        com.okinc.kline.library.data.DataSource dataSource;
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList;
        InterfaceC39563puh.Application application2;
        InterfaceC39563puh.Application application3 = c39562pug.wlaJM;
        if (application3 != null) {
            Intrinsics.copydefault(list);
            application3.AYXKKw(list);
        }
        if (C33129mqd.KWHzl((java.util.Collection) list) && !booleanRef.element && (dataSource = C36246oUr.copydefault().sSMYrx().get("ds0")) != null && (dataArrayList = dataSource.AEQbTJ) != null && dataArrayList.size() > 0) {
            booleanRef.element = true;
            if (i != -2 && (application2 = c39562pug.wlaJM) != null) {
                Intrinsics.copydefault(list);
                application2.copydefault((java.util.List<? extends oLY>) list);
            }
            C36246oUr.copydefault().iwGUEr().AEQbTJ(((oLY) list.get(list.size() - 1)).KWHzl);
        } else if ((list == null || list.isEmpty()) && !booleanRef.element && (application = c39562pug.wlaJM) != null) {
            application.RKDWNf();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.List convertData$default(C39562pug c39562pug, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return c39562pug.OLrzqt(str, (java.util.List<? extends oLY>) list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2421=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r49v0, resolved type: java.util.List<? extends o.oLY> */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0705, code lost:
    
        if (r0.equals("MARGIN") == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03f8, code lost:
    
        if (r0.equals("MARGIN") == false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0483 A[PHI: r0
  0x0483: PHI (r0v21 java.lang.String) = (r0v20 java.lang.String), (r0v35 java.lang.String) binds: [B:93:0x047f, B:90:0x0475] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<oLY> OLrzqt(final java.lang.String str, java.util.List<? extends oLY> list, java.lang.String str2) {
        final java.lang.String str3;
        java.lang.String str4;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        final java.lang.String str5;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        java.lang.String str6;
        final java.lang.String str7;
        final C39562pug c39562pug;
        AbstractC54531xLw abstractC54531xLw;
        AbstractC54531xLw abstractC54531xLw2;
        final C39562pug c39562pug2 = this;
        final java.lang.String str8 = str;
        final java.lang.String str9 = str2.length() == 0 ? c39562pug2.fetchVPNInfo : str2;
        if (Intrinsics.EZpvd((java.lang.Object) c39562pug2.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            java.lang.String str10 = str9;
            switch (str.hashCode()) {
                case -2027980370:
                    str3 = str;
                    str4 = str10;
                    break;
                case -1956807563:
                    final java.lang.String str11 = str;
                    java.lang.String str12 = str10;
                    if (str11.equals("OPTION")) {
                        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        xMW xmwKWHzl = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt.KWHzl();
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly : list) {
                            final java.lang.String str13 = str12;
                            java.util.ArrayList arrayList2 = arrayList;
                            oLY oly2 = new oLY(str13, str, oly.EZpvd, C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl != null ? xmwKWHzl.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.valueOf))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl != null ? xmwKWHzl.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.copydefault))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl != null ? xmwKWHzl.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.OLrzqt))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl != null ? xmwKWHzl.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl))) : null)), oly.djBIcL, oly.AhwBna, oly.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.AuCTel(oly, this, str13, str11);
                                }
                            }));
                            oly2.AEQbTJ = oly.KWHzl;
                            arrayList2.add(oly2);
                            arrayList = arrayList2;
                            xmwKWHzl = xmwKWHzl;
                            str12 = str13;
                            str11 = str;
                        }
                        return arrayList;
                    }
                    Unit unit = Unit.INSTANCE;
                    break;
                case 2552066:
                    str3 = str;
                    if (str3.equals("SPOT")) {
                        str4 = str10;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly3 : list) {
                            java.util.ArrayList arrayList4 = arrayList3;
                            final java.lang.String str14 = str4;
                            oLY oly4 = new oLY(str14, str, oly3.EZpvd, oly3.valueOf, oly3.copydefault, oly3.OLrzqt, oly3.KWHzl, oly3.djBIcL, oly3.AhwBna, oly3.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puV
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.fARcdN(oly3, this, str14, str3);
                                }
                            }));
                            oly4.AEQbTJ = oly3.KWHzl;
                            arrayList4.add(oly4);
                            arrayList3 = arrayList4;
                            str4 = str14;
                            str3 = str;
                        }
                        return arrayList3;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case 2558355:
                    str5 = str;
                    if (str5.equals("SWAP")) {
                        final C39562pug c39562pug3 = this;
                        AbstractC54531xLw abstractC54531xLw3 = c39562pug3.EZpvd;
                        if (abstractC54531xLw3 != null) {
                            MarketCoinInfo marketCoinInfo = c39562pug3.uzCIH;
                            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                            Intrinsics.copydefault((java.lang.Object) instrumentId);
                            if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw3.copydefault(abstractC54531xLw3.valueOf(instrumentId)), (java.lang.Object) "inverse")) {
                                java.lang.String str15 = str10;
                                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                                for (final oLY oly5 : list) {
                                    final java.lang.String str16 = str15;
                                    oLY oly6 = new oLY(str16, str, oly5.EZpvd, oly5.valueOf, oly5.copydefault, oly5.OLrzqt, oly5.KWHzl, oly5.djBIcL, oly5.AhwBna, oly5.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puY
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C39562pug.fJNWhG(oly5, this, str16, str);
                                        }
                                    }));
                                    oly6.AEQbTJ = oly5.KWHzl;
                                    arrayList5 = arrayList5;
                                    arrayList5.add(oly6);
                                    str15 = str16;
                                }
                                return arrayList5;
                            }
                            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            xMW xmwKWHzl2 = (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt2.KWHzl();
                            java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            for (final oLY oly7 : list) {
                                final java.lang.String str17 = str10;
                                java.util.ArrayList arrayList7 = arrayList6;
                                oLY oly8 = new oLY(str17, str, oly7.EZpvd, C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl2 != null ? xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly7.valueOf))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl2 != null ? xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly7.copydefault))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl2 != null ? xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly7.OLrzqt))) : null)), C33129mqd.AEQbTJ(C33129mqd.gEmmrt(xmwKWHzl2 != null ? xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly7.KWHzl))) : null)), oly7.djBIcL, oly7.AhwBna, oly7.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puQ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C39562pug.ejfBZ(oly7, c39562pug3, str17, str5);
                                    }
                                }));
                                oly8.AEQbTJ = oly7.KWHzl;
                                arrayList7.add(oly8);
                                c39562pug3 = this;
                                arrayList6 = arrayList7;
                                xmwKWHzl2 = xmwKWHzl2;
                                str10 = str17;
                                str5 = str;
                            }
                            return arrayList6;
                        }
                    }
                    Unit unit22 = Unit.INSTANCE;
                    break;
                case 214415088:
                    str5 = str;
                    if (str5.equals("FUTURES")) {
                    }
                    Unit unit222 = Unit.INSTANCE;
                    break;
                default:
                    Unit unit2222 = Unit.INSTANCE;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2027980370:
                    str6 = str9;
                    str7 = str8;
                    break;
                case -1956807563:
                    java.lang.String str18 = str9;
                    final java.lang.String str19 = str8;
                    if (str19.equals("OPTION")) {
                        final C39562pug c39562pug4 = this;
                        AbstractC54531xLw abstractC54531xLw4 = c39562pug4.EZpvd;
                        Intrinsics.copydefault(abstractC54531xLw4, "");
                        xLJ xlj = (xLJ) abstractC54531xLw4;
                        java.lang.String str20 = str18;
                        BizInstrument bizInstrumentValueOf = xlj.valueOf(str20);
                        java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) instFamily);
                        xMS xmsGEmmrt = xlj.gEmmrt(instFamily);
                        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly9 : list) {
                            long j = oly9.EZpvd;
                            xMR xmr = xMR.copydefault;
                            final java.lang.String str21 = str20;
                            java.util.ArrayList arrayList9 = arrayList8;
                            oLY oly10 = new oLY(str21, str, j, C33129mqd.AEQbTJ(xmr.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly9.valueOf))), C36246oUr.copydefault().gkJEwt())), C33129mqd.AEQbTJ(xmr.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly9.copydefault))), C36246oUr.copydefault().gkJEwt())), C33129mqd.AEQbTJ(xmr.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly9.OLrzqt))), C36246oUr.copydefault().gkJEwt())), C33129mqd.AEQbTJ(xmr.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly9.KWHzl))), C36246oUr.copydefault().gkJEwt())), oly9.djBIcL, oly9.AhwBna, oly9.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puM
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.values(oly9, c39562pug4, str21, str19);
                                }
                            }));
                            oly10.AEQbTJ = oly9.KWHzl;
                            arrayList9.add(oly10);
                            c39562pug4 = this;
                            arrayList8 = arrayList9;
                            xmsGEmmrt = xmsGEmmrt;
                            str20 = str21;
                            str19 = str;
                        }
                        return arrayList8;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    break;
                case 2552066:
                    java.lang.String str22 = str9;
                    str7 = str8;
                    if (str7.equals("SPOT")) {
                        str6 = str22;
                        java.util.ArrayList arrayList10 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly11 : list) {
                            java.util.ArrayList arrayList11 = arrayList10;
                            final java.lang.String str23 = str6;
                            oLY oly12 = new oLY(str23, str, oly11.EZpvd, oly11.valueOf, oly11.copydefault, oly11.OLrzqt, oly11.KWHzl, oly11.djBIcL, oly11.AhwBna, oly11.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puT
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.fIwbmz(oly11, this, str23, str7);
                                }
                            }));
                            oly12.AEQbTJ = oly11.KWHzl;
                            arrayList11.add(oly12);
                            arrayList10 = arrayList11;
                            str6 = str23;
                            str7 = str;
                        }
                        return arrayList10;
                    }
                    Unit unit32 = Unit.INSTANCE;
                    break;
                case 2558355:
                    java.lang.String str24 = str9;
                    final java.lang.String str25 = str8;
                    if (str25.equals("SWAP") && (abstractC54531xLw = (c39562pug = this).EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo2 = c39562pug.uzCIH;
                        java.lang.String instrumentId2 = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId2);
                        if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(abstractC54531xLw.valueOf(instrumentId2)), (java.lang.Object) "inverse")) {
                            java.lang.String str26 = str24;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            for (final oLY oly13 : list) {
                                final java.lang.String str27 = str26;
                                oLY oly14 = new oLY(str27, str, oly13.EZpvd, oly13.valueOf, oly13.copydefault, oly13.OLrzqt, oly13.KWHzl, oly13.djBIcL, oly13.AhwBna, oly13.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puO
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C39562pug.isConnected(oly13, this, str27, str);
                                    }
                                }));
                                oly14.AEQbTJ = oly13.KWHzl;
                                arrayList12 = arrayList12;
                                arrayList12.add(oly14);
                                str26 = str27;
                            }
                            return arrayList12;
                        }
                        xLU xlu = (xLU) abstractC54531xLw;
                        java.lang.String str28 = str24;
                        BizInstrument bizInstrumentValueOf2 = xlu.valueOf(str28);
                        java.lang.String instFamily2 = bizInstrumentValueOf2 != null ? bizInstrumentValueOf2.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) instFamily2);
                        xMS xmsGEmmrt2 = xlu.gEmmrt(instFamily2);
                        java.util.ArrayList arrayList13 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly15 : list) {
                            final java.lang.String str29 = str28;
                            java.util.ArrayList arrayList14 = arrayList13;
                            oLY oly16 = new oLY(str29, str, oly15.EZpvd, C33129mqd.AEQbTJ(xmsGEmmrt2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly15.valueOf)))), C33129mqd.AEQbTJ(xmsGEmmrt2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly15.copydefault)))), C33129mqd.AEQbTJ(xmsGEmmrt2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly15.OLrzqt)))), C33129mqd.AEQbTJ(xmsGEmmrt2.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly15.KWHzl)))), oly15.djBIcL, oly15.AhwBna, oly15.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puL
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.AkhnZx(oly15, c39562pug, str29, str25);
                                }
                            }));
                            oly16.AEQbTJ = oly15.KWHzl;
                            arrayList14.add(oly16);
                            c39562pug = this;
                            arrayList13 = arrayList14;
                            xmsGEmmrt2 = xmsGEmmrt2;
                            str28 = str29;
                            str25 = str;
                        }
                        return arrayList13;
                    }
                    Unit unit322 = Unit.INSTANCE;
                    break;
                case 214415088:
                    if (str8.equals("FUTURES") && (abstractC54531xLw2 = c39562pug2.EZpvd) != null) {
                        MarketCoinInfo marketCoinInfo3 = c39562pug2.uzCIH;
                        java.lang.String instrumentId3 = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
                        Intrinsics.copydefault((java.lang.Object) instrumentId3);
                        if (!Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw2.copydefault(abstractC54531xLw2.valueOf(instrumentId3)), (java.lang.Object) "inverse")) {
                            java.lang.String str30 = str9;
                            java.util.ArrayList arrayList15 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            for (final oLY oly17 : list) {
                                final java.lang.String str31 = str30;
                                oLY oly18 = new oLY(str31, str, oly17.EZpvd, oly17.valueOf, oly17.copydefault, oly17.OLrzqt, oly17.KWHzl, oly17.djBIcL, oly17.AhwBna, oly17.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.puR
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C39562pug.DbNXlk(oly17, this, str31, str);
                                    }
                                }));
                                oly18.AEQbTJ = oly17.KWHzl;
                                arrayList15 = arrayList15;
                                arrayList15.add(oly18);
                                str30 = str31;
                            }
                            return arrayList15;
                        }
                        xLC xlc = (xLC) abstractC54531xLw2;
                        BizInstrument bizInstrumentValueOf3 = xlc.valueOf(str9);
                        java.lang.String instFamily3 = bizInstrumentValueOf3 != null ? bizInstrumentValueOf3.getInstFamily() : null;
                        Intrinsics.copydefault((java.lang.Object) instFamily3);
                        xMS xmsGEmmrt3 = xlc.gEmmrt(instFamily3);
                        java.util.ArrayList arrayList16 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (final oLY oly19 : list) {
                            long j2 = oly19.EZpvd;
                            double dAEQbTJ = C33129mqd.AEQbTJ(xmsGEmmrt3.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly19.valueOf))));
                            double dAEQbTJ2 = C33129mqd.AEQbTJ(xmsGEmmrt3.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly19.copydefault))));
                            double dAEQbTJ3 = C33129mqd.AEQbTJ(xmsGEmmrt3.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly19.OLrzqt))));
                            double dAEQbTJ4 = C33129mqd.AEQbTJ(xmsGEmmrt3.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly19.KWHzl))));
                            xMS xms = xmsGEmmrt3;
                            java.util.ArrayList arrayList17 = arrayList16;
                            double d = oly19.djBIcL;
                            double d2 = oly19.AhwBna;
                            double d3 = oly19.gEmmrt;
                            InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.puN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C39562pug.fetchVPNInfo(oly19, c39562pug2, str9, str8);
                                }
                            });
                            str8 = str;
                            oLY oly20 = new oLY(str9, str8, j2, dAEQbTJ, dAEQbTJ2, dAEQbTJ3, dAEQbTJ4, d, d2, d3, interfaceC56387yDmCopydefault);
                            oly20.AEQbTJ = oly19.KWHzl;
                            arrayList17.add(oly20);
                            arrayList16 = arrayList17;
                            xmsGEmmrt3 = xms;
                            str9 = str9;
                            c39562pug2 = this;
                        }
                        return arrayList16;
                    }
                    Unit unit3222 = Unit.INSTANCE;
                    break;
                default:
                    Unit unit32222 = Unit.INSTANCE;
                    break;
            }
        }
        return list;
    }

    public static final java.lang.String values(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String AkhnZx(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String isConnected(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String fetchVPNInfo(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String DbNXlk(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String fIwbmz(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String AuCTel(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String ejfBZ(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String fJNWhG(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public static final java.lang.String fARcdN(oLY oly, C39562pug c39562pug, java.lang.String str, java.lang.String str2) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, str, str2);
    }

    public final java.util.List<oLY> KWHzl(final java.lang.String str, java.util.List<? extends oLY> list) {
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLw = this.EZpvd;
        if (abstractC54531xLw != null) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(this.fetchVPNInfo);
            if (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            xMS xmsGEmmrt = abstractC54531xLw.gEmmrt(instFamily);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final oLY oly = (oLY) it.next();
                java.util.ArrayList arrayList2 = arrayList;
                oLY oly2 = new oLY(this.fetchVPNInfo, str, oly.EZpvd, C33129mqd.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.valueOf)))), C33129mqd.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.copydefault)))), C33129mqd.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.OLrzqt)))), C33129mqd.AEQbTJ(xmsGEmmrt.AhwBna(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)))), oly.djBIcL, oly.AhwBna, oly.gEmmrt, C56392yDr.copydefault(new Function0() { // from class: o.pve
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C39562pug.KWHzl(oly, this, str);
                    }
                }));
                oly2.AEQbTJ = oly.KWHzl;
                arrayList2.add(oly2);
                it = it;
                arrayList = arrayList2;
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    public static final java.lang.String KWHzl(oLY oly, C39562pug c39562pug, java.lang.String str) {
        return pFJ.AEQbTJ.KWHzl(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.KWHzl)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AhwBna)), C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.gEmmrt)), c39562pug.EZpvd, c39562pug.fetchVPNInfo, str);
    }

    public final void AhwBna() {
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null) {
            if (Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "OPTION")) {
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) marketCoinInfo.getInstrumentId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                    this.fetchVPNInfo = listSplit$default.get(0) + "-" + listSplit$default.get(1);
                    return;
                }
                return;
            }
            this.fetchVPNInfo = marketCoinInfo.getInstrumentId();
        }
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String strFetchVPNInfo;
        java.lang.String strKWHzl = KWHzl(i);
        if (strKWHzl.length() <= 6) {
            strKWHzl = null;
        }
        return (strKWHzl == null || (strFetchVPNInfo = C59454zhO.fetchVPNInfo(strKWHzl, 6)) == null) ? "" : strFetchVPNInfo;
    }

    public final java.lang.String KWHzl(int i) {
        java.lang.String timeMarkPrice;
        java.lang.String str = this.getFieldNames;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            timeMarkPrice = "index-candle15m";
        } else {
            timeMarkPrice = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? "mark-price-candle15m" : "candle15m";
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ = interfaceC39509ptgDjBIcL != null ? interfaceC39509ptgDjBIcL.AEQbTJ() : null;
        if (arrayListAEQbTJ != null) {
            int size = arrayListAEQbTJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i == arrayListAEQbTJ.get(i2).timeInterval) {
                    java.lang.String str2 = this.getFieldNames;
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                        timeMarkPrice = arrayListAEQbTJ.get(i2).getTimeIndex();
                    } else {
                        timeMarkPrice = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? arrayListAEQbTJ.get(i2).getTimeMarkPrice() : arrayListAEQbTJ.get(i2).getTimeKLine();
                    }
                }
            }
        }
        if (i < 360) {
            return timeMarkPrice;
        }
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2) {
            return timeMarkPrice;
        }
        return ((java.lang.Object) timeMarkPrice) + "utc";
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(C38358pVv.ActionBar actionBar) {
        java.lang.String instrumentType;
        java.lang.String expireTime;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        java.lang.String strAEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String safeString$default;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLValues;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        java.lang.String isoCode;
        java.lang.String strOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        InterfaceC54577xNn interfaceC54577xNn4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt5;
        xOW newProxyInstance3;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt6;
        xOW newProxyInstance4;
        InterfaceC54577xNn interfaceC54577xNn5;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt7;
        xMW xmwKWHzl3;
        C54536xML c54536xMLValues2;
        C54536xML c54536xMLAkhnZx2;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLAEQbTJ2;
        C54536xML c54536xMLDjBIcL2;
        MarketTopInfo marketTopInfo = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "OPTION";
        }
        marketTopInfo.setType(instrumentType);
        AbstractC54531xLw abstractC54531xLw = this.EZpvd;
        java.lang.String str = "";
        if (abstractC54531xLw != null) {
            MarketCoinInfo marketCoinInfo2 = this.uzCIH;
            java.lang.String instrumentId = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
            java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
            Intrinsics.copydefault((java.lang.Object) instFamily);
            if (Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_MARK_PRICE_KLINE")) {
                xMJ.StateListAnimator stateListAnimatorOLrzqt = actionBar.OLrzqt();
                if (stateListAnimatorOLrzqt != null) {
                    marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorOLrzqt.OLrzqt()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                    marketTopInfo.setOriginPrice(abstractC54531xLw.gEmmrt(instFamily).AhwBna(stateListAnimatorOLrzqt.OLrzqt()));
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM != null) {
                        TradeKey tradeKey = TradeKey.MANAGER;
                        InterfaceC54577xNn interfaceC54577xNn6 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey);
                        if (interfaceC54577xNn6 != null && (interfaceC54581xNrOLrzqt6 = interfaceC54577xNn6.OLrzqt()) != null && (newProxyInstance4 = interfaceC54581xNrOLrzqt6.getNewProxyInstance()) != null && newProxyInstance4.ejfBZ()) {
                            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            if (interfaceC49425uoM2 == null || (interfaceC54577xNn5 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt7 = interfaceC54577xNn5.OLrzqt()) == null || (xmwKWHzl3 = interfaceC54581xNrOLrzqt7.KWHzl()) == null) {
                                java.lang.String safeString$default2 = "";
                                marketTopInfo.setTLocalPrice(safeString$default2);
                            } else {
                                java.lang.String strOLrzqt2 = stateListAnimatorOLrzqt.OLrzqt();
                                xMJ.TaskDescription taskDescriptionKWHzl = actionBar.KWHzl();
                                C54536xML c54536xMLAYXKKw3 = xmwKWHzl3.AYXKKw(C33129mqd.mulS$default(strOLrzqt2, taskDescriptionKWHzl != null ? taskDescriptionKWHzl.OLrzqt() : null, null, null, null, 14, null));
                                if (c54536xMLAYXKKw3 == null || (c54536xMLValues2 = c54536xMLAYXKKw3.values()) == null || (c54536xMLAkhnZx2 = c54536xMLValues2.AkhnZx()) == null || (c54536xMLIsConnected2 = c54536xMLAkhnZx2.isConnected()) == null || (c54536xMLAEQbTJ2 = c54536xMLIsConnected2.AEQbTJ(true)) == null || (c54536xMLDjBIcL2 = c54536xMLAEQbTJ2.djBIcL()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
                                }
                                marketTopInfo.setTLocalPrice(safeString$default2);
                            }
                        } else if (C33129mqd.gEmmrt(stateListAnimatorOLrzqt.OLrzqt(), "0.01")) {
                            marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorOLrzqt.OLrzqt()).AkhnZx().EZpvd("12").AEQbTJ(false), false, 1, null));
                        } else {
                            marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorOLrzqt.OLrzqt()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } else {
                xMJ.Application applicationAEQbTJ = actionBar.AEQbTJ();
                if (applicationAEQbTJ != null) {
                    marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationAEQbTJ.AYXKKw()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                    marketTopInfo.setOriginPrice(abstractC54531xLw.gEmmrt(instFamily).AhwBna(applicationAEQbTJ.AYXKKw()));
                    InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM3 != null) {
                        TradeKey tradeKey2 = TradeKey.MANAGER;
                        InterfaceC54577xNn interfaceC54577xNn7 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(tradeKey2);
                        if (interfaceC54577xNn7 != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn7.OLrzqt()) != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && (mutableLiveDataBG_ = newProxyInstance2.bG_()) != null && (value = mutableLiveDataBG_.getValue()) != null) {
                            if (Intrinsics.EZpvd((java.lang.Object) value.getIsoCode(), (java.lang.Object) "USD")) {
                                if (C33129mqd.gEmmrt(applicationAEQbTJ.AYXKKw(), "0.01")) {
                                    marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationAEQbTJ.AYXKKw()).AkhnZx().EZpvd("12").AEQbTJ(false), false, 1, null));
                                } else {
                                    marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationAEQbTJ.AYXKKw()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                                }
                            } else {
                                InterfaceC49425uoM interfaceC49425uoM4 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM4 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM4.KWHzl(tradeKey2)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn2.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt3.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(applicationAEQbTJ.AYXKKw())) == null || (c54536xMLValues = c54536xMLAYXKKw.values()) == null || (c54536xMLAkhnZx = c54536xMLValues.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                                    safeString$default = "";
                                }
                                marketTopInfo.setTLocalPrice(safeString$default);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            }
            java.lang.String strOLrzqt3 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null).OLrzqt();
            marketTopInfo.setT24Volume(new kotlin.Pair<>("", strOLrzqt3));
            InterfaceC49425uoM interfaceC49425uoM5 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            ValuationCurrencyData value2 = (interfaceC49425uoM5 == null || (interfaceC54577xNn4 = (InterfaceC54577xNn) interfaceC49425uoM5.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt5 = interfaceC54577xNn4.OLrzqt()) == null || (newProxyInstance3 = interfaceC54581xNrOLrzqt5.getNewProxyInstance()) == null || (mutableLiveDataBG_2 = newProxyInstance3.bG_()) == null) ? null : mutableLiveDataBG_2.getValue();
            if (value2 == null || (isoCode = value2.getIsoCode()) == null) {
                isoCode = "";
            }
            xMJ.Application applicationAEQbTJ2 = actionBar.AEQbTJ();
            java.lang.String strAhwBna = applicationAEQbTJ2 != null ? applicationAEQbTJ2.AhwBna() : null;
            xMJ.TaskDescription taskDescriptionKWHzl2 = actionBar.KWHzl();
            java.lang.String strMulS$default = C33129mqd.mulS$default(strAhwBna, taskDescriptionKWHzl2 != null ? taskDescriptionKWHzl2.OLrzqt() : null, null, null, null, 14, null);
            InterfaceC49425uoM interfaceC49425uoM6 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM6 == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM6.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt4 = interfaceC54577xNn3.OLrzqt()) == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt4.KWHzl()) == null || (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(strMulS$default)) == null || (strOLrzqt = c54536xMLAYXKKw2.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) == null) {
                strOLrzqt = "";
            }
            marketTopInfo.setT24Turnover(new kotlin.Pair<>(strOLrzqt, isoCode));
            xMJ.Application applicationAEQbTJ3 = actionBar.AEQbTJ();
            if (applicationAEQbTJ3 != null) {
                marketTopInfo.setTIncrease(C33129mqd.gEmmrt(applicationAEQbTJ3.copydefault()));
                marketTopInfo.setTPriceDifference(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(EZpvd(C33129mqd.subS$default(applicationAEQbTJ3.AYXKKw(), applicationAEQbTJ3.valueOf(), null, null, null, 14, null))).djBIcL(), false, 1, null));
                marketTopInfo.setT24HighPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationAEQbTJ3.AEQbTJ()).djBIcL().AEQbTJ(true), false, 1, null));
                marketTopInfo.setT24LowPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationAEQbTJ3.gEmmrt()).djBIcL().AEQbTJ(true), false, 1, null));
                if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.gEmmrt(bizInstrumentValueOf), (java.lang.Object) "0")) {
                    marketTopInfo.setT24Amount(C33129mqd.formatS$default(applicationAEQbTJ3.AhwBna(), 2, null, null, 6, null));
                    marketTopInfo.setT24Volume(new kotlin.Pair<>(C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ()) ? oWC.OLrzqt(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2) : oWC.KWHzl(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2), strOLrzqt3));
                } else {
                    java.lang.String strCopydefault = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null).copydefault(C33129mqd.formatS$default(applicationAEQbTJ3.djBIcL(), 0, null, null, 6, null));
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    marketTopInfo.setT24Amount(strCopydefault);
                    marketTopInfo.setT24Volume(new kotlin.Pair<>(C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ()) ? oWC.OLrzqt(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2) : oWC.KWHzl(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2), strOLrzqt3));
                }
                Unit unit3 = Unit.INSTANCE;
            }
            xMJ.StateListAnimator stateListAnimatorOLrzqt2 = actionBar.OLrzqt();
            if (stateListAnimatorOLrzqt2 != null) {
                marketTopInfo.setMaskPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorOLrzqt2.OLrzqt()).djBIcL().AEQbTJ(true), false, 1, null));
                Unit unit4 = Unit.INSTANCE;
            }
            java.lang.String strCopydefault2 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null).copydefault(actionBar.copydefault());
            marketTopInfo.setTMarketPosition(C33129mqd.gEmmrt(strCopydefault2 != null ? pTB.formatLocalized$default(strCopydefault2, null, 1, null) : null));
            xMJ.TaskDescription taskDescriptionKWHzl3 = actionBar.KWHzl();
            if (taskDescriptionKWHzl3 != null) {
                marketTopInfo.setTSpotIndex(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(taskDescriptionKWHzl3.OLrzqt()).djBIcL(), false, 1, null));
                Unit unit5 = Unit.INSTANCE;
            }
        }
        InterfaceC49425uoM interfaceC49425uoM7 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM7 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM7.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (strAEQbTJ = newProxyInstance.AEQbTJ()) != null) {
            str = strAEQbTJ;
        }
        if (Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) str)) {
            OptSummaryData optSummaryDataEZpvd = actionBar.EZpvd();
            marketTopInfo.setTDelta(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd != null ? optSummaryDataEZpvd.getDelta() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd2 = actionBar.EZpvd();
            marketTopInfo.setTVega(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd2 != null ? optSummaryDataEZpvd2.getVega() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd3 = actionBar.EZpvd();
            marketTopInfo.setTGamma(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd3 != null ? optSummaryDataEZpvd3.getGamma() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd4 = actionBar.EZpvd();
            marketTopInfo.setTTheta(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd4 != null ? optSummaryDataEZpvd4.getTheta() : null), null, 2, null));
        } else {
            OptSummaryData optSummaryDataEZpvd5 = actionBar.EZpvd();
            marketTopInfo.setTDelta(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd5 != null ? optSummaryDataEZpvd5.getDeltaBS() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd6 = actionBar.EZpvd();
            marketTopInfo.setTVega(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd6 != null ? optSummaryDataEZpvd6.getVegaBS() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd7 = actionBar.EZpvd();
            marketTopInfo.setTGamma(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd7 != null ? optSummaryDataEZpvd7.getGammaBS() : null), null, 2, null));
            OptSummaryData optSummaryDataEZpvd8 = actionBar.EZpvd();
            marketTopInfo.setTTheta(getCorrectShowGreece2$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd8 != null ? optSummaryDataEZpvd8.getThetaBS() : null), null, 2, null));
        }
        OptSummaryData optSummaryDataEZpvd9 = actionBar.EZpvd();
        marketTopInfo.setTMarkedVolatility(getCorrectShowRatio$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd9 != null ? optSummaryDataEZpvd9.getMarkVol() : null), 2, null, null, null, 28, null));
        OptSummaryData optSummaryDataEZpvd10 = actionBar.EZpvd();
        marketTopInfo.setTLeverageMultiple(getCorrectShowLeverage$default(this, C33129mqd.gEmmrt(optSummaryDataEZpvd10 != null ? optSummaryDataEZpvd10.getLever() : null), null, 2, null));
        MarketCoinInfo marketCoinInfo3 = this.uzCIH;
        marketTopInfo.setStrikePrice(OLrzqt(C33129mqd.gEmmrt(marketCoinInfo3 != null ? marketCoinInfo3.getStrikePrice() : null)));
        MarketCoinInfo marketCoinInfo4 = this.uzCIH;
        if (marketCoinInfo4 == null || (expireTime = marketCoinInfo4.getExpireTime()) == null) {
            expireTime = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        marketTopInfo.setExpireTime(expireTime);
        InterfaceC39563puh.Application application = this.wlaJM;
        if (application != null) {
            application.AEQbTJ(marketTopInfo);
            Unit unit6 = Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v40, resolved type: o.xML */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:201:0x0435. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0578 A[PHI: r19
  0x0578: PHI (r19v8 java.lang.String) = (r19v7 java.lang.String), (r19v9 java.lang.String) binds: [B:260:0x0574, B:257:0x056a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022d  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(C37936pGe c37936pGe) {
        java.lang.String instrumentType;
        java.lang.String str;
        java.lang.String safeString$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLValues;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        ?? r7;
        java.lang.String str2;
        java.lang.String s$default;
        java.lang.String strOLrzqt;
        C54571xNh c54571xNhAhwBna;
        java.lang.String strCopydefault;
        java.lang.String s$default2;
        xMJ.StateListAnimator stateListAnimatorEZpvd;
        java.lang.String strAYXKKw;
        java.lang.String safeString$default2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLValues2;
        C54536xML c54536xMLAkhnZx2;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLAEQbTJ2;
        C54536xML c54536xMLDjBIcL2;
        xMJ.Application applicationKWHzl;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        java.lang.String safeString$default3;
        InterfaceC54577xNn interfaceC54577xNn4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4;
        xMW xmwKWHzl3;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLValues3;
        C54536xML c54536xMLAkhnZx3;
        C54536xML c54536xMLIsConnected3;
        C54536xML c54536xMLAEQbTJ3;
        C54536xML c54536xMLDjBIcL3;
        java.lang.String s$default3;
        java.lang.String strOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt5;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_2;
        InterfaceC54577xNn interfaceC54577xNn5;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt6;
        xMW xmwKWHzl4;
        C54536xML c54536xMLAYXKKw4;
        C54536xML c54536xMLValues4;
        C54536xML c54536xMLAkhnZx4;
        C54536xML c54536xMLIsConnected4;
        C54536xML c54536xMLAEQbTJ4;
        C54536xML c54536xMLDjBIcL4;
        java.lang.String safeString$default4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt7;
        xOW newProxyInstance3;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_3;
        ValuationCurrencyData value;
        InterfaceC54577xNn interfaceC54577xNn6;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt8;
        xMW xmwKWHzl5;
        C54536xML c54536xMLAYXKKw5;
        C54536xML c54536xMLValues5;
        C54536xML c54536xMLAkhnZx5;
        C54536xML c54536xMLIsConnected5;
        C54536xML c54536xMLAEQbTJ5;
        C54536xML c54536xMLDjBIcL5;
        java.lang.String safeString$default5;
        xMJ.Application applicationKWHzl2;
        InterfaceC54577xNn interfaceC54577xNn7;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt9;
        xMW xmwKWHzl6;
        C54536xML c54536xMLAYXKKw6;
        C54536xML c54536xMLValues6;
        C54536xML c54536xMLAkhnZx6;
        C54536xML c54536xMLIsConnected6;
        C54536xML c54536xMLAEQbTJ6;
        C54536xML c54536xMLDjBIcL6;
        java.lang.String safeString$default6;
        java.lang.String s$default4;
        C54571xNh c54571xNhAhwBna2;
        java.lang.String strCopydefault2;
        MarketTopInfo marketTopInfo = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "SPOT";
        }
        marketTopInfo.setType(instrumentType);
        AbstractC54531xLw abstractC54531xLw = this.EZpvd;
        if (abstractC54531xLw != null) {
            MarketCoinInfo marketCoinInfo2 = this.uzCIH;
            java.lang.String instrumentId = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
            java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
            Intrinsics.copydefault((java.lang.Object) instFamily);
            java.lang.String str3 = "";
            if (Intrinsics.EZpvd((java.lang.Object) "TYPE_INDEX_KLINE", (java.lang.Object) this.getFieldNames)) {
                xMJ.TaskDescription taskDescriptionOLrzqt = c37936pGe.OLrzqt();
                if (taskDescriptionOLrzqt != null) {
                    marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(taskDescriptionOLrzqt.OLrzqt()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                    marketTopInfo.setOriginPrice(taskDescriptionOLrzqt.OLrzqt());
                    marketTopInfo.setT24HighPrice(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(taskDescriptionOLrzqt.EZpvd()).djBIcL().AEQbTJ(true), false, 1, null));
                    marketTopInfo.setT24LowPrice(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(taskDescriptionOLrzqt.AEQbTJ()).djBIcL().AEQbTJ(true), false, 1, null));
                    xMJ.TaskDescription taskDescriptionOLrzqt2 = c37936pGe.OLrzqt();
                    marketTopInfo.setTIncrease(C33129mqd.gEmmrt(taskDescriptionOLrzqt2 != null ? taskDescriptionOLrzqt2.KWHzl() : null));
                    C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null);
                    if (C36246oUr.EZpvd()) {
                        MarketCoinInfo marketCoinInfo3 = this.uzCIH;
                        if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                            MarketCoinInfo marketCoinInfo4 = this.uzCIH;
                            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                            }
                            if (C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ())) {
                            }
                            if (C36246oUr.EZpvd()) {
                            }
                        }
                        C54571xNh c54571xNhDjBIcL = abstractC54531xLw.djBIcL(instFamily, "0");
                        if (c54571xNhDjBIcL == null || (c54571xNhAhwBna2 = c54571xNhDjBIcL.AhwBna(taskDescriptionOLrzqt.OLrzqt())) == null || (strCopydefault2 = c54571xNhAhwBna2.copydefault(this.valueOf)) == null || (s$default4 = C33129mqd.formatS$default(strCopydefault2, 2, null, null, 6, null)) == null) {
                            s$default4 = "";
                        }
                        marketTopInfo.setT24Amount(s$default4);
                        if (C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ())) {
                        }
                        if (C36246oUr.EZpvd()) {
                        }
                    } else {
                        java.lang.String strCopydefault3 = c54571xNhCreateTradeConverterWithIndex$default.AhwBna(taskDescriptionOLrzqt.OLrzqt()).copydefault(this.valueOf);
                        if (strCopydefault3 == null || (s$default3 = C33129mqd.formatS$default(strCopydefault3, 2, null, null, 6, null)) == null) {
                            s$default3 = "";
                        }
                        marketTopInfo.setT24Amount(s$default3);
                        java.lang.String strOLrzqt3 = C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ()) ? oWC.OLrzqt(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2) : oWC.KWHzl(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2);
                        if (C36246oUr.EZpvd()) {
                            MarketCoinInfo marketCoinInfo5 = this.uzCIH;
                            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo5 != null ? marketCoinInfo5.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                                MarketCoinInfo marketCoinInfo6 = this.uzCIH;
                                if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo6 != null ? marketCoinInfo6.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                                }
                                marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt3, strOLrzqt2));
                                marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                                xMJ.TaskDescription taskDescriptionOLrzqt3 = c37936pGe.OLrzqt();
                                if (taskDescriptionOLrzqt3 != null) {
                                }
                                xMJ.TaskDescription taskDescriptionOLrzqt4 = c37936pGe.OLrzqt();
                                marketTopInfo.setTPriceDifference(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(EZpvd(C33129mqd.subS$default(strOLrzqt, taskDescriptionOLrzqt4 != null ? taskDescriptionOLrzqt4.copydefault() : null, null, null, null, 14, null))).djBIcL(), false, 1, null));
                                if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentValueOf.getInstType(), (java.lang.Object) "OPTION")) {
                                }
                                applicationKWHzl2 = c37936pGe.KWHzl();
                                if (applicationKWHzl2 != null) {
                                }
                            }
                            strOLrzqt2 = bizInstrumentValueOf.getTradeSymbol();
                            marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt3, strOLrzqt2));
                            marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                            xMJ.TaskDescription taskDescriptionOLrzqt32 = c37936pGe.OLrzqt();
                            if (taskDescriptionOLrzqt32 != null) {
                            }
                            xMJ.TaskDescription taskDescriptionOLrzqt42 = c37936pGe.OLrzqt();
                            marketTopInfo.setTPriceDifference(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(EZpvd(C33129mqd.subS$default(strOLrzqt, taskDescriptionOLrzqt42 != null ? taskDescriptionOLrzqt42.copydefault() : null, null, null, null, 14, null))).djBIcL(), false, 1, null));
                            if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentValueOf.getInstType(), (java.lang.Object) "OPTION")) {
                            }
                            applicationKWHzl2 = c37936pGe.KWHzl();
                            if (applicationKWHzl2 != null) {
                            }
                        } else {
                            strOLrzqt2 = c54571xNhCreateTradeConverterWithIndex$default.OLrzqt();
                            marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt3, strOLrzqt2));
                            marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                            xMJ.TaskDescription taskDescriptionOLrzqt322 = c37936pGe.OLrzqt();
                            java.lang.String strOLrzqt4 = taskDescriptionOLrzqt322 != null ? taskDescriptionOLrzqt322.OLrzqt() : null;
                            xMJ.TaskDescription taskDescriptionOLrzqt422 = c37936pGe.OLrzqt();
                            marketTopInfo.setTPriceDifference(C54536xML.toSafeString$default(abstractC54531xLw.AYXKKw(instFamily).AYXKKw(EZpvd(C33129mqd.subS$default(strOLrzqt4, taskDescriptionOLrzqt422 != null ? taskDescriptionOLrzqt422.copydefault() : null, null, null, null, 14, null))).djBIcL(), false, 1, null));
                            if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentValueOf.getInstType(), (java.lang.Object) "OPTION")) {
                                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM != null && (interfaceC54577xNn7 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt9 = interfaceC54577xNn7.OLrzqt()) != null && (xmwKWHzl6 = interfaceC54581xNrOLrzqt9.KWHzl()) != null && (c54536xMLAYXKKw6 = xmwKWHzl6.AYXKKw(taskDescriptionOLrzqt.OLrzqt())) != null && (c54536xMLValues6 = c54536xMLAYXKKw6.values()) != null && (c54536xMLAkhnZx6 = c54536xMLValues6.AkhnZx()) != null && (c54536xMLIsConnected6 = c54536xMLAkhnZx6.isConnected()) != null && (c54536xMLAEQbTJ6 = c54536xMLIsConnected6.AEQbTJ(true)) != null && (c54536xMLDjBIcL6 = c54536xMLAEQbTJ6.djBIcL()) != null && (safeString$default6 = C54536xML.toSafeString$default(c54536xMLDjBIcL6, false, 1, null)) != null) {
                                    str3 = safeString$default6;
                                }
                                marketTopInfo.setTLocalPrice(str3);
                                Unit unit = Unit.INSTANCE;
                            } else if (C59449zhJ.gEmmrt("USD", o.TaskDescription.AEQbTJ(this.fetchVPNInfo).AEQbTJ(), true)) {
                                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM2 != null) {
                                    TradeKey tradeKey = TradeKey.MANAGER;
                                    InterfaceC54577xNn interfaceC54577xNn8 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey);
                                    if (interfaceC54577xNn8 != null && (interfaceC54581xNrOLrzqt7 = interfaceC54577xNn8.OLrzqt()) != null && (newProxyInstance3 = interfaceC54581xNrOLrzqt7.getNewProxyInstance()) != null && (mutableLiveDataBG_3 = newProxyInstance3.bG_()) != null && (value = mutableLiveDataBG_3.getValue()) != null) {
                                        if (Intrinsics.EZpvd((java.lang.Object) value.getIsoCode(), (java.lang.Object) "USD")) {
                                            if (C33129mqd.gEmmrt(taskDescriptionOLrzqt.OLrzqt(), "0.01")) {
                                                marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(taskDescriptionOLrzqt.OLrzqt()).AkhnZx().EZpvd("12").AEQbTJ(false), false, 1, null));
                                            } else {
                                                marketTopInfo.setTLocalPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(taskDescriptionOLrzqt.OLrzqt()).AkhnZx().isConnected().djBIcL(), false, 1, null));
                                            }
                                        } else {
                                            InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                            if (interfaceC49425uoM3 != null && (interfaceC54577xNn6 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(tradeKey)) != null && (interfaceC54581xNrOLrzqt8 = interfaceC54577xNn6.OLrzqt()) != null && (xmwKWHzl5 = interfaceC54581xNrOLrzqt8.KWHzl()) != null && (c54536xMLAYXKKw5 = xmwKWHzl5.AYXKKw(taskDescriptionOLrzqt.OLrzqt())) != null && (c54536xMLValues5 = c54536xMLAYXKKw5.values()) != null && (c54536xMLAkhnZx5 = c54536xMLValues5.AkhnZx()) != null && (c54536xMLIsConnected5 = c54536xMLAkhnZx5.isConnected()) != null && (c54536xMLAEQbTJ5 = c54536xMLIsConnected5.AEQbTJ(true)) != null && (c54536xMLDjBIcL5 = c54536xMLAEQbTJ5.djBIcL()) != null && (safeString$default5 = C54536xML.toSafeString$default(c54536xMLDjBIcL5, false, 1, null)) != null) {
                                                str3 = safeString$default5;
                                            }
                                            marketTopInfo.setTLocalPrice(str3);
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                }
                            } else {
                                InterfaceC49425uoM interfaceC49425uoM4 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM4 != null) {
                                    TradeKey tradeKey2 = TradeKey.MANAGER;
                                    InterfaceC54577xNn interfaceC54577xNn9 = (InterfaceC54577xNn) interfaceC49425uoM4.KWHzl(tradeKey2);
                                    if (interfaceC54577xNn9 != null && (interfaceC54581xNrOLrzqt5 = interfaceC54577xNn9.OLrzqt()) != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt5.getNewProxyInstance()) != null && (mutableLiveDataBG_2 = newProxyInstance2.bG_()) != null && mutableLiveDataBG_2.getValue() != null) {
                                        InterfaceC49425uoM interfaceC49425uoM5 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                        if (interfaceC49425uoM5 != null && (interfaceC54577xNn5 = (InterfaceC54577xNn) interfaceC49425uoM5.KWHzl(tradeKey2)) != null && (interfaceC54581xNrOLrzqt6 = interfaceC54577xNn5.OLrzqt()) != null && (xmwKWHzl4 = interfaceC54581xNrOLrzqt6.KWHzl()) != null && (c54536xMLAYXKKw4 = xmwKWHzl4.AYXKKw(taskDescriptionOLrzqt.OLrzqt())) != null && (c54536xMLValues4 = c54536xMLAYXKKw4.values()) != null && (c54536xMLAkhnZx4 = c54536xMLValues4.AkhnZx()) != null && (c54536xMLIsConnected4 = c54536xMLAkhnZx4.isConnected()) != null && (c54536xMLAEQbTJ4 = c54536xMLIsConnected4.AEQbTJ(true)) != null && (c54536xMLDjBIcL4 = c54536xMLAEQbTJ4.djBIcL()) != null && (safeString$default4 = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null)) != null) {
                                            str3 = safeString$default4;
                                        }
                                        marketTopInfo.setTLocalPrice(str3);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                }
                            }
                            applicationKWHzl2 = c37936pGe.KWHzl();
                            if (applicationKWHzl2 != null) {
                                marketTopInfo.setMaskPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl2.AYXKKw()).djBIcL().AEQbTJ(true), false, 1, null));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                    }
                }
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_KLINE")) {
                    MarketCoinInfo marketCoinInfo7 = this.uzCIH;
                    java.lang.String instrumentType2 = marketCoinInfo7 != null ? marketCoinInfo7.getInstrumentType() : null;
                    if (instrumentType2 != null) {
                        switch (instrumentType2.hashCode()) {
                            case -2027980370:
                                str = "";
                                if (instrumentType2.equals("MARGIN")) {
                                    xMJ.Application applicationKWHzl3 = c37936pGe.KWHzl();
                                    if (applicationKWHzl3 != null) {
                                        marketTopInfo.setOriginPrice(applicationKWHzl3.AYXKKw());
                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) applicationKWHzl3.AYXKKw())) {
                                            marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl3.AYXKKw()).djBIcL().AEQbTJ(true), false, 1, null));
                                            if (C59449zhJ.gEmmrt(bizInstrumentValueOf.getQuoteSymbol(), "USD", true)) {
                                                xMJ.Application applicationKWHzl4 = c37936pGe.KWHzl();
                                                strAYXKKw = applicationKWHzl4 != null ? applicationKWHzl4.AYXKKw() : null;
                                                if (strAYXKKw != null) {
                                                    InterfaceC49425uoM interfaceC49425uoM6 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                                    if (interfaceC49425uoM6 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM6.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt2.KWHzl()) == null || (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(strAYXKKw)) == null || (c54536xMLValues2 = c54536xMLAYXKKw2.values()) == null || (c54536xMLAkhnZx2 = c54536xMLValues2.AkhnZx()) == null || (c54536xMLIsConnected2 = c54536xMLAkhnZx2.isConnected()) == null || (c54536xMLAEQbTJ2 = c54536xMLIsConnected2.AEQbTJ(true)) == null || (c54536xMLDjBIcL2 = c54536xMLAEQbTJ2.djBIcL()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
                                                        safeString$default2 = str;
                                                    }
                                                    marketTopInfo.setTLocalPrice(safeString$default2);
                                                    Unit unit5 = Unit.INSTANCE;
                                                }
                                            } else {
                                                xMJ.Application applicationKWHzl5 = c37936pGe.KWHzl();
                                                if ((applicationKWHzl5 != null ? applicationKWHzl5.AYXKKw() : null) == null) {
                                                    xMJ.Application applicationCopydefault = c37936pGe.copydefault();
                                                    if (applicationCopydefault != null) {
                                                        strAYXKKw = applicationCopydefault.AYXKKw();
                                                    }
                                                    if (strAYXKKw != null) {
                                                    }
                                                } else {
                                                    xMJ.Application applicationAEQbTJ = c37936pGe.AEQbTJ();
                                                    if ((applicationAEQbTJ != null ? applicationAEQbTJ.AYXKKw() : null) != null) {
                                                        xMJ.Application applicationKWHzl6 = c37936pGe.KWHzl();
                                                        java.lang.String strAYXKKw2 = applicationKWHzl6 != null ? applicationKWHzl6.AYXKKw() : null;
                                                        xMJ.Application applicationAEQbTJ2 = c37936pGe.AEQbTJ();
                                                        strAYXKKw = C33129mqd.mulS$default(strAYXKKw2, applicationAEQbTJ2 != null ? applicationAEQbTJ2.AYXKKw() : null, null, null, null, 14, null);
                                                    }
                                                    if (strAYXKKw != null) {
                                                    }
                                                }
                                            }
                                        }
                                        Unit unit6 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                break;
                            case 2552066:
                                str = "";
                                if (!instrumentType2.equals("SPOT")) {
                                }
                                break;
                            case 2558355:
                                if (!instrumentType2.equals("SWAP")) {
                                    str = "";
                                }
                                applicationKWHzl = c37936pGe.KWHzl();
                                if (applicationKWHzl != null) {
                                    str = "";
                                } else {
                                    marketTopInfo.setOriginPrice(applicationKWHzl.AYXKKw());
                                    if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(bizInstrumentValueOf), (java.lang.Object) "linear")) {
                                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl.AYXKKw()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                                        InterfaceC49425uoM interfaceC49425uoM7 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                        if (interfaceC49425uoM7 == null || (interfaceC54577xNn4 = (InterfaceC54577xNn) interfaceC49425uoM7.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt4 = interfaceC54577xNn4.OLrzqt()) == null || (xmwKWHzl3 = interfaceC54581xNrOLrzqt4.KWHzl()) == null || (c54536xMLAYXKKw3 = xmwKWHzl3.AYXKKw(applicationKWHzl.AYXKKw())) == null || (c54536xMLValues3 = c54536xMLAYXKKw3.values()) == null || (c54536xMLAkhnZx3 = c54536xMLValues3.AkhnZx()) == null || (c54536xMLIsConnected3 = c54536xMLAkhnZx3.isConnected()) == null || (c54536xMLAEQbTJ3 = c54536xMLIsConnected3.AEQbTJ(true)) == null || (c54536xMLDjBIcL3 = c54536xMLAEQbTJ3.djBIcL()) == null || (safeString$default3 = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null)) == null) {
                                            safeString$default3 = "";
                                        }
                                        marketTopInfo.setTLocalPrice(safeString$default3);
                                        Unit unit7 = Unit.INSTANCE;
                                        str = "";
                                    } else {
                                        xMJ.Application applicationKWHzl7 = c37936pGe.KWHzl();
                                        str = "";
                                        C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(0.01d, C33129mqd.AEQbTJ(applicationKWHzl7 != null ? applicationKWHzl7.AYXKKw() : null))));
                                        InterfaceC49425uoM interfaceC49425uoM8 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                        if (interfaceC49425uoM8 != null && (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM8.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null && mutableLiveDataBG_.getValue() != null) {
                                            marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl.AYXKKw()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                                            marketTopInfo.setTLocalPrice(marketTopInfo.getTPrice());
                                            Unit unit8 = Unit.INSTANCE;
                                        }
                                    }
                                }
                                break;
                            case 214415088:
                                if (!instrumentType2.equals("FUTURES")) {
                                    str = "";
                                }
                                applicationKWHzl = c37936pGe.KWHzl();
                                if (applicationKWHzl != null) {
                                }
                                break;
                            default:
                                str = "";
                                break;
                        }
                        stateListAnimatorEZpvd = c37936pGe.EZpvd();
                        if (stateListAnimatorEZpvd != null) {
                            marketTopInfo.setMaskPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorEZpvd.OLrzqt()).djBIcL().AEQbTJ(true), false, 1, null));
                            Unit unit9 = Unit.INSTANCE;
                        }
                    } else {
                        str = "";
                    }
                    Unit unit10 = Unit.INSTANCE;
                    stateListAnimatorEZpvd = c37936pGe.EZpvd();
                    if (stateListAnimatorEZpvd != null) {
                    }
                } else {
                    str = "";
                    xMJ.StateListAnimator stateListAnimatorEZpvd2 = c37936pGe.EZpvd();
                    if (stateListAnimatorEZpvd2 != null) {
                        marketTopInfo.setOriginPrice(stateListAnimatorEZpvd2.OLrzqt());
                        MarketCoinInfo marketCoinInfo8 = this.uzCIH;
                        java.lang.String instrumentType3 = marketCoinInfo8 != null ? marketCoinInfo8.getInstrumentType() : null;
                        if (instrumentType3 != null) {
                            switch (instrumentType3.hashCode()) {
                                case -2027980370:
                                    if (instrumentType3.equals("MARGIN")) {
                                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorEZpvd2.OLrzqt()).AEQbTJ(true).djBIcL(), false, 1, null));
                                        Unit unit11 = Unit.INSTANCE;
                                    } else {
                                        Unit unit12 = Unit.INSTANCE;
                                    }
                                    break;
                                case 2552066:
                                    if (!instrumentType3.equals("SPOT")) {
                                    }
                                    break;
                                case 2558355:
                                    if (instrumentType3.equals("SWAP")) {
                                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(stateListAnimatorEZpvd2.OLrzqt()).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                                    }
                                    Unit unit122 = Unit.INSTANCE;
                                    break;
                                case 214415088:
                                    if (instrumentType3.equals("FUTURES")) {
                                    }
                                    Unit unit1222 = Unit.INSTANCE;
                                    break;
                            }
                            InterfaceC49425uoM interfaceC49425uoM9 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                            if (interfaceC49425uoM9 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM9.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(stateListAnimatorEZpvd2.OLrzqt())) == null || (c54536xMLValues = c54536xMLAYXKKw.values()) == null || (c54536xMLAkhnZx = c54536xMLValues.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                                safeString$default = str;
                            }
                            marketTopInfo.setTLocalPrice(safeString$default);
                            Unit unit13 = Unit.INSTANCE;
                        }
                    }
                    xMJ.Application applicationKWHzl8 = c37936pGe.KWHzl();
                    if (applicationKWHzl8 != null) {
                        marketTopInfo.setMaskPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl8.AYXKKw()).djBIcL().AEQbTJ(true), false, 1, null));
                        Unit unit14 = Unit.INSTANCE;
                    }
                }
                xMJ.Application applicationKWHzl9 = c37936pGe.KWHzl();
                if (applicationKWHzl9 != null) {
                    marketTopInfo.setTPriceDifference(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(EZpvd(C33129mqd.subS$default(applicationKWHzl9.AYXKKw(), applicationKWHzl9.valueOf(), null, null, null, 14, null))).djBIcL(), false, 1, null));
                    marketTopInfo.setTIncrease(C33129mqd.gEmmrt(applicationKWHzl9.copydefault()));
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) applicationKWHzl9.AEQbTJ())) {
                        r7 = 1;
                        marketTopInfo.setT24HighPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl9.AEQbTJ()).djBIcL().AEQbTJ(true), false, 1, null));
                    } else {
                        r7 = 1;
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) applicationKWHzl9.gEmmrt())) {
                        str2 = null;
                        marketTopInfo.setT24LowPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(applicationKWHzl9.gEmmrt()).djBIcL().AEQbTJ(r7), false, r7, null));
                    } else {
                        str2 = null;
                    }
                    C54571xNh c54571xNhCreateTradeConverterWithIndex$default2 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, str2, 2, str2);
                    if (C36246oUr.EZpvd()) {
                        MarketCoinInfo marketCoinInfo9 = this.uzCIH;
                        if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo9 != null ? marketCoinInfo9.getInstrumentType() : str2), (java.lang.Object) "SWAP")) {
                            MarketCoinInfo marketCoinInfo10 = this.uzCIH;
                            if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo10 != null ? marketCoinInfo10.getInstrumentType() : str2), (java.lang.Object) "FUTURES")) {
                            }
                            if (C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ())) {
                            }
                            if (C36246oUr.EZpvd()) {
                            }
                        }
                        C54571xNh c54571xNhDjBIcL2 = abstractC54531xLw.djBIcL(instFamily, "0");
                        marketTopInfo.setT24Amount((c54571xNhDjBIcL2 == null || (c54571xNhAhwBna = c54571xNhDjBIcL2.AhwBna(applicationKWHzl9.AYXKKw())) == null || (strCopydefault = c54571xNhAhwBna.copydefault(applicationKWHzl9.djBIcL())) == null || (s$default2 = C33129mqd.formatS$default(strCopydefault, 2, null, null, 6, null)) == null) ? str : s$default2);
                        if (C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ())) {
                        }
                        if (C36246oUr.EZpvd()) {
                        }
                    } else {
                        java.lang.String strCopydefault4 = c54571xNhCreateTradeConverterWithIndex$default2.AhwBna(applicationKWHzl9.AYXKKw()).copydefault(applicationKWHzl9.djBIcL());
                        marketTopInfo.setT24Amount((strCopydefault4 == null || (s$default = C33129mqd.formatS$default(strCopydefault4, 2, null, null, 6, null)) == null) ? str : s$default);
                        java.lang.String strOLrzqt5 = C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ()) ? oWC.OLrzqt(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2) : oWC.KWHzl(C33129mqd.AEQbTJ(marketTopInfo.getT24Amount()), 2);
                        if (C36246oUr.EZpvd()) {
                            MarketCoinInfo marketCoinInfo11 = this.uzCIH;
                            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo11 != null ? marketCoinInfo11.getInstrumentType() : str2), (java.lang.Object) "SWAP")) {
                                MarketCoinInfo marketCoinInfo12 = this.uzCIH;
                                if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo12 != null ? marketCoinInfo12.getInstrumentType() : str2), (java.lang.Object) "FUTURES")) {
                                }
                                marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt5, strOLrzqt));
                                marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                                Unit unit15 = Unit.INSTANCE;
                            }
                            strOLrzqt = bizInstrumentValueOf.getTradeSymbol();
                            marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt5, strOLrzqt));
                            marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                            Unit unit152 = Unit.INSTANCE;
                        } else {
                            strOLrzqt = c54571xNhCreateTradeConverterWithIndex$default2.OLrzqt();
                            marketTopInfo.setT24Volume(new kotlin.Pair<>(strOLrzqt5, strOLrzqt));
                            marketTopInfo.setT24Turnover(KWHzl(c37936pGe));
                            Unit unit1522 = Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        InterfaceC39563puh.Application application = this.wlaJM;
        if (application != null) {
            application.AEQbTJ(marketTopInfo);
            Unit unit16 = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0153, code lost:
    
        if (r4 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0155, code lost:
    
        r2 = r4.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0159, code lost:
    
        if (r2 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015b, code lost:
    
        r1 = r2.AYXKKw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x015f, code lost:
    
        if (r1 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0161, code lost:
    
        r1 = r1.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016d, code lost:
    
        if (r1 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016f, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0177, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0179, code lost:
    
        r1 = r2.getFutureContractVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x017d, code lost:
    
        r1 = o.C33129mqd.mulS$default(r8, r1, null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0188, code lost:
    
        if (r4 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018a, code lost:
    
        r2 = r4.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018e, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0190, code lost:
    
        r1 = r2.AYXKKw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0194, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0196, code lost:
    
        r1 = r1.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a2, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a4, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01b2, code lost:
    
        if (r6.equals("SPOT") == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0223, code lost:
    
        if (r6.equals("MARGIN") == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0226, code lost:
    
        if (r4 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0228, code lost:
    
        r0 = r4.KWHzl("USDT", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x022e, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0230, code lost:
    
        r0 = r0.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x023c, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023f, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0240, code lost:
    
        if (r2 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0242, code lost:
    
        r1 = r2.getDisplayQuoteSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0246, code lost:
    
        if (r1 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0249, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return new kotlin.Pair<>(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return new kotlin.Pair<>(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return new kotlin.Pair<>(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0120, code lost:
    
        if (r6.equals("FUTURES") == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012a, code lost:
    
        if (r6.equals("SWAP") == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012e, code lost:
    
        if (r2 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0135, code lost:
    
        if (r2.isPositiveContract() != true) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0137, code lost:
    
        r1 = o.C33129mqd.mulS$default(o.C33129mqd.mulS$default(r8, r9, null, null, null, 14, null), r2.getFutureContractVal(), null, null, null, 14, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[PHI: r5 r6 r8
  0x0094: PHI (r5v23 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String), (r5v27 java.lang.String) binds: [B:76:0x00eb, B:61:0x00c4, B:43:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r6v19 java.lang.String) = (r6v5 java.lang.String), (r6v9 java.lang.String), (r6v20 java.lang.String) binds: [B:76:0x00eb, B:61:0x00c4, B:43:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r8v9 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String), (r8v12 java.lang.String) binds: [B:76:0x00eb, B:61:0x00c4, B:43:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed A[PHI: r5 r6
  0x00ed: PHI (r5v10 java.lang.String) = 
  (r5v4 java.lang.String)
  (r5v4 java.lang.String)
  (r5v8 java.lang.String)
  (r5v8 java.lang.String)
  (r5v27 java.lang.String)
  (r5v27 java.lang.String)
 binds: [B:74:0x00e5, B:76:0x00eb, B:59:0x00be, B:61:0x00c4, B:41:0x008b, B:43:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r6v11 java.lang.String) = 
  (r6v5 java.lang.String)
  (r6v5 java.lang.String)
  (r6v9 java.lang.String)
  (r6v9 java.lang.String)
  (r6v20 java.lang.String)
  (r6v20 java.lang.String)
 binds: [B:74:0x00e5, B:76:0x00eb, B:59:0x00be, B:61:0x00c4, B:41:0x008b, B:43:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(C37936pGe c37936pGe) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String isoCode;
        java.lang.String strOLrzqt;
        java.lang.String strDjBIcL;
        java.lang.String strAhwBna;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        java.lang.String strOLrzqt2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        AbstractC54531xLw abstractC54531xLw = this.EZpvd;
        if (abstractC54531xLw != null) {
            MarketCoinInfo marketCoinInfo = this.uzCIH;
            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
        } else {
            bizInstrumentValueOf = null;
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        ValuationCurrencyData value = (interfaceC49425uoM == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn3.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
        java.lang.String str4 = "";
        if (value == null || (isoCode = value.getIsoCode()) == null) {
            isoCode = "";
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn2.copydefault();
        java.lang.String str5 = this.getFieldNames;
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            xMJ.TaskDescription taskDescriptionOLrzqt = c37936pGe.OLrzqt();
            if (taskDescriptionOLrzqt == null || (strOLrzqt = taskDescriptionOLrzqt.OLrzqt()) == null) {
                strOLrzqt = "";
            }
            strDjBIcL = this.valueOf;
            xMJ.Application applicationKWHzl = c37936pGe.KWHzl();
            if (applicationKWHzl == null || (strAhwBna = applicationKWHzl.AhwBna()) == null) {
                str = strOLrzqt;
                str2 = strDjBIcL;
                str3 = "";
            } else {
                str = strOLrzqt;
                str3 = strAhwBna;
                str2 = strDjBIcL;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "TYPE_KLINE")) {
            xMJ.Application applicationKWHzl2 = c37936pGe.KWHzl();
            if (applicationKWHzl2 == null || (strOLrzqt = applicationKWHzl2.AYXKKw()) == null) {
                strOLrzqt = "";
            }
            xMJ.Application applicationKWHzl3 = c37936pGe.KWHzl();
            if (applicationKWHzl3 == null || (strDjBIcL = applicationKWHzl3.djBIcL()) == null) {
                strDjBIcL = "";
            }
            xMJ.Application applicationKWHzl4 = c37936pGe.KWHzl();
            if (applicationKWHzl4 == null || (strAhwBna = applicationKWHzl4.AhwBna()) == null) {
            }
        } else {
            xMJ.StateListAnimator stateListAnimatorEZpvd = c37936pGe.EZpvd();
            if (stateListAnimatorEZpvd == null || (strOLrzqt = stateListAnimatorEZpvd.OLrzqt()) == null) {
                strOLrzqt = "";
            }
            xMJ.Application applicationKWHzl5 = c37936pGe.KWHzl();
            if (applicationKWHzl5 == null || (strDjBIcL = applicationKWHzl5.djBIcL()) == null) {
                strDjBIcL = "";
            }
            xMJ.Application applicationKWHzl6 = c37936pGe.KWHzl();
            if (applicationKWHzl6 == null || (strAhwBna = applicationKWHzl6.AhwBna()) == null) {
            }
        }
        if (C36246oUr.EZpvd()) {
            return AEQbTJ(bizInstrumentValueOf, interfaceC54581xNrCopydefault, str2, str3, str, c37936pGe);
        }
        MarketCoinInfo marketCoinInfo2 = this.uzCIH;
        java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    break;
                case -1956807563:
                    if (instrumentType.equals("OPTION")) {
                        xMJ.Application applicationKWHzl7 = c37936pGe.KWHzl();
                        java.lang.String strAhwBna2 = applicationKWHzl7 != null ? applicationKWHzl7.AhwBna() : null;
                        xMJ.TaskDescription taskDescriptionOLrzqt2 = c37936pGe.OLrzqt();
                        java.lang.String strMulS$default = C33129mqd.mulS$default(strAhwBna2, taskDescriptionOLrzqt2 != null ? taskDescriptionOLrzqt2.OLrzqt() : null, null, null, null, 14, null);
                        InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        if (interfaceC49425uoM3 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) != null && (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(strMulS$default)) != null && (strOLrzqt2 = c54536xMLAYXKKw.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) != null) {
                            str4 = strOLrzqt2;
                        }
                        return new kotlin.Pair<>(str4, isoCode);
                    }
                    break;
                case 2552066:
                    break;
                case 2558355:
                    break;
                case 214415088:
                    break;
            }
        }
        return new kotlin.Pair<>("", "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r2.equals("FUTURES") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.equals("SWAP") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r23 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r2 = r23.getQuoteSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r23 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r23.isPositiveContract() != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r3 = o.C33129mqd.mulS$default(o.C33129mqd.mulS$default(r25, r27, null, null, null, 14, null), r23.getFutureContractVal(), null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r24 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r0 = r24.KWHzl(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r0 = r0.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r23 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r3 = r23.getFutureContractVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r3 = o.C33129mqd.mulS$default(r25, r3, null, null, null, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r24 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        r0 = r24.KWHzl(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r0 = r0.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r2.equals("SPOT") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010d, code lost:
    
        if (r2.equals("MARGIN") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0110, code lost:
    
        if (r24 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        r0 = r24.KWHzl("USDT", r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011c, code lost:
    
        r0 = r0.OLrzqt(2, java.lang.Boolean.FALSE, java.math.RoundingMode.HALF_UP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012a, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
    
        if (r23 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:
    
        r2 = r23.getDisplayQuoteSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0131, code lost:
    
        if (r2 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0134, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return new kotlin.Pair<>(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return new kotlin.Pair<>(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return new kotlin.Pair<>(r0, r4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(BizInstrument bizInstrument, InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, java.lang.String str2, java.lang.String str3, C37936pGe c37936pGe) {
        C54536xML c54536xMLKWHzl;
        java.lang.String strOLrzqt;
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
        java.lang.String str4 = "";
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    break;
                case -1956807563:
                    if (instrumentType.equals("OPTION")) {
                        xMJ.Application applicationKWHzl = c37936pGe.KWHzl();
                        java.lang.String strAhwBna = applicationKWHzl != null ? applicationKWHzl.AhwBna() : null;
                        xMJ.TaskDescription taskDescriptionOLrzqt = c37936pGe.OLrzqt();
                        java.lang.String strMulS$default = C33129mqd.mulS$default(strAhwBna, taskDescriptionOLrzqt != null ? taskDescriptionOLrzqt.OLrzqt() : null, null, null, null, 14, null);
                        if (interfaceC54581xNr != null && (c54536xMLKWHzl = interfaceC54581xNr.KWHzl("USD", strMulS$default)) != null && (strOLrzqt = c54536xMLKWHzl.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) != null) {
                            str4 = strOLrzqt;
                        }
                        return new kotlin.Pair<>(str4, "USD");
                    }
                    break;
                case 2552066:
                    break;
                case 2558355:
                    break;
                case 214415088:
                    break;
            }
        }
        return new kotlin.Pair<>("", "");
    }

    public final void copydefault(C37936pGe c37936pGe) {
        java.lang.String instrumentType;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        MarketTopInfo marketTopInfo = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "INDEX";
        }
        marketTopInfo.setType(instrumentType);
        MarketCoinInfo marketCoinInfo2 = this.uzCIH;
        java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null).AEQbTJ();
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) pDP.copydefault)) {
            str = pDP.djBIcL;
        } else if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) pDP.EZpvd)) {
            str = pDP.AEQbTJ;
        } else if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) pDP.OLrzqt)) {
            str = pDP.KWHzl;
        }
        xMJ.TaskDescription taskDescriptionOLrzqt = c37936pGe.OLrzqt();
        if (taskDescriptionOLrzqt != null) {
            marketTopInfo.setOriginPrice(taskDescriptionOLrzqt.OLrzqt());
            java.lang.String str2 = str + pTB.formatLocalized$default(taskDescriptionOLrzqt.OLrzqt(), null, 1, null);
            xTM xtm = xTM.AEQbTJ;
            java.lang.String strOLrzqt = taskDescriptionOLrzqt.OLrzqt();
            xMJ.Application applicationCopydefault = c37936pGe.copydefault();
            java.lang.String strAEQbTJ2 = xtm.AEQbTJ(strOLrzqt, applicationCopydefault != null ? applicationCopydefault.AYXKKw() : null);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            ValuationCurrencyData value = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) pDP.djBIcL)) {
                if (Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getIsoCode() : null), (java.lang.Object) "USD")) {
                    marketTopInfo.setTPrice(str2);
                    marketTopInfo.setTLocalPrice(strAEQbTJ2);
                } else {
                    marketTopInfo.setTPrice(strAEQbTJ2);
                    marketTopInfo.setTLocalPrice(str2);
                }
            } else {
                marketTopInfo.setTPrice(str2);
            }
            marketTopInfo.setTPriceDifference(pTB.formatLocalized$default(C33129mqd.subS$default(taskDescriptionOLrzqt.OLrzqt(), taskDescriptionOLrzqt.copydefault(), null, null, null, 14, null), null, 1, null));
            marketTopInfo.setTIncrease(C33129mqd.gEmmrt(taskDescriptionOLrzqt.KWHzl()));
            marketTopInfo.setT24HighPrice(pTB.formatLocalized$default(taskDescriptionOLrzqt.EZpvd(), null, 1, null));
            marketTopInfo.setT24LowPrice(pTB.formatLocalized$default(taskDescriptionOLrzqt.AEQbTJ(), null, 1, null));
        }
        InterfaceC39563puh.Application application = this.wlaJM;
        if (application != null) {
            application.AEQbTJ(marketTopInfo);
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE ? "0" : str;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC46879tfW
    public void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.zLjUOn;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fARcdN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.ejfBZ;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC4 = this.zsXlph;
        if (interfaceC58217yxC4 != null) {
            interfaceC58217yxC4.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC5 = this.hDKMBd;
        if (interfaceC58217yxC5 != null) {
            interfaceC58217yxC5.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC6 = this.fJNWhG;
        if (interfaceC58217yxC6 != null) {
            interfaceC58217yxC6.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC7 = this.AuCTel;
        if (interfaceC58217yxC7 != null) {
            interfaceC58217yxC7.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC8 = this.iwGUEr;
        if (interfaceC58217yxC8 != null) {
            interfaceC58217yxC8.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC9 = this.isConnected;
        if (interfaceC58217yxC9 != null) {
            interfaceC58217yxC9.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC10 = this.getNewProxyInstance;
        if (interfaceC58217yxC10 != null) {
            interfaceC58217yxC10.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC39563puh.StateListAnimator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull Continuation<? super java.util.ArrayList<OptionCoolState>> continuation) throws java.lang.Throwable {
        MarketDetailPresent$getCoolingInfo$1 marketDetailPresent$getCoolingInfo$1;
        if (continuation instanceof MarketDetailPresent$getCoolingInfo$1) {
            marketDetailPresent$getCoolingInfo$1 = (MarketDetailPresent$getCoolingInfo$1) continuation;
            int i = marketDetailPresent$getCoolingInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDetailPresent$getCoolingInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDetailPresent$getCoolingInfo$1 = new MarketDetailPresent$getCoolingInfo$1(this, continuation);
            }
        }
        java.lang.Object result = marketDetailPresent$getCoolingInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDetailPresent$getCoolingInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(result);
            marketDetailPresent$getCoolingInfo$1.L$0 = lifecycleOwner;
            marketDetailPresent$getCoolingInfo$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(marketDetailPresent$getCoolingInfo$1), 1);
            cancellableContinuationImpl.initCancellability();
            C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getOptionCoolConfig(), lifecycleOwner), new ActionBar(cancellableContinuationImpl), (Function0) null, new TaskDescription(cancellableContinuationImpl), 2, (java.lang.Object) null);
            result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(marketDetailPresent$getCoolingInfo$1);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(result);
        }
        return (java.util.ArrayList) result;
    }

    /* JADX INFO: renamed from: o.pug$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.ArrayList<OptionCoolState>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.ArrayList<com.okinc.unify_trade.biz.OptionCoolState>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super java.util.ArrayList<OptionCoolState>> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            CancellableContinuation<java.util.ArrayList<OptionCoolState>> cancellableContinuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(new java.util.ArrayList()));
            pUU.KWHzl("ChartView", "获取合约冷静期信息: onError:" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.pug$TaskDescription */
    public static final class TaskDescription implements Function1<ResponseData<java.util.ArrayList<OptionCoolState>>, Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.ArrayList<OptionCoolState>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.ArrayList<com.okinc.unify_trade.biz.OptionCoolState>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.util.ArrayList<OptionCoolState>> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<java.util.ArrayList<OptionCoolState>> responseData) {
            OLrzqt(responseData);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(ResponseData<java.util.ArrayList<OptionCoolState>> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                    CancellableContinuation<java.util.ArrayList<OptionCoolState>> cancellableContinuation = this.OLrzqt;
                    Result.Application application = Result.Companion;
                    java.util.ArrayList<OptionCoolState> data = responseData.getData();
                    Intrinsics.copydefault(data);
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(data));
                    return;
                }
                CancellableContinuation<java.util.ArrayList<OptionCoolState>> cancellableContinuation2 = this.OLrzqt;
                Result.Application application2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m7377constructorimpl(new java.util.ArrayList()));
                pUU.KWHzl("ChartView", "获取合约冷静期信息:数据为空 " + responseData.getMsg());
                return;
            }
            CancellableContinuation<java.util.ArrayList<OptionCoolState>> cancellableContinuation3 = this.OLrzqt;
            Result.Application application3 = Result.Companion;
            cancellableContinuation3.resumeWith(Result.m7377constructorimpl(new java.util.ArrayList()));
            pUU.KWHzl("ChartView", "获取合约冷静期信息:数据错误 " + responseData.getMsg());
        }
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull final LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(KlineBizMarketService.StateListAnimator.getIndicatorList$default((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null), str, str2, null, 4, null), lifecycleOwner), new Function1() { // from class: o.puv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.gEmmrt((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.puw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39562pug.copydefault(lifecycleOwner, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(LifecycleOwner lifecycleOwner, C39562pug c39562pug, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarketDetailPresent$getIndicatorList$2$1(c39562pug, responseData, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            pUU.copydefault("OKKLine", "getIndicatorList: onError:code = " + code + " Message = " + ((response == null || (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) ? null : asJsonPrimitive.getAsString()));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.util.ArrayList<KLineEventBean>> continuation) {
        Date date = new Date(C33129mqd.valueOf(str));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
        OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null);
        pTA.format$default(new Date(C33129mqd.valueOf(str2)), oKDateEnum, oKTimeEnum, null, null, false, 28, null);
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new MarketDetailPresent$getKlineEvent$2(str, str2, str3, this, null), continuation);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super KlineActiveListData> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new MarketDetailPresent$getKlineActiveList$2(str, str2, str3, str4, num, num2, this, null), continuation);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public java.lang.Object copydefault(java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.Integer num, @NotNull Continuation<? super java.util.ArrayList<KlineFlashVo>> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new MarketDetailPresent$getKlineContentFlashData$2(str, str2, z, str3, num, this, null), continuation);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super java.util.ArrayList<KlineStartTimeVo>> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new MarketDetailPresent$getKlineStartTime$2(this, str, null), continuation);
    }

    public final java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> KWHzl(KlineIndicatorData klineIndicatorData) {
        java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList = new java.util.ArrayList<>();
        for (KlineIndicatorBean klineIndicatorBean : klineIndicatorData.getIndicatorDetailVos()) {
            InterfaceC37953pGv interfaceC37953pGvOLrzqt = C37957pGz.copydefault.OLrzqt(klineIndicatorBean.getKeyName());
            kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> pairAEQbTJ = interfaceC37953pGvOLrzqt != null ? interfaceC37953pGvOLrzqt.AEQbTJ(klineIndicatorBean) : null;
            if (pairAEQbTJ != null) {
                arrayList.add(new Triple<>(pairAEQbTJ.getFirst(), pairAEQbTJ.getSecond(), klineIndicatorBean));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3772=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    @Override // o.InterfaceC39563puh.StateListAnimator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(int i, @NotNull android.content.Context context) {
        java.lang.String instrumentId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        TradingViewReq tradingViewReq = new TradingViewReq();
        tradingViewReq.setDecimal(pDP.AEQbTJ(C36246oUr.copydefault().gkJEwt()));
        tradingViewReq.setCurrentRate(C36246oUr.copydefault().getPostValueLengthLimit());
        MarketCoinInfo marketCoinInfo = this.uzCIH;
        if (marketCoinInfo != null && (instrumentId = marketCoinInfo.getInstrumentId()) != null) {
            str = instrumentId;
        }
        tradingViewReq.setTitle(str);
        tradingViewReq.setVersion(5);
        tradingViewReq.setKlineStyle(i == -1 ? 3 : 1);
        tradingViewReq.setInterval(pFS.KWHzl.OLrzqt(i));
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        pDT pdtKWHzl = stateListAnimator.KWHzl();
        pEM pem = pEM.AEQbTJ;
        java.lang.String strCopydefault = pdtKWHzl.copydefault(pem.copydefault());
        java.lang.String strCopydefault2 = stateListAnimator.KWHzl().copydefault(pem.KWHzl());
        if (strCopydefault == null) {
            strCopydefault = EZpvd(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
        }
        tradingViewReq.setCandleUpColor(strCopydefault);
        if (strCopydefault2 == null) {
            strCopydefault2 = EZpvd(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
        }
        tradingViewReq.setCandleDownColor(strCopydefault2);
        tradingViewReq.setLoadingProgressColor(EZpvd(AEQbTJ(C52761wXj.Activity.fZc)));
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                tradingViewReq.setTheme("Dark");
            } else {
                tradingViewReq.setTheme("Light");
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            tradingViewReq.setTheme("Dark");
        } else {
            tradingViewReq.setTheme("Light");
        }
        tradingViewReq.setTvBackgroundColor(EZpvd(AEQbTJ(Intrinsics.EZpvd((java.lang.Object) tradingViewReq.getTheme(), (java.lang.Object) "Dark") ? C52761wXj.Activity.valueOf : C52761wXj.Activity.AhwBna)));
        pSC psc = pSC.AEQbTJ;
        java.lang.String strKWHzl = psc.KWHzl();
        switch (strKWHzl.hashCode()) {
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT /* 3886 */:
                if (!strKWHzl.equals("zh")) {
                    tradingViewReq.setLocale((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) psc.KWHzl(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0));
                } else {
                    tradingViewReq.setLocale("zh_TW");
                }
                break;
            case 120511:
                if (strKWHzl.equals("zh-")) {
                }
                break;
            case 99219825:
                if (strKWHzl.equals("hi-IN")) {
                    tradingViewReq.setLocale("en");
                    break;
                }
                break;
            case 100292291:
                if (strKWHzl.equals("in-ID")) {
                    tradingViewReq.setLocale("id_ID");
                    break;
                }
                break;
            case 104850477:
                if (strKWHzl.equals("nl-NL")) {
                    tradingViewReq.setLocale("nl_NL");
                    break;
                }
                break;
            case 111285539:
                if (strKWHzl.equals("uk-UA")) {
                    tradingViewReq.setLocale("en");
                    break;
                }
                break;
            case 115813226:
                if (strKWHzl.equals("zh-CN")) {
                    tradingViewReq.setLocale("zh");
                    break;
                }
                break;
        }
        InterfaceC39563puh.Application application = this.wlaJM;
        if (application != null) {
            application.values(pFX.AEQbTJ.copydefault("nativeCallBack", new Gson().toJson(tradingViewReq)));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pVv.subKline$default(o.pVv, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):o.ywX */
    @Override // o.InterfaceC39563puh.StateListAnimator
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull JsonObject jsonObject, final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        if (this.uzCIH != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.fARcdN;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            java.lang.String asString = jsonObject.get("type").getAsString();
            int iAEQbTJ = AEQbTJ(asString);
            C38358pVv c38358pVv = this.AubY;
            java.lang.String str2 = this.getFieldNames;
            java.lang.String str3 = this.fetchVPNInfo;
            Intrinsics.copydefault((java.lang.Object) asString);
            AbstractC58185ywX abstractC58185ywXSubKline$default = C38358pVv.subKline$default(c38358pVv, str2, str3, valueOf(asString), false, 8, null);
            MarketCoinInfo marketCoinInfo = this.uzCIH;
            java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentType);
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXSubKline$default.AEQbTJ((InterfaceC58229yxO) new C38358pVv.TaskDescription(instrumentType, iAEQbTJ));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, lifecycleOwner);
            final Function1 function1 = new Function1() { // from class: o.puo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39562pug.KWHzl(this.AEQbTJ, function2, objectRef, (kotlin.Pair) obj);
                }
            };
            this.fARcdN = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.put
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39562pug.getNewProxyInstance(function1, obj);
                }
            });
        }
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [T, java.lang.String] */
    public static final Unit KWHzl(C39562pug c39562pug, Function2 function2, Ref.ObjectRef objectRef, kotlin.Pair pair) {
        JsonArray jsonArray;
        boolean z;
        ?? asString;
        if (((java.lang.Boolean) ((java.util.List) pair.getFirst()).get(0)).booleanValue()) {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                JsonArray jsonArray2 = (JsonArray) new Gson().fromJson(str, JsonArray.class);
                z = jsonArray2 != null && jsonArray2.size() >= C33129mqd.AhwBna("1440");
                if (jsonArray2 != null && jsonArray2.size() > 0 && (asString = jsonArray2.get(0).getAsJsonObject().get(CrashHianalyticsData.TIME).getAsString()) != 0) {
                    objectRef.element = asString;
                }
            } else {
                z = false;
            }
            InterfaceC39563puh.Application application = c39562pug.wlaJM;
            if (application != null) {
                application.values(pFX.AEQbTJ.KWHzl("onHistoryDataUpdate", z, str));
            }
        } else {
            java.lang.String string = "";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) pair.getSecond())) {
                jsonArray = (JsonArray) new Gson().fromJson((java.lang.String) pair.getSecond(), JsonArray.class);
                if (jsonArray != null && jsonArray.size() > 0) {
                    string = jsonArray.get(0).toString();
                }
            } else {
                jsonArray = null;
            }
            if (string == null || string.length() == 0 || string.equals("{}")) {
                if (c39562pug.AkhnZx > 0) {
                    pUU.copydefault("tradingView", "json解析失败：it.second = " + pair.getSecond() + "jsonArray.size() = " + (jsonArray != null ? java.lang.Integer.valueOf(jsonArray.size()) : null) + "dataString = " + string);
                    c39562pug.AkhnZx = c39562pug.AkhnZx - 1;
                }
            } else {
                InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
                if (application2 != null) {
                    application2.values(pFX.AEQbTJ.copydefault("onRealtimeDataUpdate", string));
                }
            }
        }
        if (function2 != null) {
            function2.invoke(((java.util.List) pair.getFirst()).get(0), objectRef.element);
        }
        return Unit.INSTANCE;
    }

    public final int AEQbTJ(java.lang.String str) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ = interfaceC39509ptgDjBIcL != null ? interfaceC39509ptgDjBIcL.AEQbTJ() : null;
        if (arrayListAEQbTJ == null) {
            return 0;
        }
        int size = arrayListAEQbTJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) arrayListAEQbTJ.get(i2).getTradingType())) {
                i = arrayListAEQbTJ.get(i2).timeInterval;
            }
        }
        return i;
    }

    public final java.lang.String valueOf(java.lang.String str) {
        java.lang.String timeMarkPrice;
        java.lang.String str2 = this.getFieldNames;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            timeMarkPrice = "index-candle15m";
        } else {
            timeMarkPrice = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? "mark-price-candle15m" : "candle15m";
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ = interfaceC39509ptgDjBIcL != null ? interfaceC39509ptgDjBIcL.AEQbTJ() : null;
        int i = 0;
        if (arrayListAEQbTJ != null) {
            int size = arrayListAEQbTJ.size();
            int i2 = 0;
            while (i < size) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) arrayListAEQbTJ.get(i).getTradingType())) {
                    i2 = arrayListAEQbTJ.get(i).timeInterval;
                    java.lang.String str3 = this.getFieldNames;
                    if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "TYPE_INDEX_KLINE")) {
                        timeMarkPrice = arrayListAEQbTJ.get(i).getTimeIndex();
                    } else {
                        timeMarkPrice = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") ? arrayListAEQbTJ.get(i).getTimeMarkPrice() : arrayListAEQbTJ.get(i).getTimeKLine();
                    }
                }
                i++;
            }
            i = i2;
        }
        if (i < 360) {
            return timeMarkPrice;
        }
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2) {
            return timeMarkPrice;
        }
        return ((java.lang.Object) timeMarkPrice) + "utc";
    }

    public static /* synthetic */ java.lang.String getCorrectShowGreece2$default(C39562pug c39562pug, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "--";
        }
        return c39562pug.OLrzqt(str, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.length() == 0 ? str2 : pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, 8, java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "";
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        return KWHzl(true, true, str, (dAEQbTJ <= AudioStats.AUDIO_AMPLITUDE_NONE || dAEQbTJ >= 1.0d) ? (dAEQbTJ < 1.0d || dAEQbTJ >= 10.0d) ? (dAEQbTJ < 10.0d || dAEQbTJ >= 100.0d) ? (dAEQbTJ < 100.0d || dAEQbTJ >= 1000.0d) ? 0 : 1 : 2 : 3 : 4, RoundingMode.DOWN, true);
    }

    public static /* synthetic */ java.lang.String getCorrectShowRatio$default(C39562pug c39562pug, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = "--";
        }
        java.lang.String str5 = str3;
        if ((i2 & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c39562pug.copydefault(str, i, str4, str5, roundingMode);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return str.length() == 0 ? str3 : pTB.formatICUPercent$default(new BigDecimal(str), roundingMode, C38307pTy.Companion.EZpvd(i), null, java.lang.Double.valueOf(100.0d), null, 20, null);
    }

    public final java.lang.String KWHzl(boolean z, boolean z2, @NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z && z2) {
            if (!z3) {
                return pTB.toLocalizationStringWithMaxPrecision$default(str, i, roundingMode, null, 4, null);
            }
            BigDecimal scale = C33129mqd.EZpvd(str).setScale(i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale, "");
            return pTB.formatRoundToFixed$default(scale, i, null, 2, null);
        }
        if (z) {
            return C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!z3), roundingMode);
        }
        if (!z2) {
            return str;
        }
        if (!z3) {
            return pTB.toLocalizationStringWithMaxPrecision$default(str, 100, roundingMode, null, 4, null);
        }
        BigDecimal scale2 = C33129mqd.EZpvd(str).setScale(100, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale2, "");
        return pTB.formatRoundToFixed$default(scale2, 100, null, 2, null);
    }

    public static /* synthetic */ java.lang.String getCorrectShowLeverage$default(C39562pug c39562pug, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "--";
        }
        return c39562pug.EZpvd(str, str2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.length() == 0 ? str2 : KWHzl(true, true, str, 2, RoundingMode.UP, true);
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames = str;
        C36246oUr.copydefault().AuCTel(str);
    }

    public final int AEQbTJ(int i) {
        return ContextCompat.getColor(C43246rlf.OLrzqt.valueOf().getApplicationContext(), i);
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String str = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + OLrzqt(Color.red(i)) + OLrzqt(Color.green(i)) + OLrzqt(Color.blue(i));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toHexString(i & 255));
        while (sb.length() < 2) {
            sb.append("0");
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String upperCase = string.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // o.InterfaceC39563puh.StateListAnimator
    public void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final boolean AEQbTJ(java.util.ArrayList<OkxTradePositionBean> arrayList) {
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((OkxTradePositionBean) it.next()).getTLiqPx())) {
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(java.util.ArrayList<OkxTradePositionBean> arrayList) {
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((OkxTradePositionBean) it.next()).getTBePx())) {
                return true;
            }
        }
        return false;
    }

    public final void OLrzqt(ResponseData<java.util.List<java.util.List<java.lang.String>>> responseData, java.lang.String str) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.util.List<? extends oLY> listConvertData$default = convertData$default(this, str, KWHzl(OLrzqt(responseData.getData())), null, 4, null);
                InterfaceC39563puh.Application application = this.wlaJM;
                if (application != null) {
                    application.AhwBna(listConvertData$default);
                }
                java.lang.String strAYXKKw = this.gEmmrt ? oLT.AYXKKw() : oLT.djBIcL();
                java.util.List<java.util.List<java.lang.String>> data = responseData.getData();
                if ((data != null ? data.size() : 0) < C33129mqd.AhwBna(strAYXKKw)) {
                    C36246oUr.copydefault().isConnected(true);
                    return;
                } else {
                    C36246oUr.copydefault().isConnected(false);
                    return;
                }
            }
            C36246oUr.copydefault().isConnected(true);
            responseData.getMsg();
            return;
        }
        C36246oUr.copydefault().isConnected(false);
    }

    public final void KWHzl(ResponseData<java.util.List<java.util.List<java.lang.String>>> responseData, java.lang.String str) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.util.List<? extends oLY> listConvertData$default = convertData$default(this, str, KWHzl(OLrzqt(responseData.getData())), null, 4, null);
                InterfaceC39563puh.Application application = this.wlaJM;
                if (application != null) {
                    application.valueOf(listConvertData$default);
                }
                java.util.List<java.util.List<java.lang.String>> data = responseData.getData();
                if ((data != null ? data.size() : 0) < C33129mqd.AhwBna(oLT.djBIcL())) {
                    C36246oUr.copydefault().values(true);
                    return;
                } else {
                    C36246oUr.copydefault().values(false);
                    return;
                }
            }
            C36246oUr.copydefault().values(true);
            responseData.getMsg();
            return;
        }
        C36246oUr.copydefault().values(false);
    }

    public final java.lang.String EZpvd(ResponseData<java.util.List<java.util.List<java.lang.String>>> responseData, java.lang.String str, java.lang.String str2) {
        java.lang.String ts;
        java.lang.String strGEmmrt;
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.List<BizKLineData> listOLrzqt = OLrzqt(responseData.getData());
            java.util.List<oLY> listKWHzl = KWHzl(listOLrzqt);
            int iAEQbTJ = AEQbTJ(str2);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (oLY oly : listKWHzl) {
                JsonObject jsonObject = new JsonObject();
                InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
                if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2 && iAEQbTJ >= 1440) {
                    jsonObject.addProperty(CrashHianalyticsData.TIME, java.lang.Long.valueOf(oly.EZpvd + ((long) 28800000)));
                } else {
                    jsonObject.addProperty(CrashHianalyticsData.TIME, java.lang.Long.valueOf(oly.EZpvd));
                }
                jsonObject.addProperty("open", java.lang.Double.valueOf(oly.valueOf));
                jsonObject.addProperty(EopTrackEvent.CLOSE, java.lang.Double.valueOf(oly.KWHzl));
                jsonObject.addProperty("high", java.lang.Double.valueOf(oly.copydefault));
                jsonObject.addProperty("low", java.lang.Double.valueOf(oly.OLrzqt));
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
                    jsonObject.addProperty("volume", java.lang.Double.valueOf(oly.djBIcL));
                } else {
                    jsonObject.addProperty("volume", java.lang.Double.valueOf(oly.AhwBna));
                }
                arrayList.add(jsonObject);
            }
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
            C56404yEc.zsXlph(listFJNWhG);
            boolean z = listFJNWhG.size() >= C33129mqd.AhwBna(oLT.djBIcL());
            java.lang.String strEZpvd = C33488mxR.EZpvd(listFJNWhG);
            InterfaceC39563puh.Application application = this.wlaJM;
            if (application != null) {
                application.values(pFX.AEQbTJ.KWHzl("onHistoryDataUpdate", z, strEZpvd));
            }
            BizKLineData bizKLineData = (BizKLineData) CollectionsKt___CollectionsKt.wlaJM(listOLrzqt);
            if (bizKLineData != null && (ts = bizKLineData.getTs()) != null && (strGEmmrt = C33129mqd.gEmmrt(ts)) != null) {
                return strGEmmrt;
            }
        }
        return "";
    }

    public final java.util.List<oLY> KWHzl(java.util.List<BizKLineData> list) {
        if (list == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BizKLineData bizKLineData : list) {
            arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), C33129mqd.AEQbTJ(bizKLineData.getVolCcy()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVolCcyQuote())));
        }
        return arrayList;
    }

    public static final Unit gEmmrt(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.util.ArrayList<HistoryOrderData> arrayListEZpvd = c39562pug.EZpvd(marketCoinInfo.getInstrumentType(), (java.util.List<? extends java.util.List<java.lang.String>>) responseData.getData());
                if (arrayListEZpvd.size() > 1) {
                    C56407yEf.copydefault(arrayListEZpvd, new LoaderManager());
                }
                InterfaceC39563puh.Application application = c39562pug.wlaJM;
                if (application != null) {
                    application.AEQbTJ(arrayListEZpvd);
                }
                pUU.KWHzl("ChartView", "买卖点位数据----size = " + arrayListEZpvd.size());
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pui
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39562pug.copydefault((EventParamsList) obj);
                    }
                });
            } else {
                InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
                if (application2 != null) {
                    application2.AEQbTJ(new java.util.ArrayList<>());
                }
                pUU.KWHzl("ChartView", "买卖点位数据:数据为空 " + responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39562pug c39562pug, ResponseData responseData) {
        InterfaceC39563puh.Application application;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            DrawingDataBean drawingDataBean = (DrawingDataBean) responseData.getData();
            if (drawingDataBean != null && (application = c39562pug.wlaJM) != null) {
                application.OLrzqt(drawingDataBean);
            }
        } else {
            InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
            if (application2 != null) {
                application2.ODXsMY();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C39562pug c39562pug, MarketCoinInfo marketCoinInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
            c39562pug.copydefault = arrayList != null ? arrayList.size() : 0;
            java.util.ArrayList<AlertRemindPo> arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 != null) {
                java.util.ArrayList<PriceWarningItemBean> arrayListEZpvd = c39562pug.EZpvd(arrayList2);
                InterfaceC39563puh.Application application = c39562pug.wlaJM;
                if (application != null) {
                    java.util.ArrayList<PriceWarningItemBean> arrayList3 = new java.util.ArrayList<>();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayListEZpvd) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((PriceWarningItemBean) obj).getInstrumentName(), (java.lang.Object) marketCoinInfo.getInstrumentId())) {
                            arrayList4.add(obj);
                        }
                    }
                    arrayList3.addAll(arrayList4);
                    application.OLrzqt(arrayList3);
                }
            }
        } else {
            c39562pug.copydefault = 0;
            InterfaceC39563puh.Application application2 = c39562pug.wlaJM;
            if (application2 != null) {
                application2.OLrzqt(new java.util.ArrayList<>());
            }
        }
        return Unit.INSTANCE;
    }

    public static final java.util.List OLrzqt(C39562pug c39562pug, java.util.ArrayList arrayList, java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(C56390yDp.OLrzqt(entry.getKey(), c39562pug.OLrzqt(c39562pug.AEQbTJ((java.util.ArrayList<MarketCoinInfo>) arrayList, (java.lang.String) entry.getKey()), (java.util.List<? extends oLY>) entry.getValue(), (java.lang.String) entry.getKey())));
        }
        return arrayList2;
    }
}

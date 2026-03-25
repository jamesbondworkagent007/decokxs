package o;

import android.graphics.Color;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineOrderStatusBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.multichart.MultiChartUseCase$onResume$1;
import com.okinc.kline.ui.view.multichart.MultiChartUseCase$setDrawgingData$1$3;
import com.okinc.kline.ui.view.multichart.MultiChartUseCase$useLocalDrawgingData$1$1$1$2;
import com.okinc.kline.ui.view.multichart.MultiChartUseCase$useLocalDrawgingData$1$1$1$3;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.widget.data.TradeMenuItemBean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pAR implements InterfaceC39563puh.Application {
    public final int AEQbTJ;
    public InterfaceC39502ptZ AYXKKw;
    public AtomicInteger AhwBna;
    public boolean AkhnZx;
    public pCT AuCTel;
    public boolean AuCTelauCTel;
    public java.util.ArrayList<KlineOpenOrderBean> AubY;
    public KLineOrderStatusBean AwvSrB;
    public java.util.ArrayList<KlineOpenOrderBean> AxsJAY;
    public java.util.ArrayList<LineFibDataBean> DTwDnp;
    public boolean DbNXlk;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public int ORxRYg;
    public int OcIXYQ;
    public java.util.ArrayList<LineDataBean> QKVWgx;
    public java.lang.String QOLQEE;
    public java.util.List<? extends TradePositionManager.PositionItem> QUSxYX;
    public MarketTopInfo QVAiDq;
    public C37928pFx QbewEr;
    public final C37771pAb QfsBiF;
    public boolean RJOkX;
    public final java.lang.String copydefault;
    public AbstractC54531xLw djBIcL;
    public java.lang.String ejfBZ;
    public KlineQuoteViewModel fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public C39263pox fetchVPNInfo;
    public final long gEmmrt;
    public java.util.List<? extends TradeAllOrderApi> gHZMYf;
    public java.lang.String getFieldNames;
    public java.util.ArrayList<WatchListData> getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public boolean isConnected;
    public MarketCoinInfo iwGUEr;
    public java.util.ArrayList<TradeAllOrderApi> sSMYrx;
    public InterfaceC39563puh.StateListAnimator uzCIH;
    public final int valueOf;
    public java.util.ArrayList<DrawLineData.DrawLineItem> values;
    public boolean wlaJM;
    public java.util.ArrayList<KlineOpenOrderBean> zLjUOn;
    public android.os.Handler zsXlph;
    public java.util.ArrayList<KlineOpenOrderBean> zuBGHE;

    public static final class Application extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    public static final class TaskDescription extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo AYXKKw() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull KlineQuoteViewModel klineQuoteViewModel) {
        Intrinsics.checkNotNullParameter(klineQuoteViewModel, "");
        this.fARcdN = klineQuoteViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39563puh.StateListAnimator djBIcL() {
        return this.uzCIH;
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public pAR(@NotNull C37771pAb c37771pAb) {
        Intrinsics.checkNotNullParameter(c37771pAb, "");
        this.QfsBiF = c37771pAb;
        this.OLrzqt = "kline_full_screen_tips";
        this.copydefault = "kline_order_cost_tips";
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        this.AuCTelauCTel = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER);
        this.wlaJM = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.RISK_BANNER);
        this.QOLQEE = "";
        this.DbNXlk = true;
        this.KWHzl = "chart_axis";
        this.valueOf = 1;
        this.EZpvd = 2;
        this.OcIXYQ = Color.parseColor("#F9F9F9");
        this.ORxRYg = Color.parseColor("#000000");
        this.gEmmrt = 350L;
        this.values = new java.util.ArrayList<>();
        this.QKVWgx = new java.util.ArrayList<>();
        this.DTwDnp = new java.util.ArrayList<>();
        this.AxsJAY = new java.util.ArrayList<>();
        this.zuBGHE = new java.util.ArrayList<>();
        this.zLjUOn = new java.util.ArrayList<>();
        this.getNewProxyInstance = new java.util.ArrayList<>();
        this.AhwBna = new AtomicInteger();
        this.isConnected = true;
        this.AwvSrB = new KLineOrderStatusBean();
        this.gHZMYf = new java.util.ArrayList();
        this.sSMYrx = new java.util.ArrayList<>();
        this.AubY = new java.util.ArrayList<>();
        this.QUSxYX = new java.util.ArrayList();
        this.QbewEr = new C37928pFx();
        this.getFieldNames = "TYPE_KLINE";
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.pBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pAR.OLrzqt(this.EZpvd);
            }
        });
        this.zsXlph = new android.os.Handler(android.os.Looper.getMainLooper());
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

    public final KlineQuoteViewModel copydefault() {
        KlineQuoteViewModel klineQuoteViewModel = this.fARcdN;
        if (klineQuoteViewModel != null) {
            return klineQuoteViewModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final pCT gEmmrt() {
        pCT pct = this.AuCTel;
        if (pct != null) {
            return pct;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C39263pox EZpvd() {
        C39263pox c39263pox = this.fetchVPNInfo;
        if (c39263pox != null) {
            return c39263pox;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final java.util.ArrayList OLrzqt(pAR par) {
        java.lang.String string = par.QfsBiF.getContext().getResources().getString(C35964oKf.Fragment.zOIQXb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TradeMenuItemBean tradeMenuItemBean = new TradeMenuItemBean(string, Intrinsics.EZpvd((java.lang.Object) par.getFieldNames, (java.lang.Object) "TYPE_KLINE"), java.lang.Integer.valueOf(par.AEQbTJ), null, false, null, 56, null);
        java.lang.String string2 = par.QfsBiF.getContext().getResources().getString(C35964oKf.Fragment.hlkKmr);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TradeMenuItemBean tradeMenuItemBean2 = new TradeMenuItemBean(string2, Intrinsics.EZpvd((java.lang.Object) par.getFieldNames, (java.lang.Object) "TYPE_MARK_PRICE_KLINE"), java.lang.Integer.valueOf(par.valueOf), null, false, null, 56, null);
        java.lang.String string3 = par.QfsBiF.getContext().getResources().getString(C35964oKf.Fragment.DGUQLIhJrIAr);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return yDY.copydefault(tradeMenuItemBean, tradeMenuItemBean2, new TradeMenuItemBean(string3, Intrinsics.EZpvd((java.lang.Object) par.getFieldNames, (java.lang.Object) "TYPE_INDEX_KLINE"), java.lang.Integer.valueOf(par.EZpvd), null, false, null, 56, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final AbstractC54531xLw abstractC54531xLw) {
        this.djBIcL = abstractC54531xLw;
        EZpvd(abstractC54531xLw);
        java.lang.String str = this.fJNWhG;
        if (str == null || abstractC54531xLw.valueOf(str) != null) {
            return;
        }
        abstractC54531xLw.AEQbTJ(str, new Function1() { // from class: o.pAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pAR.copydefault(this.EZpvd, abstractC54531xLw, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(pAR par, AbstractC54531xLw abstractC54531xLw, boolean z) {
        if (z) {
            par.EZpvd(abstractC54531xLw);
        }
        pUU.copydefault("BaseKlineFragment", "重新拉取新币信息: " + z);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fJNWhG = str;
        this.ejfBZ = str2;
        if (str != null && str2 != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            java.lang.String str3 = this.ejfBZ;
            Intrinsics.copydefault((java.lang.Object) str3);
            this.iwGUEr = new MarketCoinInfo(str, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        }
        this.uzCIH = new C39562pug(this, this.iwGUEr, false, false, 12, null);
    }

    public final void copydefault(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AkhnZx = false;
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.uzCIH;
        if (stateListAnimator != null) {
            stateListAnimator.AYXKKw();
        }
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo != null) {
            if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "INDEX")) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MultiChartUseCase$onResume$1(this, null), 3, null);
            } else {
                EZpvd((AbstractC54531xLw) null);
            }
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_kline_page_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pAR.AEQbTJ(this.copydefault, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(pAR par, EventParamsList eventParamsList) {
        java.lang.String instrumentType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        MarketCoinInfo marketCoinInfo = par.iwGUEr;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "-";
        }
        eventParamsList.put("biztype", instrumentType, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        java.lang.String instFamily;
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo != null) {
            if (abstractC54531xLw != null) {
                java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                    this.fIwbmz = instFamily;
                }
                if (bizInstrumentValueOf != null) {
                    C36246oUr.copydefault().AkhnZx(C33129mqd.gEmmrt(abstractC54531xLw.OLrzqt(bizInstrumentValueOf)));
                    C36246oUr.copydefault().uzCIH(bizInstrumentValueOf.getTradeSymbol());
                }
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.uzCIH;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.uzCIH;
            if (stateListAnimator2 != null) {
                MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
                Intrinsics.copydefault(marketCoinInfo2);
                stateListAnimator2.AEQbTJ(marketCoinInfo2);
            }
            KlineQuoteViewModel.initDataAllSit$default(copydefault(), true, false, 2, null);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        android.view.View viewDjBIcL = this.QfsBiF.djBIcL();
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            c36250oUv.AkhnZx().setKlineSpotAverageBean(klineSpotAverageBean);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLw;
        Intrinsics.checkNotNullParameter(list, "");
        copydefault().AEQbTJ(list);
        oLY oly = (oLY) CollectionsKt___CollectionsKt.wlaJM(list);
        if (oly != null) {
            AbstractC54531xLw abstractC54531xLw2 = this.djBIcL;
            if (abstractC54531xLw2 != null) {
                MarketCoinInfo marketCoinInfo = this.iwGUEr;
                java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                bizInstrumentValueOf = abstractC54531xLw2.valueOf(instrumentId);
            } else {
                bizInstrumentValueOf = null;
            }
            java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
            Intrinsics.copydefault((java.lang.Object) instFamily);
            MarketTopInfo marketTopInfo = this.QVAiDq;
            if (marketTopInfo == null || (abstractC54531xLw = this.djBIcL) == null || !Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) "TYPE_KLINE")) {
                return;
            }
            MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
            java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
            if (instrumentType != null) {
                switch (instrumentType.hashCode()) {
                    case -2027980370:
                        if (!instrumentType.equals("MARGIN")) {
                            return;
                        }
                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AEQbTJ))).djBIcL().AEQbTJ(true), false, 1, null));
                        return;
                    case 2552066:
                        if (!instrumentType.equals("SPOT")) {
                            return;
                        }
                        marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AEQbTJ))).djBIcL().AEQbTJ(true), false, 1, null));
                        return;
                    case 2558355:
                        if (!instrumentType.equals("SWAP")) {
                            return;
                        }
                        break;
                    case 214415088:
                        if (!instrumentType.equals("FUTURES")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(java.lang.Double.valueOf(oly.AEQbTJ))).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        copydefault().copydefault(list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        copydefault().OLrzqt("notNet");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x00c1 */
    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.okinc.kline.data.OkxTradePositionBean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.Unit] */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (this.RJOkX) {
            return;
        }
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "SPOT")) {
            return;
        }
        if (arrayList.isEmpty() || C36246oUr.copydefault().DCUTEI().isEmpty()) {
            C36246oUr.copydefault().EZpvd(arrayList);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ?? r4 = (OkxTradePositionBean) it.next();
                java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
                Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
                java.util.Iterator it2 = listDCUTEI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC39510pth) next).getPosId(), (java.lang.Object) r4.getPosId())) {
                            break;
                        }
                    }
                }
                InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) next;
                if (interfaceC39510pth != null) {
                    r4.setLongClick(interfaceC39510pth.getLongClick());
                    r4.setSelected(interfaceC39510pth.getSelected());
                    r4.setLiqSelected(interfaceC39510pth.getLiqSelected());
                    r4.setBeSelected(interfaceC39510pth.getBeSelected());
                    r4.setShowSolid(interfaceC39510pth.getShowSolid());
                    r4.setDragTP(interfaceC39510pth.isDragTP());
                    r4.setDragSL(interfaceC39510pth.isDragSL());
                    r4 = Unit.INSTANCE;
                }
                arrayList2.add(r4);
            }
            C36246oUr.copydefault().EZpvd(arrayList);
        }
        copydefault().copydefault(arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.RJOkX) {
            return;
        }
        this.QUSxYX = list;
        gEmmrt().copydefault(list);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00dd */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.kline.data.KlineOpenOrderBean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<KlineOpenOrderBean> arrayList = (java.util.ArrayList) list;
        this.AubY = arrayList;
        if (this.RJOkX) {
            return;
        }
        if (arrayList.isEmpty() || C36246oUr.copydefault().gasjUx().isEmpty()) {
            C36246oUr.copydefault().AEQbTJ(list);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ?? r3 = (KlineOpenOrderBean) it.next();
                java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
                Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
                java.util.Iterator it2 = listGasjUx.iterator();
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
                arrayList2.add(r3);
            }
            C36246oUr.copydefault().AEQbTJ(list);
        }
        copydefault().KWHzl(true);
        if (this.AwvSrB.isNeedRelevanceCost()) {
            if (this.AwvSrB.isCost()) {
                C37932pGa.AEQbTJ.AEQbTJ(this.QbewEr.AEQbTJ(this.AwvSrB.getOrdId()));
            } else {
                C37932pGa.AEQbTJ.EZpvd(this.QbewEr.copydefault(this.AwvSrB.getOrdId()));
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.sSMYrx = (java.util.ArrayList) list;
        if (this.RJOkX) {
            return;
        }
        this.gHZMYf = list;
        gEmmrt().OLrzqt(list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().KWHzl(str);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        copydefault().KWHzl(arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            java.lang.Integer value = copydefault().QVAiDq().getValue();
            if (value != null) {
                int iIntValue = value.intValue();
                InterfaceC39563puh.StateListAnimator stateListAnimator = this.uzCIH;
                if (stateListAnimator != null) {
                    pEF pef = pEF.OLrzqt;
                    stateListAnimator.KWHzl(this, pef.copydefault(iIntValue), pef.KWHzl(), C33129mqd.gEmmrt(java.lang.Long.valueOf(((oLY) CollectionsKt___CollectionsKt.AubY(list)).EZpvd)), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
                }
            }
            final DrawLineBean drawLineBeanAEQbTJ = oUJ.KWHzl.AEQbTJ();
            if (drawLineBeanAEQbTJ != null) {
                DrawLineData.copydefault.OLrzqt(new Function1() { // from class: o.pBb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pAR.EZpvd(drawLineBeanAEQbTJ, (java.util.ArrayList) obj);
                    }
                });
            }
        }
        getSubIndicator$default(this, null, 1, null);
    }

    public static final Unit AEQbTJ(DrawLineData.DrawLineItem drawLineItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt(drawLineItem.getLineType().getStrName()), true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pAR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSubIndicator$default(pAR par, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        par.KWHzl((java.util.List<java.lang.String>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [601=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(java.util.List<java.lang.String> list) {
        LifecycleOwner lifecycleOwnerAhwBna;
        java.lang.String str = this.fJNWhG;
        if (str != null) {
            C39263pox c39263poxEZpvd = EZpvd();
            java.lang.String str2 = this.ejfBZ;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str4 = this.fJNWhG;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.Integer numKWHzl = c39263poxEZpvd.KWHzl(str2, str4);
            if (numKWHzl != null) {
                int iIntValue = numKWHzl.intValue();
                if (list == null) {
                    list = copydefault().RJOkX().getValue();
                }
                if (list != null) {
                    for (java.lang.String str5 : list) {
                        switch (str5.hashCode()) {
                            case -2040464843:
                                if (str5.equals("LSAcco")) {
                                    str3 = ((java.lang.Object) str3) + "eliteLSAccountRatio,";
                                }
                                break;
                            case 2522:
                                if (str5.equals("OI")) {
                                    str3 = ((java.lang.Object) str3) + "oi,";
                                }
                                break;
                            case 63511234:
                                if (str5.equals("BSVol")) {
                                    str3 = ((java.lang.Object) str3) + "takerBuySellVol,";
                                }
                                break;
                            case 72740685:
                                if (str5.equals("LSPos")) {
                                    str3 = ((java.lang.Object) str3) + "eliteLSOIRatio,";
                                }
                                break;
                            case 1185755844:
                                if (str5.equals("LSRatio")) {
                                    str3 = ((java.lang.Object) str3) + "LSAccountRatio,";
                                }
                                break;
                        }
                    }
                    if (str3.length() == 0 || (lifecycleOwnerAhwBna = this.QfsBiF.AhwBna()) == null) {
                        return;
                    }
                    C39263pox c39263poxEZpvd2 = EZpvd();
                    C37980pHv c37980pHv = C37980pHv.OLrzqt;
                    java.lang.Integer value = copydefault().QVAiDq().getValue();
                    c39263poxEZpvd2.KWHzl(lifecycleOwnerAhwBna, str, str3, iIntValue, 1440, c37980pHv.AEQbTJ(value != null ? value.intValue() : 0));
                }
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
        C36246oUr.copydefault().uzCIH(true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull final DrawingDataBean drawingDataBean) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C37897pEt.KWHzl.copydefault(drawingDataBean, true);
        this.QKVWgx.clear();
        this.DTwDnp.clear();
        DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.pAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pAR.copydefault(this.OLrzqt, objectRef, drawingDataBean, (java.util.ArrayList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.util.ArrayList] */
    public static final Unit copydefault(pAR par, Ref.ObjectRef objectRef, DrawingDataBean drawingDataBean, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        par.values = arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            int i = 0;
            for (java.lang.Object obj : par.values) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                if (drawLineItem.getIndexId().length() == 0) {
                    drawLineItem.setIndexId(C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis() + ((long) i)));
                }
                i++;
            }
            C37895pEr c37895pEr = C37895pEr.copydefault;
            ?? AEQbTJ = c37895pEr.AEQbTJ((java.util.ArrayList<DrawLineData.DrawLineItem>) objectRef.element, par.values);
            objectRef.element = AEQbTJ;
            AEQbTJ.addAll(par.values);
            if (((java.util.ArrayList) objectRef.element).size() > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    java.util.List list = (java.util.List) objectRef.element;
                    if (list.size() > 1) {
                        C56407yEf.copydefault(list, new Activity());
                    }
                    int size = ((java.util.ArrayList) objectRef.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i2 = 0; i2 < size - iEZpvd; i2++) {
                        ((DrawLineData.DrawLineItem) ((java.util.ArrayList) objectRef.element).get(i2)).setDelete(true);
                    }
                    uploadDrawingData$default(par, (java.util.ArrayList) objectRef.element, false, false, 6, null);
                }
            } else {
                uploadDrawingData$default(par, (java.util.ArrayList) objectRef.element, false, false, 6, null);
            }
        }
        C37895pEr c37895pEr2 = C37895pEr.copydefault;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2 = (java.util.ArrayList) objectRef.element;
        java.lang.String timeVersion = drawingDataBean.getTimeVersion();
        java.lang.String str = par.fJNWhG;
        c37895pEr2.AEQbTJ(arrayList2, timeVersion, str == null ? "" : str, par.QKVWgx, par.DTwDnp);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(par), null, null, new MultiChartUseCase$setDrawgingData$1$3(objectRef, par, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void ODXsMY() {
        final java.lang.String str = this.fJNWhG;
        if (str != null) {
            DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.pAZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pAR.KWHzl(this.AEQbTJ, str, (java.util.ArrayList) obj);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final Unit KWHzl(final pAR par, java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        par.values = arrayList;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new java.util.ArrayList();
        par.QKVWgx.clear();
        par.DTwDnp.clear();
        if (C33129mqd.KWHzl((java.util.Collection) par.values)) {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.pBc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pAR.EZpvd(objectRef, par, objectRef2, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pBe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        pAR.OLrzqt(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.pBf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pAR.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pAU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        pAR.valueOf(function12, obj);
                    }
                });
            }
        } else {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault2 = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault2 != null) {
                final Function1 function13 = new Function1() { // from class: o.pAW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pAR.EZpvd(this.OLrzqt, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.pAS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        pAR.djBIcL(function13, obj);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.pAT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return pAR.copydefault((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.pAV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        pAR.AhwBna(function14, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.ArrayList] */
    public static final Unit EZpvd(Ref.ObjectRef objectRef, pAR par, Ref.ObjectRef objectRef2, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Application().getType()));
            ?? Copydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            objectRef.element = Copydefault;
            Copydefault.removeAll(par.values);
            ((java.util.ArrayList) objectRef2.element).addAll((java.util.Collection) objectRef.element);
            ((java.util.ArrayList) objectRef2.element).addAll(par.values);
            int size = ((java.util.ArrayList) objectRef2.element).size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    java.util.List list2 = (java.util.List) objectRef2.element;
                    if (list2.size() > 1) {
                        C56407yEf.copydefault(list2, new ActionBar());
                    }
                    int size2 = ((java.util.ArrayList) objectRef2.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        java.lang.Object obj = ((java.util.ArrayList) objectRef2.element).get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                        drawLineItem.setDelete(true);
                        DrawLineData drawLineData = DrawLineData.copydefault;
                        drawLineData.EZpvd().remove(drawLineItem);
                        drawLineData.EZpvd().add(drawLineItem);
                        par.values.remove(drawLineItem);
                    }
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd(drawLineData2.EZpvd());
                } else {
                    par.copydefault().OLrzqt((java.util.ArrayList<DrawLineData.DrawLineItem>) objectRef2.element);
                    return Unit.INSTANCE;
                }
            }
            if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || !SPUtils.getBoolean("kline_drawing_data", true)) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(par), null, null, new MultiChartUseCase$useLocalDrawgingData$1$1$1$3(objectRef2, par, null), 3, null);
            } else {
                uploadDrawingData$default(par, par.values, false, false, 6, null);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                java.util.ArrayList<DrawLineData.DrawLineItem> arrayList = (java.util.ArrayList) objectRef2.element;
                java.lang.String timeVersion = drawingDataBean.getTimeVersion();
                java.lang.String str = par.fJNWhG;
                c37895pEr2.AEQbTJ(arrayList, timeVersion, str == null ? "" : str, par.QKVWgx, par.DTwDnp);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(par), null, null, new MultiChartUseCase$useLocalDrawgingData$1$1$1$2(objectRef2, par, null), 3, null);
            }
        } else {
            par.AhwBna();
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(pAR par, java.lang.Throwable th) {
        par.AhwBna();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(pAR par, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new TaskDescription().getType()));
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            int size = arrayListCopydefault.size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd() && SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                if (arrayListCopydefault.size() > 1) {
                    C56407yEf.copydefault(arrayListCopydefault, new StateListAnimator());
                }
                int size2 = arrayListCopydefault.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    arrayListCopydefault.get(i).setDelete(true);
                }
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                java.lang.String str = par.fJNWhG;
                if (str == null) {
                    str = "";
                }
                c37895pEr2.AEQbTJ(arrayListCopydefault, "0", str, par.QKVWgx, par.DTwDnp);
                uploadDrawingData$default(par, arrayListCopydefault, false, false, 6, null);
            }
            par.copydefault().OLrzqt(arrayListCopydefault);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str) {
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        DrawLineData drawLineData;
        DrawLineData.DrawLineItem drawLineItemIsConnected2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && C33129mqd.KWHzl((java.util.Collection) this.values) && !z2) {
            AkhnZx();
        }
        if (!z && (drawLineItemIsConnected2 = (drawLineData = DrawLineData.copydefault).isConnected()) != null) {
            drawLineData.EZpvd().remove(drawLineItemIsConnected2);
            drawLineData.EZpvd().add(drawLineItemIsConnected2);
            drawLineData.EZpvd(drawLineData.EZpvd());
        }
        if (z && z3 && (drawLineItemIsConnected = DrawLineData.copydefault.isConnected()) != null) {
            uploadDrawingData$default(this, yDY.copydefault(drawLineItemIsConnected), false, false, 6, null);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.ArrayList<PriceWarningItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C36246oUr.copydefault().copydefault(arrayList);
        copydefault().KWHzl(true);
        InterfaceC39502ptZ interfaceC39502ptZ = this.AYXKKw;
        if (interfaceC39502ptZ == null || interfaceC39502ptZ == null) {
            return;
        }
        interfaceC39502ptZ.isConnected(!arrayList.isEmpty());
    }

    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                Triple triple = (Triple) it.next();
                java.lang.Object first = triple.getFirst();
                java.lang.Object third = triple.getThird();
                android.view.View viewDjBIcL = this.QfsBiF.djBIcL();
                C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
                if (c36250oUv != null) {
                    if (((java.lang.Boolean) triple.getSecond()).booleanValue()) {
                        AbstractC36262oVg abstractC36262oVg = (AbstractC36262oVg) first;
                        c36250oUv.AEQbTJ(abstractC36262oVg);
                        pEV pev = pEV.OLrzqt;
                        java.lang.String strEjfBZ = abstractC36262oVg.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
                        KlineIndicatorBean klineIndicatorBean = (KlineIndicatorBean) third;
                        pev.OLrzqt(strEjfBZ, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "0"));
                        this.QfsBiF.setMainIndicatorSelect();
                        if (!Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "VOLUME")) {
                            if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) ("VOLUME" + C37957pGz.copydefault.OLrzqt()))) {
                            }
                        }
                        c36250oUv.copydefault(new pGP().AEQbTJ(klineIndicatorBean).getFirst());
                        if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getShow(), (java.lang.Object) "1")) {
                            c36250oUv.dNCPSb();
                        }
                    } else {
                        KlineIndicatorBean klineIndicatorBean2 = (KlineIndicatorBean) third;
                        if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean2.getKeyName(), (java.lang.Object) "VOLUME")) {
                            first = new pGP().AEQbTJ(klineIndicatorBean2).getFirst();
                        }
                        AbstractC36262oVg abstractC36262oVg2 = (AbstractC36262oVg) first;
                        c36250oUv.OLrzqt(abstractC36262oVg2);
                        if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean2.getShow(), (java.lang.Object) "0")) {
                            C37771pAb c37771pAb = this.QfsBiF;
                            java.lang.String strEjfBZ2 = abstractC36262oVg2.ejfBZ();
                            Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
                            c37771pAb.AEQbTJ(true, strEjfBZ2);
                        } else if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean2.getShow(), (java.lang.Object) "1")) {
                            C37771pAb c37771pAb2 = this.QfsBiF;
                            java.lang.String strEjfBZ3 = abstractC36262oVg2.ejfBZ();
                            Intrinsics.checkNotNullExpressionValue(strEjfBZ3, "");
                            c37771pAb2.AEQbTJ(false, strEjfBZ3);
                        }
                        pEV pev2 = pEV.OLrzqt;
                        java.lang.String strEjfBZ4 = abstractC36262oVg2.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ4, "");
                        pev2.KWHzl(strEjfBZ4, Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean2.getShow(), (java.lang.Object) "0"));
                        this.QfsBiF.setSideIndicators();
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        LifecycleOwner lifecycleOwnerAhwBna = this.QfsBiF.AhwBna();
        Lifecycle lifecycle = lifecycleOwnerAhwBna != null ? lifecycleOwnerAhwBna.getLifecycle() : null;
        Intrinsics.copydefault(lifecycle);
        return lifecycle;
    }

    public static /* synthetic */ void uploadDrawingData$default(pAR par, java.util.ArrayList arrayList, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        par.EZpvd(arrayList, z, z2);
    }

    public final void EZpvd(@NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, boolean z, boolean z2) {
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
            if (z || drawLineItem.isDelete()) {
                json = "";
            } else if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                lineFibDataBean.setId(indexId);
                C37895pEr c37895pEr = C37895pEr.copydefault;
                lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                java.lang.String str = this.fJNWhG;
                if (str == null) {
                    str = "";
                }
                lineFibDataBean.setState(c37895pEr.KWHzl(drawLineItem, str, true));
                lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.values)) {
                    this.DTwDnp.add(lineFibDataBean);
                }
            } else {
                lineDataBean.setId(indexId);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                java.lang.String str2 = this.fJNWhG;
                if (str2 == null) {
                    str2 = "";
                }
                lineDataBean.setState(c37895pEr2.EZpvd(drawLineItem, str2, true));
                lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.values)) {
                    this.QKVWgx.add(lineDataBean);
                }
            }
            jsonObject.addProperty(indexId, json);
            i++;
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true) && (stateListAnimator = this.uzCIH) != null) {
            java.lang.String str3 = this.fJNWhG;
            if (str3 == null) {
                str3 = "";
            }
            stateListAnimator.AEQbTJ(this, str3, jsonObject, z, z2);
        }
    }

    private final void AhwBna() {
        int size = this.values.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        if (size > c37895pEr.EZpvd()) {
            if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                int size2 = this.values.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    DrawLineData.DrawLineItem drawLineItem = this.values.get(0);
                    Intrinsics.checkNotNullExpressionValue(drawLineItem, "");
                    DrawLineData.copydefault.EZpvd().remove(drawLineItem);
                    this.values.remove(0);
                }
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.EZpvd(drawLineData.EZpvd());
            } else {
                copydefault().OLrzqt(this.values);
                return;
            }
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            uploadDrawingData$default(this, this.values, false, false, 6, null);
            java.lang.String str = this.fJNWhG;
            if (str != null) {
                DrawingDataBean drawingDataBean = new DrawingDataBean("0", str, null, 4, null);
                C37895pEr.copydefault.OLrzqt(drawingDataBean, this.QKVWgx, this.DTwDnp);
                copydefault().OLrzqt(C37897pEt.KWHzl.copydefault(drawingDataBean));
                return;
            }
            return;
        }
        copydefault().OLrzqt(this.values);
    }

    private final void AkhnZx() {
        java.util.Iterator<T> it = this.values.iterator();
        while (it.hasNext()) {
            DrawLineData.copydefault.EZpvd().remove((DrawLineData.DrawLineItem) it.next());
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
    }

    public static final Unit EZpvd(DrawLineBean drawLineBean, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) drawLineItem.getContract(), (java.lang.Object) drawLineBean.getCoinId())) {
                int klineType = drawLineItem.getKlineType();
                java.lang.Integer type = drawLineBean.getType();
                if (type != null && klineType == type.intValue()) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KLine_Mid_DrawingTool_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pAX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pAR.AEQbTJ(drawLineItem, (EventParamsList) obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}

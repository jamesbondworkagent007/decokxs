package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.DcaCopyConfirmTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractDcaLiqPxResult;
import com.okinc.unify_trade.biz.DcaMinMarginResponse;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51254vjZ extends AbstractC51317vkj {
    public java.util.ArrayList<java.lang.Object> AEQbTJ;
    public final C56154xxU AYXKKw;
    public final C56181xxv AhwBna;
    public java.lang.String AkhnZx;
    public final xBG DbNXlk;
    public final TradeLiveData<TickersData> EZpvd;
    public java.lang.String KWHzl;
    public xDM OLrzqt;
    public final C54282xCq copydefault;
    public final C56151xxR djBIcL;
    public final C56185xxz fetchVPNInfo;
    public final C56235xyw gEmmrt;
    public final TradeLiveData<StrategyConfigInfo> isConnected;
    public final TradeLiveData<LimitPriceData> valueOf;
    public final MutableLiveData<BotLeverConfig> values;

    /* JADX INFO: renamed from: o.vjZ$ActionBar */
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
    @Override // o.AbstractC51317vkj
    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public MutableLiveData<BotLeverConfig> AubY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.DcMfJKDIADVb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51254vjZ(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.fetchVPNInfo = new C56185xxz();
        this.gEmmrt = new C56235xyw();
        TradeLiveData<StrategyConfigInfo> tradeLiveData2 = new TradeLiveData<>();
        this.isConnected = tradeLiveData2;
        this.copydefault = new C54282xCq();
        this.EZpvd = new TradeLiveData<>();
        this.DbNXlk = new xBG();
        this.valueOf = new TradeLiveData<>();
        this.AhwBna = new C56181xxv();
        this.AYXKKw = new C56154xxU();
        this.djBIcL = new C56151xxR();
        LiveData map = Transformations.map(tradeLiveData2, new Function1() { // from class: o.vki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.copydefault(this.KWHzl, (StrategyConfigInfo) obj);
            }
        });
        Intrinsics.copydefault(map, "");
        this.values = (MutableLiveData) map;
        this.AEQbTJ = new java.util.ArrayList<>();
    }

    public final boolean UeEOUB() {
        return Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3");
    }

    public static final BotLeverConfig copydefault(C51254vjZ c51254vjZ, StrategyConfigInfo strategyConfigInfo) {
        BotRangeConfig lever;
        BotRangeConfig lever2;
        return new BotLeverConfig((strategyConfigInfo == null || (lever2 = strategyConfigInfo.getLever()) == null) ? null : lever2.getMin(), (strategyConfigInfo == null || (lever = strategyConfigInfo.getLever()) == null) ? null : lever.getMax(), c51254vjZ.ORxRYg().getLever(), strategyConfigInfo != null ? strategyConfigInfo.getLeveragePercents() : null);
    }

    public final MpStgyParam ORxRYg() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    public final MpStgyDetail OcIXYQ() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        C56185xxz c56185xxz = this.fetchVPNInfo;
        c56185xxz.copydefault(copydefault(copyBotReqParam));
        c56185xxz.djBIcL();
        c56185xxz.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(c56185xxz, 0L, 1, null);
    }

    public final DcaOrderReq copydefault(CopyBotReqParam copyBotReqParam) {
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            return new DcaOrderReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, ORxRYg().getAlgoId(), QUSxYX(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, this.AkhnZx, java.lang.String.valueOf(copyBotReqParam.getReinvest()), false, copyBotReqParam.getAutoMarginReloadSwitch(), copyBotReqParam.getAutoMarginReloadMaxAmount(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -56672257, 15, (DefaultConstructorMarker) null);
        }
        return new DcaOrderReq(ORxRYg().getInstId(), iwGUEr().getFirst(), java.lang.Boolean.TRUE, iwGUEr().getSecond(), ORxRYg().getMaxSafetyOrds(), ORxRYg().getPxSteps(), ORxRYg().getPxStepsMult(), ORxRYg().getVolMult(), ORxRYg().getTpPct(), ORxRYg().getSlPct(), ORxRYg().getDirection(), SpotDcaInvestTypeData.MANUAL.getMode(), (java.lang.String) null, (java.lang.String) null, ORxRYg().getAlgoId(), QUSxYX(), ORxRYg().getSlMode(), (java.util.List) ORxRYg().getTriggerParams(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.String.valueOf(copyBotReqParam.getReinvest()), false, copyBotReqParam.getAutoMarginReloadSwitch(), copyBotReqParam.getAutoMarginReloadMaxAmount(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -54775808, 15, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        if (this.isConnected.getValue() == null) {
            C56235xyw c56235xyw = this.gEmmrt;
            c56235xyw.KWHzl("contract_dca");
            c56235xyw.AEQbTJ(ORxRYg().getInstId());
            c56235xyw.djBIcL();
            c56235xyw.AuCTel();
            c56235xyw.OLrzqt(this.isConnected, new C54507xKz());
            xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            OLrzqt();
            return;
        }
        C54282xCq c54282xCq = this.copydefault;
        c54282xCq.AEQbTJ(ORxRYg().getInstId());
        c54282xCq.djBIcL();
        c54282xCq.AuCTel();
        c54282xCq.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        xBG xbg = this.DbNXlk;
        xbg.copydefault(ORxRYg().getInstId());
        xbg.AEQbTJ(this.valueOf);
        xbg.AuCTel();
        xKK.Activity.execute$default(xbg, 0L, 1, null);
        this.gEmmrt.fetchVPNInfo().KWHzl(new ActionBar(new Function1() { // from class: o.vkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.gEmmrt(this.KWHzl, (ResponseData) obj);
            }
        }));
        this.copydefault.fetchVPNInfo().KWHzl(new ActionBar(new Function1() { // from class: o.vkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.valueOf(this.EZpvd, (ResponseData) obj);
            }
        }));
        this.DbNXlk.fetchVPNInfo().KWHzl(new ActionBar(new Function1() { // from class: o.vkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.djBIcL(this.AEQbTJ, (ResponseData) obj);
            }
        }));
    }

    public final void OLrzqt() {
        C56154xxU c56154xxU = this.AYXKKw;
        c56154xxU.OLrzqt(ORxRYg().getAlgoId(), QUSxYX());
        c56154xxU.djBIcL();
        c56154xxU.OLrzqt(giSNqX(), new Activity());
        c56154xxU.OLrzqt(300L);
    }

    /* JADX INFO: renamed from: o.vjZ$Activity */
    public static final class Activity implements InterfaceC54501xKt<java.util.List<? extends DcaMinMarginResponse>, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String KWHzl(java.util.List<DcaMinMarginResponse> list) {
            java.lang.String minMargin;
            Intrinsics.checkNotNullParameter(list, "");
            DcaMinMarginResponse dcaMinMarginResponse = (DcaMinMarginResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            return (dcaMinMarginResponse == null || (minMargin = dcaMinMarginResponse.getMinMargin()) == null) ? "" : minMargin;
        }
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
        gGvvIC().setValue("");
    }

    /* JADX INFO: renamed from: o.vjZ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55740xpe {
        public StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null, null, str2, str, null, null, str3, null, null, str4, "1", null, null, null, null, null, null, null, null, null, 1046963, null);
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                C51254vjZ.this.flVtFt().postValue(maxAvailableResp.getQuoteMax());
            }
            C51254vjZ.this.OLrzqt = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        StateListAnimator stateListAnimator = new StateListAnimator(ORxRYg().getInstId(), ORxRYg().getInstType(), "cross", "net_mode");
        this.AEQbTJ.clear();
        this.AEQbTJ.add(stateListAnimator);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.AEQbTJ);
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.onSeekTo);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        return C56033xvF.getCoinTitle$default(ORxRYg().getInstType(), ORxRYg().getInstId(), false, null, null, 28, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        return AkhnZx();
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt("botName", C33070mpX.AYXKKw(C55688xof.Application.onSeekTo)))), C33070mpX.AYXKKw(C55688xof.Application.zLjUOn), C33070mpX.AYXKKw(C55688xof.Application.GLcwwN), "contract_dca", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.GPCHlQ), C33070mpX.AYXKKw(C55688xof.Application.aQtmcU)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.DBAlnt), C33070mpX.AYXKKw(C55688xof.Application.dbUqJD)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.GQzpsZ), C33070mpX.AYXKKw(C55688xof.Application.OAhWiU))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C33070mpX.AYXKKw(C55688xof.Application.startActivityForResult)), UeEOUB() ? "profit_sharing" : "non_profit_sharing", 0, null, null, FaceDetector.NUM_BOXES, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BotParamItemData AwvSrB() {
        DcaTriggerParam dcaTriggerParam;
        java.lang.String str;
        java.lang.String strCopydefault;
        java.lang.String str2;
        java.lang.String strAYXKKw;
        java.lang.Object next;
        java.util.List<DcaTriggerParam> triggerParams = ORxRYg().getTriggerParams();
        if (triggerParams != null) {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        } else {
            dcaTriggerParam = null;
        }
        java.lang.String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) ContractDcaTriggerType.RSI.getMode())) {
            strCopydefault = C56033xvF.KWHzl(dcaTriggerParam.getTimePeriod(), dcaTriggerParam.getTimeframe(), dcaTriggerParam.getTriggerCond(), dcaTriggerParam.getThold());
        } else if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) ContractDcaTriggerType.PRICE.getMode())) {
            int i = C55688xof.Application.setSubtitle;
            xMR xmr = xMR.copydefault;
            java.lang.String triggerPx = dcaTriggerParam.getTriggerPx();
            if (triggerPx == null) {
                triggerPx = "";
            }
            strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, xmr.copydefault(triggerPx) + " " + getFieldNames())));
        } else {
            str = "";
            ContractDcaTriggerType contractDcaTriggerTypeEZpvd = ContractDcaTriggerType.Companion.EZpvd(dcaTriggerParam == null ? dcaTriggerParam.getTriggerStrategy() : null);
            str2 = (contractDcaTriggerTypeEZpvd != null || (strAYXKKw = C33070mpX.AYXKKw(contractDcaTriggerTypeEZpvd.getShowMode())) == null) ? "" : strAYXKKw;
            if (str2.length() <= 0) {
                return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), str2, null, str, false, false, null, null, null, false, 0, 0, 0, 0, 16372, null);
            }
            return null;
        }
        str = strCopydefault;
        ContractDcaTriggerType contractDcaTriggerTypeEZpvd2 = ContractDcaTriggerType.Companion.EZpvd(dcaTriggerParam == null ? dcaTriggerParam.getTriggerStrategy() : null);
        if (contractDcaTriggerTypeEZpvd2 != null) {
        }
        if (str2.length() <= 0) {
        }
    }

    public final BotParamItemData QKVWgx() {
        DcaTriggerParam dcaTriggerParam;
        java.lang.String str;
        java.lang.Object next;
        java.util.List<DcaTriggerParam> triggerParams = ORxRYg().getTriggerParams();
        if (triggerParams != null) {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) "stop")) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        } else {
            dcaTriggerParam = null;
        }
        java.lang.String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
        ContractDcaStopConditionType contractDcaStopConditionType = ContractDcaStopConditionType.PRICE;
        str = "";
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) contractDcaStopConditionType.getMode())) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.fromParcel, C56423yEv.EZpvd(C56390yDp.OLrzqt("triggerCond", TriggerCond.Companion.KWHzl(dcaTriggerParam.getTriggerCond()))));
            int i = C55688xof.Application.setSubtitle;
            xMR xmr = xMR.copydefault;
            java.lang.String triggerPx = dcaTriggerParam.getTriggerPx();
            str = strCopydefault + "\n" + C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, xmr.copydefault(triggerPx != null ? triggerPx : "") + " " + getFieldNames())));
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (java.lang.Object) contractDcaStopConditionType.getMode()) ? C33070mpX.AYXKKw(contractDcaStopConditionType.getShowMode()) : ContractDcaStopConditionType.Companion.copydefault(ORxRYg().getTriggerParams(), getFieldNames()), null, str, false, false, null, null, null, false, 0, 0, 0, 0, 16372, null);
    }

    public final BotParamItemData zuBGHE() {
        if (C33129mqd.AhwBna(ORxRYg().getMaxSafetyOrds(), 0)) {
            return new BotParamItemData(Intrinsics.EZpvd((java.lang.Object) ORxRYg().getDirection(), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.gqOnQv) : C33070mpX.AYXKKw(C55688xof.Application.hfdhUn), xMR.formatPercent$default(xMR.copydefault, ORxRYg().getPxSteps(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.v), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
        }
        return null;
    }

    public final BotParamItemData QOLQEE() {
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.zDGrpR), xMR.formatPercent$default(xMR.copydefault, ORxRYg().getTpPct(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.GCXiNH), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamItemData AxsJAY() {
        if (!C33129mqd.AEQbTJ(ORxRYg().getMaxSafetyOrds(), 1)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.dPkBzA), xMR.formatDownToFixed$default(xMR.copydefault, ORxRYg().getPxStepsMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), C33070mpX.AYXKKw(C55688xof.Application.FQNKFG), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamItemData QVAiDq() {
        if (!C33129mqd.AEQbTJ(ORxRYg().getMaxSafetyOrds(), 1)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.hdpuIA), xMR.formatDownToFixed$default(xMR.copydefault, ORxRYg().getVolMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), C33070mpX.AYXKKw(C55688xof.Application.FQMcgEfQMcgE), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamItemData zLjUOn() {
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.OijiEz), xMR.copydefault.copydefault(ORxRYg().getMaxSafetyOrds()), C33070mpX.AYXKKw(C55688xof.Application.aeJQwa), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamItemData sSMYrx() {
        if (!C33129mqd.AEQbTJ(ORxRYg().getSafetyOrdRatio(), 0)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DFbvW), "1:" + xMR.formatDownToFixed$default(xMR.copydefault, ORxRYg().getSafetyOrdRatio(), 0, 2, null), C33070mpX.AYXKKw(C55688xof.Application.svhCHd), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamItemData uzCIH() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.jh);
        DcaLeadShareMode dcaLeadShareModeOLrzqt = DcaLeadShareMode.Companion.OLrzqt(ORxRYg().getTrackingMode());
        if (dcaLeadShareModeOLrzqt == null || (strAYXKKw = C33070mpX.AYXKKw(dcaLeadShareModeOLrzqt.getShowMode())) == null) {
            strAYXKKw = "";
        }
        return new BotParamItemData(strAYXKKw2, strAYXKKw, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null);
    }

    public final BotParamItemData gHZMYf() {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ORxRYg().getSlPct())) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.zEHIKV), ContractDcaStopLossType.Companion.AEQbTJ(ORxRYg().getSlMode()) + xMR.formatPercent$default(xMR.copydefault, ORxRYg().getSlPct(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.fMBJsc), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    public final BotParamColorItemData fJNWhG() {
        return new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.geAOna), fIwbmz(), DTwDnp(), 0, 0.0f, 0, null, null, 248, null);
    }

    public final BotParamColorItemData getNewProxyInstance() {
        return new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.aBDePw), hDKMBd(), DTwDnp(), 0, 0.0f, 0, null, null, 248, null);
    }

    public final BotParamItemData AuCTel() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
        java.lang.String username = OcIXYQ().getUsername();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
            username = "--";
        }
        return new BotParamItemData(strAYXKKw, username, null, null, false, false, OcIXYQ().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        java.lang.String botPrice$default;
        java.lang.String botPnl$default;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), ORxRYg().getInstId(), ORxRYg().getInstType(), null, false, 0, 0, 120, null));
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(OcIXYQ().getPTime(), OcIXYQ().getCTime(), null, null, null, 14, null)), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
            arrayList.add(fJNWhG());
            arrayList.add(getNewProxyInstance());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ORxRYg().getInvestmentCcy())) {
                botPrice$default = C56033xvF.getBotPrice$default(ORxRYg().getInstType(), ORxRYg().getInstId(), ORxRYg().getInvestment(), false, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null) + " " + ORxRYg().getInvestmentCcy();
            } else {
                botPrice$default = C56033xvF.getBotPrice$default(ORxRYg().getInstType(), ORxRYg().getInstId(), ORxRYg().getInvestment(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ContentView), botPrice$default, null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ORxRYg().getPnlCcy())) {
                botPnl$default = C56033xvF.getBotPnl$default(ORxRYg().getInstId(), ORxRYg().getInstType(), ORxRYg().getTotalPnl(), null, false, true, C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(ORxRYg().getDisplayDigits())) ? C33129mqd.gEmmrt(ORxRYg().getDisplayDigits()) : "2", false, null, null, null, 1928, null) + ORxRYg().getPnlCcy();
            } else {
                botPnl$default = C56033xvF.getBotPnl$default(ORxRYg().getInstId(), ORxRYg().getInstType(), ORxRYg().getTotalPnl(), null, true, true, "2", false, null, null, null, 1928, null);
            }
            arrayList.add(new BotParamMultiContentData(C33070mpX.AYXKKw(C55688xof.Application.RJOkX), UeEOUB() ? botPnl$default : " ", UeEOUB() ? C56033xvF.fmtBotPnlPercent$default(OcIXYQ().getPnlRatio(), true, 0, 4, null) : " ", C33070mpX.copydefault(C52761wXj.Activity.DeEinT), C56033xvF.OLrzqt((java.lang.Object) OcIXYQ().getPnlRatio())));
            BotParamItemData botParamItemDataSSMYrx = sSMYrx();
            if (botParamItemDataSSMYrx != null) {
                arrayList.add(botParamItemDataSSMYrx);
            }
        } else {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
            arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), ORxRYg().getInstId(), ORxRYg().getInstType(), null, false, 0, 0, 120, null));
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(OcIXYQ().getPTime(), OcIXYQ().getCTime(), null, null, null, 14, null)), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
            arrayList.add(fJNWhG());
            arrayList.add(getNewProxyInstance());
            BotParamItemData botParamItemDataZuBGHE = zuBGHE();
            if (botParamItemDataZuBGHE != null) {
                arrayList.add(botParamItemDataZuBGHE);
            }
            arrayList.add(QOLQEE());
            arrayList.add(zLjUOn());
            BotParamItemData botParamItemDataSSMYrx2 = sSMYrx();
            if (botParamItemDataSSMYrx2 != null) {
                arrayList.add(botParamItemDataSSMYrx2);
            }
            arrayList.add(new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, C55298xhM.dp2px$default(4.0f, null, 1, null), false, 20, null));
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
            BotParamItemData botParamItemDataAwvSrB = AwvSrB();
            if (botParamItemDataAwvSrB != null) {
                arrayList.add(botParamItemDataAwvSrB);
            }
            arrayList.add(QKVWgx());
            BotParamItemData botParamItemDataAxsJAY = AxsJAY();
            if (botParamItemDataAxsJAY != null) {
                arrayList.add(botParamItemDataAxsJAY);
            }
            BotParamItemData botParamItemDataQVAiDq = QVAiDq();
            if (botParamItemDataQVAiDq != null) {
                arrayList.add(botParamItemDataQVAiDq);
            }
            BotParamItemData botParamItemDataGHZMYf = gHZMYf();
            if (botParamItemDataGHZMYf != null) {
                arrayList.add(botParamItemDataGHZMYf);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            arrayList.add(AuCTel());
            arrayList.add(new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
            BotParamItemData botParamItemDataSSMYrx = sSMYrx();
            if (botParamItemDataSSMYrx != null) {
                arrayList.add(botParamItemDataSSMYrx);
            }
            arrayList.add(uzCIH());
        } else {
            arrayList.add(fJNWhG());
            arrayList.add(getNewProxyInstance());
            BotParamItemData botParamItemDataAwvSrB = AwvSrB();
            if (botParamItemDataAwvSrB != null) {
                arrayList.add(botParamItemDataAwvSrB);
            }
            arrayList.add(QKVWgx());
            BotParamItemData botParamItemDataZuBGHE = zuBGHE();
            if (botParamItemDataZuBGHE != null) {
                botParamItemDataZuBGHE.setDoubtMsg("");
                arrayList.add(botParamItemDataZuBGHE);
            }
            BotParamItemData botParamItemDataSSMYrx2 = sSMYrx();
            if (botParamItemDataSSMYrx2 != null) {
                botParamItemDataSSMYrx2.setDoubtMsg("");
                arrayList.add(botParamItemDataSSMYrx2);
            }
            BotParamItemData botParamItemDataAxsJAY = AxsJAY();
            if (botParamItemDataAxsJAY != null) {
                botParamItemDataAxsJAY.setDoubtMsg("");
                arrayList.add(botParamItemDataAxsJAY);
            }
            BotParamItemData botParamItemDataQVAiDq = QVAiDq();
            if (botParamItemDataQVAiDq != null) {
                botParamItemDataQVAiDq.setDoubtMsg("");
                arrayList.add(botParamItemDataQVAiDq);
            }
            BotParamItemData botParamItemDataZLjUOn = zLjUOn();
            botParamItemDataZLjUOn.setDoubtMsg("");
            arrayList.add(botParamItemDataZLjUOn);
            BotParamItemData botParamItemDataQOLQEE = QOLQEE();
            botParamItemDataQOLQEE.setDoubtMsg("");
            arrayList.add(botParamItemDataQOLQEE);
            BotParamItemData botParamItemDataGHZMYf = gHZMYf();
            if (botParamItemDataGHZMYf != null) {
                botParamItemDataGHZMYf.setDoubtMsg("");
                arrayList.add(botParamItemDataGHZMYf);
            }
        }
        KWHzl(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0257  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        BotParamItemData botParamItemDataAwvSrB;
        BotParamItemData botParamItemDataQVAiDq;
        BotParamItemData botParamItemDataAxsJAY;
        BotParamItemData botParamItemDataGHZMYf;
        BotParamItemData botParamItemDataCopy;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            arrayList.add(AuCTel());
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.AxsJAY);
            xMR xmr = xMR.copydefault;
            arrayList.add(new BotParamItemData(strAYXKKw, xMR.formatPercent$default(xmr, ORxRYg().getProfitSharingRatio(), 0, null, 4, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
            arrayList.add(uzCIH());
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2);
            java.lang.String str2 = this.AkhnZx;
            arrayList.add(new BotParamItemData(strAYXKKw2, xmr.copydefault(str2 != null ? str2 : "") + " " + getFieldNames(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
            StrategyConfigInfo value = AhwBna().getValue();
            if (C33129mqd.KWHzl((java.util.Collection) (value != null ? value.getAutoStaking() : null))) {
                C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
            } else {
                StrategyConfigInfo value2 = AhwBna().getValue();
                if (C33129mqd.KWHzl((java.util.Collection) (value2 != null ? value2.getAutoEarn() : null))) {
                }
            }
        } else {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.DsL);
            xMR xmr2 = xMR.copydefault;
            java.lang.String str3 = this.AkhnZx;
            arrayList.add(new BotParamItemData(strAYXKKw3, xmr2.copydefault(str3 != null ? str3 : "") + " " + getFieldNames(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
            BotParamItemData botParamItemDataZuBGHE = zuBGHE();
            if (botParamItemDataZuBGHE != null) {
                arrayList.add(botParamItemDataZuBGHE);
            }
            BotParamItemData botParamItemDataQOLQEE = QOLQEE();
            arrayList.add(botParamItemDataQOLQEE.copy((16379 & 1) != 0 ? botParamItemDataQOLQEE.title : null, (16379 & 2) != 0 ? botParamItemDataQOLQEE.text : null, (16379 & 4) != 0 ? botParamItemDataQOLQEE.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataQOLQEE.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataQOLQEE.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataQOLQEE.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataQOLQEE.rightImage : null, (16379 & 128) != 0 ? botParamItemDataQOLQEE.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataQOLQEE.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataQOLQEE.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataQOLQEE.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataQOLQEE.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataQOLQEE.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataQOLQEE.textStyle : 0));
            BotParamItemData botParamItemDataZLjUOn = zLjUOn();
            arrayList.add(botParamItemDataZLjUOn.copy((16379 & 1) != 0 ? botParamItemDataZLjUOn.title : null, (16379 & 2) != 0 ? botParamItemDataZLjUOn.text : null, (16379 & 4) != 0 ? botParamItemDataZLjUOn.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataZLjUOn.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataZLjUOn.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataZLjUOn.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataZLjUOn.rightImage : null, (16379 & 128) != 0 ? botParamItemDataZLjUOn.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataZLjUOn.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataZLjUOn.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataZLjUOn.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataZLjUOn.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataZLjUOn.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataZLjUOn.textStyle : 0));
            StrategyConfigInfo value3 = AhwBna().getValue();
            if (C33129mqd.KWHzl((java.util.Collection) (value3 != null ? value3.getAutoStaking() : null))) {
                C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
                arrayList.add(AuCTel());
                arrayList.add(new C55848xrg(0, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, 0, false, 28, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
                botParamItemDataAwvSrB = AwvSrB();
                if (botParamItemDataAwvSrB != null && (botParamItemDataCopy = botParamItemDataAwvSrB.copy((16379 & 1) != 0 ? botParamItemDataAwvSrB.title : null, (16379 & 2) != 0 ? botParamItemDataAwvSrB.text : null, (16379 & 4) != 0 ? botParamItemDataAwvSrB.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataAwvSrB.rightDoubtMsg : "", (16379 & 16) != 0 ? botParamItemDataAwvSrB.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataAwvSrB.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataAwvSrB.rightImage : null, (16379 & 128) != 0 ? botParamItemDataAwvSrB.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataAwvSrB.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataAwvSrB.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataAwvSrB.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataAwvSrB.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataAwvSrB.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataAwvSrB.textStyle : 0)) != null) {
                    arrayList.add(botParamItemDataCopy);
                }
                arrayList.add(QKVWgx());
                botParamItemDataQVAiDq = QVAiDq();
                if (botParamItemDataQVAiDq != null) {
                    arrayList.add(botParamItemDataQVAiDq);
                }
                botParamItemDataAxsJAY = AxsJAY();
                if (botParamItemDataAxsJAY != null) {
                    arrayList.add(botParamItemDataAxsJAY);
                }
                botParamItemDataGHZMYf = gHZMYf();
                if (botParamItemDataGHZMYf != null) {
                    arrayList.add(botParamItemDataGHZMYf);
                }
            } else {
                StrategyConfigInfo value4 = AhwBna().getValue();
                if (C33129mqd.KWHzl((java.util.Collection) (value4 != null ? value4.getAutoEarn() : null))) {
                }
                arrayList.add(AuCTel());
                arrayList.add(new C55848xrg(0, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, 0, false, 28, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
                botParamItemDataAwvSrB = AwvSrB();
                if (botParamItemDataAwvSrB != null) {
                    arrayList.add(botParamItemDataCopy);
                }
                arrayList.add(QKVWgx());
                botParamItemDataQVAiDq = QVAiDq();
                if (botParamItemDataQVAiDq != null) {
                }
                botParamItemDataAxsJAY = AxsJAY();
                if (botParamItemDataAxsJAY != null) {
                }
                botParamItemDataGHZMYf = gHZMYf();
                if (botParamItemDataGHZMYf != null) {
                }
            }
        }
        arrayList.add(new DcaCopyConfirmTipsData(ORxRYg().getMaxSafetyOrds(), true, false));
        arrayList.add(new NoConfirmData(false));
        KWHzl(arrayList);
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.fetchVPNInfo, this.gEmmrt, this.copydefault, this.DbNXlk, this.AYXKKw, this.djBIcL);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        java.lang.String pxSteps = ORxRYg().getPxSteps();
        java.lang.String tpPct = ORxRYg().getTpPct();
        java.lang.String maxSafetyOrds = ORxRYg().getMaxSafetyOrds();
        java.lang.String volMult = ORxRYg().getVolMult();
        return new DcaOrderReq((java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, (java.lang.String) null, maxSafetyOrds, pxSteps, ORxRYg().getPxStepsMult(), volMult, tpPct, ORxRYg().getSlPct(), ORxRYg().getDirection(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, QUSxYX(), ORxRYg().getSlMode(), (java.util.List) ORxRYg().getTriggerParams(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -8620021, 15, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        aKErDB();
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            KWHzl();
        } else {
            gEmmrt();
        }
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getCopyType(), (java.lang.Object) "3")) {
            KWHzl();
            OLrzqt();
        } else {
            gEmmrt();
        }
    }

    public final java.lang.String QUSxYX() {
        java.lang.String str = this.KWHzl;
        return str == null ? ORxRYg().getLever() : str;
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.AEQbTJ);
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(ORxRYg().getInstType())) != null) {
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str2 = instFamily;
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(ORxRYg().getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
        return (c54571xNhAhwBna == null || (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "";
        }
        return "≥ " + xMR.copydefault.copydefault(copydefault(str));
    }

    public final java.lang.String copydefault(java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(ORxRYg().getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(str)) == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String getFieldNames() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return C56002xub.KWHzl.KWHzl(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null);
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String marginDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(ORxRYg().getInstType())) != null) {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                marginDig = idxConfigAkhnZx.getMarginDig();
            }
        }
        if (marginDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) marginDig)) {
            return 8;
        }
        return C33129mqd.AhwBna(marginDig);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String QfsBiF() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return C56002xub.KWHzl.KWHzl(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
            arrayList.add(tradeSymbol);
        }
        if (suggestedInstrument$default != null && (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) != null) {
            arrayList.add(quoteSymbol);
        }
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz())) {
            java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
            java.lang.String value = giSNqX().getValue();
            if (value == null) {
                value = "";
            }
            if (C33129mqd.gEmmrt(quoteSz, copydefault(value))) {
                int i = C55688xof.Application.UlJrfe;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2));
                xMR xmr = xMR.copydefault;
                java.lang.String value2 = giSNqX().getValue();
                pairArr[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(copydefault(value2 != null ? value2 : "")));
                pairArr[2] = C56390yDp.OLrzqt("unit", getFieldNames());
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            }
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    public final java.lang.String RJOkX() {
        LimitPriceData value = this.valueOf.getValue();
        java.lang.String buyLmt = value != null ? value.getBuyLmt() : null;
        LimitPriceData value2 = this.valueOf.getValue();
        java.lang.String sellLmt = value2 != null ? value2.getSellLmt() : null;
        TickersData value3 = this.EZpvd.getValue();
        return Intrinsics.EZpvd((java.lang.Object) ORxRYg().getDirection(), (java.lang.Object) "long") ? buyLmt : C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(sellLmt), C33129mqd.AEQbTJ(value3 != null ? value3.getBidPx() : null))));
    }

    public final java.lang.String dNCPSb() {
        TickersData value = this.EZpvd.getValue();
        java.lang.String last = value != null ? value.getLast() : null;
        return (Intrinsics.EZpvd((java.lang.Object) ORxRYg().getDirection(), (java.lang.Object) "long") || C33129mqd.valueOf(ORxRYg().getPxSteps(), 0) || C33129mqd.valueOf(ORxRYg().getPxStepsMult(), 0) || C33129mqd.valueOf(ORxRYg().getMaxSafetyOrds(), 0)) ? last : C33129mqd.mulS$default(last, C33129mqd.addS$default(1, C56045xvR.KWHzl.EZpvd(ORxRYg().getPxSteps(), ORxRYg().getMaxSafetyOrds(), ORxRYg().getPxStepsMult()), null, null, null, 14, null), null, null, null, 14, null);
    }

    public final void AEQbTJ() {
        java.lang.String strDivS$default;
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strCopydefault = copydefault();
        if (C33129mqd.valueOf(strEZpvd, 0) || C33129mqd.valueOf(strCopydefault, 0)) {
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.Object) ORxRYg().getMaxSafetyOrds(), (java.lang.Object) 0)) {
            giSNqX().postValue(strEZpvd);
            return;
        }
        if (C33129mqd.gEmmrt(C33129mqd.divS$default(strCopydefault, strEZpvd, null, null, null, 14, null), ORxRYg().getSafetyOrdRatio())) {
            strDivS$default = strEZpvd;
            strCopydefault = C33129mqd.mulS$default(strDivS$default, ORxRYg().getSafetyOrdRatio(), null, null, null, 14, null);
        } else {
            strDivS$default = C33129mqd.divS$default(strCopydefault, ORxRYg().getSafetyOrdRatio(), null, null, null, 14, null);
        }
        giSNqX().postValue(C33129mqd.addS$default(strDivS$default, C56045xvR.KWHzl.copydefault(strCopydefault, ORxRYg().getMaxSafetyOrds(), ORxRYg().getVolMult()), null, null, null, 14, null));
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ORxRYg().getInstType(), ORxRYg().getInstId(), null, null, 12, null) : null;
        SwapInstrument swapInstrument = suggestedInstrument$default instanceof SwapInstrument ? (SwapInstrument) suggestedInstrument$default : null;
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        java.lang.String minSize = swapInstrument != null ? swapInstrument.getMinSize() : null;
        java.lang.String ctVal = swapInstrument != null ? swapInstrument.getCtVal() : null;
        java.lang.String strQUSxYX = QUSxYX();
        StrategyConfigInfo value = this.isConnected.getValue();
        return c56045xvR.AEQbTJ(minSize, ctVal, str, strQUSxYX, value != null ? value.getMarginBuffer() : null);
    }

    public final java.lang.String EZpvd() {
        return KWHzl(RJOkX());
    }

    public final java.lang.String copydefault() {
        java.lang.String strKWHzl = KWHzl(dNCPSb());
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(strKWHzl), C33129mqd.AEQbTJ(C33129mqd.divS$default(strKWHzl, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(ORxRYg().getVolMult()), C33129mqd.AhwBna(ORxRYg().getMaxSafetyOrds()) - 1)), null, null, null, 14, null)))));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> iwGUEr() {
        int iAhwBna = C33129mqd.AhwBna(ORxRYg().getMaxSafetyOrds());
        java.lang.String strAddS$default = "0";
        for (int i = 0; i < iAhwBna; i++) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(ORxRYg().getVolMult()), i)), null, null, null, 14, null);
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(this.AkhnZx, C33129mqd.addS$default(C33129mqd.mulS$default(ORxRYg().getSafetyOrdRatio(), strAddS$default, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null);
        java.lang.String strMulS$default = C33129mqd.mulS$default(strDivS$default, ORxRYg().getSafetyOrdRatio(), null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C56390yDp.OLrzqt(C33129mqd.formatS$default(strDivS$default, 8, null, roundingMode, 2, null), C33129mqd.formatS$default(strMulS$default, 8, null, roundingMode, 2, null));
    }

    public final void gEmmrt() {
        DcaTriggerParam dcaTriggerParam;
        java.lang.Object next;
        kotlin.Pair<java.lang.String, java.lang.String> pairIwGUEr = iwGUEr();
        java.util.List<DcaTriggerParam> triggerParams = ORxRYg().getTriggerParams();
        if (triggerParams != null) {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                        break;
                    }
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        } else {
            dcaTriggerParam = null;
        }
        java.lang.String triggerPx = Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.PRICE.getMode()) ? dcaTriggerParam.getTriggerPx() : null;
        C56181xxv c56181xxv = this.AhwBna;
        c56181xxv.copydefault(ORxRYg().getInstId(), pairIwGUEr.getFirst(), pairIwGUEr.getSecond(), ORxRYg().getMaxSafetyOrds(), ORxRYg().getPxSteps(), ORxRYg().getPxStepsMult(), ORxRYg().getVolMult(), ORxRYg().getDirection(), QUSxYX(), triggerPx);
        c56181xxv.KWHzl(new Function1() { // from class: o.vkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.AhwBna(this.EZpvd, (ResponseData) obj);
            }
        });
        c56181xxv.OLrzqt(300L);
    }

    public static final Unit AhwBna(C51254vjZ c51254vjZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        c51254vjZ.EZpvd(list != null ? (ContractDcaLiqPxResult) CollectionsKt___CollectionsKt.firstOrNull(list) : null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        if (C33129mqd.valueOf(this.AkhnZx, 0)) {
            EZpvd((ContractDcaLiqPxResult) null);
            return;
        }
        C56151xxR c56151xxR = this.djBIcL;
        c56151xxR.copydefault(ORxRYg().getAlgoId(), this.AkhnZx, QUSxYX());
        c56151xxR.KWHzl(new Function1() { // from class: o.vke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51254vjZ.AYXKKw(this.AEQbTJ, (ResponseData) obj);
            }
        });
        c56151xxR.OLrzqt(300L);
    }

    public static final Unit AYXKKw(C51254vjZ c51254vjZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        c51254vjZ.EZpvd(list != null ? (ContractDcaLiqPxResult) CollectionsKt___CollectionsKt.firstOrNull(list) : null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(ContractDcaLiqPxResult contractDcaLiqPxResult) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.hDKMBd);
        gasjUx().postValue(new LiquidatePriceResponse(AEQbTJ(contractDcaLiqPxResult != null ? contractDcaLiqPxResult.getLiqPx() : null), "", strAYXKKw, "", C33070mpX.AYXKKw(C55688xof.Application.FSMca), "", copydefault(contractDcaLiqPxResult != null ? contractDcaLiqPxResult.getLiqPx() : null, ORxRYg().getMaxSafetyOrds(), ORxRYg().getPxSteps(), ORxRYg().getPxStepsMult(), ORxRYg().getDirection())));
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (C33129mqd.valueOf(str, 0)) {
            return true;
        }
        TickersData value = this.EZpvd.getValue();
        java.lang.String last = value != null ? value.getLast() : null;
        if (C33129mqd.valueOf(last, 0)) {
            return true;
        }
        java.lang.String strEZpvd = C56045xvR.KWHzl.EZpvd(str3 == null ? "" : str3, str2 == null ? "" : str2, str4 != null ? str4 : "");
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "long")) {
            if (C33129mqd.AEQbTJ(str, C33129mqd.mulS$default(last, C33129mqd.subS$default(1, strEZpvd, null, null, null, 14, null), null, null, null, 14, null))) {
                return false;
            }
        } else if (C33129mqd.gEmmrt(str, C33129mqd.mulS$default(last, C33129mqd.addS$default(1, strEZpvd, null, null, null, 14, null), null, null, null, 14, null))) {
            return false;
        }
        return true;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        xMS xmsAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        if (!C33129mqd.valueOf(str, 0) && (xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(ORxRYg().getInstId(), ORxRYg().getInstType())) != null) {
            if (str == null) {
                str = "";
            }
            C54536xML c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(str);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final java.lang.String fIwbmz() {
        return C56033xvF.AhwBna(ORxRYg().getDirection());
    }

    public final int DTwDnp() {
        return C56033xvF.getContractGridSideColor$default(ORxRYg().getDirection(), false, 2, null);
    }

    public final java.lang.String hDKMBd() {
        return C56033xvF.getBotLever$default(QUSxYX(), false, 2, null);
    }

    public final int valueOf() {
        return C56033xvF.getContractGridSideBgColor$default(ORxRYg().getDirection(), false, 2, null);
    }

    public final void KWHzl(java.util.ArrayList<java.lang.Object> arrayList) {
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof BotParamItemData) {
                ((BotParamItemData) obj).setDoubtMsg("");
            }
        }
    }

    public static final Unit gEmmrt(C51254vjZ c51254vjZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            c51254vjZ.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C51254vjZ c51254vjZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            c51254vjZ.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C51254vjZ c51254vjZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c51254vjZ.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}

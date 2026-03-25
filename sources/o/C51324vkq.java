package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.DistributeItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51324vkq extends AbstractC51317vkj {
    public java.util.ArrayList<java.lang.Object> AEQbTJ;
    public xDM AYXKKw;
    public final C56235xyw EZpvd;
    public final CoroutineScope KWHzl;
    public final MutableLiveData<AutoEarnStakingQueryConfig> OLrzqt;
    public MutableLiveData<StrategyConfigInfo> copydefault;
    public final C54245xBg gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public MutableLiveData<AutoEarnStakingQueryConfig> gkJEwt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.SqfPTR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51324vkq(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.gEmmrt = new C54245xBg();
        this.EZpvd = new C56235xyw();
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.KWHzl = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
        this.AEQbTJ = new java.util.ArrayList<>();
    }

    private final MpStgyDetail AEQbTJ() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    private final MpStgyParam copydefault() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    @Override // o.AbstractC51317vkj
    public C55887xsS copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Iterator<T> it = copydefault().getPortfolioList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Intrinsics.EZpvd((java.lang.Object) ((SmartPortfolioListItem) next).getCcy(), (java.lang.Object) copydefault().getInvestCcy())) {
                break;
            }
        }
        SmartPortfolioListItem smartPortfolioListItem = (SmartPortfolioListItem) next;
        java.lang.String ccy = smartPortfolioListItem != null ? smartPortfolioListItem.getCcy() : null;
        if (ccy == null) {
            ccy = "BTC";
        }
        return super.copydefault(str, ccy + "-" + copydefault().getInvestCcy());
    }

    /* JADX INFO: renamed from: o.vkq$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(C33129mqd.AhwBna(((SmartPortfolioListItem) t).getRatio())), java.lang.Integer.valueOf(C33129mqd.AhwBna(((SmartPortfolioListItem) t2).getRatio())));
        }
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (C33129mqd.OLrzqt((java.lang.Object) copyBotReqParam.getQuoteSz(), (java.lang.Object) 0)) {
            return;
        }
        C54245xBg c54245xBg = this.gEmmrt;
        java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
        Intrinsics.copydefault((java.lang.Object) quoteSz);
        c54245xBg.OLrzqt(KWHzl(quoteSz));
        c54245xBg.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(c54245xBg, 0L, 1, null);
    }

    public final SmartPortfolioReq KWHzl(java.lang.String str) {
        java.lang.String strAEQbTJ = fFgQHt().AEQbTJ("smart_portfolio");
        if (strAEQbTJ == null) {
            strAEQbTJ = copydefault().getInvestCcy();
        }
        java.util.List listEZpvd = C56402yEa.EZpvd(new CoinAssetParam(strAEQbTJ, str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SmartPortfolioListItem smartPortfolioListItem : copydefault().getPortfolioList()) {
            if (!Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) copydefault().getInvestCcy()) && !Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) copydefault().getTradeQuoteCcy())) {
                arrayList.add(new CoinRatioParam(smartPortfolioListItem.getCcy(), smartPortfolioListItem.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
        }
        return new SmartPortfolioReq(AYXKKw(), listEZpvd, arrayList, copydefault().getBalType(), copydefault().getInterval(), copydefault().getDeltaRatio(), copydefault().getAlgoId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, copydefault().getInvestCcy(), (java.lang.String) null, (java.lang.String) null, fFgQHt().AEQbTJ("smart_portfolio"), 7040, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        java.lang.String str = "BTC-" + copydefault().getInvestCcy();
        C56235xyw c56235xyw = this.EZpvd;
        c56235xyw.KWHzl("smart_portfolio");
        c56235xyw.AEQbTJ(str);
        c56235xyw.EZpvd(CollectionsKt___CollectionsKt.joinToString$default(copydefault().getPortfolioList(), ",", null, null, 0, null, new Function1() { // from class: o.vkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51324vkq.OLrzqt((SmartPortfolioListItem) obj);
            }
        }, 30, null));
        c56235xyw.OLrzqt(fFgQHt().AEQbTJ("smart_portfolio"));
        c56235xyw.KWHzl(new Function1() { // from class: o.vkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51324vkq.KWHzl(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public static final java.lang.CharSequence OLrzqt(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        return smartPortfolioListItem.getCcy();
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        gGvvIC().setValue("");
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        java.lang.String strAEQbTJ = fFgQHt().AEQbTJ("smart_portfolio");
        pUU.EZpvd("USDRename", "sub Available balance Smart Portfolio, instId:" + copydefault().getInstId() + ", tradeQuoteCcy:" + strAEQbTJ);
        java.lang.String investCcy = copydefault().getInvestCcy();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BTC-");
        sb.append(investCcy);
        Application application = new Application(strAEQbTJ, this, sb.toString(), copydefault().getInstType(), "cash");
        this.AEQbTJ.clear();
        this.AEQbTJ.add(application);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.vkq$Application */
    public static final class Application extends AbstractC55740xpe {
        public final /* synthetic */ C51324vkq KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.lang.String str, C51324vkq c51324vkq, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null, null, str3, str2, null, null, str4, null, java.lang.Boolean.TRUE, null, "1", null, null, null, null, null, null, null, null, str, 522931, null);
            this.KWHzl = c51324vkq;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                this.KWHzl.flVtFt().postValue(maxAvailableResp.getQuoteMax());
            }
            this.KWHzl.AYXKKw = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.FractionRes);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        return CollectionsKt___CollectionsKt.joinToString$default(DbNXlk(), null, null, null, 3, null, null, 55, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        return AkhnZx() + " " + C33070mpX.AYXKKw(C55688xof.Application.to);
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt(C51330vkw.Companion.EZpvd(), C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherOwner)))), C33070mpX.AYXKKw(C55688xof.Application.AubY), C33070mpX.AYXKKw(C55688xof.Application.isAttachedToWindow), "smart_portfolio", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.Api19Impl), C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKtviewModelsfactoryPromise1)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.Api26Impl), C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKtviewModelsfactoryPromise2))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKtviewModels1)), null, 0, null, null, 960, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        java.lang.String strAYXKKw;
        java.lang.String strEZpvd;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) copydefault().getBalType(), (java.lang.Object) "ratio")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.suggest);
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.codename), strAYXKKw, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        if (Intrinsics.EZpvd((java.lang.Object) copydefault().getBalType(), (java.lang.Object) "ratio")) {
            strEZpvd = xMR.formatPercent$default(xMR.copydefault, copydefault().getDeltaRatio(), 0, 0, null, 10, null);
        } else if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(copydefault().getInterval(), 60, null, null, null, 14, null), (java.lang.Object) 0)) {
            java.lang.String strDivS$default = C33129mqd.divS$default(copydefault().getInterval(), 60, null, null, null, 14, null);
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
        } else {
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.AEQbTJ, C33129mqd.AhwBna(copydefault().getInterval()), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(copydefault().getInterval(), null, 1, null))));
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.CheckResult), strEZpvd, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(KWHzl());
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayListFARcdN = fARcdN();
        if (!C56071xvr.gEmmrt.EZpvd(copydefault().getProfitSharingRatio())) {
            arrayListFARcdN.add(0, new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = AEQbTJ().getUsername();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
                username = "--";
            }
            arrayListFARcdN.add(0, new BotParamItemData(strAYXKKw, username, null, null, false, false, AEQbTJ().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        return arrayListFARcdN;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        java.lang.String strAYXKKw;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) copydefault().getBalType(), (java.lang.Object) "ratio")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.suggest);
        }
        if (Intrinsics.EZpvd((java.lang.Object) copydefault().getBalType(), (java.lang.Object) "ratio")) {
            strEZpvd = xMR.formatPercent$default(xMR.copydefault, copydefault().getDeltaRatio(), 0, 0, null, 10, null);
        } else if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(copydefault().getInterval(), 60, null, null, null, 14, null), (java.lang.Object) 0)) {
            java.lang.String strDivS$default = C33129mqd.divS$default(copydefault().getInterval(), 60, null, null, null, 14, null);
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
        } else {
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.AEQbTJ, C33129mqd.AhwBna(copydefault().getInterval()), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(copydefault().getInterval(), null, 1, null))));
        }
        if (!C56071xvr.gEmmrt.EZpvd(copydefault().getProfitSharingRatio())) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = AEQbTJ().getUsername();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
                username = "--";
            }
            arrayList.add(new BotParamItemData(strAYXKKw2, username, null, null, false, false, AEQbTJ().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.toInclusive), strAYXKKw + " " + strEZpvd, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DimenRes), xMR.copydefault.copydefault(str) + " " + fFgQHt().AEQbTJ("smart_portfolio"), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        C54149wys c54149wys = C54149wys.AEQbTJ;
        AutoEarnStakingQueryConfig value = gkJEwt().getValue();
        java.util.List<AutoEarnStakingConfig> autoEarn = value != null ? value.getAutoEarn() : null;
        AutoEarnStakingQueryConfig value2 = gkJEwt().getValue();
        java.util.List<AutoEarnStakingConfig> autoStaking = value2 != null ? value2.getAutoStaking() : null;
        AutoEarnStakingQueryConfig value3 = gkJEwt().getValue();
        c54149wys.AEQbTJ(arrayList, new AutoVipProfitInfo((java.util.List) autoEarn, (java.util.List) autoStaking, value3 != null ? value3.getVipLevel() : null, false, false, 24, (DefaultConstructorMarker) null));
        arrayList.add(KWHzl());
        if (fFgQHt().AuCTel()) {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb), fFgQHt().copydefault("smart_portfolio"), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        arrayList.add(new CoinTipsData(C33070mpX.AYXKKw(C55688xof.Application.IdRes), (java.lang.String) null, 4.0f, false, 10, (DefaultConstructorMarker) null));
        arrayList.add(new NoConfirmData(false));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.gEmmrt, this.EZpvd);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        return KWHzl("");
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        java.lang.String fieldNames;
        C54571xNh c54571xNhEZpvd;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = "BTC-" + copydefault().getInvestCcy();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, copydefault().getInstType(), str2, null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (c54571xNhEZpvd = fFgQHt().EZpvd(str, true, (fieldNames = getFieldNames()))) == null || (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            return "--";
        }
        pUU.EZpvd("USDRename", "Copy Order, botType:smart_portfolio, " + suggestedInstrument$default.joinCcyRelevantToString() + ", tradeQuoteCcy:" + fieldNames + ", formatted available balance: " + safeString$default);
        return safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = "BTC-" + copydefault().getInvestCcy();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, copydefault().getInstType(), str3, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(copydefault().getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, copydefault().getInvestCcy());
        return (c54571xNhAhwBna == null || (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String str = "BTC-" + copydefault().getInvestCcy();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String quoteDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, copydefault().getInstType(), str, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(copydefault().getInstType())) != null) {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        if (quoteDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) quoteDig)) {
            return 8;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String getFieldNames() {
        java.lang.String strCopydefault = fFgQHt().copydefault("smart_portfolio");
        return (strCopydefault == null || strCopydefault.length() == 0) ? copydefault().getInvestCcy() : strCopydefault;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAhwBna = xMR.copydefault.AhwBna(str, ejfBZ());
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        return "≥ " + strAhwBna;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String QfsBiF() {
        return fFgQHt().copydefault("smart_portfolio");
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(AEQbTJ().getCcy());
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        java.lang.String value = giSNqX().getValue();
        if (value == null) {
            value = "";
        }
        xMR xmr = xMR.copydefault;
        java.lang.String value2 = giSNqX().getValue();
        if (value2 == null) {
            value2 = "";
        }
        java.lang.String str = xmr.AhwBna(value2, ejfBZ()) + " " + getFieldNames();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz()) && C33129mqd.gEmmrt(copyBotReqParam.getQuoteSz(), value)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.HalfFloat), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.AEQbTJ);
        }
        CoroutineScopeKt.cancel$default(this.KWHzl, null, 1, null);
    }

    private final SmartCoinsData KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SmartPortfolioListItem smartPortfolioListItem : copydefault().getPortfolioList()) {
            if (!Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) copydefault().getInvestCcy())) {
                java.lang.String ccy = smartPortfolioListItem.getCcy();
                java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, smartPortfolioListItem.getRatio(), 2, 0, null, 8, null);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                arrayList.add(new DistributeItem(ccy, 0, percent$default, interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(smartPortfolioListItem.getCcy()) : null, 0, 18, (DefaultConstructorMarker) null));
            }
        }
        return new SmartCoinsData(C33070mpX.AYXKKw(C55688xof.Application.setElevation), arrayList, false, 0.0f, 4, null);
    }

    public static final Unit KWHzl(C51324vkq c51324vkq, ResponseData responseData) {
        java.util.List list;
        StrategyConfigInfo strategyConfigInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null && (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            c51324vkq.copydefault.setValue(strategyConfigInfo);
            MutableLiveData<AutoEarnStakingQueryConfig> mutableLiveData = c51324vkq.OLrzqt;
            SmartPortfolioConfig smartPortfolioConfig = strategyConfigInfo.getSmartPortfolioConfig();
            java.util.List<AutoEarnStakingConfig> autoEarn = smartPortfolioConfig != null ? smartPortfolioConfig.getAutoEarn() : null;
            SmartPortfolioConfig smartPortfolioConfig2 = strategyConfigInfo.getSmartPortfolioConfig();
            mutableLiveData.setValue(new AutoEarnStakingQueryConfig(autoEarn, smartPortfolioConfig2 != null ? smartPortfolioConfig2.getAutoStaking() : null, strategyConfigInfo.getVipLevel()));
            java.util.ArrayList<SmartPortfolioListItem> portfolioList = c51324vkq.copydefault().getPortfolioList();
            if (portfolioList.size() > 1) {
                C56407yEf.copydefault(portfolioList, new Activity());
            }
            c51324vkq.giSNqX().postValue(C33129mqd.divS$default(strategyConfigInfo.getPerCoinMinAmt(), C33129mqd.copydefault(c51324vkq.copydefault().getPortfolioList().get(0).getRatio()), null, null, null, 14, null));
        }
        return Unit.INSTANCE;
    }
}

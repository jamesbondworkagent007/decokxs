package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.ContractGridPresenter$fetchLiqPriceDebounced$1;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51321vkn extends AbstractC51317vkj {
    public java.lang.String AYXKKw;
    public final C56288xzw AhwBna;
    public final C56238xyz AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String DbNXlk;
    public java.util.ArrayList<java.lang.Object> EZpvd;
    public final MutableLiveData<StrategyConfigInfo> KWHzl;
    public CoroutineScope OLrzqt;
    public xDM copydefault;
    public final C56235xyw djBIcL;
    public final C56238xyz fetchVPNInfo;
    public final C56188xyB gEmmrt;
    public java.lang.String isConnected;
    public Job valueOf;
    public final C54219xAh values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56238xyz KWHzl() {
        return this.AkhnZx;
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.svY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51321vkn(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.values = new C54219xAh();
        this.AhwBna = new C56288xzw();
        this.djBIcL = new C56235xyw();
        this.gEmmrt = new C56188xyB();
        this.KWHzl = new MutableLiveData<>();
        this.fetchVPNInfo = new C56238xyz();
        this.AkhnZx = new C56238xyz();
        this.EZpvd = new java.util.ArrayList<>();
    }

    /* JADX INFO: renamed from: o.vkn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vkn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final CoroutineScope gEmmrt() {
        CoroutineScope coroutineScope = this.OLrzqt;
        if (coroutineScope == null || coroutineScope == null || !CoroutineScopeKt.isActive(coroutineScope)) {
            this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
        }
        CoroutineScope coroutineScope2 = this.OLrzqt;
        Intrinsics.copydefault(coroutineScope2);
        return coroutineScope2;
    }

    public final MpStgyParam fJNWhG() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    private final MpStgyDetail hDKMBd() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    private final boolean sSMYrx() {
        return Intrinsics.EZpvd((java.lang.Object) fJNWhG().getCopyType(), (java.lang.Object) "3");
    }

    public final void EZpvd() {
        if (fJNWhG().getInstId().length() == 0 || C33129mqd.valueOf(fJNWhG().getSz(), 0)) {
            dvKsVJ().postValue(new ExtraActualMarginResp("", ""));
            return;
        }
        C56188xyB c56188xyB = this.gEmmrt;
        c56188xyB.copydefault(fJNWhG().getInstId());
        c56188xyB.AYXKKw(fJNWhG().getSz());
        c56188xyB.djBIcL();
        c56188xyB.OLrzqt(dvKsVJ(), new Activity());
        xKK.Activity.execute$default(c56188xyB, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkn$Activity */
    public static final class Activity implements InterfaceC54501xKt<java.util.List<? extends ExtraActualMarginResp>, ExtraActualMarginResp> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public ExtraActualMarginResp KWHzl(java.util.List<ExtraActualMarginResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C51321vkn.this.OLrzqt(list);
        }
    }

    public final ExtraActualMarginResp OLrzqt(java.util.List<ExtraActualMarginResp> list) {
        return C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 0) ? list.get(0) : new ExtraActualMarginResp((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (C33129mqd.OLrzqt((java.lang.Object) copyBotReqParam.getQuoteSz(), (java.lang.Object) 0)) {
            return;
        }
        C54219xAh c54219xAh = this.values;
        c54219xAh.EZpvd(iwGUEr());
        c54219xAh.OLrzqt(KWHzl(z));
        c54219xAh.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public final StrategyBaseReq iwGUEr() {
        return new StrategyBaseReq(fJNWhG().getInstId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, fJNWhG().getAlgoOrdType(), (TradeType) null, fJNWhG().getAlgoId(), (java.lang.Boolean) null, 1406, (DefaultConstructorMarker) null);
    }

    public final ContractGridReq KWHzl(boolean z) {
        boolean basePos = fJNWhG().getBasePos();
        java.lang.String gridNum = fJNWhG().getGridNum();
        java.lang.String maxPx = fJNWhG().getMaxPx();
        java.lang.String minPx = fJNWhG().getMinPx();
        java.lang.String runType = fJNWhG().getRunType();
        java.lang.String slTriggerPx = fJNWhG().getSlTriggerPx();
        java.lang.String tpTriggerPx = fJNWhG().getTpTriggerPx();
        java.lang.String tpRatio = fJNWhG().getTpRatio();
        java.lang.String slRatio = fJNWhG().getSlRatio();
        java.lang.String direction = fJNWhG().getDirection();
        java.lang.String strZLjUOn = zLjUOn();
        java.util.ArrayList<AdvancedTriggerSign> arrayListEZpvd = C56033xvF.EZpvd(fJNWhG().getSignParams());
        java.lang.Boolean autoReserve = fJNWhG().getAutoReserve();
        ContractGridReq contractGridReq = new ContractGridReq((java.lang.String) null, (java.lang.String) null, java.lang.Boolean.valueOf(basePos), gridNum, "2", maxPx, minPx, fJNWhG().getSz(), runType, slTriggerPx, tpTriggerPx, tpRatio, slRatio, (java.lang.String) null, (java.lang.String) null, direction, (java.lang.String) null, strZLjUOn, arrayListEZpvd, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, autoReserve, fJNWhG().getActualMarginSz(), fJNWhG().getExtraMarginSz(), (java.lang.String) null, fJNWhG().getOpenPosSlippage(), (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1207525379, 15, (DefaultConstructorMarker) null);
        if (z) {
            contractGridReq.setActualMarginSz("");
            contractGridReq.setExtraMarginSz("");
        } else {
            contractGridReq.setSz("");
        }
        return contractGridReq;
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        C56238xyz c56238xyz = this.fetchVPNInfo;
        c56238xyz.OLrzqt(fJNWhG().getDirection());
        c56238xyz.AEQbTJ(fJNWhG().getInstId());
        c56238xyz.KWHzl(fJNWhG().getGridNum());
        c56238xyz.AYXKKw(fJNWhG().getMaxPx());
        c56238xyz.djBIcL(fJNWhG().getMinPx());
        c56238xyz.KWHzl(C33129mqd.AhwBna(fJNWhG().getRunType()));
        c56238xyz.valueOf(zLjUOn());
        c56238xyz.AhwBna(fJNWhG().getAlgoId());
        c56238xyz.EZpvd(java.lang.Boolean.valueOf(fJNWhG().getBasePos()));
        SignParamItem signParamItemAuCTel = AuCTel();
        c56238xyz.isConnected(signParamItemAuCTel != null ? signParamItemAuCTel.getIndicator() : null);
        c56238xyz.OLrzqt(fJNWhG().getAutoReserve());
        SignParamItem signParamItemAuCTel2 = AuCTel();
        if (signParamItemAuCTel2 != null && Intrinsics.EZpvd((java.lang.Object) signParamItemAuCTel2.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(signParamItemAuCTel2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(giSNqX(), new ActionBar());
        xKK.Activity.execute$default(c56238xyz, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkn$ActionBar */
    public static final class ActionBar implements InterfaceC54501xKt<java.util.List<? extends MinInvestResp>, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.String KWHzl(java.util.List<MinInvestResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ((MinInvestResp) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getMinInvestment();
        }
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
        if (C33129mqd.valueOf(this.isConnected, giSNqX().getValue()) || C33129mqd.OLrzqt((java.lang.Object) this.isConnected, (java.lang.Object) 0)) {
            gGvvIC().setValue("");
            return;
        }
        java.lang.String str = getFieldNames() + ":" + this.isConnected;
        C56238xyz c56238xyz = this.AkhnZx;
        c56238xyz.OLrzqt(fJNWhG().getDirection());
        c56238xyz.AEQbTJ(fJNWhG().getInstId());
        c56238xyz.KWHzl(fJNWhG().getGridNum());
        c56238xyz.AYXKKw(fJNWhG().getMaxPx());
        c56238xyz.djBIcL(fJNWhG().getMinPx());
        c56238xyz.KWHzl(C33129mqd.AhwBna(fJNWhG().getRunType()));
        c56238xyz.valueOf(zLjUOn());
        c56238xyz.AhwBna(fJNWhG().getAlgoId());
        c56238xyz.copydefault(str);
        c56238xyz.EZpvd(java.lang.Boolean.valueOf(fJNWhG().getBasePos()));
        SignParamItem signParamItemAuCTel = AuCTel();
        c56238xyz.isConnected(signParamItemAuCTel != null ? signParamItemAuCTel.getIndicator() : null);
        c56238xyz.OLrzqt(fJNWhG().getAutoReserve());
        SignParamItem signParamItemAuCTel2 = AuCTel();
        if (signParamItemAuCTel2 != null && Intrinsics.EZpvd((java.lang.Object) signParamItemAuCTel2.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(signParamItemAuCTel2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(gGvvIC(), new Fragment());
        xKK.Activity.execute$default(c56238xyz, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkn$Fragment */
    public static final class Fragment implements InterfaceC54501xKt<java.util.List<? extends MinInvestResp>, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String KWHzl(java.util.List<MinInvestResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ((MinInvestResp) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getMinInvestment();
        }
    }

    /* JADX INFO: renamed from: o.vkn$Application */
    public static final class Application extends AbstractC55740xpe {
        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null, null, str2, str, null, null, str3, null, null, str4, "1", null, null, null, null, null, null, null, null, null, 1046963, null);
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                C51321vkn.this.finit().postValue(maxAvailableResp.getBaseMax());
                C51321vkn.this.flVtFt().postValue(maxAvailableResp.getQuoteMax());
            }
            C51321vkn.this.copydefault = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        Application application = new Application(fJNWhG().getInstId(), fJNWhG().getInstType(), "cross", "net_mode");
        this.EZpvd.clear();
        this.EZpvd.add(application);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.EZpvd);
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.onContextAvailable);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        return C56033xvF.getCoinTitle$default(fJNWhG().getInstType(), fJNWhG().getInstId(), false, null, null, 28, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        return AkhnZx();
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt(C51330vkw.Companion.EZpvd(), C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherLifecycleOnBackPressedCancellable)))), C33070mpX.AYXKKw(C55688xof.Application.wlaJM), C33070mpX.AYXKKw(C55688xof.Application.HJWChPDXdlte), "contract_grid", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.hcetpZ), C33070mpX.AYXKKw(C55688xof.Application.RhjxDW)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.HJWChPHhYHK), C33070mpX.AYXKKw(C55688xof.Application.iLWfRf))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C33070mpX.AYXKKw(C55688xof.Application.getEnabledChangedCallbackactivity_release)), sSMYrx() ? "profit_sharing" : "non_profit_sharing", 0, null, null, FaceDetector.NUM_BOXES, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        return getParamsList$default(this, null, 1, null);
    }

    public static /* synthetic */ java.util.ArrayList getParamsList$default(C51321vkn c51321vkn, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c51321vkn.valueOf(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v61, resolved type: o.xMR */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bc  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<java.lang.Object> valueOf(java.lang.String str) {
        xMS xmsGEmmrt;
        java.lang.String strCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String strCopydefault2;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String str2;
        java.lang.String strAYXKKw;
        ?? r4;
        ?? r5;
        java.lang.String str3;
        java.lang.String botPnl$default;
        java.lang.String strAYXKKw2;
        java.lang.String actualMarginSz;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        java.lang.String str4;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo3;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo4;
        boolean z;
        java.lang.String downToMax$default;
        boolean z2;
        java.lang.String actualMarginSz2;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        java.lang.String str5;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        java.lang.String instFamily3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo5;
        java.lang.String safeString$default2;
        AbstractC54531xLw abstractC54531xLwOLrzqt4;
        java.lang.String instFamily4;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo6;
        boolean z3;
        boolean z4;
        java.lang.String safeString$default3;
        AbstractC54531xLw abstractC54531xLwOLrzqt5;
        java.lang.String instFamily5;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLFetchVPNInfo7;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLCopydefault3;
        AbstractC54531xLw abstractC54531xLwOLrzqt6;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (!sSMYrx()) {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
        }
        java.lang.String strCopydefault3 = copydefault();
        int newProxyInstance = getNewProxyInstance();
        int iOLrzqt = OLrzqt();
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56037xvJ.OLrzqt(fJNWhG().getInstType(), fJNWhG().getInstId(), fJNWhG().getTpTriggerPx(), fJNWhG().getTpRatio());
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = C56037xvJ.KWHzl(fJNWhG().getInstType(), fJNWhG().getInstId(), fJNWhG().getSlTriggerPx(), fJNWhG().getSlRatio());
        java.lang.String strAEQbTJ = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fJNWhG().getLever()) ? "--" : AEQbTJ();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        java.lang.String strEZpvd = (Intrinsics.EZpvd((java.lang.Object) fJNWhG().getPriceRangeCcy(), (java.lang.Object) "USD") && suggestedInstrument$default != null && Intrinsics.EZpvd(suggestedInstrument$default.isNegativeContract(), java.lang.Boolean.TRUE)) ? C56033xvF.EZpvd(suggestedInstrument$default) : fJNWhG().getPriceRangeCcy();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt6 = interfaceC54581xNrOLrzqt.OLrzqt(fJNWhG().getInstType())) == null) {
            xmsGEmmrt = null;
        } else {
            java.lang.String instFamily6 = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (instFamily6 == null) {
                instFamily6 = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt6.gEmmrt(instFamily6);
        }
        C54536xML c54536xMLDjBIcL6 = (xmsGEmmrt == null || (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(fJNWhG().getMinPx())) == null || (c54536xMLCopydefault3 = c54536xMLAYXKKw2.copydefault()) == null) ? null : c54536xMLCopydefault3.djBIcL();
        if (strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
            strCopydefault = C53418wlC.copydefault((c54536xMLDjBIcL6 == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL6.fetchVPNInfo()) == null) ? null : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null));
        } else {
            strCopydefault = C53418wlC.copydefault(c54536xMLDjBIcL6 != null ? C54536xML.toSafeString$default(c54536xMLDjBIcL6, false, 1, null) : null) + " " + strEZpvd;
        }
        java.lang.String str6 = strCopydefault;
        C54536xML c54536xMLDjBIcL7 = (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(fJNWhG().getMaxPx())) == null || (c54536xMLCopydefault2 = c54536xMLAYXKKw.copydefault()) == null) ? null : c54536xMLCopydefault2.djBIcL();
        if (strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
            strCopydefault2 = C53418wlC.copydefault((c54536xMLDjBIcL7 == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL7.fetchVPNInfo()) == null) ? null : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null));
        } else {
            strCopydefault2 = C53418wlC.copydefault(c54536xMLDjBIcL7 != null ? C54536xML.toSafeString$default(c54536xMLDjBIcL7, false, 1, null) : null) + " " + strEZpvd;
        }
        java.lang.String str7 = strCopydefault2;
        java.lang.String runType = fJNWhG().getRunType();
        if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                str2 = "--";
                arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), fJNWhG().getInstId(), fJNWhG().getInstType(), null, false, 0, 0, 120, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(hDKMBd().getPTime(), hDKMBd().getCTime(), null, null, null, 14, null)), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                arrayList.add(new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.geAOna), strCopydefault3, newProxyInstance, iOLrzqt, 0.0f, 0, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                arrayList.add(new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.aBDePw), strAEQbTJ, newProxyInstance, 0, 0.0f, 0, null, null, 248, null));
                if (sSMYrx()) {
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState), str6, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), str7, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.getCallerInput);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fJNWhG().getGridNum())) {
                        downToMax$default = "--";
                        z = false;
                        str3 = null;
                    } else {
                        z = false;
                        str3 = null;
                        downToMax$default = xMR.formatDownToMax$default(xMR.copydefault, fJNWhG().getGridNum(), 0, 2, null);
                    }
                    arrayList.add(new BotParamItemData(strAYXKKw3, downToMax$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    if (str != null) {
                        MpStgyParam mpStgyParamFJNWhG = fJNWhG();
                        if (mpStgyParamFJNWhG != null && Intrinsics.EZpvd(mpStgyParamFJNWhG.getAutoReserve(), java.lang.Boolean.TRUE)) {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault3 = c54589xNz.copydefault();
                            if (interfaceC54581xNrCopydefault3 == null || (abstractC54531xLwOLrzqt5 = interfaceC54581xNrCopydefault3.OLrzqt(fJNWhG().getInstType())) == null) {
                                z3 = true;
                                safeString$default3 = "--";
                                z4 = z3;
                                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : safeString$default3, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                z2 = z4;
                            } else {
                                if (suggestedInstrument$default == null || (instFamily5 = suggestedInstrument$default.getInstFamily()) == null) {
                                    instFamily5 = "";
                                }
                                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt5, instFamily5, str3, 2, str3);
                                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLDjBIcL5 = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLFetchVPNInfo7 = c54536xMLDjBIcL5.fetchVPNInfo()) != null) {
                                    z3 = true;
                                    z4 = true;
                                    safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo7, z, 1, str3);
                                    if (safeString$default3 == null) {
                                    }
                                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : safeString$default3, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                    z2 = z4;
                                }
                                safeString$default3 = "--";
                                z4 = z3;
                                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : safeString$default3, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                z2 = z4;
                            }
                        } else {
                            z2 = true;
                            InterfaceC54581xNr interfaceC54581xNrCopydefault4 = c54589xNz.copydefault();
                            if (interfaceC54581xNrCopydefault4 == null || (abstractC54531xLwOLrzqt4 = interfaceC54581xNrCopydefault4.OLrzqt(fJNWhG().getInstType())) == null) {
                                java.lang.String safeString$default4 = "--";
                                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                                actualMarginSz2 = fJNWhG().getActualMarginSz();
                                if (actualMarginSz2 == null) {
                                    actualMarginSz2 = "";
                                }
                                arrayList.add(new BotParamItemData(strAYXKKw4, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz2) ? "--" : safeString$default4, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
                                if (interfaceC54581xNrCopydefault2 != null || (abstractC54531xLwOLrzqt3 = interfaceC54581xNrCopydefault2.OLrzqt(fJNWhG().getInstType())) == null) {
                                    str5 = "--";
                                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str5, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                } else {
                                    if (suggestedInstrument$default == null || (instFamily3 = suggestedInstrument$default.getInstFamily()) == null) {
                                        instFamily3 = "";
                                    }
                                    xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt3, instFamily3, str3, 2, str3);
                                    if (xmvCreateSizeConverterWithIndex$default2 != null) {
                                        java.lang.String extraMarginSz = fJNWhG().getExtraMarginSz();
                                        if (extraMarginSz == null) {
                                            extraMarginSz = "";
                                        }
                                        C54536xML c54536xMLCopydefault4 = xmvCreateSizeConverterWithIndex$default2.copydefault(extraMarginSz);
                                        if (c54536xMLCopydefault4 != null && (c54536xMLDjBIcL3 = c54536xMLCopydefault4.djBIcL()) != null && (c54536xMLFetchVPNInfo5 = c54536xMLDjBIcL3.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo5, z, 1, str3)) != null) {
                                            str5 = safeString$default2;
                                        }
                                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str5, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                    }
                                }
                            } else {
                                if (suggestedInstrument$default == null || (instFamily4 = suggestedInstrument$default.getInstFamily()) == null) {
                                    instFamily4 = "";
                                }
                                xMV xmvCreateSizeConverterWithIndex$default3 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt4, instFamily4, str3, 2, str3);
                                if (xmvCreateSizeConverterWithIndex$default3 != null) {
                                    java.lang.String actualMarginSz3 = fJNWhG().getActualMarginSz();
                                    if (actualMarginSz3 == null) {
                                        actualMarginSz3 = "";
                                    }
                                    C54536xML c54536xMLCopydefault5 = xmvCreateSizeConverterWithIndex$default3.copydefault(actualMarginSz3);
                                    if (c54536xMLCopydefault5 == null || (c54536xMLDjBIcL4 = c54536xMLCopydefault5.djBIcL()) == null || (c54536xMLFetchVPNInfo6 = c54536xMLDjBIcL4.fetchVPNInfo()) == null || (safeString$default4 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo6, z, 1, str3)) == null) {
                                    }
                                    java.lang.String strAYXKKw42 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                                    actualMarginSz2 = fJNWhG().getActualMarginSz();
                                    if (actualMarginSz2 == null) {
                                    }
                                    arrayList.add(new BotParamItemData(strAYXKKw42, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz2) ? "--" : safeString$default4, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                    interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
                                    if (interfaceC54581xNrCopydefault2 != null) {
                                        str5 = "--";
                                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str5, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                    }
                                }
                            }
                        }
                        C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
                        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
                        java.lang.String username = hDKMBd().getUsername();
                        arrayList.add(new BotParamItemData(strAYXKKw5, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username) ? "--" : username, null, null, false, false, hDKMBd().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
                        r4 = z2;
                        r5 = z;
                    } else {
                        r4 = 1;
                        r5 = z;
                    }
                } else {
                    r4 = 1;
                    r5 = 0;
                    str3 = null;
                }
                if (sSMYrx()) {
                    MpStgyParam mpStgyParamFJNWhG2 = fJNWhG();
                    if (mpStgyParamFJNWhG2 != null && Intrinsics.EZpvd(mpStgyParamFJNWhG2.getAutoReserve(), java.lang.Boolean.TRUE)) {
                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ContentView), C56033xvF.getBotPrice$default(fJNWhG().getInstType(), fJNWhG().getInstId(), fJNWhG().getInvestment(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                    } else {
                        InterfaceC54581xNr interfaceC54581xNrCopydefault5 = c54589xNz.copydefault();
                        if (interfaceC54581xNrCopydefault5 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault5.OLrzqt(fJNWhG().getInstType())) == null) {
                            java.lang.String safeString$default5 = "--";
                            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                            actualMarginSz = fJNWhG().getActualMarginSz();
                            if (actualMarginSz == null) {
                                actualMarginSz = "";
                            }
                            arrayList.add(new BotParamItemData(strAYXKKw6, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz) ? "--" : safeString$default5, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                            interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                            if (interfaceC54581xNrCopydefault != null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
                                str4 = "--";
                                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str4, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                            } else {
                                if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                                    instFamily = "";
                                }
                                xMV xmvCreateSizeConverterWithIndex$default4 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, str3, 2, str3);
                                if (xmvCreateSizeConverterWithIndex$default4 != null) {
                                    java.lang.String extraMarginSz2 = fJNWhG().getExtraMarginSz();
                                    if (extraMarginSz2 == null) {
                                        extraMarginSz2 = "";
                                    }
                                    C54536xML c54536xMLCopydefault6 = xmvCreateSizeConverterWithIndex$default4.copydefault(extraMarginSz2);
                                    if (c54536xMLCopydefault6 != null && (c54536xMLDjBIcL = c54536xMLCopydefault6.djBIcL()) != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, r5, r4, str3)) != null) {
                                        str4 = safeString$default;
                                    }
                                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str4, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                }
                            }
                        } else {
                            if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
                                instFamily2 = "";
                            }
                            xMV xmvCreateSizeConverterWithIndex$default5 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt2, instFamily2, str3, 2, str3);
                            if (xmvCreateSizeConverterWithIndex$default5 != null) {
                                java.lang.String actualMarginSz4 = fJNWhG().getActualMarginSz();
                                if (actualMarginSz4 == null) {
                                    actualMarginSz4 = "";
                                }
                                C54536xML c54536xMLCopydefault7 = xmvCreateSizeConverterWithIndex$default5.copydefault(actualMarginSz4);
                                if (c54536xMLCopydefault7 == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault7.djBIcL()) == null || (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default5 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, r5, r4, str3)) == null) {
                                }
                                java.lang.String strAYXKKw62 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                                actualMarginSz = fJNWhG().getActualMarginSz();
                                if (actualMarginSz == null) {
                                }
                                arrayList.add(new BotParamItemData(strAYXKKw62, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz) ? "--" : safeString$default5, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                                if (interfaceC54581xNrCopydefault != null) {
                                    str4 = "--";
                                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str4, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                                }
                            }
                        }
                    }
                }
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) fJNWhG().getPnlCcy())) {
                    botPnl$default = C56033xvF.getBotPnl$default(fJNWhG().getInstId(), fJNWhG().getInstType(), fJNWhG().getTotalPnl(), null, false, true, C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(fJNWhG().getDisplayDigits())) ? C33129mqd.gEmmrt(fJNWhG().getDisplayDigits()) : "2", false, null, null, null, 1928, null) + fJNWhG().getPnlCcy();
                } else {
                    botPnl$default = C56033xvF.getBotPnl$default(fJNWhG().getInstId(), fJNWhG().getInstType(), fJNWhG().getTotalPnl(), null, true, true, "2", false, null, null, null, 1928, null);
                }
                arrayList.add(new BotParamMultiContentData(C33070mpX.AYXKKw(C55688xof.Application.RJOkX), !sSMYrx() ? botPnl$default : " ", !sSMYrx() ? C56033xvF.fmtBotPnlPercent$default(hDKMBd().getPnlRatio(), r4, r5, 4, str3) : " ", C33070mpX.copydefault(C52761wXj.Activity.DeEinT), C56033xvF.OLrzqt((java.lang.Object) hDKMBd().getPnlRatio())));
                if (sSMYrx()) {
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(fJNWhG().getInstType(), fJNWhG().getInstId(), fJNWhG().getRunPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), C56033xvF.getBotPnl$default(fJNWhG().getInstId(), fJNWhG().getInstType(), fJNWhG().getFloatProfit(), null, true, true, "2", false, null, null, null, 1928, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                }
                if (!sSMYrx()) {
                    arrayList.add(new C55848xrg(0, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, 0, false, 28, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
                    MpStgyParam mpStgyParamFJNWhG3 = fJNWhG();
                    java.lang.String openPosSlippage = mpStgyParamFJNWhG3 != null ? mpStgyParamFJNWhG3.getOpenPosSlippage() : str3;
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) openPosSlippage) || !C33129mqd.AEQbTJ(openPosSlippage, "0")) {
                        openPosSlippage = str3;
                    }
                    if (openPosSlippage != null) {
                        java.lang.String strEZpvd2 = xMR.copydefault.EZpvd(openPosSlippage, 4, (int) r5, RoundingMode.FLOOR);
                        java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C48033uCm.Fragment.QOeQqh);
                        MpStgyParam mpStgyParamFJNWhG4 = fJNWhG();
                        if (mpStgyParamFJNWhG4 != null && Intrinsics.EZpvd(mpStgyParamFJNWhG4.getOpenPosSlippageDefault(), java.lang.Boolean.TRUE)) {
                            strEZpvd2 = C33069mpW.copydefault(C48033uCm.Fragment.DzOuPm, C56423yEv.EZpvd(C56390yDp.OLrzqt("slippagePct", strEZpvd2)));
                        }
                        arrayList.add(new BotParamItemData(strAYXKKw7, strEZpvd2, null, "", false, false, null, null, null, false, 0, 0, 0, 0, 16372, null));
                    }
                    kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = C56033xvF.AEQbTJ(fJNWhG(), TtmlNode.START);
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), pairAEQbTJ.getFirst(), null, pairAEQbTJ.getSecond(), false, false, null, null, null, false, 0, 0, 0, 0, 16372, null));
                    if (!Intrinsics.EZpvd((java.lang.Object) fJNWhG().getDirection(), (java.lang.Object) "neutral")) {
                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.onCreatePanelMenu), fJNWhG().getBasePos() ? C33070mpX.AYXKKw(C55688xof.Application.registerCallback) : C33070mpX.AYXKKw(C55688xof.Application.isSessionReady), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    }
                    kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ2 = C56033xvF.AEQbTJ(fJNWhG(), "stop");
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), pairAEQbTJ2.getFirst(), null, pairAEQbTJ2.getSecond(), false, false, null, null, null, false, 0, 0, 0, 0, 16372, null));
                    SignParamItem signParamItemFIwbmz = fIwbmz();
                    if (Intrinsics.EZpvd((java.lang.Object) (signParamItemFIwbmz != null ? signParamItemFIwbmz.getStopType() : str3), (java.lang.Object) "1")) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getSessionActivity);
                    } else {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallback);
                    }
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isEnabled), strAYXKKw2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(pairOLrzqt.getFirst(), pairOLrzqt.getSecond(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(pairKWHzl.getFirst(), pairKWHzl.getSecond(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                }
                return arrayList;
            }
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
        }
        str2 = strAYXKKw;
        arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), fJNWhG().getInstId(), fJNWhG().getInstType(), null, false, 0, 0, 120, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(hDKMBd().getPTime(), hDKMBd().getCTime(), null, null, null, 14, null)), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
        arrayList.add(new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.geAOna), strCopydefault3, newProxyInstance, iOLrzqt, 0.0f, 0, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
        arrayList.add(new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.aBDePw), strAEQbTJ, newProxyInstance, 0, 0.0f, 0, null, null, 248, null));
        if (sSMYrx()) {
        }
        if (sSMYrx()) {
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) fJNWhG().getPnlCcy())) {
        }
        if (!sSMYrx()) {
        }
        arrayList.add(new BotParamMultiContentData(C33070mpX.AYXKKw(C55688xof.Application.RJOkX), !sSMYrx() ? botPnl$default : " ", !sSMYrx() ? C56033xvF.fmtBotPnlPercent$default(hDKMBd().getPnlRatio(), r4, r5, 4, str3) : " ", C33070mpX.copydefault(C52761wXj.Activity.DeEinT), C56033xvF.OLrzqt((java.lang.Object) hDKMBd().getPnlRatio())));
        if (sSMYrx()) {
        }
        if (!sSMYrx()) {
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayListFARcdN = fARcdN();
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        for (java.lang.Object obj : arrayListFARcdN) {
            if (obj instanceof BotParamItemData) {
                BotParamItemData botParamItemData = (BotParamItemData) obj;
                if (botParamItemData.isHeadLine() || botParamItemData.isBeFiltered()) {
                    if (obj instanceof BotParamColorItemData) {
                    }
                }
                arrayList.add(obj);
            }
        }
        arrayList.add(0, new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
        java.lang.String username = hDKMBd().getUsername();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
            username = "--";
        }
        arrayList.add(0, new BotParamItemData(strAYXKKw, username, null, null, false, false, hDKMBd().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return sSMYrx() ? KWHzl(str) : copydefault(str);
    }

    public final java.util.ArrayList<java.lang.Object> copydefault(java.lang.String str) {
        java.util.ArrayList<java.lang.Object> arrayListValueOf = valueOf(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListValueOf) {
            if (((obj instanceof BotParamItemData) && !((BotParamItemData) obj).isBeFiltered()) || (obj instanceof C55848xrg) || (obj instanceof AutoVipProfitInfo)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>(arrayList);
        arrayList2.add(new CoinTipsData(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.dispatchMenuVisibilityChanged), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33070mpX.AYXKKw(C55688xof.Application.onContextAvailable)))), (java.lang.String) null, 0.0f, false, 14, (DefaultConstructorMarker) null));
        arrayList2.add(new NoConfirmData(false));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<java.lang.Object> KWHzl(java.lang.String str) {
        java.lang.String actualMarginSz;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        java.lang.String str2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
        java.lang.String username = hDKMBd().getUsername();
        arrayList.add(new BotParamItemData(strAYXKKw, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username) ? "--" : username, null, null, false, false, hDKMBd().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        MpStgyParam mpStgyParamFJNWhG = fJNWhG();
        if (mpStgyParamFJNWhG != null && Intrinsics.EZpvd(mpStgyParamFJNWhG.getAutoReserve(), java.lang.Boolean.TRUE)) {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), C56033xvF.getBotPrice$default(fJNWhG().getInstType(), fJNWhG().getInstId(), str, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        } else {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault2 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault2.OLrzqt(fJNWhG().getInstType())) == null) {
                java.lang.String safeString$default2 = "--";
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                actualMarginSz = fJNWhG().getActualMarginSz();
                if (actualMarginSz == null) {
                    actualMarginSz = "";
                }
                arrayList.add(new BotParamItemData(strAYXKKw2, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz) ? "--" : safeString$default2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                if (interfaceC54581xNrCopydefault != null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
                    str2 = "--";
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                    if (xmvCreateSizeConverterWithIndex$default != null) {
                        java.lang.String extraMarginSz = fJNWhG().getExtraMarginSz();
                        C54536xML c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(extraMarginSz != null ? extraMarginSz : "");
                        if (c54536xMLCopydefault != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                            str2 = safeString$default;
                        }
                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    }
                }
            } else {
                if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily2 = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt2, instFamily2, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default2 != null) {
                    java.lang.String actualMarginSz2 = fJNWhG().getActualMarginSz();
                    if (actualMarginSz2 == null) {
                        actualMarginSz2 = "";
                    }
                    C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default2.copydefault(actualMarginSz2);
                    if (c54536xMLCopydefault2 == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                    }
                    java.lang.String strAYXKKw22 = C33070mpX.AYXKKw(C48033uCm.Fragment.zzQwtT);
                    actualMarginSz = fJNWhG().getActualMarginSz();
                    if (actualMarginSz == null) {
                    }
                    arrayList.add(new BotParamItemData(strAYXKKw22, !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualMarginSz) ? "--" : safeString$default2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                    if (interfaceC54581xNrCopydefault != null) {
                        str2 = "--";
                        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DXd), str2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    }
                }
            }
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.AxsJAY), xMR.formatPercent$default(xMR.copydefault, fJNWhG().getProfitSharingRatio(), 0, null, 4, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        if (str != null) {
            C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
        }
        arrayList.add(new CoinTipsData(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.dispatchMenuVisibilityChanged), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33070mpX.AYXKKw(C55688xof.Application.onContextAvailable)))), (java.lang.String) null, 0.0f, false, 14, (DefaultConstructorMarker) null));
        arrayList.add(new NoConfirmData(false));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.values, this.fetchVPNInfo, this.djBIcL, this.AhwBna, this.AkhnZx, this.gEmmrt);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        return new AIData((java.lang.String) null, fJNWhG().getGridNum(), fJNWhG().getMaxPx(), fJNWhG().getMinPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, fJNWhG().getRunType(), fJNWhG().getDirection(), (java.lang.String) null, fJNWhG().getLever(), (java.util.ArrayList) C56033xvF.EZpvd(fJNWhG().getSignParams()), (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, fJNWhG().getBasePos(), fJNWhG().getTpTriggerPx(), fJNWhG().getSlTriggerPx(), (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, fJNWhG().getTpRatio(), fJNWhG().getSlRatio(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -29592975, 3, (DefaultConstructorMarker) null);
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
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) != null) {
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
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault2, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String p_(@NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
            return null;
        }
        if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
            str2 = instFamily;
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
        if (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) == null || (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String getFieldNames() {
        java.lang.String marginSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        return (suggestedInstrument$default == null || (marginSymbol = suggestedInstrument$default.getMarginSymbol()) == null) ? "" : marginSymbol;
    }

    public final int valueOf() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String strFJNWhG = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) != null) {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            strFJNWhG = abstractC54531xLwOLrzqt.fJNWhG(instFamily);
        }
        if (strFJNWhG == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFJNWhG)) {
            return 2;
        }
        return C33129mqd.AhwBna(strFJNWhG);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
            safeString$default = "";
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
            }
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        return "> " + safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String QfsBiF() {
        java.lang.String marginSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        return (suggestedInstrument$default == null || (marginSymbol = suggestedInstrument$default.getMarginSymbol()) == null) ? "" : marginSymbol;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
            arrayList.add(tradeSymbol);
        }
        if (suggestedInstrument$default != null && (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) != null) {
            arrayList.add(quoteSymbol);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLFetchVPNInfo;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        C54536xML c54536xMLAuCTel2;
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, fJNWhG().getInstType(), fJNWhG().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault.OLrzqt(fJNWhG().getInstType())) == null) {
            safeString$default = "";
        } else {
            if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily2 = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt2, instFamily2, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                java.lang.String value = giSNqX().getValue();
                if (value == null) {
                    value = "";
                }
                C54536xML c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(value);
                if (c54536xMLOLrzqt == null || (c54536xMLAuCTel2 = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel2, false, 1, null)) == null) {
                }
            }
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault2.OLrzqt(fJNWhG().getInstType())) == null) {
            safeString$default2 = "";
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default2 != null) {
                java.lang.String value2 = giSNqX().getValue();
                if (value2 == null) {
                    value2 = "";
                }
                C54536xML c54536xMLOLrzqt2 = xmvCreateSizeConverterWithIndex$default2.OLrzqt(value2);
                if (c54536xMLOLrzqt2 == null || (c54536xMLDjBIcL = c54536xMLOLrzqt2.djBIcL()) == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (c54536xMLFetchVPNInfo = c54536xMLAuCTel.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                }
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz()) && C33129mqd.valueOf(copyBotReqParam.getQuoteSz(), safeString$default)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getGmsPickeractivity_release), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)), C56390yDp.OLrzqt("fieldName2", safeString$default2))));
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.EZpvd);
        }
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.valueOf = null;
        CoroutineScope coroutineScope = this.OLrzqt;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.OLrzqt = null;
    }

    public static /* synthetic */ void fetchLiqPriceDebounced$default(C51321vkn c51321vkn, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c51321vkn.EZpvd(str, z);
    }

    public final void EZpvd(java.lang.String str, boolean z) {
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.valueOf = BuildersKt__Builders_commonKt.launch$default(gEmmrt(), null, null, new ContractGridPresenter$fetchLiqPriceDebounced$1(this, str, z, null), 3, null);
    }

    public static /* synthetic */ void fetchLiqPrice$default(C51321vkn c51321vkn, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c51321vkn.AEQbTJ(str, z);
    }

    public final void AEQbTJ(java.lang.String str, boolean z) {
        if (C33129mqd.valueOf(str, 0)) {
            copydefault((LiquidatePriceResponse) null);
            return;
        }
        MpStgyParam mpStgyParam = new MpStgyParam(fJNWhG().getAlgoId(), fJNWhG().getAlgoOrdType(), fJNWhG().getOrdType(), fJNWhG().getCTime(), fJNWhG().getPTime(), fJNWhG().getInstType(), fJNWhG().getInvestment(), fJNWhG().getGridNum(), fJNWhG().getInstId(), fJNWhG().getMaxPx(), fJNWhG().getMinPx(), fJNWhG().getRunType(), fJNWhG().getTpTriggerPx(), fJNWhG().getSlTriggerPx(), fJNWhG().getTpRatio(), fJNWhG().getSlRatio(), (TpSlTriggerParamReqResp) null, (java.lang.String) null, fJNWhG().getLever(), fJNWhG().getBasePos(), fJNWhG().getDirection(), fJNWhG().getInvestCcy(), fJNWhG().getPeriod(), fJNWhG().getRecurringDay(), fJNWhG().getRecurringTime(), fJNWhG().getRecurringHour(), fJNWhG().getRecurringList(), fJNWhG().getStgyName(), fJNWhG().getFloatProfit(), fJNWhG().getProfitSharingRatio(), fJNWhG().getTrackingMode(), fJNWhG().getTotalPnl(), fJNWhG().getRunPx(), fJNWhG().getBalType(), fJNWhG().getInterval(), fJNWhG().getDeltaRatio(), fJNWhG().getPortfolioList(), fJNWhG().getSignParams(), fJNWhG().getReserveFunds(), fJNWhG().getStopType(), fJNWhG().getTrailingUpConfig(), fJNWhG().getTrailingDownConfig(), fJNWhG().getAutoReserve(), fJNWhG().getActualMarginSz(), fJNWhG().getExtraMarginSz(), fJNWhG().getSz(), fJNWhG().getOpenPosSlippage(), (java.lang.Boolean) null, fJNWhG().getPxStepsMult(), fJNWhG().getSafetyOrdRatio(), fJNWhG().getVolMult(), fJNWhG().getPxSteps(), fJNWhG().getTpPct(), fJNWhG().getInvestmentCcy(), fJNWhG().getMaxSafetyOrds(), fJNWhG().getSlPct(), fJNWhG().getSlMode(), fJNWhG().getCompletedCycles(), fJNWhG().getTriggerParams(), fJNWhG().getPerGridProfitRatio(), fJNWhG().getCopyType(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, -536838144, 3, (DefaultConstructorMarker) null);
        if (z) {
            mpStgyParam.setActualMarginSz("");
            mpStgyParam.setExtraMarginSz("");
        } else {
            mpStgyParam.setSz("");
        }
        C56288xzw c56288xzw = this.AhwBna;
        c56288xzw.KWHzl(mpStgyParam.getDirection());
        c56288xzw.AYXKKw(mpStgyParam.getInstId());
        c56288xzw.gEmmrt(mpStgyParam.getGridNum());
        c56288xzw.djBIcL(mpStgyParam.getMaxPx());
        c56288xzw.values(mpStgyParam.getMinPx());
        c56288xzw.AhwBna(zLjUOn());
        c56288xzw.fetchVPNInfo(mpStgyParam.getSz());
        c56288xzw.EZpvd(sSMYrx() ? null : java.lang.Integer.valueOf(C33129mqd.AhwBna(mpStgyParam.getRunType())));
        c56288xzw.AkhnZx(mpStgyParam.getAlgoId());
        SignParamItem signParamItemAuCTel = AuCTel();
        c56288xzw.DbNXlk(signParamItemAuCTel != null ? signParamItemAuCTel.getIndicator() : null);
        c56288xzw.EZpvd(java.lang.Boolean.valueOf(mpStgyParam.getBasePos()));
        java.lang.String actualMarginSz = mpStgyParam.getActualMarginSz();
        if (actualMarginSz == null) {
            actualMarginSz = "";
        }
        c56288xzw.EZpvd(actualMarginSz);
        java.lang.String extraMarginSz = mpStgyParam.getExtraMarginSz();
        c56288xzw.valueOf(extraMarginSz != null ? extraMarginSz : "");
        c56288xzw.KWHzl(new Function1() { // from class: o.vkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51321vkn.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56288xzw, 0L, 1, null);
    }

    public static final Unit AEQbTJ(C51321vkn c51321vkn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        c51321vkn.copydefault(list != null ? (LiquidatePriceResponse) CollectionsKt___CollectionsKt.firstOrNull(list) : null);
        return Unit.INSTANCE;
    }

    public final void copydefault(LiquidatePriceResponse liquidatePriceResponse) {
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String strAYXKKw2;
        java.lang.String direction = fJNWhG().getDirection();
        java.lang.String strAYXKKw3 = "";
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long")) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
            str = "";
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "short")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
            } else {
                strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0);
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.removeReporter);
            }
            str = strAYXKKw;
            strAYXKKw2 = strAYXKKw3;
        }
        gasjUx().postValue(new LiquidatePriceResponse(AhwBna(liquidatePriceResponse != null ? liquidatePriceResponse.getLongLiqPx() : null), AhwBna(liquidatePriceResponse != null ? liquidatePriceResponse.getShortLiqPx() : null), strAYXKKw2, str, C33070mpX.AYXKKw(C55688xof.Application.removeAllTabs), C33070mpX.AYXKKw(C55688xof.Application.setCaptioningEnabled), KWHzl(liquidatePriceResponse)));
    }

    private final java.lang.String AhwBna(java.lang.String str) {
        xMS xmsAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        if (!C33129mqd.valueOf(str, 0) && (xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(fJNWhG().getInstId(), fJNWhG().getInstType())) != null) {
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

    public final boolean KWHzl(LiquidatePriceResponse liquidatePriceResponse) {
        java.lang.String maxPx = fJNWhG().getMaxPx();
        java.lang.String minPx = fJNWhG().getMinPx();
        java.lang.String longLiqPx = liquidatePriceResponse != null ? liquidatePriceResponse.getLongLiqPx() : null;
        java.lang.String shortLiqPx = liquidatePriceResponse != null ? liquidatePriceResponse.getShortLiqPx() : null;
        java.lang.String direction = fJNWhG().getDirection();
        int iHashCode = direction.hashCode();
        return iHashCode == 3327612 ? direction.equals("long") && (longLiqPx == null || longLiqPx.length() == 0 || maxPx.length() == 0 || minPx.length() == 0 || C33129mqd.AEQbTJ(longLiqPx, maxPx) || C33129mqd.gEmmrt(longLiqPx, minPx)) : !(iHashCode == 109413500 ? !(direction.equals("short") && (longLiqPx == null || longLiqPx.length() == 0 || maxPx.length() == 0 || minPx.length() == 0 || C33129mqd.AEQbTJ(shortLiqPx, maxPx) || C33129mqd.gEmmrt(shortLiqPx, minPx))) : !(iHashCode == 1844321735 && direction.equals("neutral") && (((longLiqPx == null || longLiqPx.length() == 0) && (shortLiqPx == null || shortLiqPx.length() == 0)) || maxPx.length() == 0 || minPx.length() == 0 || ((C33129mqd.AEQbTJ(longLiqPx, maxPx) || C33129mqd.gEmmrt(longLiqPx, minPx)) && (C33129mqd.AEQbTJ(shortLiqPx, maxPx) || C33129mqd.gEmmrt(shortLiqPx, minPx))))));
    }

    @Override // o.AbstractC51317vkj
    public void bw_() {
        C56235xyw c56235xyw = this.djBIcL;
        c56235xyw.KWHzl("contract_grid");
        c56235xyw.AEQbTJ(fJNWhG().getInstId());
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(AubY(), new StateListAnimator());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkn$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54501xKt<java.util.List<? extends StrategyConfigInfo>, BotLeverConfig> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ BotLeverConfig KWHzl(java.util.List<? extends StrategyConfigInfo> list) {
            return KWHzl2((java.util.List<StrategyConfigInfo>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public BotLeverConfig KWHzl2(java.util.List<StrategyConfigInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
            C51321vkn.this.KWHzl.setValue(strategyConfigInfo);
            return new BotLeverConfig(strategyConfigInfo != null ? strategyConfigInfo.getMinLever() : null, strategyConfigInfo != null ? strategyConfigInfo.getMaxLever() : null, C51321vkn.this.zLjUOn(), strategyConfigInfo != null ? strategyConfigInfo.getLeveragePercents() : null);
        }
    }

    public final java.lang.String copydefault() {
        return C56033xvF.AhwBna(fJNWhG().getDirection());
    }

    public final int getNewProxyInstance() {
        return C56033xvF.getContractGridSideColor$default(fJNWhG().getDirection(), false, 2, null);
    }

    public final int OLrzqt() {
        return C56033xvF.getContractGridSideBgColor$default(fJNWhG().getDirection(), false, 2, null);
    }

    public final java.lang.String AEQbTJ() {
        return C56033xvF.getBotLever$default(zLjUOn(), false, 2, null);
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        fJNWhG().setLever(str);
        aKErDB();
        EZpvd(this.isConnected, z);
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
        EZpvd(fJNWhG().getSz(), z);
        dxcTrN();
    }

    @Override // o.AbstractC51317vkj
    public void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
        fJNWhG().setExtraMarginSz(str);
        updateSz$default(this, false, 1, null);
        EZpvd(fJNWhG().getSz(), z);
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(boolean z) {
        EZpvd(fJNWhG().getSz(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zLjUOn() {
        java.lang.String str = this.AYXKKw;
        return str == null ? fJNWhG().getLever() : str;
    }

    public final SignParamItem AuCTel() {
        java.util.List<SignParamItem> signParams = fJNWhG().getSignParams();
        java.lang.Object obj = null;
        if (signParams == null) {
            return null;
        }
        java.util.Iterator<T> it = signParams.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                obj = next;
                break;
            }
        }
        return (SignParamItem) obj;
    }

    public final SignParamItem fIwbmz() {
        java.util.List<SignParamItem> signParams = fJNWhG().getSignParams();
        java.lang.Object obj = null;
        if (signParams == null) {
            return null;
        }
        java.util.Iterator<T> it = signParams.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                obj = next;
                break;
            }
        }
        return (SignParamItem) obj;
    }

    @Override // o.AbstractC51317vkj
    public void EZpvd(boolean z) {
        fJNWhG().setAutoReserve(java.lang.Boolean.valueOf(z));
    }

    public static /* synthetic */ void updateSz$default(C51321vkn c51321vkn, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c51321vkn.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        fJNWhG().setSz(java.lang.String.valueOf(C33129mqd.AEQbTJ(fJNWhG().getExtraMarginSz()) + C33129mqd.AEQbTJ(fJNWhG().getActualMarginSz())));
        this.AuCTel = fJNWhG().getSz();
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        if (!C33129mqd.AEQbTJ(str, "0") || !C33129mqd.AEQbTJ(str2, "0")) {
            return "--";
        }
        return xMR.copydefault.EZpvd(C33129mqd.mulS$default(str, str2, null, null, null, 14, null), valueOf(), RoundingMode.UP) + " " + getFieldNames();
    }
}

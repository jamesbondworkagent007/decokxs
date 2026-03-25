package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingDownReq;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.BotParamItemData;
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

/* JADX INFO: renamed from: o.vkw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51330vkw extends AbstractC51317vkj {
    public final MutableLiveData<StrategyConfigInfo> AYXKKw;
    public xDM AhwBna;
    public final C56196xyJ DbNXlk;
    public final C56155xxV KWHzl;
    public final C56111xwe<AdditionalInvest> OLrzqt;
    public java.util.ArrayList<java.lang.Object> copydefault;
    public final C56235xyw djBIcL;
    public final C56238xyz gEmmrt;
    public final C54219xAh valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final java.lang.String AEQbTJ = "botName";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<AdditionalInvest> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56155xxV copydefault() {
        return this.KWHzl;
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.QYvkLl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51330vkw(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.KWHzl = new C56155xxV();
        this.OLrzqt = new C56111xwe<>();
        this.valueOf = new C54219xAh();
        this.djBIcL = new C56235xyw();
        this.AYXKKw = new MutableLiveData<>();
        this.DbNXlk = new C56196xyJ();
        this.gEmmrt = new C56238xyz();
        this.copydefault = new java.util.ArrayList<>();
    }

    public final MpStgyParam gEmmrt() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    public final MpStgyDetail KWHzl() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    private final boolean getNewProxyInstance() {
        return Intrinsics.EZpvd((java.lang.Object) gEmmrt().getCopyType(), (java.lang.Object) "3");
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        C54219xAh c54219xAh = this.valueOf;
        c54219xAh.EZpvd(AuCTel());
        c54219xAh.copydefault(EZpvd(copyBotReqParam.getBaseSz(), copyBotReqParam.getQuoteSz()));
        c54219xAh.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (!copydefault(copyBotReqParam)) {
            this.OLrzqt.postValue(new AdditionalInvest((java.lang.String) null, 1, (DefaultConstructorMarker) null));
            return;
        }
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        java.lang.String algoId = mpStgyParamGEmmrt.getAlgoId();
        java.lang.String instId = mpStgyParamGEmmrt.getInstId();
        java.lang.String ordType = mpStgyParamGEmmrt.getOrdType();
        if (ordType.length() == 0) {
            ordType = mpStgyParamGEmmrt.getAlgoOrdType();
        }
        java.lang.String str = ordType;
        java.lang.String maxPx = mpStgyParamGEmmrt.getMaxPx();
        java.lang.String minPx = mpStgyParamGEmmrt.getMinPx();
        java.lang.String gridNum = mpStgyParamGEmmrt.getGridNum();
        java.lang.String runType = mpStgyParamGEmmrt.getRunType();
        java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
        TrailingConfig trailingDownConfig = mpStgyParamGEmmrt.getTrailingDownConfig();
        java.lang.String stopPx = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        TrailingConfig trailingUpConfig = mpStgyParamGEmmrt.getTrailingUpConfig();
        TrailingDownReq trailingDownReq = new TrailingDownReq(algoId, instId, str, maxPx, minPx, gridNum, runType, quoteSz, (java.lang.String) null, stopPx, trailingUpConfig != null ? trailingUpConfig.getStopPx() : null, 256, (DefaultConstructorMarker) null);
        C56155xxV c56155xxV = this.KWHzl;
        c56155xxV.copydefault(trailingDownReq);
        c56155xxV.djBIcL();
        c56155xxV.OLrzqt(this.OLrzqt, new C54507xKz());
        c56155xxV.OLrzqt(400L);
    }

    public final boolean copydefault(CopyBotReqParam copyBotReqParam) {
        boolean zAEQbTJ = C33129mqd.AEQbTJ(copyBotReqParam.getQuoteSz(), 0);
        TrailingConfig trailingDownConfig = gEmmrt().getTrailingDownConfig();
        return zAEQbTJ && (trailingDownConfig != null && trailingDownConfig.getEnabled());
    }

    public final boolean valueOf() {
        TrailingConfig trailingDownConfig = gEmmrt().getTrailingDownConfig();
        return trailingDownConfig != null && trailingDownConfig.getEnabled();
    }

    public final boolean AEQbTJ() {
        boolean zValueOf;
        if (getNewProxyInstance()) {
            SignParamItem signParamItemHDKMBd = hDKMBd();
            zValueOf = C33129mqd.valueOf(signParamItemHDKMBd != null ? signParamItemHDKMBd.getTriggerTime() : null, 0);
        } else {
            SignParamItem signParamItemHDKMBd2 = hDKMBd();
            zValueOf = !Intrinsics.EZpvd((java.lang.Object) (signParamItemHDKMBd2 != null ? signParamItemHDKMBd2.getIndicator() : null), (java.lang.Object) GridStartTriggerType.INSTANT.getMode());
        }
        TrailingConfig trailingDownConfig = gEmmrt().getTrailingDownConfig();
        return trailingDownConfig != null && trailingDownConfig.getEnabled() && zValueOf;
    }

    private final SignParamItem hDKMBd() {
        java.util.List<SignParamItem> signParams = gEmmrt().getSignParams();
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

    private final SignParamItem iwGUEr() {
        java.util.List<SignParamItem> signParams = gEmmrt().getSignParams();
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

    public final java.lang.String EZpvd(@NotNull CopyBotReqParam copyBotReqParam, AdditionalInvest additionalInvest) {
        java.lang.String additionalQuoteInvestment;
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (C33129mqd.AEQbTJ(copyBotReqParam.getQuoteSz(), 0)) {
            java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
            if (additionalInvest == null || (additionalQuoteInvestment = additionalInvest.getAdditionalQuoteInvestment()) == null) {
                additionalQuoteInvestment = "0";
            }
            java.lang.String strAddS$default = C33129mqd.addS$default(quoteSz, additionalQuoteInvestment, null, null, null, 14, null);
            MpStgyParam mpStgyParamGEmmrt = gEmmrt();
            if (!C33129mqd.OLrzqt((java.lang.Object) strAddS$default, (java.lang.Object) 0)) {
                return C56033xvF.getBotPrice$default(mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), strAddS$default, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
        return "--";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull CopyBotReqParam copyBotReqParam) {
        java.lang.String str;
        java.lang.String additionalQuoteInvestment;
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        java.lang.String strAddS$default = "0";
        if (Intrinsics.EZpvd(mpStgyParamGEmmrt.getReserveFunds(), java.lang.Boolean.TRUE) && C33129mqd.AEQbTJ(copyBotReqParam.getQuoteSz(), "0")) {
            java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
            AdditionalInvest value = this.OLrzqt.getValue();
            strAddS$default = C33129mqd.addS$default(quoteSz, (value == null || (additionalQuoteInvestment = value.getAdditionalQuoteInvestment()) == null) ? "0" : additionalQuoteInvestment, null, null, null, 14, null);
        } else {
            java.lang.String quoteSz2 = copyBotReqParam.getQuoteSz();
            if (quoteSz2 != null) {
                str = quoteSz2;
            }
            return !C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? "--" : C56033xvF.getBotPrice$default(mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), str, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }
        str = strAddS$default;
        if (!C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
        }
    }

    public final StrategyBaseReq AuCTel() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        java.lang.String instId = mpStgyParamGEmmrt.getInstId();
        java.lang.String ordType = mpStgyParamGEmmrt.getOrdType();
        if (ordType.length() == 0) {
            ordType = mpStgyParamGEmmrt.getAlgoOrdType();
        }
        return new StrategyBaseReq(instId, (java.lang.String) null, "cash", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, ordType, (TradeType) null, mpStgyParamGEmmrt.getAlgoId(), (java.lang.Boolean) null, 1402, (DefaultConstructorMarker) null);
    }

    public final GridReq EZpvd(java.lang.String str, java.lang.String str2) {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        return new GridReq(mpStgyParamGEmmrt.getMaxPx(), mpStgyParamGEmmrt.getMinPx(), mpStgyParamGEmmrt.getGridNum(), mpStgyParamGEmmrt.getRunType(), str2, str, "2", (java.lang.String) null, (java.lang.String) null, mpStgyParamGEmmrt.getTpslTriggerParamResp(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, C56033xvF.EZpvd(mpStgyParamGEmmrt.getSignParams()), mpStgyParamGEmmrt.getReserveFunds(), mpStgyParamGEmmrt.getTrailingUpConfig(), mpStgyParamGEmmrt.getTrailingDownConfig(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, fFgQHt().AEQbTJ("grid"), (ProfitAutoReinvestParam) null, -123520, 11, (DefaultConstructorMarker) null);
    }

    public final void fIwbmz() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        C56235xyw c56235xyw = this.djBIcL;
        c56235xyw.KWHzl("grid");
        c56235xyw.AEQbTJ(mpStgyParamGEmmrt.getInstId());
        c56235xyw.OLrzqt(fFgQHt().AEQbTJ("grid"));
        c56235xyw.KWHzl(new Function1() { // from class: o.vkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51330vkw.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        fIwbmz();
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        C56238xyz c56238xyz = this.gEmmrt;
        c56238xyz.AEQbTJ(mpStgyParamGEmmrt.getInstId());
        c56238xyz.KWHzl(mpStgyParamGEmmrt.getGridNum());
        c56238xyz.AYXKKw(mpStgyParamGEmmrt.getMaxPx());
        c56238xyz.djBIcL(mpStgyParamGEmmrt.getMinPx());
        c56238xyz.KWHzl(C33129mqd.AhwBna(mpStgyParamGEmmrt.getRunType()));
        c56238xyz.AhwBna(mpStgyParamGEmmrt.getAlgoId());
        SignParamItem signParamItemHDKMBd = hDKMBd();
        c56238xyz.isConnected(signParamItemHDKMBd != null ? signParamItemHDKMBd.getIndicator() : null);
        SignParamItem signParamItemHDKMBd2 = hDKMBd();
        if (signParamItemHDKMBd2 != null && Intrinsics.EZpvd((java.lang.Object) signParamItemHDKMBd2.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(signParamItemHDKMBd2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(giSNqX(), new Application());
        xKK.Activity.execute$default(c56238xyz, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkw$Application */
    public static final class Application implements InterfaceC54501xKt<java.util.List<? extends MinInvestResp>, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.lang.String KWHzl(java.util.List<MinInvestResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ((MinInvestResp) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getMinQuoteSz();
        }
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        gGvvIC().setValue("");
    }

    @Override // o.AbstractC51317vkj
    public void AxsJAYaxsJAY() {
        C56196xyJ c56196xyJ = this.DbNXlk;
        c56196xyJ.AEQbTJ("loss_insurance_voucher");
        c56196xyJ.EZpvd(gEmmrt().getAlgoOrdType());
        c56196xyJ.KWHzl(gEmmrt().getInstId());
        c56196xyJ.OLrzqt(fZBcTu(), new StateListAnimator());
        xKK.Activity.execute$default(c56196xyJ, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkw$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54501xKt<java.util.List<? extends TicketEligibility>, LossInsurance> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ LossInsurance KWHzl(java.util.List<? extends TicketEligibility> list) {
            return KWHzl2((java.util.List<TicketEligibility>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public LossInsurance KWHzl2(java.util.List<TicketEligibility> list) {
            Intrinsics.checkNotNullParameter(list, "");
            TicketEligibility ticketEligibility = (TicketEligibility) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            if (ticketEligibility != null) {
                return new LossInsurance(ticketEligibility.getEligible(), ticketEligibility.getEntityValue(), ticketEligibility.getEntityStatus());
            }
            return null;
        }
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        java.lang.String strAEQbTJ = fFgQHt().AEQbTJ("grid");
        pUU.EZpvd("USDRename", "sub Available balance Spot Grid, instId:" + mpStgyParamGEmmrt.getInstId() + ", tradeQuoteCcy:" + strAEQbTJ);
        TaskDescription taskDescription = new TaskDescription(strAEQbTJ, this, mpStgyParamGEmmrt.getInstId(), mpStgyParamGEmmrt.getInstType(), "cash");
        this.copydefault.clear();
        this.copydefault.add(taskDescription);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.vkw$TaskDescription */
    public static final class TaskDescription extends AbstractC55740xpe {
        public final /* synthetic */ C51330vkw KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, C51330vkw c51330vkw, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null, null, str3, str2, null, null, str4, null, java.lang.Boolean.TRUE, null, "1", null, null, null, null, null, null, null, null, str, 522931, null);
            this.KWHzl = c51330vkw;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                this.KWHzl.flVtFt().postValue(maxAvailableResp.getQuoteMax());
            }
            this.KWHzl.AhwBna = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity22);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        return C56033xvF.getCoinTitle$default(mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), false, null, null, 28, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        return AkhnZx();
    }

    /* JADX INFO: renamed from: o.vkw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vkw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String EZpvd() {
            return C51330vkw.AEQbTJ;
        }
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt(AEQbTJ, C33070mpX.AYXKKw(C55688xof.Application.addCallbackdefault)))), C33070mpX.AYXKKw(C55688xof.Application.zuBGHE), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultLauncherHolder), "grid", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner2), C33070mpX.AYXKKw(C55688xof.Application.ViewTreeFullyDrawnReporterOwner)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner2), C33070mpX.AYXKKw(C55688xof.Application.ViewTreeOnBackPressedDispatcherOwner))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C34703nhO.AEQbTJ() ? C33070mpX.AYXKKw(C55688xof.Application.setLauncher) : C33070mpX.AYXKKw(C55688xof.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1)), getNewProxyInstance() ? "profit_sharing" : "non_profit_sharing", 0, null, null, FaceDetector.NUM_BOXES, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayListFARcdN = fARcdN();
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        for (java.lang.Object obj : arrayListFARcdN) {
            if ((obj instanceof BotParamItemData) && !((BotParamItemData) obj).isHeadLine()) {
                arrayList.add(obj);
            }
        }
        if (!C56071xvr.gEmmrt.EZpvd(gEmmrt().getProfitSharingRatio())) {
            arrayList.add(0, new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = KWHzl().getUsername();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
                username = "--";
            }
            arrayList.add(0, new BotParamItemData(strAYXKKw, username, null, null, false, false, KWHzl().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        MpStgyDetail mpStgyDetailKWHzl = KWHzl();
        arrayList.addAll(copydefault(mpStgyDetailKWHzl, mpStgyParamGEmmrt));
        if (!getNewProxyInstance()) {
            arrayList.add(new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, C55298xhM.dp2px$default(4.0f, null, 1, null), false, 20, null));
            arrayList.addAll(KWHzl(mpStgyDetailKWHzl, mpStgyParamGEmmrt));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<java.lang.Object> copydefault(MpStgyDetail mpStgyDetail, MpStgyParam mpStgyParam) {
        java.lang.String str;
        java.lang.String strAYXKKw;
        java.lang.String botPnl$default;
        java.lang.String runType = mpStgyParam.getRunType();
        if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                str = "--";
                java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
                if (!getNewProxyInstance()) {
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
                }
                arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), mpStgyParam.getInstId(), mpStgyParam.getInstType(), null, false, 0, 0, 120, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(mpStgyDetail.getPTime(), mpStgyDetail.getCTime(), null, null, null, 14, null)), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                if (!getNewProxyInstance()) {
                    java.lang.String botPrice$default = C56033xvF.getBotPrice$default(mpStgyParam.getInstType(), mpStgyParam.getInstId(), mpStgyParam.getMaxPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(mpStgyParam.getInstType(), mpStgyParam.getInstId(), mpStgyParam.getMinPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), botPrice$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState), botPrice$default2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) mpStgyParam.getGridNum()) ? "--" : xMR.formatDownToMax$default(xMR.copydefault, mpStgyParam.getGridNum(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                }
                if (getNewProxyInstance()) {
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ContentView), C56033xvF.getBotPrice$default(mpStgyParam.getInstType(), mpStgyParam.getInstId(), mpStgyParam.getInvestment(), false, false, null, mpStgyParam.getPnlCcy(), 56, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                }
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) mpStgyParam.getPnlCcy())) {
                    botPnl$default = C56033xvF.getBotPnl$default(mpStgyParam.getInstId(), mpStgyParam.getInstType(), mpStgyParam.getTotalPnl(), null, false, true, C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(mpStgyParam.getDisplayDigits())) ? C33129mqd.gEmmrt(mpStgyParam.getDisplayDigits()) : "2", false, null, null, null, 1928, null) + mpStgyParam.getPnlCcy();
                } else {
                    botPnl$default = C56033xvF.getBotPnl$default(mpStgyParam.getInstId(), mpStgyParam.getInstType(), mpStgyParam.getTotalPnl(), null, true, true, "2", false, null, null, null, 1928, null);
                }
                arrayList.add(new BotParamMultiContentData(C33070mpX.AYXKKw(C55688xof.Application.RJOkX), !getNewProxyInstance() ? botPnl$default : " ", getNewProxyInstance() ? C56033xvF.fmtBotPnlPercent$default(mpStgyDetail.getPnlRatio(), true, 0, 4, null) : " ", C33070mpX.copydefault(C52761wXj.Activity.DeEinT), C56033xvF.OLrzqt((java.lang.Object) mpStgyDetail.getPnlRatio())));
                if (getNewProxyInstance()) {
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(mpStgyParam.getInstType(), mpStgyParam.getInstId(), mpStgyParam.getRunPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                    arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), C56033xvF.getBotPnl$default(mpStgyParam.getInstId(), mpStgyParam.getInstType(), mpStgyParam.getFloatProfit(), null, true, true, "2", false, null, null, null, 1928, null), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
                }
                return arrayList;
            }
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
        }
        str = strAYXKKw;
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        if (!getNewProxyInstance()) {
        }
        arrayList2.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), mpStgyParam.getInstId(), mpStgyParam.getInstType(), null, false, 0, 0, 120, null));
        arrayList2.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(mpStgyDetail.getPTime(), mpStgyDetail.getCTime(), null, null, null, 14, null)), null, null, false, true, null, null, null, false, 0, 0, 0, 0, 16348, null));
        if (!getNewProxyInstance()) {
        }
        if (getNewProxyInstance()) {
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) mpStgyParam.getPnlCcy())) {
        }
        arrayList2.add(new BotParamMultiContentData(C33070mpX.AYXKKw(C55688xof.Application.RJOkX), !getNewProxyInstance() ? botPnl$default : " ", getNewProxyInstance() ? C56033xvF.fmtBotPnlPercent$default(mpStgyDetail.getPnlRatio(), true, 0, 4, null) : " ", C33070mpX.copydefault(C52761wXj.Activity.DeEinT), C56033xvF.OLrzqt((java.lang.Object) mpStgyDetail.getPnlRatio())));
        if (getNewProxyInstance()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<java.lang.Object> KWHzl(MpStgyDetail mpStgyDetail, MpStgyParam mpStgyParam) {
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        TrailingConfig trailingDownConfig;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        TrailingConfig trailingUpConfig;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = C56033xvF.AEQbTJ(mpStgyParam, TtmlNode.START);
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ2 = C56033xvF.AEQbTJ(mpStgyParam, "stop");
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(mpStgyParam.getInstId(), mpStgyParam.getInstType());
        java.lang.String safeString$default2 = "--";
        if (mpStgyParam.getTrailingUpConfig() == null || ((trailingUpConfig = mpStgyParam.getTrailingUpConfig()) != null && !trailingUpConfig.getEnabled())) {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
        } else {
            TrailingConfig trailingUpConfig2 = mpStgyParam.getTrailingUpConfig();
            java.lang.String stopPx = trailingUpConfig2 != null ? trailingUpConfig2.getStopPx() : null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) stopPx)) {
                safeString$default = "--";
            } else if (xmsAEQbTJ != null) {
                Intrinsics.copydefault((java.lang.Object) stopPx);
                C54536xML c54536xMLKWHzl = xmsAEQbTJ.KWHzl(stopPx);
                if (c54536xMLKWHzl == null || (c54536xMLDjBIcL2 = c54536xMLKWHzl.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                    safeString$default = "";
                }
            }
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24), safeString$default);
        }
        if (mpStgyParam.getTrailingDownConfig() == null || ((trailingDownConfig = mpStgyParam.getTrailingDownConfig()) != null && !trailingDownConfig.getEnabled())) {
            pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
        } else {
            TrailingConfig trailingDownConfig2 = mpStgyParam.getTrailingDownConfig();
            java.lang.String stopPx2 = trailingDownConfig2 != null ? trailingDownConfig2.getStopPx() : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) stopPx2)) {
                if (xmsAEQbTJ != null) {
                    Intrinsics.copydefault((java.lang.Object) stopPx2);
                    C54536xML c54536xMLKWHzl2 = xmsAEQbTJ.KWHzl(stopPx2);
                    if (c54536xMLKWHzl2 == null || (c54536xMLDjBIcL = c54536xMLKWHzl2.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                        safeString$default2 = "";
                    }
                }
            }
            pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23CallbackProxy), safeString$default2);
        }
        SignParamItem signParamItemIwGUEr = iwGUEr();
        java.lang.String stopType = signParamItemIwGUEr != null ? signParamItemIwGUEr.getStopType() : null;
        if (stopType == null || C33129mqd.OLrzqt((java.lang.Object) stopType, (java.lang.Object) 0)) {
            stopType = mpStgyParam.getStopType();
        }
        C55850xri c55850xri = new C55850xri(mpStgyParam.getInstType(), mpStgyParam.getInstId(), mpStgyParam.getSourceCcy(), mpStgyParam.getTradeQuoteCcy());
        TpSlTriggerParam tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(mpStgyParam.getTpslTriggerParamResp());
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null);
        objArr[1] = new BotParamItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null);
        objArr[2] = new BotParamItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null);
        objArr[3] = new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), pairAEQbTJ.getFirst(), null, pairAEQbTJ.getSecond(), false, false, null, null, null, false, 0, 0, 0, 0, 16372, null);
        objArr[4] = new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), pairAEQbTJ2.getFirst(), null, pairAEQbTJ2.getSecond(), false, false, null, null, null, false, 0, 0, 0, 0, 16372, null);
        objArr[5] = new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickContact), C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) stopType, (java.lang.Object) "1") ? C55688xof.Application.binderDied : C55688xof.Application.unregisterCallback), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null);
        java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(objArr);
        if (tpSlTriggerParamOLrzqt.getTp().getValue() != null) {
            java.lang.String strFetchVPNInfo = c55850xri.fetchVPNInfo(tpSlTriggerParamOLrzqt);
            arrayListCopydefault.add(new BotParamItemData(strFetchVPNInfo == null ? "" : strFetchVPNInfo, c55850xri.values(tpSlTriggerParamOLrzqt), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        if (tpSlTriggerParamOLrzqt.getSl().getValue() != null) {
            java.lang.String strIsConnected = c55850xri.isConnected(tpSlTriggerParamOLrzqt);
            arrayListCopydefault.add(new BotParamItemData(strIsConnected == null ? "" : strIsConnected, c55850xri.valueOf(tpSlTriggerParamOLrzqt), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        if (tpSlTriggerParamOLrzqt.getDelaySeconds() != null) {
            arrayListCopydefault.add(new BotParamItemData(c55850xri.copydefault(), c55850xri.djBIcL(tpSlTriggerParamOLrzqt), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getTp().getValue()) || C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getSl().getValue())) {
            java.lang.String strGEmmrt = c55850xri.gEmmrt();
            java.lang.String strDbNXlk = c55850xri.DbNXlk(tpSlTriggerParamOLrzqt);
            arrayListCopydefault.add(new BotParamItemData(strGEmmrt, strDbNXlk == null ? "" : strDbNXlk, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        return arrayListCopydefault;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getNewProxyInstance() ? copydefault(str) : KWHzl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.ArrayList<java.lang.Object> KWHzl(java.lang.String str) {
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String quoteSymbol;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        MpStgyDetail mpStgyDetailKWHzl = KWHzl();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        java.lang.String strKWHzl = fFgQHt().KWHzl("grid");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(mpStgyParamGEmmrt.getInstType())) == null) {
            safeString$default = "--";
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            if (strKWHzl == null) {
                quoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
            } else {
                quoteSymbol = strKWHzl;
            }
            C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, quoteSymbol);
            if (c54571xNhAhwBna != null) {
                C54536xML c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(str);
                if (c54536xMLAYXKKw == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                }
            }
            safeString$default = "--";
        }
        BotParamItemData botParamItemData = (strKWHzl == null || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl) ^ true)) ? null : new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1), strKWHzl, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(copydefault(mpStgyDetailKWHzl, mpStgyParamGEmmrt));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : safeString$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
        if (botParamItemData != null) {
            arrayList.add(botParamItemData);
        }
        if (!C56071xvr.gEmmrt.EZpvd(mpStgyParamGEmmrt.getProfitSharingRatio())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = mpStgyDetailKWHzl.getUsername();
            arrayList.add(new BotParamItemData(strAYXKKw, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username) ? "--" : username, null, null, false, false, mpStgyDetailKWHzl.getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        arrayList.add(new C55848xrg(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C33070mpX.copydefault(C52761wXj.Activity.aBDePw), 0, 0, false, 28, null));
        arrayList.addAll(KWHzl(mpStgyDetailKWHzl, mpStgyParamGEmmrt));
        arrayList.add(new CoinTipsData(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.dispatchMenuVisibilityChanged), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity22)))), (java.lang.String) null, 0.0f, false, 14, (DefaultConstructorMarker) null));
        arrayList.add(new NoConfirmData(false));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!(obj instanceof BotParamTickerData) && !(obj instanceof BotParamMultiContentData) && (!(obj instanceof BotParamItemData) || !((BotParamItemData) obj).isBeFiltered())) {
                arrayList2.add(obj);
            }
        }
        return new java.util.ArrayList<>(CollectionsKt___CollectionsKt.QfsBiF(arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.ArrayList<java.lang.Object> copydefault(java.lang.String str) {
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        MpStgyDetail mpStgyDetailKWHzl = KWHzl();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(mpStgyParamGEmmrt.getInstType())) == null) {
            safeString$default = "--";
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
            if (c54571xNhAhwBna != null) {
                C54536xML c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(str);
                if (c54536xMLAYXKKw == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                }
            }
            safeString$default = "--";
        }
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
        java.lang.String username = mpStgyDetailKWHzl.getUsername();
        arrayList.add(new BotParamItemData(strAYXKKw, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username) ? "--" : username, null, null, false, false, mpStgyDetailKWHzl.getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : safeString$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.AxsJAY), xMR.formatPercent$default(xMR.copydefault, mpStgyParamGEmmrt.getProfitSharingRatio(), 0, null, 4, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new CoinTipsData(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.dispatchMenuVisibilityChanged), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity22)))), (java.lang.String) null, 0.0f, false, 14, (DefaultConstructorMarker) null));
        arrayList.add(new NoConfirmData(false));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.valueOf, this.gEmmrt, this.DbNXlk, this.djBIcL);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        return new AIData((java.lang.String) null, mpStgyParamGEmmrt.getGridNum(), mpStgyParamGEmmrt.getMaxPx(), mpStgyParamGEmmrt.getMinPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, mpStgyParamGEmmrt.getRunType(), mpStgyParamGEmmrt.getDirection(), (java.lang.String) null, mpStgyParamGEmmrt.getLever(), (java.util.ArrayList) C56033xvF.EZpvd(mpStgyParamGEmmrt.getSignParams()), mpStgyParamGEmmrt.getReserveFunds(), mpStgyParamGEmmrt.getTrailingUpConfig(), mpStgyParamGEmmrt.getTrailingDownConfig(), false, mpStgyParamGEmmrt.getTpTriggerPx(), mpStgyParamGEmmrt.getSlTriggerPx(), C55765xqC.OLrzqt(mpStgyParamGEmmrt.getTpslTriggerParamResp()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -4685199, 3, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(str, "");
        C55887xsS c55887xsSFFgQHt = fFgQHt();
        java.lang.String strAEQbTJ = c55887xsSFFgQHt.AEQbTJ("grid");
        C54571xNh c54571xNhEZpvd = c55887xsSFFgQHt.EZpvd(str, true, strAEQbTJ);
        if (c54571xNhEZpvd != null && (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            if (safeString$default != null) {
                BizInstrument bizInstrumentAhwBna = c55887xsSFFgQHt.AhwBna();
                pUU.EZpvd("USDRename", "Copy Order, botType:grid, " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.joinCcyRelevantToString() : null) + ", tradeQuoteCcy:" + strAEQbTJ + ", formatted available balance: " + safeString$default);
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
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        java.lang.String strKWHzl = fFgQHt().KWHzl("grid");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(mpStgyParamGEmmrt.getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        if (strKWHzl == null) {
            strKWHzl = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, strKWHzl);
        return (c54571xNhAhwBna == null || (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String quoteDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(mpStgyParamGEmmrt.getInstType())) != null) {
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
        java.lang.String strCopydefault = fFgQHt().copydefault("grid");
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (strCopydefault == null || strCopydefault.length() == 0) ? C56002xub.KWHzl.EZpvd(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null) : strCopydefault;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        java.lang.String instFamily;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL2;
        Intrinsics.checkNotNullParameter(str, "");
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = mpStgyParamGEmmrt.getInstType();
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(instType, instFamily, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
        if (c54571xNhOLrzqt == null || (c54536xMLDjBIcL = c54571xNhOLrzqt.djBIcL(str)) == null || (c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ(true)) == null || (c54536xMLAuCTel = c54536xMLAEQbTJ.AuCTel()) == null || (c54536xMLDjBIcL2 = c54536xMLAuCTel.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        return "> " + safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String QfsBiF() {
        return fFgQHt().copydefault("grid");
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.lang.String displayQuoteSymbol;
        java.lang.String tradeSymbol;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
            arrayList.add(tradeSymbol);
        }
        if (suggestedInstrument$default != null && (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) != null) {
            arrayList.add(displayQuoteSymbol);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        java.lang.String instFamily;
        java.lang.String safeString$default;
        java.lang.String instFamily2;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAEQbTJ2;
        C54536xML c54536xMLAuCTel2;
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, mpStgyParamGEmmrt.getInstType(), mpStgyParamGEmmrt.getInstId(), null, null, 12, null) : null;
        java.lang.String instType = mpStgyParamGEmmrt.getInstType();
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(instType, instFamily, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
        if (c54571xNhOLrzqt == null) {
            safeString$default = "";
        } else {
            java.lang.String value = giSNqX().getValue();
            if (value == null) {
                value = "";
            }
            C54536xML c54536xMLDjBIcL2 = c54571xNhOLrzqt.djBIcL(value);
            if (c54536xMLDjBIcL2 == null || (c54536xMLAEQbTJ2 = c54536xMLDjBIcL2.AEQbTJ(true)) == null || (c54536xMLAuCTel2 = c54536xMLAEQbTJ2.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel2, false, 1, null)) == null) {
            }
        }
        java.lang.String instType2 = mpStgyParamGEmmrt.getInstType();
        if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily2 = "";
        }
        C54571xNh c54571xNhOLrzqt2 = C54566xNc.OLrzqt(instType2, instFamily2, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
        if (c54571xNhOLrzqt2 == null) {
            safeString$default2 = "";
        } else {
            java.lang.String value2 = giSNqX().getValue();
            if (value2 == null) {
                value2 = "";
            }
            C54536xML c54536xMLDjBIcL3 = c54571xNhOLrzqt2.djBIcL(value2);
            if (c54536xMLDjBIcL3 == null || (c54536xMLAEQbTJ = c54536xMLDjBIcL3.AEQbTJ(true)) == null || (c54536xMLAuCTel = c54536xMLAEQbTJ.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz()) && C33129mqd.valueOf(copyBotReqParam.getQuoteSz(), safeString$default)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.HalfFloat), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, safeString$default2))));
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    public final boolean fJNWhG() {
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        TrailingConfig trailingUpConfig = mpStgyParamGEmmrt.getTrailingUpConfig();
        if (trailingUpConfig != null && trailingUpConfig.getEnabled()) {
            return true;
        }
        TrailingConfig trailingDownConfig = mpStgyParamGEmmrt.getTrailingDownConfig();
        return trailingDownConfig != null && trailingDownConfig.getEnabled();
    }

    @Override // o.AbstractC51317vkj
    public kotlin.Pair<java.lang.Boolean, java.lang.String> iRxXKY() {
        TrailingConfig trailingUpConfig;
        TrailingConfig trailingDownConfig;
        TrailingConfig trailingDownConfig2;
        MpStgyParam mpStgyParamGEmmrt = gEmmrt();
        TrailingConfig trailingUpConfig2 = mpStgyParamGEmmrt.getTrailingUpConfig();
        if (trailingUpConfig2 != null && trailingUpConfig2.getEnabled() && (trailingDownConfig2 = mpStgyParamGEmmrt.getTrailingDownConfig()) != null && trailingDownConfig2.getEnabled()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
        }
        TrailingConfig trailingUpConfig3 = mpStgyParamGEmmrt.getTrailingUpConfig();
        if (trailingUpConfig3 != null && trailingUpConfig3.getEnabled() && ((trailingDownConfig = mpStgyParamGEmmrt.getTrailingDownConfig()) == null || !trailingDownConfig.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
        }
        TrailingConfig trailingDownConfig3 = mpStgyParamGEmmrt.getTrailingDownConfig();
        if (trailingDownConfig3 != null && trailingDownConfig3.getEnabled() && ((trailingUpConfig = mpStgyParamGEmmrt.getTrailingUpConfig()) == null || !trailingUpConfig.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.copydefault);
        }
    }

    public static final Unit EZpvd(C51330vkw c51330vkw, ResponseData responseData) {
        java.util.List list;
        StrategyConfigInfo strategyConfigInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null && (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            c51330vkw.AYXKKw.setValue(strategyConfigInfo);
        }
        return Unit.INSTANCE;
    }
}

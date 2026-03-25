package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.DcaCopyConfirmTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
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
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51326vks extends AbstractC51317vkj {
    public final C54282xCq AEQbTJ;
    public final C56144xxK AYXKKw;
    public final TradeLiveData<StrategyConfigInfo> AhwBna;
    public xDM EZpvd;
    public final TradeLiveData<TickersData> KWHzl;
    public final C56235xyw OLrzqt;
    public java.util.ArrayList<java.lang.Object> copydefault;
    public boolean djBIcL;
    public java.lang.String gEmmrt;

    /* JADX INFO: renamed from: o.vks$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    @Override // o.AbstractC51317vkj
    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.djBIcL;
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.QVMIlxQVMIlx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51326vks(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.AYXKKw = new C56144xxK();
        this.OLrzqt = new C56235xyw();
        this.AhwBna = new TradeLiveData<>();
        this.AEQbTJ = new C54282xCq();
        this.KWHzl = new TradeLiveData<>();
        this.djBIcL = true;
        this.copydefault = new java.util.ArrayList<>();
    }

    private final MpStgyParam hDKMBd() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    private final MpStgyDetail iwGUEr() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        java.lang.String first = gEmmrt().getFirst();
        java.lang.String second = gEmmrt().getSecond();
        C56144xxK c56144xxK = this.AYXKKw;
        c56144xxK.OLrzqt(OLrzqt(first, second));
        c56144xxK.djBIcL();
        c56144xxK.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(c56144xxK, 0L, 1, null);
    }

    public final DcaOrderReq OLrzqt(java.lang.String str, java.lang.String str2) {
        java.lang.String instId = hDKMBd().getInstId();
        boolean z = this.djBIcL;
        java.lang.String maxSafetyOrds = hDKMBd().getMaxSafetyOrds();
        java.lang.String pxSteps = hDKMBd().getPxSteps();
        java.lang.String pxStepsMult = hDKMBd().getPxStepsMult();
        java.lang.String volMult = hDKMBd().getVolMult();
        java.lang.String tpPct = hDKMBd().getTpPct();
        java.lang.String slPct = hDKMBd().getSlPct();
        java.lang.String mode = SpotDcaInvestTypeData.MANUAL.getMode();
        java.util.List<DcaTriggerParam> triggerParams = hDKMBd().getTriggerParams();
        java.lang.String str3 = null;
        return new DcaOrderReq(instId, str, java.lang.Boolean.valueOf(z), str2, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, "long", mode, (java.lang.String) null, str3, hDKMBd().getAlgoId(), str3, (java.lang.String) null, (java.util.List) triggerParams, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, hDKMBd().getOrdType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, fFgQHt().AEQbTJ("spot_dca"), (AutoVipProfitInfo) null, -537022464, 11, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        C56235xyw c56235xyw = this.OLrzqt;
        c56235xyw.KWHzl("spot_dca");
        c56235xyw.AEQbTJ(hDKMBd().getInstId());
        c56235xyw.OLrzqt(fFgQHt().AEQbTJ("spot_dca"));
        c56235xyw.djBIcL();
        c56235xyw.AuCTel();
        c56235xyw.OLrzqt(this.AhwBna, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
        C54282xCq c54282xCq = this.AEQbTJ;
        c54282xCq.AEQbTJ(hDKMBd().getInstId());
        c54282xCq.djBIcL();
        c54282xCq.AuCTel();
        c54282xCq.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        c56235xyw.fetchVPNInfo().KWHzl(new TaskDescription(new Function1() { // from class: o.vku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51326vks.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        }));
        c54282xCq.fetchVPNInfo().KWHzl(new TaskDescription(new Function1() { // from class: o.vkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51326vks.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        }));
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        java.lang.String strAEQbTJ = fFgQHt().AEQbTJ("spot_dca");
        pUU.EZpvd("USDRename", "sub Available balance SPOT DCA, instId:" + hDKMBd().getInstId() + ", tradeQuoteCcy:" + strAEQbTJ);
        Application application = new Application(strAEQbTJ, this, hDKMBd().getInstId(), hDKMBd().getInstType(), "cash");
        this.copydefault.clear();
        this.copydefault.add(application);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.vks$Application */
    public static final class Application extends AbstractC55740xpe {
        public final /* synthetic */ C51326vks KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.lang.String str, C51326vks c51326vks, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null, null, str3, str2, null, null, str4, null, java.lang.Boolean.TRUE, null, "1", null, null, null, null, null, null, null, null, str, 522931, null);
            this.KWHzl = c51326vks;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                this.KWHzl.flVtFt().postValue(maxAvailableResp.getQuoteMax());
            }
            this.KWHzl.EZpvd = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi23);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        return C56033xvF.getCoinTitle$default(hDKMBd().getInstType(), hDKMBd().getInstId(), false, null, null, 28, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        return AkhnZx();
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt("botName", C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi23)))), C33070mpX.AYXKKw(C55688xof.Application.AwvSrB), C33070mpX.AYXKKw(C55688xof.Application.dLBcXg), "spot_dca", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.apNbdB), C33070mpX.AYXKKw(C55688xof.Application.aJFbMH)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.dvImUD), C33070mpX.AYXKKw(C55688xof.Application.akftKQ)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.fLIjIY), C33070mpX.AYXKKw(C55688xof.Application.alsFma))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C33070mpX.AYXKKw(C55688xof.Application.startActivityForResult)), null, 0, null, null, 960, null);
    }

    private final BotParamItemData fIwbmz() {
        if (C33129mqd.AhwBna(hDKMBd().getMaxSafetyOrds(), 0)) {
            return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.zblBkD), xMR.formatPercent$default(xMR.copydefault, hDKMBd().getPxSteps(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.DcqEDu), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
        }
        return null;
    }

    private final BotParamItemData zLjUOn() {
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), xMR.formatPercent$default(xMR.copydefault, hDKMBd().getTpPct(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.aHXSQp), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    private final BotParamItemData valueOf() {
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.spnCvw), xMR.copydefault.copydefault(hDKMBd().getMaxSafetyOrds()), C33070mpX.AYXKKw(C55688xof.Application.DWgRXt), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    private final BotParamItemData AuCTel() {
        if (!C33129mqd.AEQbTJ(hDKMBd().getSafetyOrdRatio(), 0)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.htlTjW), "1:" + xMR.formatDownToFixed$default(xMR.copydefault, hDKMBd().getSafetyOrdRatio(), 0, 2, null), C33070mpX.AYXKKw(C55688xof.Application.UrRBLY), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    private final BotParamItemData fJNWhG() {
        if (!C33129mqd.AEQbTJ(hDKMBd().getMaxSafetyOrds(), 1)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.call), xMR.formatDownToFixed$default(xMR.copydefault, hDKMBd().getPxStepsMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), C33070mpX.AYXKKw(C55688xof.Application.fHqPtx), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    private final BotParamItemData sSMYrx() {
        if (!C33129mqd.AEQbTJ(hDKMBd().getMaxSafetyOrds(), 1)) {
            return null;
        }
        return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.fdOvFl), xMR.formatDownToFixed$default(xMR.copydefault, hDKMBd().getVolMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), C33070mpX.AYXKKw(C55688xof.Application.WS), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
    }

    private final BotParamItemData getNewProxyInstance() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) hDKMBd().getSlPct())) {
            return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.run), xMR.formatPercent$default(xMR.copydefault, hDKMBd().getSlPct(), 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.UscePu), null, false, false, null, null, null, false, 0, 0, 0, 0, 16376, null);
        }
        return null;
    }

    public final BotParamItemData KWHzl() {
        java.lang.String strCopydefault;
        java.util.List<DcaTriggerParam> triggerParams = hDKMBd().getTriggerParams();
        DcaTriggerParam dcaTriggerParam = triggerParams != null ? (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams) : null;
        strCopydefault = "";
        if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            int i = C55688xof.Application.setMediaUri;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            java.lang.String timePeriod = dcaTriggerParam.getTimePeriod();
            if (timePeriod == null) {
                timePeriod = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("periodNum", valueOf(timePeriod));
            java.lang.String timeframe = dcaTriggerParam.getTimeframe();
            if (timeframe == null) {
                timeframe = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("chartTime", gEmmrt(timeframe));
            java.lang.String triggerCond = dcaTriggerParam.getTriggerCond();
            if (triggerCond == null) {
                triggerCond = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("triggerWhen", djBIcL(triggerCond));
            java.lang.String thold = dcaTriggerParam.getThold();
            pairArr[3] = C56390yDp.OLrzqt("threshold", AhwBna(thold != null ? thold : ""));
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        java.lang.String str = strCopydefault;
        java.lang.String strCopydefault2 = GridStartTriggerType.Companion.copydefault(dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null);
        if (strCopydefault2.length() > 0) {
            return new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), strCopydefault2, null, str, false, false, null, null, null, false, 0, 0, 0, 0, 16372, null);
        }
        return null;
    }

    private final BotParamItemData AEQbTJ() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
        java.lang.String username = iwGUEr().getUsername();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
            username = "--";
        }
        return new BotParamItemData(strAYXKKw, username, null, null, false, false, iwGUEr().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
        arrayList.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), hDKMBd().getInstId(), hDKMBd().getInstType(), null, false, 0, 0, 120, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), C56002xub.KWHzl.EZpvd(C33129mqd.subS$default(iwGUEr().getPTime(), iwGUEr().getCTime(), null, null, null, 14, null)), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        BotParamItemData botParamItemDataFIwbmz = fIwbmz();
        if (botParamItemDataFIwbmz != null) {
            arrayList.add(botParamItemDataFIwbmz);
        }
        arrayList.add(zLjUOn());
        arrayList.add(valueOf());
        BotParamItemData botParamItemDataAuCTel = AuCTel();
        if (botParamItemDataAuCTel != null) {
            arrayList.add(botParamItemDataAuCTel);
        }
        arrayList.add(new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, C55298xhM.dp2px$default(4.0f, null, 1, null), false, 20, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
        BotParamItemData botParamItemDataKWHzl = KWHzl();
        if (botParamItemDataKWHzl != null) {
            arrayList.add(botParamItemDataKWHzl);
        }
        BotParamItemData botParamItemDataFJNWhG = fJNWhG();
        if (botParamItemDataFJNWhG != null) {
            arrayList.add(botParamItemDataFJNWhG);
        }
        BotParamItemData botParamItemDataSSMYrx = sSMYrx();
        if (botParamItemDataSSMYrx != null) {
            arrayList.add(botParamItemDataSSMYrx);
        }
        BotParamItemData newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            arrayList.add(newProxyInstance);
        }
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (!C56071xvr.gEmmrt.EZpvd(hDKMBd().getProfitSharingRatio())) {
            arrayList.add(AEQbTJ());
            arrayList.add(new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
        }
        BotParamItemData botParamItemDataKWHzl = KWHzl();
        if (botParamItemDataKWHzl != null) {
            arrayList.add(botParamItemDataKWHzl);
        }
        BotParamItemData botParamItemDataFIwbmz = fIwbmz();
        if (botParamItemDataFIwbmz != null) {
            botParamItemDataFIwbmz.setDoubtMsg("");
            arrayList.add(botParamItemDataFIwbmz);
        }
        BotParamItemData botParamItemDataAuCTel = AuCTel();
        if (botParamItemDataAuCTel != null) {
            botParamItemDataAuCTel.setDoubtMsg("");
            arrayList.add(botParamItemDataAuCTel);
        }
        BotParamItemData botParamItemDataFJNWhG = fJNWhG();
        if (botParamItemDataFJNWhG != null) {
            botParamItemDataFJNWhG.setDoubtMsg("");
            arrayList.add(botParamItemDataFJNWhG);
        }
        BotParamItemData botParamItemDataSSMYrx = sSMYrx();
        if (botParamItemDataSSMYrx != null) {
            botParamItemDataSSMYrx.setDoubtMsg("");
            arrayList.add(botParamItemDataSSMYrx);
        }
        BotParamItemData botParamItemDataValueOf = valueOf();
        botParamItemDataValueOf.setDoubtMsg("");
        arrayList.add(botParamItemDataValueOf);
        BotParamItemData botParamItemDataZLjUOn = zLjUOn();
        botParamItemDataZLjUOn.setDoubtMsg("");
        arrayList.add(botParamItemDataZLjUOn);
        BotParamItemData newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            newProxyInstance.setDoubtMsg("");
            arrayList.add(newProxyInstance);
        }
        EZpvd(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    @Override // o.AbstractC51317vkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        BotParamItemData botParamItemDataCopy;
        BotParamItemData botParamItemDataCopy2;
        BotParamItemData botParamItemDataCopy3;
        BotParamItemData botParamItemDataCopy4;
        BotParamItemData botParamItemDataCopy5;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.RZMhtF), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2);
        xMR xmr = xMR.copydefault;
        java.lang.String str2 = this.gEmmrt;
        arrayList.add(new BotParamItemData(strAYXKKw, xmr.copydefault(str2 != null ? str2 : "") + " " + getFieldNames(), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        StrategyConfigInfo value = AhwBna().getValue();
        if (C33129mqd.KWHzl((java.util.Collection) (value != null ? value.getAutoStaking() : null))) {
            C54149wys.AEQbTJ.copydefault(arrayList, AhwBna().getValue());
        } else {
            StrategyConfigInfo value2 = AhwBna().getValue();
            if (C33129mqd.KWHzl((java.util.Collection) (value2 != null ? value2.getAutoEarn() : null))) {
            }
        }
        BotParamItemData botParamItemDataFIwbmz = fIwbmz();
        if (botParamItemDataFIwbmz != null && (botParamItemDataCopy5 = botParamItemDataFIwbmz.copy((16379 & 1) != 0 ? botParamItemDataFIwbmz.title : null, (16379 & 2) != 0 ? botParamItemDataFIwbmz.text : null, (16379 & 4) != 0 ? botParamItemDataFIwbmz.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataFIwbmz.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataFIwbmz.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataFIwbmz.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataFIwbmz.rightImage : null, (16379 & 128) != 0 ? botParamItemDataFIwbmz.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataFIwbmz.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataFIwbmz.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataFIwbmz.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataFIwbmz.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataFIwbmz.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataFIwbmz.textStyle : 0)) != null) {
            arrayList.add(botParamItemDataCopy5);
        }
        BotParamItemData botParamItemDataZLjUOn = zLjUOn();
        arrayList.add(botParamItemDataZLjUOn.copy((16379 & 1) != 0 ? botParamItemDataZLjUOn.title : null, (16379 & 2) != 0 ? botParamItemDataZLjUOn.text : null, (16379 & 4) != 0 ? botParamItemDataZLjUOn.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataZLjUOn.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataZLjUOn.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataZLjUOn.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataZLjUOn.rightImage : null, (16379 & 128) != 0 ? botParamItemDataZLjUOn.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataZLjUOn.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataZLjUOn.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataZLjUOn.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataZLjUOn.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataZLjUOn.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataZLjUOn.textStyle : 0));
        BotParamItemData botParamItemDataValueOf = valueOf();
        arrayList.add(botParamItemDataValueOf.copy((16379 & 1) != 0 ? botParamItemDataValueOf.title : null, (16379 & 2) != 0 ? botParamItemDataValueOf.text : null, (16379 & 4) != 0 ? botParamItemDataValueOf.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataValueOf.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataValueOf.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataValueOf.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataValueOf.rightImage : null, (16379 & 128) != 0 ? botParamItemDataValueOf.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataValueOf.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataValueOf.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataValueOf.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataValueOf.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataValueOf.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataValueOf.textStyle : 0));
        if (!C56071xvr.gEmmrt.EZpvd(hDKMBd().getProfitSharingRatio())) {
            arrayList.add(AEQbTJ());
        }
        if (fFgQHt().AuCTel()) {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb), fFgQHt().copydefault("spot_dca"), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        arrayList.add(new C55848xrg(0, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), 0, 0, false, 28, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.gdwsGQ), null, null, null, true, false, null, null, null, false, 0, 0, 0, 0, 16366, null));
        BotParamItemData botParamItemDataKWHzl = KWHzl();
        if (botParamItemDataKWHzl != null && (botParamItemDataCopy4 = botParamItemDataKWHzl.copy((16379 & 1) != 0 ? botParamItemDataKWHzl.title : null, (16379 & 2) != 0 ? botParamItemDataKWHzl.text : null, (16379 & 4) != 0 ? botParamItemDataKWHzl.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataKWHzl.rightDoubtMsg : "", (16379 & 16) != 0 ? botParamItemDataKWHzl.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataKWHzl.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataKWHzl.rightImage : null, (16379 & 128) != 0 ? botParamItemDataKWHzl.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataKWHzl.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataKWHzl.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataKWHzl.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataKWHzl.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataKWHzl.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataKWHzl.textStyle : 0)) != null) {
            arrayList.add(botParamItemDataCopy4);
        }
        BotParamItemData botParamItemDataSSMYrx = sSMYrx();
        if (botParamItemDataSSMYrx != null && (botParamItemDataCopy3 = botParamItemDataSSMYrx.copy((16379 & 1) != 0 ? botParamItemDataSSMYrx.title : null, (16379 & 2) != 0 ? botParamItemDataSSMYrx.text : null, (16379 & 4) != 0 ? botParamItemDataSSMYrx.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataSSMYrx.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataSSMYrx.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataSSMYrx.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataSSMYrx.rightImage : null, (16379 & 128) != 0 ? botParamItemDataSSMYrx.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataSSMYrx.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataSSMYrx.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataSSMYrx.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataSSMYrx.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataSSMYrx.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataSSMYrx.textStyle : 0)) != null) {
            arrayList.add(botParamItemDataCopy3);
        }
        BotParamItemData botParamItemDataFJNWhG = fJNWhG();
        if (botParamItemDataFJNWhG != null && (botParamItemDataCopy2 = botParamItemDataFJNWhG.copy((16379 & 1) != 0 ? botParamItemDataFJNWhG.title : null, (16379 & 2) != 0 ? botParamItemDataFJNWhG.text : null, (16379 & 4) != 0 ? botParamItemDataFJNWhG.doubtMsg : "", (16379 & 8) != 0 ? botParamItemDataFJNWhG.rightDoubtMsg : null, (16379 & 16) != 0 ? botParamItemDataFJNWhG.isHeadLine : false, (16379 & 32) != 0 ? botParamItemDataFJNWhG.isBeFiltered : false, (16379 & 64) != 0 ? botParamItemDataFJNWhG.rightImage : null, (16379 & 128) != 0 ? botParamItemDataFJNWhG.rightImageRes : null, (16379 & 256) != 0 ? botParamItemDataFJNWhG.rightImageBg : null, (16379 & 512) != 0 ? botParamItemDataFJNWhG.showAvatar : false, (16379 & 1024) != 0 ? botParamItemDataFJNWhG.titleTextColor : 0, (16379 & 2048) != 0 ? botParamItemDataFJNWhG.textColor : 0, (16379 & 4096) != 0 ? botParamItemDataFJNWhG.titleTextStyle : 0, (16379 & 8192) != 0 ? botParamItemDataFJNWhG.textStyle : 0)) != null) {
            arrayList.add(botParamItemDataCopy2);
        }
        BotParamItemData newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null && (botParamItemDataCopy = newProxyInstance.copy((16379 & 1) != 0 ? newProxyInstance.title : null, (16379 & 2) != 0 ? newProxyInstance.text : null, (16379 & 4) != 0 ? newProxyInstance.doubtMsg : "", (16379 & 8) != 0 ? newProxyInstance.rightDoubtMsg : null, (16379 & 16) != 0 ? newProxyInstance.isHeadLine : false, (16379 & 32) != 0 ? newProxyInstance.isBeFiltered : false, (16379 & 64) != 0 ? newProxyInstance.rightImage : null, (16379 & 128) != 0 ? newProxyInstance.rightImageRes : null, (16379 & 256) != 0 ? newProxyInstance.rightImageBg : null, (16379 & 512) != 0 ? newProxyInstance.showAvatar : false, (16379 & 1024) != 0 ? newProxyInstance.titleTextColor : 0, (16379 & 2048) != 0 ? newProxyInstance.textColor : 0, (16379 & 4096) != 0 ? newProxyInstance.titleTextStyle : 0, (16379 & 8192) != 0 ? newProxyInstance.textStyle : 0)) != null) {
            arrayList.add(botParamItemDataCopy);
        }
        arrayList.add(new DcaCopyConfirmTipsData(hDKMBd().getMaxSafetyOrds(), this.djBIcL, true));
        arrayList.add(new NoConfirmData(false));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.AYXKKw, this.OLrzqt, this.AEQbTJ);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        java.lang.String pxSteps = hDKMBd().getPxSteps();
        java.lang.String tpPct = hDKMBd().getTpPct();
        java.lang.String maxSafetyOrds = hDKMBd().getMaxSafetyOrds();
        java.lang.String volMult = hDKMBd().getVolMult();
        return new DcaOrderReq((java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, (java.lang.String) null, maxSafetyOrds, pxSteps, hDKMBd().getPxStepsMult(), volMult, tpPct, hDKMBd().getSlPct(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) hDKMBd().getTriggerParams(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -8520693, 15, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.copydefault);
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        java.lang.String strAEQbTJ;
        C54571xNh c54571xNhEZpvd;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (c54571xNhEZpvd = fFgQHt().EZpvd(str, true, (strAEQbTJ = fFgQHt().AEQbTJ("spot_dca")))) == null || (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            return "--";
        }
        pUU.EZpvd("USDRename", "Copy Order, botType:spot_dca, " + suggestedInstrument$default.joinCcyRelevantToString() + ", tradeQuoteCcy:" + strAEQbTJ + ", formatted available balance: " + safeString$default);
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
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(hDKMBd().getInstType())) == null) {
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
        return "≥ " + xMR.copydefault.copydefault(AkhnZx(str));
    }

    private final java.lang.String AkhnZx(java.lang.String str) {
        java.lang.String instFamily;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        java.lang.String instType = hDKMBd().getInstType();
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(instType, instFamily, suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null);
        return (c54571xNhOLrzqt == null || (c54536xMLDjBIcL = c54571xNhOLrzqt.djBIcL(str)) == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String getFieldNames() {
        java.lang.String strCopydefault = fFgQHt().copydefault("spot_dca");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (strCopydefault == null || strCopydefault.length() == 0) ? C56002xub.KWHzl.EZpvd(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null) : strCopydefault;
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String quoteDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(hDKMBd().getInstType())) != null) {
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
    public java.lang.String QfsBiF() {
        return fFgQHt().copydefault("spot_dca");
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.lang.String displayQuoteSymbol;
        java.lang.String tradeSymbol;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
            arrayList.add(tradeSymbol);
        }
        if (suggestedInstrument$default != null && (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) != null) {
            arrayList.add(displayQuoteSymbol);
        }
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        this.gEmmrt = copyBotReqParam.getQuoteSz();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz())) {
            java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
            java.lang.String value = giSNqX().getValue();
            if (value == null) {
                value = "";
            }
            if (C33129mqd.gEmmrt(quoteSz, AkhnZx(value))) {
                int i = C55688xof.Application.UlJrfe;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2));
                xMR xmr = xMR.copydefault;
                java.lang.String value2 = giSNqX().getValue();
                pairArr[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(AkhnZx(value2 != null ? value2 : "")));
                pairArr[2] = C56390yDp.OLrzqt("unit", getFieldNames());
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            }
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    public static /* synthetic */ void calculateMinInvestmentAmt$default(C51326vks c51326vks, TickersData tickersData, StrategyConfigInfo strategyConfigInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c51326vks.copydefault(tickersData, strategyConfigInfo, z);
    }

    public final void copydefault(TickersData tickersData, StrategyConfigInfo strategyConfigInfo, boolean z) {
        java.lang.String strAddS$default;
        java.lang.String strEZpvd = EZpvd(tickersData, strategyConfigInfo);
        if (C33129mqd.OLrzqt((java.lang.Object) hDKMBd().getMaxSafetyOrds(), (java.lang.Object) 0)) {
            giSNqX().postValue(strEZpvd);
            return;
        }
        java.lang.String strCopydefault = copydefault(strEZpvd, hDKMBd().getMaxSafetyOrds(), hDKMBd().getVolMult());
        java.lang.String strDivS$default = C33129mqd.divS$default(strCopydefault, hDKMBd().getSafetyOrdRatio(), null, null, null, 14, null);
        if (C33129mqd.gEmmrt(strDivS$default, strEZpvd)) {
            strDivS$default = strEZpvd;
            strCopydefault = C33129mqd.mulS$default(strDivS$default, hDKMBd().getSafetyOrdRatio(), null, null, null, 14, null);
        }
        java.lang.String str = strCopydefault;
        if (z) {
            strAddS$default = C33129mqd.addS$default(strDivS$default, C56045xvR.KWHzl.copydefault(str, hDKMBd().getMaxSafetyOrds(), hDKMBd().getVolMult()), null, null, null, 14, null);
        } else {
            strAddS$default = C33129mqd.addS$default(strDivS$default, str, null, null, null, 14, null);
        }
        giSNqX().postValue(strAddS$default);
    }

    public final java.lang.String EZpvd(TickersData tickersData, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String strAhwBna;
        java.lang.String last;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        xMS xmsGEmmrt = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(hDKMBd().getInstType())) == null) ? null : abstractC54531xLwOLrzqt.gEmmrt(xUW.KWHzl.AEQbTJ(hDKMBd().getInstId()));
        if (xmsGEmmrt != null) {
            if (tickersData == null || (last = tickersData.getLast()) == null) {
                last = "";
            }
            strAhwBna = xmsGEmmrt.AhwBna(last);
        } else {
            strAhwBna = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, hDKMBd().getInstType(), hDKMBd().getInstId(), null, null, 12, null) : null;
        java.lang.String quoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
        if (Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDT") || Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDC")) {
            return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getMinSize(), strAhwBna, null, null, null, 14, null), strategyConfigInfo != null ? strategyConfigInfo.getMinAmtBuffer() : null, null, null, null, 14, null)), java.lang.Math.max(C33129mqd.AEQbTJ(strategyConfigInfo != null ? strategyConfigInfo.getMinQuoteThold() : null), C33129mqd.AEQbTJ(suggestedInstrument$default.getTickerSize())))));
        }
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default != null ? suggestedInstrument$default.getMinSize() : null, strAhwBna, null, null, null, 14, null), strategyConfigInfo != null ? strategyConfigInfo.getMinAmtBuffer() : null, null, null, null, 14, null)), C33129mqd.AEQbTJ(suggestedInstrument$default != null ? suggestedInstrument$default.getTickerSize() : null))));
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(str), C33129mqd.AEQbTJ(C33129mqd.divS$default(str, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str3), C33129mqd.AhwBna(str2) - 1)), null, null, null, 14, null)))));
    }

    public final void KWHzl(boolean z) {
        this.djBIcL = z;
        copydefault(this.KWHzl.getValue(), this.AhwBna.getValue(), z);
    }

    private final kotlin.Pair<java.lang.String, java.lang.String> gEmmrt() {
        java.lang.String str;
        java.lang.String strMulS$default;
        if (this.djBIcL) {
            int iAhwBna = C33129mqd.AhwBna(hDKMBd().getMaxSafetyOrds());
            java.lang.String strAddS$default = "0";
            for (int i = 0; i < iAhwBna; i++) {
                strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(hDKMBd().getVolMult()), i)), null, null, null, 14, null);
            }
            java.lang.String strDivS$default = C33129mqd.divS$default(this.gEmmrt, C33129mqd.addS$default(C33129mqd.mulS$default(hDKMBd().getSafetyOrdRatio(), strAddS$default, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null);
            strMulS$default = C33129mqd.mulS$default(strDivS$default, hDKMBd().getSafetyOrdRatio(), null, null, null, 14, null);
            str = strDivS$default;
        } else {
            java.lang.String strDivS$default2 = C33129mqd.divS$default(this.gEmmrt, C33129mqd.addS$default(hDKMBd().getSafetyOrdRatio(), 1, null, null, null, 14, null), null, null, null, 14, null);
            str = strDivS$default2;
            strMulS$default = C33129mqd.mulS$default(strDivS$default2, hDKMBd().getSafetyOrdRatio(), null, null, null, 14, null);
        }
        int iMax = java.lang.Math.max(ejfBZ(), 8);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C56390yDp.OLrzqt(C33129mqd.formatS$default(str, java.lang.Integer.valueOf(iMax), null, roundingMode, 2, null), C33129mqd.formatS$default(strMulS$default, java.lang.Integer.valueOf(java.lang.Math.max(ejfBZ(), 8)), null, roundingMode, 2, null));
    }

    public final java.lang.String OLrzqt() {
        return hDKMBd().getMaxSafetyOrds();
    }

    public final java.lang.String valueOf(java.lang.String str) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : xMR.copydefault.copydefault(str);
    }

    public final java.lang.String gEmmrt(java.lang.String str) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : str;
    }

    public final java.lang.String djBIcL(java.lang.String str) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : TriggerCond.Companion.KWHzl(str);
    }

    public final java.lang.String AhwBna(java.lang.String str) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : xMR.copydefault.copydefault(str);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return "--";
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(str, C33129mqd.addS$default(hDKMBd().getSafetyOrdRatio(), 1, null, null, null, 14, null), null, null, null, 14, null);
        java.lang.String maxSafetyOrds = hDKMBd().getMaxSafetyOrds();
        java.lang.String strMulS$default = C33129mqd.mulS$default(strDivS$default, hDKMBd().getSafetyOrdRatio(), null, null, null, 14, null);
        java.lang.String volMult = hDKMBd().getVolMult();
        if (strDivS$default.length() == 0 || C33129mqd.valueOf(maxSafetyOrds, 0)) {
            return "";
        }
        java.lang.String strCopydefault = C56045xvR.KWHzl.copydefault(strMulS$default, maxSafetyOrds, volMult);
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(new C55887xsS(hDKMBd().getInstType(), hDKMBd().getInstId()), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.addS$default(strDivS$default, strCopydefault, null, null, null, 14, null))) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        return str2 + " " + getFieldNames();
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, flVtFt().getValue());
    }

    public final boolean copydefault() {
        return C33129mqd.AEQbTJ(hDKMBd().getMaxSafetyOrds(), 1);
    }

    private final void EZpvd(java.util.ArrayList<java.lang.Object> arrayList) {
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof BotParamItemData) {
                ((BotParamItemData) obj).setDoubtMsg("");
            }
        }
    }

    public static final Unit AEQbTJ(C51326vks c51326vks, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            TickersData value = c51326vks.KWHzl.getValue();
            java.util.List list = (java.util.List) responseData.getData();
            calculateMinInvestmentAmt$default(c51326vks, value, list != null ? (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list) : null, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51326vks c51326vks, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.List list = (java.util.List) responseData.getData();
            calculateMinInvestmentAmt$default(c51326vks, list != null ? (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list) : null, c51326vks.AhwBna.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TacticsType;
import com.okinc.biz.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideLottieCard;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSpotGridPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.biz.bot.RecommendParam;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.VoucherInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C48033uCm;
import o.C53811wsY;
import o.C53867wtb;
import o.C53868wtc;
import o.C54507xKz;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C55811xqw;
import o.C55867xrz;
import o.C55886xsR;
import o.C55887xsS;
import o.C56111xwe;
import o.C56160xxa;
import o.C56192xyF;
import o.C56198xyL;
import o.C56223xyk;
import o.C56235xyw;
import o.C56238xyz;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56548yJl;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideSpotGridPresenter extends AbsPresenter implements IBotGuidePresenter {
    public String AYXKKw;
    public final C56111xwe<List<BotGuideCoinItem>> AhwBna;
    public final C56235xyw AkhnZx;
    public final C56223xyk AuCTel;
    public final C56192xyF DbNXlk;
    public final TradeLiveData<BotAggregatedInfoBean> EZpvd;
    public final LiveData<List<Object>> KWHzl;
    public final MutableSharedFlow<Activity> OLrzqt;
    public StrategyBaseReq copydefault;
    public final C56160xxa djBIcL;
    public final TradeLiveData<String> ejfBZ;
    public final C56238xyz fARcdN;
    public final TradeLiveData<StrategyResponse> fIwbmz;
    public final TradeLiveData<MinInvestResp> fJNWhG;
    public GridReq fetchVPNInfo;
    public final C56111xwe<IBotGuidePresenter.ButtonState> gEmmrt;
    public final C56198xyL getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final SharedFlow<Activity> hDKMBd;
    public final C56111xwe<LossInsuranceDisplayData> isConnected;
    public final TradeLiveData<StrategyConfigInfo> iwGUEr;
    public final C56111xwe<Unit> valueOf;
    public final C56111xwe<Pair<Boolean, Exception>> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReq AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56223xyk AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyBaseReq OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAggregatedInfoBean> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<List<BotGuideCoinItem>> ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<IBotGuidePresenter.ButtonState> fARcdN() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Unit> fJNWhG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56192xyF fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<LossInsuranceDisplayData> isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Pair<Boolean, Exception>> iwGUEr() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56160xxa valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> values() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> wlaJM() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56198xyL zLjUOn() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> zsXlph() {
        return this.hDKMBd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideSpotGridPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fetchVPNInfo = new GridReq((String) null, (String) null, (String) null, "1", (String) null, (String) null, "3", (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) (0 == true ? 1 : 0), (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "USDT", "true", (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -201326665, 15, (DefaultConstructorMarker) null);
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (TradeType) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        strategyBaseReq.setTdMode("cash");
        strategyBaseReq.setOrdType("grid");
        this.copydefault = strategyBaseReq;
        this.AYXKKw = "";
        this.djBIcL = new C56160xxa();
        this.ejfBZ = new TradeLiveData<>();
        this.fARcdN = new C56238xyz();
        this.fJNWhG = new TradeLiveData<>();
        this.gEmmrt = new C56111xwe<>();
        this.values = new C56111xwe<>();
        this.AhwBna = new C56111xwe<>();
        this.valueOf = new C56111xwe<>();
        this.getFieldNames = new C56198xyL();
        TradeLiveData<BotAggregatedInfoBean> tradeLiveData = new TradeLiveData<>();
        this.EZpvd = tradeLiveData;
        this.KWHzl = Transformations.map(tradeLiveData, new Function1() { // from class: o.wMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotGuideSpotGridPresenter.KWHzl((BotAggregatedInfoBean) obj);
            }
        });
        this.AkhnZx = new C56235xyw();
        this.iwGUEr = new TradeLiveData<>();
        this.DbNXlk = new C56192xyF();
        this.isConnected = new C56111xwe<>();
        this.AuCTel = new C56223xyk();
        this.fIwbmz = new TradeLiveData<>();
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.wMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotGuideSpotGridPresenter.QfsBiF();
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSpotGridPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final boolean QVAiDq() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null) {
            return interfaceC55881xsMCopydefault.EZpvd();
        }
        return false;
    }

    public final Pair<String, String> AubY() {
        return DTwDnp();
    }

    public static final List KWHzl(BotAggregatedInfoBean botAggregatedInfoBean) {
        C53868wtc c53868wtc = new C53868wtc();
        Intrinsics.copydefault(botAggregatedInfoBean);
        return c53868wtc.KWHzl(botAggregatedInfoBean);
    }

    private final List<TacticsVoucherType> RJOkX() {
        return (List) this.getNewProxyInstance.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List QfsBiF() {
        return TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_GRDE);
    }

    public final boolean AuCTelauCTel() {
        LossInsuranceBean voucherInformation;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        return ((value == null || (voucherInformation = value.getVoucherInformation()) == null) ? null : voucherInformation.getVoucherType()) == TacticsVoucherType.AIRDROP;
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public void OLrzqt(@NotNull String str, @NotNull C55887xsS c55887xsS, String str2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.fetchVPNInfo.setOrdType(str);
        this.fetchVPNInfo.setInstId(c55887xsS.gEmmrt());
        this.fetchVPNInfo.setInstType(c55887xsS.djBIcL());
        this.fetchVPNInfo.setBatchNo(bundle != null ? bundle.getString("batchNo") : null);
        ORxRYg();
        C55867xrz.KWHzl.EZpvd(this.fetchVPNInfo.getOrdType(), this.fetchVPNInfo.getInstId(), str2);
    }

    public static /* synthetic */ void refreshParams$default(BotGuideSpotGridPresenter botGuideSpotGridPresenter, BotAggregatedInfoBean botAggregatedInfoBean, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        botGuideSpotGridPresenter.OLrzqt(botAggregatedInfoBean, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        SmartEarnParam earnParams;
        SmartEarnParam earnParams2;
        SmartEarnParam earnParams3;
        SmartEarnParam earnParams4;
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        GridReq gridReq = this.fetchVPNInfo;
        StgyParam botParam = botAggregatedInfoBean.getBotParam();
        String minPx = botParam != null ? botParam.getMinPx() : null;
        if (minPx == null) {
            minPx = "";
        }
        gridReq.setMinPx(minPx);
        StgyParam botParam2 = botAggregatedInfoBean.getBotParam();
        String maxPx = botParam2 != null ? botParam2.getMaxPx() : null;
        if (maxPx == null) {
            maxPx = "";
        }
        gridReq.setMaxPx(maxPx);
        StgyParam botParam3 = botAggregatedInfoBean.getBotParam();
        String gridNum = botParam3 != null ? botParam3.getGridNum() : null;
        if (gridNum == null) {
            gridNum = "";
        }
        gridReq.setGridNum(gridNum);
        StgyParam botParam4 = botAggregatedInfoBean.getBotParam();
        String runType = botParam4 != null ? botParam4.getRunType() : null;
        gridReq.setRunType(runType != null ? runType : "");
        StgyParam botParam5 = botAggregatedInfoBean.getBotParam();
        gridReq.setAnnualizedRate(botParam5 != null ? botParam5.getPnlRatio() : null);
        StgyParam botParam6 = botAggregatedInfoBean.getBotParam();
        List<AdvancedTriggerSign> signParams = botParam6 != null ? botParam6.getSignParams() : null;
        if (signParams == null) {
            signParams = yDY.AhwBna();
        }
        gridReq.setSignParams(new ArrayList<>(signParams));
        StgyParam botParam7 = botAggregatedInfoBean.getBotParam();
        gridReq.setSlTriggerPx(botParam7 != null ? botParam7.getSlTriggerPx() : null);
        StgyParam botParam8 = botAggregatedInfoBean.getBotParam();
        gridReq.setTpTriggerPx(botParam8 != null ? botParam8.getTpTriggerPx() : null);
        StgyParam botParam9 = botAggregatedInfoBean.getBotParam();
        gridReq.setTpslTriggerParamReq(botParam9 != null ? botParam9.getTpslTriggerParam() : null);
        StgyParam botParam10 = botAggregatedInfoBean.getBotParam();
        boolean enabled = (botParam10 == null || (earnParams4 = botParam10.getEarnParams()) == null) ? false : earnParams4.getEnabled();
        StgyParam botParam11 = botAggregatedInfoBean.getBotParam();
        String earnMinLimit = (botParam11 == null || (earnParams3 = botParam11.getEarnParams()) == null) ? null : earnParams3.getEarnMinLimit();
        StgyParam botParam12 = botAggregatedInfoBean.getBotParam();
        String earnMaxLimit = (botParam12 == null || (earnParams2 = botParam12.getEarnParams()) == null) ? null : earnParams2.getEarnMaxLimit();
        StgyParam botParam13 = botAggregatedInfoBean.getBotParam();
        gridReq.setEarnParam(new SmartEarnRequestParam(enabled, earnMinLimit, earnMaxLimit, (botParam13 == null || (earnParams = botParam13.getEarnParams()) == null) ? null : earnParams.getEarnType(), (String) null, 16, (DefaultConstructorMarker) null));
        StgyParam botParam14 = botAggregatedInfoBean.getBotParam();
        gridReq.setQuoteSz(botParam14 != null ? botParam14.getQuoteSz() : null);
        if (str != null) {
            LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
            if (voucherInformation != null && voucherInformation.getVoucherVisible()) {
                List<TacticsVoucherType> listRJOkX = RJOkX();
                LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
                if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listRJOkX), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null)) {
                    AEQbTJ(botAggregatedInfoBean.getVoucherInformation(), str);
                }
            } else {
                gridReq.setVoucherId(null);
            }
        }
        if (QVAiDq()) {
            gridReq.setProfitSharingRatio("0");
        }
    }

    public final void ORxRYg() {
        String investSymbol = this.fetchVPNInfo.getInvestSymbol();
        GridReq gridReq = this.fetchVPNInfo;
        if (C56390yDp.copydefault(AubY()).contains(investSymbol)) {
            investSymbol = null;
        }
        gridReq.setSourceCcy(investSymbol);
        this.fetchVPNInfo.setSourceCcySz(null);
        this.fetchVPNInfo.setQuoteSz(null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((CharSequence) this.fetchVPNInfo.getSourceCcy())) {
            this.fetchVPNInfo.setSourceCcySz(str);
        } else {
            this.fetchVPNInfo.setQuoteSz(str);
        }
    }

    public final String getNewProxyInstance() {
        return C33129mqd.OLrzqt((CharSequence) this.fetchVPNInfo.getSourceCcy()) ? this.fetchVPNInfo.getSourceCcySz() : this.fetchVPNInfo.getQuoteSz();
    }

    public final boolean AwvSrB() {
        return !gHZMYf() && C33129mqd.OLrzqt((CharSequence) this.fetchVPNInfo.getSourceCcy());
    }

    public final boolean gHZMYf() {
        return Intrinsics.EZpvd((Object) AubY().getSecond(), (Object) "USDT") || Intrinsics.EZpvd((Object) AubY().getSecond(), (Object) "USDC");
    }

    private final Pair<String, String> DTwDnp() {
        o.ActionBar actionBarAEQbTJ = o.TaskDescription.AEQbTJ(this.fetchVPNInfo.getInstId());
        String strAEQbTJ = actionBarAEQbTJ.AEQbTJ();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String strCopydefault = actionBarAEQbTJ.copydefault();
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        String upperCase2 = strCopydefault.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return C56390yDp.OLrzqt(upperCase2, upperCase);
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public Pair<String, String> uzCIH() {
        String strCopydefault;
        if (gHZMYf()) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.isBrowsable, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, AubY().getFirst())));
        } else {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi211, C56424yEw.gEmmrt(C56390yDp.OLrzqt("ccy1", AubY().getFirst()), C56390yDp.OLrzqt("ccy2", AubY().getSecond())));
        }
        return C56390yDp.OLrzqt(strCopydefault, null);
    }

    public final void copydefault() {
        C56235xyw c56235xyw = this.AkhnZx;
        c56235xyw.KWHzl("grid");
        c56235xyw.AEQbTJ(this.fetchVPNInfo.getInstId());
        c56235xyw.djBIcL();
        c56235xyw.AuCTel();
        c56235xyw.OLrzqt(this.iwGUEr, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void zuBGHE() {
        C56198xyL c56198xyL = this.getFieldNames;
        c56198xyL.OLrzqt(this.fetchVPNInfo.getInstId());
        c56198xyL.EZpvd(TacticsType.TACTICS_GRDE.getConstant());
        c56198xyL.AEQbTJ(this.fetchVPNInfo.getBatchNo());
        c56198xyL.OLrzqt(this.EZpvd, new StateListAnimator());
        xKK.Activity.execute$default(c56198xyL, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends RecommendedParamsDto>, BotAggregatedInfoBean> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public BotAggregatedInfoBean KWHzl(List<RecommendedParamsDto> list) {
            BotAggregatedInfoBean botAggregatedInfoBean;
            RecommendParam recommendParam;
            TpSlTriggerParamReqResp tpslTriggerParam;
            StgyParam botParam;
            VoucherInfo voucherInfo;
            Intrinsics.checkNotNullParameter(list, "");
            RecommendedParamsDto recommendedParamsDto = (RecommendedParamsDto) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (recommendedParamsDto == null || (botAggregatedInfoBean = C55811xqw.OLrzqt(recommendedParamsDto, TacticsType.TACTICS_GRDE)) == null) {
                botAggregatedInfoBean = new BotAggregatedInfoBean(null, null, null, null, 15, null);
            }
            BotGuideSpotGridPresenter.this.KWHzl(botAggregatedInfoBean, (recommendedParamsDto == null || (voucherInfo = recommendedParamsDto.getVoucherInfo()) == null) ? null : voucherInfo.getVoucherId());
            if (recommendedParamsDto != null && (recommendParam = recommendedParamsDto.getRecommendParam()) != null && (tpslTriggerParam = recommendParam.getTpslTriggerParam()) != null && (botParam = botAggregatedInfoBean.getBotParam()) != null) {
                botParam.setTpslTriggerParam(tpslTriggerParam);
            }
            return botAggregatedInfoBean;
        }
    }

    public final void sSMYrx() {
        C56238xyz c56238xyz = this.fARcdN;
        c56238xyz.AEQbTJ(this.fetchVPNInfo.getInstId());
        c56238xyz.KWHzl(this.fetchVPNInfo.getGridNum());
        c56238xyz.AYXKKw(this.fetchVPNInfo.getMaxPx());
        c56238xyz.djBIcL(this.fetchVPNInfo.getMinPx());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.fetchVPNInfo.getRunType()));
        AdvancedTriggerSign advancedTriggerSignQKVWgx = QKVWgx();
        c56238xyz.isConnected(advancedTriggerSignQKVWgx != null ? advancedTriggerSignQKVWgx.getIndicator() : null);
        AdvancedTriggerSign advancedTriggerSignQKVWgx2 = QKVWgx();
        if (advancedTriggerSignQKVWgx2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignQKVWgx2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignQKVWgx2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.fJNWhG, new C54507xKz());
        c56238xyz.OLrzqt(200L);
    }

    private final AdvancedTriggerSign QKVWgx() {
        Object next;
        Iterator<T> it = this.fetchVPNInfo.getSignParams().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((AdvancedTriggerSign) next).getTriggerAction(), (Object) TtmlNode.START)) {
                break;
            }
        }
        return (AdvancedTriggerSign) next;
    }

    public final void QOLQEE() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String id = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(this.fetchVPNInfo.getInvestSymbol())) == null) ? null : tradeCoinInfoAhwBna.getId();
        C56160xxa c56160xxa = this.djBIcL;
        c56160xxa.AEQbTJ(C33129mqd.AhwBna(id));
        c56160xxa.KWHzl("1");
        c56160xxa.djBIcL();
        c56160xxa.OLrzqt(this.ejfBZ, new C53867wtb());
        xKK.Activity.execute$default(c56160xxa, 0L, 1, null);
    }

    public final String getFieldNames() {
        String value = this.ejfBZ.getValue();
        return value == null ? "0" : value;
    }

    public final void AxsJAY() {
        StgyParam botParam;
        C56223xyk c56223xyk = this.AuCTel;
        GridReq gridReq = this.fetchVPNInfo;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        gridReq.setTpslTriggerParamReq((value == null || (botParam = value.getBotParam()) == null) ? null : botParam.getTpslTriggerParam());
        c56223xyk.copydefault(this.fetchVPNInfo);
        c56223xyk.OLrzqt(this.fIwbmz, new C54507xKz());
        xKK.Activity.execute$default(c56223xyk, 0L, 1, null);
    }

    public final GuideHeaderCard copydefault(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        return new C53811wsY(this.fetchVPNInfo).KWHzl(botAggregatedInfoBean);
    }

    public static /* synthetic */ String minInvestError$default(BotGuideSpotGridPresenter botGuideSpotGridPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return botGuideSpotGridPresenter.copydefault(z);
    }

    public final String copydefault(boolean z) {
        String minQuoteSz;
        String newProxyInstance = getNewProxyInstance();
        if ((newProxyInstance == null || newProxyInstance.length() == 0) && !z) {
            return "";
        }
        MinInvestResp value = this.fJNWhG.getValue();
        if (value == null || (minQuoteSz = value.getMinQuoteSz()) == null) {
            minQuoteSz = "0";
        }
        return C33129mqd.valueOf(getNewProxyInstance(), minQuoteSz) ? C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMedia, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(minQuoteSz)), C56390yDp.OLrzqt("unit", this.fetchVPNInfo.getInvestSymbol()))) : "";
    }

    public final GuideLottieCard gEmmrt() {
        String strCopydefault;
        int iIsConnected = C33512mxp.AEQbTJ.isConnected();
        boolean zOLrzqt = C33492mxV.OLrzqt();
        String strAYXKKw = C33070mpX.AYXKKw((iIsConnected != 0 || zOLrzqt) ? (iIsConnected == 0 && zOLrzqt) ? C48033uCm.Fragment.OWSZPf : (iIsConnected == 0 || zOLrzqt) ? C48033uCm.Fragment.OeZisf : C48033uCm.Fragment.QYNZmZ : C48033uCm.Fragment.OUcgGI);
        if (gHZMYf()) {
            strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.toString);
        } else {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.onLoadChildren, C56424yEw.gEmmrt(C56390yDp.OLrzqt("ccy1", AubY().getFirst()), C56390yDp.OLrzqt("ccy2", AubY().getSecond())));
        }
        return new GuideLottieCard(C33070mpX.AYXKKw(C55688xof.Application.getFlags), strCopydefault, null, strAYXKKw, 4, null);
    }

    public final String AYXKKw() {
        StgyParam botParam;
        StgyParam botParam2;
        if (!Intrinsics.EZpvd((Object) this.fetchVPNInfo.getInvestSymbol(), (Object) "USDT") && !Intrinsics.EZpvd((Object) this.fetchVPNInfo.getInvestSymbol(), (Object) "USDC")) {
            return "";
        }
        String fieldNames = getFieldNames();
        if (fieldNames.length() != 0) {
            BotAggregatedInfoBean value = this.EZpvd.getValue();
            String quoteSz = (value == null || (botParam2 = value.getBotParam()) == null) ? null : botParam2.getQuoteSz();
            if (quoteSz != null && quoteSz.length() != 0) {
                Float[] fArr = new Float[3];
                BotAggregatedInfoBean value2 = this.EZpvd.getValue();
                fArr[0] = Float.valueOf(C33129mqd.djBIcL((value2 == null || (botParam = value2.getBotParam()) == null) ? null : botParam.getQuoteSz()));
                MinInvestResp value3 = this.fJNWhG.getValue();
                fArr[1] = Float.valueOf(C33129mqd.djBIcL(C33129mqd.addS$default(value3 != null ? value3.getMinQuoteSz() : null, 1, null, null, null, 14, null)));
                fArr[2] = Float.valueOf(C33129mqd.djBIcL(C33129mqd.mulS$default(fieldNames, Double.valueOf(OcIXYQ()), null, null, null, 14, null)));
                float fFZBcTu = CollectionsKt___CollectionsKt.fZBcTu(yDY.gEmmrt(fArr));
                MinInvestResp value4 = this.fJNWhG.getValue();
                float fCopydefault = C56548yJl.copydefault(fFZBcTu, C33129mqd.djBIcL(C33129mqd.addS$default(value4 != null ? value4.getMinQuoteSz() : null, 1, null, null, null, 14, null)));
                return C33129mqd.AEQbTJ(Float.valueOf(fCopydefault), fieldNames) ? "" : xMR.copydefault.AhwBna(C33129mqd.gEmmrt(Float.valueOf(fCopydefault)), 0);
            }
        }
        return "";
    }

    private final double OcIXYQ() {
        String fieldNames = getFieldNames();
        if (C33129mqd.valueOf(fieldNames, 500)) {
            return 0.2d;
        }
        return (C33129mqd.AEQbTJ(fieldNames, 500) && C33129mqd.valueOf(fieldNames, 1000)) ? 0.1d : 0.05d;
    }

    public final String DbNXlk() {
        if (!Intrinsics.EZpvd((Object) this.fetchVPNInfo.getInvestSymbol(), (Object) "USDT") && !Intrinsics.EZpvd((Object) this.fetchVPNInfo.getInvestSymbol(), (Object) "USDC")) {
            return "";
        }
        String newProxyInstance = getNewProxyInstance();
        return C33129mqd.gEmmrt(newProxyInstance, this.AYXKKw) ? "reduce" : C33129mqd.AEQbTJ(newProxyInstance, this.AYXKKw) ? "increase" : "default";
    }

    public final int hDKMBd() {
        String instFamily;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        IdxConfig idxConfigAkhnZx;
        if (AwvSrB()) {
            instFamily = "BTC-USDT";
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.fetchVPNInfo.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.fetchVPNInfo.getInstId())) == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String quoteDig = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault.OLrzqt(this.fetchVPNInfo.getInstType())) == null || (idxConfigAkhnZx = abstractC54531xLwOLrzqt2.AkhnZx(instFamily)) == null) ? null : idxConfigAkhnZx.getQuoteDig();
        if (quoteDig == null || StringsKt__StringsKt.fARcdN((CharSequence) quoteDig)) {
            return 8;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    public final void EZpvd(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation != null) {
            C56192xyF c56192xyF = this.DbNXlk;
            String batchNo = this.fetchVPNInfo.getBatchNo();
            c56192xyF.KWHzl(batchNo != null ? batchNo : "");
            c56192xyF.OLrzqt(this.isConnected, new ActionBar(voucherInformation));
            xKK.Activity.execute$default(c56192xyF, 0L, 1, null);
        }
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends LockVoucherResponse>, LossInsuranceDisplayData> {
        public final /* synthetic */ LossInsuranceBean OLrzqt;

        public ActionBar(LossInsuranceBean lossInsuranceBean) {
            this.OLrzqt = lossInsuranceBean;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ LossInsuranceDisplayData KWHzl(List<? extends LockVoucherResponse> list) {
            return KWHzl2((List<LockVoucherResponse>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public LossInsuranceDisplayData KWHzl2(List<LockVoucherResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            LockVoucherResponse lockVoucherResponse = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String voucherId = lockVoucherResponse != null ? lockVoucherResponse.getVoucherId() : null;
            if (voucherId == null) {
                voucherId = "";
            }
            LockVoucherResponse lockVoucherResponse2 = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String expireTime = lockVoucherResponse2 != null ? lockVoucherResponse2.getExpireTime() : null;
            String str = expireTime == null ? "" : expireTime;
            BotGuideSpotGridPresenter.this.AEQbTJ(this.OLrzqt, voucherId);
            BotGuideSpotGridPresenter.this.OLrzqt(str);
            String voucherValue = this.OLrzqt.getVoucherValue();
            String str2 = voucherValue == null ? "" : voucherValue;
            String voucherStatus = this.OLrzqt.getVoucherStatus();
            String str3 = voucherStatus == null ? "" : voucherStatus;
            Boolean bool = Boolean.TRUE;
            String ordType = BotGuideSpotGridPresenter.this.AhwBna().getOrdType();
            ArrayList arrayListCopydefault = yDY.copydefault(BotGuideSpotGridPresenter.this.AhwBna().getInstId());
            String voucherCcy = this.OLrzqt.getVoucherCcy();
            return new LossInsuranceDisplayData(str2, str3, bool, ordType, arrayListCopydefault, false, null, str, "", voucherCcy == null ? "" : voucherCcy, voucherId, false, this.OLrzqt.getVoucherType(), 2080, null);
        }
    }

    public final void AEQbTJ(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.isConnected;
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        String voucherValue = voucherInformation != null ? voucherInformation.getVoucherValue() : null;
        String str = voucherValue == null ? "" : voucherValue;
        LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
        String voucherStatus = voucherInformation2 != null ? voucherInformation2.getVoucherStatus() : null;
        String str2 = voucherStatus == null ? "" : voucherStatus;
        String ordType = this.fetchVPNInfo.getOrdType();
        ArrayList arrayListCopydefault = yDY.copydefault(this.fetchVPNInfo.getInstId());
        LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
        String voucherCcy = voucherInformation3 != null ? voucherInformation3.getVoucherCcy() : null;
        String str3 = voucherCcy == null ? "" : voucherCcy;
        LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
        c56111xwe.postValue(new LossInsuranceDisplayData(str, str2, null, ordType, arrayListCopydefault, false, null, null, null, str3, null, false, voucherInformation4 != null ? voucherInformation4.getVoucherType() : null, 3108, null));
    }

    public final void EZpvd() {
        LossInsuranceDisplayData value = this.isConnected.getValue();
        if (value == null || !Intrinsics.EZpvd((Object) value.getStatus(), (Object) VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode())) {
            return;
        }
        GridReq gridReq = this.fetchVPNInfo;
        gridReq.setVoucherId(null);
        gridReq.setBatchNo(null);
    }

    public final void OLrzqt(boolean z) {
        IBotGuidePresenter.ButtonState buttonState;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        C56111xwe<IBotGuidePresenter.ButtonState> c56111xweFARcdN = fARcdN();
        LossInsuranceBean voucherInformation = value.getVoucherInformation();
        TacticsVoucherType voucherType = voucherInformation != null ? voucherInformation.getVoucherType() : null;
        if (voucherType != null && Application.EZpvd[voucherType.ordinal()] == 1) {
            LossInsuranceBean voucherInformation2 = value.getVoucherInformation();
            if (voucherInformation2 != null && !voucherInformation2.getVoucherVisible()) {
                buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Disabled;
            } else {
                LossInsuranceDisplayData value2 = this.isConnected.getValue();
                if (Intrinsics.EZpvd((Object) (value2 != null ? value2.getStatus() : null), (Object) VoucherStatus.AirdropVoucherStatus.EXPIRED.getCode())) {
                    buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Disabled;
                } else {
                    buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Enabled;
                }
            }
        } else if (z) {
            buttonState = IBotGuidePresenter.ButtonState.Generic.Enabled;
        } else {
            buttonState = IBotGuidePresenter.ButtonState.Generic.Disabled;
        }
        c56111xweFARcdN.setValue(buttonState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(String str) {
        LossInsuranceBean voucherInformation;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        if (value == null || (voucherInformation = value.getVoucherInformation()) == null) {
            return;
        }
        this.EZpvd.setValue(BotAggregatedInfoBean.copy$default(value, null, null, voucherInformation.copy((1047550 & 1) != 0 ? voucherInformation.voucherVisible : true, (1047550 & 2) != 0 ? voucherInformation.voucherStatus : null, (1047550 & 4) != 0 ? voucherInformation.voucherBatch : null, (1047550 & 8) != 0 ? voucherInformation.voucherValue : null, (1047550 & 16) != 0 ? voucherInformation.voucherCcy : null, (1047550 & 32) != 0 ? voucherInformation.appliedVoucherCount : null, (1047550 & 64) != 0 ? voucherInformation.totalVoucherCount : null, (1047550 & 128) != 0 ? voucherInformation.pTime : null, (1047550 & 256) != 0 ? voucherInformation.endTime : null, (1047550 & 512) != 0 ? voucherInformation.voucherIssueTime : null, (1047550 & 1024) != 0 ? voucherInformation.voucherExpireTime : str, (1047550 & 2048) != 0 ? voucherInformation.deeplink : null, (1047550 & 4096) != 0 ? voucherInformation.realTimestamp : 0L, (1047550 & 8192) != 0 ? voucherInformation.instIds : null, (1047550 & 16384) != 0 ? voucherInformation.algoOrdTypes : null, (1047550 & 32768) != 0 ? voucherInformation.claimed : false, (1047550 & 65536) != 0 ? voucherInformation.voucherType : null, (1047550 & 131072) != 0 ? voucherInformation.arbitrageTotalPnlInfo : null, (1047550 & 262144) != 0 ? voucherInformation.leveragePrincipal : null, (1047550 & 524288) != 0 ? voucherInformation.totalInterestAmt : null), null, 11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        LossInsuranceDisplayData lossInsuranceDisplayData;
        LossInsuranceBean voucherInformation;
        Activity taskDescription;
        List<TacticsVoucherType> listRJOkX = RJOkX();
        LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
        boolean zKWHzl = CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listRJOkX), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null);
        LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation3 != null && !voucherInformation3.getVoucherVisible() && ((str == null || str.length() == 0) && C33129mqd.OLrzqt((CharSequence) this.fetchVPNInfo.getBatchNo()) && (voucherInformation = botAggregatedInfoBean.getVoucherInformation()) != null && !voucherInformation.getClaimed() && zKWHzl)) {
            LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
            if ((voucherInformation4 != null ? voucherInformation4.getVoucherType() : null) == TacticsVoucherType.AIRDROP) {
                taskDescription = new Activity.ActionBar(botAggregatedInfoBean);
            } else {
                taskDescription = new Activity.TaskDescription(botAggregatedInfoBean);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotGuideSpotGridPresenter$handleAggregatedInfo$1$1(this, taskDescription, null), 3, null);
        }
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.isConnected;
        if (zKWHzl) {
            LossInsuranceBean voucherInformation5 = botAggregatedInfoBean.getVoucherInformation();
            String voucherValue = voucherInformation5 != null ? voucherInformation5.getVoucherValue() : null;
            String str2 = voucherValue == null ? "" : voucherValue;
            LossInsuranceBean voucherInformation6 = botAggregatedInfoBean.getVoucherInformation();
            String voucherStatus = voucherInformation6 != null ? voucherInformation6.getVoucherStatus() : null;
            String str3 = voucherStatus == null ? "" : voucherStatus;
            LossInsuranceBean voucherInformation7 = botAggregatedInfoBean.getVoucherInformation();
            boolean voucherVisible = voucherInformation7 != null ? voucherInformation7.getVoucherVisible() : false;
            String ordType = this.fetchVPNInfo.getOrdType();
            ArrayList arrayListCopydefault = yDY.copydefault(this.fetchVPNInfo.getInstId());
            LossInsuranceBean voucherInformation8 = botAggregatedInfoBean.getVoucherInformation();
            Long lValueOf = voucherInformation8 != null ? Long.valueOf(voucherInformation8.getRealTimestamp()) : null;
            LossInsuranceBean voucherInformation9 = botAggregatedInfoBean.getVoucherInformation();
            String voucherExpireTime = voucherInformation9 != null ? voucherInformation9.getVoucherExpireTime() : null;
            String str4 = voucherExpireTime == null ? "" : voucherExpireTime;
            LossInsuranceBean voucherInformation10 = botAggregatedInfoBean.getVoucherInformation();
            String pTime = voucherInformation10 != null ? voucherInformation10.getPTime() : null;
            String str5 = pTime == null ? "" : pTime;
            LossInsuranceBean voucherInformation11 = botAggregatedInfoBean.getVoucherInformation();
            String voucherCcy = voucherInformation11 != null ? voucherInformation11.getVoucherCcy() : null;
            String str6 = voucherCcy == null ? "" : voucherCcy;
            String str7 = str == null ? "" : str;
            LossInsuranceBean voucherInformation12 = botAggregatedInfoBean.getVoucherInformation();
            lossInsuranceDisplayData = new LossInsuranceDisplayData(str2, str3, Boolean.valueOf(voucherVisible), ordType, arrayListCopydefault, false, lValueOf, str4, str5, str6, str7, false, voucherInformation12 != null ? voucherInformation12.getVoucherType() : null, 2080, null);
        } else {
            lossInsuranceDisplayData = new LossInsuranceDisplayData(null, null, null, this.fetchVPNInfo.getOrdType(), null, false, null, null, null, null, null, false, null, 8183, null);
        }
        c56111xwe.setValue(lossInsuranceDisplayData);
        OLrzqt(botAggregatedInfoBean, str);
        gEmmrt(botAggregatedInfoBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gEmmrt(BotAggregatedInfoBean botAggregatedInfoBean) {
        String strValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        String tradeSymbol;
        C56111xwe<List<BotGuideCoinItem>> c56111xweEjfBZ = ejfBZ();
        List<String> eligibleInstIds = botAggregatedInfoBean.getEligibleInstIds();
        ArrayList arrayList = null;
        if (eligibleInstIds != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(eligibleInstIds, 10));
            for (String str : eligibleInstIds) {
                String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, this.fetchVPNInfo.getInstType(), false, false, 8, null);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.fetchVPNInfo.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str)) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
                    strValueOf = "";
                } else {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                    strValueOf = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(tradeSymbol) : null;
                    if (strValueOf != null) {
                    }
                }
                arrayList2.add(new BotGuideCoinItem(titleByIdAndType$default, str, strValueOf));
            }
            arrayList = arrayList2;
        }
        c56111xweEjfBZ.setValue(arrayList);
    }

    public final void AEQbTJ(LossInsuranceBean lossInsuranceBean, String str) {
        this.fetchVPNInfo.setVoucherId(str);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.getFieldNames);
        arrayList.add(this.djBIcL);
        arrayList.add(this.AuCTel);
        arrayList.add(this.DbNXlk);
        arrayList.add(this.fARcdN);
        arrayList.add(this.AkhnZx);
        return arrayList;
    }

    public interface Activity {

        public static final class TaskDescription implements Activity {
            public static final int EZpvd = BotAggregatedInfoBean.$stable;
            public final BotAggregatedInfoBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, BotAggregatedInfoBean botAggregatedInfoBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    botAggregatedInfoBean = taskDescription.OLrzqt;
                }
                return taskDescription.OLrzqt(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BotAggregatedInfoBean KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                return new TaskDescription(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayClaimVoucherConfirmation(bean=" + this.OLrzqt + ")";
            }

            public TaskDescription(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                this.OLrzqt = botAggregatedInfoBean;
            }
        }

        public static final class ActionBar implements Activity {
            public static final int AEQbTJ = BotAggregatedInfoBean.$stable;
            public final BotAggregatedInfoBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, BotAggregatedInfoBean botAggregatedInfoBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    botAggregatedInfoBean = actionBar.OLrzqt;
                }
                return actionBar.KWHzl(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BotAggregatedInfoBean AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                return new ActionBar(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayAirdropClaimVoucherConfirmation(bean=" + this.OLrzqt + ")";
            }

            public ActionBar(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                this.OLrzqt = botAggregatedInfoBean;
            }
        }
    }
}

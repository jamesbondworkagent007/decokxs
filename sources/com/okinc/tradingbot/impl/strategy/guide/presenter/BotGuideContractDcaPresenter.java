package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideLottieCard;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractDcaPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.VoucherInfo;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC54531xLw;
import o.ActionBar;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C48033uCm;
import o.C53805wsS;
import o.C53808wsV;
import o.C53867wtb;
import o.C54251xBm;
import o.C54507xKz;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C55811xqw;
import o.C55886xsR;
import o.C55887xsS;
import o.C56045xvR;
import o.C56111xwe;
import o.C56138xxE;
import o.C56160xxa;
import o.C56192xyF;
import o.C56198xyL;
import o.C56208xyV;
import o.C56235xyw;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.xBG;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideContractDcaPresenter extends ContractDcaBasePresenter implements IBotGuidePresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final MutableSharedFlow<StateListAnimator> AYXKKw;
    public final TradeLiveData<BotAggregatedInfoBean> AkhnZx;
    public DcaOrderReq AuCTel;
    public final InterfaceC56387yDm AubY;
    public final LiveData<List<Object>> DbNXlk;
    public final C56111xwe<Pair<Boolean, Exception>> ejfBZ;
    public boolean fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final C56111xwe<Unit> fJNWhG;
    public final C56111xwe<List<BotGuideCoinItem>> fetchVPNInfo;
    public final C56192xyF getFieldNames;
    public final TradeLiveData<String> getNewProxyInstance;
    public final C56138xxE hDKMBd;
    public final C54251xBm isConnected;
    public final C56111xwe<LossInsuranceDisplayData> iwGUEr;
    public final C56198xyL uzCIH;
    public final C56111xwe<IBotGuidePresenter.ButtonState> values;
    public final SharedFlow<StateListAnimator> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAggregatedInfoBean> AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54251xBm AuCTel() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56138xxE AubY() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter.DbNXlk()Ljava/lang/String; */
    public final LiveData<List<Object>> DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl(boolean z) {
        return z ? C55688xof.Application.OJuSTm : C55688xof.Application.gGNlxh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<List<BotGuideCoinItem>> ejfBZ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<IBotGuidePresenter.ButtonState> fARcdN() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaOrderReq fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Unit> fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56192xyF getNewProxyInstance() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<LossInsuranceDisplayData> hDKMBd() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Pair<Boolean, Exception>> iwGUEr() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StateListAnimator> wlaJM() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> zLjUOn() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56198xyL zsXlph() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return this.fARcdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideContractDcaPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AuCTel = new DcaOrderReq((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
        this.values = new C56111xwe<>();
        this.ejfBZ = new C56111xwe<>();
        this.fetchVPNInfo = new C56111xwe<>();
        this.fJNWhG = new C56111xwe<>();
        this.uzCIH = new C56198xyL();
        TradeLiveData<BotAggregatedInfoBean> tradeLiveData = new TradeLiveData<>();
        this.AkhnZx = tradeLiveData;
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.wLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotGuideContractDcaPresenter.AxsJAY();
            }
        });
        this.DbNXlk = Transformations.map(tradeLiveData, new Function1() { // from class: o.wLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotGuideContractDcaPresenter.EZpvd((BotAggregatedInfoBean) obj);
            }
        });
        this.getFieldNames = new C56192xyF();
        this.iwGUEr = new C56111xwe<>();
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.wLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotGuideContractDcaPresenter.DTwDnp();
            }
        });
        this.isConnected = new C54251xBm();
        this.getNewProxyInstance = new TradeLiveData<>();
        this.hDKMBd = new C56138xxE();
        MutableSharedFlow<StateListAnimator> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    private final boolean OcIXYQ() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        return interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C56208xyV AxsJAY() {
        return new C56208xyV();
    }

    private final C56208xyV ORxRYg() {
        return (C56208xyV) this.fIwbmz.getValue();
    }

    public static final List EZpvd(BotAggregatedInfoBean botAggregatedInfoBean) {
        return new C53805wsS().KWHzl(botAggregatedInfoBean.getBotParam());
    }

    private final List<TacticsVoucherType> QKVWgx() {
        return (List) this.AubY.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List DTwDnp() {
        return TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_CONTRACT_DCA);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractDcaPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public void OLrzqt(@NotNull String str, @NotNull C55887xsS c55887xsS, String str2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        String string = bundle != null ? bundle.getString("investType") : null;
        this.fARcdN = Intrinsics.EZpvd((Object) string, (Object) "4");
        this.AuCTel.setInstId(c55887xsS.gEmmrt());
        this.AuCTel.setInstType(c55887xsS.djBIcL());
        this.AuCTel.setInvestType(string);
        this.AuCTel.setOrdType(str);
        this.AuCTel.setAutoTransfer("true");
        this.AuCTel.setUserRiskMode(bundle != null ? bundle.getString("userRiskMode") : null);
        this.AuCTel.setDirection(bundle != null ? bundle.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null);
        this.AuCTel.setBatchNo(bundle != null ? bundle.getString("batchNo") : null);
        OLrzqt(c55887xsS);
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public Pair<String, String> uzCIH() {
        return C56390yDp.OLrzqt(C33069mpW.copydefault(C48033uCm.Fragment.hvKCwS, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", QOLQEE().getFirst()))), null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel.setLever(str);
    }

    public final GuideHeaderCard KWHzl(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        return new C53808wsV(this.AuCTel).KWHzl(botAggregatedInfoBean);
    }

    public final GuideLottieCard getFieldNames() {
        int iIsConnected = C33512mxp.AEQbTJ.isConnected();
        boolean zOLrzqt = C33492mxV.OLrzqt();
        return new GuideLottieCard(C33070mpX.AYXKKw(C48033uCm.Fragment.sVXHln), C33070mpX.AYXKKw(C48033uCm.Fragment.iPSTqm), null, C33070mpX.AYXKKw((iIsConnected != 0 || zOLrzqt) ? (iIsConnected == 0 && zOLrzqt) ? C48033uCm.Fragment.FF : (iIsConnected == 0 || zOLrzqt) ? C48033uCm.Fragment.dGrqPl : C48033uCm.Fragment.gZKUVK : C48033uCm.Fragment.uLLnq), 4, null);
    }

    public final void AwvSrB() {
        C56208xyV c56208xyVORxRYg = ORxRYg();
        c56208xyVORxRYg.KWHzl(new Function1() { // from class: o.wLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotGuideContractDcaPresenter.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56208xyVORxRYg, 0L, 1, null);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends RecommendedParamsDto>, BotAggregatedInfoBean> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ BotAggregatedInfoBean KWHzl(List<? extends RecommendedParamsDto> list) {
            return KWHzl2((List<RecommendedParamsDto>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public BotAggregatedInfoBean KWHzl2(List<RecommendedParamsDto> list) {
            BotAggregatedInfoBean botAggregatedInfoBean;
            VoucherInfo voucherInfo;
            Intrinsics.checkNotNullParameter(list, "");
            RecommendedParamsDto recommendedParamsDto = (RecommendedParamsDto) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (recommendedParamsDto == null || (botAggregatedInfoBean = C55811xqw.OLrzqt(recommendedParamsDto, TacticsType.TACTICS_CONTRACT_DCA)) == null) {
                botAggregatedInfoBean = new BotAggregatedInfoBean(null, null, null, null, 15, null);
            }
            BotGuideContractDcaPresenter.this.KWHzl(botAggregatedInfoBean, (recommendedParamsDto == null || (voucherInfo = recommendedParamsDto.getVoucherInfo()) == null) ? null : voucherInfo.getVoucherId());
            return botAggregatedInfoBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        LossInsuranceDisplayData lossInsuranceDisplayData;
        LossInsuranceBean voucherInformation;
        LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation2 != null && !voucherInformation2.getVoucherVisible() && ((str == null || str.length() == 0) && C33129mqd.OLrzqt((CharSequence) this.AuCTel.getBatchNo()) && (voucherInformation = botAggregatedInfoBean.getVoucherInformation()) != null && !voucherInformation.getClaimed())) {
            List<TacticsVoucherType> listQKVWgx = QKVWgx();
            LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listQKVWgx), voucherInformation3 != null ? voucherInformation3.getVoucherType() : null)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotGuideContractDcaPresenter$handleAggregatedInfo$1$1(this, botAggregatedInfoBean, null), 3, null);
            }
        }
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.iwGUEr;
        List<TacticsVoucherType> listQKVWgx2 = QKVWgx();
        LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
        if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listQKVWgx2), voucherInformation4 != null ? voucherInformation4.getVoucherType() : null)) {
            LossInsuranceBean voucherInformation5 = botAggregatedInfoBean.getVoucherInformation();
            String voucherValue = voucherInformation5 != null ? voucherInformation5.getVoucherValue() : null;
            String str2 = voucherValue == null ? "" : voucherValue;
            LossInsuranceBean voucherInformation6 = botAggregatedInfoBean.getVoucherInformation();
            String voucherStatus = voucherInformation6 != null ? voucherInformation6.getVoucherStatus() : null;
            String str3 = voucherStatus == null ? "" : voucherStatus;
            LossInsuranceBean voucherInformation7 = botAggregatedInfoBean.getVoucherInformation();
            boolean voucherVisible = voucherInformation7 != null ? voucherInformation7.getVoucherVisible() : false;
            String ordType = this.AuCTel.getOrdType();
            String[] strArr = new String[1];
            String instId = this.AuCTel.getInstId();
            if (instId == null) {
                instId = "";
            }
            strArr[0] = instId;
            ArrayList arrayListCopydefault = yDY.copydefault(strArr);
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
            lossInsuranceDisplayData = new LossInsuranceDisplayData(null, null, null, this.AuCTel.getOrdType(), null, false, null, null, null, null, null, false, null, 8183, null);
        }
        c56111xwe.setValue(lossInsuranceDisplayData);
        EZpvd(botAggregatedInfoBean, str);
        djBIcL(botAggregatedInfoBean);
    }

    public final void AEQbTJ(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation != null) {
            C56192xyF c56192xyF = this.getFieldNames;
            String batchNo = this.AuCTel.getBatchNo();
            c56192xyF.KWHzl(batchNo != null ? batchNo : "");
            c56192xyF.OLrzqt(this.iwGUEr, new Activity(voucherInformation));
            xKK.Activity.execute$default(c56192xyF, 0L, 1, null);
        }
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends LockVoucherResponse>, LossInsuranceDisplayData> {
        public final /* synthetic */ LossInsuranceBean OLrzqt;

        public Activity(LossInsuranceBean lossInsuranceBean) {
            this.OLrzqt = lossInsuranceBean;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public LossInsuranceDisplayData KWHzl(List<LockVoucherResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            LockVoucherResponse lockVoucherResponse = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String voucherId = lockVoucherResponse != null ? lockVoucherResponse.getVoucherId() : null;
            if (voucherId == null) {
                voucherId = "";
            }
            LockVoucherResponse lockVoucherResponse2 = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String expireTime = lockVoucherResponse2 != null ? lockVoucherResponse2.getExpireTime() : null;
            String str = expireTime == null ? "" : expireTime;
            BotGuideContractDcaPresenter.this.fIwbmz().setVoucherId(voucherId);
            BotGuideContractDcaPresenter.this.OLrzqt(str);
            String voucherValue = this.OLrzqt.getVoucherValue();
            String str2 = voucherValue == null ? "" : voucherValue;
            String voucherStatus = this.OLrzqt.getVoucherStatus();
            String str3 = voucherStatus == null ? "" : voucherStatus;
            Boolean bool = Boolean.TRUE;
            String ordType = BotGuideContractDcaPresenter.this.fIwbmz().getOrdType();
            String[] strArr = new String[1];
            String instId = BotGuideContractDcaPresenter.this.fIwbmz().getInstId();
            if (instId == null) {
                instId = "";
            }
            strArr[0] = instId;
            ArrayList arrayListCopydefault = yDY.copydefault(strArr);
            String voucherCcy = this.OLrzqt.getVoucherCcy();
            return new LossInsuranceDisplayData(str2, str3, bool, ordType, arrayListCopydefault, false, null, str, "", voucherCcy == null ? "" : voucherCcy, voucherId, false, this.OLrzqt.getVoucherType(), 2080, null);
        }
    }

    public final void OLrzqt(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.iwGUEr;
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        String voucherValue = voucherInformation != null ? voucherInformation.getVoucherValue() : null;
        String str = voucherValue == null ? "" : voucherValue;
        LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
        String voucherStatus = voucherInformation2 != null ? voucherInformation2.getVoucherStatus() : null;
        String str2 = voucherStatus == null ? "" : voucherStatus;
        String ordType = this.AuCTel.getOrdType();
        String[] strArr = new String[1];
        String instId = this.AuCTel.getInstId();
        if (instId == null) {
            instId = "";
        }
        strArr[0] = instId;
        ArrayList arrayListCopydefault = yDY.copydefault(strArr);
        LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
        String voucherCcy = voucherInformation3 != null ? voucherInformation3.getVoucherCcy() : null;
        String str3 = voucherCcy == null ? "" : voucherCcy;
        LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
        c56111xwe.postValue(new LossInsuranceDisplayData(str, str2, null, ordType, arrayListCopydefault, false, null, null, null, str3, null, false, voucherInformation4 != null ? voucherInformation4.getVoucherType() : null, 3108, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(String str) {
        LossInsuranceBean voucherInformation;
        BotAggregatedInfoBean value = this.AkhnZx.getValue();
        if (value == null || (voucherInformation = value.getVoucherInformation()) == null) {
            return;
        }
        this.AkhnZx.setValue(BotAggregatedInfoBean.copy$default(value, null, null, voucherInformation.copy((1047550 & 1) != 0 ? voucherInformation.voucherVisible : true, (1047550 & 2) != 0 ? voucherInformation.voucherStatus : null, (1047550 & 4) != 0 ? voucherInformation.voucherBatch : null, (1047550 & 8) != 0 ? voucherInformation.voucherValue : null, (1047550 & 16) != 0 ? voucherInformation.voucherCcy : null, (1047550 & 32) != 0 ? voucherInformation.appliedVoucherCount : null, (1047550 & 64) != 0 ? voucherInformation.totalVoucherCount : null, (1047550 & 128) != 0 ? voucherInformation.pTime : null, (1047550 & 256) != 0 ? voucherInformation.endTime : null, (1047550 & 512) != 0 ? voucherInformation.voucherIssueTime : null, (1047550 & 1024) != 0 ? voucherInformation.voucherExpireTime : str, (1047550 & 2048) != 0 ? voucherInformation.deeplink : null, (1047550 & 4096) != 0 ? voucherInformation.realTimestamp : 0L, (1047550 & 8192) != 0 ? voucherInformation.instIds : null, (1047550 & 16384) != 0 ? voucherInformation.algoOrdTypes : null, (1047550 & 32768) != 0 ? voucherInformation.claimed : false, (1047550 & 65536) != 0 ? voucherInformation.voucherType : null, (1047550 & 131072) != 0 ? voucherInformation.arbitrageTotalPnlInfo : null, (1047550 & 262144) != 0 ? voucherInformation.leveragePrincipal : null, (1047550 & 524288) != 0 ? voucherInformation.totalInterestAmt : null), null, 11, null));
    }

    private final void djBIcL(BotAggregatedInfoBean botAggregatedInfoBean) {
        BizInstrument bizInstrumentValueOf;
        String tradeSymbol;
        C56111xwe<List<BotGuideCoinItem>> c56111xweEjfBZ = ejfBZ();
        List<String> eligibleInstIds = botAggregatedInfoBean.getEligibleInstIds();
        ArrayList arrayList = null;
        if (eligibleInstIds != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(eligibleInstIds, 10));
            for (String str : eligibleInstIds) {
                String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, this.AuCTel.getInstType(), false, false, 8, null);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                String str2 = "";
                if (interfaceC54581xNrOLrzqt != null) {
                    String instType = this.AuCTel.getInstType();
                    if (instType == null) {
                        instType = "";
                    }
                    AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                    if (abstractC54531xLwOLrzqt != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str)) != null && (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) != null) {
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                        String strValueOf = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(tradeSymbol) : null;
                        if (strValueOf != null) {
                            str2 = strValueOf;
                        }
                    }
                }
                arrayList2.add(new BotGuideCoinItem(titleByIdAndType$default, str, str2));
            }
            arrayList = arrayList2;
        }
        c56111xweEjfBZ.setValue(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        StgyParam botParam = botAggregatedInfoBean.getBotParam();
        DcaOrderReq dcaOrderReq = this.AuCTel;
        dcaOrderReq.setReserveFunds(Boolean.TRUE);
        dcaOrderReq.setMaxSafetyOrds(botParam != null ? botParam.getMaxSafetyOrds() : null);
        dcaOrderReq.setPxSteps(botParam != null ? botParam.getPxSteps() : null);
        dcaOrderReq.setPxStepsMult(botParam != null ? botParam.getPxStepsMult() : null);
        dcaOrderReq.setVolMult(botParam != null ? botParam.getVolMult() : null);
        dcaOrderReq.setTpPct(botParam != null ? botParam.getTpPct() : null);
        dcaOrderReq.setSlPct(botParam != null ? botParam.getSlPct() : null);
        dcaOrderReq.setDirection(botParam != null ? botParam.getDirection() : null);
        dcaOrderReq.setLever(botParam != null ? botParam.getLever() : null);
        dcaOrderReq.setSlMode(botParam != null ? botParam.getSlMode() : null);
        dcaOrderReq.setTriggerParams(botParam != null ? botParam.getTriggerParams() : null);
        dcaOrderReq.setUserRiskMode(botParam != null ? botParam.getUserRiskMode() : null);
        dcaOrderReq.setInitOrdPct(botParam != null ? botParam.getInitOrdPct() : null);
        dcaOrderReq.setAnnualizedRate(botParam != null ? botParam.getPnlRatio() : null);
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation != null && voucherInformation.getVoucherVisible()) {
            List<TacticsVoucherType> listQKVWgx = QKVWgx();
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listQKVWgx), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null)) {
                dcaOrderReq.setVoucherId(str);
            }
        } else {
            dcaOrderReq.setVoucherId(null);
        }
        if (OcIXYQ()) {
            dcaOrderReq.setTrackingMode(DcaLeadShareMode.SYNC.getMode());
            dcaOrderReq.setProfitSharingRatio("0");
        }
    }

    public final void gHZMYf() {
        C56138xxE c56138xxE = this.hDKMBd;
        DcaOrderReq dcaOrderReq = this.AuCTel;
        String strMulS$default = C33129mqd.mulS$default(dcaOrderReq.getInvestmentAmt(), dcaOrderReq.getInitOrdPct(), null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.DOWN;
        dcaOrderReq.setInitOrdAmt(C33129mqd.formatS$default(strMulS$default, 8, null, roundingMode, 2, null));
        dcaOrderReq.setSafetyOrdAmt(C33129mqd.formatS$default(C56045xvR.KWHzl.copydefault(dcaOrderReq.getInvestmentAmt(), dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult(), dcaOrderReq.getInitOrdPct()), 8, null, roundingMode, 2, null));
        c56138xxE.copydefault(dcaOrderReq);
        c56138xxE.djBIcL();
        c56138xxE.OLrzqt(gEmmrt(), new C54507xKz());
        xKK.Activity.execute$default(c56138xxE, 0L, 1, null);
    }

    public final void sSMYrx() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        C54251xBm c54251xBm = this.isConnected;
        if (!Intrinsics.EZpvd((Object) c54251xBm.KWHzl().OLrzqt(), (Object) this.AuCTel.getInstId())) {
            AYXKKw().setValue(new LimitPriceData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null));
            valueOf().setValue(new StrategyConfigInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null));
        }
        C56235xyw c56235xywCopydefault = c54251xBm.copydefault();
        c56235xywCopydefault.KWHzl("contract_dca");
        String instId = this.AuCTel.getInstId();
        if (instId == null) {
            instId = "";
        }
        c56235xywCopydefault.AEQbTJ(instId);
        c56235xywCopydefault.djBIcL();
        c56235xywCopydefault.OLrzqt(valueOf(), new C54507xKz());
        xBG xbgKWHzl = c54251xBm.KWHzl();
        String instId2 = this.AuCTel.getInstId();
        xbgKWHzl.copydefault(instId2 != null ? instId2 : "");
        xbgKWHzl.AEQbTJ(AYXKKw());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String id = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(QOLQEE().getSecond())) == null) ? null : tradeCoinInfoAhwBna.getId();
        C56160xxa c56160xxaAEQbTJ = c54251xBm.AEQbTJ();
        c56160xxaAEQbTJ.AEQbTJ(C33129mqd.AhwBna(id));
        c56160xxaAEQbTJ.KWHzl("1");
        c56160xxaAEQbTJ.djBIcL();
        c56160xxaAEQbTJ.OLrzqt(this.getNewProxyInstance, new C53867wtb());
        c54251xBm.EZpvd(valueOf().getValue());
        c54251xBm.AEQbTJ(AYXKKw().getValue());
        c54251xBm.fIwbmz();
    }

    public final String AuCTelauCTel() {
        return EZpvd(AEQbTJ(this.AuCTel), RoundingMode.UP);
    }

    public final void isConnected() {
        LossInsuranceDisplayData value = this.iwGUEr.getValue();
        if (value == null || !Intrinsics.EZpvd((Object) value.getStatus(), (Object) VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode())) {
            return;
        }
        DcaOrderReq dcaOrderReq = this.AuCTel;
        dcaOrderReq.setVoucherId(null);
        dcaOrderReq.setBatchNo(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String EZpvd(@NotNull String str) {
        String strMulS$default;
        Intrinsics.checkNotNullParameter(str, "");
        String strAuCTelauCTel = AuCTelauCTel();
        if (str.length() == 0 || strAuCTelauCTel.length() == 0) {
            return "";
        }
        float fDjBIcL = C33129mqd.djBIcL(strAuCTelauCTel);
        LossInsuranceDisplayData value = this.iwGUEr.getValue();
        if (value == null || !Intrinsics.EZpvd(value.getEligible(), Boolean.TRUE)) {
            strMulS$default = C33129mqd.mulS$default(str, Double.valueOf(KWHzl(str)), null, null, null, 14, null);
        } else {
            LossInsuranceDisplayData value2 = this.iwGUEr.getValue();
            if (Intrinsics.EZpvd((Object) (value2 != null ? value2.getStatus() : null), (Object) VoucherStatus.LossInsuranceVoucherStatus.PENDING_USE.getCode())) {
                LossInsuranceDisplayData value3 = this.iwGUEr.getValue();
                strMulS$default = value3 != null ? value3.getAmount() : null;
                if (strMulS$default == null) {
                    strMulS$default = "";
                }
            }
        }
        float fMax = Math.max(fDjBIcL, C33129mqd.djBIcL(strMulS$default));
        return C33129mqd.AEQbTJ(Float.valueOf(fMax), str) ? "" : xMR.copydefault.AhwBna(C33129mqd.gEmmrt(Float.valueOf(fMax)), 0);
    }

    private final double KWHzl(String str) {
        if (C33129mqd.valueOf(str, 500)) {
            return 0.2d;
        }
        return (C33129mqd.AEQbTJ(str, 500) && C33129mqd.valueOf(str, 1000)) ? 0.1d : 0.05d;
    }

    private final Pair<String, String> QOLQEE() {
        ActionBar actionBarAEQbTJ = o.TaskDescription.AEQbTJ(this.AuCTel.getInstId());
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

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.hDKMBd, this.uzCIH, this.getFieldNames, this.isConnected.copydefault(), this.isConnected.KWHzl(), this.isConnected.AEQbTJ());
    }

    public interface StateListAnimator {

        public static final class Application implements StateListAnimator {
            public static final int AEQbTJ = BotAggregatedInfoBean.$stable;
            public final BotAggregatedInfoBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, BotAggregatedInfoBean botAggregatedInfoBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    botAggregatedInfoBean = application.copydefault;
                }
                return application.OLrzqt(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BotAggregatedInfoBean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                return new Application(botAggregatedInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayClaimVoucherConfirmation(bean=" + this.copydefault + ")";
            }

            public Application(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
                Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
                this.copydefault = botAggregatedInfoBean;
            }
        }
    }

    public static final Unit EZpvd(BotGuideContractDcaPresenter botGuideContractDcaPresenter, ResponseData responseData) {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) != null) {
            List list = (List) responseData.getData();
            interfaceC55881xsMCopydefault.AEQbTJ(list != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null);
        }
        C56198xyL c56198xyL = botGuideContractDcaPresenter.uzCIH;
        c56198xyL.EZpvd(TacticsType.TACTICS_CONTRACT_DCA.getConstant());
        String instId = botGuideContractDcaPresenter.AuCTel.getInstId();
        if (instId == null) {
            instId = "";
        }
        c56198xyL.OLrzqt(instId);
        String batchNo = botGuideContractDcaPresenter.AuCTel.getBatchNo();
        c56198xyL.AEQbTJ(batchNo != null ? batchNo : "");
        c56198xyL.djBIcL();
        c56198xyL.OLrzqt(botGuideContractDcaPresenter.AkhnZx, botGuideContractDcaPresenter.new Application());
        xKK.Activity.execute$default(c56198xyL, 0L, 1, null);
        return Unit.INSTANCE;
    }
}

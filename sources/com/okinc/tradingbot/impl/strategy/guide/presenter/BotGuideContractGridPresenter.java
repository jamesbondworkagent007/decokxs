package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.os.Bundle;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideLottieCard;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.VoucherInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC54531xLw;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C48033uCm;
import o.C53806wsT;
import o.C53811wsY;
import o.C53867wtb;
import o.C54507xKz;
import o.C54536xML;
import o.C54566xNc;
import o.C54571xNh;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C55768xqF;
import o.C55811xqw;
import o.C55886xsR;
import o.C55887xsS;
import o.C56059xvf;
import o.C56111xwe;
import o.C56160xxa;
import o.C56192xyF;
import o.C56198xyL;
import o.C56208xyV;
import o.C56214xyb;
import o.C56235xyw;
import o.C56238xyz;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotGuideContractGridPresenter extends AbsPresenter implements IBotGuidePresenter {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<TaskDescription> AEQbTJ;
    public final C56111xwe<IBotGuidePresenter.ButtonState> AYXKKw;
    public final C56160xxa AhwBna;
    public final C56238xyz AkhnZx;
    public final TradeLiveData<String> AuCTel;
    public final C56235xyw DbNXlk;
    public final TradeLiveData<BotAggregatedInfoBean> EZpvd;
    public final TradeLiveData<MinInvestResp> KWHzl;
    public final LiveData<List<Object>> OLrzqt;
    public final C56111xwe<List<BotGuideCoinItem>> djBIcL;
    public final C56111xwe<LossInsuranceDisplayData> ejfBZ;
    public final TradeLiveData<StrategyResponse> fARcdN;
    public boolean fIwbmz;
    public final C56192xyF fJNWhG;
    public final C56111xwe<Unit> fetchVPNInfo;
    public ContractGridReq gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public final C56198xyL getNewProxyInstance;
    public final TradeLiveData<MinInvestResp> hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public final C56214xyb iwGUEr;
    public final TradeLiveData<StrategyConfigInfo> uzCIH;
    public final C56238xyz valueOf;
    public final C56111xwe<Pair<Boolean, Exception>> values;
    public final SharedFlow<TaskDescription> zsXlph;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56238xyz AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridReq AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56192xyF AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> AuCTelauCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56214xyb AubY() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AwvSrB() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(boolean z) {
        return z ? C55688xof.Application.OJuSTm : C55688xof.Application.gGNlxh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAggregatedInfoBean> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<List<BotGuideCoinItem>> ejfBZ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<IBotGuidePresenter.ButtonState> fARcdN() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Unit> fJNWhG() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56160xxa fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> getFieldNames() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> getNewProxyInstance() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<LossInsuranceDisplayData> hDKMBd() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Pair<Boolean, Exception>> iwGUEr() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56198xyL wlaJM() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> zLjUOn() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> zuBGHE() {
        return this.zsXlph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideContractGridPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = new ContractGridReq((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
        this.AYXKKw = new C56111xwe<>();
        this.values = new C56111xwe<>();
        this.djBIcL = new C56111xwe<>();
        this.fetchVPNInfo = new C56111xwe<>();
        this.getNewProxyInstance = new C56198xyL();
        TradeLiveData<BotAggregatedInfoBean> tradeLiveData = new TradeLiveData<>();
        this.EZpvd = tradeLiveData;
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wLY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotGuideContractGridPresenter.KWHzl();
            }
        });
        this.OLrzqt = Transformations.map(tradeLiveData, new Function1() { // from class: o.wLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotGuideContractGridPresenter.EZpvd(this.EZpvd, (BotAggregatedInfoBean) obj);
            }
        });
        this.DbNXlk = new C56235xyw();
        this.uzCIH = new TradeLiveData<>();
        this.fJNWhG = new C56192xyF();
        this.ejfBZ = new C56111xwe<>();
        this.AhwBna = new C56160xxa();
        this.AuCTel = new TradeLiveData<>();
        this.iwGUEr = new C56214xyb();
        this.fARcdN = new TradeLiveData<>();
        this.AkhnZx = new C56238xyz();
        this.hDKMBd = new TradeLiveData<>();
        this.valueOf = new C56238xyz();
        this.KWHzl = new TradeLiveData<>();
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.wLV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotGuideContractGridPresenter.OLrzqt();
            }
        });
    }

    public final boolean gHZMYf() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null) {
            return interfaceC55881xsMCopydefault.EZpvd();
        }
        return false;
    }

    public static final C56208xyV KWHzl() {
        return new C56208xyV();
    }

    public final C56208xyV DbNXlk() {
        return (C56208xyV) this.isConnected.getValue();
    }

    public static final List EZpvd(BotGuideContractGridPresenter botGuideContractGridPresenter, BotAggregatedInfoBean botAggregatedInfoBean) {
        return new C53806wsT(botGuideContractGridPresenter.gEmmrt.getInstId(), botGuideContractGridPresenter.gEmmrt.getInstType()).KWHzl(botAggregatedInfoBean.getBotParam());
    }

    public final List<TacticsVoucherType> AxsJAY() {
        return (List) this.getFieldNames.getValue();
    }

    public static final List OLrzqt() {
        return TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_CONTRACT_GRID);
    }

    public final boolean sSMYrx() {
        LossInsuranceBean voucherInformation;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        return ((value == null || (voucherInformation = value.getVoucherInformation()) == null) ? null : voucherInformation.getVoucherType()) == TacticsVoucherType.AIRDROP;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void valueOf() {
        C56235xyw c56235xyw = this.DbNXlk;
        c56235xyw.KWHzl("contract_grid");
        c56235xyw.AEQbTJ(this.gEmmrt.getInstId());
        c56235xyw.djBIcL();
        c56235xyw.AuCTel();
        c56235xyw.OLrzqt(this.uzCIH, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public void OLrzqt(@NotNull String str, @NotNull C55887xsS c55887xsS, String str2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        String string = bundle != null ? bundle.getString("investType") : null;
        this.fIwbmz = Intrinsics.EZpvd((Object) string, (Object) "4");
        ContractGridReq contractGridReq = this.gEmmrt;
        contractGridReq.setInstId(c55887xsS.gEmmrt());
        contractGridReq.setInstType(c55887xsS.djBIcL());
        contractGridReq.setInvestType(string);
        contractGridReq.setDirection(bundle != null ? bundle.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null);
        contractGridReq.setOrdType(str);
        contractGridReq.setAutoTransfer("true");
        contractGridReq.setBatchNo(bundle != null ? bundle.getString("batchNo") : null);
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public Pair<String, String> uzCIH() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        String tradeSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        String first = isConnected().getFirst();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        return C56390yDp.OLrzqt(first, (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.gEmmrt.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.gEmmrt.getInstId())) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null || (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt.valueOf(tradeSymbol));
    }

    public final GuideHeaderCard copydefault(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        return new C53811wsY(this.gEmmrt).KWHzl(botAggregatedInfoBean);
    }

    public final GuideLottieCard fIwbmz() {
        int iIsConnected = C33512mxp.AEQbTJ.isConnected();
        boolean zOLrzqt = C33492mxV.OLrzqt();
        return new GuideLottieCard(C33070mpX.AYXKKw(C48033uCm.Fragment.sVXHln), C33070mpX.AYXKKw(C55688xof.Application.Dff), null, C33070mpX.AYXKKw((iIsConnected != 0 || zOLrzqt) ? (iIsConnected == 0 && zOLrzqt) ? C48033uCm.Fragment.OWSZPf : (iIsConnected == 0 || zOLrzqt) ? C48033uCm.Fragment.OeZisf : C48033uCm.Fragment.QYNZmZ : C48033uCm.Fragment.OUcgGI), 4, null);
    }

    public final void DTwDnp() {
        C56208xyV c56208xyVDbNXlk = DbNXlk();
        c56208xyVDbNXlk.KWHzl(new Function1() { // from class: o.wMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotGuideContractGridPresenter.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56208xyVDbNXlk, 0L, 1, null);
    }

    public static final class Dialog implements InterfaceC54501xKt<List<? extends RecommendedParamsDto>, BotAggregatedInfoBean> {
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BotAggregatedInfoBean KWHzl(List<RecommendedParamsDto> list) {
            BotAggregatedInfoBean botAggregatedInfoBean;
            VoucherInfo voucherInfo;
            Intrinsics.checkNotNullParameter(list, "");
            RecommendedParamsDto recommendedParamsDto = (RecommendedParamsDto) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (recommendedParamsDto == null || (botAggregatedInfoBean = C55811xqw.OLrzqt(recommendedParamsDto, TacticsType.TACTICS_CONTRACT_GRID)) == null) {
                botAggregatedInfoBean = new BotAggregatedInfoBean(null, null, null, null, 15, null);
            }
            BotGuideContractGridPresenter.this.OLrzqt(botAggregatedInfoBean, (recommendedParamsDto == null || (voucherInfo = recommendedParamsDto.getVoucherInfo()) == null) ? null : voucherInfo.getVoucherId());
            return botAggregatedInfoBean;
        }
    }

    public final void OLrzqt(BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        LossInsuranceDisplayData lossInsuranceDisplayData;
        LossInsuranceBean voucherInformation;
        TaskDescription application;
        LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation2 != null && !voucherInformation2.getVoucherVisible() && ((str == null || str.length() == 0) && C33129mqd.OLrzqt((CharSequence) this.gEmmrt.getBatchNo()) && (voucherInformation = botAggregatedInfoBean.getVoucherInformation()) != null && !voucherInformation.getClaimed())) {
            List<TacticsVoucherType> listAxsJAY = AxsJAY();
            LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listAxsJAY), voucherInformation3 != null ? voucherInformation3.getVoucherType() : null)) {
                LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
                if ((voucherInformation4 != null ? voucherInformation4.getVoucherType() : null) == TacticsVoucherType.AIRDROP) {
                    application = new TaskDescription.ActionBar(botAggregatedInfoBean.getVoucherInformation());
                } else {
                    application = new TaskDescription.Application(botAggregatedInfoBean.getVoucherInformation());
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotGuideContractGridPresenter$handleAggregatedInfo$1$1(this, application, null), 3, null);
            }
        }
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.ejfBZ;
        List<TacticsVoucherType> listAxsJAY2 = AxsJAY();
        LossInsuranceBean voucherInformation5 = botAggregatedInfoBean.getVoucherInformation();
        if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listAxsJAY2), voucherInformation5 != null ? voucherInformation5.getVoucherType() : null)) {
            LossInsuranceBean voucherInformation6 = botAggregatedInfoBean.getVoucherInformation();
            String voucherValue = voucherInformation6 != null ? voucherInformation6.getVoucherValue() : null;
            String str2 = voucherValue == null ? "" : voucherValue;
            LossInsuranceBean voucherInformation7 = botAggregatedInfoBean.getVoucherInformation();
            String voucherStatus = voucherInformation7 != null ? voucherInformation7.getVoucherStatus() : null;
            String str3 = voucherStatus == null ? "" : voucherStatus;
            LossInsuranceBean voucherInformation8 = botAggregatedInfoBean.getVoucherInformation();
            boolean voucherVisible = voucherInformation8 != null ? voucherInformation8.getVoucherVisible() : false;
            String ordType = this.gEmmrt.getOrdType();
            ArrayList arrayListCopydefault = yDY.copydefault(this.gEmmrt.getInstId());
            LossInsuranceBean voucherInformation9 = botAggregatedInfoBean.getVoucherInformation();
            Long lValueOf = voucherInformation9 != null ? Long.valueOf(voucherInformation9.getRealTimestamp()) : null;
            LossInsuranceBean voucherInformation10 = botAggregatedInfoBean.getVoucherInformation();
            String voucherExpireTime = voucherInformation10 != null ? voucherInformation10.getVoucherExpireTime() : null;
            String str4 = voucherExpireTime == null ? "" : voucherExpireTime;
            LossInsuranceBean voucherInformation11 = botAggregatedInfoBean.getVoucherInformation();
            String pTime = voucherInformation11 != null ? voucherInformation11.getPTime() : null;
            String str5 = pTime == null ? "" : pTime;
            LossInsuranceBean voucherInformation12 = botAggregatedInfoBean.getVoucherInformation();
            String voucherCcy = voucherInformation12 != null ? voucherInformation12.getVoucherCcy() : null;
            String str6 = voucherCcy == null ? "" : voucherCcy;
            String str7 = str == null ? "" : str;
            LossInsuranceBean voucherInformation13 = botAggregatedInfoBean.getVoucherInformation();
            lossInsuranceDisplayData = new LossInsuranceDisplayData(str2, str3, Boolean.valueOf(voucherVisible), ordType, arrayListCopydefault, false, lValueOf, str4, str5, str6, str7, false, voucherInformation13 != null ? voucherInformation13.getVoucherType() : null, 2080, null);
        } else {
            lossInsuranceDisplayData = new LossInsuranceDisplayData(null, null, null, this.gEmmrt.getOrdType(), null, false, null, null, null, null, null, false, null, 8183, null);
        }
        c56111xwe.setValue(lossInsuranceDisplayData);
        copydefault(botAggregatedInfoBean, str);
        EZpvd(botAggregatedInfoBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(BotAggregatedInfoBean botAggregatedInfoBean) {
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
                String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, this.gEmmrt.getInstType(), false, false, 8, null);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.gEmmrt.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str)) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
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

    public final void KWHzl(LossInsuranceBean lossInsuranceBean) {
        if (lossInsuranceBean != null) {
            C56192xyF c56192xyF = this.fJNWhG;
            String batchNo = this.gEmmrt.getBatchNo();
            if (batchNo == null) {
                batchNo = "";
            }
            c56192xyF.KWHzl(batchNo);
            c56192xyF.OLrzqt(this.ejfBZ, new ActionBar(lossInsuranceBean));
            xKK.Activity.execute$default(c56192xyF, 0L, 1, null);
        }
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends LockVoucherResponse>, LossInsuranceDisplayData> {
        public final /* synthetic */ LossInsuranceBean copydefault;

        public ActionBar(LossInsuranceBean lossInsuranceBean) {
            this.copydefault = lossInsuranceBean;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public LossInsuranceDisplayData KWHzl(List<LockVoucherResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            LockVoucherResponse lockVoucherResponse = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String expireTime = lockVoucherResponse != null ? lockVoucherResponse.getExpireTime() : null;
            String str = expireTime == null ? "" : expireTime;
            LockVoucherResponse lockVoucherResponse2 = (LockVoucherResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            String voucherId = lockVoucherResponse2 != null ? lockVoucherResponse2.getVoucherId() : null;
            if (voucherId == null) {
                voucherId = "";
            }
            BotGuideContractGridPresenter.this.AkhnZx().setVoucherId(voucherId);
            BotGuideContractGridPresenter.this.OLrzqt(str);
            String voucherValue = this.copydefault.getVoucherValue();
            String str2 = voucherValue == null ? "" : voucherValue;
            String voucherStatus = this.copydefault.getVoucherStatus();
            String str3 = voucherStatus == null ? "" : voucherStatus;
            Boolean bool = Boolean.TRUE;
            String ordType = BotGuideContractGridPresenter.this.AkhnZx().getOrdType();
            ArrayList arrayListCopydefault = yDY.copydefault(BotGuideContractGridPresenter.this.AkhnZx().getInstId());
            String voucherCcy = this.copydefault.getVoucherCcy();
            return new LossInsuranceDisplayData(str2, str3, bool, ordType, arrayListCopydefault, false, null, str, "", voucherCcy == null ? "" : voucherCcy, voucherId, false, this.copydefault.getVoucherType(), 2080, null);
        }
    }

    public final void OLrzqt(String str) {
        LossInsuranceBean voucherInformation;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        if (value == null || (voucherInformation = value.getVoucherInformation()) == null) {
            return;
        }
        this.EZpvd.setValue(BotAggregatedInfoBean.copy$default(value, null, null, voucherInformation.copy((1047550 & 1) != 0 ? voucherInformation.voucherVisible : true, (1047550 & 2) != 0 ? voucherInformation.voucherStatus : null, (1047550 & 4) != 0 ? voucherInformation.voucherBatch : null, (1047550 & 8) != 0 ? voucherInformation.voucherValue : null, (1047550 & 16) != 0 ? voucherInformation.voucherCcy : null, (1047550 & 32) != 0 ? voucherInformation.appliedVoucherCount : null, (1047550 & 64) != 0 ? voucherInformation.totalVoucherCount : null, (1047550 & 128) != 0 ? voucherInformation.pTime : null, (1047550 & 256) != 0 ? voucherInformation.endTime : null, (1047550 & 512) != 0 ? voucherInformation.voucherIssueTime : null, (1047550 & 1024) != 0 ? voucherInformation.voucherExpireTime : str, (1047550 & 2048) != 0 ? voucherInformation.deeplink : null, (1047550 & 4096) != 0 ? voucherInformation.realTimestamp : 0L, (1047550 & 8192) != 0 ? voucherInformation.instIds : null, (1047550 & 16384) != 0 ? voucherInformation.algoOrdTypes : null, (1047550 & 32768) != 0 ? voucherInformation.claimed : false, (1047550 & 65536) != 0 ? voucherInformation.voucherType : null, (1047550 & 131072) != 0 ? voucherInformation.arbitrageTotalPnlInfo : null, (1047550 & 262144) != 0 ? voucherInformation.leveragePrincipal : null, (1047550 & 524288) != 0 ? voucherInformation.totalInterestAmt : null), null, 11, null));
    }

    public final void OLrzqt(LossInsuranceBean lossInsuranceBean) {
        C56111xwe<LossInsuranceDisplayData> c56111xwe = this.ejfBZ;
        String voucherValue = lossInsuranceBean != null ? lossInsuranceBean.getVoucherValue() : null;
        String str = voucherValue == null ? "" : voucherValue;
        String voucherStatus = lossInsuranceBean != null ? lossInsuranceBean.getVoucherStatus() : null;
        String str2 = voucherStatus == null ? "" : voucherStatus;
        String ordType = this.gEmmrt.getOrdType();
        ArrayList arrayListCopydefault = yDY.copydefault(this.gEmmrt.getInstId());
        String voucherCcy = lossInsuranceBean != null ? lossInsuranceBean.getVoucherCcy() : null;
        c56111xwe.postValue(new LossInsuranceDisplayData(str, str2, null, ordType, arrayListCopydefault, false, null, null, null, voucherCcy == null ? "" : voucherCcy, null, false, lossInsuranceBean != null ? lossInsuranceBean.getVoucherType() : null, 3108, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(BotAggregatedInfoBean botAggregatedInfoBean, String str) {
        String lever;
        List<AdvancedTriggerSign> listAhwBna;
        StgyParam botParam = botAggregatedInfoBean.getBotParam();
        ContractGridReq contractGridReq = this.gEmmrt;
        if (botParam == null || (lever = botParam.getLever()) == null) {
            lever = "5";
        }
        contractGridReq.setLever(lever);
        contractGridReq.setDirection(botParam != null ? botParam.getDirection() : null);
        String gridNum = botParam != null ? botParam.getGridNum() : null;
        if (gridNum == null) {
            gridNum = "";
        }
        contractGridReq.setGridNum(gridNum);
        String minPx = botParam != null ? botParam.getMinPx() : null;
        if (minPx == null) {
            minPx = "";
        }
        contractGridReq.setMinPx(minPx);
        String maxPx = botParam != null ? botParam.getMaxPx() : null;
        if (maxPx == null) {
            maxPx = "";
        }
        contractGridReq.setMaxPx(maxPx);
        String runType = botParam != null ? botParam.getRunType() : null;
        if (runType == null) {
            runType = "";
        }
        contractGridReq.setRunType(runType);
        contractGridReq.setBasePos(Intrinsics.EZpvd((Object) (botParam != null ? botParam.getDirection() : null), (Object) "neutral") ? null : Boolean.TRUE);
        contractGridReq.setSignParams(values());
        contractGridReq.setAnnualizedRate(botParam != null ? botParam.getPnlRatio() : null);
        String sz = botParam != null ? botParam.getSz() : null;
        if (sz == null) {
            sz = "";
        }
        contractGridReq.setSz(sz);
        String tpTriggerPx = botParam != null ? botParam.getTpTriggerPx() : null;
        if (tpTriggerPx == null) {
            tpTriggerPx = "";
        }
        contractGridReq.setTpTriggerPx(tpTriggerPx);
        String slTriggerPx = botParam != null ? botParam.getSlTriggerPx() : null;
        if (slTriggerPx == null) {
            slTriggerPx = "";
        }
        contractGridReq.setSlTriggerPx(slTriggerPx);
        String tpRatio = botParam != null ? botParam.getTpRatio() : null;
        if (tpRatio == null) {
            tpRatio = "";
        }
        contractGridReq.setTpRatio(tpRatio);
        String slRatio = botParam != null ? botParam.getSlRatio() : null;
        if (slRatio == null) {
            slRatio = "";
        }
        contractGridReq.setSlRatio(slRatio);
        String direction = botParam != null ? botParam.getDirection() : null;
        contractGridReq.setDirection(direction != null ? direction : "");
        contractGridReq.setBasePos(botParam != null ? Boolean.valueOf(botParam.getBasePos()) : Boolean.FALSE);
        if (botParam == null || (listAhwBna = botParam.getSignParams()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        contractGridReq.setSignParams(new ArrayList<>(listAhwBna));
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation != null && voucherInformation.getVoucherVisible()) {
            List<TacticsVoucherType> listAxsJAY = AxsJAY();
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TacticsVoucherType>) ((Iterable<? extends Object>) listAxsJAY), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null)) {
                contractGridReq.setVoucherId(str);
            }
        } else {
            contractGridReq.setVoucherId(null);
        }
        if (gHZMYf()) {
            contractGridReq.setProfitSharingRatio("0");
        }
    }

    public final ArrayList<AdvancedTriggerSign> values() {
        return yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, GridStartTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4092, (DefaultConstructorMarker) null), new AdvancedTriggerSign("stop", GridStopTriggerType.MANUAL_STOP.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", (String) null, 3068, (DefaultConstructorMarker) null));
    }

    public final void OcIXYQ() {
        BotAggregatedInfoBean value;
        LossInsuranceBean voucherInformation;
        C56214xyb c56214xyb = this.iwGUEr;
        ContractGridReq contractGridReq = this.gEmmrt;
        if (sSMYrx() && (value = this.EZpvd.getValue()) != null && (voucherInformation = value.getVoucherInformation()) != null && voucherInformation.getVoucherVisible()) {
            contractGridReq.setSz("");
        }
        c56214xyb.EZpvd(contractGridReq);
        c56214xyb.djBIcL();
        c56214xyb.OLrzqt(this.fARcdN, new C54507xKz());
        xKK.Activity.execute$default(c56214xyb, 0L, 1, null);
    }

    public final void QKVWgx() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        Pair<String, String> pairIsConnected = isConnected();
        BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
        String second = (bizInstrumentIsConnected == null || !Intrinsics.EZpvd(bizInstrumentIsConnected.isNegativeContract(), Boolean.TRUE)) ? pairIsConnected.getSecond() : pairIsConnected.getFirst();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String id = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(second)) == null) ? null : tradeCoinInfoAhwBna.getId();
        C56160xxa c56160xxa = this.AhwBna;
        c56160xxa.AEQbTJ(C33129mqd.AhwBna(id));
        c56160xxa.KWHzl("1");
        c56160xxa.djBIcL();
        c56160xxa.OLrzqt(this.AuCTel, new C53867wtb());
        xKK.Activity.execute$default(c56160xxa, 0L, 1, null);
    }

    public final void ORxRYg() {
        C56238xyz c56238xyz = this.AkhnZx;
        c56238xyz.AEQbTJ(this.gEmmrt.getInstId());
        c56238xyz.OLrzqt(this.gEmmrt.getDirection());
        c56238xyz.KWHzl(this.gEmmrt.getGridNum());
        c56238xyz.AYXKKw(this.gEmmrt.getMaxPx());
        c56238xyz.djBIcL(this.gEmmrt.getMinPx());
        c56238xyz.valueOf(this.gEmmrt.getLever());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.gEmmrt.getRunType()));
        c56238xyz.EZpvd(this.gEmmrt.getBasePos());
        AdvancedTriggerSign advancedTriggerSignZsXlph = zsXlph();
        c56238xyz.isConnected(advancedTriggerSignZsXlph != null ? advancedTriggerSignZsXlph.getIndicator() : null);
        AdvancedTriggerSign advancedTriggerSignZsXlph2 = zsXlph();
        if (advancedTriggerSignZsXlph2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignZsXlph2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignZsXlph2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.hDKMBd, new C55768xqF());
        c56238xyz.OLrzqt(200L);
    }

    public static /* synthetic */ void checkMaxInvestWithMargin$default(BotGuideContractGridPresenter botGuideContractGridPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        botGuideContractGridPresenter.EZpvd(str);
    }

    public final void EZpvd(String str) {
        C56238xyz c56238xyz = this.valueOf;
        c56238xyz.AEQbTJ(this.gEmmrt.getInstId());
        c56238xyz.OLrzqt(this.gEmmrt.getDirection());
        c56238xyz.KWHzl(this.gEmmrt.getGridNum());
        c56238xyz.AYXKKw(this.gEmmrt.getMaxPx());
        c56238xyz.djBIcL(this.gEmmrt.getMinPx());
        c56238xyz.valueOf(this.gEmmrt.getLever());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.gEmmrt.getRunType()));
        c56238xyz.EZpvd(this.gEmmrt.getBasePos());
        c56238xyz.copydefault(str);
        AdvancedTriggerSign advancedTriggerSignZsXlph = zsXlph();
        c56238xyz.isConnected(advancedTriggerSignZsXlph != null ? advancedTriggerSignZsXlph.getIndicator() : null);
        AdvancedTriggerSign advancedTriggerSignZsXlph2 = zsXlph();
        if (advancedTriggerSignZsXlph2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignZsXlph2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignZsXlph2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.KWHzl, new Application());
        c56238xyz.OLrzqt(200L);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends MinInvestResp>, MinInvestResp> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ MinInvestResp KWHzl(List<? extends MinInvestResp> list) {
            return KWHzl2((List<MinInvestResp>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public MinInvestResp KWHzl2(List<MinInvestResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return BotGuideContractGridPresenter.this.AEQbTJ(list);
        }
    }

    public final AdvancedTriggerSign zsXlph() {
        Object next;
        Iterator<T> it = this.gEmmrt.getSignParams().iterator();
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

    public final void copydefault() {
        LossInsuranceDisplayData value = this.ejfBZ.getValue();
        if (value == null || !Intrinsics.EZpvd((Object) value.getStatus(), (Object) VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode())) {
            return;
        }
        ContractGridReq contractGridReq = this.gEmmrt;
        contractGridReq.setVoucherId(null);
        contractGridReq.setBatchNo(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MinInvestResp AEQbTJ(List<MinInvestResp> list) {
        String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        String instFamily;
        String str = "";
        String minInvestment = C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) ? list.get(0).getMinInvestment() : "";
        if (!C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) || C33129mqd.OLrzqt((Object) list.get(0).getSingleAmt(), (Object) 0)) {
            safeString$default = "--";
        } else {
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            String strAYXKKw = c56059xvf.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
            if (bizInstrumentIsConnected != null && (instFamily = bizInstrumentIsConnected.getInstFamily()) != null) {
                str = instFamily;
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strAYXKKw, str, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default == null || (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(list.get(0).getSingleAmt())) == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            }
        }
        return new MinInvestResp(minInvestment, (String) null, (String) null, safeString$default, (String) null, 22, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(@NotNull String str, @NotNull String str2) {
        String strMulS$default;
        StgyParam botParam;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        String sz = (value == null || (botParam = value.getBotParam()) == null) ? null : botParam.getSz();
        if (sz == null) {
            sz = "";
        }
        if (str.length() == 0 || str2.length() == 0 || sz.length() == 0) {
            return "";
        }
        float fDjBIcL = C33129mqd.djBIcL(str2);
        float fDjBIcL2 = C33129mqd.djBIcL(sz);
        float fDjBIcL3 = C33129mqd.djBIcL(str);
        LossInsuranceDisplayData value2 = this.ejfBZ.getValue();
        if (value2 != null && Intrinsics.EZpvd(value2.getEligible(), Boolean.TRUE)) {
            LossInsuranceDisplayData value3 = this.ejfBZ.getValue();
            if (Intrinsics.EZpvd((Object) (value3 != null ? value3.getStatus() : null), (Object) VoucherStatus.LossInsuranceVoucherStatus.PENDING_USE.getCode())) {
                LossInsuranceDisplayData value4 = this.ejfBZ.getValue();
                strMulS$default = value4 != null ? value4.getAmount() : null;
                if (strMulS$default == null) {
                    strMulS$default = "";
                }
            }
        } else {
            strMulS$default = C33129mqd.mulS$default(str, Double.valueOf(AEQbTJ(str)), null, null, null, 14, null);
        }
        float fMax = Math.max(fDjBIcL, C33129mqd.djBIcL(strMulS$default));
        if (C33129mqd.AEQbTJ(Float.valueOf(fMax), Float.valueOf(fDjBIcL3))) {
            return "";
        }
        if (C33129mqd.AhwBna(Float.valueOf(fDjBIcL2), Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)) && C33129mqd.valueOf(Float.valueOf(fDjBIcL2), Float.valueOf(fDjBIcL3))) {
            return xMR.copydefault.AhwBna(C33129mqd.gEmmrt(Float.valueOf(fDjBIcL2)), 2);
        }
        return C33129mqd.valueOf(Float.valueOf(fMax), Float.valueOf(fDjBIcL3)) ? xMR.copydefault.AhwBna(C33129mqd.gEmmrt(Float.valueOf(fMax)), 0) : "";
    }

    public final double AEQbTJ(String str) {
        if (C33129mqd.valueOf(str, 500)) {
            return 0.2d;
        }
        return (C33129mqd.AEQbTJ(str, 500) && C33129mqd.valueOf(str, 1000)) ? 0.1d : 0.05d;
    }

    public final Pair<String, String> isConnected() {
        o.ActionBar actionBarAEQbTJ = o.TaskDescription.AEQbTJ(this.gEmmrt.getInstId());
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(boolean z) {
        IBotGuidePresenter.ButtonState buttonState;
        String direction;
        BotAggregatedInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        C56111xwe<IBotGuidePresenter.ButtonState> c56111xweFARcdN = fARcdN();
        LossInsuranceBean voucherInformation = value.getVoucherInformation();
        TacticsVoucherType voucherType = voucherInformation != null ? voucherInformation.getVoucherType() : null;
        if (voucherType != null && StateListAnimator.KWHzl[voucherType.ordinal()] == 1) {
            LossInsuranceBean voucherInformation2 = value.getVoucherInformation();
            if (voucherInformation2 != null && !voucherInformation2.getVoucherVisible()) {
                buttonState = IBotGuidePresenter.ButtonState.Generic.Disabled;
            } else {
                LossInsuranceDisplayData value2 = this.ejfBZ.getValue();
                if (Intrinsics.EZpvd((Object) (value2 != null ? value2.getStatus() : null), (Object) VoucherStatus.AirdropVoucherStatus.EXPIRED.getCode())) {
                    buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Disabled;
                } else {
                    StgyParam botParam = value.getBotParam();
                    direction = botParam != null ? botParam.getDirection() : null;
                    if (direction == null) {
                        buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Disabled;
                    } else {
                        int iHashCode = direction.hashCode();
                        if (iHashCode != 3327612) {
                            if (iHashCode != 109413500) {
                                if (iHashCode == 1844321735 && direction.equals("neutral")) {
                                    buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Enabled;
                                }
                            } else if (direction.equals("short")) {
                                buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Short;
                            }
                        } else if (direction.equals("long")) {
                            buttonState = IBotGuidePresenter.ButtonState.AirdropButtonState.Long;
                        }
                    }
                }
            }
        } else if (z) {
            StgyParam botParam2 = value.getBotParam();
            direction = botParam2 != null ? botParam2.getDirection() : null;
            if (direction == null) {
                buttonState = IBotGuidePresenter.ButtonState.Generic.Disabled;
            } else {
                int iHashCode2 = direction.hashCode();
                if (iHashCode2 != 3327612) {
                    if (iHashCode2 != 109413500) {
                        if (iHashCode2 == 1844321735 && direction.equals("neutral")) {
                            buttonState = IBotGuidePresenter.ButtonState.Generic.Enabled;
                        }
                    } else if (direction.equals("short")) {
                        buttonState = IBotGuidePresenter.ButtonState.Generic.Short;
                    }
                } else if (direction.equals("long")) {
                    buttonState = IBotGuidePresenter.ButtonState.Generic.Long;
                }
            }
        } else {
            buttonState = IBotGuidePresenter.ButtonState.Generic.Disabled;
        }
        c56111xweFARcdN.setValue(buttonState);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.iwGUEr, this.getNewProxyInstance, this.fJNWhG, this.AhwBna, this.AkhnZx, this.valueOf, this.DbNXlk);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public interface TaskDescription {
        LossInsuranceBean AEQbTJ();

        public static final class Application implements TaskDescription {
            public static final int KWHzl = LossInsuranceBean.$stable;
            public final LossInsuranceBean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, LossInsuranceBean lossInsuranceBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    lossInsuranceBean = application.EZpvd;
                }
                return application.KWHzl(lossInsuranceBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter.TaskDescription
            public LossInsuranceBean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(LossInsuranceBean lossInsuranceBean) {
                return new Application(lossInsuranceBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                LossInsuranceBean lossInsuranceBean = this.EZpvd;
                if (lossInsuranceBean == null) {
                    return 0;
                }
                return lossInsuranceBean.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayClaimVoucherConfirmation(bean=" + this.EZpvd + ")";
            }

            public Application(LossInsuranceBean lossInsuranceBean) {
                this.EZpvd = lossInsuranceBean;
            }
        }

        public static final class ActionBar implements TaskDescription {
            public static final int KWHzl = LossInsuranceBean.$stable;
            public final LossInsuranceBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, LossInsuranceBean lossInsuranceBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    lossInsuranceBean = actionBar.OLrzqt;
                }
                return actionBar.copydefault(lossInsuranceBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter.TaskDescription
            public LossInsuranceBean AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(LossInsuranceBean lossInsuranceBean) {
                return new ActionBar(lossInsuranceBean);
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
                LossInsuranceBean lossInsuranceBean = this.OLrzqt;
                if (lossInsuranceBean == null) {
                    return 0;
                }
                return lossInsuranceBean.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayAirdropClaimVoucherConfirmation(bean=" + this.OLrzqt + ")";
            }

            public ActionBar(LossInsuranceBean lossInsuranceBean) {
                this.OLrzqt = lossInsuranceBean;
            }
        }
    }

    public static final Unit AEQbTJ(BotGuideContractGridPresenter botGuideContractGridPresenter, ResponseData responseData) {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) != null) {
            List list = (List) responseData.getData();
            interfaceC55881xsMCopydefault.AEQbTJ(list != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null);
        }
        C56198xyL c56198xyL = botGuideContractGridPresenter.getNewProxyInstance;
        c56198xyL.EZpvd(botGuideContractGridPresenter.gEmmrt.getOrdType());
        c56198xyL.OLrzqt(botGuideContractGridPresenter.gEmmrt.getInstId());
        String batchNo = botGuideContractGridPresenter.gEmmrt.getBatchNo();
        c56198xyL.AEQbTJ(batchNo != null ? batchNo : "");
        c56198xyL.djBIcL();
        c56198xyL.OLrzqt(botGuideContractGridPresenter.EZpvd, botGuideContractGridPresenter.new Dialog());
        xKK.Activity.execute$default(c56198xyL, 0L, 1, null);
        return Unit.INSTANCE;
    }
}

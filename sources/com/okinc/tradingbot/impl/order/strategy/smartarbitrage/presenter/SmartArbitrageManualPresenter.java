package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import androidx.annotation.StringRes;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.biz.TradeType;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.HighestApyOverview;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33070mpX;
import o.C33129mqd;
import o.C54219xAh;
import o.C54221xAj;
import o.C54589xNz;
import o.C55276xgr;
import o.C55688xof;
import o.C55770xqH;
import o.C56111xwe;
import o.C56235xyw;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC56445yFq;
import o.pUU;
import o.xKE;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartArbitrageManualPresenter extends BaseBotOrderPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final TradeLiveData<FundingRateArbCoin> AEQbTJ;
    public final C56111xwe<ArbInvestDetailsBean> AYXKKw;
    public final C54219xAh AhwBna;
    public final PnLDuration EZpvd;
    public final TradeLiveData<StrategyConfigInfo> KWHzl;
    public final C56235xyw OLrzqt;
    public boolean djBIcL;
    public PnLDuration fetchVPNInfo;
    public final C56111xwe<List<StrategyResponse>> gEmmrt;
    public final C54221xAj valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<FundingRateArbCoin> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(PnLDuration pnLDuration) {
        this.fetchVPNInfo = pnLDuration;
        this.djBIcL = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ArbInvestDetailsBean> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDuration fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54221xAj valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageManualPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new TradeLiveData<>();
        this.AhwBna = new C54219xAh();
        this.gEmmrt = new C56111xwe<>();
        this.valueOf = new C54221xAj();
        this.AYXKKw = new C56111xwe<>();
        this.OLrzqt = new C56235xyw();
        this.KWHzl = new TradeLiveData<>();
        this.djBIcL = true;
        PnLDuration pnLDuration = PnLDuration.APY_90DAYS;
        this.EZpvd = pnLDuration;
        this.fetchVPNInfo = pnLDuration;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageManualPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final SwapInstrument OLrzqt() {
        BizInstrument suggestedInstrument$default;
        Pair<String, String> pairEZpvd = EZpvd("SWAP");
        String strComponent1 = pairEZpvd.component1();
        String strComponent2 = pairEZpvd.component2();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (strComponent1 == null) {
                strComponent1 = "";
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strComponent1, strComponent2 == null ? "" : strComponent2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default instanceof SwapInstrument) {
            return (SwapInstrument) suggestedInstrument$default;
        }
        return null;
    }

    public final String DbNXlk() {
        SwapInstrument swapInstrumentOLrzqt = OLrzqt();
        if (swapInstrumentOLrzqt != null) {
            return swapInstrumentOLrzqt.getTradeSymbol();
        }
        return null;
    }

    public final String AkhnZx() {
        String strKWHzl = C55770xqH.ActionBar.OLrzqt.KWHzl(DbNXlk());
        if (strKWHzl != null) {
            return strKWHzl;
        }
        pUU.copydefault("SmartArbitrageStaking", "No valid staking coin in SMART_ARBITRAGE_STAKING_COIN_MAP");
        return "--";
    }

    public final void KWHzl(String str) {
        BizInstrument bizInstrumentDbNXlk;
        SmartArbitrageManualPresenter smartArbitrageManualPresenter;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        ArrayList<BizInstrument> arrayListEZpvd;
        Object next;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        String string = SPUtils.getString("sp_smart_arbitrage_inst_family", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (str != null && str.length() != 0) {
            string = str;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt("SWAP")) == null || (bizInstrumentDbNXlk = abstractC54531xLwOLrzqt2.DbNXlk(string)) == null || (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) == null || !interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentDbNXlk.getInstId(), "SWAP")) {
            bizInstrumentDbNXlk = null;
        }
        if (bizInstrumentDbNXlk != null) {
            smartArbitrageManualPresenter = this;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt3.OLrzqt("SWAP")) == null || (arrayListEZpvd = abstractC54531xLwOLrzqt.EZpvd()) == null) {
                smartArbitrageManualPresenter = this;
                bizInstrumentDbNXlk = null;
            } else {
                Iterator<T> it = arrayListEZpvd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((BizInstrument) next).getQuoteSymbol(), (Object) "USDT")) {
                            break;
                        }
                    }
                }
                bizInstrumentDbNXlk = (BizInstrument) next;
                smartArbitrageManualPresenter = this;
            }
        }
        smartArbitrageManualPresenter.AEQbTJ.postValue(new FundingRateArbCoin(bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null, (String) null, (String) null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getInstId() : null, (HighestApyOverview) null, (List) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, 2038, (DefaultConstructorMarker) null));
    }

    public final void KWHzl() {
        C56235xyw c56235xyw = this.OLrzqt;
        c56235xyw.KWHzl("smart_arbitrage");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.OLrzqt(this.KWHzl, new ActionBar());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends StrategyConfigInfo>, StrategyConfigInfo> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ StrategyConfigInfo KWHzl(List<? extends StrategyConfigInfo> list) {
            return KWHzl2((List<StrategyConfigInfo>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public StrategyConfigInfo KWHzl2(List<StrategyConfigInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
            return strategyConfigInfo == null ? new StrategyConfigInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null) : strategyConfigInfo;
        }
    }

    public static /* synthetic */ void makeOrder$default(SmartArbitrageManualPresenter smartArbitrageManualPresenter, String str, Float f, ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, PlaceOrderCondition placeOrderCondition, int i, Object obj) {
        if ((i & 4) != 0) {
            arbInvestDetailsBeanStakingType4UI = ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING;
        }
        if ((i & 8) != 0) {
            placeOrderCondition = null;
        }
        smartArbitrageManualPresenter.AEQbTJ(str, f, arbInvestDetailsBeanStakingType4UI, placeOrderCondition);
    }

    public final void AEQbTJ(@NotNull String str, Float f, @NotNull ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, PlaceOrderCondition placeOrderCondition) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arbInvestDetailsBeanStakingType4UI, "");
        C54219xAh c54219xAh = this.AhwBna;
        c54219xAh.EZpvd(new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, "smart_arbitrage", (TradeType) null, (String) null, (Boolean) null, 1919, (DefaultConstructorMarker) null));
        c54219xAh.EZpvd(new SmartArbitrageReq(EZpvd("SPOT").getSecond(), str, "simpleFundingFee", new ArbInvestDetailsBean((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, arbInvestDetailsBeanStakingType4UI, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, false, (String) null, (String) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108799, (DefaultConstructorMarker) null), f, placeOrderCondition, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (StrategyConfigInfo) null, (String) null, 1984, (DefaultConstructorMarker) null));
        c54219xAh.djBIcL();
        c54219xAh.AEQbTJ(this.gEmmrt);
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public static /* synthetic */ void fetchInvestDetails$default(SmartArbitrageManualPresenter smartArbitrageManualPresenter, String str, String str2, Float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = null;
        }
        smartArbitrageManualPresenter.AEQbTJ(str, str2, f);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54221xAj c54221xAj = this.valueOf;
        SwapInstrument swapInstrumentOLrzqt = OLrzqt();
        String instFly = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstFly() : null;
        c54221xAj.copydefault(instFly != null ? instFly : "");
        c54221xAj.EZpvd("simpleFundingFee");
        c54221xAj.gEmmrt(str);
        c54221xAj.AEQbTJ(f);
        c54221xAj.OLrzqt(this.AYXKKw, new Application(str, str2));
        xKK.Activity.execute$default(c54221xAj, 0L, 1, null);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends ArbInvestDetailsBean>, ArbInvestDetailsBean> {
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ String copydefault;

        public Application(String str, String str2) {
            this.copydefault = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public ArbInvestDetailsBean KWHzl(List<ArbInvestDetailsBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArbInvestDetailsBean arbInvestDetailsBean = (ArbInvestDetailsBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (arbInvestDetailsBean != null) {
                String str = this.copydefault;
                String str2 = this.OLrzqt;
                arbInvestDetailsBean.setTotalAmt(str);
                arbInvestDetailsBean.setUnit(str2);
                return arbInvestDetailsBean;
            }
            return new ArbInvestDetailsBean((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbInvestDetailsBeanStakingType4UI) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, false, (String) null, (String) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
        }
    }

    public final Pair<String, String> EZpvd(@NotNull String str) {
        String instId;
        o.ActionBar actionBarAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        FundingRateArbCoin value = this.AEQbTJ.getValue();
        if (!Intrinsics.EZpvd((Object) str, (Object) "SPOT")) {
            return new Pair<>("SWAP", value != null ? value.getInstId() : null);
        }
        if (value != null && (instId = value.getInstId()) != null && (actionBarAEQbTJ = o.TaskDescription.AEQbTJ(instId)) != null) {
            strCopydefault = o.TaskDescription.copydefault(actionBarAEQbTJ);
        }
        return new Pair<>("SPOT", strCopydefault);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKE<? extends List<Object>>> getUseCaseList() {
        return yDY.gEmmrt(this.AhwBna, this.valueOf);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PnLDuration {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PnLDuration[] $VALUES;
        private final String data;
        private final int titleRes;
        private final int value;
        public static final PnLDuration APY_3DAYS = new PnLDuration("APY_3DAYS", 0, C55688xof.Application.getLifecycleRegistry, "3d", 3);
        public static final PnLDuration APY_30DAYS = new PnLDuration("APY_30DAYS", 1, C55688xof.Application.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0, "30d", 30);
        public static final PnLDuration APY_90DAYS = new PnLDuration("APY_90DAYS", 2, C55688xof.Application.ComponentDialog, "90d", 90);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PnLDuration[] $values() {
            return new PnLDuration[]{APY_3DAYS, APY_30DAYS, APY_90DAYS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PnLDuration> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private PnLDuration(@StringRes String str, int i, int i2, String str2, int i3) {
            this.titleRes = i2;
            this.data = str2;
            this.value = i3;
        }

        static {
            PnLDuration[] pnLDurationArr$values = $values();
            $VALUES = pnLDurationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pnLDurationArr$values);
        }

        public final String getTitle() {
            return C33070mpX.AYXKKw(this.titleRes);
        }

        public static PnLDuration valueOf(String str) {
            return (PnLDuration) Enum.valueOf(PnLDuration.class, str);
        }

        public static PnLDuration[] values() {
            return (PnLDuration[]) $VALUES.clone();
        }
    }

    public final List<C55276xgr> AhwBna() {
        InterfaceC56445yFq<PnLDuration> entries = PnLDuration.getEntries();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
        Iterator<PnLDuration> it = entries.iterator();
        while (it.hasNext()) {
            PnLDuration next = it.next();
            arrayList.add(new C55276xgr(next.getTitle(), next, null, next == this.fetchVPNInfo, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull String str) {
        PnLDuration next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<PnLDuration> it = PnLDuration.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getData(), (Object) str)) {
                    break;
                }
            }
        }
        PnLDuration pnLDuration = next;
        if (pnLDuration == null || !this.djBIcL) {
            return;
        }
        OLrzqt(pnLDuration);
    }

    public final void EZpvd(@NotNull PnLDuration pnLDuration) {
        Intrinsics.checkNotNullParameter(pnLDuration, "");
        OLrzqt(pnLDuration);
    }

    public final String AEQbTJ() {
        List<AutoEarnStakingConfig> autoEarn;
        StrategyConfigInfo value = this.KWHzl.getValue();
        ArrayList arrayList = null;
        List<AutoEarnStakingConfig> autoEarn2 = value != null ? value.getAutoEarn() : null;
        StrategyConfigInfo value2 = this.KWHzl.getValue();
        AutoVipProfitInfo autoVipProfitInfo = new AutoVipProfitInfo((List) autoEarn2, (List) (value2 != null ? value2.getAutoStaking() : null), (String) null, false, false, 28, (DefaultConstructorMarker) null);
        StrategyConfigInfo value3 = this.KWHzl.getValue();
        if (value3 != null && (autoEarn = value3.getAutoEarn()) != null) {
            arrayList = new ArrayList();
            for (Object obj : autoEarn) {
                if (Intrinsics.EZpvd((Object) ((AutoEarnStakingConfig) obj).getCcy(), (Object) "BTC")) {
                    arrayList.add(obj);
                }
            }
        }
        boolean zKWHzl = C33129mqd.KWHzl((Collection) arrayList);
        if (C33129mqd.KWHzl((Collection) autoVipProfitInfo.getAutoStake()) && C33129mqd.KWHzl((Collection) autoVipProfitInfo.getAutoEarn())) {
            if (!zKWHzl) {
                return "earnAndStaking";
            }
        } else {
            if (C33129mqd.KWHzl((Collection) autoVipProfitInfo.getAutoStake())) {
                return "staking";
            }
            if (!C33129mqd.KWHzl((Collection) autoVipProfitInfo.getAutoEarn())) {
                return "";
            }
            if (!zKWHzl) {
                return "earn";
            }
        }
        return "earnAndBTCYield";
    }

    public final void isConnected() {
        OLrzqt(this.EZpvd);
        this.djBIcL = true;
    }
}

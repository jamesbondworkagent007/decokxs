package o;

import com.okinc.tradingbot.impl.signalClone.domain.BotOrderRequestModelUseCase$createSmartArbitrageReq$1;
import com.okinc.tradingbot.impl.signalClone.domain.BotOrderRequestModelUseCase$map$1;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import java.math.RoundingMode;
import java.util.GregorianCalendar;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.wTM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53784wry extends vNH<Application, ActionBar> {
    public final wTM AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53784wry(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTM wtm) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtm, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = wtm;
    }

    /* JADX INFO: renamed from: o.wry$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        public static final int EZpvd = StrategyBaseReq.$stable;
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final boolean KWHzl;
        public final StrategyBaseReq OLrzqt;
        public final StrategyDetailsResponse copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, StrategyDetailsResponse strategyDetailsResponse, StrategyBaseReq strategyBaseReq, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                strategyDetailsResponse = application.copydefault;
            }
            if ((i & 2) != 0) {
                strategyBaseReq = application.OLrzqt;
            }
            StrategyBaseReq strategyBaseReq2 = strategyBaseReq;
            if ((i & 4) != 0) {
                str = application.AEQbTJ;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = application.AhwBna;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                z = application.KWHzl;
            }
            return application.AEQbTJ(strategyDetailsResponse, strategyBaseReq2, str3, str4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull StrategyBaseReq strategyBaseReq, @NotNull java.lang.String str, java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(strategyDetailsResponse, strategyBaseReq, str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyDetailsResponse KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyBaseReq copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            java.lang.String str = this.AhwBna;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(strategyInfoResponse=" + this.copydefault + ", baseReq=" + this.OLrzqt + ", amount=" + this.AEQbTJ + ", tradeQuoteCcy=" + this.AhwBna + ", skipNetworkCalls=" + this.KWHzl + ")";
        }

        public Application(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull StrategyBaseReq strategyBaseReq, @NotNull java.lang.String str, java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = strategyDetailsResponse;
            this.OLrzqt = strategyBaseReq;
            this.AEQbTJ = str;
            this.AhwBna = str2;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.wry$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        public final StrategyReqGroup KWHzl;
        public final android.os.Parcelable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, StrategyReqGroup strategyReqGroup, android.os.Parcelable parcelable, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                strategyReqGroup = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                parcelable = actionBar.OLrzqt;
            }
            return actionBar.KWHzl(strategyReqGroup, parcelable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.os.Parcelable EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull StrategyReqGroup strategyReqGroup, @NotNull android.os.Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(strategyReqGroup, "");
            Intrinsics.checkNotNullParameter(parcelable, "");
            return new ActionBar(strategyReqGroup, parcelable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyReqGroup OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(requestGroup=" + this.KWHzl + ", duplicateParamsRequest=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull StrategyReqGroup strategyReqGroup, @NotNull android.os.Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(strategyReqGroup, "");
            Intrinsics.checkNotNullParameter(parcelable, "");
            this.KWHzl = strategyReqGroup;
            this.OLrzqt = parcelable;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Application application, @NotNull Continuation<? super ActionBar> continuation) {
        return AEQbTJ(application.KWHzl(), application.copydefault(), application.OLrzqt(), application.AEQbTJ(), application.EZpvd(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [107=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull StrategyBaseReq strategyBaseReq, @NotNull java.lang.String str, java.lang.String str2, boolean z, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        BotOrderRequestModelUseCase$map$1 botOrderRequestModelUseCase$map$1;
        StrategyBaseReq strategyBaseReq2;
        if (continuation instanceof BotOrderRequestModelUseCase$map$1) {
            botOrderRequestModelUseCase$map$1 = (BotOrderRequestModelUseCase$map$1) continuation;
            int i = botOrderRequestModelUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                botOrderRequestModelUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                botOrderRequestModelUseCase$map$1 = new BotOrderRequestModelUseCase$map$1(this, continuation);
            }
        }
        BotOrderRequestModelUseCase$map$1 botOrderRequestModelUseCase$map$12 = botOrderRequestModelUseCase$map$1;
        java.lang.Object objOLrzqt = botOrderRequestModelUseCase$map$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = botOrderRequestModelUseCase$map$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String ordType = strategyBaseReq.getOrdType();
            switch (ordType.hashCode()) {
                case -1831183611:
                    if (ordType.equals("spot_dca")) {
                        DcaOrderReq dcaOrderReqAEQbTJ = AEQbTJ(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, dcaOrderReqAEQbTJ, (AiOrderReq) null, 24574, (DefaultConstructorMarker) null), dcaOrderReqAEQbTJ);
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case -1402017003:
                    if (ordType.equals("contract_dca")) {
                        DcaOrderReq dcaOrderReqAEQbTJ2 = AEQbTJ(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, dcaOrderReqAEQbTJ2, (AiOrderReq) null, 24574, (DefaultConstructorMarker) null), dcaOrderReqAEQbTJ2);
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case -1216369070:
                    if (ordType.equals("smart_portfolio")) {
                        SmartPortfolioReq smartPortfolioReqCopydefault = copydefault(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, smartPortfolioReqCopydefault, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32254, (DefaultConstructorMarker) null), smartPortfolioReqCopydefault);
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case -557961837:
                    if (ordType.equals("smart_arbitrage")) {
                        botOrderRequestModelUseCase$map$12.L$0 = strategyBaseReq;
                        botOrderRequestModelUseCase$map$12.label = 1;
                        objOLrzqt = OLrzqt(strategyDetailsResponse, str, z, str2, botOrderRequestModelUseCase$map$12);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        strategyBaseReq2 = strategyBaseReq;
                        break;
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case -512749997:
                    if (ordType.equals("contract_grid")) {
                        kotlin.Pair<ContractGridReq, android.os.Parcelable> pairKWHzl = KWHzl(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, pairKWHzl.component1(), (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32750, (DefaultConstructorMarker) null), pairKWHzl.component2());
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case 3181382:
                    if (ordType.equals("grid")) {
                        kotlin.Pair<GridReq, android.os.Parcelable> pairOLrzqt = OLrzqt(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, pairOLrzqt.component1(), (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32758, (DefaultConstructorMarker) null), pairOLrzqt.component2());
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                case 1165749981:
                    if (ordType.equals("recurring")) {
                        RecurringOrderData recurringOrderDataEZpvd = EZpvd(strategyDetailsResponse, str, str2);
                        return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, recurringOrderDataEZpvd, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32510, (DefaultConstructorMarker) null), recurringOrderDataEZpvd);
                    }
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
                default:
                    return new ActionBar(new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null), strategyBaseReq);
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        StrategyBaseReq strategyBaseReq3 = (StrategyBaseReq) botOrderRequestModelUseCase$map$12.L$0;
        C56391yDq.AEQbTJ(objOLrzqt);
        strategyBaseReq2 = strategyBaseReq3;
        SmartArbitrageReq smartArbitrageReq = (SmartArbitrageReq) objOLrzqt;
        return new ActionBar(new StrategyReqGroup(strategyBaseReq2, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, smartArbitrageReq, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32638, (DefaultConstructorMarker) null), smartArbitrageReq);
    }

    public final kotlin.Pair<GridReq, android.os.Parcelable> OLrzqt(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2) {
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        java.lang.String runType = strategyDetailsResponse.getRunType();
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ordType = strategyDetailsResponse.getOrdType();
        boolean reserveFunds = strategyDetailsResponse.getReserveFunds();
        java.util.ArrayList<AdvancedTriggerSign> arrayListOLrzqt = OLrzqt(strategyDetailsResponse.getSignParams());
        TrailingConfig trailingDownConfig = strategyDetailsResponse.getTrailingDownConfig();
        GridReq gridReq = new GridReq(maxPx, minPx, gridNum, runType, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, arrayListOLrzqt, java.lang.Boolean.valueOf(reserveFunds), strategyDetailsResponse.getTrailingUpConfig(), trailingDownConfig, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, instId, instType, ordType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, str2, (ProfitAutoReinvestParam) null, -7462944, 11, (DefaultConstructorMarker) null);
        java.lang.String maxPx2 = strategyDetailsResponse.getMaxPx();
        java.lang.String minPx2 = strategyDetailsResponse.getMinPx();
        java.lang.String gridNum2 = strategyDetailsResponse.getGridNum();
        java.lang.String runType2 = strategyDetailsResponse.getRunType();
        java.lang.String instId2 = strategyDetailsResponse.getInstId();
        boolean reserveFunds2 = strategyDetailsResponse.getReserveFunds();
        java.util.ArrayList<AdvancedTriggerSign> arrayListOLrzqt2 = OLrzqt(strategyDetailsResponse.getSignParams());
        TrailingConfig trailingDownConfig2 = strategyDetailsResponse.getTrailingDownConfig();
        java.lang.String str3 = null;
        return C56390yDp.OLrzqt(gridReq, new AIData(instId2, gridNum2, maxPx2, minPx2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, runType2, (java.lang.String) null, (java.lang.String) null, str3, (java.util.ArrayList) arrayListOLrzqt2, java.lang.Boolean.valueOf(reserveFunds2), strategyDetailsResponse.getTrailingUpConfig(), trailingDownConfig2, false, str3, (java.lang.String) null, (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -138442896, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
    }

    public final java.util.ArrayList<AdvancedTriggerSign> OLrzqt(java.util.List<SignParamItem> list) {
        java.util.List<SignParamItem> listAxsJAYsNCnLh = list != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list) : null;
        if (listAxsJAYsNCnLh == null) {
            listAxsJAYsNCnLh = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAxsJAYsNCnLh, 10));
        for (SignParamItem signParamItem : listAxsJAYsNCnLh) {
            arrayList.add(new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, signParamItem.getTriggerPx(), signParamItem.getDelaySeconds(), signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), signParamItem.getThold(), (java.lang.String) null, signParamItem.getStopType(), (java.lang.String) null, 2564, (DefaultConstructorMarker) null));
        }
        return new java.util.ArrayList<>(arrayList);
    }

    public final kotlin.Pair<ContractGridReq, android.os.Parcelable> KWHzl(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2) {
        Triple triple = new Triple(str, null, null);
        java.lang.String str3 = (java.lang.String) triple.component1();
        java.lang.String str4 = (java.lang.String) triple.component2();
        java.lang.Object obj = (java.lang.Void) triple.component3();
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        java.lang.String runType = strategyDetailsResponse.getRunType();
        java.lang.String slTriggerPx = strategyDetailsResponse.getSlTriggerPx();
        java.lang.String tpTriggerPx = strategyDetailsResponse.getTpTriggerPx();
        java.lang.String tpRatio = strategyDetailsResponse.getTpRatio();
        java.lang.String slRatio = strategyDetailsResponse.getSlRatio();
        java.lang.String tpTriggerPx2 = strategyDetailsResponse.getTpTriggerPx();
        java.lang.String slTriggerPx2 = strategyDetailsResponse.getSlTriggerPx();
        java.lang.String lever = strategyDetailsResponse.getLever();
        java.lang.String ordType = strategyDetailsResponse.getOrdType();
        java.lang.String annualizedRate = strategyDetailsResponse.getAnnualizedRate();
        java.lang.String investType = strategyDetailsResponse.getInvestType();
        java.lang.String direction = strategyDetailsResponse.getDirection();
        java.util.ArrayList<AdvancedTriggerSign> arrayListOLrzqt = OLrzqt(strategyDetailsResponse.getSignParams());
        ContractGridReq contractGridReq = new ContractGridReq(instId, instType, java.lang.Boolean.valueOf(strategyDetailsResponse.getBasePos()), gridNum, investType, maxPx, minPx, str3, runType, slTriggerPx, tpTriggerPx, tpRatio, slRatio, tpTriggerPx2, slTriggerPx2, direction, (java.lang.String) null, lever, arrayListOLrzqt, (java.lang.String) null, ordType, annualizedRate, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, str4, (java.lang.String) obj, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -943128576, 15, (DefaultConstructorMarker) null);
        java.lang.String minPx2 = strategyDetailsResponse.getMinPx();
        java.lang.String maxPx2 = strategyDetailsResponse.getMaxPx();
        java.lang.String runType2 = strategyDetailsResponse.getRunType();
        java.lang.String gridNum2 = strategyDetailsResponse.getGridNum();
        java.lang.String tpTriggerPx3 = strategyDetailsResponse.getTpTriggerPx();
        java.lang.String slTriggerPx3 = strategyDetailsResponse.getSlTriggerPx();
        java.lang.String tpRatio2 = strategyDetailsResponse.getTpRatio();
        java.lang.String slRatio2 = strategyDetailsResponse.getSlRatio();
        boolean basePos = strategyDetailsResponse.getBasePos();
        return C56390yDp.OLrzqt(contractGridReq, new AIData((java.lang.String) null, gridNum2, maxPx2, minPx2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, runType2, strategyDetailsResponse.getDirection(), (java.lang.String) null, strategyDetailsResponse.getLever(), (java.util.ArrayList) OLrzqt(strategyDetailsResponse.getSignParams()), (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, basePos, tpTriggerPx3, slTriggerPx3, (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, tpRatio2, slRatio2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -29592975, 3, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, boolean z, java.lang.String str2, Continuation<? super SmartArbitrageReq> continuation) throws java.lang.Throwable {
        BotOrderRequestModelUseCase$createSmartArbitrageReq$1 botOrderRequestModelUseCase$createSmartArbitrageReq$1;
        SubArbitrageType4Remote subArbitrageType4Remote;
        ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI;
        SubArbitrageType4Remote subArbitrageType4Remote2;
        ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI2;
        StrategyDetailsResponse strategyDetailsResponse2;
        java.lang.String str3;
        java.lang.Object next;
        SmartArbitrageVo smartArbitrage;
        PlaceOrderCondition openCondition;
        ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI3;
        ArbitrageInfoResponse arbitrageInfoResponse;
        java.lang.Object next2;
        SmartArbitrageVo smartArbitrage2;
        if (continuation instanceof BotOrderRequestModelUseCase$createSmartArbitrageReq$1) {
            botOrderRequestModelUseCase$createSmartArbitrageReq$1 = (BotOrderRequestModelUseCase$createSmartArbitrageReq$1) continuation;
            int i = botOrderRequestModelUseCase$createSmartArbitrageReq$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                botOrderRequestModelUseCase$createSmartArbitrageReq$1.label = i - Integer.MIN_VALUE;
            } else {
                botOrderRequestModelUseCase$createSmartArbitrageReq$1 = new BotOrderRequestModelUseCase$createSmartArbitrageReq$1(this, continuation);
            }
        }
        java.lang.Object obj = botOrderRequestModelUseCase$createSmartArbitrageReq$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = botOrderRequestModelUseCase$createSmartArbitrageReq$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<SubArbitrageType4Remote> subArbTypes = strategyDetailsResponse.getSubArbTypes();
            if (subArbTypes != null) {
                java.util.Iterator<T> it = subArbTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (((SubArbitrageType4Remote) next2) == SubArbitrageType4Remote.STAKE) {
                        break;
                    }
                }
                subArbitrageType4Remote = (SubArbitrageType4Remote) next2;
            } else {
                subArbitrageType4Remote = null;
            }
            if (subArbitrageType4Remote != null) {
                arbInvestDetailsBeanStakingType4UI = ArbInvestDetailsBeanStakingType4UI.STAKING;
            } else {
                arbInvestDetailsBeanStakingType4UI = ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING;
            }
            if (!z) {
                wTM wtm = this.AEQbTJ;
                java.lang.String instFamily = strategyDetailsResponse.getInstFamily();
                java.lang.String strAEQbTJ = (instFamily == null || instFamily.length() == 0) ? xUW.KWHzl.AEQbTJ(strategyDetailsResponse.getInstId()) : instFamily;
                BotVo bot = strategyDetailsResponse.getBot();
                java.lang.String spreadRatio = (bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null || (openCondition = smartArbitrage.getOpenCondition()) == null) ? null : openCondition.getSpreadRatio();
                java.lang.String algoId = strategyDetailsResponse.getAlgoId();
                java.lang.Float leveragePrincipal = strategyDetailsResponse.getLeveragePrincipal();
                java.util.List<SubArbitrageType4Remote> subArbTypes2 = strategyDetailsResponse.getSubArbTypes();
                if (subArbTypes2 != null) {
                    java.util.Iterator<T> it2 = subArbTypes2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((SubArbitrageType4Remote) next) == SubArbitrageType4Remote.STAKE) {
                            break;
                        }
                    }
                    subArbitrageType4Remote2 = (SubArbitrageType4Remote) next;
                } else {
                    subArbitrageType4Remote2 = null;
                }
                wTM.Activity activity = new wTM.Activity(strAEQbTJ, str, "simpleFundingFee", spreadRatio, algoId, "open", leveragePrincipal, subArbitrageType4Remote2, strategyDetailsResponse.getStopType());
                botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$0 = strategyDetailsResponse;
                botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$1 = str;
                botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$2 = arbInvestDetailsBeanStakingType4UI;
                botOrderRequestModelUseCase$createSmartArbitrageReq$1.label = 1;
                java.lang.Object objKWHzl = wtm.KWHzl(activity, botOrderRequestModelUseCase$createSmartArbitrageReq$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                arbInvestDetailsBeanStakingType4UI2 = arbInvestDetailsBeanStakingType4UI;
                obj = objKWHzl;
                strategyDetailsResponse2 = strategyDetailsResponse;
                str3 = str;
            } else {
                strategyDetailsResponse2 = strategyDetailsResponse;
                str3 = str;
                arbInvestDetailsBeanStakingType4UI3 = arbInvestDetailsBeanStakingType4UI;
                arbitrageInfoResponse = null;
                BotVo bot2 = strategyDetailsResponse2.getBot();
                return new SmartArbitrageReq(strategyDetailsResponse2.getUly(), str3, "simpleFundingFee", arbitrageInfoResponse != null ? new ArbInvestDetailsBean(arbitrageInfoResponse.getArbItems(), str3, strategyDetailsResponse2.getCcy(), (java.lang.String) null, arbitrageInfoResponse.getEstimatingEnlargeArbPnl(), strategyDetailsResponse2.getInstFamily(), arbInvestDetailsBeanStakingType4UI3, arbitrageInfoResponse.getSpreadRatio(), arbitrageInfoResponse.getMarketSpreadRatio(), arbitrageInfoResponse.getUnitAmt(), arbitrageInfoResponse.getMinUnitAmt(), arbitrageInfoResponse.getUserExpectSpreadRatio(), arbitrageInfoResponse.getUserExpectUnitAmt(), arbitrageInfoResponse.getArbitrageTotalPnlInfo(), arbitrageInfoResponse.getAllowLeverPrincipal(), arbitrageInfoResponse.getEnlargedAmt(), arbitrageInfoResponse.getInterestDebt(), arbitrageInfoResponse.getEstimatedStaking(), arbitrageInfoResponse.getMinAmt(), arbitrageInfoResponse.getDisplayMinPaybackDays(), arbitrageInfoResponse.getHighestApyPeriod(), arbitrageInfoResponse.getEstimatedApyList(), arbitrageInfoResponse.getEstimatedOpenCost(), arbitrageInfoResponse.getEstimatedClosePnl(), arbitrageInfoResponse.getCloseCost(), arbitrageInfoResponse.getOpenCost(), 8, (DefaultConstructorMarker) null) : null, strategyDetailsResponse2.getLeveragePrincipal(), (bot2 != null || (smartArbitrage2 = bot2.getSmartArbitrage()) == null) ? null : smartArbitrage2.getOpenCondition(), (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (StrategyConfigInfo) null, (java.lang.String) null, 1984, (DefaultConstructorMarker) null);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arbInvestDetailsBeanStakingType4UI2 = (ArbInvestDetailsBeanStakingType4UI) botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$2;
            str3 = (java.lang.String) botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$1;
            strategyDetailsResponse2 = (StrategyDetailsResponse) botOrderRequestModelUseCase$createSmartArbitrageReq$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        arbitrageInfoResponse = (ArbitrageInfoResponse) obj;
        arbInvestDetailsBeanStakingType4UI3 = arbInvestDetailsBeanStakingType4UI2;
        BotVo bot22 = strategyDetailsResponse2.getBot();
        if (bot22 != null) {
        }
        return new SmartArbitrageReq(strategyDetailsResponse2.getUly(), str3, "simpleFundingFee", arbitrageInfoResponse != null ? new ArbInvestDetailsBean(arbitrageInfoResponse.getArbItems(), str3, strategyDetailsResponse2.getCcy(), (java.lang.String) null, arbitrageInfoResponse.getEstimatingEnlargeArbPnl(), strategyDetailsResponse2.getInstFamily(), arbInvestDetailsBeanStakingType4UI3, arbitrageInfoResponse.getSpreadRatio(), arbitrageInfoResponse.getMarketSpreadRatio(), arbitrageInfoResponse.getUnitAmt(), arbitrageInfoResponse.getMinUnitAmt(), arbitrageInfoResponse.getUserExpectSpreadRatio(), arbitrageInfoResponse.getUserExpectUnitAmt(), arbitrageInfoResponse.getArbitrageTotalPnlInfo(), arbitrageInfoResponse.getAllowLeverPrincipal(), arbitrageInfoResponse.getEnlargedAmt(), arbitrageInfoResponse.getInterestDebt(), arbitrageInfoResponse.getEstimatedStaking(), arbitrageInfoResponse.getMinAmt(), arbitrageInfoResponse.getDisplayMinPaybackDays(), arbitrageInfoResponse.getHighestApyPeriod(), arbitrageInfoResponse.getEstimatedApyList(), arbitrageInfoResponse.getEstimatedOpenCost(), arbitrageInfoResponse.getEstimatedClosePnl(), arbitrageInfoResponse.getCloseCost(), arbitrageInfoResponse.getOpenCost(), 8, (DefaultConstructorMarker) null) : null, strategyDetailsResponse2.getLeveragePrincipal(), (bot22 != null || (smartArbitrage2 = bot22.getSmartArbitrage()) == null) ? null : smartArbitrage2.getOpenCondition(), (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (StrategyConfigInfo) null, (java.lang.String) null, 1984, (DefaultConstructorMarker) null);
    }

    public static final java.lang.CharSequence OLrzqt(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        return smartPortfolioListItem.getCcy();
    }

    public final SmartPortfolioReq copydefault(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = CollectionsKt___CollectionsKt.joinToString$default(strategyDetailsResponse.getPortfolioList(), null, null, null, 3, null, new Function1() { // from class: o.wrx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53784wry.OLrzqt((SmartPortfolioListItem) obj);
            }
        }, 23, null) + " " + C33070mpX.AYXKKw(C55688xof.Application.to);
        java.util.List listEZpvd = C56402yEa.EZpvd(new CoinAssetParam(str2 == null ? strategyDetailsResponse.getInvestCcy() : str2, str));
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyDetailsResponse.getPortfolioList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SmartPortfolioListItem smartPortfolioListItem : portfolioList) {
            CoinRatioParam coinRatioParam = (Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyDetailsResponse.getInvestCcy()) || Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyDetailsResponse.getTradeQuoteCcy())) ? null : new CoinRatioParam(smartPortfolioListItem.getCcy(), smartPortfolioListItem.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
            if (coinRatioParam != null) {
                arrayList.add(coinRatioParam);
            }
        }
        return new SmartPortfolioReq(str3, listEZpvd, arrayList, strategyDetailsResponse.getBalType(), strategyDetailsResponse.getInterval(), strategyDetailsResponse.getDeltaRatio(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strategyDetailsResponse.getInvestCcy(), (java.lang.String) null, (java.lang.String) null, str2, 7104, (DefaultConstructorMarker) null);
    }

    public final RecurringOrderData EZpvd(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2) {
        java.lang.String strAYXKKw;
        xOW newProxyInstance;
        if (!strategyDetailsResponse.getRecurringList().isEmpty()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getName);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setSessionImpl);
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(strategyDetailsResponse.getRecurringList(), null, null, null, 3, null, new Function1() { // from class: o.wrw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53784wry.copydefault((RecurringListItem) obj);
            }
        }, 23, null);
        int offset = new GregorianCalendar().getTimeZone().getOffset(java.lang.System.currentTimeMillis()) / 3600000;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean z = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.gEmmrt()) ? false : true;
        java.lang.String str3 = strJoinToString$default + " " + strAYXKKw;
        java.lang.String period = strategyDetailsResponse.getPeriod();
        java.lang.String recurringDay = strategyDetailsResponse.getRecurringDay();
        java.lang.String recurringTime = strategyDetailsResponse.getRecurringTime();
        java.lang.String recurringHour = strategyDetailsResponse.getRecurringHour();
        java.lang.String investCcy = strategyDetailsResponse.getInvestCcy();
        java.lang.String str4 = z ? "cross" : "cash";
        java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
        for (RecurringListItem recurringListItem : recurringList) {
            arrayList.add(new CoinRatioParam(recurringListItem.getCcy(), recurringListItem.getRatio(), recurringListItem.getMinPrice(), recurringListItem.getMaxPrice()));
        }
        return new RecurringOrderData(arrayList, str3, period, recurringDay, recurringTime, recurringHour, java.lang.String.valueOf(offset), str, investCcy, str4, (java.lang.String) null, str2, (java.util.List) null, (java.lang.Integer) null, 13312, (DefaultConstructorMarker) null);
    }

    public static final java.lang.CharSequence copydefault(RecurringListItem recurringListItem) {
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        return recurringListItem.getCcy();
    }

    public final DcaOrderReq AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2) {
        java.lang.String safetyOrdRatio = strategyDetailsResponse.getSafetyOrdRatio();
        if (safetyOrdRatio == null) {
            safetyOrdRatio = "";
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), str, strategyDetailsResponse.getReserveFunds(), strategyDetailsResponse.getMaxSafetyOrds(), strategyDetailsResponse.getVolMult(), safetyOrdRatio);
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String ordType = strategyDetailsResponse.getOrdType();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
        java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
        java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
        java.lang.String volMult = strategyDetailsResponse.getVolMult();
        java.lang.String tpPct = strategyDetailsResponse.getTpPct();
        java.lang.String slPct = strategyDetailsResponse.getSlPct();
        java.lang.String direction = strategyDetailsResponse.getDirection();
        java.lang.String mode = SpotDcaInvestTypeData.MANUAL.getMode();
        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
        boolean autoMarginReloadSwitch = strategyDetailsResponse.getAutoMarginReloadSwitch();
        java.lang.String autoMarginReloadMaxAmount = strategyDetailsResponse.getAutoMarginReloadMaxAmount();
        java.lang.String reinvestment = strategyDetailsResponse.getReinvestment();
        if (reinvestment == null) {
            reinvestment = "false";
        }
        java.lang.String str3 = reinvestment;
        java.lang.String slMode = strategyDetailsResponse.getSlMode();
        java.lang.String str4 = slMode.length() > 0 ? slMode : null;
        java.lang.String lever = strategyDetailsResponse.getLever();
        return new DcaOrderReq(instId, strComponent1, java.lang.Boolean.TRUE, strComponent2, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, direction, mode, str, (java.lang.String) null, (java.lang.String) null, lever.length() > 0 ? lever : null, str4, (java.util.List) triggerParams, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str3, false, autoMarginReloadSwitch, autoMarginReloadMaxAmount, (java.lang.String) null, instType, (java.lang.String) null, ordType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str2, (AutoVipProfitInfo) null, -725852160, 11, (DefaultConstructorMarker) null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.String strDivS$default;
        java.lang.String strMulS$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String quoteDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(str2)) != null) {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        int iAhwBna = (quoteDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) quoteDig)) ? 8 : C33129mqd.AhwBna(quoteDig);
        if (z) {
            int iAhwBna2 = C33129mqd.AhwBna(str4);
            java.lang.String strAddS$default = "0";
            for (int i = 0; i < iAhwBna2; i++) {
                strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str5), i)), null, null, null, 14, null);
            }
            strDivS$default = C33129mqd.divS$default(str3, C33129mqd.addS$default(C33129mqd.mulS$default(str6, strAddS$default, null, null, null, 14, null), 1, null, null, null, 14, null), null, null, null, 14, null);
            strMulS$default = C33129mqd.mulS$default(strDivS$default, str6, null, null, null, 14, null);
        } else {
            strDivS$default = C33129mqd.divS$default(str3, C33129mqd.addS$default(str6, 1, null, null, null, 14, null), null, null, null, 14, null);
            strMulS$default = C33129mqd.mulS$default(strDivS$default, str6, null, null, null, 14, null);
        }
        int iMax = java.lang.Math.max(iAhwBna, 8);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return new kotlin.Pair<>(C33129mqd.formatS$default(strDivS$default, java.lang.Integer.valueOf(iMax), null, roundingMode, 2, null), C33129mqd.formatS$default(strMulS$default, java.lang.Integer.valueOf(iMax), null, roundingMode, 2, null));
    }
}

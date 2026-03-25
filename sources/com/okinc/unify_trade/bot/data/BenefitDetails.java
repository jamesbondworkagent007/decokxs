package com.okinc.unify_trade.bot.data;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbListItem$$serializer;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingConfig$$serializer;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto$$serializer;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BenefitDetails {
    private String actualMarginSz;
    private final String additionalFundNeeded;
    private final String aigoId;
    private String alternateCurrency;
    private final String arbApy;
    private final ArrayList<SmartArbListItem> arbList;
    private final String arbPnl;
    private final String arbitragePnl;
    private final String autoEarnProfit;
    private final int autoEarnProfitColor;
    private final String autoEarnState;
    private final String autoStakeProfit;
    private final int autoStakeProfitColor;
    private final String autoStakeState;
    private final String availEq;
    private String avgCost;
    private final String avgPx;
    private final BalanceDetailInfoDto botBalanceDetails;
    private String coinPnl;
    private final String completedCycles;
    private String curSettlementTime;
    private String curStrike;
    private String currency;
    private String currencyBal;
    private String cycle;
    private String dcdOptionType;
    private String dcdState;
    private final String debtCcy;
    private final String displayPriceUnit;
    private final String eq;
    private String extraMarginSz;
    private final String fee;
    private final String fillSafetyOrds;
    private final String floatProfit;
    private final int floatProfitColor;
    private final String fundingFee;
    private final int fundingFeeColor;
    private final String gridProfit;
    private final int gridProfitColor;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String investAmt;
    private final String investCcy;
    private final String investment;
    private final String investmentAmt;
    private final String investmentCcy;
    private final boolean isHistory;
    private String lastPrice;
    private StrategyProfitResponse latestProfit;
    private final String maturedApy;
    private final String maxBotUsage;
    private final String maxSafetyOrds;
    private String maxSettlementDay;
    private String minAnnualYieldPercentage;
    private final String mktCap;
    private final String netMarginTransfer;
    private String notional;
    private String notionalCcy;
    private final String ordFrozen;
    private final String orderType;
    private final String pnlCcy;
    private final String pnlRatio;
    private final String priceUnit;
    private final List<StrategyProfitResponse> profitList;
    private final String realizedPnl;
    private final String rebateTrans;
    private String reinvestment;
    private String reserveFundingFee;
    private final boolean reserveFunds;
    private final String smartEarnProfit;
    private final int smartEarnProfitColor;
    private final String sourceCcy;
    private final String spreadPnl;
    private String stakingPnl;
    private final String stakingPnlApy;
    private String stakingPnlUSDT;
    private String stakingPosCcy;
    private String stopPercentage;
    private String stopPrice;
    private String strike;
    private String strikePercentage;
    private List<? extends SubArbitrageType4Remote> subArbTypes;
    private String term;
    private final String totalAmt;
    private final String totalAnnualizedRate;
    private final String totalApy;
    private final String totalCycleProfit;
    private final int totalCycleProfitColor;
    private final String totalInterestAmt;
    private final String totalPnl;
    private final String totalSpreadProfit;
    private TrailingConfig trailingDownConfig;
    private String trailingDownFund;
    private String transferInMargin;
    private final int tvPnlColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SubArbitrageType4Remote.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BenefitDetails() {
        this(null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.aigoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.totalAnnualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.rebateTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.totalCycleProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.additionalFundNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component36() {
        return this.tvPnlColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.transferInMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.reserveFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.netMarginTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component45() {
        return this.fundingFeeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.spreadPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.arbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> component49() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.maturedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.stakingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.stakingPnlApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.stakingPnlUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.stakingPosCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> component59() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.displayPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.smartEarnProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component61() {
        return this.smartEarnProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component62() {
        return this.floatProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.autoStakeProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component64() {
        return this.autoStakeProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.autoEarnProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component66() {
        return this.autoEarnProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.autoEarnState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.autoStakeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.gridProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.stopPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.stopPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component83() {
        return this.curStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.curSettlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component88() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component89() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component92() {
        return this.profitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component93() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto component94() {
        return this.botBalanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component95() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BenefitDetails copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, @NotNull String str29, @NotNull String str30, @NotNull String str31, boolean z, boolean z2, int i3, String str32, String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, int i4, String str40, String str41, String str42, ArrayList<SmartArbListItem> arrayList, String str43, String str44, String str45, String str46, @NotNull String str47, String str48, String str49, String str50, @NotNull String str51, List<? extends SubArbitrageType4Remote> list, String str52, int i5, int i6, String str53, int i7, String str54, int i8, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, List<StrategyProfitResponse> list2, StrategyProfitResponse strategyProfitResponse, BalanceDetailInfoDto balanceDetailInfoDto, TrailingConfig trailingConfig, String str80) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str51, "");
        return new BenefitDetails(str, str2, str3, str4, str5, str6, str7, i, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i2, str29, str30, str31, z, z2, i3, str32, str33, str34, str35, str36, str37, str38, str39, i4, str40, str41, str42, arrayList, str43, str44, str45, str46, str47, str48, str49, str50, str51, list, str52, i5, i6, str53, i7, str54, i8, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, list2, strategyProfitResponse, balanceDetailInfoDto, trailingConfig, str80);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitDetails)) {
            return false;
        }
        BenefitDetails benefitDetails = (BenefitDetails) obj;
        return Intrinsics.EZpvd((Object) this.aigoId, (Object) benefitDetails.aigoId) && Intrinsics.EZpvd((Object) this.orderType, (Object) benefitDetails.orderType) && Intrinsics.EZpvd((Object) this.instId, (Object) benefitDetails.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) benefitDetails.instType) && Intrinsics.EZpvd((Object) this.priceUnit, (Object) benefitDetails.priceUnit) && Intrinsics.EZpvd((Object) this.displayPriceUnit, (Object) benefitDetails.displayPriceUnit) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) benefitDetails.gridProfit) && this.gridProfitColor == benefitDetails.gridProfitColor && Intrinsics.EZpvd((Object) this.floatProfit, (Object) benefitDetails.floatProfit) && Intrinsics.EZpvd((Object) this.investment, (Object) benefitDetails.investment) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) benefitDetails.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) benefitDetails.extraMarginSz) && Intrinsics.EZpvd((Object) this.totalAnnualizedRate, (Object) benefitDetails.totalAnnualizedRate) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) benefitDetails.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) benefitDetails.pnlRatio) && Intrinsics.EZpvd((Object) this.arbApy, (Object) benefitDetails.arbApy) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) benefitDetails.pnlCcy) && Intrinsics.EZpvd((Object) this.mktCap, (Object) benefitDetails.mktCap) && Intrinsics.EZpvd((Object) this.eq, (Object) benefitDetails.eq) && Intrinsics.EZpvd((Object) this.investCcy, (Object) benefitDetails.investCcy) && Intrinsics.EZpvd((Object) this.investAmt, (Object) benefitDetails.investAmt) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) benefitDetails.investmentAmt) && Intrinsics.EZpvd((Object) this.investmentCcy, (Object) benefitDetails.investmentCcy) && Intrinsics.EZpvd((Object) this.avgPx, (Object) benefitDetails.avgPx) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) benefitDetails.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) benefitDetails.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) benefitDetails.completedCycles) && Intrinsics.EZpvd((Object) this.rebateTrans, (Object) benefitDetails.rebateTrans) && Intrinsics.EZpvd((Object) this.totalCycleProfit, (Object) benefitDetails.totalCycleProfit) && this.totalCycleProfitColor == benefitDetails.totalCycleProfitColor && Intrinsics.EZpvd((Object) this.arbitragePnl, (Object) benefitDetails.arbitragePnl) && Intrinsics.EZpvd((Object) this.additionalFundNeeded, (Object) benefitDetails.additionalFundNeeded) && Intrinsics.EZpvd((Object) this.maxBotUsage, (Object) benefitDetails.maxBotUsage) && this.reserveFunds == benefitDetails.reserveFunds && this.isHistory == benefitDetails.isHistory && this.tvPnlColor == benefitDetails.tvPnlColor && Intrinsics.EZpvd((Object) this.transferInMargin, (Object) benefitDetails.transferInMargin) && Intrinsics.EZpvd((Object) this.reserveFundingFee, (Object) benefitDetails.reserveFundingFee) && Intrinsics.EZpvd((Object) this.ordFrozen, (Object) benefitDetails.ordFrozen) && Intrinsics.EZpvd((Object) this.availEq, (Object) benefitDetails.availEq) && Intrinsics.EZpvd((Object) this.realizedPnl, (Object) benefitDetails.realizedPnl) && Intrinsics.EZpvd((Object) this.netMarginTransfer, (Object) benefitDetails.netMarginTransfer) && Intrinsics.EZpvd((Object) this.fee, (Object) benefitDetails.fee) && Intrinsics.EZpvd((Object) this.fundingFee, (Object) benefitDetails.fundingFee) && this.fundingFeeColor == benefitDetails.fundingFeeColor && Intrinsics.EZpvd((Object) this.spreadPnl, (Object) benefitDetails.spreadPnl) && Intrinsics.EZpvd((Object) this.arbPnl, (Object) benefitDetails.arbPnl) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) benefitDetails.totalAmt) && Intrinsics.EZpvd(this.arbList, benefitDetails.arbList) && Intrinsics.EZpvd((Object) this.instFamily, (Object) benefitDetails.instFamily) && Intrinsics.EZpvd((Object) this.maturedApy, (Object) benefitDetails.maturedApy) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) benefitDetails.sourceCcy) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) benefitDetails.totalInterestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) benefitDetails.debtCcy) && Intrinsics.EZpvd((Object) this.stakingPnl, (Object) benefitDetails.stakingPnl) && Intrinsics.EZpvd((Object) this.stakingPnlApy, (Object) benefitDetails.stakingPnlApy) && Intrinsics.EZpvd((Object) this.stakingPnlUSDT, (Object) benefitDetails.stakingPnlUSDT) && Intrinsics.EZpvd((Object) this.stakingPosCcy, (Object) benefitDetails.stakingPosCcy) && Intrinsics.EZpvd(this.subArbTypes, benefitDetails.subArbTypes) && Intrinsics.EZpvd((Object) this.smartEarnProfit, (Object) benefitDetails.smartEarnProfit) && this.smartEarnProfitColor == benefitDetails.smartEarnProfitColor && this.floatProfitColor == benefitDetails.floatProfitColor && Intrinsics.EZpvd((Object) this.autoStakeProfit, (Object) benefitDetails.autoStakeProfit) && this.autoStakeProfitColor == benefitDetails.autoStakeProfitColor && Intrinsics.EZpvd((Object) this.autoEarnProfit, (Object) benefitDetails.autoEarnProfit) && this.autoEarnProfitColor == benefitDetails.autoEarnProfitColor && Intrinsics.EZpvd((Object) this.autoEarnState, (Object) benefitDetails.autoEarnState) && Intrinsics.EZpvd((Object) this.autoStakeState, (Object) benefitDetails.autoStakeState) && Intrinsics.EZpvd((Object) this.dcdState, (Object) benefitDetails.dcdState) && Intrinsics.EZpvd((Object) this.coinPnl, (Object) benefitDetails.coinPnl) && Intrinsics.EZpvd((Object) this.notional, (Object) benefitDetails.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) benefitDetails.notionalCcy) && Intrinsics.EZpvd((Object) this.currencyBal, (Object) benefitDetails.currencyBal) && Intrinsics.EZpvd((Object) this.currency, (Object) benefitDetails.currency) && Intrinsics.EZpvd((Object) this.avgCost, (Object) benefitDetails.avgCost) && Intrinsics.EZpvd((Object) this.cycle, (Object) benefitDetails.cycle) && Intrinsics.EZpvd((Object) this.term, (Object) benefitDetails.term) && Intrinsics.EZpvd((Object) this.alternateCurrency, (Object) benefitDetails.alternateCurrency) && Intrinsics.EZpvd((Object) this.strike, (Object) benefitDetails.strike) && Intrinsics.EZpvd((Object) this.strikePercentage, (Object) benefitDetails.strikePercentage) && Intrinsics.EZpvd((Object) this.stopPrice, (Object) benefitDetails.stopPrice) && Intrinsics.EZpvd((Object) this.stopPercentage, (Object) benefitDetails.stopPercentage) && Intrinsics.EZpvd((Object) this.curStrike, (Object) benefitDetails.curStrike) && Intrinsics.EZpvd((Object) this.dcdOptionType, (Object) benefitDetails.dcdOptionType) && Intrinsics.EZpvd((Object) this.curSettlementTime, (Object) benefitDetails.curSettlementTime) && Intrinsics.EZpvd((Object) this.minAnnualYieldPercentage, (Object) benefitDetails.minAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.maxSettlementDay, (Object) benefitDetails.maxSettlementDay) && Intrinsics.EZpvd((Object) this.reinvestment, (Object) benefitDetails.reinvestment) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) benefitDetails.lastPrice) && Intrinsics.EZpvd((Object) this.totalSpreadProfit, (Object) benefitDetails.totalSpreadProfit) && Intrinsics.EZpvd((Object) this.totalApy, (Object) benefitDetails.totalApy) && Intrinsics.EZpvd(this.profitList, benefitDetails.profitList) && Intrinsics.EZpvd(this.latestProfit, benefitDetails.latestProfit) && Intrinsics.EZpvd(this.botBalanceDetails, benefitDetails.botBalanceDetails) && Intrinsics.EZpvd(this.trailingDownConfig, benefitDetails.trailingDownConfig) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) benefitDetails.trailingDownFund);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalFundNeeded() {
        return this.additionalFundNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAigoId() {
        return this.aigoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternateCurrency() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbApy() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> getArbList() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbPnl() {
        return this.arbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitragePnl() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoEarnProfit() {
        return this.autoEarnProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAutoEarnProfitColor() {
        return this.autoEarnProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoEarnState() {
        return this.autoEarnState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakeProfit() {
        return this.autoStakeProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAutoStakeProfitColor() {
        return this.autoStakeProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakeState() {
        return this.autoStakeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgCost() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto getBotBalanceDetails() {
        return this.botBalanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPnl() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurSettlementTime() {
        return this.curSettlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurStrike() {
        return this.curStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyBal() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycle() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdOptionType() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdState() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcy() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayPriceUnit() {
        return this.displayPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfit() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFloatProfitColor() {
        return this.floatProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFundingFeeColor() {
        return this.fundingFeeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGridProfitColor() {
        return this.gridProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestAmt() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentAmt() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentCcy() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse getLatestProfit() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaturedApy() {
        return this.maturedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBotUsage() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSettlementDay() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAnnualYieldPercentage() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCap() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetMarginTransfer() {
        return this.netMarginTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdFrozen() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> getProfitList() {
        return this.profitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebateTrans() {
        return this.rebateTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFundingFee() {
        return this.reserveFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmartEarnProfit() {
        return this.smartEarnProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSmartEarnProfitColor() {
        return this.smartEarnProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadPnl() {
        return this.spreadPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingPnl() {
        return this.stakingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingPnlApy() {
        return this.stakingPnlApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingPnlUSDT() {
        return this.stakingPnlUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingPosCcy() {
        return this.stakingPosCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopPercentage() {
        return this.stopPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopPrice() {
        return this.stopPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePercentage() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> getSubArbTypes() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAnnualizedRate() {
        return this.totalAnnualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalApy() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCycleProfit() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCycleProfitColor() {
        return this.totalCycleProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalInterestAmt() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSpreadProfit() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrailingDownFund() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferInMargin() {
        return this.transferInMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTvPnlColor() {
        return this.tvPnlColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.aigoId.hashCode();
        int iHashCode2 = this.orderType.hashCode();
        int iHashCode3 = this.instId.hashCode();
        int iHashCode4 = this.instType.hashCode();
        int iHashCode5 = this.priceUnit.hashCode();
        String str = this.displayPriceUnit;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.gridProfit.hashCode();
        int iHashCode8 = Integer.hashCode(this.gridProfitColor);
        int iHashCode9 = this.floatProfit.hashCode();
        int iHashCode10 = this.investment.hashCode();
        int iHashCode11 = this.actualMarginSz.hashCode();
        int iHashCode12 = this.extraMarginSz.hashCode();
        int iHashCode13 = this.totalAnnualizedRate.hashCode();
        int iHashCode14 = this.totalPnl.hashCode();
        int iHashCode15 = this.pnlRatio.hashCode();
        int iHashCode16 = this.arbApy.hashCode();
        int iHashCode17 = this.pnlCcy.hashCode();
        int iHashCode18 = this.mktCap.hashCode();
        int iHashCode19 = this.eq.hashCode();
        int iHashCode20 = this.investCcy.hashCode();
        int iHashCode21 = this.investAmt.hashCode();
        int iHashCode22 = this.investmentAmt.hashCode();
        int iHashCode23 = this.investmentCcy.hashCode();
        int iHashCode24 = this.avgPx.hashCode();
        int iHashCode25 = this.fillSafetyOrds.hashCode();
        int iHashCode26 = this.maxSafetyOrds.hashCode();
        int iHashCode27 = this.completedCycles.hashCode();
        int iHashCode28 = this.rebateTrans.hashCode();
        int iHashCode29 = this.totalCycleProfit.hashCode();
        int iHashCode30 = Integer.hashCode(this.totalCycleProfitColor);
        int iHashCode31 = this.arbitragePnl.hashCode();
        int iHashCode32 = this.additionalFundNeeded.hashCode();
        int iHashCode33 = this.maxBotUsage.hashCode();
        int iHashCode34 = Boolean.hashCode(this.reserveFunds);
        int iHashCode35 = Boolean.hashCode(this.isHistory);
        int iHashCode36 = Integer.hashCode(this.tvPnlColor);
        String str2 = this.transferInMargin;
        int iHashCode37 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.reserveFundingFee;
        int iHashCode38 = str3 == null ? 0 : str3.hashCode();
        int iHashCode39 = this.ordFrozen.hashCode();
        int iHashCode40 = this.availEq.hashCode();
        int iHashCode41 = this.realizedPnl.hashCode();
        int iHashCode42 = this.netMarginTransfer.hashCode();
        int iHashCode43 = this.fee.hashCode();
        int iHashCode44 = this.fundingFee.hashCode();
        int iHashCode45 = Integer.hashCode(this.fundingFeeColor);
        String str4 = this.spreadPnl;
        int iHashCode46 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.arbPnl;
        int iHashCode47 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalAmt;
        int iHashCode48 = str6 == null ? 0 : str6.hashCode();
        ArrayList<SmartArbListItem> arrayList = this.arbList;
        int iHashCode49 = arrayList == null ? 0 : arrayList.hashCode();
        String str7 = this.instFamily;
        int iHashCode50 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maturedApy;
        int iHashCode51 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.sourceCcy;
        int iHashCode52 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.totalInterestAmt;
        int iHashCode53 = str10 == null ? 0 : str10.hashCode();
        int iHashCode54 = this.debtCcy.hashCode();
        String str11 = this.stakingPnl;
        int iHashCode55 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.stakingPnlApy;
        int iHashCode56 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.stakingPnlUSDT;
        int iHashCode57 = str13 == null ? 0 : str13.hashCode();
        int iHashCode58 = this.stakingPosCcy.hashCode();
        List<? extends SubArbitrageType4Remote> list = this.subArbTypes;
        int iHashCode59 = list == null ? 0 : list.hashCode();
        String str14 = this.smartEarnProfit;
        int iHashCode60 = str14 == null ? 0 : str14.hashCode();
        int iHashCode61 = Integer.hashCode(this.smartEarnProfitColor);
        int iHashCode62 = Integer.hashCode(this.floatProfitColor);
        String str15 = this.autoStakeProfit;
        int iHashCode63 = str15 == null ? 0 : str15.hashCode();
        int iHashCode64 = Integer.hashCode(this.autoStakeProfitColor);
        String str16 = this.autoEarnProfit;
        int iHashCode65 = str16 == null ? 0 : str16.hashCode();
        int iHashCode66 = Integer.hashCode(this.autoEarnProfitColor);
        String str17 = this.autoEarnState;
        int iHashCode67 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.autoStakeState;
        int iHashCode68 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.dcdState;
        int iHashCode69 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.coinPnl;
        int iHashCode70 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.notional;
        int iHashCode71 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.notionalCcy;
        int iHashCode72 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.currencyBal;
        int iHashCode73 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.currency;
        int iHashCode74 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.avgCost;
        int iHashCode75 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.cycle;
        int iHashCode76 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.term;
        int iHashCode77 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.alternateCurrency;
        int iHashCode78 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.strike;
        int iHashCode79 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.strikePercentage;
        int iHashCode80 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.stopPrice;
        int iHashCode81 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.stopPercentage;
        int iHashCode82 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.curStrike;
        int iHashCode83 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.dcdOptionType;
        int iHashCode84 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.curSettlementTime;
        int iHashCode85 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.minAnnualYieldPercentage;
        int iHashCode86 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.maxSettlementDay;
        int iHashCode87 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.reinvestment;
        int iHashCode88 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.lastPrice;
        int iHashCode89 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.totalSpreadProfit;
        int iHashCode90 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.totalApy;
        int iHashCode91 = str41 == null ? 0 : str41.hashCode();
        List<StrategyProfitResponse> list2 = this.profitList;
        int iHashCode92 = list2 == null ? 0 : list2.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        int iHashCode93 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        BalanceDetailInfoDto balanceDetailInfoDto = this.botBalanceDetails;
        int iHashCode94 = balanceDetailInfoDto == null ? 0 : balanceDetailInfoDto.hashCode();
        TrailingConfig trailingConfig = this.trailingDownConfig;
        int iHashCode95 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        String str42 = this.trailingDownFund;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + (str42 == null ? 0 : str42.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternateCurrency(String str) {
        this.alternateCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgCost(String str) {
        this.avgCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinPnl(String str) {
        this.coinPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurSettlementTime(String str) {
        this.curSettlementTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurStrike(String str) {
        this.curStrike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyBal(String str) {
        this.currencyBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycle(String str) {
        this.cycle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdOptionType(String str) {
        this.dcdOptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdState(String str) {
        this.dcdState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastPrice(String str) {
        this.lastPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestProfit(StrategyProfitResponse strategyProfitResponse) {
        this.latestProfit = strategyProfitResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSettlementDay(String str) {
        this.maxSettlementDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAnnualYieldPercentage(String str) {
        this.minAnnualYieldPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotional(String str) {
        this.notional = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCcy(String str) {
        this.notionalCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestment(String str) {
        this.reinvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFundingFee(String str) {
        this.reserveFundingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingPnl(String str) {
        this.stakingPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingPnlUSDT(String str) {
        this.stakingPnlUSDT = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingPosCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stakingPosCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopPercentage(String str) {
        this.stopPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopPrice(String str) {
        this.stopPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikePercentage(String str) {
        this.strikePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubArbTypes(List<? extends SubArbitrageType4Remote> list) {
        this.subArbTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTerm(String str) {
        this.term = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownConfig(TrailingConfig trailingConfig) {
        this.trailingDownConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownFund(String str) {
        this.trailingDownFund = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferInMargin(String str) {
        this.transferInMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BenefitDetails(aigoId=" + this.aigoId + ", orderType=" + this.orderType + ", instId=" + this.instId + ", instType=" + this.instType + ", priceUnit=" + this.priceUnit + ", displayPriceUnit=" + this.displayPriceUnit + ", gridProfit=" + this.gridProfit + ", gridProfitColor=" + this.gridProfitColor + ", floatProfit=" + this.floatProfit + ", investment=" + this.investment + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", totalAnnualizedRate=" + this.totalAnnualizedRate + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", arbApy=" + this.arbApy + ", pnlCcy=" + this.pnlCcy + ", mktCap=" + this.mktCap + ", eq=" + this.eq + ", investCcy=" + this.investCcy + ", investAmt=" + this.investAmt + ", investmentAmt=" + this.investmentAmt + ", investmentCcy=" + this.investmentCcy + ", avgPx=" + this.avgPx + ", fillSafetyOrds=" + this.fillSafetyOrds + ", maxSafetyOrds=" + this.maxSafetyOrds + ", completedCycles=" + this.completedCycles + ", rebateTrans=" + this.rebateTrans + ", totalCycleProfit=" + this.totalCycleProfit + ", totalCycleProfitColor=" + this.totalCycleProfitColor + ", arbitragePnl=" + this.arbitragePnl + ", additionalFundNeeded=" + this.additionalFundNeeded + ", maxBotUsage=" + this.maxBotUsage + ", reserveFunds=" + this.reserveFunds + ", isHistory=" + this.isHistory + ", tvPnlColor=" + this.tvPnlColor + ", transferInMargin=" + this.transferInMargin + ", reserveFundingFee=" + this.reserveFundingFee + ", ordFrozen=" + this.ordFrozen + ", availEq=" + this.availEq + ", realizedPnl=" + this.realizedPnl + ", netMarginTransfer=" + this.netMarginTransfer + ", fee=" + this.fee + ", fundingFee=" + this.fundingFee + ", fundingFeeColor=" + this.fundingFeeColor + ", spreadPnl=" + this.spreadPnl + ", arbPnl=" + this.arbPnl + ", totalAmt=" + this.totalAmt + ", arbList=" + this.arbList + ", instFamily=" + this.instFamily + ", maturedApy=" + this.maturedApy + ", sourceCcy=" + this.sourceCcy + ", totalInterestAmt=" + this.totalInterestAmt + ", debtCcy=" + this.debtCcy + ", stakingPnl=" + this.stakingPnl + ", stakingPnlApy=" + this.stakingPnlApy + ", stakingPnlUSDT=" + this.stakingPnlUSDT + ", stakingPosCcy=" + this.stakingPosCcy + ", subArbTypes=" + this.subArbTypes + ", smartEarnProfit=" + this.smartEarnProfit + ", smartEarnProfitColor=" + this.smartEarnProfitColor + ", floatProfitColor=" + this.floatProfitColor + ", autoStakeProfit=" + this.autoStakeProfit + ", autoStakeProfitColor=" + this.autoStakeProfitColor + ", autoEarnProfit=" + this.autoEarnProfit + ", autoEarnProfitColor=" + this.autoEarnProfitColor + ", autoEarnState=" + this.autoEarnState + ", autoStakeState=" + this.autoStakeState + ", dcdState=" + this.dcdState + ", coinPnl=" + this.coinPnl + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", currencyBal=" + this.currencyBal + ", currency=" + this.currency + ", avgCost=" + this.avgCost + ", cycle=" + this.cycle + ", term=" + this.term + ", alternateCurrency=" + this.alternateCurrency + ", strike=" + this.strike + ", strikePercentage=" + this.strikePercentage + ", stopPrice=" + this.stopPrice + ", stopPercentage=" + this.stopPercentage + ", curStrike=" + this.curStrike + ", dcdOptionType=" + this.dcdOptionType + ", curSettlementTime=" + this.curSettlementTime + ", minAnnualYieldPercentage=" + this.minAnnualYieldPercentage + ", maxSettlementDay=" + this.maxSettlementDay + ", reinvestment=" + this.reinvestment + ", lastPrice=" + this.lastPrice + ", totalSpreadProfit=" + this.totalSpreadProfit + ", totalApy=" + this.totalApy + ", profitList=" + this.profitList + ", latestProfit=" + this.latestProfit + ", botBalanceDetails=" + this.botBalanceDetails + ", trailingDownConfig=" + this.trailingDownConfig + ", trailingDownFund=" + this.trailingDownFund + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.BenefitDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BenefitDetails> serializer() {
            return BenefitDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BenefitDetails(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i6, String str29, String str30, String str31, boolean z, boolean z2, int i7, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, int i8, String str40, String str41, String str42, ArrayList arrayList, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, List list, String str52, int i9, int i10, String str53, int i11, String str54, int i12, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, List list2, StrategyProfitResponse strategyProfitResponse, BalanceDetailInfoDto balanceDetailInfoDto, TrailingConfig trailingConfig, String str80, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aigoId = "";
        } else {
            this.aigoId = str;
        }
        if ((i & 2) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.instType = "";
        } else {
            this.instType = str4;
        }
        if ((i & 16) == 0) {
            this.priceUnit = "";
        } else {
            this.priceUnit = str5;
        }
        if ((i & 32) == 0) {
            this.displayPriceUnit = null;
        } else {
            this.displayPriceUnit = str6;
        }
        if ((i & 64) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str7;
        }
        if ((i & 128) == 0) {
            this.gridProfitColor = 0;
        } else {
            this.gridProfitColor = i5;
        }
        if ((i & 256) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str8;
        }
        if ((i & 512) == 0) {
            this.investment = "";
        } else {
            this.investment = str9;
        }
        if ((i & 1024) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str10;
        }
        if ((i & 2048) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str11;
        }
        if ((i & 4096) == 0) {
            this.totalAnnualizedRate = "";
        } else {
            this.totalAnnualizedRate = str12;
        }
        if ((i & 8192) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str13;
        }
        if ((i & 16384) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str14;
        }
        if ((i & 32768) == 0) {
            this.arbApy = "";
        } else {
            this.arbApy = str15;
        }
        if ((i & 65536) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str16;
        }
        if ((i & 131072) == 0) {
            this.mktCap = "";
        } else {
            this.mktCap = str17;
        }
        if ((i & 262144) == 0) {
            this.eq = "";
        } else {
            this.eq = str18;
        }
        if ((524288 & i) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str19;
        }
        if ((1048576 & i) == 0) {
            this.investAmt = "";
        } else {
            this.investAmt = str20;
        }
        if ((2097152 & i) == 0) {
            this.investmentAmt = "";
        } else {
            this.investmentAmt = str21;
        }
        if ((4194304 & i) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str22;
        }
        if ((8388608 & i) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str23;
        }
        if ((16777216 & i) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str24;
        }
        if ((33554432 & i) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str25;
        }
        if ((67108864 & i) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str26;
        }
        if ((134217728 & i) == 0) {
            this.rebateTrans = "";
        } else {
            this.rebateTrans = str27;
        }
        if ((268435456 & i) == 0) {
            this.totalCycleProfit = "";
        } else {
            this.totalCycleProfit = str28;
        }
        if ((536870912 & i) == 0) {
            this.totalCycleProfitColor = 0;
        } else {
            this.totalCycleProfitColor = i6;
        }
        if ((1073741824 & i) == 0) {
            this.arbitragePnl = "";
        } else {
            this.arbitragePnl = str29;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.additionalFundNeeded = "";
        } else {
            this.additionalFundNeeded = str30;
        }
        if ((i2 & 1) == 0) {
            this.maxBotUsage = "";
        } else {
            this.maxBotUsage = str31;
        }
        if ((i2 & 2) == 0) {
            this.reserveFunds = false;
        } else {
            this.reserveFunds = z;
        }
        if ((i2 & 4) == 0) {
            this.isHistory = false;
        } else {
            this.isHistory = z2;
        }
        if ((i2 & 8) == 0) {
            this.tvPnlColor = 0;
        } else {
            this.tvPnlColor = i7;
        }
        if ((i2 & 16) == 0) {
            this.transferInMargin = null;
        } else {
            this.transferInMargin = str32;
        }
        if ((i2 & 32) == 0) {
            this.reserveFundingFee = null;
        } else {
            this.reserveFundingFee = str33;
        }
        if ((i2 & 64) == 0) {
            this.ordFrozen = "";
        } else {
            this.ordFrozen = str34;
        }
        if ((i2 & 128) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str35;
        }
        if ((i2 & 256) == 0) {
            this.realizedPnl = "";
        } else {
            this.realizedPnl = str36;
        }
        if ((i2 & 512) == 0) {
            this.netMarginTransfer = "";
        } else {
            this.netMarginTransfer = str37;
        }
        if ((i2 & 1024) == 0) {
            this.fee = "";
        } else {
            this.fee = str38;
        }
        if ((i2 & 2048) == 0) {
            this.fundingFee = "";
        } else {
            this.fundingFee = str39;
        }
        if ((i2 & 4096) == 0) {
            this.fundingFeeColor = 0;
        } else {
            this.fundingFeeColor = i8;
        }
        if ((i2 & 8192) == 0) {
            this.spreadPnl = null;
        } else {
            this.spreadPnl = str40;
        }
        if ((i2 & 16384) == 0) {
            this.arbPnl = null;
        } else {
            this.arbPnl = str41;
        }
        if ((i2 & 32768) == 0) {
            this.totalAmt = null;
        } else {
            this.totalAmt = str42;
        }
        if ((i2 & 65536) == 0) {
            this.arbList = null;
        } else {
            this.arbList = arrayList;
        }
        if ((i2 & 131072) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str43;
        }
        if ((i2 & 262144) == 0) {
            this.maturedApy = null;
        } else {
            this.maturedApy = str44;
        }
        if ((524288 & i2) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str45;
        }
        if ((1048576 & i2) == 0) {
            this.totalInterestAmt = null;
        } else {
            this.totalInterestAmt = str46;
        }
        if ((2097152 & i2) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str47;
        }
        if ((4194304 & i2) == 0) {
            this.stakingPnl = null;
        } else {
            this.stakingPnl = str48;
        }
        if ((8388608 & i2) == 0) {
            this.stakingPnlApy = null;
        } else {
            this.stakingPnlApy = str49;
        }
        if ((16777216 & i2) == 0) {
            this.stakingPnlUSDT = null;
        } else {
            this.stakingPnlUSDT = str50;
        }
        if ((33554432 & i2) == 0) {
            this.stakingPosCcy = "";
        } else {
            this.stakingPosCcy = str51;
        }
        if ((67108864 & i2) == 0) {
            this.subArbTypes = null;
        } else {
            this.subArbTypes = list;
        }
        if ((134217728 & i2) == 0) {
            this.smartEarnProfit = null;
        } else {
            this.smartEarnProfit = str52;
        }
        if ((268435456 & i2) == 0) {
            this.smartEarnProfitColor = 0;
        } else {
            this.smartEarnProfitColor = i9;
        }
        if ((536870912 & i2) == 0) {
            this.floatProfitColor = 0;
        } else {
            this.floatProfitColor = i10;
        }
        if ((1073741824 & i2) == 0) {
            this.autoStakeProfit = null;
        } else {
            this.autoStakeProfit = str53;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.autoStakeProfitColor = 0;
        } else {
            this.autoStakeProfitColor = i11;
        }
        if ((i3 & 1) == 0) {
            this.autoEarnProfit = null;
        } else {
            this.autoEarnProfit = str54;
        }
        if ((i3 & 2) == 0) {
            this.autoEarnProfitColor = 0;
        } else {
            this.autoEarnProfitColor = i12;
        }
        if ((i3 & 4) == 0) {
            this.autoEarnState = null;
        } else {
            this.autoEarnState = str55;
        }
        if ((i3 & 8) == 0) {
            this.autoStakeState = null;
        } else {
            this.autoStakeState = str56;
        }
        if ((i3 & 16) == 0) {
            this.dcdState = null;
        } else {
            this.dcdState = str57;
        }
        if ((i3 & 32) == 0) {
            this.coinPnl = null;
        } else {
            this.coinPnl = str58;
        }
        if ((i3 & 64) == 0) {
            this.notional = null;
        } else {
            this.notional = str59;
        }
        if ((i3 & 128) == 0) {
            this.notionalCcy = null;
        } else {
            this.notionalCcy = str60;
        }
        if ((i3 & 256) == 0) {
            this.currencyBal = null;
        } else {
            this.currencyBal = str61;
        }
        if ((i3 & 512) == 0) {
            this.currency = null;
        } else {
            this.currency = str62;
        }
        if ((i3 & 1024) == 0) {
            this.avgCost = null;
        } else {
            this.avgCost = str63;
        }
        if ((i3 & 2048) == 0) {
            this.cycle = null;
        } else {
            this.cycle = str64;
        }
        if ((i3 & 4096) == 0) {
            this.term = null;
        } else {
            this.term = str65;
        }
        if ((i3 & 8192) == 0) {
            this.alternateCurrency = null;
        } else {
            this.alternateCurrency = str66;
        }
        if ((i3 & 16384) == 0) {
            this.strike = null;
        } else {
            this.strike = str67;
        }
        if ((i3 & 32768) == 0) {
            this.strikePercentage = null;
        } else {
            this.strikePercentage = str68;
        }
        if ((i3 & 65536) == 0) {
            this.stopPrice = null;
        } else {
            this.stopPrice = str69;
        }
        if ((i3 & 131072) == 0) {
            this.stopPercentage = null;
        } else {
            this.stopPercentage = str70;
        }
        if ((i3 & 262144) == 0) {
            this.curStrike = null;
        } else {
            this.curStrike = str71;
        }
        if ((524288 & i3) == 0) {
            this.dcdOptionType = null;
        } else {
            this.dcdOptionType = str72;
        }
        if ((1048576 & i3) == 0) {
            this.curSettlementTime = null;
        } else {
            this.curSettlementTime = str73;
        }
        if ((2097152 & i3) == 0) {
            this.minAnnualYieldPercentage = null;
        } else {
            this.minAnnualYieldPercentage = str74;
        }
        if ((4194304 & i3) == 0) {
            this.maxSettlementDay = null;
        } else {
            this.maxSettlementDay = str75;
        }
        if ((8388608 & i3) == 0) {
            this.reinvestment = null;
        } else {
            this.reinvestment = str76;
        }
        if ((16777216 & i3) == 0) {
            this.lastPrice = null;
        } else {
            this.lastPrice = str77;
        }
        if ((33554432 & i3) == 0) {
            this.totalSpreadProfit = null;
        } else {
            this.totalSpreadProfit = str78;
        }
        if ((67108864 & i3) == 0) {
            this.totalApy = null;
        } else {
            this.totalApy = str79;
        }
        if ((134217728 & i3) == 0) {
            this.profitList = null;
        } else {
            this.profitList = list2;
        }
        if ((268435456 & i3) == 0) {
            this.latestProfit = null;
        } else {
            this.latestProfit = strategyProfitResponse;
        }
        if ((536870912 & i3) == 0) {
            this.botBalanceDetails = null;
        } else {
            this.botBalanceDetails = balanceDetailInfoDto;
        }
        if ((1073741824 & i3) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.trailingDownFund = null;
        } else {
            this.trailingDownFund = str80;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BenefitDetails benefitDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) benefitDetails.aigoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, benefitDetails.aigoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) benefitDetails.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, benefitDetails.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) benefitDetails.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, benefitDetails.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) benefitDetails.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, benefitDetails.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) benefitDetails.priceUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, benefitDetails.priceUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || benefitDetails.displayPriceUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, benefitDetails.displayPriceUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) benefitDetails.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, benefitDetails.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || benefitDetails.gridProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, benefitDetails.gridProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) benefitDetails.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, benefitDetails.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) benefitDetails.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, benefitDetails.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) benefitDetails.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, benefitDetails.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) benefitDetails.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, benefitDetails.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) benefitDetails.totalAnnualizedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, benefitDetails.totalAnnualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) benefitDetails.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, benefitDetails.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) benefitDetails.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, benefitDetails.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) benefitDetails.arbApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, benefitDetails.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) benefitDetails.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, benefitDetails.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) benefitDetails.mktCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, benefitDetails.mktCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) benefitDetails.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, benefitDetails.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) benefitDetails.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, benefitDetails.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) benefitDetails.investAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, benefitDetails.investAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) benefitDetails.investmentAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, benefitDetails.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) benefitDetails.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, benefitDetails.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) benefitDetails.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, benefitDetails.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) benefitDetails.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, benefitDetails.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) benefitDetails.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, benefitDetails.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) benefitDetails.completedCycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, benefitDetails.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) benefitDetails.rebateTrans, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, benefitDetails.rebateTrans);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) benefitDetails.totalCycleProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, benefitDetails.totalCycleProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || benefitDetails.totalCycleProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 29, benefitDetails.totalCycleProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) benefitDetails.arbitragePnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, benefitDetails.arbitragePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) benefitDetails.additionalFundNeeded, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, benefitDetails.additionalFundNeeded);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) benefitDetails.maxBotUsage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, benefitDetails.maxBotUsage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || benefitDetails.reserveFunds) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, benefitDetails.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || benefitDetails.isHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, benefitDetails.isHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || benefitDetails.tvPnlColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 35, benefitDetails.tvPnlColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || benefitDetails.transferInMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, benefitDetails.transferInMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || benefitDetails.reserveFundingFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, benefitDetails.reserveFundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) benefitDetails.ordFrozen, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, benefitDetails.ordFrozen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) benefitDetails.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, benefitDetails.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) benefitDetails.realizedPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, benefitDetails.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) benefitDetails.netMarginTransfer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, benefitDetails.netMarginTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) benefitDetails.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, benefitDetails.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) benefitDetails.fundingFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, benefitDetails.fundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || benefitDetails.fundingFeeColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 44, benefitDetails.fundingFeeColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || benefitDetails.spreadPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, benefitDetails.spreadPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || benefitDetails.arbPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, benefitDetails.arbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || benefitDetails.totalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, benefitDetails.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || benefitDetails.arbList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, kSerializerArr[48], benefitDetails.arbList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || benefitDetails.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, StringSerializer.INSTANCE, benefitDetails.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || benefitDetails.maturedApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, benefitDetails.maturedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || benefitDetails.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, benefitDetails.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || benefitDetails.totalInterestAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, benefitDetails.totalInterestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) benefitDetails.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, benefitDetails.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || benefitDetails.stakingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, benefitDetails.stakingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || benefitDetails.stakingPnlApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, benefitDetails.stakingPnlApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || benefitDetails.stakingPnlUSDT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, benefitDetails.stakingPnlUSDT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) benefitDetails.stakingPosCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, benefitDetails.stakingPosCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || benefitDetails.subArbTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, kSerializerArr[58], benefitDetails.subArbTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || benefitDetails.smartEarnProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, StringSerializer.INSTANCE, benefitDetails.smartEarnProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || benefitDetails.smartEarnProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 60, benefitDetails.smartEarnProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || benefitDetails.floatProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 61, benefitDetails.floatProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || benefitDetails.autoStakeProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, benefitDetails.autoStakeProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || benefitDetails.autoStakeProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 63, benefitDetails.autoStakeProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || benefitDetails.autoEarnProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, benefitDetails.autoEarnProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || benefitDetails.autoEarnProfitColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 65, benefitDetails.autoEarnProfitColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || benefitDetails.autoEarnState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, benefitDetails.autoEarnState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || benefitDetails.autoStakeState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, StringSerializer.INSTANCE, benefitDetails.autoStakeState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || benefitDetails.dcdState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, benefitDetails.dcdState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || benefitDetails.coinPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, benefitDetails.coinPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || benefitDetails.notional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, StringSerializer.INSTANCE, benefitDetails.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || benefitDetails.notionalCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, benefitDetails.notionalCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || benefitDetails.currencyBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, benefitDetails.currencyBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || benefitDetails.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, StringSerializer.INSTANCE, benefitDetails.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || benefitDetails.avgCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, benefitDetails.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || benefitDetails.cycle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, benefitDetails.cycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || benefitDetails.term != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, StringSerializer.INSTANCE, benefitDetails.term);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || benefitDetails.alternateCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StringSerializer.INSTANCE, benefitDetails.alternateCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || benefitDetails.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 78, StringSerializer.INSTANCE, benefitDetails.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || benefitDetails.strikePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, StringSerializer.INSTANCE, benefitDetails.strikePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || benefitDetails.stopPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 80, StringSerializer.INSTANCE, benefitDetails.stopPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || benefitDetails.stopPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 81, StringSerializer.INSTANCE, benefitDetails.stopPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || benefitDetails.curStrike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, StringSerializer.INSTANCE, benefitDetails.curStrike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || benefitDetails.dcdOptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 83, StringSerializer.INSTANCE, benefitDetails.dcdOptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || benefitDetails.curSettlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 84, StringSerializer.INSTANCE, benefitDetails.curSettlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || benefitDetails.minAnnualYieldPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 85, StringSerializer.INSTANCE, benefitDetails.minAnnualYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || benefitDetails.maxSettlementDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 86, StringSerializer.INSTANCE, benefitDetails.maxSettlementDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || benefitDetails.reinvestment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 87, StringSerializer.INSTANCE, benefitDetails.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || benefitDetails.lastPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 88, StringSerializer.INSTANCE, benefitDetails.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || benefitDetails.totalSpreadProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 89, StringSerializer.INSTANCE, benefitDetails.totalSpreadProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || benefitDetails.totalApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 90, StringSerializer.INSTANCE, benefitDetails.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || benefitDetails.profitList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 91, kSerializerArr[91], benefitDetails.profitList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || benefitDetails.latestProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 92, StrategyProfitResponse$$serializer.INSTANCE, benefitDetails.latestProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || benefitDetails.botBalanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 93, BalanceDetailInfoDto$$serializer.INSTANCE, benefitDetails.botBalanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || benefitDetails.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 94, TrailingConfig$$serializer.INSTANCE, benefitDetails.trailingDownConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) && benefitDetails.trailingDownFund == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 95, StringSerializer.INSTANCE, benefitDetails.trailingDownFund);
    }

    public BenefitDetails(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, @NotNull String str29, @NotNull String str30, @NotNull String str31, boolean z, boolean z2, int i3, String str32, String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, int i4, String str40, String str41, String str42, ArrayList<SmartArbListItem> arrayList, String str43, String str44, String str45, String str46, @NotNull String str47, String str48, String str49, String str50, @NotNull String str51, List<? extends SubArbitrageType4Remote> list, String str52, int i5, int i6, String str53, int i7, String str54, int i8, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, List<StrategyProfitResponse> list2, StrategyProfitResponse strategyProfitResponse, BalanceDetailInfoDto balanceDetailInfoDto, TrailingConfig trailingConfig, String str80) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str51, "");
        this.aigoId = str;
        this.orderType = str2;
        this.instId = str3;
        this.instType = str4;
        this.priceUnit = str5;
        this.displayPriceUnit = str6;
        this.gridProfit = str7;
        this.gridProfitColor = i;
        this.floatProfit = str8;
        this.investment = str9;
        this.actualMarginSz = str10;
        this.extraMarginSz = str11;
        this.totalAnnualizedRate = str12;
        this.totalPnl = str13;
        this.pnlRatio = str14;
        this.arbApy = str15;
        this.pnlCcy = str16;
        this.mktCap = str17;
        this.eq = str18;
        this.investCcy = str19;
        this.investAmt = str20;
        this.investmentAmt = str21;
        this.investmentCcy = str22;
        this.avgPx = str23;
        this.fillSafetyOrds = str24;
        this.maxSafetyOrds = str25;
        this.completedCycles = str26;
        this.rebateTrans = str27;
        this.totalCycleProfit = str28;
        this.totalCycleProfitColor = i2;
        this.arbitragePnl = str29;
        this.additionalFundNeeded = str30;
        this.maxBotUsage = str31;
        this.reserveFunds = z;
        this.isHistory = z2;
        this.tvPnlColor = i3;
        this.transferInMargin = str32;
        this.reserveFundingFee = str33;
        this.ordFrozen = str34;
        this.availEq = str35;
        this.realizedPnl = str36;
        this.netMarginTransfer = str37;
        this.fee = str38;
        this.fundingFee = str39;
        this.fundingFeeColor = i4;
        this.spreadPnl = str40;
        this.arbPnl = str41;
        this.totalAmt = str42;
        this.arbList = arrayList;
        this.instFamily = str43;
        this.maturedApy = str44;
        this.sourceCcy = str45;
        this.totalInterestAmt = str46;
        this.debtCcy = str47;
        this.stakingPnl = str48;
        this.stakingPnlApy = str49;
        this.stakingPnlUSDT = str50;
        this.stakingPosCcy = str51;
        this.subArbTypes = list;
        this.smartEarnProfit = str52;
        this.smartEarnProfitColor = i5;
        this.floatProfitColor = i6;
        this.autoStakeProfit = str53;
        this.autoStakeProfitColor = i7;
        this.autoEarnProfit = str54;
        this.autoEarnProfitColor = i8;
        this.autoEarnState = str55;
        this.autoStakeState = str56;
        this.dcdState = str57;
        this.coinPnl = str58;
        this.notional = str59;
        this.notionalCcy = str60;
        this.currencyBal = str61;
        this.currency = str62;
        this.avgCost = str63;
        this.cycle = str64;
        this.term = str65;
        this.alternateCurrency = str66;
        this.strike = str67;
        this.strikePercentage = str68;
        this.stopPrice = str69;
        this.stopPercentage = str70;
        this.curStrike = str71;
        this.dcdOptionType = str72;
        this.curSettlementTime = str73;
        this.minAnnualYieldPercentage = str74;
        this.maxSettlementDay = str75;
        this.reinvestment = str76;
        this.lastPrice = str77;
        this.totalSpreadProfit = str78;
        this.totalApy = str79;
        this.profitList = list2;
        this.latestProfit = strategyProfitResponse;
        this.botBalanceDetails = balanceDetailInfoDto;
        this.trailingDownConfig = trailingConfig;
        this.trailingDownFund = str80;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i2, String str29, String str30, String str31, boolean z, boolean z2, int i3, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, int i4, String str40, String str41, String str42, ArrayList arrayList, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, List list, String str52, int i5, int i6, String str53, int i7, String str54, int i8, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, List list2, StrategyProfitResponse strategyProfitResponse, BalanceDetailInfoDto balanceDetailInfoDto, TrailingConfig trailingConfig, String str80, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str81 = (i9 & 1) != 0 ? "" : str;
        String str82 = (i9 & 2) != 0 ? "" : str2;
        String str83 = (i9 & 4) != 0 ? "" : str3;
        String str84 = (i9 & 8) != 0 ? "" : str4;
        String str85 = (i9 & 16) != 0 ? "" : str5;
        String str86 = (i9 & 32) != 0 ? null : str6;
        String str87 = (i9 & 64) != 0 ? "" : str7;
        int i12 = (i9 & 128) != 0 ? 0 : i;
        String str88 = (i9 & 256) != 0 ? "" : str8;
        String str89 = (i9 & 512) != 0 ? "" : str9;
        String str90 = (i9 & 1024) != 0 ? "" : str10;
        String str91 = (i9 & 2048) != 0 ? "" : str11;
        String str92 = (i9 & 4096) != 0 ? "" : str12;
        String str93 = (i9 & 8192) != 0 ? "" : str13;
        String str94 = (i9 & 16384) != 0 ? "" : str14;
        String str95 = (i9 & 32768) != 0 ? "" : str15;
        String str96 = (i9 & 65536) != 0 ? "" : str16;
        String str97 = (i9 & 131072) != 0 ? "" : str17;
        String str98 = (i9 & 262144) != 0 ? "" : str18;
        String str99 = (i9 & 524288) != 0 ? "" : str19;
        String str100 = (i9 & 1048576) != 0 ? "" : str20;
        String str101 = (i9 & 2097152) != 0 ? "" : str21;
        String str102 = (i9 & 4194304) != 0 ? "" : str22;
        String str103 = (i9 & 8388608) != 0 ? "" : str23;
        String str104 = (i9 & 16777216) != 0 ? "" : str24;
        String str105 = (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str25;
        String str106 = (i9 & 67108864) != 0 ? "" : str26;
        String str107 = (i9 & 134217728) != 0 ? "" : str27;
        String str108 = (i9 & 268435456) != 0 ? "" : str28;
        int i13 = (i9 & 536870912) != 0 ? 0 : i2;
        String str109 = (i9 & 1073741824) != 0 ? "" : str29;
        String str110 = (i9 & Integer.MIN_VALUE) != 0 ? "" : str30;
        this(str81, str82, str83, str84, str85, str86, str87, i12, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, i13, str109, str110, (i10 & 1) != 0 ? "" : str31, (i10 & 2) != 0 ? false : z, (i10 & 4) != 0 ? false : z2, (i10 & 8) != 0 ? 0 : i3, (i10 & 16) != 0 ? null : str32, (i10 & 32) != 0 ? null : str33, (i10 & 64) != 0 ? "" : str34, (i10 & 128) != 0 ? "" : str35, (i10 & 256) != 0 ? "" : str36, (i10 & 512) != 0 ? "" : str37, (i10 & 1024) != 0 ? "" : str38, (i10 & 2048) != 0 ? "" : str39, (i10 & 4096) != 0 ? 0 : i4, (i10 & 8192) != 0 ? null : str40, (i10 & 16384) != 0 ? null : str41, (i10 & 32768) != 0 ? null : str42, (i10 & 65536) != 0 ? null : arrayList, (i10 & 131072) != 0 ? null : str43, (i10 & 262144) != 0 ? null : str44, (i10 & 524288) != 0 ? null : str45, (i10 & 1048576) != 0 ? null : str46, (i10 & 2097152) != 0 ? "" : str47, (i10 & 4194304) != 0 ? null : str48, (i10 & 8388608) != 0 ? null : str49, (i10 & 16777216) != 0 ? null : str50, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str51, (i10 & 67108864) != 0 ? null : list, (i10 & 134217728) != 0 ? null : str52, (i10 & 268435456) != 0 ? 0 : i5, (i10 & 536870912) != 0 ? 0 : i6, (i10 & 1073741824) != 0 ? null : str53, (i10 & Integer.MIN_VALUE) != 0 ? 0 : i7, (i11 & 1) != 0 ? null : str54, (i11 & 2) != 0 ? 0 : i8, (i11 & 4) != 0 ? null : str55, (i11 & 8) != 0 ? null : str56, (i11 & 16) != 0 ? null : str57, (i11 & 32) != 0 ? null : str58, (i11 & 64) != 0 ? null : str59, (i11 & 128) != 0 ? null : str60, (i11 & 256) != 0 ? null : str61, (i11 & 512) != 0 ? null : str62, (i11 & 1024) != 0 ? null : str63, (i11 & 2048) != 0 ? null : str64, (i11 & 4096) != 0 ? null : str65, (i11 & 8192) != 0 ? null : str66, (i11 & 16384) != 0 ? null : str67, (i11 & 32768) != 0 ? null : str68, (i11 & 65536) != 0 ? null : str69, (i11 & 131072) != 0 ? null : str70, (i11 & 262144) != 0 ? null : str71, (i11 & 524288) != 0 ? null : str72, (i11 & 1048576) != 0 ? null : str73, (i11 & 2097152) != 0 ? null : str74, (i11 & 4194304) != 0 ? null : str75, (i11 & 8388608) != 0 ? null : str76, (i11 & 16777216) != 0 ? null : str77, (i11 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str78, (i11 & 67108864) != 0 ? null : str79, (i11 & 134217728) != 0 ? null : list2, (i11 & 268435456) != 0 ? null : strategyProfitResponse, (i11 & 536870912) != 0 ? null : balanceDetailInfoDto, (i11 & 1073741824) != 0 ? null : trailingConfig, (i11 & Integer.MIN_VALUE) != 0 ? null : str80);
    }

    public final boolean isArbitrageWithStaking() {
        List<? extends SubArbitrageType4Remote> list = this.subArbTypes;
        return (list != null ? (SubArbitrageType4Remote) CollectionsKt___CollectionsKt.firstOrNull(list) : null) == SubArbitrageType4Remote.STAKE;
    }
}

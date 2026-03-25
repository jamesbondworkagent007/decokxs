package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.flyco.tablayout.BuildConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.mlkit.common.MlKitException;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.ArbitrageOrderBean$$serializer;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo$$serializer;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.BotVo$$serializer;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.DcaTriggerParam$$serializer;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam$$serializer;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam$$serializer;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo$$serializer;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.FundingFeeApyItem$$serializer;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse$$serializer;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.RecurringListItem$$serializer;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SignParamItem$$serializer;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbListItem$$serializer;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem$$serializer;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherInfo$$serializer;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingConfig$$serializer;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto$$serializer;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.SmartEarnParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33070mpX;
import o.C33129mqd;
import o.C54536xML;
import o.C55688xof;
import o.C55770xqH;
import o.C55794xqf;
import o.xMV;
import o.xUW;
import o.yDY;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyPendingListResp implements Parcelable, BizTradeStrategyInfo, TradeAllOrderApi {
    private static final KSerializer<Object>[] $childSerializers;
    private String absYieldPercentage;
    private String activePx;
    private String activePxType;
    private String actualLever;
    private String actualMarginSz;
    private String actualSz;
    private final String advanceOrdType;
    private String aggressiveness;
    private String algoId;
    private String algoOrdType;
    private String alternateCurrency;
    private String alternativeCurrency;
    private String amt;
    private String arbApy;
    private final ArrayList<SmartArbListItem> arbList;
    private final String arbPnl;
    private String arbitrageApy;
    private String arbitrageNum;
    private String arbitragePnl;
    private final ProfitDetailResponse arbitrageProfit;
    private String arbitrageProfitRate;
    private String arbitrageStakingError;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private Boolean associate;
    private String autoMarginReloadMaxAmount;
    private boolean autoMarginReloadSwitch;
    private String availEq;
    private String availableMargin;
    private String avgCost;
    private String avgDailyArbitrageNum;
    private String avgPx;
    private String balNum;
    private String balType;
    private final BalanceDetailInfoDto balanceDetails;
    private boolean basePos;
    private String baseSz;
    private final BotVo bot;
    private String cTime;
    private String callbackRatio;
    private String callbackSpread;
    private String cancelType;
    private String ccy;
    private String closeFraction;
    private String coinPnl;
    private String completedCycles;
    private String copyType;
    private String count;
    private String createTime;
    private String curBaseSz;
    private String curQuoteSz;
    private String curStrike;
    private String currency;
    private String currencyBal;
    private String cycle;
    private String cycles;
    private String dcdPnl;
    private String dcdPnlRatio;
    private String dcdState;
    private final String debtCcy;
    private String deltaRatio;
    private String direction;
    private String displayId;
    private final boolean displayMinPaybackDays;
    private String duration;
    private String earlyFillAmount;
    private String earlyFillCurrency;
    private String earlyFillPrice;
    private String earlyFillSettleTime;
    private String earlyFilledTime;
    private final StrategyDcaEditResp effectiveEditParametersDetails;
    private boolean endStatusFlag;
    private String eq;
    private String estimateProfit;
    private String expiryTime;
    private StrategyPendingListRespExt ext;
    private final ExtendedBusinessInfo extendedBusinessInfo;
    private String extraMarginSz;
    private final String fee;
    private String fillSafetyOrds;
    private String filledPercentage;
    private String floatProfit;
    private String floatProfitInSourceCcy;
    private String floatProfitRate;
    private String floatingPnl;
    private final ArrayList<String> forbidden;
    private final List<FundingFeeApyItem> fundingFeeApyList;
    private final String fundingFeeRatio;
    private final String fundingFeeTime;
    private String gridNum;
    private String gridProfit;
    private String gridProfitInSourceCcy;
    private String gridProfitRate;
    private String gridStatus;
    private final ArrayList<String> hiddenFeatures;
    private final String highestApyPeriod;
    private final String initOrdAmt;
    private String initPx;
    private final String instFamily;
    private String instId;
    private ArrayList<String> instIds;
    private List<ArbitrageOrderBean> instList;
    private String instType;
    private String interval;
    private String investAmt;
    private String investCcy;
    private String investType;
    private String investment;
    private String investmentAmt;
    private String investmentCcy;
    private String isPostWarning;
    private boolean isStoped;
    private Boolean isTradeBorrowMode;
    private String last;
    private final String lastPrice;
    private String lastSettlementSettledTime;
    private String lastTradeExpireTime;
    private StrategyProfitResponse latestProfit;
    private String lever;
    private final Float leveragePrincipal;
    private String liqPx;
    private String lmtOrderNumber;
    private String maturedApy;
    private String maxBotUsage;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private String mktCap;
    private String moveTriggerPx;
    private Boolean needTWapTips;
    private String nextInvestTime;
    private String noClosePositionId;
    private String notional;
    private String notionalAmount;
    private String notionalAmountPrecision;
    private String notionalCcy;
    private String notionalCurrency;
    private String notionalUsd;
    private final int numOfManualOrderInCycle;
    private String ordId;
    private String ordSource;
    private String ordType;
    private boolean outOfRange;
    private String pTime;
    private String participationRatio;
    private String perGridProfitRatio;
    private String perMaxProfitRate;
    private String perMinProfitRate;
    private String period;
    private String pnlRatio;
    private String pnlRatioInSourceCcy;
    private ArrayList<SmartPortfolioListItem> portfolioList;
    private String posSide;
    private String profit;
    private String profitNum;
    private String profitSharingRatio;
    private List<StrategyProfitResponse> profitSnapshots;
    private String pxLimit;
    private String pxSpread;
    private String pxSteps;
    private String pxStepsMult;
    private String pxVar;
    private String quickMgnType;
    private String quoteSz;
    private String recurringDay;
    private String recurringHour;
    private ArrayList<RecurringListItem> recurringList;
    private String recurringTime;
    private String reduceOnly;
    private boolean reinvestment;
    private Boolean reserveFunds;
    private String runPx;
    private String runType;
    private final String safetyOrdAmt;
    private String settlementAmount;
    private String settlementCcy;
    private String settlementPricePrecision;
    private String side;
    private ArrayList<SignParamItem> signParams;
    private final ExitSignalOrderAmtParam signalBotOrderStopParam;
    private String signalChanId;
    private String signalChanName;
    private String signalCount;
    private final EntrySignalOrderAmtParam signalOrderAmtParam;
    private final SmartEarnParam simpleEarn;
    private String sizePrecision;
    private String slMode;
    private String slOrderPx;
    private String slPct;
    private String slPx;
    private String slRatio;
    private String slTriggerRatio;
    private String sourceAlgoId;
    private String sourceCcy;
    private String sourceCcySz;
    private final ProfitDetailResponse stakingProfit;
    private String state;
    private String status;
    private String stgyName;
    private String stopResult;
    private String stopType;
    private final List<Integer> strategyTags;
    private String strike;
    private String strikePrecision;
    private List<? extends SubArbitrageType4Remote> subArbTypes;
    private boolean supportEarlyFill;
    private String symbolsNumber;
    private String sz;
    private String szLimit;
    private String tdMode;
    private String tgtCcy;
    private String timeInterval;
    private String timeLeft;
    private String totalAmt;
    private final String totalApy;
    private String totalCycleProfit;
    private String totalCycleProfitRate;
    private final String totalFundingFeeRatio;
    private final String totalInterestAmt;
    private String totalPnl;
    private String totalPnlInSourceCcy;
    private String totalPnlRatio;
    private final String totalSpreadProfit;
    private String tpOrderPx;
    private String tpPct;
    private String tpPriceRange;
    private String tpPx;
    private String tpRatio;
    private String tpTriggerRatio;
    private String tradeId;
    private String tradeNum;
    private String tradeQuoteCcy;
    private String tradeSide;
    private TrailingConfig trailingDownConfig;
    private String trailingDownFund;
    private TrailingConfig trailingUpConfig;
    private String triggerLast;
    private List<DcaTriggerParam> triggerParams;
    private String triggerTime;
    private String triggerType;
    private String turnoverRatio;
    private String uTime;
    private String uly;
    private String volMult;
    private final TacticsVoucherInfo voucherInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyPendingListResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyPendingListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListResp createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            String str;
            Boolean boolValueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean boolValueOf2;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            String string46 = parcel.readString();
            String string47 = parcel.readString();
            String string48 = parcel.readString();
            String string49 = parcel.readString();
            String string50 = parcel.readString();
            String string51 = parcel.readString();
            String string52 = parcel.readString();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            String string55 = parcel.readString();
            String string56 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string57 = parcel.readString();
            String string58 = parcel.readString();
            String string59 = parcel.readString();
            String string60 = parcel.readString();
            String string61 = parcel.readString();
            String string62 = parcel.readString();
            String string63 = parcel.readString();
            String string64 = parcel.readString();
            String string65 = parcel.readString();
            String string66 = parcel.readString();
            String string67 = parcel.readString();
            String string68 = parcel.readString();
            String string69 = parcel.readString();
            String string70 = parcel.readString();
            String string71 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z2;
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                z = z2;
                arrayList = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(ArbitrageOrderBean.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string72 = parcel.readString();
            String string73 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList16 = new ArrayList(i3);
            ArrayList arrayList17 = arrayList;
            int i4 = 0;
            while (i4 != i3) {
                arrayList16.add(RecurringListItem.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            String string74 = parcel.readString();
            String string75 = parcel.readString();
            String string76 = parcel.readString();
            String string77 = parcel.readString();
            String string78 = parcel.readString();
            String string79 = parcel.readString();
            String string80 = parcel.readString();
            String string81 = parcel.readString();
            String string82 = parcel.readString();
            String string83 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList18 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList18.add(SmartPortfolioListItem.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            String string84 = parcel.readString();
            String string85 = parcel.readString();
            String string86 = parcel.readString();
            String string87 = parcel.readString();
            String string88 = parcel.readString();
            String string89 = parcel.readString();
            String string90 = parcel.readString();
            String string91 = parcel.readString();
            String string92 = parcel.readString();
            String string93 = parcel.readString();
            String string94 = parcel.readString();
            String string95 = parcel.readString();
            String string96 = parcel.readString();
            String string97 = parcel.readString();
            String string98 = parcel.readString();
            String string99 = parcel.readString();
            String string100 = parcel.readString();
            String string101 = parcel.readString();
            String string102 = parcel.readString();
            String string103 = parcel.readString();
            String string104 = parcel.readString();
            String string105 = parcel.readString();
            String string106 = parcel.readString();
            String string107 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList18;
                arrayList3 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i7);
                arrayList2 = arrayList18;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList19.add(SignParamItem.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList3 = arrayList19;
            }
            String string108 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i9);
                arrayList4 = arrayList3;
                int i10 = 0;
                while (i10 != i9) {
                    arrayList20.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList5 = arrayList20;
            }
            String string109 = parcel.readString();
            String string110 = parcel.readString();
            String string111 = parcel.readString();
            String string112 = parcel.readString();
            String string113 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            TrailingConfig trailingConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            String string114 = parcel.readString();
            String string115 = parcel.readString();
            String string116 = parcel.readString();
            String string117 = parcel.readString();
            String string118 = parcel.readString();
            String string119 = parcel.readString();
            String string120 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string121 = parcel.readString();
            String string122 = parcel.readString();
            String string123 = parcel.readString();
            String string124 = parcel.readString();
            String string125 = parcel.readString();
            String string126 = parcel.readString();
            String string127 = parcel.readString();
            String string128 = parcel.readString();
            String string129 = parcel.readString();
            String string130 = parcel.readString();
            String string131 = parcel.readString();
            String string132 = parcel.readString();
            String string133 = parcel.readString();
            String string134 = parcel.readString();
            String string135 = parcel.readString();
            String string136 = parcel.readString();
            String string137 = parcel.readString();
            String string138 = parcel.readString();
            String string139 = parcel.readString();
            String string140 = parcel.readString();
            String string141 = parcel.readString();
            String string142 = parcel.readString();
            String string143 = parcel.readString();
            String string144 = parcel.readString();
            String string145 = parcel.readString();
            String string146 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string147 = parcel.readString();
            String string148 = parcel.readString();
            String string149 = parcel.readString();
            String string150 = parcel.readString();
            String string151 = parcel.readString();
            String string152 = parcel.readString();
            String string153 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string154 = parcel.readString();
            String string155 = parcel.readString();
            String string156 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            String string157 = parcel.readString();
            ExtendedBusinessInfo extendedBusinessInfoCreateFromParcel = parcel.readInt() == 0 ? null : ExtendedBusinessInfo.CREATOR.createFromParcel(parcel);
            String string158 = parcel.readString();
            String string159 = parcel.readString();
            String string160 = parcel.readString();
            String string161 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i11);
                arrayList6 = arrayList5;
                int i12 = 0;
                while (i12 != i11) {
                    arrayList21.add(SmartArbListItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList7 = arrayList21;
            }
            String string162 = parcel.readString();
            String string163 = parcel.readString();
            String string164 = parcel.readString();
            String string165 = parcel.readString();
            String string166 = parcel.readString();
            String string167 = parcel.readString();
            String string168 = parcel.readString();
            String string169 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string170 = parcel.readString();
            String string171 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList7;
                arrayList9 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i13);
                arrayList8 = arrayList7;
                int i14 = 0;
                while (i14 != i13) {
                    arrayList22.add(Integer.valueOf(parcel.readInt()));
                    i14++;
                    i13 = i13;
                }
                arrayList9 = arrayList22;
            }
            String string172 = parcel.readString();
            EntrySignalOrderAmtParam entrySignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : EntrySignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            ExitSignalOrderAmtParam exitSignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : ExitSignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            TacticsVoucherInfo tacticsVoucherInfoCreateFromParcel = parcel.readInt() == 0 ? null : TacticsVoucherInfo.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string173 = parcel.readString();
            String string174 = parcel.readString();
            String string175 = parcel.readString();
            String string176 = parcel.readString();
            String string177 = parcel.readString();
            String string178 = parcel.readString();
            String string179 = parcel.readString();
            String string180 = parcel.readString();
            String string181 = parcel.readString();
            String string182 = parcel.readString();
            String string183 = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            String string184 = parcel.readString();
            String string185 = parcel.readString();
            String string186 = parcel.readString();
            String string187 = parcel.readString();
            String string188 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList10 = arrayList9;
                arrayList11 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i15);
                arrayList10 = arrayList9;
                int i16 = 0;
                while (i16 != i15) {
                    arrayList23.add(SubArbitrageType4Remote.valueOf(parcel.readString()));
                    i16++;
                    i15 = i15;
                }
                arrayList11 = arrayList23;
            }
            String string189 = parcel.readString();
            String string190 = parcel.readString();
            String string191 = parcel.readString();
            SmartEarnParam smartEarnParamCreateFromParcel = parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfoCreateFromParcel = parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel);
            int i17 = parcel.readInt();
            String string192 = parcel.readString();
            boolean z9 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList11;
                arrayList13 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i18);
                arrayList12 = arrayList11;
                int i19 = 0;
                while (i19 != i18) {
                    arrayList24.add(FundingFeeApyItem.CREATOR.createFromParcel(parcel));
                    i19++;
                    i18 = i18;
                }
                arrayList13 = arrayList24;
            }
            if (parcel.readInt() == 0) {
                arrayList14 = arrayList13;
                arrayList15 = null;
            } else {
                int i20 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i20);
                arrayList14 = arrayList13;
                int i21 = 0;
                while (i21 != i20) {
                    arrayList25.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                    i21++;
                    i20 = i20;
                }
                arrayList15 = arrayList25;
            }
            return new StrategyPendingListResp(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, z, string57, string58, string59, string60, string61, string62, string63, string64, string65, string66, string67, string68, string69, string70, string71, arrayList17, boolValueOf, string72, string73, arrayList16, string74, string75, string76, string77, string78, string79, string80, string81, string82, string83, arrayList2, string84, string85, string86, string87, string88, string89, string90, string91, string92, string93, string94, string95, string96, string97, string98, string99, string100, string101, string102, string103, string104, string105, string106, string107, arrayList4, string108, arrayList6, string109, string110, string111, string112, string113, boolValueOf2, trailingConfigCreateFromParcel, trailingConfigCreateFromParcel2, string114, string115, string116, string117, string118, string119, string120, arrayListCreateStringArrayList, string121, string122, string123, string124, string125, string126, string127, string128, string129, string130, string131, string132, string133, string134, string135, string136, string137, string138, string139, string140, string141, string142, string143, string144, string145, string146, z3, string147, string148, string149, string150, string151, string152, string153, z4, z5, string154, string155, string156, z6, z7, string157, extendedBusinessInfoCreateFromParcel, string158, string159, string160, string161, arrayList8, string162, string163, string164, string165, string166, string167, string168, string169, boolValueOf3, string170, string171, boolValueOf4, arrayList10, string172, entrySignalOrderAmtParamCreateFromParcel, exitSignalOrderAmtParamCreateFromParcel, tacticsVoucherInfoCreateFromParcel, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string173, string174, string175, string176, string177, string178, string179, string180, string181, string182, string183, z8, string184, string185, string186, string187, string188, arrayList12, string189, string190, string191, smartEarnParamCreateFromParcel, fValueOf, arbitrageTotalPnlInfoCreateFromParcel, i17, string192, z9, arrayList14, arrayList15, parcel.readInt() == 0 ? null : StrategyProfitResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StrategyDcaEditResp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BalanceDetailInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BotVo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListResp[] newArray(int i) {
            return new StrategyPendingListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyPendingListResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, -1, 524287, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String alternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component100() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component101() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component102() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component103() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component104() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component105() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component106() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component107() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component108() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component109() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component110() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component111() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component112() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignParamItem> component113() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component114() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component115() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component116() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component117() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component118() {
        return this.initPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component119() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component120() {
        return this.tpPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component121() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component122() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component123() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component124() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component125() {
        return this.gridStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component126() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component127() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component128() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component129() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component130() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component131() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component132() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component133() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component134() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component135() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component136() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component137() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component138() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component139() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component140() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component141() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component142() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component143() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component144() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component145() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component146() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component147() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component148() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component149() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component150() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component151() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component152() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component153() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component154() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component155() {
        return this.sizePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component156() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component157() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component158() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component159() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component160() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component161() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component162() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component163() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component164() {
        return this.earlyFillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component165() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component166() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component167() {
        return this.isStoped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component168() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component169() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component170() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component171() {
        return this.outOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component172() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component173() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo component174() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component175() {
        return this.arbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component176() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component177() {
        return this.fundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component178() {
        return this.fundingFeeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> component179() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component180() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component181() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component182() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component183() {
        return this.curQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component184() {
        return this.curBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component185() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component186() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component187() {
        return this.isPostWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component188() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component189() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component190() {
        return this.filledPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component191() {
        return this.needTWapTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component192() {
        return this.strategyTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component193() {
        return this.maturedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component194() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component195() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo component196() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component197() {
        return this.forbidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component198() {
        return this.hiddenFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component199() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component200() {
        return this.dcdPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component201() {
        return this.dcdPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component202() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component203() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component204() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component205() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component206() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component207() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component208() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component209() {
        return this.curStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component210() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component211() {
        return this.settlementCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component212() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component213() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component214() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component215() {
        return this.arbitrageStakingError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> component216() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component217() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component218() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component219() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component220() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component221() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component222() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component223() {
        return this.numOfManualOrderInCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component224() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component225() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> component226() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component227() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component228() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component229() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component230() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component231() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component232() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component233() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component234() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component235() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component236() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component237() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp component238() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto component239() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo component240() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component241() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component242() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component243() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.avgDailyArbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component57() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.floatProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.floatProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.gridProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageOrderBean> component73() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component74() {
        return this.associate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> component77() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.nextInvestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component83() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.cycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> component88() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component89() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component92() {
        return this.balNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component93() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, boolean z, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, List<ArbitrageOrderBean> list, Boolean bool, @NotNull String str72, @NotNull String str73, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, @NotNull String str91, @NotNull String str92, @NotNull String str93, @NotNull String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, String str99, String str100, String str101, String str102, String str103, @NotNull String str104, @NotNull String str105, @NotNull String str106, @NotNull String str107, ArrayList<SignParamItem> arrayList3, String str108, List<DcaTriggerParam> list2, String str109, String str110, @NotNull String str111, @NotNull String str112, String str113, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str114, String str115, String str116, String str117, String str118, String str119, @NotNull String str120, ArrayList<String> arrayList4, String str121, String str122, String str123, String str124, String str125, String str126, String str127, @NotNull String str128, @NotNull String str129, String str130, String str131, String str132, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, boolean z2, @NotNull String str147, String str148, String str149, String str150, String str151, String str152, String str153, boolean z3, boolean z4, String str154, String str155, String str156, boolean z5, boolean z6, String str157, ExtendedBusinessInfo extendedBusinessInfo, String str158, String str159, String str160, String str161, ArrayList<SmartArbListItem> arrayList5, String str162, @NotNull String str163, @NotNull String str164, @NotNull String str165, @NotNull String str166, @NotNull String str167, @NotNull String str168, @NotNull String str169, Boolean bool3, @NotNull String str170, String str171, Boolean bool4, List<Integer> list3, String str172, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, ArrayList<String> arrayList6, ArrayList<String> arrayList7, @NotNull String str173, @NotNull String str174, @NotNull String str175, @NotNull String str176, @NotNull String str177, @NotNull String str178, @NotNull String str179, @NotNull String str180, @NotNull String str181, @NotNull String str182, String str183, boolean z7, String str184, @NotNull String str185, @NotNull String str186, @NotNull String str187, String str188, List<? extends SubArbitrageType4Remote> list4, @NotNull String str189, String str190, String str191, SmartEarnParam smartEarnParam, Float f, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str192, boolean z8, List<FundingFeeApyItem> list5, List<StrategyProfitResponse> list6, StrategyProfitResponse strategyProfitResponse, String str193, String str194, String str195, String str196, @NotNull String str197, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, String str198, String str199, StrategyDcaEditResp strategyDcaEditResp, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, @NotNull String str200, @NotNull String str201, String str202) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str84, "");
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str91, "");
        Intrinsics.checkNotNullParameter(str92, "");
        Intrinsics.checkNotNullParameter(str93, "");
        Intrinsics.checkNotNullParameter(str94, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str97, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str105, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str107, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str120, "");
        Intrinsics.checkNotNullParameter(str128, "");
        Intrinsics.checkNotNullParameter(str129, "");
        Intrinsics.checkNotNullParameter(str147, "");
        Intrinsics.checkNotNullParameter(str163, "");
        Intrinsics.checkNotNullParameter(str164, "");
        Intrinsics.checkNotNullParameter(str165, "");
        Intrinsics.checkNotNullParameter(str166, "");
        Intrinsics.checkNotNullParameter(str167, "");
        Intrinsics.checkNotNullParameter(str168, "");
        Intrinsics.checkNotNullParameter(str169, "");
        Intrinsics.checkNotNullParameter(str170, "");
        Intrinsics.checkNotNullParameter(str173, "");
        Intrinsics.checkNotNullParameter(str174, "");
        Intrinsics.checkNotNullParameter(str175, "");
        Intrinsics.checkNotNullParameter(str176, "");
        Intrinsics.checkNotNullParameter(str177, "");
        Intrinsics.checkNotNullParameter(str178, "");
        Intrinsics.checkNotNullParameter(str179, "");
        Intrinsics.checkNotNullParameter(str180, "");
        Intrinsics.checkNotNullParameter(str181, "");
        Intrinsics.checkNotNullParameter(str182, "");
        Intrinsics.checkNotNullParameter(str185, "");
        Intrinsics.checkNotNullParameter(str186, "");
        Intrinsics.checkNotNullParameter(str187, "");
        Intrinsics.checkNotNullParameter(str189, "");
        Intrinsics.checkNotNullParameter(str197, "");
        Intrinsics.checkNotNullParameter(str200, "");
        Intrinsics.checkNotNullParameter(str201, "");
        return new StrategyPendingListResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, z, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, list, bool, str72, str73, arrayList, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, arrayList2, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, arrayList3, str108, list2, str109, str110, str111, str112, str113, bool2, trailingConfig, trailingConfig2, str114, str115, str116, str117, str118, str119, str120, arrayList4, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, str134, str135, str136, str137, str138, str139, str140, str141, str142, str143, str144, str145, str146, z2, str147, str148, str149, str150, str151, str152, str153, z3, z4, str154, str155, str156, z5, z6, str157, extendedBusinessInfo, str158, str159, str160, str161, arrayList5, str162, str163, str164, str165, str166, str167, str168, str169, bool3, str170, str171, bool4, list3, str172, entrySignalOrderAmtParam, exitSignalOrderAmtParam, tacticsVoucherInfo, arrayList6, arrayList7, str173, str174, str175, str176, str177, str178, str179, str180, str181, str182, str183, z7, str184, str185, str186, str187, str188, list4, str189, str190, str191, smartEarnParam, f, arbitrageTotalPnlInfo, i, str192, z8, list5, list6, strategyProfitResponse, str193, str194, str195, str196, str197, profitDetailResponse, profitDetailResponse2, str198, str199, strategyDcaEditResp, balanceDetailInfoDto, botVo, str200, str201, str202);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String createTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curBaseSz() {
        return this.curBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curQuoteSz() {
        return this.curQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String currency() {
        return this.currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String earlyFillSettleTime() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String earlyFilledTime() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean endStatusFlag() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyPendingListResp)) {
            return false;
        }
        StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) strategyPendingListResp.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyPendingListResp.instId) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyPendingListResp.ccy) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyPendingListResp.ordId) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyPendingListResp.algoId) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyPendingListResp.ordType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyPendingListResp.tdMode) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyPendingListResp.lever) && Intrinsics.EZpvd((Object) this.state, (Object) strategyPendingListResp.state) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) strategyPendingListResp.triggerTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyPendingListResp.cTime) && Intrinsics.EZpvd((Object) this.pxVar, (Object) strategyPendingListResp.pxVar) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) strategyPendingListResp.pxSpread) && Intrinsics.EZpvd((Object) this.szLimit, (Object) strategyPendingListResp.szLimit) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) strategyPendingListResp.pxLimit) && Intrinsics.EZpvd((Object) this.actualSz, (Object) strategyPendingListResp.actualSz) && Intrinsics.EZpvd((Object) this.totalCycleProfit, (Object) strategyPendingListResp.totalCycleProfit) && Intrinsics.EZpvd((Object) this.arbitragePnl, (Object) strategyPendingListResp.arbitragePnl) && Intrinsics.EZpvd((Object) this.arbitrageProfitRate, (Object) strategyPendingListResp.arbitrageProfitRate) && Intrinsics.EZpvd((Object) this.totalCycleProfitRate, (Object) strategyPendingListResp.totalCycleProfitRate) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyPendingListResp.sz) && Intrinsics.EZpvd((Object) this.side, (Object) strategyPendingListResp.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyPendingListResp.posSide) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) strategyPendingListResp.timeInterval) && Intrinsics.EZpvd((Object) this.maxPx, (Object) strategyPendingListResp.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) strategyPendingListResp.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) strategyPendingListResp.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) strategyPendingListResp.runType) && Intrinsics.EZpvd((Object) this.runPx, (Object) strategyPendingListResp.runPx) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) strategyPendingListResp.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) strategyPendingListResp.baseSz) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) strategyPendingListResp.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) strategyPendingListResp.slRatio) && Intrinsics.EZpvd((Object) this.tpOrderPx, (Object) strategyPendingListResp.tpOrderPx) && Intrinsics.EZpvd((Object) this.slOrderPx, (Object) strategyPendingListResp.slOrderPx) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) strategyPendingListResp.tradeNum) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyPendingListResp.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyPendingListResp.pnlRatio) && Intrinsics.EZpvd((Object) this.arbApy, (Object) strategyPendingListResp.arbApy) && Intrinsics.EZpvd((Object) this.investment, (Object) strategyPendingListResp.investment) && Intrinsics.EZpvd((Object) this.cancelType, (Object) strategyPendingListResp.cancelType) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) strategyPendingListResp.notionalUsd) && Intrinsics.EZpvd((Object) this.count, (Object) strategyPendingListResp.count) && Intrinsics.EZpvd((Object) this.stopResult, (Object) strategyPendingListResp.stopResult) && Intrinsics.EZpvd((Object) this.profitNum, (Object) strategyPendingListResp.profitNum) && Intrinsics.EZpvd((Object) this.avgDailyArbitrageNum, (Object) strategyPendingListResp.avgDailyArbitrageNum) && Intrinsics.EZpvd((Object) this.arbitrageNum, (Object) strategyPendingListResp.arbitrageNum) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) strategyPendingListResp.tgtCcy) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) strategyPendingListResp.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) strategyPendingListResp.callbackSpread) && Intrinsics.EZpvd((Object) this.activePx, (Object) strategyPendingListResp.activePx) && Intrinsics.EZpvd((Object) this.activePxType, (Object) strategyPendingListResp.activePxType) && Intrinsics.EZpvd((Object) this.moveTriggerPx, (Object) strategyPendingListResp.moveTriggerPx) && Intrinsics.EZpvd((Object) this.last, (Object) strategyPendingListResp.last) && Intrinsics.EZpvd((Object) this.uTime, (Object) strategyPendingListResp.uTime) && Intrinsics.EZpvd((Object) this.direction, (Object) strategyPendingListResp.direction) && this.basePos == strategyPendingListResp.basePos && Intrinsics.EZpvd((Object) this.noClosePositionId, (Object) strategyPendingListResp.noClosePositionId) && Intrinsics.EZpvd((Object) this.actualLever, (Object) strategyPendingListResp.actualLever) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) strategyPendingListResp.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) strategyPendingListResp.extraMarginSz) && Intrinsics.EZpvd((Object) this.availEq, (Object) strategyPendingListResp.availEq) && Intrinsics.EZpvd((Object) this.liqPx, (Object) strategyPendingListResp.liqPx) && Intrinsics.EZpvd((Object) this.floatProfit, (Object) strategyPendingListResp.floatProfit) && Intrinsics.EZpvd((Object) this.floatProfitInSourceCcy, (Object) strategyPendingListResp.floatProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.floatProfitRate, (Object) strategyPendingListResp.floatProfitRate) && Intrinsics.EZpvd((Object) this.arbitrageApy, (Object) strategyPendingListResp.arbitrageApy) && Intrinsics.EZpvd((Object) this.eq, (Object) strategyPendingListResp.eq) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) strategyPendingListResp.gridProfit) && Intrinsics.EZpvd((Object) this.gridProfitInSourceCcy, (Object) strategyPendingListResp.gridProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.gridProfitRate, (Object) strategyPendingListResp.gridProfitRate) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) strategyPendingListResp.algoOrdType) && Intrinsics.EZpvd(this.instList, strategyPendingListResp.instList) && Intrinsics.EZpvd(this.associate, strategyPendingListResp.associate) && Intrinsics.EZpvd((Object) this.stgyName, (Object) strategyPendingListResp.stgyName) && Intrinsics.EZpvd((Object) this.amt, (Object) strategyPendingListResp.amt) && Intrinsics.EZpvd(this.recurringList, strategyPendingListResp.recurringList) && Intrinsics.EZpvd((Object) this.period, (Object) strategyPendingListResp.period) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) strategyPendingListResp.recurringDay) && Intrinsics.EZpvd((Object) this.nextInvestTime, (Object) strategyPendingListResp.nextInvestTime) && Intrinsics.EZpvd((Object) this.recurringHour, (Object) strategyPendingListResp.recurringHour) && Intrinsics.EZpvd((Object) this.investCcy, (Object) strategyPendingListResp.investCcy) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) strategyPendingListResp.recurringTime) && Intrinsics.EZpvd((Object) this.cycles, (Object) strategyPendingListResp.cycles) && Intrinsics.EZpvd((Object) this.investAmt, (Object) strategyPendingListResp.investAmt) && Intrinsics.EZpvd((Object) this.duration, (Object) strategyPendingListResp.duration) && Intrinsics.EZpvd((Object) this.investType, (Object) strategyPendingListResp.investType) && Intrinsics.EZpvd(this.portfolioList, strategyPendingListResp.portfolioList) && Intrinsics.EZpvd((Object) this.balType, (Object) strategyPendingListResp.balType) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) strategyPendingListResp.deltaRatio) && Intrinsics.EZpvd((Object) this.interval, (Object) strategyPendingListResp.interval) && Intrinsics.EZpvd((Object) this.balNum, (Object) strategyPendingListResp.balNum) && Intrinsics.EZpvd((Object) this.uly, (Object) strategyPendingListResp.uly) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) strategyPendingListResp.quickMgnType) && Intrinsics.EZpvd((Object) this.ordSource, (Object) strategyPendingListResp.ordSource) && Intrinsics.EZpvd((Object) this.triggerType, (Object) strategyPendingListResp.triggerType) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) strategyPendingListResp.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) strategyPendingListResp.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyPendingListResp.avgPx) && Intrinsics.EZpvd((Object) this.tpPx, (Object) strategyPendingListResp.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) strategyPendingListResp.slPx) && Intrinsics.EZpvd((Object) this.slMode, (Object) strategyPendingListResp.slMode) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) strategyPendingListResp.completedCycles) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) strategyPendingListResp.pxSteps) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) strategyPendingListResp.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) strategyPendingListResp.volMult) && Intrinsics.EZpvd((Object) this.tpPct, (Object) strategyPendingListResp.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) strategyPendingListResp.slPct) && Intrinsics.EZpvd((Object) this.investmentCcy, (Object) strategyPendingListResp.investmentCcy) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) strategyPendingListResp.investmentAmt) && Intrinsics.EZpvd((Object) this.maxBotUsage, (Object) strategyPendingListResp.maxBotUsage) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) strategyPendingListResp.closeFraction) && Intrinsics.EZpvd(this.signParams, strategyPendingListResp.signParams) && Intrinsics.EZpvd((Object) this.profit, (Object) strategyPendingListResp.profit) && Intrinsics.EZpvd(this.triggerParams, strategyPendingListResp.triggerParams) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) strategyPendingListResp.sourceAlgoId) && Intrinsics.EZpvd((Object) this.stopType, (Object) strategyPendingListResp.stopType) && Intrinsics.EZpvd((Object) this.initPx, (Object) strategyPendingListResp.initPx) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) strategyPendingListResp.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.tpPriceRange, (Object) strategyPendingListResp.tpPriceRange) && Intrinsics.EZpvd(this.reserveFunds, strategyPendingListResp.reserveFunds) && Intrinsics.EZpvd(this.trailingUpConfig, strategyPendingListResp.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, strategyPendingListResp.trailingDownConfig) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) strategyPendingListResp.trailingDownFund) && Intrinsics.EZpvd((Object) this.gridStatus, (Object) strategyPendingListResp.gridStatus) && Intrinsics.EZpvd((Object) this.lmtOrderNumber, (Object) strategyPendingListResp.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.aggressiveness, (Object) strategyPendingListResp.aggressiveness) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) strategyPendingListResp.profitSharingRatio) && Intrinsics.EZpvd((Object) this.copyType, (Object) strategyPendingListResp.copyType) && Intrinsics.EZpvd((Object) this.mktCap, (Object) strategyPendingListResp.mktCap) && Intrinsics.EZpvd(this.instIds, strategyPendingListResp.instIds) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) strategyPendingListResp.totalAmt) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) strategyPendingListResp.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) strategyPendingListResp.signalChanName) && Intrinsics.EZpvd((Object) this.floatingPnl, (Object) strategyPendingListResp.floatingPnl) && Intrinsics.EZpvd((Object) this.availableMargin, (Object) strategyPendingListResp.availableMargin) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) strategyPendingListResp.totalPnlRatio) && Intrinsics.EZpvd((Object) this.signalCount, (Object) strategyPendingListResp.signalCount) && Intrinsics.EZpvd((Object) this.triggerLast, (Object) strategyPendingListResp.triggerLast) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) strategyPendingListResp.reduceOnly) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) strategyPendingListResp.alternativeCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) strategyPendingListResp.currency) && Intrinsics.EZpvd((Object) this.createTime, (Object) strategyPendingListResp.createTime) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) strategyPendingListResp.expiryTime) && Intrinsics.EZpvd((Object) this.notionalAmount, (Object) strategyPendingListResp.notionalAmount) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) strategyPendingListResp.notionalCurrency) && Intrinsics.EZpvd((Object) this.participationRatio, (Object) strategyPendingListResp.participationRatio) && Intrinsics.EZpvd((Object) this.settlementAmount, (Object) strategyPendingListResp.settlementAmount) && Intrinsics.EZpvd((Object) this.status, (Object) strategyPendingListResp.status) && Intrinsics.EZpvd((Object) this.strike, (Object) strategyPendingListResp.strike) && Intrinsics.EZpvd((Object) this.tradeId, (Object) strategyPendingListResp.tradeId) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) strategyPendingListResp.tradeSide) && Intrinsics.EZpvd((Object) this.timeLeft, (Object) strategyPendingListResp.timeLeft) && Intrinsics.EZpvd((Object) this.notionalAmountPrecision, (Object) strategyPendingListResp.notionalAmountPrecision) && Intrinsics.EZpvd((Object) this.sizePrecision, (Object) strategyPendingListResp.sizePrecision) && Intrinsics.EZpvd((Object) this.strikePrecision, (Object) strategyPendingListResp.strikePrecision) && Intrinsics.EZpvd((Object) this.settlementPricePrecision, (Object) strategyPendingListResp.settlementPricePrecision) && this.endStatusFlag == strategyPendingListResp.endStatusFlag && Intrinsics.EZpvd((Object) this.estimateProfit, (Object) strategyPendingListResp.estimateProfit) && Intrinsics.EZpvd((Object) this.earlyFilledTime, (Object) strategyPendingListResp.earlyFilledTime) && Intrinsics.EZpvd((Object) this.earlyFillAmount, (Object) strategyPendingListResp.earlyFillAmount) && Intrinsics.EZpvd((Object) this.earlyFillCurrency, (Object) strategyPendingListResp.earlyFillCurrency) && Intrinsics.EZpvd((Object) this.earlyFillSettleTime, (Object) strategyPendingListResp.earlyFillSettleTime) && Intrinsics.EZpvd((Object) this.earlyFillPrice, (Object) strategyPendingListResp.earlyFillPrice) && Intrinsics.EZpvd((Object) this.turnoverRatio, (Object) strategyPendingListResp.turnoverRatio) && this.supportEarlyFill == strategyPendingListResp.supportEarlyFill && this.isStoped == strategyPendingListResp.isStoped && Intrinsics.EZpvd((Object) this.symbolsNumber, (Object) strategyPendingListResp.symbolsNumber) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) strategyPendingListResp.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) strategyPendingListResp.sourceCcySz) && this.outOfRange == strategyPendingListResp.outOfRange && this.autoMarginReloadSwitch == strategyPendingListResp.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) strategyPendingListResp.autoMarginReloadMaxAmount) && Intrinsics.EZpvd(this.extendedBusinessInfo, strategyPendingListResp.extendedBusinessInfo) && Intrinsics.EZpvd((Object) this.arbPnl, (Object) strategyPendingListResp.arbPnl) && Intrinsics.EZpvd((Object) this.instFamily, (Object) strategyPendingListResp.instFamily) && Intrinsics.EZpvd((Object) this.fundingFeeRatio, (Object) strategyPendingListResp.fundingFeeRatio) && Intrinsics.EZpvd((Object) this.fundingFeeTime, (Object) strategyPendingListResp.fundingFeeTime) && Intrinsics.EZpvd(this.arbList, strategyPendingListResp.arbList) && Intrinsics.EZpvd((Object) this.totalFundingFeeRatio, (Object) strategyPendingListResp.totalFundingFeeRatio) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) strategyPendingListResp.perMinProfitRate) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) strategyPendingListResp.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.curQuoteSz, (Object) strategyPendingListResp.curQuoteSz) && Intrinsics.EZpvd((Object) this.curBaseSz, (Object) strategyPendingListResp.curBaseSz) && Intrinsics.EZpvd((Object) this.pnlRatioInSourceCcy, (Object) strategyPendingListResp.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.totalPnlInSourceCcy, (Object) strategyPendingListResp.totalPnlInSourceCcy) && Intrinsics.EZpvd((Object) this.isPostWarning, (Object) strategyPendingListResp.isPostWarning) && Intrinsics.EZpvd(this.isTradeBorrowMode, strategyPendingListResp.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) strategyPendingListResp.lastPrice) && Intrinsics.EZpvd((Object) this.filledPercentage, (Object) strategyPendingListResp.filledPercentage) && Intrinsics.EZpvd(this.needTWapTips, strategyPendingListResp.needTWapTips) && Intrinsics.EZpvd(this.strategyTags, strategyPendingListResp.strategyTags) && Intrinsics.EZpvd((Object) this.maturedApy, (Object) strategyPendingListResp.maturedApy) && Intrinsics.EZpvd(this.signalOrderAmtParam, strategyPendingListResp.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, strategyPendingListResp.signalBotOrderStopParam) && Intrinsics.EZpvd(this.voucherInfo, strategyPendingListResp.voucherInfo) && Intrinsics.EZpvd(this.forbidden, strategyPendingListResp.forbidden) && Intrinsics.EZpvd(this.hiddenFeatures, strategyPendingListResp.hiddenFeatures) && Intrinsics.EZpvd((Object) this.dcdState, (Object) strategyPendingListResp.dcdState) && Intrinsics.EZpvd((Object) this.dcdPnl, (Object) strategyPendingListResp.dcdPnl) && Intrinsics.EZpvd((Object) this.dcdPnlRatio, (Object) strategyPendingListResp.dcdPnlRatio) && Intrinsics.EZpvd((Object) this.notional, (Object) strategyPendingListResp.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) strategyPendingListResp.notionalCcy) && Intrinsics.EZpvd((Object) this.cycle, (Object) strategyPendingListResp.cycle) && Intrinsics.EZpvd((Object) this.currencyBal, (Object) strategyPendingListResp.currencyBal) && Intrinsics.EZpvd((Object) this.alternateCurrency, (Object) strategyPendingListResp.alternateCurrency) && Intrinsics.EZpvd((Object) this.avgCost, (Object) strategyPendingListResp.avgCost) && Intrinsics.EZpvd((Object) this.coinPnl, (Object) strategyPendingListResp.coinPnl) && Intrinsics.EZpvd((Object) this.curStrike, (Object) strategyPendingListResp.curStrike) && this.reinvestment == strategyPendingListResp.reinvestment && Intrinsics.EZpvd((Object) this.settlementCcy, (Object) strategyPendingListResp.settlementCcy) && Intrinsics.EZpvd((Object) this.pTime, (Object) strategyPendingListResp.pTime) && Intrinsics.EZpvd((Object) this.lastTradeExpireTime, (Object) strategyPendingListResp.lastTradeExpireTime) && Intrinsics.EZpvd((Object) this.lastSettlementSettledTime, (Object) strategyPendingListResp.lastSettlementSettledTime) && Intrinsics.EZpvd((Object) this.arbitrageStakingError, (Object) strategyPendingListResp.arbitrageStakingError) && Intrinsics.EZpvd(this.subArbTypes, strategyPendingListResp.subArbTypes) && Intrinsics.EZpvd((Object) this.absYieldPercentage, (Object) strategyPendingListResp.absYieldPercentage) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyPendingListResp.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.displayId, (Object) strategyPendingListResp.displayId) && Intrinsics.EZpvd(this.simpleEarn, strategyPendingListResp.simpleEarn) && Intrinsics.EZpvd(this.leveragePrincipal, strategyPendingListResp.leveragePrincipal) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, strategyPendingListResp.arbitrageTotalPnlInfo) && this.numOfManualOrderInCycle == strategyPendingListResp.numOfManualOrderInCycle && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) strategyPendingListResp.highestApyPeriod) && this.displayMinPaybackDays == strategyPendingListResp.displayMinPaybackDays && Intrinsics.EZpvd(this.fundingFeeApyList, strategyPendingListResp.fundingFeeApyList) && Intrinsics.EZpvd(this.profitSnapshots, strategyPendingListResp.profitSnapshots) && Intrinsics.EZpvd(this.latestProfit, strategyPendingListResp.latestProfit) && Intrinsics.EZpvd((Object) this.totalSpreadProfit, (Object) strategyPendingListResp.totalSpreadProfit) && Intrinsics.EZpvd((Object) this.totalApy, (Object) strategyPendingListResp.totalApy) && Intrinsics.EZpvd((Object) this.fee, (Object) strategyPendingListResp.fee) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) strategyPendingListResp.totalInterestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) strategyPendingListResp.debtCcy) && Intrinsics.EZpvd(this.arbitrageProfit, strategyPendingListResp.arbitrageProfit) && Intrinsics.EZpvd(this.stakingProfit, strategyPendingListResp.stakingProfit) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) strategyPendingListResp.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) strategyPendingListResp.safetyOrdAmt) && Intrinsics.EZpvd(this.effectiveEditParametersDetails, strategyPendingListResp.effectiveEditParametersDetails) && Intrinsics.EZpvd(this.balanceDetails, strategyPendingListResp.balanceDetails) && Intrinsics.EZpvd(this.bot, strategyPendingListResp.bot) && Intrinsics.EZpvd((Object) this.tpTriggerRatio, (Object) strategyPendingListResp.tpTriggerRatio) && Intrinsics.EZpvd((Object) this.slTriggerRatio, (Object) strategyPendingListResp.slTriggerRatio) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) strategyPendingListResp.advanceOrdType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String estimateProfit() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String expiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ExtendedBusinessInfo extendedBusinessInfo() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbsYieldPercentage() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePxType() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualLever() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualSz() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAdvanceOrderType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAggressiveness() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternateCurrency() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    public String getAmendPxOnTriggerTypeForMultiSl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
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
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbStakingError() {
        return this.arbitrageStakingError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getArbiDisplayMinPaybackDays() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<FundingFeeApyItem> getArbiFundingFeeApyList() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbiHighestApyPeriod() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArbitrageTotalPnlInfo getArbiTotalPnlInfo() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageApy() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<ArbitrageOrderBean> getArbitrageList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageNum() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitragePnl() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getArbitrageProfit() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageProfitRate() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageStakingError() {
        return this.arbitrageStakingError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo getArbitrageTotalPnlInfo() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAssociate() {
        return this.associate;
    }

    @Override // o.InterfaceC55726xpQ
    public List<TradeOrderStopParam> getAttachAlgoOrders() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getAutoMarginMaxAmount() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoMarginReloadMaxAmount() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoMarginReloadSwitch() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getAutoMarginSwitch() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableMargin() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgCost() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgDailyArbitrageNum() {
        return this.avgDailyArbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getAvgPrice() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalNum() {
        return this.balNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public BalanceDetailInfoDto getBalanceDetailInfoDto() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto getBalanceDetails() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo getBot() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBotId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public BotVo getBotVo() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getCancelTime() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPnl() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getCompleteCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyType() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurBaseSz() {
        return this.curBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurQuoteSz() {
        return this.curQuoteSz;
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
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getCurrentTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycle() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycles() {
        return this.cycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcaInitOrdAmt() {
        String str = this.initOrdAmt;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcaSafetyOrdAmt() {
        String str = this.safetyOrdAmt;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcaTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdAlternateCurrency() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getDcdArbApy() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdAvgCost() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdBotPnl() {
        return this.dcdPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdBotPnlRatio() {
        return this.dcdPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcdBotState() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdCoinPnl() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdCurrencyValue() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getDcdCycle() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdPnl() {
        return this.dcdPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdPnlRatio() {
        return this.dcdPnlRatio;
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
    public final String getDeltaRatio() {
        return this.deltaRatio;
    }

    @Override // o.InterfaceC55726xpQ
    public DexOrderDetail getDexOrderDetail() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayMinPaybackDays() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillAmount() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillCurrency() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillPrice() {
        return this.earlyFillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillSettleTime() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFilledTime() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp getEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEndStatusFlag() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getErrorMsg() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateProfit() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListRespExt getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo getExtendedBusinessInfo() {
        return this.extendedBusinessInfo;
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
    public String getFillSafetyOrders() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getFilledPercent() {
        return this.filledPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledPercentage() {
        return this.filledPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfit() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfitInSourceCcy() {
        return this.floatProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfitRate() {
        return this.floatProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatingPnl() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getForbidden() {
        return this.forbidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> getFundingFeeApyList() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeRatio() {
        return this.fundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeTime() {
        return this.fundingFeeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfitInSourceCcy() {
        return this.gridProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfitRate() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<SignParamItem> getGridSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridSlPnlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridState() {
        return this.gridStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridStatus() {
        return this.gridStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridTpPnlRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getHiddenFeatures() {
        return this.hiddenFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighestApyPeriod() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIceAggressiveNess() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitPx() {
        return this.initPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInitPxValue() {
        return this.initPx;
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
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getInstIdByALl() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageOrderBean> getInstList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getInstTypeByAll() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterval() {
        return this.interval;
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
    public final String getInvestType() {
        return this.investType;
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
    public String getInvestmentamt() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInvestmentccy() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastSettlementSettledTime() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTradeExpireTime() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse getLatestProfit() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public StrategyProfitResponse getLatestProfitData() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLimitOrderNumber() {
        return this.lmtOrderNumber;
    }

    public LinkedOrd getLinkedOrder() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLmtOrderNumber() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getMTrailingDownFund() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getMarkByPage() {
        return this.algoId;
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
    public String getMaxBotUsages() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getMaxSafetyOrders() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCap() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveTriggerPx() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedTWapTips() {
        return this.needTWapTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextInvestTime() {
        return this.nextInvestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoClosePositionId() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmount() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmountPrecision() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCurrency() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNumManualOrderInCycle() {
        return this.numOfManualOrderInCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNumOfManualOrderInCycle() {
        return this.numOfManualOrderInCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<StrategyProfitResponse> getOngoingProfitSnapshots() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrdCopyType() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdSource() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActivePxType() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualPx() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualSide() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualSz() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoIdAll() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getOrderArbitrageNum() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderAvailableMargin() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderCount() {
        return this.count;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCtVal() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderDayArbitrageNum() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public StrategyDcaEditResp getOrderEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFailCodeReason() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFloatProfit() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderFloatingPnl() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFundingRate() {
        return this.fundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFundingTime() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrderIdByAll() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<String> getOrderInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderMktCap() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderOrdPx() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderRuleType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderRunPx() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalChanName() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalCount() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSlOrderPx() {
        return this.slOrderPx;
    }

    @Override // o.InterfaceC55726xpQ
    public String getOrderSlTriggerPxType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderSlTriggerRatio() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderStopResult() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSymbolsNumber() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<Integer> getOrderTags() {
        return this.strategyTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpOrderPx() {
        return this.tpOrderPx;
    }

    @Override // o.InterfaceC55726xpQ
    public String getOrderTpTriggerPxType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderTpTriggerRatio() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTradeNum() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerLast() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerPx() {
        return this.moveTriggerPx;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerPxType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrtType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOutOfRange() {
        return this.outOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPTimeValue() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParticipationRatio() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatioInSourceCcy() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPortfolioBalNum() {
        return this.balNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalRatio() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> getPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositionIdNoClose() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPriceDigit() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> getProfitSnapshots() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getProfitValue() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getQuickMgnTypeInterval() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecHourly() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<RecurringListItem> getRecList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRecNextInvestTime() {
        return this.nextInvestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecTime() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringHour() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> getRecurringList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTime() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getReinvestmentInfo() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunPx() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAmount() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementCcy() {
        return this.settlementCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementPricePrecision() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignParamItem> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public EntrySignalOrderAmtParam getSignalAmtParam() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ExitSignalOrderAmtParam getSignalBotStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanName() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalCount() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam getSignalOrderAmtParam() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam getSimpleEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSizePrecision() {
        return this.sizePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrderPx() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSlPrice() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPx() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerRatio() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<SmartArbListItem> getSmartArbList() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSmartArbTotalFeeRatio() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public SmartEarnParam getSmartEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<SmartPortfolioListItem> getSmartPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSourceBotId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcySz() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSourceId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getStakingProfit() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getStateByAll() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStgyAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStgyInvestAmt() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getStgyInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStopLessMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopResult() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStrategyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getStrategyTags() {
        return this.strategyTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePrecision() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> getSubArbTypes() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getSumApyAndStakingApy() {
        String str = this.totalApy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEarlyFill() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbolsNumber() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    public TacticsData getTacticsRespData() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeLeft() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
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
    public final String getTotalCycleProfitRate() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFundingFeeRatio() {
        return this.totalFundingFeeRatio;
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
    public final String getTotalPnlInSourceCcy() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSpreadProfit() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrderPx() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getTpPrice() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPriceRange() {
        return this.tpPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getTpRange() {
        return this.tpPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerRatio() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeNum() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getTradeQuoteCcyForSpot() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TrailingConfig getTrailingDown() {
        return this.trailingDownConfig;
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
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TrailingConfig getTrailingUp() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerLast() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnoverRatio() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getUTimeValue() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.ccy.hashCode();
        int iHashCode4 = this.ordId.hashCode();
        int iHashCode5 = this.algoId.hashCode();
        int iHashCode6 = this.ordType.hashCode();
        int iHashCode7 = this.tdMode.hashCode();
        int iHashCode8 = this.lever.hashCode();
        int iHashCode9 = this.state.hashCode();
        int iHashCode10 = this.triggerTime.hashCode();
        int iHashCode11 = this.cTime.hashCode();
        int iHashCode12 = this.pxVar.hashCode();
        int iHashCode13 = this.pxSpread.hashCode();
        int iHashCode14 = this.szLimit.hashCode();
        int iHashCode15 = this.pxLimit.hashCode();
        int iHashCode16 = this.actualSz.hashCode();
        int iHashCode17 = this.totalCycleProfit.hashCode();
        int iHashCode18 = this.arbitragePnl.hashCode();
        int iHashCode19 = this.arbitrageProfitRate.hashCode();
        int iHashCode20 = this.totalCycleProfitRate.hashCode();
        int iHashCode21 = this.sz.hashCode();
        int iHashCode22 = this.side.hashCode();
        int iHashCode23 = this.posSide.hashCode();
        int iHashCode24 = this.timeInterval.hashCode();
        int iHashCode25 = this.maxPx.hashCode();
        int iHashCode26 = this.minPx.hashCode();
        int iHashCode27 = this.gridNum.hashCode();
        int iHashCode28 = this.runType.hashCode();
        int iHashCode29 = this.runPx.hashCode();
        int iHashCode30 = this.quoteSz.hashCode();
        int iHashCode31 = this.baseSz.hashCode();
        int iHashCode32 = this.tpRatio.hashCode();
        int iHashCode33 = this.slRatio.hashCode();
        int iHashCode34 = this.tpOrderPx.hashCode();
        int iHashCode35 = this.slOrderPx.hashCode();
        int iHashCode36 = this.tradeNum.hashCode();
        int iHashCode37 = this.totalPnl.hashCode();
        int iHashCode38 = this.pnlRatio.hashCode();
        int iHashCode39 = this.arbApy.hashCode();
        int iHashCode40 = this.investment.hashCode();
        int iHashCode41 = this.cancelType.hashCode();
        int iHashCode42 = this.notionalUsd.hashCode();
        int iHashCode43 = this.count.hashCode();
        int iHashCode44 = this.stopResult.hashCode();
        int iHashCode45 = this.profitNum.hashCode();
        int iHashCode46 = this.avgDailyArbitrageNum.hashCode();
        int iHashCode47 = this.arbitrageNum.hashCode();
        String str = this.tgtCcy;
        int iHashCode48 = str == null ? 0 : str.hashCode();
        int iHashCode49 = this.callbackRatio.hashCode();
        int iHashCode50 = this.callbackSpread.hashCode();
        int iHashCode51 = this.activePx.hashCode();
        int iHashCode52 = this.activePxType.hashCode();
        int iHashCode53 = this.moveTriggerPx.hashCode();
        int iHashCode54 = this.last.hashCode();
        int iHashCode55 = this.uTime.hashCode();
        int iHashCode56 = this.direction.hashCode();
        int iHashCode57 = Boolean.hashCode(this.basePos);
        int iHashCode58 = this.noClosePositionId.hashCode();
        int iHashCode59 = this.actualLever.hashCode();
        int iHashCode60 = this.actualMarginSz.hashCode();
        int iHashCode61 = this.extraMarginSz.hashCode();
        int iHashCode62 = this.availEq.hashCode();
        int iHashCode63 = this.liqPx.hashCode();
        int iHashCode64 = this.floatProfit.hashCode();
        int iHashCode65 = this.floatProfitInSourceCcy.hashCode();
        int iHashCode66 = this.floatProfitRate.hashCode();
        int iHashCode67 = this.arbitrageApy.hashCode();
        int iHashCode68 = this.eq.hashCode();
        int iHashCode69 = this.gridProfit.hashCode();
        int iHashCode70 = this.gridProfitInSourceCcy.hashCode();
        int iHashCode71 = this.gridProfitRate.hashCode();
        int iHashCode72 = this.algoOrdType.hashCode();
        List<ArbitrageOrderBean> list = this.instList;
        int iHashCode73 = list == null ? 0 : list.hashCode();
        Boolean bool = this.associate;
        int iHashCode74 = bool == null ? 0 : bool.hashCode();
        int iHashCode75 = this.stgyName.hashCode();
        int iHashCode76 = this.amt.hashCode();
        int iHashCode77 = this.recurringList.hashCode();
        int iHashCode78 = this.period.hashCode();
        int iHashCode79 = this.recurringDay.hashCode();
        int iHashCode80 = this.nextInvestTime.hashCode();
        int iHashCode81 = this.recurringHour.hashCode();
        int iHashCode82 = this.investCcy.hashCode();
        int iHashCode83 = this.recurringTime.hashCode();
        int iHashCode84 = this.cycles.hashCode();
        int iHashCode85 = this.investAmt.hashCode();
        int iHashCode86 = this.duration.hashCode();
        int iHashCode87 = this.investType.hashCode();
        int iHashCode88 = this.portfolioList.hashCode();
        int iHashCode89 = this.balType.hashCode();
        int iHashCode90 = this.deltaRatio.hashCode();
        int iHashCode91 = this.interval.hashCode();
        int iHashCode92 = this.balNum.hashCode();
        int iHashCode93 = this.uly.hashCode();
        int iHashCode94 = this.quickMgnType.hashCode();
        String str2 = this.ordSource;
        int iHashCode95 = str2 == null ? 0 : str2.hashCode();
        int iHashCode96 = this.triggerType.hashCode();
        int iHashCode97 = this.maxSafetyOrds.hashCode();
        int iHashCode98 = this.fillSafetyOrds.hashCode();
        int iHashCode99 = this.avgPx.hashCode();
        int iHashCode100 = this.tpPx.hashCode();
        int iHashCode101 = this.slPx.hashCode();
        int iHashCode102 = this.slMode.hashCode();
        int iHashCode103 = this.completedCycles.hashCode();
        String str3 = this.pxSteps;
        int iHashCode104 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pxStepsMult;
        int iHashCode105 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.volMult;
        int iHashCode106 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tpPct;
        int iHashCode107 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slPct;
        int iHashCode108 = str7 == null ? 0 : str7.hashCode();
        int iHashCode109 = this.investmentCcy.hashCode();
        int iHashCode110 = this.investmentAmt.hashCode();
        int iHashCode111 = this.maxBotUsage.hashCode();
        int iHashCode112 = this.closeFraction.hashCode();
        ArrayList<SignParamItem> arrayList = this.signParams;
        int iHashCode113 = arrayList == null ? 0 : arrayList.hashCode();
        String str8 = this.profit;
        int iHashCode114 = str8 == null ? 0 : str8.hashCode();
        List<DcaTriggerParam> list2 = this.triggerParams;
        int iHashCode115 = list2 == null ? 0 : list2.hashCode();
        String str9 = this.sourceAlgoId;
        int iHashCode116 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.stopType;
        int iHashCode117 = str10 == null ? 0 : str10.hashCode();
        int iHashCode118 = this.initPx.hashCode();
        int iHashCode119 = this.perGridProfitRatio.hashCode();
        String str11 = this.tpPriceRange;
        int iHashCode120 = str11 == null ? 0 : str11.hashCode();
        Boolean bool2 = this.reserveFunds;
        int iHashCode121 = bool2 == null ? 0 : bool2.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode122 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode123 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str12 = this.trailingDownFund;
        int iHashCode124 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gridStatus;
        int iHashCode125 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.lmtOrderNumber;
        int iHashCode126 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.aggressiveness;
        int iHashCode127 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.profitSharingRatio;
        int iHashCode128 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.copyType;
        int iHashCode129 = str17 == null ? 0 : str17.hashCode();
        int iHashCode130 = this.mktCap.hashCode();
        ArrayList<String> arrayList2 = this.instIds;
        int iHashCode131 = arrayList2 == null ? 0 : arrayList2.hashCode();
        String str18 = this.totalAmt;
        int iHashCode132 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.signalChanId;
        int iHashCode133 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.signalChanName;
        int iHashCode134 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.floatingPnl;
        int iHashCode135 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.availableMargin;
        int iHashCode136 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.totalPnlRatio;
        int iHashCode137 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.signalCount;
        int iHashCode138 = str24 == null ? 0 : str24.hashCode();
        int iHashCode139 = this.triggerLast.hashCode();
        int iHashCode140 = this.reduceOnly.hashCode();
        String str25 = this.alternativeCurrency;
        int iHashCode141 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.currency;
        int iHashCode142 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.createTime;
        int iHashCode143 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.expiryTime;
        int iHashCode144 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.notionalAmount;
        int iHashCode145 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.notionalCurrency;
        int iHashCode146 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.participationRatio;
        int iHashCode147 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.settlementAmount;
        int iHashCode148 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.status;
        int iHashCode149 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.strike;
        int iHashCode150 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.tradeId;
        int iHashCode151 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.tradeSide;
        int iHashCode152 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.timeLeft;
        int iHashCode153 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.notionalAmountPrecision;
        int iHashCode154 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.sizePrecision;
        int iHashCode155 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.strikePrecision;
        int iHashCode156 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.settlementPricePrecision;
        int iHashCode157 = str41 == null ? 0 : str41.hashCode();
        int iHashCode158 = Boolean.hashCode(this.endStatusFlag);
        int iHashCode159 = this.estimateProfit.hashCode();
        String str42 = this.earlyFilledTime;
        int iHashCode160 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.earlyFillAmount;
        int iHashCode161 = str43 == null ? 0 : str43.hashCode();
        String str44 = this.earlyFillCurrency;
        int iHashCode162 = str44 == null ? 0 : str44.hashCode();
        String str45 = this.earlyFillSettleTime;
        int iHashCode163 = str45 == null ? 0 : str45.hashCode();
        String str46 = this.earlyFillPrice;
        int iHashCode164 = str46 == null ? 0 : str46.hashCode();
        String str47 = this.turnoverRatio;
        int iHashCode165 = str47 == null ? 0 : str47.hashCode();
        int iHashCode166 = Boolean.hashCode(this.supportEarlyFill);
        int iHashCode167 = Boolean.hashCode(this.isStoped);
        String str48 = this.symbolsNumber;
        int iHashCode168 = str48 == null ? 0 : str48.hashCode();
        String str49 = this.sourceCcy;
        int iHashCode169 = str49 == null ? 0 : str49.hashCode();
        String str50 = this.sourceCcySz;
        int iHashCode170 = str50 == null ? 0 : str50.hashCode();
        int iHashCode171 = Boolean.hashCode(this.outOfRange);
        int iHashCode172 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str51 = this.autoMarginReloadMaxAmount;
        int iHashCode173 = str51 == null ? 0 : str51.hashCode();
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        int iHashCode174 = extendedBusinessInfo == null ? 0 : extendedBusinessInfo.hashCode();
        String str52 = this.arbPnl;
        int iHashCode175 = str52 == null ? 0 : str52.hashCode();
        String str53 = this.instFamily;
        int iHashCode176 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.fundingFeeRatio;
        int iHashCode177 = str54 == null ? 0 : str54.hashCode();
        String str55 = this.fundingFeeTime;
        int iHashCode178 = str55 == null ? 0 : str55.hashCode();
        ArrayList<SmartArbListItem> arrayList3 = this.arbList;
        int iHashCode179 = arrayList3 == null ? 0 : arrayList3.hashCode();
        String str56 = this.totalFundingFeeRatio;
        int iHashCode180 = str56 == null ? 0 : str56.hashCode();
        int iHashCode181 = this.perMinProfitRate.hashCode();
        int iHashCode182 = this.perMaxProfitRate.hashCode();
        int iHashCode183 = this.curQuoteSz.hashCode();
        int iHashCode184 = this.curBaseSz.hashCode();
        int iHashCode185 = this.pnlRatioInSourceCcy.hashCode();
        int iHashCode186 = this.totalPnlInSourceCcy.hashCode();
        int iHashCode187 = this.isPostWarning.hashCode();
        Boolean bool3 = this.isTradeBorrowMode;
        int iHashCode188 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode189 = this.lastPrice.hashCode();
        String str57 = this.filledPercentage;
        int iHashCode190 = str57 == null ? 0 : str57.hashCode();
        Boolean bool4 = this.needTWapTips;
        int iHashCode191 = bool4 == null ? 0 : bool4.hashCode();
        List<Integer> list3 = this.strategyTags;
        int iHashCode192 = list3 == null ? 0 : list3.hashCode();
        String str58 = this.maturedApy;
        int iHashCode193 = str58 == null ? 0 : str58.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode194 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        int iHashCode195 = exitSignalOrderAmtParam == null ? 0 : exitSignalOrderAmtParam.hashCode();
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        int iHashCode196 = tacticsVoucherInfo == null ? 0 : tacticsVoucherInfo.hashCode();
        ArrayList<String> arrayList4 = this.forbidden;
        int iHashCode197 = arrayList4 == null ? 0 : arrayList4.hashCode();
        ArrayList<String> arrayList5 = this.hiddenFeatures;
        int iHashCode198 = arrayList5 == null ? 0 : arrayList5.hashCode();
        int iHashCode199 = this.dcdState.hashCode();
        int iHashCode200 = this.dcdPnl.hashCode();
        int iHashCode201 = this.dcdPnlRatio.hashCode();
        int iHashCode202 = this.notional.hashCode();
        int iHashCode203 = this.notionalCcy.hashCode();
        int iHashCode204 = this.cycle.hashCode();
        int iHashCode205 = this.currencyBal.hashCode();
        int iHashCode206 = this.alternateCurrency.hashCode();
        int iHashCode207 = this.avgCost.hashCode();
        int iHashCode208 = this.coinPnl.hashCode();
        String str59 = this.curStrike;
        int iHashCode209 = str59 == null ? 0 : str59.hashCode();
        int iHashCode210 = Boolean.hashCode(this.reinvestment);
        String str60 = this.settlementCcy;
        int iHashCode211 = str60 == null ? 0 : str60.hashCode();
        int iHashCode212 = this.pTime.hashCode();
        int iHashCode213 = this.lastTradeExpireTime.hashCode();
        int iHashCode214 = this.lastSettlementSettledTime.hashCode();
        String str61 = this.arbitrageStakingError;
        int iHashCode215 = str61 == null ? 0 : str61.hashCode();
        List<? extends SubArbitrageType4Remote> list4 = this.subArbTypes;
        int iHashCode216 = list4 == null ? 0 : list4.hashCode();
        int iHashCode217 = this.absYieldPercentage.hashCode();
        String str62 = this.tradeQuoteCcy;
        int iHashCode218 = str62 == null ? 0 : str62.hashCode();
        String str63 = this.displayId;
        int iHashCode219 = str63 == null ? 0 : str63.hashCode();
        SmartEarnParam smartEarnParam = this.simpleEarn;
        int iHashCode220 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode221 = f == null ? 0 : f.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode222 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        int iHashCode223 = Integer.hashCode(this.numOfManualOrderInCycle);
        String str64 = this.highestApyPeriod;
        int iHashCode224 = str64 == null ? 0 : str64.hashCode();
        int iHashCode225 = Boolean.hashCode(this.displayMinPaybackDays);
        List<FundingFeeApyItem> list5 = this.fundingFeeApyList;
        int iHashCode226 = list5 == null ? 0 : list5.hashCode();
        List<StrategyProfitResponse> list6 = this.profitSnapshots;
        int iHashCode227 = list6 == null ? 0 : list6.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        int iHashCode228 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        String str65 = this.totalSpreadProfit;
        int iHashCode229 = str65 == null ? 0 : str65.hashCode();
        String str66 = this.totalApy;
        int iHashCode230 = str66 == null ? 0 : str66.hashCode();
        String str67 = this.fee;
        int iHashCode231 = str67 == null ? 0 : str67.hashCode();
        String str68 = this.totalInterestAmt;
        int iHashCode232 = str68 == null ? 0 : str68.hashCode();
        int iHashCode233 = this.debtCcy.hashCode();
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        int iHashCode234 = profitDetailResponse == null ? 0 : profitDetailResponse.hashCode();
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        int iHashCode235 = profitDetailResponse2 == null ? 0 : profitDetailResponse2.hashCode();
        String str69 = this.initOrdAmt;
        int iHashCode236 = str69 == null ? 0 : str69.hashCode();
        String str70 = this.safetyOrdAmt;
        int iHashCode237 = str70 == null ? 0 : str70.hashCode();
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        int iHashCode238 = strategyDcaEditResp == null ? 0 : strategyDcaEditResp.hashCode();
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        int iHashCode239 = balanceDetailInfoDto == null ? 0 : balanceDetailInfoDto.hashCode();
        BotVo botVo = this.bot;
        int iHashCode240 = botVo == null ? 0 : botVo.hashCode();
        int iHashCode241 = this.tpTriggerRatio.hashCode();
        int iHashCode242 = this.slTriggerRatio.hashCode();
        String str71 = this.advanceOrdType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + iHashCode100) * 31) + iHashCode101) * 31) + iHashCode102) * 31) + iHashCode103) * 31) + iHashCode104) * 31) + iHashCode105) * 31) + iHashCode106) * 31) + iHashCode107) * 31) + iHashCode108) * 31) + iHashCode109) * 31) + iHashCode110) * 31) + iHashCode111) * 31) + iHashCode112) * 31) + iHashCode113) * 31) + iHashCode114) * 31) + iHashCode115) * 31) + iHashCode116) * 31) + iHashCode117) * 31) + iHashCode118) * 31) + iHashCode119) * 31) + iHashCode120) * 31) + iHashCode121) * 31) + iHashCode122) * 31) + iHashCode123) * 31) + iHashCode124) * 31) + iHashCode125) * 31) + iHashCode126) * 31) + iHashCode127) * 31) + iHashCode128) * 31) + iHashCode129) * 31) + iHashCode130) * 31) + iHashCode131) * 31) + iHashCode132) * 31) + iHashCode133) * 31) + iHashCode134) * 31) + iHashCode135) * 31) + iHashCode136) * 31) + iHashCode137) * 31) + iHashCode138) * 31) + iHashCode139) * 31) + iHashCode140) * 31) + iHashCode141) * 31) + iHashCode142) * 31) + iHashCode143) * 31) + iHashCode144) * 31) + iHashCode145) * 31) + iHashCode146) * 31) + iHashCode147) * 31) + iHashCode148) * 31) + iHashCode149) * 31) + iHashCode150) * 31) + iHashCode151) * 31) + iHashCode152) * 31) + iHashCode153) * 31) + iHashCode154) * 31) + iHashCode155) * 31) + iHashCode156) * 31) + iHashCode157) * 31) + iHashCode158) * 31) + iHashCode159) * 31) + iHashCode160) * 31) + iHashCode161) * 31) + iHashCode162) * 31) + iHashCode163) * 31) + iHashCode164) * 31) + iHashCode165) * 31) + iHashCode166) * 31) + iHashCode167) * 31) + iHashCode168) * 31) + iHashCode169) * 31) + iHashCode170) * 31) + iHashCode171) * 31) + iHashCode172) * 31) + iHashCode173) * 31) + iHashCode174) * 31) + iHashCode175) * 31) + iHashCode176) * 31) + iHashCode177) * 31) + iHashCode178) * 31) + iHashCode179) * 31) + iHashCode180) * 31) + iHashCode181) * 31) + iHashCode182) * 31) + iHashCode183) * 31) + iHashCode184) * 31) + iHashCode185) * 31) + iHashCode186) * 31) + iHashCode187) * 31) + iHashCode188) * 31) + iHashCode189) * 31) + iHashCode190) * 31) + iHashCode191) * 31) + iHashCode192) * 31) + iHashCode193) * 31) + iHashCode194) * 31) + iHashCode195) * 31) + iHashCode196) * 31) + iHashCode197) * 31) + iHashCode198) * 31) + iHashCode199) * 31) + iHashCode200) * 31) + iHashCode201) * 31) + iHashCode202) * 31) + iHashCode203) * 31) + iHashCode204) * 31) + iHashCode205) * 31) + iHashCode206) * 31) + iHashCode207) * 31) + iHashCode208) * 31) + iHashCode209) * 31) + iHashCode210) * 31) + iHashCode211) * 31) + iHashCode212) * 31) + iHashCode213) * 31) + iHashCode214) * 31) + iHashCode215) * 31) + iHashCode216) * 31) + iHashCode217) * 31) + iHashCode218) * 31) + iHashCode219) * 31) + iHashCode220) * 31) + iHashCode221) * 31) + iHashCode222) * 31) + iHashCode223) * 31) + iHashCode224) * 31) + iHashCode225) * 31) + iHashCode226) * 31) + iHashCode227) * 31) + iHashCode228) * 31) + iHashCode229) * 31) + iHashCode230) * 31) + iHashCode231) * 31) + iHashCode232) * 31) + iHashCode233) * 31) + iHashCode234) * 31) + iHashCode235) * 31) + iHashCode236) * 31) + iHashCode237) * 31) + iHashCode238) * 31) + iHashCode239) * 31) + iHashCode240) * 31) + iHashCode241) * 31) + iHashCode242) * 31) + (str71 != null ? str71.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean isAssociate() {
        return this.associate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean isBorrowMode() {
        return this.isTradeBorrowMode;
    }

    @Override // o.InterfaceC55726xpQ
    public boolean isDexOrder() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public boolean isHistoryOrder() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String isNeedPostWarning() {
        return this.isPostWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isOutOfRange() {
        return this.outOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isPostWarning() {
        return this.isPostWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isStop() {
        return this.isStoped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStoped() {
        return this.isStoped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String lastSettlementSettledTime() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String lastTradeExpireTime() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String notionalAmount() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String participationRatio() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String pnlRatioInSourceCcy() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String pxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String pxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean reserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbsYieldPercentage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.absYieldPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePxType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activePxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggressiveness(String str) {
        this.aggressiveness = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternateCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.alternateCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitrageApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitrageNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitragePnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitragePnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitrageProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageStakingError(String str) {
        this.arbitrageStakingError = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssociate(Boolean bool) {
        this.associate = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadMaxAmount(String str) {
        this.autoMarginReloadMaxAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadSwitch(boolean z) {
        this.autoMarginReloadSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableMargin(String str) {
        this.availableMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgDailyArbitrageNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgDailyArbitrageNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePos(boolean z) {
        this.basePos = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callbackRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFraction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeFraction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyType(String str) {
        this.copyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.count = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.curBaseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.curQuoteSz = str;
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
    public final void setCurrencyBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cycle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dcdPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dcdPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dcdState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(String str) {
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillAmount(String str) {
        this.earlyFillAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillCurrency(String str) {
        this.earlyFillCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillPrice(String str) {
        this.earlyFillPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillSettleTime(String str) {
        this.earlyFillSettleTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFilledTime(String str) {
        this.earlyFilledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndStatusFlag(boolean z) {
        this.endStatusFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(String str) {
        this.expiryTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExt(StrategyPendingListRespExt strategyPendingListRespExt) {
        this.ext = strategyPendingListRespExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilledPercentage(String str) {
        this.filledPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloatProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.floatProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloatProfitInSourceCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.floatProfitInSourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloatProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.floatProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloatingPnl(String str) {
        this.floatingPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridProfitInSourceCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridProfitInSourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridStatus(String str) {
        this.gridStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(ArrayList<String> arrayList) {
        this.instIds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstList(List<ArbitrageOrderBean> list) {
        this.instList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastSettlementSettledTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastSettlementSettledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastTradeExpireTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastTradeExpireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestProfit(StrategyProfitResponse strategyProfitResponse) {
        this.latestProfit = strategyProfitResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLmtOrderNumber(String str) {
        this.lmtOrderNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaturedApy(String str) {
        this.maturedApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxBotUsage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxBotUsage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMktCap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mktCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moveTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTWapTips(Boolean bool) {
        this.needTWapTips = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextInvestTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextInvestTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoClosePositionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.noClosePositionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotional(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notional = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmount(String str) {
        this.notionalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmountPrecision(String str) {
        this.notionalAmountPrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCurrency(String str) {
        this.notionalCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public void setOngoingProfitSnapshots(List<StrategyProfitResponse> list) {
        this.profitSnapshots = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdSource(String str) {
        this.ordSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutOfRange(boolean z) {
        this.outOfRange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParticipationRatio(String str) {
        this.participationRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerGridProfitRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMaxProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMinProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatioInSourceCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatioInSourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortfolioList(@NotNull ArrayList<SmartPortfolioListItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.portfolioList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPostWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isPostWarning = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSnapshots(List<StrategyProfitResponse> list) {
        this.profitSnapshots = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(String str) {
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(String str) {
        this.pxStepsMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringHour(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringHour = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringList(@NotNull ArrayList<RecurringListItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.recurringList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestment(boolean z) {
        this.reinvestment = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAmount(String str) {
        this.settlementAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementCcy(String str) {
        this.settlementCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementPricePrecision(String str) {
        this.settlementPricePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(ArrayList<SignParamItem> arrayList) {
        this.signParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanId(String str) {
        this.signalChanId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanName(String str) {
        this.signalChanName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalCount(String str) {
        this.signalCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSizePrecision(String str) {
        this.sizePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(String str) {
        this.slPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcy(String str) {
        this.sourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcySz(String str) {
        this.sourceCcySz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopResult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStoped(boolean z) {
        this.isStoped = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikePrecision(String str) {
        this.strikePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubArbTypes(List<? extends SubArbitrageType4Remote> list) {
        this.subArbTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEarlyFill(boolean z) {
        this.supportEarlyFill = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbolsNumber(String str) {
        this.symbolsNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTgtCcy(String str) {
        this.tgtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeLeft(String str) {
        this.timeLeft = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(String str) {
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCycleProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalCycleProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCycleProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalCycleProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlInSourceCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnlInSourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlRatio(String str) {
        this.totalPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPct(String str) {
        this.tpPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPriceRange(String str) {
        this.tpPriceRange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(String str) {
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
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
    public final void setTrailingUpConfig(TrailingConfig trailingConfig) {
        this.trailingUpConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerLast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnoverRatio(String str) {
        this.turnoverRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(String str) {
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String settlementAmount() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String settlementCcy() {
        String str = this.settlementCcy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String slPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String sourceCcy() {
        String str = this.sourceCcy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String sourceCcySz() {
        String str = this.sourceCcySz;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String status() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String strike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String strikePrecision() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean supportEarlyFill() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String timeLeft() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return ("StrategyPendingListResp(instType=" + this.instType + ", instId=" + this.instId + ", ccy=" + this.ccy + ", ordId=" + this.ordId + ", algoId=" + this.algoId + ", ordType=" + this.ordType + ", tdMode=" + this.tdMode + ", lever=" + this.lever + ", state=" + this.state + ", triggerTime=" + this.triggerTime + ", cTime=" + this.cTime + ", pxVar=" + this.pxVar + ", pxSpread=" + this.pxSpread + ", szLimit=" + this.szLimit + ", pxLimit=" + this.pxLimit + ", actualSz=" + this.actualSz + ", totalCycleProfit=" + this.totalCycleProfit + ", arbitragePnl=" + this.arbitragePnl + ", arbitrageProfitRate=" + this.arbitrageProfitRate + ", totalCycleProfitRate=" + this.totalCycleProfitRate + ", sz=" + this.sz + ", side=" + this.side + ", posSide=" + this.posSide + ", timeInterval=" + this.timeInterval + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", runPx=" + this.runPx + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", tpOrderPx=" + this.tpOrderPx + ", slOrderPx=" + this.slOrderPx + ", tradeNum=" + this.tradeNum + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", arbApy=" + this.arbApy + ", investment=" + this.investment + ", cancelType=" + this.cancelType + ", notionalUsd=" + this.notionalUsd + ", count=" + this.count + ", stopResult=" + this.stopResult + ", profitNum=" + this.profitNum + ", avgDailyArbitrageNum=" + this.avgDailyArbitrageNum + ", arbitrageNum=" + this.arbitrageNum + ", tgtCcy=" + this.tgtCcy + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", activePx=" + this.activePx + ", activePxType=" + this.activePxType + ", moveTriggerPx=" + this.moveTriggerPx + ", last=" + this.last + ", uTime=" + this.uTime + ", direction=" + this.direction + ", basePos=" + this.basePos + ", noClosePositionId=" + this.noClosePositionId + ", actualLever=" + this.actualLever + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", availEq=" + this.availEq + ", liqPx=" + this.liqPx + ", floatProfit=" + this.floatProfit + ", floatProfitInSourceCcy=" + this.floatProfitInSourceCcy + ", floatProfitRate=" + this.floatProfitRate + ", arbitrageApy=" + this.arbitrageApy + ", eq=" + this.eq + ", gridProfit=" + this.gridProfit + ", gridProfitInSourceCcy=" + this.gridProfitInSourceCcy + ", gridProfitRate=" + this.gridProfitRate + ", algoOrdType=" + this.algoOrdType + ", instList=" + this.instList + ", associate=" + this.associate + ", stgyName=" + this.stgyName + ", amt=" + this.amt + ", recurringList=" + this.recurringList + ", period=" + this.period + ", recurringDay=" + this.recurringDay + ", nextInvestTime=" + this.nextInvestTime + ", recurringHour=" + this.recurringHour + ", investCcy=" + this.investCcy + ", recurringTime=" + this.recurringTime + ", cycles=" + this.cycles + ", investAmt=" + this.investAmt + ", duration=" + this.duration + ", investType=" + this.investType + ", portfolioList=" + this.portfolioList + ", balType=" + this.balType + ", deltaRatio=" + this.deltaRatio + ", interval=" + this.interval + ", balNum=" + this.balNum + ", uly=" + this.uly + ", quickMgnType=" + this.quickMgnType + ", ordSource=" + this.ordSource + ", triggerType=" + this.triggerType + ", maxSafetyOrds=" + this.maxSafetyOrds + ", fillSafetyOrds=" + this.fillSafetyOrds + ", avgPx=" + this.avgPx + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", slMode=" + this.slMode + ", completedCycles=" + this.completedCycles + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", investmentCcy=" + this.investmentCcy + ", investmentAmt=" + this.investmentAmt + ", maxBotUsage=" + this.maxBotUsage + ", closeFraction=" + this.closeFraction + ", signParams=" + this.signParams + ", profit=" + this.profit + ", triggerParams=" + this.triggerParams + ", sourceAlgoId=" + this.sourceAlgoId + ", stopType=" + this.stopType + ", initPx=" + this.initPx + ", perGridProfitRatio=" + this.perGridProfitRatio + ", tpPriceRange=" + this.tpPriceRange + ", reserveFunds=" + this.reserveFunds + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", trailingDownFund=" + this.trailingDownFund + ", gridStatus=" + this.gridStatus + ", lmtOrderNumber=" + this.lmtOrderNumber + ", aggressiveness=" + this.aggressiveness + ", profitSharingRatio=" + this.profitSharingRatio + ", copyType=" + this.copyType + ", mktCap=" + this.mktCap + ", instIds=" + this.instIds + ", totalAmt=" + this.totalAmt + ", signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", floatingPnl=" + this.floatingPnl + ", availableMargin=" + this.availableMargin + ", totalPnlRatio=" + this.totalPnlRatio + ", signalCount=" + this.signalCount + ", triggerLast=" + this.triggerLast + ", reduceOnly=" + this.reduceOnly + ", alternativeCurrency=" + this.alternativeCurrency + ", currency=" + this.currency + ", createTime=" + this.createTime + ", expiryTime=" + this.expiryTime + ", notionalAmount=" + this.notionalAmount + ", notionalCurrency=" + this.notionalCurrency + ", participationRatio=" + this.participationRatio + ", settlementAmount=" + this.settlementAmount + ", status=" + this.status + ", strike=" + this.strike + ", tradeId=" + this.tradeId + ", tradeSide=" + this.tradeSide + ", timeLeft=" + this.timeLeft + ", notionalAmountPrecision=" + this.notionalAmountPrecision + ", sizePrecision=" + this.sizePrecision + ", strikePrecision=" + this.strikePrecision + ", settlementPricePrecision=" + this.settlementPricePrecision + ", endStatusFlag=" + this.endStatusFlag + ", estimateProfit=" + this.estimateProfit + ", earlyFilledTime=" + this.earlyFilledTime + ", earlyFillAmount=" + this.earlyFillAmount + ", earlyFillCurrency=" + this.earlyFillCurrency + ", earlyFillSettleTime=" + this.earlyFillSettleTime + ", earlyFillPrice=" + this.earlyFillPrice + ", turnoverRatio=" + this.turnoverRatio + ", supportEarlyFill=" + this.supportEarlyFill + ", isStoped=" + this.isStoped + ", symbolsNumber=" + this.symbolsNumber + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", outOfRange=" + this.outOfRange + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ", extendedBusinessInfo=" + this.extendedBusinessInfo + ", arbPnl=" + this.arbPnl + ", instFamily=" + this.instFamily + ", fundingFeeRatio=" + this.fundingFeeRatio + ", fundingFeeTime=" + this.fundingFeeTime + ", arbList=" + this.arbList + ", totalFundingFeeRatio=" + this.totalFundingFeeRatio + ", perMinProfitRate=" + this.perMinProfitRate + ", perMaxProfitRate=" + this.perMaxProfitRate + ", curQuoteSz=" + this.curQuoteSz + ", curBaseSz=" + this.curBaseSz + ", pnlRatioInSourceCcy=" + this.pnlRatioInSourceCcy + ", totalPnlInSourceCcy=" + this.totalPnlInSourceCcy + ", isPostWarning=" + this.isPostWarning + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", lastPrice=" + this.lastPrice + ", filledPercentage=" + this.filledPercentage + ", needTWapTips=" + this.needTWapTips + ", strategyTags=" + this.strategyTags + ", maturedApy=" + this.maturedApy + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", voucherInfo=" + this.voucherInfo + ", forbidden=" + this.forbidden + ", hiddenFeatures=" + this.hiddenFeatures + ", dcdState=" + this.dcdState) + ", dcdPnl=" + this.dcdPnl + ", dcdPnlRatio=" + this.dcdPnlRatio + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", cycle=" + this.cycle + ", currencyBal=" + this.currencyBal + ", alternateCurrency=" + this.alternateCurrency + ", avgCost=" + this.avgCost + ", coinPnl=" + this.coinPnl + ", curStrike=" + this.curStrike + ", reinvestment=" + this.reinvestment + ", settlementCcy=" + this.settlementCcy + ", pTime=" + this.pTime + ", lastTradeExpireTime=" + this.lastTradeExpireTime + ", lastSettlementSettledTime=" + this.lastSettlementSettledTime + ", arbitrageStakingError=" + this.arbitrageStakingError + ", subArbTypes=" + this.subArbTypes + ", absYieldPercentage=" + this.absYieldPercentage + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", displayId=" + this.displayId + ", simpleEarn=" + this.simpleEarn + ", leveragePrincipal=" + this.leveragePrincipal + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", numOfManualOrderInCycle=" + this.numOfManualOrderInCycle + ", highestApyPeriod=" + this.highestApyPeriod + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", fundingFeeApyList=" + this.fundingFeeApyList + ", profitSnapshots=" + this.profitSnapshots + ", latestProfit=" + this.latestProfit + ", totalSpreadProfit=" + this.totalSpreadProfit + ", totalApy=" + this.totalApy + ", fee=" + this.fee + ", totalInterestAmt=" + this.totalInterestAmt + ", debtCcy=" + this.debtCcy + ", arbitrageProfit=" + this.arbitrageProfit + ", stakingProfit=" + this.stakingProfit + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", effectiveEditParametersDetails=" + this.effectiveEditParametersDetails + ", balanceDetails=" + this.balanceDetails + ", bot=" + this.bot + ", tpTriggerRatio=" + this.tpTriggerRatio + ", slTriggerRatio=" + this.slTriggerRatio + ", advanceOrdType=" + this.advanceOrdType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String totalPnlInSourceCcy() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String tpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String tradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String tradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String turnoverRatio() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String volMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.ccy);
        parcel.writeString(this.ordId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.ordType);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.lever);
        parcel.writeString(this.state);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.totalCycleProfit);
        parcel.writeString(this.arbitragePnl);
        parcel.writeString(this.arbitrageProfitRate);
        parcel.writeString(this.totalCycleProfitRate);
        parcel.writeString(this.sz);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.runType);
        parcel.writeString(this.runPx);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.baseSz);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.tpOrderPx);
        parcel.writeString(this.slOrderPx);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.arbApy);
        parcel.writeString(this.investment);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.count);
        parcel.writeString(this.stopResult);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.avgDailyArbitrageNum);
        parcel.writeString(this.arbitrageNum);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.callbackRatio);
        parcel.writeString(this.callbackSpread);
        parcel.writeString(this.activePx);
        parcel.writeString(this.activePxType);
        parcel.writeString(this.moveTriggerPx);
        parcel.writeString(this.last);
        parcel.writeString(this.uTime);
        parcel.writeString(this.direction);
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.noClosePositionId);
        parcel.writeString(this.actualLever);
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.availEq);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.floatProfit);
        parcel.writeString(this.floatProfitInSourceCcy);
        parcel.writeString(this.floatProfitRate);
        parcel.writeString(this.arbitrageApy);
        parcel.writeString(this.eq);
        parcel.writeString(this.gridProfit);
        parcel.writeString(this.gridProfitInSourceCcy);
        parcel.writeString(this.gridProfitRate);
        parcel.writeString(this.algoOrdType);
        List<ArbitrageOrderBean> list = this.instList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ArbitrageOrderBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.associate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.stgyName);
        parcel.writeString(this.amt);
        ArrayList<RecurringListItem> arrayList = this.recurringList;
        parcel.writeInt(arrayList.size());
        Iterator<RecurringListItem> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.period);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.nextInvestTime);
        parcel.writeString(this.recurringHour);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.recurringTime);
        parcel.writeString(this.cycles);
        parcel.writeString(this.investAmt);
        parcel.writeString(this.duration);
        parcel.writeString(this.investType);
        ArrayList<SmartPortfolioListItem> arrayList2 = this.portfolioList;
        parcel.writeInt(arrayList2.size());
        Iterator<SmartPortfolioListItem> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.balType);
        parcel.writeString(this.deltaRatio);
        parcel.writeString(this.interval);
        parcel.writeString(this.balNum);
        parcel.writeString(this.uly);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.ordSource);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.fillSafetyOrds);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        parcel.writeString(this.slMode);
        parcel.writeString(this.completedCycles);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.investmentCcy);
        parcel.writeString(this.investmentAmt);
        parcel.writeString(this.maxBotUsage);
        parcel.writeString(this.closeFraction);
        ArrayList<SignParamItem> arrayList3 = this.signParams;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<SignParamItem> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.profit);
        List<DcaTriggerParam> list2 = this.triggerParams;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DcaTriggerParam> it5 = list2.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.stopType);
        parcel.writeString(this.initPx);
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.tpPriceRange);
        Boolean bool2 = this.reserveFunds;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        TrailingConfig trailingConfig = this.trailingUpConfig;
        if (trailingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig.writeToParcel(parcel, i);
        }
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        if (trailingConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trailingDownFund);
        parcel.writeString(this.gridStatus);
        parcel.writeString(this.lmtOrderNumber);
        parcel.writeString(this.aggressiveness);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.copyType);
        parcel.writeString(this.mktCap);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.floatingPnl);
        parcel.writeString(this.availableMargin);
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.signalCount);
        parcel.writeString(this.triggerLast);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.currency);
        parcel.writeString(this.createTime);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.notionalAmount);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.participationRatio);
        parcel.writeString(this.settlementAmount);
        parcel.writeString(this.status);
        parcel.writeString(this.strike);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.tradeSide);
        parcel.writeString(this.timeLeft);
        parcel.writeString(this.notionalAmountPrecision);
        parcel.writeString(this.sizePrecision);
        parcel.writeString(this.strikePrecision);
        parcel.writeString(this.settlementPricePrecision);
        parcel.writeInt(this.endStatusFlag ? 1 : 0);
        parcel.writeString(this.estimateProfit);
        parcel.writeString(this.earlyFilledTime);
        parcel.writeString(this.earlyFillAmount);
        parcel.writeString(this.earlyFillCurrency);
        parcel.writeString(this.earlyFillSettleTime);
        parcel.writeString(this.earlyFillPrice);
        parcel.writeString(this.turnoverRatio);
        parcel.writeInt(this.supportEarlyFill ? 1 : 0);
        parcel.writeInt(this.isStoped ? 1 : 0);
        parcel.writeString(this.symbolsNumber);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.sourceCcySz);
        parcel.writeInt(this.outOfRange ? 1 : 0);
        parcel.writeInt(this.autoMarginReloadSwitch ? 1 : 0);
        parcel.writeString(this.autoMarginReloadMaxAmount);
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        if (extendedBusinessInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedBusinessInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.arbPnl);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.fundingFeeRatio);
        parcel.writeString(this.fundingFeeTime);
        ArrayList<SmartArbListItem> arrayList4 = this.arbList;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<SmartArbListItem> it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.totalFundingFeeRatio);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.curQuoteSz);
        parcel.writeString(this.curBaseSz);
        parcel.writeString(this.pnlRatioInSourceCcy);
        parcel.writeString(this.totalPnlInSourceCcy);
        parcel.writeString(this.isPostWarning);
        Boolean bool3 = this.isTradeBorrowMode;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.filledPercentage);
        Boolean bool4 = this.needTWapTips;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        List<Integer> list3 = this.strategyTags;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<Integer> it7 = list3.iterator();
            while (it7.hasNext()) {
                parcel.writeInt(it7.next().intValue());
            }
        }
        parcel.writeString(this.maturedApy);
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        if (entrySignalOrderAmtParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entrySignalOrderAmtParam.writeToParcel(parcel, i);
        }
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        if (exitSignalOrderAmtParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exitSignalOrderAmtParam.writeToParcel(parcel, i);
        }
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        if (tacticsVoucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherInfo.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.forbidden);
        parcel.writeStringList(this.hiddenFeatures);
        parcel.writeString(this.dcdState);
        parcel.writeString(this.dcdPnl);
        parcel.writeString(this.dcdPnlRatio);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCcy);
        parcel.writeString(this.cycle);
        parcel.writeString(this.currencyBal);
        parcel.writeString(this.alternateCurrency);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.coinPnl);
        parcel.writeString(this.curStrike);
        parcel.writeInt(this.reinvestment ? 1 : 0);
        parcel.writeString(this.settlementCcy);
        parcel.writeString(this.pTime);
        parcel.writeString(this.lastTradeExpireTime);
        parcel.writeString(this.lastSettlementSettledTime);
        parcel.writeString(this.arbitrageStakingError);
        List<? extends SubArbitrageType4Remote> list4 = this.subArbTypes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<? extends SubArbitrageType4Remote> it8 = list4.iterator();
            while (it8.hasNext()) {
                parcel.writeString(it8.next().name());
            }
        }
        parcel.writeString(this.absYieldPercentage);
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.displayId);
        SmartEarnParam smartEarnParam = this.simpleEarn;
        if (smartEarnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnParam.writeToParcel(parcel, i);
        }
        Float f = this.leveragePrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        if (arbitrageTotalPnlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.numOfManualOrderInCycle);
        parcel.writeString(this.highestApyPeriod);
        parcel.writeInt(this.displayMinPaybackDays ? 1 : 0);
        List<FundingFeeApyItem> list5 = this.fundingFeeApyList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<FundingFeeApyItem> it9 = list5.iterator();
            while (it9.hasNext()) {
                it9.next().writeToParcel(parcel, i);
            }
        }
        List<StrategyProfitResponse> list6 = this.profitSnapshots;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<StrategyProfitResponse> it10 = list6.iterator();
            while (it10.hasNext()) {
                it10.next().writeToParcel(parcel, i);
            }
        }
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        if (strategyProfitResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyProfitResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalSpreadProfit);
        parcel.writeString(this.totalApy);
        parcel.writeString(this.fee);
        parcel.writeString(this.totalInterestAmt);
        parcel.writeString(this.debtCcy);
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        if (profitDetailResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse.writeToParcel(parcel, i);
        }
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        if (profitDetailResponse2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        if (strategyDcaEditResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyDcaEditResp.writeToParcel(parcel, i);
        }
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        if (balanceDetailInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balanceDetailInfoDto.writeToParcel(parcel, i);
        }
        BotVo botVo = this.bot;
        if (botVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tpTriggerRatio);
        parcel.writeString(this.slTriggerRatio);
        parcel.writeString(this.advanceOrdType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPendingListResp> serializer() {
            return StrategyPendingListResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ArbitrageOrderBean$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(RecurringListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartPortfolioListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SignParamItem$$serializer.INSTANCE), null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SubArbitrageType4Remote.Companion.serializer()), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(FundingFeeApyItem$$serializer.INSTANCE), new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ StrategyPendingListResp(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, boolean z, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, List list, Boolean bool, String str72, String str73, ArrayList arrayList, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, ArrayList arrayList2, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, String str103, String str104, String str105, String str106, String str107, ArrayList arrayList3, String str108, List list2, String str109, String str110, String str111, String str112, String str113, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str114, String str115, String str116, String str117, String str118, String str119, String str120, ArrayList arrayList4, String str121, String str122, String str123, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, boolean z2, String str147, String str148, String str149, String str150, String str151, String str152, String str153, boolean z3, boolean z4, String str154, String str155, String str156, boolean z5, boolean z6, String str157, ExtendedBusinessInfo extendedBusinessInfo, String str158, String str159, String str160, String str161, ArrayList arrayList5, String str162, String str163, String str164, String str165, String str166, String str167, String str168, String str169, Boolean bool3, String str170, String str171, Boolean bool4, List list3, String str172, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, ArrayList arrayList6, ArrayList arrayList7, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, boolean z7, String str184, String str185, String str186, String str187, String str188, List list4, String str189, String str190, String str191, SmartEarnParam smartEarnParam, Float f, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i9, String str192, boolean z8, List list5, List list6, StrategyProfitResponse strategyProfitResponse, String str193, String str194, String str195, String str196, String str197, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, String str198, String str199, StrategyDcaEditResp strategyDcaEditResp, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, String str200, String str201, String str202, StrategyPendingListRespExt strategyPendingListRespExt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str3;
        }
        if ((i & 8) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str4;
        }
        if ((i & 16) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str5;
        }
        if ((i & 32) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str6;
        }
        if ((i & 64) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str7;
        }
        if ((i & 128) == 0) {
            this.lever = "";
        } else {
            this.lever = str8;
        }
        if ((i & 256) == 0) {
            this.state = "";
        } else {
            this.state = str9;
        }
        if ((i & 512) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str10;
        }
        if ((i & 1024) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str11;
        }
        if ((i & 2048) == 0) {
            this.pxVar = "";
        } else {
            this.pxVar = str12;
        }
        if ((i & 4096) == 0) {
            this.pxSpread = "";
        } else {
            this.pxSpread = str13;
        }
        if ((i & 8192) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str14;
        }
        if ((i & 16384) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str15;
        }
        if ((i & 32768) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str16;
        }
        if ((i & 65536) == 0) {
            this.totalCycleProfit = "";
        } else {
            this.totalCycleProfit = str17;
        }
        if ((i & 131072) == 0) {
            this.arbitragePnl = "";
        } else {
            this.arbitragePnl = str18;
        }
        if ((i & 262144) == 0) {
            this.arbitrageProfitRate = "";
        } else {
            this.arbitrageProfitRate = str19;
        }
        if ((i & 524288) == 0) {
            this.totalCycleProfitRate = "";
        } else {
            this.totalCycleProfitRate = str20;
        }
        if ((1048576 & i) == 0) {
            this.sz = "";
        } else {
            this.sz = str21;
        }
        if ((2097152 & i) == 0) {
            this.side = "";
        } else {
            this.side = str22;
        }
        if ((4194304 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str23;
        }
        if ((8388608 & i) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str24;
        }
        if ((16777216 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str25;
        }
        if ((33554432 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str26;
        }
        if ((67108864 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str27;
        }
        if ((134217728 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str28;
        }
        if ((268435456 & i) == 0) {
            this.runPx = "";
        } else {
            this.runPx = str29;
        }
        if ((536870912 & i) == 0) {
            this.quoteSz = "";
        } else {
            this.quoteSz = str30;
        }
        if ((1073741824 & i) == 0) {
            this.baseSz = "";
        } else {
            this.baseSz = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tpRatio = "";
        } else {
            this.tpRatio = str32;
        }
        if ((i2 & 1) == 0) {
            this.slRatio = "";
        } else {
            this.slRatio = str33;
        }
        if ((i2 & 2) == 0) {
            this.tpOrderPx = "";
        } else {
            this.tpOrderPx = str34;
        }
        if ((i2 & 4) == 0) {
            this.slOrderPx = "";
        } else {
            this.slOrderPx = str35;
        }
        if ((i2 & 8) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str36;
        }
        if ((i2 & 16) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str37;
        }
        if ((i2 & 32) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str38;
        }
        if ((i2 & 64) == 0) {
            this.arbApy = "";
        } else {
            this.arbApy = str39;
        }
        if ((i2 & 128) == 0) {
            this.investment = "";
        } else {
            this.investment = str40;
        }
        if ((i2 & 256) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str41;
        }
        if ((i2 & 512) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str42;
        }
        if ((i2 & 1024) == 0) {
            this.count = "";
        } else {
            this.count = str43;
        }
        if ((i2 & 2048) == 0) {
            this.stopResult = "";
        } else {
            this.stopResult = str44;
        }
        if ((i2 & 4096) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str45;
        }
        if ((i2 & 8192) == 0) {
            this.avgDailyArbitrageNum = "";
        } else {
            this.avgDailyArbitrageNum = str46;
        }
        if ((i2 & 16384) == 0) {
            this.arbitrageNum = "";
        } else {
            this.arbitrageNum = str47;
        }
        if ((i2 & 32768) == 0) {
            this.tgtCcy = "";
        } else {
            this.tgtCcy = str48;
        }
        if ((i2 & 65536) == 0) {
            this.callbackRatio = "";
        } else {
            this.callbackRatio = str49;
        }
        if ((i2 & 131072) == 0) {
            this.callbackSpread = "";
        } else {
            this.callbackSpread = str50;
        }
        if ((i2 & 262144) == 0) {
            this.activePx = "";
        } else {
            this.activePx = str51;
        }
        if ((i2 & 524288) == 0) {
            this.activePxType = "";
        } else {
            this.activePxType = str52;
        }
        if ((1048576 & i2) == 0) {
            this.moveTriggerPx = "";
        } else {
            this.moveTriggerPx = str53;
        }
        if ((2097152 & i2) == 0) {
            this.last = "";
        } else {
            this.last = str54;
        }
        if ((4194304 & i2) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str55;
        }
        if ((8388608 & i2) == 0) {
            this.direction = "";
        } else {
            this.direction = str56;
        }
        this.basePos = (16777216 & i2) == 0 ? false : z;
        if ((33554432 & i2) == 0) {
            this.noClosePositionId = "";
        } else {
            this.noClosePositionId = str57;
        }
        if ((67108864 & i2) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str58;
        }
        if ((134217728 & i2) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str59;
        }
        if ((268435456 & i2) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str60;
        }
        if ((536870912 & i2) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str61;
        }
        if ((1073741824 & i2) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str62;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str63;
        }
        if ((i3 & 1) == 0) {
            this.floatProfitInSourceCcy = "";
        } else {
            this.floatProfitInSourceCcy = str64;
        }
        if ((i3 & 2) == 0) {
            this.floatProfitRate = "";
        } else {
            this.floatProfitRate = str65;
        }
        if ((i3 & 4) == 0) {
            this.arbitrageApy = "";
        } else {
            this.arbitrageApy = str66;
        }
        if ((i3 & 8) == 0) {
            this.eq = "";
        } else {
            this.eq = str67;
        }
        if ((i3 & 16) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str68;
        }
        if ((i3 & 32) == 0) {
            this.gridProfitInSourceCcy = "";
        } else {
            this.gridProfitInSourceCcy = str69;
        }
        if ((i3 & 64) == 0) {
            this.gridProfitRate = "";
        } else {
            this.gridProfitRate = str70;
        }
        if ((i3 & 128) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str71;
        }
        if ((i3 & 256) == 0) {
            this.instList = null;
        } else {
            this.instList = list;
        }
        this.associate = (i3 & 512) == 0 ? Boolean.FALSE : bool;
        if ((i3 & 1024) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str72;
        }
        if ((i3 & 2048) == 0) {
            this.amt = "";
        } else {
            this.amt = str73;
        }
        this.recurringList = (i3 & 4096) == 0 ? new ArrayList() : arrayList;
        if ((i3 & 8192) == 0) {
            this.period = "";
        } else {
            this.period = str74;
        }
        if ((i3 & 16384) == 0) {
            this.recurringDay = "";
        } else {
            this.recurringDay = str75;
        }
        if ((i3 & 32768) == 0) {
            this.nextInvestTime = "";
        } else {
            this.nextInvestTime = str76;
        }
        if ((i3 & 65536) == 0) {
            this.recurringHour = "";
        } else {
            this.recurringHour = str77;
        }
        if ((i3 & 131072) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str78;
        }
        if ((i3 & 262144) == 0) {
            this.recurringTime = "";
        } else {
            this.recurringTime = str79;
        }
        if ((i3 & 524288) == 0) {
            this.cycles = "";
        } else {
            this.cycles = str80;
        }
        if ((1048576 & i3) == 0) {
            this.investAmt = "";
        } else {
            this.investAmt = str81;
        }
        if ((2097152 & i3) == 0) {
            this.duration = "";
        } else {
            this.duration = str82;
        }
        if ((4194304 & i3) == 0) {
            this.investType = "";
        } else {
            this.investType = str83;
        }
        this.portfolioList = (8388608 & i3) == 0 ? new ArrayList() : arrayList2;
        if ((16777216 & i3) == 0) {
            this.balType = "";
        } else {
            this.balType = str84;
        }
        if ((33554432 & i3) == 0) {
            this.deltaRatio = "";
        } else {
            this.deltaRatio = str85;
        }
        if ((67108864 & i3) == 0) {
            this.interval = "";
        } else {
            this.interval = str86;
        }
        if ((134217728 & i3) == 0) {
            this.balNum = "";
        } else {
            this.balNum = str87;
        }
        if ((268435456 & i3) == 0) {
            this.uly = "";
        } else {
            this.uly = str88;
        }
        if ((536870912 & i3) == 0) {
            this.quickMgnType = "";
        } else {
            this.quickMgnType = str89;
        }
        if ((1073741824 & i3) == 0) {
            this.ordSource = null;
        } else {
            this.ordSource = str90;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.triggerType = "";
        } else {
            this.triggerType = str91;
        }
        if ((i4 & 1) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str92;
        }
        if ((i4 & 2) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str93;
        }
        if ((i4 & 4) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str94;
        }
        if ((i4 & 8) == 0) {
            this.tpPx = "";
        } else {
            this.tpPx = str95;
        }
        if ((i4 & 16) == 0) {
            this.slPx = "";
        } else {
            this.slPx = str96;
        }
        if ((i4 & 32) == 0) {
            this.slMode = "";
        } else {
            this.slMode = str97;
        }
        if ((i4 & 64) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str98;
        }
        if ((i4 & 128) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str99;
        }
        if ((i4 & 256) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str100;
        }
        if ((i4 & 512) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str101;
        }
        if ((i4 & 1024) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str102;
        }
        if ((i4 & 2048) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str103;
        }
        if ((i4 & 4096) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str104;
        }
        if ((i4 & 8192) == 0) {
            this.investmentAmt = "";
        } else {
            this.investmentAmt = str105;
        }
        if ((i4 & 16384) == 0) {
            this.maxBotUsage = "";
        } else {
            this.maxBotUsage = str106;
        }
        if ((i4 & 32768) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str107;
        }
        if ((i4 & 65536) == 0) {
            this.signParams = null;
        } else {
            this.signParams = arrayList3;
        }
        if ((i4 & 131072) == 0) {
            this.profit = null;
        } else {
            this.profit = str108;
        }
        if ((i4 & 262144) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((i4 & 524288) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str109;
        }
        if ((1048576 & i4) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str110;
        }
        if ((2097152 & i4) == 0) {
            this.initPx = "";
        } else {
            this.initPx = str111;
        }
        if ((4194304 & i4) == 0) {
            this.perGridProfitRatio = "";
        } else {
            this.perGridProfitRatio = str112;
        }
        if ((8388608 & i4) == 0) {
            this.tpPriceRange = null;
        } else {
            this.tpPriceRange = str113;
        }
        if ((16777216 & i4) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool2;
        }
        if ((33554432 & i4) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((67108864 & i4) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((134217728 & i4) == 0) {
            this.trailingDownFund = null;
        } else {
            this.trailingDownFund = str114;
        }
        if ((268435456 & i4) == 0) {
            this.gridStatus = null;
        } else {
            this.gridStatus = str115;
        }
        if ((536870912 & i4) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = str116;
        }
        if ((1073741824 & i4) == 0) {
            this.aggressiveness = null;
        } else {
            this.aggressiveness = str117;
        }
        if ((Integer.MIN_VALUE & i4) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str118;
        }
        if ((i5 & 1) == 0) {
            this.copyType = null;
        } else {
            this.copyType = str119;
        }
        if ((i5 & 2) == 0) {
            this.mktCap = "";
        } else {
            this.mktCap = str120;
        }
        if ((i5 & 4) == 0) {
            this.instIds = null;
        } else {
            this.instIds = arrayList4;
        }
        if ((i5 & 8) == 0) {
            this.totalAmt = null;
        } else {
            this.totalAmt = str121;
        }
        if ((i5 & 16) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str122;
        }
        if ((i5 & 32) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str123;
        }
        if ((i5 & 64) == 0) {
            this.floatingPnl = null;
        } else {
            this.floatingPnl = str124;
        }
        if ((i5 & 128) == 0) {
            this.availableMargin = null;
        } else {
            this.availableMargin = str125;
        }
        if ((i5 & 256) == 0) {
            this.totalPnlRatio = null;
        } else {
            this.totalPnlRatio = str126;
        }
        if ((i5 & 512) == 0) {
            this.signalCount = null;
        } else {
            this.signalCount = str127;
        }
        if ((i5 & 1024) == 0) {
            this.triggerLast = "";
        } else {
            this.triggerLast = str128;
        }
        if ((i5 & 2048) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str129;
        }
        if ((i5 & 4096) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str130;
        }
        if ((i5 & 8192) == 0) {
            this.currency = null;
        } else {
            this.currency = str131;
        }
        if ((i5 & 16384) == 0) {
            this.createTime = null;
        } else {
            this.createTime = str132;
        }
        if ((i5 & 32768) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str133;
        }
        if ((i5 & 65536) == 0) {
            this.notionalAmount = null;
        } else {
            this.notionalAmount = str134;
        }
        if ((i5 & 131072) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str135;
        }
        if ((i5 & 262144) == 0) {
            this.participationRatio = null;
        } else {
            this.participationRatio = str136;
        }
        if ((i5 & 524288) == 0) {
            this.settlementAmount = null;
        } else {
            this.settlementAmount = str137;
        }
        if ((1048576 & i5) == 0) {
            this.status = null;
        } else {
            this.status = str138;
        }
        if ((2097152 & i5) == 0) {
            this.strike = null;
        } else {
            this.strike = str139;
        }
        if ((4194304 & i5) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str140;
        }
        if ((8388608 & i5) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str141;
        }
        if ((16777216 & i5) == 0) {
            this.timeLeft = null;
        } else {
            this.timeLeft = str142;
        }
        if ((33554432 & i5) == 0) {
            this.notionalAmountPrecision = null;
        } else {
            this.notionalAmountPrecision = str143;
        }
        if ((67108864 & i5) == 0) {
            this.sizePrecision = null;
        } else {
            this.sizePrecision = str144;
        }
        if ((134217728 & i5) == 0) {
            this.strikePrecision = null;
        } else {
            this.strikePrecision = str145;
        }
        if ((268435456 & i5) == 0) {
            this.settlementPricePrecision = null;
        } else {
            this.settlementPricePrecision = str146;
        }
        this.endStatusFlag = (536870912 & i5) == 0 ? false : z2;
        if ((1073741824 & i5) == 0) {
            this.estimateProfit = "";
        } else {
            this.estimateProfit = str147;
        }
        if ((Integer.MIN_VALUE & i5) == 0) {
            this.earlyFilledTime = null;
        } else {
            this.earlyFilledTime = str148;
        }
        if ((i6 & 1) == 0) {
            this.earlyFillAmount = null;
        } else {
            this.earlyFillAmount = str149;
        }
        if ((i6 & 2) == 0) {
            this.earlyFillCurrency = null;
        } else {
            this.earlyFillCurrency = str150;
        }
        if ((i6 & 4) == 0) {
            this.earlyFillSettleTime = null;
        } else {
            this.earlyFillSettleTime = str151;
        }
        if ((i6 & 8) == 0) {
            this.earlyFillPrice = null;
        } else {
            this.earlyFillPrice = str152;
        }
        if ((i6 & 16) == 0) {
            this.turnoverRatio = null;
        } else {
            this.turnoverRatio = str153;
        }
        this.supportEarlyFill = (i6 & 32) == 0 ? false : z3;
        this.isStoped = (i6 & 64) == 0 ? false : z4;
        if ((i6 & 128) == 0) {
            this.symbolsNumber = null;
        } else {
            this.symbolsNumber = str154;
        }
        if ((i6 & 256) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str155;
        }
        if ((i6 & 512) == 0) {
            this.sourceCcySz = null;
        } else {
            this.sourceCcySz = str156;
        }
        this.outOfRange = (i6 & 1024) == 0 ? false : z5;
        this.autoMarginReloadSwitch = (i6 & 2048) == 0 ? false : z6;
        if ((i6 & 4096) == 0) {
            this.autoMarginReloadMaxAmount = null;
        } else {
            this.autoMarginReloadMaxAmount = str157;
        }
        if ((i6 & 8192) == 0) {
            this.extendedBusinessInfo = null;
        } else {
            this.extendedBusinessInfo = extendedBusinessInfo;
        }
        if ((i6 & 16384) == 0) {
            this.arbPnl = null;
        } else {
            this.arbPnl = str158;
        }
        if ((i6 & 32768) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str159;
        }
        if ((i6 & 65536) == 0) {
            this.fundingFeeRatio = null;
        } else {
            this.fundingFeeRatio = str160;
        }
        if ((i6 & 131072) == 0) {
            this.fundingFeeTime = null;
        } else {
            this.fundingFeeTime = str161;
        }
        if ((i6 & 262144) == 0) {
            this.arbList = null;
        } else {
            this.arbList = arrayList5;
        }
        if ((i6 & 524288) == 0) {
            this.totalFundingFeeRatio = null;
        } else {
            this.totalFundingFeeRatio = str162;
        }
        if ((1048576 & i6) == 0) {
            this.perMinProfitRate = "";
        } else {
            this.perMinProfitRate = str163;
        }
        if ((2097152 & i6) == 0) {
            this.perMaxProfitRate = "";
        } else {
            this.perMaxProfitRate = str164;
        }
        if ((4194304 & i6) == 0) {
            this.curQuoteSz = "";
        } else {
            this.curQuoteSz = str165;
        }
        if ((8388608 & i6) == 0) {
            this.curBaseSz = "";
        } else {
            this.curBaseSz = str166;
        }
        if ((16777216 & i6) == 0) {
            this.pnlRatioInSourceCcy = "";
        } else {
            this.pnlRatioInSourceCcy = str167;
        }
        if ((33554432 & i6) == 0) {
            this.totalPnlInSourceCcy = "";
        } else {
            this.totalPnlInSourceCcy = str168;
        }
        if ((67108864 & i6) == 0) {
            this.isPostWarning = "";
        } else {
            this.isPostWarning = str169;
        }
        if ((134217728 & i6) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool3;
        }
        if ((268435456 & i6) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str170;
        }
        if ((536870912 & i6) == 0) {
            this.filledPercentage = null;
        } else {
            this.filledPercentage = str171;
        }
        if ((1073741824 & i6) == 0) {
            this.needTWapTips = null;
        } else {
            this.needTWapTips = bool4;
        }
        if ((Integer.MIN_VALUE & i6) == 0) {
            this.strategyTags = null;
        } else {
            this.strategyTags = list3;
        }
        if ((i7 & 1) == 0) {
            this.maturedApy = null;
        } else {
            this.maturedApy = str172;
        }
        if ((i7 & 2) == 0) {
            this.signalOrderAmtParam = null;
        } else {
            this.signalOrderAmtParam = entrySignalOrderAmtParam;
        }
        if ((i7 & 4) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
        if ((i7 & 8) == 0) {
            this.voucherInfo = null;
        } else {
            this.voucherInfo = tacticsVoucherInfo;
        }
        if ((i7 & 16) == 0) {
            this.forbidden = null;
        } else {
            this.forbidden = arrayList6;
        }
        if ((i7 & 32) == 0) {
            this.hiddenFeatures = null;
        } else {
            this.hiddenFeatures = arrayList7;
        }
        if ((i7 & 64) == 0) {
            this.dcdState = "";
        } else {
            this.dcdState = str173;
        }
        if ((i7 & 128) == 0) {
            this.dcdPnl = "";
        } else {
            this.dcdPnl = str174;
        }
        if ((i7 & 256) == 0) {
            this.dcdPnlRatio = "";
        } else {
            this.dcdPnlRatio = str175;
        }
        if ((i7 & 512) == 0) {
            this.notional = "";
        } else {
            this.notional = str176;
        }
        if ((i7 & 1024) == 0) {
            this.notionalCcy = "";
        } else {
            this.notionalCcy = str177;
        }
        if ((i7 & 2048) == 0) {
            this.cycle = "";
        } else {
            this.cycle = str178;
        }
        if ((i7 & 4096) == 0) {
            this.currencyBal = "";
        } else {
            this.currencyBal = str179;
        }
        if ((i7 & 8192) == 0) {
            this.alternateCurrency = "";
        } else {
            this.alternateCurrency = str180;
        }
        if ((i7 & 16384) == 0) {
            this.avgCost = "";
        } else {
            this.avgCost = str181;
        }
        if ((i7 & 32768) == 0) {
            this.coinPnl = "";
        } else {
            this.coinPnl = str182;
        }
        if ((i7 & 65536) == 0) {
            this.curStrike = null;
        } else {
            this.curStrike = str183;
        }
        this.reinvestment = (i7 & 131072) == 0 ? true : z7;
        if ((i7 & 262144) == 0) {
            this.settlementCcy = null;
        } else {
            this.settlementCcy = str184;
        }
        if ((i7 & 524288) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str185;
        }
        if ((1048576 & i7) == 0) {
            this.lastTradeExpireTime = "";
        } else {
            this.lastTradeExpireTime = str186;
        }
        if ((2097152 & i7) == 0) {
            this.lastSettlementSettledTime = "";
        } else {
            this.lastSettlementSettledTime = str187;
        }
        if ((4194304 & i7) == 0) {
            this.arbitrageStakingError = null;
        } else {
            this.arbitrageStakingError = str188;
        }
        if ((8388608 & i7) == 0) {
            this.subArbTypes = null;
        } else {
            this.subArbTypes = list4;
        }
        if ((16777216 & i7) == 0) {
            this.absYieldPercentage = "";
        } else {
            this.absYieldPercentage = str189;
        }
        if ((33554432 & i7) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str190;
        }
        if ((67108864 & i7) == 0) {
            this.displayId = null;
        } else {
            this.displayId = str191;
        }
        if ((134217728 & i7) == 0) {
            this.simpleEarn = null;
        } else {
            this.simpleEarn = smartEarnParam;
        }
        if ((268435456 & i7) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((536870912 & i7) == 0) {
            this.arbitrageTotalPnlInfo = null;
        } else {
            this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        }
        this.numOfManualOrderInCycle = (1073741824 & i7) == 0 ? 0 : i9;
        if ((Integer.MIN_VALUE & i7) == 0) {
            this.highestApyPeriod = null;
        } else {
            this.highestApyPeriod = str192;
        }
        this.displayMinPaybackDays = (i8 & 1) == 0 ? false : z8;
        if ((i8 & 2) == 0) {
            this.fundingFeeApyList = null;
        } else {
            this.fundingFeeApyList = list5;
        }
        if ((i8 & 4) == 0) {
            this.profitSnapshots = null;
        } else {
            this.profitSnapshots = list6;
        }
        if ((i8 & 8) == 0) {
            this.latestProfit = null;
        } else {
            this.latestProfit = strategyProfitResponse;
        }
        if ((i8 & 16) == 0) {
            this.totalSpreadProfit = null;
        } else {
            this.totalSpreadProfit = str193;
        }
        if ((i8 & 32) == 0) {
            this.totalApy = null;
        } else {
            this.totalApy = str194;
        }
        if ((i8 & 64) == 0) {
            this.fee = null;
        } else {
            this.fee = str195;
        }
        if ((i8 & 128) == 0) {
            this.totalInterestAmt = null;
        } else {
            this.totalInterestAmt = str196;
        }
        if ((i8 & 256) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str197;
        }
        if ((i8 & 512) == 0) {
            this.arbitrageProfit = null;
        } else {
            this.arbitrageProfit = profitDetailResponse;
        }
        if ((i8 & 1024) == 0) {
            this.stakingProfit = null;
        } else {
            this.stakingProfit = profitDetailResponse2;
        }
        if ((i8 & 2048) == 0) {
            this.initOrdAmt = "";
        } else {
            this.initOrdAmt = str198;
        }
        if ((i8 & 4096) == 0) {
            this.safetyOrdAmt = "";
        } else {
            this.safetyOrdAmt = str199;
        }
        if ((i8 & 8192) == 0) {
            this.effectiveEditParametersDetails = null;
        } else {
            this.effectiveEditParametersDetails = strategyDcaEditResp;
        }
        if ((i8 & 16384) == 0) {
            this.balanceDetails = null;
        } else {
            this.balanceDetails = balanceDetailInfoDto;
        }
        if ((i8 & 32768) == 0) {
            this.bot = null;
        } else {
            this.bot = botVo;
        }
        if ((i8 & 65536) == 0) {
            this.tpTriggerRatio = "";
        } else {
            this.tpTriggerRatio = str200;
        }
        if ((i8 & 131072) == 0) {
            this.slTriggerRatio = "";
        } else {
            this.slTriggerRatio = str201;
        }
        if ((i8 & 262144) == 0) {
            this.advanceOrdType = "";
        } else {
            this.advanceOrdType = str202;
        }
        if ((i8 & 524288) == 0) {
            this.ext = null;
        } else {
            this.ext = strategyPendingListRespExt;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyPendingListResp strategyPendingListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyPendingListResp.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyPendingListResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyPendingListResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyPendingListResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyPendingListResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyPendingListResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyPendingListResp.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyPendingListResp.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyPendingListResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyPendingListResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyPendingListResp.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyPendingListResp.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyPendingListResp.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyPendingListResp.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyPendingListResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyPendingListResp.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyPendingListResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyPendingListResp.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyPendingListResp.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyPendingListResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxVar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyPendingListResp.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyPendingListResp.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyPendingListResp.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyPendingListResp.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyPendingListResp.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyPendingListResp.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyPendingListResp.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyPendingListResp.totalCycleProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyPendingListResp.totalCycleProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbitragePnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyPendingListResp.arbitragePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbitrageProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyPendingListResp.arbitrageProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyPendingListResp.totalCycleProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyPendingListResp.totalCycleProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyPendingListResp.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyPendingListResp.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyPendingListResp.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyPendingListResp.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyPendingListResp.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyPendingListResp.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyPendingListResp.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyPendingListResp.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyPendingListResp.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyPendingListResp.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyPendingListResp.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyPendingListResp.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyPendingListResp.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyPendingListResp.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyPendingListResp.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyPendingListResp.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyPendingListResp.runPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyPendingListResp.runPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyPendingListResp.quoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyPendingListResp.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyPendingListResp.baseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyPendingListResp.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyPendingListResp.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyPendingListResp.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyPendingListResp.tpOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyPendingListResp.slOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyPendingListResp.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyPendingListResp.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyPendingListResp.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyPendingListResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyPendingListResp.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyPendingListResp.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyPendingListResp.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) strategyPendingListResp.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, strategyPendingListResp.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) strategyPendingListResp.count, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, strategyPendingListResp.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) strategyPendingListResp.stopResult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, strategyPendingListResp.stopResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) strategyPendingListResp.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, strategyPendingListResp.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) strategyPendingListResp.avgDailyArbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, strategyPendingListResp.avgDailyArbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, strategyPendingListResp.arbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tgtCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, strategyPendingListResp.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) strategyPendingListResp.callbackRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, strategyPendingListResp.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) strategyPendingListResp.callbackSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, strategyPendingListResp.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) strategyPendingListResp.activePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, strategyPendingListResp.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) strategyPendingListResp.activePxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, strategyPendingListResp.activePxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) strategyPendingListResp.moveTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, strategyPendingListResp.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) strategyPendingListResp.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, strategyPendingListResp.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) strategyPendingListResp.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, strategyPendingListResp.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) strategyPendingListResp.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, strategyPendingListResp.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || strategyPendingListResp.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 56, strategyPendingListResp.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) strategyPendingListResp.noClosePositionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, strategyPendingListResp.noClosePositionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) strategyPendingListResp.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, strategyPendingListResp.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) strategyPendingListResp.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, strategyPendingListResp.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) strategyPendingListResp.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, strategyPendingListResp.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) strategyPendingListResp.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, strategyPendingListResp.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) strategyPendingListResp.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, strategyPendingListResp.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) strategyPendingListResp.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, strategyPendingListResp.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) strategyPendingListResp.floatProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, strategyPendingListResp.floatProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) strategyPendingListResp.floatProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, strategyPendingListResp.floatProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbitrageApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, strategyPendingListResp.arbitrageApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) strategyPendingListResp.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, strategyPendingListResp.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) strategyPendingListResp.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, strategyPendingListResp.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) strategyPendingListResp.gridProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, strategyPendingListResp.gridProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) strategyPendingListResp.gridProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, strategyPendingListResp.gridProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd((Object) strategyPendingListResp.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 71, strategyPendingListResp.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || strategyPendingListResp.instList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, kSerializerArr[72], strategyPendingListResp.instList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd(strategyPendingListResp.associate, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, BooleanSerializer.INSTANCE, strategyPendingListResp.associate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) strategyPendingListResp.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, strategyPendingListResp.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) strategyPendingListResp.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, strategyPendingListResp.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd(strategyPendingListResp.recurringList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 76, kSerializerArr[76], strategyPendingListResp.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd((Object) strategyPendingListResp.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 77, strategyPendingListResp.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) strategyPendingListResp.recurringDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, strategyPendingListResp.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || !Intrinsics.EZpvd((Object) strategyPendingListResp.nextInvestTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 79, strategyPendingListResp.nextInvestTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || !Intrinsics.EZpvd((Object) strategyPendingListResp.recurringHour, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 80, strategyPendingListResp.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 81, strategyPendingListResp.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || !Intrinsics.EZpvd((Object) strategyPendingListResp.recurringTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 82, strategyPendingListResp.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 83, strategyPendingListResp.cycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 84, strategyPendingListResp.investAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || !Intrinsics.EZpvd((Object) strategyPendingListResp.duration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 85, strategyPendingListResp.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 86, strategyPendingListResp.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd(strategyPendingListResp.portfolioList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 87, kSerializerArr[87], strategyPendingListResp.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || !Intrinsics.EZpvd((Object) strategyPendingListResp.balType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 88, strategyPendingListResp.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || !Intrinsics.EZpvd((Object) strategyPendingListResp.deltaRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 89, strategyPendingListResp.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || !Intrinsics.EZpvd((Object) strategyPendingListResp.interval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 90, strategyPendingListResp.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || !Intrinsics.EZpvd((Object) strategyPendingListResp.balNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 91, strategyPendingListResp.balNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || !Intrinsics.EZpvd((Object) strategyPendingListResp.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 92, strategyPendingListResp.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || !Intrinsics.EZpvd((Object) strategyPendingListResp.quickMgnType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 93, strategyPendingListResp.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || strategyPendingListResp.ordSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 94, StringSerializer.INSTANCE, strategyPendingListResp.ordSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) || !Intrinsics.EZpvd((Object) strategyPendingListResp.triggerType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 95, strategyPendingListResp.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 96) || !Intrinsics.EZpvd((Object) strategyPendingListResp.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 96, strategyPendingListResp.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 97) || !Intrinsics.EZpvd((Object) strategyPendingListResp.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 97, strategyPendingListResp.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 98) || !Intrinsics.EZpvd((Object) strategyPendingListResp.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 98, strategyPendingListResp.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 99) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 99, strategyPendingListResp.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 100) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 100, strategyPendingListResp.slPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 101) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 101, strategyPendingListResp.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 102) || !Intrinsics.EZpvd((Object) strategyPendingListResp.completedCycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 102, strategyPendingListResp.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 103) || strategyPendingListResp.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 103, StringSerializer.INSTANCE, strategyPendingListResp.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 104) || strategyPendingListResp.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 104, StringSerializer.INSTANCE, strategyPendingListResp.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 105) || strategyPendingListResp.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 105, StringSerializer.INSTANCE, strategyPendingListResp.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 106) || strategyPendingListResp.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 106, StringSerializer.INSTANCE, strategyPendingListResp.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 107) || strategyPendingListResp.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 107, StringSerializer.INSTANCE, strategyPendingListResp.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 108) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 108, strategyPendingListResp.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 109) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investmentAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 109, strategyPendingListResp.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY) || !Intrinsics.EZpvd((Object) strategyPendingListResp.maxBotUsage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY, strategyPendingListResp.maxBotUsage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) || !Intrinsics.EZpvd((Object) strategyPendingListResp.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, strategyPendingListResp.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST) || strategyPendingListResp.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST, kSerializerArr[112], strategyPendingListResp.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) || strategyPendingListResp.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, StringSerializer.INSTANCE, strategyPendingListResp.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 114) || strategyPendingListResp.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 114, kSerializerArr[114], strategyPendingListResp.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 115) || strategyPendingListResp.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 115, StringSerializer.INSTANCE, strategyPendingListResp.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || strategyPendingListResp.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, StringSerializer.INSTANCE, strategyPendingListResp.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 117) || !Intrinsics.EZpvd((Object) strategyPendingListResp.initPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 117, strategyPendingListResp.initPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 118) || !Intrinsics.EZpvd((Object) strategyPendingListResp.perGridProfitRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 118, strategyPendingListResp.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 119) || strategyPendingListResp.tpPriceRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 119, StringSerializer.INSTANCE, strategyPendingListResp.tpPriceRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 120) || strategyPendingListResp.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 120, BooleanSerializer.INSTANCE, strategyPendingListResp.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 121) || strategyPendingListResp.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 121, TrailingConfig$$serializer.INSTANCE, strategyPendingListResp.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 122) || strategyPendingListResp.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 122, TrailingConfig$$serializer.INSTANCE, strategyPendingListResp.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 123) || strategyPendingListResp.trailingDownFund != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 123, StringSerializer.INSTANCE, strategyPendingListResp.trailingDownFund);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 124) || strategyPendingListResp.gridStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 124, StringSerializer.INSTANCE, strategyPendingListResp.gridStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 125) || strategyPendingListResp.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 125, StringSerializer.INSTANCE, strategyPendingListResp.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT) || strategyPendingListResp.aggressiveness != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT, StringSerializer.INSTANCE, strategyPendingListResp.aggressiveness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 127) || strategyPendingListResp.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 127, StringSerializer.INSTANCE, strategyPendingListResp.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 128) || strategyPendingListResp.copyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 128, StringSerializer.INSTANCE, strategyPendingListResp.copyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 129) || !Intrinsics.EZpvd((Object) strategyPendingListResp.mktCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 129, strategyPendingListResp.mktCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 130) || strategyPendingListResp.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 130, kSerializerArr[130], strategyPendingListResp.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, DateFormat.RELATIVE_SHORT) || strategyPendingListResp.totalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, DateFormat.RELATIVE_SHORT, StringSerializer.INSTANCE, strategyPendingListResp.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) || strategyPendingListResp.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA) || strategyPendingListResp.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 134) || strategyPendingListResp.floatingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 134, StringSerializer.INSTANCE, strategyPendingListResp.floatingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 135) || strategyPendingListResp.availableMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 135, StringSerializer.INSTANCE, strategyPendingListResp.availableMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA) || strategyPendingListResp.totalPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.totalPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA) || strategyPendingListResp.signalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.signalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 138) || !Intrinsics.EZpvd((Object) strategyPendingListResp.triggerLast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 138, strategyPendingListResp.triggerLast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyPendingListResp.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, strategyPendingListResp.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA) || strategyPendingListResp.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) || strategyPendingListResp.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA) || strategyPendingListResp.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, StringSerializer.INSTANCE, strategyPendingListResp.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA) || strategyPendingListResp.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA) || strategyPendingListResp.notionalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.notionalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) || strategyPendingListResp.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA) || strategyPendingListResp.participationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, StringSerializer.INSTANCE, strategyPendingListResp.participationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) || strategyPendingListResp.settlementAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.settlementAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA) || strategyPendingListResp.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) || strategyPendingListResp.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 150) || strategyPendingListResp.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 150, StringSerializer.INSTANCE, strategyPendingListResp.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA) || strategyPendingListResp.tradeSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.tradeSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA) || strategyPendingListResp.timeLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.timeLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA) || strategyPendingListResp.notionalAmountPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.notionalAmountPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA) || strategyPendingListResp.sizePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.sizePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) || strategyPendingListResp.strikePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyPendingListResp.strikePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.settlementPricePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.settlementPricePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.endStatusFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, strategyPendingListResp.endStatusFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256) || !Intrinsics.EZpvd((Object) strategyPendingListResp.estimateProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, strategyPendingListResp.estimateProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.earlyFilledTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.earlyFilledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.earlyFillAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.earlyFillAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.earlyFillCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.earlyFillCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.earlyFillSettleTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.earlyFillSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.earlyFillPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.earlyFillPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.turnoverRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.turnoverRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.supportEarlyFill) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, strategyPendingListResp.supportEarlyFill);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.isStoped) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, strategyPendingListResp.isStoped);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.symbolsNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.symbolsNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.sourceCcySz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.sourceCcySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) || strategyPendingListResp.outOfRange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, strategyPendingListResp.outOfRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.autoMarginReloadSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, strategyPendingListResp.autoMarginReloadSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 172) || strategyPendingListResp.autoMarginReloadMaxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 172, StringSerializer.INSTANCE, strategyPendingListResp.autoMarginReloadMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384) || strategyPendingListResp.extendedBusinessInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, ExtendedBusinessInfo$$serializer.INSTANCE, strategyPendingListResp.extendedBusinessInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256) || strategyPendingListResp.arbPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.arbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384) || strategyPendingListResp.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256) || strategyPendingListResp.fundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256, StringSerializer.INSTANCE, strategyPendingListResp.fundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384) || strategyPendingListResp.fundingFeeTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.fundingFeeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256) || strategyPendingListResp.arbList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, kSerializerArr[178], strategyPendingListResp.arbList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384) || strategyPendingListResp.totalFundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, StringSerializer.INSTANCE, strategyPendingListResp.totalFundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 180) || !Intrinsics.EZpvd((Object) strategyPendingListResp.perMinProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 180, strategyPendingListResp.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384) || !Intrinsics.EZpvd((Object) strategyPendingListResp.perMaxProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, strategyPendingListResp.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyPendingListResp.curQuoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, strategyPendingListResp.curQuoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384) || !Intrinsics.EZpvd((Object) strategyPendingListResp.curBaseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, strategyPendingListResp.curBaseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pnlRatioInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, strategyPendingListResp.pnlRatioInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384) || !Intrinsics.EZpvd((Object) strategyPendingListResp.totalPnlInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, strategyPendingListResp.totalPnlInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyPendingListResp.isPostWarning, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, strategyPendingListResp.isPostWarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256) || strategyPendingListResp.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, BooleanSerializer.INSTANCE, strategyPendingListResp.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 188) || !Intrinsics.EZpvd((Object) strategyPendingListResp.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 188, strategyPendingListResp.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 189) || strategyPendingListResp.filledPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 189, StringSerializer.INSTANCE, strategyPendingListResp.filledPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 190) || strategyPendingListResp.needTWapTips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 190, BooleanSerializer.INSTANCE, strategyPendingListResp.needTWapTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 191) || strategyPendingListResp.strategyTags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 191, kSerializerArr[191], strategyPendingListResp.strategyTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 192) || strategyPendingListResp.maturedApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 192, StringSerializer.INSTANCE, strategyPendingListResp.maturedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256) || strategyPendingListResp.signalOrderAmtParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, EntrySignalOrderAmtParam$$serializer.INSTANCE, strategyPendingListResp.signalOrderAmtParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256) || strategyPendingListResp.signalBotOrderStopParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, ExitSignalOrderAmtParam$$serializer.INSTANCE, strategyPendingListResp.signalBotOrderStopParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256) || strategyPendingListResp.voucherInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, TacticsVoucherInfo$$serializer.INSTANCE, strategyPendingListResp.voucherInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256) || strategyPendingListResp.forbidden != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, kSerializerArr[196], strategyPendingListResp.forbidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256) || strategyPendingListResp.hiddenFeatures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, kSerializerArr[197], strategyPendingListResp.hiddenFeatures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 198) || !Intrinsics.EZpvd((Object) strategyPendingListResp.dcdState, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 198, strategyPendingListResp.dcdState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 199) || !Intrinsics.EZpvd((Object) strategyPendingListResp.dcdPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 199, strategyPendingListResp.dcdPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 200) || !Intrinsics.EZpvd((Object) strategyPendingListResp.dcdPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 200, strategyPendingListResp.dcdPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 201) || !Intrinsics.EZpvd((Object) strategyPendingListResp.notional, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 201, strategyPendingListResp.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 202) || !Intrinsics.EZpvd((Object) strategyPendingListResp.notionalCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 202, strategyPendingListResp.notionalCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 203) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cycle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 203, strategyPendingListResp.cycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 204) || !Intrinsics.EZpvd((Object) strategyPendingListResp.currencyBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 204, strategyPendingListResp.currencyBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) || !Intrinsics.EZpvd((Object) strategyPendingListResp.alternateCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, strategyPendingListResp.alternateCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 206) || !Intrinsics.EZpvd((Object) strategyPendingListResp.avgCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 206, strategyPendingListResp.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 207) || !Intrinsics.EZpvd((Object) strategyPendingListResp.coinPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 207, strategyPendingListResp.coinPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 208) || strategyPendingListResp.curStrike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 208, StringSerializer.INSTANCE, strategyPendingListResp.curStrike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 209) || !strategyPendingListResp.reinvestment) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 209, strategyPendingListResp.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 210) || strategyPendingListResp.settlementCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 210, StringSerializer.INSTANCE, strategyPendingListResp.settlementCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 211) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 211, strategyPendingListResp.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, BuildConfig.VERSION_CODE) || !Intrinsics.EZpvd((Object) strategyPendingListResp.lastTradeExpireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, BuildConfig.VERSION_CODE, strategyPendingListResp.lastTradeExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 213) || !Intrinsics.EZpvd((Object) strategyPendingListResp.lastSettlementSettledTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 213, strategyPendingListResp.lastSettlementSettledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE) || strategyPendingListResp.arbitrageStakingError != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE, StringSerializer.INSTANCE, strategyPendingListResp.arbitrageStakingError);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 215) || strategyPendingListResp.subArbTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 215, kSerializerArr[215], strategyPendingListResp.subArbTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 216) || !Intrinsics.EZpvd((Object) strategyPendingListResp.absYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 216, strategyPendingListResp.absYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 217) || strategyPendingListResp.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 217, StringSerializer.INSTANCE, strategyPendingListResp.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 218) || strategyPendingListResp.displayId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 218, StringSerializer.INSTANCE, strategyPendingListResp.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 219) || strategyPendingListResp.simpleEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 219, SmartEarnParam$$serializer.INSTANCE, strategyPendingListResp.simpleEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 220) || strategyPendingListResp.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 220, FloatSerializer.INSTANCE, strategyPendingListResp.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 221) || strategyPendingListResp.arbitrageTotalPnlInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 221, ArbitrageTotalPnlInfo$$serializer.INSTANCE, strategyPendingListResp.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 222) || strategyPendingListResp.numOfManualOrderInCycle != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 222, strategyPendingListResp.numOfManualOrderInCycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 223) || strategyPendingListResp.highestApyPeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 223, StringSerializer.INSTANCE, strategyPendingListResp.highestApyPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 224) || strategyPendingListResp.displayMinPaybackDays) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 224, strategyPendingListResp.displayMinPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 225) || strategyPendingListResp.fundingFeeApyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 225, kSerializerArr[225], strategyPendingListResp.fundingFeeApyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 226) || strategyPendingListResp.profitSnapshots != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 226, kSerializerArr[226], strategyPendingListResp.profitSnapshots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 227) || strategyPendingListResp.latestProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 227, StrategyProfitResponse$$serializer.INSTANCE, strategyPendingListResp.latestProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 228) || strategyPendingListResp.totalSpreadProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 228, StringSerializer.INSTANCE, strategyPendingListResp.totalSpreadProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA) || strategyPendingListResp.totalApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA, StringSerializer.INSTANCE, strategyPendingListResp.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 230) || strategyPendingListResp.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 230, StringSerializer.INSTANCE, strategyPendingListResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 231) || strategyPendingListResp.totalInterestAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 231, StringSerializer.INSTANCE, strategyPendingListResp.totalInterestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 232) || !Intrinsics.EZpvd((Object) strategyPendingListResp.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 232, strategyPendingListResp.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 233) || strategyPendingListResp.arbitrageProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 233, ProfitDetailResponse$$serializer.INSTANCE, strategyPendingListResp.arbitrageProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 234) || strategyPendingListResp.stakingProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 234, ProfitDetailResponse$$serializer.INSTANCE, strategyPendingListResp.stakingProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 235) || !Intrinsics.EZpvd((Object) strategyPendingListResp.initOrdAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 235, StringSerializer.INSTANCE, strategyPendingListResp.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 236) || !Intrinsics.EZpvd((Object) strategyPendingListResp.safetyOrdAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 236, StringSerializer.INSTANCE, strategyPendingListResp.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 237) || strategyPendingListResp.effectiveEditParametersDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 237, StrategyDcaEditResp$$serializer.INSTANCE, strategyPendingListResp.effectiveEditParametersDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 238) || strategyPendingListResp.balanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 238, BalanceDetailInfoDto$$serializer.INSTANCE, strategyPendingListResp.balanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 239) || strategyPendingListResp.bot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 239, BotVo$$serializer.INSTANCE, strategyPendingListResp.bot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, PsExtractor.VIDEO_STREAM_MASK) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpTriggerRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, PsExtractor.VIDEO_STREAM_MASK, strategyPendingListResp.tpTriggerRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 241) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slTriggerRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 241, strategyPendingListResp.slTriggerRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 242) || !Intrinsics.EZpvd((Object) strategyPendingListResp.advanceOrdType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 242, StringSerializer.INSTANCE, strategyPendingListResp.advanceOrdType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 243) && strategyPendingListResp.ext == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 243, StrategyPendingListRespExt$$serializer.INSTANCE, strategyPendingListResp.ext);
    }

    public StrategyPendingListResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, boolean z, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, List<ArbitrageOrderBean> list, Boolean bool, @NotNull String str72, @NotNull String str73, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, @NotNull String str91, @NotNull String str92, @NotNull String str93, @NotNull String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, String str99, String str100, String str101, String str102, String str103, @NotNull String str104, @NotNull String str105, @NotNull String str106, @NotNull String str107, ArrayList<SignParamItem> arrayList3, String str108, List<DcaTriggerParam> list2, String str109, String str110, @NotNull String str111, @NotNull String str112, String str113, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str114, String str115, String str116, String str117, String str118, String str119, @NotNull String str120, ArrayList<String> arrayList4, String str121, String str122, String str123, String str124, String str125, String str126, String str127, @NotNull String str128, @NotNull String str129, String str130, String str131, String str132, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, boolean z2, @NotNull String str147, String str148, String str149, String str150, String str151, String str152, String str153, boolean z3, boolean z4, String str154, String str155, String str156, boolean z5, boolean z6, String str157, ExtendedBusinessInfo extendedBusinessInfo, String str158, String str159, String str160, String str161, ArrayList<SmartArbListItem> arrayList5, String str162, @NotNull String str163, @NotNull String str164, @NotNull String str165, @NotNull String str166, @NotNull String str167, @NotNull String str168, @NotNull String str169, Boolean bool3, @NotNull String str170, String str171, Boolean bool4, List<Integer> list3, String str172, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, ArrayList<String> arrayList6, ArrayList<String> arrayList7, @NotNull String str173, @NotNull String str174, @NotNull String str175, @NotNull String str176, @NotNull String str177, @NotNull String str178, @NotNull String str179, @NotNull String str180, @NotNull String str181, @NotNull String str182, String str183, boolean z7, String str184, @NotNull String str185, @NotNull String str186, @NotNull String str187, String str188, List<? extends SubArbitrageType4Remote> list4, @NotNull String str189, String str190, String str191, SmartEarnParam smartEarnParam, Float f, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str192, boolean z8, List<FundingFeeApyItem> list5, List<StrategyProfitResponse> list6, StrategyProfitResponse strategyProfitResponse, String str193, String str194, String str195, String str196, @NotNull String str197, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, String str198, String str199, StrategyDcaEditResp strategyDcaEditResp, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, @NotNull String str200, @NotNull String str201, String str202) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str84, "");
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str91, "");
        Intrinsics.checkNotNullParameter(str92, "");
        Intrinsics.checkNotNullParameter(str93, "");
        Intrinsics.checkNotNullParameter(str94, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str97, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str105, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str107, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str120, "");
        Intrinsics.checkNotNullParameter(str128, "");
        Intrinsics.checkNotNullParameter(str129, "");
        Intrinsics.checkNotNullParameter(str147, "");
        Intrinsics.checkNotNullParameter(str163, "");
        Intrinsics.checkNotNullParameter(str164, "");
        Intrinsics.checkNotNullParameter(str165, "");
        Intrinsics.checkNotNullParameter(str166, "");
        Intrinsics.checkNotNullParameter(str167, "");
        Intrinsics.checkNotNullParameter(str168, "");
        Intrinsics.checkNotNullParameter(str169, "");
        Intrinsics.checkNotNullParameter(str170, "");
        Intrinsics.checkNotNullParameter(str173, "");
        Intrinsics.checkNotNullParameter(str174, "");
        Intrinsics.checkNotNullParameter(str175, "");
        Intrinsics.checkNotNullParameter(str176, "");
        Intrinsics.checkNotNullParameter(str177, "");
        Intrinsics.checkNotNullParameter(str178, "");
        Intrinsics.checkNotNullParameter(str179, "");
        Intrinsics.checkNotNullParameter(str180, "");
        Intrinsics.checkNotNullParameter(str181, "");
        Intrinsics.checkNotNullParameter(str182, "");
        Intrinsics.checkNotNullParameter(str185, "");
        Intrinsics.checkNotNullParameter(str186, "");
        Intrinsics.checkNotNullParameter(str187, "");
        Intrinsics.checkNotNullParameter(str189, "");
        Intrinsics.checkNotNullParameter(str197, "");
        Intrinsics.checkNotNullParameter(str200, "");
        Intrinsics.checkNotNullParameter(str201, "");
        this.instType = str;
        this.instId = str2;
        this.ccy = str3;
        this.ordId = str4;
        this.algoId = str5;
        this.ordType = str6;
        this.tdMode = str7;
        this.lever = str8;
        this.state = str9;
        this.triggerTime = str10;
        this.cTime = str11;
        this.pxVar = str12;
        this.pxSpread = str13;
        this.szLimit = str14;
        this.pxLimit = str15;
        this.actualSz = str16;
        this.totalCycleProfit = str17;
        this.arbitragePnl = str18;
        this.arbitrageProfitRate = str19;
        this.totalCycleProfitRate = str20;
        this.sz = str21;
        this.side = str22;
        this.posSide = str23;
        this.timeInterval = str24;
        this.maxPx = str25;
        this.minPx = str26;
        this.gridNum = str27;
        this.runType = str28;
        this.runPx = str29;
        this.quoteSz = str30;
        this.baseSz = str31;
        this.tpRatio = str32;
        this.slRatio = str33;
        this.tpOrderPx = str34;
        this.slOrderPx = str35;
        this.tradeNum = str36;
        this.totalPnl = str37;
        this.pnlRatio = str38;
        this.arbApy = str39;
        this.investment = str40;
        this.cancelType = str41;
        this.notionalUsd = str42;
        this.count = str43;
        this.stopResult = str44;
        this.profitNum = str45;
        this.avgDailyArbitrageNum = str46;
        this.arbitrageNum = str47;
        this.tgtCcy = str48;
        this.callbackRatio = str49;
        this.callbackSpread = str50;
        this.activePx = str51;
        this.activePxType = str52;
        this.moveTriggerPx = str53;
        this.last = str54;
        this.uTime = str55;
        this.direction = str56;
        this.basePos = z;
        this.noClosePositionId = str57;
        this.actualLever = str58;
        this.actualMarginSz = str59;
        this.extraMarginSz = str60;
        this.availEq = str61;
        this.liqPx = str62;
        this.floatProfit = str63;
        this.floatProfitInSourceCcy = str64;
        this.floatProfitRate = str65;
        this.arbitrageApy = str66;
        this.eq = str67;
        this.gridProfit = str68;
        this.gridProfitInSourceCcy = str69;
        this.gridProfitRate = str70;
        this.algoOrdType = str71;
        this.instList = list;
        this.associate = bool;
        this.stgyName = str72;
        this.amt = str73;
        this.recurringList = arrayList;
        this.period = str74;
        this.recurringDay = str75;
        this.nextInvestTime = str76;
        this.recurringHour = str77;
        this.investCcy = str78;
        this.recurringTime = str79;
        this.cycles = str80;
        this.investAmt = str81;
        this.duration = str82;
        this.investType = str83;
        this.portfolioList = arrayList2;
        this.balType = str84;
        this.deltaRatio = str85;
        this.interval = str86;
        this.balNum = str87;
        this.uly = str88;
        this.quickMgnType = str89;
        this.ordSource = str90;
        this.triggerType = str91;
        this.maxSafetyOrds = str92;
        this.fillSafetyOrds = str93;
        this.avgPx = str94;
        this.tpPx = str95;
        this.slPx = str96;
        this.slMode = str97;
        this.completedCycles = str98;
        this.pxSteps = str99;
        this.pxStepsMult = str100;
        this.volMult = str101;
        this.tpPct = str102;
        this.slPct = str103;
        this.investmentCcy = str104;
        this.investmentAmt = str105;
        this.maxBotUsage = str106;
        this.closeFraction = str107;
        this.signParams = arrayList3;
        this.profit = str108;
        this.triggerParams = list2;
        this.sourceAlgoId = str109;
        this.stopType = str110;
        this.initPx = str111;
        this.perGridProfitRatio = str112;
        this.tpPriceRange = str113;
        this.reserveFunds = bool2;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.trailingDownFund = str114;
        this.gridStatus = str115;
        this.lmtOrderNumber = str116;
        this.aggressiveness = str117;
        this.profitSharingRatio = str118;
        this.copyType = str119;
        this.mktCap = str120;
        this.instIds = arrayList4;
        this.totalAmt = str121;
        this.signalChanId = str122;
        this.signalChanName = str123;
        this.floatingPnl = str124;
        this.availableMargin = str125;
        this.totalPnlRatio = str126;
        this.signalCount = str127;
        this.triggerLast = str128;
        this.reduceOnly = str129;
        this.alternativeCurrency = str130;
        this.currency = str131;
        this.createTime = str132;
        this.expiryTime = str133;
        this.notionalAmount = str134;
        this.notionalCurrency = str135;
        this.participationRatio = str136;
        this.settlementAmount = str137;
        this.status = str138;
        this.strike = str139;
        this.tradeId = str140;
        this.tradeSide = str141;
        this.timeLeft = str142;
        this.notionalAmountPrecision = str143;
        this.sizePrecision = str144;
        this.strikePrecision = str145;
        this.settlementPricePrecision = str146;
        this.endStatusFlag = z2;
        this.estimateProfit = str147;
        this.earlyFilledTime = str148;
        this.earlyFillAmount = str149;
        this.earlyFillCurrency = str150;
        this.earlyFillSettleTime = str151;
        this.earlyFillPrice = str152;
        this.turnoverRatio = str153;
        this.supportEarlyFill = z3;
        this.isStoped = z4;
        this.symbolsNumber = str154;
        this.sourceCcy = str155;
        this.sourceCcySz = str156;
        this.outOfRange = z5;
        this.autoMarginReloadSwitch = z6;
        this.autoMarginReloadMaxAmount = str157;
        this.extendedBusinessInfo = extendedBusinessInfo;
        this.arbPnl = str158;
        this.instFamily = str159;
        this.fundingFeeRatio = str160;
        this.fundingFeeTime = str161;
        this.arbList = arrayList5;
        this.totalFundingFeeRatio = str162;
        this.perMinProfitRate = str163;
        this.perMaxProfitRate = str164;
        this.curQuoteSz = str165;
        this.curBaseSz = str166;
        this.pnlRatioInSourceCcy = str167;
        this.totalPnlInSourceCcy = str168;
        this.isPostWarning = str169;
        this.isTradeBorrowMode = bool3;
        this.lastPrice = str170;
        this.filledPercentage = str171;
        this.needTWapTips = bool4;
        this.strategyTags = list3;
        this.maturedApy = str172;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.voucherInfo = tacticsVoucherInfo;
        this.forbidden = arrayList6;
        this.hiddenFeatures = arrayList7;
        this.dcdState = str173;
        this.dcdPnl = str174;
        this.dcdPnlRatio = str175;
        this.notional = str176;
        this.notionalCcy = str177;
        this.cycle = str178;
        this.currencyBal = str179;
        this.alternateCurrency = str180;
        this.avgCost = str181;
        this.coinPnl = str182;
        this.curStrike = str183;
        this.reinvestment = z7;
        this.settlementCcy = str184;
        this.pTime = str185;
        this.lastTradeExpireTime = str186;
        this.lastSettlementSettledTime = str187;
        this.arbitrageStakingError = str188;
        this.subArbTypes = list4;
        this.absYieldPercentage = str189;
        this.tradeQuoteCcy = str190;
        this.displayId = str191;
        this.simpleEarn = smartEarnParam;
        this.leveragePrincipal = f;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.numOfManualOrderInCycle = i;
        this.highestApyPeriod = str192;
        this.displayMinPaybackDays = z8;
        this.fundingFeeApyList = list5;
        this.profitSnapshots = list6;
        this.latestProfit = strategyProfitResponse;
        this.totalSpreadProfit = str193;
        this.totalApy = str194;
        this.fee = str195;
        this.totalInterestAmt = str196;
        this.debtCcy = str197;
        this.arbitrageProfit = profitDetailResponse;
        this.stakingProfit = profitDetailResponse2;
        this.initOrdAmt = str198;
        this.safetyOrdAmt = str199;
        this.effectiveEditParametersDetails = strategyDcaEditResp;
        this.balanceDetails = balanceDetailInfoDto;
        this.bot = botVo;
        this.tpTriggerRatio = str200;
        this.slTriggerRatio = str201;
        this.advanceOrdType = str202;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyPendingListResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, boolean z, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, List list, Boolean bool, String str72, String str73, ArrayList arrayList, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, ArrayList arrayList2, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, String str103, String str104, String str105, String str106, String str107, ArrayList arrayList3, String str108, List list2, String str109, String str110, String str111, String str112, String str113, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str114, String str115, String str116, String str117, String str118, String str119, String str120, ArrayList arrayList4, String str121, String str122, String str123, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, boolean z2, String str147, String str148, String str149, String str150, String str151, String str152, String str153, boolean z3, boolean z4, String str154, String str155, String str156, boolean z5, boolean z6, String str157, ExtendedBusinessInfo extendedBusinessInfo, String str158, String str159, String str160, String str161, ArrayList arrayList5, String str162, String str163, String str164, String str165, String str166, String str167, String str168, String str169, Boolean bool3, String str170, String str171, Boolean bool4, List list3, String str172, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, ArrayList arrayList6, ArrayList arrayList7, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, boolean z7, String str184, String str185, String str186, String str187, String str188, List list4, String str189, String str190, String str191, SmartEarnParam smartEarnParam, Float f, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str192, boolean z8, List list5, List list6, StrategyProfitResponse strategyProfitResponse, String str193, String str194, String str195, String str196, String str197, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, String str198, String str199, StrategyDcaEditResp strategyDcaEditResp, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, String str200, String str201, String str202, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        String str203 = (i2 & 1) != 0 ? "" : str;
        String str204 = (i2 & 2) != 0 ? "" : str2;
        String str205 = (i2 & 4) != 0 ? "" : str3;
        String str206 = (i2 & 8) != 0 ? "" : str4;
        String str207 = (i2 & 16) != 0 ? "" : str5;
        String str208 = (i2 & 32) != 0 ? "" : str6;
        String str209 = (i2 & 64) != 0 ? "" : str7;
        String str210 = (i2 & 128) != 0 ? "" : str8;
        String str211 = (i2 & 256) != 0 ? "" : str9;
        String str212 = (i2 & 512) != 0 ? "" : str10;
        String str213 = (i2 & 1024) != 0 ? "" : str11;
        String str214 = (i2 & 2048) != 0 ? "" : str12;
        String str215 = (i2 & 4096) != 0 ? "" : str13;
        String str216 = (i2 & 8192) != 0 ? "" : str14;
        String str217 = (i2 & 16384) != 0 ? "" : str15;
        String str218 = (i2 & 32768) != 0 ? "" : str16;
        String str219 = (i2 & 65536) != 0 ? "" : str17;
        String str220 = (i2 & 131072) != 0 ? "" : str18;
        String str221 = (i2 & 262144) != 0 ? "" : str19;
        String str222 = (i2 & 524288) != 0 ? "" : str20;
        String str223 = (i2 & 1048576) != 0 ? "" : str21;
        String str224 = (i2 & 2097152) != 0 ? "" : str22;
        String str225 = (i2 & 4194304) != 0 ? "" : str23;
        String str226 = (i2 & 8388608) != 0 ? "" : str24;
        String str227 = (i2 & 16777216) != 0 ? "" : str25;
        String str228 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str229 = (i2 & 67108864) != 0 ? "" : str27;
        String str230 = (i2 & 134217728) != 0 ? "" : str28;
        String str231 = (i2 & 268435456) != 0 ? "" : str29;
        String str232 = (i2 & 536870912) != 0 ? "" : str30;
        String str233 = (i2 & 1073741824) != 0 ? "" : str31;
        String str234 = (i2 & Integer.MIN_VALUE) != 0 ? "" : str32;
        String str235 = (i3 & 1) != 0 ? "" : str33;
        String str236 = (i3 & 2) != 0 ? "" : str34;
        String str237 = (i3 & 4) != 0 ? "" : str35;
        String str238 = (i3 & 8) != 0 ? "" : str36;
        String str239 = (i3 & 16) != 0 ? "" : str37;
        String str240 = (i3 & 32) != 0 ? "" : str38;
        String str241 = (i3 & 64) != 0 ? "" : str39;
        String str242 = str234;
        String str243 = (i3 & 128) != 0 ? "" : str40;
        String str244 = (i3 & 256) != 0 ? "" : str41;
        String str245 = (i3 & 512) != 0 ? "" : str42;
        String str246 = (i3 & 1024) != 0 ? "" : str43;
        String str247 = (i3 & 2048) != 0 ? "" : str44;
        String str248 = (i3 & 4096) != 0 ? "" : str45;
        String str249 = (i3 & 8192) != 0 ? "" : str46;
        String str250 = (i3 & 16384) != 0 ? "" : str47;
        String str251 = (i3 & 32768) != 0 ? "" : str48;
        String str252 = (i3 & 65536) != 0 ? "" : str49;
        String str253 = (i3 & 131072) != 0 ? "" : str50;
        String str254 = (i3 & 262144) != 0 ? "" : str51;
        String str255 = (i3 & 524288) != 0 ? "" : str52;
        String str256 = (i3 & 1048576) != 0 ? "" : str53;
        String str257 = (i3 & 2097152) != 0 ? "" : str54;
        String str258 = (i3 & 4194304) != 0 ? "" : str55;
        String str259 = (i3 & 8388608) != 0 ? "" : str56;
        boolean z9 = (i3 & 16777216) != 0 ? false : z;
        String str260 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str57;
        String str261 = (i3 & 67108864) != 0 ? "" : str58;
        String str262 = (i3 & 134217728) != 0 ? "" : str59;
        String str263 = (i3 & 268435456) != 0 ? "" : str60;
        String str264 = (i3 & 536870912) != 0 ? "" : str61;
        String str265 = (i3 & 1073741824) != 0 ? "" : str62;
        String str266 = (i3 & Integer.MIN_VALUE) != 0 ? "" : str63;
        String str267 = (i4 & 1) != 0 ? "" : str64;
        String str268 = (i4 & 2) != 0 ? "" : str65;
        String str269 = (i4 & 4) != 0 ? "" : str66;
        String str270 = (i4 & 8) != 0 ? "" : str67;
        String str271 = (i4 & 16) != 0 ? "" : str68;
        String str272 = (i4 & 32) != 0 ? "" : str69;
        String str273 = (i4 & 64) != 0 ? "" : str70;
        String str274 = str266;
        String str275 = (i4 & 128) != 0 ? "" : str71;
        List list7 = (i4 & 256) != 0 ? null : list;
        Boolean bool5 = (i4 & 512) != 0 ? Boolean.FALSE : bool;
        String str276 = (i4 & 1024) != 0 ? "" : str72;
        String str277 = (i4 & 2048) != 0 ? "" : str73;
        ArrayList arrayList8 = (i4 & 4096) != 0 ? new ArrayList() : arrayList;
        String str278 = (i4 & 8192) != 0 ? "" : str74;
        String str279 = (i4 & 16384) != 0 ? "" : str75;
        String str280 = (i4 & 32768) != 0 ? "" : str76;
        String str281 = (i4 & 65536) != 0 ? "" : str77;
        String str282 = (i4 & 131072) != 0 ? "" : str78;
        String str283 = (i4 & 262144) != 0 ? "" : str79;
        String str284 = (i4 & 524288) != 0 ? "" : str80;
        String str285 = (i4 & 1048576) != 0 ? "" : str81;
        String str286 = (i4 & 2097152) != 0 ? "" : str82;
        String str287 = (i4 & 4194304) != 0 ? "" : str83;
        ArrayList arrayList9 = (i4 & 8388608) != 0 ? new ArrayList() : arrayList2;
        String str288 = (i4 & 16777216) != 0 ? "" : str84;
        String str289 = (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str85;
        String str290 = (i4 & 67108864) != 0 ? "" : str86;
        String str291 = (i4 & 134217728) != 0 ? "" : str87;
        String str292 = (i4 & 268435456) != 0 ? "" : str88;
        String str293 = (i4 & 536870912) != 0 ? "" : str89;
        String str294 = (i4 & 1073741824) != 0 ? null : str90;
        String str295 = (i4 & Integer.MIN_VALUE) != 0 ? "" : str91;
        String str296 = (i5 & 1) != 0 ? "" : str92;
        String str297 = (i5 & 2) != 0 ? "" : str93;
        String str298 = (i5 & 4) != 0 ? "" : str94;
        String str299 = (i5 & 8) != 0 ? "" : str95;
        String str300 = (i5 & 16) != 0 ? "" : str96;
        String str301 = (i5 & 32) != 0 ? "" : str97;
        String str302 = (i5 & 64) != 0 ? "" : str98;
        String str303 = str295;
        String str304 = (i5 & 128) != 0 ? null : str99;
        String str305 = (i5 & 256) != 0 ? null : str100;
        String str306 = (i5 & 512) != 0 ? null : str101;
        String str307 = (i5 & 1024) != 0 ? null : str102;
        String str308 = (i5 & 2048) != 0 ? null : str103;
        String str309 = (i5 & 4096) != 0 ? "" : str104;
        String str310 = (i5 & 8192) != 0 ? "" : str105;
        String str311 = (i5 & 16384) != 0 ? "" : str106;
        String str312 = (i5 & 32768) != 0 ? "" : str107;
        ArrayList arrayList10 = (i5 & 65536) != 0 ? null : arrayList3;
        String str313 = (i5 & 131072) != 0 ? null : str108;
        List list8 = (i5 & 262144) != 0 ? null : list2;
        String str314 = (i5 & 524288) != 0 ? null : str109;
        String str315 = (i5 & 1048576) != 0 ? null : str110;
        String str316 = (i5 & 2097152) != 0 ? "" : str111;
        String str317 = (i5 & 4194304) != 0 ? "" : str112;
        String str318 = (i5 & 8388608) != 0 ? null : str113;
        Boolean bool6 = (i5 & 16777216) != 0 ? null : bool2;
        TrailingConfig trailingConfig3 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : trailingConfig;
        TrailingConfig trailingConfig4 = (i5 & 67108864) != 0 ? null : trailingConfig2;
        String str319 = (i5 & 134217728) != 0 ? null : str114;
        String str320 = (i5 & 268435456) != 0 ? null : str115;
        String str321 = (i5 & 536870912) != 0 ? null : str116;
        String str322 = (i5 & 1073741824) != 0 ? null : str117;
        String str323 = (i5 & Integer.MIN_VALUE) != 0 ? null : str118;
        String str324 = (i6 & 1) != 0 ? null : str119;
        String str325 = (i6 & 2) != 0 ? "" : str120;
        ArrayList arrayList11 = (i6 & 4) != 0 ? null : arrayList4;
        String str326 = (i6 & 8) != 0 ? null : str121;
        String str327 = (i6 & 16) != 0 ? null : str122;
        String str328 = (i6 & 32) != 0 ? null : str123;
        String str329 = (i6 & 64) != 0 ? null : str124;
        String str330 = str323;
        String str331 = (i6 & 128) != 0 ? null : str125;
        String str332 = (i6 & 256) != 0 ? null : str126;
        String str333 = (i6 & 512) != 0 ? null : str127;
        String str334 = (i6 & 1024) != 0 ? "" : str128;
        String str335 = (i6 & 2048) != 0 ? "" : str129;
        String str336 = (i6 & 4096) != 0 ? null : str130;
        String str337 = (i6 & 8192) != 0 ? null : str131;
        String str338 = (i6 & 16384) != 0 ? null : str132;
        String str339 = (i6 & 32768) != 0 ? null : str133;
        String str340 = (i6 & 65536) != 0 ? null : str134;
        String str341 = (i6 & 131072) != 0 ? null : str135;
        String str342 = (i6 & 262144) != 0 ? null : str136;
        String str343 = (i6 & 524288) != 0 ? null : str137;
        String str344 = (i6 & 1048576) != 0 ? null : str138;
        String str345 = (i6 & 2097152) != 0 ? null : str139;
        String str346 = (i6 & 4194304) != 0 ? null : str140;
        String str347 = (i6 & 8388608) != 0 ? null : str141;
        String str348 = (i6 & 16777216) != 0 ? null : str142;
        String str349 = (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str143;
        String str350 = (i6 & 67108864) != 0 ? null : str144;
        String str351 = (i6 & 134217728) != 0 ? null : str145;
        String str352 = (i6 & 268435456) != 0 ? null : str146;
        boolean z10 = (i6 & 536870912) != 0 ? false : z2;
        String str353 = (i6 & 1073741824) != 0 ? "" : str147;
        String str354 = (i6 & Integer.MIN_VALUE) != 0 ? null : str148;
        String str355 = (i7 & 1) != 0 ? null : str149;
        String str356 = (i7 & 2) != 0 ? null : str150;
        String str357 = (i7 & 4) != 0 ? null : str151;
        String str358 = (i7 & 8) != 0 ? null : str152;
        String str359 = (i7 & 16) != 0 ? null : str153;
        boolean z11 = (i7 & 32) != 0 ? false : z3;
        boolean z12 = (i7 & 64) != 0 ? false : z4;
        String str360 = str354;
        String str361 = (i7 & 128) != 0 ? null : str154;
        String str362 = (i7 & 256) != 0 ? null : str155;
        String str363 = (i7 & 512) != 0 ? null : str156;
        boolean z13 = (i7 & 1024) != 0 ? false : z5;
        boolean z14 = (i7 & 2048) != 0 ? false : z6;
        String str364 = (i7 & 4096) != 0 ? null : str157;
        ExtendedBusinessInfo extendedBusinessInfo2 = (i7 & 8192) != 0 ? null : extendedBusinessInfo;
        String str365 = (i7 & 16384) != 0 ? null : str158;
        String str366 = (i7 & 32768) != 0 ? null : str159;
        String str367 = (i7 & 65536) != 0 ? null : str160;
        String str368 = (i7 & 131072) != 0 ? null : str161;
        ArrayList arrayList12 = (i7 & 262144) != 0 ? null : arrayList5;
        String str369 = (i7 & 524288) != 0 ? null : str162;
        String str370 = (i7 & 1048576) != 0 ? "" : str163;
        String str371 = (i7 & 2097152) != 0 ? "" : str164;
        String str372 = (i7 & 4194304) != 0 ? "" : str165;
        String str373 = (i7 & 8388608) != 0 ? "" : str166;
        String str374 = (i7 & 16777216) != 0 ? "" : str167;
        String str375 = (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str168;
        String str376 = (i7 & 67108864) != 0 ? "" : str169;
        Boolean bool7 = (i7 & 134217728) != 0 ? null : bool3;
        String str377 = (i7 & 268435456) != 0 ? "" : str170;
        String str378 = (i7 & 536870912) != 0 ? null : str171;
        Boolean bool8 = (i7 & 1073741824) != 0 ? null : bool4;
        List list9 = (i7 & Integer.MIN_VALUE) != 0 ? null : list3;
        this(str203, str204, str205, str206, str207, str208, str209, str210, str211, str212, str213, str214, str215, str216, str217, str218, str219, str220, str221, str222, str223, str224, str225, str226, str227, str228, str229, str230, str231, str232, str233, str242, str235, str236, str237, str238, str239, str240, str241, str243, str244, str245, str246, str247, str248, str249, str250, str251, str252, str253, str254, str255, str256, str257, str258, str259, z9, str260, str261, str262, str263, str264, str265, str274, str267, str268, str269, str270, str271, str272, str273, str275, list7, bool5, str276, str277, arrayList8, str278, str279, str280, str281, str282, str283, str284, str285, str286, str287, arrayList9, str288, str289, str290, str291, str292, str293, str294, str303, str296, str297, str298, str299, str300, str301, str302, str304, str305, str306, str307, str308, str309, str310, str311, str312, arrayList10, str313, list8, str314, str315, str316, str317, str318, bool6, trailingConfig3, trailingConfig4, str319, str320, str321, str322, str330, str324, str325, arrayList11, str326, str327, str328, str329, str331, str332, str333, str334, str335, str336, str337, str338, str339, str340, str341, str342, str343, str344, str345, str346, str347, str348, str349, str350, str351, str352, z10, str353, str360, str355, str356, str357, str358, str359, z11, z12, str361, str362, str363, z13, z14, str364, extendedBusinessInfo2, str365, str366, str367, str368, arrayList12, str369, str370, str371, str372, str373, str374, str375, str376, bool7, str377, str378, bool8, list9, (i8 & 1) != 0 ? null : str172, (i8 & 2) != 0 ? null : entrySignalOrderAmtParam, (i8 & 4) != 0 ? null : exitSignalOrderAmtParam, (i8 & 8) != 0 ? null : tacticsVoucherInfo, (i8 & 16) != 0 ? null : arrayList6, (i8 & 32) != 0 ? null : arrayList7, (i8 & 64) != 0 ? "" : str173, (i8 & 128) != 0 ? "" : str174, (i8 & 256) != 0 ? "" : str175, (i8 & 512) != 0 ? "" : str176, (i8 & 1024) != 0 ? "" : str177, (i8 & 2048) != 0 ? "" : str178, (i8 & 4096) != 0 ? "" : str179, (i8 & 8192) != 0 ? "" : str180, (i8 & 16384) != 0 ? "" : str181, (i8 & 32768) != 0 ? "" : str182, (i8 & 65536) != 0 ? null : str183, (i8 & 131072) != 0 ? true : z7, (i8 & 262144) != 0 ? null : str184, (i8 & 524288) != 0 ? "" : str185, (i8 & 1048576) != 0 ? "" : str186, (i8 & 2097152) != 0 ? "" : str187, (i8 & 4194304) != 0 ? null : str188, (i8 & 8388608) != 0 ? null : list4, (i8 & 16777216) != 0 ? "" : str189, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str190, (i8 & 67108864) != 0 ? null : str191, (i8 & 134217728) != 0 ? null : smartEarnParam, (i8 & 268435456) != 0 ? null : f, (i8 & 536870912) != 0 ? null : arbitrageTotalPnlInfo, (i8 & 1073741824) != 0 ? 0 : i, (i8 & Integer.MIN_VALUE) != 0 ? null : str192, (i9 & 1) == 0 ? z8 : false, (i9 & 2) != 0 ? null : list5, (i9 & 4) != 0 ? null : list6, (i9 & 8) != 0 ? null : strategyProfitResponse, (i9 & 16) != 0 ? null : str193, (i9 & 32) != 0 ? null : str194, (i9 & 64) != 0 ? null : str195, (i9 & 128) != 0 ? null : str196, (i9 & 256) != 0 ? "" : str197, (i9 & 512) != 0 ? null : profitDetailResponse, (i9 & 1024) != 0 ? null : profitDetailResponse2, (i9 & 2048) != 0 ? "" : str198, (i9 & 4096) != 0 ? "" : str199, (i9 & 8192) != 0 ? null : strategyDcaEditResp, (i9 & 16384) != 0 ? null : balanceDetailInfoDto, (i9 & 32768) == 0 ? botVo : null, (i9 & 65536) != 0 ? "" : str200, (i9 & 131072) != 0 ? "" : str201, (i9 & 262144) != 0 ? "" : str202);
    }

    public final String getTpTriggerPx() {
        String tpTriggerPx;
        StrategyPendingListRespExt strategyPendingListRespExt = this.ext;
        return (strategyPendingListRespExt == null || (tpTriggerPx = strategyPendingListRespExt.getTpTriggerPx()) == null) ? "" : tpTriggerPx;
    }

    public final String getSlTriggerPx() {
        String slTriggerPx;
        StrategyPendingListRespExt strategyPendingListRespExt = this.ext;
        return (strategyPendingListRespExt == null || (slTriggerPx = strategyPendingListRespExt.getSlTriggerPx()) == null) ? "" : slTriggerPx;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderUly() {
        return xUW.KWHzl.AEQbTJ(this.instId);
    }

    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderType() {
        String str = this.ordType;
        return str.length() == 0 ? this.algoOrdType : str;
    }

    @Override // o.InterfaceC55726xpQ
    public String getOrderTpTriggerPx() {
        String tpTriggerPx;
        StrategyPendingListRespExt strategyPendingListRespExt = this.ext;
        return (strategyPendingListRespExt == null || (tpTriggerPx = strategyPendingListRespExt.getTpTriggerPx()) == null) ? "" : tpTriggerPx;
    }

    @Override // o.InterfaceC55726xpQ
    public String getOrderSlTriggerPx() {
        String slTriggerPx;
        StrategyPendingListRespExt strategyPendingListRespExt = this.ext;
        return (strategyPendingListRespExt == null || (slTriggerPx = strategyPendingListRespExt.getSlTriggerPx()) == null) ? "" : slTriggerPx;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<DcaTriggerParam> getDcaTriggerParams() {
        List<DcaTriggerParam> list = this.triggerParams;
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isCopy() {
        return C33129mqd.OLrzqt((CharSequence) this.sourceAlgoId);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStopBotType() {
        SignParamItem signParamItem;
        ArrayList<SignParamItem> arrayList = this.signParams;
        if (arrayList == null || (signParamItem = (SignParamItem) CollectionsKt___CollectionsKt.wlaJM(arrayList)) == null) {
            return null;
        }
        return signParamItem.getStopType();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getBaseDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.sizePrecision : this.notionalAmountPrecision;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getQuoteDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmountPrecision : this.sizePrecision;
    }

    public String getTotalDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmountPrecision : this.strikePrecision;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyPrice() {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        xMV xmv = new xMV();
        String str = this.alternativeCurrency;
        if (str == null) {
            str = "";
        }
        String priceDigit = getPriceDigit();
        if (priceDigit == null) {
            priceDigit = "";
        }
        xMV xmvKWHzl = xmv.KWHzl(str, priceDigit);
        String str2 = this.earlyFillPrice;
        C54536xML c54536xMLCopydefault = xmvKWHzl.copydefault(str2 != null ? str2 : "");
        if (c54536xMLCopydefault == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyTotal() {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy")) {
            xMV xmv = new xMV();
            String str = this.notionalCurrency;
            if (str == null) {
                str = "";
            }
            String totalDigit = getTotalDigit();
            if (totalDigit == null) {
                totalDigit = "";
            }
            xMV xmvKWHzl = xmv.KWHzl(str, totalDigit);
            String str2 = this.notionalAmount;
            c54536xMLCopydefault = xmvKWHzl.copydefault(str2 != null ? str2 : "");
        } else {
            xMV xmv2 = new xMV();
            String str3 = this.earlyFillCurrency;
            if (str3 == null) {
                str3 = "";
            }
            String totalDigit2 = getTotalDigit();
            if (totalDigit2 == null) {
                totalDigit2 = "";
            }
            xMV xmvKWHzl2 = xmv2.KWHzl(str3, totalDigit2);
            String str4 = this.earlyFillAmount;
            c54536xMLCopydefault = xmvKWHzl2.copydefault(str4 != null ? str4 : "");
        }
        if (c54536xMLCopydefault == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyAmount() {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy")) {
            xMV xmv = new xMV();
            String str = this.earlyFillCurrency;
            if (str == null) {
                str = "";
            }
            String baseDigit = getBaseDigit();
            if (baseDigit == null) {
                baseDigit = "";
            }
            xMV xmvKWHzl = xmv.KWHzl(str, baseDigit);
            String str2 = this.earlyFillAmount;
            c54536xMLCopydefault = xmvKWHzl.copydefault(str2 != null ? str2 : "");
        } else {
            xMV xmv2 = new xMV();
            String str3 = this.notionalCurrency;
            if (str3 == null) {
                str3 = "";
            }
            String baseDigit2 = getBaseDigit();
            if (baseDigit2 == null) {
                baseDigit2 = "";
            }
            xMV xmvKWHzl2 = xmv2.KWHzl(str3, baseDigit2);
            String str4 = this.notionalAmount;
            c54536xMLCopydefault = xmvKWHzl2.copydefault(str4 != null ? str4 : "");
        }
        if (c54536xMLCopydefault == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    public String getValidOrderId() {
        return C33129mqd.OLrzqt((CharSequence) this.ordId) ? this.ordId : this.algoId;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbOrderPnl() {
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        if (profitDetailResponse != null) {
            return profitDetailResponse.getTotal();
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isShowTWapTips() {
        return Intrinsics.EZpvd(this.needTWapTips, Boolean.TRUE);
    }

    public String getBotApy() {
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        if (profitDetailResponse != null) {
            return profitDetailResponse.getApy();
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TacticsVoucherInfo getTacticsVoucherInfo() {
        LossInsurance lossInsuranceVoucherParam;
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        if (tacticsVoucherInfo != null) {
            return tacticsVoucherInfo;
        }
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        if (extendedBusinessInfo != null && (lossInsuranceVoucherParam = extendedBusinessInfo.getLossInsuranceVoucherParam()) != null) {
            if (!lossInsuranceVoucherParam.getEligible()) {
                lossInsuranceVoucherParam = null;
            }
            if (lossInsuranceVoucherParam != null) {
                return C55794xqf.EZpvd.OLrzqt(lossInsuranceVoucherParam);
            }
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<String> getForbiddenFunctions() {
        ArrayList<String> arrayList = this.forbidden;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<String> getHiddenFeaturesData() {
        ArrayList<String> arrayList = this.hiddenFeatures;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isArbitrageWithStaking() {
        List<? extends SubArbitrageType4Remote> list = this.subArbTypes;
        return (list != null ? (SubArbitrageType4Remote) CollectionsKt___CollectionsKt.firstOrNull(list) : null) == SubArbitrageType4Remote.STAKE;
    }

    public String getStakingApy() {
        ProfitDetailResponse profitDetailResponse = this.stakingProfit;
        if (profitDetailResponse != null) {
            return profitDetailResponse.getApy();
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Float getLeverPrincipal() {
        return C55770xqH.Activity.copydefault.EZpvd(this.leveragePrincipal);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public SmartArbProfitsInfo getSmartArbProfitsInfo() {
        SmartArbitrageVo smartArbitrage;
        SmartArbitrageVo smartArbitrage2;
        SmartArbitrageVo smartArbitrage3;
        SmartArbitrageVo smartArbitrage4;
        String str = this.totalSpreadProfit;
        String str2 = this.totalApy;
        String str3 = this.fee;
        String str4 = this.totalInterestAmt;
        String str5 = this.debtCcy;
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        BotVo botVo = this.bot;
        ProfitDetailResponse autoStakingProfit = (botVo == null || (smartArbitrage4 = botVo.getSmartArbitrage()) == null) ? null : smartArbitrage4.getAutoStakingProfit();
        BotVo botVo2 = this.bot;
        String autoStakingPos = (botVo2 == null || (smartArbitrage3 = botVo2.getSmartArbitrage()) == null) ? null : smartArbitrage3.getAutoStakingPos();
        BotVo botVo3 = this.bot;
        String autoStakingPosUsdt = (botVo3 == null || (smartArbitrage2 = botVo3.getSmartArbitrage()) == null) ? null : smartArbitrage2.getAutoStakingPosUsdt();
        BotVo botVo4 = this.bot;
        return new SmartArbProfitsInfo(str, str2, str3, str4, str5, profitDetailResponse, profitDetailResponse2, autoStakingProfit, autoStakingPos, autoStakingPosUsdt, (botVo4 == null || (smartArbitrage = botVo4.getSmartArbitrage()) == null) ? null : smartArbitrage.getStakePosUsdt());
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TpSlTriggerParamReqResp getOrderTpSlTriggerParam() {
        StrategyPendingListRespExt strategyPendingListRespExt = this.ext;
        if (strategyPendingListRespExt != null) {
            return strategyPendingListRespExt.getTpslTriggerParam();
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<String> getVipProfitState() {
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        AutoEarnStakingParam autoEarn;
        ArrayList arrayList = new ArrayList();
        BotVo botVo = this.bot;
        if (botVo != null && (common2 = botVo.getCommon()) != null && (autoEarn = common2.getAutoEarn()) != null && Intrinsics.EZpvd((Object) autoEarn.getStatus(), (Object) "earning")) {
            arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.getQueueTitle));
        }
        BotVo botVo2 = this.bot;
        if (botVo2 != null && (common = botVo2.getCommon()) != null && (autoStaking = common.getAutoStaking()) != null && (Intrinsics.EZpvd((Object) autoStaking.getStatus(), (Object) "earning") || isArbitrageWithStaking())) {
            arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompat));
        }
        return arrayList;
    }

    public boolean isTpTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.tpTriggerRatio) && C33129mqd.AhwBna(this.tpTriggerRatio, 0);
    }

    public boolean isSlTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.slTriggerRatio) && C33129mqd.AhwBna(this.slTriggerRatio, 0);
    }

    public String customStrategyName() {
        BotCommon common;
        BotVo botVo = this.bot;
        if (botVo == null || (common = botVo.getCommon()) == null) {
            return null;
        }
        return common.getStgyName();
    }

    public boolean isPinned() {
        BotCommon common;
        BotVo botVo = this.bot;
        if (botVo == null || (common = botVo.getCommon()) == null) {
            return false;
        }
        return common.isPinned();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public RecurringBuyDetails getRecurringBuyDetails() {
        String str = this.period;
        String str2 = this.recurringDay;
        String str3 = this.recurringHour;
        String str4 = this.recurringTime;
        ArrayList<RecurringListItem> arrayList = this.recurringList;
        BotVo botVo = getBotVo();
        return new RecurringBuyDetails(str, str2, str3, str4, arrayList, botVo != null ? botVo.getRecurring() : null, this.amt);
    }
}

package com.okinc.unify_trade.biz;

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
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto$$serializer;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.SmartEarnParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp$$serializer;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C55770xqH;
import o.C55802xqn;
import o.C55884xsP;
import o.C56033xvF;
import o.C56068xvo;
import o.C56071xvr;
import o.C56390yDp;
import o.xVS;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyDetailsResponse implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    private String absYieldPercentage;
    private final Long accountId;
    private String activeOrderCount;
    private String actualLever;
    private String actualMarginSz;
    private String actualSz;
    private String additionalFundNeeded;
    private String aggressiveness;
    private String algoId;
    private String algoOrdType;
    private Boolean allowMultipleEntry;
    private String alternateCurrency;
    private String amt;
    private String annualizedRate;
    private String apy;
    private String arbApy;
    private ArrayList<SmartArbListItem> arbList;
    private String arbPnl;
    private String arbitrageApy;
    private String arbitrageNum;
    private String arbitragePnl;
    private final ProfitDetailResponse arbitrageProfit;
    private String arbitrageProfitRate;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
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
    private String cancelType;
    private String ccy;
    private String coinPnl;
    private String completedCycles;
    private String copyType;
    private String ctVal;
    private String curBaseSz;
    private String curQuoteSz;
    private String curSettlementTime;
    private String curStrike;
    private String currency;
    private String currencyBal;
    private String cycle;
    private String cycleBaseAmt;
    private final String cycleStartTime;
    private String cycles;
    private String dcdOptionType;
    private String dcdState;
    private final String debtCcy;
    private String deltaRatio;
    private String direction;
    private final String displayId;
    private final boolean displayMinPaybackDays;
    private String duration;
    private final StrategyDcaEditResp effectiveEditParametersDetails;
    private String eq;
    private String estimatedSettleTime;
    private final ExtendedBusinessInfo extendedBusinessInfo;
    private String extraMarginSz;
    private final String fee;
    private String feeCcy;
    private String fillManualAddOrds;
    private String fillSafetyOrds;
    private String floatProfit;
    private String floatProfitInSourceCcy;
    private String floatProfitRate;
    private String floatingPnl;
    private final ArrayList<String> forbidden;
    private String fundingFee;
    private final List<FundingFeeApyItem> fundingFeeApyList;
    private String fundingFeeRatio;
    private String fundingFeeTime;
    private String gridNum;
    private String gridProfit;
    private String gridProfitInSourceCcy;
    private String gridProfitRate;
    private String gridStatus;
    private final ArrayList<String> hiddenFeatures;
    private final String highestApyPeriod;
    private String initOrdAmt;
    private String initPx;
    private String instFamily;
    private String instId;
    private List<String> instIds;
    private String instType;
    private String interval;
    private String investAmt;
    private String investCcy;
    private String investType;
    private String investment;
    private String investmentAmt;
    private String investmentCcy;
    private boolean isHistory;
    private Boolean isTradeBorrowMode;
    private String lastPrice;
    private String lastSettlementSettledTime;
    private String lastTradeExpireTime;
    private StrategyProfitResponse latestProfit;
    private String lever;
    private final Float leveragePrincipal;
    private final String liqPx;
    private String lmtOrderNumber;
    private String maturedApy;
    private String maxBotUsage;
    private String maxPx;
    private String maxSafetyOrds;
    private String maxSettlementDay;
    private String minAnnualYieldPercentage;
    private String minPx;
    private String mktCap;
    private String netMarginTransfer;
    private String nextInvestTime;
    private final String noClosePositionId;
    private String notional;
    private String notionalCcy;
    private String ordFrozen;
    private String ordId;
    private String ordType;
    private boolean outOfRange;
    private String pTime;
    private String perGridProfitRatio;
    private String perMaxProfitRate;
    private String perMinProfitRate;
    private String period;
    private String pnlRatio;
    private String pnlRatioInSourceCcy;
    private ArrayList<SmartPortfolioListItem> portfolioList;
    private String posSide;
    private String preAnnualized;
    private String preFundingFee;
    private String profit;
    private final GridProfitAutoReinvestResponse profitAutoReinvest;
    private String profitInSourceCcy;
    private String profitNum;
    private String profitSharingRatio;
    private List<StrategyProfitResponse> profitSnapshots;
    private String pxLimit;
    private String pxSpread;
    private String pxSteps;
    private String pxStepsMult;
    private String pxVar;
    private String quoteSz;
    private String ratio;
    private String realizedPnl;
    private ArrayList<RebateTransItem> rebateTrans;
    private String recurringDay;
    private String recurringHour;
    private ArrayList<RecurringListItem> recurringList;
    private String recurringTime;
    private String reduce_only;
    private String reinvestment;
    private String reserveFundingFee;
    private boolean reserveFunds;
    private String ruleType;
    private String runPx;
    private String runTime;
    private String runType;
    private String safetyOrdAmt;
    private final String safetyOrdRatio;
    private String settlementAmount;
    private String settlementCcy;
    private String side;
    private ArrayList<SignParamItem> signParams;
    private ExitSignalOrderAmtParam signalBotOrderStopParam;
    private String signalChanId;
    private String signalChanName;
    private String signalCount;
    private EntrySignalOrderAmtParam signalOrderAmtParam;
    private String signalSourceType;
    private final SmartEarnParam simpleEarn;
    private String singleAmt;
    private String slMode;
    private String slPct;
    private String slPx;
    private String slRatio;
    private String slTriggerPx;
    private String sourceAlgoId;
    private String sourceCcy;
    private String sourceCcySz;
    private String spreadPnl;
    private String stakingPnl;
    private String stakingPnlApy;
    private String stakingPnlUSDT;
    private String stakingPosCcy;
    private final ProfitDetailResponse stakingProfit;
    private String state;
    private String stgyName;
    private String stopPercentage;
    private String stopPrice;
    private String stopResult;
    private String stopType;
    private final List<Integer> strategyTags;
    private String strike;
    private String strikePercentage;
    private List<? extends SubArbitrageType4Remote> subArbTypes;
    private String subOrdType;
    private String symbolsNumber;
    private String sz;
    private String szLimit;
    private String tdMode;
    private String term;
    private String timeInterval;
    private String totalAmt;
    private String totalAnnualizedRate;
    private final String totalApy;
    private String totalCycleProfit;
    private String totalCycleProfitRate;
    private String totalEquity;
    private final String totalInterestAmt;
    private String totalPnl;
    private String totalPnlInSourceCcy;
    private String totalPnlRatio;
    private final String totalSpreadProfit;
    private String tpPct;
    private final String tpPriceRange;
    private String tpPx;
    private String tpRatio;
    private String tpTriggerPx;
    private TpSlTriggerParamReqResp tpslTriggerParamResp;
    private String trackingMode;
    private String tradeNum;
    private final String tradeQuoteCcy;
    private TrailingConfig trailingDownConfig;
    private String trailingDownFund;
    private TrailingConfig trailingUpConfig;
    private String transferInMargin;
    private List<DcaTriggerParam> triggerParams;
    private String triggerTime;
    private String uTime;
    private String uly;
    private String usedMargin;
    private String volMult;
    private final TacticsVoucherInfo voucherInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StrategyDetailsResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyDetailsResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyDetailsResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean boolValueOf;
            ArrayList arrayList7;
            ArrayList arrayList8;
            Boolean boolValueOf2;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
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
            TpSlTriggerParamReqResp tpSlTriggerParamReqRespCreateFromParcel = TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel);
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
            String string57 = parcel.readString();
            String string58 = parcel.readString();
            String string59 = parcel.readString();
            String string60 = parcel.readString();
            String string61 = parcel.readString();
            String string62 = parcel.readString();
            String string63 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList17 = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList17.add(RecurringListItem.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            String string64 = parcel.readString();
            String string65 = parcel.readString();
            String string66 = parcel.readString();
            String string67 = parcel.readString();
            String string68 = parcel.readString();
            String string69 = parcel.readString();
            String string70 = parcel.readString();
            String string71 = parcel.readString();
            String string72 = parcel.readString();
            String string73 = parcel.readString();
            String string74 = parcel.readString();
            String string75 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string76 = parcel.readString();
            String string77 = parcel.readString();
            String string78 = parcel.readString();
            String string79 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList18 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList18.add(SmartPortfolioListItem.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            String string80 = parcel.readString();
            String string81 = parcel.readString();
            String string82 = parcel.readString();
            String string83 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                arrayList = arrayList18;
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i5);
                arrayList = arrayList18;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList19.add(SignParamItem.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList2 = arrayList19;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i7);
                arrayList3 = arrayList2;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList20.add(RebateTransItem.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList4 = arrayList20;
            }
            boolean z2 = parcel.readInt() != 0;
            String string103 = parcel.readString();
            String string104 = parcel.readString();
            String string105 = parcel.readString();
            String string106 = parcel.readString();
            String string107 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList4;
                arrayList6 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i9);
                arrayList5 = arrayList4;
                int i10 = 0;
                while (i10 != i9) {
                    arrayList21.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList6 = arrayList21;
            }
            String string108 = parcel.readString();
            String string109 = parcel.readString();
            String string110 = parcel.readString();
            String string111 = parcel.readString();
            String string112 = parcel.readString();
            String string113 = parcel.readString();
            String string114 = parcel.readString();
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            TrailingConfig trailingConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string133 = parcel.readString();
            String string134 = parcel.readString();
            EntrySignalOrderAmtParam entrySignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : EntrySignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            ExitSignalOrderAmtParam exitSignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : ExitSignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            String string135 = parcel.readString();
            String string136 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string137 = parcel.readString();
            String string138 = parcel.readString();
            String string139 = parcel.readString();
            String string140 = parcel.readString();
            String string141 = parcel.readString();
            String string142 = parcel.readString();
            String string143 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string144 = parcel.readString();
            ExtendedBusinessInfo extendedBusinessInfoCreateFromParcel = parcel.readInt() == 0 ? null : ExtendedBusinessInfo.CREATOR.createFromParcel(parcel);
            String string145 = parcel.readString();
            String string146 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList6;
                arrayList8 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i11);
                arrayList7 = arrayList6;
                int i12 = 0;
                while (i12 != i11) {
                    arrayList22.add(SmartArbListItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList8 = arrayList22;
            }
            String string147 = parcel.readString();
            String string148 = parcel.readString();
            String string149 = parcel.readString();
            String string150 = parcel.readString();
            String string151 = parcel.readString();
            String string152 = parcel.readString();
            String string153 = parcel.readString();
            String string154 = parcel.readString();
            String string155 = parcel.readString();
            String string156 = parcel.readString();
            String string157 = parcel.readString();
            String string158 = parcel.readString();
            String string159 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList9 = arrayList8;
                arrayList10 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i13);
                arrayList9 = arrayList8;
                int i14 = 0;
                while (i14 != i13) {
                    arrayList23.add(Integer.valueOf(parcel.readInt()));
                    i14++;
                    i13 = i13;
                }
                arrayList10 = arrayList23;
            }
            TacticsVoucherInfo tacticsVoucherInfoCreateFromParcel = parcel.readInt() == 0 ? null : TacticsVoucherInfo.CREATOR.createFromParcel(parcel);
            String string160 = parcel.readString();
            String string161 = parcel.readString();
            String string162 = parcel.readString();
            String string163 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList11 = arrayList10;
                arrayList12 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i15);
                arrayList11 = arrayList10;
                int i16 = 0;
                while (i16 != i15) {
                    arrayList24.add(SubArbitrageType4Remote.valueOf(parcel.readString()));
                    i16++;
                    i15 = i15;
                }
                arrayList12 = arrayList24;
            }
            String string164 = parcel.readString();
            String string165 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string166 = parcel.readString();
            String string167 = parcel.readString();
            String string168 = parcel.readString();
            String string169 = parcel.readString();
            String string170 = parcel.readString();
            String string171 = parcel.readString();
            String string172 = parcel.readString();
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
            String string184 = parcel.readString();
            String string185 = parcel.readString();
            String string186 = parcel.readString();
            String string187 = parcel.readString();
            String string188 = parcel.readString();
            String string189 = parcel.readString();
            String string190 = parcel.readString();
            String string191 = parcel.readString();
            String string192 = parcel.readString();
            SmartEarnParam smartEarnParamCreateFromParcel = parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel);
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfoCreateFromParcel = parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string193 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList13 = arrayList12;
                arrayList14 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i17);
                arrayList13 = arrayList12;
                int i18 = 0;
                while (i18 != i17) {
                    arrayList25.add(FundingFeeApyItem.CREATOR.createFromParcel(parcel));
                    i18++;
                    i17 = i17;
                }
                arrayList14 = arrayList25;
            }
            String string194 = parcel.readString();
            String string195 = parcel.readString();
            GridProfitAutoReinvestResponse gridProfitAutoReinvestResponseCreateFromParcel = parcel.readInt() == 0 ? null : GridProfitAutoReinvestResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList15 = arrayList14;
                arrayList16 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(i19);
                arrayList15 = arrayList14;
                int i20 = 0;
                while (i20 != i19) {
                    arrayList26.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                    i20++;
                    i19 = i19;
                }
                arrayList16 = arrayList26;
            }
            return new StrategyDetailsResponse(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, tpSlTriggerParamReqRespCreateFromParcel, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, string59, string60, string61, string62, string63, arrayList17, string64, string65, string66, string67, string68, string69, string70, string71, string72, string73, string74, string75, z, string76, string77, string78, string79, arrayList, string80, string81, string82, string83, string84, string85, string86, string87, string88, string89, string90, string91, string92, string93, string94, string95, string96, string97, string98, string99, string100, string101, string102, arrayList3, arrayList5, z2, string103, string104, string105, string106, string107, arrayList7, string108, string109, string110, string111, string112, string113, string114, trailingConfigCreateFromParcel, trailingConfigCreateFromParcel2, string115, string116, string117, string118, string119, string120, arrayListCreateStringArrayList, string121, string122, string123, string124, string125, string126, string127, string128, string129, string130, string131, string132, boolValueOf, string133, string134, entrySignalOrderAmtParamCreateFromParcel, exitSignalOrderAmtParamCreateFromParcel, string135, string136, z3, string137, string138, string139, string140, string141, string142, string143, z4, z5, string144, extendedBusinessInfoCreateFromParcel, string145, string146, arrayList9, string147, string148, string149, string150, string151, string152, string153, string154, string155, string156, string157, string158, string159, boolValueOf2, arrayList11, tacticsVoucherInfoCreateFromParcel, string160, string161, string162, string163, arrayList13, string164, string165, lValueOf, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string166, string167, string168, string169, string170, string171, string172, string173, string174, string175, string176, string177, string178, string179, string180, string181, string182, string183, string184, string185, string186, string187, string188, string189, string190, string191, string192, smartEarnParamCreateFromParcel, arbitrageTotalPnlInfoCreateFromParcel, fValueOf, string193, z6, arrayList15, string194, string195, gridProfitAutoReinvestResponseCreateFromParcel, arrayList16, parcel.readInt() == 0 ? null : StrategyProfitResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BalanceDetailInfoDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BotVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StrategyDcaEditResp.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyDetailsResponse[] newArray(int i) {
            return new StrategyDetailsResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyDetailsResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getApy$annotations() {
    }

    @SerialName("avgDailyArbitrageNum")
    public static /* synthetic */ void getAvgDailyArbitrageNum$annotations() {
    }

    @Serializable(with = xVS.class)
    public static /* synthetic */ void getDisplayMinPaybackDays$annotations() {
    }

    public static /* synthetic */ void getSpreadPnl$annotations() {
    }

    public static /* synthetic */ void getStakingPnl$annotations() {
    }

    public static /* synthetic */ void getStakingPnlApy$annotations() {
    }

    @SerialName("stakingPnlUsdt")
    public static /* synthetic */ void getStakingPnlUSDT$annotations() {
    }

    @SerialName("posCcy")
    public static /* synthetic */ void getStakingPosCcy$annotations() {
    }

    @SerialName("tpslTriggerParam")
    public static /* synthetic */ void getTpslTriggerParamResp$annotations() {
    }

    @Serializable(with = C55802xqn.class)
    public static /* synthetic */ void getVoucherInfo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component100() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component101() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component102() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component103() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component104() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component105() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component106() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignParamItem> component107() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RebateTransItem> component108() {
        return this.rebateTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component109() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component110() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component111() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component112() {
        return this.additionalFundNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component113() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component114() {
        return this.cycleBaseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component115() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component116() {
        return this.reserveFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component117() {
        return this.transferInMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component118() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component119() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component120() {
        return this.initPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component121() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component122() {
        return this.activeOrderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component123() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component124() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component125() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component126() {
        return this.gridStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component127() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component128() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component129() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component130() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component131() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component132() {
        return this.totalEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component133() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component134() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component135() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component136() {
        return this.usedMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component137() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component138() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component139() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component140() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component141() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component142() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component143() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component144() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component145() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component146() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component147() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component148() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component149() {
        return this.signalSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component150() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component151() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component152() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component153() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component154() {
        return this.trackingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component155() {
        return this.netMarginTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component156() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component157() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component158() {
        return this.reduce_only;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component159() {
        return this.outOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component160() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component161() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo component162() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component163() {
        return this.arbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component164() {
        return this.spreadPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> component165() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component166() {
        return this.preFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component167() {
        return this.preAnnualized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component168() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component169() {
        return this.fundingFeeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component170() {
        return this.fundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component171() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component172() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component173() {
        return this.floatProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component174() {
        return this.gridProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component175() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component176() {
        return this.floatProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component177() {
        return this.profitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component178() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component179() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component180() {
        return this.strategyTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo component181() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component182() {
        return this.stakingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component183() {
        return this.stakingPnlUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component184() {
        return this.stakingPosCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component185() {
        return this.stakingPnlApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> component186() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component187() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component188() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component189() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component190() {
        return this.forbidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component191() {
        return this.hiddenFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component192() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component193() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component194() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component195() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component196() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component197() {
        return this.settlementCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component198() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component199() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component200() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component201() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component202() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component203() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component204() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component205() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component206() {
        return this.stopPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component207() {
        return this.stopPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component208() {
        return this.curStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component209() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component210() {
        return this.curSettlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component211() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component212() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component213() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component214() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component215() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component216() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component217() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component218() {
        return this.estimatedSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component219() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component220() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component221() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component222() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component223() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> component224() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component225() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component226() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse component227() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component228() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component229() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component230() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component231() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component232() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component233() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component234() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto component235() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component236() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo component237() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp component238() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component239() {
        return this.safetyOrdRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component240() {
        return this.cycleStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component241() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component28() {
        return this.tpslTriggerParamResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.runTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.totalAnnualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.curQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.curBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.avgDailyArbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.singleAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.cycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> component65() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.nextInvestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component78() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.balNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> component83() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.maturedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component88() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component89() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.fillManualAddOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component92() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component93() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.tpPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str64, @NotNull String str65, @NotNull String str66, String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, boolean z, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str80, String str81, @NotNull String str82, @NotNull String str83, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, @NotNull String str91, @NotNull String str92, @NotNull String str93, @NotNull String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, @NotNull String str99, String str100, String str101, String str102, ArrayList<SignParamItem> arrayList3, ArrayList<RebateTransItem> arrayList4, boolean z2, @NotNull String str103, @NotNull String str104, @NotNull String str105, @NotNull String str106, String str107, List<DcaTriggerParam> list, String str108, String str109, @NotNull String str110, @NotNull String str111, @NotNull String str112, @NotNull String str113, String str114, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, List<String> list2, String str121, String str122, @NotNull String str123, @NotNull String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, Boolean bool, String str133, String str134, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, String str135, String str136, boolean z3, String str137, String str138, String str139, @NotNull String str140, @NotNull String str141, @NotNull String str142, @NotNull String str143, boolean z4, boolean z5, String str144, ExtendedBusinessInfo extendedBusinessInfo, String str145, String str146, ArrayList<SmartArbListItem> arrayList5, String str147, String str148, String str149, String str150, String str151, @NotNull String str152, @NotNull String str153, @NotNull String str154, @NotNull String str155, @NotNull String str156, @NotNull String str157, String str158, String str159, Boolean bool2, List<Integer> list3, TacticsVoucherInfo tacticsVoucherInfo, String str160, String str161, @NotNull String str162, @NotNull String str163, List<? extends SubArbitrageType4Remote> list4, String str164, @NotNull String str165, Long l, ArrayList<String> arrayList6, ArrayList<String> arrayList7, String str166, String str167, String str168, String str169, String str170, String str171, String str172, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, String str184, String str185, String str186, String str187, String str188, @NotNull String str189, @NotNull String str190, @NotNull String str191, @NotNull String str192, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, String str193, boolean z6, List<FundingFeeApyItem> list5, @NotNull String str194, String str195, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, List<StrategyProfitResponse> list6, StrategyProfitResponse strategyProfitResponse, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, @NotNull String str199, BotVo botVo, StrategyDcaEditResp strategyDcaEditResp, String str200, @NotNull String str201, @NotNull String str202) {
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
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
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
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
        Intrinsics.checkNotNullParameter(str99, "");
        Intrinsics.checkNotNullParameter(str103, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str105, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str110, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str113, "");
        Intrinsics.checkNotNullParameter(str123, "");
        Intrinsics.checkNotNullParameter(str124, "");
        Intrinsics.checkNotNullParameter(str140, "");
        Intrinsics.checkNotNullParameter(str141, "");
        Intrinsics.checkNotNullParameter(str142, "");
        Intrinsics.checkNotNullParameter(str143, "");
        Intrinsics.checkNotNullParameter(str152, "");
        Intrinsics.checkNotNullParameter(str153, "");
        Intrinsics.checkNotNullParameter(str154, "");
        Intrinsics.checkNotNullParameter(str155, "");
        Intrinsics.checkNotNullParameter(str156, "");
        Intrinsics.checkNotNullParameter(str157, "");
        Intrinsics.checkNotNullParameter(str162, "");
        Intrinsics.checkNotNullParameter(str163, "");
        Intrinsics.checkNotNullParameter(str165, "");
        Intrinsics.checkNotNullParameter(str189, "");
        Intrinsics.checkNotNullParameter(str190, "");
        Intrinsics.checkNotNullParameter(str191, "");
        Intrinsics.checkNotNullParameter(str192, "");
        Intrinsics.checkNotNullParameter(str194, "");
        Intrinsics.checkNotNullParameter(str199, "");
        Intrinsics.checkNotNullParameter(str201, "");
        Intrinsics.checkNotNullParameter(str202, "");
        return new StrategyDetailsResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, tpSlTriggerParamReqResp, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, arrayList, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, z, str76, str77, str78, str79, arrayList2, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, arrayList3, arrayList4, z2, str103, str104, str105, str106, str107, list, str108, str109, str110, str111, str112, str113, str114, trailingConfig, trailingConfig2, str115, str116, str117, str118, str119, str120, list2, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, bool, str133, str134, entrySignalOrderAmtParam, exitSignalOrderAmtParam, str135, str136, z3, str137, str138, str139, str140, str141, str142, str143, z4, z5, str144, extendedBusinessInfo, str145, str146, arrayList5, str147, str148, str149, str150, str151, str152, str153, str154, str155, str156, str157, str158, str159, bool2, list3, tacticsVoucherInfo, str160, str161, str162, str163, list4, str164, str165, l, arrayList6, arrayList7, str166, str167, str168, str169, str170, str171, str172, str173, str174, str175, str176, str177, str178, str179, str180, str181, str182, str183, str184, str185, str186, str187, str188, str189, str190, str191, str192, smartEarnParam, arbitrageTotalPnlInfo, f, str193, z6, list5, str194, str195, gridProfitAutoReinvestResponse, list6, strategyProfitResponse, str196, str197, str198, profitDetailResponse, profitDetailResponse2, balanceDetailInfoDto, str199, botVo, strategyDcaEditResp, str200, str201, str202);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyDetailsResponse)) {
            return false;
        }
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) strategyDetailsResponse.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyDetailsResponse.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) strategyDetailsResponse.uly) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyDetailsResponse.ccy) && Intrinsics.EZpvd((Object) this.ctVal, (Object) strategyDetailsResponse.ctVal) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyDetailsResponse.ordId) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyDetailsResponse.algoId) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyDetailsResponse.cTime) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyDetailsResponse.ordType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyDetailsResponse.tdMode) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) strategyDetailsResponse.triggerTime) && Intrinsics.EZpvd((Object) this.state, (Object) strategyDetailsResponse.state) && Intrinsics.EZpvd((Object) this.pxVar, (Object) strategyDetailsResponse.pxVar) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) strategyDetailsResponse.pxSpread) && Intrinsics.EZpvd((Object) this.szLimit, (Object) strategyDetailsResponse.szLimit) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) strategyDetailsResponse.pxLimit) && Intrinsics.EZpvd((Object) this.actualSz, (Object) strategyDetailsResponse.actualSz) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyDetailsResponse.sz) && Intrinsics.EZpvd((Object) this.side, (Object) strategyDetailsResponse.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyDetailsResponse.posSide) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) strategyDetailsResponse.timeInterval) && Intrinsics.EZpvd((Object) this.maxPx, (Object) strategyDetailsResponse.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) strategyDetailsResponse.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) strategyDetailsResponse.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) strategyDetailsResponse.runType) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) strategyDetailsResponse.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) strategyDetailsResponse.baseSz) && Intrinsics.EZpvd(this.tpslTriggerParamResp, strategyDetailsResponse.tpslTriggerParamResp) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) strategyDetailsResponse.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) strategyDetailsResponse.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) strategyDetailsResponse.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) strategyDetailsResponse.slRatio) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) strategyDetailsResponse.tradeNum) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyDetailsResponse.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyDetailsResponse.pnlRatio) && Intrinsics.EZpvd((Object) this.arbApy, (Object) strategyDetailsResponse.arbApy) && Intrinsics.EZpvd((Object) this.profitNum, (Object) strategyDetailsResponse.profitNum) && Intrinsics.EZpvd((Object) this.runTime, (Object) strategyDetailsResponse.runTime) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) strategyDetailsResponse.perMinProfitRate) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) strategyDetailsResponse.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) strategyDetailsResponse.gridProfit) && Intrinsics.EZpvd((Object) this.gridProfitRate, (Object) strategyDetailsResponse.gridProfitRate) && Intrinsics.EZpvd((Object) this.totalCycleProfitRate, (Object) strategyDetailsResponse.totalCycleProfitRate) && Intrinsics.EZpvd((Object) this.arbitrageProfitRate, (Object) strategyDetailsResponse.arbitrageProfitRate) && Intrinsics.EZpvd((Object) this.floatProfit, (Object) strategyDetailsResponse.floatProfit) && Intrinsics.EZpvd((Object) this.totalAnnualizedRate, (Object) strategyDetailsResponse.totalAnnualizedRate) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) strategyDetailsResponse.annualizedRate) && Intrinsics.EZpvd((Object) this.curQuoteSz, (Object) strategyDetailsResponse.curQuoteSz) && Intrinsics.EZpvd((Object) this.curBaseSz, (Object) strategyDetailsResponse.curBaseSz) && Intrinsics.EZpvd((Object) this.cancelType, (Object) strategyDetailsResponse.cancelType) && Intrinsics.EZpvd((Object) this.investment, (Object) strategyDetailsResponse.investment) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyDetailsResponse.lever) && Intrinsics.EZpvd((Object) this.pTime, (Object) strategyDetailsResponse.pTime) && Intrinsics.EZpvd((Object) this.arbitrageNum, (Object) strategyDetailsResponse.arbitrageNum) && Intrinsics.EZpvd((Object) this.avgDailyArbitrageNum, (Object) strategyDetailsResponse.avgDailyArbitrageNum) && Intrinsics.EZpvd((Object) this.singleAmt, (Object) strategyDetailsResponse.singleAmt) && Intrinsics.EZpvd((Object) this.stopResult, (Object) strategyDetailsResponse.stopResult) && Intrinsics.EZpvd((Object) this.runPx, (Object) strategyDetailsResponse.runPx) && Intrinsics.EZpvd((Object) this.stgyName, (Object) strategyDetailsResponse.stgyName) && Intrinsics.EZpvd((Object) this.mktCap, (Object) strategyDetailsResponse.mktCap) && Intrinsics.EZpvd((Object) this.investAmt, (Object) strategyDetailsResponse.investAmt) && Intrinsics.EZpvd((Object) this.uTime, (Object) strategyDetailsResponse.uTime) && Intrinsics.EZpvd((Object) this.cycles, (Object) strategyDetailsResponse.cycles) && Intrinsics.EZpvd((Object) this.amt, (Object) strategyDetailsResponse.amt) && Intrinsics.EZpvd(this.recurringList, strategyDetailsResponse.recurringList) && Intrinsics.EZpvd((Object) this.period, (Object) strategyDetailsResponse.period) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) strategyDetailsResponse.recurringDay) && Intrinsics.EZpvd((Object) this.recurringHour, (Object) strategyDetailsResponse.recurringHour) && Intrinsics.EZpvd((Object) this.nextInvestTime, (Object) strategyDetailsResponse.nextInvestTime) && Intrinsics.EZpvd((Object) this.investCcy, (Object) strategyDetailsResponse.investCcy) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) strategyDetailsResponse.recurringTime) && Intrinsics.EZpvd((Object) this.direction, (Object) strategyDetailsResponse.direction) && Intrinsics.EZpvd((Object) this.actualLever, (Object) strategyDetailsResponse.actualLever) && Intrinsics.EZpvd((Object) this.eq, (Object) strategyDetailsResponse.eq) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) strategyDetailsResponse.algoOrdType) && Intrinsics.EZpvd((Object) this.duration, (Object) strategyDetailsResponse.duration) && Intrinsics.EZpvd((Object) this.investType, (Object) strategyDetailsResponse.investType) && this.basePos == strategyDetailsResponse.basePos && Intrinsics.EZpvd((Object) this.balType, (Object) strategyDetailsResponse.balType) && Intrinsics.EZpvd((Object) this.interval, (Object) strategyDetailsResponse.interval) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) strategyDetailsResponse.deltaRatio) && Intrinsics.EZpvd((Object) this.balNum, (Object) strategyDetailsResponse.balNum) && Intrinsics.EZpvd(this.portfolioList, strategyDetailsResponse.portfolioList) && Intrinsics.EZpvd((Object) this.apy, (Object) strategyDetailsResponse.apy) && Intrinsics.EZpvd((Object) this.maturedApy, (Object) strategyDetailsResponse.maturedApy) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyDetailsResponse.avgPx) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) strategyDetailsResponse.investmentAmt) && Intrinsics.EZpvd((Object) this.investmentCcy, (Object) strategyDetailsResponse.investmentCcy) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) strategyDetailsResponse.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) strategyDetailsResponse.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.fillManualAddOrds, (Object) strategyDetailsResponse.fillManualAddOrds) && Intrinsics.EZpvd((Object) this.tpPx, (Object) strategyDetailsResponse.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) strategyDetailsResponse.slPx) && Intrinsics.EZpvd((Object) this.tpPriceRange, (Object) strategyDetailsResponse.tpPriceRange) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) strategyDetailsResponse.completedCycles) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) strategyDetailsResponse.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) strategyDetailsResponse.safetyOrdAmt) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) strategyDetailsResponse.pxSteps) && Intrinsics.EZpvd((Object) this.tpPct, (Object) strategyDetailsResponse.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) strategyDetailsResponse.slPct) && Intrinsics.EZpvd((Object) this.slMode, (Object) strategyDetailsResponse.slMode) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) strategyDetailsResponse.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) strategyDetailsResponse.volMult) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) strategyDetailsResponse.sourceAlgoId) && Intrinsics.EZpvd((Object) this.stopType, (Object) strategyDetailsResponse.stopType) && Intrinsics.EZpvd((Object) this.profit, (Object) strategyDetailsResponse.profit) && Intrinsics.EZpvd(this.signParams, strategyDetailsResponse.signParams) && Intrinsics.EZpvd(this.rebateTrans, strategyDetailsResponse.rebateTrans) && this.reserveFunds == strategyDetailsResponse.reserveFunds && Intrinsics.EZpvd((Object) this.totalCycleProfit, (Object) strategyDetailsResponse.totalCycleProfit) && Intrinsics.EZpvd((Object) this.arbitragePnl, (Object) strategyDetailsResponse.arbitragePnl) && Intrinsics.EZpvd((Object) this.additionalFundNeeded, (Object) strategyDetailsResponse.additionalFundNeeded) && Intrinsics.EZpvd((Object) this.maxBotUsage, (Object) strategyDetailsResponse.maxBotUsage) && Intrinsics.EZpvd((Object) this.cycleBaseAmt, (Object) strategyDetailsResponse.cycleBaseAmt) && Intrinsics.EZpvd(this.triggerParams, strategyDetailsResponse.triggerParams) && Intrinsics.EZpvd((Object) this.reserveFundingFee, (Object) strategyDetailsResponse.reserveFundingFee) && Intrinsics.EZpvd((Object) this.transferInMargin, (Object) strategyDetailsResponse.transferInMargin) && Intrinsics.EZpvd((Object) this.ordFrozen, (Object) strategyDetailsResponse.ordFrozen) && Intrinsics.EZpvd((Object) this.availEq, (Object) strategyDetailsResponse.availEq) && Intrinsics.EZpvd((Object) this.initPx, (Object) strategyDetailsResponse.initPx) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) strategyDetailsResponse.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.activeOrderCount, (Object) strategyDetailsResponse.activeOrderCount) && Intrinsics.EZpvd(this.trailingUpConfig, strategyDetailsResponse.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, strategyDetailsResponse.trailingDownConfig) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) strategyDetailsResponse.trailingDownFund) && Intrinsics.EZpvd((Object) this.gridStatus, (Object) strategyDetailsResponse.gridStatus) && Intrinsics.EZpvd((Object) this.lmtOrderNumber, (Object) strategyDetailsResponse.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.aggressiveness, (Object) strategyDetailsResponse.aggressiveness) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) strategyDetailsResponse.profitSharingRatio) && Intrinsics.EZpvd((Object) this.copyType, (Object) strategyDetailsResponse.copyType) && Intrinsics.EZpvd(this.instIds, strategyDetailsResponse.instIds) && Intrinsics.EZpvd((Object) this.totalEquity, (Object) strategyDetailsResponse.totalEquity) && Intrinsics.EZpvd((Object) this.floatingPnl, (Object) strategyDetailsResponse.floatingPnl) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) strategyDetailsResponse.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) strategyDetailsResponse.extraMarginSz) && Intrinsics.EZpvd((Object) this.usedMargin, (Object) strategyDetailsResponse.usedMargin) && Intrinsics.EZpvd((Object) this.availableMargin, (Object) strategyDetailsResponse.availableMargin) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) strategyDetailsResponse.totalAmt) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) strategyDetailsResponse.totalPnlRatio) && Intrinsics.EZpvd((Object) this.realizedPnl, (Object) strategyDetailsResponse.realizedPnl) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) strategyDetailsResponse.signalChanName) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) strategyDetailsResponse.signalChanId) && Intrinsics.EZpvd((Object) this.signalCount, (Object) strategyDetailsResponse.signalCount) && Intrinsics.EZpvd(this.allowMultipleEntry, strategyDetailsResponse.allowMultipleEntry) && Intrinsics.EZpvd((Object) this.subOrdType, (Object) strategyDetailsResponse.subOrdType) && Intrinsics.EZpvd((Object) this.ratio, (Object) strategyDetailsResponse.ratio) && Intrinsics.EZpvd(this.signalOrderAmtParam, strategyDetailsResponse.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, strategyDetailsResponse.signalBotOrderStopParam) && Intrinsics.EZpvd((Object) this.signalSourceType, (Object) strategyDetailsResponse.signalSourceType) && Intrinsics.EZpvd((Object) this.symbolsNumber, (Object) strategyDetailsResponse.symbolsNumber) && this.isHistory == strategyDetailsResponse.isHistory && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) strategyDetailsResponse.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) strategyDetailsResponse.sourceCcySz) && Intrinsics.EZpvd((Object) this.trackingMode, (Object) strategyDetailsResponse.trackingMode) && Intrinsics.EZpvd((Object) this.netMarginTransfer, (Object) strategyDetailsResponse.netMarginTransfer) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) strategyDetailsResponse.feeCcy) && Intrinsics.EZpvd((Object) this.fundingFee, (Object) strategyDetailsResponse.fundingFee) && Intrinsics.EZpvd((Object) this.reduce_only, (Object) strategyDetailsResponse.reduce_only) && this.outOfRange == strategyDetailsResponse.outOfRange && this.autoMarginReloadSwitch == strategyDetailsResponse.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) strategyDetailsResponse.autoMarginReloadMaxAmount) && Intrinsics.EZpvd(this.extendedBusinessInfo, strategyDetailsResponse.extendedBusinessInfo) && Intrinsics.EZpvd((Object) this.arbPnl, (Object) strategyDetailsResponse.arbPnl) && Intrinsics.EZpvd((Object) this.spreadPnl, (Object) strategyDetailsResponse.spreadPnl) && Intrinsics.EZpvd(this.arbList, strategyDetailsResponse.arbList) && Intrinsics.EZpvd((Object) this.preFundingFee, (Object) strategyDetailsResponse.preFundingFee) && Intrinsics.EZpvd((Object) this.preAnnualized, (Object) strategyDetailsResponse.preAnnualized) && Intrinsics.EZpvd((Object) this.instFamily, (Object) strategyDetailsResponse.instFamily) && Intrinsics.EZpvd((Object) this.fundingFeeTime, (Object) strategyDetailsResponse.fundingFeeTime) && Intrinsics.EZpvd((Object) this.fundingFeeRatio, (Object) strategyDetailsResponse.fundingFeeRatio) && Intrinsics.EZpvd((Object) this.pnlRatioInSourceCcy, (Object) strategyDetailsResponse.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.totalPnlInSourceCcy, (Object) strategyDetailsResponse.totalPnlInSourceCcy) && Intrinsics.EZpvd((Object) this.floatProfitInSourceCcy, (Object) strategyDetailsResponse.floatProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.gridProfitInSourceCcy, (Object) strategyDetailsResponse.gridProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.arbitrageApy, (Object) strategyDetailsResponse.arbitrageApy) && Intrinsics.EZpvd((Object) this.floatProfitRate, (Object) strategyDetailsResponse.floatProfitRate) && Intrinsics.EZpvd((Object) this.profitInSourceCcy, (Object) strategyDetailsResponse.profitInSourceCcy) && Intrinsics.EZpvd((Object) this.ruleType, (Object) strategyDetailsResponse.ruleType) && Intrinsics.EZpvd(this.isTradeBorrowMode, strategyDetailsResponse.isTradeBorrowMode) && Intrinsics.EZpvd(this.strategyTags, strategyDetailsResponse.strategyTags) && Intrinsics.EZpvd(this.voucherInfo, strategyDetailsResponse.voucherInfo) && Intrinsics.EZpvd((Object) this.stakingPnl, (Object) strategyDetailsResponse.stakingPnl) && Intrinsics.EZpvd((Object) this.stakingPnlUSDT, (Object) strategyDetailsResponse.stakingPnlUSDT) && Intrinsics.EZpvd((Object) this.stakingPosCcy, (Object) strategyDetailsResponse.stakingPosCcy) && Intrinsics.EZpvd((Object) this.stakingPnlApy, (Object) strategyDetailsResponse.stakingPnlApy) && Intrinsics.EZpvd(this.subArbTypes, strategyDetailsResponse.subArbTypes) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) strategyDetailsResponse.totalInterestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) strategyDetailsResponse.debtCcy) && Intrinsics.EZpvd(this.accountId, strategyDetailsResponse.accountId) && Intrinsics.EZpvd(this.forbidden, strategyDetailsResponse.forbidden) && Intrinsics.EZpvd(this.hiddenFeatures, strategyDetailsResponse.hiddenFeatures) && Intrinsics.EZpvd((Object) this.dcdState, (Object) strategyDetailsResponse.dcdState) && Intrinsics.EZpvd((Object) this.coinPnl, (Object) strategyDetailsResponse.coinPnl) && Intrinsics.EZpvd((Object) this.notional, (Object) strategyDetailsResponse.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) strategyDetailsResponse.notionalCcy) && Intrinsics.EZpvd((Object) this.settlementAmount, (Object) strategyDetailsResponse.settlementAmount) && Intrinsics.EZpvd((Object) this.settlementCcy, (Object) strategyDetailsResponse.settlementCcy) && Intrinsics.EZpvd((Object) this.currencyBal, (Object) strategyDetailsResponse.currencyBal) && Intrinsics.EZpvd((Object) this.currency, (Object) strategyDetailsResponse.currency) && Intrinsics.EZpvd((Object) this.avgCost, (Object) strategyDetailsResponse.avgCost) && Intrinsics.EZpvd((Object) this.cycle, (Object) strategyDetailsResponse.cycle) && Intrinsics.EZpvd((Object) this.term, (Object) strategyDetailsResponse.term) && Intrinsics.EZpvd((Object) this.alternateCurrency, (Object) strategyDetailsResponse.alternateCurrency) && Intrinsics.EZpvd((Object) this.strike, (Object) strategyDetailsResponse.strike) && Intrinsics.EZpvd((Object) this.strikePercentage, (Object) strategyDetailsResponse.strikePercentage) && Intrinsics.EZpvd((Object) this.stopPrice, (Object) strategyDetailsResponse.stopPrice) && Intrinsics.EZpvd((Object) this.stopPercentage, (Object) strategyDetailsResponse.stopPercentage) && Intrinsics.EZpvd((Object) this.curStrike, (Object) strategyDetailsResponse.curStrike) && Intrinsics.EZpvd((Object) this.dcdOptionType, (Object) strategyDetailsResponse.dcdOptionType) && Intrinsics.EZpvd((Object) this.curSettlementTime, (Object) strategyDetailsResponse.curSettlementTime) && Intrinsics.EZpvd((Object) this.minAnnualYieldPercentage, (Object) strategyDetailsResponse.minAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.maxSettlementDay, (Object) strategyDetailsResponse.maxSettlementDay) && Intrinsics.EZpvd((Object) this.reinvestment, (Object) strategyDetailsResponse.reinvestment) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) strategyDetailsResponse.lastPrice) && Intrinsics.EZpvd((Object) this.lastTradeExpireTime, (Object) strategyDetailsResponse.lastTradeExpireTime) && Intrinsics.EZpvd((Object) this.lastSettlementSettledTime, (Object) strategyDetailsResponse.lastSettlementSettledTime) && Intrinsics.EZpvd((Object) this.absYieldPercentage, (Object) strategyDetailsResponse.absYieldPercentage) && Intrinsics.EZpvd((Object) this.estimatedSettleTime, (Object) strategyDetailsResponse.estimatedSettleTime) && Intrinsics.EZpvd(this.simpleEarn, strategyDetailsResponse.simpleEarn) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, strategyDetailsResponse.arbitrageTotalPnlInfo) && Intrinsics.EZpvd(this.leveragePrincipal, strategyDetailsResponse.leveragePrincipal) && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) strategyDetailsResponse.highestApyPeriod) && this.displayMinPaybackDays == strategyDetailsResponse.displayMinPaybackDays && Intrinsics.EZpvd(this.fundingFeeApyList, strategyDetailsResponse.fundingFeeApyList) && Intrinsics.EZpvd((Object) this.displayId, (Object) strategyDetailsResponse.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyDetailsResponse.tradeQuoteCcy) && Intrinsics.EZpvd(this.profitAutoReinvest, strategyDetailsResponse.profitAutoReinvest) && Intrinsics.EZpvd(this.profitSnapshots, strategyDetailsResponse.profitSnapshots) && Intrinsics.EZpvd(this.latestProfit, strategyDetailsResponse.latestProfit) && Intrinsics.EZpvd((Object) this.totalSpreadProfit, (Object) strategyDetailsResponse.totalSpreadProfit) && Intrinsics.EZpvd((Object) this.totalApy, (Object) strategyDetailsResponse.totalApy) && Intrinsics.EZpvd((Object) this.fee, (Object) strategyDetailsResponse.fee) && Intrinsics.EZpvd(this.arbitrageProfit, strategyDetailsResponse.arbitrageProfit) && Intrinsics.EZpvd(this.stakingProfit, strategyDetailsResponse.stakingProfit) && Intrinsics.EZpvd(this.balanceDetails, strategyDetailsResponse.balanceDetails) && Intrinsics.EZpvd((Object) this.liqPx, (Object) strategyDetailsResponse.liqPx) && Intrinsics.EZpvd(this.bot, strategyDetailsResponse.bot) && Intrinsics.EZpvd(this.effectiveEditParametersDetails, strategyDetailsResponse.effectiveEditParametersDetails) && Intrinsics.EZpvd((Object) this.safetyOrdRatio, (Object) strategyDetailsResponse.safetyOrdRatio) && Intrinsics.EZpvd((Object) this.cycleStartTime, (Object) strategyDetailsResponse.cycleStartTime) && Intrinsics.EZpvd((Object) this.noClosePositionId, (Object) strategyDetailsResponse.noClosePositionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbsYieldPercentage() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveOrderCount() {
        return this.activeOrderCount;
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
    public final String getAdditionalFundNeeded() {
        return this.additionalFundNeeded;
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
    public final Boolean getAllowMultipleEntry() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternateCurrency() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
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
    public final String getArbitrageApy() {
        return this.arbitrageApy;
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
    public final ArbitrageTotalPnlInfo getArbitrageTotalPnlInfo() {
        return this.arbitrageTotalPnlInfo;
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
    public final String getCTime() {
        return this.cTime;
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
    public final String getCoinPnl() {
        return this.coinPnl;
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
    public final String getCtVal() {
        return this.ctVal;
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
    public final String getCycleBaseAmt() {
        return this.cycleBaseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleStartTime() {
        return this.cycleStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycles() {
        return this.cycles;
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
    public final String getDeltaRatio() {
        return this.deltaRatio;
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
    public final StrategyDcaEditResp getEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedSettleTime() {
        return this.estimatedSettleTime;
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
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillManualAddOrds() {
        return this.fillManualAddOrds;
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
    public final String getFundingFee() {
        return this.fundingFee;
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
    public final String getGridStatus() {
        return this.gridStatus;
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
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitPx() {
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
    public final List<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
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
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeveragePrincipal() {
        return this.leveragePrincipal;
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
    public final String getMaturedApy() {
        return this.maturedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBotUsage() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
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
    public final String getMinPx() {
        return this.minPx;
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
    public final String getNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdFrozen() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
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
    public final ArrayList<SmartPortfolioListItem> getPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreAnnualized() {
        return this.preAnnualized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreFundingFee() {
        return this.preFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse getProfitAutoReinvest() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitInSourceCcy() {
        return this.profitInSourceCcy;
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
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RebateTransItem> getRebateTrans() {
        return this.rebateTrans;
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
    public final String getReduce_only() {
        return this.reduce_only;
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
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunPx() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunTime() {
        return this.runTime;
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
    public final String getSafetyOrdRatio() {
        return this.safetyOrdRatio;
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
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignParamItem> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
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
    public final String getSignalSourceType() {
        return this.signalSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam getSimpleEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleAmt() {
        return this.singleAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
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
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
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
    public final ProfitDetailResponse getStakingProfit() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
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
    public final String getStopResult() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
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
    public final String getStrikePercentage() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> getSubArbTypes() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubOrdType() {
        return this.subOrdType;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
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
    public final String getTotalCycleProfitRate() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEquity() {
        return this.totalEquity;
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
    public final String getTpPct() {
        return this.tpPct;
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
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParamResp() {
        return this.tpslTriggerParamResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingMode() {
        return this.trackingMode;
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
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrailingDownFund() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferInMargin() {
        return this.transferInMargin;
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
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsedMargin() {
        return this.usedMargin;
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
        int iHashCode3 = this.uly.hashCode();
        int iHashCode4 = this.ccy.hashCode();
        int iHashCode5 = this.ctVal.hashCode();
        int iHashCode6 = this.ordId.hashCode();
        int iHashCode7 = this.algoId.hashCode();
        int iHashCode8 = this.cTime.hashCode();
        int iHashCode9 = this.ordType.hashCode();
        int iHashCode10 = this.tdMode.hashCode();
        int iHashCode11 = this.triggerTime.hashCode();
        int iHashCode12 = this.state.hashCode();
        int iHashCode13 = this.pxVar.hashCode();
        int iHashCode14 = this.pxSpread.hashCode();
        int iHashCode15 = this.szLimit.hashCode();
        int iHashCode16 = this.pxLimit.hashCode();
        int iHashCode17 = this.actualSz.hashCode();
        int iHashCode18 = this.sz.hashCode();
        int iHashCode19 = this.side.hashCode();
        int iHashCode20 = this.posSide.hashCode();
        int iHashCode21 = this.timeInterval.hashCode();
        int iHashCode22 = this.maxPx.hashCode();
        int iHashCode23 = this.minPx.hashCode();
        int iHashCode24 = this.gridNum.hashCode();
        int iHashCode25 = this.runType.hashCode();
        int iHashCode26 = this.quoteSz.hashCode();
        int iHashCode27 = this.baseSz.hashCode();
        int iHashCode28 = this.tpslTriggerParamResp.hashCode();
        int iHashCode29 = this.tpTriggerPx.hashCode();
        int iHashCode30 = this.slTriggerPx.hashCode();
        int iHashCode31 = this.tpRatio.hashCode();
        int iHashCode32 = this.slRatio.hashCode();
        int iHashCode33 = this.tradeNum.hashCode();
        int iHashCode34 = this.totalPnl.hashCode();
        int iHashCode35 = this.pnlRatio.hashCode();
        int iHashCode36 = this.arbApy.hashCode();
        int iHashCode37 = this.profitNum.hashCode();
        int iHashCode38 = this.runTime.hashCode();
        int iHashCode39 = this.perMinProfitRate.hashCode();
        int iHashCode40 = this.perMaxProfitRate.hashCode();
        int iHashCode41 = this.gridProfit.hashCode();
        int iHashCode42 = this.gridProfitRate.hashCode();
        int iHashCode43 = this.totalCycleProfitRate.hashCode();
        String str = this.arbitrageProfitRate;
        int iHashCode44 = str == null ? 0 : str.hashCode();
        int iHashCode45 = this.floatProfit.hashCode();
        int iHashCode46 = this.totalAnnualizedRate.hashCode();
        int iHashCode47 = this.annualizedRate.hashCode();
        int iHashCode48 = this.curQuoteSz.hashCode();
        int iHashCode49 = this.curBaseSz.hashCode();
        int iHashCode50 = this.cancelType.hashCode();
        int iHashCode51 = this.investment.hashCode();
        int iHashCode52 = this.lever.hashCode();
        int iHashCode53 = this.pTime.hashCode();
        int iHashCode54 = this.arbitrageNum.hashCode();
        int iHashCode55 = this.avgDailyArbitrageNum.hashCode();
        int iHashCode56 = this.singleAmt.hashCode();
        int iHashCode57 = this.stopResult.hashCode();
        int iHashCode58 = this.runPx.hashCode();
        int iHashCode59 = this.stgyName.hashCode();
        int iHashCode60 = this.mktCap.hashCode();
        int iHashCode61 = this.investAmt.hashCode();
        int iHashCode62 = this.uTime.hashCode();
        int iHashCode63 = this.cycles.hashCode();
        int iHashCode64 = this.amt.hashCode();
        int iHashCode65 = this.recurringList.hashCode();
        int iHashCode66 = this.period.hashCode();
        int iHashCode67 = this.recurringDay.hashCode();
        int iHashCode68 = this.recurringHour.hashCode();
        String str2 = this.nextInvestTime;
        int iHashCode69 = str2 == null ? 0 : str2.hashCode();
        int iHashCode70 = this.investCcy.hashCode();
        int iHashCode71 = this.recurringTime.hashCode();
        int iHashCode72 = this.direction.hashCode();
        int iHashCode73 = this.actualLever.hashCode();
        int iHashCode74 = this.eq.hashCode();
        int iHashCode75 = this.algoOrdType.hashCode();
        int iHashCode76 = this.duration.hashCode();
        int iHashCode77 = this.investType.hashCode();
        int iHashCode78 = Boolean.hashCode(this.basePos);
        int iHashCode79 = this.balType.hashCode();
        int iHashCode80 = this.interval.hashCode();
        int iHashCode81 = this.deltaRatio.hashCode();
        int iHashCode82 = this.balNum.hashCode();
        int iHashCode83 = this.portfolioList.hashCode();
        int iHashCode84 = this.apy.hashCode();
        String str3 = this.maturedApy;
        int iHashCode85 = str3 == null ? 0 : str3.hashCode();
        int iHashCode86 = this.avgPx.hashCode();
        int iHashCode87 = this.investmentAmt.hashCode();
        int iHashCode88 = this.investmentCcy.hashCode();
        int iHashCode89 = this.maxSafetyOrds.hashCode();
        int iHashCode90 = this.fillSafetyOrds.hashCode();
        int iHashCode91 = this.fillManualAddOrds.hashCode();
        int iHashCode92 = this.tpPx.hashCode();
        int iHashCode93 = this.slPx.hashCode();
        String str4 = this.tpPriceRange;
        int iHashCode94 = str4 == null ? 0 : str4.hashCode();
        int iHashCode95 = this.completedCycles.hashCode();
        int iHashCode96 = this.initOrdAmt.hashCode();
        int iHashCode97 = this.safetyOrdAmt.hashCode();
        int iHashCode98 = this.pxSteps.hashCode();
        int iHashCode99 = this.tpPct.hashCode();
        int iHashCode100 = this.slPct.hashCode();
        int iHashCode101 = this.slMode.hashCode();
        int iHashCode102 = this.pxStepsMult.hashCode();
        int iHashCode103 = this.volMult.hashCode();
        String str5 = this.sourceAlgoId;
        int iHashCode104 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.stopType;
        int iHashCode105 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.profit;
        int iHashCode106 = str7 == null ? 0 : str7.hashCode();
        ArrayList<SignParamItem> arrayList = this.signParams;
        int iHashCode107 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<RebateTransItem> arrayList2 = this.rebateTrans;
        int iHashCode108 = arrayList2 == null ? 0 : arrayList2.hashCode();
        int iHashCode109 = Boolean.hashCode(this.reserveFunds);
        int iHashCode110 = this.totalCycleProfit.hashCode();
        int iHashCode111 = this.arbitragePnl.hashCode();
        int iHashCode112 = this.additionalFundNeeded.hashCode();
        int iHashCode113 = this.maxBotUsage.hashCode();
        String str8 = this.cycleBaseAmt;
        int iHashCode114 = str8 == null ? 0 : str8.hashCode();
        List<DcaTriggerParam> list = this.triggerParams;
        int iHashCode115 = list == null ? 0 : list.hashCode();
        String str9 = this.reserveFundingFee;
        int iHashCode116 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.transferInMargin;
        int iHashCode117 = str10 == null ? 0 : str10.hashCode();
        int iHashCode118 = this.ordFrozen.hashCode();
        int iHashCode119 = this.availEq.hashCode();
        int iHashCode120 = this.initPx.hashCode();
        int iHashCode121 = this.perGridProfitRatio.hashCode();
        String str11 = this.activeOrderCount;
        int iHashCode122 = str11 == null ? 0 : str11.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode123 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode124 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str12 = this.trailingDownFund;
        int iHashCode125 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gridStatus;
        int iHashCode126 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.lmtOrderNumber;
        int iHashCode127 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.aggressiveness;
        int iHashCode128 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.profitSharingRatio;
        int iHashCode129 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.copyType;
        int iHashCode130 = str17 == null ? 0 : str17.hashCode();
        List<String> list2 = this.instIds;
        int iHashCode131 = list2 == null ? 0 : list2.hashCode();
        String str18 = this.totalEquity;
        int iHashCode132 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.floatingPnl;
        int iHashCode133 = str19 == null ? 0 : str19.hashCode();
        int iHashCode134 = this.actualMarginSz.hashCode();
        int iHashCode135 = this.extraMarginSz.hashCode();
        String str20 = this.usedMargin;
        int iHashCode136 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.availableMargin;
        int iHashCode137 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.totalAmt;
        int iHashCode138 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.totalPnlRatio;
        int iHashCode139 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.realizedPnl;
        int iHashCode140 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.signalChanName;
        int iHashCode141 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.signalChanId;
        int iHashCode142 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.signalCount;
        int iHashCode143 = str27 == null ? 0 : str27.hashCode();
        Boolean bool = this.allowMultipleEntry;
        int iHashCode144 = bool == null ? 0 : bool.hashCode();
        String str28 = this.subOrdType;
        int iHashCode145 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.ratio;
        int iHashCode146 = str29 == null ? 0 : str29.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode147 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        int iHashCode148 = exitSignalOrderAmtParam == null ? 0 : exitSignalOrderAmtParam.hashCode();
        String str30 = this.signalSourceType;
        int iHashCode149 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.symbolsNumber;
        int iHashCode150 = str31 == null ? 0 : str31.hashCode();
        int iHashCode151 = Boolean.hashCode(this.isHistory);
        String str32 = this.sourceCcy;
        int iHashCode152 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.sourceCcySz;
        int iHashCode153 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.trackingMode;
        int iHashCode154 = str34 == null ? 0 : str34.hashCode();
        int iHashCode155 = this.netMarginTransfer.hashCode();
        int iHashCode156 = this.feeCcy.hashCode();
        int iHashCode157 = this.fundingFee.hashCode();
        int iHashCode158 = this.reduce_only.hashCode();
        int iHashCode159 = Boolean.hashCode(this.outOfRange);
        int iHashCode160 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str35 = this.autoMarginReloadMaxAmount;
        int iHashCode161 = str35 == null ? 0 : str35.hashCode();
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        int iHashCode162 = extendedBusinessInfo == null ? 0 : extendedBusinessInfo.hashCode();
        String str36 = this.arbPnl;
        int iHashCode163 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.spreadPnl;
        int iHashCode164 = str37 == null ? 0 : str37.hashCode();
        ArrayList<SmartArbListItem> arrayList3 = this.arbList;
        int iHashCode165 = arrayList3 == null ? 0 : arrayList3.hashCode();
        String str38 = this.preFundingFee;
        int iHashCode166 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.preAnnualized;
        int iHashCode167 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.instFamily;
        int iHashCode168 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.fundingFeeTime;
        int iHashCode169 = str41 == null ? 0 : str41.hashCode();
        String str42 = this.fundingFeeRatio;
        int iHashCode170 = str42 == null ? 0 : str42.hashCode();
        int iHashCode171 = this.pnlRatioInSourceCcy.hashCode();
        int iHashCode172 = this.totalPnlInSourceCcy.hashCode();
        int iHashCode173 = this.floatProfitInSourceCcy.hashCode();
        int iHashCode174 = this.gridProfitInSourceCcy.hashCode();
        int iHashCode175 = this.arbitrageApy.hashCode();
        int iHashCode176 = this.floatProfitRate.hashCode();
        String str43 = this.profitInSourceCcy;
        int iHashCode177 = str43 == null ? 0 : str43.hashCode();
        String str44 = this.ruleType;
        int iHashCode178 = str44 == null ? 0 : str44.hashCode();
        Boolean bool2 = this.isTradeBorrowMode;
        int iHashCode179 = bool2 == null ? 0 : bool2.hashCode();
        List<Integer> list3 = this.strategyTags;
        int iHashCode180 = list3 == null ? 0 : list3.hashCode();
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        int iHashCode181 = tacticsVoucherInfo == null ? 0 : tacticsVoucherInfo.hashCode();
        String str45 = this.stakingPnl;
        int iHashCode182 = str45 == null ? 0 : str45.hashCode();
        String str46 = this.stakingPnlUSDT;
        int iHashCode183 = str46 == null ? 0 : str46.hashCode();
        int iHashCode184 = this.stakingPosCcy.hashCode();
        int iHashCode185 = this.stakingPnlApy.hashCode();
        List<? extends SubArbitrageType4Remote> list4 = this.subArbTypes;
        int iHashCode186 = list4 == null ? 0 : list4.hashCode();
        String str47 = this.totalInterestAmt;
        int iHashCode187 = str47 == null ? 0 : str47.hashCode();
        int iHashCode188 = this.debtCcy.hashCode();
        Long l = this.accountId;
        int iHashCode189 = l == null ? 0 : l.hashCode();
        ArrayList<String> arrayList4 = this.forbidden;
        int iHashCode190 = arrayList4 == null ? 0 : arrayList4.hashCode();
        ArrayList<String> arrayList5 = this.hiddenFeatures;
        int iHashCode191 = arrayList5 == null ? 0 : arrayList5.hashCode();
        String str48 = this.dcdState;
        int iHashCode192 = str48 == null ? 0 : str48.hashCode();
        String str49 = this.coinPnl;
        int iHashCode193 = str49 == null ? 0 : str49.hashCode();
        String str50 = this.notional;
        int iHashCode194 = str50 == null ? 0 : str50.hashCode();
        String str51 = this.notionalCcy;
        int iHashCode195 = str51 == null ? 0 : str51.hashCode();
        String str52 = this.settlementAmount;
        int iHashCode196 = str52 == null ? 0 : str52.hashCode();
        String str53 = this.settlementCcy;
        int iHashCode197 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.currencyBal;
        int iHashCode198 = str54 == null ? 0 : str54.hashCode();
        String str55 = this.currency;
        int iHashCode199 = str55 == null ? 0 : str55.hashCode();
        String str56 = this.avgCost;
        int iHashCode200 = str56 == null ? 0 : str56.hashCode();
        String str57 = this.cycle;
        int iHashCode201 = str57 == null ? 0 : str57.hashCode();
        String str58 = this.term;
        int iHashCode202 = str58 == null ? 0 : str58.hashCode();
        String str59 = this.alternateCurrency;
        int iHashCode203 = str59 == null ? 0 : str59.hashCode();
        String str60 = this.strike;
        int iHashCode204 = str60 == null ? 0 : str60.hashCode();
        String str61 = this.strikePercentage;
        int iHashCode205 = str61 == null ? 0 : str61.hashCode();
        String str62 = this.stopPrice;
        int iHashCode206 = str62 == null ? 0 : str62.hashCode();
        String str63 = this.stopPercentage;
        int iHashCode207 = str63 == null ? 0 : str63.hashCode();
        String str64 = this.curStrike;
        int iHashCode208 = str64 == null ? 0 : str64.hashCode();
        String str65 = this.dcdOptionType;
        int iHashCode209 = str65 == null ? 0 : str65.hashCode();
        String str66 = this.curSettlementTime;
        int iHashCode210 = str66 == null ? 0 : str66.hashCode();
        String str67 = this.minAnnualYieldPercentage;
        int iHashCode211 = str67 == null ? 0 : str67.hashCode();
        String str68 = this.maxSettlementDay;
        int iHashCode212 = str68 == null ? 0 : str68.hashCode();
        String str69 = this.reinvestment;
        int iHashCode213 = str69 == null ? 0 : str69.hashCode();
        String str70 = this.lastPrice;
        int iHashCode214 = str70 == null ? 0 : str70.hashCode();
        int iHashCode215 = this.lastTradeExpireTime.hashCode();
        int iHashCode216 = this.lastSettlementSettledTime.hashCode();
        int iHashCode217 = this.absYieldPercentage.hashCode();
        int iHashCode218 = this.estimatedSettleTime.hashCode();
        SmartEarnParam smartEarnParam = this.simpleEarn;
        int iHashCode219 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode220 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode221 = f == null ? 0 : f.hashCode();
        String str71 = this.highestApyPeriod;
        int iHashCode222 = str71 == null ? 0 : str71.hashCode();
        int iHashCode223 = Boolean.hashCode(this.displayMinPaybackDays);
        List<FundingFeeApyItem> list5 = this.fundingFeeApyList;
        int iHashCode224 = list5 == null ? 0 : list5.hashCode();
        int iHashCode225 = this.displayId.hashCode();
        String str72 = this.tradeQuoteCcy;
        int iHashCode226 = str72 == null ? 0 : str72.hashCode();
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        int iHashCode227 = gridProfitAutoReinvestResponse == null ? 0 : gridProfitAutoReinvestResponse.hashCode();
        List<StrategyProfitResponse> list6 = this.profitSnapshots;
        int iHashCode228 = list6 == null ? 0 : list6.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        int iHashCode229 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        String str73 = this.totalSpreadProfit;
        int iHashCode230 = str73 == null ? 0 : str73.hashCode();
        String str74 = this.totalApy;
        int iHashCode231 = str74 == null ? 0 : str74.hashCode();
        String str75 = this.fee;
        int iHashCode232 = str75 == null ? 0 : str75.hashCode();
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        int iHashCode233 = profitDetailResponse == null ? 0 : profitDetailResponse.hashCode();
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        int iHashCode234 = profitDetailResponse2 == null ? 0 : profitDetailResponse2.hashCode();
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        int iHashCode235 = balanceDetailInfoDto == null ? 0 : balanceDetailInfoDto.hashCode();
        int iHashCode236 = this.liqPx.hashCode();
        BotVo botVo = this.bot;
        int iHashCode237 = botVo == null ? 0 : botVo.hashCode();
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        int iHashCode238 = strategyDcaEditResp == null ? 0 : strategyDcaEditResp.hashCode();
        String str76 = this.safetyOrdRatio;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + iHashCode100) * 31) + iHashCode101) * 31) + iHashCode102) * 31) + iHashCode103) * 31) + iHashCode104) * 31) + iHashCode105) * 31) + iHashCode106) * 31) + iHashCode107) * 31) + iHashCode108) * 31) + iHashCode109) * 31) + iHashCode110) * 31) + iHashCode111) * 31) + iHashCode112) * 31) + iHashCode113) * 31) + iHashCode114) * 31) + iHashCode115) * 31) + iHashCode116) * 31) + iHashCode117) * 31) + iHashCode118) * 31) + iHashCode119) * 31) + iHashCode120) * 31) + iHashCode121) * 31) + iHashCode122) * 31) + iHashCode123) * 31) + iHashCode124) * 31) + iHashCode125) * 31) + iHashCode126) * 31) + iHashCode127) * 31) + iHashCode128) * 31) + iHashCode129) * 31) + iHashCode130) * 31) + iHashCode131) * 31) + iHashCode132) * 31) + iHashCode133) * 31) + iHashCode134) * 31) + iHashCode135) * 31) + iHashCode136) * 31) + iHashCode137) * 31) + iHashCode138) * 31) + iHashCode139) * 31) + iHashCode140) * 31) + iHashCode141) * 31) + iHashCode142) * 31) + iHashCode143) * 31) + iHashCode144) * 31) + iHashCode145) * 31) + iHashCode146) * 31) + iHashCode147) * 31) + iHashCode148) * 31) + iHashCode149) * 31) + iHashCode150) * 31) + iHashCode151) * 31) + iHashCode152) * 31) + iHashCode153) * 31) + iHashCode154) * 31) + iHashCode155) * 31) + iHashCode156) * 31) + iHashCode157) * 31) + iHashCode158) * 31) + iHashCode159) * 31) + iHashCode160) * 31) + iHashCode161) * 31) + iHashCode162) * 31) + iHashCode163) * 31) + iHashCode164) * 31) + iHashCode165) * 31) + iHashCode166) * 31) + iHashCode167) * 31) + iHashCode168) * 31) + iHashCode169) * 31) + iHashCode170) * 31) + iHashCode171) * 31) + iHashCode172) * 31) + iHashCode173) * 31) + iHashCode174) * 31) + iHashCode175) * 31) + iHashCode176) * 31) + iHashCode177) * 31) + iHashCode178) * 31) + iHashCode179) * 31) + iHashCode180) * 31) + iHashCode181) * 31) + iHashCode182) * 31) + iHashCode183) * 31) + iHashCode184) * 31) + iHashCode185) * 31) + iHashCode186) * 31) + iHashCode187) * 31) + iHashCode188) * 31) + iHashCode189) * 31) + iHashCode190) * 31) + iHashCode191) * 31) + iHashCode192) * 31) + iHashCode193) * 31) + iHashCode194) * 31) + iHashCode195) * 31) + iHashCode196) * 31) + iHashCode197) * 31) + iHashCode198) * 31) + iHashCode199) * 31) + iHashCode200) * 31) + iHashCode201) * 31) + iHashCode202) * 31) + iHashCode203) * 31) + iHashCode204) * 31) + iHashCode205) * 31) + iHashCode206) * 31) + iHashCode207) * 31) + iHashCode208) * 31) + iHashCode209) * 31) + iHashCode210) * 31) + iHashCode211) * 31) + iHashCode212) * 31) + iHashCode213) * 31) + iHashCode214) * 31) + iHashCode215) * 31) + iHashCode216) * 31) + iHashCode217) * 31) + iHashCode218) * 31) + iHashCode219) * 31) + iHashCode220) * 31) + iHashCode221) * 31) + iHashCode222) * 31) + iHashCode223) * 31) + iHashCode224) * 31) + iHashCode225) * 31) + iHashCode226) * 31) + iHashCode227) * 31) + iHashCode228) * 31) + iHashCode229) * 31) + iHashCode230) * 31) + iHashCode231) * 31) + iHashCode232) * 31) + iHashCode233) * 31) + iHashCode234) * 31) + iHashCode235) * 31) + iHashCode236) * 31) + iHashCode237) * 31) + iHashCode238) * 31) + (str76 != null ? str76.hashCode() : 0)) * 31) + this.cycleStartTime.hashCode()) * 31) + this.noClosePositionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbsYieldPercentage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.absYieldPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveOrderCount(String str) {
        this.activeOrderCount = str;
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
    public final void setAdditionalFundNeeded(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalFundNeeded = str;
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
    public final void setAllowMultipleEntry(Boolean bool) {
        this.allowMultipleEntry = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternateCurrency(String str) {
        this.alternateCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbList(ArrayList<SmartArbListItem> arrayList) {
        this.arbList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbPnl(String str) {
        this.arbPnl = str;
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
    public final void setArbitrageProfitRate(String str) {
        this.arbitrageProfitRate = str;
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
    public final void setAvgCost(String str) {
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
    public final void setCoinPnl(String str) {
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
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
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
    public final void setCycleBaseAmt(String str) {
        this.cycleBaseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cycles = str;
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
    public final void setDuration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedSettleTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedSettleTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillManualAddOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillManualAddOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSafetyOrds = str;
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
    public final void setFundingFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingFeeRatio(String str) {
        this.fundingFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingFeeTime(String str) {
        this.fundingFeeTime = str;
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
    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrdAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initOrdAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(List<String> list) {
        this.instIds = list;
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
    public final void setLastPrice(String str) {
        this.lastPrice = str;
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
    public final void setMaxSettlementDay(String str) {
        this.maxSettlementDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAnnualYieldPercentage(String str) {
        this.minAnnualYieldPercentage = str;
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
    public final void setNetMarginTransfer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netMarginTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextInvestTime(String str) {
        this.nextInvestTime = str;
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
    public final void setOrdFrozen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordFrozen = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
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
    public final void setPreAnnualized(String str) {
        this.preAnnualized = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreFundingFee(String str) {
        this.preFundingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitInSourceCcy(String str) {
        this.profitInSourceCcy = str;
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
    public final void setPxSteps(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxStepsMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(String str) {
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealizedPnl(String str) {
        this.realizedPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebateTrans(ArrayList<RebateTransItem> arrayList) {
        this.rebateTrans = arrayList;
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
    public final void setReduce_only(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduce_only = str;
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
    public final void setReserveFunds(boolean z) {
        this.reserveFunds = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleType(String str) {
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafetyOrdAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.safetyOrdAmt = str;
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
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(ArrayList<SignParamItem> arrayList) {
        this.signParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalBotOrderStopParam(ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
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
    public final void setSignalOrderAmtParam(EntrySignalOrderAmtParam entrySignalOrderAmtParam) {
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalSourceType(String str) {
        this.signalSourceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.singleAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
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
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
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
    public final void setSpreadPnl(String str) {
        this.spreadPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingPnl(String str) {
        this.stakingPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingPnlApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stakingPnlApy = str;
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
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
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
    public final void setStopResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopResult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
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
    public final void setSubOrdType(String str) {
        this.subOrdType = str;
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
    public final void setTerm(String str) {
        this.term = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(String str) {
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAnnualizedRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAnnualizedRate = str;
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
    public final void setTotalEquity(String str) {
        this.totalEquity = str;
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
    public final void setTpPct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPct = str;
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
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParamResp(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackingMode(String str) {
        this.trackingMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeNum = str;
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
    public final void setTransferInMargin(String str) {
        this.transferInMargin = str;
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
    public final void setUsedMargin(String str) {
        this.usedMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return ("StrategyDetailsResponse(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", ccy=" + this.ccy + ", ctVal=" + this.ctVal + ", ordId=" + this.ordId + ", algoId=" + this.algoId + ", cTime=" + this.cTime + ", ordType=" + this.ordType + ", tdMode=" + this.tdMode + ", triggerTime=" + this.triggerTime + ", state=" + this.state + ", pxVar=" + this.pxVar + ", pxSpread=" + this.pxSpread + ", szLimit=" + this.szLimit + ", pxLimit=" + this.pxLimit + ", actualSz=" + this.actualSz + ", sz=" + this.sz + ", side=" + this.side + ", posSide=" + this.posSide + ", timeInterval=" + this.timeInterval + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", tpslTriggerParamResp=" + this.tpslTriggerParamResp + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", tradeNum=" + this.tradeNum + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", arbApy=" + this.arbApy + ", profitNum=" + this.profitNum + ", runTime=" + this.runTime + ", perMinProfitRate=" + this.perMinProfitRate + ", perMaxProfitRate=" + this.perMaxProfitRate + ", gridProfit=" + this.gridProfit + ", gridProfitRate=" + this.gridProfitRate + ", totalCycleProfitRate=" + this.totalCycleProfitRate + ", arbitrageProfitRate=" + this.arbitrageProfitRate + ", floatProfit=" + this.floatProfit + ", totalAnnualizedRate=" + this.totalAnnualizedRate + ", annualizedRate=" + this.annualizedRate + ", curQuoteSz=" + this.curQuoteSz + ", curBaseSz=" + this.curBaseSz + ", cancelType=" + this.cancelType + ", investment=" + this.investment + ", lever=" + this.lever + ", pTime=" + this.pTime + ", arbitrageNum=" + this.arbitrageNum + ", avgDailyArbitrageNum=" + this.avgDailyArbitrageNum + ", singleAmt=" + this.singleAmt + ", stopResult=" + this.stopResult + ", runPx=" + this.runPx + ", stgyName=" + this.stgyName + ", mktCap=" + this.mktCap + ", investAmt=" + this.investAmt + ", uTime=" + this.uTime + ", cycles=" + this.cycles + ", amt=" + this.amt + ", recurringList=" + this.recurringList + ", period=" + this.period + ", recurringDay=" + this.recurringDay + ", recurringHour=" + this.recurringHour + ", nextInvestTime=" + this.nextInvestTime + ", investCcy=" + this.investCcy + ", recurringTime=" + this.recurringTime + ", direction=" + this.direction + ", actualLever=" + this.actualLever + ", eq=" + this.eq + ", algoOrdType=" + this.algoOrdType + ", duration=" + this.duration + ", investType=" + this.investType + ", basePos=" + this.basePos + ", balType=" + this.balType + ", interval=" + this.interval + ", deltaRatio=" + this.deltaRatio + ", balNum=" + this.balNum + ", portfolioList=" + this.portfolioList + ", apy=" + this.apy + ", maturedApy=" + this.maturedApy + ", avgPx=" + this.avgPx + ", investmentAmt=" + this.investmentAmt + ", investmentCcy=" + this.investmentCcy + ", maxSafetyOrds=" + this.maxSafetyOrds + ", fillSafetyOrds=" + this.fillSafetyOrds + ", fillManualAddOrds=" + this.fillManualAddOrds + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", tpPriceRange=" + this.tpPriceRange + ", completedCycles=" + this.completedCycles + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", pxSteps=" + this.pxSteps + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", slMode=" + this.slMode + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", sourceAlgoId=" + this.sourceAlgoId + ", stopType=" + this.stopType + ", profit=" + this.profit + ", signParams=" + this.signParams + ", rebateTrans=" + this.rebateTrans + ", reserveFunds=" + this.reserveFunds + ", totalCycleProfit=" + this.totalCycleProfit + ", arbitragePnl=" + this.arbitragePnl + ", additionalFundNeeded=" + this.additionalFundNeeded + ", maxBotUsage=" + this.maxBotUsage + ", cycleBaseAmt=" + this.cycleBaseAmt + ", triggerParams=" + this.triggerParams + ", reserveFundingFee=" + this.reserveFundingFee + ", transferInMargin=" + this.transferInMargin + ", ordFrozen=" + this.ordFrozen + ", availEq=" + this.availEq + ", initPx=" + this.initPx + ", perGridProfitRatio=" + this.perGridProfitRatio + ", activeOrderCount=" + this.activeOrderCount + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", trailingDownFund=" + this.trailingDownFund + ", gridStatus=" + this.gridStatus + ", lmtOrderNumber=" + this.lmtOrderNumber + ", aggressiveness=" + this.aggressiveness + ", profitSharingRatio=" + this.profitSharingRatio + ", copyType=" + this.copyType + ", instIds=" + this.instIds + ", totalEquity=" + this.totalEquity + ", floatingPnl=" + this.floatingPnl + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", usedMargin=" + this.usedMargin + ", availableMargin=" + this.availableMargin + ", totalAmt=" + this.totalAmt + ", totalPnlRatio=" + this.totalPnlRatio + ", realizedPnl=" + this.realizedPnl + ", signalChanName=" + this.signalChanName + ", signalChanId=" + this.signalChanId + ", signalCount=" + this.signalCount + ", allowMultipleEntry=" + this.allowMultipleEntry + ", subOrdType=" + this.subOrdType + ", ratio=" + this.ratio + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", signalSourceType=" + this.signalSourceType + ", symbolsNumber=" + this.symbolsNumber + ", isHistory=" + this.isHistory + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", trackingMode=" + this.trackingMode + ", netMarginTransfer=" + this.netMarginTransfer + ", feeCcy=" + this.feeCcy + ", fundingFee=" + this.fundingFee + ", reduce_only=" + this.reduce_only + ", outOfRange=" + this.outOfRange + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ", extendedBusinessInfo=" + this.extendedBusinessInfo + ", arbPnl=" + this.arbPnl + ", spreadPnl=" + this.spreadPnl + ", arbList=" + this.arbList + ", preFundingFee=" + this.preFundingFee + ", preAnnualized=" + this.preAnnualized + ", instFamily=" + this.instFamily + ", fundingFeeTime=" + this.fundingFeeTime + ", fundingFeeRatio=" + this.fundingFeeRatio + ", pnlRatioInSourceCcy=" + this.pnlRatioInSourceCcy + ", totalPnlInSourceCcy=" + this.totalPnlInSourceCcy + ", floatProfitInSourceCcy=" + this.floatProfitInSourceCcy + ", gridProfitInSourceCcy=" + this.gridProfitInSourceCcy + ", arbitrageApy=" + this.arbitrageApy + ", floatProfitRate=" + this.floatProfitRate + ", profitInSourceCcy=" + this.profitInSourceCcy + ", ruleType=" + this.ruleType + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", strategyTags=" + this.strategyTags + ", voucherInfo=" + this.voucherInfo + ", stakingPnl=" + this.stakingPnl + ", stakingPnlUSDT=" + this.stakingPnlUSDT + ", stakingPosCcy=" + this.stakingPosCcy + ", stakingPnlApy=" + this.stakingPnlApy + ", subArbTypes=" + this.subArbTypes + ", totalInterestAmt=" + this.totalInterestAmt + ", debtCcy=" + this.debtCcy + ", accountId=" + this.accountId + ", forbidden=" + this.forbidden + ", hiddenFeatures=" + this.hiddenFeatures + ", dcdState=" + this.dcdState + ", coinPnl=" + this.coinPnl + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", settlementAmount=" + this.settlementAmount + ", settlementCcy=" + this.settlementCcy + ", currencyBal=" + this.currencyBal + ", currency=" + this.currency) + ", avgCost=" + this.avgCost + ", cycle=" + this.cycle + ", term=" + this.term + ", alternateCurrency=" + this.alternateCurrency + ", strike=" + this.strike + ", strikePercentage=" + this.strikePercentage + ", stopPrice=" + this.stopPrice + ", stopPercentage=" + this.stopPercentage + ", curStrike=" + this.curStrike + ", dcdOptionType=" + this.dcdOptionType + ", curSettlementTime=" + this.curSettlementTime + ", minAnnualYieldPercentage=" + this.minAnnualYieldPercentage + ", maxSettlementDay=" + this.maxSettlementDay + ", reinvestment=" + this.reinvestment + ", lastPrice=" + this.lastPrice + ", lastTradeExpireTime=" + this.lastTradeExpireTime + ", lastSettlementSettledTime=" + this.lastSettlementSettledTime + ", absYieldPercentage=" + this.absYieldPercentage + ", estimatedSettleTime=" + this.estimatedSettleTime + ", simpleEarn=" + this.simpleEarn + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", leveragePrincipal=" + this.leveragePrincipal + ", highestApyPeriod=" + this.highestApyPeriod + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", fundingFeeApyList=" + this.fundingFeeApyList + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", profitAutoReinvest=" + this.profitAutoReinvest + ", profitSnapshots=" + this.profitSnapshots + ", latestProfit=" + this.latestProfit + ", totalSpreadProfit=" + this.totalSpreadProfit + ", totalApy=" + this.totalApy + ", fee=" + this.fee + ", arbitrageProfit=" + this.arbitrageProfit + ", stakingProfit=" + this.stakingProfit + ", balanceDetails=" + this.balanceDetails + ", liqPx=" + this.liqPx + ", bot=" + this.bot + ", effectiveEditParametersDetails=" + this.effectiveEditParametersDetails + ", safetyOrdRatio=" + this.safetyOrdRatio + ", cycleStartTime=" + this.cycleStartTime + ", noClosePositionId=" + this.noClosePositionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.uly);
        parcel.writeString(this.ccy);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.ordId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.cTime);
        parcel.writeString(this.ordType);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.state);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.sz);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.runType);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.baseSz);
        this.tpslTriggerParamResp.writeToParcel(parcel, i);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.arbApy);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.runTime);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.gridProfit);
        parcel.writeString(this.gridProfitRate);
        parcel.writeString(this.totalCycleProfitRate);
        parcel.writeString(this.arbitrageProfitRate);
        parcel.writeString(this.floatProfit);
        parcel.writeString(this.totalAnnualizedRate);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.curQuoteSz);
        parcel.writeString(this.curBaseSz);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.investment);
        parcel.writeString(this.lever);
        parcel.writeString(this.pTime);
        parcel.writeString(this.arbitrageNum);
        parcel.writeString(this.avgDailyArbitrageNum);
        parcel.writeString(this.singleAmt);
        parcel.writeString(this.stopResult);
        parcel.writeString(this.runPx);
        parcel.writeString(this.stgyName);
        parcel.writeString(this.mktCap);
        parcel.writeString(this.investAmt);
        parcel.writeString(this.uTime);
        parcel.writeString(this.cycles);
        parcel.writeString(this.amt);
        ArrayList<RecurringListItem> arrayList = this.recurringList;
        parcel.writeInt(arrayList.size());
        Iterator<RecurringListItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.period);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.recurringHour);
        parcel.writeString(this.nextInvestTime);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.recurringTime);
        parcel.writeString(this.direction);
        parcel.writeString(this.actualLever);
        parcel.writeString(this.eq);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.duration);
        parcel.writeString(this.investType);
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.balType);
        parcel.writeString(this.interval);
        parcel.writeString(this.deltaRatio);
        parcel.writeString(this.balNum);
        ArrayList<SmartPortfolioListItem> arrayList2 = this.portfolioList;
        parcel.writeInt(arrayList2.size());
        Iterator<SmartPortfolioListItem> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.apy);
        parcel.writeString(this.maturedApy);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.investmentAmt);
        parcel.writeString(this.investmentCcy);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.fillSafetyOrds);
        parcel.writeString(this.fillManualAddOrds);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        parcel.writeString(this.tpPriceRange);
        parcel.writeString(this.completedCycles);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.slMode);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.stopType);
        parcel.writeString(this.profit);
        ArrayList<SignParamItem> arrayList3 = this.signParams;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<SignParamItem> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<RebateTransItem> arrayList4 = this.rebateTrans;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<RebateTransItem> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeString(this.totalCycleProfit);
        parcel.writeString(this.arbitragePnl);
        parcel.writeString(this.additionalFundNeeded);
        parcel.writeString(this.maxBotUsage);
        parcel.writeString(this.cycleBaseAmt);
        List<DcaTriggerParam> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DcaTriggerParam> it5 = list.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.reserveFundingFee);
        parcel.writeString(this.transferInMargin);
        parcel.writeString(this.ordFrozen);
        parcel.writeString(this.availEq);
        parcel.writeString(this.initPx);
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.activeOrderCount);
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
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.totalEquity);
        parcel.writeString(this.floatingPnl);
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.usedMargin);
        parcel.writeString(this.availableMargin);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalCount);
        Boolean bool = this.allowMultipleEntry;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.subOrdType);
        parcel.writeString(this.ratio);
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
        parcel.writeString(this.signalSourceType);
        parcel.writeString(this.symbolsNumber);
        parcel.writeInt(this.isHistory ? 1 : 0);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.sourceCcySz);
        parcel.writeString(this.trackingMode);
        parcel.writeString(this.netMarginTransfer);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.fundingFee);
        parcel.writeString(this.reduce_only);
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
        parcel.writeString(this.spreadPnl);
        ArrayList<SmartArbListItem> arrayList5 = this.arbList;
        if (arrayList5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList5.size());
            Iterator<SmartArbListItem> it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.preFundingFee);
        parcel.writeString(this.preAnnualized);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.fundingFeeTime);
        parcel.writeString(this.fundingFeeRatio);
        parcel.writeString(this.pnlRatioInSourceCcy);
        parcel.writeString(this.totalPnlInSourceCcy);
        parcel.writeString(this.floatProfitInSourceCcy);
        parcel.writeString(this.gridProfitInSourceCcy);
        parcel.writeString(this.arbitrageApy);
        parcel.writeString(this.floatProfitRate);
        parcel.writeString(this.profitInSourceCcy);
        parcel.writeString(this.ruleType);
        Boolean bool2 = this.isTradeBorrowMode;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<Integer> list2 = this.strategyTags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Integer> it7 = list2.iterator();
            while (it7.hasNext()) {
                parcel.writeInt(it7.next().intValue());
            }
        }
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        if (tacticsVoucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.stakingPnl);
        parcel.writeString(this.stakingPnlUSDT);
        parcel.writeString(this.stakingPosCcy);
        parcel.writeString(this.stakingPnlApy);
        List<? extends SubArbitrageType4Remote> list3 = this.subArbTypes;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<? extends SubArbitrageType4Remote> it8 = list3.iterator();
            while (it8.hasNext()) {
                parcel.writeString(it8.next().name());
            }
        }
        parcel.writeString(this.totalInterestAmt);
        parcel.writeString(this.debtCcy);
        Long l = this.accountId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeStringList(this.forbidden);
        parcel.writeStringList(this.hiddenFeatures);
        parcel.writeString(this.dcdState);
        parcel.writeString(this.coinPnl);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCcy);
        parcel.writeString(this.settlementAmount);
        parcel.writeString(this.settlementCcy);
        parcel.writeString(this.currencyBal);
        parcel.writeString(this.currency);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.cycle);
        parcel.writeString(this.term);
        parcel.writeString(this.alternateCurrency);
        parcel.writeString(this.strike);
        parcel.writeString(this.strikePercentage);
        parcel.writeString(this.stopPrice);
        parcel.writeString(this.stopPercentage);
        parcel.writeString(this.curStrike);
        parcel.writeString(this.dcdOptionType);
        parcel.writeString(this.curSettlementTime);
        parcel.writeString(this.minAnnualYieldPercentage);
        parcel.writeString(this.maxSettlementDay);
        parcel.writeString(this.reinvestment);
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.lastTradeExpireTime);
        parcel.writeString(this.lastSettlementSettledTime);
        parcel.writeString(this.absYieldPercentage);
        parcel.writeString(this.estimatedSettleTime);
        SmartEarnParam smartEarnParam = this.simpleEarn;
        if (smartEarnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnParam.writeToParcel(parcel, i);
        }
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        if (arbitrageTotalPnlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        }
        Float f = this.leveragePrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.highestApyPeriod);
        parcel.writeInt(this.displayMinPaybackDays ? 1 : 0);
        List<FundingFeeApyItem> list4 = this.fundingFeeApyList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<FundingFeeApyItem> it9 = list4.iterator();
            while (it9.hasNext()) {
                it9.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.displayId);
        parcel.writeString(this.tradeQuoteCcy);
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        if (gridProfitAutoReinvestResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gridProfitAutoReinvestResponse.writeToParcel(parcel, i);
        }
        List<StrategyProfitResponse> list5 = this.profitSnapshots;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<StrategyProfitResponse> it10 = list5.iterator();
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
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        if (balanceDetailInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balanceDetailInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.liqPx);
        BotVo botVo = this.bot;
        if (botVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botVo.writeToParcel(parcel, i);
        }
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        if (strategyDcaEditResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyDcaEditResp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.safetyOrdRatio);
        parcel.writeString(this.cycleStartTime);
        parcel.writeString(this.noClosePositionId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyDetailsResponse> serializer() {
            return StrategyDetailsResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RecurringListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartPortfolioListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SignParamItem$$serializer.INSTANCE), new ArrayListSerializer(RebateTransItem$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(SubArbitrageType4Remote.Companion.serializer()), null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(FundingFeeApyItem$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ StrategyDetailsResponse(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, ArrayList arrayList, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, boolean z, String str76, String str77, String str78, String str79, ArrayList arrayList2, String str80, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str103, String str104, String str105, String str106, String str107, List list, String str108, String str109, String str110, String str111, String str112, String str113, String str114, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, List list2, String str121, String str122, String str123, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, Boolean bool, String str133, String str134, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, String str135, String str136, boolean z3, String str137, String str138, String str139, String str140, String str141, String str142, String str143, boolean z4, boolean z5, String str144, ExtendedBusinessInfo extendedBusinessInfo, String str145, String str146, ArrayList arrayList5, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, String str156, String str157, String str158, String str159, Boolean bool2, List list3, TacticsVoucherInfo tacticsVoucherInfo, String str160, String str161, String str162, String str163, List list4, String str164, String str165, Long l, ArrayList arrayList6, ArrayList arrayList7, String str166, String str167, String str168, String str169, String str170, String str171, String str172, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, String str184, String str185, String str186, String str187, String str188, String str189, String str190, String str191, String str192, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, String str193, boolean z6, List list5, String str194, String str195, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, List list6, StrategyProfitResponse strategyProfitResponse, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, String str199, BotVo botVo, StrategyDcaEditResp strategyDcaEditResp, String str200, String str201, String str202, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
        if ((i & 16) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str5;
        }
        if ((i & 32) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str6;
        }
        if ((i & 64) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str7;
        }
        if ((i & 128) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 256) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str9;
        }
        if ((i & 512) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str10;
        }
        if ((i & 1024) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str11;
        }
        if ((i & 2048) == 0) {
            this.state = "";
        } else {
            this.state = str12;
        }
        if ((i & 4096) == 0) {
            this.pxVar = "";
        } else {
            this.pxVar = str13;
        }
        if ((i & 8192) == 0) {
            this.pxSpread = "";
        } else {
            this.pxSpread = str14;
        }
        if ((i & 16384) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str15;
        }
        if ((i & 32768) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str16;
        }
        if ((i & 65536) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str17;
        }
        if ((i & 131072) == 0) {
            this.sz = "";
        } else {
            this.sz = str18;
        }
        if ((i & 262144) == 0) {
            this.side = "";
        } else {
            this.side = str19;
        }
        if ((i & 524288) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str20;
        }
        if ((1048576 & i) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str21;
        }
        if ((2097152 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str22;
        }
        if ((4194304 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str23;
        }
        if ((8388608 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str24;
        }
        if ((16777216 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str25;
        }
        if ((33554432 & i) == 0) {
            this.quoteSz = "";
        } else {
            this.quoteSz = str26;
        }
        if ((67108864 & i) == 0) {
            this.baseSz = "";
        } else {
            this.baseSz = str27;
        }
        this.tpslTriggerParamResp = (134217728 & i) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((268435456 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str28;
        }
        if ((536870912 & i) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str29;
        }
        if ((1073741824 & i) == 0) {
            this.tpRatio = "";
        } else {
            this.tpRatio = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.slRatio = "";
        } else {
            this.slRatio = str31;
        }
        if ((i2 & 1) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str32;
        }
        if ((i2 & 2) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str33;
        }
        if ((i2 & 4) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str34;
        }
        if ((i2 & 8) == 0) {
            this.arbApy = "";
        } else {
            this.arbApy = str35;
        }
        if ((i2 & 16) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str36;
        }
        if ((i2 & 32) == 0) {
            this.runTime = "";
        } else {
            this.runTime = str37;
        }
        if ((i2 & 64) == 0) {
            this.perMinProfitRate = "";
        } else {
            this.perMinProfitRate = str38;
        }
        if ((i2 & 128) == 0) {
            this.perMaxProfitRate = "";
        } else {
            this.perMaxProfitRate = str39;
        }
        if ((i2 & 256) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str40;
        }
        if ((i2 & 512) == 0) {
            this.gridProfitRate = "";
        } else {
            this.gridProfitRate = str41;
        }
        if ((i2 & 1024) == 0) {
            this.totalCycleProfitRate = "";
        } else {
            this.totalCycleProfitRate = str42;
        }
        if ((i2 & 2048) == 0) {
            this.arbitrageProfitRate = null;
        } else {
            this.arbitrageProfitRate = str43;
        }
        if ((i2 & 4096) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str44;
        }
        if ((i2 & 8192) == 0) {
            this.totalAnnualizedRate = "";
        } else {
            this.totalAnnualizedRate = str45;
        }
        if ((i2 & 16384) == 0) {
            this.annualizedRate = "";
        } else {
            this.annualizedRate = str46;
        }
        if ((i2 & 32768) == 0) {
            this.curQuoteSz = "";
        } else {
            this.curQuoteSz = str47;
        }
        if ((i2 & 65536) == 0) {
            this.curBaseSz = "";
        } else {
            this.curBaseSz = str48;
        }
        if ((i2 & 131072) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str49;
        }
        if ((i2 & 262144) == 0) {
            this.investment = "";
        } else {
            this.investment = str50;
        }
        if ((i2 & 524288) == 0) {
            this.lever = "";
        } else {
            this.lever = str51;
        }
        if ((1048576 & i2) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str52;
        }
        if ((2097152 & i2) == 0) {
            this.arbitrageNum = "";
        } else {
            this.arbitrageNum = str53;
        }
        if ((4194304 & i2) == 0) {
            this.avgDailyArbitrageNum = "";
        } else {
            this.avgDailyArbitrageNum = str54;
        }
        if ((8388608 & i2) == 0) {
            this.singleAmt = "";
        } else {
            this.singleAmt = str55;
        }
        if ((16777216 & i2) == 0) {
            this.stopResult = "";
        } else {
            this.stopResult = str56;
        }
        if ((33554432 & i2) == 0) {
            this.runPx = "";
        } else {
            this.runPx = str57;
        }
        if ((67108864 & i2) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str58;
        }
        if ((134217728 & i2) == 0) {
            this.mktCap = "";
        } else {
            this.mktCap = str59;
        }
        if ((268435456 & i2) == 0) {
            this.investAmt = "";
        } else {
            this.investAmt = str60;
        }
        if ((536870912 & i2) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str61;
        }
        if ((1073741824 & i2) == 0) {
            this.cycles = "";
        } else {
            this.cycles = str62;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.amt = "";
        } else {
            this.amt = str63;
        }
        this.recurringList = (i3 & 1) == 0 ? new ArrayList() : arrayList;
        if ((i3 & 2) == 0) {
            this.period = "";
        } else {
            this.period = str64;
        }
        if ((i3 & 4) == 0) {
            this.recurringDay = "";
        } else {
            this.recurringDay = str65;
        }
        if ((i3 & 8) == 0) {
            this.recurringHour = "";
        } else {
            this.recurringHour = str66;
        }
        if ((i3 & 16) == 0) {
            this.nextInvestTime = null;
        } else {
            this.nextInvestTime = str67;
        }
        if ((i3 & 32) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str68;
        }
        if ((i3 & 64) == 0) {
            this.recurringTime = "";
        } else {
            this.recurringTime = str69;
        }
        if ((i3 & 128) == 0) {
            this.direction = "";
        } else {
            this.direction = str70;
        }
        if ((i3 & 256) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str71;
        }
        if ((i3 & 512) == 0) {
            this.eq = "";
        } else {
            this.eq = str72;
        }
        if ((i3 & 1024) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str73;
        }
        if ((i3 & 2048) == 0) {
            this.duration = "";
        } else {
            this.duration = str74;
        }
        if ((i3 & 4096) == 0) {
            this.investType = "";
        } else {
            this.investType = str75;
        }
        this.basePos = (i3 & 8192) == 0 ? false : z;
        if ((i3 & 16384) == 0) {
            this.balType = "";
        } else {
            this.balType = str76;
        }
        if ((i3 & 32768) == 0) {
            this.interval = "";
        } else {
            this.interval = str77;
        }
        if ((i3 & 65536) == 0) {
            this.deltaRatio = "";
        } else {
            this.deltaRatio = str78;
        }
        if ((i3 & 131072) == 0) {
            this.balNum = "";
        } else {
            this.balNum = str79;
        }
        this.portfolioList = (i3 & 262144) == 0 ? new ArrayList() : arrayList2;
        if ((i3 & 524288) == 0) {
            this.apy = "";
        } else {
            this.apy = str80;
        }
        if ((1048576 & i3) == 0) {
            this.maturedApy = null;
        } else {
            this.maturedApy = str81;
        }
        if ((2097152 & i3) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str82;
        }
        if ((4194304 & i3) == 0) {
            this.investmentAmt = "";
        } else {
            this.investmentAmt = str83;
        }
        if ((8388608 & i3) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str84;
        }
        if ((16777216 & i3) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str85;
        }
        if ((33554432 & i3) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str86;
        }
        if ((67108864 & i3) == 0) {
            this.fillManualAddOrds = "";
        } else {
            this.fillManualAddOrds = str87;
        }
        if ((134217728 & i3) == 0) {
            this.tpPx = "";
        } else {
            this.tpPx = str88;
        }
        if ((268435456 & i3) == 0) {
            this.slPx = "";
        } else {
            this.slPx = str89;
        }
        if ((536870912 & i3) == 0) {
            this.tpPriceRange = null;
        } else {
            this.tpPriceRange = str90;
        }
        if ((1073741824 & i3) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str91;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.initOrdAmt = "";
        } else {
            this.initOrdAmt = str92;
        }
        if ((i4 & 1) == 0) {
            this.safetyOrdAmt = "";
        } else {
            this.safetyOrdAmt = str93;
        }
        if ((i4 & 2) == 0) {
            this.pxSteps = "";
        } else {
            this.pxSteps = str94;
        }
        if ((i4 & 4) == 0) {
            this.tpPct = "";
        } else {
            this.tpPct = str95;
        }
        if ((i4 & 8) == 0) {
            this.slPct = "";
        } else {
            this.slPct = str96;
        }
        if ((i4 & 16) == 0) {
            this.slMode = "";
        } else {
            this.slMode = str97;
        }
        if ((i4 & 32) == 0) {
            this.pxStepsMult = "";
        } else {
            this.pxStepsMult = str98;
        }
        if ((i4 & 64) == 0) {
            this.volMult = "";
        } else {
            this.volMult = str99;
        }
        if ((i4 & 128) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str100;
        }
        if ((i4 & 256) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str101;
        }
        if ((i4 & 512) == 0) {
            this.profit = null;
        } else {
            this.profit = str102;
        }
        if ((i4 & 1024) == 0) {
            this.signParams = null;
        } else {
            this.signParams = arrayList3;
        }
        if ((i4 & 2048) == 0) {
            this.rebateTrans = null;
        } else {
            this.rebateTrans = arrayList4;
        }
        this.reserveFunds = (i4 & 4096) == 0 ? false : z2;
        if ((i4 & 8192) == 0) {
            this.totalCycleProfit = "";
        } else {
            this.totalCycleProfit = str103;
        }
        if ((i4 & 16384) == 0) {
            this.arbitragePnl = "";
        } else {
            this.arbitragePnl = str104;
        }
        if ((i4 & 32768) == 0) {
            this.additionalFundNeeded = "";
        } else {
            this.additionalFundNeeded = str105;
        }
        if ((i4 & 65536) == 0) {
            this.maxBotUsage = "";
        } else {
            this.maxBotUsage = str106;
        }
        if ((i4 & 131072) == 0) {
            this.cycleBaseAmt = null;
        } else {
            this.cycleBaseAmt = str107;
        }
        if ((i4 & 262144) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
        if ((i4 & 524288) == 0) {
            this.reserveFundingFee = null;
        } else {
            this.reserveFundingFee = str108;
        }
        if ((1048576 & i4) == 0) {
            this.transferInMargin = null;
        } else {
            this.transferInMargin = str109;
        }
        if ((2097152 & i4) == 0) {
            this.ordFrozen = "";
        } else {
            this.ordFrozen = str110;
        }
        if ((4194304 & i4) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str111;
        }
        if ((8388608 & i4) == 0) {
            this.initPx = "";
        } else {
            this.initPx = str112;
        }
        if ((16777216 & i4) == 0) {
            this.perGridProfitRatio = "";
        } else {
            this.perGridProfitRatio = str113;
        }
        if ((33554432 & i4) == 0) {
            this.activeOrderCount = null;
        } else {
            this.activeOrderCount = str114;
        }
        if ((67108864 & i4) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((134217728 & i4) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((268435456 & i4) == 0) {
            this.trailingDownFund = null;
        } else {
            this.trailingDownFund = str115;
        }
        if ((536870912 & i4) == 0) {
            this.gridStatus = null;
        } else {
            this.gridStatus = str116;
        }
        if ((1073741824 & i4) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = str117;
        }
        if ((Integer.MIN_VALUE & i4) == 0) {
            this.aggressiveness = null;
        } else {
            this.aggressiveness = str118;
        }
        if ((i5 & 1) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str119;
        }
        if ((i5 & 2) == 0) {
            this.copyType = null;
        } else {
            this.copyType = str120;
        }
        if ((i5 & 4) == 0) {
            this.instIds = null;
        } else {
            this.instIds = list2;
        }
        if ((i5 & 8) == 0) {
            this.totalEquity = null;
        } else {
            this.totalEquity = str121;
        }
        if ((i5 & 16) == 0) {
            this.floatingPnl = null;
        } else {
            this.floatingPnl = str122;
        }
        if ((i5 & 32) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str123;
        }
        if ((i5 & 64) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str124;
        }
        if ((i5 & 128) == 0) {
            this.usedMargin = null;
        } else {
            this.usedMargin = str125;
        }
        if ((i5 & 256) == 0) {
            this.availableMargin = null;
        } else {
            this.availableMargin = str126;
        }
        if ((i5 & 512) == 0) {
            this.totalAmt = null;
        } else {
            this.totalAmt = str127;
        }
        if ((i5 & 1024) == 0) {
            this.totalPnlRatio = null;
        } else {
            this.totalPnlRatio = str128;
        }
        if ((i5 & 2048) == 0) {
            this.realizedPnl = null;
        } else {
            this.realizedPnl = str129;
        }
        if ((i5 & 4096) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str130;
        }
        if ((i5 & 8192) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str131;
        }
        if ((i5 & 16384) == 0) {
            this.signalCount = null;
        } else {
            this.signalCount = str132;
        }
        if ((i5 & 32768) == 0) {
            this.allowMultipleEntry = null;
        } else {
            this.allowMultipleEntry = bool;
        }
        if ((i5 & 65536) == 0) {
            this.subOrdType = null;
        } else {
            this.subOrdType = str133;
        }
        if ((i5 & 131072) == 0) {
            this.ratio = null;
        } else {
            this.ratio = str134;
        }
        if ((i5 & 262144) == 0) {
            this.signalOrderAmtParam = null;
        } else {
            this.signalOrderAmtParam = entrySignalOrderAmtParam;
        }
        if ((i5 & 524288) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
        if ((1048576 & i5) == 0) {
            this.signalSourceType = null;
        } else {
            this.signalSourceType = str135;
        }
        if ((2097152 & i5) == 0) {
            this.symbolsNumber = null;
        } else {
            this.symbolsNumber = str136;
        }
        this.isHistory = (4194304 & i5) == 0 ? false : z3;
        if ((8388608 & i5) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str137;
        }
        if ((16777216 & i5) == 0) {
            this.sourceCcySz = null;
        } else {
            this.sourceCcySz = str138;
        }
        if ((33554432 & i5) == 0) {
            this.trackingMode = null;
        } else {
            this.trackingMode = str139;
        }
        if ((67108864 & i5) == 0) {
            this.netMarginTransfer = "";
        } else {
            this.netMarginTransfer = str140;
        }
        if ((134217728 & i5) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str141;
        }
        if ((268435456 & i5) == 0) {
            this.fundingFee = "";
        } else {
            this.fundingFee = str142;
        }
        if ((536870912 & i5) == 0) {
            this.reduce_only = "";
        } else {
            this.reduce_only = str143;
        }
        this.outOfRange = (1073741824 & i5) == 0 ? false : z4;
        this.autoMarginReloadSwitch = (Integer.MIN_VALUE & i5) == 0 ? false : z5;
        if ((i6 & 1) == 0) {
            this.autoMarginReloadMaxAmount = null;
        } else {
            this.autoMarginReloadMaxAmount = str144;
        }
        if ((i6 & 2) == 0) {
            this.extendedBusinessInfo = null;
        } else {
            this.extendedBusinessInfo = extendedBusinessInfo;
        }
        if ((i6 & 4) == 0) {
            this.arbPnl = null;
        } else {
            this.arbPnl = str145;
        }
        if ((i6 & 8) == 0) {
            this.spreadPnl = null;
        } else {
            this.spreadPnl = str146;
        }
        if ((i6 & 16) == 0) {
            this.arbList = null;
        } else {
            this.arbList = arrayList5;
        }
        if ((i6 & 32) == 0) {
            this.preFundingFee = null;
        } else {
            this.preFundingFee = str147;
        }
        if ((i6 & 64) == 0) {
            this.preAnnualized = null;
        } else {
            this.preAnnualized = str148;
        }
        if ((i6 & 128) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str149;
        }
        if ((i6 & 256) == 0) {
            this.fundingFeeTime = null;
        } else {
            this.fundingFeeTime = str150;
        }
        if ((i6 & 512) == 0) {
            this.fundingFeeRatio = null;
        } else {
            this.fundingFeeRatio = str151;
        }
        if ((i6 & 1024) == 0) {
            this.pnlRatioInSourceCcy = "";
        } else {
            this.pnlRatioInSourceCcy = str152;
        }
        if ((i6 & 2048) == 0) {
            this.totalPnlInSourceCcy = "";
        } else {
            this.totalPnlInSourceCcy = str153;
        }
        if ((i6 & 4096) == 0) {
            this.floatProfitInSourceCcy = "";
        } else {
            this.floatProfitInSourceCcy = str154;
        }
        if ((i6 & 8192) == 0) {
            this.gridProfitInSourceCcy = "";
        } else {
            this.gridProfitInSourceCcy = str155;
        }
        if ((i6 & 16384) == 0) {
            this.arbitrageApy = "";
        } else {
            this.arbitrageApy = str156;
        }
        if ((i6 & 32768) == 0) {
            this.floatProfitRate = "";
        } else {
            this.floatProfitRate = str157;
        }
        if ((i6 & 65536) == 0) {
            this.profitInSourceCcy = null;
        } else {
            this.profitInSourceCcy = str158;
        }
        if ((i6 & 131072) == 0) {
            this.ruleType = null;
        } else {
            this.ruleType = str159;
        }
        if ((i6 & 262144) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool2;
        }
        if ((i6 & 524288) == 0) {
            this.strategyTags = null;
        } else {
            this.strategyTags = list3;
        }
        if ((1048576 & i6) == 0) {
            this.voucherInfo = null;
        } else {
            this.voucherInfo = tacticsVoucherInfo;
        }
        if ((2097152 & i6) == 0) {
            this.stakingPnl = null;
        } else {
            this.stakingPnl = str160;
        }
        if ((4194304 & i6) == 0) {
            this.stakingPnlUSDT = null;
        } else {
            this.stakingPnlUSDT = str161;
        }
        if ((8388608 & i6) == 0) {
            this.stakingPosCcy = "";
        } else {
            this.stakingPosCcy = str162;
        }
        if ((16777216 & i6) == 0) {
            this.stakingPnlApy = "";
        } else {
            this.stakingPnlApy = str163;
        }
        if ((33554432 & i6) == 0) {
            this.subArbTypes = null;
        } else {
            this.subArbTypes = list4;
        }
        if ((67108864 & i6) == 0) {
            this.totalInterestAmt = null;
        } else {
            this.totalInterestAmt = str164;
        }
        if ((134217728 & i6) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str165;
        }
        if ((268435456 & i6) == 0) {
            this.accountId = null;
        } else {
            this.accountId = l;
        }
        if ((536870912 & i6) == 0) {
            this.forbidden = null;
        } else {
            this.forbidden = arrayList6;
        }
        if ((1073741824 & i6) == 0) {
            this.hiddenFeatures = null;
        } else {
            this.hiddenFeatures = arrayList7;
        }
        if ((Integer.MIN_VALUE & i6) == 0) {
            this.dcdState = null;
        } else {
            this.dcdState = str166;
        }
        if ((i7 & 1) == 0) {
            this.coinPnl = null;
        } else {
            this.coinPnl = str167;
        }
        if ((i7 & 2) == 0) {
            this.notional = null;
        } else {
            this.notional = str168;
        }
        if ((i7 & 4) == 0) {
            this.notionalCcy = null;
        } else {
            this.notionalCcy = str169;
        }
        if ((i7 & 8) == 0) {
            this.settlementAmount = null;
        } else {
            this.settlementAmount = str170;
        }
        if ((i7 & 16) == 0) {
            this.settlementCcy = null;
        } else {
            this.settlementCcy = str171;
        }
        if ((i7 & 32) == 0) {
            this.currencyBal = null;
        } else {
            this.currencyBal = str172;
        }
        if ((i7 & 64) == 0) {
            this.currency = null;
        } else {
            this.currency = str173;
        }
        if ((i7 & 128) == 0) {
            this.avgCost = null;
        } else {
            this.avgCost = str174;
        }
        if ((i7 & 256) == 0) {
            this.cycle = null;
        } else {
            this.cycle = str175;
        }
        if ((i7 & 512) == 0) {
            this.term = null;
        } else {
            this.term = str176;
        }
        if ((i7 & 1024) == 0) {
            this.alternateCurrency = null;
        } else {
            this.alternateCurrency = str177;
        }
        if ((i7 & 2048) == 0) {
            this.strike = null;
        } else {
            this.strike = str178;
        }
        if ((i7 & 4096) == 0) {
            this.strikePercentage = null;
        } else {
            this.strikePercentage = str179;
        }
        if ((i7 & 8192) == 0) {
            this.stopPrice = null;
        } else {
            this.stopPrice = str180;
        }
        if ((i7 & 16384) == 0) {
            this.stopPercentage = null;
        } else {
            this.stopPercentage = str181;
        }
        if ((i7 & 32768) == 0) {
            this.curStrike = null;
        } else {
            this.curStrike = str182;
        }
        if ((i7 & 65536) == 0) {
            this.dcdOptionType = null;
        } else {
            this.dcdOptionType = str183;
        }
        if ((i7 & 131072) == 0) {
            this.curSettlementTime = null;
        } else {
            this.curSettlementTime = str184;
        }
        if ((i7 & 262144) == 0) {
            this.minAnnualYieldPercentage = null;
        } else {
            this.minAnnualYieldPercentage = str185;
        }
        if ((i7 & 524288) == 0) {
            this.maxSettlementDay = null;
        } else {
            this.maxSettlementDay = str186;
        }
        if ((1048576 & i7) == 0) {
            this.reinvestment = null;
        } else {
            this.reinvestment = str187;
        }
        if ((2097152 & i7) == 0) {
            this.lastPrice = null;
        } else {
            this.lastPrice = str188;
        }
        if ((4194304 & i7) == 0) {
            this.lastTradeExpireTime = "";
        } else {
            this.lastTradeExpireTime = str189;
        }
        if ((8388608 & i7) == 0) {
            this.lastSettlementSettledTime = "";
        } else {
            this.lastSettlementSettledTime = str190;
        }
        if ((16777216 & i7) == 0) {
            this.absYieldPercentage = "";
        } else {
            this.absYieldPercentage = str191;
        }
        if ((33554432 & i7) == 0) {
            this.estimatedSettleTime = "";
        } else {
            this.estimatedSettleTime = str192;
        }
        if ((67108864 & i7) == 0) {
            this.simpleEarn = null;
        } else {
            this.simpleEarn = smartEarnParam;
        }
        if ((134217728 & i7) == 0) {
            this.arbitrageTotalPnlInfo = null;
        } else {
            this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        }
        if ((268435456 & i7) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((536870912 & i7) == 0) {
            this.highestApyPeriod = null;
        } else {
            this.highestApyPeriod = str193;
        }
        this.displayMinPaybackDays = (1073741824 & i7) == 0 ? false : z6;
        if ((Integer.MIN_VALUE & i7) == 0) {
            this.fundingFeeApyList = null;
        } else {
            this.fundingFeeApyList = list5;
        }
        if ((i8 & 1) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str194;
        }
        if ((i8 & 2) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str195;
        }
        if ((i8 & 4) == 0) {
            this.profitAutoReinvest = null;
        } else {
            this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        }
        if ((i8 & 8) == 0) {
            this.profitSnapshots = null;
        } else {
            this.profitSnapshots = list6;
        }
        if ((i8 & 16) == 0) {
            this.latestProfit = null;
        } else {
            this.latestProfit = strategyProfitResponse;
        }
        if ((i8 & 32) == 0) {
            this.totalSpreadProfit = null;
        } else {
            this.totalSpreadProfit = str196;
        }
        if ((i8 & 64) == 0) {
            this.totalApy = null;
        } else {
            this.totalApy = str197;
        }
        if ((i8 & 128) == 0) {
            this.fee = null;
        } else {
            this.fee = str198;
        }
        if ((i8 & 256) == 0) {
            this.arbitrageProfit = null;
        } else {
            this.arbitrageProfit = profitDetailResponse;
        }
        if ((i8 & 512) == 0) {
            this.stakingProfit = null;
        } else {
            this.stakingProfit = profitDetailResponse2;
        }
        if ((i8 & 1024) == 0) {
            this.balanceDetails = null;
        } else {
            this.balanceDetails = balanceDetailInfoDto;
        }
        if ((i8 & 2048) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str199;
        }
        if ((i8 & 4096) == 0) {
            this.bot = null;
        } else {
            this.bot = botVo;
        }
        if ((i8 & 8192) == 0) {
            this.effectiveEditParametersDetails = null;
        } else {
            this.effectiveEditParametersDetails = strategyDcaEditResp;
        }
        if ((i8 & 16384) == 0) {
            this.safetyOrdRatio = null;
        } else {
            this.safetyOrdRatio = str200;
        }
        if ((i8 & 32768) == 0) {
            this.cycleStartTime = "";
        } else {
            this.cycleStartTime = str201;
        }
        if ((i8 & 65536) == 0) {
            this.noClosePositionId = "";
        } else {
            this.noClosePositionId = str202;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [114=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyDetailsResponse strategyDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyDetailsResponse.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyDetailsResponse.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyDetailsResponse.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyDetailsResponse.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyDetailsResponse.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyDetailsResponse.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyDetailsResponse.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyDetailsResponse.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyDetailsResponse.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyDetailsResponse.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyDetailsResponse.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyDetailsResponse.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pxVar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyDetailsResponse.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pxSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyDetailsResponse.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyDetailsResponse.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyDetailsResponse.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyDetailsResponse.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyDetailsResponse.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyDetailsResponse.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyDetailsResponse.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyDetailsResponse.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyDetailsResponse.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyDetailsResponse.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyDetailsResponse.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyDetailsResponse.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.quoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyDetailsResponse.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.baseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyDetailsResponse.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd(strategyDetailsResponse.tpslTriggerParamResp, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, TpSlTriggerParamReqResp$$serializer.INSTANCE, strategyDetailsResponse.tpslTriggerParamResp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyDetailsResponse.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyDetailsResponse.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tpRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyDetailsResponse.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.slRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyDetailsResponse.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyDetailsResponse.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyDetailsResponse.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyDetailsResponse.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.arbApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyDetailsResponse.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyDetailsResponse.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.runTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyDetailsResponse.runTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.perMinProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyDetailsResponse.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.perMaxProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyDetailsResponse.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyDetailsResponse.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.gridProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, strategyDetailsResponse.gridProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.totalCycleProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, strategyDetailsResponse.totalCycleProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || strategyDetailsResponse.arbitrageProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, strategyDetailsResponse.arbitrageProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, strategyDetailsResponse.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.totalAnnualizedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, strategyDetailsResponse.totalAnnualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.annualizedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, strategyDetailsResponse.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.curQuoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, strategyDetailsResponse.curQuoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.curBaseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, strategyDetailsResponse.curBaseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, strategyDetailsResponse.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, strategyDetailsResponse.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, strategyDetailsResponse.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, strategyDetailsResponse.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.arbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, strategyDetailsResponse.arbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.avgDailyArbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, strategyDetailsResponse.avgDailyArbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.singleAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, strategyDetailsResponse.singleAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.stopResult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, strategyDetailsResponse.stopResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.runPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, strategyDetailsResponse.runPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, strategyDetailsResponse.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.mktCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, strategyDetailsResponse.mktCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, strategyDetailsResponse.investAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, strategyDetailsResponse.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.cycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, strategyDetailsResponse.cycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, strategyDetailsResponse.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd(strategyDetailsResponse.recurringList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 64, kSerializerArr[64], strategyDetailsResponse.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, strategyDetailsResponse.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.recurringDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, strategyDetailsResponse.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.recurringHour, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, strategyDetailsResponse.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || strategyDetailsResponse.nextInvestTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, strategyDetailsResponse.nextInvestTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, strategyDetailsResponse.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.recurringTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, strategyDetailsResponse.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 71, strategyDetailsResponse.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 72, strategyDetailsResponse.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 73, strategyDetailsResponse.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, strategyDetailsResponse.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.duration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, strategyDetailsResponse.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, strategyDetailsResponse.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || strategyDetailsResponse.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 77, strategyDetailsResponse.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.balType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, strategyDetailsResponse.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.interval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 79, strategyDetailsResponse.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.deltaRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 80, strategyDetailsResponse.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.balNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 81, strategyDetailsResponse.balNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || !Intrinsics.EZpvd(strategyDetailsResponse.portfolioList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 82, kSerializerArr[82], strategyDetailsResponse.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.apy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 83, strategyDetailsResponse.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || strategyDetailsResponse.maturedApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 84, StringSerializer.INSTANCE, strategyDetailsResponse.maturedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 85, strategyDetailsResponse.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investmentAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 86, strategyDetailsResponse.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 87, strategyDetailsResponse.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 88, strategyDetailsResponse.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 89, strategyDetailsResponse.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.fillManualAddOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 90, strategyDetailsResponse.fillManualAddOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tpPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 91, strategyDetailsResponse.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.slPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 92, strategyDetailsResponse.slPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || strategyDetailsResponse.tpPriceRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 93, StringSerializer.INSTANCE, strategyDetailsResponse.tpPriceRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.completedCycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 94, strategyDetailsResponse.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.initOrdAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 95, strategyDetailsResponse.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 96) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.safetyOrdAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 96, strategyDetailsResponse.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 97) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pxSteps, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 97, strategyDetailsResponse.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 98) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.tpPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 98, strategyDetailsResponse.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 99) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.slPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 99, strategyDetailsResponse.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 100) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.slMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 100, strategyDetailsResponse.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 101) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pxStepsMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 101, strategyDetailsResponse.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 102) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.volMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 102, strategyDetailsResponse.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 103) || strategyDetailsResponse.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 103, StringSerializer.INSTANCE, strategyDetailsResponse.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 104) || strategyDetailsResponse.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 104, StringSerializer.INSTANCE, strategyDetailsResponse.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 105) || strategyDetailsResponse.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 105, StringSerializer.INSTANCE, strategyDetailsResponse.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 106) || strategyDetailsResponse.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 106, kSerializerArr[106], strategyDetailsResponse.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 107) || strategyDetailsResponse.rebateTrans != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 107, kSerializerArr[107], strategyDetailsResponse.rebateTrans);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 108) || strategyDetailsResponse.reserveFunds) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 108, strategyDetailsResponse.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 109) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.totalCycleProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 109, strategyDetailsResponse.totalCycleProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.arbitragePnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY, strategyDetailsResponse.arbitragePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.additionalFundNeeded, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, strategyDetailsResponse.additionalFundNeeded);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.maxBotUsage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST, strategyDetailsResponse.maxBotUsage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) || strategyDetailsResponse.cycleBaseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, StringSerializer.INSTANCE, strategyDetailsResponse.cycleBaseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 114) || strategyDetailsResponse.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 114, kSerializerArr[114], strategyDetailsResponse.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 115) || strategyDetailsResponse.reserveFundingFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 115, StringSerializer.INSTANCE, strategyDetailsResponse.reserveFundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || strategyDetailsResponse.transferInMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, StringSerializer.INSTANCE, strategyDetailsResponse.transferInMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 117) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.ordFrozen, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 117, strategyDetailsResponse.ordFrozen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 118) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 118, strategyDetailsResponse.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 119) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.initPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 119, strategyDetailsResponse.initPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 120) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.perGridProfitRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 120, strategyDetailsResponse.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 121) || strategyDetailsResponse.activeOrderCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 121, StringSerializer.INSTANCE, strategyDetailsResponse.activeOrderCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 122) || strategyDetailsResponse.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 122, TrailingConfig$$serializer.INSTANCE, strategyDetailsResponse.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 123) || strategyDetailsResponse.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 123, TrailingConfig$$serializer.INSTANCE, strategyDetailsResponse.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 124) || strategyDetailsResponse.trailingDownFund != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 124, StringSerializer.INSTANCE, strategyDetailsResponse.trailingDownFund);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 125) || strategyDetailsResponse.gridStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 125, StringSerializer.INSTANCE, strategyDetailsResponse.gridStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT) || strategyDetailsResponse.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT, StringSerializer.INSTANCE, strategyDetailsResponse.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 127) || strategyDetailsResponse.aggressiveness != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 127, StringSerializer.INSTANCE, strategyDetailsResponse.aggressiveness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 128) || strategyDetailsResponse.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 128, StringSerializer.INSTANCE, strategyDetailsResponse.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 129) || strategyDetailsResponse.copyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 129, StringSerializer.INSTANCE, strategyDetailsResponse.copyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 130) || strategyDetailsResponse.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 130, kSerializerArr[130], strategyDetailsResponse.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, DateFormat.RELATIVE_SHORT) || strategyDetailsResponse.totalEquity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, DateFormat.RELATIVE_SHORT, StringSerializer.INSTANCE, strategyDetailsResponse.totalEquity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) || strategyDetailsResponse.floatingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.floatingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, strategyDetailsResponse.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 134) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 134, strategyDetailsResponse.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 135) || strategyDetailsResponse.usedMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 135, StringSerializer.INSTANCE, strategyDetailsResponse.usedMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA) || strategyDetailsResponse.availableMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.availableMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA) || strategyDetailsResponse.totalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 138) || strategyDetailsResponse.totalPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 138, StringSerializer.INSTANCE, strategyDetailsResponse.totalPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA) || strategyDetailsResponse.realizedPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA) || strategyDetailsResponse.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) || strategyDetailsResponse.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA) || strategyDetailsResponse.signalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.signalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA) || strategyDetailsResponse.allowMultipleEntry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, BooleanSerializer.INSTANCE, strategyDetailsResponse.allowMultipleEntry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA) || strategyDetailsResponse.subOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.subOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) || strategyDetailsResponse.ratio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA) || strategyDetailsResponse.signalOrderAmtParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, EntrySignalOrderAmtParam$$serializer.INSTANCE, strategyDetailsResponse.signalOrderAmtParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) || strategyDetailsResponse.signalBotOrderStopParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, ExitSignalOrderAmtParam$$serializer.INSTANCE, strategyDetailsResponse.signalBotOrderStopParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA) || strategyDetailsResponse.signalSourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.signalSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) || strategyDetailsResponse.symbolsNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.symbolsNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 150) || strategyDetailsResponse.isHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 150, strategyDetailsResponse.isHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA) || strategyDetailsResponse.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA) || strategyDetailsResponse.sourceCcySz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.sourceCcySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA) || strategyDetailsResponse.trackingMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyDetailsResponse.trackingMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.netMarginTransfer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, strategyDetailsResponse.netMarginTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, strategyDetailsResponse.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.fundingFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, strategyDetailsResponse.fundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.reduce_only, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, strategyDetailsResponse.reduce_only);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.outOfRange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, strategyDetailsResponse.outOfRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.autoMarginReloadSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, strategyDetailsResponse.autoMarginReloadSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.autoMarginReloadMaxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.autoMarginReloadMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.extendedBusinessInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, ExtendedBusinessInfo$$serializer.INSTANCE, strategyDetailsResponse.extendedBusinessInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.arbPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.arbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.spreadPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.spreadPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.arbList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, kSerializerArr[164], strategyDetailsResponse.arbList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.preFundingFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.preFundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.preAnnualized != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.preAnnualized);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) || strategyDetailsResponse.fundingFeeTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.fundingFeeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384) || strategyDetailsResponse.fundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.fundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.pnlRatioInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, strategyDetailsResponse.pnlRatioInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.totalPnlInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, strategyDetailsResponse.totalPnlInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 172) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.floatProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 172, strategyDetailsResponse.floatProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.gridProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, strategyDetailsResponse.gridProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.arbitrageApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, strategyDetailsResponse.arbitrageApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.floatProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, strategyDetailsResponse.floatProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256) || strategyDetailsResponse.profitInSourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.profitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384) || strategyDetailsResponse.ruleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256) || strategyDetailsResponse.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, BooleanSerializer.INSTANCE, strategyDetailsResponse.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384) || strategyDetailsResponse.strategyTags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, kSerializerArr[179], strategyDetailsResponse.strategyTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 180) || strategyDetailsResponse.voucherInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 180, C55802xqn.OLrzqt, strategyDetailsResponse.voucherInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384) || strategyDetailsResponse.stakingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, StringSerializer.INSTANCE, strategyDetailsResponse.stakingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256) || strategyDetailsResponse.stakingPnlUSDT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.stakingPnlUSDT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.stakingPosCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, strategyDetailsResponse.stakingPosCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.stakingPnlApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, strategyDetailsResponse.stakingPnlApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384) || strategyDetailsResponse.subArbTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, kSerializerArr[185], strategyDetailsResponse.subArbTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256) || strategyDetailsResponse.totalInterestAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.totalInterestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, strategyDetailsResponse.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 188) || strategyDetailsResponse.accountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 188, LongSerializer.INSTANCE, strategyDetailsResponse.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 189) || strategyDetailsResponse.forbidden != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 189, kSerializerArr[189], strategyDetailsResponse.forbidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 190) || strategyDetailsResponse.hiddenFeatures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 190, kSerializerArr[190], strategyDetailsResponse.hiddenFeatures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 191) || strategyDetailsResponse.dcdState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 191, StringSerializer.INSTANCE, strategyDetailsResponse.dcdState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 192) || strategyDetailsResponse.coinPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 192, StringSerializer.INSTANCE, strategyDetailsResponse.coinPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256) || strategyDetailsResponse.notional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256) || strategyDetailsResponse.notionalCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.notionalCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256) || strategyDetailsResponse.settlementAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.settlementAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256) || strategyDetailsResponse.settlementCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.settlementCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256) || strategyDetailsResponse.currencyBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, StringSerializer.INSTANCE, strategyDetailsResponse.currencyBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 198) || strategyDetailsResponse.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 198, StringSerializer.INSTANCE, strategyDetailsResponse.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 199) || strategyDetailsResponse.avgCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 199, StringSerializer.INSTANCE, strategyDetailsResponse.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 200) || strategyDetailsResponse.cycle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 200, StringSerializer.INSTANCE, strategyDetailsResponse.cycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 201) || strategyDetailsResponse.term != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 201, StringSerializer.INSTANCE, strategyDetailsResponse.term);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 202) || strategyDetailsResponse.alternateCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 202, StringSerializer.INSTANCE, strategyDetailsResponse.alternateCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 203) || strategyDetailsResponse.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 203, StringSerializer.INSTANCE, strategyDetailsResponse.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 204) || strategyDetailsResponse.strikePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 204, StringSerializer.INSTANCE, strategyDetailsResponse.strikePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) || strategyDetailsResponse.stopPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, StringSerializer.INSTANCE, strategyDetailsResponse.stopPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 206) || strategyDetailsResponse.stopPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 206, StringSerializer.INSTANCE, strategyDetailsResponse.stopPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 207) || strategyDetailsResponse.curStrike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 207, StringSerializer.INSTANCE, strategyDetailsResponse.curStrike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 208) || strategyDetailsResponse.dcdOptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 208, StringSerializer.INSTANCE, strategyDetailsResponse.dcdOptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 209) || strategyDetailsResponse.curSettlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 209, StringSerializer.INSTANCE, strategyDetailsResponse.curSettlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 210) || strategyDetailsResponse.minAnnualYieldPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 210, StringSerializer.INSTANCE, strategyDetailsResponse.minAnnualYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 211) || strategyDetailsResponse.maxSettlementDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 211, StringSerializer.INSTANCE, strategyDetailsResponse.maxSettlementDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, BuildConfig.VERSION_CODE) || strategyDetailsResponse.reinvestment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, BuildConfig.VERSION_CODE, StringSerializer.INSTANCE, strategyDetailsResponse.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 213) || strategyDetailsResponse.lastPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 213, StringSerializer.INSTANCE, strategyDetailsResponse.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.lastTradeExpireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE, strategyDetailsResponse.lastTradeExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 215) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.lastSettlementSettledTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 215, strategyDetailsResponse.lastSettlementSettledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 216) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.absYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 216, strategyDetailsResponse.absYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 217) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.estimatedSettleTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 217, strategyDetailsResponse.estimatedSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 218) || strategyDetailsResponse.simpleEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 218, SmartEarnParam$$serializer.INSTANCE, strategyDetailsResponse.simpleEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 219) || strategyDetailsResponse.arbitrageTotalPnlInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 219, ArbitrageTotalPnlInfo$$serializer.INSTANCE, strategyDetailsResponse.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 220) || strategyDetailsResponse.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 220, FloatSerializer.INSTANCE, strategyDetailsResponse.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 221) || strategyDetailsResponse.highestApyPeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 221, StringSerializer.INSTANCE, strategyDetailsResponse.highestApyPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 222) || strategyDetailsResponse.displayMinPaybackDays) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 222, xVS.AEQbTJ, Boolean.valueOf(strategyDetailsResponse.displayMinPaybackDays));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 223) || strategyDetailsResponse.fundingFeeApyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 223, kSerializerArr[223], strategyDetailsResponse.fundingFeeApyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 224) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 224, strategyDetailsResponse.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 225) || strategyDetailsResponse.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 225, StringSerializer.INSTANCE, strategyDetailsResponse.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 226) || strategyDetailsResponse.profitAutoReinvest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 226, GridProfitAutoReinvestResponse$$serializer.INSTANCE, strategyDetailsResponse.profitAutoReinvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 227) || strategyDetailsResponse.profitSnapshots != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 227, kSerializerArr[227], strategyDetailsResponse.profitSnapshots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 228) || strategyDetailsResponse.latestProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 228, StrategyProfitResponse$$serializer.INSTANCE, strategyDetailsResponse.latestProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA) || strategyDetailsResponse.totalSpreadProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA, StringSerializer.INSTANCE, strategyDetailsResponse.totalSpreadProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 230) || strategyDetailsResponse.totalApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 230, StringSerializer.INSTANCE, strategyDetailsResponse.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 231) || strategyDetailsResponse.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 231, StringSerializer.INSTANCE, strategyDetailsResponse.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 232) || strategyDetailsResponse.arbitrageProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 232, ProfitDetailResponse$$serializer.INSTANCE, strategyDetailsResponse.arbitrageProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 233) || strategyDetailsResponse.stakingProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 233, ProfitDetailResponse$$serializer.INSTANCE, strategyDetailsResponse.stakingProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 234) || strategyDetailsResponse.balanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 234, BalanceDetailInfoDto$$serializer.INSTANCE, strategyDetailsResponse.balanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 235) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 235, strategyDetailsResponse.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 236) || strategyDetailsResponse.bot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 236, BotVo$$serializer.INSTANCE, strategyDetailsResponse.bot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 237) || strategyDetailsResponse.effectiveEditParametersDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 237, StrategyDcaEditResp$$serializer.INSTANCE, strategyDetailsResponse.effectiveEditParametersDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 238) || strategyDetailsResponse.safetyOrdRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 238, StringSerializer.INSTANCE, strategyDetailsResponse.safetyOrdRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 239) || !Intrinsics.EZpvd((Object) strategyDetailsResponse.cycleStartTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 239, strategyDetailsResponse.cycleStartTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, PsExtractor.VIDEO_STREAM_MASK) && Intrinsics.EZpvd((Object) strategyDetailsResponse.noClosePositionId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, PsExtractor.VIDEO_STREAM_MASK, strategyDetailsResponse.noClosePositionId);
    }

    public StrategyDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str64, @NotNull String str65, @NotNull String str66, String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, boolean z, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str80, String str81, @NotNull String str82, @NotNull String str83, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, @NotNull String str91, @NotNull String str92, @NotNull String str93, @NotNull String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, @NotNull String str99, String str100, String str101, String str102, ArrayList<SignParamItem> arrayList3, ArrayList<RebateTransItem> arrayList4, boolean z2, @NotNull String str103, @NotNull String str104, @NotNull String str105, @NotNull String str106, String str107, List<DcaTriggerParam> list, String str108, String str109, @NotNull String str110, @NotNull String str111, @NotNull String str112, @NotNull String str113, String str114, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, List<String> list2, String str121, String str122, @NotNull String str123, @NotNull String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, Boolean bool, String str133, String str134, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, String str135, String str136, boolean z3, String str137, String str138, String str139, @NotNull String str140, @NotNull String str141, @NotNull String str142, @NotNull String str143, boolean z4, boolean z5, String str144, ExtendedBusinessInfo extendedBusinessInfo, String str145, String str146, ArrayList<SmartArbListItem> arrayList5, String str147, String str148, String str149, String str150, String str151, @NotNull String str152, @NotNull String str153, @NotNull String str154, @NotNull String str155, @NotNull String str156, @NotNull String str157, String str158, String str159, Boolean bool2, List<Integer> list3, TacticsVoucherInfo tacticsVoucherInfo, String str160, String str161, @NotNull String str162, @NotNull String str163, List<? extends SubArbitrageType4Remote> list4, String str164, @NotNull String str165, Long l, ArrayList<String> arrayList6, ArrayList<String> arrayList7, String str166, String str167, String str168, String str169, String str170, String str171, String str172, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, String str184, String str185, String str186, String str187, String str188, @NotNull String str189, @NotNull String str190, @NotNull String str191, @NotNull String str192, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, String str193, boolean z6, List<FundingFeeApyItem> list5, @NotNull String str194, String str195, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, List<StrategyProfitResponse> list6, StrategyProfitResponse strategyProfitResponse, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, @NotNull String str199, BotVo botVo, StrategyDcaEditResp strategyDcaEditResp, String str200, @NotNull String str201, @NotNull String str202) {
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
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
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
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
        Intrinsics.checkNotNullParameter(str99, "");
        Intrinsics.checkNotNullParameter(str103, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str105, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str110, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str113, "");
        Intrinsics.checkNotNullParameter(str123, "");
        Intrinsics.checkNotNullParameter(str124, "");
        Intrinsics.checkNotNullParameter(str140, "");
        Intrinsics.checkNotNullParameter(str141, "");
        Intrinsics.checkNotNullParameter(str142, "");
        Intrinsics.checkNotNullParameter(str143, "");
        Intrinsics.checkNotNullParameter(str152, "");
        Intrinsics.checkNotNullParameter(str153, "");
        Intrinsics.checkNotNullParameter(str154, "");
        Intrinsics.checkNotNullParameter(str155, "");
        Intrinsics.checkNotNullParameter(str156, "");
        Intrinsics.checkNotNullParameter(str157, "");
        Intrinsics.checkNotNullParameter(str162, "");
        Intrinsics.checkNotNullParameter(str163, "");
        Intrinsics.checkNotNullParameter(str165, "");
        Intrinsics.checkNotNullParameter(str189, "");
        Intrinsics.checkNotNullParameter(str190, "");
        Intrinsics.checkNotNullParameter(str191, "");
        Intrinsics.checkNotNullParameter(str192, "");
        Intrinsics.checkNotNullParameter(str194, "");
        Intrinsics.checkNotNullParameter(str199, "");
        Intrinsics.checkNotNullParameter(str201, "");
        Intrinsics.checkNotNullParameter(str202, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.ccy = str4;
        this.ctVal = str5;
        this.ordId = str6;
        this.algoId = str7;
        this.cTime = str8;
        this.ordType = str9;
        this.tdMode = str10;
        this.triggerTime = str11;
        this.state = str12;
        this.pxVar = str13;
        this.pxSpread = str14;
        this.szLimit = str15;
        this.pxLimit = str16;
        this.actualSz = str17;
        this.sz = str18;
        this.side = str19;
        this.posSide = str20;
        this.timeInterval = str21;
        this.maxPx = str22;
        this.minPx = str23;
        this.gridNum = str24;
        this.runType = str25;
        this.quoteSz = str26;
        this.baseSz = str27;
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
        this.tpTriggerPx = str28;
        this.slTriggerPx = str29;
        this.tpRatio = str30;
        this.slRatio = str31;
        this.tradeNum = str32;
        this.totalPnl = str33;
        this.pnlRatio = str34;
        this.arbApy = str35;
        this.profitNum = str36;
        this.runTime = str37;
        this.perMinProfitRate = str38;
        this.perMaxProfitRate = str39;
        this.gridProfit = str40;
        this.gridProfitRate = str41;
        this.totalCycleProfitRate = str42;
        this.arbitrageProfitRate = str43;
        this.floatProfit = str44;
        this.totalAnnualizedRate = str45;
        this.annualizedRate = str46;
        this.curQuoteSz = str47;
        this.curBaseSz = str48;
        this.cancelType = str49;
        this.investment = str50;
        this.lever = str51;
        this.pTime = str52;
        this.arbitrageNum = str53;
        this.avgDailyArbitrageNum = str54;
        this.singleAmt = str55;
        this.stopResult = str56;
        this.runPx = str57;
        this.stgyName = str58;
        this.mktCap = str59;
        this.investAmt = str60;
        this.uTime = str61;
        this.cycles = str62;
        this.amt = str63;
        this.recurringList = arrayList;
        this.period = str64;
        this.recurringDay = str65;
        this.recurringHour = str66;
        this.nextInvestTime = str67;
        this.investCcy = str68;
        this.recurringTime = str69;
        this.direction = str70;
        this.actualLever = str71;
        this.eq = str72;
        this.algoOrdType = str73;
        this.duration = str74;
        this.investType = str75;
        this.basePos = z;
        this.balType = str76;
        this.interval = str77;
        this.deltaRatio = str78;
        this.balNum = str79;
        this.portfolioList = arrayList2;
        this.apy = str80;
        this.maturedApy = str81;
        this.avgPx = str82;
        this.investmentAmt = str83;
        this.investmentCcy = str84;
        this.maxSafetyOrds = str85;
        this.fillSafetyOrds = str86;
        this.fillManualAddOrds = str87;
        this.tpPx = str88;
        this.slPx = str89;
        this.tpPriceRange = str90;
        this.completedCycles = str91;
        this.initOrdAmt = str92;
        this.safetyOrdAmt = str93;
        this.pxSteps = str94;
        this.tpPct = str95;
        this.slPct = str96;
        this.slMode = str97;
        this.pxStepsMult = str98;
        this.volMult = str99;
        this.sourceAlgoId = str100;
        this.stopType = str101;
        this.profit = str102;
        this.signParams = arrayList3;
        this.rebateTrans = arrayList4;
        this.reserveFunds = z2;
        this.totalCycleProfit = str103;
        this.arbitragePnl = str104;
        this.additionalFundNeeded = str105;
        this.maxBotUsage = str106;
        this.cycleBaseAmt = str107;
        this.triggerParams = list;
        this.reserveFundingFee = str108;
        this.transferInMargin = str109;
        this.ordFrozen = str110;
        this.availEq = str111;
        this.initPx = str112;
        this.perGridProfitRatio = str113;
        this.activeOrderCount = str114;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.trailingDownFund = str115;
        this.gridStatus = str116;
        this.lmtOrderNumber = str117;
        this.aggressiveness = str118;
        this.profitSharingRatio = str119;
        this.copyType = str120;
        this.instIds = list2;
        this.totalEquity = str121;
        this.floatingPnl = str122;
        this.actualMarginSz = str123;
        this.extraMarginSz = str124;
        this.usedMargin = str125;
        this.availableMargin = str126;
        this.totalAmt = str127;
        this.totalPnlRatio = str128;
        this.realizedPnl = str129;
        this.signalChanName = str130;
        this.signalChanId = str131;
        this.signalCount = str132;
        this.allowMultipleEntry = bool;
        this.subOrdType = str133;
        this.ratio = str134;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.signalSourceType = str135;
        this.symbolsNumber = str136;
        this.isHistory = z3;
        this.sourceCcy = str137;
        this.sourceCcySz = str138;
        this.trackingMode = str139;
        this.netMarginTransfer = str140;
        this.feeCcy = str141;
        this.fundingFee = str142;
        this.reduce_only = str143;
        this.outOfRange = z4;
        this.autoMarginReloadSwitch = z5;
        this.autoMarginReloadMaxAmount = str144;
        this.extendedBusinessInfo = extendedBusinessInfo;
        this.arbPnl = str145;
        this.spreadPnl = str146;
        this.arbList = arrayList5;
        this.preFundingFee = str147;
        this.preAnnualized = str148;
        this.instFamily = str149;
        this.fundingFeeTime = str150;
        this.fundingFeeRatio = str151;
        this.pnlRatioInSourceCcy = str152;
        this.totalPnlInSourceCcy = str153;
        this.floatProfitInSourceCcy = str154;
        this.gridProfitInSourceCcy = str155;
        this.arbitrageApy = str156;
        this.floatProfitRate = str157;
        this.profitInSourceCcy = str158;
        this.ruleType = str159;
        this.isTradeBorrowMode = bool2;
        this.strategyTags = list3;
        this.voucherInfo = tacticsVoucherInfo;
        this.stakingPnl = str160;
        this.stakingPnlUSDT = str161;
        this.stakingPosCcy = str162;
        this.stakingPnlApy = str163;
        this.subArbTypes = list4;
        this.totalInterestAmt = str164;
        this.debtCcy = str165;
        this.accountId = l;
        this.forbidden = arrayList6;
        this.hiddenFeatures = arrayList7;
        this.dcdState = str166;
        this.coinPnl = str167;
        this.notional = str168;
        this.notionalCcy = str169;
        this.settlementAmount = str170;
        this.settlementCcy = str171;
        this.currencyBal = str172;
        this.currency = str173;
        this.avgCost = str174;
        this.cycle = str175;
        this.term = str176;
        this.alternateCurrency = str177;
        this.strike = str178;
        this.strikePercentage = str179;
        this.stopPrice = str180;
        this.stopPercentage = str181;
        this.curStrike = str182;
        this.dcdOptionType = str183;
        this.curSettlementTime = str184;
        this.minAnnualYieldPercentage = str185;
        this.maxSettlementDay = str186;
        this.reinvestment = str187;
        this.lastPrice = str188;
        this.lastTradeExpireTime = str189;
        this.lastSettlementSettledTime = str190;
        this.absYieldPercentage = str191;
        this.estimatedSettleTime = str192;
        this.simpleEarn = smartEarnParam;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.leveragePrincipal = f;
        this.highestApyPeriod = str193;
        this.displayMinPaybackDays = z6;
        this.fundingFeeApyList = list5;
        this.displayId = str194;
        this.tradeQuoteCcy = str195;
        this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        this.profitSnapshots = list6;
        this.latestProfit = strategyProfitResponse;
        this.totalSpreadProfit = str196;
        this.totalApy = str197;
        this.fee = str198;
        this.arbitrageProfit = profitDetailResponse;
        this.stakingProfit = profitDetailResponse2;
        this.balanceDetails = balanceDetailInfoDto;
        this.liqPx = str199;
        this.bot = botVo;
        this.effectiveEditParametersDetails = strategyDcaEditResp;
        this.safetyOrdRatio = str200;
        this.cycleStartTime = str201;
        this.noClosePositionId = str202;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, ArrayList arrayList, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, boolean z, String str76, String str77, String str78, String str79, ArrayList arrayList2, String str80, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str103, String str104, String str105, String str106, String str107, List list, String str108, String str109, String str110, String str111, String str112, String str113, String str114, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, List list2, String str121, String str122, String str123, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, Boolean bool, String str133, String str134, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, String str135, String str136, boolean z3, String str137, String str138, String str139, String str140, String str141, String str142, String str143, boolean z4, boolean z5, String str144, ExtendedBusinessInfo extendedBusinessInfo, String str145, String str146, ArrayList arrayList5, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, String str156, String str157, String str158, String str159, Boolean bool2, List list3, TacticsVoucherInfo tacticsVoucherInfo, String str160, String str161, String str162, String str163, List list4, String str164, String str165, Long l, ArrayList arrayList6, ArrayList arrayList7, String str166, String str167, String str168, String str169, String str170, String str171, String str172, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, String str183, String str184, String str185, String str186, String str187, String str188, String str189, String str190, String str191, String str192, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, String str193, boolean z6, List list5, String str194, String str195, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, List list6, StrategyProfitResponse strategyProfitResponse, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, String str199, BotVo botVo, StrategyDcaEditResp strategyDcaEditResp, String str200, String str201, String str202, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        String str203 = (i & 1) != 0 ? "" : str;
        String str204 = (i & 2) != 0 ? "" : str2;
        String str205 = (i & 4) != 0 ? "" : str3;
        String str206 = (i & 8) != 0 ? "" : str4;
        String str207 = (i & 16) != 0 ? "" : str5;
        String str208 = (i & 32) != 0 ? "" : str6;
        String str209 = (i & 64) != 0 ? "" : str7;
        String str210 = (i & 128) != 0 ? "" : str8;
        String str211 = (i & 256) != 0 ? "" : str9;
        String str212 = (i & 512) != 0 ? "" : str10;
        String str213 = (i & 1024) != 0 ? "" : str11;
        String str214 = (i & 2048) != 0 ? "" : str12;
        String str215 = (i & 4096) != 0 ? "" : str13;
        String str216 = (i & 8192) != 0 ? "" : str14;
        String str217 = (i & 16384) != 0 ? "" : str15;
        String str218 = (i & 32768) != 0 ? "" : str16;
        String str219 = (i & 65536) != 0 ? "" : str17;
        String str220 = (i & 131072) != 0 ? "" : str18;
        String str221 = (i & 262144) != 0 ? "" : str19;
        String str222 = (i & 524288) != 0 ? "" : str20;
        String str223 = (i & 1048576) != 0 ? "" : str21;
        String str224 = (i & 2097152) != 0 ? "" : str22;
        String str225 = (i & 4194304) != 0 ? "" : str23;
        String str226 = (i & 8388608) != 0 ? "" : str24;
        String str227 = (i & 16777216) != 0 ? "" : str25;
        String str228 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str229 = (i & 67108864) != 0 ? "" : str27;
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp2 = (i & 134217728) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        String str230 = (i & 268435456) != 0 ? "" : str28;
        String str231 = (i & 536870912) != 0 ? "" : str29;
        String str232 = (i & 1073741824) != 0 ? "" : str30;
        String str233 = (i & Integer.MIN_VALUE) != 0 ? "" : str31;
        String str234 = (i2 & 1) != 0 ? "" : str32;
        String str235 = (i2 & 2) != 0 ? "" : str33;
        String str236 = (i2 & 4) != 0 ? "" : str34;
        String str237 = (i2 & 8) != 0 ? "" : str35;
        String str238 = (i2 & 16) != 0 ? "" : str36;
        String str239 = (i2 & 32) != 0 ? "" : str37;
        String str240 = (i2 & 64) != 0 ? "" : str38;
        String str241 = str233;
        String str242 = (i2 & 128) != 0 ? "" : str39;
        String str243 = (i2 & 256) != 0 ? "" : str40;
        String str244 = (i2 & 512) != 0 ? "" : str41;
        String str245 = (i2 & 1024) != 0 ? "" : str42;
        String str246 = (i2 & 2048) != 0 ? null : str43;
        String str247 = (i2 & 4096) != 0 ? "" : str44;
        String str248 = (i2 & 8192) != 0 ? "" : str45;
        String str249 = (i2 & 16384) != 0 ? "" : str46;
        String str250 = (i2 & 32768) != 0 ? "" : str47;
        String str251 = (i2 & 65536) != 0 ? "" : str48;
        String str252 = (i2 & 131072) != 0 ? "" : str49;
        String str253 = (i2 & 262144) != 0 ? "" : str50;
        String str254 = (i2 & 524288) != 0 ? "" : str51;
        String str255 = (i2 & 1048576) != 0 ? "" : str52;
        String str256 = (i2 & 2097152) != 0 ? "" : str53;
        String str257 = (i2 & 4194304) != 0 ? "" : str54;
        String str258 = (i2 & 8388608) != 0 ? "" : str55;
        String str259 = (i2 & 16777216) != 0 ? "" : str56;
        String str260 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str57;
        String str261 = (i2 & 67108864) != 0 ? "" : str58;
        String str262 = (i2 & 134217728) != 0 ? "" : str59;
        String str263 = (i2 & 268435456) != 0 ? "" : str60;
        String str264 = (i2 & 536870912) != 0 ? "" : str61;
        String str265 = (i2 & 1073741824) != 0 ? "" : str62;
        String str266 = (i2 & Integer.MIN_VALUE) != 0 ? "" : str63;
        ArrayList arrayList8 = (i3 & 1) != 0 ? new ArrayList() : arrayList;
        String str267 = (i3 & 2) != 0 ? "" : str64;
        String str268 = (i3 & 4) != 0 ? "" : str65;
        String str269 = (i3 & 8) != 0 ? "" : str66;
        String str270 = (i3 & 16) != 0 ? null : str67;
        String str271 = (i3 & 32) != 0 ? "" : str68;
        String str272 = (i3 & 64) != 0 ? "" : str69;
        String str273 = str266;
        String str274 = (i3 & 128) != 0 ? "" : str70;
        String str275 = (i3 & 256) != 0 ? "" : str71;
        String str276 = (i3 & 512) != 0 ? "" : str72;
        String str277 = (i3 & 1024) != 0 ? "" : str73;
        String str278 = (i3 & 2048) != 0 ? "" : str74;
        String str279 = (i3 & 4096) != 0 ? "" : str75;
        boolean z7 = (i3 & 8192) != 0 ? false : z;
        String str280 = (i3 & 16384) != 0 ? "" : str76;
        String str281 = (i3 & 32768) != 0 ? "" : str77;
        String str282 = (i3 & 65536) != 0 ? "" : str78;
        String str283 = (i3 & 131072) != 0 ? "" : str79;
        ArrayList arrayList9 = (i3 & 262144) != 0 ? new ArrayList() : arrayList2;
        String str284 = (i3 & 524288) != 0 ? "" : str80;
        String str285 = (i3 & 1048576) != 0 ? null : str81;
        String str286 = (i3 & 2097152) != 0 ? "" : str82;
        String str287 = (i3 & 4194304) != 0 ? "" : str83;
        String str288 = (i3 & 8388608) != 0 ? "" : str84;
        String str289 = (i3 & 16777216) != 0 ? "" : str85;
        String str290 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str86;
        String str291 = (i3 & 67108864) != 0 ? "" : str87;
        String str292 = (i3 & 134217728) != 0 ? "" : str88;
        String str293 = (i3 & 268435456) != 0 ? "" : str89;
        String str294 = (i3 & 536870912) != 0 ? null : str90;
        String str295 = (i3 & 1073741824) != 0 ? "" : str91;
        String str296 = (i3 & Integer.MIN_VALUE) != 0 ? "" : str92;
        String str297 = (i4 & 1) != 0 ? "" : str93;
        String str298 = (i4 & 2) != 0 ? "" : str94;
        String str299 = (i4 & 4) != 0 ? "" : str95;
        String str300 = (i4 & 8) != 0 ? "" : str96;
        String str301 = (i4 & 16) != 0 ? "" : str97;
        String str302 = (i4 & 32) != 0 ? "" : str98;
        String str303 = (i4 & 64) != 0 ? "" : str99;
        String str304 = str296;
        String str305 = (i4 & 128) != 0 ? null : str100;
        String str306 = (i4 & 256) != 0 ? null : str101;
        String str307 = (i4 & 512) != 0 ? null : str102;
        ArrayList arrayList10 = (i4 & 1024) != 0 ? null : arrayList3;
        ArrayList arrayList11 = (i4 & 2048) != 0 ? null : arrayList4;
        boolean z8 = (i4 & 4096) != 0 ? false : z2;
        String str308 = (i4 & 8192) != 0 ? "" : str103;
        String str309 = (i4 & 16384) != 0 ? "" : str104;
        String str310 = (i4 & 32768) != 0 ? "" : str105;
        String str311 = (i4 & 65536) != 0 ? "" : str106;
        String str312 = (i4 & 131072) != 0 ? null : str107;
        List list7 = (i4 & 262144) != 0 ? null : list;
        String str313 = (i4 & 524288) != 0 ? null : str108;
        String str314 = (i4 & 1048576) != 0 ? null : str109;
        String str315 = (i4 & 2097152) != 0 ? "" : str110;
        String str316 = (i4 & 4194304) != 0 ? "" : str111;
        String str317 = (i4 & 8388608) != 0 ? "" : str112;
        String str318 = (i4 & 16777216) != 0 ? "" : str113;
        String str319 = (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str114;
        TrailingConfig trailingConfig3 = (i4 & 67108864) != 0 ? null : trailingConfig;
        TrailingConfig trailingConfig4 = (i4 & 134217728) != 0 ? null : trailingConfig2;
        String str320 = (i4 & 268435456) != 0 ? null : str115;
        String str321 = (i4 & 536870912) != 0 ? null : str116;
        String str322 = (i4 & 1073741824) != 0 ? null : str117;
        String str323 = (i4 & Integer.MIN_VALUE) != 0 ? null : str118;
        String str324 = (i5 & 1) != 0 ? null : str119;
        String str325 = (i5 & 2) != 0 ? null : str120;
        List list8 = (i5 & 4) != 0 ? null : list2;
        String str326 = (i5 & 8) != 0 ? null : str121;
        String str327 = (i5 & 16) != 0 ? null : str122;
        String str328 = (i5 & 32) != 0 ? "" : str123;
        String str329 = (i5 & 64) != 0 ? "" : str124;
        String str330 = str323;
        String str331 = (i5 & 128) != 0 ? null : str125;
        String str332 = (i5 & 256) != 0 ? null : str126;
        String str333 = (i5 & 512) != 0 ? null : str127;
        String str334 = (i5 & 1024) != 0 ? null : str128;
        String str335 = (i5 & 2048) != 0 ? null : str129;
        String str336 = (i5 & 4096) != 0 ? null : str130;
        String str337 = (i5 & 8192) != 0 ? null : str131;
        String str338 = (i5 & 16384) != 0 ? null : str132;
        Boolean bool3 = (i5 & 32768) != 0 ? null : bool;
        String str339 = (i5 & 65536) != 0 ? null : str133;
        String str340 = (i5 & 131072) != 0 ? null : str134;
        EntrySignalOrderAmtParam entrySignalOrderAmtParam2 = (i5 & 262144) != 0 ? null : entrySignalOrderAmtParam;
        ExitSignalOrderAmtParam exitSignalOrderAmtParam2 = (i5 & 524288) != 0 ? null : exitSignalOrderAmtParam;
        String str341 = (i5 & 1048576) != 0 ? null : str135;
        String str342 = (i5 & 2097152) != 0 ? null : str136;
        boolean z9 = (i5 & 4194304) != 0 ? false : z3;
        String str343 = (i5 & 8388608) != 0 ? null : str137;
        String str344 = (i5 & 16777216) != 0 ? null : str138;
        String str345 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str139;
        String str346 = (i5 & 67108864) != 0 ? "" : str140;
        String str347 = (i5 & 134217728) != 0 ? "" : str141;
        String str348 = (i5 & 268435456) != 0 ? "" : str142;
        String str349 = (i5 & 536870912) != 0 ? "" : str143;
        boolean z10 = (i5 & 1073741824) != 0 ? false : z4;
        boolean z11 = (i5 & Integer.MIN_VALUE) != 0 ? false : z5;
        String str350 = (i6 & 1) != 0 ? null : str144;
        ExtendedBusinessInfo extendedBusinessInfo2 = (i6 & 2) != 0 ? null : extendedBusinessInfo;
        String str351 = (i6 & 4) != 0 ? null : str145;
        String str352 = (i6 & 8) != 0 ? null : str146;
        ArrayList arrayList12 = (i6 & 16) != 0 ? null : arrayList5;
        String str353 = (i6 & 32) != 0 ? null : str147;
        String str354 = (i6 & 64) != 0 ? null : str148;
        boolean z12 = z11;
        String str355 = (i6 & 128) != 0 ? null : str149;
        String str356 = (i6 & 256) != 0 ? null : str150;
        String str357 = (i6 & 512) != 0 ? null : str151;
        String str358 = (i6 & 1024) != 0 ? "" : str152;
        String str359 = (i6 & 2048) != 0 ? "" : str153;
        String str360 = (i6 & 4096) != 0 ? "" : str154;
        String str361 = (i6 & 8192) != 0 ? "" : str155;
        String str362 = (i6 & 16384) != 0 ? "" : str156;
        String str363 = (i6 & 32768) != 0 ? "" : str157;
        String str364 = (i6 & 65536) != 0 ? null : str158;
        String str365 = (i6 & 131072) != 0 ? null : str159;
        Boolean bool4 = (i6 & 262144) != 0 ? null : bool2;
        List list9 = (i6 & 524288) != 0 ? null : list3;
        TacticsVoucherInfo tacticsVoucherInfo2 = (i6 & 1048576) != 0 ? null : tacticsVoucherInfo;
        String str366 = (i6 & 2097152) != 0 ? null : str160;
        String str367 = (i6 & 4194304) != 0 ? null : str161;
        String str368 = (i6 & 8388608) != 0 ? "" : str162;
        String str369 = (i6 & 16777216) != 0 ? "" : str163;
        List list10 = (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : list4;
        String str370 = (i6 & 67108864) != 0 ? null : str164;
        String str371 = (i6 & 134217728) != 0 ? "" : str165;
        Long l2 = (i6 & 268435456) != 0 ? null : l;
        ArrayList arrayList13 = (i6 & 536870912) != 0 ? null : arrayList6;
        ArrayList arrayList14 = (i6 & 1073741824) != 0 ? null : arrayList7;
        String str372 = (i6 & Integer.MIN_VALUE) != 0 ? null : str166;
        this(str203, str204, str205, str206, str207, str208, str209, str210, str211, str212, str213, str214, str215, str216, str217, str218, str219, str220, str221, str222, str223, str224, str225, str226, str227, str228, str229, tpSlTriggerParamReqResp2, str230, str231, str232, str241, str234, str235, str236, str237, str238, str239, str240, str242, str243, str244, str245, str246, str247, str248, str249, str250, str251, str252, str253, str254, str255, str256, str257, str258, str259, str260, str261, str262, str263, str264, str265, str273, arrayList8, str267, str268, str269, str270, str271, str272, str274, str275, str276, str277, str278, str279, z7, str280, str281, str282, str283, arrayList9, str284, str285, str286, str287, str288, str289, str290, str291, str292, str293, str294, str295, str304, str297, str298, str299, str300, str301, str302, str303, str305, str306, str307, arrayList10, arrayList11, z8, str308, str309, str310, str311, str312, list7, str313, str314, str315, str316, str317, str318, str319, trailingConfig3, trailingConfig4, str320, str321, str322, str330, str324, str325, list8, str326, str327, str328, str329, str331, str332, str333, str334, str335, str336, str337, str338, bool3, str339, str340, entrySignalOrderAmtParam2, exitSignalOrderAmtParam2, str341, str342, z9, str343, str344, str345, str346, str347, str348, str349, z10, z12, str350, extendedBusinessInfo2, str351, str352, arrayList12, str353, str354, str355, str356, str357, str358, str359, str360, str361, str362, str363, str364, str365, bool4, list9, tacticsVoucherInfo2, str366, str367, str368, str369, list10, str370, str371, l2, arrayList13, arrayList14, str372, (i7 & 1) != 0 ? null : str167, (i7 & 2) != 0 ? null : str168, (i7 & 4) != 0 ? null : str169, (i7 & 8) != 0 ? null : str170, (i7 & 16) != 0 ? null : str171, (i7 & 32) != 0 ? null : str172, (i7 & 64) != 0 ? null : str173, (i7 & 128) != 0 ? null : str174, (i7 & 256) != 0 ? null : str175, (i7 & 512) != 0 ? null : str176, (i7 & 1024) != 0 ? null : str177, (i7 & 2048) != 0 ? null : str178, (i7 & 4096) != 0 ? null : str179, (i7 & 8192) != 0 ? null : str180, (i7 & 16384) != 0 ? null : str181, (i7 & 32768) != 0 ? null : str182, (i7 & 65536) != 0 ? null : str183, (i7 & 131072) != 0 ? null : str184, (i7 & 262144) != 0 ? null : str185, (i7 & 524288) != 0 ? null : str186, (i7 & 1048576) != 0 ? null : str187, (i7 & 2097152) != 0 ? null : str188, (i7 & 4194304) != 0 ? "" : str189, (i7 & 8388608) != 0 ? "" : str190, (i7 & 16777216) != 0 ? "" : str191, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str192, (i7 & 67108864) != 0 ? null : smartEarnParam, (i7 & 134217728) != 0 ? null : arbitrageTotalPnlInfo, (i7 & 268435456) != 0 ? null : f, (i7 & 536870912) != 0 ? null : str193, (i7 & 1073741824) != 0 ? false : z6, (i7 & Integer.MIN_VALUE) != 0 ? null : list5, (i8 & 1) != 0 ? "" : str194, (i8 & 2) != 0 ? null : str195, (i8 & 4) != 0 ? null : gridProfitAutoReinvestResponse, (i8 & 8) != 0 ? null : list6, (i8 & 16) != 0 ? null : strategyProfitResponse, (i8 & 32) != 0 ? null : str196, (i8 & 64) != 0 ? null : str197, (i8 & 128) != 0 ? null : str198, (i8 & 256) != 0 ? null : profitDetailResponse, (i8 & 512) != 0 ? null : profitDetailResponse2, (i8 & 1024) != 0 ? null : balanceDetailInfoDto, (i8 & 2048) != 0 ? "" : str199, (i8 & 4096) != 0 ? null : botVo, (i8 & 8192) != 0 ? null : strategyDcaEditResp, (i8 & 16384) == 0 ? str200 : null, (i8 & 32768) != 0 ? "" : str201, (i8 & 65536) != 0 ? "" : str202);
    }

    public final String getOrderType() {
        String str = this.ordType;
        return str.length() == 0 ? this.algoOrdType : str;
    }

    public final boolean isArbitrageWithStaking() {
        List<? extends SubArbitrageType4Remote> list = this.subArbTypes;
        return (list != null ? (SubArbitrageType4Remote) CollectionsKt___CollectionsKt.firstOrNull(list) : null) == SubArbitrageType4Remote.STAKE;
    }

    public final boolean getShouldShowEarn() {
        return (Intrinsics.EZpvd((Object) this.copyType, (Object) "2") || C56071xvr.gEmmrt.ejfBZ()) ? false : true;
    }

    public final Float getLeverPrincipal() {
        return C55770xqH.Activity.copydefault.EZpvd(this.leveragePrincipal);
    }

    public final String takeNonBlankTradeQuoteCcy() {
        String str = this.tradeQuoteCcy;
        if (str == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
            return null;
        }
        return str;
    }

    public final boolean getShouldShowAutoEarn() {
        return !C56071xvr.gEmmrt.ejfBZ();
    }

    public final boolean getShouldShowAutoStake() {
        return !C56071xvr.gEmmrt.ejfBZ();
    }

    public final List<String> getVipProfitState() {
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
        if (botVo2 != null && (common = botVo2.getCommon()) != null && (autoStaking = common.getAutoStaking()) != null && (isArbitrageWithStaking() || Intrinsics.EZpvd((Object) autoStaking.getStatus(), (Object) "earning"))) {
            arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompat));
        }
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xsP.formatAutoStake$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.Object):kotlin.Pair */
    public final boolean isStake() {
        Pair pairOLrzqt;
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        String strAEQbTJ = C56033xvF.AEQbTJ(this.instType, this.instId);
        BotVo botVo = this.bot;
        String status = null;
        if (((botVo == null || (common2 = botVo.getCommon()) == null) ? null : common2.getAutoStaking()) != null && getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = this.bot.getCommon().getAutoStaking();
            pairOLrzqt = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), this.instId, this.instType, strAEQbTJ, null, 32, null);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        String str = (String) pairOLrzqt.component1();
        ((Number) pairOLrzqt.component2()).intValue();
        BotVo botVo2 = this.bot;
        if (botVo2 != null && (common = botVo2.getCommon()) != null && (autoStaking = common.getAutoStaking()) != null) {
            status = autoStaking.getStatus();
        }
        return (C33129mqd.OLrzqt((CharSequence) str) && !Intrinsics.EZpvd((Object) status, (Object) "default") && C33129mqd.OLrzqt((CharSequence) status)) || isArbitrageWithStaking();
    }

    public static /* synthetic */ boolean isDetailsEarn$default(StrategyDetailsResponse strategyDetailsResponse, TacticsData tacticsData, int i, Object obj) {
        if ((i & 1) != 0) {
            tacticsData = null;
        }
        return strategyDetailsResponse.isDetailsEarn(tacticsData);
    }

    public final boolean isDetailsEarn(TacticsData tacticsData) {
        BotVo botVo;
        BotCommon common;
        AutoEarnStakingParam autoEarn;
        BotCommon common2;
        BotCommon common3;
        AutoEarnStakingParam autoEarn2;
        BotVo botVo2 = this.bot;
        String totalProfit = null;
        String status = (botVo2 == null || (common3 = botVo2.getCommon()) == null || (autoEarn2 = common3.getAutoEarn()) == null) ? null : autoEarn2.getStatus();
        if (getShouldShowAutoEarn()) {
            BotVo botVo3 = this.bot;
            if (((botVo3 == null || (common2 = botVo3.getCommon()) == null) ? null : common2.getAutoEarn()) != null && (botVo = this.bot) != null && (common = botVo.getCommon()) != null && (autoEarn = common.getAutoEarn()) != null) {
                totalProfit = autoEarn.getTotalProfit();
            }
        }
        return C56068xvo.copydefault.copydefault(totalProfit, status, Boolean.valueOf(this.isHistory));
    }
}

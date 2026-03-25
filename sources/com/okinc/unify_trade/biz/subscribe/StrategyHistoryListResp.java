package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.flyco.tablayout.BuildConfig;
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
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo$$serializer;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
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
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto$$serializer;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.SmartEarnParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C54536xML;
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
public final class StrategyHistoryListResp implements Parcelable, BizTradeStrategyInfo, TradeAllOrderApi {
    private static final KSerializer<Object>[] $childSerializers;
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
    private String apy;
    private String arbApy;
    private final ArrayList<SmartArbListItem> arbList;
    private final String arbPnl;
    private String arbitrageApy;
    private String arbitrageNum;
    private String arbitragePnl;
    private final ProfitDetailResponse arbitrageProfit;
    private String arbitrageProfitRate;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private Boolean associate;
    private String availableMargin;
    private String avgCost;
    private String avgDailyArbitrageNum;
    private String avgPx;
    private String balNum;
    private String balType;
    private final BalanceDetailInfoDto balanceDetails;
    private boolean basePos;
    private String baseSz;
    private String bizRefType;
    private final BotVo bot;
    private String cTime;
    private String callbackRatio;
    private String callbackSpread;
    private String cancelSourceReason;
    private String cancelType;
    private String ccy;
    private String closeFraction;
    private String coinPnl;
    private String completedCycles;
    private String copyType;
    private String createTime;
    private String ctVal;
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
    private String duration;
    private String earlyFillAmount;
    private String earlyFillCurrency;
    private String earlyFillPrice;
    private String earlyFillSettleTime;
    private String earlyFilledTime;
    private boolean endStatusFlag;
    private String eq;
    private String errCode;
    private String errMsg;
    private String estimateProfit;
    private String expiryTime;
    private final ExtendedBusinessInfo extendedBusinessInfo;
    private String extraMarginSz;
    private String failCode;
    private String failCodeReason;
    private final String fee;
    private String fillSafetyOrds;
    private String floatProfit;
    private String floatProfitInSourceCcy;
    private String floatingPnl;
    private String gridNum;
    private String gridProfit;
    private String gridProfitInSourceCcy;
    private String gridProfitRate;
    private String gridStatus;
    private final ArrayList<String> hiddenFeatures;
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
    private String last;
    private String lastPrice;
    private String lastSettlementSettledTime;
    private String lastTradeExpireTime;
    private StrategyProfitResponse latestProfit;
    private String lever;
    private final Float leveragePrincipal;
    private String liqPx;
    private String lmtOrderNumber;
    private String maxBotUsage;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private String moveTriggerPx;
    private String noClosePositionId;
    private String notional;
    private String notionalAmount;
    private String notionalAmountPrecision;
    private String notionalCcy;
    private String notionalCurrency;
    private final int numOfManualOrderInCycle;
    private String ordId;
    private String ordSource;
    private String ordType;
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
    private String quoteSz;
    private String recurringDay;
    private String recurringHour;
    private ArrayList<RecurringListItem> recurringList;
    private String recurringTime;
    private String reduceOnly;
    private boolean reinvestment;
    private Boolean reserveFunds;
    private final String ruleType;
    private String runPx;
    private String runType;
    private String settledTime;
    private String settlementAltAmount;
    private String settlementAltCurrency;
    private String settlementAmount;
    private String settlementCcy;
    private String settlementCurrency;
    private String settlementPrice;
    private String settlementPricePrecision;
    private String settlementTime;
    private String side;
    private ArrayList<SignParamItem> signParams;
    private String signalChanId;
    private String signalChanName;
    private String signalCount;
    private final SmartEarnParam simpleEarn;
    private String sizePrecision;
    private String slMode;
    private String slOrderPx;
    private String slPct;
    private String slPx;
    private String slRatio;
    private String slTriggerPx;
    private String slTriggerRatio;
    private String sourceAlgoId;
    private String sourceCcy;
    private String sourceCcySz;
    private String stakingPnl;
    private String stakingPnlApy;
    private String stakingPnlUSDT;
    private String stakingPosCcy;
    private final ProfitDetailResponse stakingProfit;
    private String state;
    private String status;
    private String stgyName;
    private String stopResult;
    private String stopType;
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
    private String tpPx;
    private String tpRatio;
    private String tpTriggerPx;
    private String tpTriggerRatio;
    private TpSlTriggerParamReqResp tpslTriggerParamResp;
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
    public static final Parcelable.Creator<StrategyHistoryListResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyHistoryListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyHistoryListResp createFromParcel(Parcel parcel) {
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
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
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
            TpSlTriggerParamReqResp tpSlTriggerParamReqRespCreateFromParcel = TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel);
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
            boolean z2 = parcel.readInt() != 0;
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
            String string71 = parcel.readString();
            String string72 = parcel.readString();
            String string73 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(i3);
            ArrayList arrayList13 = arrayList;
            int i4 = 0;
            while (i4 != i3) {
                arrayList12.add(RecurringListItem.CREATOR.createFromParcel(parcel));
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
            int i5 = parcel.readInt();
            ArrayList arrayList14 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList14.add(SmartPortfolioListItem.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
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
            String string103 = parcel.readString();
            String string104 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList14;
                arrayList3 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i7);
                arrayList2 = arrayList14;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList15.add(SignParamItem.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList3 = arrayList15;
            }
            String string105 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i9);
                arrayList4 = arrayList3;
                int i10 = 0;
                while (i10 != i9) {
                    arrayList16.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList5 = arrayList16;
            }
            String string106 = parcel.readString();
            String string107 = parcel.readString();
            String string108 = parcel.readString();
            String string109 = parcel.readString();
            String string110 = parcel.readString();
            String string111 = parcel.readString();
            String string112 = parcel.readString();
            String string113 = parcel.readString();
            String string114 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            TrailingConfig trailingConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            String string115 = parcel.readString();
            String string116 = parcel.readString();
            String string117 = parcel.readString();
            String string118 = parcel.readString();
            String string119 = parcel.readString();
            String string120 = parcel.readString();
            String string121 = parcel.readString();
            String string122 = parcel.readString();
            String string123 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string124 = parcel.readString();
            String string125 = parcel.readString();
            String string126 = parcel.readString();
            String string127 = parcel.readString();
            String string128 = parcel.readString();
            String string129 = parcel.readString();
            String string130 = parcel.readString();
            String string131 = parcel.readString();
            String string132 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
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
            String string147 = parcel.readString();
            String string148 = parcel.readString();
            String string149 = parcel.readString();
            String string150 = parcel.readString();
            String string151 = parcel.readString();
            String string152 = parcel.readString();
            String string153 = parcel.readString();
            String string154 = parcel.readString();
            String string155 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string156 = parcel.readString();
            String string157 = parcel.readString();
            String string158 = parcel.readString();
            String string159 = parcel.readString();
            String string160 = parcel.readString();
            String string161 = parcel.readString();
            String string162 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            String string163 = parcel.readString();
            String string164 = parcel.readString();
            String string165 = parcel.readString();
            ExtendedBusinessInfo extendedBusinessInfoCreateFromParcel = parcel.readInt() == 0 ? null : ExtendedBusinessInfo.CREATOR.createFromParcel(parcel);
            String string166 = parcel.readString();
            String string167 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i11);
                arrayList6 = arrayList5;
                int i12 = 0;
                while (i12 != i11) {
                    arrayList17.add(SmartArbListItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList7 = arrayList17;
            }
            String string168 = parcel.readString();
            String string169 = parcel.readString();
            String string170 = parcel.readString();
            String string171 = parcel.readString();
            String string172 = parcel.readString();
            TacticsVoucherInfo tacticsVoucherInfoCreateFromParcel = parcel.readInt() == 0 ? null : TacticsVoucherInfo.CREATOR.createFromParcel(parcel);
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
            boolean z5 = parcel.readInt() != 0;
            String string183 = parcel.readString();
            String string184 = parcel.readString();
            String string185 = parcel.readString();
            String string186 = parcel.readString();
            StrategyProfitResponse strategyProfitResponseCreateFromParcel = parcel.readInt() == 0 ? null : StrategyProfitResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList7;
                arrayList9 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i13);
                arrayList8 = arrayList7;
                int i14 = 0;
                while (i14 != i13) {
                    arrayList18.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                    i14++;
                    i13 = i13;
                }
                arrayList9 = arrayList18;
            }
            String string187 = parcel.readString();
            String string188 = parcel.readString();
            String string189 = parcel.readString();
            String string190 = parcel.readString();
            String string191 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList10 = arrayList9;
                arrayList11 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i15);
                arrayList10 = arrayList9;
                int i16 = 0;
                while (i16 != i15) {
                    arrayList19.add(SubArbitrageType4Remote.valueOf(parcel.readString()));
                    i16++;
                    i15 = i15;
                }
                arrayList11 = arrayList19;
            }
            return new StrategyHistoryListResp(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, tpSlTriggerParamReqRespCreateFromParcel, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, string59, z, string60, string61, string62, string63, string64, string65, string66, string67, string68, string69, string70, arrayList13, boolValueOf, string71, string72, string73, arrayList12, string74, string75, string76, string77, string78, string79, string80, string81, string82, arrayList2, string83, string84, string85, string86, string87, string88, string89, string90, string91, string92, string93, string94, string95, string96, string97, string98, string99, string100, string101, string102, string103, string104, arrayList4, string105, arrayList6, string106, string107, string108, string109, string110, string111, string112, string113, string114, boolValueOf2, trailingConfigCreateFromParcel, trailingConfigCreateFromParcel2, string115, string116, string117, string118, string119, string120, string121, string122, string123, arrayListCreateStringArrayList, string124, string125, string126, string127, string128, string129, string130, string131, string132, arrayListCreateStringArrayList2, string133, string134, string135, string136, string137, string138, string139, string140, string141, string142, string143, string144, string145, string146, string147, string148, string149, string150, string151, string152, string153, string154, string155, z3, string156, string157, string158, string159, string160, string161, string162, z4, string163, string164, string165, extendedBusinessInfoCreateFromParcel, string166, string167, arrayList8, string168, string169, string170, string171, string172, tacticsVoucherInfoCreateFromParcel, string173, string174, string175, string176, string177, string178, string179, string180, string181, string182, z5, string183, string184, string185, string186, strategyProfitResponseCreateFromParcel, arrayList10, string187, string188, string189, string190, string191, arrayList11, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BalanceDetailInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BotVo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyHistoryListResp[] newArray(int i) {
            return new StrategyHistoryListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyHistoryListResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (StrategyProfitResponse) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Float) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (BotVo) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getApy$annotations() {
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
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component100() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component101() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component102() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component103() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component104() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component105() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component106() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component107() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component108() {
        return this.maxBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component109() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component110() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignParamItem> component111() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component112() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component113() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component114() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component115() {
        return this.failCodeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component116() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component117() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component118() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component119() {
        return this.initPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component120() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component121() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component122() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component123() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component124() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component125() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component126() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component127() {
        return this.gridStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component128() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component129() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component130() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component131() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component132() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component133() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component134() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component135() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component136() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component137() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component138() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component139() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component140() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component141() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component142() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component143() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component144() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component145() {
        return this.hiddenFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component146() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component147() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component148() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component149() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component150() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component151() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component152() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component153() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component154() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component155() {
        return this.settlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component156() {
        return this.settlementAltAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component157() {
        return this.settlementAltCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component158() {
        return this.settlementPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component159() {
        return this.settledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component160() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component161() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component162() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component163() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component164() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component165() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component166() {
        return this.sizePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component167() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component168() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component169() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component170() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component171() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component172() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component173() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component174() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component175() {
        return this.earlyFillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component176() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component177() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component178() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component179() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component180() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo component181() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component182() {
        return this.arbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component183() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> component184() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component185() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component186() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component187() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component188() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component189() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo component190() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component191() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component192() {
        return this.dcdPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component193() {
        return this.dcdPnlRatio;
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
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component197() {
        return this.currencyBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component198() {
        return this.alternateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component199() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component200() {
        return this.coinPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component201() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component202() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component203() {
        return this.settlementCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component204() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component205() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component206() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component207() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component208() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component209() {
        return this.stakingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component210() {
        return this.stakingPnlUSDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component211() {
        return this.stakingPosCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component212() {
        return this.stakingPnlApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> component213() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component214() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component215() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component216() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component217() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component218() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component219() {
        return this.numOfManualOrderInCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component220() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component221() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component222() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component223() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component224() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component225() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component226() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto component227() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo component228() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component229() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component230() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component231() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component30() {
        return this.tpslTriggerParamResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.avgDailyArbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component61() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.floatProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.gridProfitInSourceCcy;
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
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> component78() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.cycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component83() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.recurringTime;
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
        return this.tdMode;
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
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, boolean z, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, List<ArbitrageOrderBean> list, Boolean bool, String str71, @NotNull String str72, @NotNull String str73, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str83, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, String str91, String str92, String str93, String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, @NotNull String str99, @NotNull String str100, @NotNull String str101, @NotNull String str102, @NotNull String str103, @NotNull String str104, ArrayList<SignParamItem> arrayList3, String str105, List<DcaTriggerParam> list2, @NotNull String str106, @NotNull String str107, @NotNull String str108, String str109, String str110, @NotNull String str111, @NotNull String str112, @NotNull String str113, @NotNull String str114, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, String str121, @NotNull String str122, String str123, ArrayList<String> arrayList4, String str124, String str125, String str126, String str127, String str128, String str129, String str130, @NotNull String str131, @NotNull String str132, ArrayList<String> arrayList5, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, boolean z2, @NotNull String str156, String str157, String str158, String str159, String str160, String str161, String str162, boolean z3, String str163, String str164, String str165, ExtendedBusinessInfo extendedBusinessInfo, String str166, String str167, ArrayList<SmartArbListItem> arrayList6, String str168, @NotNull String str169, @NotNull String str170, @NotNull String str171, String str172, TacticsVoucherInfo tacticsVoucherInfo, @NotNull String str173, @NotNull String str174, @NotNull String str175, @NotNull String str176, @NotNull String str177, @NotNull String str178, @NotNull String str179, @NotNull String str180, @NotNull String str181, @NotNull String str182, boolean z4, @NotNull String str183, @NotNull String str184, @NotNull String str185, @NotNull String str186, StrategyProfitResponse strategyProfitResponse, List<StrategyProfitResponse> list3, @NotNull String str187, String str188, String str189, @NotNull String str190, @NotNull String str191, List<? extends SubArbitrageType4Remote> list4, String str192, String str193, Float f, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str194, String str195, String str196, String str197, @NotNull String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, @NotNull String str199, @NotNull String str200, String str201) {
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
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
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(str84, "");
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str97, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str99, "");
        Intrinsics.checkNotNullParameter(str100, "");
        Intrinsics.checkNotNullParameter(str101, "");
        Intrinsics.checkNotNullParameter(str102, "");
        Intrinsics.checkNotNullParameter(str103, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str107, "");
        Intrinsics.checkNotNullParameter(str108, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str113, "");
        Intrinsics.checkNotNullParameter(str114, "");
        Intrinsics.checkNotNullParameter(str122, "");
        Intrinsics.checkNotNullParameter(str131, "");
        Intrinsics.checkNotNullParameter(str132, "");
        Intrinsics.checkNotNullParameter(str156, "");
        Intrinsics.checkNotNullParameter(str169, "");
        Intrinsics.checkNotNullParameter(str170, "");
        Intrinsics.checkNotNullParameter(str171, "");
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
        Intrinsics.checkNotNullParameter(str183, "");
        Intrinsics.checkNotNullParameter(str184, "");
        Intrinsics.checkNotNullParameter(str185, "");
        Intrinsics.checkNotNullParameter(str186, "");
        Intrinsics.checkNotNullParameter(str187, "");
        Intrinsics.checkNotNullParameter(str190, "");
        Intrinsics.checkNotNullParameter(str191, "");
        Intrinsics.checkNotNullParameter(str198, "");
        Intrinsics.checkNotNullParameter(str199, "");
        Intrinsics.checkNotNullParameter(str200, "");
        return new StrategyHistoryListResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, tpSlTriggerParamReqResp, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, z, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, list, bool, str71, str72, str73, arrayList, str74, str75, str76, str77, str78, str79, str80, str81, str82, arrayList2, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, arrayList3, str105, list2, str106, str107, str108, str109, str110, str111, str112, str113, str114, bool2, trailingConfig, trailingConfig2, str115, str116, str117, str118, str119, str120, str121, str122, str123, arrayList4, str124, str125, str126, str127, str128, str129, str130, str131, str132, arrayList5, str133, str134, str135, str136, str137, str138, str139, str140, str141, str142, str143, str144, str145, str146, str147, str148, str149, str150, str151, str152, str153, str154, str155, z2, str156, str157, str158, str159, str160, str161, str162, z3, str163, str164, str165, extendedBusinessInfo, str166, str167, arrayList6, str168, str169, str170, str171, str172, tacticsVoucherInfo, str173, str174, str175, str176, str177, str178, str179, str180, str181, str182, z4, str183, str184, str185, str186, strategyProfitResponse, list3, str187, str188, str189, str190, str191, list4, str192, str193, f, smartEarnParam, arbitrageTotalPnlInfo, i, str194, str195, str196, str197, str198, profitDetailResponse, profitDetailResponse2, balanceDetailInfoDto, botVo, str199, str200, str201);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String createTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curBaseSz() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curQuoteSz() {
        return "";
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
        if (!(obj instanceof StrategyHistoryListResp)) {
            return false;
        }
        StrategyHistoryListResp strategyHistoryListResp = (StrategyHistoryListResp) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) strategyHistoryListResp.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyHistoryListResp.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) strategyHistoryListResp.uly) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyHistoryListResp.ccy) && Intrinsics.EZpvd((Object) this.ctVal, (Object) strategyHistoryListResp.ctVal) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyHistoryListResp.ordId) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyHistoryListResp.algoId) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyHistoryListResp.ordType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyHistoryListResp.tdMode) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyHistoryListResp.lever) && Intrinsics.EZpvd((Object) this.state, (Object) strategyHistoryListResp.state) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) strategyHistoryListResp.triggerTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyHistoryListResp.cTime) && Intrinsics.EZpvd((Object) this.pxVar, (Object) strategyHistoryListResp.pxVar) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) strategyHistoryListResp.pxSpread) && Intrinsics.EZpvd((Object) this.szLimit, (Object) strategyHistoryListResp.szLimit) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) strategyHistoryListResp.pxLimit) && Intrinsics.EZpvd((Object) this.actualSz, (Object) strategyHistoryListResp.actualSz) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyHistoryListResp.sz) && Intrinsics.EZpvd((Object) this.side, (Object) strategyHistoryListResp.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyHistoryListResp.posSide) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) strategyHistoryListResp.timeInterval) && Intrinsics.EZpvd((Object) this.maxPx, (Object) strategyHistoryListResp.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) strategyHistoryListResp.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) strategyHistoryListResp.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) strategyHistoryListResp.runType) && Intrinsics.EZpvd((Object) this.runPx, (Object) strategyHistoryListResp.runPx) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) strategyHistoryListResp.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) strategyHistoryListResp.baseSz) && Intrinsics.EZpvd(this.tpslTriggerParamResp, strategyHistoryListResp.tpslTriggerParamResp) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) strategyHistoryListResp.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) strategyHistoryListResp.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) strategyHistoryListResp.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) strategyHistoryListResp.slRatio) && Intrinsics.EZpvd((Object) this.tpOrderPx, (Object) strategyHistoryListResp.tpOrderPx) && Intrinsics.EZpvd((Object) this.slOrderPx, (Object) strategyHistoryListResp.slOrderPx) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) strategyHistoryListResp.tradeNum) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyHistoryListResp.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyHistoryListResp.pnlRatio) && Intrinsics.EZpvd((Object) this.arbApy, (Object) strategyHistoryListResp.arbApy) && Intrinsics.EZpvd((Object) this.arbitrageApy, (Object) strategyHistoryListResp.arbitrageApy) && Intrinsics.EZpvd((Object) this.gridProfitRate, (Object) strategyHistoryListResp.gridProfitRate) && Intrinsics.EZpvd((Object) this.investment, (Object) strategyHistoryListResp.investment) && Intrinsics.EZpvd((Object) this.cancelType, (Object) strategyHistoryListResp.cancelType) && Intrinsics.EZpvd((Object) this.stopResult, (Object) strategyHistoryListResp.stopResult) && Intrinsics.EZpvd((Object) this.profitNum, (Object) strategyHistoryListResp.profitNum) && Intrinsics.EZpvd((Object) this.avgDailyArbitrageNum, (Object) strategyHistoryListResp.avgDailyArbitrageNum) && Intrinsics.EZpvd((Object) this.totalCycleProfit, (Object) strategyHistoryListResp.totalCycleProfit) && Intrinsics.EZpvd((Object) this.arbitragePnl, (Object) strategyHistoryListResp.arbitragePnl) && Intrinsics.EZpvd((Object) this.totalCycleProfitRate, (Object) strategyHistoryListResp.totalCycleProfitRate) && Intrinsics.EZpvd((Object) this.arbitrageNum, (Object) strategyHistoryListResp.arbitrageNum) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) strategyHistoryListResp.tgtCcy) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) strategyHistoryListResp.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) strategyHistoryListResp.callbackSpread) && Intrinsics.EZpvd((Object) this.activePx, (Object) strategyHistoryListResp.activePx) && Intrinsics.EZpvd((Object) this.activePxType, (Object) strategyHistoryListResp.activePxType) && Intrinsics.EZpvd((Object) this.moveTriggerPx, (Object) strategyHistoryListResp.moveTriggerPx) && Intrinsics.EZpvd((Object) this.last, (Object) strategyHistoryListResp.last) && Intrinsics.EZpvd((Object) this.uTime, (Object) strategyHistoryListResp.uTime) && Intrinsics.EZpvd((Object) this.direction, (Object) strategyHistoryListResp.direction) && this.basePos == strategyHistoryListResp.basePos && Intrinsics.EZpvd((Object) this.noClosePositionId, (Object) strategyHistoryListResp.noClosePositionId) && Intrinsics.EZpvd((Object) this.actualLever, (Object) strategyHistoryListResp.actualLever) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) strategyHistoryListResp.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) strategyHistoryListResp.extraMarginSz) && Intrinsics.EZpvd((Object) this.liqPx, (Object) strategyHistoryListResp.liqPx) && Intrinsics.EZpvd((Object) this.floatProfit, (Object) strategyHistoryListResp.floatProfit) && Intrinsics.EZpvd((Object) this.floatProfitInSourceCcy, (Object) strategyHistoryListResp.floatProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.eq, (Object) strategyHistoryListResp.eq) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) strategyHistoryListResp.gridProfit) && Intrinsics.EZpvd((Object) this.gridProfitInSourceCcy, (Object) strategyHistoryListResp.gridProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) strategyHistoryListResp.algoOrdType) && Intrinsics.EZpvd(this.instList, strategyHistoryListResp.instList) && Intrinsics.EZpvd(this.associate, strategyHistoryListResp.associate) && Intrinsics.EZpvd((Object) this.ordSource, (Object) strategyHistoryListResp.ordSource) && Intrinsics.EZpvd((Object) this.stgyName, (Object) strategyHistoryListResp.stgyName) && Intrinsics.EZpvd((Object) this.amt, (Object) strategyHistoryListResp.amt) && Intrinsics.EZpvd(this.recurringList, strategyHistoryListResp.recurringList) && Intrinsics.EZpvd((Object) this.period, (Object) strategyHistoryListResp.period) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) strategyHistoryListResp.recurringDay) && Intrinsics.EZpvd((Object) this.recurringHour, (Object) strategyHistoryListResp.recurringHour) && Intrinsics.EZpvd((Object) this.cycles, (Object) strategyHistoryListResp.cycles) && Intrinsics.EZpvd((Object) this.investCcy, (Object) strategyHistoryListResp.investCcy) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) strategyHistoryListResp.recurringTime) && Intrinsics.EZpvd((Object) this.investAmt, (Object) strategyHistoryListResp.investAmt) && Intrinsics.EZpvd((Object) this.duration, (Object) strategyHistoryListResp.duration) && Intrinsics.EZpvd((Object) this.investType, (Object) strategyHistoryListResp.investType) && Intrinsics.EZpvd(this.portfolioList, strategyHistoryListResp.portfolioList) && Intrinsics.EZpvd((Object) this.balType, (Object) strategyHistoryListResp.balType) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) strategyHistoryListResp.deltaRatio) && Intrinsics.EZpvd((Object) this.interval, (Object) strategyHistoryListResp.interval) && Intrinsics.EZpvd((Object) this.balNum, (Object) strategyHistoryListResp.balNum) && Intrinsics.EZpvd((Object) this.triggerType, (Object) strategyHistoryListResp.triggerType) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) strategyHistoryListResp.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) strategyHistoryListResp.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) strategyHistoryListResp.pxSteps) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) strategyHistoryListResp.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) strategyHistoryListResp.volMult) && Intrinsics.EZpvd((Object) this.tpPct, (Object) strategyHistoryListResp.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) strategyHistoryListResp.slPct) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyHistoryListResp.avgPx) && Intrinsics.EZpvd((Object) this.tpPx, (Object) strategyHistoryListResp.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) strategyHistoryListResp.slPx) && Intrinsics.EZpvd((Object) this.slMode, (Object) strategyHistoryListResp.slMode) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) strategyHistoryListResp.completedCycles) && Intrinsics.EZpvd((Object) this.investmentCcy, (Object) strategyHistoryListResp.investmentCcy) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) strategyHistoryListResp.investmentAmt) && Intrinsics.EZpvd((Object) this.maxBotUsage, (Object) strategyHistoryListResp.maxBotUsage) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) strategyHistoryListResp.closeFraction) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) strategyHistoryListResp.bizRefType) && Intrinsics.EZpvd(this.signParams, strategyHistoryListResp.signParams) && Intrinsics.EZpvd((Object) this.profit, (Object) strategyHistoryListResp.profit) && Intrinsics.EZpvd(this.triggerParams, strategyHistoryListResp.triggerParams) && Intrinsics.EZpvd((Object) this.failCode, (Object) strategyHistoryListResp.failCode) && Intrinsics.EZpvd((Object) this.failCodeReason, (Object) strategyHistoryListResp.failCodeReason) && Intrinsics.EZpvd((Object) this.cancelSourceReason, (Object) strategyHistoryListResp.cancelSourceReason) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) strategyHistoryListResp.sourceAlgoId) && Intrinsics.EZpvd((Object) this.stopType, (Object) strategyHistoryListResp.stopType) && Intrinsics.EZpvd((Object) this.initPx, (Object) strategyHistoryListResp.initPx) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) strategyHistoryListResp.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) strategyHistoryListResp.perMinProfitRate) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) strategyHistoryListResp.perMaxProfitRate) && Intrinsics.EZpvd(this.reserveFunds, strategyHistoryListResp.reserveFunds) && Intrinsics.EZpvd(this.trailingUpConfig, strategyHistoryListResp.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, strategyHistoryListResp.trailingDownConfig) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) strategyHistoryListResp.trailingDownFund) && Intrinsics.EZpvd((Object) this.gridStatus, (Object) strategyHistoryListResp.gridStatus) && Intrinsics.EZpvd((Object) this.lmtOrderNumber, (Object) strategyHistoryListResp.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.aggressiveness, (Object) strategyHistoryListResp.aggressiveness) && Intrinsics.EZpvd((Object) this.errMsg, (Object) strategyHistoryListResp.errMsg) && Intrinsics.EZpvd((Object) this.errCode, (Object) strategyHistoryListResp.errCode) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) strategyHistoryListResp.profitSharingRatio) && Intrinsics.EZpvd((Object) this.arbitrageProfitRate, (Object) strategyHistoryListResp.arbitrageProfitRate) && Intrinsics.EZpvd((Object) this.copyType, (Object) strategyHistoryListResp.copyType) && Intrinsics.EZpvd(this.instIds, strategyHistoryListResp.instIds) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) strategyHistoryListResp.totalAmt) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) strategyHistoryListResp.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) strategyHistoryListResp.signalChanName) && Intrinsics.EZpvd((Object) this.floatingPnl, (Object) strategyHistoryListResp.floatingPnl) && Intrinsics.EZpvd((Object) this.availableMargin, (Object) strategyHistoryListResp.availableMargin) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) strategyHistoryListResp.totalPnlRatio) && Intrinsics.EZpvd((Object) this.signalCount, (Object) strategyHistoryListResp.signalCount) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) strategyHistoryListResp.reduceOnly) && Intrinsics.EZpvd((Object) this.triggerLast, (Object) strategyHistoryListResp.triggerLast) && Intrinsics.EZpvd(this.hiddenFeatures, strategyHistoryListResp.hiddenFeatures) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) strategyHistoryListResp.alternativeCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) strategyHistoryListResp.currency) && Intrinsics.EZpvd((Object) this.createTime, (Object) strategyHistoryListResp.createTime) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) strategyHistoryListResp.expiryTime) && Intrinsics.EZpvd((Object) this.notionalAmount, (Object) strategyHistoryListResp.notionalAmount) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) strategyHistoryListResp.notionalCurrency) && Intrinsics.EZpvd((Object) this.participationRatio, (Object) strategyHistoryListResp.participationRatio) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) strategyHistoryListResp.settlementTime) && Intrinsics.EZpvd((Object) this.settlementAmount, (Object) strategyHistoryListResp.settlementAmount) && Intrinsics.EZpvd((Object) this.settlementCurrency, (Object) strategyHistoryListResp.settlementCurrency) && Intrinsics.EZpvd((Object) this.settlementAltAmount, (Object) strategyHistoryListResp.settlementAltAmount) && Intrinsics.EZpvd((Object) this.settlementAltCurrency, (Object) strategyHistoryListResp.settlementAltCurrency) && Intrinsics.EZpvd((Object) this.settlementPrice, (Object) strategyHistoryListResp.settlementPrice) && Intrinsics.EZpvd((Object) this.settledTime, (Object) strategyHistoryListResp.settledTime) && Intrinsics.EZpvd((Object) this.status, (Object) strategyHistoryListResp.status) && Intrinsics.EZpvd((Object) this.strike, (Object) strategyHistoryListResp.strike) && Intrinsics.EZpvd((Object) this.tradeId, (Object) strategyHistoryListResp.tradeId) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) strategyHistoryListResp.tradeSide) && Intrinsics.EZpvd((Object) this.timeLeft, (Object) strategyHistoryListResp.timeLeft) && Intrinsics.EZpvd((Object) this.notionalAmountPrecision, (Object) strategyHistoryListResp.notionalAmountPrecision) && Intrinsics.EZpvd((Object) this.sizePrecision, (Object) strategyHistoryListResp.sizePrecision) && Intrinsics.EZpvd((Object) this.strikePrecision, (Object) strategyHistoryListResp.strikePrecision) && Intrinsics.EZpvd((Object) this.settlementPricePrecision, (Object) strategyHistoryListResp.settlementPricePrecision) && this.endStatusFlag == strategyHistoryListResp.endStatusFlag && Intrinsics.EZpvd((Object) this.estimateProfit, (Object) strategyHistoryListResp.estimateProfit) && Intrinsics.EZpvd((Object) this.earlyFilledTime, (Object) strategyHistoryListResp.earlyFilledTime) && Intrinsics.EZpvd((Object) this.earlyFillAmount, (Object) strategyHistoryListResp.earlyFillAmount) && Intrinsics.EZpvd((Object) this.earlyFillCurrency, (Object) strategyHistoryListResp.earlyFillCurrency) && Intrinsics.EZpvd((Object) this.earlyFillSettleTime, (Object) strategyHistoryListResp.earlyFillSettleTime) && Intrinsics.EZpvd((Object) this.earlyFillPrice, (Object) strategyHistoryListResp.earlyFillPrice) && Intrinsics.EZpvd((Object) this.turnoverRatio, (Object) strategyHistoryListResp.turnoverRatio) && this.supportEarlyFill == strategyHistoryListResp.supportEarlyFill && Intrinsics.EZpvd((Object) this.symbolsNumber, (Object) strategyHistoryListResp.symbolsNumber) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) strategyHistoryListResp.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) strategyHistoryListResp.sourceCcySz) && Intrinsics.EZpvd(this.extendedBusinessInfo, strategyHistoryListResp.extendedBusinessInfo) && Intrinsics.EZpvd((Object) this.arbPnl, (Object) strategyHistoryListResp.arbPnl) && Intrinsics.EZpvd((Object) this.instFamily, (Object) strategyHistoryListResp.instFamily) && Intrinsics.EZpvd(this.arbList, strategyHistoryListResp.arbList) && Intrinsics.EZpvd((Object) this.totalFundingFeeRatio, (Object) strategyHistoryListResp.totalFundingFeeRatio) && Intrinsics.EZpvd((Object) this.pnlRatioInSourceCcy, (Object) strategyHistoryListResp.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.totalPnlInSourceCcy, (Object) strategyHistoryListResp.totalPnlInSourceCcy) && Intrinsics.EZpvd((Object) this.ruleType, (Object) strategyHistoryListResp.ruleType) && Intrinsics.EZpvd((Object) this.apy, (Object) strategyHistoryListResp.apy) && Intrinsics.EZpvd(this.voucherInfo, strategyHistoryListResp.voucherInfo) && Intrinsics.EZpvd((Object) this.dcdState, (Object) strategyHistoryListResp.dcdState) && Intrinsics.EZpvd((Object) this.dcdPnl, (Object) strategyHistoryListResp.dcdPnl) && Intrinsics.EZpvd((Object) this.dcdPnlRatio, (Object) strategyHistoryListResp.dcdPnlRatio) && Intrinsics.EZpvd((Object) this.notional, (Object) strategyHistoryListResp.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) strategyHistoryListResp.notionalCcy) && Intrinsics.EZpvd((Object) this.cycle, (Object) strategyHistoryListResp.cycle) && Intrinsics.EZpvd((Object) this.currencyBal, (Object) strategyHistoryListResp.currencyBal) && Intrinsics.EZpvd((Object) this.alternateCurrency, (Object) strategyHistoryListResp.alternateCurrency) && Intrinsics.EZpvd((Object) this.avgCost, (Object) strategyHistoryListResp.avgCost) && Intrinsics.EZpvd((Object) this.coinPnl, (Object) strategyHistoryListResp.coinPnl) && this.reinvestment == strategyHistoryListResp.reinvestment && Intrinsics.EZpvd((Object) this.lastPrice, (Object) strategyHistoryListResp.lastPrice) && Intrinsics.EZpvd((Object) this.settlementCcy, (Object) strategyHistoryListResp.settlementCcy) && Intrinsics.EZpvd((Object) this.lastTradeExpireTime, (Object) strategyHistoryListResp.lastTradeExpireTime) && Intrinsics.EZpvd((Object) this.lastSettlementSettledTime, (Object) strategyHistoryListResp.lastSettlementSettledTime) && Intrinsics.EZpvd(this.latestProfit, strategyHistoryListResp.latestProfit) && Intrinsics.EZpvd(this.profitSnapshots, strategyHistoryListResp.profitSnapshots) && Intrinsics.EZpvd((Object) this.pTime, (Object) strategyHistoryListResp.pTime) && Intrinsics.EZpvd((Object) this.stakingPnl, (Object) strategyHistoryListResp.stakingPnl) && Intrinsics.EZpvd((Object) this.stakingPnlUSDT, (Object) strategyHistoryListResp.stakingPnlUSDT) && Intrinsics.EZpvd((Object) this.stakingPosCcy, (Object) strategyHistoryListResp.stakingPosCcy) && Intrinsics.EZpvd((Object) this.stakingPnlApy, (Object) strategyHistoryListResp.stakingPnlApy) && Intrinsics.EZpvd(this.subArbTypes, strategyHistoryListResp.subArbTypes) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyHistoryListResp.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.displayId, (Object) strategyHistoryListResp.displayId) && Intrinsics.EZpvd(this.leveragePrincipal, strategyHistoryListResp.leveragePrincipal) && Intrinsics.EZpvd(this.simpleEarn, strategyHistoryListResp.simpleEarn) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, strategyHistoryListResp.arbitrageTotalPnlInfo) && this.numOfManualOrderInCycle == strategyHistoryListResp.numOfManualOrderInCycle && Intrinsics.EZpvd((Object) this.totalSpreadProfit, (Object) strategyHistoryListResp.totalSpreadProfit) && Intrinsics.EZpvd((Object) this.totalApy, (Object) strategyHistoryListResp.totalApy) && Intrinsics.EZpvd((Object) this.fee, (Object) strategyHistoryListResp.fee) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) strategyHistoryListResp.totalInterestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) strategyHistoryListResp.debtCcy) && Intrinsics.EZpvd(this.arbitrageProfit, strategyHistoryListResp.arbitrageProfit) && Intrinsics.EZpvd(this.stakingProfit, strategyHistoryListResp.stakingProfit) && Intrinsics.EZpvd(this.balanceDetails, strategyHistoryListResp.balanceDetails) && Intrinsics.EZpvd(this.bot, strategyHistoryListResp.bot) && Intrinsics.EZpvd((Object) this.tpTriggerRatio, (Object) strategyHistoryListResp.tpTriggerRatio) && Intrinsics.EZpvd((Object) this.slTriggerRatio, (Object) strategyHistoryListResp.slTriggerRatio) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) strategyHistoryListResp.advanceOrdType);
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbStakingError() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getArbiDisplayMinPaybackDays() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<FundingFeeApyItem> getArbiFundingFeeApyList() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbiHighestApyPeriod() {
        return null;
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
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getAutoMarginSwitch() {
        return false;
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
    public final String getBizRefType() {
        return this.bizRefType;
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
    public final String getCancelSourceReason() {
        return this.cancelSourceReason;
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
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
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
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcaSafetyOrdAmt() {
        return "";
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
    public final boolean getEndStatusFlag() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrCode() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrMsg() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getErrorMsg() {
        return this.errMsg;
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
    public final ExtendedBusinessInfo getExtendedBusinessInfo() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCode() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCodeReason() {
        return this.failCodeReason;
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getFilledPercent() {
        return null;
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
    public final String getFloatingPnl() {
        return this.floatingPnl;
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
    public String getIceAggressiveNess() {
        return this.aggressiveness;
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
    public final String getMoveTriggerPx() {
        return this.moveTriggerPx;
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
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCtVal() {
        return this.ctVal;
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public StrategyDcaEditResp getOrderEffectiveEditParametersDetails() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFailCodeReason() {
        return this.failCodeReason;
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

    public String getOrderFundingRate() {
        return null;
    }

    public String getOrderFundingTime() {
        return null;
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
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderNotionalUsd() {
        return "";
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
        return this.ruleType;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSlTriggerPx() {
        return this.slTriggerPx;
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<Integer> getOrderTags() {
        return null;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TpSlTriggerParamReqResp getOrderTpSlTriggerParam() {
        return this.tpslTriggerParamResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpTriggerPx() {
        return this.tpTriggerPx;
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
    public String getQuickMgnTypeInterval() {
        return "";
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
        return "";
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
    public final String getRuleType() {
        return this.ruleType;
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
    public final String getSettledTime() {
        return this.settledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAltAmount() {
        return this.settlementAltAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAltCurrency() {
        return this.settlementAltCurrency;
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
    public final String getSettlementCurrency() {
        return this.settlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementPrice() {
        return this.settlementPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementPricePrecision() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public EntrySignalOrderAmtParam getSignalAmtParam() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ExitSignalOrderAmtParam getSignalBotStopParam() {
        return null;
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
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
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
        return this.totalFundingFeeRatio;
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
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getStateByAll() {
        return "";
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
    public String getStopBotType() {
        return this.stopType;
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
    public final String getTpPx() {
        return this.tpPx;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getTpRange() {
        return null;
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
    public final String getTpTriggerRatio() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParamResp() {
        return this.tpslTriggerParamResp;
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
        int iHashCode3 = this.uly.hashCode();
        int iHashCode4 = this.ccy.hashCode();
        int iHashCode5 = this.ctVal.hashCode();
        int iHashCode6 = this.ordId.hashCode();
        int iHashCode7 = this.algoId.hashCode();
        int iHashCode8 = this.ordType.hashCode();
        int iHashCode9 = this.tdMode.hashCode();
        int iHashCode10 = this.lever.hashCode();
        int iHashCode11 = this.state.hashCode();
        int iHashCode12 = this.triggerTime.hashCode();
        int iHashCode13 = this.cTime.hashCode();
        int iHashCode14 = this.pxVar.hashCode();
        int iHashCode15 = this.pxSpread.hashCode();
        int iHashCode16 = this.szLimit.hashCode();
        int iHashCode17 = this.pxLimit.hashCode();
        int iHashCode18 = this.actualSz.hashCode();
        int iHashCode19 = this.sz.hashCode();
        int iHashCode20 = this.side.hashCode();
        int iHashCode21 = this.posSide.hashCode();
        int iHashCode22 = this.timeInterval.hashCode();
        int iHashCode23 = this.maxPx.hashCode();
        int iHashCode24 = this.minPx.hashCode();
        int iHashCode25 = this.gridNum.hashCode();
        int iHashCode26 = this.runType.hashCode();
        int iHashCode27 = this.runPx.hashCode();
        int iHashCode28 = this.quoteSz.hashCode();
        int iHashCode29 = this.baseSz.hashCode();
        int iHashCode30 = this.tpslTriggerParamResp.hashCode();
        int iHashCode31 = this.tpTriggerPx.hashCode();
        int iHashCode32 = this.slTriggerPx.hashCode();
        int iHashCode33 = this.tpRatio.hashCode();
        int iHashCode34 = this.slRatio.hashCode();
        int iHashCode35 = this.tpOrderPx.hashCode();
        int iHashCode36 = this.slOrderPx.hashCode();
        int iHashCode37 = this.tradeNum.hashCode();
        int iHashCode38 = this.totalPnl.hashCode();
        int iHashCode39 = this.pnlRatio.hashCode();
        int iHashCode40 = this.arbApy.hashCode();
        int iHashCode41 = this.arbitrageApy.hashCode();
        int iHashCode42 = this.gridProfitRate.hashCode();
        int iHashCode43 = this.investment.hashCode();
        int iHashCode44 = this.cancelType.hashCode();
        int iHashCode45 = this.stopResult.hashCode();
        int iHashCode46 = this.profitNum.hashCode();
        int iHashCode47 = this.avgDailyArbitrageNum.hashCode();
        int iHashCode48 = this.totalCycleProfit.hashCode();
        int iHashCode49 = this.arbitragePnl.hashCode();
        int iHashCode50 = this.totalCycleProfitRate.hashCode();
        int iHashCode51 = this.arbitrageNum.hashCode();
        String str = this.tgtCcy;
        int iHashCode52 = str == null ? 0 : str.hashCode();
        int iHashCode53 = this.callbackRatio.hashCode();
        int iHashCode54 = this.callbackSpread.hashCode();
        int iHashCode55 = this.activePx.hashCode();
        int iHashCode56 = this.activePxType.hashCode();
        int iHashCode57 = this.moveTriggerPx.hashCode();
        int iHashCode58 = this.last.hashCode();
        int iHashCode59 = this.uTime.hashCode();
        int iHashCode60 = this.direction.hashCode();
        int iHashCode61 = Boolean.hashCode(this.basePos);
        int iHashCode62 = this.noClosePositionId.hashCode();
        int iHashCode63 = this.actualLever.hashCode();
        int iHashCode64 = this.actualMarginSz.hashCode();
        int iHashCode65 = this.extraMarginSz.hashCode();
        int iHashCode66 = this.liqPx.hashCode();
        int iHashCode67 = this.floatProfit.hashCode();
        int iHashCode68 = this.floatProfitInSourceCcy.hashCode();
        int iHashCode69 = this.eq.hashCode();
        int iHashCode70 = this.gridProfit.hashCode();
        int iHashCode71 = this.gridProfitInSourceCcy.hashCode();
        int iHashCode72 = this.algoOrdType.hashCode();
        List<ArbitrageOrderBean> list = this.instList;
        int iHashCode73 = list == null ? 0 : list.hashCode();
        Boolean bool = this.associate;
        int iHashCode74 = bool == null ? 0 : bool.hashCode();
        String str2 = this.ordSource;
        int iHashCode75 = str2 == null ? 0 : str2.hashCode();
        int iHashCode76 = this.stgyName.hashCode();
        int iHashCode77 = this.amt.hashCode();
        int iHashCode78 = this.recurringList.hashCode();
        int iHashCode79 = this.period.hashCode();
        int iHashCode80 = this.recurringDay.hashCode();
        int iHashCode81 = this.recurringHour.hashCode();
        int iHashCode82 = this.cycles.hashCode();
        int iHashCode83 = this.investCcy.hashCode();
        int iHashCode84 = this.recurringTime.hashCode();
        int iHashCode85 = this.investAmt.hashCode();
        int iHashCode86 = this.duration.hashCode();
        int iHashCode87 = this.investType.hashCode();
        int iHashCode88 = this.portfolioList.hashCode();
        int iHashCode89 = this.balType.hashCode();
        int iHashCode90 = this.deltaRatio.hashCode();
        int iHashCode91 = this.interval.hashCode();
        int iHashCode92 = this.balNum.hashCode();
        int iHashCode93 = this.triggerType.hashCode();
        int iHashCode94 = this.maxSafetyOrds.hashCode();
        int iHashCode95 = this.fillSafetyOrds.hashCode();
        String str3 = this.pxSteps;
        int iHashCode96 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pxStepsMult;
        int iHashCode97 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.volMult;
        int iHashCode98 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tpPct;
        int iHashCode99 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slPct;
        int iHashCode100 = str7 == null ? 0 : str7.hashCode();
        int iHashCode101 = this.avgPx.hashCode();
        int iHashCode102 = this.tpPx.hashCode();
        int iHashCode103 = this.slPx.hashCode();
        int iHashCode104 = this.slMode.hashCode();
        int iHashCode105 = this.completedCycles.hashCode();
        int iHashCode106 = this.investmentCcy.hashCode();
        int iHashCode107 = this.investmentAmt.hashCode();
        int iHashCode108 = this.maxBotUsage.hashCode();
        int iHashCode109 = this.closeFraction.hashCode();
        int iHashCode110 = this.bizRefType.hashCode();
        ArrayList<SignParamItem> arrayList = this.signParams;
        int iHashCode111 = arrayList == null ? 0 : arrayList.hashCode();
        String str8 = this.profit;
        int iHashCode112 = str8 == null ? 0 : str8.hashCode();
        List<DcaTriggerParam> list2 = this.triggerParams;
        int iHashCode113 = list2 == null ? 0 : list2.hashCode();
        int iHashCode114 = this.failCode.hashCode();
        int iHashCode115 = this.failCodeReason.hashCode();
        int iHashCode116 = this.cancelSourceReason.hashCode();
        String str9 = this.sourceAlgoId;
        int iHashCode117 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.stopType;
        int iHashCode118 = str10 == null ? 0 : str10.hashCode();
        int iHashCode119 = this.initPx.hashCode();
        int iHashCode120 = this.perGridProfitRatio.hashCode();
        int iHashCode121 = this.perMinProfitRate.hashCode();
        int iHashCode122 = this.perMaxProfitRate.hashCode();
        Boolean bool2 = this.reserveFunds;
        int iHashCode123 = bool2 == null ? 0 : bool2.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode124 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode125 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str11 = this.trailingDownFund;
        int iHashCode126 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.gridStatus;
        int iHashCode127 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.lmtOrderNumber;
        int iHashCode128 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.aggressiveness;
        int iHashCode129 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.errMsg;
        int iHashCode130 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.errCode;
        int iHashCode131 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.profitSharingRatio;
        int iHashCode132 = str17 == null ? 0 : str17.hashCode();
        int iHashCode133 = this.arbitrageProfitRate.hashCode();
        String str18 = this.copyType;
        int iHashCode134 = str18 == null ? 0 : str18.hashCode();
        ArrayList<String> arrayList2 = this.instIds;
        int iHashCode135 = arrayList2 == null ? 0 : arrayList2.hashCode();
        String str19 = this.totalAmt;
        int iHashCode136 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.signalChanId;
        int iHashCode137 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.signalChanName;
        int iHashCode138 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.floatingPnl;
        int iHashCode139 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.availableMargin;
        int iHashCode140 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.totalPnlRatio;
        int iHashCode141 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.signalCount;
        int iHashCode142 = str25 == null ? 0 : str25.hashCode();
        int iHashCode143 = this.reduceOnly.hashCode();
        int iHashCode144 = this.triggerLast.hashCode();
        ArrayList<String> arrayList3 = this.hiddenFeatures;
        int iHashCode145 = arrayList3 == null ? 0 : arrayList3.hashCode();
        String str26 = this.alternativeCurrency;
        int iHashCode146 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.currency;
        int iHashCode147 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.createTime;
        int iHashCode148 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.expiryTime;
        int iHashCode149 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.notionalAmount;
        int iHashCode150 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.notionalCurrency;
        int iHashCode151 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.participationRatio;
        int iHashCode152 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.settlementTime;
        int iHashCode153 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.settlementAmount;
        int iHashCode154 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.settlementCurrency;
        int iHashCode155 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.settlementAltAmount;
        int iHashCode156 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.settlementAltCurrency;
        int iHashCode157 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.settlementPrice;
        int iHashCode158 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.settledTime;
        int iHashCode159 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.status;
        int iHashCode160 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.strike;
        int iHashCode161 = str41 == null ? 0 : str41.hashCode();
        String str42 = this.tradeId;
        int iHashCode162 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.tradeSide;
        int iHashCode163 = str43 == null ? 0 : str43.hashCode();
        String str44 = this.timeLeft;
        int iHashCode164 = str44 == null ? 0 : str44.hashCode();
        String str45 = this.notionalAmountPrecision;
        int iHashCode165 = str45 == null ? 0 : str45.hashCode();
        String str46 = this.sizePrecision;
        int iHashCode166 = str46 == null ? 0 : str46.hashCode();
        String str47 = this.strikePrecision;
        int iHashCode167 = str47 == null ? 0 : str47.hashCode();
        String str48 = this.settlementPricePrecision;
        int iHashCode168 = str48 == null ? 0 : str48.hashCode();
        int iHashCode169 = Boolean.hashCode(this.endStatusFlag);
        int iHashCode170 = this.estimateProfit.hashCode();
        String str49 = this.earlyFilledTime;
        int iHashCode171 = str49 == null ? 0 : str49.hashCode();
        String str50 = this.earlyFillAmount;
        int iHashCode172 = str50 == null ? 0 : str50.hashCode();
        String str51 = this.earlyFillCurrency;
        int iHashCode173 = str51 == null ? 0 : str51.hashCode();
        String str52 = this.earlyFillSettleTime;
        int iHashCode174 = str52 == null ? 0 : str52.hashCode();
        String str53 = this.earlyFillPrice;
        int iHashCode175 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.turnoverRatio;
        int iHashCode176 = str54 == null ? 0 : str54.hashCode();
        int iHashCode177 = Boolean.hashCode(this.supportEarlyFill);
        String str55 = this.symbolsNumber;
        int iHashCode178 = str55 == null ? 0 : str55.hashCode();
        String str56 = this.sourceCcy;
        int iHashCode179 = str56 == null ? 0 : str56.hashCode();
        String str57 = this.sourceCcySz;
        int iHashCode180 = str57 == null ? 0 : str57.hashCode();
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        int iHashCode181 = extendedBusinessInfo == null ? 0 : extendedBusinessInfo.hashCode();
        String str58 = this.arbPnl;
        int iHashCode182 = str58 == null ? 0 : str58.hashCode();
        String str59 = this.instFamily;
        int iHashCode183 = str59 == null ? 0 : str59.hashCode();
        ArrayList<SmartArbListItem> arrayList4 = this.arbList;
        int iHashCode184 = arrayList4 == null ? 0 : arrayList4.hashCode();
        String str60 = this.totalFundingFeeRatio;
        int iHashCode185 = str60 == null ? 0 : str60.hashCode();
        int iHashCode186 = this.pnlRatioInSourceCcy.hashCode();
        int iHashCode187 = this.totalPnlInSourceCcy.hashCode();
        int iHashCode188 = this.ruleType.hashCode();
        String str61 = this.apy;
        int iHashCode189 = str61 == null ? 0 : str61.hashCode();
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        int iHashCode190 = tacticsVoucherInfo == null ? 0 : tacticsVoucherInfo.hashCode();
        int iHashCode191 = this.dcdState.hashCode();
        int iHashCode192 = this.dcdPnl.hashCode();
        int iHashCode193 = this.dcdPnlRatio.hashCode();
        int iHashCode194 = this.notional.hashCode();
        int iHashCode195 = this.notionalCcy.hashCode();
        int iHashCode196 = this.cycle.hashCode();
        int iHashCode197 = this.currencyBal.hashCode();
        int iHashCode198 = this.alternateCurrency.hashCode();
        int iHashCode199 = this.avgCost.hashCode();
        int iHashCode200 = this.coinPnl.hashCode();
        int iHashCode201 = Boolean.hashCode(this.reinvestment);
        int iHashCode202 = this.lastPrice.hashCode();
        int iHashCode203 = this.settlementCcy.hashCode();
        int iHashCode204 = this.lastTradeExpireTime.hashCode();
        int iHashCode205 = this.lastSettlementSettledTime.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        int iHashCode206 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        List<StrategyProfitResponse> list3 = this.profitSnapshots;
        int iHashCode207 = list3 == null ? 0 : list3.hashCode();
        int iHashCode208 = this.pTime.hashCode();
        String str62 = this.stakingPnl;
        int iHashCode209 = str62 == null ? 0 : str62.hashCode();
        String str63 = this.stakingPnlUSDT;
        int iHashCode210 = str63 == null ? 0 : str63.hashCode();
        int iHashCode211 = this.stakingPosCcy.hashCode();
        int iHashCode212 = this.stakingPnlApy.hashCode();
        List<? extends SubArbitrageType4Remote> list4 = this.subArbTypes;
        int iHashCode213 = list4 == null ? 0 : list4.hashCode();
        String str64 = this.tradeQuoteCcy;
        int iHashCode214 = str64 == null ? 0 : str64.hashCode();
        String str65 = this.displayId;
        int iHashCode215 = str65 == null ? 0 : str65.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode216 = f == null ? 0 : f.hashCode();
        SmartEarnParam smartEarnParam = this.simpleEarn;
        int iHashCode217 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode218 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        int iHashCode219 = Integer.hashCode(this.numOfManualOrderInCycle);
        String str66 = this.totalSpreadProfit;
        int iHashCode220 = str66 == null ? 0 : str66.hashCode();
        String str67 = this.totalApy;
        int iHashCode221 = str67 == null ? 0 : str67.hashCode();
        String str68 = this.fee;
        int iHashCode222 = str68 == null ? 0 : str68.hashCode();
        String str69 = this.totalInterestAmt;
        int iHashCode223 = str69 == null ? 0 : str69.hashCode();
        int iHashCode224 = this.debtCcy.hashCode();
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        int iHashCode225 = profitDetailResponse == null ? 0 : profitDetailResponse.hashCode();
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        int iHashCode226 = profitDetailResponse2 == null ? 0 : profitDetailResponse2.hashCode();
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        int iHashCode227 = balanceDetailInfoDto == null ? 0 : balanceDetailInfoDto.hashCode();
        BotVo botVo = this.bot;
        int iHashCode228 = botVo == null ? 0 : botVo.hashCode();
        int iHashCode229 = this.tpTriggerRatio.hashCode();
        int iHashCode230 = this.slTriggerRatio.hashCode();
        String str70 = this.advanceOrdType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + iHashCode100) * 31) + iHashCode101) * 31) + iHashCode102) * 31) + iHashCode103) * 31) + iHashCode104) * 31) + iHashCode105) * 31) + iHashCode106) * 31) + iHashCode107) * 31) + iHashCode108) * 31) + iHashCode109) * 31) + iHashCode110) * 31) + iHashCode111) * 31) + iHashCode112) * 31) + iHashCode113) * 31) + iHashCode114) * 31) + iHashCode115) * 31) + iHashCode116) * 31) + iHashCode117) * 31) + iHashCode118) * 31) + iHashCode119) * 31) + iHashCode120) * 31) + iHashCode121) * 31) + iHashCode122) * 31) + iHashCode123) * 31) + iHashCode124) * 31) + iHashCode125) * 31) + iHashCode126) * 31) + iHashCode127) * 31) + iHashCode128) * 31) + iHashCode129) * 31) + iHashCode130) * 31) + iHashCode131) * 31) + iHashCode132) * 31) + iHashCode133) * 31) + iHashCode134) * 31) + iHashCode135) * 31) + iHashCode136) * 31) + iHashCode137) * 31) + iHashCode138) * 31) + iHashCode139) * 31) + iHashCode140) * 31) + iHashCode141) * 31) + iHashCode142) * 31) + iHashCode143) * 31) + iHashCode144) * 31) + iHashCode145) * 31) + iHashCode146) * 31) + iHashCode147) * 31) + iHashCode148) * 31) + iHashCode149) * 31) + iHashCode150) * 31) + iHashCode151) * 31) + iHashCode152) * 31) + iHashCode153) * 31) + iHashCode154) * 31) + iHashCode155) * 31) + iHashCode156) * 31) + iHashCode157) * 31) + iHashCode158) * 31) + iHashCode159) * 31) + iHashCode160) * 31) + iHashCode161) * 31) + iHashCode162) * 31) + iHashCode163) * 31) + iHashCode164) * 31) + iHashCode165) * 31) + iHashCode166) * 31) + iHashCode167) * 31) + iHashCode168) * 31) + iHashCode169) * 31) + iHashCode170) * 31) + iHashCode171) * 31) + iHashCode172) * 31) + iHashCode173) * 31) + iHashCode174) * 31) + iHashCode175) * 31) + iHashCode176) * 31) + iHashCode177) * 31) + iHashCode178) * 31) + iHashCode179) * 31) + iHashCode180) * 31) + iHashCode181) * 31) + iHashCode182) * 31) + iHashCode183) * 31) + iHashCode184) * 31) + iHashCode185) * 31) + iHashCode186) * 31) + iHashCode187) * 31) + iHashCode188) * 31) + iHashCode189) * 31) + iHashCode190) * 31) + iHashCode191) * 31) + iHashCode192) * 31) + iHashCode193) * 31) + iHashCode194) * 31) + iHashCode195) * 31) + iHashCode196) * 31) + iHashCode197) * 31) + iHashCode198) * 31) + iHashCode199) * 31) + iHashCode200) * 31) + iHashCode201) * 31) + iHashCode202) * 31) + iHashCode203) * 31) + iHashCode204) * 31) + iHashCode205) * 31) + iHashCode206) * 31) + iHashCode207) * 31) + iHashCode208) * 31) + iHashCode209) * 31) + iHashCode210) * 31) + iHashCode211) * 31) + iHashCode212) * 31) + iHashCode213) * 31) + iHashCode214) * 31) + iHashCode215) * 31) + iHashCode216) * 31) + iHashCode217) * 31) + iHashCode218) * 31) + iHashCode219) * 31) + iHashCode220) * 31) + iHashCode221) * 31) + iHashCode222) * 31) + iHashCode223) * 31) + iHashCode224) * 31) + iHashCode225) * 31) + iHashCode226) * 31) + iHashCode227) * 31) + iHashCode228) * 31) + iHashCode229) * 31) + iHashCode230) * 31) + (str70 != null ? str70.hashCode() : 0);
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

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean isBorrowMode() {
        return null;
    }

    @Override // o.InterfaceC55726xpQ
    public boolean isDexOrder() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public boolean isHistoryOrder() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String isNeedPostWarning() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isOutOfRange() {
        return false;
    }

    public boolean isPinned() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isShowTWapTips() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isStop() {
        return true;
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
    public final void setApy(String str) {
        this.apy = str;
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
    public final void setAssociate(Boolean bool) {
        this.associate = bool;
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
    public final void setBizRefType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizRefType = str;
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
    public final void setCancelSourceReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelSourceReason = str;
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
    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
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
    public final void setErrCode(String str) {
        this.errCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrMsg(String str) {
        this.errMsg = str;
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
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCodeReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failCodeReason = str;
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
    public final void setLastPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
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
    public final void setLiqPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLmtOrderNumber(String str) {
        this.lmtOrderNumber = str;
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
    public final void setMoveTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moveTriggerPx = str;
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
    public final void setSettledTime(String str) {
        this.settledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAltAmount(String str) {
        this.settlementAltAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAltCurrency(String str) {
        this.settlementAltCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAmount(String str) {
        this.settlementAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settlementCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementCurrency(String str) {
        this.settlementCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementPrice(String str) {
        this.settlementPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementPricePrecision(String str) {
        this.settlementPricePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementTime(String str) {
        this.settlementTime = str;
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
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
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
    public final void setTpTriggerRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParamResp(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
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
        return this.settlementCcy;
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
        return ("StrategyHistoryListResp(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", ccy=" + this.ccy + ", ctVal=" + this.ctVal + ", ordId=" + this.ordId + ", algoId=" + this.algoId + ", ordType=" + this.ordType + ", tdMode=" + this.tdMode + ", lever=" + this.lever + ", state=" + this.state + ", triggerTime=" + this.triggerTime + ", cTime=" + this.cTime + ", pxVar=" + this.pxVar + ", pxSpread=" + this.pxSpread + ", szLimit=" + this.szLimit + ", pxLimit=" + this.pxLimit + ", actualSz=" + this.actualSz + ", sz=" + this.sz + ", side=" + this.side + ", posSide=" + this.posSide + ", timeInterval=" + this.timeInterval + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", runPx=" + this.runPx + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", tpslTriggerParamResp=" + this.tpslTriggerParamResp + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", tpOrderPx=" + this.tpOrderPx + ", slOrderPx=" + this.slOrderPx + ", tradeNum=" + this.tradeNum + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", arbApy=" + this.arbApy + ", arbitrageApy=" + this.arbitrageApy + ", gridProfitRate=" + this.gridProfitRate + ", investment=" + this.investment + ", cancelType=" + this.cancelType + ", stopResult=" + this.stopResult + ", profitNum=" + this.profitNum + ", avgDailyArbitrageNum=" + this.avgDailyArbitrageNum + ", totalCycleProfit=" + this.totalCycleProfit + ", arbitragePnl=" + this.arbitragePnl + ", totalCycleProfitRate=" + this.totalCycleProfitRate + ", arbitrageNum=" + this.arbitrageNum + ", tgtCcy=" + this.tgtCcy + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", activePx=" + this.activePx + ", activePxType=" + this.activePxType + ", moveTriggerPx=" + this.moveTriggerPx + ", last=" + this.last + ", uTime=" + this.uTime + ", direction=" + this.direction + ", basePos=" + this.basePos + ", noClosePositionId=" + this.noClosePositionId + ", actualLever=" + this.actualLever + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", liqPx=" + this.liqPx + ", floatProfit=" + this.floatProfit + ", floatProfitInSourceCcy=" + this.floatProfitInSourceCcy + ", eq=" + this.eq + ", gridProfit=" + this.gridProfit + ", gridProfitInSourceCcy=" + this.gridProfitInSourceCcy + ", algoOrdType=" + this.algoOrdType + ", instList=" + this.instList + ", associate=" + this.associate + ", ordSource=" + this.ordSource + ", stgyName=" + this.stgyName + ", amt=" + this.amt + ", recurringList=" + this.recurringList + ", period=" + this.period + ", recurringDay=" + this.recurringDay + ", recurringHour=" + this.recurringHour + ", cycles=" + this.cycles + ", investCcy=" + this.investCcy + ", recurringTime=" + this.recurringTime + ", investAmt=" + this.investAmt + ", duration=" + this.duration + ", investType=" + this.investType + ", portfolioList=" + this.portfolioList + ", balType=" + this.balType + ", deltaRatio=" + this.deltaRatio + ", interval=" + this.interval + ", balNum=" + this.balNum + ", triggerType=" + this.triggerType + ", maxSafetyOrds=" + this.maxSafetyOrds + ", fillSafetyOrds=" + this.fillSafetyOrds + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", avgPx=" + this.avgPx + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", slMode=" + this.slMode + ", completedCycles=" + this.completedCycles + ", investmentCcy=" + this.investmentCcy + ", investmentAmt=" + this.investmentAmt + ", maxBotUsage=" + this.maxBotUsage + ", closeFraction=" + this.closeFraction + ", bizRefType=" + this.bizRefType + ", signParams=" + this.signParams + ", profit=" + this.profit + ", triggerParams=" + this.triggerParams + ", failCode=" + this.failCode + ", failCodeReason=" + this.failCodeReason + ", cancelSourceReason=" + this.cancelSourceReason + ", sourceAlgoId=" + this.sourceAlgoId + ", stopType=" + this.stopType + ", initPx=" + this.initPx + ", perGridProfitRatio=" + this.perGridProfitRatio + ", perMinProfitRate=" + this.perMinProfitRate + ", perMaxProfitRate=" + this.perMaxProfitRate + ", reserveFunds=" + this.reserveFunds + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", trailingDownFund=" + this.trailingDownFund + ", gridStatus=" + this.gridStatus + ", lmtOrderNumber=" + this.lmtOrderNumber + ", aggressiveness=" + this.aggressiveness + ", errMsg=" + this.errMsg + ", errCode=" + this.errCode + ", profitSharingRatio=" + this.profitSharingRatio + ", arbitrageProfitRate=" + this.arbitrageProfitRate + ", copyType=" + this.copyType + ", instIds=" + this.instIds + ", totalAmt=" + this.totalAmt + ", signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", floatingPnl=" + this.floatingPnl + ", availableMargin=" + this.availableMargin + ", totalPnlRatio=" + this.totalPnlRatio + ", signalCount=" + this.signalCount + ", reduceOnly=" + this.reduceOnly + ", triggerLast=" + this.triggerLast + ", hiddenFeatures=" + this.hiddenFeatures + ", alternativeCurrency=" + this.alternativeCurrency + ", currency=" + this.currency + ", createTime=" + this.createTime + ", expiryTime=" + this.expiryTime + ", notionalAmount=" + this.notionalAmount + ", notionalCurrency=" + this.notionalCurrency + ", participationRatio=" + this.participationRatio + ", settlementTime=" + this.settlementTime + ", settlementAmount=" + this.settlementAmount + ", settlementCurrency=" + this.settlementCurrency + ", settlementAltAmount=" + this.settlementAltAmount + ", settlementAltCurrency=" + this.settlementAltCurrency + ", settlementPrice=" + this.settlementPrice + ", settledTime=" + this.settledTime + ", status=" + this.status + ", strike=" + this.strike + ", tradeId=" + this.tradeId + ", tradeSide=" + this.tradeSide + ", timeLeft=" + this.timeLeft + ", notionalAmountPrecision=" + this.notionalAmountPrecision + ", sizePrecision=" + this.sizePrecision + ", strikePrecision=" + this.strikePrecision + ", settlementPricePrecision=" + this.settlementPricePrecision + ", endStatusFlag=" + this.endStatusFlag + ", estimateProfit=" + this.estimateProfit + ", earlyFilledTime=" + this.earlyFilledTime + ", earlyFillAmount=" + this.earlyFillAmount + ", earlyFillCurrency=" + this.earlyFillCurrency + ", earlyFillSettleTime=" + this.earlyFillSettleTime + ", earlyFillPrice=" + this.earlyFillPrice + ", turnoverRatio=" + this.turnoverRatio + ", supportEarlyFill=" + this.supportEarlyFill + ", symbolsNumber=" + this.symbolsNumber + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", extendedBusinessInfo=" + this.extendedBusinessInfo + ", arbPnl=" + this.arbPnl + ", instFamily=" + this.instFamily + ", arbList=" + this.arbList + ", totalFundingFeeRatio=" + this.totalFundingFeeRatio + ", pnlRatioInSourceCcy=" + this.pnlRatioInSourceCcy + ", totalPnlInSourceCcy=" + this.totalPnlInSourceCcy + ", ruleType=" + this.ruleType + ", apy=" + this.apy + ", voucherInfo=" + this.voucherInfo + ", dcdState=" + this.dcdState + ", dcdPnl=" + this.dcdPnl + ", dcdPnlRatio=" + this.dcdPnlRatio + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", cycle=" + this.cycle + ", currencyBal=" + this.currencyBal + ", alternateCurrency=" + this.alternateCurrency + ", avgCost=" + this.avgCost) + ", coinPnl=" + this.coinPnl + ", reinvestment=" + this.reinvestment + ", lastPrice=" + this.lastPrice + ", settlementCcy=" + this.settlementCcy + ", lastTradeExpireTime=" + this.lastTradeExpireTime + ", lastSettlementSettledTime=" + this.lastSettlementSettledTime + ", latestProfit=" + this.latestProfit + ", profitSnapshots=" + this.profitSnapshots + ", pTime=" + this.pTime + ", stakingPnl=" + this.stakingPnl + ", stakingPnlUSDT=" + this.stakingPnlUSDT + ", stakingPosCcy=" + this.stakingPosCcy + ", stakingPnlApy=" + this.stakingPnlApy + ", subArbTypes=" + this.subArbTypes + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", displayId=" + this.displayId + ", leveragePrincipal=" + this.leveragePrincipal + ", simpleEarn=" + this.simpleEarn + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", numOfManualOrderInCycle=" + this.numOfManualOrderInCycle + ", totalSpreadProfit=" + this.totalSpreadProfit + ", totalApy=" + this.totalApy + ", fee=" + this.fee + ", totalInterestAmt=" + this.totalInterestAmt + ", debtCcy=" + this.debtCcy + ", arbitrageProfit=" + this.arbitrageProfit + ", stakingProfit=" + this.stakingProfit + ", balanceDetails=" + this.balanceDetails + ", bot=" + this.bot + ", tpTriggerRatio=" + this.tpTriggerRatio + ", slTriggerRatio=" + this.slTriggerRatio + ", advanceOrdType=" + this.advanceOrdType + ")";
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
        parcel.writeString(this.uly);
        parcel.writeString(this.ccy);
        parcel.writeString(this.ctVal);
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
        this.tpslTriggerParamResp.writeToParcel(parcel, i);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.tpOrderPx);
        parcel.writeString(this.slOrderPx);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.arbApy);
        parcel.writeString(this.arbitrageApy);
        parcel.writeString(this.gridProfitRate);
        parcel.writeString(this.investment);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.stopResult);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.avgDailyArbitrageNum);
        parcel.writeString(this.totalCycleProfit);
        parcel.writeString(this.arbitragePnl);
        parcel.writeString(this.totalCycleProfitRate);
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
        parcel.writeString(this.liqPx);
        parcel.writeString(this.floatProfit);
        parcel.writeString(this.floatProfitInSourceCcy);
        parcel.writeString(this.eq);
        parcel.writeString(this.gridProfit);
        parcel.writeString(this.gridProfitInSourceCcy);
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
        parcel.writeString(this.ordSource);
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
        parcel.writeString(this.recurringHour);
        parcel.writeString(this.cycles);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.recurringTime);
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
        parcel.writeString(this.triggerType);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.fillSafetyOrds);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        parcel.writeString(this.slMode);
        parcel.writeString(this.completedCycles);
        parcel.writeString(this.investmentCcy);
        parcel.writeString(this.investmentAmt);
        parcel.writeString(this.maxBotUsage);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.bizRefType);
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
        parcel.writeString(this.failCode);
        parcel.writeString(this.failCodeReason);
        parcel.writeString(this.cancelSourceReason);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.stopType);
        parcel.writeString(this.initPx);
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
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
        parcel.writeString(this.errMsg);
        parcel.writeString(this.errCode);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.arbitrageProfitRate);
        parcel.writeString(this.copyType);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.floatingPnl);
        parcel.writeString(this.availableMargin);
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.signalCount);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.triggerLast);
        parcel.writeStringList(this.hiddenFeatures);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.currency);
        parcel.writeString(this.createTime);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.notionalAmount);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.participationRatio);
        parcel.writeString(this.settlementTime);
        parcel.writeString(this.settlementAmount);
        parcel.writeString(this.settlementCurrency);
        parcel.writeString(this.settlementAltAmount);
        parcel.writeString(this.settlementAltCurrency);
        parcel.writeString(this.settlementPrice);
        parcel.writeString(this.settledTime);
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
        parcel.writeString(this.symbolsNumber);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.sourceCcySz);
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        if (extendedBusinessInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedBusinessInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.arbPnl);
        parcel.writeString(this.instFamily);
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
        parcel.writeString(this.pnlRatioInSourceCcy);
        parcel.writeString(this.totalPnlInSourceCcy);
        parcel.writeString(this.ruleType);
        parcel.writeString(this.apy);
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        if (tacticsVoucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherInfo.writeToParcel(parcel, i);
        }
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
        parcel.writeInt(this.reinvestment ? 1 : 0);
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.settlementCcy);
        parcel.writeString(this.lastTradeExpireTime);
        parcel.writeString(this.lastSettlementSettledTime);
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        if (strategyProfitResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyProfitResponse.writeToParcel(parcel, i);
        }
        List<StrategyProfitResponse> list3 = this.profitSnapshots;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<StrategyProfitResponse> it7 = list3.iterator();
            while (it7.hasNext()) {
                it7.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.pTime);
        parcel.writeString(this.stakingPnl);
        parcel.writeString(this.stakingPnlUSDT);
        parcel.writeString(this.stakingPosCcy);
        parcel.writeString(this.stakingPnlApy);
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
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.displayId);
        Float f = this.leveragePrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
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
        parcel.writeInt(this.numOfManualOrderInCycle);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyHistoryListResp> serializer() {
            return StrategyHistoryListResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ArbitrageOrderBean$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(RecurringListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartPortfolioListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SignParamItem$$serializer.INSTANCE), null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(SubArbitrageType4Remote.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ StrategyHistoryListResp(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, boolean z, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, List list, Boolean bool, String str71, String str72, String str73, ArrayList arrayList, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList arrayList2, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, String str103, String str104, ArrayList arrayList3, String str105, List list2, String str106, String str107, String str108, String str109, String str110, String str111, String str112, String str113, String str114, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, String str121, String str122, String str123, ArrayList arrayList4, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, ArrayList arrayList5, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, boolean z2, String str156, String str157, String str158, String str159, String str160, String str161, String str162, boolean z3, String str163, String str164, String str165, ExtendedBusinessInfo extendedBusinessInfo, String str166, String str167, ArrayList arrayList6, String str168, String str169, String str170, String str171, String str172, TacticsVoucherInfo tacticsVoucherInfo, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, boolean z4, String str183, String str184, String str185, String str186, StrategyProfitResponse strategyProfitResponse, List list3, String str187, String str188, String str189, String str190, String str191, List list4, String str192, String str193, Float f, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i9, String str194, String str195, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, String str199, String str200, String str201, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.ordType = "";
        } else {
            this.ordType = str8;
        }
        if ((i & 256) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str9;
        }
        if ((i & 512) == 0) {
            this.lever = "";
        } else {
            this.lever = str10;
        }
        if ((i & 1024) == 0) {
            this.state = "";
        } else {
            this.state = str11;
        }
        if ((i & 2048) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str12;
        }
        if ((i & 4096) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str13;
        }
        if ((i & 8192) == 0) {
            this.pxVar = "";
        } else {
            this.pxVar = str14;
        }
        if ((i & 16384) == 0) {
            this.pxSpread = "";
        } else {
            this.pxSpread = str15;
        }
        if ((i & 32768) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str16;
        }
        if ((i & 65536) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str17;
        }
        if ((i & 131072) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str18;
        }
        if ((i & 262144) == 0) {
            this.sz = "";
        } else {
            this.sz = str19;
        }
        if ((i & 524288) == 0) {
            this.side = "";
        } else {
            this.side = str20;
        }
        if ((1048576 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str21;
        }
        if ((2097152 & i) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str22;
        }
        if ((4194304 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str23;
        }
        if ((8388608 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str24;
        }
        if ((16777216 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str25;
        }
        if ((33554432 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str26;
        }
        if ((67108864 & i) == 0) {
            this.runPx = "";
        } else {
            this.runPx = str27;
        }
        if ((134217728 & i) == 0) {
            this.quoteSz = "";
        } else {
            this.quoteSz = str28;
        }
        if ((268435456 & i) == 0) {
            this.baseSz = "";
        } else {
            this.baseSz = str29;
        }
        this.tpslTriggerParamResp = (536870912 & i) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((1073741824 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str31;
        }
        if ((i2 & 1) == 0) {
            this.tpRatio = "";
        } else {
            this.tpRatio = str32;
        }
        if ((i2 & 2) == 0) {
            this.slRatio = "";
        } else {
            this.slRatio = str33;
        }
        if ((i2 & 4) == 0) {
            this.tpOrderPx = "";
        } else {
            this.tpOrderPx = str34;
        }
        if ((i2 & 8) == 0) {
            this.slOrderPx = "";
        } else {
            this.slOrderPx = str35;
        }
        if ((i2 & 16) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str36;
        }
        if ((i2 & 32) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str37;
        }
        if ((i2 & 64) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str38;
        }
        if ((i2 & 128) == 0) {
            this.arbApy = "";
        } else {
            this.arbApy = str39;
        }
        if ((i2 & 256) == 0) {
            this.arbitrageApy = "";
        } else {
            this.arbitrageApy = str40;
        }
        if ((i2 & 512) == 0) {
            this.gridProfitRate = "";
        } else {
            this.gridProfitRate = str41;
        }
        if ((i2 & 1024) == 0) {
            this.investment = "";
        } else {
            this.investment = str42;
        }
        if ((i2 & 2048) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str43;
        }
        if ((i2 & 4096) == 0) {
            this.stopResult = "";
        } else {
            this.stopResult = str44;
        }
        if ((i2 & 8192) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str45;
        }
        if ((i2 & 16384) == 0) {
            this.avgDailyArbitrageNum = "";
        } else {
            this.avgDailyArbitrageNum = str46;
        }
        if ((i2 & 32768) == 0) {
            this.totalCycleProfit = "";
        } else {
            this.totalCycleProfit = str47;
        }
        if ((i2 & 65536) == 0) {
            this.arbitragePnl = "";
        } else {
            this.arbitragePnl = str48;
        }
        if ((i2 & 131072) == 0) {
            this.totalCycleProfitRate = "";
        } else {
            this.totalCycleProfitRate = str49;
        }
        if ((i2 & 262144) == 0) {
            this.arbitrageNum = "";
        } else {
            this.arbitrageNum = str50;
        }
        if ((i2 & 524288) == 0) {
            this.tgtCcy = "";
        } else {
            this.tgtCcy = str51;
        }
        if ((1048576 & i2) == 0) {
            this.callbackRatio = "";
        } else {
            this.callbackRatio = str52;
        }
        if ((2097152 & i2) == 0) {
            this.callbackSpread = "";
        } else {
            this.callbackSpread = str53;
        }
        if ((4194304 & i2) == 0) {
            this.activePx = "";
        } else {
            this.activePx = str54;
        }
        if ((8388608 & i2) == 0) {
            this.activePxType = "";
        } else {
            this.activePxType = str55;
        }
        if ((16777216 & i2) == 0) {
            this.moveTriggerPx = "";
        } else {
            this.moveTriggerPx = str56;
        }
        if ((33554432 & i2) == 0) {
            this.last = "";
        } else {
            this.last = str57;
        }
        if ((67108864 & i2) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str58;
        }
        if ((134217728 & i2) == 0) {
            this.direction = "";
        } else {
            this.direction = str59;
        }
        this.basePos = (268435456 & i2) == 0 ? false : z;
        if ((536870912 & i2) == 0) {
            this.noClosePositionId = "";
        } else {
            this.noClosePositionId = str60;
        }
        if ((1073741824 & i2) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str61;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str62;
        }
        if ((i3 & 1) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str63;
        }
        if ((i3 & 2) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str64;
        }
        if ((i3 & 4) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str65;
        }
        if ((i3 & 8) == 0) {
            this.floatProfitInSourceCcy = "";
        } else {
            this.floatProfitInSourceCcy = str66;
        }
        if ((i3 & 16) == 0) {
            this.eq = "";
        } else {
            this.eq = str67;
        }
        if ((i3 & 32) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str68;
        }
        if ((i3 & 64) == 0) {
            this.gridProfitInSourceCcy = "";
        } else {
            this.gridProfitInSourceCcy = str69;
        }
        if ((i3 & 128) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str70;
        }
        if ((i3 & 256) == 0) {
            this.instList = null;
        } else {
            this.instList = list;
        }
        this.associate = (i3 & 512) == 0 ? Boolean.FALSE : bool;
        if ((i3 & 1024) == 0) {
            this.ordSource = null;
        } else {
            this.ordSource = str71;
        }
        if ((i3 & 2048) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str72;
        }
        if ((i3 & 4096) == 0) {
            this.amt = "";
        } else {
            this.amt = str73;
        }
        this.recurringList = (i3 & 8192) == 0 ? new ArrayList() : arrayList;
        if ((i3 & 16384) == 0) {
            this.period = "";
        } else {
            this.period = str74;
        }
        if ((i3 & 32768) == 0) {
            this.recurringDay = "";
        } else {
            this.recurringDay = str75;
        }
        if ((i3 & 65536) == 0) {
            this.recurringHour = "";
        } else {
            this.recurringHour = str76;
        }
        if ((i3 & 131072) == 0) {
            this.cycles = "";
        } else {
            this.cycles = str77;
        }
        if ((i3 & 262144) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str78;
        }
        if ((i3 & 524288) == 0) {
            this.recurringTime = "";
        } else {
            this.recurringTime = str79;
        }
        if ((1048576 & i3) == 0) {
            this.investAmt = "";
        } else {
            this.investAmt = str80;
        }
        if ((2097152 & i3) == 0) {
            this.duration = "";
        } else {
            this.duration = str81;
        }
        if ((4194304 & i3) == 0) {
            this.investType = "";
        } else {
            this.investType = str82;
        }
        this.portfolioList = (8388608 & i3) == 0 ? new ArrayList() : arrayList2;
        if ((16777216 & i3) == 0) {
            this.balType = "";
        } else {
            this.balType = str83;
        }
        if ((33554432 & i3) == 0) {
            this.deltaRatio = "";
        } else {
            this.deltaRatio = str84;
        }
        if ((67108864 & i3) == 0) {
            this.interval = "";
        } else {
            this.interval = str85;
        }
        if ((134217728 & i3) == 0) {
            this.balNum = "";
        } else {
            this.balNum = str86;
        }
        if ((268435456 & i3) == 0) {
            this.triggerType = "";
        } else {
            this.triggerType = str87;
        }
        if ((536870912 & i3) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str88;
        }
        if ((1073741824 & i3) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str89;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str90;
        }
        if ((i4 & 1) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str91;
        }
        if ((i4 & 2) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str92;
        }
        if ((i4 & 4) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str93;
        }
        if ((i4 & 8) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str94;
        }
        if ((i4 & 16) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str95;
        }
        if ((i4 & 32) == 0) {
            this.tpPx = "";
        } else {
            this.tpPx = str96;
        }
        if ((i4 & 64) == 0) {
            this.slPx = "";
        } else {
            this.slPx = str97;
        }
        if ((i4 & 128) == 0) {
            this.slMode = "";
        } else {
            this.slMode = str98;
        }
        if ((i4 & 256) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str99;
        }
        if ((i4 & 512) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str100;
        }
        if ((i4 & 1024) == 0) {
            this.investmentAmt = "";
        } else {
            this.investmentAmt = str101;
        }
        if ((i4 & 2048) == 0) {
            this.maxBotUsage = "";
        } else {
            this.maxBotUsage = str102;
        }
        if ((i4 & 4096) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str103;
        }
        if ((i4 & 8192) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str104;
        }
        if ((i4 & 16384) == 0) {
            this.signParams = null;
        } else {
            this.signParams = arrayList3;
        }
        if ((i4 & 32768) == 0) {
            this.profit = null;
        } else {
            this.profit = str105;
        }
        if ((i4 & 65536) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((i4 & 131072) == 0) {
            this.failCode = "";
        } else {
            this.failCode = str106;
        }
        if ((i4 & 262144) == 0) {
            this.failCodeReason = "";
        } else {
            this.failCodeReason = str107;
        }
        if ((i4 & 524288) == 0) {
            this.cancelSourceReason = "";
        } else {
            this.cancelSourceReason = str108;
        }
        if ((1048576 & i4) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str109;
        }
        if ((2097152 & i4) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str110;
        }
        if ((4194304 & i4) == 0) {
            this.initPx = "";
        } else {
            this.initPx = str111;
        }
        if ((8388608 & i4) == 0) {
            this.perGridProfitRatio = "";
        } else {
            this.perGridProfitRatio = str112;
        }
        if ((16777216 & i4) == 0) {
            this.perMinProfitRate = "";
        } else {
            this.perMinProfitRate = str113;
        }
        if ((33554432 & i4) == 0) {
            this.perMaxProfitRate = "";
        } else {
            this.perMaxProfitRate = str114;
        }
        if ((67108864 & i4) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool2;
        }
        if ((134217728 & i4) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((268435456 & i4) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((536870912 & i4) == 0) {
            this.trailingDownFund = null;
        } else {
            this.trailingDownFund = str115;
        }
        if ((1073741824 & i4) == 0) {
            this.gridStatus = null;
        } else {
            this.gridStatus = str116;
        }
        if ((Integer.MIN_VALUE & i4) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = str117;
        }
        if ((i5 & 1) == 0) {
            this.aggressiveness = null;
        } else {
            this.aggressiveness = str118;
        }
        if ((i5 & 2) == 0) {
            this.errMsg = null;
        } else {
            this.errMsg = str119;
        }
        if ((i5 & 4) == 0) {
            this.errCode = null;
        } else {
            this.errCode = str120;
        }
        if ((i5 & 8) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str121;
        }
        if ((i5 & 16) == 0) {
            this.arbitrageProfitRate = "";
        } else {
            this.arbitrageProfitRate = str122;
        }
        if ((i5 & 32) == 0) {
            this.copyType = null;
        } else {
            this.copyType = str123;
        }
        if ((i5 & 64) == 0) {
            this.instIds = null;
        } else {
            this.instIds = arrayList4;
        }
        if ((i5 & 128) == 0) {
            this.totalAmt = null;
        } else {
            this.totalAmt = str124;
        }
        if ((i5 & 256) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str125;
        }
        if ((i5 & 512) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str126;
        }
        if ((i5 & 1024) == 0) {
            this.floatingPnl = null;
        } else {
            this.floatingPnl = str127;
        }
        if ((i5 & 2048) == 0) {
            this.availableMargin = null;
        } else {
            this.availableMargin = str128;
        }
        if ((i5 & 4096) == 0) {
            this.totalPnlRatio = null;
        } else {
            this.totalPnlRatio = str129;
        }
        if ((i5 & 8192) == 0) {
            this.signalCount = null;
        } else {
            this.signalCount = str130;
        }
        if ((i5 & 16384) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str131;
        }
        if ((i5 & 32768) == 0) {
            this.triggerLast = "";
        } else {
            this.triggerLast = str132;
        }
        if ((i5 & 65536) == 0) {
            this.hiddenFeatures = null;
        } else {
            this.hiddenFeatures = arrayList5;
        }
        if ((i5 & 131072) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str133;
        }
        if ((i5 & 262144) == 0) {
            this.currency = null;
        } else {
            this.currency = str134;
        }
        if ((i5 & 524288) == 0) {
            this.createTime = null;
        } else {
            this.createTime = str135;
        }
        if ((1048576 & i5) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str136;
        }
        if ((2097152 & i5) == 0) {
            this.notionalAmount = null;
        } else {
            this.notionalAmount = str137;
        }
        if ((4194304 & i5) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str138;
        }
        if ((8388608 & i5) == 0) {
            this.participationRatio = null;
        } else {
            this.participationRatio = str139;
        }
        if ((16777216 & i5) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str140;
        }
        if ((33554432 & i5) == 0) {
            this.settlementAmount = null;
        } else {
            this.settlementAmount = str141;
        }
        if ((67108864 & i5) == 0) {
            this.settlementCurrency = null;
        } else {
            this.settlementCurrency = str142;
        }
        if ((134217728 & i5) == 0) {
            this.settlementAltAmount = null;
        } else {
            this.settlementAltAmount = str143;
        }
        if ((268435456 & i5) == 0) {
            this.settlementAltCurrency = null;
        } else {
            this.settlementAltCurrency = str144;
        }
        if ((536870912 & i5) == 0) {
            this.settlementPrice = null;
        } else {
            this.settlementPrice = str145;
        }
        if ((1073741824 & i5) == 0) {
            this.settledTime = null;
        } else {
            this.settledTime = str146;
        }
        if ((Integer.MIN_VALUE & i5) == 0) {
            this.status = null;
        } else {
            this.status = str147;
        }
        if ((i6 & 1) == 0) {
            this.strike = null;
        } else {
            this.strike = str148;
        }
        if ((i6 & 2) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str149;
        }
        if ((i6 & 4) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str150;
        }
        if ((i6 & 8) == 0) {
            this.timeLeft = null;
        } else {
            this.timeLeft = str151;
        }
        if ((i6 & 16) == 0) {
            this.notionalAmountPrecision = null;
        } else {
            this.notionalAmountPrecision = str152;
        }
        if ((i6 & 32) == 0) {
            this.sizePrecision = null;
        } else {
            this.sizePrecision = str153;
        }
        if ((i6 & 64) == 0) {
            this.strikePrecision = null;
        } else {
            this.strikePrecision = str154;
        }
        if ((i6 & 128) == 0) {
            this.settlementPricePrecision = null;
        } else {
            this.settlementPricePrecision = str155;
        }
        this.endStatusFlag = (i6 & 256) == 0 ? false : z2;
        if ((i6 & 512) == 0) {
            this.estimateProfit = "";
        } else {
            this.estimateProfit = str156;
        }
        if ((i6 & 1024) == 0) {
            this.earlyFilledTime = null;
        } else {
            this.earlyFilledTime = str157;
        }
        if ((i6 & 2048) == 0) {
            this.earlyFillAmount = null;
        } else {
            this.earlyFillAmount = str158;
        }
        if ((i6 & 4096) == 0) {
            this.earlyFillCurrency = null;
        } else {
            this.earlyFillCurrency = str159;
        }
        if ((i6 & 8192) == 0) {
            this.earlyFillSettleTime = null;
        } else {
            this.earlyFillSettleTime = str160;
        }
        if ((i6 & 16384) == 0) {
            this.earlyFillPrice = null;
        } else {
            this.earlyFillPrice = str161;
        }
        if ((i6 & 32768) == 0) {
            this.turnoverRatio = null;
        } else {
            this.turnoverRatio = str162;
        }
        this.supportEarlyFill = (i6 & 65536) == 0 ? false : z3;
        if ((i6 & 131072) == 0) {
            this.symbolsNumber = null;
        } else {
            this.symbolsNumber = str163;
        }
        if ((i6 & 262144) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str164;
        }
        if ((i6 & 524288) == 0) {
            this.sourceCcySz = null;
        } else {
            this.sourceCcySz = str165;
        }
        if ((1048576 & i6) == 0) {
            this.extendedBusinessInfo = null;
        } else {
            this.extendedBusinessInfo = extendedBusinessInfo;
        }
        if ((2097152 & i6) == 0) {
            this.arbPnl = null;
        } else {
            this.arbPnl = str166;
        }
        if ((4194304 & i6) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str167;
        }
        if ((8388608 & i6) == 0) {
            this.arbList = null;
        } else {
            this.arbList = arrayList6;
        }
        if ((16777216 & i6) == 0) {
            this.totalFundingFeeRatio = null;
        } else {
            this.totalFundingFeeRatio = str168;
        }
        if ((33554432 & i6) == 0) {
            this.pnlRatioInSourceCcy = "";
        } else {
            this.pnlRatioInSourceCcy = str169;
        }
        if ((67108864 & i6) == 0) {
            this.totalPnlInSourceCcy = "";
        } else {
            this.totalPnlInSourceCcy = str170;
        }
        if ((134217728 & i6) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str171;
        }
        if ((268435456 & i6) == 0) {
            this.apy = null;
        } else {
            this.apy = str172;
        }
        if ((536870912 & i6) == 0) {
            this.voucherInfo = null;
        } else {
            this.voucherInfo = tacticsVoucherInfo;
        }
        if ((1073741824 & i6) == 0) {
            this.dcdState = "";
        } else {
            this.dcdState = str173;
        }
        if ((Integer.MIN_VALUE & i6) == 0) {
            this.dcdPnl = "";
        } else {
            this.dcdPnl = str174;
        }
        if ((i7 & 1) == 0) {
            this.dcdPnlRatio = "";
        } else {
            this.dcdPnlRatio = str175;
        }
        if ((i7 & 2) == 0) {
            this.notional = "";
        } else {
            this.notional = str176;
        }
        if ((i7 & 4) == 0) {
            this.notionalCcy = "";
        } else {
            this.notionalCcy = str177;
        }
        if ((i7 & 8) == 0) {
            this.cycle = "";
        } else {
            this.cycle = str178;
        }
        if ((i7 & 16) == 0) {
            this.currencyBal = "";
        } else {
            this.currencyBal = str179;
        }
        if ((i7 & 32) == 0) {
            this.alternateCurrency = "";
        } else {
            this.alternateCurrency = str180;
        }
        if ((i7 & 64) == 0) {
            this.avgCost = "";
        } else {
            this.avgCost = str181;
        }
        if ((i7 & 128) == 0) {
            this.coinPnl = "";
        } else {
            this.coinPnl = str182;
        }
        this.reinvestment = (i7 & 256) == 0 ? true : z4;
        if ((i7 & 512) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str183;
        }
        if ((i7 & 1024) == 0) {
            this.settlementCcy = "";
        } else {
            this.settlementCcy = str184;
        }
        if ((i7 & 2048) == 0) {
            this.lastTradeExpireTime = "";
        } else {
            this.lastTradeExpireTime = str185;
        }
        if ((i7 & 4096) == 0) {
            this.lastSettlementSettledTime = "";
        } else {
            this.lastSettlementSettledTime = str186;
        }
        if ((i7 & 8192) == 0) {
            this.latestProfit = null;
        } else {
            this.latestProfit = strategyProfitResponse;
        }
        if ((i7 & 16384) == 0) {
            this.profitSnapshots = null;
        } else {
            this.profitSnapshots = list3;
        }
        if ((i7 & 32768) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str187;
        }
        if ((i7 & 65536) == 0) {
            this.stakingPnl = null;
        } else {
            this.stakingPnl = str188;
        }
        if ((i7 & 131072) == 0) {
            this.stakingPnlUSDT = null;
        } else {
            this.stakingPnlUSDT = str189;
        }
        if ((i7 & 262144) == 0) {
            this.stakingPosCcy = "";
        } else {
            this.stakingPosCcy = str190;
        }
        if ((i7 & 524288) == 0) {
            this.stakingPnlApy = "";
        } else {
            this.stakingPnlApy = str191;
        }
        if ((1048576 & i7) == 0) {
            this.subArbTypes = null;
        } else {
            this.subArbTypes = list4;
        }
        if ((2097152 & i7) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str192;
        }
        if ((4194304 & i7) == 0) {
            this.displayId = null;
        } else {
            this.displayId = str193;
        }
        if ((8388608 & i7) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((16777216 & i7) == 0) {
            this.simpleEarn = null;
        } else {
            this.simpleEarn = smartEarnParam;
        }
        if ((33554432 & i7) == 0) {
            this.arbitrageTotalPnlInfo = null;
        } else {
            this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        }
        this.numOfManualOrderInCycle = (67108864 & i7) == 0 ? 0 : i9;
        if ((134217728 & i7) == 0) {
            this.totalSpreadProfit = null;
        } else {
            this.totalSpreadProfit = str194;
        }
        if ((268435456 & i7) == 0) {
            this.totalApy = null;
        } else {
            this.totalApy = str195;
        }
        if ((536870912 & i7) == 0) {
            this.fee = null;
        } else {
            this.fee = str196;
        }
        if ((1073741824 & i7) == 0) {
            this.totalInterestAmt = null;
        } else {
            this.totalInterestAmt = str197;
        }
        if ((Integer.MIN_VALUE & i7) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str198;
        }
        if ((i8 & 1) == 0) {
            this.arbitrageProfit = null;
        } else {
            this.arbitrageProfit = profitDetailResponse;
        }
        if ((i8 & 2) == 0) {
            this.stakingProfit = null;
        } else {
            this.stakingProfit = profitDetailResponse2;
        }
        if ((i8 & 4) == 0) {
            this.balanceDetails = null;
        } else {
            this.balanceDetails = balanceDetailInfoDto;
        }
        if ((i8 & 8) == 0) {
            this.bot = null;
        } else {
            this.bot = botVo;
        }
        if ((i8 & 16) == 0) {
            this.tpTriggerRatio = "";
        } else {
            this.tpTriggerRatio = str199;
        }
        if ((i8 & 32) == 0) {
            this.slTriggerRatio = "";
        } else {
            this.slTriggerRatio = str200;
        }
        if ((i8 & 64) == 0) {
            this.advanceOrdType = "";
        } else {
            this.advanceOrdType = str201;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyHistoryListResp strategyHistoryListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyHistoryListResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyHistoryListResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyHistoryListResp.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyHistoryListResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyHistoryListResp.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyHistoryListResp.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyHistoryListResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyHistoryListResp.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyHistoryListResp.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyHistoryListResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyHistoryListResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyHistoryListResp.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyHistoryListResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxVar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyHistoryListResp.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyHistoryListResp.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyHistoryListResp.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyHistoryListResp.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyHistoryListResp.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyHistoryListResp.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyHistoryListResp.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyHistoryListResp.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyHistoryListResp.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyHistoryListResp.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyHistoryListResp.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyHistoryListResp.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyHistoryListResp.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.runPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyHistoryListResp.runPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.quoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyHistoryListResp.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.baseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyHistoryListResp.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd(strategyHistoryListResp.tpslTriggerParamResp, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 29, TpSlTriggerParamReqResp$$serializer.INSTANCE, strategyHistoryListResp.tpslTriggerParamResp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyHistoryListResp.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyHistoryListResp.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyHistoryListResp.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyHistoryListResp.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyHistoryListResp.tpOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyHistoryListResp.slOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyHistoryListResp.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyHistoryListResp.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyHistoryListResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyHistoryListResp.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbitrageApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyHistoryListResp.arbitrageApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.gridProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, strategyHistoryListResp.gridProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, strategyHistoryListResp.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, strategyHistoryListResp.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.stopResult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, strategyHistoryListResp.stopResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, strategyHistoryListResp.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.avgDailyArbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, strategyHistoryListResp.avgDailyArbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.totalCycleProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, strategyHistoryListResp.totalCycleProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbitragePnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, strategyHistoryListResp.arbitragePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.totalCycleProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, strategyHistoryListResp.totalCycleProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, strategyHistoryListResp.arbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tgtCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, strategyHistoryListResp.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.callbackRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, strategyHistoryListResp.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.callbackSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, strategyHistoryListResp.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.activePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, strategyHistoryListResp.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.activePxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, strategyHistoryListResp.activePxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.moveTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, strategyHistoryListResp.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, strategyHistoryListResp.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, strategyHistoryListResp.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, strategyHistoryListResp.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || strategyHistoryListResp.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 60, strategyHistoryListResp.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.noClosePositionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, strategyHistoryListResp.noClosePositionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, strategyHistoryListResp.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, strategyHistoryListResp.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, strategyHistoryListResp.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, strategyHistoryListResp.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, strategyHistoryListResp.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.floatProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, strategyHistoryListResp.floatProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, strategyHistoryListResp.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, strategyHistoryListResp.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.gridProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, strategyHistoryListResp.gridProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 71, strategyHistoryListResp.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || strategyHistoryListResp.instList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, kSerializerArr[72], strategyHistoryListResp.instList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd(strategyHistoryListResp.associate, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, BooleanSerializer.INSTANCE, strategyHistoryListResp.associate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || strategyHistoryListResp.ordSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, strategyHistoryListResp.ordSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, strategyHistoryListResp.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, strategyHistoryListResp.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd(strategyHistoryListResp.recurringList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 77, kSerializerArr[77], strategyHistoryListResp.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, strategyHistoryListResp.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.recurringDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 79, strategyHistoryListResp.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.recurringHour, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 80, strategyHistoryListResp.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 81, strategyHistoryListResp.cycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 82, strategyHistoryListResp.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.recurringTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 83, strategyHistoryListResp.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 84, strategyHistoryListResp.investAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.duration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 85, strategyHistoryListResp.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 86, strategyHistoryListResp.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd(strategyHistoryListResp.portfolioList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 87, kSerializerArr[87], strategyHistoryListResp.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.balType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 88, strategyHistoryListResp.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.deltaRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 89, strategyHistoryListResp.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.interval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 90, strategyHistoryListResp.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.balNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 91, strategyHistoryListResp.balNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.triggerType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 92, strategyHistoryListResp.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 93, strategyHistoryListResp.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 94, strategyHistoryListResp.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) || strategyHistoryListResp.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 95, StringSerializer.INSTANCE, strategyHistoryListResp.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 96) || strategyHistoryListResp.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 96, StringSerializer.INSTANCE, strategyHistoryListResp.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 97) || strategyHistoryListResp.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 97, StringSerializer.INSTANCE, strategyHistoryListResp.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 98) || strategyHistoryListResp.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 98, StringSerializer.INSTANCE, strategyHistoryListResp.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 99) || strategyHistoryListResp.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 99, StringSerializer.INSTANCE, strategyHistoryListResp.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 100) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 100, strategyHistoryListResp.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 101) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 101, strategyHistoryListResp.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 102) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 102, strategyHistoryListResp.slPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 103) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 103, strategyHistoryListResp.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 104) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.completedCycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 104, strategyHistoryListResp.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 105) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 105, strategyHistoryListResp.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 106) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investmentAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 106, strategyHistoryListResp.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 107) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.maxBotUsage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 107, strategyHistoryListResp.maxBotUsage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 108) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 108, strategyHistoryListResp.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 109) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 109, strategyHistoryListResp.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY) || strategyHistoryListResp.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_CREATE_KEY, kSerializerArr[110], strategyHistoryListResp.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) || strategyHistoryListResp.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, StringSerializer.INSTANCE, strategyHistoryListResp.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST) || strategyHistoryListResp.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WalletImportError.ERROR_CODE_AA_EXIST, kSerializerArr[112], strategyHistoryListResp.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.failCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, strategyHistoryListResp.failCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 114) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.failCodeReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 114, strategyHistoryListResp.failCodeReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 115) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cancelSourceReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 115, strategyHistoryListResp.cancelSourceReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || strategyHistoryListResp.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, StringSerializer.INSTANCE, strategyHistoryListResp.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 117) || strategyHistoryListResp.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 117, StringSerializer.INSTANCE, strategyHistoryListResp.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 118) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.initPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 118, strategyHistoryListResp.initPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 119) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.perGridProfitRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 119, strategyHistoryListResp.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 120) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.perMinProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 120, strategyHistoryListResp.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 121) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.perMaxProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 121, strategyHistoryListResp.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 122) || strategyHistoryListResp.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 122, BooleanSerializer.INSTANCE, strategyHistoryListResp.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 123) || strategyHistoryListResp.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 123, TrailingConfig$$serializer.INSTANCE, strategyHistoryListResp.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 124) || strategyHistoryListResp.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 124, TrailingConfig$$serializer.INSTANCE, strategyHistoryListResp.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 125) || strategyHistoryListResp.trailingDownFund != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 125, StringSerializer.INSTANCE, strategyHistoryListResp.trailingDownFund);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT) || strategyHistoryListResp.gridStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, WebSocketProtocol.PAYLOAD_SHORT, StringSerializer.INSTANCE, strategyHistoryListResp.gridStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 127) || strategyHistoryListResp.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 127, StringSerializer.INSTANCE, strategyHistoryListResp.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 128) || strategyHistoryListResp.aggressiveness != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 128, StringSerializer.INSTANCE, strategyHistoryListResp.aggressiveness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 129) || strategyHistoryListResp.errMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 129, StringSerializer.INSTANCE, strategyHistoryListResp.errMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 130) || strategyHistoryListResp.errCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 130, StringSerializer.INSTANCE, strategyHistoryListResp.errCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, DateFormat.RELATIVE_SHORT) || strategyHistoryListResp.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, DateFormat.RELATIVE_SHORT, StringSerializer.INSTANCE, strategyHistoryListResp.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbitrageProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, strategyHistoryListResp.arbitrageProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA) || strategyHistoryListResp.copyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.copyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 134) || strategyHistoryListResp.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 134, kSerializerArr[134], strategyHistoryListResp.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 135) || strategyHistoryListResp.totalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 135, StringSerializer.INSTANCE, strategyHistoryListResp.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA) || strategyHistoryListResp.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA) || strategyHistoryListResp.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 138) || strategyHistoryListResp.floatingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 138, StringSerializer.INSTANCE, strategyHistoryListResp.floatingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA) || strategyHistoryListResp.availableMargin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.availableMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA) || strategyHistoryListResp.totalPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.totalPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) || strategyHistoryListResp.signalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.signalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, strategyHistoryListResp.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.triggerLast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, strategyHistoryListResp.triggerLast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA) || strategyHistoryListResp.hiddenFeatures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, kSerializerArr[144], strategyHistoryListResp.hiddenFeatures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) || strategyHistoryListResp.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA) || strategyHistoryListResp.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) || strategyHistoryListResp.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA) || strategyHistoryListResp.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) || strategyHistoryListResp.notionalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.notionalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 150) || strategyHistoryListResp.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 150, StringSerializer.INSTANCE, strategyHistoryListResp.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA) || strategyHistoryListResp.participationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.participationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA) || strategyHistoryListResp.settlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA) || strategyHistoryListResp.settlementAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.settlementAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA) || strategyHistoryListResp.settlementCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.settlementCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) || strategyHistoryListResp.settlementAltAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, StringSerializer.INSTANCE, strategyHistoryListResp.settlementAltAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.settlementAltCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.settlementAltCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.settlementPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.settlementPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.settledTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.settledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.tradeSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.tradeSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.timeLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.timeLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.notionalAmountPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.notionalAmountPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.sizePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.sizePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.strikePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.strikePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.settlementPricePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.settlementPricePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.endStatusFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, strategyHistoryListResp.endStatusFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.estimateProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, strategyHistoryListResp.estimateProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) || strategyHistoryListResp.earlyFilledTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.earlyFilledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.earlyFillAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.earlyFillAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 172) || strategyHistoryListResp.earlyFillCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 172, StringSerializer.INSTANCE, strategyHistoryListResp.earlyFillCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384) || strategyHistoryListResp.earlyFillSettleTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.earlyFillSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256) || strategyHistoryListResp.earlyFillPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.earlyFillPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384) || strategyHistoryListResp.turnoverRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.turnoverRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256) || strategyHistoryListResp.supportEarlyFill) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA256, strategyHistoryListResp.supportEarlyFill);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384) || strategyHistoryListResp.symbolsNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_PSK_WITH_NULL_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.symbolsNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256) || strategyHistoryListResp.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384) || strategyHistoryListResp.sourceCcySz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.sourceCcySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 180) || strategyHistoryListResp.extendedBusinessInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 180, ExtendedBusinessInfo$$serializer.INSTANCE, strategyHistoryListResp.extendedBusinessInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384) || strategyHistoryListResp.arbPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, StringSerializer.INSTANCE, strategyHistoryListResp.arbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256) || strategyHistoryListResp.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384) || strategyHistoryListResp.arbList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, kSerializerArr[183], strategyHistoryListResp.arbList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) || strategyHistoryListResp.totalFundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, StringSerializer.INSTANCE, strategyHistoryListResp.totalFundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pnlRatioInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, strategyHistoryListResp.pnlRatioInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.totalPnlInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, strategyHistoryListResp.totalPnlInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, strategyHistoryListResp.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 188) || strategyHistoryListResp.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 188, StringSerializer.INSTANCE, strategyHistoryListResp.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 189) || strategyHistoryListResp.voucherInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 189, TacticsVoucherInfo$$serializer.INSTANCE, strategyHistoryListResp.voucherInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 190) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.dcdState, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 190, strategyHistoryListResp.dcdState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 191) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.dcdPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 191, strategyHistoryListResp.dcdPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 192) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.dcdPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 192, strategyHistoryListResp.dcdPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.notional, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, strategyHistoryListResp.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.notionalCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, strategyHistoryListResp.notionalCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cycle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, strategyHistoryListResp.cycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.currencyBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, strategyHistoryListResp.currencyBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.alternateCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, strategyHistoryListResp.alternateCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 198) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.avgCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 198, strategyHistoryListResp.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 199) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.coinPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 199, strategyHistoryListResp.coinPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 200) || !strategyHistoryListResp.reinvestment) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 200, strategyHistoryListResp.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 201) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 201, strategyHistoryListResp.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 202) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.settlementCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 202, strategyHistoryListResp.settlementCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 203) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.lastTradeExpireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 203, strategyHistoryListResp.lastTradeExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 204) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.lastSettlementSettledTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 204, strategyHistoryListResp.lastSettlementSettledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) || strategyHistoryListResp.latestProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, StrategyProfitResponse$$serializer.INSTANCE, strategyHistoryListResp.latestProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 206) || strategyHistoryListResp.profitSnapshots != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 206, kSerializerArr[206], strategyHistoryListResp.profitSnapshots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 207) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 207, strategyHistoryListResp.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 208) || strategyHistoryListResp.stakingPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 208, StringSerializer.INSTANCE, strategyHistoryListResp.stakingPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 209) || strategyHistoryListResp.stakingPnlUSDT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 209, StringSerializer.INSTANCE, strategyHistoryListResp.stakingPnlUSDT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 210) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.stakingPosCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 210, strategyHistoryListResp.stakingPosCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 211) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.stakingPnlApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 211, strategyHistoryListResp.stakingPnlApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, BuildConfig.VERSION_CODE) || strategyHistoryListResp.subArbTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, BuildConfig.VERSION_CODE, kSerializerArr[212], strategyHistoryListResp.subArbTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 213) || strategyHistoryListResp.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 213, StringSerializer.INSTANCE, strategyHistoryListResp.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE) || strategyHistoryListResp.displayId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, me.relex.circleindicator.BuildConfig.VERSION_CODE, StringSerializer.INSTANCE, strategyHistoryListResp.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 215) || strategyHistoryListResp.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 215, FloatSerializer.INSTANCE, strategyHistoryListResp.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 216) || strategyHistoryListResp.simpleEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 216, SmartEarnParam$$serializer.INSTANCE, strategyHistoryListResp.simpleEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 217) || strategyHistoryListResp.arbitrageTotalPnlInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 217, ArbitrageTotalPnlInfo$$serializer.INSTANCE, strategyHistoryListResp.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 218) || strategyHistoryListResp.numOfManualOrderInCycle != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 218, strategyHistoryListResp.numOfManualOrderInCycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 219) || strategyHistoryListResp.totalSpreadProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 219, StringSerializer.INSTANCE, strategyHistoryListResp.totalSpreadProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 220) || strategyHistoryListResp.totalApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 220, StringSerializer.INSTANCE, strategyHistoryListResp.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 221) || strategyHistoryListResp.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 221, StringSerializer.INSTANCE, strategyHistoryListResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 222) || strategyHistoryListResp.totalInterestAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 222, StringSerializer.INSTANCE, strategyHistoryListResp.totalInterestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 223) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 223, strategyHistoryListResp.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 224) || strategyHistoryListResp.arbitrageProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 224, ProfitDetailResponse$$serializer.INSTANCE, strategyHistoryListResp.arbitrageProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 225) || strategyHistoryListResp.stakingProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 225, ProfitDetailResponse$$serializer.INSTANCE, strategyHistoryListResp.stakingProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 226) || strategyHistoryListResp.balanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 226, BalanceDetailInfoDto$$serializer.INSTANCE, strategyHistoryListResp.balanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 227) || strategyHistoryListResp.bot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 227, BotVo$$serializer.INSTANCE, strategyHistoryListResp.bot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 228) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpTriggerRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 228, strategyHistoryListResp.tpTriggerRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slTriggerRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, FreshnessState.FIRST_SCENE_ALPHA, strategyHistoryListResp.slTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 230) && Intrinsics.EZpvd((Object) strategyHistoryListResp.advanceOrdType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 230, StringSerializer.INSTANCE, strategyHistoryListResp.advanceOrdType);
    }

    public StrategyHistoryListResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, boolean z, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, List<ArbitrageOrderBean> list, Boolean bool, String str71, @NotNull String str72, @NotNull String str73, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, @NotNull String str83, @NotNull String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, String str90, String str91, String str92, String str93, String str94, @NotNull String str95, @NotNull String str96, @NotNull String str97, @NotNull String str98, @NotNull String str99, @NotNull String str100, @NotNull String str101, @NotNull String str102, @NotNull String str103, @NotNull String str104, ArrayList<SignParamItem> arrayList3, String str105, List<DcaTriggerParam> list2, @NotNull String str106, @NotNull String str107, @NotNull String str108, String str109, String str110, @NotNull String str111, @NotNull String str112, @NotNull String str113, @NotNull String str114, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, String str121, @NotNull String str122, String str123, ArrayList<String> arrayList4, String str124, String str125, String str126, String str127, String str128, String str129, String str130, @NotNull String str131, @NotNull String str132, ArrayList<String> arrayList5, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, boolean z2, @NotNull String str156, String str157, String str158, String str159, String str160, String str161, String str162, boolean z3, String str163, String str164, String str165, ExtendedBusinessInfo extendedBusinessInfo, String str166, String str167, ArrayList<SmartArbListItem> arrayList6, String str168, @NotNull String str169, @NotNull String str170, @NotNull String str171, String str172, TacticsVoucherInfo tacticsVoucherInfo, @NotNull String str173, @NotNull String str174, @NotNull String str175, @NotNull String str176, @NotNull String str177, @NotNull String str178, @NotNull String str179, @NotNull String str180, @NotNull String str181, @NotNull String str182, boolean z4, @NotNull String str183, @NotNull String str184, @NotNull String str185, @NotNull String str186, StrategyProfitResponse strategyProfitResponse, List<StrategyProfitResponse> list3, @NotNull String str187, String str188, String str189, @NotNull String str190, @NotNull String str191, List<? extends SubArbitrageType4Remote> list4, String str192, String str193, Float f, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str194, String str195, String str196, String str197, @NotNull String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, @NotNull String str199, @NotNull String str200, String str201) {
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
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
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(str84, "");
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str97, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str99, "");
        Intrinsics.checkNotNullParameter(str100, "");
        Intrinsics.checkNotNullParameter(str101, "");
        Intrinsics.checkNotNullParameter(str102, "");
        Intrinsics.checkNotNullParameter(str103, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str106, "");
        Intrinsics.checkNotNullParameter(str107, "");
        Intrinsics.checkNotNullParameter(str108, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str112, "");
        Intrinsics.checkNotNullParameter(str113, "");
        Intrinsics.checkNotNullParameter(str114, "");
        Intrinsics.checkNotNullParameter(str122, "");
        Intrinsics.checkNotNullParameter(str131, "");
        Intrinsics.checkNotNullParameter(str132, "");
        Intrinsics.checkNotNullParameter(str156, "");
        Intrinsics.checkNotNullParameter(str169, "");
        Intrinsics.checkNotNullParameter(str170, "");
        Intrinsics.checkNotNullParameter(str171, "");
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
        Intrinsics.checkNotNullParameter(str183, "");
        Intrinsics.checkNotNullParameter(str184, "");
        Intrinsics.checkNotNullParameter(str185, "");
        Intrinsics.checkNotNullParameter(str186, "");
        Intrinsics.checkNotNullParameter(str187, "");
        Intrinsics.checkNotNullParameter(str190, "");
        Intrinsics.checkNotNullParameter(str191, "");
        Intrinsics.checkNotNullParameter(str198, "");
        Intrinsics.checkNotNullParameter(str199, "");
        Intrinsics.checkNotNullParameter(str200, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.ccy = str4;
        this.ctVal = str5;
        this.ordId = str6;
        this.algoId = str7;
        this.ordType = str8;
        this.tdMode = str9;
        this.lever = str10;
        this.state = str11;
        this.triggerTime = str12;
        this.cTime = str13;
        this.pxVar = str14;
        this.pxSpread = str15;
        this.szLimit = str16;
        this.pxLimit = str17;
        this.actualSz = str18;
        this.sz = str19;
        this.side = str20;
        this.posSide = str21;
        this.timeInterval = str22;
        this.maxPx = str23;
        this.minPx = str24;
        this.gridNum = str25;
        this.runType = str26;
        this.runPx = str27;
        this.quoteSz = str28;
        this.baseSz = str29;
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
        this.tpTriggerPx = str30;
        this.slTriggerPx = str31;
        this.tpRatio = str32;
        this.slRatio = str33;
        this.tpOrderPx = str34;
        this.slOrderPx = str35;
        this.tradeNum = str36;
        this.totalPnl = str37;
        this.pnlRatio = str38;
        this.arbApy = str39;
        this.arbitrageApy = str40;
        this.gridProfitRate = str41;
        this.investment = str42;
        this.cancelType = str43;
        this.stopResult = str44;
        this.profitNum = str45;
        this.avgDailyArbitrageNum = str46;
        this.totalCycleProfit = str47;
        this.arbitragePnl = str48;
        this.totalCycleProfitRate = str49;
        this.arbitrageNum = str50;
        this.tgtCcy = str51;
        this.callbackRatio = str52;
        this.callbackSpread = str53;
        this.activePx = str54;
        this.activePxType = str55;
        this.moveTriggerPx = str56;
        this.last = str57;
        this.uTime = str58;
        this.direction = str59;
        this.basePos = z;
        this.noClosePositionId = str60;
        this.actualLever = str61;
        this.actualMarginSz = str62;
        this.extraMarginSz = str63;
        this.liqPx = str64;
        this.floatProfit = str65;
        this.floatProfitInSourceCcy = str66;
        this.eq = str67;
        this.gridProfit = str68;
        this.gridProfitInSourceCcy = str69;
        this.algoOrdType = str70;
        this.instList = list;
        this.associate = bool;
        this.ordSource = str71;
        this.stgyName = str72;
        this.amt = str73;
        this.recurringList = arrayList;
        this.period = str74;
        this.recurringDay = str75;
        this.recurringHour = str76;
        this.cycles = str77;
        this.investCcy = str78;
        this.recurringTime = str79;
        this.investAmt = str80;
        this.duration = str81;
        this.investType = str82;
        this.portfolioList = arrayList2;
        this.balType = str83;
        this.deltaRatio = str84;
        this.interval = str85;
        this.balNum = str86;
        this.triggerType = str87;
        this.maxSafetyOrds = str88;
        this.fillSafetyOrds = str89;
        this.pxSteps = str90;
        this.pxStepsMult = str91;
        this.volMult = str92;
        this.tpPct = str93;
        this.slPct = str94;
        this.avgPx = str95;
        this.tpPx = str96;
        this.slPx = str97;
        this.slMode = str98;
        this.completedCycles = str99;
        this.investmentCcy = str100;
        this.investmentAmt = str101;
        this.maxBotUsage = str102;
        this.closeFraction = str103;
        this.bizRefType = str104;
        this.signParams = arrayList3;
        this.profit = str105;
        this.triggerParams = list2;
        this.failCode = str106;
        this.failCodeReason = str107;
        this.cancelSourceReason = str108;
        this.sourceAlgoId = str109;
        this.stopType = str110;
        this.initPx = str111;
        this.perGridProfitRatio = str112;
        this.perMinProfitRate = str113;
        this.perMaxProfitRate = str114;
        this.reserveFunds = bool2;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.trailingDownFund = str115;
        this.gridStatus = str116;
        this.lmtOrderNumber = str117;
        this.aggressiveness = str118;
        this.errMsg = str119;
        this.errCode = str120;
        this.profitSharingRatio = str121;
        this.arbitrageProfitRate = str122;
        this.copyType = str123;
        this.instIds = arrayList4;
        this.totalAmt = str124;
        this.signalChanId = str125;
        this.signalChanName = str126;
        this.floatingPnl = str127;
        this.availableMargin = str128;
        this.totalPnlRatio = str129;
        this.signalCount = str130;
        this.reduceOnly = str131;
        this.triggerLast = str132;
        this.hiddenFeatures = arrayList5;
        this.alternativeCurrency = str133;
        this.currency = str134;
        this.createTime = str135;
        this.expiryTime = str136;
        this.notionalAmount = str137;
        this.notionalCurrency = str138;
        this.participationRatio = str139;
        this.settlementTime = str140;
        this.settlementAmount = str141;
        this.settlementCurrency = str142;
        this.settlementAltAmount = str143;
        this.settlementAltCurrency = str144;
        this.settlementPrice = str145;
        this.settledTime = str146;
        this.status = str147;
        this.strike = str148;
        this.tradeId = str149;
        this.tradeSide = str150;
        this.timeLeft = str151;
        this.notionalAmountPrecision = str152;
        this.sizePrecision = str153;
        this.strikePrecision = str154;
        this.settlementPricePrecision = str155;
        this.endStatusFlag = z2;
        this.estimateProfit = str156;
        this.earlyFilledTime = str157;
        this.earlyFillAmount = str158;
        this.earlyFillCurrency = str159;
        this.earlyFillSettleTime = str160;
        this.earlyFillPrice = str161;
        this.turnoverRatio = str162;
        this.supportEarlyFill = z3;
        this.symbolsNumber = str163;
        this.sourceCcy = str164;
        this.sourceCcySz = str165;
        this.extendedBusinessInfo = extendedBusinessInfo;
        this.arbPnl = str166;
        this.instFamily = str167;
        this.arbList = arrayList6;
        this.totalFundingFeeRatio = str168;
        this.pnlRatioInSourceCcy = str169;
        this.totalPnlInSourceCcy = str170;
        this.ruleType = str171;
        this.apy = str172;
        this.voucherInfo = tacticsVoucherInfo;
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
        this.reinvestment = z4;
        this.lastPrice = str183;
        this.settlementCcy = str184;
        this.lastTradeExpireTime = str185;
        this.lastSettlementSettledTime = str186;
        this.latestProfit = strategyProfitResponse;
        this.profitSnapshots = list3;
        this.pTime = str187;
        this.stakingPnl = str188;
        this.stakingPnlUSDT = str189;
        this.stakingPosCcy = str190;
        this.stakingPnlApy = str191;
        this.subArbTypes = list4;
        this.tradeQuoteCcy = str192;
        this.displayId = str193;
        this.leveragePrincipal = f;
        this.simpleEarn = smartEarnParam;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.numOfManualOrderInCycle = i;
        this.totalSpreadProfit = str194;
        this.totalApy = str195;
        this.fee = str196;
        this.totalInterestAmt = str197;
        this.debtCcy = str198;
        this.arbitrageProfit = profitDetailResponse;
        this.stakingProfit = profitDetailResponse2;
        this.balanceDetails = balanceDetailInfoDto;
        this.bot = botVo;
        this.tpTriggerRatio = str199;
        this.slTriggerRatio = str200;
        this.advanceOrdType = str201;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyHistoryListResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, boolean z, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, List list, Boolean bool, String str71, String str72, String str73, ArrayList arrayList, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList arrayList2, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, String str101, String str102, String str103, String str104, ArrayList arrayList3, String str105, List list2, String str106, String str107, String str108, String str109, String str110, String str111, String str112, String str113, String str114, Boolean bool2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str115, String str116, String str117, String str118, String str119, String str120, String str121, String str122, String str123, ArrayList arrayList4, String str124, String str125, String str126, String str127, String str128, String str129, String str130, String str131, String str132, ArrayList arrayList5, String str133, String str134, String str135, String str136, String str137, String str138, String str139, String str140, String str141, String str142, String str143, String str144, String str145, String str146, String str147, String str148, String str149, String str150, String str151, String str152, String str153, String str154, String str155, boolean z2, String str156, String str157, String str158, String str159, String str160, String str161, String str162, boolean z3, String str163, String str164, String str165, ExtendedBusinessInfo extendedBusinessInfo, String str166, String str167, ArrayList arrayList6, String str168, String str169, String str170, String str171, String str172, TacticsVoucherInfo tacticsVoucherInfo, String str173, String str174, String str175, String str176, String str177, String str178, String str179, String str180, String str181, String str182, boolean z4, String str183, String str184, String str185, String str186, StrategyProfitResponse strategyProfitResponse, List list3, String str187, String str188, String str189, String str190, String str191, List list4, String str192, String str193, Float f, SmartEarnParam smartEarnParam, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, int i, String str194, String str195, String str196, String str197, String str198, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, String str199, String str200, String str201, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        String str202 = (i2 & 1) != 0 ? "" : str;
        String str203 = (i2 & 2) != 0 ? "" : str2;
        String str204 = (i2 & 4) != 0 ? "" : str3;
        String str205 = (i2 & 8) != 0 ? "" : str4;
        String str206 = (i2 & 16) != 0 ? "" : str5;
        String str207 = (i2 & 32) != 0 ? "" : str6;
        String str208 = (i2 & 64) != 0 ? "" : str7;
        String str209 = (i2 & 128) != 0 ? "" : str8;
        String str210 = (i2 & 256) != 0 ? "" : str9;
        String str211 = (i2 & 512) != 0 ? "" : str10;
        String str212 = (i2 & 1024) != 0 ? "" : str11;
        String str213 = (i2 & 2048) != 0 ? "" : str12;
        String str214 = (i2 & 4096) != 0 ? "" : str13;
        String str215 = (i2 & 8192) != 0 ? "" : str14;
        String str216 = (i2 & 16384) != 0 ? "" : str15;
        String str217 = (i2 & 32768) != 0 ? "" : str16;
        String str218 = (i2 & 65536) != 0 ? "" : str17;
        String str219 = (i2 & 131072) != 0 ? "" : str18;
        String str220 = (i2 & 262144) != 0 ? "" : str19;
        String str221 = (i2 & 524288) != 0 ? "" : str20;
        String str222 = (i2 & 1048576) != 0 ? "" : str21;
        String str223 = (i2 & 2097152) != 0 ? "" : str22;
        String str224 = (i2 & 4194304) != 0 ? "" : str23;
        String str225 = (i2 & 8388608) != 0 ? "" : str24;
        String str226 = (i2 & 16777216) != 0 ? "" : str25;
        String str227 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str228 = (i2 & 67108864) != 0 ? "" : str27;
        String str229 = (i2 & 134217728) != 0 ? "" : str28;
        String str230 = (i2 & 268435456) != 0 ? "" : str29;
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp2 = (i2 & 536870912) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        String str231 = (i2 & 1073741824) != 0 ? "" : str30;
        String str232 = (i2 & Integer.MIN_VALUE) != 0 ? "" : str31;
        String str233 = (i3 & 1) != 0 ? "" : str32;
        String str234 = (i3 & 2) != 0 ? "" : str33;
        String str235 = (i3 & 4) != 0 ? "" : str34;
        String str236 = (i3 & 8) != 0 ? "" : str35;
        String str237 = (i3 & 16) != 0 ? "" : str36;
        String str238 = (i3 & 32) != 0 ? "" : str37;
        String str239 = (i3 & 64) != 0 ? "" : str38;
        String str240 = str232;
        String str241 = (i3 & 128) != 0 ? "" : str39;
        String str242 = (i3 & 256) != 0 ? "" : str40;
        String str243 = (i3 & 512) != 0 ? "" : str41;
        String str244 = (i3 & 1024) != 0 ? "" : str42;
        String str245 = (i3 & 2048) != 0 ? "" : str43;
        String str246 = (i3 & 4096) != 0 ? "" : str44;
        String str247 = (i3 & 8192) != 0 ? "" : str45;
        String str248 = (i3 & 16384) != 0 ? "" : str46;
        String str249 = (i3 & 32768) != 0 ? "" : str47;
        String str250 = (i3 & 65536) != 0 ? "" : str48;
        String str251 = (i3 & 131072) != 0 ? "" : str49;
        String str252 = (i3 & 262144) != 0 ? "" : str50;
        String str253 = (i3 & 524288) != 0 ? "" : str51;
        String str254 = (i3 & 1048576) != 0 ? "" : str52;
        String str255 = (i3 & 2097152) != 0 ? "" : str53;
        String str256 = (i3 & 4194304) != 0 ? "" : str54;
        String str257 = (i3 & 8388608) != 0 ? "" : str55;
        String str258 = (i3 & 16777216) != 0 ? "" : str56;
        String str259 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str57;
        String str260 = (i3 & 67108864) != 0 ? "" : str58;
        String str261 = (i3 & 134217728) != 0 ? "" : str59;
        boolean z5 = (i3 & 268435456) != 0 ? false : z;
        String str262 = (i3 & 536870912) != 0 ? "" : str60;
        String str263 = (i3 & 1073741824) != 0 ? "" : str61;
        String str264 = (i3 & Integer.MIN_VALUE) != 0 ? "" : str62;
        String str265 = (i4 & 1) != 0 ? "" : str63;
        String str266 = (i4 & 2) != 0 ? "" : str64;
        String str267 = (i4 & 4) != 0 ? "" : str65;
        String str268 = (i4 & 8) != 0 ? "" : str66;
        String str269 = (i4 & 16) != 0 ? "" : str67;
        String str270 = (i4 & 32) != 0 ? "" : str68;
        String str271 = (i4 & 64) != 0 ? "" : str69;
        String str272 = str264;
        String str273 = (i4 & 128) != 0 ? "" : str70;
        List list5 = (i4 & 256) != 0 ? null : list;
        Boolean bool3 = (i4 & 512) != 0 ? Boolean.FALSE : bool;
        String str274 = (i4 & 1024) != 0 ? null : str71;
        String str275 = (i4 & 2048) != 0 ? "" : str72;
        String str276 = (i4 & 4096) != 0 ? "" : str73;
        ArrayList arrayList7 = (i4 & 8192) != 0 ? new ArrayList() : arrayList;
        String str277 = (i4 & 16384) != 0 ? "" : str74;
        String str278 = (i4 & 32768) != 0 ? "" : str75;
        String str279 = (i4 & 65536) != 0 ? "" : str76;
        String str280 = (i4 & 131072) != 0 ? "" : str77;
        String str281 = (i4 & 262144) != 0 ? "" : str78;
        String str282 = (i4 & 524288) != 0 ? "" : str79;
        String str283 = (i4 & 1048576) != 0 ? "" : str80;
        String str284 = (i4 & 2097152) != 0 ? "" : str81;
        String str285 = (i4 & 4194304) != 0 ? "" : str82;
        ArrayList arrayList8 = (i4 & 8388608) != 0 ? new ArrayList() : arrayList2;
        String str286 = (i4 & 16777216) != 0 ? "" : str83;
        String str287 = (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str84;
        String str288 = (i4 & 67108864) != 0 ? "" : str85;
        String str289 = (i4 & 134217728) != 0 ? "" : str86;
        String str290 = (i4 & 268435456) != 0 ? "" : str87;
        String str291 = (i4 & 536870912) != 0 ? "" : str88;
        String str292 = (i4 & 1073741824) != 0 ? "" : str89;
        String str293 = (i4 & Integer.MIN_VALUE) != 0 ? null : str90;
        String str294 = (i5 & 1) != 0 ? null : str91;
        String str295 = (i5 & 2) != 0 ? null : str92;
        String str296 = (i5 & 4) != 0 ? null : str93;
        String str297 = (i5 & 8) != 0 ? null : str94;
        String str298 = (i5 & 16) != 0 ? "" : str95;
        String str299 = (i5 & 32) != 0 ? "" : str96;
        String str300 = (i5 & 64) != 0 ? "" : str97;
        String str301 = str293;
        String str302 = (i5 & 128) != 0 ? "" : str98;
        String str303 = (i5 & 256) != 0 ? "" : str99;
        String str304 = (i5 & 512) != 0 ? "" : str100;
        String str305 = (i5 & 1024) != 0 ? "" : str101;
        String str306 = (i5 & 2048) != 0 ? "" : str102;
        String str307 = (i5 & 4096) != 0 ? "" : str103;
        String str308 = (i5 & 8192) != 0 ? "" : str104;
        ArrayList arrayList9 = (i5 & 16384) != 0 ? null : arrayList3;
        String str309 = (i5 & 32768) != 0 ? null : str105;
        List list6 = (i5 & 65536) != 0 ? null : list2;
        String str310 = (i5 & 131072) != 0 ? "" : str106;
        String str311 = (i5 & 262144) != 0 ? "" : str107;
        String str312 = (i5 & 524288) != 0 ? "" : str108;
        String str313 = (i5 & 1048576) != 0 ? null : str109;
        String str314 = (i5 & 2097152) != 0 ? null : str110;
        String str315 = (i5 & 4194304) != 0 ? "" : str111;
        String str316 = (i5 & 8388608) != 0 ? "" : str112;
        String str317 = (i5 & 16777216) != 0 ? "" : str113;
        String str318 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str114;
        Boolean bool4 = (i5 & 67108864) != 0 ? null : bool2;
        TrailingConfig trailingConfig3 = (i5 & 134217728) != 0 ? null : trailingConfig;
        TrailingConfig trailingConfig4 = (i5 & 268435456) != 0 ? null : trailingConfig2;
        String str319 = (i5 & 536870912) != 0 ? null : str115;
        String str320 = (i5 & 1073741824) != 0 ? null : str116;
        String str321 = (i5 & Integer.MIN_VALUE) != 0 ? null : str117;
        String str322 = (i6 & 1) != 0 ? null : str118;
        String str323 = (i6 & 2) != 0 ? null : str119;
        String str324 = (i6 & 4) != 0 ? null : str120;
        String str325 = (i6 & 8) != 0 ? null : str121;
        String str326 = (i6 & 16) != 0 ? "" : str122;
        String str327 = (i6 & 32) != 0 ? null : str123;
        ArrayList arrayList10 = (i6 & 64) != 0 ? null : arrayList4;
        String str328 = str321;
        String str329 = (i6 & 128) != 0 ? null : str124;
        String str330 = (i6 & 256) != 0 ? null : str125;
        String str331 = (i6 & 512) != 0 ? null : str126;
        String str332 = (i6 & 1024) != 0 ? null : str127;
        String str333 = (i6 & 2048) != 0 ? null : str128;
        String str334 = (i6 & 4096) != 0 ? null : str129;
        String str335 = (i6 & 8192) != 0 ? null : str130;
        String str336 = (i6 & 16384) != 0 ? "" : str131;
        String str337 = (i6 & 32768) != 0 ? "" : str132;
        ArrayList arrayList11 = (i6 & 65536) != 0 ? null : arrayList5;
        String str338 = (i6 & 131072) != 0 ? null : str133;
        String str339 = (i6 & 262144) != 0 ? null : str134;
        String str340 = (i6 & 524288) != 0 ? null : str135;
        String str341 = (i6 & 1048576) != 0 ? null : str136;
        String str342 = (i6 & 2097152) != 0 ? null : str137;
        String str343 = (i6 & 4194304) != 0 ? null : str138;
        String str344 = (i6 & 8388608) != 0 ? null : str139;
        String str345 = (i6 & 16777216) != 0 ? null : str140;
        String str346 = (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str141;
        String str347 = (i6 & 67108864) != 0 ? null : str142;
        String str348 = (i6 & 134217728) != 0 ? null : str143;
        String str349 = (i6 & 268435456) != 0 ? null : str144;
        String str350 = (i6 & 536870912) != 0 ? null : str145;
        String str351 = (i6 & 1073741824) != 0 ? null : str146;
        String str352 = (i6 & Integer.MIN_VALUE) != 0 ? null : str147;
        this(str202, str203, str204, str205, str206, str207, str208, str209, str210, str211, str212, str213, str214, str215, str216, str217, str218, str219, str220, str221, str222, str223, str224, str225, str226, str227, str228, str229, str230, tpSlTriggerParamReqResp2, str231, str240, str233, str234, str235, str236, str237, str238, str239, str241, str242, str243, str244, str245, str246, str247, str248, str249, str250, str251, str252, str253, str254, str255, str256, str257, str258, str259, str260, str261, z5, str262, str263, str272, str265, str266, str267, str268, str269, str270, str271, str273, list5, bool3, str274, str275, str276, arrayList7, str277, str278, str279, str280, str281, str282, str283, str284, str285, arrayList8, str286, str287, str288, str289, str290, str291, str292, str301, str294, str295, str296, str297, str298, str299, str300, str302, str303, str304, str305, str306, str307, str308, arrayList9, str309, list6, str310, str311, str312, str313, str314, str315, str316, str317, str318, bool4, trailingConfig3, trailingConfig4, str319, str320, str328, str322, str323, str324, str325, str326, str327, arrayList10, str329, str330, str331, str332, str333, str334, str335, str336, str337, arrayList11, str338, str339, str340, str341, str342, str343, str344, str345, str346, str347, str348, str349, str350, str351, str352, (i7 & 1) != 0 ? null : str148, (i7 & 2) != 0 ? null : str149, (i7 & 4) != 0 ? null : str150, (i7 & 8) != 0 ? null : str151, (i7 & 16) != 0 ? null : str152, (i7 & 32) != 0 ? null : str153, (i7 & 64) != 0 ? null : str154, (i7 & 128) != 0 ? null : str155, (i7 & 256) != 0 ? false : z2, (i7 & 512) != 0 ? "" : str156, (i7 & 1024) != 0 ? null : str157, (i7 & 2048) != 0 ? null : str158, (i7 & 4096) != 0 ? null : str159, (i7 & 8192) != 0 ? null : str160, (i7 & 16384) != 0 ? null : str161, (i7 & 32768) != 0 ? null : str162, (i7 & 65536) != 0 ? false : z3, (i7 & 131072) != 0 ? null : str163, (i7 & 262144) != 0 ? null : str164, (i7 & 524288) != 0 ? null : str165, (i7 & 1048576) != 0 ? null : extendedBusinessInfo, (i7 & 2097152) != 0 ? null : str166, (i7 & 4194304) != 0 ? null : str167, (i7 & 8388608) != 0 ? null : arrayList6, (i7 & 16777216) != 0 ? null : str168, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str169, (i7 & 67108864) != 0 ? "" : str170, (i7 & 134217728) != 0 ? "" : str171, (i7 & 268435456) != 0 ? null : str172, (i7 & 536870912) != 0 ? null : tacticsVoucherInfo, (i7 & 1073741824) != 0 ? "" : str173, (i7 & Integer.MIN_VALUE) != 0 ? "" : str174, (i8 & 1) != 0 ? "" : str175, (i8 & 2) != 0 ? "" : str176, (i8 & 4) != 0 ? "" : str177, (i8 & 8) != 0 ? "" : str178, (i8 & 16) != 0 ? "" : str179, (i8 & 32) != 0 ? "" : str180, (i8 & 64) != 0 ? "" : str181, (i8 & 128) != 0 ? "" : str182, (i8 & 256) != 0 ? true : z4, (i8 & 512) != 0 ? "" : str183, (i8 & 1024) != 0 ? "" : str184, (i8 & 2048) != 0 ? "" : str185, (i8 & 4096) != 0 ? "" : str186, (i8 & 8192) != 0 ? null : strategyProfitResponse, (i8 & 16384) != 0 ? null : list3, (i8 & 32768) != 0 ? "" : str187, (i8 & 65536) != 0 ? null : str188, (i8 & 131072) != 0 ? null : str189, (i8 & 262144) != 0 ? "" : str190, (i8 & 524288) != 0 ? "" : str191, (i8 & 1048576) != 0 ? null : list4, (i8 & 2097152) != 0 ? null : str192, (i8 & 4194304) != 0 ? null : str193, (i8 & 8388608) != 0 ? null : f, (i8 & 16777216) != 0 ? null : smartEarnParam, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : arbitrageTotalPnlInfo, (i8 & 67108864) != 0 ? 0 : i, (i8 & 134217728) != 0 ? null : str194, (i8 & 268435456) != 0 ? null : str195, (i8 & 536870912) != 0 ? null : str196, (i8 & 1073741824) != 0 ? null : str197, (i8 & Integer.MIN_VALUE) != 0 ? "" : str198, (i9 & 1) != 0 ? null : profitDetailResponse, (i9 & 2) != 0 ? null : profitDetailResponse2, (i9 & 4) != 0 ? null : balanceDetailInfoDto, (i9 & 8) == 0 ? botVo : null, (i9 & 16) != 0 ? "" : str199, (i9 & 32) != 0 ? "" : str200, (i9 & 64) != 0 ? "" : str201);
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getCancelTime() {
        if (Intrinsics.EZpvd((Object) this.ordType, (Object) "conditional") || Intrinsics.EZpvd((Object) this.ordType, (Object) "oco") || Intrinsics.EZpvd((Object) this.ordType, (Object) "trigger") || Intrinsics.EZpvd((Object) this.ordType, (Object) "move_order_stop")) {
            return (Intrinsics.EZpvd((Object) this.state, (Object) "canceled") || Intrinsics.EZpvd((Object) this.state, (Object) "canceled")) ? this.uTime : "";
        }
        String str = C33129mqd.OLrzqt((CharSequence) this.algoOrdType) ? this.algoOrdType : this.ordType;
        switch (str.hashCode()) {
            case -1831183611:
                if (!str.equals("spot_dca")) {
                    return "";
                }
                break;
            case -1574173039:
                if (!str.equals("infinite_grid")) {
                    return "";
                }
                break;
            case -1418042064:
                if (!str.equals("ai_bot")) {
                    return "";
                }
                break;
            case -1402017003:
                if (!str.equals("contract_dca")) {
                    return "";
                }
                break;
            case -1216369070:
                if (!str.equals("smart_portfolio")) {
                    return "";
                }
                break;
            case -1148661171:
                if (!str.equals("smart_iceberg")) {
                    return "";
                }
                break;
            case -1086683216:
                if (!str.equals("signal_bot")) {
                    return "";
                }
                break;
            case -591806012:
                if (!str.equals("moon_grid")) {
                    return "";
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                    return "";
                }
                break;
            case 3181382:
                if (!str.equals("grid")) {
                    return "";
                }
                break;
            case 3573234:
                if (!str.equals("twap")) {
                    return "";
                }
                break;
            case 1165749981:
                if (!str.equals("recurring")) {
                    return "";
                }
                break;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return this.uTime;
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
    public ArrayList<String> getHiddenFeaturesData() {
        ArrayList<String> arrayList = this.hiddenFeatures;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<String> getForbiddenFunctions() {
        return new ArrayList<>();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isArbitrageWithStaking() {
        List<? extends SubArbitrageType4Remote> list = this.subArbTypes;
        return (list != null ? (SubArbitrageType4Remote) CollectionsKt___CollectionsKt.firstOrNull(list) : null) == SubArbitrageType4Remote.STAKE;
    }

    public String getStakingApy() {
        ProfitDetailResponse profitDetailResponse = this.stakingProfit;
        String apy = profitDetailResponse != null ? profitDetailResponse.getApy() : null;
        return apy == null ? "" : apy;
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
    public List<String> getVipProfitState() {
        return yDY.AhwBna();
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

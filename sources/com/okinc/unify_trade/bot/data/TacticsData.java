package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.PriceLockerTradeBean;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.subscribe.EditParams;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56071xvr;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TacticsData> CREATOR = new Creator();
    private String actualMarginSz;
    private String algoId;
    private final ArrayList<SmartArbListItem> arbList;
    private final String arbitrageStakingError;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private final Boolean associate;
    private String autoMarginReloadMaxAmount;
    private boolean autoMarginReloadSwitch;
    private final AutoVipProfitInfo autoVipProfitInfo;
    private String availableMargin;
    private String balType;
    private final BalanceDetailInfoDto balanceDetails;
    private boolean basePos;
    private String baseSz;
    private final BotVo bot;
    private final String cTime;
    private final long cTimeStamp;
    private Boolean cbAutoReserve;
    private final String ccy;
    private final ContractDcaSpecialData contractDcaSpecialData;
    private String copyType;
    private String curBaseSz;
    private String curQuoteSz;
    private String cycleId;
    private String dcdState;
    private String deeplink;
    private String deltaRatio;
    private String direction;
    private final boolean displayMinPaybackDays;
    private final StrategyDcaEditResp effectiveEditParametersDetails;
    private final ExtendedBusinessInfo extendedBusinessInfo;
    private String extraMarginSz;
    private List<TacticsListButtonItem> extraOperatorList;
    private String filledPercentage;
    private String floatingPnl;
    private final ArrayList<String> forbidden;
    private final List<FundingFeeApyItem> fundingFeeApyList;
    private String gridNum;
    private final String gridState;
    private final ArrayList<String> hiddenFeatures;
    private final String highestApyPeriod;
    private boolean history;
    private ArrayList<SmartPortfolioListItem> hoardItemList;
    private final String initOrdAmt;
    private final String instFamily;
    private String instId;
    private List<String> instIds;
    private final List<ArbitrageOrderBean> instList;
    private String instType;
    private String interval;
    private String investCcy;
    private final String investment;
    private String investmentType;
    private String isPostWarning;
    private boolean isShowTWapTips;
    private final boolean isSmartArbitrageWithStaking;
    private Boolean isTradeBorrowMode;
    private final int ivShareRes;
    private ArrayList<TacticsListLabelUiData> labelList;
    private String lastPrice;
    private String lastSettlementSettledTime;
    private String lastTradeExpireTime;
    private final StrategyProfitResponse latestProfitData;
    private final String level;
    private final Float leverPrincipal;
    private String liqPx;
    private int locatePage;
    private String longLiqPx;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private final String mktCap;
    private List<TacticsListButtonItem> operateList;
    private String orderType;
    private final String originalLevel;
    private boolean outOfRange;
    private String perGridProfitRatio;
    private String perMaxProfitRate;
    private String perMinProfitRate;
    private final String pnlRatio;
    private final String posSide;
    private PriceLockerTradeBean priceLocker;
    private String profit;
    private MpStgyCopyProfitChangeData profitData;
    private String profitRateDesc;
    private final String profitSharingRatio;
    private List<StrategyProfitResponse> profitSnapshots;
    private final String pxLimit;
    private final String pxSpread;
    private String pxSteps;
    private String pxStepsMult;
    private final String pxVar;
    private ArrayList<RecurringListItem> recItemList;
    private final RecurringBuyDetails recurringBuyDetails;
    private final String reduce_only;
    private boolean reinvestment;
    private Boolean reserveFunds;
    private String ruleType;
    private String runType;
    private String runningDuration;
    private final String safetyOrdAmt;
    private final ShareData shareData;
    private String shortLiqPx;
    private final String side;
    private List<SignParamItem> signParams;
    private final ExitSignalOrderAmtParam signalBotOrderStopParam;
    private String signalChanId;
    private String signalChanName;
    private String signalCount;
    private EntrySignalOrderAmtParam signalOrderAmtParam;
    private String signalSource;
    private String signalSubsSize;
    private String signalSubsSizeDesc;
    private final SmartEarnParam simpleEarn;
    private String slMode;
    private String slPct;
    private String slPx;
    private String slRatio;
    private String slTriggerPx;
    private final SmartArbProfitsInfo smartArbProfitsInfo;
    private String source;
    private final String sourceAlgoId;
    private String sourceCcy;
    private final String sourceCcySz;
    private final String state;
    private String stgyName;
    private final String stopOrangeHint;
    private final String stopStateText;
    private final String stopType;
    private final List<Integer> strategyTags;
    private final ArrayList<TacticsInsideItemData> subData;
    private boolean supportEarlyFill;
    private final SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel;
    private String symbolsNumber;
    private final String sz;
    private final String szLimit;
    private final TacticsType tacticsType;
    private final String tdMode;
    private final String timeInterval;
    private String topupActualMarginSz;
    private String totalAmt;
    private String totalPnl;
    private String totalPnlRatio;
    private String tpPct;
    private String tpPriceRange;
    private final String tpPx;
    private String tpRatio;
    private String tpTriggerPx;
    private final TpSlTriggerParam tpslTriggerParam;
    private String trackingMode;
    private final String tradeNum;
    private final String tradeQuoteCcy;
    private final String tradeSymbol;
    private TrailingConfig trailingDownConfig;
    private String trailingDownFund;
    private TrailingConfig trailingUpConfig;
    private List<DcaTriggerParam> triggerParams;
    private String triggerType;
    private String tvTitle;
    private final String uTime;
    private String volMult;
    private final TacticsVoucherInfo voucherInfo;

    public static final class Creator implements Parcelable.Creator<TacticsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            int i;
            DcaTriggerParam dcaTriggerParamCreateFromParcel;
            Boolean boolValueOf2;
            ArrayList arrayList10;
            Boolean boolValueOf3;
            ArrayList arrayList11;
            Boolean boolValueOf4;
            ArrayList arrayList12;
            ArrayList arrayList13;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string7 = parcel.readString();
            TacticsType tacticsTypeCreateFromParcel = parcel.readInt() == 0 ? null : TacticsType.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            long j = parcel.readLong();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList14.add(TacticsInsideItemData.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList14;
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            ShareData shareDataCreateFromParcel = ShareData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList15.add(ArbitrageOrderBean.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList2 = arrayList15;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            PriceLockerTradeBean priceLockerTradeBeanCreateFromParcel = parcel.readInt() == 0 ? null : PriceLockerTradeBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList16.add(RecurringListItem.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList3 = arrayList16;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList17.add(SmartPortfolioListItem.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList4 = arrayList17;
            }
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList18.add(TacticsListButtonItem.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList5 = arrayList18;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i13);
                int i14 = 0;
                while (i14 != i13) {
                    arrayList19.add(TacticsListButtonItem.CREATOR.createFromParcel(parcel));
                    i14++;
                    i13 = i13;
                }
                arrayList6 = arrayList19;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList20.add(parcel.readParcelable(TacticsData.class.getClassLoader()));
                    i16++;
                    i15 = i15;
                }
                arrayList7 = arrayList20;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i17);
                int i18 = 0;
                while (i18 != i17) {
                    arrayList21.add(SignParamItem.CREATOR.createFromParcel(parcel));
                    i18++;
                    i17 = i17;
                }
                arrayList8 = arrayList21;
            }
            String string22 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i19);
                int i20 = 0;
                while (i20 != i19) {
                    if (parcel.readInt() == 0) {
                        i = i19;
                        dcaTriggerParamCreateFromParcel = null;
                    } else {
                        i = i19;
                        dcaTriggerParamCreateFromParcel = DcaTriggerParam.CREATOR.createFromParcel(parcel);
                    }
                    arrayList22.add(dcaTriggerParamCreateFromParcel);
                    i20++;
                    i19 = i;
                }
                arrayList9 = arrayList22;
            }
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            TpSlTriggerParam tpSlTriggerParamCreateFromParcel = TpSlTriggerParam.CREATOR.createFromParcel(parcel);
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
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string51 = parcel.readString();
            String string52 = parcel.readString();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            String string55 = parcel.readString();
            String string56 = parcel.readString();
            String string57 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string58 = parcel.readString();
            String string59 = parcel.readString();
            String string60 = parcel.readString();
            String string61 = parcel.readString();
            String string62 = parcel.readString();
            String string63 = parcel.readString();
            int i21 = parcel.readInt();
            String string64 = parcel.readString();
            String string65 = parcel.readString();
            String string66 = parcel.readString();
            String string67 = parcel.readString();
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            TrailingConfig trailingConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            String string68 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z3 = parcel.readInt() != 0;
            String string69 = parcel.readString();
            String string70 = parcel.readString();
            String string71 = parcel.readString();
            String string72 = parcel.readString();
            String string73 = parcel.readString();
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
            boolean z4 = parcel.readInt() != 0;
            String string84 = parcel.readString();
            ExtendedBusinessInfo extendedBusinessInfoCreateFromParcel = parcel.readInt() == 0 ? null : ExtendedBusinessInfo.CREATOR.createFromParcel(parcel);
            String string85 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i22 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i22);
                int i23 = 0;
                while (i23 != i22) {
                    arrayList23.add(SmartArbListItem.CREATOR.createFromParcel(parcel));
                    i23++;
                    i22 = i22;
                }
                arrayList10 = arrayList23;
            }
            boolean z5 = parcel.readInt() != 0;
            String string86 = parcel.readString();
            String string87 = parcel.readString();
            String string88 = parcel.readString();
            String string89 = parcel.readString();
            String string90 = parcel.readString();
            String string91 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string92 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i24);
                int i25 = 0;
                while (i25 != i24) {
                    arrayList24.add(Integer.valueOf(parcel.readInt()));
                    i25++;
                    i24 = i24;
                }
                arrayList11 = arrayList24;
            }
            EntrySignalOrderAmtParam entrySignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : EntrySignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            ExitSignalOrderAmtParam exitSignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : ExitSignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            TacticsVoucherInfo tacticsVoucherInfoCreateFromParcel = parcel.readInt() == 0 ? null : TacticsVoucherInfo.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string93 = parcel.readString();
            boolean z7 = parcel.readInt() != 0;
            String string94 = parcel.readString();
            String string95 = parcel.readString();
            MpStgyCopyProfitChangeData mpStgyCopyProfitChangeDataCreateFromParcel = parcel.readInt() == 0 ? null : MpStgyCopyProfitChangeData.CREATOR.createFromParcel(parcel);
            String string96 = parcel.readString();
            String string97 = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            String string98 = parcel.readString();
            String string99 = parcel.readString();
            String string100 = parcel.readString();
            SmartEarnParam smartEarnParamCreateFromParcel = parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel);
            String string101 = parcel.readString();
            String string102 = parcel.readString();
            String string103 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfoCreateFromParcel = parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            ContractDcaSpecialData contractDcaSpecialDataCreateFromParcel = parcel.readInt() == 0 ? null : ContractDcaSpecialData.CREATOR.createFromParcel(parcel);
            String string104 = parcel.readString();
            boolean z9 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int i26 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i26);
                int i27 = 0;
                while (i27 != i26) {
                    arrayList25.add(FundingFeeApyItem.CREATOR.createFromParcel(parcel));
                    i27++;
                    i26 = i26;
                }
                arrayList12 = arrayList25;
            }
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int i28 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(i28);
                int i29 = 0;
                while (i29 != i28) {
                    arrayList26.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                    i29++;
                    i28 = i28;
                }
                arrayList13 = arrayList26;
            }
            return new TacticsData(string, string2, string3, string4, string5, string6, z, string7, tacticsTypeCreateFromParcel, i2, string8, string9, j, string10, arrayList, string11, string12, string13, shareDataCreateFromParcel, arrayList2, boolValueOf, string14, string15, string16, string17, string18, string19, priceLockerTradeBeanCreateFromParcel, arrayList3, arrayList4, string20, string21, arrayList5, arrayList6, arrayList7, arrayList8, string22, arrayList9, string23, string24, string25, string26, tpSlTriggerParamCreateFromParcel, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, arrayListCreateStringArrayList, string51, string52, string53, string54, string55, string56, string57, z2, string58, string59, string60, string61, string62, string63, i21, string64, string65, string66, string67, trailingConfigCreateFromParcel, trailingConfigCreateFromParcel2, string68, boolValueOf2, z3, string69, string70, string71, string72, string73, string74, string75, string76, string77, string78, string79, string80, string81, string82, string83, z4, string84, extendedBusinessInfoCreateFromParcel, string85, arrayList10, z5, string86, string87, string88, string89, string90, string91, boolValueOf3, string92, z6, arrayList11, entrySignalOrderAmtParamCreateFromParcel, exitSignalOrderAmtParamCreateFromParcel, tacticsVoucherInfoCreateFromParcel, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string93, z7, string94, string95, mpStgyCopyProfitChangeDataCreateFromParcel, string96, string97, z8, string98, string99, string100, smartEarnParamCreateFromParcel, string101, string102, string103, boolValueOf4, arbitrageTotalPnlInfoCreateFromParcel, fValueOf, contractDcaSpecialDataCreateFromParcel, string104, z9, arrayList12, arrayList13, parcel.readInt() == 0 ? null : StrategyProfitResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : SmartArbProfitsInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BalanceDetailInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BotVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoVipProfitInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StrategyDcaEditResp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SwapCoinMProfitSwitchUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RecurringBuyDetails.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsData[] newArray(int i) {
            return new TacticsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsData() {
        this(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.ivShareRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component100() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component101() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component102() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component103() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component104() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component105() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component106() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component107() {
        return this.trackingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component108() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component109() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendedBusinessInfo component110() {
        return this.extendedBusinessInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component111() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> component112() {
        return this.arbList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component113() {
        return this.outOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component114() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component115() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component116() {
        return this.curQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component117() {
        return this.curBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component118() {
        return this.isPostWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component119() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component120() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component121() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component122() {
        return this.isShowTWapTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component123() {
        return this.strategyTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component124() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component125() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo component126() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component127() {
        return this.forbidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component128() {
        return this.hiddenFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component129() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.cTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component130() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component131() {
        return this.lastTradeExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component132() {
        return this.lastSettlementSettledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpStgyCopyProfitChangeData component133() {
        return this.profitData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component134() {
        return this.runningDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component135() {
        return this.arbitrageStakingError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component136() {
        return this.isSmartArbitrageWithStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component137() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component138() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component139() {
        return this.topupActualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component140() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component141() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component142() {
        return this.investmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component143() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component144() {
        return this.cbAutoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component145() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component146() {
        return this.leverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractDcaSpecialData component147() {
        return this.contractDcaSpecialData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component148() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component149() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsInsideItemData> component15() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> component150() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component151() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component152() {
        return this.latestProfitData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component153() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbProfitsInfo component154() {
        return this.smartArbProfitsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto component155() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo component156() {
        return this.bot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo component157() {
        return this.autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component158() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component159() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tradeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp component160() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapCoinMProfitSwitchUiModel component161() {
        return this.swapCoinMProfitSwitchUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDetails component162() {
        return this.recurringBuyDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.stopStateText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.stopOrangeHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareData component19() {
        return this.shareData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageOrderBean> component20() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.associate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean component28() {
        return this.priceLocker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> component29() {
        return this.recItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> component30() {
        return this.hoardItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TacticsListButtonItem> component33() {
        return this.operateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TacticsListButtonItem> component34() {
        return this.extraOperatorList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsListLabelUiData> component35() {
        return this.labelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignParamItem> component36() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component38() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParam component43() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.tpPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.gridState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.originalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.longLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.shortLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.filledPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.reduce_only;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component68() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.history;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.floatingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.availableMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.signalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component76() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.signalSubsSizeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.signalSubsSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.signalSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tvTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.profitRateDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.symbolsNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component83() {
        return this.locatePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component88() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component89() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsType component9() {
        return this.tacticsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component91() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component92() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component93() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, TacticsType tacticsType, int i, @NotNull String str8, @NotNull String str9, long j, @NotNull String str10, ArrayList<TacticsInsideItemData> arrayList, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull ShareData shareData, List<ArbitrageOrderBean> list, Boolean bool, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, PriceLockerTradeBean priceLockerTradeBean, ArrayList<RecurringListItem> arrayList2, ArrayList<SmartPortfolioListItem> arrayList3, String str20, @NotNull String str21, List<TacticsListButtonItem> list2, List<TacticsListButtonItem> list3, ArrayList<TacticsListLabelUiData> arrayList4, List<SignParamItem> list4, @NotNull String str22, List<DcaTriggerParam> list5, String str23, String str24, String str25, String str26, @NotNull TpSlTriggerParam tpSlTriggerParam, String str27, String str28, String str29, @NotNull String str30, @NotNull String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, @NotNull String str50, List<String> list6, String str51, String str52, String str53, String str54, String str55, String str56, String str57, boolean z2, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, String str62, String str63, int i2, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str68, Boolean bool2, boolean z3, String str69, String str70, String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, String str75, String str76, String str77, String str78, String str79, String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83, boolean z4, String str84, ExtendedBusinessInfo extendedBusinessInfo, String str85, ArrayList<SmartArbListItem> arrayList5, boolean z5, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, @NotNull String str90, String str91, Boolean bool3, @NotNull String str92, boolean z6, List<Integer> list7, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, @NotNull ArrayList<String> arrayList6, @NotNull ArrayList<String> arrayList7, @NotNull String str93, boolean z7, @NotNull String str94, @NotNull String str95, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, @NotNull String str96, String str97, boolean z8, @NotNull String str98, @NotNull String str99, String str100, SmartEarnParam smartEarnParam, String str101, String str102, String str103, Boolean bool4, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, ContractDcaSpecialData contractDcaSpecialData, String str104, boolean z9, List<FundingFeeApyItem> list8, List<StrategyProfitResponse> list9, StrategyProfitResponse strategyProfitResponse, String str105, SmartArbProfitsInfo smartArbProfitsInfo, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, AutoVipProfitInfo autoVipProfitInfo, String str106, String str107, StrategyDcaEditResp strategyDcaEditResp, SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel, RecurringBuyDetails recurringBuyDetails) {
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
        Intrinsics.checkNotNullParameter(shareData, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str90, "");
        Intrinsics.checkNotNullParameter(str92, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        Intrinsics.checkNotNullParameter(arrayList7, "");
        Intrinsics.checkNotNullParameter(str93, "");
        Intrinsics.checkNotNullParameter(str94, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str99, "");
        return new TacticsData(str, str2, str3, str4, str5, str6, z, str7, tacticsType, i, str8, str9, j, str10, arrayList, str11, str12, str13, shareData, list, bool, str14, str15, str16, str17, str18, str19, priceLockerTradeBean, arrayList2, arrayList3, str20, str21, list2, list3, arrayList4, list4, str22, list5, str23, str24, str25, str26, tpSlTriggerParam, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, list6, str51, str52, str53, str54, str55, str56, str57, z2, str58, str59, str60, str61, str62, str63, i2, str64, str65, str66, str67, trailingConfig, trailingConfig2, str68, bool2, z3, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, z4, str84, extendedBusinessInfo, str85, arrayList5, z5, str86, str87, str88, str89, str90, str91, bool3, str92, z6, list7, entrySignalOrderAmtParam, exitSignalOrderAmtParam, tacticsVoucherInfo, arrayList6, arrayList7, str93, z7, str94, str95, mpStgyCopyProfitChangeData, str96, str97, z8, str98, str99, str100, smartEarnParam, str101, str102, str103, bool4, arbitrageTotalPnlInfo, f, contractDcaSpecialData, str104, z9, list8, list9, strategyProfitResponse, str105, smartArbProfitsInfo, balanceDetailInfoDto, botVo, autoVipProfitInfo, str106, str107, strategyDcaEditResp, swapCoinMProfitSwitchUiModel, recurringBuyDetails);
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
        if (!(obj instanceof TacticsData)) {
            return false;
        }
        TacticsData tacticsData = (TacticsData) obj;
        return Intrinsics.EZpvd((Object) this.orderType, (Object) tacticsData.orderType) && Intrinsics.EZpvd((Object) this.algoId, (Object) tacticsData.algoId) && Intrinsics.EZpvd((Object) this.instType, (Object) tacticsData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) tacticsData.instId) && Intrinsics.EZpvd((Object) this.state, (Object) tacticsData.state) && Intrinsics.EZpvd((Object) this.filledPercentage, (Object) tacticsData.filledPercentage) && this.history == tacticsData.history && Intrinsics.EZpvd((Object) this.tvTitle, (Object) tacticsData.tvTitle) && this.tacticsType == tacticsData.tacticsType && this.ivShareRes == tacticsData.ivShareRes && Intrinsics.EZpvd((Object) this.level, (Object) tacticsData.level) && Intrinsics.EZpvd((Object) this.cTime, (Object) tacticsData.cTime) && this.cTimeStamp == tacticsData.cTimeStamp && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) tacticsData.pnlRatio) && Intrinsics.EZpvd(this.subData, tacticsData.subData) && Intrinsics.EZpvd((Object) this.tradeSymbol, (Object) tacticsData.tradeSymbol) && Intrinsics.EZpvd((Object) this.stopStateText, (Object) tacticsData.stopStateText) && Intrinsics.EZpvd((Object) this.stopOrangeHint, (Object) tacticsData.stopOrangeHint) && Intrinsics.EZpvd(this.shareData, tacticsData.shareData) && Intrinsics.EZpvd(this.instList, tacticsData.instList) && Intrinsics.EZpvd(this.associate, tacticsData.associate) && Intrinsics.EZpvd((Object) this.stgyName, (Object) tacticsData.stgyName) && Intrinsics.EZpvd((Object) this.direction, (Object) tacticsData.direction) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) tacticsData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tacticsData.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) tacticsData.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) tacticsData.slRatio) && Intrinsics.EZpvd(this.priceLocker, tacticsData.priceLocker) && Intrinsics.EZpvd(this.recItemList, tacticsData.recItemList) && Intrinsics.EZpvd(this.hoardItemList, tacticsData.hoardItemList) && Intrinsics.EZpvd((Object) this.investCcy, (Object) tacticsData.investCcy) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) tacticsData.lastPrice) && Intrinsics.EZpvd(this.operateList, tacticsData.operateList) && Intrinsics.EZpvd(this.extraOperatorList, tacticsData.extraOperatorList) && Intrinsics.EZpvd(this.labelList, tacticsData.labelList) && Intrinsics.EZpvd(this.signParams, tacticsData.signParams) && Intrinsics.EZpvd((Object) this.uTime, (Object) tacticsData.uTime) && Intrinsics.EZpvd(this.triggerParams, tacticsData.triggerParams) && Intrinsics.EZpvd((Object) this.cycleId, (Object) tacticsData.cycleId) && Intrinsics.EZpvd((Object) this.stopType, (Object) tacticsData.stopType) && Intrinsics.EZpvd((Object) this.tpPx, (Object) tacticsData.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) tacticsData.slPx) && Intrinsics.EZpvd(this.tpslTriggerParam, tacticsData.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.tpPriceRange, (Object) tacticsData.tpPriceRange) && Intrinsics.EZpvd((Object) this.gridState, (Object) tacticsData.gridState) && Intrinsics.EZpvd((Object) this.originalLevel, (Object) tacticsData.originalLevel) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) tacticsData.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) tacticsData.extraMarginSz) && Intrinsics.EZpvd((Object) this.liqPx, (Object) tacticsData.liqPx) && Intrinsics.EZpvd((Object) this.longLiqPx, (Object) tacticsData.longLiqPx) && Intrinsics.EZpvd((Object) this.shortLiqPx, (Object) tacticsData.shortLiqPx) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) tacticsData.tradeNum) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) tacticsData.pxSpread) && Intrinsics.EZpvd((Object) this.pxVar, (Object) tacticsData.pxVar) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) tacticsData.pxLimit) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) tacticsData.timeInterval) && Intrinsics.EZpvd((Object) this.szLimit, (Object) tacticsData.szLimit) && Intrinsics.EZpvd((Object) this.sz, (Object) tacticsData.sz) && Intrinsics.EZpvd((Object) this.side, (Object) tacticsData.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) tacticsData.posSide) && Intrinsics.EZpvd((Object) this.tdMode, (Object) tacticsData.tdMode) && Intrinsics.EZpvd((Object) this.reduce_only, (Object) tacticsData.reduce_only) && Intrinsics.EZpvd((Object) this.ccy, (Object) tacticsData.ccy) && Intrinsics.EZpvd((Object) this.copyType, (Object) tacticsData.copyType) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) tacticsData.profitSharingRatio) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) tacticsData.sourceAlgoId) && Intrinsics.EZpvd((Object) this.mktCap, (Object) tacticsData.mktCap) && Intrinsics.EZpvd(this.instIds, tacticsData.instIds) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) tacticsData.totalAmt) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) tacticsData.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) tacticsData.signalChanName) && Intrinsics.EZpvd((Object) this.floatingPnl, (Object) tacticsData.floatingPnl) && Intrinsics.EZpvd((Object) this.availableMargin, (Object) tacticsData.availableMargin) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) tacticsData.totalPnlRatio) && Intrinsics.EZpvd((Object) this.signalCount, (Object) tacticsData.signalCount) && this.supportEarlyFill == tacticsData.supportEarlyFill && Intrinsics.EZpvd((Object) this.signalSubsSizeDesc, (Object) tacticsData.signalSubsSizeDesc) && Intrinsics.EZpvd((Object) this.signalSubsSize, (Object) tacticsData.signalSubsSize) && Intrinsics.EZpvd((Object) this.signalSource, (Object) tacticsData.signalSource) && Intrinsics.EZpvd((Object) this.profitRateDesc, (Object) tacticsData.profitRateDesc) && Intrinsics.EZpvd((Object) this.profit, (Object) tacticsData.profit) && Intrinsics.EZpvd((Object) this.symbolsNumber, (Object) tacticsData.symbolsNumber) && this.locatePage == tacticsData.locatePage && Intrinsics.EZpvd((Object) this.maxPx, (Object) tacticsData.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) tacticsData.minPx) && Intrinsics.EZpvd((Object) this.runType, (Object) tacticsData.runType) && Intrinsics.EZpvd((Object) this.gridNum, (Object) tacticsData.gridNum) && Intrinsics.EZpvd(this.trailingUpConfig, tacticsData.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, tacticsData.trailingDownConfig) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) tacticsData.trailingDownFund) && Intrinsics.EZpvd(this.reserveFunds, tacticsData.reserveFunds) && this.basePos == tacticsData.basePos && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) tacticsData.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) tacticsData.perMinProfitRate) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) tacticsData.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.balType, (Object) tacticsData.balType) && Intrinsics.EZpvd((Object) this.interval, (Object) tacticsData.interval) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) tacticsData.deltaRatio) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) tacticsData.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) tacticsData.pxSteps) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) tacticsData.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) tacticsData.volMult) && Intrinsics.EZpvd((Object) this.tpPct, (Object) tacticsData.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) tacticsData.slPct) && Intrinsics.EZpvd((Object) this.slMode, (Object) tacticsData.slMode) && Intrinsics.EZpvd((Object) this.triggerType, (Object) tacticsData.triggerType) && Intrinsics.EZpvd((Object) this.trackingMode, (Object) tacticsData.trackingMode) && this.autoMarginReloadSwitch == tacticsData.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) tacticsData.autoMarginReloadMaxAmount) && Intrinsics.EZpvd(this.extendedBusinessInfo, tacticsData.extendedBusinessInfo) && Intrinsics.EZpvd((Object) this.instFamily, (Object) tacticsData.instFamily) && Intrinsics.EZpvd(this.arbList, tacticsData.arbList) && this.outOfRange == tacticsData.outOfRange && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) tacticsData.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) tacticsData.sourceCcySz) && Intrinsics.EZpvd((Object) this.curQuoteSz, (Object) tacticsData.curQuoteSz) && Intrinsics.EZpvd((Object) this.curBaseSz, (Object) tacticsData.curBaseSz) && Intrinsics.EZpvd((Object) this.isPostWarning, (Object) tacticsData.isPostWarning) && Intrinsics.EZpvd((Object) this.ruleType, (Object) tacticsData.ruleType) && Intrinsics.EZpvd(this.isTradeBorrowMode, tacticsData.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) tacticsData.totalPnl) && this.isShowTWapTips == tacticsData.isShowTWapTips && Intrinsics.EZpvd(this.strategyTags, tacticsData.strategyTags) && Intrinsics.EZpvd(this.signalOrderAmtParam, tacticsData.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, tacticsData.signalBotOrderStopParam) && Intrinsics.EZpvd(this.voucherInfo, tacticsData.voucherInfo) && Intrinsics.EZpvd(this.forbidden, tacticsData.forbidden) && Intrinsics.EZpvd(this.hiddenFeatures, tacticsData.hiddenFeatures) && Intrinsics.EZpvd((Object) this.dcdState, (Object) tacticsData.dcdState) && this.reinvestment == tacticsData.reinvestment && Intrinsics.EZpvd((Object) this.lastTradeExpireTime, (Object) tacticsData.lastTradeExpireTime) && Intrinsics.EZpvd((Object) this.lastSettlementSettledTime, (Object) tacticsData.lastSettlementSettledTime) && Intrinsics.EZpvd(this.profitData, tacticsData.profitData) && Intrinsics.EZpvd((Object) this.runningDuration, (Object) tacticsData.runningDuration) && Intrinsics.EZpvd((Object) this.arbitrageStakingError, (Object) tacticsData.arbitrageStakingError) && this.isSmartArbitrageWithStaking == tacticsData.isSmartArbitrageWithStaking && Intrinsics.EZpvd((Object) this.deeplink, (Object) tacticsData.deeplink) && Intrinsics.EZpvd((Object) this.source, (Object) tacticsData.source) && Intrinsics.EZpvd((Object) this.topupActualMarginSz, (Object) tacticsData.topupActualMarginSz) && Intrinsics.EZpvd(this.simpleEarn, tacticsData.simpleEarn) && Intrinsics.EZpvd((Object) this.baseSz, (Object) tacticsData.baseSz) && Intrinsics.EZpvd((Object) this.investmentType, (Object) tacticsData.investmentType) && Intrinsics.EZpvd((Object) this.investment, (Object) tacticsData.investment) && Intrinsics.EZpvd(this.cbAutoReserve, tacticsData.cbAutoReserve) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, tacticsData.arbitrageTotalPnlInfo) && Intrinsics.EZpvd(this.leverPrincipal, tacticsData.leverPrincipal) && Intrinsics.EZpvd(this.contractDcaSpecialData, tacticsData.contractDcaSpecialData) && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) tacticsData.highestApyPeriod) && this.displayMinPaybackDays == tacticsData.displayMinPaybackDays && Intrinsics.EZpvd(this.fundingFeeApyList, tacticsData.fundingFeeApyList) && Intrinsics.EZpvd(this.profitSnapshots, tacticsData.profitSnapshots) && Intrinsics.EZpvd(this.latestProfitData, tacticsData.latestProfitData) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tacticsData.tradeQuoteCcy) && Intrinsics.EZpvd(this.smartArbProfitsInfo, tacticsData.smartArbProfitsInfo) && Intrinsics.EZpvd(this.balanceDetails, tacticsData.balanceDetails) && Intrinsics.EZpvd(this.bot, tacticsData.bot) && Intrinsics.EZpvd(this.autoVipProfitInfo, tacticsData.autoVipProfitInfo) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) tacticsData.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) tacticsData.safetyOrdAmt) && Intrinsics.EZpvd(this.effectiveEditParametersDetails, tacticsData.effectiveEditParametersDetails) && Intrinsics.EZpvd(this.swapCoinMProfitSwitchUiModel, tacticsData.swapCoinMProfitSwitchUiModel) && Intrinsics.EZpvd(this.recurringBuyDetails, tacticsData.recurringBuyDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbListItem> getArbList() {
        return this.arbList;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoMarginReloadMaxAmount() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoMarginReloadSwitch() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo getAutoVipProfitInfo() {
        return this.autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableMargin() {
        return this.availableMargin;
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
    public final long getCTimeStamp() {
        return this.cTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCbAutoReserve() {
        return this.cbAutoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractDcaSpecialData getContractDcaSpecialData() {
        return this.contractDcaSpecialData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyType() {
        return this.copyType;
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
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdState() {
        return this.dcdState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
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
    public final boolean getDisplayMinPaybackDays() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp getEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
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
    public final List<TacticsListButtonItem> getExtraOperatorList() {
        return this.extraOperatorList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledPercentage() {
        return this.filledPercentage;
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
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridState() {
        return this.gridState;
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
    public final boolean getHistory() {
        return this.history;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> getHoardItemList() {
        return this.hoardItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
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
    public final List<ArbitrageOrderBean> getInstList() {
        return this.instList;
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
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentType() {
        return this.investmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIvShareRes() {
        return this.ivShareRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsListLabelUiData> getLabelList() {
        return this.labelList;
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
    public final StrategyProfitResponse getLatestProfitData() {
        return this.latestProfitData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeverPrincipal() {
        return this.leverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLocatePage() {
        return this.locatePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongLiqPx() {
        return this.longLiqPx;
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
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCap() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TacticsListButtonItem> getOperateList() {
        return this.operateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalLevel() {
        return this.originalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOutOfRange() {
        return this.outOfRange;
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
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean getPriceLocker() {
        return this.priceLocker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpStgyCopyProfitChangeData getProfitData() {
        return this.profitData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRateDesc() {
        return this.profitRateDesc;
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
    public final ArrayList<RecurringListItem> getRecItemList() {
        return this.recItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDetails getRecurringBuyDetails() {
        return this.recurringBuyDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduce_only() {
        return this.reduce_only;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReinvestment() {
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
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunningDuration() {
        return this.runningDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareData getShareData() {
        return this.shareData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLiqPx() {
        return this.shortLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignParamItem> getSignParams() {
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
    public final String getSignalSource() {
        return this.signalSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalSubsSize() {
        return this.signalSubsSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalSubsSizeDesc() {
        return this.signalSubsSizeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam getSimpleEarn() {
        return this.simpleEarn;
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
    public final SmartArbProfitsInfo getSmartArbProfitsInfo() {
        return this.smartArbProfitsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
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
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopOrangeHint() {
        return this.stopOrangeHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopStateText() {
        return this.stopStateText;
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
    public final ArrayList<TacticsInsideItemData> getSubData() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEarlyFill() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapCoinMProfitSwitchUiModel getSwapCoinMProfitSwitchUiModel() {
        return this.swapCoinMProfitSwitchUiModel;
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
    public final TacticsType getTacticsType() {
        return this.tacticsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopupActualMarginSz() {
        return this.topupActualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
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
    public final TpSlTriggerParam getTpslTriggerParam() {
        return this.tpslTriggerParam;
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
    public final String getTradeSymbol() {
        return this.tradeSymbol;
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
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvTitle() {
        return this.tvTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
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
        int iHashCode = this.orderType.hashCode();
        int iHashCode2 = this.algoId.hashCode();
        int iHashCode3 = this.instType.hashCode();
        int iHashCode4 = this.instId.hashCode();
        int iHashCode5 = this.state.hashCode();
        String str = this.filledPercentage;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Boolean.hashCode(this.history);
        int iHashCode8 = this.tvTitle.hashCode();
        TacticsType tacticsType = this.tacticsType;
        int iHashCode9 = tacticsType == null ? 0 : tacticsType.hashCode();
        int iHashCode10 = Integer.hashCode(this.ivShareRes);
        int iHashCode11 = this.level.hashCode();
        int iHashCode12 = this.cTime.hashCode();
        int iHashCode13 = Long.hashCode(this.cTimeStamp);
        int iHashCode14 = this.pnlRatio.hashCode();
        ArrayList<TacticsInsideItemData> arrayList = this.subData;
        int iHashCode15 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode16 = this.tradeSymbol.hashCode();
        int iHashCode17 = this.stopStateText.hashCode();
        int iHashCode18 = this.stopOrangeHint.hashCode();
        int iHashCode19 = this.shareData.hashCode();
        List<ArbitrageOrderBean> list = this.instList;
        int iHashCode20 = list == null ? 0 : list.hashCode();
        Boolean bool = this.associate;
        int iHashCode21 = bool == null ? 0 : bool.hashCode();
        String str2 = this.stgyName;
        int iHashCode22 = str2 == null ? 0 : str2.hashCode();
        int iHashCode23 = this.direction.hashCode();
        int iHashCode24 = this.tpTriggerPx.hashCode();
        int iHashCode25 = this.slTriggerPx.hashCode();
        int iHashCode26 = this.tpRatio.hashCode();
        int iHashCode27 = this.slRatio.hashCode();
        PriceLockerTradeBean priceLockerTradeBean = this.priceLocker;
        int iHashCode28 = priceLockerTradeBean == null ? 0 : priceLockerTradeBean.hashCode();
        ArrayList<RecurringListItem> arrayList2 = this.recItemList;
        int iHashCode29 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList<SmartPortfolioListItem> arrayList3 = this.hoardItemList;
        int iHashCode30 = arrayList3 == null ? 0 : arrayList3.hashCode();
        String str3 = this.investCcy;
        int iHashCode31 = str3 == null ? 0 : str3.hashCode();
        int iHashCode32 = this.lastPrice.hashCode();
        List<TacticsListButtonItem> list2 = this.operateList;
        int iHashCode33 = list2 == null ? 0 : list2.hashCode();
        List<TacticsListButtonItem> list3 = this.extraOperatorList;
        int iHashCode34 = list3 == null ? 0 : list3.hashCode();
        ArrayList<TacticsListLabelUiData> arrayList4 = this.labelList;
        int iHashCode35 = arrayList4 == null ? 0 : arrayList4.hashCode();
        List<SignParamItem> list4 = this.signParams;
        int iHashCode36 = list4 == null ? 0 : list4.hashCode();
        int iHashCode37 = this.uTime.hashCode();
        List<DcaTriggerParam> list5 = this.triggerParams;
        int iHashCode38 = list5 == null ? 0 : list5.hashCode();
        String str4 = this.cycleId;
        int iHashCode39 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.stopType;
        int iHashCode40 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tpPx;
        int iHashCode41 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slPx;
        int iHashCode42 = str7 == null ? 0 : str7.hashCode();
        int iHashCode43 = this.tpslTriggerParam.hashCode();
        String str8 = this.tpPriceRange;
        int iHashCode44 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.gridState;
        int iHashCode45 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.originalLevel;
        int iHashCode46 = str10 == null ? 0 : str10.hashCode();
        int iHashCode47 = this.actualMarginSz.hashCode();
        int iHashCode48 = this.extraMarginSz.hashCode();
        String str11 = this.liqPx;
        int iHashCode49 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.longLiqPx;
        int iHashCode50 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.shortLiqPx;
        int iHashCode51 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tradeNum;
        int iHashCode52 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.pxSpread;
        int iHashCode53 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.pxVar;
        int iHashCode54 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.pxLimit;
        int iHashCode55 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.timeInterval;
        int iHashCode56 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.szLimit;
        int iHashCode57 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.sz;
        int iHashCode58 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.side;
        int iHashCode59 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.posSide;
        int iHashCode60 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.tdMode;
        int iHashCode61 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.reduce_only;
        int iHashCode62 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.ccy;
        int iHashCode63 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.copyType;
        int iHashCode64 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.profitSharingRatio;
        int iHashCode65 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.sourceAlgoId;
        int iHashCode66 = str28 == null ? 0 : str28.hashCode();
        int iHashCode67 = this.mktCap.hashCode();
        List<String> list6 = this.instIds;
        int iHashCode68 = list6 == null ? 0 : list6.hashCode();
        String str29 = this.totalAmt;
        int iHashCode69 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.signalChanId;
        int iHashCode70 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.signalChanName;
        int iHashCode71 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.floatingPnl;
        int iHashCode72 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.availableMargin;
        int iHashCode73 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.totalPnlRatio;
        int iHashCode74 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.signalCount;
        int iHashCode75 = str35 == null ? 0 : str35.hashCode();
        int iHashCode76 = Boolean.hashCode(this.supportEarlyFill);
        int iHashCode77 = this.signalSubsSizeDesc.hashCode();
        int iHashCode78 = this.signalSubsSize.hashCode();
        int iHashCode79 = this.signalSource.hashCode();
        int iHashCode80 = this.profitRateDesc.hashCode();
        String str36 = this.profit;
        int iHashCode81 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.symbolsNumber;
        int iHashCode82 = str37 == null ? 0 : str37.hashCode();
        int iHashCode83 = Integer.hashCode(this.locatePage);
        int iHashCode84 = this.maxPx.hashCode();
        int iHashCode85 = this.minPx.hashCode();
        int iHashCode86 = this.runType.hashCode();
        int iHashCode87 = this.gridNum.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode88 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode89 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str38 = this.trailingDownFund;
        int iHashCode90 = str38 == null ? 0 : str38.hashCode();
        Boolean bool2 = this.reserveFunds;
        int iHashCode91 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode92 = Boolean.hashCode(this.basePos);
        String str39 = this.perGridProfitRatio;
        int iHashCode93 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.perMinProfitRate;
        int iHashCode94 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.perMaxProfitRate;
        int iHashCode95 = str41 == null ? 0 : str41.hashCode();
        int iHashCode96 = this.balType.hashCode();
        int iHashCode97 = this.interval.hashCode();
        int iHashCode98 = this.deltaRatio.hashCode();
        String str42 = this.maxSafetyOrds;
        int iHashCode99 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.pxSteps;
        int iHashCode100 = str43 == null ? 0 : str43.hashCode();
        String str44 = this.pxStepsMult;
        int iHashCode101 = str44 == null ? 0 : str44.hashCode();
        String str45 = this.volMult;
        int iHashCode102 = str45 == null ? 0 : str45.hashCode();
        String str46 = this.tpPct;
        int iHashCode103 = str46 == null ? 0 : str46.hashCode();
        String str47 = this.slPct;
        int iHashCode104 = str47 == null ? 0 : str47.hashCode();
        int iHashCode105 = this.slMode.hashCode();
        int iHashCode106 = this.triggerType.hashCode();
        int iHashCode107 = this.trackingMode.hashCode();
        int iHashCode108 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str48 = this.autoMarginReloadMaxAmount;
        int iHashCode109 = str48 == null ? 0 : str48.hashCode();
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        int iHashCode110 = extendedBusinessInfo == null ? 0 : extendedBusinessInfo.hashCode();
        String str49 = this.instFamily;
        int iHashCode111 = str49 == null ? 0 : str49.hashCode();
        ArrayList<SmartArbListItem> arrayList5 = this.arbList;
        int iHashCode112 = arrayList5 == null ? 0 : arrayList5.hashCode();
        int iHashCode113 = Boolean.hashCode(this.outOfRange);
        int iHashCode114 = this.sourceCcy.hashCode();
        int iHashCode115 = this.sourceCcySz.hashCode();
        int iHashCode116 = this.curQuoteSz.hashCode();
        int iHashCode117 = this.curBaseSz.hashCode();
        int iHashCode118 = this.isPostWarning.hashCode();
        String str50 = this.ruleType;
        int iHashCode119 = str50 == null ? 0 : str50.hashCode();
        Boolean bool3 = this.isTradeBorrowMode;
        int iHashCode120 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode121 = this.totalPnl.hashCode();
        int iHashCode122 = Boolean.hashCode(this.isShowTWapTips);
        List<Integer> list7 = this.strategyTags;
        int iHashCode123 = list7 == null ? 0 : list7.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode124 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        int iHashCode125 = exitSignalOrderAmtParam == null ? 0 : exitSignalOrderAmtParam.hashCode();
        TacticsVoucherInfo tacticsVoucherInfo = this.voucherInfo;
        int iHashCode126 = tacticsVoucherInfo == null ? 0 : tacticsVoucherInfo.hashCode();
        int iHashCode127 = this.forbidden.hashCode();
        int iHashCode128 = this.hiddenFeatures.hashCode();
        int iHashCode129 = this.dcdState.hashCode();
        int iHashCode130 = Boolean.hashCode(this.reinvestment);
        int iHashCode131 = this.lastTradeExpireTime.hashCode();
        int iHashCode132 = this.lastSettlementSettledTime.hashCode();
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData = this.profitData;
        int iHashCode133 = mpStgyCopyProfitChangeData == null ? 0 : mpStgyCopyProfitChangeData.hashCode();
        int iHashCode134 = this.runningDuration.hashCode();
        String str51 = this.arbitrageStakingError;
        int iHashCode135 = str51 == null ? 0 : str51.hashCode();
        int iHashCode136 = Boolean.hashCode(this.isSmartArbitrageWithStaking);
        int iHashCode137 = this.deeplink.hashCode();
        int iHashCode138 = this.source.hashCode();
        String str52 = this.topupActualMarginSz;
        int iHashCode139 = str52 == null ? 0 : str52.hashCode();
        SmartEarnParam smartEarnParam = this.simpleEarn;
        int iHashCode140 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        String str53 = this.baseSz;
        int iHashCode141 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.investmentType;
        int iHashCode142 = str54 == null ? 0 : str54.hashCode();
        String str55 = this.investment;
        int iHashCode143 = str55 == null ? 0 : str55.hashCode();
        Boolean bool4 = this.cbAutoReserve;
        int iHashCode144 = bool4 == null ? 0 : bool4.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode145 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        Float f = this.leverPrincipal;
        int iHashCode146 = f == null ? 0 : f.hashCode();
        ContractDcaSpecialData contractDcaSpecialData = this.contractDcaSpecialData;
        int iHashCode147 = contractDcaSpecialData == null ? 0 : contractDcaSpecialData.hashCode();
        String str56 = this.highestApyPeriod;
        int iHashCode148 = str56 == null ? 0 : str56.hashCode();
        int iHashCode149 = Boolean.hashCode(this.displayMinPaybackDays);
        List<FundingFeeApyItem> list8 = this.fundingFeeApyList;
        int iHashCode150 = list8 == null ? 0 : list8.hashCode();
        List<StrategyProfitResponse> list9 = this.profitSnapshots;
        int iHashCode151 = list9 == null ? 0 : list9.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfitData;
        int iHashCode152 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        String str57 = this.tradeQuoteCcy;
        int iHashCode153 = str57 == null ? 0 : str57.hashCode();
        SmartArbProfitsInfo smartArbProfitsInfo = this.smartArbProfitsInfo;
        int iHashCode154 = smartArbProfitsInfo == null ? 0 : smartArbProfitsInfo.hashCode();
        BalanceDetailInfoDto balanceDetailInfoDto = this.balanceDetails;
        int iHashCode155 = balanceDetailInfoDto == null ? 0 : balanceDetailInfoDto.hashCode();
        BotVo botVo = this.bot;
        int iHashCode156 = botVo == null ? 0 : botVo.hashCode();
        AutoVipProfitInfo autoVipProfitInfo = this.autoVipProfitInfo;
        int iHashCode157 = autoVipProfitInfo == null ? 0 : autoVipProfitInfo.hashCode();
        String str58 = this.initOrdAmt;
        int iHashCode158 = str58 == null ? 0 : str58.hashCode();
        String str59 = this.safetyOrdAmt;
        int iHashCode159 = str59 == null ? 0 : str59.hashCode();
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        int iHashCode160 = strategyDcaEditResp == null ? 0 : strategyDcaEditResp.hashCode();
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel = this.swapCoinMProfitSwitchUiModel;
        int iHashCode161 = swapCoinMProfitSwitchUiModel == null ? 0 : swapCoinMProfitSwitchUiModel.hashCode();
        RecurringBuyDetails recurringBuyDetails = this.recurringBuyDetails;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + iHashCode100) * 31) + iHashCode101) * 31) + iHashCode102) * 31) + iHashCode103) * 31) + iHashCode104) * 31) + iHashCode105) * 31) + iHashCode106) * 31) + iHashCode107) * 31) + iHashCode108) * 31) + iHashCode109) * 31) + iHashCode110) * 31) + iHashCode111) * 31) + iHashCode112) * 31) + iHashCode113) * 31) + iHashCode114) * 31) + iHashCode115) * 31) + iHashCode116) * 31) + iHashCode117) * 31) + iHashCode118) * 31) + iHashCode119) * 31) + iHashCode120) * 31) + iHashCode121) * 31) + iHashCode122) * 31) + iHashCode123) * 31) + iHashCode124) * 31) + iHashCode125) * 31) + iHashCode126) * 31) + iHashCode127) * 31) + iHashCode128) * 31) + iHashCode129) * 31) + iHashCode130) * 31) + iHashCode131) * 31) + iHashCode132) * 31) + iHashCode133) * 31) + iHashCode134) * 31) + iHashCode135) * 31) + iHashCode136) * 31) + iHashCode137) * 31) + iHashCode138) * 31) + iHashCode139) * 31) + iHashCode140) * 31) + iHashCode141) * 31) + iHashCode142) * 31) + iHashCode143) * 31) + iHashCode144) * 31) + iHashCode145) * 31) + iHashCode146) * 31) + iHashCode147) * 31) + iHashCode148) * 31) + iHashCode149) * 31) + iHashCode150) * 31) + iHashCode151) * 31) + iHashCode152) * 31) + iHashCode153) * 31) + iHashCode154) * 31) + iHashCode155) * 31) + iHashCode156) * 31) + iHashCode157) * 31) + iHashCode158) * 31) + iHashCode159) * 31) + iHashCode160) * 31) + iHashCode161) * 31) + (recurringBuyDetails == null ? 0 : recurringBuyDetails.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isPostWarning() {
        return this.isPostWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowTWapTips() {
        return this.isShowTWapTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSmartArbitrageWithStaking() {
        return this.isSmartArbitrageWithStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
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
    public final void setAvailableMargin(String str) {
        this.availableMargin = str;
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
    public final void setBaseSz(String str) {
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCbAutoReserve(Boolean bool) {
        this.cbAutoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyType(String str) {
        this.copyType = str;
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
    public final void setCycleId(String str) {
        this.cycleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dcdState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deeplink = str;
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
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraOperatorList(List<TacticsListButtonItem> list) {
        this.extraOperatorList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilledPercentage(String str) {
        this.filledPercentage = str;
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
    public final void setHistory(boolean z) {
        this.history = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoardItemList(ArrayList<SmartPortfolioListItem> arrayList) {
        this.hoardItemList = arrayList;
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
    public final void setInvestCcy(String str) {
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentType(String str) {
        this.investmentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabelList(ArrayList<TacticsListLabelUiData> arrayList) {
        this.labelList = arrayList;
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
    public final void setLiqPx(String str) {
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocatePage(int i) {
        this.locatePage = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongLiqPx(String str) {
        this.longLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(String str) {
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperateList(List<TacticsListButtonItem> list) {
        this.operateList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutOfRange(boolean z) {
        this.outOfRange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerGridProfitRatio(String str) {
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRate(String str) {
        this.perMaxProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRate(String str) {
        this.perMinProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPostWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isPostWarning = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceLocker(PriceLockerTradeBean priceLockerTradeBean) {
        this.priceLocker = priceLockerTradeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitData(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData) {
        this.profitData = mpStgyCopyProfitChangeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitRateDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitRateDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSnapshots(List<StrategyProfitResponse> list) {
        this.profitSnapshots = list;
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
    public final void setRecItemList(ArrayList<RecurringListItem> arrayList) {
        this.recItemList = arrayList;
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
    public final void setRuleType(String str) {
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunningDuration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runningDuration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLiqPx(String str) {
        this.shortLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTWapTips(boolean z) {
        this.isShowTWapTips = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(List<SignParamItem> list) {
        this.signParams = list;
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
    public final void setSignalSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalSubsSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalSubsSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalSubsSizeDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalSubsSizeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(String str) {
        this.slPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPx(String str) {
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
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(String str) {
        this.stgyName = str;
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
    public final void setTopupActualMarginSz(String str) {
        this.topupActualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(String str) {
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlRatio(String str) {
        this.totalPnlRatio = str;
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
    public final void setTrackingMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trackingMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
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
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tvTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(String str) {
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsData(orderType=" + this.orderType + ", algoId=" + this.algoId + ", instType=" + this.instType + ", instId=" + this.instId + ", state=" + this.state + ", filledPercentage=" + this.filledPercentage + ", history=" + this.history + ", tvTitle=" + this.tvTitle + ", tacticsType=" + this.tacticsType + ", ivShareRes=" + this.ivShareRes + ", level=" + this.level + ", cTime=" + this.cTime + ", cTimeStamp=" + this.cTimeStamp + ", pnlRatio=" + this.pnlRatio + ", subData=" + this.subData + ", tradeSymbol=" + this.tradeSymbol + ", stopStateText=" + this.stopStateText + ", stopOrangeHint=" + this.stopOrangeHint + ", shareData=" + this.shareData + ", instList=" + this.instList + ", associate=" + this.associate + ", stgyName=" + this.stgyName + ", direction=" + this.direction + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", priceLocker=" + this.priceLocker + ", recItemList=" + this.recItemList + ", hoardItemList=" + this.hoardItemList + ", investCcy=" + this.investCcy + ", lastPrice=" + this.lastPrice + ", operateList=" + this.operateList + ", extraOperatorList=" + this.extraOperatorList + ", labelList=" + this.labelList + ", signParams=" + this.signParams + ", uTime=" + this.uTime + ", triggerParams=" + this.triggerParams + ", cycleId=" + this.cycleId + ", stopType=" + this.stopType + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", tpslTriggerParam=" + this.tpslTriggerParam + ", tpPriceRange=" + this.tpPriceRange + ", gridState=" + this.gridState + ", originalLevel=" + this.originalLevel + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", liqPx=" + this.liqPx + ", longLiqPx=" + this.longLiqPx + ", shortLiqPx=" + this.shortLiqPx + ", tradeNum=" + this.tradeNum + ", pxSpread=" + this.pxSpread + ", pxVar=" + this.pxVar + ", pxLimit=" + this.pxLimit + ", timeInterval=" + this.timeInterval + ", szLimit=" + this.szLimit + ", sz=" + this.sz + ", side=" + this.side + ", posSide=" + this.posSide + ", tdMode=" + this.tdMode + ", reduce_only=" + this.reduce_only + ", ccy=" + this.ccy + ", copyType=" + this.copyType + ", profitSharingRatio=" + this.profitSharingRatio + ", sourceAlgoId=" + this.sourceAlgoId + ", mktCap=" + this.mktCap + ", instIds=" + this.instIds + ", totalAmt=" + this.totalAmt + ", signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", floatingPnl=" + this.floatingPnl + ", availableMargin=" + this.availableMargin + ", totalPnlRatio=" + this.totalPnlRatio + ", signalCount=" + this.signalCount + ", supportEarlyFill=" + this.supportEarlyFill + ", signalSubsSizeDesc=" + this.signalSubsSizeDesc + ", signalSubsSize=" + this.signalSubsSize + ", signalSource=" + this.signalSource + ", profitRateDesc=" + this.profitRateDesc + ", profit=" + this.profit + ", symbolsNumber=" + this.symbolsNumber + ", locatePage=" + this.locatePage + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", runType=" + this.runType + ", gridNum=" + this.gridNum + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", trailingDownFund=" + this.trailingDownFund + ", reserveFunds=" + this.reserveFunds + ", basePos=" + this.basePos + ", perGridProfitRatio=" + this.perGridProfitRatio + ", perMinProfitRate=" + this.perMinProfitRate + ", perMaxProfitRate=" + this.perMaxProfitRate + ", balType=" + this.balType + ", interval=" + this.interval + ", deltaRatio=" + this.deltaRatio + ", maxSafetyOrds=" + this.maxSafetyOrds + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", slMode=" + this.slMode + ", triggerType=" + this.triggerType + ", trackingMode=" + this.trackingMode + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ", extendedBusinessInfo=" + this.extendedBusinessInfo + ", instFamily=" + this.instFamily + ", arbList=" + this.arbList + ", outOfRange=" + this.outOfRange + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", curQuoteSz=" + this.curQuoteSz + ", curBaseSz=" + this.curBaseSz + ", isPostWarning=" + this.isPostWarning + ", ruleType=" + this.ruleType + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", totalPnl=" + this.totalPnl + ", isShowTWapTips=" + this.isShowTWapTips + ", strategyTags=" + this.strategyTags + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", voucherInfo=" + this.voucherInfo + ", forbidden=" + this.forbidden + ", hiddenFeatures=" + this.hiddenFeatures + ", dcdState=" + this.dcdState + ", reinvestment=" + this.reinvestment + ", lastTradeExpireTime=" + this.lastTradeExpireTime + ", lastSettlementSettledTime=" + this.lastSettlementSettledTime + ", profitData=" + this.profitData + ", runningDuration=" + this.runningDuration + ", arbitrageStakingError=" + this.arbitrageStakingError + ", isSmartArbitrageWithStaking=" + this.isSmartArbitrageWithStaking + ", deeplink=" + this.deeplink + ", source=" + this.source + ", topupActualMarginSz=" + this.topupActualMarginSz + ", simpleEarn=" + this.simpleEarn + ", baseSz=" + this.baseSz + ", investmentType=" + this.investmentType + ", investment=" + this.investment + ", cbAutoReserve=" + this.cbAutoReserve + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", leverPrincipal=" + this.leverPrincipal + ", contractDcaSpecialData=" + this.contractDcaSpecialData + ", highestApyPeriod=" + this.highestApyPeriod + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", fundingFeeApyList=" + this.fundingFeeApyList + ", profitSnapshots=" + this.profitSnapshots + ", latestProfitData=" + this.latestProfitData + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", smartArbProfitsInfo=" + this.smartArbProfitsInfo + ", balanceDetails=" + this.balanceDetails + ", bot=" + this.bot + ", autoVipProfitInfo=" + this.autoVipProfitInfo + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", effectiveEditParametersDetails=" + this.effectiveEditParametersDetails + ", swapCoinMProfitSwitchUiModel=" + this.swapCoinMProfitSwitchUiModel + ", recurringBuyDetails=" + this.recurringBuyDetails + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderType);
        parcel.writeString(this.algoId);
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.state);
        parcel.writeString(this.filledPercentage);
        parcel.writeInt(this.history ? 1 : 0);
        parcel.writeString(this.tvTitle);
        TacticsType tacticsType = this.tacticsType;
        if (tacticsType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsType.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.ivShareRes);
        parcel.writeString(this.level);
        parcel.writeString(this.cTime);
        parcel.writeLong(this.cTimeStamp);
        parcel.writeString(this.pnlRatio);
        ArrayList<TacticsInsideItemData> arrayList = this.subData;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TacticsInsideItemData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.tradeSymbol);
        parcel.writeString(this.stopStateText);
        parcel.writeString(this.stopOrangeHint);
        this.shareData.writeToParcel(parcel, i);
        List<ArbitrageOrderBean> list = this.instList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ArbitrageOrderBean> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
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
        parcel.writeString(this.direction);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        PriceLockerTradeBean priceLockerTradeBean = this.priceLocker;
        if (priceLockerTradeBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceLockerTradeBean.writeToParcel(parcel, i);
        }
        ArrayList<RecurringListItem> arrayList2 = this.recItemList;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<RecurringListItem> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<SmartPortfolioListItem> arrayList3 = this.hoardItemList;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<SmartPortfolioListItem> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.investCcy);
        parcel.writeString(this.lastPrice);
        List<TacticsListButtonItem> list2 = this.operateList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<TacticsListButtonItem> it5 = list2.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        List<TacticsListButtonItem> list3 = this.extraOperatorList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<TacticsListButtonItem> it6 = list3.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<TacticsListLabelUiData> arrayList4 = this.labelList;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<TacticsListLabelUiData> it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                parcel.writeParcelable(it7.next(), i);
            }
        }
        List<SignParamItem> list4 = this.signParams;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<SignParamItem> it8 = list4.iterator();
            while (it8.hasNext()) {
                it8.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.uTime);
        List<DcaTriggerParam> list5 = this.triggerParams;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (DcaTriggerParam dcaTriggerParam : list5) {
                if (dcaTriggerParam == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    dcaTriggerParam.writeToParcel(parcel, i);
                }
            }
        }
        parcel.writeString(this.cycleId);
        parcel.writeString(this.stopType);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        this.tpslTriggerParam.writeToParcel(parcel, i);
        parcel.writeString(this.tpPriceRange);
        parcel.writeString(this.gridState);
        parcel.writeString(this.originalLevel);
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.longLiqPx);
        parcel.writeString(this.shortLiqPx);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.sz);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.reduce_only);
        parcel.writeString(this.ccy);
        parcel.writeString(this.copyType);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.mktCap);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.floatingPnl);
        parcel.writeString(this.availableMargin);
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.signalCount);
        parcel.writeInt(this.supportEarlyFill ? 1 : 0);
        parcel.writeString(this.signalSubsSizeDesc);
        parcel.writeString(this.signalSubsSize);
        parcel.writeString(this.signalSource);
        parcel.writeString(this.profitRateDesc);
        parcel.writeString(this.profit);
        parcel.writeString(this.symbolsNumber);
        parcel.writeInt(this.locatePage);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.runType);
        parcel.writeString(this.gridNum);
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
        Boolean bool2 = this.reserveFunds;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.balType);
        parcel.writeString(this.interval);
        parcel.writeString(this.deltaRatio);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.slMode);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.trackingMode);
        parcel.writeInt(this.autoMarginReloadSwitch ? 1 : 0);
        parcel.writeString(this.autoMarginReloadMaxAmount);
        ExtendedBusinessInfo extendedBusinessInfo = this.extendedBusinessInfo;
        if (extendedBusinessInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedBusinessInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.instFamily);
        ArrayList<SmartArbListItem> arrayList5 = this.arbList;
        if (arrayList5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList5.size());
            Iterator<SmartArbListItem> it9 = arrayList5.iterator();
            while (it9.hasNext()) {
                it9.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.outOfRange ? 1 : 0);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.sourceCcySz);
        parcel.writeString(this.curQuoteSz);
        parcel.writeString(this.curBaseSz);
        parcel.writeString(this.isPostWarning);
        parcel.writeString(this.ruleType);
        Boolean bool3 = this.isTradeBorrowMode;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.totalPnl);
        parcel.writeInt(this.isShowTWapTips ? 1 : 0);
        List<Integer> list6 = this.strategyTags;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<Integer> it10 = list6.iterator();
            while (it10.hasNext()) {
                parcel.writeInt(it10.next().intValue());
            }
        }
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
        parcel.writeInt(this.reinvestment ? 1 : 0);
        parcel.writeString(this.lastTradeExpireTime);
        parcel.writeString(this.lastSettlementSettledTime);
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData = this.profitData;
        if (mpStgyCopyProfitChangeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mpStgyCopyProfitChangeData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.runningDuration);
        parcel.writeString(this.arbitrageStakingError);
        parcel.writeInt(this.isSmartArbitrageWithStaking ? 1 : 0);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.source);
        parcel.writeString(this.topupActualMarginSz);
        SmartEarnParam smartEarnParam = this.simpleEarn;
        if (smartEarnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.baseSz);
        parcel.writeString(this.investmentType);
        parcel.writeString(this.investment);
        Boolean bool4 = this.cbAutoReserve;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        if (arbitrageTotalPnlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        }
        Float f = this.leverPrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        ContractDcaSpecialData contractDcaSpecialData = this.contractDcaSpecialData;
        if (contractDcaSpecialData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contractDcaSpecialData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.highestApyPeriod);
        parcel.writeInt(this.displayMinPaybackDays ? 1 : 0);
        List<FundingFeeApyItem> list7 = this.fundingFeeApyList;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            Iterator<FundingFeeApyItem> it11 = list7.iterator();
            while (it11.hasNext()) {
                it11.next().writeToParcel(parcel, i);
            }
        }
        List<StrategyProfitResponse> list8 = this.profitSnapshots;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            Iterator<StrategyProfitResponse> it12 = list8.iterator();
            while (it12.hasNext()) {
                it12.next().writeToParcel(parcel, i);
            }
        }
        StrategyProfitResponse strategyProfitResponse = this.latestProfitData;
        if (strategyProfitResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyProfitResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeQuoteCcy);
        SmartArbProfitsInfo smartArbProfitsInfo = this.smartArbProfitsInfo;
        if (smartArbProfitsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartArbProfitsInfo.writeToParcel(parcel, i);
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
        AutoVipProfitInfo autoVipProfitInfo = this.autoVipProfitInfo;
        if (autoVipProfitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoVipProfitInfo.writeToParcel(parcel, i);
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
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel = this.swapCoinMProfitSwitchUiModel;
        if (swapCoinMProfitSwitchUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            swapCoinMProfitSwitchUiModel.writeToParcel(parcel, i);
        }
        RecurringBuyDetails recurringBuyDetails = this.recurringBuyDetails;
        if (recurringBuyDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringBuyDetails.writeToParcel(parcel, i);
        }
    }

    public TacticsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, TacticsType tacticsType, int i, @NotNull String str8, @NotNull String str9, long j, @NotNull String str10, ArrayList<TacticsInsideItemData> arrayList, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull ShareData shareData, List<ArbitrageOrderBean> list, Boolean bool, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, PriceLockerTradeBean priceLockerTradeBean, ArrayList<RecurringListItem> arrayList2, ArrayList<SmartPortfolioListItem> arrayList3, String str20, @NotNull String str21, List<TacticsListButtonItem> list2, List<TacticsListButtonItem> list3, ArrayList<TacticsListLabelUiData> arrayList4, List<SignParamItem> list4, @NotNull String str22, List<DcaTriggerParam> list5, String str23, String str24, String str25, String str26, @NotNull TpSlTriggerParam tpSlTriggerParam, String str27, String str28, String str29, @NotNull String str30, @NotNull String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, @NotNull String str50, List<String> list6, String str51, String str52, String str53, String str54, String str55, String str56, String str57, boolean z2, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, String str62, String str63, int i2, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str68, Boolean bool2, boolean z3, String str69, String str70, String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, String str75, String str76, String str77, String str78, String str79, String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83, boolean z4, String str84, ExtendedBusinessInfo extendedBusinessInfo, String str85, ArrayList<SmartArbListItem> arrayList5, boolean z5, @NotNull String str86, @NotNull String str87, @NotNull String str88, @NotNull String str89, @NotNull String str90, String str91, Boolean bool3, @NotNull String str92, boolean z6, List<Integer> list7, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, @NotNull ArrayList<String> arrayList6, @NotNull ArrayList<String> arrayList7, @NotNull String str93, boolean z7, @NotNull String str94, @NotNull String str95, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, @NotNull String str96, String str97, boolean z8, @NotNull String str98, @NotNull String str99, String str100, SmartEarnParam smartEarnParam, String str101, String str102, String str103, Boolean bool4, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, ContractDcaSpecialData contractDcaSpecialData, String str104, boolean z9, List<FundingFeeApyItem> list8, List<StrategyProfitResponse> list9, StrategyProfitResponse strategyProfitResponse, String str105, SmartArbProfitsInfo smartArbProfitsInfo, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, AutoVipProfitInfo autoVipProfitInfo, String str106, String str107, StrategyDcaEditResp strategyDcaEditResp, SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel, RecurringBuyDetails recurringBuyDetails) {
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
        Intrinsics.checkNotNullParameter(shareData, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str90, "");
        Intrinsics.checkNotNullParameter(str92, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        Intrinsics.checkNotNullParameter(arrayList7, "");
        Intrinsics.checkNotNullParameter(str93, "");
        Intrinsics.checkNotNullParameter(str94, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str96, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str99, "");
        this.orderType = str;
        this.algoId = str2;
        this.instType = str3;
        this.instId = str4;
        this.state = str5;
        this.filledPercentage = str6;
        this.history = z;
        this.tvTitle = str7;
        this.tacticsType = tacticsType;
        this.ivShareRes = i;
        this.level = str8;
        this.cTime = str9;
        this.cTimeStamp = j;
        this.pnlRatio = str10;
        this.subData = arrayList;
        this.tradeSymbol = str11;
        this.stopStateText = str12;
        this.stopOrangeHint = str13;
        this.shareData = shareData;
        this.instList = list;
        this.associate = bool;
        this.stgyName = str14;
        this.direction = str15;
        this.tpTriggerPx = str16;
        this.slTriggerPx = str17;
        this.tpRatio = str18;
        this.slRatio = str19;
        this.priceLocker = priceLockerTradeBean;
        this.recItemList = arrayList2;
        this.hoardItemList = arrayList3;
        this.investCcy = str20;
        this.lastPrice = str21;
        this.operateList = list2;
        this.extraOperatorList = list3;
        this.labelList = arrayList4;
        this.signParams = list4;
        this.uTime = str22;
        this.triggerParams = list5;
        this.cycleId = str23;
        this.stopType = str24;
        this.tpPx = str25;
        this.slPx = str26;
        this.tpslTriggerParam = tpSlTriggerParam;
        this.tpPriceRange = str27;
        this.gridState = str28;
        this.originalLevel = str29;
        this.actualMarginSz = str30;
        this.extraMarginSz = str31;
        this.liqPx = str32;
        this.longLiqPx = str33;
        this.shortLiqPx = str34;
        this.tradeNum = str35;
        this.pxSpread = str36;
        this.pxVar = str37;
        this.pxLimit = str38;
        this.timeInterval = str39;
        this.szLimit = str40;
        this.sz = str41;
        this.side = str42;
        this.posSide = str43;
        this.tdMode = str44;
        this.reduce_only = str45;
        this.ccy = str46;
        this.copyType = str47;
        this.profitSharingRatio = str48;
        this.sourceAlgoId = str49;
        this.mktCap = str50;
        this.instIds = list6;
        this.totalAmt = str51;
        this.signalChanId = str52;
        this.signalChanName = str53;
        this.floatingPnl = str54;
        this.availableMargin = str55;
        this.totalPnlRatio = str56;
        this.signalCount = str57;
        this.supportEarlyFill = z2;
        this.signalSubsSizeDesc = str58;
        this.signalSubsSize = str59;
        this.signalSource = str60;
        this.profitRateDesc = str61;
        this.profit = str62;
        this.symbolsNumber = str63;
        this.locatePage = i2;
        this.maxPx = str64;
        this.minPx = str65;
        this.runType = str66;
        this.gridNum = str67;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.trailingDownFund = str68;
        this.reserveFunds = bool2;
        this.basePos = z3;
        this.perGridProfitRatio = str69;
        this.perMinProfitRate = str70;
        this.perMaxProfitRate = str71;
        this.balType = str72;
        this.interval = str73;
        this.deltaRatio = str74;
        this.maxSafetyOrds = str75;
        this.pxSteps = str76;
        this.pxStepsMult = str77;
        this.volMult = str78;
        this.tpPct = str79;
        this.slPct = str80;
        this.slMode = str81;
        this.triggerType = str82;
        this.trackingMode = str83;
        this.autoMarginReloadSwitch = z4;
        this.autoMarginReloadMaxAmount = str84;
        this.extendedBusinessInfo = extendedBusinessInfo;
        this.instFamily = str85;
        this.arbList = arrayList5;
        this.outOfRange = z5;
        this.sourceCcy = str86;
        this.sourceCcySz = str87;
        this.curQuoteSz = str88;
        this.curBaseSz = str89;
        this.isPostWarning = str90;
        this.ruleType = str91;
        this.isTradeBorrowMode = bool3;
        this.totalPnl = str92;
        this.isShowTWapTips = z6;
        this.strategyTags = list7;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.voucherInfo = tacticsVoucherInfo;
        this.forbidden = arrayList6;
        this.hiddenFeatures = arrayList7;
        this.dcdState = str93;
        this.reinvestment = z7;
        this.lastTradeExpireTime = str94;
        this.lastSettlementSettledTime = str95;
        this.profitData = mpStgyCopyProfitChangeData;
        this.runningDuration = str96;
        this.arbitrageStakingError = str97;
        this.isSmartArbitrageWithStaking = z8;
        this.deeplink = str98;
        this.source = str99;
        this.topupActualMarginSz = str100;
        this.simpleEarn = smartEarnParam;
        this.baseSz = str101;
        this.investmentType = str102;
        this.investment = str103;
        this.cbAutoReserve = bool4;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.leverPrincipal = f;
        this.contractDcaSpecialData = contractDcaSpecialData;
        this.highestApyPeriod = str104;
        this.displayMinPaybackDays = z9;
        this.fundingFeeApyList = list8;
        this.profitSnapshots = list9;
        this.latestProfitData = strategyProfitResponse;
        this.tradeQuoteCcy = str105;
        this.smartArbProfitsInfo = smartArbProfitsInfo;
        this.balanceDetails = balanceDetailInfoDto;
        this.bot = botVo;
        this.autoVipProfitInfo = autoVipProfitInfo;
        this.initOrdAmt = str106;
        this.safetyOrdAmt = str107;
        this.effectiveEditParametersDetails = strategyDcaEditResp;
        this.swapCoinMProfitSwitchUiModel = swapCoinMProfitSwitchUiModel;
        this.recurringBuyDetails = recurringBuyDetails;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TacticsData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, TacticsType tacticsType, int i, String str8, String str9, long j, String str10, ArrayList arrayList, String str11, String str12, String str13, ShareData shareData, List list, Boolean bool, String str14, String str15, String str16, String str17, String str18, String str19, PriceLockerTradeBean priceLockerTradeBean, ArrayList arrayList2, ArrayList arrayList3, String str20, String str21, List list2, List list3, ArrayList arrayList4, List list4, String str22, List list5, String str23, String str24, String str25, String str26, TpSlTriggerParam tpSlTriggerParam, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, List list6, String str51, String str52, String str53, String str54, String str55, String str56, String str57, boolean z2, String str58, String str59, String str60, String str61, String str62, String str63, int i2, String str64, String str65, String str66, String str67, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str68, Boolean bool2, boolean z3, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, boolean z4, String str84, ExtendedBusinessInfo extendedBusinessInfo, String str85, ArrayList arrayList5, boolean z5, String str86, String str87, String str88, String str89, String str90, String str91, Boolean bool3, String str92, boolean z6, List list7, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, TacticsVoucherInfo tacticsVoucherInfo, ArrayList arrayList6, ArrayList arrayList7, String str93, boolean z7, String str94, String str95, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, String str96, String str97, boolean z8, String str98, String str99, String str100, SmartEarnParam smartEarnParam, String str101, String str102, String str103, Boolean bool4, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Float f, ContractDcaSpecialData contractDcaSpecialData, String str104, boolean z9, List list8, List list9, StrategyProfitResponse strategyProfitResponse, String str105, SmartArbProfitsInfo smartArbProfitsInfo, BalanceDetailInfoDto balanceDetailInfoDto, BotVo botVo, AutoVipProfitInfo autoVipProfitInfo, String str106, String str107, StrategyDcaEditResp strategyDcaEditResp, SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel, RecurringBuyDetails recurringBuyDetails, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        String str108 = (i3 & 1) != 0 ? "" : str;
        String str109 = (i3 & 2) != 0 ? "" : str2;
        String str110 = (i3 & 4) != 0 ? "" : str3;
        String str111 = (i3 & 8) != 0 ? "" : str4;
        String str112 = (i3 & 16) != 0 ? "" : str5;
        String str113 = (i3 & 32) != 0 ? null : str6;
        boolean z10 = (i3 & 64) != 0 ? false : z;
        String str114 = (i3 & 128) != 0 ? "" : str7;
        TacticsType tacticsType2 = (i3 & 256) != 0 ? null : tacticsType;
        int i9 = (i3 & 512) != 0 ? 0 : i;
        String str115 = (i3 & 1024) != 0 ? "" : str8;
        String str116 = (i3 & 2048) != 0 ? "" : str9;
        long j2 = (i3 & 4096) != 0 ? 0L : j;
        String str117 = (i3 & 8192) != 0 ? "" : str10;
        ArrayList arrayList8 = (i3 & 16384) != 0 ? null : arrayList;
        String str118 = (i3 & 32768) != 0 ? "" : str11;
        String str119 = (i3 & 65536) != 0 ? "" : str12;
        String str120 = (i3 & 131072) != 0 ? "" : str13;
        ShareData shareData2 = (i3 & 262144) != 0 ? new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : shareData;
        List list10 = (i3 & 524288) != 0 ? null : list;
        Boolean bool5 = (i3 & 1048576) != 0 ? Boolean.FALSE : bool;
        String str121 = (i3 & 2097152) != 0 ? null : str14;
        String str122 = (i3 & 4194304) != 0 ? "" : str15;
        String str123 = (i3 & 8388608) != 0 ? "" : str16;
        String str124 = (i3 & 16777216) != 0 ? "" : str17;
        String str125 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str18;
        String str126 = (i3 & 67108864) != 0 ? "" : str19;
        PriceLockerTradeBean priceLockerTradeBean2 = (i3 & 134217728) != 0 ? null : priceLockerTradeBean;
        ArrayList arrayList9 = (i3 & 268435456) != 0 ? null : arrayList2;
        ArrayList arrayList10 = (i3 & 536870912) != 0 ? null : arrayList3;
        String str127 = (i3 & 1073741824) != 0 ? null : str20;
        String str128 = (i3 & Integer.MIN_VALUE) != 0 ? "" : str21;
        List list11 = (i4 & 1) != 0 ? null : list2;
        List list12 = (i4 & 2) != 0 ? null : list3;
        ArrayList arrayList11 = (i4 & 4) != 0 ? null : arrayList4;
        List list13 = (i4 & 8) != 0 ? null : list4;
        String str129 = (i4 & 16) != 0 ? "" : str22;
        List list14 = (i4 & 32) != 0 ? null : list5;
        String str130 = (i4 & 64) != 0 ? null : str23;
        String str131 = str128;
        String str132 = (i4 & 128) != 0 ? null : str24;
        String str133 = (i4 & 256) != 0 ? null : str25;
        String str134 = (i4 & 512) != 0 ? null : str26;
        TpSlTriggerParam tpSlTriggerParam2 = (i4 & 1024) != 0 ? new TpSlTriggerParam((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null) : tpSlTriggerParam;
        String str135 = (i4 & 2048) != 0 ? null : str27;
        String str136 = (i4 & 4096) != 0 ? null : str28;
        String str137 = (i4 & 8192) != 0 ? null : str29;
        String str138 = (i4 & 16384) != 0 ? "" : str30;
        String str139 = (i4 & 32768) != 0 ? "" : str31;
        String str140 = (i4 & 65536) != 0 ? null : str32;
        String str141 = (i4 & 131072) != 0 ? null : str33;
        String str142 = (i4 & 262144) != 0 ? null : str34;
        String str143 = (i4 & 524288) != 0 ? null : str35;
        String str144 = (i4 & 1048576) != 0 ? null : str36;
        String str145 = (i4 & 2097152) != 0 ? null : str37;
        String str146 = (i4 & 4194304) != 0 ? null : str38;
        String str147 = (i4 & 8388608) != 0 ? null : str39;
        String str148 = (i4 & 16777216) != 0 ? null : str40;
        String str149 = (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str41;
        String str150 = (i4 & 67108864) != 0 ? null : str42;
        String str151 = (i4 & 134217728) != 0 ? null : str43;
        String str152 = (i4 & 268435456) != 0 ? null : str44;
        String str153 = (i4 & 536870912) != 0 ? null : str45;
        String str154 = (i4 & 1073741824) != 0 ? null : str46;
        String str155 = (i4 & Integer.MIN_VALUE) != 0 ? null : str47;
        String str156 = (i5 & 1) != 0 ? null : str48;
        String str157 = (i5 & 2) != 0 ? null : str49;
        String str158 = (i5 & 4) != 0 ? "" : str50;
        List list15 = (i5 & 8) != 0 ? null : list6;
        String str159 = (i5 & 16) != 0 ? null : str51;
        String str160 = (i5 & 32) != 0 ? null : str52;
        String str161 = (i5 & 64) != 0 ? null : str53;
        String str162 = str155;
        String str163 = (i5 & 128) != 0 ? null : str54;
        String str164 = (i5 & 256) != 0 ? null : str55;
        String str165 = (i5 & 512) != 0 ? null : str56;
        String str166 = (i5 & 1024) != 0 ? null : str57;
        boolean z11 = (i5 & 2048) != 0 ? false : z2;
        String str167 = (i5 & 4096) != 0 ? "" : str58;
        String str168 = (i5 & 8192) != 0 ? "" : str59;
        String str169 = (i5 & 16384) != 0 ? "" : str60;
        String str170 = (i5 & 32768) != 0 ? "" : str61;
        String str171 = (i5 & 65536) != 0 ? null : str62;
        String str172 = (i5 & 131072) != 0 ? null : str63;
        int i10 = (i5 & 262144) != 0 ? 0 : i2;
        String str173 = (i5 & 524288) != 0 ? "" : str64;
        String str174 = (i5 & 1048576) != 0 ? "" : str65;
        String str175 = (i5 & 2097152) != 0 ? "" : str66;
        String str176 = (i5 & 4194304) != 0 ? "" : str67;
        TrailingConfig trailingConfig3 = (i5 & 8388608) != 0 ? null : trailingConfig;
        TrailingConfig trailingConfig4 = (i5 & 16777216) != 0 ? null : trailingConfig2;
        String str177 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str68;
        Boolean bool6 = (i5 & 67108864) != 0 ? null : bool2;
        boolean z12 = (i5 & 134217728) != 0 ? false : z3;
        String str178 = (i5 & 268435456) != 0 ? null : str69;
        String str179 = (i5 & 536870912) != 0 ? null : str70;
        String str180 = (i5 & 1073741824) != 0 ? null : str71;
        String str181 = (i5 & Integer.MIN_VALUE) != 0 ? "" : str72;
        this(str108, str109, str110, str111, str112, str113, z10, str114, tacticsType2, i9, str115, str116, j2, str117, arrayList8, str118, str119, str120, shareData2, list10, bool5, str121, str122, str123, str124, str125, str126, priceLockerTradeBean2, arrayList9, arrayList10, str127, str131, list11, list12, arrayList11, list13, str129, list14, str130, str132, str133, str134, tpSlTriggerParam2, str135, str136, str137, str138, str139, str140, str141, str142, str143, str144, str145, str146, str147, str148, str149, str150, str151, str152, str153, str154, str162, str156, str157, str158, list15, str159, str160, str161, str163, str164, str165, str166, z11, str167, str168, str169, str170, str171, str172, i10, str173, str174, str175, str176, trailingConfig3, trailingConfig4, str177, bool6, z12, str178, str179, str180, str181, (i6 & 1) != 0 ? "" : str73, (i6 & 2) != 0 ? "" : str74, (i6 & 4) != 0 ? null : str75, (i6 & 8) != 0 ? null : str76, (i6 & 16) != 0 ? null : str77, (i6 & 32) != 0 ? null : str78, (i6 & 64) != 0 ? null : str79, (i6 & 128) != 0 ? null : str80, (i6 & 256) != 0 ? "" : str81, (i6 & 512) != 0 ? "" : str82, (i6 & 1024) != 0 ? "" : str83, (i6 & 2048) != 0 ? false : z4, (i6 & 4096) != 0 ? null : str84, (i6 & 8192) != 0 ? null : extendedBusinessInfo, (i6 & 16384) != 0 ? null : str85, (i6 & 32768) != 0 ? null : arrayList5, (i6 & 65536) != 0 ? false : z5, (i6 & 131072) != 0 ? "" : str86, (i6 & 262144) != 0 ? "" : str87, (i6 & 524288) != 0 ? "" : str88, (i6 & 1048576) != 0 ? "" : str89, (i6 & 2097152) != 0 ? "" : str90, (i6 & 4194304) != 0 ? null : str91, (i6 & 8388608) != 0 ? null : bool3, (i6 & 16777216) != 0 ? "" : str92, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z6, (i6 & 67108864) != 0 ? null : list7, (i6 & 134217728) != 0 ? null : entrySignalOrderAmtParam, (i6 & 268435456) != 0 ? null : exitSignalOrderAmtParam, (i6 & 536870912) != 0 ? null : tacticsVoucherInfo, (i6 & 1073741824) != 0 ? new ArrayList() : arrayList6, (i6 & Integer.MIN_VALUE) != 0 ? new ArrayList() : arrayList7, (i7 & 1) != 0 ? "" : str93, (i7 & 2) != 0 ? true : z7, (i7 & 4) != 0 ? "" : str94, (i7 & 8) != 0 ? "" : str95, (i7 & 16) != 0 ? null : mpStgyCopyProfitChangeData, (i7 & 32) != 0 ? "" : str96, (i7 & 64) != 0 ? null : str97, (i7 & 128) != 0 ? false : z8, (i7 & 256) != 0 ? "" : str98, (i7 & 512) != 0 ? "" : str99, (i7 & 1024) != 0 ? "" : str100, (i7 & 2048) != 0 ? null : smartEarnParam, (i7 & 4096) != 0 ? null : str101, (i7 & 8192) != 0 ? null : str102, (i7 & 16384) != 0 ? null : str103, (i7 & 32768) != 0 ? Boolean.FALSE : bool4, (i7 & 65536) != 0 ? null : arbitrageTotalPnlInfo, (i7 & 131072) != 0 ? null : f, (i7 & 262144) != 0 ? null : contractDcaSpecialData, (i7 & 524288) != 0 ? null : str104, (i7 & 1048576) != 0 ? false : z9, (i7 & 2097152) != 0 ? null : list8, (i7 & 4194304) != 0 ? null : list9, (i7 & 8388608) != 0 ? null : strategyProfitResponse, (i7 & 16777216) != 0 ? null : str105, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : smartArbProfitsInfo, (i7 & 67108864) != 0 ? null : balanceDetailInfoDto, (i7 & 134217728) != 0 ? null : botVo, (i7 & 268435456) != 0 ? null : autoVipProfitInfo, (i7 & 536870912) != 0 ? null : str106, (i7 & 1073741824) != 0 ? null : str107, (i7 & Integer.MIN_VALUE) != 0 ? null : strategyDcaEditResp, (i8 & 1) != 0 ? null : swapCoinMProfitSwitchUiModel, (i8 & 2) != 0 ? null : recurringBuyDetails);
    }

    public final boolean isTriggerContainsWebHook() {
        return isStartActionContainsWebHook() || isStopActionContainsWebHook();
    }

    public final boolean isStartActionContainsWebHook() {
        return internalFind(TtmlNode.START, GridStartTriggerType.TRADINGVIEW);
    }

    public final boolean isStopActionContainsWebHook() {
        return internalFind("stop", GridStartTriggerType.TRADINGVIEW);
    }

    public final boolean isStartActionContainsPrice() {
        return internalFind(TtmlNode.START, GridStartTriggerType.PRICE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean internalFind(String str, GridStartTriggerType gridStartTriggerType) {
        List<DcaTriggerParam> listAhwBna;
        List<SignParamItem> listAhwBna2 = this.signParams;
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        if (!(listAhwBna2 instanceof Collection) || !listAhwBna2.isEmpty()) {
            for (SignParamItem signParamItem : listAhwBna2) {
                if (Intrinsics.EZpvd((Object) signParamItem.getTriggerAction(), (Object) str) && Intrinsics.EZpvd((Object) signParamItem.getIndicator(), (Object) gridStartTriggerType.getMode())) {
                    break;
                }
            }
            listAhwBna = this.triggerParams;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            if ((listAhwBna instanceof Collection) || !listAhwBna.isEmpty()) {
                for (DcaTriggerParam dcaTriggerParam : listAhwBna) {
                    if (!Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerAction() : null), (Object) str) || !Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) gridStartTriggerType.getMode())) {
                    }
                }
            }
            return false;
        }
        listAhwBna = this.triggerParams;
        if (listAhwBna == null) {
        }
        if (listAhwBna instanceof Collection) {
        }
        while (r0.hasNext()) {
        }
        return false;
        return true;
    }

    public final boolean getShouldShowEarn() {
        if (!Intrinsics.EZpvd((Object) this.copyType, (Object) "2")) {
            C56071xvr c56071xvr = C56071xvr.gEmmrt;
            if (!c56071xvr.ejfBZ() || c56071xvr.hDKMBd()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isFunctionForbidden(@NotNull TacticsForbiddenFunctions tacticsForbiddenFunctions) {
        Intrinsics.checkNotNullParameter(tacticsForbiddenFunctions, "");
        if (this.forbidden.isEmpty()) {
            return false;
        }
        return this.forbidden.contains(tacticsForbiddenFunctions.getCode());
    }

    public final String takeNonBlankTradeQuoteCcy() {
        String str = this.tradeQuoteCcy;
        if (str == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
            return null;
        }
        return str;
    }

    public final Boolean getEffectiveReserveFunds() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getReserveFunds()) != null ? Boolean.valueOf(Boolean.parseBoolean(this.effectiveEditParametersDetails.getParameters().getReserveFunds())) : this.reserveFunds;
    }

    public final String getEffectiveMaxSafetyOrds() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getMaxSafetyOrds()) != null ? this.effectiveEditParametersDetails.getParameters().getMaxSafetyOrds() : this.maxSafetyOrds;
    }

    public final String getEffectivePxSteps() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getPxSteps()) != null ? this.effectiveEditParametersDetails.getParameters().getPxSteps() : this.pxSteps;
    }

    public final String getEffectivePxStepsMult() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getPxStepsMult()) != null ? this.effectiveEditParametersDetails.getParameters().getPxStepsMult() : this.pxStepsMult;
    }

    public final String getEffectiveVolMult() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getVolMult()) != null ? this.effectiveEditParametersDetails.getParameters().getVolMult() : this.volMult;
    }

    public final String getEffectiveTpPct() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getTpPct()) != null ? this.effectiveEditParametersDetails.getParameters().getTpPct() : this.tpPct;
    }

    public final String getEffectiveSlPct() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getSlPct()) != null ? this.effectiveEditParametersDetails.getParameters().getSlPct() : this.slPct;
    }

    public final List<DcaTriggerParam> getEffectiveTriggerParams() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getTriggerParams()) != null ? this.effectiveEditParametersDetails.getParameters().getTriggerParams() : this.triggerParams;
    }

    public final String getEffectiveInitOrdAmt() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getInitOrdAmt()) != null ? this.effectiveEditParametersDetails.getParameters().getInitOrdAmt() : this.initOrdAmt;
    }

    public final String getEffectiveSafetyOrdAmt() {
        EditParams parameters;
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        return ((strategyDcaEditResp == null || (parameters = strategyDcaEditResp.getParameters()) == null) ? null : parameters.getSafetyOrdAmt()) != null ? this.effectiveEditParametersDetails.getParameters().getSafetyOrdAmt() : this.safetyOrdAmt;
    }
}

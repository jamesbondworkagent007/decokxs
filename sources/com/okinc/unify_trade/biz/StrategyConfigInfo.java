package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig$$serializer;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public final class StrategyConfigInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String amountMax;
    private String amountMin;
    private List<AutoEarnStakingConfig> autoEarn;
    private List<AutoEarnStakingConfig> autoStaking;
    private String defaultKlineTimeframe;
    private String defaultLeverage;
    private final String defaultRatio;
    private final String defaultTime;
    private String deltaRatioMax;
    private String deltaRatioMin;
    private final SmartEarnConfig earnConfig;
    private String entrySettingsRatioRecommend;
    private BotRangeConfig initOrdAmt;
    private String instId;
    private final String intervalMax;
    private final String intervalMin;
    private String klinePeriod;
    private BotRangeConfig lever;
    private final String leveragePercents;
    private String limitOrderOffsetRecommend;
    private LmtOrderNumber lmtOrderNumber;
    private String marginBuffer;
    private String maxAmt;
    private String maxAvailablePercentage;
    private String maxGridNum;
    private String maxInitialInvestmentPercentage;
    private final String maxLever;
    private String maxLimitVarPercentage;
    private String maxNumberOfSignalDescription;
    private String maxNumberOfSignalName;
    private BotRangeConfig maxSafetyOrds;
    private final String minAmountMultiple;
    private String minAmt;
    private String minAmtBuffer;
    private String minAvailablePercentage;
    private String minGridNum;
    private String minInitialInvestmentPercentage;
    private String minInvestmentBuffer;
    private final String minLever;
    private String minLimitVarPercentage;
    private String minQuoteThold;
    private String minSlPercentage;
    private String minTpPercentage;
    private String nameMax;
    private final String perCoinMinAmt;
    private String perMaxProfitRatio;
    private String perMinProfitRatio;
    private String priceTriggerMult;
    private final GridProfitAutoReinvestResponse profitAutoReinvest;
    private String pxMax;
    private String pxMin;
    private String pxPercentageMax;
    private String pxPercentageMin;
    private String pxPercentageRec;
    private String pxRangeMax;
    private String pxRangeMin;
    private String pxRangeRec;
    private BotRangeConfig pxSteps;
    private BotRangeConfig pxStepsMult;
    private final String ratioMax;
    private String ratioMin;
    private BotRangeConfig rsiOverboughtThold;
    private BotRangeConfig rsiOversoldThold;
    private BotRangeConfig safetyOrdAmt;
    private BotRangeConfig slPct;
    private BotRangeConfig slTriggerPnlRatio;
    private final SlippageControl slippageControl;
    private final SmartPortfolioConfig smartPortfolioConfig;
    private String strategyType;
    private String szMin;
    private String timeIntervalMax;
    private String timeIntervalMin;
    private String timeIntervalRec;
    private String topClassFeeRate;
    private BotRangeConfig tpPct;
    private BotRangeConfig tpPx;
    private BotRangeConfig tpTriggerPnlRatio;
    private final SpotGridTpSlConfig tpslConfig;
    private final String tradeQuoteCcy;
    private final String vipLevel;
    private BotRangeConfig volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyConfigInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyConfigInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyConfigInfo createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
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
            BotRangeConfig botRangeConfigCreateFromParcel = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel3 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel4 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel5 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel6 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            SpotGridTpSlConfig spotGridTpSlConfigCreateFromParcel = SpotGridTpSlConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel7 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel8 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel9 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel10 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel11 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel12 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            BotRangeConfig botRangeConfigCreateFromParcel13 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            BotRangeConfig botRangeConfigCreateFromParcel14 = parcel.readInt() == 0 ? null : BotRangeConfig.CREATOR.createFromParcel(parcel);
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            LmtOrderNumber lmtOrderNumberCreateFromParcel = parcel.readInt() == 0 ? null : LmtOrderNumber.CREATOR.createFromParcel(parcel);
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
            SmartEarnConfig smartEarnConfigCreateFromParcel = parcel.readInt() == 0 ? null : SmartEarnConfig.CREATOR.createFromParcel(parcel);
            String string58 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList4.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                arrayList2 = arrayList;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList5.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList3 = arrayList5;
            }
            return new StrategyConfigInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, botRangeConfigCreateFromParcel, botRangeConfigCreateFromParcel2, botRangeConfigCreateFromParcel3, botRangeConfigCreateFromParcel4, botRangeConfigCreateFromParcel5, botRangeConfigCreateFromParcel6, string34, string35, spotGridTpSlConfigCreateFromParcel, botRangeConfigCreateFromParcel7, botRangeConfigCreateFromParcel8, botRangeConfigCreateFromParcel9, botRangeConfigCreateFromParcel10, botRangeConfigCreateFromParcel11, botRangeConfigCreateFromParcel12, botRangeConfigCreateFromParcel13, string36, string37, string38, botRangeConfigCreateFromParcel14, string39, string40, lmtOrderNumberCreateFromParcel, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, smartEarnConfigCreateFromParcel, string58, arrayList2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : GridProfitAutoReinvestResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SmartPortfolioConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SlippageControl.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyConfigInfo[] newArray(int i) {
            return new StrategyConfigInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyConfigInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pxPercentageRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.timeIntervalMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.timeIntervalMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.timeIntervalRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.amountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.amountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.szMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.maxGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.minGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.topClassFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.minAmountMultiple;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.minLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.leveragePercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.defaultRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.defaultTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.intervalMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.intervalMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.perCoinMinAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.ratioMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pxMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.ratioMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.nameMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.deltaRatioMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.deltaRatioMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component34() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component35() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component36() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component37() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component38() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component39() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pxMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.klinePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.defaultKlineTimeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridTpSlConfig component42() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component43() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component44() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component45() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component46() {
        return this.tpTriggerPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component47() {
        return this.slTriggerPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component48() {
        return this.rsiOversoldThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component49() {
        return this.rsiOverboughtThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pxRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.minAmtBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.minQuoteThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.marginBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig component53() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.perMinProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.perMaxProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LmtOrderNumber component56() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.defaultLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.minLimitVarPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.maxLimitVarPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pxRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.minAvailablePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.maxAvailablePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.minInitialInvestmentPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.maxInitialInvestmentPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.minTpPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.minSlPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.entrySettingsRatioRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.minInvestmentBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.limitOrderOffsetRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.maxNumberOfSignalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pxRangeRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.maxNumberOfSignalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.priceTriggerMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.minAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnConfig component74() {
        return this.earnConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component76() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component77() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse component79() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pxPercentageMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioConfig component80() {
        return this.smartPortfolioConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageControl component81() {
        return this.slippageControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pxPercentageMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, BotRangeConfig botRangeConfig, BotRangeConfig botRangeConfig2, BotRangeConfig botRangeConfig3, BotRangeConfig botRangeConfig4, BotRangeConfig botRangeConfig5, BotRangeConfig botRangeConfig6, @NotNull String str34, @NotNull String str35, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, BotRangeConfig botRangeConfig7, BotRangeConfig botRangeConfig8, BotRangeConfig botRangeConfig9, BotRangeConfig botRangeConfig10, BotRangeConfig botRangeConfig11, BotRangeConfig botRangeConfig12, BotRangeConfig botRangeConfig13, @NotNull String str36, @NotNull String str37, @NotNull String str38, BotRangeConfig botRangeConfig14, String str39, String str40, LmtOrderNumber lmtOrderNumber, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, SmartEarnConfig smartEarnConfig, String str58, List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str59, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, SmartPortfolioConfig smartPortfolioConfig, SlippageControl slippageControl) {
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
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        return new StrategyConfigInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, botRangeConfig, botRangeConfig2, botRangeConfig3, botRangeConfig4, botRangeConfig5, botRangeConfig6, str34, str35, spotGridTpSlConfig, botRangeConfig7, botRangeConfig8, botRangeConfig9, botRangeConfig10, botRangeConfig11, botRangeConfig12, botRangeConfig13, str36, str37, str38, botRangeConfig14, str39, str40, lmtOrderNumber, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, smartEarnConfig, str58, list, list2, str59, gridProfitAutoReinvestResponse, smartPortfolioConfig, slippageControl);
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
        if (!(obj instanceof StrategyConfigInfo)) {
            return false;
        }
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) strategyConfigInfo.instId) && Intrinsics.EZpvd((Object) this.strategyType, (Object) strategyConfigInfo.strategyType) && Intrinsics.EZpvd((Object) this.pxMax, (Object) strategyConfigInfo.pxMax) && Intrinsics.EZpvd((Object) this.pxMin, (Object) strategyConfigInfo.pxMin) && Intrinsics.EZpvd((Object) this.pxRangeMax, (Object) strategyConfigInfo.pxRangeMax) && Intrinsics.EZpvd((Object) this.pxRangeMin, (Object) strategyConfigInfo.pxRangeMin) && Intrinsics.EZpvd((Object) this.pxRangeRec, (Object) strategyConfigInfo.pxRangeRec) && Intrinsics.EZpvd((Object) this.pxPercentageMax, (Object) strategyConfigInfo.pxPercentageMax) && Intrinsics.EZpvd((Object) this.pxPercentageMin, (Object) strategyConfigInfo.pxPercentageMin) && Intrinsics.EZpvd((Object) this.pxPercentageRec, (Object) strategyConfigInfo.pxPercentageRec) && Intrinsics.EZpvd((Object) this.timeIntervalMax, (Object) strategyConfigInfo.timeIntervalMax) && Intrinsics.EZpvd((Object) this.timeIntervalMin, (Object) strategyConfigInfo.timeIntervalMin) && Intrinsics.EZpvd((Object) this.timeIntervalRec, (Object) strategyConfigInfo.timeIntervalRec) && Intrinsics.EZpvd((Object) this.amountMax, (Object) strategyConfigInfo.amountMax) && Intrinsics.EZpvd((Object) this.amountMin, (Object) strategyConfigInfo.amountMin) && Intrinsics.EZpvd((Object) this.szMin, (Object) strategyConfigInfo.szMin) && Intrinsics.EZpvd((Object) this.maxGridNum, (Object) strategyConfigInfo.maxGridNum) && Intrinsics.EZpvd((Object) this.minGridNum, (Object) strategyConfigInfo.minGridNum) && Intrinsics.EZpvd((Object) this.topClassFeeRate, (Object) strategyConfigInfo.topClassFeeRate) && Intrinsics.EZpvd((Object) this.minAmountMultiple, (Object) strategyConfigInfo.minAmountMultiple) && Intrinsics.EZpvd((Object) this.minLever, (Object) strategyConfigInfo.minLever) && Intrinsics.EZpvd((Object) this.maxLever, (Object) strategyConfigInfo.maxLever) && Intrinsics.EZpvd((Object) this.leveragePercents, (Object) strategyConfigInfo.leveragePercents) && Intrinsics.EZpvd((Object) this.defaultRatio, (Object) strategyConfigInfo.defaultRatio) && Intrinsics.EZpvd((Object) this.defaultTime, (Object) strategyConfigInfo.defaultTime) && Intrinsics.EZpvd((Object) this.intervalMax, (Object) strategyConfigInfo.intervalMax) && Intrinsics.EZpvd((Object) this.intervalMin, (Object) strategyConfigInfo.intervalMin) && Intrinsics.EZpvd((Object) this.perCoinMinAmt, (Object) strategyConfigInfo.perCoinMinAmt) && Intrinsics.EZpvd((Object) this.ratioMax, (Object) strategyConfigInfo.ratioMax) && Intrinsics.EZpvd((Object) this.ratioMin, (Object) strategyConfigInfo.ratioMin) && Intrinsics.EZpvd((Object) this.nameMax, (Object) strategyConfigInfo.nameMax) && Intrinsics.EZpvd((Object) this.deltaRatioMin, (Object) strategyConfigInfo.deltaRatioMin) && Intrinsics.EZpvd((Object) this.deltaRatioMax, (Object) strategyConfigInfo.deltaRatioMax) && Intrinsics.EZpvd(this.initOrdAmt, strategyConfigInfo.initOrdAmt) && Intrinsics.EZpvd(this.safetyOrdAmt, strategyConfigInfo.safetyOrdAmt) && Intrinsics.EZpvd(this.maxSafetyOrds, strategyConfigInfo.maxSafetyOrds) && Intrinsics.EZpvd(this.pxSteps, strategyConfigInfo.pxSteps) && Intrinsics.EZpvd(this.pxStepsMult, strategyConfigInfo.pxStepsMult) && Intrinsics.EZpvd(this.volMult, strategyConfigInfo.volMult) && Intrinsics.EZpvd((Object) this.klinePeriod, (Object) strategyConfigInfo.klinePeriod) && Intrinsics.EZpvd((Object) this.defaultKlineTimeframe, (Object) strategyConfigInfo.defaultKlineTimeframe) && Intrinsics.EZpvd(this.tpslConfig, strategyConfigInfo.tpslConfig) && Intrinsics.EZpvd(this.tpPct, strategyConfigInfo.tpPct) && Intrinsics.EZpvd(this.slPct, strategyConfigInfo.slPct) && Intrinsics.EZpvd(this.tpPx, strategyConfigInfo.tpPx) && Intrinsics.EZpvd(this.tpTriggerPnlRatio, strategyConfigInfo.tpTriggerPnlRatio) && Intrinsics.EZpvd(this.slTriggerPnlRatio, strategyConfigInfo.slTriggerPnlRatio) && Intrinsics.EZpvd(this.rsiOversoldThold, strategyConfigInfo.rsiOversoldThold) && Intrinsics.EZpvd(this.rsiOverboughtThold, strategyConfigInfo.rsiOverboughtThold) && Intrinsics.EZpvd((Object) this.minAmtBuffer, (Object) strategyConfigInfo.minAmtBuffer) && Intrinsics.EZpvd((Object) this.minQuoteThold, (Object) strategyConfigInfo.minQuoteThold) && Intrinsics.EZpvd((Object) this.marginBuffer, (Object) strategyConfigInfo.marginBuffer) && Intrinsics.EZpvd(this.lever, strategyConfigInfo.lever) && Intrinsics.EZpvd((Object) this.perMinProfitRatio, (Object) strategyConfigInfo.perMinProfitRatio) && Intrinsics.EZpvd((Object) this.perMaxProfitRatio, (Object) strategyConfigInfo.perMaxProfitRatio) && Intrinsics.EZpvd(this.lmtOrderNumber, strategyConfigInfo.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.defaultLeverage, (Object) strategyConfigInfo.defaultLeverage) && Intrinsics.EZpvd((Object) this.minLimitVarPercentage, (Object) strategyConfigInfo.minLimitVarPercentage) && Intrinsics.EZpvd((Object) this.maxLimitVarPercentage, (Object) strategyConfigInfo.maxLimitVarPercentage) && Intrinsics.EZpvd((Object) this.minAvailablePercentage, (Object) strategyConfigInfo.minAvailablePercentage) && Intrinsics.EZpvd((Object) this.maxAvailablePercentage, (Object) strategyConfigInfo.maxAvailablePercentage) && Intrinsics.EZpvd((Object) this.minInitialInvestmentPercentage, (Object) strategyConfigInfo.minInitialInvestmentPercentage) && Intrinsics.EZpvd((Object) this.maxInitialInvestmentPercentage, (Object) strategyConfigInfo.maxInitialInvestmentPercentage) && Intrinsics.EZpvd((Object) this.minTpPercentage, (Object) strategyConfigInfo.minTpPercentage) && Intrinsics.EZpvd((Object) this.minSlPercentage, (Object) strategyConfigInfo.minSlPercentage) && Intrinsics.EZpvd((Object) this.entrySettingsRatioRecommend, (Object) strategyConfigInfo.entrySettingsRatioRecommend) && Intrinsics.EZpvd((Object) this.minInvestmentBuffer, (Object) strategyConfigInfo.minInvestmentBuffer) && Intrinsics.EZpvd((Object) this.limitOrderOffsetRecommend, (Object) strategyConfigInfo.limitOrderOffsetRecommend) && Intrinsics.EZpvd((Object) this.maxNumberOfSignalName, (Object) strategyConfigInfo.maxNumberOfSignalName) && Intrinsics.EZpvd((Object) this.maxNumberOfSignalDescription, (Object) strategyConfigInfo.maxNumberOfSignalDescription) && Intrinsics.EZpvd((Object) this.priceTriggerMult, (Object) strategyConfigInfo.priceTriggerMult) && Intrinsics.EZpvd((Object) this.maxAmt, (Object) strategyConfigInfo.maxAmt) && Intrinsics.EZpvd((Object) this.minAmt, (Object) strategyConfigInfo.minAmt) && Intrinsics.EZpvd(this.earnConfig, strategyConfigInfo.earnConfig) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyConfigInfo.tradeQuoteCcy) && Intrinsics.EZpvd(this.autoEarn, strategyConfigInfo.autoEarn) && Intrinsics.EZpvd(this.autoStaking, strategyConfigInfo.autoStaking) && Intrinsics.EZpvd((Object) this.vipLevel, (Object) strategyConfigInfo.vipLevel) && Intrinsics.EZpvd(this.profitAutoReinvest, strategyConfigInfo.profitAutoReinvest) && Intrinsics.EZpvd(this.smartPortfolioConfig, strategyConfigInfo.smartPortfolioConfig) && Intrinsics.EZpvd(this.slippageControl, strategyConfigInfo.slippageControl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountMax() {
        return this.amountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountMin() {
        return this.amountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoEarn() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoStaking() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultKlineTimeframe() {
        return this.defaultKlineTimeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultLeverage() {
        return this.defaultLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultRatio() {
        return this.defaultRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultTime() {
        return this.defaultTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatioMax() {
        return this.deltaRatioMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatioMin() {
        return this.deltaRatioMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnConfig getEarnConfig() {
        return this.earnConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntrySettingsRatioRecommend() {
        return this.entrySettingsRatioRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntervalMax() {
        return this.intervalMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntervalMin() {
        return this.intervalMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKlinePeriod() {
        return this.klinePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeveragePercents() {
        return this.leveragePercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderOffsetRecommend() {
        return this.limitOrderOffsetRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LmtOrderNumber getLmtOrderNumber() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginBuffer() {
        return this.marginBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmt() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAvailablePercentage() {
        return this.maxAvailablePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGridNum() {
        return this.maxGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxInitialInvestmentPercentage() {
        return this.maxInitialInvestmentPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLever() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLimitVarPercentage() {
        return this.maxLimitVarPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxNumberOfSignalDescription() {
        return this.maxNumberOfSignalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxNumberOfSignalName() {
        return this.maxNumberOfSignalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmountMultiple() {
        return this.minAmountMultiple;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmt() {
        return this.minAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmtBuffer() {
        return this.minAmtBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAvailablePercentage() {
        return this.minAvailablePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGridNum() {
        return this.minGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInitialInvestmentPercentage() {
        return this.minInitialInvestmentPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInvestmentBuffer() {
        return this.minInvestmentBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLever() {
        return this.minLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLimitVarPercentage() {
        return this.minLimitVarPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinQuoteThold() {
        return this.minQuoteThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSlPercentage() {
        return this.minSlPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTpPercentage() {
        return this.minTpPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameMax() {
        return this.nameMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerCoinMinAmt() {
        return this.perCoinMinAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRatio() {
        return this.perMaxProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRatio() {
        return this.perMinProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceTriggerMult() {
        return this.priceTriggerMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse getProfitAutoReinvest() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxMax() {
        return this.pxMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxMin() {
        return this.pxMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxPercentageMax() {
        return this.pxPercentageMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxPercentageMin() {
        return this.pxPercentageMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxPercentageRec() {
        return this.pxPercentageRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxRangeMax() {
        return this.pxRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxRangeMin() {
        return this.pxRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxRangeRec() {
        return this.pxRangeRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioMax() {
        return this.ratioMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioMin() {
        return this.ratioMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getRsiOverboughtThold() {
        return this.rsiOverboughtThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getRsiOversoldThold() {
        return this.rsiOversoldThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getSlTriggerPnlRatio() {
        return this.slTriggerPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageControl getSlippageControl() {
        return this.slippageControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioConfig getSmartPortfolioConfig() {
        return this.smartPortfolioConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzMin() {
        return this.szMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeIntervalMax() {
        return this.timeIntervalMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeIntervalMin() {
        return this.timeIntervalMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeIntervalRec() {
        return this.timeIntervalRec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopClassFeeRate() {
        return this.topClassFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getTpTriggerPnlRatio() {
        return this.tpTriggerPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridTpSlConfig getTpslConfig() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.strategyType.hashCode();
        int iHashCode3 = this.pxMax.hashCode();
        int iHashCode4 = this.pxMin.hashCode();
        int iHashCode5 = this.pxRangeMax.hashCode();
        int iHashCode6 = this.pxRangeMin.hashCode();
        int iHashCode7 = this.pxRangeRec.hashCode();
        int iHashCode8 = this.pxPercentageMax.hashCode();
        int iHashCode9 = this.pxPercentageMin.hashCode();
        int iHashCode10 = this.pxPercentageRec.hashCode();
        int iHashCode11 = this.timeIntervalMax.hashCode();
        int iHashCode12 = this.timeIntervalMin.hashCode();
        int iHashCode13 = this.timeIntervalRec.hashCode();
        int iHashCode14 = this.amountMax.hashCode();
        int iHashCode15 = this.amountMin.hashCode();
        int iHashCode16 = this.szMin.hashCode();
        int iHashCode17 = this.maxGridNum.hashCode();
        int iHashCode18 = this.minGridNum.hashCode();
        int iHashCode19 = this.topClassFeeRate.hashCode();
        int iHashCode20 = this.minAmountMultiple.hashCode();
        int iHashCode21 = this.minLever.hashCode();
        int iHashCode22 = this.maxLever.hashCode();
        int iHashCode23 = this.leveragePercents.hashCode();
        int iHashCode24 = this.defaultRatio.hashCode();
        int iHashCode25 = this.defaultTime.hashCode();
        int iHashCode26 = this.intervalMax.hashCode();
        int iHashCode27 = this.intervalMin.hashCode();
        int iHashCode28 = this.perCoinMinAmt.hashCode();
        int iHashCode29 = this.ratioMax.hashCode();
        int iHashCode30 = this.ratioMin.hashCode();
        int iHashCode31 = this.nameMax.hashCode();
        int iHashCode32 = this.deltaRatioMin.hashCode();
        int iHashCode33 = this.deltaRatioMax.hashCode();
        BotRangeConfig botRangeConfig = this.initOrdAmt;
        int iHashCode34 = botRangeConfig == null ? 0 : botRangeConfig.hashCode();
        BotRangeConfig botRangeConfig2 = this.safetyOrdAmt;
        int iHashCode35 = botRangeConfig2 == null ? 0 : botRangeConfig2.hashCode();
        BotRangeConfig botRangeConfig3 = this.maxSafetyOrds;
        int iHashCode36 = botRangeConfig3 == null ? 0 : botRangeConfig3.hashCode();
        BotRangeConfig botRangeConfig4 = this.pxSteps;
        int iHashCode37 = botRangeConfig4 == null ? 0 : botRangeConfig4.hashCode();
        BotRangeConfig botRangeConfig5 = this.pxStepsMult;
        int iHashCode38 = botRangeConfig5 == null ? 0 : botRangeConfig5.hashCode();
        BotRangeConfig botRangeConfig6 = this.volMult;
        int iHashCode39 = botRangeConfig6 == null ? 0 : botRangeConfig6.hashCode();
        int iHashCode40 = this.klinePeriod.hashCode();
        int iHashCode41 = this.defaultKlineTimeframe.hashCode();
        int iHashCode42 = this.tpslConfig.hashCode();
        BotRangeConfig botRangeConfig7 = this.tpPct;
        int iHashCode43 = botRangeConfig7 == null ? 0 : botRangeConfig7.hashCode();
        BotRangeConfig botRangeConfig8 = this.slPct;
        int iHashCode44 = botRangeConfig8 == null ? 0 : botRangeConfig8.hashCode();
        BotRangeConfig botRangeConfig9 = this.tpPx;
        int iHashCode45 = botRangeConfig9 == null ? 0 : botRangeConfig9.hashCode();
        BotRangeConfig botRangeConfig10 = this.tpTriggerPnlRatio;
        int iHashCode46 = botRangeConfig10 == null ? 0 : botRangeConfig10.hashCode();
        BotRangeConfig botRangeConfig11 = this.slTriggerPnlRatio;
        int iHashCode47 = botRangeConfig11 == null ? 0 : botRangeConfig11.hashCode();
        BotRangeConfig botRangeConfig12 = this.rsiOversoldThold;
        int iHashCode48 = botRangeConfig12 == null ? 0 : botRangeConfig12.hashCode();
        BotRangeConfig botRangeConfig13 = this.rsiOverboughtThold;
        int iHashCode49 = botRangeConfig13 == null ? 0 : botRangeConfig13.hashCode();
        int iHashCode50 = this.minAmtBuffer.hashCode();
        int iHashCode51 = this.minQuoteThold.hashCode();
        int iHashCode52 = this.marginBuffer.hashCode();
        BotRangeConfig botRangeConfig14 = this.lever;
        int iHashCode53 = botRangeConfig14 == null ? 0 : botRangeConfig14.hashCode();
        String str = this.perMinProfitRatio;
        int iHashCode54 = str == null ? 0 : str.hashCode();
        String str2 = this.perMaxProfitRatio;
        int iHashCode55 = str2 == null ? 0 : str2.hashCode();
        LmtOrderNumber lmtOrderNumber = this.lmtOrderNumber;
        int iHashCode56 = lmtOrderNumber == null ? 0 : lmtOrderNumber.hashCode();
        String str3 = this.defaultLeverage;
        int iHashCode57 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minLimitVarPercentage;
        int iHashCode58 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxLimitVarPercentage;
        int iHashCode59 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.minAvailablePercentage;
        int iHashCode60 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.maxAvailablePercentage;
        int iHashCode61 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.minInitialInvestmentPercentage;
        int iHashCode62 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.maxInitialInvestmentPercentage;
        int iHashCode63 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.minTpPercentage;
        int iHashCode64 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.minSlPercentage;
        int iHashCode65 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.entrySettingsRatioRecommend;
        int iHashCode66 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.minInvestmentBuffer;
        int iHashCode67 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.limitOrderOffsetRecommend;
        int iHashCode68 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.maxNumberOfSignalName;
        int iHashCode69 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.maxNumberOfSignalDescription;
        int iHashCode70 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.priceTriggerMult;
        int iHashCode71 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.maxAmt;
        int iHashCode72 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.minAmt;
        int iHashCode73 = str19 == null ? 0 : str19.hashCode();
        SmartEarnConfig smartEarnConfig = this.earnConfig;
        int iHashCode74 = smartEarnConfig == null ? 0 : smartEarnConfig.hashCode();
        String str20 = this.tradeQuoteCcy;
        int iHashCode75 = str20 == null ? 0 : str20.hashCode();
        List<AutoEarnStakingConfig> list = this.autoEarn;
        int iHashCode76 = list == null ? 0 : list.hashCode();
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        int iHashCode77 = list2 == null ? 0 : list2.hashCode();
        String str21 = this.vipLevel;
        int iHashCode78 = str21 == null ? 0 : str21.hashCode();
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        int iHashCode79 = gridProfitAutoReinvestResponse == null ? 0 : gridProfitAutoReinvestResponse.hashCode();
        SmartPortfolioConfig smartPortfolioConfig = this.smartPortfolioConfig;
        int iHashCode80 = smartPortfolioConfig == null ? 0 : smartPortfolioConfig.hashCode();
        SlippageControl slippageControl = this.slippageControl;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + (slippageControl != null ? slippageControl.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoEarn(List<AutoEarnStakingConfig> list) {
        this.autoEarn = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoStaking(List<AutoEarnStakingConfig> list) {
        this.autoStaking = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultKlineTimeframe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultKlineTimeframe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultLeverage(String str) {
        this.defaultLeverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatioMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaRatioMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatioMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaRatioMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntrySettingsRatioRecommend(String str) {
        this.entrySettingsRatioRecommend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrdAmt(BotRangeConfig botRangeConfig) {
        this.initOrdAmt = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlinePeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.klinePeriod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(BotRangeConfig botRangeConfig) {
        this.lever = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitOrderOffsetRecommend(String str) {
        this.limitOrderOffsetRecommend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLmtOrderNumber(LmtOrderNumber lmtOrderNumber) {
        this.lmtOrderNumber = lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginBuffer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marginBuffer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAmt(String str) {
        this.maxAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAvailablePercentage(String str) {
        this.maxAvailablePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxGridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxInitialInvestmentPercentage(String str) {
        this.maxInitialInvestmentPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxLimitVarPercentage(String str) {
        this.maxLimitVarPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxNumberOfSignalDescription(String str) {
        this.maxNumberOfSignalDescription = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxNumberOfSignalName(String str) {
        this.maxNumberOfSignalName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(BotRangeConfig botRangeConfig) {
        this.maxSafetyOrds = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAmt(String str) {
        this.minAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAmtBuffer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minAmtBuffer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAvailablePercentage(String str) {
        this.minAvailablePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minGridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInitialInvestmentPercentage(String str) {
        this.minInitialInvestmentPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInvestmentBuffer(String str) {
        this.minInvestmentBuffer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinLimitVarPercentage(String str) {
        this.minLimitVarPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinQuoteThold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minQuoteThold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinSlPercentage(String str) {
        this.minSlPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinTpPercentage(String str) {
        this.minTpPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNameMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nameMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRatio(String str) {
        this.perMaxProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRatio(String str) {
        this.perMinProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceTriggerMult(String str) {
        this.priceTriggerMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxPercentageMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxPercentageMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxPercentageMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxPercentageMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxPercentageRec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxPercentageRec = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxRangeMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxRangeMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxRangeMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxRangeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxRangeRec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxRangeRec = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(BotRangeConfig botRangeConfig) {
        this.pxSteps = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(BotRangeConfig botRangeConfig) {
        this.pxStepsMult = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatioMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ratioMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRsiOverboughtThold(BotRangeConfig botRangeConfig) {
        this.rsiOverboughtThold = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRsiOversoldThold(BotRangeConfig botRangeConfig) {
        this.rsiOversoldThold = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafetyOrdAmt(BotRangeConfig botRangeConfig) {
        this.safetyOrdAmt = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(BotRangeConfig botRangeConfig) {
        this.slPct = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPnlRatio(BotRangeConfig botRangeConfig) {
        this.slTriggerPnlRatio = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strategyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeIntervalMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeIntervalMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeIntervalMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeIntervalMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeIntervalRec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeIntervalRec = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopClassFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.topClassFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPct(BotRangeConfig botRangeConfig) {
        this.tpPct = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(BotRangeConfig botRangeConfig) {
        this.tpPx = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPnlRatio(BotRangeConfig botRangeConfig) {
        this.tpTriggerPnlRatio = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(BotRangeConfig botRangeConfig) {
        this.volMult = botRangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyConfigInfo(instId=" + this.instId + ", strategyType=" + this.strategyType + ", pxMax=" + this.pxMax + ", pxMin=" + this.pxMin + ", pxRangeMax=" + this.pxRangeMax + ", pxRangeMin=" + this.pxRangeMin + ", pxRangeRec=" + this.pxRangeRec + ", pxPercentageMax=" + this.pxPercentageMax + ", pxPercentageMin=" + this.pxPercentageMin + ", pxPercentageRec=" + this.pxPercentageRec + ", timeIntervalMax=" + this.timeIntervalMax + ", timeIntervalMin=" + this.timeIntervalMin + ", timeIntervalRec=" + this.timeIntervalRec + ", amountMax=" + this.amountMax + ", amountMin=" + this.amountMin + ", szMin=" + this.szMin + ", maxGridNum=" + this.maxGridNum + ", minGridNum=" + this.minGridNum + ", topClassFeeRate=" + this.topClassFeeRate + ", minAmountMultiple=" + this.minAmountMultiple + ", minLever=" + this.minLever + ", maxLever=" + this.maxLever + ", leveragePercents=" + this.leveragePercents + ", defaultRatio=" + this.defaultRatio + ", defaultTime=" + this.defaultTime + ", intervalMax=" + this.intervalMax + ", intervalMin=" + this.intervalMin + ", perCoinMinAmt=" + this.perCoinMinAmt + ", ratioMax=" + this.ratioMax + ", ratioMin=" + this.ratioMin + ", nameMax=" + this.nameMax + ", deltaRatioMin=" + this.deltaRatioMin + ", deltaRatioMax=" + this.deltaRatioMax + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", maxSafetyOrds=" + this.maxSafetyOrds + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", klinePeriod=" + this.klinePeriod + ", defaultKlineTimeframe=" + this.defaultKlineTimeframe + ", tpslConfig=" + this.tpslConfig + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", tpPx=" + this.tpPx + ", tpTriggerPnlRatio=" + this.tpTriggerPnlRatio + ", slTriggerPnlRatio=" + this.slTriggerPnlRatio + ", rsiOversoldThold=" + this.rsiOversoldThold + ", rsiOverboughtThold=" + this.rsiOverboughtThold + ", minAmtBuffer=" + this.minAmtBuffer + ", minQuoteThold=" + this.minQuoteThold + ", marginBuffer=" + this.marginBuffer + ", lever=" + this.lever + ", perMinProfitRatio=" + this.perMinProfitRatio + ", perMaxProfitRatio=" + this.perMaxProfitRatio + ", lmtOrderNumber=" + this.lmtOrderNumber + ", defaultLeverage=" + this.defaultLeverage + ", minLimitVarPercentage=" + this.minLimitVarPercentage + ", maxLimitVarPercentage=" + this.maxLimitVarPercentage + ", minAvailablePercentage=" + this.minAvailablePercentage + ", maxAvailablePercentage=" + this.maxAvailablePercentage + ", minInitialInvestmentPercentage=" + this.minInitialInvestmentPercentage + ", maxInitialInvestmentPercentage=" + this.maxInitialInvestmentPercentage + ", minTpPercentage=" + this.minTpPercentage + ", minSlPercentage=" + this.minSlPercentage + ", entrySettingsRatioRecommend=" + this.entrySettingsRatioRecommend + ", minInvestmentBuffer=" + this.minInvestmentBuffer + ", limitOrderOffsetRecommend=" + this.limitOrderOffsetRecommend + ", maxNumberOfSignalName=" + this.maxNumberOfSignalName + ", maxNumberOfSignalDescription=" + this.maxNumberOfSignalDescription + ", priceTriggerMult=" + this.priceTriggerMult + ", maxAmt=" + this.maxAmt + ", minAmt=" + this.minAmt + ", earnConfig=" + this.earnConfig + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", autoEarn=" + this.autoEarn + ", autoStaking=" + this.autoStaking + ", vipLevel=" + this.vipLevel + ", profitAutoReinvest=" + this.profitAutoReinvest + ", smartPortfolioConfig=" + this.smartPortfolioConfig + ", slippageControl=" + this.slippageControl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.strategyType);
        parcel.writeString(this.pxMax);
        parcel.writeString(this.pxMin);
        parcel.writeString(this.pxRangeMax);
        parcel.writeString(this.pxRangeMin);
        parcel.writeString(this.pxRangeRec);
        parcel.writeString(this.pxPercentageMax);
        parcel.writeString(this.pxPercentageMin);
        parcel.writeString(this.pxPercentageRec);
        parcel.writeString(this.timeIntervalMax);
        parcel.writeString(this.timeIntervalMin);
        parcel.writeString(this.timeIntervalRec);
        parcel.writeString(this.amountMax);
        parcel.writeString(this.amountMin);
        parcel.writeString(this.szMin);
        parcel.writeString(this.maxGridNum);
        parcel.writeString(this.minGridNum);
        parcel.writeString(this.topClassFeeRate);
        parcel.writeString(this.minAmountMultiple);
        parcel.writeString(this.minLever);
        parcel.writeString(this.maxLever);
        parcel.writeString(this.leveragePercents);
        parcel.writeString(this.defaultRatio);
        parcel.writeString(this.defaultTime);
        parcel.writeString(this.intervalMax);
        parcel.writeString(this.intervalMin);
        parcel.writeString(this.perCoinMinAmt);
        parcel.writeString(this.ratioMax);
        parcel.writeString(this.ratioMin);
        parcel.writeString(this.nameMax);
        parcel.writeString(this.deltaRatioMin);
        parcel.writeString(this.deltaRatioMax);
        BotRangeConfig botRangeConfig = this.initOrdAmt;
        if (botRangeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig2 = this.safetyOrdAmt;
        if (botRangeConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig2.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig3 = this.maxSafetyOrds;
        if (botRangeConfig3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig3.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig4 = this.pxSteps;
        if (botRangeConfig4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig4.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig5 = this.pxStepsMult;
        if (botRangeConfig5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig5.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig6 = this.volMult;
        if (botRangeConfig6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig6.writeToParcel(parcel, i);
        }
        parcel.writeString(this.klinePeriod);
        parcel.writeString(this.defaultKlineTimeframe);
        this.tpslConfig.writeToParcel(parcel, i);
        BotRangeConfig botRangeConfig7 = this.tpPct;
        if (botRangeConfig7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig7.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig8 = this.slPct;
        if (botRangeConfig8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig8.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig9 = this.tpPx;
        if (botRangeConfig9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig9.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig10 = this.tpTriggerPnlRatio;
        if (botRangeConfig10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig10.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig11 = this.slTriggerPnlRatio;
        if (botRangeConfig11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig11.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig12 = this.rsiOversoldThold;
        if (botRangeConfig12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig12.writeToParcel(parcel, i);
        }
        BotRangeConfig botRangeConfig13 = this.rsiOverboughtThold;
        if (botRangeConfig13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig13.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minAmtBuffer);
        parcel.writeString(this.minQuoteThold);
        parcel.writeString(this.marginBuffer);
        BotRangeConfig botRangeConfig14 = this.lever;
        if (botRangeConfig14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botRangeConfig14.writeToParcel(parcel, i);
        }
        parcel.writeString(this.perMinProfitRatio);
        parcel.writeString(this.perMaxProfitRatio);
        LmtOrderNumber lmtOrderNumber = this.lmtOrderNumber;
        if (lmtOrderNumber == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lmtOrderNumber.writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultLeverage);
        parcel.writeString(this.minLimitVarPercentage);
        parcel.writeString(this.maxLimitVarPercentage);
        parcel.writeString(this.minAvailablePercentage);
        parcel.writeString(this.maxAvailablePercentage);
        parcel.writeString(this.minInitialInvestmentPercentage);
        parcel.writeString(this.maxInitialInvestmentPercentage);
        parcel.writeString(this.minTpPercentage);
        parcel.writeString(this.minSlPercentage);
        parcel.writeString(this.entrySettingsRatioRecommend);
        parcel.writeString(this.minInvestmentBuffer);
        parcel.writeString(this.limitOrderOffsetRecommend);
        parcel.writeString(this.maxNumberOfSignalName);
        parcel.writeString(this.maxNumberOfSignalDescription);
        parcel.writeString(this.priceTriggerMult);
        parcel.writeString(this.maxAmt);
        parcel.writeString(this.minAmt);
        SmartEarnConfig smartEarnConfig = this.earnConfig;
        if (smartEarnConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeQuoteCcy);
        List<AutoEarnStakingConfig> list = this.autoEarn;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AutoEarnStakingConfig> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AutoEarnStakingConfig> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.vipLevel);
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        if (gridProfitAutoReinvestResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gridProfitAutoReinvestResponse.writeToParcel(parcel, i);
        }
        SmartPortfolioConfig smartPortfolioConfig = this.smartPortfolioConfig;
        if (smartPortfolioConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartPortfolioConfig.writeToParcel(parcel, i);
        }
        SlippageControl slippageControl = this.slippageControl;
        if (slippageControl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            slippageControl.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyConfigInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyConfigInfo> serializer() {
            return StrategyConfigInfo$$serializer.INSTANCE;
        }
    }

    static {
        AutoEarnStakingConfig$$serializer autoEarnStakingConfig$$serializer = AutoEarnStakingConfig$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(autoEarnStakingConfig$$serializer), new ArrayListSerializer(autoEarnStakingConfig$$serializer), null, null, null, null};
    }

    public /* synthetic */ StrategyConfigInfo(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, BotRangeConfig botRangeConfig, BotRangeConfig botRangeConfig2, BotRangeConfig botRangeConfig3, BotRangeConfig botRangeConfig4, BotRangeConfig botRangeConfig5, BotRangeConfig botRangeConfig6, String str34, String str35, SpotGridTpSlConfig spotGridTpSlConfig, BotRangeConfig botRangeConfig7, BotRangeConfig botRangeConfig8, BotRangeConfig botRangeConfig9, BotRangeConfig botRangeConfig10, BotRangeConfig botRangeConfig11, BotRangeConfig botRangeConfig12, BotRangeConfig botRangeConfig13, String str36, String str37, String str38, BotRangeConfig botRangeConfig14, String str39, String str40, LmtOrderNumber lmtOrderNumber, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, SmartEarnConfig smartEarnConfig, String str58, List list, List list2, String str59, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, SmartPortfolioConfig smartPortfolioConfig, SlippageControl slippageControl, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str2;
        }
        if ((i & 4) == 0) {
            this.pxMax = "";
        } else {
            this.pxMax = str3;
        }
        if ((i & 8) == 0) {
            this.pxMin = "";
        } else {
            this.pxMin = str4;
        }
        if ((i & 16) == 0) {
            this.pxRangeMax = "";
        } else {
            this.pxRangeMax = str5;
        }
        if ((i & 32) == 0) {
            this.pxRangeMin = "";
        } else {
            this.pxRangeMin = str6;
        }
        if ((i & 64) == 0) {
            this.pxRangeRec = "";
        } else {
            this.pxRangeRec = str7;
        }
        if ((i & 128) == 0) {
            this.pxPercentageMax = "";
        } else {
            this.pxPercentageMax = str8;
        }
        if ((i & 256) == 0) {
            this.pxPercentageMin = "";
        } else {
            this.pxPercentageMin = str9;
        }
        if ((i & 512) == 0) {
            this.pxPercentageRec = "";
        } else {
            this.pxPercentageRec = str10;
        }
        if ((i & 1024) == 0) {
            this.timeIntervalMax = "";
        } else {
            this.timeIntervalMax = str11;
        }
        if ((i & 2048) == 0) {
            this.timeIntervalMin = "";
        } else {
            this.timeIntervalMin = str12;
        }
        if ((i & 4096) == 0) {
            this.timeIntervalRec = "";
        } else {
            this.timeIntervalRec = str13;
        }
        if ((i & 8192) == 0) {
            this.amountMax = "";
        } else {
            this.amountMax = str14;
        }
        if ((i & 16384) == 0) {
            this.amountMin = "";
        } else {
            this.amountMin = str15;
        }
        if ((i & 32768) == 0) {
            this.szMin = "";
        } else {
            this.szMin = str16;
        }
        if ((i & 65536) == 0) {
            this.maxGridNum = "";
        } else {
            this.maxGridNum = str17;
        }
        if ((i & 131072) == 0) {
            this.minGridNum = "";
        } else {
            this.minGridNum = str18;
        }
        if ((i & 262144) == 0) {
            this.topClassFeeRate = "";
        } else {
            this.topClassFeeRate = str19;
        }
        this.minAmountMultiple = (i & 524288) == 0 ? "1" : str20;
        if ((1048576 & i) == 0) {
            this.minLever = "";
        } else {
            this.minLever = str21;
        }
        if ((2097152 & i) == 0) {
            this.maxLever = "";
        } else {
            this.maxLever = str22;
        }
        if ((4194304 & i) == 0) {
            this.leveragePercents = "";
        } else {
            this.leveragePercents = str23;
        }
        if ((8388608 & i) == 0) {
            this.defaultRatio = "";
        } else {
            this.defaultRatio = str24;
        }
        if ((16777216 & i) == 0) {
            this.defaultTime = "";
        } else {
            this.defaultTime = str25;
        }
        if ((33554432 & i) == 0) {
            this.intervalMax = "";
        } else {
            this.intervalMax = str26;
        }
        if ((67108864 & i) == 0) {
            this.intervalMin = "";
        } else {
            this.intervalMin = str27;
        }
        if ((134217728 & i) == 0) {
            this.perCoinMinAmt = "";
        } else {
            this.perCoinMinAmt = str28;
        }
        if ((268435456 & i) == 0) {
            this.ratioMax = "";
        } else {
            this.ratioMax = str29;
        }
        if ((536870912 & i) == 0) {
            this.ratioMin = "";
        } else {
            this.ratioMin = str30;
        }
        if ((1073741824 & i) == 0) {
            this.nameMax = "";
        } else {
            this.nameMax = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.deltaRatioMin = "";
        } else {
            this.deltaRatioMin = str32;
        }
        if ((i2 & 1) == 0) {
            this.deltaRatioMax = "";
        } else {
            this.deltaRatioMax = str33;
        }
        if ((i2 & 2) == 0) {
            this.initOrdAmt = null;
        } else {
            this.initOrdAmt = botRangeConfig;
        }
        if ((i2 & 4) == 0) {
            this.safetyOrdAmt = null;
        } else {
            this.safetyOrdAmt = botRangeConfig2;
        }
        if ((i2 & 8) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = botRangeConfig3;
        }
        if ((i2 & 16) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = botRangeConfig4;
        }
        if ((i2 & 32) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = botRangeConfig5;
        }
        if ((i2 & 64) == 0) {
            this.volMult = null;
        } else {
            this.volMult = botRangeConfig6;
        }
        if ((i2 & 128) == 0) {
            this.klinePeriod = "";
        } else {
            this.klinePeriod = str34;
        }
        if ((i2 & 256) == 0) {
            this.defaultKlineTimeframe = "";
        } else {
            this.defaultKlineTimeframe = str35;
        }
        this.tpslConfig = (i2 & 512) == 0 ? new SpotGridTpSlConfig((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : spotGridTpSlConfig;
        if ((i2 & 1024) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = botRangeConfig7;
        }
        if ((i2 & 2048) == 0) {
            this.slPct = null;
        } else {
            this.slPct = botRangeConfig8;
        }
        if ((i2 & 4096) == 0) {
            this.tpPx = null;
        } else {
            this.tpPx = botRangeConfig9;
        }
        if ((i2 & 8192) == 0) {
            this.tpTriggerPnlRatio = null;
        } else {
            this.tpTriggerPnlRatio = botRangeConfig10;
        }
        if ((i2 & 16384) == 0) {
            this.slTriggerPnlRatio = null;
        } else {
            this.slTriggerPnlRatio = botRangeConfig11;
        }
        if ((i2 & 32768) == 0) {
            this.rsiOversoldThold = null;
        } else {
            this.rsiOversoldThold = botRangeConfig12;
        }
        if ((i2 & 65536) == 0) {
            this.rsiOverboughtThold = null;
        } else {
            this.rsiOverboughtThold = botRangeConfig13;
        }
        if ((i2 & 131072) == 0) {
            this.minAmtBuffer = "";
        } else {
            this.minAmtBuffer = str36;
        }
        if ((i2 & 262144) == 0) {
            this.minQuoteThold = "";
        } else {
            this.minQuoteThold = str37;
        }
        if ((i2 & 524288) == 0) {
            this.marginBuffer = "";
        } else {
            this.marginBuffer = str38;
        }
        if ((1048576 & i2) == 0) {
            this.lever = null;
        } else {
            this.lever = botRangeConfig14;
        }
        if ((2097152 & i2) == 0) {
            this.perMinProfitRatio = null;
        } else {
            this.perMinProfitRatio = str39;
        }
        if ((4194304 & i2) == 0) {
            this.perMaxProfitRatio = null;
        } else {
            this.perMaxProfitRatio = str40;
        }
        if ((8388608 & i2) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = lmtOrderNumber;
        }
        if ((16777216 & i2) == 0) {
            this.defaultLeverage = null;
        } else {
            this.defaultLeverage = str41;
        }
        if ((33554432 & i2) == 0) {
            this.minLimitVarPercentage = null;
        } else {
            this.minLimitVarPercentage = str42;
        }
        if ((67108864 & i2) == 0) {
            this.maxLimitVarPercentage = null;
        } else {
            this.maxLimitVarPercentage = str43;
        }
        if ((134217728 & i2) == 0) {
            this.minAvailablePercentage = null;
        } else {
            this.minAvailablePercentage = str44;
        }
        if ((268435456 & i2) == 0) {
            this.maxAvailablePercentage = null;
        } else {
            this.maxAvailablePercentage = str45;
        }
        if ((536870912 & i2) == 0) {
            this.minInitialInvestmentPercentage = null;
        } else {
            this.minInitialInvestmentPercentage = str46;
        }
        if ((1073741824 & i2) == 0) {
            this.maxInitialInvestmentPercentage = null;
        } else {
            this.maxInitialInvestmentPercentage = str47;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.minTpPercentage = null;
        } else {
            this.minTpPercentage = str48;
        }
        if ((i3 & 1) == 0) {
            this.minSlPercentage = null;
        } else {
            this.minSlPercentage = str49;
        }
        if ((i3 & 2) == 0) {
            this.entrySettingsRatioRecommend = null;
        } else {
            this.entrySettingsRatioRecommend = str50;
        }
        if ((i3 & 4) == 0) {
            this.minInvestmentBuffer = null;
        } else {
            this.minInvestmentBuffer = str51;
        }
        if ((i3 & 8) == 0) {
            this.limitOrderOffsetRecommend = null;
        } else {
            this.limitOrderOffsetRecommend = str52;
        }
        if ((i3 & 16) == 0) {
            this.maxNumberOfSignalName = null;
        } else {
            this.maxNumberOfSignalName = str53;
        }
        if ((i3 & 32) == 0) {
            this.maxNumberOfSignalDescription = null;
        } else {
            this.maxNumberOfSignalDescription = str54;
        }
        if ((i3 & 64) == 0) {
            this.priceTriggerMult = null;
        } else {
            this.priceTriggerMult = str55;
        }
        if ((i3 & 128) == 0) {
            this.maxAmt = null;
        } else {
            this.maxAmt = str56;
        }
        if ((i3 & 256) == 0) {
            this.minAmt = null;
        } else {
            this.minAmt = str57;
        }
        if ((i3 & 512) == 0) {
            this.earnConfig = null;
        } else {
            this.earnConfig = smartEarnConfig;
        }
        if ((i3 & 1024) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str58;
        }
        if ((i3 & 2048) == 0) {
            this.autoEarn = null;
        } else {
            this.autoEarn = list;
        }
        if ((i3 & 4096) == 0) {
            this.autoStaking = null;
        } else {
            this.autoStaking = list2;
        }
        if ((i3 & 8192) == 0) {
            this.vipLevel = null;
        } else {
            this.vipLevel = str59;
        }
        if ((i3 & 16384) == 0) {
            this.profitAutoReinvest = null;
        } else {
            this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        }
        if ((i3 & 32768) == 0) {
            this.smartPortfolioConfig = null;
        } else {
            this.smartPortfolioConfig = smartPortfolioConfig;
        }
        if ((i3 & 65536) == 0) {
            this.slippageControl = null;
        } else {
            this.slippageControl = slippageControl;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyConfigInfo strategyConfigInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyConfigInfo.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyConfigInfo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyConfigInfo.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyConfigInfo.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyConfigInfo.pxMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyConfigInfo.pxMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxRangeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyConfigInfo.pxRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxRangeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyConfigInfo.pxRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxRangeRec, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyConfigInfo.pxRangeRec);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxPercentageMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyConfigInfo.pxPercentageMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxPercentageMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyConfigInfo.pxPercentageMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyConfigInfo.pxPercentageRec, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyConfigInfo.pxPercentageRec);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyConfigInfo.timeIntervalMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyConfigInfo.timeIntervalMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyConfigInfo.timeIntervalMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyConfigInfo.timeIntervalMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyConfigInfo.timeIntervalRec, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyConfigInfo.timeIntervalRec);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyConfigInfo.amountMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyConfigInfo.amountMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyConfigInfo.amountMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyConfigInfo.amountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyConfigInfo.szMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyConfigInfo.szMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyConfigInfo.maxGridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyConfigInfo.maxGridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyConfigInfo.minGridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyConfigInfo.minGridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyConfigInfo.topClassFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyConfigInfo.topClassFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyConfigInfo.minAmountMultiple, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyConfigInfo.minAmountMultiple);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyConfigInfo.minLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyConfigInfo.minLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyConfigInfo.maxLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyConfigInfo.maxLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyConfigInfo.leveragePercents, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyConfigInfo.leveragePercents);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyConfigInfo.defaultRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyConfigInfo.defaultRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyConfigInfo.defaultTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyConfigInfo.defaultTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyConfigInfo.intervalMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyConfigInfo.intervalMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyConfigInfo.intervalMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyConfigInfo.intervalMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyConfigInfo.perCoinMinAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyConfigInfo.perCoinMinAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyConfigInfo.ratioMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyConfigInfo.ratioMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyConfigInfo.ratioMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyConfigInfo.ratioMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyConfigInfo.nameMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyConfigInfo.nameMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyConfigInfo.deltaRatioMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyConfigInfo.deltaRatioMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyConfigInfo.deltaRatioMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyConfigInfo.deltaRatioMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || strategyConfigInfo.initOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || strategyConfigInfo.safetyOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || strategyConfigInfo.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || strategyConfigInfo.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || strategyConfigInfo.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || strategyConfigInfo.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyConfigInfo.klinePeriod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyConfigInfo.klinePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) strategyConfigInfo.defaultKlineTimeframe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyConfigInfo.defaultKlineTimeframe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd(strategyConfigInfo.tpslConfig, new SpotGridTpSlConfig((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 41, SpotGridTpSlConfig$$serializer.INSTANCE, strategyConfigInfo.tpslConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || strategyConfigInfo.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || strategyConfigInfo.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || strategyConfigInfo.tpPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || strategyConfigInfo.tpTriggerPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.tpTriggerPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || strategyConfigInfo.slTriggerPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.slTriggerPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || strategyConfigInfo.rsiOversoldThold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.rsiOversoldThold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || strategyConfigInfo.rsiOverboughtThold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.rsiOverboughtThold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) strategyConfigInfo.minAmtBuffer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, strategyConfigInfo.minAmtBuffer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) strategyConfigInfo.minQuoteThold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, strategyConfigInfo.minQuoteThold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) strategyConfigInfo.marginBuffer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, strategyConfigInfo.marginBuffer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || strategyConfigInfo.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, BotRangeConfig$$serializer.INSTANCE, strategyConfigInfo.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || strategyConfigInfo.perMinProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, strategyConfigInfo.perMinProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || strategyConfigInfo.perMaxProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, strategyConfigInfo.perMaxProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || strategyConfigInfo.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, LmtOrderNumber$$serializer.INSTANCE, strategyConfigInfo.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || strategyConfigInfo.defaultLeverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, strategyConfigInfo.defaultLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || strategyConfigInfo.minLimitVarPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, strategyConfigInfo.minLimitVarPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || strategyConfigInfo.maxLimitVarPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, StringSerializer.INSTANCE, strategyConfigInfo.maxLimitVarPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || strategyConfigInfo.minAvailablePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, StringSerializer.INSTANCE, strategyConfigInfo.minAvailablePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || strategyConfigInfo.maxAvailablePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, strategyConfigInfo.maxAvailablePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || strategyConfigInfo.minInitialInvestmentPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, StringSerializer.INSTANCE, strategyConfigInfo.minInitialInvestmentPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || strategyConfigInfo.maxInitialInvestmentPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, strategyConfigInfo.maxInitialInvestmentPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || strategyConfigInfo.minTpPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, strategyConfigInfo.minTpPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || strategyConfigInfo.minSlPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, strategyConfigInfo.minSlPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || strategyConfigInfo.entrySettingsRatioRecommend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, strategyConfigInfo.entrySettingsRatioRecommend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || strategyConfigInfo.minInvestmentBuffer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, strategyConfigInfo.minInvestmentBuffer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || strategyConfigInfo.limitOrderOffsetRecommend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, StringSerializer.INSTANCE, strategyConfigInfo.limitOrderOffsetRecommend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || strategyConfigInfo.maxNumberOfSignalName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, strategyConfigInfo.maxNumberOfSignalName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || strategyConfigInfo.maxNumberOfSignalDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, strategyConfigInfo.maxNumberOfSignalDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || strategyConfigInfo.priceTriggerMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, StringSerializer.INSTANCE, strategyConfigInfo.priceTriggerMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || strategyConfigInfo.maxAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, strategyConfigInfo.maxAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || strategyConfigInfo.minAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, strategyConfigInfo.minAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || strategyConfigInfo.earnConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, SmartEarnConfig$$serializer.INSTANCE, strategyConfigInfo.earnConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || strategyConfigInfo.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, strategyConfigInfo.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || strategyConfigInfo.autoEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, kSerializerArr[75], strategyConfigInfo.autoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || strategyConfigInfo.autoStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, kSerializerArr[76], strategyConfigInfo.autoStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || strategyConfigInfo.vipLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StringSerializer.INSTANCE, strategyConfigInfo.vipLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || strategyConfigInfo.profitAutoReinvest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 78, GridProfitAutoReinvestResponse$$serializer.INSTANCE, strategyConfigInfo.profitAutoReinvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || strategyConfigInfo.smartPortfolioConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, SmartPortfolioConfig$$serializer.INSTANCE, strategyConfigInfo.smartPortfolioConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) && strategyConfigInfo.slippageControl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 80, SlippageControl$$serializer.INSTANCE, strategyConfigInfo.slippageControl);
    }

    public StrategyConfigInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, BotRangeConfig botRangeConfig, BotRangeConfig botRangeConfig2, BotRangeConfig botRangeConfig3, BotRangeConfig botRangeConfig4, BotRangeConfig botRangeConfig5, BotRangeConfig botRangeConfig6, @NotNull String str34, @NotNull String str35, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, BotRangeConfig botRangeConfig7, BotRangeConfig botRangeConfig8, BotRangeConfig botRangeConfig9, BotRangeConfig botRangeConfig10, BotRangeConfig botRangeConfig11, BotRangeConfig botRangeConfig12, BotRangeConfig botRangeConfig13, @NotNull String str36, @NotNull String str37, @NotNull String str38, BotRangeConfig botRangeConfig14, String str39, String str40, LmtOrderNumber lmtOrderNumber, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, SmartEarnConfig smartEarnConfig, String str58, List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str59, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, SmartPortfolioConfig smartPortfolioConfig, SlippageControl slippageControl) {
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
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        this.instId = str;
        this.strategyType = str2;
        this.pxMax = str3;
        this.pxMin = str4;
        this.pxRangeMax = str5;
        this.pxRangeMin = str6;
        this.pxRangeRec = str7;
        this.pxPercentageMax = str8;
        this.pxPercentageMin = str9;
        this.pxPercentageRec = str10;
        this.timeIntervalMax = str11;
        this.timeIntervalMin = str12;
        this.timeIntervalRec = str13;
        this.amountMax = str14;
        this.amountMin = str15;
        this.szMin = str16;
        this.maxGridNum = str17;
        this.minGridNum = str18;
        this.topClassFeeRate = str19;
        this.minAmountMultiple = str20;
        this.minLever = str21;
        this.maxLever = str22;
        this.leveragePercents = str23;
        this.defaultRatio = str24;
        this.defaultTime = str25;
        this.intervalMax = str26;
        this.intervalMin = str27;
        this.perCoinMinAmt = str28;
        this.ratioMax = str29;
        this.ratioMin = str30;
        this.nameMax = str31;
        this.deltaRatioMin = str32;
        this.deltaRatioMax = str33;
        this.initOrdAmt = botRangeConfig;
        this.safetyOrdAmt = botRangeConfig2;
        this.maxSafetyOrds = botRangeConfig3;
        this.pxSteps = botRangeConfig4;
        this.pxStepsMult = botRangeConfig5;
        this.volMult = botRangeConfig6;
        this.klinePeriod = str34;
        this.defaultKlineTimeframe = str35;
        this.tpslConfig = spotGridTpSlConfig;
        this.tpPct = botRangeConfig7;
        this.slPct = botRangeConfig8;
        this.tpPx = botRangeConfig9;
        this.tpTriggerPnlRatio = botRangeConfig10;
        this.slTriggerPnlRatio = botRangeConfig11;
        this.rsiOversoldThold = botRangeConfig12;
        this.rsiOverboughtThold = botRangeConfig13;
        this.minAmtBuffer = str36;
        this.minQuoteThold = str37;
        this.marginBuffer = str38;
        this.lever = botRangeConfig14;
        this.perMinProfitRatio = str39;
        this.perMaxProfitRatio = str40;
        this.lmtOrderNumber = lmtOrderNumber;
        this.defaultLeverage = str41;
        this.minLimitVarPercentage = str42;
        this.maxLimitVarPercentage = str43;
        this.minAvailablePercentage = str44;
        this.maxAvailablePercentage = str45;
        this.minInitialInvestmentPercentage = str46;
        this.maxInitialInvestmentPercentage = str47;
        this.minTpPercentage = str48;
        this.minSlPercentage = str49;
        this.entrySettingsRatioRecommend = str50;
        this.minInvestmentBuffer = str51;
        this.limitOrderOffsetRecommend = str52;
        this.maxNumberOfSignalName = str53;
        this.maxNumberOfSignalDescription = str54;
        this.priceTriggerMult = str55;
        this.maxAmt = str56;
        this.minAmt = str57;
        this.earnConfig = smartEarnConfig;
        this.tradeQuoteCcy = str58;
        this.autoEarn = list;
        this.autoStaking = list2;
        this.vipLevel = str59;
        this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        this.smartPortfolioConfig = smartPortfolioConfig;
        this.slippageControl = slippageControl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyConfigInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, BotRangeConfig botRangeConfig, BotRangeConfig botRangeConfig2, BotRangeConfig botRangeConfig3, BotRangeConfig botRangeConfig4, BotRangeConfig botRangeConfig5, BotRangeConfig botRangeConfig6, String str34, String str35, SpotGridTpSlConfig spotGridTpSlConfig, BotRangeConfig botRangeConfig7, BotRangeConfig botRangeConfig8, BotRangeConfig botRangeConfig9, BotRangeConfig botRangeConfig10, BotRangeConfig botRangeConfig11, BotRangeConfig botRangeConfig12, BotRangeConfig botRangeConfig13, String str36, String str37, String str38, BotRangeConfig botRangeConfig14, String str39, String str40, LmtOrderNumber lmtOrderNumber, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, SmartEarnConfig smartEarnConfig, String str58, List list, List list2, String str59, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, SmartPortfolioConfig smartPortfolioConfig, SlippageControl slippageControl, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str60 = (i & 1) != 0 ? "" : str;
        String str61 = (i & 2) != 0 ? "" : str2;
        String str62 = (i & 4) != 0 ? "" : str3;
        String str63 = (i & 8) != 0 ? "" : str4;
        String str64 = (i & 16) != 0 ? "" : str5;
        String str65 = (i & 32) != 0 ? "" : str6;
        String str66 = (i & 64) != 0 ? "" : str7;
        String str67 = (i & 128) != 0 ? "" : str8;
        String str68 = (i & 256) != 0 ? "" : str9;
        String str69 = (i & 512) != 0 ? "" : str10;
        String str70 = (i & 1024) != 0 ? "" : str11;
        String str71 = (i & 2048) != 0 ? "" : str12;
        String str72 = (i & 4096) != 0 ? "" : str13;
        String str73 = (i & 8192) != 0 ? "" : str14;
        String str74 = (i & 16384) != 0 ? "" : str15;
        String str75 = (i & 32768) != 0 ? "" : str16;
        String str76 = (i & 65536) != 0 ? "" : str17;
        String str77 = (i & 131072) != 0 ? "" : str18;
        String str78 = (i & 262144) != 0 ? "" : str19;
        String str79 = (i & 524288) != 0 ? "1" : str20;
        String str80 = (i & 1048576) != 0 ? "" : str21;
        String str81 = (i & 2097152) != 0 ? "" : str22;
        String str82 = (i & 4194304) != 0 ? "" : str23;
        String str83 = (i & 8388608) != 0 ? "" : str24;
        String str84 = (i & 16777216) != 0 ? "" : str25;
        String str85 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str86 = (i & 67108864) != 0 ? "" : str27;
        String str87 = (i & 134217728) != 0 ? "" : str28;
        String str88 = (i & 268435456) != 0 ? "" : str29;
        String str89 = (i & 536870912) != 0 ? "" : str30;
        String str90 = (i & 1073741824) != 0 ? "" : str31;
        String str91 = (i & Integer.MIN_VALUE) != 0 ? "" : str32;
        this(str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? null : botRangeConfig, (i2 & 4) != 0 ? null : botRangeConfig2, (i2 & 8) != 0 ? null : botRangeConfig3, (i2 & 16) != 0 ? null : botRangeConfig4, (i2 & 32) != 0 ? null : botRangeConfig5, (i2 & 64) != 0 ? null : botRangeConfig6, (i2 & 128) != 0 ? "" : str34, (i2 & 256) != 0 ? "" : str35, (i2 & 512) != 0 ? new SpotGridTpSlConfig((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : spotGridTpSlConfig, (i2 & 1024) != 0 ? null : botRangeConfig7, (i2 & 2048) != 0 ? null : botRangeConfig8, (i2 & 4096) != 0 ? null : botRangeConfig9, (i2 & 8192) != 0 ? null : botRangeConfig10, (i2 & 16384) != 0 ? null : botRangeConfig11, (i2 & 32768) != 0 ? null : botRangeConfig12, (i2 & 65536) != 0 ? null : botRangeConfig13, (i2 & 131072) != 0 ? "" : str36, (i2 & 262144) != 0 ? "" : str37, (i2 & 524288) != 0 ? "" : str38, (i2 & 1048576) != 0 ? null : botRangeConfig14, (i2 & 2097152) != 0 ? null : str39, (i2 & 4194304) != 0 ? null : str40, (i2 & 8388608) != 0 ? null : lmtOrderNumber, (i2 & 16777216) != 0 ? null : str41, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str42, (i2 & 67108864) != 0 ? null : str43, (i2 & 134217728) != 0 ? null : str44, (i2 & 268435456) != 0 ? null : str45, (i2 & 536870912) != 0 ? null : str46, (i2 & 1073741824) != 0 ? null : str47, (i2 & Integer.MIN_VALUE) != 0 ? null : str48, (i3 & 1) != 0 ? null : str49, (i3 & 2) != 0 ? null : str50, (i3 & 4) != 0 ? null : str51, (i3 & 8) != 0 ? null : str52, (i3 & 16) != 0 ? null : str53, (i3 & 32) != 0 ? null : str54, (i3 & 64) != 0 ? null : str55, (i3 & 128) != 0 ? null : str56, (i3 & 256) != 0 ? null : str57, (i3 & 512) != 0 ? null : smartEarnConfig, (i3 & 1024) != 0 ? null : str58, (i3 & 2048) != 0 ? null : list, (i3 & 4096) != 0 ? null : list2, (i3 & 8192) != 0 ? null : str59, (i3 & 16384) != 0 ? null : gridProfitAutoReinvestResponse, (i3 & 32768) != 0 ? null : smartPortfolioConfig, (i3 & 65536) == 0 ? slippageControl : null);
    }
}

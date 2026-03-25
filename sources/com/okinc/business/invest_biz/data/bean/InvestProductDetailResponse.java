package com.okinc.business.invest_biz.data.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo$$serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestProductDetailResponse {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int LOSSLESS_RATE_TYPE_APR = 1;
    public static final int LOSSLESS_RATE_TYPE_APY = 0;
    public static final int POOL_TYPE_V2 = 1;
    public static final int POOL_TYPE_V3 = 2;
    private final List<InvestTokenWithMarketCap> aboutToken;
    private final String activeInvestmentId;
    private final Long aggregateInvestmentId;
    private final Long analysisPlatformId;
    private final InvestApyDetailInfo apyDetailInfo;
    private final String baseRate;
    private final List<InvestLogoBaseVo> bottomRightLogoList;
    private final BTCMode btcMode;
    private final Long chainId;
    private final String claimedTimes;
    private final String contract;
    private final String currentPoolCapacity;
    private final String currentPrice;
    private final String dailyRoi;
    private final String deeplink;
    private final String deployAddress;
    private final String deployAddressUrl;
    private final String deployTime;
    private final String depositors;
    private final InvestDetailPagePromptInformation detailPagePromptInformation;
    private final String distributionAmount;
    private final List<InvestUnderlyingToken> earnedToken;
    private final InvestTipInfoVo earnedTokenInfo;
    private final String estRewardEnd;
    private final String feeRate;
    private final Boolean hasBonus;
    private final Boolean hasRate;
    private final Boolean hasRateChart;
    private final Boolean hasRatePerformance;
    private final boolean hasTvlChart;
    private final int investType;
    private final Integer investmentCategory;
    private final String investmentClassify;
    private final long investmentId;
    private final String investmentName;
    private final String investmentShowName;
    private final boolean isBatchClaim;
    private final int isExistTradingFee;
    private final boolean isInternal;
    private final boolean isInvestable;
    private final Boolean isLosslessRateTip;
    private final boolean isNeedIdentityVerify;
    private final Boolean isPoolWithFarmReward;
    private final boolean isSupportRedeem;
    private final String kind;
    private final String liquidationRatio;
    private final String losslessRate;
    private final Integer losslessRateType;
    private final String maturityTime;
    private final List<InvestLogoBaseVo> middleLogoList;
    private final String mintedAmount;
    private final Integer mode;
    private final String monthlyRoi;
    private final String network;
    private final String networkLogo;
    private final String nickname;
    private final Long platformId;
    private final String platformLogo;
    private final String platformName;
    private final String platformUrl;
    private final int pointTag;
    private final String poolCapacity;
    private final String poolId;
    private final String poolName;
    private final Integer poolStatus;
    private final int poolVersion;
    private final boolean protocolIpRestrict;
    private final List<InvestQaVo> qaList;
    private final String rate;
    private final int rateType;
    private final String rateTypeDesc;
    private final int recommendRedeemMethod;
    private final int recommendSubscriptionMethod;
    private final TransactionMethod redeemMethod;
    private final String remainAmount;
    private final String shareUrl;
    private final long sourceInvestmentId;
    private final String sourcePlatformName;
    private final InvestTipInfoVo stakePeriodInfo;
    private final StakingProgress stakingProgress;
    private final String subTitle;
    private final TransactionMethod subscriptionMethod;
    private final InvestTipInfoVo supportAddressInfo;
    private final List<Integer> supportedBTCAddressType;
    private final List<InvestLogoBaseVo> topLeftLogoList;
    private final List<InvestLogoBaseVo> topRightLogoList;
    private final String totalPoolCapacity;
    private final String tvl;
    private final String unableRedeemReason;
    private final List<InvestUnderlyingToken> underlyingToken;
    private final String utilizationRate;
    private final String weeklyRoi;
    private final String yearlyRoi;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestProductDetailResponse() {
        this((List) null, (Long) null, (Long) null, (InvestApyDetailInfo) null, (String) null, (List) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InvestDetailPagePromptInformation) null, (String) null, (List) null, (String) null, (String) null, (Boolean) null, false, 0, (Integer) null, 0L, (String) null, (String) null, false, 0, false, false, (Boolean) null, false, false, (String) null, (String) null, (Integer) null, (List) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 0, (List) null, (String) null, 0, (String) null, 0, 0, (TransactionMethod) null, (String) null, (String) null, (String) null, (TransactionMethod) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 0, (BTCMode) null, false, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (String) null, (String) null, (String) null, (List) null, (StakingProgress) null, -1, -1, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestProductDetailResponse copy$default(InvestProductDetailResponse investProductDetailResponse, List list, Long l, Long l2, InvestApyDetailInfo investApyDetailInfo, String str, List list2, Long l3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str10, List list3, String str11, String str12, Boolean bool, boolean z, int i, Integer num, long j, String str13, String str14, boolean z2, int i2, boolean z3, boolean z4, Boolean bool2, boolean z5, boolean z6, String str15, String str16, Integer num2, List list4, String str17, Integer num3, String str18, String str19, String str20, String str21, Long l4, String str22, String str23, String str24, String str25, Integer num4, int i3, List list5, String str26, int i4, String str27, int i5, int i6, TransactionMethod transactionMethod, String str28, String str29, String str30, TransactionMethod transactionMethod2, List list6, List list7, String str31, String str32, List list8, String str33, String str34, String str35, long j2, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool3, int i7, BTCMode bTCMode, boolean z7, String str42, Boolean bool4, Boolean bool5, Boolean bool6, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, String str43, String str44, String str45, List list9, StakingProgress stakingProgress, int i8, int i9, int i10, Object obj) {
        List list10 = (i8 & 1) != 0 ? investProductDetailResponse.aboutToken : list;
        Long l5 = (i8 & 2) != 0 ? investProductDetailResponse.aggregateInvestmentId : l;
        Long l6 = (i8 & 4) != 0 ? investProductDetailResponse.analysisPlatformId : l2;
        InvestApyDetailInfo investApyDetailInfo2 = (i8 & 8) != 0 ? investProductDetailResponse.apyDetailInfo : investApyDetailInfo;
        String str46 = (i8 & 16) != 0 ? investProductDetailResponse.baseRate : str;
        List list11 = (i8 & 32) != 0 ? investProductDetailResponse.bottomRightLogoList : list2;
        Long l7 = (i8 & 64) != 0 ? investProductDetailResponse.chainId : l3;
        String str47 = (i8 & 128) != 0 ? investProductDetailResponse.claimedTimes : str2;
        String str48 = (i8 & 256) != 0 ? investProductDetailResponse.contract : str3;
        String str49 = (i8 & 512) != 0 ? investProductDetailResponse.currentPrice : str4;
        String str50 = (i8 & 1024) != 0 ? investProductDetailResponse.dailyRoi : str5;
        return investProductDetailResponse.copy(list10, l5, l6, investApyDetailInfo2, str46, list11, l7, str47, str48, str49, str50, (i8 & 2048) != 0 ? investProductDetailResponse.deployAddress : str6, (i8 & 4096) != 0 ? investProductDetailResponse.deployAddressUrl : str7, (i8 & 8192) != 0 ? investProductDetailResponse.deployTime : str8, (i8 & 16384) != 0 ? investProductDetailResponse.depositors : str9, (i8 & 32768) != 0 ? investProductDetailResponse.detailPagePromptInformation : investDetailPagePromptInformation, (i8 & 65536) != 0 ? investProductDetailResponse.distributionAmount : str10, (i8 & 131072) != 0 ? investProductDetailResponse.earnedToken : list3, (i8 & 262144) != 0 ? investProductDetailResponse.estRewardEnd : str11, (i8 & 524288) != 0 ? investProductDetailResponse.feeRate : str12, (i8 & 1048576) != 0 ? investProductDetailResponse.hasBonus : bool, (i8 & 2097152) != 0 ? investProductDetailResponse.hasTvlChart : z, (i8 & 4194304) != 0 ? investProductDetailResponse.investType : i, (i8 & 8388608) != 0 ? investProductDetailResponse.investmentCategory : num, (i8 & 16777216) != 0 ? investProductDetailResponse.investmentId : j, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investProductDetailResponse.investmentName : str13, (67108864 & i8) != 0 ? investProductDetailResponse.investmentShowName : str14, (i8 & 134217728) != 0 ? investProductDetailResponse.isBatchClaim : z2, (i8 & 268435456) != 0 ? investProductDetailResponse.isExistTradingFee : i2, (i8 & 536870912) != 0 ? investProductDetailResponse.isInternal : z3, (i8 & 1073741824) != 0 ? investProductDetailResponse.isInvestable : z4, (i8 & Integer.MIN_VALUE) != 0 ? investProductDetailResponse.isLosslessRateTip : bool2, (i9 & 1) != 0 ? investProductDetailResponse.isNeedIdentityVerify : z5, (i9 & 2) != 0 ? investProductDetailResponse.isSupportRedeem : z6, (i9 & 4) != 0 ? investProductDetailResponse.kind : str15, (i9 & 8) != 0 ? investProductDetailResponse.losslessRate : str16, (i9 & 16) != 0 ? investProductDetailResponse.losslessRateType : num2, (i9 & 32) != 0 ? investProductDetailResponse.middleLogoList : list4, (i9 & 64) != 0 ? investProductDetailResponse.mintedAmount : str17, (i9 & 128) != 0 ? investProductDetailResponse.mode : num3, (i9 & 256) != 0 ? investProductDetailResponse.monthlyRoi : str18, (i9 & 512) != 0 ? investProductDetailResponse.network : str19, (i9 & 1024) != 0 ? investProductDetailResponse.networkLogo : str20, (i9 & 2048) != 0 ? investProductDetailResponse.nickname : str21, (i9 & 4096) != 0 ? investProductDetailResponse.platformId : l4, (i9 & 8192) != 0 ? investProductDetailResponse.platformLogo : str22, (i9 & 16384) != 0 ? investProductDetailResponse.platformName : str23, (i9 & 32768) != 0 ? investProductDetailResponse.poolId : str24, (i9 & 65536) != 0 ? investProductDetailResponse.poolName : str25, (i9 & 131072) != 0 ? investProductDetailResponse.poolStatus : num4, (i9 & 262144) != 0 ? investProductDetailResponse.poolVersion : i3, (i9 & 524288) != 0 ? investProductDetailResponse.qaList : list5, (i9 & 1048576) != 0 ? investProductDetailResponse.rate : str26, (i9 & 2097152) != 0 ? investProductDetailResponse.rateType : i4, (i9 & 4194304) != 0 ? investProductDetailResponse.rateTypeDesc : str27, (i9 & 8388608) != 0 ? investProductDetailResponse.recommendRedeemMethod : i5, (i9 & 16777216) != 0 ? investProductDetailResponse.recommendSubscriptionMethod : i6, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investProductDetailResponse.redeemMethod : transactionMethod, (i9 & 67108864) != 0 ? investProductDetailResponse.remainAmount : str28, (i9 & 134217728) != 0 ? investProductDetailResponse.sourcePlatformName : str29, (i9 & 268435456) != 0 ? investProductDetailResponse.subTitle : str30, (i9 & 536870912) != 0 ? investProductDetailResponse.subscriptionMethod : transactionMethod2, (i9 & 1073741824) != 0 ? investProductDetailResponse.topLeftLogoList : list6, (i9 & Integer.MIN_VALUE) != 0 ? investProductDetailResponse.topRightLogoList : list7, (i10 & 1) != 0 ? investProductDetailResponse.tvl : str31, (i10 & 2) != 0 ? investProductDetailResponse.unableRedeemReason : str32, (i10 & 4) != 0 ? investProductDetailResponse.underlyingToken : list8, (i10 & 8) != 0 ? investProductDetailResponse.utilizationRate : str33, (i10 & 16) != 0 ? investProductDetailResponse.weeklyRoi : str34, (i10 & 32) != 0 ? investProductDetailResponse.yearlyRoi : str35, (i10 & 64) != 0 ? investProductDetailResponse.sourceInvestmentId : j2, (i10 & 128) != 0 ? investProductDetailResponse.shareUrl : str36, (i10 & 256) != 0 ? investProductDetailResponse.deeplink : str37, (i10 & 512) != 0 ? investProductDetailResponse.maturityTime : str38, (i10 & 1024) != 0 ? investProductDetailResponse.activeInvestmentId : str39, (i10 & 2048) != 0 ? investProductDetailResponse.platformUrl : str40, (i10 & 4096) != 0 ? investProductDetailResponse.liquidationRatio : str41, (i10 & 8192) != 0 ? investProductDetailResponse.isPoolWithFarmReward : bool3, (i10 & 16384) != 0 ? investProductDetailResponse.pointTag : i7, (i10 & 32768) != 0 ? investProductDetailResponse.btcMode : bTCMode, (i10 & 65536) != 0 ? investProductDetailResponse.protocolIpRestrict : z7, (i10 & 131072) != 0 ? investProductDetailResponse.investmentClassify : str42, (i10 & 262144) != 0 ? investProductDetailResponse.hasRateChart : bool4, (i10 & 524288) != 0 ? investProductDetailResponse.hasRate : bool5, (i10 & 1048576) != 0 ? investProductDetailResponse.hasRatePerformance : bool6, (i10 & 2097152) != 0 ? investProductDetailResponse.earnedTokenInfo : investTipInfoVo, (i10 & 4194304) != 0 ? investProductDetailResponse.stakePeriodInfo : investTipInfoVo2, (i10 & 8388608) != 0 ? investProductDetailResponse.supportAddressInfo : investTipInfoVo3, (i10 & 16777216) != 0 ? investProductDetailResponse.poolCapacity : str43, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investProductDetailResponse.totalPoolCapacity : str44, (i10 & 67108864) != 0 ? investProductDetailResponse.currentPoolCapacity : str45, (i10 & 134217728) != 0 ? investProductDetailResponse.supportedBTCAddressType : list9, (i10 & 268435456) != 0 ? investProductDetailResponse.stakingProgress : stakingProgress);
    }

    @SerialName("btcMode")
    public static /* synthetic */ void getBtcMode$annotations() {
    }

    @SerialName("deeplink")
    public static /* synthetic */ void getDeeplink$annotations() {
    }

    @SerialName("investmentClassify")
    public static /* synthetic */ void getInvestmentClassify$annotations() {
    }

    @SerialName("pointTag")
    public static /* synthetic */ void getPointTag$annotations() {
    }

    @SerialName("protocolIpRestrict")
    public static /* synthetic */ void getProtocolIpRestrict$annotations() {
    }

    @SerialName("shareUrl")
    public static /* synthetic */ void getShareUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithMarketCap> component1() {
        return this.aboutToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.dailyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.deployAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.deployAddressUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.deployTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.depositors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation component16() {
        return this.detailPagePromptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.distributionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> component18() {
        return this.earnedToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.estRewardEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.hasTvlChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component25() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.isBatchClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.isExistTradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.isInvestable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component32() {
        return this.isLosslessRateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.isNeedIdentityVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isSupportRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.losslessRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.losslessRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component38() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.mintedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestApyDetailInfo component4() {
        return this.apyDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.monthlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component45() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.poolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component50() {
        return this.poolStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component51() {
        return this.poolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestQaVo> component52() {
        return this.qaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component54() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component56() {
        return this.recommendRedeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component57() {
        return this.recommendSubscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod component58() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component6() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.sourcePlatformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod component62() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component63() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component64() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.unableRedeemReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> component67() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.utilizationRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.weeklyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.yearlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component71() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.activeInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.liquidationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component78() {
        return this.isPoolWithFarmReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component79() {
        return this.pointTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.claimedTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode component80() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component81() {
        return this.protocolIpRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component83() {
        return this.hasRateChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component84() {
        return this.hasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component85() {
        return this.hasRatePerformance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component86() {
        return this.earnedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component87() {
        return this.stakePeriodInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component88() {
        return this.supportAddressInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component89() {
        return this.poolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.totalPoolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.currentPoolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component92() {
        return this.supportedBTCAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StakingProgress component93() {
        return this.stakingProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestProductDetailResponse copy(@NotNull List<InvestTokenWithMarketCap> list, Long l, Long l2, InvestApyDetailInfo investApyDetailInfo, String str, @NotNull List<InvestLogoBaseVo> list2, Long l3, String str2, String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str10, @NotNull List<InvestUnderlyingToken> list3, String str11, String str12, Boolean bool, boolean z, int i, Integer num, long j, @NotNull String str13, String str14, boolean z2, int i2, boolean z3, boolean z4, Boolean bool2, boolean z5, boolean z6, @NotNull String str15, String str16, Integer num2, @NotNull List<InvestLogoBaseVo> list4, String str17, Integer num3, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, Long l4, @NotNull String str22, @NotNull String str23, String str24, String str25, Integer num4, int i3, @NotNull List<InvestQaVo> list5, @NotNull String str26, int i4, @NotNull String str27, int i5, int i6, @NotNull TransactionMethod transactionMethod, String str28, @NotNull String str29, String str30, @NotNull TransactionMethod transactionMethod2, @NotNull List<InvestLogoBaseVo> list6, @NotNull List<InvestLogoBaseVo> list7, @NotNull String str31, @NotNull String str32, @NotNull List<InvestUnderlyingToken> list8, @NotNull String str33, @NotNull String str34, @NotNull String str35, long j2, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool3, int i7, @NotNull BTCMode bTCMode, boolean z7, @NotNull String str42, Boolean bool4, Boolean bool5, Boolean bool6, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, String str43, String str44, String str45, @NotNull List<Integer> list9, StakingProgress stakingProgress) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(transactionMethod2, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(bTCMode, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(list9, "");
        return new InvestProductDetailResponse(list, l, l2, investApyDetailInfo, str, list2, l3, str2, str3, str4, str5, str6, str7, str8, str9, investDetailPagePromptInformation, str10, list3, str11, str12, bool, z, i, num, j, str13, str14, z2, i2, z3, z4, bool2, z5, z6, str15, str16, num2, list4, str17, num3, str18, str19, str20, str21, l4, str22, str23, str24, str25, num4, i3, list5, str26, i4, str27, i5, i6, transactionMethod, str28, str29, str30, transactionMethod2, list6, list7, str31, str32, list8, str33, str34, str35, j2, str36, str37, str38, str39, str40, str41, bool3, i7, bTCMode, z7, str42, bool4, bool5, bool6, investTipInfoVo, investTipInfoVo2, investTipInfoVo3, str43, str44, str45, list9, stakingProgress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestProductDetailResponse)) {
            return false;
        }
        InvestProductDetailResponse investProductDetailResponse = (InvestProductDetailResponse) obj;
        return Intrinsics.EZpvd(this.aboutToken, investProductDetailResponse.aboutToken) && Intrinsics.EZpvd(this.aggregateInvestmentId, investProductDetailResponse.aggregateInvestmentId) && Intrinsics.EZpvd(this.analysisPlatformId, investProductDetailResponse.analysisPlatformId) && Intrinsics.EZpvd(this.apyDetailInfo, investProductDetailResponse.apyDetailInfo) && Intrinsics.EZpvd((Object) this.baseRate, (Object) investProductDetailResponse.baseRate) && Intrinsics.EZpvd(this.bottomRightLogoList, investProductDetailResponse.bottomRightLogoList) && Intrinsics.EZpvd(this.chainId, investProductDetailResponse.chainId) && Intrinsics.EZpvd((Object) this.claimedTimes, (Object) investProductDetailResponse.claimedTimes) && Intrinsics.EZpvd((Object) this.contract, (Object) investProductDetailResponse.contract) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investProductDetailResponse.currentPrice) && Intrinsics.EZpvd((Object) this.dailyRoi, (Object) investProductDetailResponse.dailyRoi) && Intrinsics.EZpvd((Object) this.deployAddress, (Object) investProductDetailResponse.deployAddress) && Intrinsics.EZpvd((Object) this.deployAddressUrl, (Object) investProductDetailResponse.deployAddressUrl) && Intrinsics.EZpvd((Object) this.deployTime, (Object) investProductDetailResponse.deployTime) && Intrinsics.EZpvd((Object) this.depositors, (Object) investProductDetailResponse.depositors) && Intrinsics.EZpvd(this.detailPagePromptInformation, investProductDetailResponse.detailPagePromptInformation) && Intrinsics.EZpvd((Object) this.distributionAmount, (Object) investProductDetailResponse.distributionAmount) && Intrinsics.EZpvd(this.earnedToken, investProductDetailResponse.earnedToken) && Intrinsics.EZpvd((Object) this.estRewardEnd, (Object) investProductDetailResponse.estRewardEnd) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investProductDetailResponse.feeRate) && Intrinsics.EZpvd(this.hasBonus, investProductDetailResponse.hasBonus) && this.hasTvlChart == investProductDetailResponse.hasTvlChart && this.investType == investProductDetailResponse.investType && Intrinsics.EZpvd(this.investmentCategory, investProductDetailResponse.investmentCategory) && this.investmentId == investProductDetailResponse.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investProductDetailResponse.investmentName) && Intrinsics.EZpvd((Object) this.investmentShowName, (Object) investProductDetailResponse.investmentShowName) && this.isBatchClaim == investProductDetailResponse.isBatchClaim && this.isExistTradingFee == investProductDetailResponse.isExistTradingFee && this.isInternal == investProductDetailResponse.isInternal && this.isInvestable == investProductDetailResponse.isInvestable && Intrinsics.EZpvd(this.isLosslessRateTip, investProductDetailResponse.isLosslessRateTip) && this.isNeedIdentityVerify == investProductDetailResponse.isNeedIdentityVerify && this.isSupportRedeem == investProductDetailResponse.isSupportRedeem && Intrinsics.EZpvd((Object) this.kind, (Object) investProductDetailResponse.kind) && Intrinsics.EZpvd((Object) this.losslessRate, (Object) investProductDetailResponse.losslessRate) && Intrinsics.EZpvd(this.losslessRateType, investProductDetailResponse.losslessRateType) && Intrinsics.EZpvd(this.middleLogoList, investProductDetailResponse.middleLogoList) && Intrinsics.EZpvd((Object) this.mintedAmount, (Object) investProductDetailResponse.mintedAmount) && Intrinsics.EZpvd(this.mode, investProductDetailResponse.mode) && Intrinsics.EZpvd((Object) this.monthlyRoi, (Object) investProductDetailResponse.monthlyRoi) && Intrinsics.EZpvd((Object) this.network, (Object) investProductDetailResponse.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investProductDetailResponse.networkLogo) && Intrinsics.EZpvd((Object) this.nickname, (Object) investProductDetailResponse.nickname) && Intrinsics.EZpvd(this.platformId, investProductDetailResponse.platformId) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investProductDetailResponse.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investProductDetailResponse.platformName) && Intrinsics.EZpvd((Object) this.poolId, (Object) investProductDetailResponse.poolId) && Intrinsics.EZpvd((Object) this.poolName, (Object) investProductDetailResponse.poolName) && Intrinsics.EZpvd(this.poolStatus, investProductDetailResponse.poolStatus) && this.poolVersion == investProductDetailResponse.poolVersion && Intrinsics.EZpvd(this.qaList, investProductDetailResponse.qaList) && Intrinsics.EZpvd((Object) this.rate, (Object) investProductDetailResponse.rate) && this.rateType == investProductDetailResponse.rateType && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) investProductDetailResponse.rateTypeDesc) && this.recommendRedeemMethod == investProductDetailResponse.recommendRedeemMethod && this.recommendSubscriptionMethod == investProductDetailResponse.recommendSubscriptionMethod && this.redeemMethod == investProductDetailResponse.redeemMethod && Intrinsics.EZpvd((Object) this.remainAmount, (Object) investProductDetailResponse.remainAmount) && Intrinsics.EZpvd((Object) this.sourcePlatformName, (Object) investProductDetailResponse.sourcePlatformName) && Intrinsics.EZpvd((Object) this.subTitle, (Object) investProductDetailResponse.subTitle) && this.subscriptionMethod == investProductDetailResponse.subscriptionMethod && Intrinsics.EZpvd(this.topLeftLogoList, investProductDetailResponse.topLeftLogoList) && Intrinsics.EZpvd(this.topRightLogoList, investProductDetailResponse.topRightLogoList) && Intrinsics.EZpvd((Object) this.tvl, (Object) investProductDetailResponse.tvl) && Intrinsics.EZpvd((Object) this.unableRedeemReason, (Object) investProductDetailResponse.unableRedeemReason) && Intrinsics.EZpvd(this.underlyingToken, investProductDetailResponse.underlyingToken) && Intrinsics.EZpvd((Object) this.utilizationRate, (Object) investProductDetailResponse.utilizationRate) && Intrinsics.EZpvd((Object) this.weeklyRoi, (Object) investProductDetailResponse.weeklyRoi) && Intrinsics.EZpvd((Object) this.yearlyRoi, (Object) investProductDetailResponse.yearlyRoi) && this.sourceInvestmentId == investProductDetailResponse.sourceInvestmentId && Intrinsics.EZpvd((Object) this.shareUrl, (Object) investProductDetailResponse.shareUrl) && Intrinsics.EZpvd((Object) this.deeplink, (Object) investProductDetailResponse.deeplink) && Intrinsics.EZpvd((Object) this.maturityTime, (Object) investProductDetailResponse.maturityTime) && Intrinsics.EZpvd((Object) this.activeInvestmentId, (Object) investProductDetailResponse.activeInvestmentId) && Intrinsics.EZpvd((Object) this.platformUrl, (Object) investProductDetailResponse.platformUrl) && Intrinsics.EZpvd((Object) this.liquidationRatio, (Object) investProductDetailResponse.liquidationRatio) && Intrinsics.EZpvd(this.isPoolWithFarmReward, investProductDetailResponse.isPoolWithFarmReward) && this.pointTag == investProductDetailResponse.pointTag && this.btcMode == investProductDetailResponse.btcMode && this.protocolIpRestrict == investProductDetailResponse.protocolIpRestrict && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investProductDetailResponse.investmentClassify) && Intrinsics.EZpvd(this.hasRateChart, investProductDetailResponse.hasRateChart) && Intrinsics.EZpvd(this.hasRate, investProductDetailResponse.hasRate) && Intrinsics.EZpvd(this.hasRatePerformance, investProductDetailResponse.hasRatePerformance) && Intrinsics.EZpvd(this.earnedTokenInfo, investProductDetailResponse.earnedTokenInfo) && Intrinsics.EZpvd(this.stakePeriodInfo, investProductDetailResponse.stakePeriodInfo) && Intrinsics.EZpvd(this.supportAddressInfo, investProductDetailResponse.supportAddressInfo) && Intrinsics.EZpvd((Object) this.poolCapacity, (Object) investProductDetailResponse.poolCapacity) && Intrinsics.EZpvd((Object) this.totalPoolCapacity, (Object) investProductDetailResponse.totalPoolCapacity) && Intrinsics.EZpvd((Object) this.currentPoolCapacity, (Object) investProductDetailResponse.currentPoolCapacity) && Intrinsics.EZpvd(this.supportedBTCAddressType, investProductDetailResponse.supportedBTCAddressType) && this.stakingProgress == investProductDetailResponse.stakingProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithMarketCap> getAboutToken() {
        return this.aboutToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveInvestmentId() {
        return this.activeInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAggregateInvestmentId() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestApyDetailInfo getApyDetailInfo() {
        return this.apyDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseRate() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode getBtcMode() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClaimedTimes() {
        return this.claimedTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPoolCapacity() {
        return this.currentPoolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyRoi() {
        return this.dailyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeployAddress() {
        return this.deployAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeployAddressUrl() {
        return this.deployAddressUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeployTime() {
        return this.deployTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositors() {
        return this.depositors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation getDetailPagePromptInformation() {
        return this.detailPagePromptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDistributionAmount() {
        return this.distributionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> getEarnedToken() {
        return this.earnedToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getEarnedTokenInfo() {
        return this.earnedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstRewardEnd() {
        return this.estRewardEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasBonus() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasRate() {
        return this.hasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasRateChart() {
        return this.hasRateChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasRatePerformance() {
        return this.hasRatePerformance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasTvlChart() {
        return this.hasTvlChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentClassify() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentShowName() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKind() {
        return this.kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidationRatio() {
        return this.liquidationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLosslessRate() {
        return this.losslessRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLosslessRateType() {
        return this.losslessRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaturityTime() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMintedAmount() {
        return this.mintedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMonthlyRoi() {
        return this.monthlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPlatformId() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformUrl() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPointTag() {
        return this.pointTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolCapacity() {
        return this.poolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolName() {
        return this.poolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPoolStatus() {
        return this.poolStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPoolVersion() {
        return this.poolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getProtocolIpRestrict() {
        return this.protocolIpRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestQaVo> getQaList() {
        return this.qaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecommendRedeemMethod() {
        return this.recommendRedeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecommendSubscriptionMethod() {
        return this.recommendSubscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod getRedeemMethod() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainAmount() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSourceInvestmentId() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePlatformName() {
        return this.sourcePlatformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getStakePeriodInfo() {
        return this.stakePeriodInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StakingProgress getStakingProgress() {
        return this.stakingProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionMethod getSubscriptionMethod() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getSupportAddressInfo() {
        return this.supportAddressInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSupportedBTCAddressType() {
        return this.supportedBTCAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPoolCapacity() {
        return this.totalPoolCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnableRedeemReason() {
        return this.unableRedeemReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> getUnderlyingToken() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtilizationRate() {
        return this.utilizationRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeeklyRoi() {
        return this.weeklyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearlyRoi() {
        return this.yearlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.aboutToken.hashCode();
        Long l = this.aggregateInvestmentId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.analysisPlatformId;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        InvestApyDetailInfo investApyDetailInfo = this.apyDetailInfo;
        int iHashCode5 = investApyDetailInfo == null ? 0 : investApyDetailInfo.hashCode();
        String str = this.baseRate;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.bottomRightLogoList.hashCode();
        Long l3 = this.chainId;
        int iHashCode8 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.claimedTimes;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contract;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currentPrice;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        int iHashCode12 = this.dailyRoi.hashCode();
        String str5 = this.deployAddress;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.deployAddressUrl;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deployTime;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.depositors;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        InvestDetailPagePromptInformation investDetailPagePromptInformation = this.detailPagePromptInformation;
        int iHashCode17 = investDetailPagePromptInformation == null ? 0 : investDetailPagePromptInformation.hashCode();
        String str9 = this.distributionAmount;
        int iHashCode18 = str9 == null ? 0 : str9.hashCode();
        int iHashCode19 = this.earnedToken.hashCode();
        String str10 = this.estRewardEnd;
        int iHashCode20 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.feeRate;
        int iHashCode21 = str11 == null ? 0 : str11.hashCode();
        Boolean bool = this.hasBonus;
        int iHashCode22 = bool == null ? 0 : bool.hashCode();
        int iHashCode23 = Boolean.hashCode(this.hasTvlChart);
        int iHashCode24 = Integer.hashCode(this.investType);
        Integer num = this.investmentCategory;
        if (num == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode25 = Long.hashCode(this.investmentId);
        int iHashCode26 = this.investmentName.hashCode();
        String str12 = this.investmentShowName;
        int iHashCode27 = str12 == null ? 0 : str12.hashCode();
        int iHashCode28 = Boolean.hashCode(this.isBatchClaim);
        int iHashCode29 = Integer.hashCode(this.isExistTradingFee);
        int iHashCode30 = Boolean.hashCode(this.isInternal);
        int iHashCode31 = Boolean.hashCode(this.isInvestable);
        Boolean bool2 = this.isLosslessRateTip;
        int iHashCode32 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode33 = Boolean.hashCode(this.isNeedIdentityVerify);
        int iHashCode34 = Boolean.hashCode(this.isSupportRedeem);
        int iHashCode35 = this.kind.hashCode();
        String str13 = this.losslessRate;
        int iHashCode36 = str13 == null ? 0 : str13.hashCode();
        Integer num2 = this.losslessRateType;
        int iHashCode37 = num2 == null ? 0 : num2.hashCode();
        int iHashCode38 = this.middleLogoList.hashCode();
        String str14 = this.mintedAmount;
        int iHashCode39 = str14 == null ? 0 : str14.hashCode();
        Integer num3 = this.mode;
        int iHashCode40 = num3 == null ? 0 : num3.hashCode();
        int iHashCode41 = this.monthlyRoi.hashCode();
        int iHashCode42 = this.network.hashCode();
        int iHashCode43 = this.networkLogo.hashCode();
        int iHashCode44 = this.nickname.hashCode();
        Long l4 = this.platformId;
        int iHashCode45 = l4 == null ? 0 : l4.hashCode();
        int iHashCode46 = this.platformLogo.hashCode();
        int iHashCode47 = this.platformName.hashCode();
        String str15 = this.poolId;
        int iHashCode48 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.poolName;
        int iHashCode49 = str16 == null ? 0 : str16.hashCode();
        Integer num4 = this.poolStatus;
        int iHashCode50 = num4 == null ? 0 : num4.hashCode();
        int iHashCode51 = Integer.hashCode(this.poolVersion);
        int iHashCode52 = this.qaList.hashCode();
        int iHashCode53 = this.rate.hashCode();
        int iHashCode54 = Integer.hashCode(this.rateType);
        int iHashCode55 = this.rateTypeDesc.hashCode();
        int iHashCode56 = Integer.hashCode(this.recommendRedeemMethod);
        int iHashCode57 = Integer.hashCode(this.recommendSubscriptionMethod);
        int iHashCode58 = this.redeemMethod.hashCode();
        String str17 = this.remainAmount;
        int iHashCode59 = str17 == null ? 0 : str17.hashCode();
        int iHashCode60 = this.sourcePlatformName.hashCode();
        String str18 = this.subTitle;
        int iHashCode61 = str18 == null ? 0 : str18.hashCode();
        int iHashCode62 = this.subscriptionMethod.hashCode();
        int iHashCode63 = this.topLeftLogoList.hashCode();
        int iHashCode64 = this.topRightLogoList.hashCode();
        int iHashCode65 = this.tvl.hashCode();
        int iHashCode66 = this.unableRedeemReason.hashCode();
        int iHashCode67 = this.underlyingToken.hashCode();
        int iHashCode68 = this.utilizationRate.hashCode();
        int iHashCode69 = this.weeklyRoi.hashCode();
        int iHashCode70 = this.yearlyRoi.hashCode();
        int iHashCode71 = Long.hashCode(this.sourceInvestmentId);
        String str19 = this.shareUrl;
        int iHashCode72 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.deeplink;
        int iHashCode73 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.maturityTime;
        int iHashCode74 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.activeInvestmentId;
        int iHashCode75 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.platformUrl;
        int iHashCode76 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.liquidationRatio;
        int iHashCode77 = str24 == null ? 0 : str24.hashCode();
        Boolean bool3 = this.isPoolWithFarmReward;
        int iHashCode78 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode79 = Integer.hashCode(this.pointTag);
        int iHashCode80 = this.btcMode.hashCode();
        int iHashCode81 = Boolean.hashCode(this.protocolIpRestrict);
        int iHashCode82 = this.investmentClassify.hashCode();
        Boolean bool4 = this.hasRateChart;
        int iHashCode83 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.hasRate;
        int iHashCode84 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.hasRatePerformance;
        int iHashCode85 = bool6 == null ? 0 : bool6.hashCode();
        InvestTipInfoVo investTipInfoVo = this.earnedTokenInfo;
        int iHashCode86 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.stakePeriodInfo;
        int iHashCode87 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestTipInfoVo investTipInfoVo3 = this.supportAddressInfo;
        int iHashCode88 = investTipInfoVo3 == null ? 0 : investTipInfoVo3.hashCode();
        String str25 = this.poolCapacity;
        int iHashCode89 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.totalPoolCapacity;
        int iHashCode90 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.currentPoolCapacity;
        int iHashCode91 = str27 == null ? 0 : str27.hashCode();
        int iHashCode92 = this.supportedBTCAddressType.hashCode();
        StakingProgress stakingProgress = this.stakingProgress;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + (stakingProgress == null ? 0 : stakingProgress.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBatchClaim() {
        return this.isBatchClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isExistTradingFee() {
        return this.isExistTradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInternal() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInvestable() {
        return this.isInvestable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isLosslessRateTip() {
        return this.isLosslessRateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedIdentityVerify() {
        return this.isNeedIdentityVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPoolWithFarmReward() {
        return this.isPoolWithFarmReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportRedeem() {
        return this.isSupportRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestProductDetailResponse(aboutToken=" + this.aboutToken + ", aggregateInvestmentId=" + this.aggregateInvestmentId + ", analysisPlatformId=" + this.analysisPlatformId + ", apyDetailInfo=" + this.apyDetailInfo + ", baseRate=" + this.baseRate + ", bottomRightLogoList=" + this.bottomRightLogoList + ", chainId=" + this.chainId + ", claimedTimes=" + this.claimedTimes + ", contract=" + this.contract + ", currentPrice=" + this.currentPrice + ", dailyRoi=" + this.dailyRoi + ", deployAddress=" + this.deployAddress + ", deployAddressUrl=" + this.deployAddressUrl + ", deployTime=" + this.deployTime + ", depositors=" + this.depositors + ", detailPagePromptInformation=" + this.detailPagePromptInformation + ", distributionAmount=" + this.distributionAmount + ", earnedToken=" + this.earnedToken + ", estRewardEnd=" + this.estRewardEnd + ", feeRate=" + this.feeRate + ", hasBonus=" + this.hasBonus + ", hasTvlChart=" + this.hasTvlChart + ", investType=" + this.investType + ", investmentCategory=" + this.investmentCategory + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", investmentShowName=" + this.investmentShowName + ", isBatchClaim=" + this.isBatchClaim + ", isExistTradingFee=" + this.isExistTradingFee + ", isInternal=" + this.isInternal + ", isInvestable=" + this.isInvestable + ", isLosslessRateTip=" + this.isLosslessRateTip + ", isNeedIdentityVerify=" + this.isNeedIdentityVerify + ", isSupportRedeem=" + this.isSupportRedeem + ", kind=" + this.kind + ", losslessRate=" + this.losslessRate + ", losslessRateType=" + this.losslessRateType + ", middleLogoList=" + this.middleLogoList + ", mintedAmount=" + this.mintedAmount + ", mode=" + this.mode + ", monthlyRoi=" + this.monthlyRoi + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", nickname=" + this.nickname + ", platformId=" + this.platformId + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", poolId=" + this.poolId + ", poolName=" + this.poolName + ", poolStatus=" + this.poolStatus + ", poolVersion=" + this.poolVersion + ", qaList=" + this.qaList + ", rate=" + this.rate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", recommendRedeemMethod=" + this.recommendRedeemMethod + ", recommendSubscriptionMethod=" + this.recommendSubscriptionMethod + ", redeemMethod=" + this.redeemMethod + ", remainAmount=" + this.remainAmount + ", sourcePlatformName=" + this.sourcePlatformName + ", subTitle=" + this.subTitle + ", subscriptionMethod=" + this.subscriptionMethod + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ", tvl=" + this.tvl + ", unableRedeemReason=" + this.unableRedeemReason + ", underlyingToken=" + this.underlyingToken + ", utilizationRate=" + this.utilizationRate + ", weeklyRoi=" + this.weeklyRoi + ", yearlyRoi=" + this.yearlyRoi + ", sourceInvestmentId=" + this.sourceInvestmentId + ", shareUrl=" + this.shareUrl + ", deeplink=" + this.deeplink + ", maturityTime=" + this.maturityTime + ", activeInvestmentId=" + this.activeInvestmentId + ", platformUrl=" + this.platformUrl + ", liquidationRatio=" + this.liquidationRatio + ", isPoolWithFarmReward=" + this.isPoolWithFarmReward + ", pointTag=" + this.pointTag + ", btcMode=" + this.btcMode + ", protocolIpRestrict=" + this.protocolIpRestrict + ", investmentClassify=" + this.investmentClassify + ", hasRateChart=" + this.hasRateChart + ", hasRate=" + this.hasRate + ", hasRatePerformance=" + this.hasRatePerformance + ", earnedTokenInfo=" + this.earnedTokenInfo + ", stakePeriodInfo=" + this.stakePeriodInfo + ", supportAddressInfo=" + this.supportAddressInfo + ", poolCapacity=" + this.poolCapacity + ", totalPoolCapacity=" + this.totalPoolCapacity + ", currentPoolCapacity=" + this.currentPoolCapacity + ", supportedBTCAddressType=" + this.supportedBTCAddressType + ", stakingProgress=" + this.stakingProgress + ")";
    }

    public /* synthetic */ InvestProductDetailResponse(int i, int i2, int i3, List list, Long l, Long l2, InvestApyDetailInfo investApyDetailInfo, String str, List list2, Long l3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str10, List list3, String str11, String str12, Boolean bool, boolean z, int i4, Integer num, long j, String str13, String str14, boolean z2, int i5, boolean z3, boolean z4, Boolean bool2, boolean z5, boolean z6, String str15, String str16, Integer num2, List list4, String str17, Integer num3, String str18, String str19, String str20, String str21, Long l4, String str22, String str23, String str24, String str25, Integer num4, int i6, List list5, String str26, int i7, String str27, int i8, int i9, TransactionMethod transactionMethod, String str28, String str29, String str30, TransactionMethod transactionMethod2, List list6, List list7, String str31, String str32, List list8, String str33, String str34, String str35, long j2, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool3, int i10, BTCMode bTCMode, boolean z7, String str42, Boolean bool4, Boolean bool5, Boolean bool6, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, String str43, String str44, String str45, List list9, StakingProgress stakingProgress, SerializationConstructorMarker serializationConstructorMarker) {
        this.aboutToken = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.aggregateInvestmentId = null;
        } else {
            this.aggregateInvestmentId = l;
        }
        if ((i & 4) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l2;
        }
        if ((i & 8) == 0) {
            this.apyDetailInfo = null;
        } else {
            this.apyDetailInfo = investApyDetailInfo;
        }
        if ((i & 16) == 0) {
            this.baseRate = null;
        } else {
            this.baseRate = str;
        }
        this.bottomRightLogoList = (i & 32) == 0 ? new ArrayList() : list2;
        if ((i & 64) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l3;
        }
        if ((i & 128) == 0) {
            this.claimedTimes = null;
        } else {
            this.claimedTimes = str2;
        }
        if ((i & 256) == 0) {
            this.contract = null;
        } else {
            this.contract = str3;
        }
        if ((i & 512) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str4;
        }
        if ((i & 1024) == 0) {
            this.dailyRoi = "";
        } else {
            this.dailyRoi = str5;
        }
        if ((i & 2048) == 0) {
            this.deployAddress = null;
        } else {
            this.deployAddress = str6;
        }
        if ((i & 4096) == 0) {
            this.deployAddressUrl = null;
        } else {
            this.deployAddressUrl = str7;
        }
        if ((i & 8192) == 0) {
            this.deployTime = null;
        } else {
            this.deployTime = str8;
        }
        if ((i & 16384) == 0) {
            this.depositors = null;
        } else {
            this.depositors = str9;
        }
        if ((i & 32768) == 0) {
            this.detailPagePromptInformation = null;
        } else {
            this.detailPagePromptInformation = investDetailPagePromptInformation;
        }
        if ((i & 65536) == 0) {
            this.distributionAmount = null;
        } else {
            this.distributionAmount = str10;
        }
        this.earnedToken = (i & 131072) == 0 ? new ArrayList() : list3;
        if ((i & 262144) == 0) {
            this.estRewardEnd = null;
        } else {
            this.estRewardEnd = str11;
        }
        if ((524288 & i) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str12;
        }
        if ((1048576 & i) == 0) {
            this.hasBonus = null;
        } else {
            this.hasBonus = bool;
        }
        if ((2097152 & i) == 0) {
            this.hasTvlChart = false;
        } else {
            this.hasTvlChart = z;
        }
        if ((4194304 & i) == 0) {
            this.investType = 1;
        } else {
            this.investType = i4;
        }
        if ((8388608 & i) == 0) {
            this.investmentCategory = null;
        } else {
            this.investmentCategory = num;
        }
        this.investmentId = (16777216 & i) == 0 ? 0L : j;
        if ((33554432 & i) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str13;
        }
        if ((67108864 & i) == 0) {
            this.investmentShowName = null;
        } else {
            this.investmentShowName = str14;
        }
        if ((134217728 & i) == 0) {
            this.isBatchClaim = false;
        } else {
            this.isBatchClaim = z2;
        }
        if ((268435456 & i) == 0) {
            this.isExistTradingFee = 0;
        } else {
            this.isExistTradingFee = i5;
        }
        if ((536870912 & i) == 0) {
            this.isInternal = true;
        } else {
            this.isInternal = z3;
        }
        if ((1073741824 & i) == 0) {
            this.isInvestable = true;
        } else {
            this.isInvestable = z4;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isLosslessRateTip = null;
        } else {
            this.isLosslessRateTip = bool2;
        }
        if ((i2 & 1) == 0) {
            this.isNeedIdentityVerify = false;
        } else {
            this.isNeedIdentityVerify = z5;
        }
        if ((i2 & 2) == 0) {
            this.isSupportRedeem = true;
        } else {
            this.isSupportRedeem = z6;
        }
        if ((i2 & 4) == 0) {
            this.kind = "";
        } else {
            this.kind = str15;
        }
        if ((i2 & 8) == 0) {
            this.losslessRate = null;
        } else {
            this.losslessRate = str16;
        }
        if ((i2 & 16) == 0) {
            this.losslessRateType = null;
        } else {
            this.losslessRateType = num2;
        }
        this.middleLogoList = (i2 & 32) == 0 ? new ArrayList() : list4;
        if ((i2 & 64) == 0) {
            this.mintedAmount = null;
        } else {
            this.mintedAmount = str17;
        }
        if ((i2 & 128) == 0) {
            this.mode = null;
        } else {
            this.mode = num3;
        }
        if ((i2 & 256) == 0) {
            this.monthlyRoi = "";
        } else {
            this.monthlyRoi = str18;
        }
        if ((i2 & 512) == 0) {
            this.network = "";
        } else {
            this.network = str19;
        }
        if ((i2 & 1024) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str20;
        }
        if ((i2 & 2048) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str21;
        }
        if ((i2 & 4096) == 0) {
            this.platformId = null;
        } else {
            this.platformId = l4;
        }
        if ((i2 & 8192) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str22;
        }
        if ((i2 & 16384) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str23;
        }
        if ((i2 & 32768) == 0) {
            this.poolId = null;
        } else {
            this.poolId = str24;
        }
        if ((i2 & 65536) == 0) {
            this.poolName = null;
        } else {
            this.poolName = str25;
        }
        if ((i2 & 131072) == 0) {
            this.poolStatus = null;
        } else {
            this.poolStatus = num4;
        }
        if ((i2 & 262144) == 0) {
            this.poolVersion = 0;
        } else {
            this.poolVersion = i6;
        }
        this.qaList = (524288 & i2) == 0 ? new ArrayList() : list5;
        if ((1048576 & i2) == 0) {
            this.rate = "";
        } else {
            this.rate = str26;
        }
        this.rateType = (2097152 & i2) == 0 ? ApyHeaderType.APY.getValue() : i7;
        if ((4194304 & i2) == 0) {
            this.rateTypeDesc = "";
        } else {
            this.rateTypeDesc = str27;
        }
        if ((8388608 & i2) == 0) {
            this.recommendRedeemMethod = 0;
        } else {
            this.recommendRedeemMethod = i8;
        }
        if ((16777216 & i2) == 0) {
            this.recommendSubscriptionMethod = 0;
        } else {
            this.recommendSubscriptionMethod = i9;
        }
        this.redeemMethod = (33554432 & i2) == 0 ? TransactionMethod.SINGLE : transactionMethod;
        if ((67108864 & i2) == 0) {
            this.remainAmount = null;
        } else {
            this.remainAmount = str28;
        }
        if ((134217728 & i2) == 0) {
            this.sourcePlatformName = "";
        } else {
            this.sourcePlatformName = str29;
        }
        if ((268435456 & i2) == 0) {
            this.subTitle = null;
        } else {
            this.subTitle = str30;
        }
        this.subscriptionMethod = (536870912 & i2) == 0 ? TransactionMethod.SINGLE : transactionMethod2;
        this.topLeftLogoList = (1073741824 & i2) == 0 ? new ArrayList() : list6;
        this.topRightLogoList = (Integer.MIN_VALUE & i2) == 0 ? new ArrayList() : list7;
        if ((i3 & 1) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str31;
        }
        if ((i3 & 2) == 0) {
            this.unableRedeemReason = "";
        } else {
            this.unableRedeemReason = str32;
        }
        this.underlyingToken = (i3 & 4) == 0 ? new ArrayList() : list8;
        if ((i3 & 8) == 0) {
            this.utilizationRate = "";
        } else {
            this.utilizationRate = str33;
        }
        if ((i3 & 16) == 0) {
            this.weeklyRoi = "";
        } else {
            this.weeklyRoi = str34;
        }
        if ((i3 & 32) == 0) {
            this.yearlyRoi = "";
        } else {
            this.yearlyRoi = str35;
        }
        this.sourceInvestmentId = (i3 & 64) == 0 ? 0L : j2;
        if ((i3 & 128) == 0) {
            this.shareUrl = null;
        } else {
            this.shareUrl = str36;
        }
        if ((i3 & 256) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str37;
        }
        if ((i3 & 512) == 0) {
            this.maturityTime = null;
        } else {
            this.maturityTime = str38;
        }
        if ((i3 & 1024) == 0) {
            this.activeInvestmentId = null;
        } else {
            this.activeInvestmentId = str39;
        }
        if ((i3 & 2048) == 0) {
            this.platformUrl = null;
        } else {
            this.platformUrl = str40;
        }
        if ((i3 & 4096) == 0) {
            this.liquidationRatio = null;
        } else {
            this.liquidationRatio = str41;
        }
        if ((i3 & 8192) == 0) {
            this.isPoolWithFarmReward = null;
        } else {
            this.isPoolWithFarmReward = bool3;
        }
        if ((i3 & 16384) == 0) {
            this.pointTag = 0;
        } else {
            this.pointTag = i10;
        }
        this.btcMode = (i3 & 32768) == 0 ? BTCMode.DEFAULT : bTCMode;
        if ((i3 & 65536) == 0) {
            this.protocolIpRestrict = false;
        } else {
            this.protocolIpRestrict = z7;
        }
        if ((i3 & 131072) == 0) {
            this.investmentClassify = "";
        } else {
            this.investmentClassify = str42;
        }
        this.hasRateChart = (i3 & 262144) == 0 ? Boolean.TRUE : bool4;
        this.hasRate = (524288 & i3) == 0 ? Boolean.TRUE : bool5;
        this.hasRatePerformance = (1048576 & i3) == 0 ? Boolean.TRUE : bool6;
        if ((2097152 & i3) == 0) {
            this.earnedTokenInfo = null;
        } else {
            this.earnedTokenInfo = investTipInfoVo;
        }
        if ((4194304 & i3) == 0) {
            this.stakePeriodInfo = null;
        } else {
            this.stakePeriodInfo = investTipInfoVo2;
        }
        if ((8388608 & i3) == 0) {
            this.supportAddressInfo = null;
        } else {
            this.supportAddressInfo = investTipInfoVo3;
        }
        if ((16777216 & i3) == 0) {
            this.poolCapacity = null;
        } else {
            this.poolCapacity = str43;
        }
        if ((33554432 & i3) == 0) {
            this.totalPoolCapacity = null;
        } else {
            this.totalPoolCapacity = str44;
        }
        if ((67108864 & i3) == 0) {
            this.currentPoolCapacity = null;
        } else {
            this.currentPoolCapacity = str45;
        }
        this.supportedBTCAddressType = (134217728 & i3) == 0 ? yDY.AhwBna() : list9;
        if ((268435456 & i3) == 0) {
            this.stakingProgress = null;
        } else {
            this.stakingProgress = stakingProgress;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [146=14] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestProductDetailResponse investProductDetailResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investProductDetailResponse.aboutToken, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investProductDetailResponse.aboutToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investProductDetailResponse.aggregateInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investProductDetailResponse.aggregateInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investProductDetailResponse.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, investProductDetailResponse.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investProductDetailResponse.apyDetailInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestApyDetailInfo$$serializer.INSTANCE, investProductDetailResponse.apyDetailInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investProductDetailResponse.baseRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investProductDetailResponse.baseRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investProductDetailResponse.bottomRightLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investProductDetailResponse.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investProductDetailResponse.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, investProductDetailResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investProductDetailResponse.claimedTimes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investProductDetailResponse.claimedTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investProductDetailResponse.contract != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investProductDetailResponse.contract);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investProductDetailResponse.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investProductDetailResponse.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investProductDetailResponse.dailyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investProductDetailResponse.dailyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investProductDetailResponse.deployAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, investProductDetailResponse.deployAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investProductDetailResponse.deployAddressUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investProductDetailResponse.deployAddressUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investProductDetailResponse.deployTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investProductDetailResponse.deployTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investProductDetailResponse.depositors != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, investProductDetailResponse.depositors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investProductDetailResponse.detailPagePromptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, InvestDetailPagePromptInformation$$serializer.INSTANCE, investProductDetailResponse.detailPagePromptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investProductDetailResponse.distributionAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, investProductDetailResponse.distributionAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(investProductDetailResponse.earnedToken, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investProductDetailResponse.earnedToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investProductDetailResponse.estRewardEnd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, investProductDetailResponse.estRewardEnd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investProductDetailResponse.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, investProductDetailResponse.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investProductDetailResponse.hasBonus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, investProductDetailResponse.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investProductDetailResponse.hasTvlChart) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, investProductDetailResponse.hasTvlChart);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investProductDetailResponse.investType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, investProductDetailResponse.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investProductDetailResponse.investmentCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, investProductDetailResponse.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investProductDetailResponse.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 24, investProductDetailResponse.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) investProductDetailResponse.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, investProductDetailResponse.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investProductDetailResponse.investmentShowName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, investProductDetailResponse.investmentShowName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investProductDetailResponse.isBatchClaim) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, investProductDetailResponse.isBatchClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investProductDetailResponse.isExistTradingFee != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, investProductDetailResponse.isExistTradingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !investProductDetailResponse.isInternal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, investProductDetailResponse.isInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !investProductDetailResponse.isInvestable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, investProductDetailResponse.isInvestable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || investProductDetailResponse.isLosslessRateTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, BooleanSerializer.INSTANCE, investProductDetailResponse.isLosslessRateTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || investProductDetailResponse.isNeedIdentityVerify) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, investProductDetailResponse.isNeedIdentityVerify);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !investProductDetailResponse.isSupportRedeem) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, investProductDetailResponse.isSupportRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) investProductDetailResponse.kind, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, investProductDetailResponse.kind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || investProductDetailResponse.losslessRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, investProductDetailResponse.losslessRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || investProductDetailResponse.losslessRateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, IntSerializer.INSTANCE, investProductDetailResponse.losslessRateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd(investProductDetailResponse.middleLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 37, kSerializerArr[37], investProductDetailResponse.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || investProductDetailResponse.mintedAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, investProductDetailResponse.mintedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || investProductDetailResponse.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, investProductDetailResponse.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) investProductDetailResponse.monthlyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, investProductDetailResponse.monthlyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) investProductDetailResponse.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, investProductDetailResponse.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) investProductDetailResponse.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, investProductDetailResponse.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) investProductDetailResponse.nickname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, investProductDetailResponse.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || investProductDetailResponse.platformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, LongSerializer.INSTANCE, investProductDetailResponse.platformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) investProductDetailResponse.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, investProductDetailResponse.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) investProductDetailResponse.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, investProductDetailResponse.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || investProductDetailResponse.poolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, investProductDetailResponse.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || investProductDetailResponse.poolName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, investProductDetailResponse.poolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || investProductDetailResponse.poolStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, IntSerializer.INSTANCE, investProductDetailResponse.poolStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || investProductDetailResponse.poolVersion != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 50, investProductDetailResponse.poolVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd(investProductDetailResponse.qaList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 51, kSerializerArr[51], investProductDetailResponse.qaList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) investProductDetailResponse.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, investProductDetailResponse.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || investProductDetailResponse.rateType != ApyHeaderType.APY.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 53, investProductDetailResponse.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) investProductDetailResponse.rateTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, investProductDetailResponse.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || investProductDetailResponse.recommendRedeemMethod != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 55, investProductDetailResponse.recommendRedeemMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || investProductDetailResponse.recommendSubscriptionMethod != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 56, investProductDetailResponse.recommendSubscriptionMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || investProductDetailResponse.redeemMethod != TransactionMethod.SINGLE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 57, kSerializerArr[57], investProductDetailResponse.redeemMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || investProductDetailResponse.remainAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, StringSerializer.INSTANCE, investProductDetailResponse.remainAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) investProductDetailResponse.sourcePlatformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, investProductDetailResponse.sourcePlatformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || investProductDetailResponse.subTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, investProductDetailResponse.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || investProductDetailResponse.subscriptionMethod != TransactionMethod.SINGLE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 61, kSerializerArr[61], investProductDetailResponse.subscriptionMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd(investProductDetailResponse.topLeftLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 62, kSerializerArr[62], investProductDetailResponse.topLeftLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd(investProductDetailResponse.topRightLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 63, kSerializerArr[63], investProductDetailResponse.topRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) investProductDetailResponse.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, investProductDetailResponse.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) investProductDetailResponse.unableRedeemReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, investProductDetailResponse.unableRedeemReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd(investProductDetailResponse.underlyingToken, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 66, kSerializerArr[66], investProductDetailResponse.underlyingToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) investProductDetailResponse.utilizationRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, investProductDetailResponse.utilizationRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) investProductDetailResponse.weeklyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, investProductDetailResponse.weeklyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) investProductDetailResponse.yearlyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, investProductDetailResponse.yearlyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || investProductDetailResponse.sourceInvestmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 70, investProductDetailResponse.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || investProductDetailResponse.shareUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, investProductDetailResponse.shareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || investProductDetailResponse.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, investProductDetailResponse.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || investProductDetailResponse.maturityTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, StringSerializer.INSTANCE, investProductDetailResponse.maturityTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || investProductDetailResponse.activeInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, investProductDetailResponse.activeInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || investProductDetailResponse.platformUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, investProductDetailResponse.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || investProductDetailResponse.liquidationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, StringSerializer.INSTANCE, investProductDetailResponse.liquidationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || investProductDetailResponse.isPoolWithFarmReward != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, BooleanSerializer.INSTANCE, investProductDetailResponse.isPoolWithFarmReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || investProductDetailResponse.pointTag != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 78, investProductDetailResponse.pointTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || investProductDetailResponse.btcMode != BTCMode.DEFAULT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 79, kSerializerArr[79], investProductDetailResponse.btcMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || investProductDetailResponse.protocolIpRestrict) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 80, investProductDetailResponse.protocolIpRestrict);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || !Intrinsics.EZpvd((Object) investProductDetailResponse.investmentClassify, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 81, investProductDetailResponse.investmentClassify);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || !Intrinsics.EZpvd(investProductDetailResponse.hasRateChart, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, BooleanSerializer.INSTANCE, investProductDetailResponse.hasRateChart);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || !Intrinsics.EZpvd(investProductDetailResponse.hasRate, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 83, BooleanSerializer.INSTANCE, investProductDetailResponse.hasRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || !Intrinsics.EZpvd(investProductDetailResponse.hasRatePerformance, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 84, BooleanSerializer.INSTANCE, investProductDetailResponse.hasRatePerformance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || investProductDetailResponse.earnedTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 85, InvestTipInfoVo$$serializer.INSTANCE, investProductDetailResponse.earnedTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || investProductDetailResponse.stakePeriodInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 86, InvestTipInfoVo$$serializer.INSTANCE, investProductDetailResponse.stakePeriodInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || investProductDetailResponse.supportAddressInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 87, InvestTipInfoVo$$serializer.INSTANCE, investProductDetailResponse.supportAddressInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || investProductDetailResponse.poolCapacity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 88, StringSerializer.INSTANCE, investProductDetailResponse.poolCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || investProductDetailResponse.totalPoolCapacity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 89, StringSerializer.INSTANCE, investProductDetailResponse.totalPoolCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || investProductDetailResponse.currentPoolCapacity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 90, StringSerializer.INSTANCE, investProductDetailResponse.currentPoolCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || !Intrinsics.EZpvd(investProductDetailResponse.supportedBTCAddressType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 91, kSerializerArr[91], investProductDetailResponse.supportedBTCAddressType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) && investProductDetailResponse.stakingProgress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 92, kSerializerArr[92], investProductDetailResponse.stakingProgress);
    }

    public InvestProductDetailResponse(@NotNull List<InvestTokenWithMarketCap> list, Long l, Long l2, InvestApyDetailInfo investApyDetailInfo, String str, @NotNull List<InvestLogoBaseVo> list2, Long l3, String str2, String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str10, @NotNull List<InvestUnderlyingToken> list3, String str11, String str12, Boolean bool, boolean z, int i, Integer num, long j, @NotNull String str13, String str14, boolean z2, int i2, boolean z3, boolean z4, Boolean bool2, boolean z5, boolean z6, @NotNull String str15, String str16, Integer num2, @NotNull List<InvestLogoBaseVo> list4, String str17, Integer num3, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, Long l4, @NotNull String str22, @NotNull String str23, String str24, String str25, Integer num4, int i3, @NotNull List<InvestQaVo> list5, @NotNull String str26, int i4, @NotNull String str27, int i5, int i6, @NotNull TransactionMethod transactionMethod, String str28, @NotNull String str29, String str30, @NotNull TransactionMethod transactionMethod2, @NotNull List<InvestLogoBaseVo> list6, @NotNull List<InvestLogoBaseVo> list7, @NotNull String str31, @NotNull String str32, @NotNull List<InvestUnderlyingToken> list8, @NotNull String str33, @NotNull String str34, @NotNull String str35, long j2, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool3, int i7, @NotNull BTCMode bTCMode, boolean z7, @NotNull String str42, Boolean bool4, Boolean bool5, Boolean bool6, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, String str43, String str44, String str45, @NotNull List<Integer> list9, StakingProgress stakingProgress) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(transactionMethod2, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(bTCMode, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(list9, "");
        this.aboutToken = list;
        this.aggregateInvestmentId = l;
        this.analysisPlatformId = l2;
        this.apyDetailInfo = investApyDetailInfo;
        this.baseRate = str;
        this.bottomRightLogoList = list2;
        this.chainId = l3;
        this.claimedTimes = str2;
        this.contract = str3;
        this.currentPrice = str4;
        this.dailyRoi = str5;
        this.deployAddress = str6;
        this.deployAddressUrl = str7;
        this.deployTime = str8;
        this.depositors = str9;
        this.detailPagePromptInformation = investDetailPagePromptInformation;
        this.distributionAmount = str10;
        this.earnedToken = list3;
        this.estRewardEnd = str11;
        this.feeRate = str12;
        this.hasBonus = bool;
        this.hasTvlChart = z;
        this.investType = i;
        this.investmentCategory = num;
        this.investmentId = j;
        this.investmentName = str13;
        this.investmentShowName = str14;
        this.isBatchClaim = z2;
        this.isExistTradingFee = i2;
        this.isInternal = z3;
        this.isInvestable = z4;
        this.isLosslessRateTip = bool2;
        this.isNeedIdentityVerify = z5;
        this.isSupportRedeem = z6;
        this.kind = str15;
        this.losslessRate = str16;
        this.losslessRateType = num2;
        this.middleLogoList = list4;
        this.mintedAmount = str17;
        this.mode = num3;
        this.monthlyRoi = str18;
        this.network = str19;
        this.networkLogo = str20;
        this.nickname = str21;
        this.platformId = l4;
        this.platformLogo = str22;
        this.platformName = str23;
        this.poolId = str24;
        this.poolName = str25;
        this.poolStatus = num4;
        this.poolVersion = i3;
        this.qaList = list5;
        this.rate = str26;
        this.rateType = i4;
        this.rateTypeDesc = str27;
        this.recommendRedeemMethod = i5;
        this.recommendSubscriptionMethod = i6;
        this.redeemMethod = transactionMethod;
        this.remainAmount = str28;
        this.sourcePlatformName = str29;
        this.subTitle = str30;
        this.subscriptionMethod = transactionMethod2;
        this.topLeftLogoList = list6;
        this.topRightLogoList = list7;
        this.tvl = str31;
        this.unableRedeemReason = str32;
        this.underlyingToken = list8;
        this.utilizationRate = str33;
        this.weeklyRoi = str34;
        this.yearlyRoi = str35;
        this.sourceInvestmentId = j2;
        this.shareUrl = str36;
        this.deeplink = str37;
        this.maturityTime = str38;
        this.activeInvestmentId = str39;
        this.platformUrl = str40;
        this.liquidationRatio = str41;
        this.isPoolWithFarmReward = bool3;
        this.pointTag = i7;
        this.btcMode = bTCMode;
        this.protocolIpRestrict = z7;
        this.investmentClassify = str42;
        this.hasRateChart = bool4;
        this.hasRate = bool5;
        this.hasRatePerformance = bool6;
        this.earnedTokenInfo = investTipInfoVo;
        this.stakePeriodInfo = investTipInfoVo2;
        this.supportAddressInfo = investTipInfoVo3;
        this.poolCapacity = str43;
        this.totalPoolCapacity = str44;
        this.currentPoolCapacity = str45;
        this.supportedBTCAddressType = list9;
        this.stakingProgress = stakingProgress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InvestProductDetailResponse(List list, Long l, Long l2, InvestApyDetailInfo investApyDetailInfo, String str, List list2, Long l3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str10, List list3, String str11, String str12, Boolean bool, boolean z, int i, Integer num, long j, String str13, String str14, boolean z2, int i2, boolean z3, boolean z4, Boolean bool2, boolean z5, boolean z6, String str15, String str16, Integer num2, List list4, String str17, Integer num3, String str18, String str19, String str20, String str21, Long l4, String str22, String str23, String str24, String str25, Integer num4, int i3, List list5, String str26, int i4, String str27, int i5, int i6, TransactionMethod transactionMethod, String str28, String str29, String str30, TransactionMethod transactionMethod2, List list6, List list7, String str31, String str32, List list8, String str33, String str34, String str35, long j2, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool3, int i7, BTCMode bTCMode, boolean z7, String str42, Boolean bool4, Boolean bool5, Boolean bool6, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, String str43, String str44, String str45, List list9, StakingProgress stakingProgress, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List arrayList = (i8 & 1) != 0 ? new ArrayList() : list;
        Long l5 = (i8 & 2) != 0 ? null : l;
        Long l6 = (i8 & 4) != 0 ? null : l2;
        InvestApyDetailInfo investApyDetailInfo2 = (i8 & 8) != 0 ? null : investApyDetailInfo;
        String str46 = (i8 & 16) != 0 ? null : str;
        List arrayList2 = (i8 & 32) != 0 ? new ArrayList() : list2;
        Long l7 = (i8 & 64) != 0 ? null : l3;
        String str47 = (i8 & 128) != 0 ? null : str2;
        String str48 = (i8 & 256) != 0 ? null : str3;
        String str49 = (i8 & 512) != 0 ? null : str4;
        String str50 = (i8 & 1024) != 0 ? "" : str5;
        String str51 = (i8 & 2048) != 0 ? null : str6;
        String str52 = (i8 & 4096) != 0 ? null : str7;
        String str53 = (i8 & 8192) != 0 ? null : str8;
        String str54 = (i8 & 16384) != 0 ? null : str9;
        InvestDetailPagePromptInformation investDetailPagePromptInformation2 = (i8 & 32768) != 0 ? null : investDetailPagePromptInformation;
        String str55 = (i8 & 65536) != 0 ? null : str10;
        List arrayList3 = (i8 & 131072) != 0 ? new ArrayList() : list3;
        String str56 = (i8 & 262144) != 0 ? null : str11;
        String str57 = (i8 & 524288) != 0 ? null : str12;
        Boolean bool7 = (i8 & 1048576) != 0 ? null : bool;
        boolean z8 = (i8 & 2097152) != 0 ? false : z;
        int i11 = (i8 & 4194304) != 0 ? 1 : i;
        Integer num5 = (i8 & 8388608) != 0 ? null : num;
        long j3 = (i8 & 16777216) != 0 ? 0L : j;
        String str58 = (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str13;
        String str59 = (i8 & 67108864) != 0 ? null : str14;
        boolean z9 = (i8 & 134217728) != 0 ? false : z2;
        int i12 = (i8 & 268435456) != 0 ? 0 : i2;
        boolean z10 = (i8 & 536870912) != 0 ? true : z3;
        boolean z11 = (i8 & 1073741824) != 0 ? true : z4;
        Boolean bool8 = (i8 & Integer.MIN_VALUE) != 0 ? null : bool2;
        this(arrayList, l5, l6, investApyDetailInfo2, str46, arrayList2, l7, str47, str48, str49, str50, str51, str52, str53, str54, investDetailPagePromptInformation2, str55, arrayList3, str56, str57, bool7, z8, i11, num5, j3, str58, str59, z9, i12, z10, z11, bool8, (i9 & 1) != 0 ? false : z5, (i9 & 2) == 0 ? z6 : true, (i9 & 4) != 0 ? "" : str15, (i9 & 8) != 0 ? null : str16, (i9 & 16) != 0 ? null : num2, (i9 & 32) != 0 ? new ArrayList() : list4, (i9 & 64) != 0 ? null : str17, (i9 & 128) != 0 ? null : num3, (i9 & 256) != 0 ? "" : str18, (i9 & 512) != 0 ? "" : str19, (i9 & 1024) != 0 ? "" : str20, (i9 & 2048) != 0 ? "" : str21, (i9 & 4096) != 0 ? null : l4, (i9 & 8192) != 0 ? "" : str22, (i9 & 16384) != 0 ? "" : str23, (i9 & 32768) != 0 ? null : str24, (i9 & 65536) != 0 ? null : str25, (i9 & 131072) != 0 ? null : num4, (i9 & 262144) != 0 ? 0 : i3, (i9 & 524288) != 0 ? new ArrayList() : list5, (i9 & 1048576) != 0 ? "" : str26, (i9 & 2097152) != 0 ? ApyHeaderType.APY.getValue() : i4, (i9 & 4194304) != 0 ? "" : str27, (i9 & 8388608) != 0 ? 0 : i5, (i9 & 16777216) != 0 ? 0 : i6, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? TransactionMethod.SINGLE : transactionMethod, (i9 & 67108864) != 0 ? null : str28, (i9 & 134217728) != 0 ? "" : str29, (i9 & 268435456) != 0 ? null : str30, (i9 & 536870912) != 0 ? TransactionMethod.SINGLE : transactionMethod2, (i9 & 1073741824) != 0 ? new ArrayList() : list6, (i9 & Integer.MIN_VALUE) != 0 ? new ArrayList() : list7, (i10 & 1) != 0 ? "" : str31, (i10 & 2) != 0 ? "" : str32, (i10 & 4) != 0 ? new ArrayList() : list8, (i10 & 8) != 0 ? "" : str33, (i10 & 16) != 0 ? "" : str34, (i10 & 32) != 0 ? "" : str35, (i10 & 64) != 0 ? 0L : j2, (i10 & 128) != 0 ? null : str36, (i10 & 256) != 0 ? null : str37, (i10 & 512) != 0 ? null : str38, (i10 & 1024) != 0 ? null : str39, (i10 & 2048) != 0 ? null : str40, (i10 & 4096) != 0 ? null : str41, (i10 & 8192) != 0 ? null : bool3, (i10 & 16384) != 0 ? 0 : i7, (i10 & 32768) != 0 ? BTCMode.DEFAULT : bTCMode, (i10 & 65536) == 0 ? z7 : false, (i10 & 131072) != 0 ? "" : str42, (i10 & 262144) != 0 ? Boolean.TRUE : bool4, (i10 & 524288) != 0 ? Boolean.TRUE : bool5, (i10 & 1048576) != 0 ? Boolean.TRUE : bool6, (i10 & 2097152) != 0 ? null : investTipInfoVo, (i10 & 4194304) != 0 ? null : investTipInfoVo2, (i10 & 8388608) != 0 ? null : investTipInfoVo3, (i10 & 16777216) != 0 ? null : str43, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str44, (i10 & 67108864) != 0 ? null : str45, (i10 & 134217728) != 0 ? yDY.AhwBna() : list9, (i10 & 268435456) != 0 ? null : stakingProgress);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestProductDetailResponse> serializer() {
            return InvestProductDetailResponse$$serializer.INSTANCE;
        }
    }

    static {
        InvestLogoBaseVo$$serializer investLogoBaseVo$$serializer = InvestLogoBaseVo$$serializer.INSTANCE;
        InvestUnderlyingToken$$serializer investUnderlyingToken$$serializer = InvestUnderlyingToken$$serializer.INSTANCE;
        TransactionMethod.Companion companion = TransactionMethod.Companion;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestTokenWithMarketCap$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investUnderlyingToken$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestQaVo$$serializer.INSTANCE), null, null, null, null, null, companion.serializer(), null, null, null, companion.serializer(), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, new ArrayListSerializer(investUnderlyingToken$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, BTCMode.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), StakingProgress.Companion.serializer()};
    }
}

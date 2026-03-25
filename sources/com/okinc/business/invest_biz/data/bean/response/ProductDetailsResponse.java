package com.okinc.business.invest_biz.data.bean.response;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.BorrowInfo;
import com.okinc.business.invest_biz.data.bean.BorrowInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo;
import com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestDetailRate;
import com.okinc.business.invest_biz.data.bean.InvestDetailRate$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestHeaderCountdown;
import com.okinc.business.invest_biz.data.bean.InvestHeaderCountdown$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken$$serializer;
import com.okinc.business.invest_biz.data.bean.SupplyInfo;
import com.okinc.business.invest_biz.data.bean.SupplyInfo$$serializer;
import com.okinc.business.invest_biz.data.contants.BtcProtocolType;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.RateType;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo$$serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProductDetailsResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public final String activeInvestmentId;
    public final Long aggregateInvestmentId;
    public final Long analysisPlatformId;
    public final InvestApyDetailInfo apyDetailInfo;
    public final InvestAssetPositionType assetPositionType;
    public final String baseRate;
    public final List<BorrowInfo> borrowInfoList;
    public final List<InvestLogoBaseVo> bottomRightLogoList;
    public final BtcProtocolType btcProtocolType;
    public final boolean canEarnPoolReward;
    public final int canEarnTradingFee;
    public final boolean canInvest;
    public final boolean canRedeemFromApp;
    public final boolean canSupportBatchClaim;
    public final long chainId;
    public final String chainLogo;
    public final String chainName;
    public final String classification;
    public final String contractAddress;
    public final String currentPrice;
    public final String dailyRoi;
    public final String dueTime;
    public final List<InvestUnderlyingToken> earnedToken;
    public final InvestTipInfoVo earnedTokenInfo;
    public final List<InvestQaVo> faqs;
    public final String feeRate;
    public final boolean hasBonus;
    public final boolean hasIpRestriction;
    public final boolean hasLossRisk;
    public final boolean hasRate;
    public final boolean hasRateChart;
    public final boolean hasRatePerformance;
    public final boolean hasTvlChart;
    public final InvestHeaderCountdown headerCountdown;
    public final PaymentOption investPaymentOption;
    public final long investmentId;
    public final String investmentName;
    public final String investmentSubName;
    public final boolean isInternal;
    public final String liquidationRatio;
    public final String lossRate;
    public final RateType lossRateType;
    public final List<InvestLogoBaseVo> middleLogoList;
    public final String monthlyRoi;
    public final String nickname;
    public final int pointTag;
    public final String poolId;
    public final PoolProtocolType poolVersion;
    public final List<InvestTipInfoVo> productExtInfoList;
    public final String productLogo;
    public final String productName;
    public final ProductType productType;
    public final String productUrl;
    public final InvestDetailPagePromptInformation prompt;
    public final ProtocolType protocolType;
    public final String rate;
    public final List<InvestDetailRate> rateDetails;
    public final RateType rateType;
    public final String rateTypeDesc;
    public final String ratingName;
    public final int ratingTypeId;
    public final PaymentOption recommendedInvestPaymentOption;
    public final PaymentOption recommendedRedeemPaymentOption;
    public final PaymentOption redeemPaymentOption;
    public final List<InvestTokenWithMarketCap> relevantTokens;
    public final String shareUrl;
    public final boolean showBonusInfo;
    public final Long sourceInvestmentId;
    public final InvestmentKind specialProtocolType;
    public final int stakingProgress;
    public final String subTitle;
    public final List<SupplyInfo> supplyInfoList;
    public final List<Integer> supportedBTCAddressType;
    public final String tokenAmountTvl;
    public final List<InvestLogoBaseVo> topLeftLogoList;
    public final List<InvestLogoBaseVo> topRightLogoList;
    public final String tvl;
    public final String unableRedeemReason;
    public final String utilizationRate;
    public final String weeklyRoi;
    public final String yearlyRoi;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductDetailsResponse() {
        this((Long) null, 0L, (Long) null, (Long) null, (String) null, (List) null, false, false, (String) null, (ProductType) null, (ProtocolType) null, (BtcProtocolType) null, (String) null, (String) null, (RateType) null, (String) null, (String) null, false, false, (String) null, (PoolProtocolType) null, (String) null, (PaymentOption) null, (PaymentOption) null, (PaymentOption) null, (PaymentOption) null, (InvestmentKind) null, (List) null, (String) null, (String) null, (String) null, (String) null, 0, false, 0, false, (InvestTipInfoVo) null, false, (String) null, (RateType) null, 0, (String) null, 0L, (String) null, (String) null, (String) null, (InvestApyDetailInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, false, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, false, (List) null, (InvestHeaderCountdown) null, (String) null, false, (InvestDetailPagePromptInformation) null, (String) null, false, (InvestAssetPositionType) null, (List) null, (List) null, (List) null, 0, -1, -1, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AEQbTJ() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcProtocolType AYXKKw() {
        return this.btcProtocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.baseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.canSupportBatchClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AuCTel() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.hasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AwvSrB() {
        return this.hasTvlChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHeaderCountdown AxsJAY() {
        return this.headerCountdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption AxsJAYaxsJAY() {
        return this.recommendedRedeemPaymentOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind AxsJAYsNCnLh() {
        return this.specialProtocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DAIeex() {
        return this.stakingProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DCJXGO() {
        return this.utilizationRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.investmentSubName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DXXBbs() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> DarRvM() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.canRedeemFromApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestApyDetailInfo KWHzl() {
        return this.apyDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsResponse KWHzl(Long l, long j, Long l2, Long l3, @NotNull String str, @NotNull List<InvestTokenWithMarketCap> list, boolean z, boolean z2, @NotNull String str2, @NotNull ProductType productType, @NotNull ProtocolType protocolType, @NotNull BtcProtocolType btcProtocolType, @NotNull String str3, @NotNull String str4, @NotNull RateType rateType, @NotNull String str5, @NotNull String str6, boolean z3, boolean z4, @NotNull String str7, @NotNull PoolProtocolType poolProtocolType, @NotNull String str8, @NotNull PaymentOption paymentOption, @NotNull PaymentOption paymentOption2, @NotNull PaymentOption paymentOption3, @NotNull PaymentOption paymentOption4, @NotNull InvestmentKind investmentKind, @NotNull List<InvestUnderlyingToken> list2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, int i, boolean z5, int i2, boolean z6, InvestTipInfoVo investTipInfoVo, boolean z7, @NotNull String str13, @NotNull RateType rateType2, int i3, @NotNull String str14, long j2, @NotNull String str15, @NotNull String str16, @NotNull String str17, InvestApyDetailInfo investApyDetailInfo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull List<InvestLogoBaseVo> list3, @NotNull List<InvestLogoBaseVo> list4, @NotNull List<InvestLogoBaseVo> list5, @NotNull List<InvestLogoBaseVo> list6, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull List<InvestQaVo> list7, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull List<Integer> list8, boolean z9, boolean z10, boolean z11, @NotNull List<InvestTipInfoVo> list9, InvestHeaderCountdown investHeaderCountdown, String str30, boolean z12, InvestDetailPagePromptInformation investDetailPagePromptInformation, @NotNull String str31, boolean z13, InvestAssetPositionType investAssetPositionType, @NotNull List<InvestDetailRate> list10, @NotNull List<BorrowInfo> list11, @NotNull List<SupplyInfo> list12, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(btcProtocolType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(paymentOption2, "");
        Intrinsics.checkNotNullParameter(paymentOption3, "");
        Intrinsics.checkNotNullParameter(paymentOption4, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(rateType2, "");
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
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(list10, "");
        Intrinsics.checkNotNullParameter(list11, "");
        Intrinsics.checkNotNullParameter(list12, "");
        return new ProductDetailsResponse(l, j, l2, l3, str, list, z, z2, str2, productType, protocolType, btcProtocolType, str3, str4, rateType, str5, str6, z3, z4, str7, poolProtocolType, str8, paymentOption, paymentOption2, paymentOption3, paymentOption4, investmentKind, list2, str9, str10, str11, str12, i, z5, i2, z6, investTipInfoVo, z7, str13, rateType2, i3, str14, j2, str15, str16, str17, investApyDetailInfo, str18, str19, str20, str21, str22, str23, list3, list4, list5, list6, z8, str24, str25, list7, str26, str27, str28, str29, list8, z9, z10, z11, list9, investHeaderCountdown, str30, z12, investDetailPagePromptInformation, str31, z13, investAssetPositionType, list10, list11, list12, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ODWQjV() {
        return this.weeklyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ORxRYg() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OcIXYQ() {
        return this.liquidationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> OqFWZa() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long QKVWgx() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QKudOq() {
        return this.tokenAmountTvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QOLQEE() {
        return this.lossRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateType QUSxYX() {
        return this.lossRateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> QVAiDq() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QbewEr() {
        return this.pointTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QfsBiF() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String RJOkX() {
        return this.monthlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String RcXXUw() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> RlQdEF() {
        return this.supportedBTCAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String UeEOUB() {
        return this.productName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> aKErDB() {
        return this.productExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupplyInfo> accept() {
        return this.supplyInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.activeInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PoolProtocolType dNCPSb() {
        return this.poolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BorrowInfo> djBIcL() {
        return this.borrowInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djSkpj() {
        return this.productLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String dvKsVJ() {
        return this.productUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String dxcTrN() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.classification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsResponse)) {
            return false;
        }
        ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) obj;
        return Intrinsics.EZpvd(this.aggregateInvestmentId, productDetailsResponse.aggregateInvestmentId) && this.investmentId == productDetailsResponse.investmentId && Intrinsics.EZpvd(this.analysisPlatformId, productDetailsResponse.analysisPlatformId) && Intrinsics.EZpvd(this.sourceInvestmentId, productDetailsResponse.sourceInvestmentId) && Intrinsics.EZpvd((Object) this.activeInvestmentId, (Object) productDetailsResponse.activeInvestmentId) && Intrinsics.EZpvd(this.relevantTokens, productDetailsResponse.relevantTokens) && this.isInternal == productDetailsResponse.isInternal && this.canRedeemFromApp == productDetailsResponse.canRedeemFromApp && Intrinsics.EZpvd((Object) this.dueTime, (Object) productDetailsResponse.dueTime) && this.productType == productDetailsResponse.productType && this.protocolType == productDetailsResponse.protocolType && this.btcProtocolType == productDetailsResponse.btcProtocolType && Intrinsics.EZpvd((Object) this.baseRate, (Object) productDetailsResponse.baseRate) && Intrinsics.EZpvd((Object) this.rate, (Object) productDetailsResponse.rate) && this.rateType == productDetailsResponse.rateType && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) productDetailsResponse.rateTypeDesc) && Intrinsics.EZpvd((Object) this.feeRate, (Object) productDetailsResponse.feeRate) && this.hasBonus == productDetailsResponse.hasBonus && this.showBonusInfo == productDetailsResponse.showBonusInfo && Intrinsics.EZpvd((Object) this.liquidationRatio, (Object) productDetailsResponse.liquidationRatio) && this.poolVersion == productDetailsResponse.poolVersion && Intrinsics.EZpvd((Object) this.poolId, (Object) productDetailsResponse.poolId) && this.recommendedRedeemPaymentOption == productDetailsResponse.recommendedRedeemPaymentOption && this.recommendedInvestPaymentOption == productDetailsResponse.recommendedInvestPaymentOption && this.redeemPaymentOption == productDetailsResponse.redeemPaymentOption && this.investPaymentOption == productDetailsResponse.investPaymentOption && this.specialProtocolType == productDetailsResponse.specialProtocolType && Intrinsics.EZpvd(this.earnedToken, productDetailsResponse.earnedToken) && Intrinsics.EZpvd((Object) this.dailyRoi, (Object) productDetailsResponse.dailyRoi) && Intrinsics.EZpvd((Object) this.weeklyRoi, (Object) productDetailsResponse.weeklyRoi) && Intrinsics.EZpvd((Object) this.monthlyRoi, (Object) productDetailsResponse.monthlyRoi) && Intrinsics.EZpvd((Object) this.yearlyRoi, (Object) productDetailsResponse.yearlyRoi) && this.pointTag == productDetailsResponse.pointTag && this.canSupportBatchClaim == productDetailsResponse.canSupportBatchClaim && this.canEarnTradingFee == productDetailsResponse.canEarnTradingFee && this.canEarnPoolReward == productDetailsResponse.canEarnPoolReward && Intrinsics.EZpvd(this.earnedTokenInfo, productDetailsResponse.earnedTokenInfo) && this.hasLossRisk == productDetailsResponse.hasLossRisk && Intrinsics.EZpvd((Object) this.lossRate, (Object) productDetailsResponse.lossRate) && this.lossRateType == productDetailsResponse.lossRateType && this.ratingTypeId == productDetailsResponse.ratingTypeId && Intrinsics.EZpvd((Object) this.ratingName, (Object) productDetailsResponse.ratingName) && this.chainId == productDetailsResponse.chainId && Intrinsics.EZpvd((Object) this.chainName, (Object) productDetailsResponse.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) productDetailsResponse.chainLogo) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) productDetailsResponse.contractAddress) && Intrinsics.EZpvd(this.apyDetailInfo, productDetailsResponse.apyDetailInfo) && Intrinsics.EZpvd((Object) this.investmentName, (Object) productDetailsResponse.investmentName) && Intrinsics.EZpvd((Object) this.nickname, (Object) productDetailsResponse.nickname) && Intrinsics.EZpvd((Object) this.productName, (Object) productDetailsResponse.productName) && Intrinsics.EZpvd((Object) this.productLogo, (Object) productDetailsResponse.productLogo) && Intrinsics.EZpvd((Object) this.productUrl, (Object) productDetailsResponse.productUrl) && Intrinsics.EZpvd((Object) this.classification, (Object) productDetailsResponse.classification) && Intrinsics.EZpvd(this.middleLogoList, productDetailsResponse.middleLogoList) && Intrinsics.EZpvd(this.topLeftLogoList, productDetailsResponse.topLeftLogoList) && Intrinsics.EZpvd(this.topRightLogoList, productDetailsResponse.topRightLogoList) && Intrinsics.EZpvd(this.bottomRightLogoList, productDetailsResponse.bottomRightLogoList) && this.hasTvlChart == productDetailsResponse.hasTvlChart && Intrinsics.EZpvd((Object) this.tvl, (Object) productDetailsResponse.tvl) && Intrinsics.EZpvd((Object) this.tokenAmountTvl, (Object) productDetailsResponse.tokenAmountTvl) && Intrinsics.EZpvd(this.faqs, productDetailsResponse.faqs) && Intrinsics.EZpvd((Object) this.shareUrl, (Object) productDetailsResponse.shareUrl) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) productDetailsResponse.currentPrice) && Intrinsics.EZpvd((Object) this.utilizationRate, (Object) productDetailsResponse.utilizationRate) && Intrinsics.EZpvd((Object) this.subTitle, (Object) productDetailsResponse.subTitle) && Intrinsics.EZpvd(this.supportedBTCAddressType, productDetailsResponse.supportedBTCAddressType) && this.hasRate == productDetailsResponse.hasRate && this.hasRateChart == productDetailsResponse.hasRateChart && this.hasRatePerformance == productDetailsResponse.hasRatePerformance && Intrinsics.EZpvd(this.productExtInfoList, productDetailsResponse.productExtInfoList) && Intrinsics.EZpvd(this.headerCountdown, productDetailsResponse.headerCountdown) && Intrinsics.EZpvd((Object) this.investmentSubName, (Object) productDetailsResponse.investmentSubName) && this.canInvest == productDetailsResponse.canInvest && Intrinsics.EZpvd(this.prompt, productDetailsResponse.prompt) && Intrinsics.EZpvd((Object) this.unableRedeemReason, (Object) productDetailsResponse.unableRedeemReason) && this.hasIpRestriction == productDetailsResponse.hasIpRestriction && this.assetPositionType == productDetailsResponse.assetPositionType && Intrinsics.EZpvd(this.rateDetails, productDetailsResponse.rateDetails) && Intrinsics.EZpvd(this.borrowInfoList, productDetailsResponse.borrowInfoList) && Intrinsics.EZpvd(this.supplyInfoList, productDetailsResponse.supplyInfoList) && this.stakingProgress == productDetailsResponse.stakingProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation fFgQHt() {
        return this.prompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolType fZBcTu() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.canInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ffGIBT() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType finit() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption flVtFt() {
        return this.recommendedInvestPaymentOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fvQaOB() {
        return this.ratingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType gEmmrt() {
        return this.assetPositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateType gGvvIC() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption gHZMYf() {
        return this.investPaymentOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestDetailRate> gasjUx() {
        return this.rateDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.dueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPostValueLengthLimit() {
        return this.yearlyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int giSNqX() {
        return this.ratingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithMarketCap> gkJEwt() {
        return this.relevantTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.dailyRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hUfVAv() {
        return this.showBonusInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.aggregateInvestmentId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = Long.hashCode(this.investmentId);
        Long l2 = this.analysisPlatformId;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.sourceInvestmentId;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        int iHashCode5 = this.activeInvestmentId.hashCode();
        int iHashCode6 = this.relevantTokens.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isInternal);
        int iHashCode8 = Boolean.hashCode(this.canRedeemFromApp);
        int iHashCode9 = this.dueTime.hashCode();
        int iHashCode10 = this.productType.hashCode();
        int iHashCode11 = this.protocolType.hashCode();
        int iHashCode12 = this.btcProtocolType.hashCode();
        int iHashCode13 = this.baseRate.hashCode();
        int iHashCode14 = this.rate.hashCode();
        int iHashCode15 = this.rateType.hashCode();
        int iHashCode16 = this.rateTypeDesc.hashCode();
        int iHashCode17 = this.feeRate.hashCode();
        int iHashCode18 = Boolean.hashCode(this.hasBonus);
        int iHashCode19 = Boolean.hashCode(this.showBonusInfo);
        int iHashCode20 = this.liquidationRatio.hashCode();
        int iHashCode21 = this.poolVersion.hashCode();
        int iHashCode22 = this.poolId.hashCode();
        int iHashCode23 = this.recommendedRedeemPaymentOption.hashCode();
        int iHashCode24 = this.recommendedInvestPaymentOption.hashCode();
        int iHashCode25 = this.redeemPaymentOption.hashCode();
        int iHashCode26 = this.investPaymentOption.hashCode();
        int iHashCode27 = this.specialProtocolType.hashCode();
        int iHashCode28 = this.earnedToken.hashCode();
        int iHashCode29 = this.dailyRoi.hashCode();
        int iHashCode30 = this.weeklyRoi.hashCode();
        int iHashCode31 = this.monthlyRoi.hashCode();
        int iHashCode32 = this.yearlyRoi.hashCode();
        int iHashCode33 = Integer.hashCode(this.pointTag);
        int iHashCode34 = Boolean.hashCode(this.canSupportBatchClaim);
        int iHashCode35 = Integer.hashCode(this.canEarnTradingFee);
        int iHashCode36 = Boolean.hashCode(this.canEarnPoolReward);
        InvestTipInfoVo investTipInfoVo = this.earnedTokenInfo;
        int iHashCode37 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        int iHashCode38 = Boolean.hashCode(this.hasLossRisk);
        int iHashCode39 = this.lossRate.hashCode();
        int iHashCode40 = this.lossRateType.hashCode();
        int iHashCode41 = Integer.hashCode(this.ratingTypeId);
        int iHashCode42 = this.ratingName.hashCode();
        int iHashCode43 = Long.hashCode(this.chainId);
        int iHashCode44 = this.chainName.hashCode();
        int iHashCode45 = this.chainLogo.hashCode();
        int iHashCode46 = this.contractAddress.hashCode();
        InvestApyDetailInfo investApyDetailInfo = this.apyDetailInfo;
        int iHashCode47 = investApyDetailInfo == null ? 0 : investApyDetailInfo.hashCode();
        int iHashCode48 = this.investmentName.hashCode();
        int iHashCode49 = this.nickname.hashCode();
        int iHashCode50 = this.productName.hashCode();
        int iHashCode51 = this.productLogo.hashCode();
        int iHashCode52 = this.productUrl.hashCode();
        int iHashCode53 = this.classification.hashCode();
        int iHashCode54 = this.middleLogoList.hashCode();
        int iHashCode55 = this.topLeftLogoList.hashCode();
        int iHashCode56 = this.topRightLogoList.hashCode();
        int iHashCode57 = this.bottomRightLogoList.hashCode();
        int iHashCode58 = Boolean.hashCode(this.hasTvlChart);
        int iHashCode59 = this.tvl.hashCode();
        int iHashCode60 = this.tokenAmountTvl.hashCode();
        int iHashCode61 = this.faqs.hashCode();
        int iHashCode62 = this.shareUrl.hashCode();
        int iHashCode63 = this.currentPrice.hashCode();
        int iHashCode64 = this.utilizationRate.hashCode();
        int iHashCode65 = this.subTitle.hashCode();
        int iHashCode66 = this.supportedBTCAddressType.hashCode();
        int iHashCode67 = Boolean.hashCode(this.hasRate);
        int iHashCode68 = Boolean.hashCode(this.hasRateChart);
        int iHashCode69 = Boolean.hashCode(this.hasRatePerformance);
        int iHashCode70 = this.productExtInfoList.hashCode();
        InvestHeaderCountdown investHeaderCountdown = this.headerCountdown;
        int iHashCode71 = investHeaderCountdown == null ? 0 : investHeaderCountdown.hashCode();
        String str = this.investmentSubName;
        int iHashCode72 = str == null ? 0 : str.hashCode();
        int iHashCode73 = Boolean.hashCode(this.canInvest);
        InvestDetailPagePromptInformation investDetailPagePromptInformation = this.prompt;
        int iHashCode74 = investDetailPagePromptInformation == null ? 0 : investDetailPagePromptInformation.hashCode();
        int iHashCode75 = this.unableRedeemReason.hashCode();
        int iHashCode76 = Boolean.hashCode(this.hasIpRestriction);
        InvestAssetPositionType investAssetPositionType = this.assetPositionType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + (investAssetPositionType == null ? 0 : investAssetPositionType.hashCode())) * 31) + this.rateDetails.hashCode()) * 31) + this.borrowInfoList.hashCode()) * 31) + this.supplyInfoList.hashCode()) * 31) + Integer.hashCode(this.stakingProgress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption iRxXKY() {
        return this.redeemPaymentOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long iZzfmt() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.canEarnPoolReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo iwGUEr() {
        return this.earnedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean sSMYrx() {
        return this.hasRatePerformance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductDetailsResponse(aggregateInvestmentId=" + this.aggregateInvestmentId + ", investmentId=" + this.investmentId + ", analysisPlatformId=" + this.analysisPlatformId + ", sourceInvestmentId=" + this.sourceInvestmentId + ", activeInvestmentId=" + this.activeInvestmentId + ", relevantTokens=" + this.relevantTokens + ", isInternal=" + this.isInternal + ", canRedeemFromApp=" + this.canRedeemFromApp + ", dueTime=" + this.dueTime + ", productType=" + this.productType + ", protocolType=" + this.protocolType + ", btcProtocolType=" + this.btcProtocolType + ", baseRate=" + this.baseRate + ", rate=" + this.rate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", feeRate=" + this.feeRate + ", hasBonus=" + this.hasBonus + ", showBonusInfo=" + this.showBonusInfo + ", liquidationRatio=" + this.liquidationRatio + ", poolVersion=" + this.poolVersion + ", poolId=" + this.poolId + ", recommendedRedeemPaymentOption=" + this.recommendedRedeemPaymentOption + ", recommendedInvestPaymentOption=" + this.recommendedInvestPaymentOption + ", redeemPaymentOption=" + this.redeemPaymentOption + ", investPaymentOption=" + this.investPaymentOption + ", specialProtocolType=" + this.specialProtocolType + ", earnedToken=" + this.earnedToken + ", dailyRoi=" + this.dailyRoi + ", weeklyRoi=" + this.weeklyRoi + ", monthlyRoi=" + this.monthlyRoi + ", yearlyRoi=" + this.yearlyRoi + ", pointTag=" + this.pointTag + ", canSupportBatchClaim=" + this.canSupportBatchClaim + ", canEarnTradingFee=" + this.canEarnTradingFee + ", canEarnPoolReward=" + this.canEarnPoolReward + ", earnedTokenInfo=" + this.earnedTokenInfo + ", hasLossRisk=" + this.hasLossRisk + ", lossRate=" + this.lossRate + ", lossRateType=" + this.lossRateType + ", ratingTypeId=" + this.ratingTypeId + ", ratingName=" + this.ratingName + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", contractAddress=" + this.contractAddress + ", apyDetailInfo=" + this.apyDetailInfo + ", investmentName=" + this.investmentName + ", nickname=" + this.nickname + ", productName=" + this.productName + ", productLogo=" + this.productLogo + ", productUrl=" + this.productUrl + ", classification=" + this.classification + ", middleLogoList=" + this.middleLogoList + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ", bottomRightLogoList=" + this.bottomRightLogoList + ", hasTvlChart=" + this.hasTvlChart + ", tvl=" + this.tvl + ", tokenAmountTvl=" + this.tokenAmountTvl + ", faqs=" + this.faqs + ", shareUrl=" + this.shareUrl + ", currentPrice=" + this.currentPrice + ", utilizationRate=" + this.utilizationRate + ", subTitle=" + this.subTitle + ", supportedBTCAddressType=" + this.supportedBTCAddressType + ", hasRate=" + this.hasRate + ", hasRateChart=" + this.hasRateChart + ", hasRatePerformance=" + this.hasRatePerformance + ", productExtInfoList=" + this.productExtInfoList + ", headerCountdown=" + this.headerCountdown + ", investmentSubName=" + this.investmentSubName + ", canInvest=" + this.canInvest + ", prompt=" + this.prompt + ", unableRedeemReason=" + this.unableRedeemReason + ", hasIpRestriction=" + this.hasIpRestriction + ", assetPositionType=" + this.assetPositionType + ", rateDetails=" + this.rateDetails + ", borrowInfoList=" + this.borrowInfoList + ", supplyInfoList=" + this.supplyInfoList + ", stakingProgress=" + this.stakingProgress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUnderlyingToken> uzCIH() {
        return this.earnedToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> valueOf() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.canEarnTradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestQaVo> wlaJM() {
        return this.faqs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.hasLossRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return this.hasRateChart;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductDetailsResponse> serializer() {
            return ProductDetailsResponse$$serializer.INSTANCE;
        }
    }

    static {
        RateType.Companion companion = RateType.Companion;
        PaymentOption.Companion companion2 = PaymentOption.Companion;
        InvestLogoBaseVo$$serializer investLogoBaseVo$$serializer = InvestLogoBaseVo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(InvestTokenWithMarketCap$$serializer.INSTANCE), null, null, null, ProductType.Companion.serializer(), ProtocolType.Companion.serializer(), BtcProtocolType.Companion.serializer(), null, null, companion.serializer(), null, null, null, null, null, PoolProtocolType.Companion.serializer(), null, companion2.serializer(), companion2.serializer(), companion2.serializer(), companion2.serializer(), InvestmentKind.Companion.serializer(), new ArrayListSerializer(InvestUnderlyingToken$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, new ArrayListSerializer(InvestQaVo$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, new ArrayListSerializer(InvestTipInfoVo$$serializer.INSTANCE), null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.bean.InvestAssetPositionType", InvestAssetPositionType.values()), new ArrayListSerializer(InvestDetailRate$$serializer.INSTANCE), new ArrayListSerializer(BorrowInfo$$serializer.INSTANCE), new ArrayListSerializer(SupplyInfo$$serializer.INSTANCE), null};
    }

    public /* synthetic */ ProductDetailsResponse(int i, int i2, int i3, Long l, long j, Long l2, Long l3, String str, List list, boolean z, boolean z2, String str2, ProductType productType, ProtocolType protocolType, BtcProtocolType btcProtocolType, String str3, String str4, RateType rateType, String str5, String str6, boolean z3, boolean z4, String str7, PoolProtocolType poolProtocolType, String str8, PaymentOption paymentOption, PaymentOption paymentOption2, PaymentOption paymentOption3, PaymentOption paymentOption4, InvestmentKind investmentKind, List list2, String str9, String str10, String str11, String str12, int i4, boolean z5, int i5, boolean z6, InvestTipInfoVo investTipInfoVo, boolean z7, String str13, RateType rateType2, int i6, String str14, long j2, String str15, String str16, String str17, InvestApyDetailInfo investApyDetailInfo, String str18, String str19, String str20, String str21, String str22, String str23, List list3, List list4, List list5, List list6, boolean z8, String str24, String str25, List list7, String str26, String str27, String str28, String str29, List list8, boolean z9, boolean z10, boolean z11, List list9, InvestHeaderCountdown investHeaderCountdown, String str30, boolean z12, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str31, boolean z13, InvestAssetPositionType investAssetPositionType, List list10, List list11, List list12, int i7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aggregateInvestmentId = null;
        } else {
            this.aggregateInvestmentId = l;
        }
        if ((i & 2) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
        if ((i & 4) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l2;
        }
        if ((i & 8) == 0) {
            this.sourceInvestmentId = null;
        } else {
            this.sourceInvestmentId = l3;
        }
        if ((i & 16) == 0) {
            this.activeInvestmentId = "";
        } else {
            this.activeInvestmentId = str;
        }
        this.relevantTokens = (i & 32) == 0 ? new ArrayList() : list;
        if ((i & 64) == 0) {
            this.isInternal = true;
        } else {
            this.isInternal = z;
        }
        if ((i & 128) == 0) {
            this.canRedeemFromApp = true;
        } else {
            this.canRedeemFromApp = z2;
        }
        if ((i & 256) == 0) {
            this.dueTime = "";
        } else {
            this.dueTime = str2;
        }
        this.productType = (i & 512) == 0 ? ProductType.Save : productType;
        this.protocolType = (i & 1024) == 0 ? ProtocolType.Unknown : protocolType;
        this.btcProtocolType = (i & 2048) == 0 ? BtcProtocolType.Unknown : btcProtocolType;
        if ((i & 4096) == 0) {
            this.baseRate = "";
        } else {
            this.baseRate = str3;
        }
        if ((i & 8192) == 0) {
            this.rate = "";
        } else {
            this.rate = str4;
        }
        this.rateType = (i & 16384) == 0 ? RateType.APY : rateType;
        if ((i & 32768) == 0) {
            this.rateTypeDesc = "";
        } else {
            this.rateTypeDesc = str5;
        }
        if ((i & 65536) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str6;
        }
        if ((i & 131072) == 0) {
            this.hasBonus = false;
        } else {
            this.hasBonus = z3;
        }
        if ((262144 & i) == 0) {
            this.showBonusInfo = false;
        } else {
            this.showBonusInfo = z4;
        }
        if ((524288 & i) == 0) {
            this.liquidationRatio = "";
        } else {
            this.liquidationRatio = str7;
        }
        this.poolVersion = (1048576 & i) == 0 ? PoolProtocolType.Unknown : poolProtocolType;
        if ((2097152 & i) == 0) {
            this.poolId = "";
        } else {
            this.poolId = str8;
        }
        this.recommendedRedeemPaymentOption = (4194304 & i) == 0 ? PaymentOption.NotDecided : paymentOption;
        this.recommendedInvestPaymentOption = (8388608 & i) == 0 ? PaymentOption.NotDecided : paymentOption2;
        this.redeemPaymentOption = (16777216 & i) == 0 ? PaymentOption.NotDecided : paymentOption3;
        this.investPaymentOption = (33554432 & i) == 0 ? PaymentOption.NotDecided : paymentOption4;
        this.specialProtocolType = (67108864 & i) == 0 ? InvestmentKind.Default : investmentKind;
        this.earnedToken = (134217728 & i) == 0 ? new ArrayList() : list2;
        if ((268435456 & i) == 0) {
            this.dailyRoi = "";
        } else {
            this.dailyRoi = str9;
        }
        if ((536870912 & i) == 0) {
            this.weeklyRoi = "";
        } else {
            this.weeklyRoi = str10;
        }
        if ((1073741824 & i) == 0) {
            this.monthlyRoi = "";
        } else {
            this.monthlyRoi = str11;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.yearlyRoi = "";
        } else {
            this.yearlyRoi = str12;
        }
        if ((i2 & 1) == 0) {
            this.pointTag = 0;
        } else {
            this.pointTag = i4;
        }
        if ((i2 & 2) == 0) {
            this.canSupportBatchClaim = false;
        } else {
            this.canSupportBatchClaim = z5;
        }
        if ((i2 & 4) == 0) {
            this.canEarnTradingFee = 0;
        } else {
            this.canEarnTradingFee = i5;
        }
        if ((i2 & 8) == 0) {
            this.canEarnPoolReward = false;
        } else {
            this.canEarnPoolReward = z6;
        }
        if ((i2 & 16) == 0) {
            this.earnedTokenInfo = null;
        } else {
            this.earnedTokenInfo = investTipInfoVo;
        }
        if ((i2 & 32) == 0) {
            this.hasLossRisk = false;
        } else {
            this.hasLossRisk = z7;
        }
        if ((i2 & 64) == 0) {
            this.lossRate = "";
        } else {
            this.lossRate = str13;
        }
        this.lossRateType = (i2 & 128) == 0 ? RateType.Unknown : rateType2;
        if ((i2 & 256) == 0) {
            this.ratingTypeId = 0;
        } else {
            this.ratingTypeId = i6;
        }
        if ((i2 & 512) == 0) {
            this.ratingName = "";
        } else {
            this.ratingName = str14;
        }
        this.chainId = (i2 & 1024) != 0 ? j2 : 0L;
        if ((i2 & 2048) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str15;
        }
        if ((i2 & 4096) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str16;
        }
        if ((i2 & 8192) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str17;
        }
        if ((i2 & 16384) == 0) {
            this.apyDetailInfo = null;
        } else {
            this.apyDetailInfo = investApyDetailInfo;
        }
        if ((i2 & 32768) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str18;
        }
        if ((i2 & 65536) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str19;
        }
        if ((i2 & 131072) == 0) {
            this.productName = "";
        } else {
            this.productName = str20;
        }
        if ((262144 & i2) == 0) {
            this.productLogo = "";
        } else {
            this.productLogo = str21;
        }
        if ((524288 & i2) == 0) {
            this.productUrl = "";
        } else {
            this.productUrl = str22;
        }
        if ((1048576 & i2) == 0) {
            this.classification = "";
        } else {
            this.classification = str23;
        }
        this.middleLogoList = (2097152 & i2) == 0 ? new ArrayList() : list3;
        this.topLeftLogoList = (4194304 & i2) == 0 ? new ArrayList() : list4;
        this.topRightLogoList = (8388608 & i2) == 0 ? new ArrayList() : list5;
        this.bottomRightLogoList = (16777216 & i2) == 0 ? new ArrayList() : list6;
        if ((33554432 & i2) == 0) {
            this.hasTvlChart = false;
        } else {
            this.hasTvlChart = z8;
        }
        if ((67108864 & i2) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str24;
        }
        if ((134217728 & i2) == 0) {
            this.tokenAmountTvl = "";
        } else {
            this.tokenAmountTvl = str25;
        }
        this.faqs = (268435456 & i2) == 0 ? new ArrayList() : list7;
        if ((536870912 & i2) == 0) {
            this.shareUrl = "";
        } else {
            this.shareUrl = str26;
        }
        if ((1073741824 & i2) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str27;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.utilizationRate = "";
        } else {
            this.utilizationRate = str28;
        }
        if ((i3 & 1) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str29;
        }
        this.supportedBTCAddressType = (i3 & 2) == 0 ? yDY.AhwBna() : list8;
        if ((i3 & 4) == 0) {
            this.hasRate = true;
        } else {
            this.hasRate = z9;
        }
        if ((i3 & 8) == 0) {
            this.hasRateChart = true;
        } else {
            this.hasRateChart = z10;
        }
        if ((i3 & 16) == 0) {
            this.hasRatePerformance = true;
        } else {
            this.hasRatePerformance = z11;
        }
        this.productExtInfoList = (i3 & 32) == 0 ? yDY.AhwBna() : list9;
        if ((i3 & 64) == 0) {
            this.headerCountdown = null;
        } else {
            this.headerCountdown = investHeaderCountdown;
        }
        if ((i3 & 128) == 0) {
            this.investmentSubName = null;
        } else {
            this.investmentSubName = str30;
        }
        if ((i3 & 256) == 0) {
            this.canInvest = true;
        } else {
            this.canInvest = z12;
        }
        if ((i3 & 512) == 0) {
            this.prompt = null;
        } else {
            this.prompt = investDetailPagePromptInformation;
        }
        if ((i3 & 1024) == 0) {
            this.unableRedeemReason = "";
        } else {
            this.unableRedeemReason = str31;
        }
        if ((i3 & 2048) == 0) {
            this.hasIpRestriction = false;
        } else {
            this.hasIpRestriction = z13;
        }
        if ((i3 & 4096) == 0) {
            this.assetPositionType = null;
        } else {
            this.assetPositionType = investAssetPositionType;
        }
        this.rateDetails = (i3 & 8192) == 0 ? yDY.AhwBna() : list10;
        this.borrowInfoList = (i3 & 16384) == 0 ? yDY.AhwBna() : list11;
        this.supplyInfoList = (i3 & 32768) == 0 ? yDY.AhwBna() : list12;
        if ((i3 & 65536) == 0) {
            this.stakingProgress = 0;
        } else {
            this.stakingProgress = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [25=24] */
    public static final /* synthetic */ void EZpvd(ProductDetailsResponse productDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productDetailsResponse.aggregateInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, productDetailsResponse.aggregateInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productDetailsResponse.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, productDetailsResponse.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || productDetailsResponse.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, productDetailsResponse.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || productDetailsResponse.sourceInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, productDetailsResponse.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) productDetailsResponse.activeInvestmentId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, productDetailsResponse.activeInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(productDetailsResponse.relevantTokens, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], productDetailsResponse.relevantTokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !productDetailsResponse.isInternal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, productDetailsResponse.isInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !productDetailsResponse.canRedeemFromApp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, productDetailsResponse.canRedeemFromApp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) productDetailsResponse.dueTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, productDetailsResponse.dueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || productDetailsResponse.productType != ProductType.Save) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], productDetailsResponse.productType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || productDetailsResponse.protocolType != ProtocolType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], productDetailsResponse.protocolType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || productDetailsResponse.btcProtocolType != BtcProtocolType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], productDetailsResponse.btcProtocolType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) productDetailsResponse.baseRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, productDetailsResponse.baseRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) productDetailsResponse.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, productDetailsResponse.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || productDetailsResponse.rateType != RateType.APY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], productDetailsResponse.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) productDetailsResponse.rateTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, productDetailsResponse.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) productDetailsResponse.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, productDetailsResponse.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || productDetailsResponse.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, productDetailsResponse.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || productDetailsResponse.showBonusInfo) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, productDetailsResponse.showBonusInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) productDetailsResponse.liquidationRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, productDetailsResponse.liquidationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || productDetailsResponse.poolVersion != PoolProtocolType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], productDetailsResponse.poolVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) productDetailsResponse.poolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, productDetailsResponse.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || productDetailsResponse.recommendedRedeemPaymentOption != PaymentOption.NotDecided) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], productDetailsResponse.recommendedRedeemPaymentOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || productDetailsResponse.recommendedInvestPaymentOption != PaymentOption.NotDecided) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], productDetailsResponse.recommendedInvestPaymentOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || productDetailsResponse.redeemPaymentOption != PaymentOption.NotDecided) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], productDetailsResponse.redeemPaymentOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || productDetailsResponse.investPaymentOption != PaymentOption.NotDecided) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 25, kSerializerArr[25], productDetailsResponse.investPaymentOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || productDetailsResponse.specialProtocolType != InvestmentKind.Default) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], productDetailsResponse.specialProtocolType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd(productDetailsResponse.earnedToken, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, kSerializerArr[27], productDetailsResponse.earnedToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) productDetailsResponse.dailyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, productDetailsResponse.dailyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) productDetailsResponse.weeklyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, productDetailsResponse.weeklyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) productDetailsResponse.monthlyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, productDetailsResponse.monthlyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) productDetailsResponse.yearlyRoi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, productDetailsResponse.yearlyRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || productDetailsResponse.pointTag != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 32, productDetailsResponse.pointTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || productDetailsResponse.canSupportBatchClaim) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, productDetailsResponse.canSupportBatchClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || productDetailsResponse.canEarnTradingFee != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 34, productDetailsResponse.canEarnTradingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || productDetailsResponse.canEarnPoolReward) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, productDetailsResponse.canEarnPoolReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || productDetailsResponse.earnedTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, InvestTipInfoVo$$serializer.INSTANCE, productDetailsResponse.earnedTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || productDetailsResponse.hasLossRisk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, productDetailsResponse.hasLossRisk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) productDetailsResponse.lossRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, productDetailsResponse.lossRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || productDetailsResponse.lossRateType != RateType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], productDetailsResponse.lossRateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || productDetailsResponse.ratingTypeId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 40, productDetailsResponse.ratingTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) productDetailsResponse.ratingName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, productDetailsResponse.ratingName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || productDetailsResponse.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 42, productDetailsResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) productDetailsResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, productDetailsResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) productDetailsResponse.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, productDetailsResponse.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) productDetailsResponse.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, productDetailsResponse.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || productDetailsResponse.apyDetailInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, InvestApyDetailInfo$$serializer.INSTANCE, productDetailsResponse.apyDetailInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) productDetailsResponse.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, productDetailsResponse.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) productDetailsResponse.nickname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, productDetailsResponse.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) productDetailsResponse.productName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, productDetailsResponse.productName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) productDetailsResponse.productLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, productDetailsResponse.productLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) productDetailsResponse.productUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, productDetailsResponse.productUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) productDetailsResponse.classification, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, productDetailsResponse.classification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd(productDetailsResponse.middleLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 53, kSerializerArr[53], productDetailsResponse.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd(productDetailsResponse.topLeftLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 54, kSerializerArr[54], productDetailsResponse.topLeftLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd(productDetailsResponse.topRightLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 55, kSerializerArr[55], productDetailsResponse.topRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd(productDetailsResponse.bottomRightLogoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 56, kSerializerArr[56], productDetailsResponse.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || productDetailsResponse.hasTvlChart) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 57, productDetailsResponse.hasTvlChart);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) productDetailsResponse.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, productDetailsResponse.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) productDetailsResponse.tokenAmountTvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, productDetailsResponse.tokenAmountTvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd(productDetailsResponse.faqs, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 60, kSerializerArr[60], productDetailsResponse.faqs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) productDetailsResponse.shareUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, productDetailsResponse.shareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) productDetailsResponse.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, productDetailsResponse.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) productDetailsResponse.utilizationRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, productDetailsResponse.utilizationRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) productDetailsResponse.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, productDetailsResponse.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd(productDetailsResponse.supportedBTCAddressType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 65, kSerializerArr[65], productDetailsResponse.supportedBTCAddressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !productDetailsResponse.hasRate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 66, productDetailsResponse.hasRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !productDetailsResponse.hasRateChart) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 67, productDetailsResponse.hasRateChart);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !productDetailsResponse.hasRatePerformance) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 68, productDetailsResponse.hasRatePerformance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd(productDetailsResponse.productExtInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 69, kSerializerArr[69], productDetailsResponse.productExtInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || productDetailsResponse.headerCountdown != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, InvestHeaderCountdown$$serializer.INSTANCE, productDetailsResponse.headerCountdown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || productDetailsResponse.investmentSubName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, productDetailsResponse.investmentSubName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || !productDetailsResponse.canInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 72, productDetailsResponse.canInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || productDetailsResponse.prompt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, InvestDetailPagePromptInformation$$serializer.INSTANCE, productDetailsResponse.prompt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) productDetailsResponse.unableRedeemReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, productDetailsResponse.unableRedeemReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || productDetailsResponse.hasIpRestriction) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 75, productDetailsResponse.hasIpRestriction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || productDetailsResponse.assetPositionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, kSerializerArr[76], productDetailsResponse.assetPositionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd(productDetailsResponse.rateDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 77, kSerializerArr[77], productDetailsResponse.rateDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd(productDetailsResponse.borrowInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 78, kSerializerArr[78], productDetailsResponse.borrowInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || !Intrinsics.EZpvd(productDetailsResponse.supplyInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 79, kSerializerArr[79], productDetailsResponse.supplyInfoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) && productDetailsResponse.stakingProgress == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 80, productDetailsResponse.stakingProgress);
    }

    public ProductDetailsResponse(Long l, long j, Long l2, Long l3, @NotNull String str, @NotNull List<InvestTokenWithMarketCap> list, boolean z, boolean z2, @NotNull String str2, @NotNull ProductType productType, @NotNull ProtocolType protocolType, @NotNull BtcProtocolType btcProtocolType, @NotNull String str3, @NotNull String str4, @NotNull RateType rateType, @NotNull String str5, @NotNull String str6, boolean z3, boolean z4, @NotNull String str7, @NotNull PoolProtocolType poolProtocolType, @NotNull String str8, @NotNull PaymentOption paymentOption, @NotNull PaymentOption paymentOption2, @NotNull PaymentOption paymentOption3, @NotNull PaymentOption paymentOption4, @NotNull InvestmentKind investmentKind, @NotNull List<InvestUnderlyingToken> list2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, int i, boolean z5, int i2, boolean z6, InvestTipInfoVo investTipInfoVo, boolean z7, @NotNull String str13, @NotNull RateType rateType2, int i3, @NotNull String str14, long j2, @NotNull String str15, @NotNull String str16, @NotNull String str17, InvestApyDetailInfo investApyDetailInfo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull List<InvestLogoBaseVo> list3, @NotNull List<InvestLogoBaseVo> list4, @NotNull List<InvestLogoBaseVo> list5, @NotNull List<InvestLogoBaseVo> list6, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull List<InvestQaVo> list7, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull List<Integer> list8, boolean z9, boolean z10, boolean z11, @NotNull List<InvestTipInfoVo> list9, InvestHeaderCountdown investHeaderCountdown, String str30, boolean z12, InvestDetailPagePromptInformation investDetailPagePromptInformation, @NotNull String str31, boolean z13, InvestAssetPositionType investAssetPositionType, @NotNull List<InvestDetailRate> list10, @NotNull List<BorrowInfo> list11, @NotNull List<SupplyInfo> list12, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(btcProtocolType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(paymentOption2, "");
        Intrinsics.checkNotNullParameter(paymentOption3, "");
        Intrinsics.checkNotNullParameter(paymentOption4, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(rateType2, "");
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
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(list10, "");
        Intrinsics.checkNotNullParameter(list11, "");
        Intrinsics.checkNotNullParameter(list12, "");
        this.aggregateInvestmentId = l;
        this.investmentId = j;
        this.analysisPlatformId = l2;
        this.sourceInvestmentId = l3;
        this.activeInvestmentId = str;
        this.relevantTokens = list;
        this.isInternal = z;
        this.canRedeemFromApp = z2;
        this.dueTime = str2;
        this.productType = productType;
        this.protocolType = protocolType;
        this.btcProtocolType = btcProtocolType;
        this.baseRate = str3;
        this.rate = str4;
        this.rateType = rateType;
        this.rateTypeDesc = str5;
        this.feeRate = str6;
        this.hasBonus = z3;
        this.showBonusInfo = z4;
        this.liquidationRatio = str7;
        this.poolVersion = poolProtocolType;
        this.poolId = str8;
        this.recommendedRedeemPaymentOption = paymentOption;
        this.recommendedInvestPaymentOption = paymentOption2;
        this.redeemPaymentOption = paymentOption3;
        this.investPaymentOption = paymentOption4;
        this.specialProtocolType = investmentKind;
        this.earnedToken = list2;
        this.dailyRoi = str9;
        this.weeklyRoi = str10;
        this.monthlyRoi = str11;
        this.yearlyRoi = str12;
        this.pointTag = i;
        this.canSupportBatchClaim = z5;
        this.canEarnTradingFee = i2;
        this.canEarnPoolReward = z6;
        this.earnedTokenInfo = investTipInfoVo;
        this.hasLossRisk = z7;
        this.lossRate = str13;
        this.lossRateType = rateType2;
        this.ratingTypeId = i3;
        this.ratingName = str14;
        this.chainId = j2;
        this.chainName = str15;
        this.chainLogo = str16;
        this.contractAddress = str17;
        this.apyDetailInfo = investApyDetailInfo;
        this.investmentName = str18;
        this.nickname = str19;
        this.productName = str20;
        this.productLogo = str21;
        this.productUrl = str22;
        this.classification = str23;
        this.middleLogoList = list3;
        this.topLeftLogoList = list4;
        this.topRightLogoList = list5;
        this.bottomRightLogoList = list6;
        this.hasTvlChart = z8;
        this.tvl = str24;
        this.tokenAmountTvl = str25;
        this.faqs = list7;
        this.shareUrl = str26;
        this.currentPrice = str27;
        this.utilizationRate = str28;
        this.subTitle = str29;
        this.supportedBTCAddressType = list8;
        this.hasRate = z9;
        this.hasRateChart = z10;
        this.hasRatePerformance = z11;
        this.productExtInfoList = list9;
        this.headerCountdown = investHeaderCountdown;
        this.investmentSubName = str30;
        this.canInvest = z12;
        this.prompt = investDetailPagePromptInformation;
        this.unableRedeemReason = str31;
        this.hasIpRestriction = z13;
        this.assetPositionType = investAssetPositionType;
        this.rateDetails = list10;
        this.borrowInfoList = list11;
        this.supplyInfoList = list12;
        this.stakingProgress = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductDetailsResponse(Long l, long j, Long l2, Long l3, String str, List list, boolean z, boolean z2, String str2, ProductType productType, ProtocolType protocolType, BtcProtocolType btcProtocolType, String str3, String str4, RateType rateType, String str5, String str6, boolean z3, boolean z4, String str7, PoolProtocolType poolProtocolType, String str8, PaymentOption paymentOption, PaymentOption paymentOption2, PaymentOption paymentOption3, PaymentOption paymentOption4, InvestmentKind investmentKind, List list2, String str9, String str10, String str11, String str12, int i, boolean z5, int i2, boolean z6, InvestTipInfoVo investTipInfoVo, boolean z7, String str13, RateType rateType2, int i3, String str14, long j2, String str15, String str16, String str17, InvestApyDetailInfo investApyDetailInfo, String str18, String str19, String str20, String str21, String str22, String str23, List list3, List list4, List list5, List list6, boolean z8, String str24, String str25, List list7, String str26, String str27, String str28, String str29, List list8, boolean z9, boolean z10, boolean z11, List list9, InvestHeaderCountdown investHeaderCountdown, String str30, boolean z12, InvestDetailPagePromptInformation investDetailPagePromptInformation, String str31, boolean z13, InvestAssetPositionType investAssetPositionType, List list10, List list11, List list12, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4 = (i5 & 1) != 0 ? null : l;
        long j3 = (i5 & 2) != 0 ? 0L : j;
        Long l5 = (i5 & 4) != 0 ? null : l2;
        Long l6 = (i5 & 8) != 0 ? null : l3;
        String str32 = (i5 & 16) != 0 ? "" : str;
        List arrayList = (i5 & 32) != 0 ? new ArrayList() : list;
        boolean z14 = (i5 & 64) != 0 ? true : z;
        boolean z15 = (i5 & 128) != 0 ? true : z2;
        String str33 = (i5 & 256) != 0 ? "" : str2;
        ProductType productType2 = (i5 & 512) != 0 ? ProductType.Save : productType;
        ProtocolType protocolType2 = (i5 & 1024) != 0 ? ProtocolType.Unknown : protocolType;
        BtcProtocolType btcProtocolType2 = (i5 & 2048) != 0 ? BtcProtocolType.Unknown : btcProtocolType;
        String str34 = (i5 & 4096) != 0 ? "" : str3;
        String str35 = (i5 & 8192) != 0 ? "" : str4;
        RateType rateType3 = (i5 & 16384) != 0 ? RateType.APY : rateType;
        String str36 = (i5 & 32768) != 0 ? "" : str5;
        String str37 = (i5 & 65536) != 0 ? "" : str6;
        boolean z16 = (i5 & 131072) != 0 ? false : z3;
        boolean z17 = (i5 & 262144) != 0 ? false : z4;
        String str38 = (i5 & 524288) != 0 ? "" : str7;
        PoolProtocolType poolProtocolType2 = (i5 & 1048576) != 0 ? PoolProtocolType.Unknown : poolProtocolType;
        String str39 = (i5 & 2097152) != 0 ? "" : str8;
        PaymentOption paymentOption5 = (i5 & 4194304) != 0 ? PaymentOption.NotDecided : paymentOption;
        PaymentOption paymentOption6 = (i5 & 8388608) != 0 ? PaymentOption.NotDecided : paymentOption2;
        PaymentOption paymentOption7 = (i5 & 16777216) != 0 ? PaymentOption.NotDecided : paymentOption3;
        PaymentOption paymentOption8 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? PaymentOption.NotDecided : paymentOption4;
        InvestmentKind investmentKind2 = (i5 & 67108864) != 0 ? InvestmentKind.Default : investmentKind;
        List arrayList2 = (i5 & 134217728) != 0 ? new ArrayList() : list2;
        String str40 = (i5 & 268435456) != 0 ? "" : str9;
        String str41 = (i5 & 536870912) != 0 ? "" : str10;
        String str42 = (i5 & 1073741824) != 0 ? "" : str11;
        String str43 = (i5 & Integer.MIN_VALUE) != 0 ? "" : str12;
        this(l4, j3, l5, l6, str32, arrayList, z14, z15, str33, productType2, protocolType2, btcProtocolType2, str34, str35, rateType3, str36, str37, z16, z17, str38, poolProtocolType2, str39, paymentOption5, paymentOption6, paymentOption7, paymentOption8, investmentKind2, arrayList2, str40, str41, str42, str43, (i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? false : z5, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? false : z6, (i6 & 16) != 0 ? null : investTipInfoVo, (i6 & 32) != 0 ? false : z7, (i6 & 64) != 0 ? "" : str13, (i6 & 128) != 0 ? RateType.Unknown : rateType2, (i6 & 256) != 0 ? 0 : i3, (i6 & 512) != 0 ? "" : str14, (i6 & 1024) != 0 ? 0L : j2, (i6 & 2048) != 0 ? "" : str15, (i6 & 4096) != 0 ? "" : str16, (i6 & 8192) != 0 ? "" : str17, (i6 & 16384) != 0 ? null : investApyDetailInfo, (i6 & 32768) != 0 ? "" : str18, (i6 & 65536) != 0 ? "" : str19, (i6 & 131072) != 0 ? "" : str20, (i6 & 262144) != 0 ? "" : str21, (i6 & 524288) != 0 ? "" : str22, (i6 & 1048576) != 0 ? "" : str23, (i6 & 2097152) != 0 ? new ArrayList() : list3, (i6 & 4194304) != 0 ? new ArrayList() : list4, (i6 & 8388608) != 0 ? new ArrayList() : list5, (i6 & 16777216) != 0 ? new ArrayList() : list6, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z8, (i6 & 67108864) != 0 ? "" : str24, (i6 & 134217728) != 0 ? "" : str25, (i6 & 268435456) != 0 ? new ArrayList() : list7, (i6 & 536870912) != 0 ? "" : str26, (i6 & 1073741824) != 0 ? "" : str27, (i6 & Integer.MIN_VALUE) != 0 ? "" : str28, (i7 & 1) != 0 ? "" : str29, (i7 & 2) != 0 ? yDY.AhwBna() : list8, (i7 & 4) != 0 ? true : z9, (i7 & 8) != 0 ? true : z10, (i7 & 16) != 0 ? true : z11, (i7 & 32) != 0 ? yDY.AhwBna() : list9, (i7 & 64) != 0 ? null : investHeaderCountdown, (i7 & 128) != 0 ? null : str30, (i7 & 256) != 0 ? true : z12, (i7 & 512) != 0 ? null : investDetailPagePromptInformation, (i7 & 1024) != 0 ? "" : str31, (i7 & 2048) != 0 ? false : z13, (i7 & 4096) != 0 ? null : investAssetPositionType, (i7 & 8192) != 0 ? yDY.AhwBna() : list10, (i7 & 16384) != 0 ? yDY.AhwBna() : list11, (i7 & 32768) != 0 ? yDY.AhwBna() : list12, (i7 & 65536) == 0 ? i4 : 0);
    }
}

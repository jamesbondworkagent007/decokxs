package com.okinc.crcore.coreapi.net.responsebean.dex;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LatestInfoResponseBean {
    private final String chainBWLogoUrl;
    private final String chainLogoUrl;
    private final String chainName;
    private final String change;
    private final String circulatingSupply;
    private final String devHoldingRatio;
    private String errorCode;
    private final String holders;
    private final String isCollected;
    private final String isCustomToken;
    private final String isNotSupportTxNativeToken;
    private final String isSubscribe;
    private final String isSupportBlinksShareUrl;
    private final String isSupportHolder;
    private final String isSupportHolderExpandData;
    private final String isSupportMarketCapKline;
    private final String isTxPrice;
    private final String liquidity;
    private final String marketCap;
    private final String maxPrice;
    private final String minPrice;
    private final String moduleType;
    private final String nativeTokenSymbol;
    private final String price;
    private final String riskControlLevel;
    private final String snipersClear;
    private final String snipersTotal;
    private final String supportTrader;
    private final String suspiciousRatio;
    private final String tokenContractAddress;
    private final String tokenLargeLogoUrl;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;
    private final String top10HoldAmountPercentage;
    private final String tradeNum;
    private final String volume;
    private final String wrapperTokenContractAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LatestInfoResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenLargeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.wrapperTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.isSupportBlinksShareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.isSupportHolder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.supportTrader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.isSupportMarketCapKline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.isSupportHolderExpandData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isCollected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.isNotSupportTxNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.isTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38) {
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
        return new LatestInfoResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestInfoResponseBean)) {
            return false;
        }
        LatestInfoResponseBean latestInfoResponseBean = (LatestInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) latestInfoResponseBean.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) latestInfoResponseBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) latestInfoResponseBean.chainName) && Intrinsics.EZpvd((Object) this.change, (Object) latestInfoResponseBean.change) && Intrinsics.EZpvd((Object) this.isCollected, (Object) latestInfoResponseBean.isCollected) && Intrinsics.EZpvd((Object) this.isCustomToken, (Object) latestInfoResponseBean.isCustomToken) && Intrinsics.EZpvd((Object) this.isNotSupportTxNativeToken, (Object) latestInfoResponseBean.isNotSupportTxNativeToken) && Intrinsics.EZpvd((Object) this.isSubscribe, (Object) latestInfoResponseBean.isSubscribe) && Intrinsics.EZpvd((Object) this.isTxPrice, (Object) latestInfoResponseBean.isTxPrice) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) latestInfoResponseBean.maxPrice) && Intrinsics.EZpvd((Object) this.minPrice, (Object) latestInfoResponseBean.minPrice) && Intrinsics.EZpvd((Object) this.price, (Object) latestInfoResponseBean.price) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) latestInfoResponseBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) latestInfoResponseBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenLargeLogoUrl, (Object) latestInfoResponseBean.tokenLargeLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) latestInfoResponseBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) latestInfoResponseBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) latestInfoResponseBean.tradeNum) && Intrinsics.EZpvd((Object) this.volume, (Object) latestInfoResponseBean.volume) && Intrinsics.EZpvd((Object) this.errorCode, (Object) latestInfoResponseBean.errorCode) && Intrinsics.EZpvd((Object) this.wrapperTokenContractAddress, (Object) latestInfoResponseBean.wrapperTokenContractAddress) && Intrinsics.EZpvd((Object) this.isSupportBlinksShareUrl, (Object) latestInfoResponseBean.isSupportBlinksShareUrl) && Intrinsics.EZpvd((Object) this.moduleType, (Object) latestInfoResponseBean.moduleType) && Intrinsics.EZpvd((Object) this.isSupportHolder, (Object) latestInfoResponseBean.isSupportHolder) && Intrinsics.EZpvd((Object) this.supportTrader, (Object) latestInfoResponseBean.supportTrader) && Intrinsics.EZpvd((Object) this.marketCap, (Object) latestInfoResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.isSupportMarketCapKline, (Object) latestInfoResponseBean.isSupportMarketCapKline) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) latestInfoResponseBean.circulatingSupply) && Intrinsics.EZpvd((Object) this.liquidity, (Object) latestInfoResponseBean.liquidity) && Intrinsics.EZpvd((Object) this.top10HoldAmountPercentage, (Object) latestInfoResponseBean.top10HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.holders, (Object) latestInfoResponseBean.holders) && Intrinsics.EZpvd((Object) this.isSupportHolderExpandData, (Object) latestInfoResponseBean.isSupportHolderExpandData) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) latestInfoResponseBean.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) latestInfoResponseBean.devHoldingRatio) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) latestInfoResponseBean.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) latestInfoResponseBean.snipersTotal) && Intrinsics.EZpvd((Object) this.suspiciousRatio, (Object) latestInfoResponseBean.suspiciousRatio) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) latestInfoResponseBean.riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldingRatio() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolders() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPrice() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersClear() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersTotal() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportTrader() {
        return this.supportTrader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspiciousRatio() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLargeLogoUrl() {
        return this.tokenLargeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldAmountPercentage() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeNum() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrapperTokenContractAddress() {
        return this.wrapperTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainBWLogoUrl.hashCode() * 31) + this.chainLogoUrl.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.change.hashCode()) * 31) + this.isCollected.hashCode()) * 31) + this.isCustomToken.hashCode()) * 31) + this.isNotSupportTxNativeToken.hashCode()) * 31) + this.isSubscribe.hashCode()) * 31) + this.isTxPrice.hashCode()) * 31) + this.maxPrice.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + this.price.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenLargeLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tradeNum.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.wrapperTokenContractAddress.hashCode()) * 31) + this.isSupportBlinksShareUrl.hashCode()) * 31) + this.moduleType.hashCode()) * 31) + this.isSupportHolder.hashCode()) * 31) + this.supportTrader.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.isSupportMarketCapKline.hashCode()) * 31) + this.circulatingSupply.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.top10HoldAmountPercentage.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.isSupportHolderExpandData.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.snipersClear.hashCode()) * 31) + this.snipersTotal.hashCode()) * 31) + this.suspiciousRatio.hashCode()) * 31) + this.riskControlLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isCollected() {
        return this.isCollected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isCustomToken() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNotSupportTxNativeToken() {
        return this.isNotSupportTxNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSubscribe() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportBlinksShareUrl() {
        return this.isSupportBlinksShareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportHolder() {
        return this.isSupportHolder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportHolderExpandData() {
        return this.isSupportHolderExpandData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportMarketCapKline() {
        return this.isSupportMarketCapKline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isTxPrice() {
        return this.isTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LatestInfoResponseBean(chainBWLogoUrl=" + this.chainBWLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", change=" + this.change + ", isCollected=" + this.isCollected + ", isCustomToken=" + this.isCustomToken + ", isNotSupportTxNativeToken=" + this.isNotSupportTxNativeToken + ", isSubscribe=" + this.isSubscribe + ", isTxPrice=" + this.isTxPrice + ", maxPrice=" + this.maxPrice + ", minPrice=" + this.minPrice + ", price=" + this.price + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenLargeLogoUrl=" + this.tokenLargeLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tradeNum=" + this.tradeNum + ", volume=" + this.volume + ", errorCode=" + this.errorCode + ", wrapperTokenContractAddress=" + this.wrapperTokenContractAddress + ", isSupportBlinksShareUrl=" + this.isSupportBlinksShareUrl + ", moduleType=" + this.moduleType + ", isSupportHolder=" + this.isSupportHolder + ", supportTrader=" + this.supportTrader + ", marketCap=" + this.marketCap + ", isSupportMarketCapKline=" + this.isSupportMarketCapKline + ", circulatingSupply=" + this.circulatingSupply + ", liquidity=" + this.liquidity + ", top10HoldAmountPercentage=" + this.top10HoldAmountPercentage + ", holders=" + this.holders + ", isSupportHolderExpandData=" + this.isSupportHolderExpandData + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", devHoldingRatio=" + this.devHoldingRatio + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", suspiciousRatio=" + this.suspiciousRatio + ", riskControlLevel=" + this.riskControlLevel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.LatestInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LatestInfoResponseBean> serializer() {
            return LatestInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LatestInfoResponseBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str;
        }
        if ((i & 2) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.change = "";
        } else {
            this.change = str4;
        }
        if ((i & 16) == 0) {
            this.isCollected = "";
        } else {
            this.isCollected = str5;
        }
        if ((i & 32) == 0) {
            this.isCustomToken = "";
        } else {
            this.isCustomToken = str6;
        }
        if ((i & 64) == 0) {
            this.isNotSupportTxNativeToken = "";
        } else {
            this.isNotSupportTxNativeToken = str7;
        }
        if ((i & 128) == 0) {
            this.isSubscribe = "";
        } else {
            this.isSubscribe = str8;
        }
        if ((i & 256) == 0) {
            this.isTxPrice = "";
        } else {
            this.isTxPrice = str9;
        }
        if ((i & 512) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str11;
        }
        if ((i & 2048) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((i & 4096) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str13;
        }
        if ((i & 8192) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str14;
        }
        if ((i & 16384) == 0) {
            this.tokenLargeLogoUrl = "";
        } else {
            this.tokenLargeLogoUrl = str15;
        }
        if ((32768 & i) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str16;
        }
        if ((65536 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str17;
        }
        if ((131072 & i) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str18;
        }
        if ((262144 & i) == 0) {
            this.volume = "";
        } else {
            this.volume = str19;
        }
        if ((524288 & i) == 0) {
            this.errorCode = "0";
        } else {
            this.errorCode = str20;
        }
        if ((1048576 & i) == 0) {
            this.wrapperTokenContractAddress = "";
        } else {
            this.wrapperTokenContractAddress = str21;
        }
        if ((2097152 & i) == 0) {
            this.isSupportBlinksShareUrl = "0";
        } else {
            this.isSupportBlinksShareUrl = str22;
        }
        if ((4194304 & i) == 0) {
            this.moduleType = "";
        } else {
            this.moduleType = str23;
        }
        if ((8388608 & i) == 0) {
            this.isSupportHolder = "0";
        } else {
            this.isSupportHolder = str24;
        }
        if ((16777216 & i) == 0) {
            this.supportTrader = "0";
        } else {
            this.supportTrader = str25;
        }
        if ((33554432 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str26;
        }
        if ((67108864 & i) == 0) {
            this.isSupportMarketCapKline = "0";
        } else {
            this.isSupportMarketCapKline = str27;
        }
        if ((134217728 & i) == 0) {
            this.circulatingSupply = "";
        } else {
            this.circulatingSupply = str28;
        }
        if ((268435456 & i) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str29;
        }
        if ((536870912 & i) == 0) {
            this.top10HoldAmountPercentage = "";
        } else {
            this.top10HoldAmountPercentage = str30;
        }
        if ((1073741824 & i) == 0) {
            this.holders = "";
        } else {
            this.holders = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isSupportHolderExpandData = "0";
        } else {
            this.isSupportHolderExpandData = str32;
        }
        if ((i2 & 1) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str33;
        }
        if ((i2 & 2) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str34;
        }
        if ((i2 & 4) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str35;
        }
        if ((i2 & 8) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str36;
        }
        if ((i2 & 16) == 0) {
            this.suspiciousRatio = "";
        } else {
            this.suspiciousRatio = str37;
        }
        if ((i2 & 32) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str38;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LatestInfoResponseBean latestInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, latestInfoResponseBean.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, latestInfoResponseBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, latestInfoResponseBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, latestInfoResponseBean.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isCollected, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, latestInfoResponseBean.isCollected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isCustomToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, latestInfoResponseBean.isCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isNotSupportTxNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, latestInfoResponseBean.isNotSupportTxNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isSubscribe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, latestInfoResponseBean.isSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isTxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, latestInfoResponseBean.isTxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, latestInfoResponseBean.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, latestInfoResponseBean.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, latestInfoResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, latestInfoResponseBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, latestInfoResponseBean.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tokenLargeLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, latestInfoResponseBean.tokenLargeLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, latestInfoResponseBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, latestInfoResponseBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, latestInfoResponseBean.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, latestInfoResponseBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.errorCode, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, latestInfoResponseBean.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.wrapperTokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, latestInfoResponseBean.wrapperTokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isSupportBlinksShareUrl, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, latestInfoResponseBean.isSupportBlinksShareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.moduleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, latestInfoResponseBean.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isSupportHolder, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, latestInfoResponseBean.isSupportHolder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.supportTrader, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, latestInfoResponseBean.supportTrader);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, latestInfoResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isSupportMarketCapKline, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, latestInfoResponseBean.isSupportMarketCapKline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.circulatingSupply, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, latestInfoResponseBean.circulatingSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, latestInfoResponseBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.top10HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, latestInfoResponseBean.top10HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, latestInfoResponseBean.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.isSupportHolderExpandData, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, latestInfoResponseBean.isSupportHolderExpandData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, latestInfoResponseBean.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, latestInfoResponseBean.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, latestInfoResponseBean.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, latestInfoResponseBean.snipersTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) latestInfoResponseBean.suspiciousRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, latestInfoResponseBean.suspiciousRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) && Intrinsics.EZpvd((Object) latestInfoResponseBean.riskControlLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 37, latestInfoResponseBean.riskControlLevel);
    }

    public LatestInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38) {
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
        this.chainBWLogoUrl = str;
        this.chainLogoUrl = str2;
        this.chainName = str3;
        this.change = str4;
        this.isCollected = str5;
        this.isCustomToken = str6;
        this.isNotSupportTxNativeToken = str7;
        this.isSubscribe = str8;
        this.isTxPrice = str9;
        this.maxPrice = str10;
        this.minPrice = str11;
        this.price = str12;
        this.tokenContractAddress = str13;
        this.tokenLogoUrl = str14;
        this.tokenLargeLogoUrl = str15;
        this.tokenName = str16;
        this.tokenSymbol = str17;
        this.tradeNum = str18;
        this.volume = str19;
        this.errorCode = str20;
        this.wrapperTokenContractAddress = str21;
        this.isSupportBlinksShareUrl = str22;
        this.moduleType = str23;
        this.isSupportHolder = str24;
        this.supportTrader = str25;
        this.marketCap = str26;
        this.isSupportMarketCapKline = str27;
        this.circulatingSupply = str28;
        this.liquidity = str29;
        this.top10HoldAmountPercentage = str30;
        this.holders = str31;
        this.isSupportHolderExpandData = str32;
        this.nativeTokenSymbol = str33;
        this.devHoldingRatio = str34;
        this.snipersClear = str35;
        this.snipersTotal = str36;
        this.suspiciousRatio = str37;
        this.riskControlLevel = str38;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01bf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r77v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r77v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r77v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r77v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r77v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r77v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r77v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r77v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r77v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r77v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r77v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r77v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r77v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("0") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r77v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r77v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("0") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r77v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("0") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r77v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("0") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r77v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r77v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("0") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r77v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r77v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r77v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r77v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) == (0 int)) ? (r70v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0156: ARITH (r78v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015f: ARITH (r78v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0168: ARITH (r78v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.dex.LatestInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LatestInfoResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "0" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "0" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "0" : str24, (i & 16777216) != 0 ? "0" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "0" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) == 0 ? str32 : "0", (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38);
    }
}

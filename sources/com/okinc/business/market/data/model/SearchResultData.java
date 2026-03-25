package com.okinc.business.market.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.market.common.constants.RiskControlLevel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SearchResultData {
    private String chainId;
    private String chainLogoUrl;
    private String chainName;
    private String change;
    private String collectionToken;
    private String explorerUrl;
    private String holderAmount;
    private String isCustomToken;
    private String isNativeToken;
    private String liquidity;
    private String marketCap;
    private String matchType;
    private final List<CompactTagData> newTagList;
    private String price;
    private final RiskControlLevel riskControlLevel;
    private String tokenContractAddress;
    private String tokenLogoUrl;
    private String tokenName;
    private SupportMemeModeBean tokenSupportTradeModeVO;
    private String tokenSymbol;
    private String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RiskControlLevel.Companion.serializer(), new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchResultData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SupportMemeModeBean) null, (String) null, (String) null, (RiskControlLevel) null, (List) null, 2097151, (DefaultConstructorMarker) null);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("chainLogoUrl")
    public static /* synthetic */ void getChainLogoUrl$annotations() {
    }

    @SerialName("chainName")
    public static /* synthetic */ void getChainName$annotations() {
    }

    @SerialName("change")
    public static /* synthetic */ void getChange$annotations() {
    }

    @SerialName("collectionToken")
    public static /* synthetic */ void getCollectionToken$annotations() {
    }

    @SerialName("explorerUrl")
    public static /* synthetic */ void getExplorerUrl$annotations() {
    }

    @SerialName("holderAmount")
    public static /* synthetic */ void getHolderAmount$annotations() {
    }

    @SerialName("liquidity")
    public static /* synthetic */ void getLiquidity$annotations() {
    }

    @SerialName("marketCap")
    public static /* synthetic */ void getMarketCap$annotations() {
    }

    @SerialName("matchType")
    public static /* synthetic */ void getMatchType$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.PRICE)
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("riskControlLevel")
    public static /* synthetic */ void getRiskControlLevel$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("tokenLogoUrl")
    public static /* synthetic */ void getTokenLogoUrl$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenSupportTradeModeVO")
    public static /* synthetic */ void getTokenSupportTradeModeVO$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("volume")
    public static /* synthetic */ void getVolume$annotations() {
    }

    @SerialName("isCustomToken")
    public static /* synthetic */ void isCustomToken$annotations() {
    }

    @SerialName("isNativeToken")
    public static /* synthetic */ void isNativeToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportMemeModeBean component17() {
        return this.tokenSupportTradeModeVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.holderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskControlLevel component20() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component21() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.collectionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SupportMemeModeBean supportMemeModeBean, String str17, String str18, @NotNull RiskControlLevel riskControlLevel, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SearchResultData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, supportMemeModeBean, str17, str18, riskControlLevel, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultData)) {
            return false;
        }
        SearchResultData searchResultData = (SearchResultData) obj;
        return Intrinsics.EZpvd((Object) this.liquidity, (Object) searchResultData.liquidity) && Intrinsics.EZpvd((Object) this.matchType, (Object) searchResultData.matchType) && Intrinsics.EZpvd((Object) this.collectionToken, (Object) searchResultData.collectionToken) && Intrinsics.EZpvd((Object) this.chainId, (Object) searchResultData.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) searchResultData.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) searchResultData.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) searchResultData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) searchResultData.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) searchResultData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) searchResultData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) searchResultData.explorerUrl) && Intrinsics.EZpvd((Object) this.price, (Object) searchResultData.price) && Intrinsics.EZpvd((Object) this.volume, (Object) searchResultData.volume) && Intrinsics.EZpvd((Object) this.change, (Object) searchResultData.change) && Intrinsics.EZpvd((Object) this.isCustomToken, (Object) searchResultData.isCustomToken) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) searchResultData.isNativeToken) && Intrinsics.EZpvd(this.tokenSupportTradeModeVO, searchResultData.tokenSupportTradeModeVO) && Intrinsics.EZpvd((Object) this.marketCap, (Object) searchResultData.marketCap) && Intrinsics.EZpvd((Object) this.holderAmount, (Object) searchResultData.holderAmount) && this.riskControlLevel == searchResultData.riskControlLevel && Intrinsics.EZpvd(this.newTagList, searchResultData.newTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
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
    public final String getCollectionToken() {
        return this.collectionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAmount() {
        return this.holderAmount;
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
    public final String getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskControlLevel getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
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
    public final SupportMemeModeBean getTokenSupportTradeModeVO() {
        return this.tokenSupportTradeModeVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.liquidity;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.matchType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.collectionToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.chainName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chainLogoUrl;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenSymbol;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenName;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tokenContractAddress;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tokenLogoUrl;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.explorerUrl;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.price;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.volume;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.change;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.isCustomToken;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.isNativeToken;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        SupportMemeModeBean supportMemeModeBean = this.tokenSupportTradeModeVO;
        int iHashCode17 = supportMemeModeBean == null ? 0 : supportMemeModeBean.hashCode();
        String str17 = this.marketCap;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.holderAmount;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str18 == null ? 0 : str18.hashCode())) * 31) + this.riskControlLevel.hashCode()) * 31) + this.newTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isCustomToken() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(String str) {
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChange(String str) {
        this.change = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectionToken(String str) {
        this.collectionToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomToken(String str) {
        this.isCustomToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(String str) {
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHolderAmount(String str) {
        this.holderAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidity(String str) {
        this.liquidity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCap(String str) {
        this.marketCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMatchType(String str) {
        this.matchType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeToken(String str) {
        this.isNativeToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(String str) {
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogoUrl(String str) {
        this.tokenLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSupportTradeModeVO(SupportMemeModeBean supportMemeModeBean) {
        this.tokenSupportTradeModeVO = supportMemeModeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolume(String str) {
        this.volume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchResultData(liquidity=" + this.liquidity + ", matchType=" + this.matchType + ", collectionToken=" + this.collectionToken + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", explorerUrl=" + this.explorerUrl + ", price=" + this.price + ", volume=" + this.volume + ", change=" + this.change + ", isCustomToken=" + this.isCustomToken + ", isNativeToken=" + this.isNativeToken + ", tokenSupportTradeModeVO=" + this.tokenSupportTradeModeVO + ", marketCap=" + this.marketCap + ", holderAmount=" + this.holderAmount + ", riskControlLevel=" + this.riskControlLevel + ", newTagList=" + this.newTagList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.SearchResultData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchResultData> serializer() {
            return SearchResultData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchResultData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SupportMemeModeBean supportMemeModeBean, String str17, String str18, RiskControlLevel riskControlLevel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str;
        }
        if ((i & 2) == 0) {
            this.matchType = "";
        } else {
            this.matchType = str2;
        }
        if ((i & 4) == 0) {
            this.collectionToken = "";
        } else {
            this.collectionToken = str3;
        }
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str4;
        }
        if ((i & 16) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str5;
        }
        if ((i & 32) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str6;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str7;
        }
        if ((i & 128) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str8;
        }
        if ((i & 256) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str9;
        }
        if ((i & 512) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str10;
        }
        if ((i & 1024) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str11;
        }
        if ((i & 2048) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((i & 4096) == 0) {
            this.volume = "";
        } else {
            this.volume = str13;
        }
        if ((i & 8192) == 0) {
            this.change = "";
        } else {
            this.change = str14;
        }
        if ((i & 16384) == 0) {
            this.isCustomToken = "";
        } else {
            this.isCustomToken = str15;
        }
        if ((32768 & i) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str16;
        }
        this.tokenSupportTradeModeVO = (65536 & i) == 0 ? null : supportMemeModeBean;
        if ((131072 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str17;
        }
        if ((262144 & i) == 0) {
            this.holderAmount = "";
        } else {
            this.holderAmount = str18;
        }
        this.riskControlLevel = (524288 & i) == 0 ? RiskControlLevel.UNKNOWN : riskControlLevel;
        this.newTagList = (i & 1048576) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SearchResultData searchResultData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) searchResultData.liquidity, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchResultData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchResultData.matchType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchResultData.matchType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) searchResultData.collectionToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, searchResultData.collectionToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) searchResultData.chainId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, searchResultData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) searchResultData.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, searchResultData.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) searchResultData.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, searchResultData.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) searchResultData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, searchResultData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) searchResultData.tokenName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, searchResultData.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) searchResultData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, searchResultData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) searchResultData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, searchResultData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) searchResultData.explorerUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, searchResultData.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) searchResultData.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, searchResultData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) searchResultData.volume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, searchResultData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) searchResultData.change, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, searchResultData.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) searchResultData.isCustomToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, searchResultData.isCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) searchResultData.isNativeToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, searchResultData.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || searchResultData.tokenSupportTradeModeVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, SupportMemeModeBean$$serializer.INSTANCE, searchResultData.tokenSupportTradeModeVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) searchResultData.marketCap, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, searchResultData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) searchResultData.holderAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, searchResultData.holderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || searchResultData.riskControlLevel != RiskControlLevel.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], searchResultData.riskControlLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd(searchResultData.newTagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], searchResultData.newTagList);
    }

    public SearchResultData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SupportMemeModeBean supportMemeModeBean, String str17, String str18, @NotNull RiskControlLevel riskControlLevel, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.liquidity = str;
        this.matchType = str2;
        this.collectionToken = str3;
        this.chainId = str4;
        this.chainName = str5;
        this.chainLogoUrl = str6;
        this.tokenSymbol = str7;
        this.tokenName = str8;
        this.tokenContractAddress = str9;
        this.tokenLogoUrl = str10;
        this.explorerUrl = str11;
        this.price = str12;
        this.volume = str13;
        this.change = str14;
        this.isCustomToken = str15;
        this.isNativeToken = str16;
        this.tokenSupportTradeModeVO = supportMemeModeBean;
        this.marketCap = str17;
        this.holderAmount = str18;
        this.riskControlLevel = riskControlLevel;
        this.newTagList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.SupportMemeModeBean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.SupportMemeModeBean) : (r39v0 com.okinc.business.market.data.model.SupportMemeModeBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.RiskControlLevel:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b2: SGET  A[WRAPPED] (LINE:50) com.okinc.business.market.common.constants.RiskControlLevel.UNKNOWN com.okinc.business.market.common.constants.RiskControlLevel) : (r42v0 com.okinc.business.market.common.constants.RiskControlLevel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bd: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r43v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.SupportMemeModeBean, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, java.util.List<com.okinc.business.market.data.model.CompactTagData>):void (m)] (LINE:10) call: com.okinc.business.market.data.model.SearchResultData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.SupportMemeModeBean, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, java.util.List):void type: THIS */
    public /* synthetic */ SearchResultData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SupportMemeModeBean supportMemeModeBean, String str17, String str18, RiskControlLevel riskControlLevel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? null : supportMemeModeBean, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? RiskControlLevel.UNKNOWN : riskControlLevel, (i & 1048576) != 0 ? yDY.AhwBna() : list);
    }
}

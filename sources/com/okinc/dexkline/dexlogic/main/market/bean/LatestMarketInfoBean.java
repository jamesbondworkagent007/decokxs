package com.okinc.dexkline.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.CompactTagData$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LatestMarketInfoBean implements Parcelable {
    private final BubbleMapData bubbleMapInfo;
    private final String chainBWLogoUrl;
    private final String chainLogoUrl;
    private final String chainName;
    private final String change;
    private final String changeUtc0;
    private final String changeUtc8;
    private final String circulatingSupply;
    private final String devHoldingRatio;
    private final EarlyBuyerInfoData earlyBuyerStatisticsInfo;
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
    private final List<CompactTagData> newTagList;
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
    public static final Parcelable.Creator<LatestMarketInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<LatestMarketInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestMarketInfoBean createFromParcel(Parcel parcel) {
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
            EarlyBuyerInfoData earlyBuyerInfoDataCreateFromParcel = EarlyBuyerInfoData.CREATOR.createFromParcel(parcel);
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(CompactTagData.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new LatestMarketInfoBean(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, earlyBuyerInfoDataCreateFromParcel, string34, string35, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), BubbleMapData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestMarketInfoBean[] newArray(int i) {
            return new LatestMarketInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LatestMarketInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, -1, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("tokenThirdPartInfo")
    public static /* synthetic */ void getBubbleMapInfo$annotations() {
    }

    @SerialName("chainBWLogoUrl")
    public static /* synthetic */ void getChainBWLogoUrl$annotations() {
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

    @SerialName("changeUtc0")
    public static /* synthetic */ void getChangeUtc0$annotations() {
    }

    @SerialName("changeUtc8")
    public static /* synthetic */ void getChangeUtc8$annotations() {
    }

    @SerialName("circulatingSupply")
    public static /* synthetic */ void getCirculatingSupply$annotations() {
    }

    @SerialName("devHoldingRatio")
    public static /* synthetic */ void getDevHoldingRatio$annotations() {
    }

    @SerialName("earlyBuyerStatisticsInfo")
    public static /* synthetic */ void getEarlyBuyerStatisticsInfo$annotations() {
    }

    @SerialName("errorCode")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @SerialName("holders")
    public static /* synthetic */ void getHolders$annotations() {
    }

    @SerialName("liquidity")
    public static /* synthetic */ void getLiquidity$annotations() {
    }

    @SerialName("marketCap")
    public static /* synthetic */ void getMarketCap$annotations() {
    }

    @SerialName("maxPrice")
    public static /* synthetic */ void getMaxPrice$annotations() {
    }

    @SerialName("minPrice")
    public static /* synthetic */ void getMinPrice$annotations() {
    }

    @SerialName("moduleType")
    public static /* synthetic */ void getModuleType$annotations() {
    }

    @SerialName("nativeTokenSymbol")
    public static /* synthetic */ void getNativeTokenSymbol$annotations() {
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

    @SerialName("snipersClear")
    public static /* synthetic */ void getSnipersClear$annotations() {
    }

    @SerialName("snipersTotal")
    public static /* synthetic */ void getSnipersTotal$annotations() {
    }

    @SerialName("supportTrader")
    public static /* synthetic */ void getSupportTrader$annotations() {
    }

    @SerialName("suspiciousRatio")
    public static /* synthetic */ void getSuspiciousRatio$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("tokenLargeLogoUrl")
    public static /* synthetic */ void getTokenLargeLogoUrl$annotations() {
    }

    @SerialName("tokenLogoUrl")
    public static /* synthetic */ void getTokenLogoUrl$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("top10HoldAmountPercentage")
    public static /* synthetic */ void getTop10HoldAmountPercentage$annotations() {
    }

    @SerialName("tradeNum")
    public static /* synthetic */ void getTradeNum$annotations() {
    }

    @SerialName("volume")
    public static /* synthetic */ void getVolume$annotations() {
    }

    @SerialName("wrapperTokenContractAddress")
    public static /* synthetic */ void getWrapperTokenContractAddress$annotations() {
    }

    @SerialName("isCollected")
    public static /* synthetic */ void isCollected$annotations() {
    }

    @SerialName("isCustomToken")
    public static /* synthetic */ void isCustomToken$annotations() {
    }

    @SerialName("isNotSupportTxNativeToken")
    public static /* synthetic */ void isNotSupportTxNativeToken$annotations() {
    }

    @SerialName("isSubscribe")
    public static /* synthetic */ void isSubscribe$annotations() {
    }

    @SerialName("isSupportBlinksShareUrl")
    public static /* synthetic */ void isSupportBlinksShareUrl$annotations() {
    }

    @SerialName("isSupportHolder")
    public static /* synthetic */ void isSupportHolder$annotations() {
    }

    @SerialName("isSupportHolderExpandData")
    public static /* synthetic */ void isSupportHolderExpandData$annotations() {
    }

    @SerialName("isSupportMarketCapKline")
    public static /* synthetic */ void isSupportMarketCapKline$annotations() {
    }

    @SerialName("isTxPrice")
    public static /* synthetic */ void isTxPrice$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.isTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenLargeLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.wrapperTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.isSupportBlinksShareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.isSupportHolder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.supportTrader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.isSupportMarketCapKline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyerInfoData component34() {
        return this.earlyBuyerStatisticsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.isSupportHolderExpandData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component37() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BubbleMapData component42() {
        return this.bubbleMapInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changeUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.isCollected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.isNotSupportTxNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestMarketInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull EarlyBuyerInfoData earlyBuyerInfoData, @NotNull String str34, @NotNull String str35, @NotNull List<CompactTagData> list, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull BubbleMapData bubbleMapData, @NotNull String str40) {
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
        Intrinsics.checkNotNullParameter(earlyBuyerInfoData, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(bubbleMapData, "");
        Intrinsics.checkNotNullParameter(str40, "");
        return new LatestMarketInfoBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, earlyBuyerInfoData, str34, str35, list, str36, str37, str38, str39, bubbleMapData, str40);
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
        if (!(obj instanceof LatestMarketInfoBean)) {
            return false;
        }
        LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) latestMarketInfoBean.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) latestMarketInfoBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) latestMarketInfoBean.chainName) && Intrinsics.EZpvd((Object) this.change, (Object) latestMarketInfoBean.change) && Intrinsics.EZpvd((Object) this.changeUtc0, (Object) latestMarketInfoBean.changeUtc0) && Intrinsics.EZpvd((Object) this.changeUtc8, (Object) latestMarketInfoBean.changeUtc8) && Intrinsics.EZpvd((Object) this.isCollected, (Object) latestMarketInfoBean.isCollected) && Intrinsics.EZpvd((Object) this.isCustomToken, (Object) latestMarketInfoBean.isCustomToken) && Intrinsics.EZpvd((Object) this.isNotSupportTxNativeToken, (Object) latestMarketInfoBean.isNotSupportTxNativeToken) && Intrinsics.EZpvd((Object) this.isSubscribe, (Object) latestMarketInfoBean.isSubscribe) && Intrinsics.EZpvd((Object) this.isTxPrice, (Object) latestMarketInfoBean.isTxPrice) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) latestMarketInfoBean.maxPrice) && Intrinsics.EZpvd((Object) this.minPrice, (Object) latestMarketInfoBean.minPrice) && Intrinsics.EZpvd((Object) this.price, (Object) latestMarketInfoBean.price) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) latestMarketInfoBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) latestMarketInfoBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenLargeLogoUrl, (Object) latestMarketInfoBean.tokenLargeLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) latestMarketInfoBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) latestMarketInfoBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) latestMarketInfoBean.tradeNum) && Intrinsics.EZpvd((Object) this.volume, (Object) latestMarketInfoBean.volume) && Intrinsics.EZpvd((Object) this.errorCode, (Object) latestMarketInfoBean.errorCode) && Intrinsics.EZpvd((Object) this.wrapperTokenContractAddress, (Object) latestMarketInfoBean.wrapperTokenContractAddress) && Intrinsics.EZpvd((Object) this.isSupportBlinksShareUrl, (Object) latestMarketInfoBean.isSupportBlinksShareUrl) && Intrinsics.EZpvd((Object) this.moduleType, (Object) latestMarketInfoBean.moduleType) && Intrinsics.EZpvd((Object) this.isSupportHolder, (Object) latestMarketInfoBean.isSupportHolder) && Intrinsics.EZpvd((Object) this.supportTrader, (Object) latestMarketInfoBean.supportTrader) && Intrinsics.EZpvd((Object) this.marketCap, (Object) latestMarketInfoBean.marketCap) && Intrinsics.EZpvd((Object) this.isSupportMarketCapKline, (Object) latestMarketInfoBean.isSupportMarketCapKline) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) latestMarketInfoBean.circulatingSupply) && Intrinsics.EZpvd((Object) this.liquidity, (Object) latestMarketInfoBean.liquidity) && Intrinsics.EZpvd((Object) this.top10HoldAmountPercentage, (Object) latestMarketInfoBean.top10HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.holders, (Object) latestMarketInfoBean.holders) && Intrinsics.EZpvd(this.earlyBuyerStatisticsInfo, latestMarketInfoBean.earlyBuyerStatisticsInfo) && Intrinsics.EZpvd((Object) this.isSupportHolderExpandData, (Object) latestMarketInfoBean.isSupportHolderExpandData) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) latestMarketInfoBean.nativeTokenSymbol) && Intrinsics.EZpvd(this.newTagList, latestMarketInfoBean.newTagList) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) latestMarketInfoBean.devHoldingRatio) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) latestMarketInfoBean.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) latestMarketInfoBean.snipersTotal) && Intrinsics.EZpvd((Object) this.suspiciousRatio, (Object) latestMarketInfoBean.suspiciousRatio) && Intrinsics.EZpvd(this.bubbleMapInfo, latestMarketInfoBean.bubbleMapInfo) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) latestMarketInfoBean.riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BubbleMapData getBubbleMapInfo() {
        return this.bubbleMapInfo;
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
    public final String getChangeUtc0() {
        return this.changeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeUtc8() {
        return this.changeUtc8;
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
    public final EarlyBuyerInfoData getEarlyBuyerStatisticsInfo() {
        return this.earlyBuyerStatisticsInfo;
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
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainBWLogoUrl.hashCode() * 31) + this.chainLogoUrl.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.change.hashCode()) * 31) + this.changeUtc0.hashCode()) * 31) + this.changeUtc8.hashCode()) * 31) + this.isCollected.hashCode()) * 31) + this.isCustomToken.hashCode()) * 31) + this.isNotSupportTxNativeToken.hashCode()) * 31) + this.isSubscribe.hashCode()) * 31) + this.isTxPrice.hashCode()) * 31) + this.maxPrice.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + this.price.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenLargeLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tradeNum.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.wrapperTokenContractAddress.hashCode()) * 31) + this.isSupportBlinksShareUrl.hashCode()) * 31) + this.moduleType.hashCode()) * 31) + this.isSupportHolder.hashCode()) * 31) + this.supportTrader.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.isSupportMarketCapKline.hashCode()) * 31) + this.circulatingSupply.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.top10HoldAmountPercentage.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.earlyBuyerStatisticsInfo.hashCode()) * 31) + this.isSupportHolderExpandData.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.newTagList.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.snipersClear.hashCode()) * 31) + this.snipersTotal.hashCode()) * 31) + this.suspiciousRatio.hashCode()) * 31) + this.bubbleMapInfo.hashCode()) * 31) + this.riskControlLevel.hashCode();
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
        return "LatestMarketInfoBean(chainBWLogoUrl=" + this.chainBWLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", change=" + this.change + ", changeUtc0=" + this.changeUtc0 + ", changeUtc8=" + this.changeUtc8 + ", isCollected=" + this.isCollected + ", isCustomToken=" + this.isCustomToken + ", isNotSupportTxNativeToken=" + this.isNotSupportTxNativeToken + ", isSubscribe=" + this.isSubscribe + ", isTxPrice=" + this.isTxPrice + ", maxPrice=" + this.maxPrice + ", minPrice=" + this.minPrice + ", price=" + this.price + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenLargeLogoUrl=" + this.tokenLargeLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tradeNum=" + this.tradeNum + ", volume=" + this.volume + ", errorCode=" + this.errorCode + ", wrapperTokenContractAddress=" + this.wrapperTokenContractAddress + ", isSupportBlinksShareUrl=" + this.isSupportBlinksShareUrl + ", moduleType=" + this.moduleType + ", isSupportHolder=" + this.isSupportHolder + ", supportTrader=" + this.supportTrader + ", marketCap=" + this.marketCap + ", isSupportMarketCapKline=" + this.isSupportMarketCapKline + ", circulatingSupply=" + this.circulatingSupply + ", liquidity=" + this.liquidity + ", top10HoldAmountPercentage=" + this.top10HoldAmountPercentage + ", holders=" + this.holders + ", earlyBuyerStatisticsInfo=" + this.earlyBuyerStatisticsInfo + ", isSupportHolderExpandData=" + this.isSupportHolderExpandData + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", newTagList=" + this.newTagList + ", devHoldingRatio=" + this.devHoldingRatio + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", suspiciousRatio=" + this.suspiciousRatio + ", bubbleMapInfo=" + this.bubbleMapInfo + ", riskControlLevel=" + this.riskControlLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.chainName);
        parcel.writeString(this.change);
        parcel.writeString(this.changeUtc0);
        parcel.writeString(this.changeUtc8);
        parcel.writeString(this.isCollected);
        parcel.writeString(this.isCustomToken);
        parcel.writeString(this.isNotSupportTxNativeToken);
        parcel.writeString(this.isSubscribe);
        parcel.writeString(this.isTxPrice);
        parcel.writeString(this.maxPrice);
        parcel.writeString(this.minPrice);
        parcel.writeString(this.price);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.tokenLargeLogoUrl);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.volume);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.wrapperTokenContractAddress);
        parcel.writeString(this.isSupportBlinksShareUrl);
        parcel.writeString(this.moduleType);
        parcel.writeString(this.isSupportHolder);
        parcel.writeString(this.supportTrader);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.isSupportMarketCapKline);
        parcel.writeString(this.circulatingSupply);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.top10HoldAmountPercentage);
        parcel.writeString(this.holders);
        this.earlyBuyerStatisticsInfo.writeToParcel(parcel, i);
        parcel.writeString(this.isSupportHolderExpandData);
        parcel.writeString(this.nativeTokenSymbol);
        List<CompactTagData> list = this.newTagList;
        parcel.writeInt(list.size());
        Iterator<CompactTagData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.devHoldingRatio);
        parcel.writeString(this.snipersClear);
        parcel.writeString(this.snipersTotal);
        parcel.writeString(this.suspiciousRatio);
        this.bubbleMapInfo.writeToParcel(parcel, i);
        parcel.writeString(this.riskControlLevel);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LatestMarketInfoBean> serializer() {
            return LatestMarketInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LatestMarketInfoBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, EarlyBuyerInfoData earlyBuyerInfoData, String str34, String str35, List list, String str36, String str37, String str38, String str39, BubbleMapData bubbleMapData, String str40, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.changeUtc0 = "";
        } else {
            this.changeUtc0 = str5;
        }
        if ((i & 32) == 0) {
            this.changeUtc8 = "";
        } else {
            this.changeUtc8 = str6;
        }
        if ((i & 64) == 0) {
            this.isCollected = "";
        } else {
            this.isCollected = str7;
        }
        if ((i & 128) == 0) {
            this.isCustomToken = "";
        } else {
            this.isCustomToken = str8;
        }
        if ((i & 256) == 0) {
            this.isNotSupportTxNativeToken = "";
        } else {
            this.isNotSupportTxNativeToken = str9;
        }
        if ((i & 512) == 0) {
            this.isSubscribe = "";
        } else {
            this.isSubscribe = str10;
        }
        if ((i & 1024) == 0) {
            this.isTxPrice = "";
        } else {
            this.isTxPrice = str11;
        }
        if ((i & 2048) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str12;
        }
        if ((i & 4096) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str13;
        }
        if ((i & 8192) == 0) {
            this.price = "";
        } else {
            this.price = str14;
        }
        if ((i & 16384) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str15;
        }
        if ((32768 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str16;
        }
        if ((65536 & i) == 0) {
            this.tokenLargeLogoUrl = "";
        } else {
            this.tokenLargeLogoUrl = str17;
        }
        if ((131072 & i) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str18;
        }
        if ((262144 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str19;
        }
        if ((524288 & i) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str20;
        }
        if ((1048576 & i) == 0) {
            this.volume = "";
        } else {
            this.volume = str21;
        }
        if ((2097152 & i) == 0) {
            this.errorCode = "0";
        } else {
            this.errorCode = str22;
        }
        if ((4194304 & i) == 0) {
            this.wrapperTokenContractAddress = "";
        } else {
            this.wrapperTokenContractAddress = str23;
        }
        if ((8388608 & i) == 0) {
            this.isSupportBlinksShareUrl = "0";
        } else {
            this.isSupportBlinksShareUrl = str24;
        }
        if ((16777216 & i) == 0) {
            this.moduleType = "";
        } else {
            this.moduleType = str25;
        }
        if ((33554432 & i) == 0) {
            this.isSupportHolder = "0";
        } else {
            this.isSupportHolder = str26;
        }
        if ((67108864 & i) == 0) {
            this.supportTrader = "0";
        } else {
            this.supportTrader = str27;
        }
        if ((134217728 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str28;
        }
        if ((268435456 & i) == 0) {
            this.isSupportMarketCapKline = "0";
        } else {
            this.isSupportMarketCapKline = str29;
        }
        if ((536870912 & i) == 0) {
            this.circulatingSupply = "";
        } else {
            this.circulatingSupply = str30;
        }
        if ((1073741824 & i) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.top10HoldAmountPercentage = "";
        } else {
            this.top10HoldAmountPercentage = str32;
        }
        if ((i2 & 1) == 0) {
            this.holders = "";
        } else {
            this.holders = str33;
        }
        this.earlyBuyerStatisticsInfo = (i2 & 2) == 0 ? new EarlyBuyerInfoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : earlyBuyerInfoData;
        if ((i2 & 4) == 0) {
            this.isSupportHolderExpandData = "0";
        } else {
            this.isSupportHolderExpandData = str34;
        }
        if ((i2 & 8) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str35;
        }
        this.newTagList = (i2 & 16) == 0 ? yDY.AhwBna() : list;
        if ((i2 & 32) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str36;
        }
        if ((i2 & 64) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str37;
        }
        if ((i2 & 128) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str38;
        }
        if ((i2 & 256) == 0) {
            this.suspiciousRatio = "";
        } else {
            this.suspiciousRatio = str39;
        }
        this.bubbleMapInfo = (i2 & 512) == 0 ? new BubbleMapData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : bubbleMapData;
        if ((i2 & 1024) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str40;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [36=4] */
    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(LatestMarketInfoBean latestMarketInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, latestMarketInfoBean.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, latestMarketInfoBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, latestMarketInfoBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, latestMarketInfoBean.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.changeUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, latestMarketInfoBean.changeUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.changeUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, latestMarketInfoBean.changeUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isCollected, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, latestMarketInfoBean.isCollected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isCustomToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, latestMarketInfoBean.isCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isNotSupportTxNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, latestMarketInfoBean.isNotSupportTxNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isSubscribe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, latestMarketInfoBean.isSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isTxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, latestMarketInfoBean.isTxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, latestMarketInfoBean.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, latestMarketInfoBean.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, latestMarketInfoBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, latestMarketInfoBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, latestMarketInfoBean.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tokenLargeLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, latestMarketInfoBean.tokenLargeLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, latestMarketInfoBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, latestMarketInfoBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, latestMarketInfoBean.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, latestMarketInfoBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.errorCode, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, latestMarketInfoBean.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.wrapperTokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, latestMarketInfoBean.wrapperTokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isSupportBlinksShareUrl, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, latestMarketInfoBean.isSupportBlinksShareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.moduleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, latestMarketInfoBean.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isSupportHolder, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, latestMarketInfoBean.isSupportHolder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.supportTrader, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, latestMarketInfoBean.supportTrader);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, latestMarketInfoBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isSupportMarketCapKline, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, latestMarketInfoBean.isSupportMarketCapKline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.circulatingSupply, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, latestMarketInfoBean.circulatingSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, latestMarketInfoBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.top10HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, latestMarketInfoBean.top10HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, latestMarketInfoBean.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd(latestMarketInfoBean.earlyBuyerStatisticsInfo, new EarlyBuyerInfoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 33, EarlyBuyerInfoData$$serializer.INSTANCE, latestMarketInfoBean.earlyBuyerStatisticsInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.isSupportHolderExpandData, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, latestMarketInfoBean.isSupportHolderExpandData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, latestMarketInfoBean.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd(latestMarketInfoBean.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], latestMarketInfoBean.newTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, latestMarketInfoBean.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, latestMarketInfoBean.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, latestMarketInfoBean.snipersTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) latestMarketInfoBean.suspiciousRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, latestMarketInfoBean.suspiciousRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd(latestMarketInfoBean.bubbleMapInfo, new BubbleMapData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 41, BubbleMapData$$serializer.INSTANCE, latestMarketInfoBean.bubbleMapInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) && Intrinsics.EZpvd((Object) latestMarketInfoBean.riskControlLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 42, latestMarketInfoBean.riskControlLevel);
    }

    public LatestMarketInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull EarlyBuyerInfoData earlyBuyerInfoData, @NotNull String str34, @NotNull String str35, @NotNull List<CompactTagData> list, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull BubbleMapData bubbleMapData, @NotNull String str40) {
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
        Intrinsics.checkNotNullParameter(earlyBuyerInfoData, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(bubbleMapData, "");
        Intrinsics.checkNotNullParameter(str40, "");
        this.chainBWLogoUrl = str;
        this.chainLogoUrl = str2;
        this.chainName = str3;
        this.change = str4;
        this.changeUtc0 = str5;
        this.changeUtc8 = str6;
        this.isCollected = str7;
        this.isCustomToken = str8;
        this.isNotSupportTxNativeToken = str9;
        this.isSubscribe = str10;
        this.isTxPrice = str11;
        this.maxPrice = str12;
        this.minPrice = str13;
        this.price = str14;
        this.tokenContractAddress = str15;
        this.tokenLogoUrl = str16;
        this.tokenLargeLogoUrl = str17;
        this.tokenName = str18;
        this.tokenSymbol = str19;
        this.tradeNum = str20;
        this.volume = str21;
        this.errorCode = str22;
        this.wrapperTokenContractAddress = str23;
        this.isSupportBlinksShareUrl = str24;
        this.moduleType = str25;
        this.isSupportHolder = str26;
        this.supportTrader = str27;
        this.marketCap = str28;
        this.isSupportMarketCapKline = str29;
        this.circulatingSupply = str30;
        this.liquidity = str31;
        this.top10HoldAmountPercentage = str32;
        this.holders = str33;
        this.earlyBuyerStatisticsInfo = earlyBuyerInfoData;
        this.isSupportHolderExpandData = str34;
        this.nativeTokenSymbol = str35;
        this.newTagList = list;
        this.devHoldingRatio = str36;
        this.snipersClear = str37;
        this.snipersTotal = str38;
        this.suspiciousRatio = str39;
        this.bubbleMapInfo = bubbleMapData;
        this.riskControlLevel = str40;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0241: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r93v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r93v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r93v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r93v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r93v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r93v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r93v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r93v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r93v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r93v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r93v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r93v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r93v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r93v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r93v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r93v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r93v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r93v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r93v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r93v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r93v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r93v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("0") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r93v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e1: ARITH (r93v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("0") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ec: ARITH (r93v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f7: ARITH (r93v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("0") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0102: ARITH (r93v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("0") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010d: ARITH (r93v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0118: ARITH (r93v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("0") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0123: ARITH (r93v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012e: ARITH (r93v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0139: ARITH (r93v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0142: ARITH (r94v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData:?: TERNARY null = ((wrap:int:0x014b: ARITH (r94v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x016b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:107) call: com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r83v0 com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0171: ARITH (r94v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r84v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0178: ARITH (r94v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0181: ARITH (r94v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0185: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:113)) : (r86v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x018c: ARITH (r94v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0195: ARITH (r94v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:0x01a9: TERNARY null = ((wrap:int:0x01a0: ARITH (r94v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:0x01b4: TERNARY null = ((wrap:int:0x01ab: ARITH (r94v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r94v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01da: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:123) call: com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r91v0 com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e0: ARITH (r94v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData, java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData, java.lang.String):void (m)] (LINE:39) call: com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData, java.lang.String):void type: THIS */
    public /* synthetic */ LatestMarketInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, EarlyBuyerInfoData earlyBuyerInfoData, String str34, String str35, List list, String str36, String str37, String str38, String str39, BubbleMapData bubbleMapData, String str40, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "0" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "0" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "0" : str26, (i & 67108864) != 0 ? "0" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "0" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? new EarlyBuyerInfoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : earlyBuyerInfoData, (i2 & 4) == 0 ? str34 : "0", (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? yDY.AhwBna() : list, (i2 & 32) != 0 ? "" : str36, (i2 & 64) != 0 ? "" : str37, (i2 & 128) != 0 ? "" : str38, (i2 & 256) != 0 ? "" : str39, (i2 & 512) != 0 ? new BubbleMapData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : bubbleMapData, (i2 & 1024) != 0 ? "" : str40);
    }

    /* JADX INFO: renamed from: isSupportBlinksShareUrl, reason: collision with other method in class */
    public final boolean m6702isSupportBlinksShareUrl() {
        return Intrinsics.EZpvd((Object) this.isSupportBlinksShareUrl, (Object) "1");
    }

    public final boolean isCoinNotSupport() {
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) "70001");
    }

    public final boolean isWaitState() {
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) "100000");
    }

    public final boolean isSupportTxPrice() {
        return Intrinsics.EZpvd((Object) this.isTxPrice, (Object) "1");
    }

    public final boolean isCollectState() {
        return Intrinsics.EZpvd((Object) this.isCollected, (Object) "1");
    }

    public final boolean isShowInfoTab() {
        return !Intrinsics.EZpvd((Object) this.moduleType, (Object) "0");
    }

    public final boolean hasMarketCapData() {
        return Intrinsics.EZpvd((Object) this.isSupportMarketCapKline, (Object) "1");
    }

    public final String realTokenContractAddress() {
        return Intrinsics.EZpvd((Object) this.isNotSupportTxNativeToken, (Object) "1") ? this.wrapperTokenContractAddress : this.tokenContractAddress;
    }

    public final boolean getNotSupportTxNativeToken() {
        return Intrinsics.EZpvd((Object) this.isNotSupportTxNativeToken, (Object) "1");
    }
}

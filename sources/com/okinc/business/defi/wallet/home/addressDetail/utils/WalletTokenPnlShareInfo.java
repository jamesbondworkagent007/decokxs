package com.okinc.business.defi.wallet.home.addressDetail.utils;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletTokenPnlShareInfo {
    private final String averageCost;
    private final String averageSell;
    private final String balance;
    private final String boughtVolume;
    private final Long chainId;
    private final String chainLogoUrl;
    private final String currencyName;
    private final String currentCurrencyProfit;
    private final String currentPrice;
    private final String currentProfit;
    private final String currentProfitPercentage;
    private final Boolean isMyWallet;
    private final List<JsonElement> kLinesData;
    private final String soldVolume;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String twitterAvatar;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(JsonElementSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonElement> component12() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isMyWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.currentCurrencyProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTokenPnlShareInfo copy(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, List<? extends JsonElement> list, String str11, String str12, String str13, String str14, Boolean bool, String str15) {
        return new WalletTokenPnlShareInfo(str, str2, str3, str4, l, str5, str6, str7, str8, str9, str10, list, str11, str12, str13, str14, bool, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTokenPnlShareInfo)) {
            return false;
        }
        WalletTokenPnlShareInfo walletTokenPnlShareInfo = (WalletTokenPnlShareInfo) obj;
        return Intrinsics.EZpvd((Object) this.averageCost, (Object) walletTokenPnlShareInfo.averageCost) && Intrinsics.EZpvd((Object) this.averageSell, (Object) walletTokenPnlShareInfo.averageSell) && Intrinsics.EZpvd((Object) this.balance, (Object) walletTokenPnlShareInfo.balance) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) walletTokenPnlShareInfo.boughtVolume) && Intrinsics.EZpvd(this.chainId, walletTokenPnlShareInfo.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) walletTokenPnlShareInfo.chainLogoUrl) && Intrinsics.EZpvd((Object) this.currencyName, (Object) walletTokenPnlShareInfo.currencyName) && Intrinsics.EZpvd((Object) this.currentCurrencyProfit, (Object) walletTokenPnlShareInfo.currentCurrencyProfit) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) walletTokenPnlShareInfo.currentPrice) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) walletTokenPnlShareInfo.currentProfit) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) walletTokenPnlShareInfo.currentProfitPercentage) && Intrinsics.EZpvd(this.kLinesData, walletTokenPnlShareInfo.kLinesData) && Intrinsics.EZpvd((Object) this.soldVolume, (Object) walletTokenPnlShareInfo.soldVolume) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) walletTokenPnlShareInfo.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) walletTokenPnlShareInfo.tokenSymbol) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletTokenPnlShareInfo.walletAddress) && Intrinsics.EZpvd(this.isMyWallet, walletTokenPnlShareInfo.isMyWallet) && Intrinsics.EZpvd((Object) this.twitterAvatar, (Object) walletTokenPnlShareInfo.twitterAvatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageSell() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtVolume() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentCurrencyProfit() {
        return this.currentCurrencyProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfit() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfitPercentage() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonElement> getKLinesData() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldVolume() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitterAvatar() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.averageCost;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.averageSell;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.balance;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.boughtVolume;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Long l = this.chainId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str5 = this.chainLogoUrl;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currencyName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currentCurrencyProfit;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.currentPrice;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.currentProfit;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.currentProfitPercentage;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        List<JsonElement> list = this.kLinesData;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        String str11 = this.soldVolume;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tokenLogoUrl;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tokenSymbol;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.walletAddress;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        Boolean bool = this.isMyWallet;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        String str15 = this.twitterAvatar;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isMyWallet() {
        return this.isMyWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTokenPnlShareInfo(averageCost=" + this.averageCost + ", averageSell=" + this.averageSell + ", balance=" + this.balance + ", boughtVolume=" + this.boughtVolume + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", currencyName=" + this.currencyName + ", currentCurrencyProfit=" + this.currentCurrencyProfit + ", currentPrice=" + this.currentPrice + ", currentProfit=" + this.currentProfit + ", currentProfitPercentage=" + this.currentProfitPercentage + ", kLinesData=" + this.kLinesData + ", soldVolume=" + this.soldVolume + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", walletAddress=" + this.walletAddress + ", isMyWallet=" + this.isMyWallet + ", twitterAvatar=" + this.twitterAvatar + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTokenPnlShareInfo> serializer() {
            return WalletTokenPnlShareInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTokenPnlShareInfo(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, String str13, String str14, Boolean bool, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i, 262143, WalletTokenPnlShareInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.averageCost = str;
        this.averageSell = str2;
        this.balance = str3;
        this.boughtVolume = str4;
        this.chainId = l;
        this.chainLogoUrl = str5;
        this.currencyName = str6;
        this.currentCurrencyProfit = str7;
        this.currentPrice = str8;
        this.currentProfit = str9;
        this.currentProfitPercentage = str10;
        this.kLinesData = list;
        this.soldVolume = str11;
        this.tokenLogoUrl = str12;
        this.tokenSymbol = str13;
        this.walletAddress = str14;
        this.isMyWallet = bool;
        this.twitterAvatar = str15;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletTokenPnlShareInfo walletTokenPnlShareInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, walletTokenPnlShareInfo.averageCost);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletTokenPnlShareInfo.averageSell);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletTokenPnlShareInfo.balance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, walletTokenPnlShareInfo.boughtVolume);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, walletTokenPnlShareInfo.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, walletTokenPnlShareInfo.chainLogoUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, walletTokenPnlShareInfo.currencyName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, walletTokenPnlShareInfo.currentCurrencyProfit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, walletTokenPnlShareInfo.currentPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, walletTokenPnlShareInfo.currentProfit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, walletTokenPnlShareInfo.currentProfitPercentage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], walletTokenPnlShareInfo.kLinesData);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, walletTokenPnlShareInfo.soldVolume);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, walletTokenPnlShareInfo.tokenLogoUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, walletTokenPnlShareInfo.tokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, walletTokenPnlShareInfo.walletAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, walletTokenPnlShareInfo.isMyWallet);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, walletTokenPnlShareInfo.twitterAvatar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends kotlinx.serialization.json.JsonElement> */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletTokenPnlShareInfo(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, List<? extends JsonElement> list, String str11, String str12, String str13, String str14, Boolean bool, String str15) {
        this.averageCost = str;
        this.averageSell = str2;
        this.balance = str3;
        this.boughtVolume = str4;
        this.chainId = l;
        this.chainLogoUrl = str5;
        this.currencyName = str6;
        this.currentCurrencyProfit = str7;
        this.currentPrice = str8;
        this.currentProfit = str9;
        this.currentProfitPercentage = str10;
        this.kLinesData = list;
        this.soldVolume = str11;
        this.tokenLogoUrl = str12;
        this.tokenSymbol = str13;
        this.walletAddress = str14;
        this.isMyWallet = bool;
        this.twitterAvatar = str15;
    }
}

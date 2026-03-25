package com.okinc.business.market.data.model.traders;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TradersData {
    public final String boughtAvgPrice;
    public final String boughtVolume;
    public final String buyCount;
    public final String buyValue;
    public final String chainId;
    public final String explorerUrl;
    public final String extraOne;
    public final String fundingSourceAddress;
    public final String fundingSourceAddressShowName;
    public final String fundingSourceTime;
    public final String holdAmount;
    public final String holdAmountPercentage;
    public final String holdAvgPrice;
    public final String holdCreateTim;
    public final String holdVolume;
    public final String holderWalletAddress;
    public final String holdingTime;
    public final String lastTradeTime;
    public final String maxHoldAmount;
    public final String nativeTokenBalance;
    public final String nativeTokenHoldTime;
    public final String nativeTokenPrice;
    public final List<CompactTagData> newTagList;
    public final String realizedProfit;
    public final String realizedProfitPercentage;
    public final String sellCount;
    public final String sellValue;
    public final String soldAvgPrice;
    public final String tokenContractAddress;
    public final String totalProfit;
    public final String totalProfitPercentage;
    public final String unrealizedProfit;
    public final String unrealizedProfitPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradersData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.holderWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.boughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradersData copydefault(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, @NotNull List<CompactTagData> list, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TradersData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, list, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> djBIcL() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradersData)) {
            return false;
        }
        TradersData tradersData = (TradersData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tradersData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tradersData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.holdAmount, (Object) tradersData.holdAmount) && Intrinsics.EZpvd((Object) this.holdVolume, (Object) tradersData.holdVolume) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) tradersData.holdAmountPercentage) && Intrinsics.EZpvd((Object) this.holderWalletAddress, (Object) tradersData.holderWalletAddress) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) tradersData.explorerUrl) && Intrinsics.EZpvd((Object) this.extraOne, (Object) tradersData.extraOne) && Intrinsics.EZpvd((Object) this.holdCreateTim, (Object) tradersData.holdCreateTim) && Intrinsics.EZpvd((Object) this.fundingSourceAddress, (Object) tradersData.fundingSourceAddress) && Intrinsics.EZpvd((Object) this.fundingSourceAddressShowName, (Object) tradersData.fundingSourceAddressShowName) && Intrinsics.EZpvd((Object) this.fundingSourceTime, (Object) tradersData.fundingSourceTime) && Intrinsics.EZpvd((Object) this.holdingTime, (Object) tradersData.holdingTime) && Intrinsics.EZpvd((Object) this.lastTradeTime, (Object) tradersData.lastTradeTime) && Intrinsics.EZpvd((Object) this.maxHoldAmount, (Object) tradersData.maxHoldAmount) && Intrinsics.EZpvd((Object) this.buyCount, (Object) tradersData.buyCount) && Intrinsics.EZpvd((Object) this.buyValue, (Object) tradersData.buyValue) && Intrinsics.EZpvd((Object) this.sellCount, (Object) tradersData.sellCount) && Intrinsics.EZpvd((Object) this.sellValue, (Object) tradersData.sellValue) && Intrinsics.EZpvd(this.newTagList, tradersData.newTagList) && Intrinsics.EZpvd((Object) this.soldAvgPrice, (Object) tradersData.soldAvgPrice) && Intrinsics.EZpvd((Object) this.boughtAvgPrice, (Object) tradersData.boughtAvgPrice) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) tradersData.holdAvgPrice) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) tradersData.totalProfit) && Intrinsics.EZpvd((Object) this.totalProfitPercentage, (Object) tradersData.totalProfitPercentage) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) tradersData.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) tradersData.realizedProfitPercentage) && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) tradersData.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) tradersData.unrealizedProfitPercentage) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) tradersData.boughtVolume) && Intrinsics.EZpvd((Object) this.nativeTokenBalance, (Object) tradersData.nativeTokenBalance) && Intrinsics.EZpvd((Object) this.nativeTokenHoldTime, (Object) tradersData.nativeTokenHoldTime) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) tradersData.nativeTokenPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.soldAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenContractAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.holdAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.holdVolume;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.holdAmountPercentage;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.holderWalletAddress;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.explorerUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.extraOne;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.holdCreateTim;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.fundingSourceAddress;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.fundingSourceAddressShowName;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.fundingSourceTime;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.holdingTime;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.lastTradeTime;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.maxHoldAmount;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.buyCount;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.buyValue;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.sellCount;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.sellValue;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        int iHashCode20 = this.newTagList.hashCode();
        String str20 = this.soldAvgPrice;
        int iHashCode21 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.boughtAvgPrice;
        int iHashCode22 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.holdAvgPrice;
        int iHashCode23 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.totalProfit;
        int iHashCode24 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.totalProfitPercentage;
        int iHashCode25 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.realizedProfit;
        int iHashCode26 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.realizedProfitPercentage;
        int iHashCode27 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.unrealizedProfit;
        int iHashCode28 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.unrealizedProfitPercentage;
        int iHashCode29 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.boughtVolume;
        int iHashCode30 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.nativeTokenBalance;
        int iHashCode31 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.nativeTokenHoldTime;
        int iHashCode32 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.nativeTokenPrice;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (str32 == null ? 0 : str32.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradersData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", holdAmount=" + this.holdAmount + ", holdVolume=" + this.holdVolume + ", holdAmountPercentage=" + this.holdAmountPercentage + ", holderWalletAddress=" + this.holderWalletAddress + ", explorerUrl=" + this.explorerUrl + ", extraOne=" + this.extraOne + ", holdCreateTim=" + this.holdCreateTim + ", fundingSourceAddress=" + this.fundingSourceAddress + ", fundingSourceAddressShowName=" + this.fundingSourceAddressShowName + ", fundingSourceTime=" + this.fundingSourceTime + ", holdingTime=" + this.holdingTime + ", lastTradeTime=" + this.lastTradeTime + ", maxHoldAmount=" + this.maxHoldAmount + ", buyCount=" + this.buyCount + ", buyValue=" + this.buyValue + ", sellCount=" + this.sellCount + ", sellValue=" + this.sellValue + ", newTagList=" + this.newTagList + ", soldAvgPrice=" + this.soldAvgPrice + ", boughtAvgPrice=" + this.boughtAvgPrice + ", holdAvgPrice=" + this.holdAvgPrice + ", totalProfit=" + this.totalProfit + ", totalProfitPercentage=" + this.totalProfitPercentage + ", realizedProfit=" + this.realizedProfit + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ", unrealizedProfit=" + this.unrealizedProfit + ", unrealizedProfitPercentage=" + this.unrealizedProfitPercentage + ", boughtVolume=" + this.boughtVolume + ", nativeTokenBalance=" + this.nativeTokenBalance + ", nativeTokenHoldTime=" + this.nativeTokenHoldTime + ", nativeTokenPrice=" + this.nativeTokenPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.totalProfit;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.traders.TradersData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradersData> serializer() {
            return TradersData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradersData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.holdAmount = "";
        } else {
            this.holdAmount = str3;
        }
        if ((i & 8) == 0) {
            this.holdVolume = "";
        } else {
            this.holdVolume = str4;
        }
        if ((i & 16) == 0) {
            this.holdAmountPercentage = "";
        } else {
            this.holdAmountPercentage = str5;
        }
        if ((i & 32) == 0) {
            this.holderWalletAddress = "";
        } else {
            this.holderWalletAddress = str6;
        }
        if ((i & 64) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str7;
        }
        if ((i & 128) == 0) {
            this.extraOne = "";
        } else {
            this.extraOne = str8;
        }
        if ((i & 256) == 0) {
            this.holdCreateTim = "";
        } else {
            this.holdCreateTim = str9;
        }
        if ((i & 512) == 0) {
            this.fundingSourceAddress = "";
        } else {
            this.fundingSourceAddress = str10;
        }
        if ((i & 1024) == 0) {
            this.fundingSourceAddressShowName = "";
        } else {
            this.fundingSourceAddressShowName = str11;
        }
        if ((i & 2048) == 0) {
            this.fundingSourceTime = "";
        } else {
            this.fundingSourceTime = str12;
        }
        if ((i & 4096) == 0) {
            this.holdingTime = "";
        } else {
            this.holdingTime = str13;
        }
        if ((i & 8192) == 0) {
            this.lastTradeTime = "";
        } else {
            this.lastTradeTime = str14;
        }
        if ((i & 16384) == 0) {
            this.maxHoldAmount = "";
        } else {
            this.maxHoldAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.buyCount = "";
        } else {
            this.buyCount = str16;
        }
        if ((65536 & i) == 0) {
            this.buyValue = "";
        } else {
            this.buyValue = str17;
        }
        if ((131072 & i) == 0) {
            this.sellCount = "";
        } else {
            this.sellCount = str18;
        }
        if ((262144 & i) == 0) {
            this.sellValue = "";
        } else {
            this.sellValue = str19;
        }
        this.newTagList = (524288 & i) == 0 ? yDY.AhwBna() : list;
        if ((1048576 & i) == 0) {
            this.soldAvgPrice = "";
        } else {
            this.soldAvgPrice = str20;
        }
        if ((2097152 & i) == 0) {
            this.boughtAvgPrice = "";
        } else {
            this.boughtAvgPrice = str21;
        }
        if ((4194304 & i) == 0) {
            this.holdAvgPrice = "";
        } else {
            this.holdAvgPrice = str22;
        }
        if ((8388608 & i) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str23;
        }
        if ((16777216 & i) == 0) {
            this.totalProfitPercentage = "";
        } else {
            this.totalProfitPercentage = str24;
        }
        if ((33554432 & i) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str25;
        }
        if ((67108864 & i) == 0) {
            this.realizedProfitPercentage = "";
        } else {
            this.realizedProfitPercentage = str26;
        }
        if ((134217728 & i) == 0) {
            this.unrealizedProfit = "";
        } else {
            this.unrealizedProfit = str27;
        }
        if ((268435456 & i) == 0) {
            this.unrealizedProfitPercentage = "";
        } else {
            this.unrealizedProfitPercentage = str28;
        }
        if ((536870912 & i) == 0) {
            this.boughtVolume = "";
        } else {
            this.boughtVolume = str29;
        }
        if ((1073741824 & i) == 0) {
            this.nativeTokenBalance = "";
        } else {
            this.nativeTokenBalance = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nativeTokenHoldTime = "";
        } else {
            this.nativeTokenHoldTime = str31;
        }
        if ((i2 & 1) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str32;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TradersData tradersData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradersData.chainId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradersData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradersData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradersData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradersData.holdAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradersData.holdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradersData.holdVolume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradersData.holdVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradersData.holdAmountPercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradersData.holdAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradersData.holderWalletAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradersData.holderWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradersData.explorerUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradersData.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradersData.extraOne, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradersData.extraOne);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradersData.holdCreateTim, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradersData.holdCreateTim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradersData.fundingSourceAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradersData.fundingSourceAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradersData.fundingSourceAddressShowName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tradersData.fundingSourceAddressShowName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradersData.fundingSourceTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradersData.fundingSourceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradersData.holdingTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tradersData.holdingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradersData.lastTradeTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, tradersData.lastTradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradersData.maxHoldAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, tradersData.maxHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradersData.buyCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tradersData.buyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradersData.buyValue, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, tradersData.buyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradersData.sellCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, tradersData.sellCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradersData.sellValue, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, tradersData.sellValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(tradersData.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], tradersData.newTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradersData.soldAvgPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, tradersData.soldAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradersData.boughtAvgPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, tradersData.boughtAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradersData.holdAvgPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, tradersData.holdAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradersData.totalProfit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, tradersData.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradersData.totalProfitPercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, tradersData.totalProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradersData.realizedProfit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, tradersData.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradersData.realizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, tradersData.realizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradersData.unrealizedProfit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, tradersData.unrealizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradersData.unrealizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, tradersData.unrealizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) tradersData.boughtVolume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, tradersData.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradersData.nativeTokenBalance, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, tradersData.nativeTokenBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) tradersData.nativeTokenHoldTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, tradersData.nativeTokenHoldTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && Intrinsics.EZpvd((Object) tradersData.nativeTokenPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, tradersData.nativeTokenPrice);
    }

    public TradersData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, @NotNull List<CompactTagData> list, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.holdAmount = str3;
        this.holdVolume = str4;
        this.holdAmountPercentage = str5;
        this.holderWalletAddress = str6;
        this.explorerUrl = str7;
        this.extraOne = str8;
        this.holdCreateTim = str9;
        this.fundingSourceAddress = str10;
        this.fundingSourceAddressShowName = str11;
        this.fundingSourceTime = str12;
        this.holdingTime = str13;
        this.lastTradeTime = str14;
        this.maxHoldAmount = str15;
        this.buyCount = str16;
        this.buyValue = str17;
        this.sellCount = str18;
        this.sellValue = str19;
        this.newTagList = list;
        this.soldAvgPrice = str20;
        this.boughtAvgPrice = str21;
        this.holdAvgPrice = str22;
        this.totalProfit = str23;
        this.totalProfitPercentage = str24;
        this.realizedProfit = str25;
        this.realizedProfitPercentage = str26;
        this.unrealizedProfit = str27;
        this.unrealizedProfitPercentage = str28;
        this.boughtVolume = str29;
        this.nativeTokenBalance = str30;
        this.nativeTokenHoldTime = str31;
        this.nativeTokenPrice = str32;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x018a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r67v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r67v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r67v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r67v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r67v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r67v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r67v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r67v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r67v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r67v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r67v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b2: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r53v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r67v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r67v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r67v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r67v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r67v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r67v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r67v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r67v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r67v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r67v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r67v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r68v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.market.data.model.traders.TradersData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradersData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? yDY.AhwBna() : list, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? "" : str23, (i & 16777216) != 0 ? "" : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str25, (i & 67108864) != 0 ? "" : str26, (i & 134217728) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28, (i & 536870912) != 0 ? "" : str29, (i & 1073741824) != 0 ? "" : str30, (i & Integer.MIN_VALUE) != 0 ? "" : str31, (i2 & 1) != 0 ? "" : str32);
    }
}

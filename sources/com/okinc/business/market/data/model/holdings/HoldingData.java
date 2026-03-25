package com.okinc.business.market.data.model.holdings;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HoldingData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String amount;
    public final String boughtAvgPrice;
    public final String boughtVolume;
    public final String chainId;
    public final String chainLogo;
    public final String convertToNativeTokenAmount;
    public final String currencyAmount;
    public final String holdAvgPrice;
    public final boolean inWatchList;
    public final Boolean isPnlSupported;
    public final boolean lowLiquidity;
    public final String marketCap;
    public final boolean meme;
    public final boolean nativeToken;
    public final String nativeTokenAddress;
    public final String nativeTokenPrice;
    public final String price;
    public final String realizedProfit;
    public final String riskControlLevel;
    public final String riskLevel;
    public final String spotBalance;
    public final Boolean stableCoinToken;
    public final String tokenAddress;
    public final String tokenLogo;
    public final String tokenSymbol;
    public final String totalProfit;
    public final String totalProfitPercentage;
    public final String unrealizedProfit;
    public final String unrealizedProfitPercentage;
    public final String upnlConvertToNativeTokenAmount;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldingData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldingData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, boolean z3, boolean z4, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, Boolean bool, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, Boolean bool2) {
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
        return new HoldingData(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, z3, z4, str10, str11, str12, str13, str14, str15, bool, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.inWatchList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean AubY() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.nativeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.boughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.convertToNativeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HoldingData)) {
            return false;
        }
        HoldingData holdingData = (HoldingData) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) holdingData.amount) && Intrinsics.EZpvd((Object) this.boughtAvgPrice, (Object) holdingData.boughtAvgPrice) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) holdingData.boughtVolume) && Intrinsics.EZpvd((Object) this.chainId, (Object) holdingData.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) holdingData.chainLogo) && Intrinsics.EZpvd((Object) this.convertToNativeTokenAmount, (Object) holdingData.convertToNativeTokenAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) holdingData.currencyAmount) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) holdingData.holdAvgPrice) && this.inWatchList == holdingData.inWatchList && this.lowLiquidity == holdingData.lowLiquidity && Intrinsics.EZpvd((Object) this.marketCap, (Object) holdingData.marketCap) && this.meme == holdingData.meme && this.nativeToken == holdingData.nativeToken && Intrinsics.EZpvd((Object) this.nativeTokenAddress, (Object) holdingData.nativeTokenAddress) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) holdingData.nativeTokenPrice) && Intrinsics.EZpvd((Object) this.price, (Object) holdingData.price) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) holdingData.realizedProfit) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) holdingData.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) holdingData.riskLevel) && Intrinsics.EZpvd(this.stableCoinToken, holdingData.stableCoinToken) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) holdingData.spotBalance) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) holdingData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) holdingData.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) holdingData.tokenSymbol) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) holdingData.totalProfit) && Intrinsics.EZpvd((Object) this.totalProfitPercentage, (Object) holdingData.totalProfitPercentage) && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) holdingData.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) holdingData.unrealizedProfitPercentage) && Intrinsics.EZpvd((Object) this.upnlConvertToNativeTokenAmount, (Object) holdingData.upnlConvertToNativeTokenAmount) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) holdingData.walletAddress) && Intrinsics.EZpvd(this.isPnlSupported, holdingData.isPnlSupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean fJNWhG() {
        return this.stableCoinToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.nativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.lowLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.boughtAvgPrice.hashCode();
        int iHashCode3 = this.boughtVolume.hashCode();
        int iHashCode4 = this.chainId.hashCode();
        int iHashCode5 = this.chainLogo.hashCode();
        int iHashCode6 = this.convertToNativeTokenAmount.hashCode();
        int iHashCode7 = this.currencyAmount.hashCode();
        int iHashCode8 = this.holdAvgPrice.hashCode();
        int iHashCode9 = Boolean.hashCode(this.inWatchList);
        int iHashCode10 = Boolean.hashCode(this.lowLiquidity);
        int iHashCode11 = this.marketCap.hashCode();
        int iHashCode12 = Boolean.hashCode(this.meme);
        int iHashCode13 = Boolean.hashCode(this.nativeToken);
        int iHashCode14 = this.nativeTokenAddress.hashCode();
        int iHashCode15 = this.nativeTokenPrice.hashCode();
        int iHashCode16 = this.price.hashCode();
        int iHashCode17 = this.realizedProfit.hashCode();
        int iHashCode18 = this.riskControlLevel.hashCode();
        int iHashCode19 = this.riskLevel.hashCode();
        Boolean bool = this.stableCoinToken;
        int iHashCode20 = bool == null ? 0 : bool.hashCode();
        int iHashCode21 = this.spotBalance.hashCode();
        int iHashCode22 = this.tokenAddress.hashCode();
        int iHashCode23 = this.tokenLogo.hashCode();
        int iHashCode24 = this.tokenSymbol.hashCode();
        int iHashCode25 = this.totalProfit.hashCode();
        int iHashCode26 = this.totalProfitPercentage.hashCode();
        int iHashCode27 = this.unrealizedProfit.hashCode();
        int iHashCode28 = this.unrealizedProfitPercentage.hashCode();
        int iHashCode29 = this.upnlConvertToNativeTokenAmount.hashCode();
        int iHashCode30 = this.walletAddress.hashCode();
        Boolean bool2 = this.isPnlSupported;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.meme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldingData(amount=" + this.amount + ", boughtAvgPrice=" + this.boughtAvgPrice + ", boughtVolume=" + this.boughtVolume + ", chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", convertToNativeTokenAmount=" + this.convertToNativeTokenAmount + ", currencyAmount=" + this.currencyAmount + ", holdAvgPrice=" + this.holdAvgPrice + ", inWatchList=" + this.inWatchList + ", lowLiquidity=" + this.lowLiquidity + ", marketCap=" + this.marketCap + ", meme=" + this.meme + ", nativeToken=" + this.nativeToken + ", nativeTokenAddress=" + this.nativeTokenAddress + ", nativeTokenPrice=" + this.nativeTokenPrice + ", price=" + this.price + ", realizedProfit=" + this.realizedProfit + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", stableCoinToken=" + this.stableCoinToken + ", spotBalance=" + this.spotBalance + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", totalProfit=" + this.totalProfit + ", totalProfitPercentage=" + this.totalProfitPercentage + ", unrealizedProfit=" + this.unrealizedProfit + ", unrealizedProfitPercentage=" + this.unrealizedProfitPercentage + ", upnlConvertToNativeTokenAmount=" + this.upnlConvertToNativeTokenAmount + ", walletAddress=" + this.walletAddress + ", isPnlSupported=" + this.isPnlSupported + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.upnlConvertToNativeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.unrealizedProfit;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.holdings.HoldingData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HoldingData> serializer() {
            return HoldingData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HoldingData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, boolean z4, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.boughtAvgPrice = "";
        } else {
            this.boughtAvgPrice = str2;
        }
        if ((i & 4) == 0) {
            this.boughtVolume = "";
        } else {
            this.boughtVolume = str3;
        }
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str4;
        }
        if ((i & 16) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str5;
        }
        if ((i & 32) == 0) {
            this.convertToNativeTokenAmount = "";
        } else {
            this.convertToNativeTokenAmount = str6;
        }
        if ((i & 64) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str7;
        }
        if ((i & 128) == 0) {
            this.holdAvgPrice = "";
        } else {
            this.holdAvgPrice = str8;
        }
        if ((i & 256) == 0) {
            this.inWatchList = false;
        } else {
            this.inWatchList = z;
        }
        if ((i & 512) == 0) {
            this.lowLiquidity = false;
        } else {
            this.lowLiquidity = z2;
        }
        if ((i & 1024) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str9;
        }
        if ((i & 2048) == 0) {
            this.meme = false;
        } else {
            this.meme = z3;
        }
        if ((i & 4096) == 0) {
            this.nativeToken = false;
        } else {
            this.nativeToken = z4;
        }
        if ((i & 8192) == 0) {
            this.nativeTokenAddress = "";
        } else {
            this.nativeTokenAddress = str10;
        }
        if ((i & 16384) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str11;
        }
        if ((32768 & i) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((65536 & i) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str13;
        }
        if ((131072 & i) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str14;
        }
        if ((262144 & i) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str15;
        }
        this.stableCoinToken = (524288 & i) == 0 ? Boolean.FALSE : bool;
        if ((1048576 & i) == 0) {
            this.spotBalance = "";
        } else {
            this.spotBalance = str16;
        }
        if ((2097152 & i) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str17;
        }
        if ((4194304 & i) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str18;
        }
        if ((8388608 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str19;
        }
        if ((16777216 & i) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str20;
        }
        if ((33554432 & i) == 0) {
            this.totalProfitPercentage = "";
        } else {
            this.totalProfitPercentage = str21;
        }
        if ((67108864 & i) == 0) {
            this.unrealizedProfit = "";
        } else {
            this.unrealizedProfit = str22;
        }
        if ((134217728 & i) == 0) {
            this.unrealizedProfitPercentage = "";
        } else {
            this.unrealizedProfitPercentage = str23;
        }
        if ((268435456 & i) == 0) {
            this.upnlConvertToNativeTokenAmount = "";
        } else {
            this.upnlConvertToNativeTokenAmount = str24;
        }
        if ((536870912 & i) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str25;
        }
        this.isPnlSupported = (i & 1073741824) == 0 ? Boolean.FALSE : bool2;
    }

    public static final /* synthetic */ void copydefault(HoldingData holdingData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holdingData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holdingData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holdingData.boughtAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holdingData.boughtAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holdingData.boughtVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holdingData.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holdingData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holdingData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holdingData.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holdingData.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holdingData.convertToNativeTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holdingData.convertToNativeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) holdingData.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, holdingData.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) holdingData.holdAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, holdingData.holdAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || holdingData.inWatchList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, holdingData.inWatchList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || holdingData.lowLiquidity) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, holdingData.lowLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holdingData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holdingData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || holdingData.meme) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, holdingData.meme);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || holdingData.nativeToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, holdingData.nativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) holdingData.nativeTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, holdingData.nativeTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) holdingData.nativeTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, holdingData.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) holdingData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, holdingData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) holdingData.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, holdingData.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) holdingData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, holdingData.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) holdingData.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, holdingData.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(holdingData.stableCoinToken, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, holdingData.stableCoinToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) holdingData.spotBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, holdingData.spotBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) holdingData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, holdingData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) holdingData.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, holdingData.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) holdingData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, holdingData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) holdingData.totalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, holdingData.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) holdingData.totalProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, holdingData.totalProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) holdingData.unrealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, holdingData.unrealizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) holdingData.unrealizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, holdingData.unrealizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) holdingData.upnlConvertToNativeTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, holdingData.upnlConvertToNativeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) holdingData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, holdingData.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && Intrinsics.EZpvd(holdingData.isPnlSupported, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, holdingData.isPnlSupported);
    }

    public HoldingData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, boolean z3, boolean z4, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, Boolean bool, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, Boolean bool2) {
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
        this.amount = str;
        this.boughtAvgPrice = str2;
        this.boughtVolume = str3;
        this.chainId = str4;
        this.chainLogo = str5;
        this.convertToNativeTokenAmount = str6;
        this.currencyAmount = str7;
        this.holdAvgPrice = str8;
        this.inWatchList = z;
        this.lowLiquidity = z2;
        this.marketCap = str9;
        this.meme = z3;
        this.nativeToken = z4;
        this.nativeTokenAddress = str10;
        this.nativeTokenPrice = str11;
        this.price = str12;
        this.realizedProfit = str13;
        this.riskControlLevel = str14;
        this.riskLevel = str15;
        this.stableCoinToken = bool;
        this.spotBalance = str16;
        this.tokenAddress = str17;
        this.tokenLogo = str18;
        this.tokenSymbol = str19;
        this.totalProfit = str20;
        this.totalProfitPercentage = str21;
        this.unrealizedProfit = str22;
        this.unrealizedProfitPercentage = str23;
        this.upnlConvertToNativeTokenAmount = str24;
        this.walletAddress = str25;
        this.isPnlSupported = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0170: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r45v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b2: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r52v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0127: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x012b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r63v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:7) call: com.okinc.business.market.data.model.holdings.HoldingData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ HoldingData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, boolean z4, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? false : z3, (i & 4096) == 0 ? z4 : false, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14, (i & 262144) != 0 ? "" : str15, (i & 524288) != 0 ? Boolean.FALSE : bool, (i & 1048576) != 0 ? "" : str16, (i & 2097152) != 0 ? "" : str17, (i & 4194304) != 0 ? "" : str18, (i & 8388608) != 0 ? "" : str19, (i & 16777216) != 0 ? "" : str20, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str21, (i & 67108864) != 0 ? "" : str22, (i & 134217728) != 0 ? "" : str23, (i & 268435456) != 0 ? "" : str24, (i & 536870912) != 0 ? "" : str25, (i & 1073741824) != 0 ? Boolean.FALSE : bool2);
    }
}

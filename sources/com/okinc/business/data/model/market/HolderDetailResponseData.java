package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class HolderDetailResponseData implements Parcelable {
    public static final int $stable = 0;
    private final String addressCreateTime;
    private final String chainId;
    private final String explorerUrl;
    private final String holdAmount;
    private final String holdAmountPercentage;
    private final String holdStatus;
    private final String holdVolume;
    private final String holderAddress;
    private final String holdingTime;
    private final boolean isPnlSupported;
    private final String lastTradeTime;
    private final String maxHoldAmount;
    private final String pnl7d;
    private final String realizedProfit;
    private final String realizedProfitPercentage;
    private final String tokenContractAddress;
    private final String totalBuyAmount;
    private final String totalBuyCount;
    private final String totalBuyCurrencyValue;
    private final String totalProfit;
    private final String totalProfitPercentage;
    private final String totalSellAmount;
    private final String totalSellCount;
    private final String totalSellCurrencyValue;
    private final String tradeCurrencyValue7d;
    private final String txs7d;
    private final String unRealizedProfit;
    private final String unRealizedProfitPercentage;
    private final String winRate7d;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HolderDetailResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HolderDetailResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailResponseData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderDetailResponseData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailResponseData[] newArray(int i) {
            return new HolderDetailResponseData[i];
        }
    }

    @SerialName("addressCreateTime")
    public static /* synthetic */ void getAddressCreateTime$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("explorerUrl")
    public static /* synthetic */ void getExplorerUrl$annotations() {
    }

    @SerialName("holdAmount")
    public static /* synthetic */ void getHoldAmount$annotations() {
    }

    @SerialName("holdAmountPercentage")
    public static /* synthetic */ void getHoldAmountPercentage$annotations() {
    }

    @SerialName("holdStatus")
    public static /* synthetic */ void getHoldStatus$annotations() {
    }

    @SerialName("holdVolume")
    public static /* synthetic */ void getHoldVolume$annotations() {
    }

    @SerialName("holderAddress")
    public static /* synthetic */ void getHolderAddress$annotations() {
    }

    @SerialName("holdingTime")
    public static /* synthetic */ void getHoldingTime$annotations() {
    }

    @SerialName("lastTradeTime")
    public static /* synthetic */ void getLastTradeTime$annotations() {
    }

    @SerialName("maxHoldAmount")
    public static /* synthetic */ void getMaxHoldAmount$annotations() {
    }

    @SerialName("pnl7d")
    public static /* synthetic */ void getPnl7d$annotations() {
    }

    @SerialName("realizedProfit")
    public static /* synthetic */ void getRealizedProfit$annotations() {
    }

    @SerialName("realizedProfitPercentage")
    public static /* synthetic */ void getRealizedProfitPercentage$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("totalBuyAmount")
    public static /* synthetic */ void getTotalBuyAmount$annotations() {
    }

    @SerialName("totalBuyCount")
    public static /* synthetic */ void getTotalBuyCount$annotations() {
    }

    @SerialName("totalBuyCurrencyValue")
    public static /* synthetic */ void getTotalBuyCurrencyValue$annotations() {
    }

    @SerialName("totalProfit")
    public static /* synthetic */ void getTotalProfit$annotations() {
    }

    @SerialName("totalProfitPercentage")
    public static /* synthetic */ void getTotalProfitPercentage$annotations() {
    }

    @SerialName("totalSellAmount")
    public static /* synthetic */ void getTotalSellAmount$annotations() {
    }

    @SerialName("totalSellCount")
    public static /* synthetic */ void getTotalSellCount$annotations() {
    }

    @SerialName("totalSellCurrencyValue")
    public static /* synthetic */ void getTotalSellCurrencyValue$annotations() {
    }

    @SerialName("tradeCurrencyValue7d")
    public static /* synthetic */ void getTradeCurrencyValue7d$annotations() {
    }

    @SerialName("txs7d")
    public static /* synthetic */ void getTxs7d$annotations() {
    }

    @SerialName("unRealizedProfit")
    public static /* synthetic */ void getUnRealizedProfit$annotations() {
    }

    @SerialName("unRealizedProfitPercentage")
    public static /* synthetic */ void getUnRealizedProfitPercentage$annotations() {
    }

    @SerialName("winRate7d")
    public static /* synthetic */ void getWinRate7d$annotations() {
    }

    @SerialName("isPnlSupported")
    public static /* synthetic */ void isPnlSupported$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.unRealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.unRealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.holdingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.maxHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.holdStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.addressCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.winRate7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.pnl7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.txs7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tradeCurrencyValue7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalBuyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalBuyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalBuyCurrencyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalSellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalSellCurrencyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailResponseData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, boolean z, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
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
        return new HolderDetailResponseData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z, str26, str27, str28);
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
        if (!(obj instanceof HolderDetailResponseData)) {
            return false;
        }
        HolderDetailResponseData holderDetailResponseData = (HolderDetailResponseData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) holderDetailResponseData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) holderDetailResponseData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.holderAddress, (Object) holderDetailResponseData.holderAddress) && Intrinsics.EZpvd((Object) this.totalBuyCount, (Object) holderDetailResponseData.totalBuyCount) && Intrinsics.EZpvd((Object) this.totalBuyAmount, (Object) holderDetailResponseData.totalBuyAmount) && Intrinsics.EZpvd((Object) this.totalBuyCurrencyValue, (Object) holderDetailResponseData.totalBuyCurrencyValue) && Intrinsics.EZpvd((Object) this.totalSellCount, (Object) holderDetailResponseData.totalSellCount) && Intrinsics.EZpvd((Object) this.totalSellAmount, (Object) holderDetailResponseData.totalSellAmount) && Intrinsics.EZpvd((Object) this.totalSellCurrencyValue, (Object) holderDetailResponseData.totalSellCurrencyValue) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) holderDetailResponseData.totalProfit) && Intrinsics.EZpvd((Object) this.totalProfitPercentage, (Object) holderDetailResponseData.totalProfitPercentage) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) holderDetailResponseData.realizedProfit) && Intrinsics.EZpvd((Object) this.unRealizedProfit, (Object) holderDetailResponseData.unRealizedProfit) && Intrinsics.EZpvd((Object) this.unRealizedProfitPercentage, (Object) holderDetailResponseData.unRealizedProfitPercentage) && Intrinsics.EZpvd((Object) this.holdAmount, (Object) holderDetailResponseData.holdAmount) && Intrinsics.EZpvd((Object) this.holdVolume, (Object) holderDetailResponseData.holdVolume) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) holderDetailResponseData.holdAmountPercentage) && Intrinsics.EZpvd((Object) this.holdingTime, (Object) holderDetailResponseData.holdingTime) && Intrinsics.EZpvd((Object) this.maxHoldAmount, (Object) holderDetailResponseData.maxHoldAmount) && Intrinsics.EZpvd((Object) this.lastTradeTime, (Object) holderDetailResponseData.lastTradeTime) && Intrinsics.EZpvd((Object) this.holdStatus, (Object) holderDetailResponseData.holdStatus) && Intrinsics.EZpvd((Object) this.addressCreateTime, (Object) holderDetailResponseData.addressCreateTime) && Intrinsics.EZpvd((Object) this.winRate7d, (Object) holderDetailResponseData.winRate7d) && Intrinsics.EZpvd((Object) this.pnl7d, (Object) holderDetailResponseData.pnl7d) && Intrinsics.EZpvd((Object) this.txs7d, (Object) holderDetailResponseData.txs7d) && this.isPnlSupported == holderDetailResponseData.isPnlSupported && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) holderDetailResponseData.explorerUrl) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) holderDetailResponseData.realizedProfitPercentage) && Intrinsics.EZpvd((Object) this.tradeCurrencyValue7d, (Object) holderDetailResponseData.tradeCurrencyValue7d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressCreateTime() {
        return this.addressCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmount() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmountPercentage() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldStatus() {
        return this.holdStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldVolume() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAddress() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingTime() {
        return this.holdingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTradeTime() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxHoldAmount() {
        return this.maxHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl7d() {
        return this.pnl7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfit() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfitPercentage() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBuyAmount() {
        return this.totalBuyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBuyCount() {
        return this.totalBuyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBuyCurrencyValue() {
        return this.totalBuyCurrencyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfitPercentage() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSellAmount() {
        return this.totalSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSellCount() {
        return this.totalSellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSellCurrencyValue() {
        return this.totalSellCurrencyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeCurrencyValue7d() {
        return this.tradeCurrencyValue7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxs7d() {
        return this.txs7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnRealizedProfit() {
        return this.unRealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnRealizedProfitPercentage() {
        return this.unRealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWinRate7d() {
        return this.winRate7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.holderAddress.hashCode()) * 31) + this.totalBuyCount.hashCode()) * 31) + this.totalBuyAmount.hashCode()) * 31) + this.totalBuyCurrencyValue.hashCode()) * 31) + this.totalSellCount.hashCode()) * 31) + this.totalSellAmount.hashCode()) * 31) + this.totalSellCurrencyValue.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + this.totalProfitPercentage.hashCode()) * 31) + this.realizedProfit.hashCode()) * 31) + this.unRealizedProfit.hashCode()) * 31) + this.unRealizedProfitPercentage.hashCode()) * 31) + this.holdAmount.hashCode()) * 31) + this.holdVolume.hashCode()) * 31) + this.holdAmountPercentage.hashCode()) * 31) + this.holdingTime.hashCode()) * 31) + this.maxHoldAmount.hashCode()) * 31) + this.lastTradeTime.hashCode()) * 31) + this.holdStatus.hashCode()) * 31) + this.addressCreateTime.hashCode()) * 31) + this.winRate7d.hashCode()) * 31) + this.pnl7d.hashCode()) * 31) + this.txs7d.hashCode()) * 31) + Boolean.hashCode(this.isPnlSupported)) * 31) + this.explorerUrl.hashCode()) * 31) + this.realizedProfitPercentage.hashCode()) * 31) + this.tradeCurrencyValue7d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPnlSupported() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderDetailResponseData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", holderAddress=" + this.holderAddress + ", totalBuyCount=" + this.totalBuyCount + ", totalBuyAmount=" + this.totalBuyAmount + ", totalBuyCurrencyValue=" + this.totalBuyCurrencyValue + ", totalSellCount=" + this.totalSellCount + ", totalSellAmount=" + this.totalSellAmount + ", totalSellCurrencyValue=" + this.totalSellCurrencyValue + ", totalProfit=" + this.totalProfit + ", totalProfitPercentage=" + this.totalProfitPercentage + ", realizedProfit=" + this.realizedProfit + ", unRealizedProfit=" + this.unRealizedProfit + ", unRealizedProfitPercentage=" + this.unRealizedProfitPercentage + ", holdAmount=" + this.holdAmount + ", holdVolume=" + this.holdVolume + ", holdAmountPercentage=" + this.holdAmountPercentage + ", holdingTime=" + this.holdingTime + ", maxHoldAmount=" + this.maxHoldAmount + ", lastTradeTime=" + this.lastTradeTime + ", holdStatus=" + this.holdStatus + ", addressCreateTime=" + this.addressCreateTime + ", winRate7d=" + this.winRate7d + ", pnl7d=" + this.pnl7d + ", txs7d=" + this.txs7d + ", isPnlSupported=" + this.isPnlSupported + ", explorerUrl=" + this.explorerUrl + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ", tradeCurrencyValue7d=" + this.tradeCurrencyValue7d + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.holderAddress);
        parcel.writeString(this.totalBuyCount);
        parcel.writeString(this.totalBuyAmount);
        parcel.writeString(this.totalBuyCurrencyValue);
        parcel.writeString(this.totalSellCount);
        parcel.writeString(this.totalSellAmount);
        parcel.writeString(this.totalSellCurrencyValue);
        parcel.writeString(this.totalProfit);
        parcel.writeString(this.totalProfitPercentage);
        parcel.writeString(this.realizedProfit);
        parcel.writeString(this.unRealizedProfit);
        parcel.writeString(this.unRealizedProfitPercentage);
        parcel.writeString(this.holdAmount);
        parcel.writeString(this.holdVolume);
        parcel.writeString(this.holdAmountPercentage);
        parcel.writeString(this.holdingTime);
        parcel.writeString(this.maxHoldAmount);
        parcel.writeString(this.lastTradeTime);
        parcel.writeString(this.holdStatus);
        parcel.writeString(this.addressCreateTime);
        parcel.writeString(this.winRate7d);
        parcel.writeString(this.pnl7d);
        parcel.writeString(this.txs7d);
        parcel.writeInt(this.isPnlSupported ? 1 : 0);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.realizedProfitPercentage);
        parcel.writeString(this.tradeCurrencyValue7d);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.HolderDetailResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderDetailResponseData> serializer() {
            return HolderDetailResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderDetailResponseData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, SerializationConstructorMarker serializationConstructorMarker) {
        if (33554432 != (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE)) {
            PluginExceptionsKt.throwMissingFieldException(i, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE, HolderDetailResponseData$$serializer.INSTANCE.getDescriptor());
        }
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
            this.holderAddress = "";
        } else {
            this.holderAddress = str3;
        }
        if ((i & 8) == 0) {
            this.totalBuyCount = "";
        } else {
            this.totalBuyCount = str4;
        }
        if ((i & 16) == 0) {
            this.totalBuyAmount = "";
        } else {
            this.totalBuyAmount = str5;
        }
        if ((i & 32) == 0) {
            this.totalBuyCurrencyValue = "";
        } else {
            this.totalBuyCurrencyValue = str6;
        }
        if ((i & 64) == 0) {
            this.totalSellCount = "";
        } else {
            this.totalSellCount = str7;
        }
        if ((i & 128) == 0) {
            this.totalSellAmount = "";
        } else {
            this.totalSellAmount = str8;
        }
        if ((i & 256) == 0) {
            this.totalSellCurrencyValue = "";
        } else {
            this.totalSellCurrencyValue = str9;
        }
        if ((i & 512) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str10;
        }
        if ((i & 1024) == 0) {
            this.totalProfitPercentage = "";
        } else {
            this.totalProfitPercentage = str11;
        }
        if ((i & 2048) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str12;
        }
        if ((i & 4096) == 0) {
            this.unRealizedProfit = "";
        } else {
            this.unRealizedProfit = str13;
        }
        if ((i & 8192) == 0) {
            this.unRealizedProfitPercentage = "";
        } else {
            this.unRealizedProfitPercentage = str14;
        }
        if ((i & 16384) == 0) {
            this.holdAmount = "";
        } else {
            this.holdAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.holdVolume = "";
        } else {
            this.holdVolume = str16;
        }
        if ((65536 & i) == 0) {
            this.holdAmountPercentage = "";
        } else {
            this.holdAmountPercentage = str17;
        }
        if ((131072 & i) == 0) {
            this.holdingTime = "";
        } else {
            this.holdingTime = str18;
        }
        if ((262144 & i) == 0) {
            this.maxHoldAmount = "";
        } else {
            this.maxHoldAmount = str19;
        }
        if ((524288 & i) == 0) {
            this.lastTradeTime = "";
        } else {
            this.lastTradeTime = str20;
        }
        if ((1048576 & i) == 0) {
            this.holdStatus = "";
        } else {
            this.holdStatus = str21;
        }
        if ((2097152 & i) == 0) {
            this.addressCreateTime = "";
        } else {
            this.addressCreateTime = str22;
        }
        if ((4194304 & i) == 0) {
            this.winRate7d = "";
        } else {
            this.winRate7d = str23;
        }
        if ((8388608 & i) == 0) {
            this.pnl7d = "";
        } else {
            this.pnl7d = str24;
        }
        if ((16777216 & i) == 0) {
            this.txs7d = "";
        } else {
            this.txs7d = str25;
        }
        this.isPnlSupported = z;
        if ((67108864 & i) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str26;
        }
        if ((134217728 & i) == 0) {
            this.realizedProfitPercentage = "";
        } else {
            this.realizedProfitPercentage = str27;
        }
        if ((i & 268435456) == 0) {
            this.tradeCurrencyValue7d = "";
        } else {
            this.tradeCurrencyValue7d = str28;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderDetailResponseData holderDetailResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderDetailResponseData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holderDetailResponseData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderDetailResponseData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holderDetailResponseData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holderAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holderDetailResponseData.holderAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalBuyCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holderDetailResponseData.totalBuyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalBuyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holderDetailResponseData.totalBuyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalBuyCurrencyValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holderDetailResponseData.totalBuyCurrencyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalSellCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, holderDetailResponseData.totalSellCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalSellAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, holderDetailResponseData.totalSellAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalSellCurrencyValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, holderDetailResponseData.totalSellCurrencyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, holderDetailResponseData.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holderDetailResponseData.totalProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holderDetailResponseData.totalProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) holderDetailResponseData.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, holderDetailResponseData.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) holderDetailResponseData.unRealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, holderDetailResponseData.unRealizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) holderDetailResponseData.unRealizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, holderDetailResponseData.unRealizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, holderDetailResponseData.holdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holdVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, holderDetailResponseData.holdVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holdAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, holderDetailResponseData.holdAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holdingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, holderDetailResponseData.holdingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) holderDetailResponseData.maxHoldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, holderDetailResponseData.maxHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) holderDetailResponseData.lastTradeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, holderDetailResponseData.lastTradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) holderDetailResponseData.holdStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, holderDetailResponseData.holdStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) holderDetailResponseData.addressCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, holderDetailResponseData.addressCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) holderDetailResponseData.winRate7d, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, holderDetailResponseData.winRate7d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) holderDetailResponseData.pnl7d, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, holderDetailResponseData.pnl7d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) holderDetailResponseData.txs7d, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, holderDetailResponseData.txs7d);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 25, holderDetailResponseData.isPnlSupported);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) holderDetailResponseData.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, holderDetailResponseData.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) holderDetailResponseData.realizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, holderDetailResponseData.realizedProfitPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && Intrinsics.EZpvd((Object) holderDetailResponseData.tradeCurrencyValue7d, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 28, holderDetailResponseData.tradeCurrencyValue7d);
    }

    public HolderDetailResponseData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, boolean z, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
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
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.holderAddress = str3;
        this.totalBuyCount = str4;
        this.totalBuyAmount = str5;
        this.totalBuyCurrencyValue = str6;
        this.totalSellCount = str7;
        this.totalSellAmount = str8;
        this.totalSellCurrencyValue = str9;
        this.totalProfit = str10;
        this.totalProfitPercentage = str11;
        this.realizedProfit = str12;
        this.unRealizedProfit = str13;
        this.unRealizedProfitPercentage = str14;
        this.holdAmount = str15;
        this.holdVolume = str16;
        this.holdAmountPercentage = str17;
        this.holdingTime = str18;
        this.maxHoldAmount = str19;
        this.lastTradeTime = str20;
        this.holdStatus = str21;
        this.addressCreateTime = str22;
        this.winRate7d = str23;
        this.pnl7d = str24;
        this.txs7d = str25;
        this.isPnlSupported = z;
        this.explorerUrl = str26;
        this.realizedProfitPercentage = str27;
        this.tradeCurrencyValue7d = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0106: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r63v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r63v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r63v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r63v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r63v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r63v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r63v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r63v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r63v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r63v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r63v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r63v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r63v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r63v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r63v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (32768 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (65536 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (131072 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a0: ARITH (262144 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (524288 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (1048576 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (2097152 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (4194304 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (8388608 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (16777216 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (r59v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (67108864 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (134217728 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r63v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.business.data.model.market.HolderDetailResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderDetailResponseData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (32768 & i) != 0 ? "" : str16, (65536 & i) != 0 ? "" : str17, (131072 & i) != 0 ? "" : str18, (262144 & i) != 0 ? "" : str19, (524288 & i) != 0 ? "" : str20, (1048576 & i) != 0 ? "" : str21, (2097152 & i) != 0 ? "" : str22, (4194304 & i) != 0 ? "" : str23, (8388608 & i) != 0 ? "" : str24, (16777216 & i) != 0 ? "" : str25, z, (67108864 & i) != 0 ? "" : str26, (134217728 & i) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28);
    }
}

package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OpenOrderData implements Parcelable {
    private final int canCancel;
    private final String createTime;
    private final String createdPrice;
    private String customSlippage;
    private final boolean dealWarnTag;
    private final boolean enableJito;
    private final int exchangeDirection;
    private final String expireTime;
    private final String feeToken;
    private final String fromChainId;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenUsd;
    private final String gasPrice;
    private final boolean isMemeTimeOut;
    private final boolean isShowCancel;
    private final boolean isShowSpeedUp;
    private final boolean isShowSpeedUpCancel;
    private final String latestTransactionHash;
    private String maxSlippage;
    private final String memeTokenMarketCap;
    private final String orderId;
    private final String preFailureReason;
    private final String price;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String remainTime;
    private final String routerModeType;
    private final String slippage;
    private final String speedUpTxHash;
    private final String status;
    private final int strategyType;
    private final String toChainId;
    private final DexMultiTokenInfoBean toToken;
    private final String toTokenAmount;
    private final String toTokenUsd;
    private final String totalReceiveAmount;
    private final String triggerMarketCapacity;
    private final String triggerPrice;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OpenOrderData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OpenOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenOrderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OpenOrderData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenOrderData[] newArray(int i) {
            return new OpenOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component10() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component11() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.remainTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.totalReceiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.canCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.preFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.dealWarnTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.createdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.memeTokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OpenOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, int i, int i2, int i3, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, boolean z, @NotNull String str24, boolean z2, boolean z3, boolean z4, @NotNull String str25, boolean z5, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z6) {
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
        return new OpenOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str10, str11, str12, str13, str14, str15, str16, str17, str18, i, i2, i3, str19, str20, str21, str22, str23, z, str24, z2, z3, z4, str25, z5, str26, str27, str28, str29, z6);
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
        if (!(obj instanceof OpenOrderData)) {
            return false;
        }
        OpenOrderData openOrderData = (OpenOrderData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) openOrderData.orderId) && Intrinsics.EZpvd((Object) this.fromChainId, (Object) openOrderData.fromChainId) && Intrinsics.EZpvd((Object) this.toChainId, (Object) openOrderData.toChainId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) openOrderData.userWalletAddress) && Intrinsics.EZpvd((Object) this.createTime, (Object) openOrderData.createTime) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) openOrderData.fromTokenAmount) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) openOrderData.toTokenAmount) && Intrinsics.EZpvd((Object) this.fromTokenUsd, (Object) openOrderData.fromTokenUsd) && Intrinsics.EZpvd((Object) this.toTokenUsd, (Object) openOrderData.toTokenUsd) && Intrinsics.EZpvd(this.fromToken, openOrderData.fromToken) && Intrinsics.EZpvd(this.toToken, openOrderData.toToken) && Intrinsics.EZpvd((Object) this.latestTransactionHash, (Object) openOrderData.latestTransactionHash) && Intrinsics.EZpvd((Object) this.remainTime, (Object) openOrderData.remainTime) && Intrinsics.EZpvd((Object) this.status, (Object) openOrderData.status) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) openOrderData.priorityFee) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) openOrderData.customSlippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) openOrderData.maxSlippage) && Intrinsics.EZpvd((Object) this.price, (Object) openOrderData.price) && Intrinsics.EZpvd((Object) this.totalReceiveAmount, (Object) openOrderData.totalReceiveAmount) && Intrinsics.EZpvd((Object) this.expireTime, (Object) openOrderData.expireTime) && this.strategyType == openOrderData.strategyType && this.exchangeDirection == openOrderData.exchangeDirection && this.canCancel == openOrderData.canCancel && Intrinsics.EZpvd((Object) this.slippage, (Object) openOrderData.slippage) && Intrinsics.EZpvd((Object) this.feeToken, (Object) openOrderData.feeToken) && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) openOrderData.triggerPrice) && Intrinsics.EZpvd((Object) this.triggerMarketCapacity, (Object) openOrderData.triggerMarketCapacity) && Intrinsics.EZpvd((Object) this.preFailureReason, (Object) openOrderData.preFailureReason) && this.dealWarnTag == openOrderData.dealWarnTag && Intrinsics.EZpvd((Object) this.createdPrice, (Object) openOrderData.createdPrice) && this.isShowSpeedUp == openOrderData.isShowSpeedUp && this.isShowCancel == openOrderData.isShowCancel && this.isShowSpeedUpCancel == openOrderData.isShowSpeedUpCancel && Intrinsics.EZpvd((Object) this.memeTokenMarketCap, (Object) openOrderData.memeTokenMarketCap) && this.isMemeTimeOut == openOrderData.isMemeTimeOut && Intrinsics.EZpvd((Object) this.speedUpTxHash, (Object) openOrderData.speedUpTxHash) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) openOrderData.gasPrice) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) openOrderData.routerModeType) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) openOrderData.priorityFeeType) && this.enableJito == openOrderData.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCanCancel() {
        return this.canCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatedPrice() {
        return this.createdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomSlippage() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDealWarnTag() {
        return this.dealWarnTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeToken() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenUsd() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestTransactionHash() {
        return this.latestTransactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemeTokenMarketCap() {
        return this.memeTokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreFailureReason() {
        return this.preFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainTime() {
        return this.remainTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpTxHash() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenUsd() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalReceiveAmount() {
        return this.totalReceiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapacity() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.fromChainId.hashCode();
        int iHashCode3 = this.toChainId.hashCode();
        int iHashCode4 = this.userWalletAddress.hashCode();
        int iHashCode5 = this.createTime.hashCode();
        int iHashCode6 = this.fromTokenAmount.hashCode();
        int iHashCode7 = this.toTokenAmount.hashCode();
        int iHashCode8 = this.fromTokenUsd.hashCode();
        int iHashCode9 = this.toTokenUsd.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode10 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode11 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        int iHashCode12 = this.latestTransactionHash.hashCode();
        int iHashCode13 = this.remainTime.hashCode();
        int iHashCode14 = this.status.hashCode();
        int iHashCode15 = this.priorityFee.hashCode();
        String str = this.customSlippage;
        int iHashCode16 = str == null ? 0 : str.hashCode();
        String str2 = this.maxSlippage;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.price.hashCode()) * 31) + this.totalReceiveAmount.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + Integer.hashCode(this.strategyType)) * 31) + Integer.hashCode(this.exchangeDirection)) * 31) + Integer.hashCode(this.canCancel)) * 31) + this.slippage.hashCode()) * 31) + this.feeToken.hashCode()) * 31) + this.triggerPrice.hashCode()) * 31) + this.triggerMarketCapacity.hashCode()) * 31) + this.preFailureReason.hashCode()) * 31) + Boolean.hashCode(this.dealWarnTag)) * 31) + this.createdPrice.hashCode()) * 31) + Boolean.hashCode(this.isShowSpeedUp)) * 31) + Boolean.hashCode(this.isShowCancel)) * 31) + Boolean.hashCode(this.isShowSpeedUpCancel)) * 31) + this.memeTokenMarketCap.hashCode()) * 31) + Boolean.hashCode(this.isMemeTimeOut)) * 31) + this.speedUpTxHash.hashCode()) * 31) + this.gasPrice.hashCode()) * 31) + this.routerModeType.hashCode()) * 31) + this.priorityFeeType.hashCode()) * 31) + Boolean.hashCode(this.enableJito);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemeTimeOut() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUpCancel() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomSlippage(String str) {
        this.customSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippage(String str) {
        this.maxSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OpenOrderData(orderId=" + this.orderId + ", fromChainId=" + this.fromChainId + ", toChainId=" + this.toChainId + ", userWalletAddress=" + this.userWalletAddress + ", createTime=" + this.createTime + ", fromTokenAmount=" + this.fromTokenAmount + ", toTokenAmount=" + this.toTokenAmount + ", fromTokenUsd=" + this.fromTokenUsd + ", toTokenUsd=" + this.toTokenUsd + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", latestTransactionHash=" + this.latestTransactionHash + ", remainTime=" + this.remainTime + ", status=" + this.status + ", priorityFee=" + this.priorityFee + ", customSlippage=" + this.customSlippage + ", maxSlippage=" + this.maxSlippage + ", price=" + this.price + ", totalReceiveAmount=" + this.totalReceiveAmount + ", expireTime=" + this.expireTime + ", strategyType=" + this.strategyType + ", exchangeDirection=" + this.exchangeDirection + ", canCancel=" + this.canCancel + ", slippage=" + this.slippage + ", feeToken=" + this.feeToken + ", triggerPrice=" + this.triggerPrice + ", triggerMarketCapacity=" + this.triggerMarketCapacity + ", preFailureReason=" + this.preFailureReason + ", dealWarnTag=" + this.dealWarnTag + ", createdPrice=" + this.createdPrice + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedUpCancel=" + this.isShowSpeedUpCancel + ", memeTokenMarketCap=" + this.memeTokenMarketCap + ", isMemeTimeOut=" + this.isMemeTimeOut + ", speedUpTxHash=" + this.speedUpTxHash + ", gasPrice=" + this.gasPrice + ", routerModeType=" + this.routerModeType + ", priorityFeeType=" + this.priorityFeeType + ", enableJito=" + this.enableJito + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeString(this.fromChainId);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.createTime);
        parcel.writeString(this.fromTokenAmount);
        parcel.writeString(this.toTokenAmount);
        parcel.writeString(this.fromTokenUsd);
        parcel.writeString(this.toTokenUsd);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.latestTransactionHash);
        parcel.writeString(this.remainTime);
        parcel.writeString(this.status);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.customSlippage);
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.price);
        parcel.writeString(this.totalReceiveAmount);
        parcel.writeString(this.expireTime);
        parcel.writeInt(this.strategyType);
        parcel.writeInt(this.exchangeDirection);
        parcel.writeInt(this.canCancel);
        parcel.writeString(this.slippage);
        parcel.writeString(this.feeToken);
        parcel.writeString(this.triggerPrice);
        parcel.writeString(this.triggerMarketCapacity);
        parcel.writeString(this.preFailureReason);
        parcel.writeInt(this.dealWarnTag ? 1 : 0);
        parcel.writeString(this.createdPrice);
        parcel.writeInt(this.isShowSpeedUp ? 1 : 0);
        parcel.writeInt(this.isShowCancel ? 1 : 0);
        parcel.writeInt(this.isShowSpeedUpCancel ? 1 : 0);
        parcel.writeString(this.memeTokenMarketCap);
        parcel.writeInt(this.isMemeTimeOut ? 1 : 0);
        parcel.writeString(this.speedUpTxHash);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.routerModeType);
        parcel.writeString(this.priorityFeeType);
        parcel.writeInt(this.enableJito ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OpenOrderData> serializer() {
            return OpenOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenOrderData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i3, int i4, int i5, String str19, String str20, String str21, String str22, String str23, boolean z, String str24, boolean z2, boolean z3, boolean z4, String str25, boolean z5, String str26, String str27, String str28, String str29, boolean z6, SerializationConstructorMarker serializationConstructorMarker) {
        if (98304 != (i & 98304)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{98304, 0}, OpenOrderData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str2;
        }
        if ((i & 4) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str3;
        }
        if ((i & 8) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        if ((i & 16) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str5;
        }
        if ((i & 32) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str6;
        }
        if ((i & 64) == 0) {
            this.toTokenAmount = "";
        } else {
            this.toTokenAmount = str7;
        }
        if ((i & 128) == 0) {
            this.fromTokenUsd = "";
        } else {
            this.fromTokenUsd = str8;
        }
        if ((i & 256) == 0) {
            this.toTokenUsd = "";
        } else {
            this.toTokenUsd = str9;
        }
        if ((i & 512) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 1024) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 2048) == 0) {
            this.latestTransactionHash = "";
        } else {
            this.latestTransactionHash = str10;
        }
        if ((i & 4096) == 0) {
            this.remainTime = "";
        } else {
            this.remainTime = str11;
        }
        if ((i & 8192) == 0) {
            this.status = "";
        } else {
            this.status = str12;
        }
        if ((i & 16384) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str13;
        }
        this.customSlippage = str14;
        this.maxSlippage = str15;
        if ((131072 & i) == 0) {
            this.price = "";
        } else {
            this.price = str16;
        }
        if ((262144 & i) == 0) {
            this.totalReceiveAmount = "";
        } else {
            this.totalReceiveAmount = str17;
        }
        if ((524288 & i) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str18;
        }
        this.strategyType = (1048576 & i) == 0 ? MemeOrdersStrategyType.MARKET.getValue() : i3;
        this.exchangeDirection = (2097152 & i) == 0 ? MemeExchangeDirection.BUY.getValue() : i4;
        if ((4194304 & i) == 0) {
            this.canCancel = 0;
        } else {
            this.canCancel = i5;
        }
        if ((8388608 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str19;
        }
        if ((16777216 & i) == 0) {
            this.feeToken = "";
        } else {
            this.feeToken = str20;
        }
        if ((33554432 & i) == 0) {
            this.triggerPrice = "";
        } else {
            this.triggerPrice = str21;
        }
        if ((67108864 & i) == 0) {
            this.triggerMarketCapacity = "";
        } else {
            this.triggerMarketCapacity = str22;
        }
        if ((134217728 & i) == 0) {
            this.preFailureReason = "";
        } else {
            this.preFailureReason = str23;
        }
        if ((268435456 & i) == 0) {
            this.dealWarnTag = false;
        } else {
            this.dealWarnTag = z;
        }
        if ((536870912 & i) == 0) {
            this.createdPrice = "";
        } else {
            this.createdPrice = str24;
        }
        if ((1073741824 & i) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z2;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z3;
        }
        if ((i2 & 1) == 0) {
            this.isShowSpeedUpCancel = false;
        } else {
            this.isShowSpeedUpCancel = z4;
        }
        if ((i2 & 2) == 0) {
            this.memeTokenMarketCap = "";
        } else {
            this.memeTokenMarketCap = str25;
        }
        if ((i2 & 4) == 0) {
            this.isMemeTimeOut = false;
        } else {
            this.isMemeTimeOut = z5;
        }
        if ((i2 & 8) == 0) {
            this.speedUpTxHash = "";
        } else {
            this.speedUpTxHash = str26;
        }
        if ((i2 & 16) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str27;
        }
        if ((i2 & 32) == 0) {
            this.routerModeType = "";
        } else {
            this.routerModeType = str28;
        }
        if ((i2 & 64) == 0) {
            this.priorityFeeType = "";
        } else {
            this.priorityFeeType = str29;
        }
        if ((i2 & 128) == 0) {
            this.enableJito = false;
        } else {
            this.enableJito = z6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OpenOrderData openOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) openOrderData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, openOrderData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) openOrderData.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, openOrderData.fromChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) openOrderData.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, openOrderData.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) openOrderData.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, openOrderData.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) openOrderData.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, openOrderData.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) openOrderData.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, openOrderData.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) openOrderData.toTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, openOrderData.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) openOrderData.fromTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, openOrderData.fromTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) openOrderData.toTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, openOrderData.toTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || openOrderData.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, DexMultiTokenInfoBean$$serializer.INSTANCE, openOrderData.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || openOrderData.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DexMultiTokenInfoBean$$serializer.INSTANCE, openOrderData.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) openOrderData.latestTransactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, openOrderData.latestTransactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) openOrderData.remainTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, openOrderData.remainTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) openOrderData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, openOrderData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) openOrderData.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, openOrderData.priorityFee);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, openOrderData.customSlippage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, openOrderData.maxSlippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) openOrderData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, openOrderData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) openOrderData.totalReceiveAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, openOrderData.totalReceiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) openOrderData.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, openOrderData.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || openOrderData.strategyType != MemeOrdersStrategyType.MARKET.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, openOrderData.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || openOrderData.exchangeDirection != MemeExchangeDirection.BUY.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, openOrderData.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || openOrderData.canCancel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, openOrderData.canCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) openOrderData.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, openOrderData.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) openOrderData.feeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, openOrderData.feeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) openOrderData.triggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, openOrderData.triggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) openOrderData.triggerMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, openOrderData.triggerMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) openOrderData.preFailureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, openOrderData.preFailureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || openOrderData.dealWarnTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, openOrderData.dealWarnTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) openOrderData.createdPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, openOrderData.createdPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || openOrderData.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, openOrderData.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || openOrderData.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, openOrderData.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || openOrderData.isShowSpeedUpCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, openOrderData.isShowSpeedUpCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) openOrderData.memeTokenMarketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, openOrderData.memeTokenMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || openOrderData.isMemeTimeOut) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, openOrderData.isMemeTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) openOrderData.speedUpTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, openOrderData.speedUpTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) openOrderData.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, openOrderData.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) openOrderData.routerModeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, openOrderData.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) openOrderData.priorityFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, openOrderData.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || openOrderData.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, openOrderData.enableJito);
        }
    }

    public OpenOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, int i, int i2, int i3, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, boolean z, @NotNull String str24, boolean z2, boolean z3, boolean z4, @NotNull String str25, boolean z5, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z6) {
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
        this.orderId = str;
        this.fromChainId = str2;
        this.toChainId = str3;
        this.userWalletAddress = str4;
        this.createTime = str5;
        this.fromTokenAmount = str6;
        this.toTokenAmount = str7;
        this.fromTokenUsd = str8;
        this.toTokenUsd = str9;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.latestTransactionHash = str10;
        this.remainTime = str11;
        this.status = str12;
        this.priorityFee = str13;
        this.customSlippage = str14;
        this.maxSlippage = str15;
        this.price = str16;
        this.totalReceiveAmount = str17;
        this.expireTime = str18;
        this.strategyType = i;
        this.exchangeDirection = i2;
        this.canCancel = i3;
        this.slippage = str19;
        this.feeToken = str20;
        this.triggerPrice = str21;
        this.triggerMarketCapacity = str22;
        this.preFailureReason = str23;
        this.dealWarnTag = z;
        this.createdPrice = str24;
        this.isShowSpeedUp = z2;
        this.isShowCancel = z3;
        this.isShowSpeedUpCancel = z4;
        this.memeTokenMarketCap = str25;
        this.isMemeTimeOut = z5;
        this.speedUpTxHash = str26;
        this.gasPrice = str27;
        this.routerModeType = str28;
        this.priorityFeeType = str29;
        this.enableJito = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0174: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r86v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r86v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r86v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r86v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r86v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r86v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r86v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r86v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r86v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r86v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r55v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0057: ARITH (r86v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r56v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r86v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r86v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r86v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r86v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (131072 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (262144 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (524288 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a3: ARITH (1048576 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ac: INVOKE 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType:0x00a6: SGET  A[WRAPPED] (LINE:59) com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType.MARKET com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType)
 VIRTUAL call: com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType.getValue():int A[MD:():int (m), WRAPPED] (LINE:59)) : (r66v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b3: ARITH (2097152 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bc: INVOKE 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection:0x00b6: SGET  A[WRAPPED] (LINE:60) com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection.BUY com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection)
 VIRTUAL call: com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection.getValue():int A[MD:():int (m), WRAPPED] (LINE:60)) : (r67v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c3: ARITH (4194304 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r68v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (8388608 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d8: ARITH (16777216 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e2: ARITH (33554432 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ec: ARITH (67108864 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (134217728 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0100: ARITH (268435456 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (536870912 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0114: ARITH (1073741824 int) & (r86v0 int) A[WRAPPED]) != (0 int)) ? false : (r76v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x011e: ARITH (r86v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r77v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0126: ARITH (r87v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r78v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012f: ARITH (r87v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0138: ARITH (r87v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r80v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r87v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014a: ARITH (r87v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0153: ARITH (r87v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015c: ARITH (r87v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0165: ARITH (r87v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r85v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:36) call: com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ OpenOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, int i2, int i3, String str19, String str20, String str21, String str22, String str23, boolean z, String str24, boolean z2, boolean z3, boolean z4, String str25, boolean z5, String str26, String str27, String str28, String str29, boolean z6, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) != 0 ? "" : str8, (i4 & 256) != 0 ? "" : str9, (i4 & 512) != 0 ? null : dexMultiTokenInfoBean, (i4 & 1024) != 0 ? null : dexMultiTokenInfoBean2, (i4 & 2048) != 0 ? "" : str10, (i4 & 4096) != 0 ? "" : str11, (i4 & 8192) != 0 ? "" : str12, (i4 & 16384) != 0 ? "" : str13, str14, str15, (131072 & i4) != 0 ? "" : str16, (262144 & i4) != 0 ? "" : str17, (524288 & i4) != 0 ? "" : str18, (1048576 & i4) != 0 ? MemeOrdersStrategyType.MARKET.getValue() : i, (2097152 & i4) != 0 ? MemeExchangeDirection.BUY.getValue() : i2, (4194304 & i4) != 0 ? 0 : i3, (8388608 & i4) != 0 ? "" : str19, (16777216 & i4) != 0 ? "" : str20, (33554432 & i4) != 0 ? "" : str21, (67108864 & i4) != 0 ? "" : str22, (134217728 & i4) != 0 ? "" : str23, (268435456 & i4) != 0 ? false : z, (536870912 & i4) != 0 ? "" : str24, (1073741824 & i4) != 0 ? false : z2, (i4 & Integer.MIN_VALUE) != 0 ? false : z3, (i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? "" : str25, (i5 & 4) != 0 ? false : z5, (i5 & 8) != 0 ? "" : str26, (i5 & 16) != 0 ? "" : str27, (i5 & 32) != 0 ? "" : str28, (i5 & 64) != 0 ? "" : str29, (i5 & 128) != 0 ? false : z6);
    }
}

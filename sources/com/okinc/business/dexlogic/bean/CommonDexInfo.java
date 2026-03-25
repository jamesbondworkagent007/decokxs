package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CommonDexInfo implements Parcelable {
    private final String code;
    private final String crossAccuracyLimit;
    private final String crossMaxAmount;
    private final String crossMiniAmount;
    private final DefiPlatformInfo defiPlatformInfo;
    private final String errorMsg;
    private final String estimateReserveGasTokenFee;
    private final String fromNativeTokenSymbol;
    private final String fromPriceFluctuation;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenPrice;
    private final String isEnableMev;
    private final String isHoneypot;
    private String isLocalLeverage;
    private final String isSafeMoonToken;
    private final String isSpecialSafeMoonToken;
    private final String mevUnstableShowLevel;
    private final String msg;
    private final String nativeTokenUnitPriceUsd;
    private final String needApprove;
    private final String priceFluctuationMonitorTime;
    private final String priceFluctuationThreshold;
    private final String quoteType;
    private final String rateFluctuation;
    private final String rateFluctuationThreshold;
    private final String realSlippage;
    private final String remainingQuota;
    private final String serviceFeeRfqUrl;
    private final String serviceFeeSwitch;
    private final String slippageFluctuationhold;
    private final String teeSignMarketRelTs;
    private final String teeSignTpslRelTs;
    private final String toNativeTokenSymbol;
    private final String toPriceFluctuation;
    private final DexMultiTokenInfoBean toToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CommonDexInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommonDexInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonDexInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommonDexInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DefiPlatformInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonDexInfo[] newArray(int i) {
            return new CommonDexInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonDexInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.fromPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.priceFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.priceFluctuationMonitorTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.isSpecialSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component18() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component19() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo component20() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.quoteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.rateFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.rateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.slippageFluctuationhold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.crossAccuracyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.crossMiniAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.serviceFeeRfqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.serviceFeeSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.teeSignMarketRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.teeSignTpslRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.crossMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimateReserveGasTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.realSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.isLocalLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DefiPlatformInfo defiPlatformInfo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33) {
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
        return new CommonDexInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, defiPlatformInfo, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33);
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
        if (!(obj instanceof CommonDexInfo)) {
            return false;
        }
        CommonDexInfo commonDexInfo = (CommonDexInfo) obj;
        return Intrinsics.EZpvd((Object) this.fromNativeTokenSymbol, (Object) commonDexInfo.fromNativeTokenSymbol) && Intrinsics.EZpvd((Object) this.toNativeTokenSymbol, (Object) commonDexInfo.toNativeTokenSymbol) && Intrinsics.EZpvd((Object) this.crossMiniAmount, (Object) commonDexInfo.crossMiniAmount) && Intrinsics.EZpvd((Object) this.crossMaxAmount, (Object) commonDexInfo.crossMaxAmount) && Intrinsics.EZpvd((Object) this.estimateReserveGasTokenFee, (Object) commonDexInfo.estimateReserveGasTokenFee) && Intrinsics.EZpvd((Object) this.isSafeMoonToken, (Object) commonDexInfo.isSafeMoonToken) && Intrinsics.EZpvd((Object) this.realSlippage, (Object) commonDexInfo.realSlippage) && Intrinsics.EZpvd((Object) this.isHoneypot, (Object) commonDexInfo.isHoneypot) && Intrinsics.EZpvd((Object) this.isLocalLeverage, (Object) commonDexInfo.isLocalLeverage) && Intrinsics.EZpvd((Object) this.code, (Object) commonDexInfo.code) && Intrinsics.EZpvd((Object) this.msg, (Object) commonDexInfo.msg) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) commonDexInfo.errorMsg) && Intrinsics.EZpvd((Object) this.fromPriceFluctuation, (Object) commonDexInfo.fromPriceFluctuation) && Intrinsics.EZpvd((Object) this.toPriceFluctuation, (Object) commonDexInfo.toPriceFluctuation) && Intrinsics.EZpvd((Object) this.priceFluctuationThreshold, (Object) commonDexInfo.priceFluctuationThreshold) && Intrinsics.EZpvd((Object) this.priceFluctuationMonitorTime, (Object) commonDexInfo.priceFluctuationMonitorTime) && Intrinsics.EZpvd((Object) this.isSpecialSafeMoonToken, (Object) commonDexInfo.isSpecialSafeMoonToken) && Intrinsics.EZpvd(this.fromToken, commonDexInfo.fromToken) && Intrinsics.EZpvd(this.toToken, commonDexInfo.toToken) && Intrinsics.EZpvd(this.defiPlatformInfo, commonDexInfo.defiPlatformInfo) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) commonDexInfo.fromTokenPrice) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) commonDexInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.quoteType, (Object) commonDexInfo.quoteType) && Intrinsics.EZpvd((Object) this.rateFluctuationThreshold, (Object) commonDexInfo.rateFluctuationThreshold) && Intrinsics.EZpvd((Object) this.rateFluctuation, (Object) commonDexInfo.rateFluctuation) && Intrinsics.EZpvd((Object) this.slippageFluctuationhold, (Object) commonDexInfo.slippageFluctuationhold) && Intrinsics.EZpvd((Object) this.crossAccuracyLimit, (Object) commonDexInfo.crossAccuracyLimit) && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) commonDexInfo.isEnableMev) && Intrinsics.EZpvd((Object) this.needApprove, (Object) commonDexInfo.needApprove) && Intrinsics.EZpvd((Object) this.serviceFeeRfqUrl, (Object) commonDexInfo.serviceFeeRfqUrl) && Intrinsics.EZpvd((Object) this.serviceFeeSwitch, (Object) commonDexInfo.serviceFeeSwitch) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) commonDexInfo.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd((Object) this.teeSignMarketRelTs, (Object) commonDexInfo.teeSignMarketRelTs) && Intrinsics.EZpvd((Object) this.teeSignTpslRelTs, (Object) commonDexInfo.teeSignTpslRelTs) && Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) commonDexInfo.mevUnstableShowLevel) && Intrinsics.EZpvd((Object) this.remainingQuota, (Object) commonDexInfo.remainingQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossAccuracyLimit() {
        return this.crossAccuracyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossMaxAmount() {
        return this.crossMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossMiniAmount() {
        return this.crossMiniAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateReserveGasTokenFee() {
        return this.estimateReserveGasTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromNativeTokenSymbol() {
        return this.fromNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPriceFluctuation() {
        return this.fromPriceFluctuation;
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
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevUnstableShowLevel() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitPriceUsd() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApprove() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceFluctuationMonitorTime() {
        return this.priceFluctuationMonitorTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceFluctuationThreshold() {
        return this.priceFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteType() {
        return this.quoteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateFluctuation() {
        return this.rateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateFluctuationThreshold() {
        return this.rateFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealSlippage() {
        return this.realSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainingQuota() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeRfqUrl() {
        return this.serviceFeeRfqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeSwitch() {
        return this.serviceFeeSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageFluctuationhold() {
        return this.slippageFluctuationhold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeSignMarketRelTs() {
        return this.teeSignMarketRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeSignTpslRelTs() {
        return this.teeSignTpslRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToNativeTokenSymbol() {
        return this.toNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToPriceFluctuation() {
        return this.toPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fromNativeTokenSymbol.hashCode();
        int iHashCode2 = this.toNativeTokenSymbol.hashCode();
        int iHashCode3 = this.crossMiniAmount.hashCode();
        int iHashCode4 = this.crossMaxAmount.hashCode();
        int iHashCode5 = this.estimateReserveGasTokenFee.hashCode();
        int iHashCode6 = this.isSafeMoonToken.hashCode();
        int iHashCode7 = this.realSlippage.hashCode();
        int iHashCode8 = this.isHoneypot.hashCode();
        int iHashCode9 = this.isLocalLeverage.hashCode();
        int iHashCode10 = this.code.hashCode();
        int iHashCode11 = this.msg.hashCode();
        int iHashCode12 = this.errorMsg.hashCode();
        int iHashCode13 = this.fromPriceFluctuation.hashCode();
        int iHashCode14 = this.toPriceFluctuation.hashCode();
        int iHashCode15 = this.priceFluctuationThreshold.hashCode();
        int iHashCode16 = this.priceFluctuationMonitorTime.hashCode();
        int iHashCode17 = this.isSpecialSafeMoonToken.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode18 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode19 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        DefiPlatformInfo defiPlatformInfo = this.defiPlatformInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (defiPlatformInfo != null ? defiPlatformInfo.hashCode() : 0)) * 31) + this.fromTokenPrice.hashCode()) * 31) + this.fromTokenAmount.hashCode()) * 31) + this.quoteType.hashCode()) * 31) + this.rateFluctuationThreshold.hashCode()) * 31) + this.rateFluctuation.hashCode()) * 31) + this.slippageFluctuationhold.hashCode()) * 31) + this.crossAccuracyLimit.hashCode()) * 31) + this.isEnableMev.hashCode()) * 31) + this.needApprove.hashCode()) * 31) + this.serviceFeeRfqUrl.hashCode()) * 31) + this.serviceFeeSwitch.hashCode()) * 31) + this.nativeTokenUnitPriceUsd.hashCode()) * 31) + this.teeSignMarketRelTs.hashCode()) * 31) + this.teeSignTpslRelTs.hashCode()) * 31) + this.mevUnstableShowLevel.hashCode()) * 31) + this.remainingQuota.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isHoneypot() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLocalLeverage() {
        return this.isLocalLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSafeMoonToken() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSpecialSafeMoonToken() {
        return this.isSpecialSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalLeverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isLocalLeverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonDexInfo(fromNativeTokenSymbol=" + this.fromNativeTokenSymbol + ", toNativeTokenSymbol=" + this.toNativeTokenSymbol + ", crossMiniAmount=" + this.crossMiniAmount + ", crossMaxAmount=" + this.crossMaxAmount + ", estimateReserveGasTokenFee=" + this.estimateReserveGasTokenFee + ", isSafeMoonToken=" + this.isSafeMoonToken + ", realSlippage=" + this.realSlippage + ", isHoneypot=" + this.isHoneypot + ", isLocalLeverage=" + this.isLocalLeverage + ", code=" + this.code + ", msg=" + this.msg + ", errorMsg=" + this.errorMsg + ", fromPriceFluctuation=" + this.fromPriceFluctuation + ", toPriceFluctuation=" + this.toPriceFluctuation + ", priceFluctuationThreshold=" + this.priceFluctuationThreshold + ", priceFluctuationMonitorTime=" + this.priceFluctuationMonitorTime + ", isSpecialSafeMoonToken=" + this.isSpecialSafeMoonToken + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", defiPlatformInfo=" + this.defiPlatformInfo + ", fromTokenPrice=" + this.fromTokenPrice + ", fromTokenAmount=" + this.fromTokenAmount + ", quoteType=" + this.quoteType + ", rateFluctuationThreshold=" + this.rateFluctuationThreshold + ", rateFluctuation=" + this.rateFluctuation + ", slippageFluctuationhold=" + this.slippageFluctuationhold + ", crossAccuracyLimit=" + this.crossAccuracyLimit + ", isEnableMev=" + this.isEnableMev + ", needApprove=" + this.needApprove + ", serviceFeeRfqUrl=" + this.serviceFeeRfqUrl + ", serviceFeeSwitch=" + this.serviceFeeSwitch + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", teeSignMarketRelTs=" + this.teeSignMarketRelTs + ", teeSignTpslRelTs=" + this.teeSignTpslRelTs + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", remainingQuota=" + this.remainingQuota + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromNativeTokenSymbol);
        parcel.writeString(this.toNativeTokenSymbol);
        parcel.writeString(this.crossMiniAmount);
        parcel.writeString(this.crossMaxAmount);
        parcel.writeString(this.estimateReserveGasTokenFee);
        parcel.writeString(this.isSafeMoonToken);
        parcel.writeString(this.realSlippage);
        parcel.writeString(this.isHoneypot);
        parcel.writeString(this.isLocalLeverage);
        parcel.writeString(this.code);
        parcel.writeString(this.msg);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.fromPriceFluctuation);
        parcel.writeString(this.toPriceFluctuation);
        parcel.writeString(this.priceFluctuationThreshold);
        parcel.writeString(this.priceFluctuationMonitorTime);
        parcel.writeString(this.isSpecialSafeMoonToken);
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
        DefiPlatformInfo defiPlatformInfo = this.defiPlatformInfo;
        if (defiPlatformInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defiPlatformInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromTokenPrice);
        parcel.writeString(this.fromTokenAmount);
        parcel.writeString(this.quoteType);
        parcel.writeString(this.rateFluctuationThreshold);
        parcel.writeString(this.rateFluctuation);
        parcel.writeString(this.slippageFluctuationhold);
        parcel.writeString(this.crossAccuracyLimit);
        parcel.writeString(this.isEnableMev);
        parcel.writeString(this.needApprove);
        parcel.writeString(this.serviceFeeRfqUrl);
        parcel.writeString(this.serviceFeeSwitch);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeString(this.teeSignMarketRelTs);
        parcel.writeString(this.teeSignTpslRelTs);
        parcel.writeString(this.mevUnstableShowLevel);
        parcel.writeString(this.remainingQuota);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CommonDexInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonDexInfo> serializer() {
            return CommonDexInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonDexInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DefiPlatformInfo defiPlatformInfo, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromNativeTokenSymbol = "";
        } else {
            this.fromNativeTokenSymbol = str;
        }
        if ((i & 2) == 0) {
            this.toNativeTokenSymbol = "";
        } else {
            this.toNativeTokenSymbol = str2;
        }
        if ((i & 4) == 0) {
            this.crossMiniAmount = "";
        } else {
            this.crossMiniAmount = str3;
        }
        if ((i & 8) == 0) {
            this.crossMaxAmount = "";
        } else {
            this.crossMaxAmount = str4;
        }
        if ((i & 16) == 0) {
            this.estimateReserveGasTokenFee = "";
        } else {
            this.estimateReserveGasTokenFee = str5;
        }
        if ((i & 32) == 0) {
            this.isSafeMoonToken = "0";
        } else {
            this.isSafeMoonToken = str6;
        }
        if ((i & 64) == 0) {
            this.realSlippage = "";
        } else {
            this.realSlippage = str7;
        }
        if ((i & 128) == 0) {
            this.isHoneypot = "";
        } else {
            this.isHoneypot = str8;
        }
        if ((i & 256) == 0) {
            this.isLocalLeverage = "";
        } else {
            this.isLocalLeverage = str9;
        }
        if ((i & 512) == 0) {
            this.code = "";
        } else {
            this.code = str10;
        }
        if ((i & 1024) == 0) {
            this.msg = "";
        } else {
            this.msg = str11;
        }
        if ((i & 2048) == 0) {
            this.errorMsg = "";
        } else {
            this.errorMsg = str12;
        }
        if ((i & 4096) == 0) {
            this.fromPriceFluctuation = "";
        } else {
            this.fromPriceFluctuation = str13;
        }
        if ((i & 8192) == 0) {
            this.toPriceFluctuation = "";
        } else {
            this.toPriceFluctuation = str14;
        }
        if ((i & 16384) == 0) {
            this.priceFluctuationThreshold = "";
        } else {
            this.priceFluctuationThreshold = str15;
        }
        if ((32768 & i) == 0) {
            this.priceFluctuationMonitorTime = "";
        } else {
            this.priceFluctuationMonitorTime = str16;
        }
        if ((65536 & i) == 0) {
            this.isSpecialSafeMoonToken = "";
        } else {
            this.isSpecialSafeMoonToken = str17;
        }
        if ((131072 & i) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((262144 & i) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((524288 & i) == 0) {
            this.defiPlatformInfo = null;
        } else {
            this.defiPlatformInfo = defiPlatformInfo;
        }
        if ((1048576 & i) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str18;
        }
        if ((2097152 & i) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str19;
        }
        if ((4194304 & i) == 0) {
            this.quoteType = "";
        } else {
            this.quoteType = str20;
        }
        if ((8388608 & i) == 0) {
            this.rateFluctuationThreshold = "";
        } else {
            this.rateFluctuationThreshold = str21;
        }
        if ((16777216 & i) == 0) {
            this.rateFluctuation = "";
        } else {
            this.rateFluctuation = str22;
        }
        if ((33554432 & i) == 0) {
            this.slippageFluctuationhold = "";
        } else {
            this.slippageFluctuationhold = str23;
        }
        if ((67108864 & i) == 0) {
            this.crossAccuracyLimit = "";
        } else {
            this.crossAccuracyLimit = str24;
        }
        if ((134217728 & i) == 0) {
            this.isEnableMev = "0";
        } else {
            this.isEnableMev = str25;
        }
        if ((268435456 & i) == 0) {
            this.needApprove = "0";
        } else {
            this.needApprove = str26;
        }
        if ((536870912 & i) == 0) {
            this.serviceFeeRfqUrl = "";
        } else {
            this.serviceFeeRfqUrl = str27;
        }
        if ((1073741824 & i) == 0) {
            this.serviceFeeSwitch = "";
        } else {
            this.serviceFeeSwitch = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nativeTokenUnitPriceUsd = "";
        } else {
            this.nativeTokenUnitPriceUsd = str29;
        }
        if ((i2 & 1) == 0) {
            this.teeSignMarketRelTs = "";
        } else {
            this.teeSignMarketRelTs = str30;
        }
        if ((i2 & 2) == 0) {
            this.teeSignTpslRelTs = "";
        } else {
            this.teeSignTpslRelTs = str31;
        }
        this.mevUnstableShowLevel = (i2 & 4) == 0 ? MevUnstableShowLevelType.NORMAL.getType() : str32;
        if ((i2 & 8) == 0) {
            this.remainingQuota = "";
        } else {
            this.remainingQuota = str33;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CommonDexInfo commonDexInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) commonDexInfo.fromNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, commonDexInfo.fromNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) commonDexInfo.toNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, commonDexInfo.toNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) commonDexInfo.crossMiniAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, commonDexInfo.crossMiniAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) commonDexInfo.crossMaxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, commonDexInfo.crossMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) commonDexInfo.estimateReserveGasTokenFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, commonDexInfo.estimateReserveGasTokenFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) commonDexInfo.isSafeMoonToken, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, commonDexInfo.isSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) commonDexInfo.realSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, commonDexInfo.realSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) commonDexInfo.isHoneypot, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, commonDexInfo.isHoneypot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) commonDexInfo.isLocalLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, commonDexInfo.isLocalLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) commonDexInfo.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, commonDexInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) commonDexInfo.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, commonDexInfo.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) commonDexInfo.errorMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, commonDexInfo.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) commonDexInfo.fromPriceFluctuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, commonDexInfo.fromPriceFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) commonDexInfo.toPriceFluctuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, commonDexInfo.toPriceFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) commonDexInfo.priceFluctuationThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, commonDexInfo.priceFluctuationThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) commonDexInfo.priceFluctuationMonitorTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, commonDexInfo.priceFluctuationMonitorTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) commonDexInfo.isSpecialSafeMoonToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, commonDexInfo.isSpecialSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || commonDexInfo.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DexMultiTokenInfoBean$$serializer.INSTANCE, commonDexInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || commonDexInfo.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, DexMultiTokenInfoBean$$serializer.INSTANCE, commonDexInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || commonDexInfo.defiPlatformInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, DefiPlatformInfo$$serializer.INSTANCE, commonDexInfo.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) commonDexInfo.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, commonDexInfo.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) commonDexInfo.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, commonDexInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) commonDexInfo.quoteType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, commonDexInfo.quoteType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) commonDexInfo.rateFluctuationThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, commonDexInfo.rateFluctuationThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) commonDexInfo.rateFluctuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, commonDexInfo.rateFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) commonDexInfo.slippageFluctuationhold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, commonDexInfo.slippageFluctuationhold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) commonDexInfo.crossAccuracyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, commonDexInfo.crossAccuracyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) commonDexInfo.isEnableMev, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, commonDexInfo.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) commonDexInfo.needApprove, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, commonDexInfo.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) commonDexInfo.serviceFeeRfqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, commonDexInfo.serviceFeeRfqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) commonDexInfo.serviceFeeSwitch, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, commonDexInfo.serviceFeeSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) commonDexInfo.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, commonDexInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) commonDexInfo.teeSignMarketRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, commonDexInfo.teeSignMarketRelTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) commonDexInfo.teeSignTpslRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, commonDexInfo.teeSignTpslRelTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) commonDexInfo.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.NORMAL.getType())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, commonDexInfo.mevUnstableShowLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && Intrinsics.EZpvd((Object) commonDexInfo.remainingQuota, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 35, commonDexInfo.remainingQuota);
    }

    public CommonDexInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DefiPlatformInfo defiPlatformInfo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33) {
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
        this.fromNativeTokenSymbol = str;
        this.toNativeTokenSymbol = str2;
        this.crossMiniAmount = str3;
        this.crossMaxAmount = str4;
        this.estimateReserveGasTokenFee = str5;
        this.isSafeMoonToken = str6;
        this.realSlippage = str7;
        this.isHoneypot = str8;
        this.isLocalLeverage = str9;
        this.code = str10;
        this.msg = str11;
        this.errorMsg = str12;
        this.fromPriceFluctuation = str13;
        this.toPriceFluctuation = str14;
        this.priceFluctuationThreshold = str15;
        this.priceFluctuationMonitorTime = str16;
        this.isSpecialSafeMoonToken = str17;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.defiPlatformInfo = defiPlatformInfo;
        this.fromTokenPrice = str18;
        this.fromTokenAmount = str19;
        this.quoteType = str20;
        this.rateFluctuationThreshold = str21;
        this.rateFluctuation = str22;
        this.slippageFluctuationhold = str23;
        this.crossAccuracyLimit = str24;
        this.isEnableMev = str25;
        this.needApprove = str26;
        this.serviceFeeRfqUrl = str27;
        this.serviceFeeSwitch = str28;
        this.nativeTokenUnitPriceUsd = str29;
        this.teeSignMarketRelTs = str30;
        this.teeSignTpslRelTs = str31;
        this.mevUnstableShowLevel = str32;
        this.remainingQuota = str33;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01b2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x009d: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r54v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r55v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r56v0 com.okinc.business.dexlogic.bean.DefiPlatformInfo) : (null com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("0") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("0") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0158: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MevUnstableShowLevelType:0x0156: SGET  A[WRAPPED] (LINE:183) com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.NORMAL com.okinc.business.dexlogic.bean.MevUnstableShowLevelType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:183)) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015f: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:148) call: com.okinc.business.dexlogic.bean.CommonDexInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonDexInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DefiPlatformInfo defiPlatformInfo, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "0" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? null : dexMultiTokenInfoBean, (i & 262144) != 0 ? null : dexMultiTokenInfoBean2, (i & 524288) == 0 ? defiPlatformInfo : null, (i & 1048576) != 0 ? "" : str18, (i & 2097152) != 0 ? "" : str19, (i & 4194304) != 0 ? "" : str20, (i & 8388608) != 0 ? "" : str21, (i & 16777216) != 0 ? "" : str22, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i & 67108864) != 0 ? "" : str24, (i & 134217728) != 0 ? "0" : str25, (i & 268435456) != 0 ? "0" : str26, (i & 536870912) != 0 ? "" : str27, (i & 1073741824) != 0 ? "" : str28, (i & Integer.MIN_VALUE) != 0 ? "" : str29, (i2 & 1) != 0 ? "" : str30, (i2 & 2) != 0 ? "" : str31, (i2 & 4) != 0 ? MevUnstableShowLevelType.NORMAL.getType() : str32, (i2 & 8) != 0 ? "" : str33);
    }

    public final boolean enableMev() {
        return Intrinsics.EZpvd((Object) this.isEnableMev, (Object) "1");
    }

    public final DefiPlatformInfo getDeFiPlatformInfo() {
        DefiPlatformInfo defiPlatformInfo = this.defiPlatformInfo;
        return defiPlatformInfo == null ? new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : defiPlatformInfo;
    }

    public final boolean getSafeMoonToken() {
        return Intrinsics.EZpvd((Object) this.isSafeMoonToken, (Object) "1");
    }

    public final boolean isOpenServiceFee() {
        return Intrinsics.EZpvd((Object) this.serviceFeeSwitch, (Object) "1");
    }

    public final boolean isHoneypotToken() {
        return Intrinsics.EZpvd((Object) this.isHoneypot, (Object) "1");
    }

    public final String getTokenType() {
        return (!getSafeMoonToken() || isHoneypotToken()) ? "1" : "2";
    }

    public final boolean isFromTokenFluctuationThanThreshold() {
        if (this.fromPriceFluctuation.length() == 0 || this.priceFluctuationThreshold.length() == 0) {
            return false;
        }
        return C23313hvq.OLrzqt(C23311hvo.copydefault(this.fromPriceFluctuation), C23311hvo.copydefault(this.priceFluctuationThreshold));
    }

    public final boolean isFromOrToTokenFluctuationThanThreshold() {
        return isFromTokenFluctuationThanThreshold() || isToTokenFluctuationThanThreshold();
    }

    public final boolean isSlipPageFluctuationThresholdDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return isRateFluctuationThreshold() && isSlipPageFluctuationThreshold(str);
    }

    public final String getFluctuationThanThresholdDesc(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (isFromTokenFluctuationThanThreshold() && isToTokenFluctuationThanThreshold()) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onQueueTitleChanged, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("payToken", str), C56390yDp.OLrzqt("receiveToken", str2), C56390yDp.OLrzqt("min", this.priceFluctuationMonitorTime), C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(this.priceFluctuationThreshold, false, 0, 0, null, null, 31, null))));
        }
        if (isFromTokenFluctuationThanThreshold()) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onQueueChanged, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt("min", this.priceFluctuationMonitorTime), C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(this.priceFluctuationThreshold, false, 0, 0, null, null, 31, null))));
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onQueueChanged, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str2), C56390yDp.OLrzqt("min", this.priceFluctuationMonitorTime), C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(this.priceFluctuationThreshold, false, 0, 0, null, null, 31, null))));
    }

    public final String getRateFluctuationThresholdDesc(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.sendSessionEvent, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("payToken", str), C56390yDp.OLrzqt("receiveToken", str2), C56390yDp.OLrzqt("min", this.priceFluctuationMonitorTime), C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(this.priceFluctuationThreshold, false, 0, 0, null, null, 31, null))));
    }

    public final String getSlipPageFluctuationThresholdDesc(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setFlags, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("payToken", str), C56390yDp.OLrzqt("receiveToken", str2), C56390yDp.OLrzqt("min", this.priceFluctuationMonitorTime), C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(this.priceFluctuationThreshold, false, 0, 0, null, null, 31, null))));
    }

    public final boolean isRateFluctuationThresholdDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return isFromTokenLteFluctuationThanThreshold() && isToTokenLteFluctuationThanThreshold() && isRateFluctuationThreshold() && isSlipPageLteFluctuationThreshold(str);
    }

    public final boolean isFromTokenLteFluctuationThanThreshold() {
        if (this.fromPriceFluctuation.length() == 0 || this.priceFluctuationThreshold.length() == 0) {
            return false;
        }
        return C23313hvq.valueOf(C23311hvo.copydefault(this.fromPriceFluctuation), C23311hvo.copydefault(this.priceFluctuationThreshold));
    }

    public final boolean isToTokenLteFluctuationThanThreshold() {
        if (this.toPriceFluctuation.length() == 0 || this.priceFluctuationThreshold.length() == 0) {
            return false;
        }
        return C23313hvq.valueOf(C23311hvo.copydefault(this.toPriceFluctuation), C23311hvo.copydefault(this.priceFluctuationThreshold));
    }

    public final boolean isToTokenFluctuationThanThreshold() {
        if (this.toPriceFluctuation.length() == 0 || this.priceFluctuationThreshold.length() == 0) {
            return false;
        }
        return C23313hvq.OLrzqt(C23311hvo.copydefault(this.toPriceFluctuation), C23311hvo.copydefault(this.priceFluctuationThreshold));
    }

    public final boolean isRateFluctuationThreshold() {
        if (this.rateFluctuation.length() == 0 || this.rateFluctuationThreshold.length() == 0) {
            return false;
        }
        return C23313hvq.EZpvd(this.rateFluctuation, C23311hvo.copydefault(this.rateFluctuationThreshold));
    }

    public final boolean autoOpenMev() {
        return Intrinsics.EZpvd((Object) this.isEnableMev, (Object) "1");
    }

    public final boolean isSlipPageLteFluctuationThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.slippageFluctuationhold.length() == 0) {
            return false;
        }
        return C23313hvq.valueOf(str, this.slippageFluctuationhold);
    }

    public final boolean isSlipPageFluctuationThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.slippageFluctuationhold.length() == 0) {
            return false;
        }
        return C23313hvq.OLrzqt(str, this.slippageFluctuationhold);
    }

    public final boolean isThorswapBtcAddressError() {
        return C23313hvq.copydefault(this.code, QuoteErrorBean.QUOTE_ERROR_THORSWAP_FROM_BTC_ADDRESS) || C23313hvq.copydefault(this.code, QuoteErrorBean.QUOTE_ERROR_THORSWAP_TO_BTC_ADDRESS);
    }

    public final String getSwapTypeTitle() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        return Intrinsics.EZpvd((Object) chainId, (Object) (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null)) ? C33070mpX.AYXKKw(C23274hvD.Fragment.accessBackHandlerlambda0) : C33070mpX.AYXKKw(C23274hvD.Fragment.fWSAZA);
    }
}

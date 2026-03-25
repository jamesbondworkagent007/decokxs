package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CommonDexInfo implements Parcelable {
    private final String code;
    private final String errorMsg;
    private final String estimateReserveGasTokenFee;
    private final String fromPriceFluctuation;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenValue;
    private final String nativeTokenPrice;
    private final String nativeTokenSymbol;
    private final String nativeTokenUnitPriceUsd;
    private final String priceFluctuationMonitorTime;
    private final String priceFluctuationThreshold;
    private final String rateFluctuation;
    private final String rateFluctuationThreshold;
    private final String remainingQuota;
    private final String slippageFluctuationHold;
    private final String teeSignMarketRelTs;
    private final String teeSignTpslRelTs;
    private final String toPriceFluctuation;
    private final DexMultiTokenInfoBean toToken;
    private final String tradeTaxes;
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
            return new CommonDexInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
        this((String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.priceFluctuationMonitorTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.rateFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.rateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.slippageFluctuationHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.teeSignMarketRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.teeSignTpslRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component4() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.estimateReserveGasTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo copy(String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, @NotNull String str19) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new CommonDexInfo(str, str2, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
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
        return Intrinsics.EZpvd((Object) this.code, (Object) commonDexInfo.code) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) commonDexInfo.errorMsg) && Intrinsics.EZpvd(this.fromToken, commonDexInfo.fromToken) && Intrinsics.EZpvd(this.toToken, commonDexInfo.toToken) && Intrinsics.EZpvd((Object) this.fromTokenValue, (Object) commonDexInfo.fromTokenValue) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) commonDexInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) commonDexInfo.nativeTokenPrice) && Intrinsics.EZpvd((Object) this.estimateReserveGasTokenFee, (Object) commonDexInfo.estimateReserveGasTokenFee) && Intrinsics.EZpvd((Object) this.fromPriceFluctuation, (Object) commonDexInfo.fromPriceFluctuation) && Intrinsics.EZpvd((Object) this.toPriceFluctuation, (Object) commonDexInfo.toPriceFluctuation) && Intrinsics.EZpvd((Object) this.priceFluctuationThreshold, (Object) commonDexInfo.priceFluctuationThreshold) && Intrinsics.EZpvd((Object) this.priceFluctuationMonitorTime, (Object) commonDexInfo.priceFluctuationMonitorTime) && Intrinsics.EZpvd((Object) this.rateFluctuationThreshold, (Object) commonDexInfo.rateFluctuationThreshold) && Intrinsics.EZpvd((Object) this.rateFluctuation, (Object) commonDexInfo.rateFluctuation) && Intrinsics.EZpvd((Object) this.slippageFluctuationHold, (Object) commonDexInfo.slippageFluctuationHold) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) commonDexInfo.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd((Object) this.teeSignMarketRelTs, (Object) commonDexInfo.teeSignMarketRelTs) && Intrinsics.EZpvd((Object) this.teeSignTpslRelTs, (Object) commonDexInfo.teeSignTpslRelTs) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) commonDexInfo.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.tradeTaxes, (Object) commonDexInfo.tradeTaxes) && Intrinsics.EZpvd((Object) this.remainingQuota, (Object) commonDexInfo.remainingQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
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
    public final String getFromTokenValue() {
        return this.fromTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitPriceUsd() {
        return this.nativeTokenUnitPriceUsd;
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
    public final String getRateFluctuation() {
        return this.rateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateFluctuationThreshold() {
        return this.rateFluctuationThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainingQuota() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageFluctuationHold() {
        return this.slippageFluctuationHold;
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
    public final String getToPriceFluctuation() {
        return this.toPriceFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTaxes() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.errorMsg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode3 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode4 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        String str3 = this.fromTokenValue;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fromTokenAmount;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nativeTokenPrice;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.estimateReserveGasTokenFee;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fromPriceFluctuation;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.toPriceFluctuation;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.priceFluctuationThreshold;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.priceFluctuationMonitorTime;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.rateFluctuationThreshold;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.rateFluctuation;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.slippageFluctuationHold;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.nativeTokenUnitPriceUsd;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        int iHashCode17 = this.teeSignMarketRelTs.hashCode();
        int iHashCode18 = this.teeSignTpslRelTs.hashCode();
        int iHashCode19 = this.nativeTokenSymbol.hashCode();
        String str15 = this.tradeTaxes;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str15 == null ? 0 : str15.hashCode())) * 31) + this.remainingQuota.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonDexInfo(code=" + this.code + ", errorMsg=" + this.errorMsg + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", fromTokenValue=" + this.fromTokenValue + ", fromTokenAmount=" + this.fromTokenAmount + ", nativeTokenPrice=" + this.nativeTokenPrice + ", estimateReserveGasTokenFee=" + this.estimateReserveGasTokenFee + ", fromPriceFluctuation=" + this.fromPriceFluctuation + ", toPriceFluctuation=" + this.toPriceFluctuation + ", priceFluctuationThreshold=" + this.priceFluctuationThreshold + ", priceFluctuationMonitorTime=" + this.priceFluctuationMonitorTime + ", rateFluctuationThreshold=" + this.rateFluctuationThreshold + ", rateFluctuation=" + this.rateFluctuation + ", slippageFluctuationHold=" + this.slippageFluctuationHold + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", teeSignMarketRelTs=" + this.teeSignMarketRelTs + ", teeSignTpslRelTs=" + this.teeSignTpslRelTs + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", tradeTaxes=" + this.tradeTaxes + ", remainingQuota=" + this.remainingQuota + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.errorMsg);
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
        parcel.writeString(this.fromTokenValue);
        parcel.writeString(this.fromTokenAmount);
        parcel.writeString(this.nativeTokenPrice);
        parcel.writeString(this.estimateReserveGasTokenFee);
        parcel.writeString(this.fromPriceFluctuation);
        parcel.writeString(this.toPriceFluctuation);
        parcel.writeString(this.priceFluctuationThreshold);
        parcel.writeString(this.priceFluctuationMonitorTime);
        parcel.writeString(this.rateFluctuationThreshold);
        parcel.writeString(this.rateFluctuation);
        parcel.writeString(this.slippageFluctuationHold);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeString(this.teeSignMarketRelTs);
        parcel.writeString(this.teeSignTpslRelTs);
        parcel.writeString(this.nativeTokenSymbol);
        parcel.writeString(this.tradeTaxes);
        parcel.writeString(this.remainingQuota);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.CommonDexInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonDexInfo> serializer() {
            return CommonDexInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonDexInfo(int i, String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str2;
        }
        if ((i & 4) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 8) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 16) == 0) {
            this.fromTokenValue = null;
        } else {
            this.fromTokenValue = str3;
        }
        if ((i & 32) == 0) {
            this.fromTokenAmount = null;
        } else {
            this.fromTokenAmount = str4;
        }
        if ((i & 64) == 0) {
            this.nativeTokenPrice = null;
        } else {
            this.nativeTokenPrice = str5;
        }
        if ((i & 128) == 0) {
            this.estimateReserveGasTokenFee = null;
        } else {
            this.estimateReserveGasTokenFee = str6;
        }
        if ((i & 256) == 0) {
            this.fromPriceFluctuation = null;
        } else {
            this.fromPriceFluctuation = str7;
        }
        if ((i & 512) == 0) {
            this.toPriceFluctuation = null;
        } else {
            this.toPriceFluctuation = str8;
        }
        if ((i & 1024) == 0) {
            this.priceFluctuationThreshold = null;
        } else {
            this.priceFluctuationThreshold = str9;
        }
        if ((i & 2048) == 0) {
            this.priceFluctuationMonitorTime = null;
        } else {
            this.priceFluctuationMonitorTime = str10;
        }
        if ((i & 4096) == 0) {
            this.rateFluctuationThreshold = null;
        } else {
            this.rateFluctuationThreshold = str11;
        }
        if ((i & 8192) == 0) {
            this.rateFluctuation = null;
        } else {
            this.rateFluctuation = str12;
        }
        if ((i & 16384) == 0) {
            this.slippageFluctuationHold = null;
        } else {
            this.slippageFluctuationHold = str13;
        }
        if ((32768 & i) == 0) {
            this.nativeTokenUnitPriceUsd = null;
        } else {
            this.nativeTokenUnitPriceUsd = str14;
        }
        if ((65536 & i) == 0) {
            this.teeSignMarketRelTs = "";
        } else {
            this.teeSignMarketRelTs = str15;
        }
        if ((131072 & i) == 0) {
            this.teeSignTpslRelTs = "";
        } else {
            this.teeSignTpslRelTs = str16;
        }
        if ((262144 & i) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str17;
        }
        if ((524288 & i) == 0) {
            this.tradeTaxes = null;
        } else {
            this.tradeTaxes = str18;
        }
        if ((i & 1048576) == 0) {
            this.remainingQuota = "";
        } else {
            this.remainingQuota = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CommonDexInfo commonDexInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || commonDexInfo.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, commonDexInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || commonDexInfo.errorMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, commonDexInfo.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || commonDexInfo.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, commonDexInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || commonDexInfo.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DexMultiTokenInfoBean$$serializer.INSTANCE, commonDexInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || commonDexInfo.fromTokenValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, commonDexInfo.fromTokenValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || commonDexInfo.fromTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, commonDexInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || commonDexInfo.nativeTokenPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, commonDexInfo.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || commonDexInfo.estimateReserveGasTokenFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, commonDexInfo.estimateReserveGasTokenFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || commonDexInfo.fromPriceFluctuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, commonDexInfo.fromPriceFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || commonDexInfo.toPriceFluctuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, commonDexInfo.toPriceFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || commonDexInfo.priceFluctuationThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, commonDexInfo.priceFluctuationThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || commonDexInfo.priceFluctuationMonitorTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, commonDexInfo.priceFluctuationMonitorTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || commonDexInfo.rateFluctuationThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, commonDexInfo.rateFluctuationThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || commonDexInfo.rateFluctuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, commonDexInfo.rateFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || commonDexInfo.slippageFluctuationHold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, commonDexInfo.slippageFluctuationHold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || commonDexInfo.nativeTokenUnitPriceUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, commonDexInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) commonDexInfo.teeSignMarketRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, commonDexInfo.teeSignMarketRelTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) commonDexInfo.teeSignTpslRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, commonDexInfo.teeSignTpslRelTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) commonDexInfo.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, commonDexInfo.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || commonDexInfo.tradeTaxes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, commonDexInfo.tradeTaxes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) commonDexInfo.remainingQuota, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, commonDexInfo.remainingQuota);
    }

    public CommonDexInfo(String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, @NotNull String str19) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.code = str;
        this.errorMsg = str2;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.fromTokenValue = str3;
        this.fromTokenAmount = str4;
        this.nativeTokenPrice = str5;
        this.estimateReserveGasTokenFee = str6;
        this.fromPriceFluctuation = str7;
        this.toPriceFluctuation = str8;
        this.priceFluctuationThreshold = str9;
        this.priceFluctuationMonitorTime = str10;
        this.rateFluctuationThreshold = str11;
        this.rateFluctuation = str12;
        this.slippageFluctuationHold = str13;
        this.nativeTokenUnitPriceUsd = str14;
        this.teeSignMarketRelTs = str15;
        this.teeSignTpslRelTs = str16;
        this.nativeTokenSymbol = str17;
        this.tradeTaxes = str18;
        this.remainingQuota = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r45v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r26v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r45v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r27v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r45v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r45v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r45v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r45v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r45v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r45v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r45v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r45v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r45v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r45v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r45v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r45v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0095: ARITH (r45v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r45v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r45v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r44v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.dex.trade.core.domain.model.CommonDexInfo.<init>(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonDexInfo(String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : dexMultiTokenInfoBean, (i & 8) != 0 ? null : dexMultiTokenInfoBean2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) == 0 ? str19 : "");
    }

    public final String isSpecialSafeMoonToken() {
        TokenInfoForApp tokenInfoForApp;
        TokenInfoForApp tokenInfoForApp2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        if (Intrinsics.EZpvd((Object) ((dexMultiTokenInfoBean == null || (tokenInfoForApp2 = dexMultiTokenInfoBean.getTokenInfoForApp()) == null) ? null : tokenInfoForApp2.isSpecialSafeMoonToken()), (Object) "1")) {
            return this.fromToken.getTokenInfoForApp().isSpecialSafeMoonToken();
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 == null || (tokenInfoForApp = dexMultiTokenInfoBean2.getTokenInfoForApp()) == null) {
            return null;
        }
        return tokenInfoForApp.isSpecialSafeMoonToken();
    }

    public final Pair<Boolean, DexMultiTokenInfoBean> isSafeMoonToken() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        if (dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isSafeMoonCoinToken()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, this.fromToken);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isSafeMoonCoinToken()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, this.toToken);
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, this.fromToken);
    }
}

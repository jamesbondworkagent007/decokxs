package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C23311hvo;
import o.C23313hvq;
import o.C31212lpk;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class LimitPairRateResponse implements Parcelable {
    private final String changeRate;
    private final boolean enableJito;
    private final String estimateGasFee;
    private final String expirationTime;
    private final LimitFeeData feeData;
    private String formatOriginValue;
    private final String fromMarketCapacity;
    private final String fromTokenPrice;
    private boolean isHigh;
    private final LimitOrderInfo limitOrderInfo;
    private final String nativeSymbol;
    private final String receiveAmount;
    private final String remainingQuota;
    private final ServiceFeeInfo serviceFeeInfo;
    private final int showRateFluctuation;
    private final DexAutoSlippageInfoParam slippageInfo;
    private final String toMarketCapacity;
    private final String toTokenPrice;
    private final Boolean valDiff;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitPairRateResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitPairRateResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitPairRateResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Boolean boolValueOf = null;
            LimitOrderInfo limitOrderInfoCreateFromParcel = parcel.readInt() == 0 ? null : LimitOrderInfo.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            LimitFeeData limitFeeDataCreateFromParcel = parcel.readInt() == 0 ? null : LimitFeeData.CREATOR.createFromParcel(parcel);
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamCreateFromParcel = parcel.readInt() == 0 ? null : DexAutoSlippageInfoParam.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LimitPairRateResponse(string, z, limitOrderInfoCreateFromParcel, string2, string3, string4, string5, string6, string7, limitFeeDataCreateFromParcel, serviceFeeInfoCreateFromParcel, dexAutoSlippageInfoParamCreateFromParcel, i, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitPairRateResponse[] newArray(int i) {
            return new LimitPairRateResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitPairRateResponse() {
        this((String) null, false, (LimitOrderInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LimitFeeData) null, (ServiceFeeInfo) null, (DexAutoSlippageInfoParam) null, 0, (Boolean) null, (String) null, (String) null, false, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitFeeData component10() {
        return this.feeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component11() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component12() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.showRateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.nativeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.formatOriginValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfo component3() {
        return this.limitOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPairRateResponse copy(String str, boolean z, LimitOrderInfo limitOrderInfo, String str2, String str3, String str4, String str5, String str6, String str7, LimitFeeData limitFeeData, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, int i, Boolean bool, @NotNull String str8, String str9, boolean z2, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new LimitPairRateResponse(str, z, limitOrderInfo, str2, str3, str4, str5, str6, str7, limitFeeData, serviceFeeInfo, dexAutoSlippageInfoParam, i, bool, str8, str9, z2, str10, str11);
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
        if (!(obj instanceof LimitPairRateResponse)) {
            return false;
        }
        LimitPairRateResponse limitPairRateResponse = (LimitPairRateResponse) obj;
        return Intrinsics.EZpvd((Object) this.changeRate, (Object) limitPairRateResponse.changeRate) && this.enableJito == limitPairRateResponse.enableJito && Intrinsics.EZpvd(this.limitOrderInfo, limitPairRateResponse.limitOrderInfo) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) limitPairRateResponse.estimateGasFee) && Intrinsics.EZpvd((Object) this.fromMarketCapacity, (Object) limitPairRateResponse.fromMarketCapacity) && Intrinsics.EZpvd((Object) this.toMarketCapacity, (Object) limitPairRateResponse.toMarketCapacity) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) limitPairRateResponse.fromTokenPrice) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) limitPairRateResponse.toTokenPrice) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) limitPairRateResponse.receiveAmount) && Intrinsics.EZpvd(this.feeData, limitPairRateResponse.feeData) && Intrinsics.EZpvd(this.serviceFeeInfo, limitPairRateResponse.serviceFeeInfo) && Intrinsics.EZpvd(this.slippageInfo, limitPairRateResponse.slippageInfo) && this.showRateFluctuation == limitPairRateResponse.showRateFluctuation && Intrinsics.EZpvd(this.valDiff, limitPairRateResponse.valDiff) && Intrinsics.EZpvd((Object) this.expirationTime, (Object) limitPairRateResponse.expirationTime) && Intrinsics.EZpvd((Object) this.nativeSymbol, (Object) limitPairRateResponse.nativeSymbol) && this.isHigh == limitPairRateResponse.isHigh && Intrinsics.EZpvd((Object) this.formatOriginValue, (Object) limitPairRateResponse.formatOriginValue) && Intrinsics.EZpvd((Object) this.remainingQuota, (Object) limitPairRateResponse.remainingQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeRate() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitFeeData getFeeData() {
        return this.feeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatOriginValue() {
        return this.formatOriginValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromMarketCapacity() {
        return this.fromMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfo getLimitOrderInfo() {
        return this.limitOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeSymbol() {
        return this.nativeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainingQuota() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowRateFluctuation() {
        return this.showRateFluctuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getSlippageInfo() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToMarketCapacity() {
        return this.toMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getValDiff() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.changeRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.enableJito);
        LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
        int iHashCode3 = limitOrderInfo == null ? 0 : limitOrderInfo.hashCode();
        String str2 = this.estimateGasFee;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fromMarketCapacity;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toMarketCapacity;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fromTokenPrice;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.toTokenPrice;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.receiveAmount;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        LimitFeeData limitFeeData = this.feeData;
        int iHashCode10 = limitFeeData == null ? 0 : limitFeeData.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode11 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.slippageInfo;
        int iHashCode12 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        int iHashCode13 = Integer.hashCode(this.showRateFluctuation);
        Boolean bool = this.valDiff;
        int iHashCode14 = bool == null ? 0 : bool.hashCode();
        int iHashCode15 = this.expirationTime.hashCode();
        String str8 = this.nativeSymbol;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        int iHashCode17 = Boolean.hashCode(this.isHigh);
        int iHashCode18 = this.formatOriginValue.hashCode();
        String str9 = this.remainingQuota;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHigh() {
        return this.isHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatOriginValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatOriginValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHigh(boolean z) {
        this.isHigh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitPairRateResponse(changeRate=" + this.changeRate + ", enableJito=" + this.enableJito + ", limitOrderInfo=" + this.limitOrderInfo + ", estimateGasFee=" + this.estimateGasFee + ", fromMarketCapacity=" + this.fromMarketCapacity + ", toMarketCapacity=" + this.toMarketCapacity + ", fromTokenPrice=" + this.fromTokenPrice + ", toTokenPrice=" + this.toTokenPrice + ", receiveAmount=" + this.receiveAmount + ", feeData=" + this.feeData + ", serviceFeeInfo=" + this.serviceFeeInfo + ", slippageInfo=" + this.slippageInfo + ", showRateFluctuation=" + this.showRateFluctuation + ", valDiff=" + this.valDiff + ", expirationTime=" + this.expirationTime + ", nativeSymbol=" + this.nativeSymbol + ", isHigh=" + this.isHigh + ", formatOriginValue=" + this.formatOriginValue + ", remainingQuota=" + this.remainingQuota + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.changeRate);
        parcel.writeInt(this.enableJito ? 1 : 0);
        LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
        if (limitOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitOrderInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.estimateGasFee);
        parcel.writeString(this.fromMarketCapacity);
        parcel.writeString(this.toMarketCapacity);
        parcel.writeString(this.fromTokenPrice);
        parcel.writeString(this.toTokenPrice);
        parcel.writeString(this.receiveAmount);
        LimitFeeData limitFeeData = this.feeData;
        if (limitFeeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitFeeData.writeToParcel(parcel, i);
        }
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.slippageInfo;
        if (dexAutoSlippageInfoParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexAutoSlippageInfoParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showRateFluctuation);
        Boolean bool = this.valDiff;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.expirationTime);
        parcel.writeString(this.nativeSymbol);
        parcel.writeInt(this.isHigh ? 1 : 0);
        parcel.writeString(this.formatOriginValue);
        parcel.writeString(this.remainingQuota);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitPairRateResponse> serializer() {
            return LimitPairRateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitPairRateResponse(int i, String str, boolean z, LimitOrderInfo limitOrderInfo, String str2, String str3, String str4, String str5, String str6, String str7, LimitFeeData limitFeeData, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, int i2, Boolean bool, String str8, String str9, boolean z2, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.changeRate = "";
        } else {
            this.changeRate = str;
        }
        this.enableJito = (i & 2) == 0 ? true : z;
        if ((i & 4) == 0) {
            this.limitOrderInfo = null;
        } else {
            this.limitOrderInfo = limitOrderInfo;
        }
        if ((i & 8) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str2;
        }
        if ((i & 16) == 0) {
            this.fromMarketCapacity = "";
        } else {
            this.fromMarketCapacity = str3;
        }
        if ((i & 32) == 0) {
            this.toMarketCapacity = "";
        } else {
            this.toMarketCapacity = str4;
        }
        if ((i & 64) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str5;
        }
        if ((i & 128) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str6;
        }
        if ((i & 256) == 0) {
            this.receiveAmount = "";
        } else {
            this.receiveAmount = str7;
        }
        if ((i & 512) == 0) {
            this.feeData = null;
        } else {
            this.feeData = limitFeeData;
        }
        if ((i & 1024) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((i & 2048) == 0) {
            this.slippageInfo = null;
        } else {
            this.slippageInfo = dexAutoSlippageInfoParam;
        }
        this.showRateFluctuation = (i & 4096) == 0 ? ShowRateFluctuation.DoNotShowTips.getType() : i2;
        this.valDiff = (i & 8192) == 0 ? Boolean.FALSE : bool;
        if ((i & 16384) == 0) {
            this.expirationTime = "";
        } else {
            this.expirationTime = str8;
        }
        if ((32768 & i) == 0) {
            this.nativeSymbol = "";
        } else {
            this.nativeSymbol = str9;
        }
        this.isHigh = (65536 & i) == 0 ? false : z2;
        if ((131072 & i) == 0) {
            this.formatOriginValue = "";
        } else {
            this.formatOriginValue = str10;
        }
        if ((i & 262144) == 0) {
            this.remainingQuota = "";
        } else {
            this.remainingQuota = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitPairRateResponse limitPairRateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitPairRateResponse.changeRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, limitPairRateResponse.changeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !limitPairRateResponse.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, limitPairRateResponse.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || limitPairRateResponse.limitOrderInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LimitOrderInfo$$serializer.INSTANCE, limitPairRateResponse.limitOrderInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitPairRateResponse.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, limitPairRateResponse.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitPairRateResponse.fromMarketCapacity, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, limitPairRateResponse.fromMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitPairRateResponse.toMarketCapacity, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, limitPairRateResponse.toMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitPairRateResponse.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, limitPairRateResponse.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitPairRateResponse.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, limitPairRateResponse.toTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitPairRateResponse.receiveAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, limitPairRateResponse.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || limitPairRateResponse.feeData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LimitFeeData$$serializer.INSTANCE, limitPairRateResponse.feeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || limitPairRateResponse.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, ServiceFeeInfo$$serializer.INSTANCE, limitPairRateResponse.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || limitPairRateResponse.slippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DexAutoSlippageInfoParam$$serializer.INSTANCE, limitPairRateResponse.slippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || limitPairRateResponse.showRateFluctuation != ShowRateFluctuation.DoNotShowTips.getType()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, limitPairRateResponse.showRateFluctuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(limitPairRateResponse.valDiff, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, limitPairRateResponse.valDiff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) limitPairRateResponse.expirationTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, limitPairRateResponse.expirationTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) limitPairRateResponse.nativeSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, limitPairRateResponse.nativeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || limitPairRateResponse.isHigh) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, limitPairRateResponse.isHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) limitPairRateResponse.formatOriginValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, limitPairRateResponse.formatOriginValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd((Object) limitPairRateResponse.remainingQuota, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, limitPairRateResponse.remainingQuota);
    }

    public LimitPairRateResponse(String str, boolean z, LimitOrderInfo limitOrderInfo, String str2, String str3, String str4, String str5, String str6, String str7, LimitFeeData limitFeeData, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, int i, Boolean bool, @NotNull String str8, String str9, boolean z2, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.changeRate = str;
        this.enableJito = z;
        this.limitOrderInfo = limitOrderInfo;
        this.estimateGasFee = str2;
        this.fromMarketCapacity = str3;
        this.toMarketCapacity = str4;
        this.fromTokenPrice = str5;
        this.toTokenPrice = str6;
        this.receiveAmount = str7;
        this.feeData = limitFeeData;
        this.serviceFeeInfo = serviceFeeInfo;
        this.slippageInfo = dexAutoSlippageInfoParam;
        this.showRateFluctuation = i;
        this.valDiff = bool;
        this.expirationTime = str8;
        this.nativeSymbol = str9;
        this.isHigh = z2;
        this.formatOriginValue = str10;
        this.remainingQuota = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00da: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo) : (r23v0 com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData) : (r30v0 com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r31v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x005d: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r32v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation:0x0068: SGET  A[WRAPPED] (LINE:265) com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation.DoNotShowTips com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.ShowRateFluctuation.getType():int A[MD:():int (m), WRAPPED] (LINE:265)) : (r33v0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0071: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0075: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(java.lang.String, boolean, com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, int, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:252) call: com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse.<init>(java.lang.String, boolean, com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, int, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitPairRateResponse(String str, boolean z, LimitOrderInfo limitOrderInfo, String str2, String str3, String str4, String str5, String str6, String str7, LimitFeeData limitFeeData, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, int i, Boolean bool, String str8, String str9, boolean z2, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? null : limitOrderInfo, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? null : limitFeeData, (i2 & 1024) != 0 ? null : serviceFeeInfo, (i2 & 2048) == 0 ? dexAutoSlippageInfoParam : null, (i2 & 4096) != 0 ? ShowRateFluctuation.DoNotShowTips.getType() : i, (i2 & 8192) != 0 ? Boolean.FALSE : bool, (i2 & 16384) != 0 ? "" : str8, (i2 & 32768) != 0 ? "" : str9, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? "" : str10, (i2 & 262144) != 0 ? "" : str11);
    }

    public final boolean isAutoConfirmQuotaRemaining() {
        String fromTokenPrice;
        String str = this.remainingQuota;
        if (str != null && str.length() != 0) {
            String str2 = this.remainingQuota;
            LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
            if (!C33129mqd.copydefault(str2, (limitOrderInfo == null || (fromTokenPrice = limitOrderInfo.getFromTokenPrice()) == null) ? null : C23313hvq.mulCheckS$default(fromTokenPrice, this.limitOrderInfo.getFromTokenAmount(), null, null, null, 14, null))) {
                return false;
            }
        }
        return true;
    }

    public final LimitMarketPrice.QuoteState getQuoteState(@NotNull DexSwapLiquiditySource dexSwapLiquiditySource) {
        Intrinsics.checkNotNullParameter(dexSwapLiquiditySource, "");
        String str = this.receiveAmount;
        if ((str == null || str.length() == 0) && dexSwapLiquiditySource != DexSwapLiquiditySource.All) {
            return LimitMarketPrice.QuoteState.NoLiquidityAtTheMoment;
        }
        String str2 = this.changeRate;
        if ((str2 == null || str2.length() == 0) && dexSwapLiquiditySource == DexSwapLiquiditySource.All) {
            return LimitMarketPrice.QuoteState.NoLiquidity;
        }
        return LimitMarketPrice.QuoteState.QuoteSuccess;
    }

    public final boolean getSafeMoonToken() {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
        if (limitOrderInfo != null && (fromToken = limitOrderInfo.getFromToken()) != null && fromToken.isSafeMoonToken() == 1) {
            return true;
        }
        LimitOrderInfo limitOrderInfo2 = this.limitOrderInfo;
        return (limitOrderInfo2 == null || (toToken = limitOrderInfo2.getToToken()) == null || toToken.isSafeMoonToken() != 1) ? false : true;
    }

    public final boolean isHoneypotToken() {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
        if (limitOrderInfo != null && (fromToken = limitOrderInfo.getFromToken()) != null && fromToken.isHoneypot() == 1) {
            return true;
        }
        LimitOrderInfo limitOrderInfo2 = this.limitOrderInfo;
        return (limitOrderInfo2 == null || (toToken = limitOrderInfo2.getToToken()) == null || toToken.isHoneypot() != 1) ? false : true;
    }

    public final String getTokenType() {
        return (!getSafeMoonToken() || isHoneypotToken()) ? "1" : "2";
    }

    public final boolean isShowRateFluctuation() {
        return this.showRateFluctuation == ShowRateFluctuation.ShowTips.getType();
    }

    public final boolean isHoneypotErrorCode() {
        C31212lpk c31212lpk = C31212lpk.copydefault;
        LimitOrderInfo limitOrderInfo = this.limitOrderInfo;
        return c31212lpk.OLrzqt(C33129mqd.AhwBna(limitOrderInfo != null ? limitOrderInfo.getCode() : null));
    }

    public static /* synthetic */ String getRateDiffAmount$default(LimitPairRateResponse limitPairRateResponse, String str, LimitOrderRateView.ShowType showType, int i, Object obj) {
        if ((i & 2) != 0) {
            showType = LimitOrderRateView.ShowType.SELL;
        }
        return limitPairRateResponse.getRateDiffAmount(str, showType);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getRateDiffAmount(@NotNull String str, @NotNull LimitOrderRateView.ShowType showType) {
        String str2;
        String strDivCheckS$default;
        boolean z;
        String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(showType, "");
        if (showType == LimitOrderRateView.ShowType.SELL) {
            strDivCheckS$default = C23313hvq.divCheckS$default(str, this.changeRate, Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        } else {
            String str4 = this.changeRate;
            if (str4 != null) {
                strDivCheckS$default = C23313hvq.divCheckS$default(str4, str, Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            } else {
                str2 = null;
                z = str.length() != 0;
                str3 = this.changeRate;
                if (str3 == null) {
                    str3 = "";
                }
                if (!z && !(C23313hvq.copydefault(str2, 0) | (str3.length() != 0))) {
                    return "";
                }
                String strSubCheckS$default = str2 != null ? C23313hvq.subCheckS$default(str2, 1, Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null) : null;
                return strSubCheckS$default == null ? "" : strSubCheckS$default;
            }
        }
        str2 = strDivCheckS$default;
        if (str.length() != 0) {
        }
        str3 = this.changeRate;
        if (str3 == null) {
        }
        if (!(z | C23313hvq.copydefault(str2, 0) | (str3.length() != 0))) {
        }
    }

    public final boolean isDiffMoreThanNormal(@NotNull String str, @NotNull LimitOrderRateView.ShowType showType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(showType, "");
        String rateDiffAmount = getRateDiffAmount(str, showType);
        if (showType == LimitOrderRateView.ShowType.SELL) {
            return C23313hvq.valueOf(rateDiffAmount, Double.valueOf(-0.1d));
        }
        return C23313hvq.OLrzqt(rateDiffAmount, Double.valueOf(0.1d));
    }

    public final String getRateDiffAmountShow(@NotNull String str, @NotNull LimitOrderRateView.ShowType showType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(showType, "");
        String rateDiffAmount = getRateDiffAmount(str, showType);
        if (rateDiffAmount.length() == 0 || (C23313hvq.OLrzqt(rateDiffAmount, Double.valueOf(-1.0E-4d)) && C23313hvq.KWHzl(rateDiffAmount, Double.valueOf(1.0E-4d)))) {
            return "";
        }
        if (C23313hvq.OLrzqt(rateDiffAmount, Double.valueOf(9.99d))) {
            this.isHigh = true;
            String percentWithSymbol$default = C23311hvo.formatPercentWithSymbol$default("9.99", false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default;
            return "(>" + percentWithSymbol$default + ")";
        }
        if (C23313hvq.KWHzl(rateDiffAmount, Double.valueOf(-9.99d))) {
            this.isHigh = false;
            String percentWithSymbol$default2 = C23311hvo.formatPercentWithSymbol$default("-9.99", false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default2;
            return "(<" + percentWithSymbol$default2 + ")";
        }
        if (C23313hvq.OLrzqt(rateDiffAmount, 0) & C23313hvq.KWHzl(rateDiffAmount, Double.valueOf(0.1d))) {
            this.isHigh = true;
            String percentWithSymbol$default3 = C23311hvo.formatPercentWithSymbol$default(rateDiffAmount, false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default3;
            return "(" + percentWithSymbol$default3 + ")";
        }
        if (C23313hvq.OLrzqt(rateDiffAmount, 0) & C23313hvq.EZpvd(rateDiffAmount, Double.valueOf(0.1d))) {
            this.isHigh = true;
            String percentWithSymbol$default4 = C23311hvo.formatPercentWithSymbol$default(rateDiffAmount, false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default4;
            return "(" + percentWithSymbol$default4 + ")";
        }
        if (C23313hvq.KWHzl(rateDiffAmount, 0) & C23313hvq.OLrzqt(rateDiffAmount, Double.valueOf(-0.1d))) {
            this.isHigh = false;
            String percentWithSymbol$default5 = C23311hvo.formatPercentWithSymbol$default(rateDiffAmount, false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default5;
            return "(" + percentWithSymbol$default5 + ")";
        }
        if (C23313hvq.KWHzl(rateDiffAmount, 0) & C23313hvq.valueOf(rateDiffAmount, Double.valueOf(-0.1d))) {
            this.isHigh = false;
            String percentWithSymbol$default6 = C23311hvo.formatPercentWithSymbol$default(rateDiffAmount, false, 0, 0, RoundingMode.UP, null, 23, null);
            this.formatOriginValue = percentWithSymbol$default6;
            return "(" + percentWithSymbol$default6 + ")";
        }
        String percentWithSymbol$default7 = C23311hvo.formatPercentWithSymbol$default(rateDiffAmount, false, 0, 0, RoundingMode.UP, null, 23, null);
        this.formatOriginValue = percentWithSymbol$default7;
        return "(" + percentWithSymbol$default7 + ")";
    }
}

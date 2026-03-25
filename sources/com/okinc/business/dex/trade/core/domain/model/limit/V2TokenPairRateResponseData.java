package com.okinc.business.dex.trade.core.domain.model.limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V2TokenPairRateResponseData implements Parcelable {
    private final String changeRate;
    private final String estimateGasFee;
    private final String expirationTime;
    private final LimitFeeData feeData;
    private final String fromTokenPrice;
    private final LimitOrderInfoV2 limitOrderInfoV2;
    private final String nativeSymbol;
    private final String receiveAmount;
    private final String remainingQuota;
    private final ServiceFeeInfo serviceFeeInfo;
    private final DexAutoSlippageInfoParam slippageInfo;
    private final String toTokenPrice;
    private final Boolean valDiff;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<V2TokenPairRateResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<V2TokenPairRateResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V2TokenPairRateResponseData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LimitFeeData limitFeeDataCreateFromParcel = parcel.readInt() == 0 ? null : LimitFeeData.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            LimitOrderInfoV2 limitOrderInfoV2CreateFromParcel = parcel.readInt() == 0 ? null : LimitOrderInfoV2.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamCreateFromParcel = parcel.readInt() == 0 ? null : DexAutoSlippageInfoParam.CREATOR.createFromParcel(parcel);
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new V2TokenPairRateResponseData(string, string2, string3, limitFeeDataCreateFromParcel, string4, limitOrderInfoV2CreateFromParcel, string5, string6, string7, serviceFeeInfoCreateFromParcel, dexAutoSlippageInfoParamCreateFromParcel, string8, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V2TokenPairRateResponseData[] newArray(int i) {
            return new V2TokenPairRateResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V2TokenPairRateResponseData() {
        this((String) null, (String) null, (String) null, (LimitFeeData) null, (String) null, (LimitOrderInfoV2) null, (String) null, (String) null, (String) null, (ServiceFeeInfo) null, (DexAutoSlippageInfoParam) null, (String) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component10() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component11() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitFeeData component4() {
        return this.feeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfoV2 component6() {
        return this.limitOrderInfoV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nativeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V2TokenPairRateResponseData copy(String str, String str2, @NotNull String str3, LimitFeeData limitFeeData, String str4, LimitOrderInfoV2 limitOrderInfoV2, String str5, String str6, String str7, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str8, Boolean bool) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new V2TokenPairRateResponseData(str, str2, str3, limitFeeData, str4, limitOrderInfoV2, str5, str6, str7, serviceFeeInfo, dexAutoSlippageInfoParam, str8, bool);
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
        if (!(obj instanceof V2TokenPairRateResponseData)) {
            return false;
        }
        V2TokenPairRateResponseData v2TokenPairRateResponseData = (V2TokenPairRateResponseData) obj;
        return Intrinsics.EZpvd((Object) this.changeRate, (Object) v2TokenPairRateResponseData.changeRate) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) v2TokenPairRateResponseData.estimateGasFee) && Intrinsics.EZpvd((Object) this.expirationTime, (Object) v2TokenPairRateResponseData.expirationTime) && Intrinsics.EZpvd(this.feeData, v2TokenPairRateResponseData.feeData) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) v2TokenPairRateResponseData.fromTokenPrice) && Intrinsics.EZpvd(this.limitOrderInfoV2, v2TokenPairRateResponseData.limitOrderInfoV2) && Intrinsics.EZpvd((Object) this.nativeSymbol, (Object) v2TokenPairRateResponseData.nativeSymbol) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) v2TokenPairRateResponseData.receiveAmount) && Intrinsics.EZpvd((Object) this.remainingQuota, (Object) v2TokenPairRateResponseData.remainingQuota) && Intrinsics.EZpvd(this.serviceFeeInfo, v2TokenPairRateResponseData.serviceFeeInfo) && Intrinsics.EZpvd(this.slippageInfo, v2TokenPairRateResponseData.slippageInfo) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) v2TokenPairRateResponseData.toTokenPrice) && Intrinsics.EZpvd(this.valDiff, v2TokenPairRateResponseData.valDiff);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeRate() {
        return this.changeRate;
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
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfoV2 getLimitOrderInfoV2() {
        return this.limitOrderInfoV2;
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
    public final DexAutoSlippageInfoParam getSlippageInfo() {
        return this.slippageInfo;
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
        String str2 = this.estimateGasFee;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.expirationTime.hashCode();
        LimitFeeData limitFeeData = this.feeData;
        int iHashCode4 = limitFeeData == null ? 0 : limitFeeData.hashCode();
        String str3 = this.fromTokenPrice;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        LimitOrderInfoV2 limitOrderInfoV2 = this.limitOrderInfoV2;
        int iHashCode6 = limitOrderInfoV2 == null ? 0 : limitOrderInfoV2.hashCode();
        String str4 = this.nativeSymbol;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.receiveAmount;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.remainingQuota;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode10 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.slippageInfo;
        int iHashCode11 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        String str7 = this.toTokenPrice;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.valDiff;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V2TokenPairRateResponseData(changeRate=" + this.changeRate + ", estimateGasFee=" + this.estimateGasFee + ", expirationTime=" + this.expirationTime + ", feeData=" + this.feeData + ", fromTokenPrice=" + this.fromTokenPrice + ", limitOrderInfoV2=" + this.limitOrderInfoV2 + ", nativeSymbol=" + this.nativeSymbol + ", receiveAmount=" + this.receiveAmount + ", remainingQuota=" + this.remainingQuota + ", serviceFeeInfo=" + this.serviceFeeInfo + ", slippageInfo=" + this.slippageInfo + ", toTokenPrice=" + this.toTokenPrice + ", valDiff=" + this.valDiff + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.changeRate);
        parcel.writeString(this.estimateGasFee);
        parcel.writeString(this.expirationTime);
        LimitFeeData limitFeeData = this.feeData;
        if (limitFeeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitFeeData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromTokenPrice);
        LimitOrderInfoV2 limitOrderInfoV2 = this.limitOrderInfoV2;
        if (limitOrderInfoV2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitOrderInfoV2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.nativeSymbol);
        parcel.writeString(this.receiveAmount);
        parcel.writeString(this.remainingQuota);
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
        parcel.writeString(this.toTokenPrice);
        Boolean bool = this.valDiff;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.limit.V2TokenPairRateResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V2TokenPairRateResponseData> serializer() {
            return V2TokenPairRateResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V2TokenPairRateResponseData(int i, String str, String str2, String str3, LimitFeeData limitFeeData, String str4, LimitOrderInfoV2 limitOrderInfoV2, String str5, String str6, String str7, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str8, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.changeRate = "";
        } else {
            this.changeRate = str;
        }
        if ((i & 2) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str2;
        }
        if ((i & 4) == 0) {
            this.expirationTime = "";
        } else {
            this.expirationTime = str3;
        }
        if ((i & 8) == 0) {
            this.feeData = null;
        } else {
            this.feeData = limitFeeData;
        }
        if ((i & 16) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str4;
        }
        if ((i & 32) == 0) {
            this.limitOrderInfoV2 = null;
        } else {
            this.limitOrderInfoV2 = limitOrderInfoV2;
        }
        if ((i & 64) == 0) {
            this.nativeSymbol = "";
        } else {
            this.nativeSymbol = str5;
        }
        if ((i & 128) == 0) {
            this.receiveAmount = "";
        } else {
            this.receiveAmount = str6;
        }
        if ((i & 256) == 0) {
            this.remainingQuota = null;
        } else {
            this.remainingQuota = str7;
        }
        if ((i & 512) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((i & 1024) == 0) {
            this.slippageInfo = null;
        } else {
            this.slippageInfo = dexAutoSlippageInfoParam;
        }
        if ((i & 2048) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str8;
        }
        this.valDiff = (i & 4096) == 0 ? Boolean.FALSE : bool;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V2TokenPairRateResponseData v2TokenPairRateResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.changeRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v2TokenPairRateResponseData.changeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, v2TokenPairRateResponseData.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.expirationTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, v2TokenPairRateResponseData.expirationTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || v2TokenPairRateResponseData.feeData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LimitFeeData$$serializer.INSTANCE, v2TokenPairRateResponseData.feeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, v2TokenPairRateResponseData.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || v2TokenPairRateResponseData.limitOrderInfoV2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LimitOrderInfoV2$$serializer.INSTANCE, v2TokenPairRateResponseData.limitOrderInfoV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.nativeSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, v2TokenPairRateResponseData.nativeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.receiveAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, v2TokenPairRateResponseData.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || v2TokenPairRateResponseData.remainingQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, v2TokenPairRateResponseData.remainingQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || v2TokenPairRateResponseData.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, ServiceFeeInfo$$serializer.INSTANCE, v2TokenPairRateResponseData.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || v2TokenPairRateResponseData.slippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DexAutoSlippageInfoParam$$serializer.INSTANCE, v2TokenPairRateResponseData.slippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) v2TokenPairRateResponseData.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, v2TokenPairRateResponseData.toTokenPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(v2TokenPairRateResponseData.valDiff, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, v2TokenPairRateResponseData.valDiff);
    }

    public V2TokenPairRateResponseData(String str, String str2, @NotNull String str3, LimitFeeData limitFeeData, String str4, LimitOrderInfoV2 limitOrderInfoV2, String str5, String str6, String str7, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str8, Boolean bool) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.changeRate = str;
        this.estimateGasFee = str2;
        this.expirationTime = str3;
        this.feeData = limitFeeData;
        this.fromTokenPrice = str4;
        this.limitOrderInfoV2 = limitOrderInfoV2;
        this.nativeSymbol = str5;
        this.receiveAmount = str6;
        this.remainingQuota = str7;
        this.serviceFeeInfo = serviceFeeInfo;
        this.slippageInfo = dexAutoSlippageInfoParam;
        this.toTokenPrice = str8;
        this.valDiff = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0086: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData) : (r18v0 com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2) : (r20v0 com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r24v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, java.lang.String, com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.Boolean):void (m)] (LINE:24) call: com.okinc.business.dex.trade.core.domain.model.limit.V2TokenPairRateResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, java.lang.String, com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ V2TokenPairRateResponseData(String str, String str2, String str3, LimitFeeData limitFeeData, String str4, LimitOrderInfoV2 limitOrderInfoV2, String str5, String str6, String str7, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str8, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : limitFeeData, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : limitOrderInfoV2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : serviceFeeInfo, (i & 1024) == 0 ? dexAutoSlippageInfoParam : null, (i & 2048) == 0 ? str8 : "", (i & 4096) != 0 ? Boolean.FALSE : bool);
    }
}

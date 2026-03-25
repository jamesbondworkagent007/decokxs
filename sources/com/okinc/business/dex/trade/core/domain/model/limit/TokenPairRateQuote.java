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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C23313hvq;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenPairRateQuote implements Parcelable {
    private final String changeRate;
    private final boolean enableJito;
    private final String estimateGasFee;
    private final String expirationTime;
    private final LimitFeeData feeData;
    private final String fromTokenPrice;
    private final String nativeSymbol;
    private final TokenPairRateOrderInfo orderInfo;
    private final String receiveAmount;
    private final String remainingQuota;
    private final ServiceFeeInfo serviceFeeInfo;
    private final DexAutoSlippageInfoParam slippageInfo;
    private final TokenPairRateSource source;
    private final String toTokenPrice;
    private final String tradeTaxes;
    private final Boolean valDiff;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenPairRateQuote> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource", TokenPairRateSource.values()), null};

    public static final class Creator implements Parcelable.Creator<TokenPairRateQuote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenPairRateQuote createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LimitFeeData limitFeeDataCreateFromParcel = parcel.readInt() == 0 ? null : LimitFeeData.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamCreateFromParcel = parcel.readInt() == 0 ? null : DexAutoSlippageInfoParam.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TokenPairRateQuote(string, z, string2, string3, limitFeeDataCreateFromParcel, string4, string5, string6, serviceFeeInfoCreateFromParcel, dexAutoSlippageInfoParamCreateFromParcel, string7, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? TokenPairRateOrderInfo.CREATOR.createFromParcel(parcel) : null, TokenPairRateSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenPairRateQuote[] newArray(int i) {
            return new TokenPairRateQuote[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenPairRateQuote() {
        this((String) null, false, (String) null, (String) null, (LimitFeeData) null, (String) null, (String) null, (String) null, (ServiceFeeInfo) null, (DexAutoSlippageInfoParam) null, (String) null, (Boolean) null, (String) null, (TokenPairRateOrderInfo) null, (TokenPairRateSource) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component10() {
        return this.slippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.nativeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.valDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.remainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateOrderInfo component14() {
        return this.orderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateSource component15() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitFeeData component5() {
        return this.feeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component9() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateQuote copy(String str, boolean z, String str2, @NotNull String str3, LimitFeeData limitFeeData, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str7, Boolean bool, String str8, TokenPairRateOrderInfo tokenPairRateOrderInfo, @NotNull TokenPairRateSource tokenPairRateSource, String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenPairRateSource, "");
        return new TokenPairRateQuote(str, z, str2, str3, limitFeeData, str4, str5, str6, serviceFeeInfo, dexAutoSlippageInfoParam, str7, bool, str8, tokenPairRateOrderInfo, tokenPairRateSource, str9);
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
        if (!(obj instanceof TokenPairRateQuote)) {
            return false;
        }
        TokenPairRateQuote tokenPairRateQuote = (TokenPairRateQuote) obj;
        return Intrinsics.EZpvd((Object) this.changeRate, (Object) tokenPairRateQuote.changeRate) && this.enableJito == tokenPairRateQuote.enableJito && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) tokenPairRateQuote.estimateGasFee) && Intrinsics.EZpvd((Object) this.expirationTime, (Object) tokenPairRateQuote.expirationTime) && Intrinsics.EZpvd(this.feeData, tokenPairRateQuote.feeData) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) tokenPairRateQuote.fromTokenPrice) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) tokenPairRateQuote.toTokenPrice) && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) tokenPairRateQuote.receiveAmount) && Intrinsics.EZpvd(this.serviceFeeInfo, tokenPairRateQuote.serviceFeeInfo) && Intrinsics.EZpvd(this.slippageInfo, tokenPairRateQuote.slippageInfo) && Intrinsics.EZpvd((Object) this.nativeSymbol, (Object) tokenPairRateQuote.nativeSymbol) && Intrinsics.EZpvd(this.valDiff, tokenPairRateQuote.valDiff) && Intrinsics.EZpvd((Object) this.remainingQuota, (Object) tokenPairRateQuote.remainingQuota) && Intrinsics.EZpvd(this.orderInfo, tokenPairRateQuote.orderInfo) && this.source == tokenPairRateQuote.source && Intrinsics.EZpvd((Object) this.tradeTaxes, (Object) tokenPairRateQuote.tradeTaxes);
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
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeSymbol() {
        return this.nativeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateOrderInfo getOrderInfo() {
        return this.orderInfo;
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
    public final TokenPairRateSource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTaxes() {
        return this.tradeTaxes;
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
        String str2 = this.estimateGasFee;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.expirationTime.hashCode();
        LimitFeeData limitFeeData = this.feeData;
        int iHashCode5 = limitFeeData == null ? 0 : limitFeeData.hashCode();
        String str3 = this.fromTokenPrice;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toTokenPrice;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.receiveAmount;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode9 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.slippageInfo;
        int iHashCode10 = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        String str6 = this.nativeSymbol;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.valDiff;
        int iHashCode12 = bool == null ? 0 : bool.hashCode();
        String str7 = this.remainingQuota;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        TokenPairRateOrderInfo tokenPairRateOrderInfo = this.orderInfo;
        int iHashCode14 = tokenPairRateOrderInfo == null ? 0 : tokenPairRateOrderInfo.hashCode();
        int iHashCode15 = this.source.hashCode();
        String str8 = this.tradeTaxes;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenPairRateQuote(changeRate=" + this.changeRate + ", enableJito=" + this.enableJito + ", estimateGasFee=" + this.estimateGasFee + ", expirationTime=" + this.expirationTime + ", feeData=" + this.feeData + ", fromTokenPrice=" + this.fromTokenPrice + ", toTokenPrice=" + this.toTokenPrice + ", receiveAmount=" + this.receiveAmount + ", serviceFeeInfo=" + this.serviceFeeInfo + ", slippageInfo=" + this.slippageInfo + ", nativeSymbol=" + this.nativeSymbol + ", valDiff=" + this.valDiff + ", remainingQuota=" + this.remainingQuota + ", orderInfo=" + this.orderInfo + ", source=" + this.source + ", tradeTaxes=" + this.tradeTaxes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.changeRate);
        parcel.writeInt(this.enableJito ? 1 : 0);
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
        parcel.writeString(this.toTokenPrice);
        parcel.writeString(this.receiveAmount);
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
        parcel.writeString(this.nativeSymbol);
        Boolean bool = this.valDiff;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.remainingQuota);
        TokenPairRateOrderInfo tokenPairRateOrderInfo = this.orderInfo;
        if (tokenPairRateOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenPairRateOrderInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.source.name());
        parcel.writeString(this.tradeTaxes);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenPairRateQuote> serializer() {
            return TokenPairRateQuote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenPairRateQuote(int i, String str, boolean z, String str2, String str3, LimitFeeData limitFeeData, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str7, Boolean bool, String str8, TokenPairRateOrderInfo tokenPairRateOrderInfo, TokenPairRateSource tokenPairRateSource, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.changeRate = "";
        } else {
            this.changeRate = str;
        }
        this.enableJito = (i & 2) == 0 ? true : z;
        if ((i & 4) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str2;
        }
        if ((i & 8) == 0) {
            this.expirationTime = "";
        } else {
            this.expirationTime = str3;
        }
        if ((i & 16) == 0) {
            this.feeData = null;
        } else {
            this.feeData = limitFeeData;
        }
        if ((i & 32) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str4;
        }
        if ((i & 64) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str5;
        }
        if ((i & 128) == 0) {
            this.receiveAmount = "";
        } else {
            this.receiveAmount = str6;
        }
        if ((i & 256) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((i & 512) == 0) {
            this.slippageInfo = null;
        } else {
            this.slippageInfo = dexAutoSlippageInfoParam;
        }
        if ((i & 1024) == 0) {
            this.nativeSymbol = "";
        } else {
            this.nativeSymbol = str7;
        }
        this.valDiff = (i & 2048) == 0 ? Boolean.FALSE : bool;
        if ((i & 4096) == 0) {
            this.remainingQuota = null;
        } else {
            this.remainingQuota = str8;
        }
        if ((i & 8192) == 0) {
            this.orderInfo = null;
        } else {
            this.orderInfo = tokenPairRateOrderInfo;
        }
        this.source = (i & 16384) == 0 ? TokenPairRateSource.UNKNOWN : tokenPairRateSource;
        if ((i & 32768) == 0) {
            this.tradeTaxes = null;
        } else {
            this.tradeTaxes = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenPairRateQuote tokenPairRateQuote, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.changeRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tokenPairRateQuote.changeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !tokenPairRateQuote.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tokenPairRateQuote.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tokenPairRateQuote.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.expirationTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenPairRateQuote.expirationTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenPairRateQuote.feeData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LimitFeeData$$serializer.INSTANCE, tokenPairRateQuote.feeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tokenPairRateQuote.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenPairRateQuote.toTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.receiveAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tokenPairRateQuote.receiveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenPairRateQuote.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, ServiceFeeInfo$$serializer.INSTANCE, tokenPairRateQuote.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenPairRateQuote.slippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, DexAutoSlippageInfoParam$$serializer.INSTANCE, tokenPairRateQuote.slippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenPairRateQuote.nativeSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tokenPairRateQuote.nativeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(tokenPairRateQuote.valDiff, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, tokenPairRateQuote.valDiff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tokenPairRateQuote.remainingQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tokenPairRateQuote.remainingQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tokenPairRateQuote.orderInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, TokenPairRateOrderInfo$$serializer.INSTANCE, tokenPairRateQuote.orderInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || tokenPairRateQuote.source != TokenPairRateSource.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], tokenPairRateQuote.source);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && tokenPairRateQuote.tradeTaxes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tokenPairRateQuote.tradeTaxes);
    }

    public TokenPairRateQuote(String str, boolean z, String str2, @NotNull String str3, LimitFeeData limitFeeData, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str7, Boolean bool, String str8, TokenPairRateOrderInfo tokenPairRateOrderInfo, @NotNull TokenPairRateSource tokenPairRateSource, String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenPairRateSource, "");
        this.changeRate = str;
        this.enableJito = z;
        this.estimateGasFee = str2;
        this.expirationTime = str3;
        this.feeData = limitFeeData;
        this.fromTokenPrice = str4;
        this.toTokenPrice = str5;
        this.receiveAmount = str6;
        this.serviceFeeInfo = serviceFeeInfo;
        this.slippageInfo = dexAutoSlippageInfoParam;
        this.nativeSymbol = str7;
        this.valDiff = bool;
        this.remainingQuota = str8;
        this.orderInfo = tokenPairRateOrderInfo;
        this.source = tokenPairRateSource;
        this.tradeTaxes = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData) : (r22v0 com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r26v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r27v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo) : (r31v0 com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo))
  (wrap:com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource:?: TERNARY null = ((wrap:int:0x0074: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0078: SGET  A[WRAPPED] (LINE:56) com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource.UNKNOWN com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource) : (r32v0 com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0080: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateSource, java.lang.String):void type: THIS */
    public /* synthetic */ TokenPairRateQuote(String str, boolean z, String str2, String str3, LimitFeeData limitFeeData, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str7, Boolean bool, String str8, TokenPairRateOrderInfo tokenPairRateOrderInfo, TokenPairRateSource tokenPairRateSource, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : limitFeeData, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : serviceFeeInfo, (i & 512) != 0 ? null : dexAutoSlippageInfoParam, (i & 1024) == 0 ? str7 : "", (i & 2048) != 0 ? Boolean.FALSE : bool, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : tokenPairRateOrderInfo, (i & 16384) != 0 ? TokenPairRateSource.UNKNOWN : tokenPairRateSource, (i & 32768) != 0 ? null : str9);
    }

    public final boolean isAutoConfirmQuotaRemaining() {
        String str = this.remainingQuota;
        if (str != null && str.length() != 0) {
            String str2 = this.remainingQuota;
            String str3 = this.fromTokenPrice;
            if (str3 != null) {
                TokenPairRateOrderInfo tokenPairRateOrderInfo = this.orderInfo;
                strMulCheckS$default = C23313hvq.mulCheckS$default(str3, tokenPairRateOrderInfo != null ? tokenPairRateOrderInfo.getFromTokenAmount() : null, null, null, null, 14, null);
            }
            if (!C33129mqd.copydefault(str2, strMulCheckS$default)) {
                return false;
            }
        }
        return true;
    }
}

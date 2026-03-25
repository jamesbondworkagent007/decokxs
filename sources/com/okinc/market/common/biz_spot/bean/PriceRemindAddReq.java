package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class PriceRemindAddReq implements Parcelable {
    private Integer bizType;
    private String chainId;
    private String condition1;
    private String condition2;
    private String customMsg;
    private String indicatorType;
    private String instrumentName;
    private Integer presetCondition;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private String signalType;
    private int sourceType;
    private Integer timePeriod;
    private String token;
    private String tokenAddress;
    private String wrappedAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceRemindAddReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriceRemindAddReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRemindAddReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceRemindAddReq(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRemindAddReq[] newArray(int i) {
            return new PriceRemindAddReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.wrappedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.indicatorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.condition2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.presetCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRemindAddReq copy(int i, Integer num, String str, int i2, int i3, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PriceRemindAddReq(i, num, str, i2, i3, str2, str3, str4, str5, str6, str7, num2, str8, str9, str10, str11, num3);
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
        if (!(obj instanceof PriceRemindAddReq)) {
            return false;
        }
        PriceRemindAddReq priceRemindAddReq = (PriceRemindAddReq) obj;
        return this.sourceType == priceRemindAddReq.sourceType && Intrinsics.EZpvd(this.bizType, priceRemindAddReq.bizType) && Intrinsics.EZpvd((Object) this.instrumentName, (Object) priceRemindAddReq.instrumentName) && this.promptType == priceRemindAddReq.promptType && this.repeatType == priceRemindAddReq.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) priceRemindAddReq.promptThreshold) && Intrinsics.EZpvd((Object) this.customMsg, (Object) priceRemindAddReq.customMsg) && Intrinsics.EZpvd((Object) this.chainId, (Object) priceRemindAddReq.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) priceRemindAddReq.tokenAddress) && Intrinsics.EZpvd((Object) this.wrappedAddress, (Object) priceRemindAddReq.wrappedAddress) && Intrinsics.EZpvd((Object) this.token, (Object) priceRemindAddReq.token) && Intrinsics.EZpvd(this.timePeriod, priceRemindAddReq.timePeriod) && Intrinsics.EZpvd((Object) this.indicatorType, (Object) priceRemindAddReq.indicatorType) && Intrinsics.EZpvd((Object) this.signalType, (Object) priceRemindAddReq.signalType) && Intrinsics.EZpvd((Object) this.condition1, (Object) priceRemindAddReq.condition1) && Intrinsics.EZpvd((Object) this.condition2, (Object) priceRemindAddReq.condition2) && Intrinsics.EZpvd(this.presetCondition, priceRemindAddReq.presetCondition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCondition1() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCondition2() {
        return this.condition2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMsg() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndicatorType() {
        return this.indicatorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPresetCondition() {
        return this.presetCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalType() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrappedAddress() {
        return this.wrappedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sourceType);
        Integer num = this.bizType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.instrumentName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Integer.hashCode(this.promptType);
        int iHashCode5 = Integer.hashCode(this.repeatType);
        int iHashCode6 = this.promptThreshold.hashCode();
        int iHashCode7 = this.customMsg.hashCode();
        String str2 = this.chainId;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenAddress;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.wrappedAddress;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.token;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        Integer num2 = this.timePeriod;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        String str6 = this.indicatorType;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.signalType;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.condition1;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.condition2;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        Integer num3 = this.presetCondition;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition1(String str) {
        this.condition1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition2(String str) {
        this.condition2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndicatorType(String str) {
        this.indicatorType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(String str) {
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPresetCondition(Integer num) {
        this.presetCondition = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalType(String str) {
        this.signalType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimePeriod(Integer num) {
        this.timePeriod = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWrappedAddress(String str) {
        this.wrappedAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRemindAddReq(sourceType=" + this.sourceType + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", customMsg=" + this.customMsg + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", wrappedAddress=" + this.wrappedAddress + ", token=" + this.token + ", timePeriod=" + this.timePeriod + ", indicatorType=" + this.indicatorType + ", signalType=" + this.signalType + ", condition1=" + this.condition1 + ", condition2=" + this.condition2 + ", presetCondition=" + this.presetCondition + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sourceType);
        Integer num = this.bizType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.instrumentName);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeString(this.customMsg);
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.wrappedAddress);
        parcel.writeString(this.token);
        Integer num2 = this.timePeriod;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.indicatorType);
        parcel.writeString(this.signalType);
        parcel.writeString(this.condition1);
        parcel.writeString(this.condition2);
        Integer num3 = this.presetCondition;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.PriceRemindAddReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceRemindAddReq> serializer() {
            return PriceRemindAddReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceRemindAddReq(int i, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if (17 != (i & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i, 17, PriceRemindAddReq$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceType = i2;
        if ((i & 2) == 0) {
            this.bizType = null;
        } else {
            this.bizType = num;
        }
        if ((i & 4) == 0) {
            this.instrumentName = null;
        } else {
            this.instrumentName = str;
        }
        this.promptType = (i & 8) == 0 ? 0 : i3;
        this.repeatType = i4;
        if ((i & 32) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str2;
        }
        if ((i & 64) == 0) {
            this.customMsg = "";
        } else {
            this.customMsg = str3;
        }
        if ((i & 128) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str4;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str5;
        }
        if ((i & 512) == 0) {
            this.wrappedAddress = null;
        } else {
            this.wrappedAddress = str6;
        }
        if ((i & 1024) == 0) {
            this.token = null;
        } else {
            this.token = str7;
        }
        if ((i & 2048) == 0) {
            this.timePeriod = null;
        } else {
            this.timePeriod = num2;
        }
        if ((i & 4096) == 0) {
            this.indicatorType = null;
        } else {
            this.indicatorType = str8;
        }
        if ((i & 8192) == 0) {
            this.signalType = null;
        } else {
            this.signalType = str9;
        }
        if ((i & 16384) == 0) {
            this.condition1 = null;
        } else {
            this.condition1 = str10;
        }
        if ((32768 & i) == 0) {
            this.condition2 = null;
        } else {
            this.condition2 = str11;
        }
        if ((i & 65536) == 0) {
            this.presetCondition = null;
        } else {
            this.presetCondition = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(PriceRemindAddReq priceRemindAddReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, priceRemindAddReq.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceRemindAddReq.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, priceRemindAddReq.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceRemindAddReq.instrumentName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceRemindAddReq.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceRemindAddReq.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, priceRemindAddReq.promptType);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, priceRemindAddReq.repeatType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) priceRemindAddReq.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, priceRemindAddReq.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) priceRemindAddReq.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, priceRemindAddReq.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || priceRemindAddReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, priceRemindAddReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || priceRemindAddReq.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, priceRemindAddReq.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || priceRemindAddReq.wrappedAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, priceRemindAddReq.wrappedAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || priceRemindAddReq.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, priceRemindAddReq.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || priceRemindAddReq.timePeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, priceRemindAddReq.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || priceRemindAddReq.indicatorType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, priceRemindAddReq.indicatorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || priceRemindAddReq.signalType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, priceRemindAddReq.signalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || priceRemindAddReq.condition1 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, priceRemindAddReq.condition1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || priceRemindAddReq.condition2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, priceRemindAddReq.condition2);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && priceRemindAddReq.presetCondition == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, priceRemindAddReq.presetCondition);
    }

    public PriceRemindAddReq(int i, Integer num, String str, int i2, int i3, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sourceType = i;
        this.bizType = num;
        this.instrumentName = str;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str2;
        this.customMsg = str3;
        this.chainId = str4;
        this.tokenAddress = str5;
        this.wrappedAddress = str6;
        this.token = str7;
        this.timePeriod = num2;
        this.indicatorType = str8;
        this.signalType = str9;
        this.condition1 = str10;
        this.condition2 = str11;
        this.presetCondition = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008c: CONSTRUCTOR 
  (r22v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (r26v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004e: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007e: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
 A[MD:(int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:68) call: com.okinc.market.common.biz_spot.bean.PriceRemindAddReq.<init>(int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ PriceRemindAddReq(int i, Integer num, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0 : i2, i3, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? null : str7, (i4 & 2048) != 0 ? null : num2, (i4 & 4096) != 0 ? null : str8, (i4 & 8192) != 0 ? null : str9, (i4 & 16384) != 0 ? null : str10, (32768 & i4) != 0 ? null : str11, (i4 & 65536) != 0 ? null : num3);
    }
}

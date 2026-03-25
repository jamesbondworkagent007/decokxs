package com.okinc.crcore.coreapi.net.requestbean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CeDefiPriceRemindAddRequestBean implements Parcelable {
    private Integer bizType;
    private String chainId;
    private String customMsg;
    private String instrumentName;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private int sourceType;
    private String token;
    private String tokenAddress;
    private String wrappedAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CeDefiPriceRemindAddRequestBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CeDefiPriceRemindAddRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDefiPriceRemindAddRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeDefiPriceRemindAddRequestBean(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDefiPriceRemindAddRequestBean[] newArray(int i) {
            return new CeDefiPriceRemindAddRequestBean[i];
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
    public final CeDefiPriceRemindAddRequestBean copy(int i, Integer num, String str, int i2, int i3, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CeDefiPriceRemindAddRequestBean(i, num, str, i2, i3, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof CeDefiPriceRemindAddRequestBean)) {
            return false;
        }
        CeDefiPriceRemindAddRequestBean ceDefiPriceRemindAddRequestBean = (CeDefiPriceRemindAddRequestBean) obj;
        return this.sourceType == ceDefiPriceRemindAddRequestBean.sourceType && Intrinsics.EZpvd(this.bizType, ceDefiPriceRemindAddRequestBean.bizType) && Intrinsics.EZpvd((Object) this.instrumentName, (Object) ceDefiPriceRemindAddRequestBean.instrumentName) && this.promptType == ceDefiPriceRemindAddRequestBean.promptType && this.repeatType == ceDefiPriceRemindAddRequestBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) ceDefiPriceRemindAddRequestBean.promptThreshold) && Intrinsics.EZpvd((Object) this.customMsg, (Object) ceDefiPriceRemindAddRequestBean.customMsg) && Intrinsics.EZpvd((Object) this.chainId, (Object) ceDefiPriceRemindAddRequestBean.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) ceDefiPriceRemindAddRequestBean.tokenAddress) && Intrinsics.EZpvd((Object) this.wrappedAddress, (Object) ceDefiPriceRemindAddRequestBean.wrappedAddress) && Intrinsics.EZpvd((Object) this.token, (Object) ceDefiPriceRemindAddRequestBean.token);
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
    public final String getCustomMsg() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
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
    public final int getSourceType() {
        return this.sourceType;
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
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str5 != null ? str5.hashCode() : 0);
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
    public final void setCustomMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(String str) {
        this.instrumentName = str;
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
    public final void setSourceType(int i) {
        this.sourceType = i;
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
        return "CeDefiPriceRemindAddRequestBean(sourceType=" + this.sourceType + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", customMsg=" + this.customMsg + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", wrappedAddress=" + this.wrappedAddress + ", token=" + this.token + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sourceType);
        Integer num = this.bizType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.instrumentName);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeString(this.customMsg);
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.wrappedAddress);
        parcel.writeString(this.token);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.CeDefiPriceRemindAddRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiPriceRemindAddRequestBean> serializer() {
            return CeDefiPriceRemindAddRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiPriceRemindAddRequestBean(int i, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (57 != (i & 57)) {
            PluginExceptionsKt.throwMissingFieldException(i, 57, CeDefiPriceRemindAddRequestBean$$serializer.INSTANCE.getDescriptor());
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
        this.promptType = i3;
        this.repeatType = i4;
        this.promptThreshold = str2;
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
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CeDefiPriceRemindAddRequestBean ceDefiPriceRemindAddRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, ceDefiPriceRemindAddRequestBean.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ceDefiPriceRemindAddRequestBean.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ceDefiPriceRemindAddRequestBean.instrumentName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.instrumentName);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, ceDefiPriceRemindAddRequestBean.promptType);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, ceDefiPriceRemindAddRequestBean.repeatType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, ceDefiPriceRemindAddRequestBean.promptThreshold);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) ceDefiPriceRemindAddRequestBean.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, ceDefiPriceRemindAddRequestBean.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || ceDefiPriceRemindAddRequestBean.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || ceDefiPriceRemindAddRequestBean.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || ceDefiPriceRemindAddRequestBean.wrappedAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.wrappedAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && ceDefiPriceRemindAddRequestBean.token == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, ceDefiPriceRemindAddRequestBean.token);
    }

    public CeDefiPriceRemindAddRequestBean(int i, Integer num, String str, int i2, int i3, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7) {
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r16v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 int)
  (r20v0 int)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.crcore.coreapi.net.requestbean.CeDefiPriceRemindAddRequestBean.<init>(int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CeDefiPriceRemindAddRequestBean(int i, Integer num, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : str, i2, i3, str2, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? null : str7);
    }
}

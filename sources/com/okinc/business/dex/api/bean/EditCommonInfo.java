package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EditCommonInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean clickMax;
    private final String expireTime;
    private final String expireTimeType;
    private final String feeToken;
    private final int feeType;
    private final String orderId;
    private final String priorityFee;
    private final String rate;
    private final String slippage;
    private final int slippageType;
    private final boolean switchFromTo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EditCommonInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditCommonInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCommonInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EditCommonInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCommonInfo[] newArray(int i) {
            return new EditCommonInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expireTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.clickMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.switchFromTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCommonInfo copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, boolean z, boolean z2, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new EditCommonInfo(str, str2, str3, str4, str5, i, str6, z, z2, str7, i2);
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
        if (!(obj instanceof EditCommonInfo)) {
            return false;
        }
        EditCommonInfo editCommonInfo = (EditCommonInfo) obj;
        return Intrinsics.EZpvd((Object) this.slippage, (Object) editCommonInfo.slippage) && Intrinsics.EZpvd((Object) this.expireTime, (Object) editCommonInfo.expireTime) && Intrinsics.EZpvd((Object) this.expireTimeType, (Object) editCommonInfo.expireTimeType) && Intrinsics.EZpvd((Object) this.rate, (Object) editCommonInfo.rate) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) editCommonInfo.priorityFee) && this.feeType == editCommonInfo.feeType && Intrinsics.EZpvd((Object) this.feeToken, (Object) editCommonInfo.feeToken) && this.clickMax == editCommonInfo.clickMax && this.switchFromTo == editCommonInfo.switchFromTo && Intrinsics.EZpvd((Object) this.orderId, (Object) editCommonInfo.orderId) && this.slippageType == editCommonInfo.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClickMax() {
        return this.clickMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTimeType() {
        return this.expireTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeToken() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeType() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSwitchFromTo() {
        return this.switchFromTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.slippage.hashCode();
        int iHashCode2 = this.expireTime.hashCode();
        String str = this.expireTimeType;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.rate.hashCode()) * 31) + this.priorityFee.hashCode()) * 31) + Integer.hashCode(this.feeType)) * 31) + this.feeToken.hashCode()) * 31) + Boolean.hashCode(this.clickMax)) * 31) + Boolean.hashCode(this.switchFromTo)) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.slippageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditCommonInfo(slippage=" + this.slippage + ", expireTime=" + this.expireTime + ", expireTimeType=" + this.expireTimeType + ", rate=" + this.rate + ", priorityFee=" + this.priorityFee + ", feeType=" + this.feeType + ", feeToken=" + this.feeToken + ", clickMax=" + this.clickMax + ", switchFromTo=" + this.switchFromTo + ", orderId=" + this.orderId + ", slippageType=" + this.slippageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slippage);
        parcel.writeString(this.expireTime);
        parcel.writeString(this.expireTimeType);
        parcel.writeString(this.rate);
        parcel.writeString(this.priorityFee);
        parcel.writeInt(this.feeType);
        parcel.writeString(this.feeToken);
        parcel.writeInt(this.clickMax ? 1 : 0);
        parcel.writeInt(this.switchFromTo ? 1 : 0);
        parcel.writeString(this.orderId);
        parcel.writeInt(this.slippageType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.EditCommonInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditCommonInfo> serializer() {
            return EditCommonInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditCommonInfo(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, boolean z, boolean z2, String str7, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1659 != (i & 1659)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1659, EditCommonInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.slippage = str;
        this.expireTime = str2;
        if ((i & 4) == 0) {
            this.expireTimeType = null;
        } else {
            this.expireTimeType = str3;
        }
        this.rate = str4;
        this.priorityFee = str5;
        this.feeType = i2;
        this.feeToken = str6;
        if ((i & 128) == 0) {
            this.clickMax = false;
        } else {
            this.clickMax = z;
        }
        if ((i & 256) == 0) {
            this.switchFromTo = false;
        } else {
            this.switchFromTo = z2;
        }
        this.orderId = str7;
        this.slippageType = i3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(EditCommonInfo editCommonInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, editCommonInfo.slippage);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, editCommonInfo.expireTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editCommonInfo.expireTimeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, editCommonInfo.expireTimeType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, editCommonInfo.rate);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, editCommonInfo.priorityFee);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, editCommonInfo.feeType);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, editCommonInfo.feeToken);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || editCommonInfo.clickMax) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, editCommonInfo.clickMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || editCommonInfo.switchFromTo) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, editCommonInfo.switchFromTo);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, editCommonInfo.orderId);
        compositeEncoder.encodeIntElement(serialDescriptor, 10, editCommonInfo.slippageType);
    }

    public EditCommonInfo(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, boolean z, boolean z2, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.slippage = str;
        this.expireTime = str2;
        this.expireTimeType = str3;
        this.rate = str4;
        this.priorityFee = str5;
        this.feeType = i;
        this.feeToken = str6;
        this.clickMax = z;
        this.switchFromTo = z2;
        this.orderId = str7;
        this.slippageType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 int)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (r24v0 java.lang.String)
  (r25v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, java.lang.String, int):void (m)] (LINE:350) call: com.okinc.business.dex.api.bean.EditCommonInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, java.lang.String, int):void type: THIS */
    public /* synthetic */ EditCommonInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, str4, str5, i, str6, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2, str7, i2);
    }
}

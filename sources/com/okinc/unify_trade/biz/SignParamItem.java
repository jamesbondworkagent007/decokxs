package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SignParamItem implements Parcelable {
    private String delaySeconds;
    private String indicator;
    private String stopType;
    private String thold;
    private String timePeriod;
    private String timeframe;
    private String triggerAction;
    private String triggerCond;
    private String triggerPx;
    private String triggerTime;
    private String triggerType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignParamItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignParamItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignParamItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignParamItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignParamItem[] newArray(int i) {
            return new SignParamItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.indicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignParamItem copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignParamItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof SignParamItem)) {
            return false;
        }
        SignParamItem signParamItem = (SignParamItem) obj;
        return Intrinsics.EZpvd((Object) this.triggerAction, (Object) signParamItem.triggerAction) && Intrinsics.EZpvd((Object) this.indicator, (Object) signParamItem.indicator) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) signParamItem.triggerPx) && Intrinsics.EZpvd((Object) this.delaySeconds, (Object) signParamItem.delaySeconds) && Intrinsics.EZpvd((Object) this.timePeriod, (Object) signParamItem.timePeriod) && Intrinsics.EZpvd((Object) this.timeframe, (Object) signParamItem.timeframe) && Intrinsics.EZpvd((Object) this.triggerCond, (Object) signParamItem.triggerCond) && Intrinsics.EZpvd((Object) this.stopType, (Object) signParamItem.stopType) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) signParamItem.triggerTime) && Intrinsics.EZpvd((Object) this.triggerType, (Object) signParamItem.triggerType) && Intrinsics.EZpvd((Object) this.thold, (Object) signParamItem.thold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelaySeconds() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndicator() {
        return this.indicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThold() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeframe() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerAction() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerCond() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.triggerAction.hashCode();
        String str = this.indicator;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.triggerPx;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.delaySeconds;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.timePeriod;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.timeframe;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.triggerCond;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.stopType;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.triggerTime;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.triggerType;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.thold;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelaySeconds(String str) {
        this.delaySeconds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndicator(String str) {
        this.indicator = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThold(String str) {
        this.thold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimePeriod(String str) {
        this.timePeriod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeframe(String str) {
        this.timeframe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerAction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerCond(String str) {
        this.triggerCond = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(String str) {
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(String str) {
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignParamItem(triggerAction=" + this.triggerAction + ", indicator=" + this.indicator + ", triggerPx=" + this.triggerPx + ", delaySeconds=" + this.delaySeconds + ", timePeriod=" + this.timePeriod + ", timeframe=" + this.timeframe + ", triggerCond=" + this.triggerCond + ", stopType=" + this.stopType + ", triggerTime=" + this.triggerTime + ", triggerType=" + this.triggerType + ", thold=" + this.thold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.triggerAction);
        parcel.writeString(this.indicator);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.delaySeconds);
        parcel.writeString(this.timePeriod);
        parcel.writeString(this.timeframe);
        parcel.writeString(this.triggerCond);
        parcel.writeString(this.stopType);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.thold);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignParamItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignParamItem> serializer() {
            return SignParamItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignParamItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SignParamItem$$serializer.INSTANCE.getDescriptor());
        }
        this.triggerAction = str;
        if ((i & 2) == 0) {
            this.indicator = null;
        } else {
            this.indicator = str2;
        }
        if ((i & 4) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = str4;
        }
        if ((i & 16) == 0) {
            this.timePeriod = null;
        } else {
            this.timePeriod = str5;
        }
        if ((i & 32) == 0) {
            this.timeframe = null;
        } else {
            this.timeframe = str6;
        }
        if ((i & 64) == 0) {
            this.triggerCond = null;
        } else {
            this.triggerCond = str7;
        }
        if ((i & 128) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str8;
        }
        if ((i & 256) == 0) {
            this.triggerTime = null;
        } else {
            this.triggerTime = str9;
        }
        if ((i & 512) == 0) {
            this.triggerType = null;
        } else {
            this.triggerType = str10;
        }
        if ((i & 1024) == 0) {
            this.thold = null;
        } else {
            this.thold = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignParamItem signParamItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signParamItem.triggerAction);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signParamItem.indicator != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signParamItem.indicator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signParamItem.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signParamItem.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signParamItem.delaySeconds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signParamItem.delaySeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signParamItem.timePeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signParamItem.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signParamItem.timeframe != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signParamItem.timeframe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signParamItem.triggerCond != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signParamItem.triggerCond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signParamItem.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signParamItem.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signParamItem.triggerTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signParamItem.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signParamItem.triggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signParamItem.triggerType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && signParamItem.thold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signParamItem.thold);
    }

    public SignParamItem(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerAction = str;
        this.indicator = str2;
        this.triggerPx = str3;
        this.delaySeconds = str4;
        this.timePeriod = str5;
        this.timeframe = str6;
        this.triggerCond = str7;
        this.stopType = str8;
        this.triggerTime = str9;
        this.triggerType = str10;
        this.thold = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2828) call: com.okinc.unify_trade.biz.SignParamItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignParamItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}

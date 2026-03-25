package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AdvancedTriggerSign implements Parcelable {
    private final String authToken;
    private String delaySeconds;
    private String indicator;
    private String oversoldThold;
    private String stopType;
    private String thold;
    private String timePeriod;
    private String timeframe;
    private String triggerAction;
    private String triggerCond;
    private String triggerPx;
    private String triggerStrategy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedTriggerSign> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AdvancedTriggerSign> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedTriggerSign createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvancedTriggerSign(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedTriggerSign[] newArray(int i) {
            return new AdvancedTriggerSign[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedTriggerSign() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.authToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.indicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.oversoldThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedTriggerSign copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AdvancedTriggerSign(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof AdvancedTriggerSign)) {
            return false;
        }
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) obj;
        return Intrinsics.EZpvd((Object) this.triggerAction, (Object) advancedTriggerSign.triggerAction) && Intrinsics.EZpvd((Object) this.indicator, (Object) advancedTriggerSign.indicator) && Intrinsics.EZpvd((Object) this.triggerStrategy, (Object) advancedTriggerSign.triggerStrategy) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) advancedTriggerSign.triggerPx) && Intrinsics.EZpvd((Object) this.delaySeconds, (Object) advancedTriggerSign.delaySeconds) && Intrinsics.EZpvd((Object) this.timePeriod, (Object) advancedTriggerSign.timePeriod) && Intrinsics.EZpvd((Object) this.timeframe, (Object) advancedTriggerSign.timeframe) && Intrinsics.EZpvd((Object) this.triggerCond, (Object) advancedTriggerSign.triggerCond) && Intrinsics.EZpvd((Object) this.oversoldThold, (Object) advancedTriggerSign.oversoldThold) && Intrinsics.EZpvd((Object) this.thold, (Object) advancedTriggerSign.thold) && Intrinsics.EZpvd((Object) this.stopType, (Object) advancedTriggerSign.stopType) && Intrinsics.EZpvd((Object) this.authToken, (Object) advancedTriggerSign.authToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthToken() {
        return this.authToken;
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
    public final String getOversoldThold() {
        return this.oversoldThold;
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
    public final String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.triggerAction.hashCode();
        String str = this.indicator;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.triggerStrategy;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.triggerPx;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.delaySeconds;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.timePeriod;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.timeframe;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.triggerCond;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.oversoldThold;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.thold;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.stopType;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.authToken;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
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
    public final void setOversoldThold(String str) {
        this.oversoldThold = str;
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
    public final void setTriggerStrategy(String str) {
        this.triggerStrategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedTriggerSign(triggerAction=" + this.triggerAction + ", indicator=" + this.indicator + ", triggerStrategy=" + this.triggerStrategy + ", triggerPx=" + this.triggerPx + ", delaySeconds=" + this.delaySeconds + ", timePeriod=" + this.timePeriod + ", timeframe=" + this.timeframe + ", triggerCond=" + this.triggerCond + ", oversoldThold=" + this.oversoldThold + ", thold=" + this.thold + ", stopType=" + this.stopType + ", authToken=" + this.authToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.triggerAction);
        parcel.writeString(this.indicator);
        parcel.writeString(this.triggerStrategy);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.delaySeconds);
        parcel.writeString(this.timePeriod);
        parcel.writeString(this.timeframe);
        parcel.writeString(this.triggerCond);
        parcel.writeString(this.oversoldThold);
        parcel.writeString(this.thold);
        parcel.writeString(this.stopType);
        parcel.writeString(this.authToken);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AdvancedTriggerSign.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedTriggerSign> serializer() {
            return AdvancedTriggerSign$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedTriggerSign(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        this.triggerAction = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.indicator = null;
        } else {
            this.indicator = str2;
        }
        if ((i & 4) == 0) {
            this.triggerStrategy = null;
        } else {
            this.triggerStrategy = str3;
        }
        if ((i & 8) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str4;
        }
        if ((i & 16) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = str5;
        }
        if ((i & 32) == 0) {
            this.timePeriod = null;
        } else {
            this.timePeriod = str6;
        }
        if ((i & 64) == 0) {
            this.timeframe = null;
        } else {
            this.timeframe = str7;
        }
        if ((i & 128) == 0) {
            this.triggerCond = null;
        } else {
            this.triggerCond = str8;
        }
        if ((i & 256) == 0) {
            this.oversoldThold = null;
        } else {
            this.oversoldThold = str9;
        }
        if ((i & 512) == 0) {
            this.thold = null;
        } else {
            this.thold = str10;
        }
        if ((i & 1024) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str11;
        }
        if ((i & 2048) == 0) {
            this.authToken = null;
        } else {
            this.authToken = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AdvancedTriggerSign advancedTriggerSign, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedTriggerSign.triggerAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedTriggerSign.triggerAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || advancedTriggerSign.indicator != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, advancedTriggerSign.indicator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || advancedTriggerSign.triggerStrategy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, advancedTriggerSign.triggerStrategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || advancedTriggerSign.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, advancedTriggerSign.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || advancedTriggerSign.delaySeconds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, advancedTriggerSign.delaySeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || advancedTriggerSign.timePeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, advancedTriggerSign.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || advancedTriggerSign.timeframe != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, advancedTriggerSign.timeframe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || advancedTriggerSign.triggerCond != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, advancedTriggerSign.triggerCond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || advancedTriggerSign.oversoldThold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, advancedTriggerSign.oversoldThold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || advancedTriggerSign.thold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, advancedTriggerSign.thold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || advancedTriggerSign.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, advancedTriggerSign.stopType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && advancedTriggerSign.authToken == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, advancedTriggerSign.authToken);
    }

    public AdvancedTriggerSign(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerAction = str;
        this.indicator = str2;
        this.triggerStrategy = str3;
        this.triggerPx = str4;
        this.delaySeconds = str5;
        this.timePeriod = str6;
        this.timeframe = str7;
        this.triggerCond = str8;
        this.oversoldThold = str9;
        this.thold = str10;
        this.stopType = str11;
        this.authToken = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2809) call: com.okinc.unify_trade.biz.AdvancedTriggerSign.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedTriggerSign(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : null);
    }
}

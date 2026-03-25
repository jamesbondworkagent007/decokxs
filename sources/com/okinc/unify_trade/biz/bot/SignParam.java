package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class SignParam implements Parcelable {
    public static final int $stable = 0;
    private final String authToken;
    private final String delaySeconds;
    private final String indicator;
    private final String oversoldThold;
    private final String stopType;
    private final String thold;
    private final String timePeriod;
    private final String timeframe;
    private final String triggerAction;
    private final String triggerCond;
    private final String triggerPx;
    private final String triggerStrategy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SignParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignParam[] newArray(int i) {
            return new SignParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.indicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggerStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.authToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.oversoldThold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        return new SignParam(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof SignParam)) {
            return false;
        }
        SignParam signParam = (SignParam) obj;
        return Intrinsics.EZpvd((Object) this.indicator, (Object) signParam.indicator) && Intrinsics.EZpvd((Object) this.triggerStrategy, (Object) signParam.triggerStrategy) && Intrinsics.EZpvd((Object) this.triggerAction, (Object) signParam.triggerAction) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) signParam.triggerPx) && Intrinsics.EZpvd((Object) this.stopType, (Object) signParam.stopType) && Intrinsics.EZpvd((Object) this.authToken, (Object) signParam.authToken) && Intrinsics.EZpvd((Object) this.delaySeconds, (Object) signParam.delaySeconds) && Intrinsics.EZpvd((Object) this.oversoldThold, (Object) signParam.oversoldThold) && Intrinsics.EZpvd((Object) this.thold, (Object) signParam.thold) && Intrinsics.EZpvd((Object) this.timePeriod, (Object) signParam.timePeriod) && Intrinsics.EZpvd((Object) this.timeframe, (Object) signParam.timeframe) && Intrinsics.EZpvd((Object) this.triggerCond, (Object) signParam.triggerCond);
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
        return (((((((((((((((((((((this.indicator.hashCode() * 31) + this.triggerStrategy.hashCode()) * 31) + this.triggerAction.hashCode()) * 31) + this.triggerPx.hashCode()) * 31) + this.stopType.hashCode()) * 31) + this.authToken.hashCode()) * 31) + this.delaySeconds.hashCode()) * 31) + this.oversoldThold.hashCode()) * 31) + this.thold.hashCode()) * 31) + this.timePeriod.hashCode()) * 31) + this.timeframe.hashCode()) * 31) + this.triggerCond.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignParam(indicator=" + this.indicator + ", triggerStrategy=" + this.triggerStrategy + ", triggerAction=" + this.triggerAction + ", triggerPx=" + this.triggerPx + ", stopType=" + this.stopType + ", authToken=" + this.authToken + ", delaySeconds=" + this.delaySeconds + ", oversoldThold=" + this.oversoldThold + ", thold=" + this.thold + ", timePeriod=" + this.timePeriod + ", timeframe=" + this.timeframe + ", triggerCond=" + this.triggerCond + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.indicator);
        parcel.writeString(this.triggerStrategy);
        parcel.writeString(this.triggerAction);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.stopType);
        parcel.writeString(this.authToken);
        parcel.writeString(this.delaySeconds);
        parcel.writeString(this.oversoldThold);
        parcel.writeString(this.thold);
        parcel.writeString(this.timePeriod);
        parcel.writeString(this.timeframe);
        parcel.writeString(this.triggerCond);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SignParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignParam> serializer() {
            return SignParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignParam(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.indicator = "";
        } else {
            this.indicator = str;
        }
        if ((i & 2) == 0) {
            this.triggerStrategy = "";
        } else {
            this.triggerStrategy = str2;
        }
        if ((i & 4) == 0) {
            this.triggerAction = "";
        } else {
            this.triggerAction = str3;
        }
        if ((i & 8) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str4;
        }
        if ((i & 16) == 0) {
            this.stopType = "";
        } else {
            this.stopType = str5;
        }
        if ((i & 32) == 0) {
            this.authToken = "";
        } else {
            this.authToken = str6;
        }
        if ((i & 64) == 0) {
            this.delaySeconds = "";
        } else {
            this.delaySeconds = str7;
        }
        if ((i & 128) == 0) {
            this.oversoldThold = "";
        } else {
            this.oversoldThold = str8;
        }
        if ((i & 256) == 0) {
            this.thold = "";
        } else {
            this.thold = str9;
        }
        if ((i & 512) == 0) {
            this.timePeriod = "";
        } else {
            this.timePeriod = str10;
        }
        if ((i & 1024) == 0) {
            this.timeframe = "";
        } else {
            this.timeframe = str11;
        }
        if ((i & 2048) == 0) {
            this.triggerCond = "";
        } else {
            this.triggerCond = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignParam signParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signParam.indicator, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signParam.indicator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signParam.triggerStrategy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signParam.triggerStrategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signParam.triggerAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signParam.triggerAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signParam.triggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signParam.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signParam.stopType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signParam.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signParam.authToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signParam.authToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) signParam.delaySeconds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, signParam.delaySeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) signParam.oversoldThold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, signParam.oversoldThold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) signParam.thold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, signParam.thold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) signParam.timePeriod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, signParam.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) signParam.timeframe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, signParam.timeframe);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) signParam.triggerCond, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, signParam.triggerCond);
    }

    public SignParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        this.indicator = str;
        this.triggerStrategy = str2;
        this.triggerAction = str3;
        this.triggerPx = str4;
        this.stopType = str5;
        this.authToken = str6;
        this.delaySeconds = str7;
        this.oversoldThold = str8;
        this.thold = str9;
        this.timePeriod = str10;
        this.timeframe = str11;
        this.triggerCond = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:101) call: com.okinc.unify_trade.biz.bot.SignParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}

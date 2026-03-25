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
public final class BotRangeConfig implements Parcelable {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private String f84default;
    private String max;
    private String maxLongFuture;
    private String maxMultiplier;
    private String min;
    private String warning;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotRangeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotRangeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRangeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotRangeConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRangeConfig[] newArray(int i) {
            return new BotRangeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotRangeConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotRangeConfig copy$default(BotRangeConfig botRangeConfig, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botRangeConfig.min;
        }
        if ((i & 2) != 0) {
            str2 = botRangeConfig.max;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = botRangeConfig.f84default;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = botRangeConfig.warning;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = botRangeConfig.maxLongFuture;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = botRangeConfig.maxMultiplier;
        }
        return botRangeConfig.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.f84default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.warning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxLongFuture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRangeConfig copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new BotRangeConfig(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof BotRangeConfig)) {
            return false;
        }
        BotRangeConfig botRangeConfig = (BotRangeConfig) obj;
        return Intrinsics.EZpvd((Object) this.min, (Object) botRangeConfig.min) && Intrinsics.EZpvd((Object) this.max, (Object) botRangeConfig.max) && Intrinsics.EZpvd((Object) this.f84default, (Object) botRangeConfig.f84default) && Intrinsics.EZpvd((Object) this.warning, (Object) botRangeConfig.warning) && Intrinsics.EZpvd((Object) this.maxLongFuture, (Object) botRangeConfig.maxLongFuture) && Intrinsics.EZpvd((Object) this.maxMultiplier, (Object) botRangeConfig.maxMultiplier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefault() {
        return this.f84default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLongFuture() {
        return this.maxLongFuture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMultiplier() {
        return this.maxMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWarning() {
        return this.warning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.min;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.max;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f84default;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.warning;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxLongFuture;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxMultiplier;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(String str) {
        this.f84default = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(String str) {
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxLongFuture(String str) {
        this.maxLongFuture = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxMultiplier(String str) {
        this.maxMultiplier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(String str) {
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWarning(String str) {
        this.warning = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotRangeConfig(min=" + this.min + ", max=" + this.max + ", default=" + this.f84default + ", warning=" + this.warning + ", maxLongFuture=" + this.maxLongFuture + ", maxMultiplier=" + this.maxMultiplier + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.min);
        parcel.writeString(this.max);
        parcel.writeString(this.f84default);
        parcel.writeString(this.warning);
        parcel.writeString(this.maxLongFuture);
        parcel.writeString(this.maxMultiplier);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotRangeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotRangeConfig> serializer() {
            return BotRangeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotRangeConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = null;
        } else {
            this.min = str;
        }
        if ((i & 2) == 0) {
            this.max = null;
        } else {
            this.max = str2;
        }
        if ((i & 4) == 0) {
            this.f84default = null;
        } else {
            this.f84default = str3;
        }
        if ((i & 8) == 0) {
            this.warning = null;
        } else {
            this.warning = str4;
        }
        if ((i & 16) == 0) {
            this.maxLongFuture = null;
        } else {
            this.maxLongFuture = str5;
        }
        if ((i & 32) == 0) {
            this.maxMultiplier = null;
        } else {
            this.maxMultiplier = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotRangeConfig botRangeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botRangeConfig.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botRangeConfig.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botRangeConfig.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botRangeConfig.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botRangeConfig.f84default != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botRangeConfig.f84default);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botRangeConfig.warning != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botRangeConfig.warning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botRangeConfig.maxLongFuture != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botRangeConfig.maxLongFuture);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && botRangeConfig.maxMultiplier == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botRangeConfig.maxMultiplier);
    }

    public BotRangeConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this.min = str;
        this.max = str2;
        this.f84default = str3;
        this.warning = str4;
        this.maxLongFuture = str5;
        this.maxMultiplier = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2797) call: com.okinc.unify_trade.biz.BotRangeConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotRangeConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}

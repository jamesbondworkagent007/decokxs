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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BotLeverConfig implements Parcelable {
    public static final int $stable = 0;
    private final String currentLever;
    private final String leveragePercents;
    private final String maxLever;
    private final String minLever;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BotLeverConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotLeverConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeverConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeverConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeverConfig[] newArray(int i) {
            return new BotLeverConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeverConfig() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeverConfig copy$default(BotLeverConfig botLeverConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeverConfig.minLever;
        }
        if ((i & 2) != 0) {
            str2 = botLeverConfig.maxLever;
        }
        if ((i & 4) != 0) {
            str3 = botLeverConfig.currentLever;
        }
        if ((i & 8) != 0) {
            str4 = botLeverConfig.leveragePercents;
        }
        return botLeverConfig.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.leveragePercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeverConfig copy(String str, String str2, String str3, String str4) {
        return new BotLeverConfig(str, str2, str3, str4);
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
        if (!(obj instanceof BotLeverConfig)) {
            return false;
        }
        BotLeverConfig botLeverConfig = (BotLeverConfig) obj;
        return Intrinsics.EZpvd((Object) this.minLever, (Object) botLeverConfig.minLever) && Intrinsics.EZpvd((Object) this.maxLever, (Object) botLeverConfig.maxLever) && Intrinsics.EZpvd((Object) this.currentLever, (Object) botLeverConfig.currentLever) && Intrinsics.EZpvd((Object) this.leveragePercents, (Object) botLeverConfig.leveragePercents);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentLever() {
        return this.currentLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeveragePercents() {
        return this.leveragePercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLever() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLever() {
        return this.minLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.minLever;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.maxLever;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentLever;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.leveragePercents;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeverConfig(minLever=" + this.minLever + ", maxLever=" + this.maxLever + ", currentLever=" + this.currentLever + ", leveragePercents=" + this.leveragePercents + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minLever);
        parcel.writeString(this.maxLever);
        parcel.writeString(this.currentLever);
        parcel.writeString(this.leveragePercents);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeverConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeverConfig> serializer() {
            return BotLeverConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeverConfig(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minLever = null;
        } else {
            this.minLever = str;
        }
        if ((i & 2) == 0) {
            this.maxLever = null;
        } else {
            this.maxLever = str2;
        }
        if ((i & 4) == 0) {
            this.currentLever = null;
        } else {
            this.currentLever = str3;
        }
        if ((i & 8) == 0) {
            this.leveragePercents = null;
        } else {
            this.leveragePercents = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeverConfig botLeverConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeverConfig.minLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeverConfig.minLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeverConfig.maxLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeverConfig.maxLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botLeverConfig.currentLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeverConfig.currentLever);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && botLeverConfig.leveragePercents == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeverConfig.leveragePercents);
    }

    public BotLeverConfig(String str, String str2, String str3, String str4) {
        this.minLever = str;
        this.maxLever = str2;
        this.currentLever = str3;
        this.leveragePercents = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3397) call: com.okinc.unify_trade.biz.BotLeverConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeverConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

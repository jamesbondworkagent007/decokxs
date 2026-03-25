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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SpotGridTpSlConfig implements Parcelable {
    public static final int $stable = 0;
    private final String maxDelaySeconds;
    private final String maxSlPnlRatio;
    private final String minDelaySeconds;
    private final String minSlPnlRatio;
    private final String minTpPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotGridTpSlConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotGridTpSlConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridTpSlConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotGridTpSlConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridTpSlConfig[] newArray(int i) {
            return new SpotGridTpSlConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotGridTpSlConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotGridTpSlConfig copy$default(SpotGridTpSlConfig spotGridTpSlConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotGridTpSlConfig.minTpPnlRatio;
        }
        if ((i & 2) != 0) {
            str2 = spotGridTpSlConfig.minSlPnlRatio;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = spotGridTpSlConfig.maxSlPnlRatio;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = spotGridTpSlConfig.minDelaySeconds;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = spotGridTpSlConfig.maxDelaySeconds;
        }
        return spotGridTpSlConfig.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minTpPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minSlPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxSlPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minDelaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxDelaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridTpSlConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SpotGridTpSlConfig(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SpotGridTpSlConfig)) {
            return false;
        }
        SpotGridTpSlConfig spotGridTpSlConfig = (SpotGridTpSlConfig) obj;
        return Intrinsics.EZpvd((Object) this.minTpPnlRatio, (Object) spotGridTpSlConfig.minTpPnlRatio) && Intrinsics.EZpvd((Object) this.minSlPnlRatio, (Object) spotGridTpSlConfig.minSlPnlRatio) && Intrinsics.EZpvd((Object) this.maxSlPnlRatio, (Object) spotGridTpSlConfig.maxSlPnlRatio) && Intrinsics.EZpvd((Object) this.minDelaySeconds, (Object) spotGridTpSlConfig.minDelaySeconds) && Intrinsics.EZpvd((Object) this.maxDelaySeconds, (Object) spotGridTpSlConfig.maxDelaySeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDelaySeconds() {
        return this.maxDelaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlPnlRatio() {
        return this.maxSlPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinDelaySeconds() {
        return this.minDelaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSlPnlRatio() {
        return this.minSlPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTpPnlRatio() {
        return this.minTpPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.minTpPnlRatio.hashCode() * 31) + this.minSlPnlRatio.hashCode()) * 31) + this.maxSlPnlRatio.hashCode()) * 31) + this.minDelaySeconds.hashCode()) * 31) + this.maxDelaySeconds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotGridTpSlConfig(minTpPnlRatio=" + this.minTpPnlRatio + ", minSlPnlRatio=" + this.minSlPnlRatio + ", maxSlPnlRatio=" + this.maxSlPnlRatio + ", minDelaySeconds=" + this.minDelaySeconds + ", maxDelaySeconds=" + this.maxDelaySeconds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minTpPnlRatio);
        parcel.writeString(this.minSlPnlRatio);
        parcel.writeString(this.maxSlPnlRatio);
        parcel.writeString(this.minDelaySeconds);
        parcel.writeString(this.maxDelaySeconds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotGridTpSlConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotGridTpSlConfig> serializer() {
            return SpotGridTpSlConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotGridTpSlConfig(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minTpPnlRatio = "0.0001";
        } else {
            this.minTpPnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.minSlPnlRatio = "0.0001";
        } else {
            this.minSlPnlRatio = str2;
        }
        if ((i & 4) == 0) {
            this.maxSlPnlRatio = "0.9999";
        } else {
            this.maxSlPnlRatio = str3;
        }
        if ((i & 8) == 0) {
            this.minDelaySeconds = "5";
        } else {
            this.minDelaySeconds = str4;
        }
        if ((i & 16) == 0) {
            this.maxDelaySeconds = "30";
        } else {
            this.maxDelaySeconds = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotGridTpSlConfig spotGridTpSlConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotGridTpSlConfig.minTpPnlRatio, (Object) "0.0001")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotGridTpSlConfig.minTpPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotGridTpSlConfig.minSlPnlRatio, (Object) "0.0001")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotGridTpSlConfig.minSlPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotGridTpSlConfig.maxSlPnlRatio, (Object) "0.9999")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotGridTpSlConfig.maxSlPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotGridTpSlConfig.minDelaySeconds, (Object) "5")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotGridTpSlConfig.minDelaySeconds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) spotGridTpSlConfig.maxDelaySeconds, (Object) "30")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, spotGridTpSlConfig.maxDelaySeconds);
    }

    public SpotGridTpSlConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.minTpPnlRatio = str;
        this.minSlPnlRatio = str2;
        this.maxSlPnlRatio = str3;
        this.minDelaySeconds = str4;
        this.maxDelaySeconds = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0.0001") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : ("0.0001"))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0.9999") : (r6v0 java.lang.String))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("5") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("30") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2219) call: com.okinc.unify_trade.biz.SpotGridTpSlConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotGridTpSlConfig(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0.0001" : str, (i & 2) == 0 ? str2 : "0.0001", (i & 4) != 0 ? "0.9999" : str3, (i & 8) != 0 ? "5" : str4, (i & 16) != 0 ? "30" : str5);
    }
}

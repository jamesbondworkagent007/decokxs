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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SmartEarnConfig implements Parcelable {
    public static final int $stable = 0;
    private final String defaultMaxRange;
    private final String defaultMinRange;
    private final String distanceLimit;
    private final String earnSupport;
    private final String maxRangeLimit;
    private final String minGridNum;
    private final String minRangeLimit;
    private final String wideDistanceLimit;
    private final String wideMaxRangeLimit;
    private final String wideMinRangeLimit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SmartEarnConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartEarnConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartEarnConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnConfig[] newArray(int i) {
            return new SmartEarnConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartEarnConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.distanceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.wideMaxRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.defaultMinRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultMaxRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.wideDistanceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.wideMinRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new SmartEarnConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof SmartEarnConfig)) {
            return false;
        }
        SmartEarnConfig smartEarnConfig = (SmartEarnConfig) obj;
        return Intrinsics.EZpvd((Object) this.distanceLimit, (Object) smartEarnConfig.distanceLimit) && Intrinsics.EZpvd((Object) this.minRangeLimit, (Object) smartEarnConfig.minRangeLimit) && Intrinsics.EZpvd((Object) this.maxRangeLimit, (Object) smartEarnConfig.maxRangeLimit) && Intrinsics.EZpvd((Object) this.minGridNum, (Object) smartEarnConfig.minGridNum) && Intrinsics.EZpvd((Object) this.defaultMinRange, (Object) smartEarnConfig.defaultMinRange) && Intrinsics.EZpvd((Object) this.defaultMaxRange, (Object) smartEarnConfig.defaultMaxRange) && Intrinsics.EZpvd((Object) this.earnSupport, (Object) smartEarnConfig.earnSupport) && Intrinsics.EZpvd((Object) this.wideDistanceLimit, (Object) smartEarnConfig.wideDistanceLimit) && Intrinsics.EZpvd((Object) this.wideMinRangeLimit, (Object) smartEarnConfig.wideMinRangeLimit) && Intrinsics.EZpvd((Object) this.wideMaxRangeLimit, (Object) smartEarnConfig.wideMaxRangeLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultMaxRange() {
        return this.defaultMaxRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultMinRange() {
        return this.defaultMinRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDistanceLimit() {
        return this.distanceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnSupport() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxRangeLimit() {
        return this.maxRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGridNum() {
        return this.minGridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinRangeLimit() {
        return this.minRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWideDistanceLimit() {
        return this.wideDistanceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWideMaxRangeLimit() {
        return this.wideMaxRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWideMinRangeLimit() {
        return this.wideMinRangeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.distanceLimit.hashCode() * 31) + this.minRangeLimit.hashCode()) * 31) + this.maxRangeLimit.hashCode()) * 31) + this.minGridNum.hashCode()) * 31) + this.defaultMinRange.hashCode()) * 31) + this.defaultMaxRange.hashCode()) * 31) + this.earnSupport.hashCode()) * 31) + this.wideDistanceLimit.hashCode()) * 31) + this.wideMinRangeLimit.hashCode()) * 31) + this.wideMaxRangeLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartEarnConfig(distanceLimit=" + this.distanceLimit + ", minRangeLimit=" + this.minRangeLimit + ", maxRangeLimit=" + this.maxRangeLimit + ", minGridNum=" + this.minGridNum + ", defaultMinRange=" + this.defaultMinRange + ", defaultMaxRange=" + this.defaultMaxRange + ", earnSupport=" + this.earnSupport + ", wideDistanceLimit=" + this.wideDistanceLimit + ", wideMinRangeLimit=" + this.wideMinRangeLimit + ", wideMaxRangeLimit=" + this.wideMaxRangeLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.distanceLimit);
        parcel.writeString(this.minRangeLimit);
        parcel.writeString(this.maxRangeLimit);
        parcel.writeString(this.minGridNum);
        parcel.writeString(this.defaultMinRange);
        parcel.writeString(this.defaultMaxRange);
        parcel.writeString(this.earnSupport);
        parcel.writeString(this.wideDistanceLimit);
        parcel.writeString(this.wideMinRangeLimit);
        parcel.writeString(this.wideMaxRangeLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SmartEarnConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartEarnConfig> serializer() {
            return SmartEarnConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartEarnConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.distanceLimit = "";
        } else {
            this.distanceLimit = str;
        }
        if ((i & 2) == 0) {
            this.minRangeLimit = "";
        } else {
            this.minRangeLimit = str2;
        }
        if ((i & 4) == 0) {
            this.maxRangeLimit = "";
        } else {
            this.maxRangeLimit = str3;
        }
        if ((i & 8) == 0) {
            this.minGridNum = "";
        } else {
            this.minGridNum = str4;
        }
        if ((i & 16) == 0) {
            this.defaultMinRange = "";
        } else {
            this.defaultMinRange = str5;
        }
        if ((i & 32) == 0) {
            this.defaultMaxRange = "";
        } else {
            this.defaultMaxRange = str6;
        }
        if ((i & 64) == 0) {
            this.earnSupport = "";
        } else {
            this.earnSupport = str7;
        }
        if ((i & 128) == 0) {
            this.wideDistanceLimit = "";
        } else {
            this.wideDistanceLimit = str8;
        }
        if ((i & 256) == 0) {
            this.wideMinRangeLimit = "";
        } else {
            this.wideMinRangeLimit = str9;
        }
        if ((i & 512) == 0) {
            this.wideMaxRangeLimit = "";
        } else {
            this.wideMaxRangeLimit = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartEarnConfig smartEarnConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smartEarnConfig.distanceLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smartEarnConfig.distanceLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartEarnConfig.minRangeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartEarnConfig.minRangeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smartEarnConfig.maxRangeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smartEarnConfig.maxRangeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smartEarnConfig.minGridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smartEarnConfig.minGridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smartEarnConfig.defaultMinRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smartEarnConfig.defaultMinRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smartEarnConfig.defaultMaxRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smartEarnConfig.defaultMaxRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartEarnConfig.earnSupport, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smartEarnConfig.earnSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smartEarnConfig.wideDistanceLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smartEarnConfig.wideDistanceLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) smartEarnConfig.wideMinRangeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, smartEarnConfig.wideMinRangeLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) smartEarnConfig.wideMaxRangeLimit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, smartEarnConfig.wideMaxRangeLimit);
    }

    public SmartEarnConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.distanceLimit = str;
        this.minRangeLimit = str2;
        this.maxRangeLimit = str3;
        this.minGridNum = str4;
        this.defaultMinRange = str5;
        this.defaultMaxRange = str6;
        this.earnSupport = str7;
        this.wideDistanceLimit = str8;
        this.wideMinRangeLimit = str9;
        this.wideMaxRangeLimit = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:82) call: com.okinc.unify_trade.biz.bot.SmartEarnConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartEarnConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    public final boolean isEarnSupported() {
        return Intrinsics.EZpvd((Object) this.earnSupport, (Object) "1");
    }
}

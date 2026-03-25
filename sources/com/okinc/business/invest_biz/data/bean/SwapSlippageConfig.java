package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SwapSlippageConfig implements Parcelable {
    public static final int $stable = 0;
    private final String autoCustomMax;
    private final String autoCustomMin;
    private final String automaticSlippage;
    private final String customMax;
    private final String customMin;
    private final String customSafe;
    private final String customWarn;
    private final String stableMax;
    private final String stableMiddle;
    private final String stableMin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SwapSlippageConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SwapSlippageConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapSlippageConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SwapSlippageConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapSlippageConfig[] newArray(int i) {
            return new SwapSlippageConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapSlippageConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stableMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.automaticSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.stableMiddle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stableMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.customMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.customWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.customSafe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.customMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.autoCustomMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.autoCustomMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapSlippageConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new SwapSlippageConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof SwapSlippageConfig)) {
            return false;
        }
        SwapSlippageConfig swapSlippageConfig = (SwapSlippageConfig) obj;
        return Intrinsics.EZpvd((Object) this.stableMin, (Object) swapSlippageConfig.stableMin) && Intrinsics.EZpvd((Object) this.stableMiddle, (Object) swapSlippageConfig.stableMiddle) && Intrinsics.EZpvd((Object) this.stableMax, (Object) swapSlippageConfig.stableMax) && Intrinsics.EZpvd((Object) this.customMin, (Object) swapSlippageConfig.customMin) && Intrinsics.EZpvd((Object) this.customWarn, (Object) swapSlippageConfig.customWarn) && Intrinsics.EZpvd((Object) this.customSafe, (Object) swapSlippageConfig.customSafe) && Intrinsics.EZpvd((Object) this.customMax, (Object) swapSlippageConfig.customMax) && Intrinsics.EZpvd((Object) this.autoCustomMin, (Object) swapSlippageConfig.autoCustomMin) && Intrinsics.EZpvd((Object) this.autoCustomMax, (Object) swapSlippageConfig.autoCustomMax) && Intrinsics.EZpvd((Object) this.automaticSlippage, (Object) swapSlippageConfig.automaticSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoCustomMax() {
        return this.autoCustomMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoCustomMin() {
        return this.autoCustomMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutomaticSlippage() {
        return this.automaticSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMax() {
        return this.customMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMin() {
        return this.customMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomSafe() {
        return this.customSafe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomWarn() {
        return this.customWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStableMax() {
        return this.stableMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStableMiddle() {
        return this.stableMiddle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStableMin() {
        return this.stableMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.stableMin.hashCode() * 31) + this.stableMiddle.hashCode()) * 31) + this.stableMax.hashCode()) * 31) + this.customMin.hashCode()) * 31) + this.customWarn.hashCode()) * 31) + this.customSafe.hashCode()) * 31) + this.customMax.hashCode()) * 31) + this.autoCustomMin.hashCode()) * 31) + this.autoCustomMax.hashCode()) * 31) + this.automaticSlippage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapSlippageConfig(stableMin=" + this.stableMin + ", stableMiddle=" + this.stableMiddle + ", stableMax=" + this.stableMax + ", customMin=" + this.customMin + ", customWarn=" + this.customWarn + ", customSafe=" + this.customSafe + ", customMax=" + this.customMax + ", autoCustomMin=" + this.autoCustomMin + ", autoCustomMax=" + this.autoCustomMax + ", automaticSlippage=" + this.automaticSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stableMin);
        parcel.writeString(this.stableMiddle);
        parcel.writeString(this.stableMax);
        parcel.writeString(this.customMin);
        parcel.writeString(this.customWarn);
        parcel.writeString(this.customSafe);
        parcel.writeString(this.customMax);
        parcel.writeString(this.autoCustomMin);
        parcel.writeString(this.autoCustomMax);
        parcel.writeString(this.automaticSlippage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SwapSlippageConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwapSlippageConfig> serializer() {
            return SwapSlippageConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwapSlippageConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stableMin = "";
        } else {
            this.stableMin = str;
        }
        if ((i & 2) == 0) {
            this.stableMiddle = "";
        } else {
            this.stableMiddle = str2;
        }
        if ((i & 4) == 0) {
            this.stableMax = "";
        } else {
            this.stableMax = str3;
        }
        if ((i & 8) == 0) {
            this.customMin = "0.001";
        } else {
            this.customMin = str4;
        }
        if ((i & 16) == 0) {
            this.customWarn = "0.005";
        } else {
            this.customWarn = str5;
        }
        if ((i & 32) == 0) {
            this.customSafe = "0.1";
        } else {
            this.customSafe = str6;
        }
        if ((i & 64) == 0) {
            this.customMax = SlippageConfigVo.MAX_SLIP;
        } else {
            this.customMax = str7;
        }
        if ((i & 128) == 0) {
            this.autoCustomMin = "0.01";
        } else {
            this.autoCustomMin = str8;
        }
        if ((i & 256) == 0) {
            this.autoCustomMax = SlippageConfigVo.MAX_SLIP;
        } else {
            this.autoCustomMax = str9;
        }
        if ((i & 512) == 0) {
            this.automaticSlippage = "";
        } else {
            this.automaticSlippage = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(SwapSlippageConfig swapSlippageConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) swapSlippageConfig.stableMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, swapSlippageConfig.stableMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) swapSlippageConfig.stableMiddle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, swapSlippageConfig.stableMiddle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) swapSlippageConfig.stableMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, swapSlippageConfig.stableMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) swapSlippageConfig.customMin, (Object) "0.001")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, swapSlippageConfig.customMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) swapSlippageConfig.customWarn, (Object) "0.005")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, swapSlippageConfig.customWarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) swapSlippageConfig.customSafe, (Object) "0.1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, swapSlippageConfig.customSafe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) swapSlippageConfig.customMax, (Object) SlippageConfigVo.MAX_SLIP)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, swapSlippageConfig.customMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) swapSlippageConfig.autoCustomMin, (Object) "0.01")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, swapSlippageConfig.autoCustomMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) swapSlippageConfig.autoCustomMax, (Object) SlippageConfigVo.MAX_SLIP)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, swapSlippageConfig.autoCustomMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) swapSlippageConfig.automaticSlippage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, swapSlippageConfig.automaticSlippage);
    }

    public SwapSlippageConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.stableMin = str;
        this.stableMiddle = str2;
        this.stableMax = str3;
        this.customMin = str4;
        this.customWarn = str5;
        this.customSafe = str6;
        this.customMax = str7;
        this.autoCustomMin = str8;
        this.autoCustomMax = str9;
        this.automaticSlippage = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0068: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0.001") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0.005") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0.1") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0.01") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (wrap:java.lang.String:0x0036: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:457) call: com.okinc.business.invest_biz.data.bean.SwapSlippageConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SwapSlippageConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "0.001" : str4, (i & 16) != 0 ? "0.005" : str5, (i & 32) != 0 ? "0.1" : str6, (i & 64) != 0 ? SlippageConfigVo.MAX_SLIP : str7, (i & 128) != 0 ? "0.01" : str8, (i & 256) == 0 ? str9 : SlippageConfigVo.MAX_SLIP, (i & 512) == 0 ? str10 : "");
    }
}

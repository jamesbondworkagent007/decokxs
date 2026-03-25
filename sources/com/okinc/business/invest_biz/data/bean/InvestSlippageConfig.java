package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSlippageConfig implements Parcelable {
    public static final int $stable = 0;
    private final String automaticSlippage;
    private final String customMax;
    private final String customMin;
    private final String customSafe;
    private final String customWarn;
    private final String stableMax;
    private final String stableMiddle;
    private final String stableMin;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestSlippageConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSlippageConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSlippageConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestSlippageConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSlippageConfig[] newArray(int i) {
            return new InvestSlippageConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSlippageConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.customMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.customMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.customSafe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.customWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stableMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.stableMiddle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.stableMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.automaticSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSlippageConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InvestSlippageConfig(str, str2, str3, str4, str5, str6, str7, i, str8);
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
        if (!(obj instanceof InvestSlippageConfig)) {
            return false;
        }
        InvestSlippageConfig investSlippageConfig = (InvestSlippageConfig) obj;
        return Intrinsics.EZpvd((Object) this.customMax, (Object) investSlippageConfig.customMax) && Intrinsics.EZpvd((Object) this.customMin, (Object) investSlippageConfig.customMin) && Intrinsics.EZpvd((Object) this.customSafe, (Object) investSlippageConfig.customSafe) && Intrinsics.EZpvd((Object) this.customWarn, (Object) investSlippageConfig.customWarn) && Intrinsics.EZpvd((Object) this.stableMax, (Object) investSlippageConfig.stableMax) && Intrinsics.EZpvd((Object) this.stableMiddle, (Object) investSlippageConfig.stableMiddle) && Intrinsics.EZpvd((Object) this.stableMin, (Object) investSlippageConfig.stableMin) && this.type == investSlippageConfig.type && Intrinsics.EZpvd((Object) this.automaticSlippage, (Object) investSlippageConfig.automaticSlippage);
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
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.customMax.hashCode();
        int iHashCode2 = this.customMin.hashCode();
        int iHashCode3 = this.customSafe.hashCode();
        int iHashCode4 = this.customWarn.hashCode();
        int iHashCode5 = this.stableMax.hashCode();
        int iHashCode6 = this.stableMiddle.hashCode();
        int iHashCode7 = this.stableMin.hashCode();
        int iHashCode8 = Integer.hashCode(this.type);
        String str = this.automaticSlippage;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSlippageConfig(customMax=" + this.customMax + ", customMin=" + this.customMin + ", customSafe=" + this.customSafe + ", customWarn=" + this.customWarn + ", stableMax=" + this.stableMax + ", stableMiddle=" + this.stableMiddle + ", stableMin=" + this.stableMin + ", type=" + this.type + ", automaticSlippage=" + this.automaticSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.customMax);
        parcel.writeString(this.customMin);
        parcel.writeString(this.customSafe);
        parcel.writeString(this.customWarn);
        parcel.writeString(this.stableMax);
        parcel.writeString(this.stableMiddle);
        parcel.writeString(this.stableMin);
        parcel.writeInt(this.type);
        parcel.writeString(this.automaticSlippage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestSlippageConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSlippageConfig> serializer() {
            return InvestSlippageConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSlippageConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        this.customMax = (i & 1) == 0 ? SlippageConfigVo.MAX_SLIP : str;
        if ((i & 2) == 0) {
            this.customMin = "0";
        } else {
            this.customMin = str2;
        }
        if ((i & 4) == 0) {
            this.customSafe = "0.1";
        } else {
            this.customSafe = str3;
        }
        if ((i & 8) == 0) {
            this.customWarn = "0.001";
        } else {
            this.customWarn = str4;
        }
        if ((i & 16) == 0) {
            this.stableMax = "0.01";
        } else {
            this.stableMax = str5;
        }
        if ((i & 32) == 0) {
            this.stableMiddle = "0.005";
        } else {
            this.stableMiddle = str6;
        }
        if ((i & 64) == 0) {
            this.stableMin = "0.001";
        } else {
            this.stableMin = str7;
        }
        if ((i & 128) == 0) {
            this.type = 1;
        } else {
            this.type = i2;
        }
        if ((i & 256) == 0) {
            this.automaticSlippage = null;
        } else {
            this.automaticSlippage = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSlippageConfig investSlippageConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investSlippageConfig.customMax, (Object) SlippageConfigVo.MAX_SLIP)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investSlippageConfig.customMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investSlippageConfig.customMin, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investSlippageConfig.customMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investSlippageConfig.customSafe, (Object) "0.1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investSlippageConfig.customSafe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investSlippageConfig.customWarn, (Object) "0.001")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investSlippageConfig.customWarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investSlippageConfig.stableMax, (Object) "0.01")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investSlippageConfig.stableMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investSlippageConfig.stableMiddle, (Object) "0.005")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investSlippageConfig.stableMiddle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investSlippageConfig.stableMin, (Object) "0.001")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investSlippageConfig.stableMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investSlippageConfig.type != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, investSlippageConfig.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && investSlippageConfig.automaticSlippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investSlippageConfig.automaticSlippage);
    }

    public InvestSlippageConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.customMax = str;
        this.customMin = str2;
        this.customSafe = str3;
        this.customWarn = str4;
        this.stableMax = str5;
        this.stableMiddle = str6;
        this.stableMin = str7;
        this.type = i;
        this.automaticSlippage = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0.1") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0.001") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0.01") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0.005") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : ("0.001"))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r19v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:473) call: com.okinc.business.invest_biz.data.bean.InvestSlippageConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ InvestSlippageConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SlippageConfigVo.MAX_SLIP : str, (i2 & 2) != 0 ? "0" : str2, (i2 & 4) != 0 ? "0.1" : str3, (i2 & 8) != 0 ? "0.001" : str4, (i2 & 16) != 0 ? "0.01" : str5, (i2 & 32) != 0 ? "0.005" : str6, (i2 & 64) == 0 ? str7 : "0.001", (i2 & 128) != 0 ? 1 : i, (i2 & 256) != 0 ? null : str8);
    }

    public final List<String> getStableList() {
        return yDY.copydefault(this.stableMin, this.stableMiddle, this.stableMax);
    }

    public final String getAutomaticValue() {
        String str = this.automaticSlippage;
        return (str == null || str.length() == 0) ? this.type == 1 ? "0.01" : "0.2" : this.automaticSlippage;
    }
}

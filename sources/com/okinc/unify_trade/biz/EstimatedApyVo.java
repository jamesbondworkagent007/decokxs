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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class EstimatedApyVo implements Parcelable {
    public static final int $stable = 0;
    private final String arbApy;
    private final String interestYearRate;
    private final String minPaybackDays;
    private final String period;
    private final String stakingApy;
    private final String totalApy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EstimatedApyVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EstimatedApyVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedApyVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EstimatedApyVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedApyVo[] newArray(int i) {
            return new EstimatedApyVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstimatedApyVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstimatedApyVo copy$default(EstimatedApyVo estimatedApyVo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimatedApyVo.period;
        }
        if ((i & 2) != 0) {
            str2 = estimatedApyVo.totalApy;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = estimatedApyVo.arbApy;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = estimatedApyVo.stakingApy;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = estimatedApyVo.interestYearRate;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = estimatedApyVo.minPaybackDays;
        }
        return estimatedApyVo.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.interestYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedApyVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new EstimatedApyVo(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof EstimatedApyVo)) {
            return false;
        }
        EstimatedApyVo estimatedApyVo = (EstimatedApyVo) obj;
        return Intrinsics.EZpvd((Object) this.period, (Object) estimatedApyVo.period) && Intrinsics.EZpvd((Object) this.totalApy, (Object) estimatedApyVo.totalApy) && Intrinsics.EZpvd((Object) this.arbApy, (Object) estimatedApyVo.arbApy) && Intrinsics.EZpvd((Object) this.stakingApy, (Object) estimatedApyVo.stakingApy) && Intrinsics.EZpvd((Object) this.interestYearRate, (Object) estimatedApyVo.interestYearRate) && Intrinsics.EZpvd((Object) this.minPaybackDays, (Object) estimatedApyVo.minPaybackDays);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbApy() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestYearRate() {
        return this.interestYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPaybackDays() {
        return this.minPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingApy() {
        return this.stakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalApy() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.period.hashCode() * 31) + this.totalApy.hashCode()) * 31) + this.arbApy.hashCode()) * 31) + this.stakingApy.hashCode()) * 31) + this.interestYearRate.hashCode()) * 31) + this.minPaybackDays.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstimatedApyVo(period=" + this.period + ", totalApy=" + this.totalApy + ", arbApy=" + this.arbApy + ", stakingApy=" + this.stakingApy + ", interestYearRate=" + this.interestYearRate + ", minPaybackDays=" + this.minPaybackDays + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.period);
        parcel.writeString(this.totalApy);
        parcel.writeString(this.arbApy);
        parcel.writeString(this.stakingApy);
        parcel.writeString(this.interestYearRate);
        parcel.writeString(this.minPaybackDays);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EstimatedApyVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstimatedApyVo> serializer() {
            return EstimatedApyVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstimatedApyVo(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.period = "";
        } else {
            this.period = str;
        }
        if ((i & 2) == 0) {
            this.totalApy = "";
        } else {
            this.totalApy = str2;
        }
        if ((i & 4) == 0) {
            this.arbApy = "";
        } else {
            this.arbApy = str3;
        }
        if ((i & 8) == 0) {
            this.stakingApy = "";
        } else {
            this.stakingApy = str4;
        }
        if ((i & 16) == 0) {
            this.interestYearRate = "";
        } else {
            this.interestYearRate = str5;
        }
        if ((i & 32) == 0) {
            this.minPaybackDays = "";
        } else {
            this.minPaybackDays = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EstimatedApyVo estimatedApyVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estimatedApyVo.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estimatedApyVo.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) estimatedApyVo.totalApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, estimatedApyVo.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) estimatedApyVo.arbApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, estimatedApyVo.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) estimatedApyVo.stakingApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, estimatedApyVo.stakingApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) estimatedApyVo.interestYearRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, estimatedApyVo.interestYearRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) estimatedApyVo.minPaybackDays, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, estimatedApyVo.minPaybackDays);
    }

    public EstimatedApyVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.period = str;
        this.totalApy = str2;
        this.arbApy = str3;
        this.stakingApy = str4;
        this.interestYearRate = str5;
        this.minPaybackDays = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1565) call: com.okinc.unify_trade.biz.EstimatedApyVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EstimatedApyVo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}

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
public final class DailyYieldVo implements Parcelable {
    public static final int $stable = 0;
    private final String arbDailyYield;
    private final String debitDailyRate;
    private final String minPaybackDays;
    private final String stakingDailyYield;
    private final String totalDailyYield;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DailyYieldVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DailyYieldVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DailyYieldVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DailyYieldVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DailyYieldVo[] newArray(int i) {
            return new DailyYieldVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DailyYieldVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DailyYieldVo copy$default(DailyYieldVo dailyYieldVo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyYieldVo.totalDailyYield;
        }
        if ((i & 2) != 0) {
            str2 = dailyYieldVo.arbDailyYield;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dailyYieldVo.stakingDailyYield;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dailyYieldVo.debitDailyRate;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dailyYieldVo.minPaybackDays;
        }
        return dailyYieldVo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.arbDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stakingDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.debitDailyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DailyYieldVo copy(String str, String str2, String str3, String str4, String str5) {
        return new DailyYieldVo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof DailyYieldVo)) {
            return false;
        }
        DailyYieldVo dailyYieldVo = (DailyYieldVo) obj;
        return Intrinsics.EZpvd((Object) this.totalDailyYield, (Object) dailyYieldVo.totalDailyYield) && Intrinsics.EZpvd((Object) this.arbDailyYield, (Object) dailyYieldVo.arbDailyYield) && Intrinsics.EZpvd((Object) this.stakingDailyYield, (Object) dailyYieldVo.stakingDailyYield) && Intrinsics.EZpvd((Object) this.debitDailyRate, (Object) dailyYieldVo.debitDailyRate) && Intrinsics.EZpvd((Object) this.minPaybackDays, (Object) dailyYieldVo.minPaybackDays);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbDailyYield() {
        return this.arbDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebitDailyRate() {
        return this.debitDailyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPaybackDays() {
        return this.minPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingDailyYield() {
        return this.stakingDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDailyYield() {
        return this.totalDailyYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalDailyYield;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.arbDailyYield;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stakingDailyYield;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.debitDailyRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.minPaybackDays;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DailyYieldVo(totalDailyYield=" + this.totalDailyYield + ", arbDailyYield=" + this.arbDailyYield + ", stakingDailyYield=" + this.stakingDailyYield + ", debitDailyRate=" + this.debitDailyRate + ", minPaybackDays=" + this.minPaybackDays + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalDailyYield);
        parcel.writeString(this.arbDailyYield);
        parcel.writeString(this.stakingDailyYield);
        parcel.writeString(this.debitDailyRate);
        parcel.writeString(this.minPaybackDays);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DailyYieldVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DailyYieldVo> serializer() {
            return DailyYieldVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DailyYieldVo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalDailyYield = null;
        } else {
            this.totalDailyYield = str;
        }
        if ((i & 2) == 0) {
            this.arbDailyYield = null;
        } else {
            this.arbDailyYield = str2;
        }
        if ((i & 4) == 0) {
            this.stakingDailyYield = null;
        } else {
            this.stakingDailyYield = str3;
        }
        if ((i & 8) == 0) {
            this.debitDailyRate = null;
        } else {
            this.debitDailyRate = str4;
        }
        if ((i & 16) == 0) {
            this.minPaybackDays = null;
        } else {
            this.minPaybackDays = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DailyYieldVo dailyYieldVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dailyYieldVo.totalDailyYield != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dailyYieldVo.totalDailyYield);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dailyYieldVo.arbDailyYield != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dailyYieldVo.arbDailyYield);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dailyYieldVo.stakingDailyYield != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dailyYieldVo.stakingDailyYield);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dailyYieldVo.debitDailyRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dailyYieldVo.debitDailyRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dailyYieldVo.minPaybackDays == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dailyYieldVo.minPaybackDays);
    }

    public DailyYieldVo(String str, String str2, String str3, String str4, String str5) {
        this.totalDailyYield = str;
        this.arbDailyYield = str2;
        this.stakingDailyYield = str3;
        this.debitDailyRate = str4;
        this.minPaybackDays = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4536) call: com.okinc.unify_trade.biz.DailyYieldVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DailyYieldVo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

package com.okinc.business.finance_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AverageRate implements Parcelable {
    private Double avgRate;
    private Long end;
    private Long start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AverageRate> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AverageRate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AverageRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AverageRate(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AverageRate[] newArray(int i) {
            return new AverageRate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AverageRate() {
        this((Double) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AverageRate copy$default(AverageRate averageRate, Double d, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = averageRate.avgRate;
        }
        if ((i & 2) != 0) {
            l = averageRate.end;
        }
        if ((i & 4) != 0) {
            l2 = averageRate.start;
        }
        return averageRate.copy(d, l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component1() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AverageRate copy(Double d, Long l, Long l2) {
        return new AverageRate(d, l, l2);
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
        if (!(obj instanceof AverageRate)) {
            return false;
        }
        AverageRate averageRate = (AverageRate) obj;
        return Intrinsics.EZpvd(this.avgRate, averageRate.avgRate) && Intrinsics.EZpvd(this.end, averageRate.end) && Intrinsics.EZpvd(this.start, averageRate.start);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getAvgRate() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Double d = this.avgRate;
        int iHashCode = d == null ? 0 : d.hashCode();
        Long l = this.end;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.start;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgRate(Double d) {
        this.avgRate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(Long l) {
        this.end = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(Long l) {
        this.start = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AverageRate(avgRate=" + this.avgRate + ", end=" + this.end + ", start=" + this.start + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Double d = this.avgRate;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Long l = this.end;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.start;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.AverageRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AverageRate> serializer() {
            return AverageRate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AverageRate(int i, Double d, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        this.avgRate = (i & 1) == 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d;
        if ((i & 2) == 0) {
            this.end = 0L;
        } else {
            this.end = l;
        }
        if ((i & 4) == 0) {
            this.start = 0L;
        } else {
            this.start = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(AverageRate averageRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(averageRate.avgRate, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DoubleSerializer.INSTANCE, averageRate.avgRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l2 = averageRate.end) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, averageRate.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (l = averageRate.start) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, averageRate.start);
        }
    }

    public AverageRate(Double d, Long l, Long l2) {
        this.avgRate = d;
        this.end = l;
        this.start = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Double:0x0006: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:32)) : (r3v0 java.lang.Double))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r4v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Double, java.lang.Long, java.lang.Long):void (m)] (LINE:31) call: com.okinc.business.finance_api.bean.AverageRate.<init>(java.lang.Double, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ AverageRate(Double d, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? 0L : l2);
    }
}

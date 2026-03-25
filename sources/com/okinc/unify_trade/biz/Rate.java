package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Rate implements Parcelable {
    private Long dataDate;
    private Long end;
    private Double rate;
    private String rateType;
    private Long start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Rate> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Rate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Rate(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rate[] newArray(int i) {
            return new Rate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rate() {
        this((Long) null, (Long) null, (Double) null, (Long) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Rate copy$default(Rate rate, Long l, Long l2, Double d, Long l3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = rate.dataDate;
        }
        if ((i & 2) != 0) {
            l2 = rate.end;
        }
        Long l4 = l2;
        if ((i & 4) != 0) {
            d = rate.rate;
        }
        Double d2 = d;
        if ((i & 8) != 0) {
            l3 = rate.start;
        }
        Long l5 = l3;
        if ((i & 16) != 0) {
            str = rate.rateType;
        }
        return rate.copy(l, l4, d2, l5, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.dataDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component3() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rate copy(Long l, Long l2, Double d, Long l3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Rate(l, l2, d, l3, str);
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
        if (!(obj instanceof Rate)) {
            return false;
        }
        Rate rate = (Rate) obj;
        return Intrinsics.EZpvd(this.dataDate, rate.dataDate) && Intrinsics.EZpvd(this.end, rate.end) && Intrinsics.EZpvd(this.rate, rate.rate) && Intrinsics.EZpvd(this.start, rate.start) && Intrinsics.EZpvd((Object) this.rateType, (Object) rate.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDataDate() {
        return this.dataDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.dataDate;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.end;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Double d = this.rate;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        Long l3 = this.start;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataDate(Long l) {
        this.dataDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(Long l) {
        this.end = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(Double d) {
        this.rate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(Long l) {
        this.start = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Rate(dataDate=" + this.dataDate + ", end=" + this.end + ", rate=" + this.rate + ", start=" + this.start + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.dataDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.end;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Double d = this.rate;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Long l3 = this.start;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.rateType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.Rate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Rate> serializer() {
            return Rate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Rate(int i, Long l, Long l2, Double d, Long l3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.dataDate = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.end = 0L;
        } else {
            this.end = l2;
        }
        if ((i & 4) == 0) {
            this.rate = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            this.rate = d;
        }
        if ((i & 8) == 0) {
            this.start = 0L;
        } else {
            this.start = l3;
        }
        if ((i & 16) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(Rate rate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        Long l3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l3 = rate.dataDate) == null || l3.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, rate.dataDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l2 = rate.end) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, rate.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(rate.rate, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.INSTANCE, rate.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (l = rate.start) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, rate.start);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) rate.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, rate.rateType);
    }

    public Rate(Long l, Long l2, Double d, Long l3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataDate = l;
        this.end = l2;
        this.rate = d;
        this.start = l3;
        this.rateType = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Rate(Long l, Long l2, Double d, Long l3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l : l, (i & 2) != 0 ? l : l2, (i & 4) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d, (i & 8) == 0 ? l3 : 0L, (i & 16) != 0 ? "" : str);
    }
}

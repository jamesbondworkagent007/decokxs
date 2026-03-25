package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InputDateRangeValue implements Parcelable {
    private Long end;
    private Long start;
    private boolean toPresent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDateRangeValue> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InputDateRangeValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeValue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InputDateRangeValue(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeValue[] newArray(int i) {
            return new InputDateRangeValue[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputDateRangeValue() {
        this((Long) null, (Long) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputDateRangeValue copy$default(InputDateRangeValue inputDateRangeValue, Long l, Long l2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = inputDateRangeValue.start;
        }
        if ((i & 2) != 0) {
            l2 = inputDateRangeValue.end;
        }
        if ((i & 4) != 0) {
            z = inputDateRangeValue.toPresent;
        }
        return inputDateRangeValue.copy(l, l2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeValue copy(Long l, Long l2, boolean z) {
        return new InputDateRangeValue(l, l2, z);
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
        if (!(obj instanceof InputDateRangeValue)) {
            return false;
        }
        InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) obj;
        return Intrinsics.EZpvd(this.start, inputDateRangeValue.start) && Intrinsics.EZpvd(this.end, inputDateRangeValue.end) && this.toPresent == inputDateRangeValue.toPresent;
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
    public final boolean getToPresent() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.start;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.end;
        return (((iHashCode * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + Boolean.hashCode(this.toPresent);
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
    public final void setToPresent(boolean z) {
        this.toPresent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDateRangeValue(start=" + this.start + ", end=" + this.end + ", toPresent=" + this.toPresent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.start;
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
        parcel.writeInt(this.toPresent ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDateRangeValue> serializer() {
            return InputDateRangeValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InputDateRangeValue(int i, Long l, Long l2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.start = null;
        } else {
            this.start = l;
        }
        if ((i & 2) == 0) {
            this.end = null;
        } else {
            this.end = l2;
        }
        if ((i & 4) == 0) {
            this.toPresent = false;
        } else {
            this.toPresent = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDateRangeValue inputDateRangeValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inputDateRangeValue.start != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, inputDateRangeValue.start);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputDateRangeValue.end != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, inputDateRangeValue.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputDateRangeValue.toPresent) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, inputDateRangeValue.toPresent);
        }
    }

    public InputDateRangeValue(Long l, Long l2, boolean z) {
        this.start = l;
        this.end = l2;
        this.toPresent = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.Long, java.lang.Long, boolean):void (m)] (LINE:3459) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue.<init>(java.lang.Long, java.lang.Long, boolean):void type: THIS */
    public /* synthetic */ InputDateRangeValue(Long l, Long l2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? false : z);
    }
}

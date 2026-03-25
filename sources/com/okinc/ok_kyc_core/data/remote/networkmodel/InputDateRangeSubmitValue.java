package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InputDateRangeSubmitValue implements Parcelable {
    private String end;
    private boolean isToPresent;
    private String start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDateRangeSubmitValue> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InputDateRangeSubmitValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeSubmitValue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InputDateRangeSubmitValue(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeSubmitValue[] newArray(int i) {
            return new InputDateRangeSubmitValue[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputDateRangeSubmitValue() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputDateRangeSubmitValue copy$default(InputDateRangeSubmitValue inputDateRangeSubmitValue, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputDateRangeSubmitValue.start;
        }
        if ((i & 2) != 0) {
            str2 = inputDateRangeSubmitValue.end;
        }
        if ((i & 4) != 0) {
            z = inputDateRangeSubmitValue.isToPresent;
        }
        return inputDateRangeSubmitValue.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isToPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeSubmitValue copy(String str, String str2, boolean z) {
        return new InputDateRangeSubmitValue(str, str2, z);
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
        if (!(obj instanceof InputDateRangeSubmitValue)) {
            return false;
        }
        InputDateRangeSubmitValue inputDateRangeSubmitValue = (InputDateRangeSubmitValue) obj;
        return Intrinsics.EZpvd((Object) this.start, (Object) inputDateRangeSubmitValue.start) && Intrinsics.EZpvd((Object) this.end, (Object) inputDateRangeSubmitValue.end) && this.isToPresent == inputDateRangeSubmitValue.isToPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.start;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.end;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isToPresent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isToPresent() {
        return this.isToPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(String str) {
        this.end = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(String str) {
        this.start = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToPresent(boolean z) {
        this.isToPresent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDateRangeSubmitValue(start=" + this.start + ", end=" + this.end + ", isToPresent=" + this.isToPresent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.start);
        parcel.writeString(this.end);
        parcel.writeInt(this.isToPresent ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeSubmitValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDateRangeSubmitValue> serializer() {
            return InputDateRangeSubmitValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InputDateRangeSubmitValue(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.start = null;
        } else {
            this.start = str;
        }
        if ((i & 2) == 0) {
            this.end = null;
        } else {
            this.end = str2;
        }
        if ((i & 4) == 0) {
            this.isToPresent = false;
        } else {
            this.isToPresent = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDateRangeSubmitValue inputDateRangeSubmitValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inputDateRangeSubmitValue.start != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputDateRangeSubmitValue.start);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputDateRangeSubmitValue.end != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputDateRangeSubmitValue.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputDateRangeSubmitValue.isToPresent) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, inputDateRangeSubmitValue.isToPresent);
        }
    }

    public InputDateRangeSubmitValue(String str, String str2, boolean z) {
        this.start = str;
        this.end = str2;
        this.isToPresent = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:24) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeSubmitValue.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InputDateRangeSubmitValue(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}

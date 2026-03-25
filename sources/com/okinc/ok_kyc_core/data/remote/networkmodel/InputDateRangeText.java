package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InputDateRangeText implements Parcelable {
    private String end;
    private String start;
    private Boolean toPresent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDateRangeText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputDateRangeText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeText createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputDateRangeText(string, string2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRangeText[] newArray(int i) {
            return new InputDateRangeText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputDateRangeText() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputDateRangeText copy$default(InputDateRangeText inputDateRangeText, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputDateRangeText.start;
        }
        if ((i & 2) != 0) {
            str2 = inputDateRangeText.end;
        }
        if ((i & 4) != 0) {
            bool = inputDateRangeText.toPresent;
        }
        return inputDateRangeText.copy(str, str2, bool);
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
    public final Boolean component3() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText copy(String str, String str2, Boolean bool) {
        return new InputDateRangeText(str, str2, bool);
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
        if (!(obj instanceof InputDateRangeText)) {
            return false;
        }
        InputDateRangeText inputDateRangeText = (InputDateRangeText) obj;
        return Intrinsics.EZpvd((Object) this.start, (Object) inputDateRangeText.start) && Intrinsics.EZpvd((Object) this.end, (Object) inputDateRangeText.end) && Intrinsics.EZpvd(this.toPresent, inputDateRangeText.toPresent);
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
    public final Boolean getToPresent() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.start;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.end;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.toPresent;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
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
    public final void setToPresent(Boolean bool) {
        this.toPresent = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDateRangeText(start=" + this.start + ", end=" + this.end + ", toPresent=" + this.toPresent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.start);
        parcel.writeString(this.end);
        Boolean bool = this.toPresent;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDateRangeText> serializer() {
            return InputDateRangeText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InputDateRangeText(int i, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.toPresent = Boolean.FALSE;
        } else {
            this.toPresent = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDateRangeText inputDateRangeText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inputDateRangeText.start != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputDateRangeText.start);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputDateRangeText.end != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputDateRangeText.end);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(inputDateRangeText.toPresent, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, inputDateRangeText.toPresent);
    }

    public InputDateRangeText(String str, String str2, Boolean bool) {
        this.start = str;
        this.end = str2;
        this.toPresent = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:3450) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText.<init>(java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InputDateRangeText(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}

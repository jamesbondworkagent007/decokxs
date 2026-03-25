package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AddressField implements Parcelable {
    public static final int $stable = 0;
    private final String id;
    private final String message;
    private final boolean prohibited;
    private final String remainAddress;
    private final String streetAddress;
    private final String value;
    private final String valueName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressField> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressField(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressField[] newArray(int i) {
            return new AddressField[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressField copy$default(AddressField addressField, String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressField.id;
        }
        if ((i & 2) != 0) {
            str2 = addressField.value;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = addressField.valueName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            z = addressField.prohibited;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = addressField.message;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = addressField.streetAddress;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = addressField.remainAddress;
        }
        return addressField.copy(str, str7, str8, z2, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.prohibited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.streetAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.remainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressField copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AddressField(str, str2, str3, z, str4, str5, str6);
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
        if (!(obj instanceof AddressField)) {
            return false;
        }
        AddressField addressField = (AddressField) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) addressField.id) && Intrinsics.EZpvd((Object) this.value, (Object) addressField.value) && Intrinsics.EZpvd((Object) this.valueName, (Object) addressField.valueName) && this.prohibited == addressField.prohibited && Intrinsics.EZpvd((Object) this.message, (Object) addressField.message) && Intrinsics.EZpvd((Object) this.streetAddress, (Object) addressField.streetAddress) && Intrinsics.EZpvd((Object) this.remainAddress, (Object) addressField.remainAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getProhibited() {
        return this.prohibited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainAddress() {
        return this.remainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.valueName.hashCode();
        int iHashCode4 = Boolean.hashCode(this.prohibited);
        int iHashCode5 = this.message.hashCode();
        String str = this.streetAddress;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.remainAddress;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressField(id=" + this.id + ", value=" + this.value + ", valueName=" + this.valueName + ", prohibited=" + this.prohibited + ", message=" + this.message + ", streetAddress=" + this.streetAddress + ", remainAddress=" + this.remainAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        parcel.writeString(this.valueName);
        parcel.writeInt(this.prohibited ? 1 : 0);
        parcel.writeString(this.message);
        parcel.writeString(this.streetAddress);
        parcel.writeString(this.remainAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressField> serializer() {
            return AddressField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressField(int i, String str, String str2, String str3, boolean z, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, AddressField$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.value = str2;
        this.valueName = str3;
        this.prohibited = z;
        this.message = str4;
        this.streetAddress = str5;
        this.remainAddress = str6;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressField addressField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressField.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addressField.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, addressField.valueName);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, addressField.prohibited);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, addressField.message);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, addressField.streetAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, addressField.remainAddress);
    }

    public AddressField(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.value = str2;
        this.valueName = str3;
        this.prohibited = z;
        this.message = str4;
        this.streetAddress = str5;
        this.remainAddress = str6;
    }
}

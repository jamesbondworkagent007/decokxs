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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AddressSearchBean implements Parcelable {
    private AutoCompleteAddress autoCompleteAddress;
    private String localSearchString;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressSearchBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressSearchBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressSearchBean(AutoCompleteAddress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchBean[] newArray(int i) {
            return new AddressSearchBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressSearchBean copy$default(AddressSearchBean addressSearchBean, AutoCompleteAddress autoCompleteAddress, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            autoCompleteAddress = addressSearchBean.autoCompleteAddress;
        }
        if ((i & 2) != 0) {
            str = addressSearchBean.localSearchString;
        }
        return addressSearchBean.copy(autoCompleteAddress, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoCompleteAddress component1() {
        return this.autoCompleteAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localSearchString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressSearchBean copy(@NotNull AutoCompleteAddress autoCompleteAddress, @NotNull String str) {
        Intrinsics.checkNotNullParameter(autoCompleteAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressSearchBean(autoCompleteAddress, str);
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
        if (!(obj instanceof AddressSearchBean)) {
            return false;
        }
        AddressSearchBean addressSearchBean = (AddressSearchBean) obj;
        return Intrinsics.EZpvd(this.autoCompleteAddress, addressSearchBean.autoCompleteAddress) && Intrinsics.EZpvd((Object) this.localSearchString, (Object) addressSearchBean.localSearchString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoCompleteAddress getAutoCompleteAddress() {
        return this.autoCompleteAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalSearchString() {
        return this.localSearchString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.autoCompleteAddress.hashCode() * 31) + this.localSearchString.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoCompleteAddress(@NotNull AutoCompleteAddress autoCompleteAddress) {
        Intrinsics.checkNotNullParameter(autoCompleteAddress, "");
        this.autoCompleteAddress = autoCompleteAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalSearchString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localSearchString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressSearchBean(autoCompleteAddress=" + this.autoCompleteAddress + ", localSearchString=" + this.localSearchString + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.autoCompleteAddress.writeToParcel(parcel, i);
        parcel.writeString(this.localSearchString);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressSearchBean> serializer() {
            return AddressSearchBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressSearchBean(int i, AutoCompleteAddress autoCompleteAddress, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AddressSearchBean$$serializer.INSTANCE.getDescriptor());
        }
        this.autoCompleteAddress = autoCompleteAddress;
        if ((i & 2) == 0) {
            this.localSearchString = "";
        } else {
            this.localSearchString = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressSearchBean addressSearchBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AutoCompleteAddress$$serializer.INSTANCE, addressSearchBean.autoCompleteAddress);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) addressSearchBean.localSearchString, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addressSearchBean.localSearchString);
    }

    public AddressSearchBean(@NotNull AutoCompleteAddress autoCompleteAddress, @NotNull String str) {
        Intrinsics.checkNotNullParameter(autoCompleteAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.autoCompleteAddress = autoCompleteAddress;
        this.localSearchString = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress, java.lang.String):void (m)] (LINE:11) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchBean.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress, java.lang.String):void type: THIS */
    public /* synthetic */ AddressSearchBean(AutoCompleteAddress autoCompleteAddress, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoCompleteAddress, (i & 2) != 0 ? "" : str);
    }
}

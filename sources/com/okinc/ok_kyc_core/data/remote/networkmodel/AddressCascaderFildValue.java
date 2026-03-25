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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AddressCascaderFildValue implements Parcelable {
    private final AddressCascaderValue city;
    private final AddressCascaderValue district;
    private AddressCascaderValue province;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCascaderFildValue> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressCascaderFildValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCascaderFildValue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCascaderFildValue(parcel.readInt() == 0 ? null : AddressCascaderValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AddressCascaderValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AddressCascaderValue.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCascaderFildValue[] newArray(int i) {
            return new AddressCascaderFildValue[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCascaderFildValue() {
        this((AddressCascaderValue) null, (AddressCascaderValue) null, (AddressCascaderValue) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressCascaderFildValue copy$default(AddressCascaderFildValue addressCascaderFildValue, AddressCascaderValue addressCascaderValue, AddressCascaderValue addressCascaderValue2, AddressCascaderValue addressCascaderValue3, int i, Object obj) {
        if ((i & 1) != 0) {
            addressCascaderValue = addressCascaderFildValue.province;
        }
        if ((i & 2) != 0) {
            addressCascaderValue2 = addressCascaderFildValue.city;
        }
        if ((i & 4) != 0) {
            addressCascaderValue3 = addressCascaderFildValue.district;
        }
        return addressCascaderFildValue.copy(addressCascaderValue, addressCascaderValue2, addressCascaderValue3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue component1() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue component2() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue component3() {
        return this.district;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderFildValue copy(AddressCascaderValue addressCascaderValue, AddressCascaderValue addressCascaderValue2, AddressCascaderValue addressCascaderValue3) {
        return new AddressCascaderFildValue(addressCascaderValue, addressCascaderValue2, addressCascaderValue3);
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
        if (!(obj instanceof AddressCascaderFildValue)) {
            return false;
        }
        AddressCascaderFildValue addressCascaderFildValue = (AddressCascaderFildValue) obj;
        return Intrinsics.EZpvd(this.province, addressCascaderFildValue.province) && Intrinsics.EZpvd(this.city, addressCascaderFildValue.city) && Intrinsics.EZpvd(this.district, addressCascaderFildValue.district);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue getCity() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue getDistrict() {
        return this.district;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderValue getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AddressCascaderValue addressCascaderValue = this.province;
        int iHashCode = addressCascaderValue == null ? 0 : addressCascaderValue.hashCode();
        AddressCascaderValue addressCascaderValue2 = this.city;
        int iHashCode2 = addressCascaderValue2 == null ? 0 : addressCascaderValue2.hashCode();
        AddressCascaderValue addressCascaderValue3 = this.district;
        return (((iHashCode * 31) + iHashCode2) * 31) + (addressCascaderValue3 != null ? addressCascaderValue3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProvince(AddressCascaderValue addressCascaderValue) {
        this.province = addressCascaderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCascaderFildValue(province=" + this.province + ", city=" + this.city + ", district=" + this.district + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AddressCascaderValue addressCascaderValue = this.province;
        if (addressCascaderValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCascaderValue.writeToParcel(parcel, i);
        }
        AddressCascaderValue addressCascaderValue2 = this.city;
        if (addressCascaderValue2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCascaderValue2.writeToParcel(parcel, i);
        }
        AddressCascaderValue addressCascaderValue3 = this.district;
        if (addressCascaderValue3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCascaderValue3.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCascaderFildValue> serializer() {
            return AddressCascaderFildValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCascaderFildValue(int i, AddressCascaderValue addressCascaderValue, AddressCascaderValue addressCascaderValue2, AddressCascaderValue addressCascaderValue3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.province = null;
        } else {
            this.province = addressCascaderValue;
        }
        if ((i & 2) == 0) {
            this.city = null;
        } else {
            this.city = addressCascaderValue2;
        }
        if ((i & 4) == 0) {
            this.district = null;
        } else {
            this.district = addressCascaderValue3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressCascaderFildValue addressCascaderFildValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressCascaderFildValue.province != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AddressCascaderValue$$serializer.INSTANCE, addressCascaderFildValue.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressCascaderFildValue.city != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, AddressCascaderValue$$serializer.INSTANCE, addressCascaderFildValue.city);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && addressCascaderFildValue.district == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, AddressCascaderValue$$serializer.INSTANCE, addressCascaderFildValue.district);
    }

    public AddressCascaderFildValue(AddressCascaderValue addressCascaderValue, AddressCascaderValue addressCascaderValue2, AddressCascaderValue addressCascaderValue3) {
        this.province = addressCascaderValue;
        this.city = addressCascaderValue2;
        this.district = addressCascaderValue3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue) : (r4v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue):void (m)] (LINE:3825) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue):void type: THIS */
    public /* synthetic */ AddressCascaderFildValue(AddressCascaderValue addressCascaderValue, AddressCascaderValue addressCascaderValue2, AddressCascaderValue addressCascaderValue3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addressCascaderValue, (i & 2) != 0 ? null : addressCascaderValue2, (i & 4) != 0 ? null : addressCascaderValue3);
    }
}

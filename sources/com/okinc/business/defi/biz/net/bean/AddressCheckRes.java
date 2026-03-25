package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AddressCheckRes implements Parcelable {
    public String address;
    public long chainId;
    public boolean checkStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCheckRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressCheckRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCheckRes(parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckRes[] newArray(int i) {
            return new AddressCheckRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressCheckRes copy$default(AddressCheckRes addressCheckRes, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressCheckRes.address;
        }
        if ((i & 2) != 0) {
            j = addressCheckRes.chainId;
        }
        if ((i & 4) != 0) {
            z = addressCheckRes.checkStatus;
        }
        return addressCheckRes.EZpvd(str, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCheckRes EZpvd(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressCheckRes(str, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.checkStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.chainId;
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
        if (!(obj instanceof AddressCheckRes)) {
            return false;
        }
        AddressCheckRes addressCheckRes = (AddressCheckRes) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressCheckRes.address) && this.chainId == addressCheckRes.chainId && this.checkStatus == addressCheckRes.checkStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.address.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + Boolean.hashCode(this.checkStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCheckRes(address=" + this.address + ", chainId=" + this.chainId + ", checkStatus=" + this.checkStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.checkStatus ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCheckRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCheckRes> serializer() {
            return AddressCheckRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCheckRes(int i, String str, long j, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, AddressCheckRes$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        this.chainId = j;
        this.checkStatus = z;
    }

    public static final /* synthetic */ void EZpvd(AddressCheckRes addressCheckRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressCheckRes.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressCheckRes.address);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 1, addressCheckRes.chainId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, addressCheckRes.checkStatus);
    }

    public AddressCheckRes(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.chainId = j;
        this.checkStatus = z;
    }
}

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressTxInformationRequest implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final long chainId;
    private final int orderType;
    private final String txHash;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressTxInformationRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressTxInformationRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTxInformationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressTxInformationRequest(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTxInformationRequest[] newArray(int i) {
            return new AddressTxInformationRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressTxInformationRequest copy$default(AddressTxInformationRequest addressTxInformationRequest, String str, long j, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addressTxInformationRequest.address;
        }
        if ((i2 & 2) != 0) {
            j = addressTxInformationRequest.chainId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = addressTxInformationRequest.orderType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = addressTxInformationRequest.txHash;
        }
        return addressTxInformationRequest.copy(str, j2, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressTxInformationRequest copy(@NotNull String str, long j, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressTxInformationRequest(str, j, i, str2);
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
        if (!(obj instanceof AddressTxInformationRequest)) {
            return false;
        }
        AddressTxInformationRequest addressTxInformationRequest = (AddressTxInformationRequest) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressTxInformationRequest.address) && this.chainId == addressTxInformationRequest.chainId && this.orderType == addressTxInformationRequest.orderType && Intrinsics.EZpvd((Object) this.txHash, (Object) addressTxInformationRequest.txHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + Integer.hashCode(this.orderType)) * 31) + this.txHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressTxInformationRequest(address=" + this.address + ", chainId=" + this.chainId + ", orderType=" + this.orderType + ", txHash=" + this.txHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.orderType);
        parcel.writeString(this.txHash);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressTxInformationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressTxInformationRequest> serializer() {
            return AddressTxInformationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressTxInformationRequest(int i, String str, long j, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, AddressTxInformationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.chainId = j;
        this.orderType = i2;
        this.txHash = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressTxInformationRequest addressTxInformationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressTxInformationRequest.address);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, addressTxInformationRequest.chainId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, addressTxInformationRequest.orderType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, addressTxInformationRequest.txHash);
    }

    public AddressTxInformationRequest(@NotNull String str, long j, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.chainId = j;
        this.orderType = i;
        this.txHash = str2;
    }
}

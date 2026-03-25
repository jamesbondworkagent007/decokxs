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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CheckAaAddressRequest implements Parcelable {
    public static final int $stable = 0;
    private final long chainId;
    private final String eoaAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckAaAddressRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckAaAddressRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckAaAddressRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckAaAddressRequest(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckAaAddressRequest[] newArray(int i) {
            return new CheckAaAddressRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckAaAddressRequest copy$default(CheckAaAddressRequest checkAaAddressRequest, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkAaAddressRequest.eoaAddress;
        }
        if ((i & 2) != 0) {
            j = checkAaAddressRequest.chainId;
        }
        return checkAaAddressRequest.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckAaAddressRequest copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckAaAddressRequest(str, j);
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
        if (!(obj instanceof CheckAaAddressRequest)) {
            return false;
        }
        CheckAaAddressRequest checkAaAddressRequest = (CheckAaAddressRequest) obj;
        return Intrinsics.EZpvd((Object) this.eoaAddress, (Object) checkAaAddressRequest.eoaAddress) && this.chainId == checkAaAddressRequest.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.eoaAddress.hashCode() * 31) + Long.hashCode(this.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckAaAddressRequest(eoaAddress=" + this.eoaAddress + ", chainId=" + this.chainId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.eoaAddress);
        parcel.writeLong(this.chainId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckAaAddressRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckAaAddressRequest> serializer() {
            return CheckAaAddressRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckAaAddressRequest(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CheckAaAddressRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.eoaAddress = str;
        this.chainId = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckAaAddressRequest checkAaAddressRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkAaAddressRequest.eoaAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, checkAaAddressRequest.chainId);
    }

    public CheckAaAddressRequest(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eoaAddress = str;
        this.chainId = j;
    }
}

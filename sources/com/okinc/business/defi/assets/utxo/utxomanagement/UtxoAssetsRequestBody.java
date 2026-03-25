package com.okinc.business.defi.assets.utxo.utxomanagement;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoAssetsRequestBody implements Parcelable {
    public static final int $stable = 0;
    public final String address;
    public final long chainId;
    public final String txnHash;
    public final int txnStatus;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoAssetsRequestBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoAssetsRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetsRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoAssetsRequestBody(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetsRequestBody[] newArray(int i) {
            return new UtxoAssetsRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoAssetsRequestBody copy$default(UtxoAssetsRequestBody utxoAssetsRequestBody, String str, int i, long j, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = utxoAssetsRequestBody.txnHash;
        }
        if ((i3 & 2) != 0) {
            i = utxoAssetsRequestBody.vout;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            j = utxoAssetsRequestBody.chainId;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i2 = utxoAssetsRequestBody.txnStatus;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = utxoAssetsRequestBody.address;
        }
        return utxoAssetsRequestBody.OLrzqt(str, i4, j2, i5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoAssetsRequestBody OLrzqt(@NotNull String str, int i, long j, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UtxoAssetsRequestBody(str, i, j, i2, str2);
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
        if (!(obj instanceof UtxoAssetsRequestBody)) {
            return false;
        }
        UtxoAssetsRequestBody utxoAssetsRequestBody = (UtxoAssetsRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.txnHash, (Object) utxoAssetsRequestBody.txnHash) && this.vout == utxoAssetsRequestBody.vout && this.chainId == utxoAssetsRequestBody.chainId && this.txnStatus == utxoAssetsRequestBody.txnStatus && Intrinsics.EZpvd((Object) this.address, (Object) utxoAssetsRequestBody.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.txnHash.hashCode() * 31) + Integer.hashCode(this.vout)) * 31) + Long.hashCode(this.chainId)) * 31) + Integer.hashCode(this.txnStatus)) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoAssetsRequestBody(txnHash=" + this.txnHash + ", vout=" + this.vout + ", chainId=" + this.chainId + ", txnStatus=" + this.txnStatus + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txnHash);
        parcel.writeInt(this.vout);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.txnStatus);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetsRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoAssetsRequestBody> serializer() {
            return UtxoAssetsRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoAssetsRequestBody(int i, String str, int i2, long j, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, UtxoAssetsRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.txnHash = str;
        this.vout = i2;
        this.chainId = j;
        this.txnStatus = i3;
        this.address = str2;
    }

    public static final /* synthetic */ void OLrzqt(UtxoAssetsRequestBody utxoAssetsRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoAssetsRequestBody.txnHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, utxoAssetsRequestBody.vout);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, utxoAssetsRequestBody.chainId);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, utxoAssetsRequestBody.txnStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, utxoAssetsRequestBody.address);
    }

    public UtxoAssetsRequestBody(@NotNull String str, int i, long j, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txnHash = str;
        this.vout = i;
        this.chainId = j;
        this.txnStatus = i2;
        this.address = str2;
    }
}

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
public final class UtxoItemIdentity implements Parcelable {
    public static final int $stable = 0;
    public final String txnHash;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoItemIdentity> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoItemIdentity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoItemIdentity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoItemIdentity(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoItemIdentity[] newArray(int i) {
            return new UtxoItemIdentity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoItemIdentity copy$default(UtxoItemIdentity utxoItemIdentity, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = utxoItemIdentity.txnHash;
        }
        if ((i2 & 2) != 0) {
            i = utxoItemIdentity.vout;
        }
        return utxoItemIdentity.EZpvd(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoItemIdentity EZpvd(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoItemIdentity(str, i);
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
        if (!(obj instanceof UtxoItemIdentity)) {
            return false;
        }
        UtxoItemIdentity utxoItemIdentity = (UtxoItemIdentity) obj;
        return Intrinsics.EZpvd((Object) this.txnHash, (Object) utxoItemIdentity.txnHash) && this.vout == utxoItemIdentity.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.txnHash.hashCode() * 31) + Integer.hashCode(this.vout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoItemIdentity(txnHash=" + this.txnHash + ", vout=" + this.vout + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txnHash);
        parcel.writeInt(this.vout);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItemIdentity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoItemIdentity> serializer() {
            return UtxoItemIdentity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoItemIdentity(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UtxoItemIdentity$$serializer.INSTANCE.getDescriptor());
        }
        this.txnHash = str;
        this.vout = i2;
    }

    public static final /* synthetic */ void copydefault(UtxoItemIdentity utxoItemIdentity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoItemIdentity.txnHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, utxoItemIdentity.vout);
    }

    public UtxoItemIdentity(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txnHash = str;
        this.vout = i;
    }
}

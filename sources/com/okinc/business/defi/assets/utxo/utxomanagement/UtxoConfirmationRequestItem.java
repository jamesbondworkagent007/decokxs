package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoConfirmationRequestItem implements Parcelable {
    public static final int $stable = 0;
    public final Long coinAmount;
    public final String nftId;
    public final Integer status;
    public final String txHash;
    public final boolean unlockUtxo;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoConfirmationRequestItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoConfirmationRequestItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationRequestItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoConfirmationRequestItem(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationRequestItem[] newArray(int i) {
            return new UtxoConfirmationRequestItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoConfirmationRequestItem copy$default(UtxoConfirmationRequestItem utxoConfirmationRequestItem, String str, int i, Integer num, boolean z, Long l, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = utxoConfirmationRequestItem.txHash;
        }
        if ((i2 & 2) != 0) {
            i = utxoConfirmationRequestItem.vout;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = utxoConfirmationRequestItem.status;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            z = utxoConfirmationRequestItem.unlockUtxo;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            l = utxoConfirmationRequestItem.coinAmount;
        }
        Long l2 = l;
        if ((i2 & 32) != 0) {
            str2 = utxoConfirmationRequestItem.nftId;
        }
        return utxoConfirmationRequestItem.copydefault(str, i3, num2, z2, l2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationRequestItem copydefault(@NotNull String str, int i, Integer num, boolean z, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoConfirmationRequestItem(str, i, num, z, l, str2);
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
        if (!(obj instanceof UtxoConfirmationRequestItem)) {
            return false;
        }
        UtxoConfirmationRequestItem utxoConfirmationRequestItem = (UtxoConfirmationRequestItem) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) utxoConfirmationRequestItem.txHash) && this.vout == utxoConfirmationRequestItem.vout && Intrinsics.EZpvd(this.status, utxoConfirmationRequestItem.status) && this.unlockUtxo == utxoConfirmationRequestItem.unlockUtxo && Intrinsics.EZpvd(this.coinAmount, utxoConfirmationRequestItem.coinAmount) && Intrinsics.EZpvd((Object) this.nftId, (Object) utxoConfirmationRequestItem.nftId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txHash.hashCode();
        int iHashCode2 = Integer.hashCode(this.vout);
        Integer num = this.status;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = Boolean.hashCode(this.unlockUtxo);
        Long l = this.coinAmount;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str = this.nftId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoConfirmationRequestItem(txHash=" + this.txHash + ", vout=" + this.vout + ", status=" + this.status + ", unlockUtxo=" + this.unlockUtxo + ", coinAmount=" + this.coinAmount + ", nftId=" + this.nftId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeInt(this.vout);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.unlockUtxo ? 1 : 0);
        Long l = this.coinAmount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nftId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequestItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoConfirmationRequestItem> serializer() {
            return UtxoConfirmationRequestItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoConfirmationRequestItem(int i, String str, int i2, Integer num, boolean z, Long l, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, UtxoConfirmationRequestItem$$serializer.INSTANCE.getDescriptor());
        }
        this.txHash = str;
        this.vout = i2;
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        this.unlockUtxo = z;
        if ((i & 16) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = l;
        }
        if ((i & 32) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str2;
        }
    }

    public static final /* synthetic */ void EZpvd(UtxoConfirmationRequestItem utxoConfirmationRequestItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoConfirmationRequestItem.txHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, utxoConfirmationRequestItem.vout);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoConfirmationRequestItem.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, utxoConfirmationRequestItem.status);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, utxoConfirmationRequestItem.unlockUtxo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || utxoConfirmationRequestItem.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, utxoConfirmationRequestItem.coinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && utxoConfirmationRequestItem.nftId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, utxoConfirmationRequestItem.nftId);
    }

    public UtxoConfirmationRequestItem(@NotNull String str, int i, Integer num, boolean z, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
        this.vout = i;
        this.status = num;
        this.unlockUtxo = z;
        this.coinAmount = l;
        this.nftId = str2;
    }
}

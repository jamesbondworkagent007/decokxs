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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoRequestItem implements Parcelable {
    public static final int $stable = 0;
    public final String address;
    public final Integer from;
    public final Integer size;
    public final Integer type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoRequestItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoRequestItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoRequestItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoRequestItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoRequestItem[] newArray(int i) {
            return new UtxoRequestItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoRequestItem copy$default(UtxoRequestItem utxoRequestItem, String str, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utxoRequestItem.address;
        }
        if ((i & 2) != 0) {
            num = utxoRequestItem.from;
        }
        if ((i & 4) != 0) {
            num2 = utxoRequestItem.size;
        }
        if ((i & 8) != 0) {
            num3 = utxoRequestItem.type;
        }
        return utxoRequestItem.EZpvd(str, num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoRequestItem EZpvd(@NotNull String str, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoRequestItem(str, num, num2, num3);
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
        if (!(obj instanceof UtxoRequestItem)) {
            return false;
        }
        UtxoRequestItem utxoRequestItem = (UtxoRequestItem) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) utxoRequestItem.address) && Intrinsics.EZpvd(this.from, utxoRequestItem.from) && Intrinsics.EZpvd(this.size, utxoRequestItem.size) && Intrinsics.EZpvd(this.type, utxoRequestItem.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        Integer num = this.from;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.size;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.type;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoRequestItem(address=" + this.address + ", from=" + this.from + ", size=" + this.size + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        Integer num = this.from;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.size;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.type;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoRequestItem> serializer() {
            return UtxoRequestItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoRequestItem(int i, String str, Integer num, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UtxoRequestItem$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        if ((i & 2) == 0) {
            this.from = null;
        } else {
            this.from = num;
        }
        if ((i & 4) == 0) {
            this.size = null;
        } else {
            this.size = num2;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = num3;
        }
    }

    public static final /* synthetic */ void copydefault(UtxoRequestItem utxoRequestItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoRequestItem.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || utxoRequestItem.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, utxoRequestItem.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoRequestItem.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, utxoRequestItem.size);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && utxoRequestItem.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, utxoRequestItem.type);
    }

    public UtxoRequestItem(@NotNull String str, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.from = num;
        this.size = num2;
        this.type = num3;
    }
}

package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoStatusUpdateRequestBody implements Parcelable {
    public final int action;
    public final String address;
    public final long chainIndex;
    public final List<UtxoItemIdentity> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoStatusUpdateRequestBody> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(UtxoItemIdentity$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<UtxoStatusUpdateRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoStatusUpdateRequestBody createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(UtxoItemIdentity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new UtxoStatusUpdateRequestBody(arrayList, parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoStatusUpdateRequestBody[] newArray(int i) {
            return new UtxoStatusUpdateRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateRequestBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoStatusUpdateRequestBody copy$default(UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody, List list, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = utxoStatusUpdateRequestBody.items;
        }
        if ((i2 & 2) != 0) {
            str = utxoStatusUpdateRequestBody.address;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = utxoStatusUpdateRequestBody.action;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = utxoStatusUpdateRequestBody.chainIndex;
        }
        return utxoStatusUpdateRequestBody.EZpvd(list, str2, i3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoStatusUpdateRequestBody EZpvd(List<UtxoItemIdentity> list, @NotNull String str, int i, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoStatusUpdateRequestBody(list, str, i, j);
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
        if (!(obj instanceof UtxoStatusUpdateRequestBody)) {
            return false;
        }
        UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody = (UtxoStatusUpdateRequestBody) obj;
        return Intrinsics.EZpvd(this.items, utxoStatusUpdateRequestBody.items) && Intrinsics.EZpvd((Object) this.address, (Object) utxoStatusUpdateRequestBody.address) && this.action == utxoStatusUpdateRequestBody.action && this.chainIndex == utxoStatusUpdateRequestBody.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<UtxoItemIdentity> list = this.items;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.action)) * 31) + Long.hashCode(this.chainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoStatusUpdateRequestBody(items=" + this.items + ", address=" + this.address + ", action=" + this.action + ", chainIndex=" + this.chainIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UtxoItemIdentity> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UtxoItemIdentity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.address);
        parcel.writeInt(this.action);
        parcel.writeLong(this.chainIndex);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoStatusUpdateRequestBody> serializer() {
            return UtxoStatusUpdateRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoStatusUpdateRequestBody(int i, List list, String str, int i2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, UtxoStatusUpdateRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        this.address = str;
        this.action = i2;
        this.chainIndex = j;
    }

    public static final /* synthetic */ void AEQbTJ(UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoStatusUpdateRequestBody.items != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], utxoStatusUpdateRequestBody.items);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, utxoStatusUpdateRequestBody.address);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, utxoStatusUpdateRequestBody.action);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, utxoStatusUpdateRequestBody.chainIndex);
    }

    public UtxoStatusUpdateRequestBody(List<UtxoItemIdentity> list, @NotNull String str, int i, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.items = list;
        this.address = str;
        this.action = i;
        this.chainIndex = j;
    }
}

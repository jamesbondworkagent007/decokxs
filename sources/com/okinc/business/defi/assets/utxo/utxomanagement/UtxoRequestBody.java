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
public final class UtxoRequestBody implements Parcelable {
    public final long coinId;
    public final List<UtxoRequestItem> utxoRequests;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoRequestBody> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UtxoRequestItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<UtxoRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UtxoRequestItem.CREATOR.createFromParcel(parcel));
            }
            return new UtxoRequestBody(j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoRequestBody[] newArray(int i) {
            return new UtxoRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoRequestBody copy$default(UtxoRequestBody utxoRequestBody, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = utxoRequestBody.coinId;
        }
        if ((i & 2) != 0) {
            list = utxoRequestBody.utxoRequests;
        }
        return utxoRequestBody.KWHzl(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoRequestBody KWHzl(long j, @NotNull List<UtxoRequestItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new UtxoRequestBody(j, list);
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
        if (!(obj instanceof UtxoRequestBody)) {
            return false;
        }
        UtxoRequestBody utxoRequestBody = (UtxoRequestBody) obj;
        return this.coinId == utxoRequestBody.coinId && Intrinsics.EZpvd(this.utxoRequests, utxoRequestBody.utxoRequests);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.coinId) * 31) + this.utxoRequests.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoRequestBody(coinId=" + this.coinId + ", utxoRequests=" + this.utxoRequests + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        List<UtxoRequestItem> list = this.utxoRequests;
        parcel.writeInt(list.size());
        Iterator<UtxoRequestItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoRequestBody> serializer() {
            return UtxoRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoRequestBody(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UtxoRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.utxoRequests = list;
    }

    public static final /* synthetic */ void KWHzl(UtxoRequestBody utxoRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, utxoRequestBody.coinId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], utxoRequestBody.utxoRequests);
    }

    public UtxoRequestBody(long j, @NotNull List<UtxoRequestItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinId = j;
        this.utxoRequests = list;
    }
}

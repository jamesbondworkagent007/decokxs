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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoConfirmationRequest implements Parcelable {
    public final String address;
    public final long coinId;
    public final Integer txType;
    public final List<UtxoConfirmationRequestItem> utxoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoConfirmationRequest> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(UtxoConfirmationRequestItem$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<UtxoConfirmationRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UtxoConfirmationRequestItem.CREATOR.createFromParcel(parcel));
            }
            return new UtxoConfirmationRequest(arrayList, parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationRequest[] newArray(int i) {
            return new UtxoConfirmationRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoConfirmationRequest copy$default(UtxoConfirmationRequest utxoConfirmationRequest, List list, long j, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = utxoConfirmationRequest.utxoList;
        }
        if ((i & 2) != 0) {
            j = utxoConfirmationRequest.coinId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            num = utxoConfirmationRequest.txType;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = utxoConfirmationRequest.address;
        }
        return utxoConfirmationRequest.copydefault(list, j2, num2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationRequest copydefault(@NotNull List<UtxoConfirmationRequestItem> list, long j, Integer num, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new UtxoConfirmationRequest(list, j, num, str);
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
        if (!(obj instanceof UtxoConfirmationRequest)) {
            return false;
        }
        UtxoConfirmationRequest utxoConfirmationRequest = (UtxoConfirmationRequest) obj;
        return Intrinsics.EZpvd(this.utxoList, utxoConfirmationRequest.utxoList) && this.coinId == utxoConfirmationRequest.coinId && Intrinsics.EZpvd(this.txType, utxoConfirmationRequest.txType) && Intrinsics.EZpvd((Object) this.address, (Object) utxoConfirmationRequest.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.utxoList.hashCode();
        int iHashCode2 = Long.hashCode(this.coinId);
        Integer num = this.txType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoConfirmationRequest(utxoList=" + this.utxoList + ", coinId=" + this.coinId + ", txType=" + this.txType + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UtxoConfirmationRequestItem> list = this.utxoList;
        parcel.writeInt(list.size());
        Iterator<UtxoConfirmationRequestItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.coinId);
        Integer num = this.txType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoConfirmationRequest> serializer() {
            return UtxoConfirmationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoConfirmationRequest(int i, List list, long j, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, UtxoConfirmationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.utxoList = list;
        this.coinId = j;
        if ((i & 4) == 0) {
            this.txType = null;
        } else {
            this.txType = num;
        }
        this.address = str;
    }

    public static final /* synthetic */ void AEQbTJ(UtxoConfirmationRequest utxoConfirmationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], utxoConfirmationRequest.utxoList);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, utxoConfirmationRequest.coinId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoConfirmationRequest.txType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, utxoConfirmationRequest.txType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, utxoConfirmationRequest.address);
    }

    public UtxoConfirmationRequest(@NotNull List<UtxoConfirmationRequestItem> list, long j, Integer num, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.utxoList = list;
        this.coinId = j;
        this.txType = num;
        this.address = str;
    }
}

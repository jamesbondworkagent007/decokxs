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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoConfirmationResponse implements Parcelable {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<UtxoConfirmationResponseItem> conflictAssetUtxo;
    public final List<UtxoConfirmationResponseItem> unlockFeeUtxo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoConfirmationResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoConfirmationResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UtxoConfirmationResponseItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(UtxoConfirmationResponseItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new UtxoConfirmationResponse(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponse[] newArray(int i) {
            return new UtxoConfirmationResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoConfirmationResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoConfirmationResponse copy$default(UtxoConfirmationResponse utxoConfirmationResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = utxoConfirmationResponse.conflictAssetUtxo;
        }
        if ((i & 2) != 0) {
            list2 = utxoConfirmationResponse.unlockFeeUtxo;
        }
        return utxoConfirmationResponse.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoConfirmationResponseItem> KWHzl() {
        return this.unlockFeeUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationResponse OLrzqt(List<UtxoConfirmationResponseItem> list, List<UtxoConfirmationResponseItem> list2) {
        return new UtxoConfirmationResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoConfirmationResponseItem> OLrzqt() {
        return this.conflictAssetUtxo;
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
        if (!(obj instanceof UtxoConfirmationResponse)) {
            return false;
        }
        UtxoConfirmationResponse utxoConfirmationResponse = (UtxoConfirmationResponse) obj;
        return Intrinsics.EZpvd(this.conflictAssetUtxo, utxoConfirmationResponse.conflictAssetUtxo) && Intrinsics.EZpvd(this.unlockFeeUtxo, utxoConfirmationResponse.unlockFeeUtxo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<UtxoConfirmationResponseItem> list = this.conflictAssetUtxo;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<UtxoConfirmationResponseItem> list2 = this.unlockFeeUtxo;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoConfirmationResponse(conflictAssetUtxo=" + this.conflictAssetUtxo + ", unlockFeeUtxo=" + this.unlockFeeUtxo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UtxoConfirmationResponseItem> list = this.conflictAssetUtxo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UtxoConfirmationResponseItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<UtxoConfirmationResponseItem> list2 = this.unlockFeeUtxo;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<UtxoConfirmationResponseItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoConfirmationResponse> serializer() {
            return UtxoConfirmationResponse$$serializer.INSTANCE;
        }
    }

    static {
        UtxoConfirmationResponseItem$$serializer utxoConfirmationResponseItem$$serializer = UtxoConfirmationResponseItem$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(utxoConfirmationResponseItem$$serializer), new ArrayListSerializer(utxoConfirmationResponseItem$$serializer)};
    }

    public /* synthetic */ UtxoConfirmationResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.conflictAssetUtxo = null;
        } else {
            this.conflictAssetUtxo = list;
        }
        if ((i & 2) == 0) {
            this.unlockFeeUtxo = null;
        } else {
            this.unlockFeeUtxo = list2;
        }
    }

    public static final /* synthetic */ void KWHzl(UtxoConfirmationResponse utxoConfirmationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoConfirmationResponse.conflictAssetUtxo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], utxoConfirmationResponse.conflictAssetUtxo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && utxoConfirmationResponse.unlockFeeUtxo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], utxoConfirmationResponse.unlockFeeUtxo);
    }

    public UtxoConfirmationResponse(List<UtxoConfirmationResponseItem> list, List<UtxoConfirmationResponseItem> list2) {
        this.conflictAssetUtxo = list;
        this.unlockFeeUtxo = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem>, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem>):void (m)] (LINE:21) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ UtxoConfirmationResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}

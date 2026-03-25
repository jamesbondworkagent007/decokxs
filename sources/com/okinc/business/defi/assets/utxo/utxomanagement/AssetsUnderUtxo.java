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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AssetsUnderUtxo implements Parcelable {
    public final List<UtxoAssetItem> items;
    public final String txnHash;
    public final List<String> unknownAssets;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetsUnderUtxo> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(UtxoAssetItem$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AssetsUnderUtxo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsUnderUtxo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(UtxoAssetItem.CREATOR.createFromParcel(parcel));
            }
            return new AssetsUnderUtxo(string, i, arrayList, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsUnderUtxo[] newArray(int i) {
            return new AssetsUnderUtxo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsUnderUtxo() {
        this((String) null, 0, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsUnderUtxo copy$default(AssetsUnderUtxo assetsUnderUtxo, String str, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetsUnderUtxo.txnHash;
        }
        if ((i2 & 2) != 0) {
            i = assetsUnderUtxo.vout;
        }
        if ((i2 & 4) != 0) {
            list = assetsUnderUtxo.items;
        }
        if ((i2 & 8) != 0) {
            list2 = assetsUnderUtxo.unknownAssets;
        }
        return assetsUnderUtxo.copydefault(str, i, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.unknownAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsUnderUtxo copydefault(@NotNull String str, int i, @NotNull List<UtxoAssetItem> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AssetsUnderUtxo(str, i, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoAssetItem> copydefault() {
        return this.items;
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
        if (!(obj instanceof AssetsUnderUtxo)) {
            return false;
        }
        AssetsUnderUtxo assetsUnderUtxo = (AssetsUnderUtxo) obj;
        return Intrinsics.EZpvd((Object) this.txnHash, (Object) assetsUnderUtxo.txnHash) && this.vout == assetsUnderUtxo.vout && Intrinsics.EZpvd(this.items, assetsUnderUtxo.items) && Intrinsics.EZpvd(this.unknownAssets, assetsUnderUtxo.unknownAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.txnHash.hashCode() * 31) + Integer.hashCode(this.vout)) * 31) + this.items.hashCode()) * 31) + this.unknownAssets.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsUnderUtxo(txnHash=" + this.txnHash + ", vout=" + this.vout + ", items=" + this.items + ", unknownAssets=" + this.unknownAssets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txnHash);
        parcel.writeInt(this.vout);
        List<UtxoAssetItem> list = this.items;
        parcel.writeInt(list.size());
        Iterator<UtxoAssetItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.unknownAssets);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetsUnderUtxo> serializer() {
            return AssetsUnderUtxo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetsUnderUtxo(int i, String str, int i2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.txnHash = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.vout = 0;
        } else {
            this.vout = i2;
        }
        if ((i & 4) == 0) {
            this.items = yDY.AhwBna();
        } else {
            this.items = list;
        }
        if ((i & 8) == 0) {
            this.unknownAssets = yDY.AhwBna();
        } else {
            this.unknownAssets = list2;
        }
    }

    public static final /* synthetic */ void OLrzqt(AssetsUnderUtxo assetsUnderUtxo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetsUnderUtxo.txnHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetsUnderUtxo.txnHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetsUnderUtxo.vout != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, assetsUnderUtxo.vout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(assetsUnderUtxo.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], assetsUnderUtxo.items);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(assetsUnderUtxo.unknownAssets, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetsUnderUtxo.unknownAssets);
    }

    public AssetsUnderUtxo(@NotNull String str, int i, @NotNull List<UtxoAssetItem> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.txnHash = str;
        this.vout = i;
        this.items = list;
        this.unknownAssets = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:111)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0017: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:113)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, int, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetItem>, java.util.List<java.lang.String>):void (m)] (LINE:105) call: com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo.<init>(java.lang.String, int, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AssetsUnderUtxo(String str, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? yDY.AhwBna() : list2);
    }
}

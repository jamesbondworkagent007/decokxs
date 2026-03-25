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
import o.C10303bls;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoItem implements Parcelable {
    public final List<BrcNftItem> brcNftCollection;
    public final long coinAmount;
    public final boolean hasNft;
    public final String key;
    public final String txnHash;
    public final int txnStatus;
    public final int utxoStatus;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoItem> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BrcNftItem$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<UtxoItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(BrcNftItem.CREATOR.createFromParcel(parcel));
            }
            return new UtxoItem(string, i, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoItem[] newArray(int i) {
            return new UtxoItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoItem() {
        this((String) null, 0, (List) null, 0L, false, (String) null, 0, 0, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoItem AEQbTJ(@NotNull String str, int i, @NotNull List<BrcNftItem> list, long j, boolean z, @NotNull String str2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UtxoItem(str, i, list, j, z, str2, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.utxoStatus;
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
        if (!(obj instanceof UtxoItem)) {
            return false;
        }
        UtxoItem utxoItem = (UtxoItem) obj;
        return Intrinsics.EZpvd((Object) this.txnHash, (Object) utxoItem.txnHash) && this.vout == utxoItem.vout && Intrinsics.EZpvd(this.brcNftCollection, utxoItem.brcNftCollection) && this.coinAmount == utxoItem.coinAmount && this.hasNft == utxoItem.hasNft && Intrinsics.EZpvd((Object) this.key, (Object) utxoItem.key) && this.txnStatus == utxoItem.txnStatus && this.utxoStatus == utxoItem.utxoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.txnHash.hashCode() * 31) + Integer.hashCode(this.vout)) * 31) + this.brcNftCollection.hashCode()) * 31) + Long.hashCode(this.coinAmount)) * 31) + Boolean.hashCode(this.hasNft)) * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.txnStatus)) * 31) + Integer.hashCode(this.utxoStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoItem(txnHash=" + this.txnHash + ", vout=" + this.vout + ", brcNftCollection=" + this.brcNftCollection + ", coinAmount=" + this.coinAmount + ", hasNft=" + this.hasNft + ", key=" + this.key + ", txnStatus=" + this.txnStatus + ", utxoStatus=" + this.utxoStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txnHash);
        parcel.writeInt(this.vout);
        List<BrcNftItem> list = this.brcNftCollection;
        parcel.writeInt(list.size());
        Iterator<BrcNftItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.coinAmount);
        parcel.writeInt(this.hasNft ? 1 : 0);
        parcel.writeString(this.key);
        parcel.writeInt(this.txnStatus);
        parcel.writeInt(this.utxoStatus);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoItem> serializer() {
            return UtxoItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoItem(int i, String str, int i2, List list, long j, boolean z, String str2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txnHash = "";
        } else {
            this.txnHash = str;
        }
        if ((i & 2) == 0) {
            this.vout = 0;
        } else {
            this.vout = i2;
        }
        if ((i & 4) == 0) {
            this.brcNftCollection = yDY.AhwBna();
        } else {
            this.brcNftCollection = list;
        }
        if ((i & 8) == 0) {
            this.coinAmount = 0L;
        } else {
            this.coinAmount = j;
        }
        if ((i & 16) == 0) {
            this.hasNft = false;
        } else {
            this.hasNft = z;
        }
        if ((i & 32) == 0) {
            this.key = "";
        } else {
            this.key = str2;
        }
        if ((i & 64) == 0) {
            this.txnStatus = -1;
        } else {
            this.txnStatus = i3;
        }
        if ((i & 128) == 0) {
            this.utxoStatus = -1;
        } else {
            this.utxoStatus = i4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(UtxoItem utxoItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) utxoItem.txnHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoItem.txnHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || utxoItem.vout != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, utxoItem.vout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(utxoItem.brcNftCollection, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], utxoItem.brcNftCollection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || utxoItem.coinAmount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, utxoItem.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || utxoItem.hasNft) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, utxoItem.hasNft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) utxoItem.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, utxoItem.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || utxoItem.txnStatus != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, utxoItem.txnStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && utxoItem.utxoStatus == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, utxoItem.utxoStatus);
    }

    public UtxoItem(@NotNull String str, int i, @NotNull List<BrcNftItem> list, long j, boolean z, @NotNull String str2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txnHash = str;
        this.vout = i;
        this.brcNftCollection = list;
        this.coinAmount = j;
        this.hasNft = z;
        this.key = str2;
        this.txnStatus = i2;
        this.utxoStatus = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r13v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r16v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r20v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0033: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 int) : (-1 int))
 A[MD:(java.lang.String, int, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.BrcNftItem>, long, boolean, java.lang.String, int, int):void (m)] (LINE:35) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem.<init>(java.lang.String, int, java.util.List, long, boolean, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ UtxoItem(String str, int i, List list, long j, boolean z, String str2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? yDY.AhwBna() : list, (i4 & 8) != 0 ? 0L : j, (i4 & 16) == 0 ? z : false, (i4 & 32) == 0 ? str2 : "", (i4 & 64) != 0 ? -1 : i2, (i4 & 128) == 0 ? i3 : -1);
    }

    public static /* synthetic */ C10303bls toDisplayModel$OKWallet_wallet_impl$default(UtxoItem utxoItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return utxoItem.copydefault(z);
    }

    public final C10303bls copydefault(boolean z) {
        return new C10303bls(this.key, this.txnHash, this.vout, this.coinAmount, this.txnStatus, z);
    }
}

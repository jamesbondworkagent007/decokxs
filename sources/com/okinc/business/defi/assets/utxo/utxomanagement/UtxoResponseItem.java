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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoResponseItem implements Parcelable {
    public final String address;
    public final String freedBtcAmount;
    public final String transferableAmount;
    public final int utxoCount;
    public final List<UtxoItem> utxoList;
    public final int utxoType;
    public final int valuelessNftAmount;
    public final int valuelessNftCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoResponseItem> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(UtxoItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<UtxoResponseItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoResponseItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList.add(UtxoItem.CREATOR.createFromParcel(parcel));
            }
            return new UtxoResponseItem(string, string2, i, i2, string3, i3, i4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoResponseItem[] newArray(int i) {
            return new UtxoResponseItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoResponseItem() {
        this((String) null, (String) null, 0, 0, (String) null, 0, 0, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoResponseItem KWHzl(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, int i3, int i4, @NotNull List<UtxoItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UtxoResponseItem(str, str2, i, i2, str3, i3, i4, list);
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
        if (!(obj instanceof UtxoResponseItem)) {
            return false;
        }
        UtxoResponseItem utxoResponseItem = (UtxoResponseItem) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) utxoResponseItem.address) && Intrinsics.EZpvd((Object) this.transferableAmount, (Object) utxoResponseItem.transferableAmount) && this.valuelessNftCount == utxoResponseItem.valuelessNftCount && this.valuelessNftAmount == utxoResponseItem.valuelessNftAmount && Intrinsics.EZpvd((Object) this.freedBtcAmount, (Object) utxoResponseItem.freedBtcAmount) && this.utxoCount == utxoResponseItem.utxoCount && this.utxoType == utxoResponseItem.utxoType && Intrinsics.EZpvd(this.utxoList, utxoResponseItem.utxoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.address.hashCode() * 31) + this.transferableAmount.hashCode()) * 31) + Integer.hashCode(this.valuelessNftCount)) * 31) + Integer.hashCode(this.valuelessNftAmount)) * 31) + this.freedBtcAmount.hashCode()) * 31) + Integer.hashCode(this.utxoCount)) * 31) + Integer.hashCode(this.utxoType)) * 31) + this.utxoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoResponseItem(address=" + this.address + ", transferableAmount=" + this.transferableAmount + ", valuelessNftCount=" + this.valuelessNftCount + ", valuelessNftAmount=" + this.valuelessNftAmount + ", freedBtcAmount=" + this.freedBtcAmount + ", utxoCount=" + this.utxoCount + ", utxoType=" + this.utxoType + ", utxoList=" + this.utxoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.transferableAmount);
        parcel.writeInt(this.valuelessNftCount);
        parcel.writeInt(this.valuelessNftAmount);
        parcel.writeString(this.freedBtcAmount);
        parcel.writeInt(this.utxoCount);
        parcel.writeInt(this.utxoType);
        List<UtxoItem> list = this.utxoList;
        parcel.writeInt(list.size());
        Iterator<UtxoItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoResponseItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoResponseItem> serializer() {
            return UtxoResponseItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoResponseItem(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.transferableAmount = "";
        } else {
            this.transferableAmount = str2;
        }
        if ((i & 4) == 0) {
            this.valuelessNftCount = 0;
        } else {
            this.valuelessNftCount = i2;
        }
        if ((i & 8) == 0) {
            this.valuelessNftAmount = 0;
        } else {
            this.valuelessNftAmount = i3;
        }
        if ((i & 16) == 0) {
            this.freedBtcAmount = "";
        } else {
            this.freedBtcAmount = str3;
        }
        if ((i & 32) == 0) {
            this.utxoCount = 0;
        } else {
            this.utxoCount = i4;
        }
        if ((i & 64) == 0) {
            this.utxoType = -1;
        } else {
            this.utxoType = i5;
        }
        if ((i & 128) == 0) {
            this.utxoList = yDY.AhwBna();
        } else {
            this.utxoList = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(UtxoResponseItem utxoResponseItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) utxoResponseItem.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, utxoResponseItem.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) utxoResponseItem.transferableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, utxoResponseItem.transferableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoResponseItem.valuelessNftCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, utxoResponseItem.valuelessNftCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || utxoResponseItem.valuelessNftAmount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, utxoResponseItem.valuelessNftAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) utxoResponseItem.freedBtcAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, utxoResponseItem.freedBtcAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || utxoResponseItem.utxoCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, utxoResponseItem.utxoCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || utxoResponseItem.utxoType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, utxoResponseItem.utxoType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(utxoResponseItem.utxoList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], utxoResponseItem.utxoList);
    }

    public UtxoResponseItem(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, int i3, int i4, @NotNull List<UtxoItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.transferableAmount = str2;
        this.valuelessNftCount = i;
        this.valuelessNftAmount = i2;
        this.freedBtcAmount = str3;
        this.utxoCount = i3;
        this.utxoType = i4;
        this.utxoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0034: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem>):void (m)] (LINE:12) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoResponseItem.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.util.List):void type: THIS */
    public /* synthetic */ UtxoResponseItem(String str, String str2, int i, int i2, String str3, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) == 0 ? str3 : "", (i5 & 32) == 0 ? i3 : 0, (i5 & 64) != 0 ? -1 : i4, (i5 & 128) != 0 ? yDY.AhwBna() : list);
    }

    public final UtxoByType OLrzqt() {
        return new UtxoByType(this.address, this.transferableAmount, this.valuelessNftCount, this.valuelessNftAmount, this.freedBtcAmount, this.utxoCount, this.utxoType, this.utxoList);
    }
}

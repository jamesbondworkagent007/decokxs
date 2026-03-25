package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AssetRsp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<AddressAsset> bch;
    private List<AddressAsset> bitcoin;
    private List<AddressAsset> dash;
    private List<AddressAsset> evm;
    private List<AddressAsset> ltc;
    private List<AddressAsset> tron;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetRsp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AssetRsp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRsp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList7.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList8.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList9.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList10.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList11.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                arrayList6 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList6.add(AddressAsset.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetRsp(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRsp[] newArray(int i) {
            return new AssetRsp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetRsp() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.AssetRsp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetRsp copy$default(AssetRsp assetRsp, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetRsp.evm;
        }
        if ((i & 2) != 0) {
            list2 = assetRsp.bitcoin;
        }
        List list7 = list2;
        if ((i & 4) != 0) {
            list3 = assetRsp.tron;
        }
        List list8 = list3;
        if ((i & 8) != 0) {
            list4 = assetRsp.bch;
        }
        List list9 = list4;
        if ((i & 16) != 0) {
            list5 = assetRsp.ltc;
        }
        List list10 = list5;
        if ((i & 32) != 0) {
            list6 = assetRsp.dash;
        }
        return assetRsp.copy(list, list7, list8, list9, list10, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component1() {
        return this.evm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component2() {
        return this.bitcoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component3() {
        return this.tron;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component4() {
        return this.bch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component5() {
        return this.ltc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> component6() {
        return this.dash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRsp copy(List<AddressAsset> list, List<AddressAsset> list2, List<AddressAsset> list3, List<AddressAsset> list4, List<AddressAsset> list5, List<AddressAsset> list6) {
        return new AssetRsp(list, list2, list3, list4, list5, list6);
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
        if (!(obj instanceof AssetRsp)) {
            return false;
        }
        AssetRsp assetRsp = (AssetRsp) obj;
        return Intrinsics.EZpvd(this.evm, assetRsp.evm) && Intrinsics.EZpvd(this.bitcoin, assetRsp.bitcoin) && Intrinsics.EZpvd(this.tron, assetRsp.tron) && Intrinsics.EZpvd(this.bch, assetRsp.bch) && Intrinsics.EZpvd(this.ltc, assetRsp.ltc) && Intrinsics.EZpvd(this.dash, assetRsp.dash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getBch() {
        return this.bch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getBitcoin() {
        return this.bitcoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getDash() {
        return this.dash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getEvm() {
        return this.evm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getLtc() {
        return this.ltc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressAsset> getTron() {
        return this.tron;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AddressAsset> list = this.evm;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<AddressAsset> list2 = this.bitcoin;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<AddressAsset> list3 = this.tron;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<AddressAsset> list4 = this.bch;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        List<AddressAsset> list5 = this.ltc;
        int iHashCode5 = list5 == null ? 0 : list5.hashCode();
        List<AddressAsset> list6 = this.dash;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list6 != null ? list6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBch(List<AddressAsset> list) {
        this.bch = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBitcoin(List<AddressAsset> list) {
        this.bitcoin = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDash(List<AddressAsset> list) {
        this.dash = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvm(List<AddressAsset> list) {
        this.evm = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLtc(List<AddressAsset> list) {
        this.ltc = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTron(List<AddressAsset> list) {
        this.tron = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetRsp(evm=" + this.evm + ", bitcoin=" + this.bitcoin + ", tron=" + this.tron + ", bch=" + this.bch + ", ltc=" + this.ltc + ", dash=" + this.dash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<AddressAsset> list = this.evm;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddressAsset> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<AddressAsset> list2 = this.bitcoin;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AddressAsset> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<AddressAsset> list3 = this.tron;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<AddressAsset> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<AddressAsset> list4 = this.bch;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<AddressAsset> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<AddressAsset> list5 = this.ltc;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<AddressAsset> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        List<AddressAsset> list6 = this.dash;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list6.size());
        Iterator<AddressAsset> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetRsp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetRsp> serializer() {
            return AssetRsp$$serializer.INSTANCE;
        }
    }

    static {
        AddressAsset$$serializer addressAsset$$serializer = AddressAsset$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(addressAsset$$serializer), new ArrayListSerializer(addressAsset$$serializer), new ArrayListSerializer(addressAsset$$serializer), new ArrayListSerializer(addressAsset$$serializer), new ArrayListSerializer(addressAsset$$serializer), new ArrayListSerializer(addressAsset$$serializer)};
    }

    public /* synthetic */ AssetRsp(int i, List list, List list2, List list3, List list4, List list5, List list6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.evm = null;
        } else {
            this.evm = list;
        }
        if ((i & 2) == 0) {
            this.bitcoin = null;
        } else {
            this.bitcoin = list2;
        }
        if ((i & 4) == 0) {
            this.tron = null;
        } else {
            this.tron = list3;
        }
        if ((i & 8) == 0) {
            this.bch = null;
        } else {
            this.bch = list4;
        }
        if ((i & 16) == 0) {
            this.ltc = null;
        } else {
            this.ltc = list5;
        }
        if ((i & 32) == 0) {
            this.dash = null;
        } else {
            this.dash = list6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetRsp assetRsp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetRsp.evm != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], assetRsp.evm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetRsp.bitcoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], assetRsp.bitcoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetRsp.tron != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], assetRsp.tron);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetRsp.bch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetRsp.bch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || assetRsp.ltc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], assetRsp.ltc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && assetRsp.dash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], assetRsp.dash);
    }

    public AssetRsp(List<AddressAsset> list, List<AddressAsset> list2, List<AddressAsset> list3, List<AddressAsset> list4, List<AddressAsset> list5, List<AddressAsset> list6) {
        this.evm = list;
        this.bitcoin = list2;
        this.tron = list3;
        this.bch = list4;
        this.ltc = list5;
        this.dash = list6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>, java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>, java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>, java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>, java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>, java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>):void (m)] (LINE:337) call: com.okinc.business.defi.biz.net.bean.AssetRsp.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AssetRsp(List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6);
    }
}

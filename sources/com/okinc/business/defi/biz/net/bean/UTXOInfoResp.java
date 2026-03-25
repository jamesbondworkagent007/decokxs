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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UTXOInfoResp implements Parcelable {
    private String address;
    private String canTransferAmount;
    private String lockAmount;
    private List<UtxoInfo> utxoList;
    private Integer utxoType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOInfoResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(UtxoInfo$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<UTXOInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOInfoResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UtxoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new UTXOInfoResp(string, string2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOInfoResp[] newArray(int i) {
            return new UTXOInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOInfoResp() {
        this((String) null, (String) null, (List) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.UTXOInfoResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UTXOInfoResp copy$default(UTXOInfoResp uTXOInfoResp, String str, String str2, List list, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uTXOInfoResp.address;
        }
        if ((i & 2) != 0) {
            str2 = uTXOInfoResp.canTransferAmount;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = uTXOInfoResp.utxoList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = uTXOInfoResp.lockAmount;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            num = uTXOInfoResp.utxoType;
        }
        return uTXOInfoResp.copy(str, str4, list2, str5, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.canTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> component3() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lockAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOInfoResp copy(String str, String str2, List<UtxoInfo> list, String str3, Integer num) {
        return new UTXOInfoResp(str, str2, list, str3, num);
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
        if (!(obj instanceof UTXOInfoResp)) {
            return false;
        }
        UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) uTXOInfoResp.address) && Intrinsics.EZpvd((Object) this.canTransferAmount, (Object) uTXOInfoResp.canTransferAmount) && Intrinsics.EZpvd(this.utxoList, uTXOInfoResp.utxoList) && Intrinsics.EZpvd((Object) this.lockAmount, (Object) uTXOInfoResp.lockAmount) && Intrinsics.EZpvd(this.utxoType, uTXOInfoResp.utxoType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanTransferAmount() {
        return this.canTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLockAmount() {
        return this.lockAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> getUtxoList() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUtxoType() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.canTransferAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<UtxoInfo> list = this.utxoList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str3 = this.lockAmount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.utxoType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTransferAmount(String str) {
        this.canTransferAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockAmount(String str) {
        this.lockAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoList(List<UtxoInfo> list) {
        this.utxoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoType(Integer num) {
        this.utxoType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOInfoResp(address=" + this.address + ", canTransferAmount=" + this.canTransferAmount + ", utxoList=" + this.utxoList + ", lockAmount=" + this.lockAmount + ", utxoType=" + this.utxoType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.canTransferAmount);
        List<UtxoInfo> list = this.utxoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UtxoInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.lockAmount);
        Integer num = this.utxoType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UTXOInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXOInfoResp> serializer() {
            return UTXOInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UTXOInfoResp(int i, String str, String str2, List list, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.canTransferAmount = null;
        } else {
            this.canTransferAmount = str2;
        }
        if ((i & 4) == 0) {
            this.utxoList = null;
        } else {
            this.utxoList = list;
        }
        if ((i & 8) == 0) {
            this.lockAmount = "0";
        } else {
            this.lockAmount = str3;
        }
        if ((i & 16) == 0) {
            this.utxoType = 0;
        } else {
            this.utxoType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOInfoResp uTXOInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOInfoResp.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXOInfoResp.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXOInfoResp.canTransferAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXOInfoResp.canTransferAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXOInfoResp.utxoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], uTXOInfoResp.utxoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) uTXOInfoResp.lockAmount, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTXOInfoResp.lockAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num = uTXOInfoResp.utxoType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, uTXOInfoResp.utxoType);
        }
    }

    public UTXOInfoResp(String str, String str2, List<UtxoInfo> list, String str3, Integer num) {
        this.address = str;
        this.canTransferAmount = str2;
        this.utxoList = list;
        this.lockAmount = str3;
        this.utxoType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.util.List) : (null java.util.List))
  (wrap:java.lang.String:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.UtxoInfo>, java.lang.String, java.lang.Integer):void (m)] (LINE:72) call: com.okinc.business.defi.biz.net.bean.UTXOInfoResp.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ UTXOInfoResp(String str, String str2, List list, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? list : null, (i & 8) != 0 ? "0" : str3, (i & 16) != 0 ? 0 : num);
    }
}

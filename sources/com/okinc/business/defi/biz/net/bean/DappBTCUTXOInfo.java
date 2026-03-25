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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappBTCUTXOInfo implements Parcelable {
    private List<String> address;
    private String amount;
    private Boolean isWalletAddress;
    private Boolean showSign;
    private String vOut;
    private List<DappBTCXRCAssets> xrcAssets;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBTCUTXOInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, new ArrayListSerializer(DappBTCXRCAssets$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappBTCUTXOInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DappBTCXRCAssets.CREATOR.createFromParcel(parcel));
                }
            }
            return new DappBTCUTXOInfo(arrayListCreateStringArrayList, string, string2, boolValueOf, boolValueOf2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOInfo[] newArray(int i) {
            return new DappBTCUTXOInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappBTCUTXOInfo() {
        this((List) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappBTCUTXOInfo copy$default(DappBTCUTXOInfo dappBTCUTXOInfo, List list, String str, String str2, Boolean bool, Boolean bool2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dappBTCUTXOInfo.address;
        }
        if ((i & 2) != 0) {
            str = dappBTCUTXOInfo.vOut;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dappBTCUTXOInfo.amount;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bool = dappBTCUTXOInfo.showSign;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = dappBTCUTXOInfo.isWalletAddress;
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            list2 = dappBTCUTXOInfo.xrcAssets;
        }
        return dappBTCUTXOInfo.copy(list, str3, str4, bool3, bool4, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.showSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCXRCAssets> component6() {
        return this.xrcAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBTCUTXOInfo copy(List<String> list, String str, String str2, Boolean bool, Boolean bool2, List<DappBTCXRCAssets> list2) {
        return new DappBTCUTXOInfo(list, str, str2, bool, bool2, list2);
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
        if (!(obj instanceof DappBTCUTXOInfo)) {
            return false;
        }
        DappBTCUTXOInfo dappBTCUTXOInfo = (DappBTCUTXOInfo) obj;
        return Intrinsics.EZpvd(this.address, dappBTCUTXOInfo.address) && Intrinsics.EZpvd((Object) this.vOut, (Object) dappBTCUTXOInfo.vOut) && Intrinsics.EZpvd((Object) this.amount, (Object) dappBTCUTXOInfo.amount) && Intrinsics.EZpvd(this.showSign, dappBTCUTXOInfo.showSign) && Intrinsics.EZpvd(this.isWalletAddress, dappBTCUTXOInfo.isWalletAddress) && Intrinsics.EZpvd(this.xrcAssets, dappBTCUTXOInfo.xrcAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowSign() {
        return this.showSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCXRCAssets> getXrcAssets() {
        return this.xrcAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.address;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.vOut;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.showSign;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isWalletAddress;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        List<DappBTCXRCAssets> list2 = this.xrcAssets;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isWalletAddress() {
        return this.isWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(List<String> list) {
        this.address = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSign(Boolean bool) {
        this.showSign = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVOut(String str) {
        this.vOut = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAddress(Boolean bool) {
        this.isWalletAddress = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXrcAssets(List<DappBTCXRCAssets> list) {
        this.xrcAssets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBTCUTXOInfo(address=" + this.address + ", vOut=" + this.vOut + ", amount=" + this.amount + ", showSign=" + this.showSign + ", isWalletAddress=" + this.isWalletAddress + ", xrcAssets=" + this.xrcAssets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.address);
        parcel.writeString(this.vOut);
        parcel.writeString(this.amount);
        Boolean bool = this.showSign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isWalletAddress;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<DappBTCXRCAssets> list = this.xrcAssets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DappBTCXRCAssets> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBTCUTXOInfo> serializer() {
            return DappBTCUTXOInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappBTCUTXOInfo(int i, List list, String str, String str2, Boolean bool, Boolean bool2, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = list;
        }
        if ((i & 2) == 0) {
            this.vOut = null;
        } else {
            this.vOut = str;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.showSign = null;
        } else {
            this.showSign = bool;
        }
        if ((i & 16) == 0) {
            this.isWalletAddress = null;
        } else {
            this.isWalletAddress = bool2;
        }
        if ((i & 32) == 0) {
            this.xrcAssets = null;
        } else {
            this.xrcAssets = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBTCUTXOInfo dappBTCUTXOInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBTCUTXOInfo.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], dappBTCUTXOInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBTCUTXOInfo.vOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappBTCUTXOInfo.vOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappBTCUTXOInfo.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dappBTCUTXOInfo.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappBTCUTXOInfo.showSign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, dappBTCUTXOInfo.showSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dappBTCUTXOInfo.isWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, dappBTCUTXOInfo.isWalletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && dappBTCUTXOInfo.xrcAssets == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], dappBTCUTXOInfo.xrcAssets);
    }

    public DappBTCUTXOInfo(List<String> list, String str, String str2, Boolean bool, Boolean bool2, List<DappBTCXRCAssets> list2) {
        this.address = list;
        this.vOut = str;
        this.amount = str2;
        this.showSign = bool;
        this.isWalletAddress = bool2;
        this.xrcAssets = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets>):void (m)] (LINE:1607) call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ DappBTCUTXOInfo(List list, String str, String str2, Boolean bool, Boolean bool2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : list2);
    }
}

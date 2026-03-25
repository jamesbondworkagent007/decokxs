package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.dapp.bean.SelectWalletNet$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletSelectParams implements Parcelable {
    private String contractAddress;
    private List<String> contractAddressList;
    private WalletSelectDappCustomParams dappCustomParams;
    private boolean enableWithoutBackup;
    private List<Integer> hiddenWalletTypeList;
    private Boolean isBrc20;
    private boolean isDarkMode;
    private Long selectedChain;
    private String selectedWalletId;
    private boolean showSearchNetwork;
    private ArrayList<SelectWalletNet> supportChainList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletSelectParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SelectWalletNet$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<WalletSelectParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSelectParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(parcel.readParcelable(WalletSelectParams.class.getClassLoader()));
                }
                arrayList = arrayList3;
            }
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList4;
            }
            return new WalletSelectParams(arrayList, string, lValueOf, string2, arrayListCreateStringArrayList, boolValueOf, z, z2, z3, arrayList2, parcel.readInt() != 0 ? WalletSelectDappCustomParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSelectParams[] newArray(int i) {
            return new WalletSelectParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletSelectParams() {
        this((ArrayList) null, (String) null, (Long) null, (String) null, (List) null, (Boolean) null, false, false, false, (List) null, (WalletSelectDappCustomParams) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectWalletNet> component1() {
        return this.supportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component10() {
        return this.hiddenWalletTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectDappCustomParams component11() {
        return this.dappCustomParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.selectedWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.selectedChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.contractAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isBrc20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.enableWithoutBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isDarkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.showSearchNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectParams copy(ArrayList<SelectWalletNet> arrayList, String str, Long l, String str2, List<String> list, Boolean bool, boolean z, boolean z2, boolean z3, List<Integer> list2, WalletSelectDappCustomParams walletSelectDappCustomParams) {
        return new WalletSelectParams(arrayList, str, l, str2, list, bool, z, z2, z3, list2, walletSelectDappCustomParams);
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
        if (!(obj instanceof WalletSelectParams)) {
            return false;
        }
        WalletSelectParams walletSelectParams = (WalletSelectParams) obj;
        return Intrinsics.EZpvd(this.supportChainList, walletSelectParams.supportChainList) && Intrinsics.EZpvd((Object) this.selectedWalletId, (Object) walletSelectParams.selectedWalletId) && Intrinsics.EZpvd(this.selectedChain, walletSelectParams.selectedChain) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) walletSelectParams.contractAddress) && Intrinsics.EZpvd(this.contractAddressList, walletSelectParams.contractAddressList) && Intrinsics.EZpvd(this.isBrc20, walletSelectParams.isBrc20) && this.enableWithoutBackup == walletSelectParams.enableWithoutBackup && this.isDarkMode == walletSelectParams.isDarkMode && this.showSearchNetwork == walletSelectParams.showSearchNetwork && Intrinsics.EZpvd(this.hiddenWalletTypeList, walletSelectParams.hiddenWalletTypeList) && Intrinsics.EZpvd(this.dappCustomParams, walletSelectParams.dappCustomParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getContractAddressList() {
        return this.contractAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectDappCustomParams getDappCustomParams() {
        return this.dappCustomParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableWithoutBackup() {
        return this.enableWithoutBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getHiddenWalletTypeList() {
        return this.hiddenWalletTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSelectedChain() {
        return this.selectedChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectedWalletId() {
        return this.selectedWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSearchNetwork() {
        return this.showSearchNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectWalletNet> getSupportChainList() {
        return this.supportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<SelectWalletNet> arrayList = this.supportChainList;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.selectedWalletId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l = this.selectedChain;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str2 = this.contractAddress;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.contractAddressList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isBrc20;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = Boolean.hashCode(this.enableWithoutBackup);
        int iHashCode8 = Boolean.hashCode(this.isDarkMode);
        int iHashCode9 = Boolean.hashCode(this.showSearchNetwork);
        List<Integer> list2 = this.hiddenWalletTypeList;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        WalletSelectDappCustomParams walletSelectDappCustomParams = this.dappCustomParams;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (walletSelectDappCustomParams != null ? walletSelectDappCustomParams.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBrc20() {
        return this.isBrc20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDarkMode() {
        return this.isDarkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrc20(Boolean bool) {
        this.isBrc20 = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddressList(List<String> list) {
        this.contractAddressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappCustomParams(WalletSelectDappCustomParams walletSelectDappCustomParams) {
        this.dappCustomParams = walletSelectDappCustomParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDarkMode(boolean z) {
        this.isDarkMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableWithoutBackup(boolean z) {
        this.enableWithoutBackup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHiddenWalletTypeList(List<Integer> list) {
        this.hiddenWalletTypeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedChain(Long l) {
        this.selectedChain = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedWalletId(String str) {
        this.selectedWalletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSearchNetwork(boolean z) {
        this.showSearchNetwork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportChainList(ArrayList<SelectWalletNet> arrayList) {
        this.supportChainList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSelectParams(supportChainList=" + this.supportChainList + ", selectedWalletId=" + this.selectedWalletId + ", selectedChain=" + this.selectedChain + ", contractAddress=" + this.contractAddress + ", contractAddressList=" + this.contractAddressList + ", isBrc20=" + this.isBrc20 + ", enableWithoutBackup=" + this.enableWithoutBackup + ", isDarkMode=" + this.isDarkMode + ", showSearchNetwork=" + this.showSearchNetwork + ", hiddenWalletTypeList=" + this.hiddenWalletTypeList + ", dappCustomParams=" + this.dappCustomParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<SelectWalletNet> arrayList = this.supportChainList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<SelectWalletNet> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.selectedWalletId);
        Long l = this.selectedChain;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.contractAddress);
        parcel.writeStringList(this.contractAddressList);
        Boolean bool = this.isBrc20;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.enableWithoutBackup ? 1 : 0);
        parcel.writeInt(this.isDarkMode ? 1 : 0);
        parcel.writeInt(this.showSearchNetwork ? 1 : 0);
        List<Integer> list = this.hiddenWalletTypeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        WalletSelectDappCustomParams walletSelectDappCustomParams = this.dappCustomParams;
        if (walletSelectDappCustomParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletSelectDappCustomParams.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.WalletSelectParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletSelectParams> serializer() {
            return WalletSelectParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletSelectParams(int i, ArrayList arrayList, String str, Long l, String str2, List list, Boolean bool, boolean z, boolean z2, boolean z3, List list2, WalletSelectDappCustomParams walletSelectDappCustomParams, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportChainList = null;
        } else {
            this.supportChainList = arrayList;
        }
        if ((i & 2) == 0) {
            this.selectedWalletId = null;
        } else {
            this.selectedWalletId = str;
        }
        if ((i & 4) == 0) {
            this.selectedChain = null;
        } else {
            this.selectedChain = l;
        }
        if ((i & 8) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str2;
        }
        if ((i & 16) == 0) {
            this.contractAddressList = null;
        } else {
            this.contractAddressList = list;
        }
        if ((i & 32) == 0) {
            this.isBrc20 = null;
        } else {
            this.isBrc20 = bool;
        }
        if ((i & 64) == 0) {
            this.enableWithoutBackup = false;
        } else {
            this.enableWithoutBackup = z;
        }
        if ((i & 128) == 0) {
            this.isDarkMode = false;
        } else {
            this.isDarkMode = z2;
        }
        if ((i & 256) == 0) {
            this.showSearchNetwork = false;
        } else {
            this.showSearchNetwork = z3;
        }
        if ((i & 512) == 0) {
            this.hiddenWalletTypeList = null;
        } else {
            this.hiddenWalletTypeList = list2;
        }
        if ((i & 1024) == 0) {
            this.dappCustomParams = null;
        } else {
            this.dappCustomParams = walletSelectDappCustomParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(WalletSelectParams walletSelectParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletSelectParams.supportChainList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletSelectParams.supportChainList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletSelectParams.selectedWalletId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletSelectParams.selectedWalletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletSelectParams.selectedChain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, walletSelectParams.selectedChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletSelectParams.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletSelectParams.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletSelectParams.contractAddressList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], walletSelectParams.contractAddressList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletSelectParams.isBrc20 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, walletSelectParams.isBrc20);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletSelectParams.enableWithoutBackup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, walletSelectParams.enableWithoutBackup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || walletSelectParams.isDarkMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, walletSelectParams.isDarkMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || walletSelectParams.showSearchNetwork) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, walletSelectParams.showSearchNetwork);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || walletSelectParams.hiddenWalletTypeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], walletSelectParams.hiddenWalletTypeList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && walletSelectParams.dappCustomParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, WalletSelectDappCustomParams$$serializer.INSTANCE, walletSelectParams.dappCustomParams);
    }

    public WalletSelectParams(ArrayList<SelectWalletNet> arrayList, String str, Long l, String str2, List<String> list, Boolean bool, boolean z, boolean z2, boolean z3, List<Integer> list2, WalletSelectDappCustomParams walletSelectDappCustomParams) {
        this.supportChainList = arrayList;
        this.selectedWalletId = str;
        this.selectedChain = l;
        this.contractAddress = str2;
        this.contractAddressList = list;
        this.isBrc20 = bool;
        this.enableWithoutBackup = z;
        this.isDarkMode = z2;
        this.showSearchNetwork = z3;
        this.hiddenWalletTypeList = list2;
        this.dappCustomParams = walletSelectDappCustomParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r13v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams) : (null com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams))
 A[MD:(java.util.ArrayList<com.okinc.dapp.bean.SelectWalletNet>, java.lang.String, java.lang.Long, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, boolean, boolean, boolean, java.util.List<java.lang.Integer>, com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams):void (m)] (LINE:206) call: com.okinc.business.defi.dapp.net.WalletSelectParams.<init>(java.util.ArrayList, java.lang.String, java.lang.Long, java.lang.String, java.util.List, java.lang.Boolean, boolean, boolean, boolean, java.util.List, com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams):void type: THIS */
    public /* synthetic */ WalletSelectParams(ArrayList arrayList, String str, Long l, String str2, List list, Boolean bool, boolean z, boolean z2, boolean z3, List list2, WalletSelectDappCustomParams walletSelectDappCustomParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false, (i & 512) != 0 ? null : list2, (i & 1024) == 0 ? walletSelectDappCustomParams : null);
    }
}

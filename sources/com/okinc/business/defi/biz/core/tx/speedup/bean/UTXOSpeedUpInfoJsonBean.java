package com.okinc.business.defi.biz.core.tx.speedup.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp$$serializer;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo$$serializer;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer$$serializer;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.DummyInfo$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UTXOSpeedUpInfoJsonBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private BRC20Buyer brc20Buyer;
    private String changeAddress;
    private List<UtxoInfo> cpfpSpeedUpUtxo;
    private DummyInfo dummyInfo;
    private String feeRate;
    private String sequence;
    private List<UtxoInfo> utxoList;
    private List<UTXOInfoResp> utxoNewList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOSpeedUpInfoJsonBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UTXOSpeedUpInfoJsonBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOSpeedUpInfoJsonBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UTXOInfoResp.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(UtxoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            DummyInfo dummyInfo = (DummyInfo) parcel.readParcelable(UTXOSpeedUpInfoJsonBean.class.getClassLoader());
            BRC20Buyer bRC20Buyer = (BRC20Buyer) parcel.readParcelable(UTXOSpeedUpInfoJsonBean.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(UtxoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new UTXOSpeedUpInfoJsonBean(string, string2, string3, arrayList, arrayList2, dummyInfo, bRC20Buyer, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOSpeedUpInfoJsonBean[] newArray(int i) {
            return new UTXOSpeedUpInfoJsonBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOSpeedUpInfoJsonBean() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, (DummyInfo) null, (BRC20Buyer) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOInfoResp> component4() {
        return this.utxoNewList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> component5() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DummyInfo component6() {
        return this.dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20Buyer component7() {
        return this.brc20Buyer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> component8() {
        return this.cpfpSpeedUpUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean copy(String str, String str2, String str3, List<UTXOInfoResp> list, List<UtxoInfo> list2, DummyInfo dummyInfo, BRC20Buyer bRC20Buyer, List<UtxoInfo> list3) {
        return new UTXOSpeedUpInfoJsonBean(str, str2, str3, list, list2, dummyInfo, bRC20Buyer, list3);
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
        if (!(obj instanceof UTXOSpeedUpInfoJsonBean)) {
            return false;
        }
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = (UTXOSpeedUpInfoJsonBean) obj;
        return Intrinsics.EZpvd((Object) this.feeRate, (Object) uTXOSpeedUpInfoJsonBean.feeRate) && Intrinsics.EZpvd((Object) this.sequence, (Object) uTXOSpeedUpInfoJsonBean.sequence) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) uTXOSpeedUpInfoJsonBean.changeAddress) && Intrinsics.EZpvd(this.utxoNewList, uTXOSpeedUpInfoJsonBean.utxoNewList) && Intrinsics.EZpvd(this.utxoList, uTXOSpeedUpInfoJsonBean.utxoList) && Intrinsics.EZpvd(this.dummyInfo, uTXOSpeedUpInfoJsonBean.dummyInfo) && Intrinsics.EZpvd(this.brc20Buyer, uTXOSpeedUpInfoJsonBean.brc20Buyer) && Intrinsics.EZpvd(this.cpfpSpeedUpUtxo, uTXOSpeedUpInfoJsonBean.cpfpSpeedUpUtxo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20Buyer getBrc20Buyer() {
        return this.brc20Buyer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> getCpfpSpeedUpUtxo() {
        return this.cpfpSpeedUpUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DummyInfo getDummyInfo() {
        return this.dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> getUtxoList() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOInfoResp> getUtxoNewList() {
        return this.utxoNewList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.feeRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sequence;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.changeAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<UTXOInfoResp> list = this.utxoNewList;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<UtxoInfo> list2 = this.utxoList;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        DummyInfo dummyInfo = this.dummyInfo;
        int iHashCode6 = dummyInfo == null ? 0 : dummyInfo.hashCode();
        BRC20Buyer bRC20Buyer = this.brc20Buyer;
        int iHashCode7 = bRC20Buyer == null ? 0 : bRC20Buyer.hashCode();
        List<UtxoInfo> list3 = this.cpfpSpeedUpUtxo;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrc20Buyer(BRC20Buyer bRC20Buyer) {
        this.brc20Buyer = bRC20Buyer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(String str) {
        this.changeAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCpfpSpeedUpUtxo(List<UtxoInfo> list) {
        this.cpfpSpeedUpUtxo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyInfo(DummyInfo dummyInfo) {
        this.dummyInfo = dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSequence(String str) {
        this.sequence = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoList(List<UtxoInfo> list) {
        this.utxoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoNewList(List<UTXOInfoResp> list) {
        this.utxoNewList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOSpeedUpInfoJsonBean(feeRate=" + this.feeRate + ", sequence=" + this.sequence + ", changeAddress=" + this.changeAddress + ", utxoNewList=" + this.utxoNewList + ", utxoList=" + this.utxoList + ", dummyInfo=" + this.dummyInfo + ", brc20Buyer=" + this.brc20Buyer + ", cpfpSpeedUpUtxo=" + this.cpfpSpeedUpUtxo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.feeRate);
        parcel.writeString(this.sequence);
        parcel.writeString(this.changeAddress);
        List<UTXOInfoResp> list = this.utxoNewList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UTXOInfoResp> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<UtxoInfo> list2 = this.utxoList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<UtxoInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.dummyInfo, i);
        parcel.writeParcelable(this.brc20Buyer, i);
        List<UtxoInfo> list3 = this.cpfpSpeedUpUtxo;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<UtxoInfo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXOSpeedUpInfoJsonBean> serializer() {
            return UTXOSpeedUpInfoJsonBean$$serializer.INSTANCE;
        }
    }

    static {
        UtxoInfo$$serializer utxoInfo$$serializer = UtxoInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(UTXOInfoResp$$serializer.INSTANCE), new ArrayListSerializer(utxoInfo$$serializer), null, null, new ArrayListSerializer(utxoInfo$$serializer)};
    }

    public /* synthetic */ UTXOSpeedUpInfoJsonBean(int i, String str, String str2, String str3, List list, List list2, DummyInfo dummyInfo, BRC20Buyer bRC20Buyer, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str;
        }
        if ((i & 2) == 0) {
            this.sequence = null;
        } else {
            this.sequence = str2;
        }
        if ((i & 4) == 0) {
            this.changeAddress = null;
        } else {
            this.changeAddress = str3;
        }
        if ((i & 8) == 0) {
            this.utxoNewList = null;
        } else {
            this.utxoNewList = list;
        }
        if ((i & 16) == 0) {
            this.utxoList = null;
        } else {
            this.utxoList = list2;
        }
        if ((i & 32) == 0) {
            this.dummyInfo = null;
        } else {
            this.dummyInfo = dummyInfo;
        }
        if ((i & 64) == 0) {
            this.brc20Buyer = null;
        } else {
            this.brc20Buyer = bRC20Buyer;
        }
        if ((i & 128) == 0) {
            this.cpfpSpeedUpUtxo = null;
        } else {
            this.cpfpSpeedUpUtxo = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOSpeedUpInfoJsonBean.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXOSpeedUpInfoJsonBean.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXOSpeedUpInfoJsonBean.sequence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXOSpeedUpInfoJsonBean.sequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXOSpeedUpInfoJsonBean.changeAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uTXOSpeedUpInfoJsonBean.changeAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXOSpeedUpInfoJsonBean.utxoNewList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], uTXOSpeedUpInfoJsonBean.utxoNewList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXOSpeedUpInfoJsonBean.utxoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], uTXOSpeedUpInfoJsonBean.utxoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXOSpeedUpInfoJsonBean.dummyInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, DummyInfo$$serializer.INSTANCE, uTXOSpeedUpInfoJsonBean.dummyInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXOSpeedUpInfoJsonBean.brc20Buyer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BRC20Buyer$$serializer.INSTANCE, uTXOSpeedUpInfoJsonBean.brc20Buyer);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && uTXOSpeedUpInfoJsonBean.cpfpSpeedUpUtxo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], uTXOSpeedUpInfoJsonBean.cpfpSpeedUpUtxo);
    }

    public UTXOSpeedUpInfoJsonBean(String str, String str2, String str3, List<UTXOInfoResp> list, List<UtxoInfo> list2, DummyInfo dummyInfo, BRC20Buyer bRC20Buyer, List<UtxoInfo> list3) {
        this.feeRate = str;
        this.sequence = str2;
        this.changeAddress = str3;
        this.utxoNewList = list;
        this.utxoList = list2;
        this.dummyInfo = dummyInfo;
        this.brc20Buyer = bRC20Buyer;
        this.cpfpSpeedUpUtxo = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:com.okinc.wallet.core.sign.utxo.DummyInfo:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.DummyInfo) : (r15v0 com.okinc.wallet.core.sign.utxo.DummyInfo))
  (wrap:com.okinc.wallet.core.sign.utxo.BRC20Buyer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.BRC20Buyer) : (r16v0 com.okinc.wallet.core.sign.utxo.BRC20Buyer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.UTXOInfoResp>, java.util.List<com.okinc.business.defi.biz.net.bean.UtxoInfo>, com.okinc.wallet.core.sign.utxo.DummyInfo, com.okinc.wallet.core.sign.utxo.BRC20Buyer, java.util.List<com.okinc.business.defi.biz.net.bean.UtxoInfo>):void (m)] (LINE:53) call: com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.wallet.core.sign.utxo.DummyInfo, com.okinc.wallet.core.sign.utxo.BRC20Buyer, java.util.List):void type: THIS */
    public /* synthetic */ UTXOSpeedUpInfoJsonBean(String str, String str2, String str3, List list, List list2, DummyInfo dummyInfo, BRC20Buyer bRC20Buyer, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : dummyInfo, (i & 64) != 0 ? null : bRC20Buyer, (i & 128) == 0 ? list3 : null);
    }
}

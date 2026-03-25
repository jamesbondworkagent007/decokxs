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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappBTCUTXOResp implements Parcelable {
    private Long chainIndex;
    private String gasFee;
    private Boolean isShowFee;
    private List<DappBTCUTXOAllInfo> utxoAllInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBTCUTXOResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(DappBTCUTXOAllInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappBTCUTXOResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DappBTCUTXOAllInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DappBTCUTXOResp(lValueOf, string, boolValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOResp[] newArray(int i) {
            return new DappBTCUTXOResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappBTCUTXOResp() {
        this((Long) null, (String) null, (Boolean) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappBTCUTXOResp copy$default(DappBTCUTXOResp dappBTCUTXOResp, Long l, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = dappBTCUTXOResp.chainIndex;
        }
        if ((i & 2) != 0) {
            str = dappBTCUTXOResp.gasFee;
        }
        if ((i & 4) != 0) {
            bool = dappBTCUTXOResp.isShowFee;
        }
        if ((i & 8) != 0) {
            list = dappBTCUTXOResp.utxoAllInfos;
        }
        return dappBTCUTXOResp.copy(l, str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isShowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOAllInfo> component4() {
        return this.utxoAllInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBTCUTXOResp copy(Long l, String str, Boolean bool, List<DappBTCUTXOAllInfo> list) {
        return new DappBTCUTXOResp(l, str, bool, list);
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
        if (!(obj instanceof DappBTCUTXOResp)) {
            return false;
        }
        DappBTCUTXOResp dappBTCUTXOResp = (DappBTCUTXOResp) obj;
        return Intrinsics.EZpvd(this.chainIndex, dappBTCUTXOResp.chainIndex) && Intrinsics.EZpvd((Object) this.gasFee, (Object) dappBTCUTXOResp.gasFee) && Intrinsics.EZpvd(this.isShowFee, dappBTCUTXOResp.isShowFee) && Intrinsics.EZpvd(this.utxoAllInfos, dappBTCUTXOResp.utxoAllInfos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOAllInfo> getUtxoAllInfos() {
        return this.utxoAllInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainIndex;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.gasFee;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.isShowFee;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        List<DappBTCUTXOAllInfo> list = this.utxoAllInfos;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isShowFee() {
        return this.isShowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasFee(String str) {
        this.gasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowFee(Boolean bool) {
        this.isShowFee = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoAllInfos(List<DappBTCUTXOAllInfo> list) {
        this.utxoAllInfos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBTCUTXOResp(chainIndex=" + this.chainIndex + ", gasFee=" + this.gasFee + ", isShowFee=" + this.isShowFee + ", utxoAllInfos=" + this.utxoAllInfos + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.gasFee);
        Boolean bool = this.isShowFee;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<DappBTCUTXOAllInfo> list = this.utxoAllInfos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DappBTCUTXOAllInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBTCUTXOResp> serializer() {
            return DappBTCUTXOResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappBTCUTXOResp(int i, Long l, String str, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = l;
        }
        if ((i & 2) == 0) {
            this.gasFee = null;
        } else {
            this.gasFee = str;
        }
        if ((i & 4) == 0) {
            this.isShowFee = null;
        } else {
            this.isShowFee = bool;
        }
        if ((i & 8) == 0) {
            this.utxoAllInfos = null;
        } else {
            this.utxoAllInfos = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBTCUTXOResp dappBTCUTXOResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBTCUTXOResp.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, dappBTCUTXOResp.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBTCUTXOResp.gasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappBTCUTXOResp.gasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappBTCUTXOResp.isShowFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, dappBTCUTXOResp.isShowFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && dappBTCUTXOResp.utxoAllInfos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], dappBTCUTXOResp.utxoAllInfos);
    }

    public DappBTCUTXOResp(Long l, String str, Boolean bool, List<DappBTCUTXOAllInfo> list) {
        this.chainIndex = l;
        this.gasFee = str;
        this.isShowFee = bool;
        this.utxoAllInfos = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.String, java.lang.Boolean, java.util.List<com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo>):void (m)] (LINE:1582) call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp.<init>(java.lang.Long, java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ DappBTCUTXOResp(Long l, String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list);
    }
}

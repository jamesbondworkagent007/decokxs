package com.okinc.business.defi.dapp.net;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappDetailReq implements Parcelable {
    private List<Long> dappDynamicChainList;
    private Long dappId;
    private Integer rewardConfig;
    private String rewardWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappDetailReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<DappDetailReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDetailReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new DappDetailReq(arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDetailReq[] newArray(int i) {
            return new DappDetailReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.DappDetailReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappDetailReq copy$default(DappDetailReq dappDetailReq, List list, Long l, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dappDetailReq.dappDynamicChainList;
        }
        if ((i & 2) != 0) {
            l = dappDetailReq.dappId;
        }
        if ((i & 4) != 0) {
            num = dappDetailReq.rewardConfig;
        }
        if ((i & 8) != 0) {
            str = dappDetailReq.rewardWalletAddress;
        }
        return dappDetailReq.copy(list, l, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.dappDynamicChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.rewardConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rewardWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappDetailReq copy(@NotNull List<Long> list, Long l, Integer num, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DappDetailReq(list, l, num, str);
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
        if (!(obj instanceof DappDetailReq)) {
            return false;
        }
        DappDetailReq dappDetailReq = (DappDetailReq) obj;
        return Intrinsics.EZpvd(this.dappDynamicChainList, dappDetailReq.dappDynamicChainList) && Intrinsics.EZpvd(this.dappId, dappDetailReq.dappId) && Intrinsics.EZpvd(this.rewardConfig, dappDetailReq.rewardConfig) && Intrinsics.EZpvd((Object) this.rewardWalletAddress, (Object) dappDetailReq.rewardWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getDappDynamicChainList() {
        return this.dappDynamicChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDappId() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRewardConfig() {
        return this.rewardConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardWalletAddress() {
        return this.rewardWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dappDynamicChainList.hashCode();
        Long l = this.dappId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Integer num = this.rewardConfig;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.rewardWalletAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappDynamicChainList(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappDynamicChainList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappId(Long l) {
        this.dappId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardConfig(Integer num) {
        this.rewardConfig = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardWalletAddress(String str) {
        this.rewardWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappDetailReq(dappDynamicChainList=" + this.dappDynamicChainList + ", dappId=" + this.dappId + ", rewardConfig=" + this.rewardConfig + ", rewardWalletAddress=" + this.rewardWalletAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.dappDynamicChainList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        Long l = this.dappId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.rewardConfig;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.rewardWalletAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappDetailReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappDetailReq> serializer() {
            return DappDetailReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappDetailReq(int i, List list, Long l, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DappDetailReq$$serializer.INSTANCE.getDescriptor());
        }
        this.dappDynamicChainList = list;
        this.dappId = l;
        if ((i & 4) == 0) {
            this.rewardConfig = 0;
        } else {
            this.rewardConfig = num;
        }
        if ((i & 8) == 0) {
            this.rewardWalletAddress = "";
        } else {
            this.rewardWalletAddress = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappDetailReq dappDetailReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], dappDetailReq.dappDynamicChainList);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, dappDetailReq.dappId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = dappDetailReq.rewardConfig) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, dappDetailReq.rewardConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) dappDetailReq.rewardWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dappDetailReq.rewardWalletAddress);
    }

    public DappDetailReq(@NotNull List<Long> list, Long l, Integer num, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappDynamicChainList = list;
        this.dappId = l;
        this.rewardConfig = num;
        this.rewardWalletAddress = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.lang.Long)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Long>, java.lang.Long, java.lang.Integer, java.lang.String):void (m)] (LINE:158) call: com.okinc.business.defi.dapp.net.DappDetailReq.<init>(java.util.List, java.lang.Long, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ DappDetailReq(List list, Long l, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, l, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? "" : str);
    }
}

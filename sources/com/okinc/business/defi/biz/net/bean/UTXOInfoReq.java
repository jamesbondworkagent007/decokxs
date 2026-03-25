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
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UTXOInfoReq implements Parcelable {
    private Long coinId;
    private List<UTXOAddressInfoReq> utxoRequests;
    private int venuesForUTest;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOInfoReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UTXOAddressInfoReq$$serializer.INSTANCE)};
    private static final int VENUES_UTEST_ASSET = 1;
    private static final int VENUES_UTEST_FEE = 2;
    private static final int VENUES_UTEST_BALANCE = 3;

    public static final class Creator implements Parcelable.Creator<UTXOInfoReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOInfoReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(UTXOAddressInfoReq.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new UTXOInfoReq(lValueOf, arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOInfoReq[] newArray(int i) {
            return new UTXOInfoReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOInfoReq() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.UTXOInfoReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UTXOInfoReq copy$default(UTXOInfoReq uTXOInfoReq, Long l, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = uTXOInfoReq.coinId;
        }
        if ((i2 & 2) != 0) {
            list = uTXOInfoReq.utxoRequests;
        }
        if ((i2 & 4) != 0) {
            i = uTXOInfoReq.venuesForUTest;
        }
        return uTXOInfoReq.copy(l, list, i);
    }

    @Transient
    public static /* synthetic */ void getVenuesForUTest$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOAddressInfoReq> component2() {
        return this.utxoRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.venuesForUTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOInfoReq copy(Long l, List<UTXOAddressInfoReq> list, int i) {
        return new UTXOInfoReq(l, list, i);
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
        if (!(obj instanceof UTXOInfoReq)) {
            return false;
        }
        UTXOInfoReq uTXOInfoReq = (UTXOInfoReq) obj;
        return Intrinsics.EZpvd(this.coinId, uTXOInfoReq.coinId) && Intrinsics.EZpvd(this.utxoRequests, uTXOInfoReq.utxoRequests) && this.venuesForUTest == uTXOInfoReq.venuesForUTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOAddressInfoReq> getUtxoRequests() {
        return this.utxoRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVenuesForUTest() {
        return this.venuesForUTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        List<UTXOAddressInfoReq> list = this.utxoRequests;
        return (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.venuesForUTest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoRequests(List<UTXOAddressInfoReq> list) {
        this.utxoRequests = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVenuesForUTest(int i) {
        this.venuesForUTest = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOInfoReq(coinId=" + this.coinId + ", utxoRequests=" + this.utxoRequests + ", venuesForUTest=" + this.venuesForUTest + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<UTXOAddressInfoReq> list = this.utxoRequests;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UTXOAddressInfoReq> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.venuesForUTest);
    }

    public /* synthetic */ UTXOInfoReq(int i, Long l, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.utxoRequests = null;
        } else {
            this.utxoRequests = list;
        }
        this.venuesForUTest = 0;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOInfoReq uTXOInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOInfoReq.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, uTXOInfoReq.coinId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && uTXOInfoReq.utxoRequests == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], uTXOInfoReq.utxoRequests);
    }

    public UTXOInfoReq(Long l, List<UTXOAddressInfoReq> list, int i) {
        this.coinId = l;
        this.utxoRequests = list;
        this.venuesForUTest = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.Long, java.util.List<com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq>, int):void (m)] (LINE:14) call: com.okinc.business.defi.biz.net.bean.UTXOInfoReq.<init>(java.lang.Long, java.util.List, int):void type: THIS */
    public /* synthetic */ UTXOInfoReq(Long l, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : i);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UTXOInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UTXOInfoReq> serializer() {
            return UTXOInfoReq$$serializer.INSTANCE;
        }

        public final int OLrzqt() {
            return UTXOInfoReq.VENUES_UTEST_ASSET;
        }

        public final int KWHzl() {
            return UTXOInfoReq.VENUES_UTEST_FEE;
        }

        public final int copydefault() {
            return UTXOInfoReq.VENUES_UTEST_BALANCE;
        }
    }
}

package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CheckBatchChainReq implements Parcelable {
    public static final int CHECK_TYPE_MEMO = 1;
    private List<String> addresses;
    private long chainIndex;
    private int checkType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckBatchChainReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CheckBatchChainReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckBatchChainReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckBatchChainReq(parcel.readLong(), parcel.readInt(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckBatchChainReq[] newArray(int i) {
            return new CheckBatchChainReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.CheckBatchChainReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckBatchChainReq copy$default(CheckBatchChainReq checkBatchChainReq, long j, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = checkBatchChainReq.chainIndex;
        }
        if ((i2 & 2) != 0) {
            i = checkBatchChainReq.checkType;
        }
        if ((i2 & 4) != 0) {
            list = checkBatchChainReq.addresses;
        }
        return checkBatchChainReq.copy(j, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.checkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckBatchChainReq copy(long j, int i, List<String> list) {
        return new CheckBatchChainReq(j, i, list);
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
        if (!(obj instanceof CheckBatchChainReq)) {
            return false;
        }
        CheckBatchChainReq checkBatchChainReq = (CheckBatchChainReq) obj;
        return this.chainIndex == checkBatchChainReq.chainIndex && this.checkType == checkBatchChainReq.checkType && Intrinsics.EZpvd(this.addresses, checkBatchChainReq.addresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCheckType() {
        return this.checkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainIndex);
        int iHashCode2 = Integer.hashCode(this.checkType);
        List<String> list = this.addresses;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddresses(List<String> list) {
        this.addresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(long j) {
        this.chainIndex = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckType(int i) {
        this.checkType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckBatchChainReq(chainIndex=" + this.chainIndex + ", checkType=" + this.checkType + ", addresses=" + this.addresses + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainIndex);
        parcel.writeInt(this.checkType);
        parcel.writeStringList(this.addresses);
    }

    public /* synthetic */ CheckBatchChainReq(int i, long j, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CheckBatchChainReq$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = j;
        this.checkType = i2;
        if ((i & 4) == 0) {
            this.addresses = null;
        } else {
            this.addresses = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckBatchChainReq checkBatchChainReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, checkBatchChainReq.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, checkBatchChainReq.checkType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && checkBatchChainReq.addresses == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], checkBatchChainReq.addresses);
    }

    public CheckBatchChainReq(long j, int i, List<String> list) {
        this.chainIndex = j;
        this.checkType = i;
        this.addresses = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (r3v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(long, int, java.util.List<java.lang.String>):void (m)] (LINE:1536) call: com.okinc.business.defi.biz.net.bean.CheckBatchChainReq.<init>(long, int, java.util.List):void type: THIS */
    public /* synthetic */ CheckBatchChainReq(long j, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : list);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckBatchChainReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckBatchChainReq> serializer() {
            return CheckBatchChainReq$$serializer.INSTANCE;
        }
    }
}

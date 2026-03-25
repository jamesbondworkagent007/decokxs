package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DiscoverSearchParam implements Parcelable {
    public static final int $stable = 0;
    private final Long pageNum;
    private final Long pageSize;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DiscoverSearchParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DiscoverSearchParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverSearchParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DiscoverSearchParam(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverSearchParam[] newArray(int i) {
            return new DiscoverSearchParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DiscoverSearchParam() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DiscoverSearchParam copy$default(DiscoverSearchParam discoverSearchParam, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = discoverSearchParam.pageNum;
        }
        if ((i & 2) != 0) {
            l2 = discoverSearchParam.pageSize;
        }
        return discoverSearchParam.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscoverSearchParam copy(Long l, Long l2) {
        return new DiscoverSearchParam(l, l2);
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
        if (!(obj instanceof DiscoverSearchParam)) {
            return false;
        }
        DiscoverSearchParam discoverSearchParam = (DiscoverSearchParam) obj;
        return Intrinsics.EZpvd(this.pageNum, discoverSearchParam.pageNum) && Intrinsics.EZpvd(this.pageSize, discoverSearchParam.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.pageNum;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.pageSize;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DiscoverSearchParam(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.pageNum;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.pageSize;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DiscoverSearchParam> serializer() {
            return DiscoverSearchParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DiscoverSearchParam(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pageNum = null;
        } else {
            this.pageNum = l;
        }
        if ((i & 2) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DiscoverSearchParam discoverSearchParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || discoverSearchParam.pageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, discoverSearchParam.pageNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && discoverSearchParam.pageSize == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, discoverSearchParam.pageSize);
    }

    public DiscoverSearchParam(Long l, Long l2) {
        this.pageNum = l;
        this.pageSize = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long):void (m)] (LINE:30) call: com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam.<init>(java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ DiscoverSearchParam(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}

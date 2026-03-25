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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncCoinsReq implements Parcelable {
    private List<Long> coinIds;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SyncCoinsReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LongSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SyncCoinsReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncCoinsReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new SyncCoinsReq(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncCoinsReq[] newArray(int i) {
            return new SyncCoinsReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SyncCoinsReq() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SyncCoinsReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncCoinsReq copy$default(SyncCoinsReq syncCoinsReq, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncCoinsReq.coinIds;
        }
        if ((i & 2) != 0) {
            str = syncCoinsReq.userUniqueId;
        }
        return syncCoinsReq.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncCoinsReq copy(@NotNull List<Long> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SyncCoinsReq(list, str);
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
        if (!(obj instanceof SyncCoinsReq)) {
            return false;
        }
        SyncCoinsReq syncCoinsReq = (SyncCoinsReq) obj;
        return Intrinsics.EZpvd(this.coinIds, syncCoinsReq.coinIds) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) syncCoinsReq.userUniqueId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.coinIds.hashCode() * 31) + this.userUniqueId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncCoinsReq(coinIds=" + this.coinIds + ", userUniqueId=" + this.userUniqueId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.coinIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        parcel.writeString(this.userUniqueId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncCoinsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncCoinsReq> serializer() {
            return SyncCoinsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncCoinsReq(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinIds = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncCoinsReq syncCoinsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(syncCoinsReq.coinIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], syncCoinsReq.coinIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) syncCoinsReq.userUniqueId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, syncCoinsReq.userUniqueId);
    }

    public SyncCoinsReq(@NotNull List<Long> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.coinIds = list;
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:557) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Long>, java.lang.String):void (m)] (LINE:556) call: com.okinc.business.defi.biz.net.bean.SyncCoinsReq.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SyncCoinsReq(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
    }
}

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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappFavouriteRecommendReq implements Parcelable {
    private List<Long> dappdynamicChainList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappFavouriteRecommendReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappFavouriteRecommendReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappFavouriteRecommendReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new DappFavouriteRecommendReq(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappFavouriteRecommendReq[] newArray(int i) {
            return new DappFavouriteRecommendReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.DappFavouriteRecommendReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappFavouriteRecommendReq copy$default(DappFavouriteRecommendReq dappFavouriteRecommendReq, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dappFavouriteRecommendReq.dappdynamicChainList;
        }
        return dappFavouriteRecommendReq.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.dappdynamicChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappFavouriteRecommendReq copy(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DappFavouriteRecommendReq(list);
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
        return (obj instanceof DappFavouriteRecommendReq) && Intrinsics.EZpvd(this.dappdynamicChainList, ((DappFavouriteRecommendReq) obj).dappdynamicChainList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getDappdynamicChainList() {
        return this.dappdynamicChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.dappdynamicChainList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappdynamicChainList(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappdynamicChainList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappFavouriteRecommendReq(dappdynamicChainList=" + this.dappdynamicChainList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.dappdynamicChainList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappFavouriteRecommendReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappFavouriteRecommendReq> serializer() {
            return DappFavouriteRecommendReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappFavouriteRecommendReq(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DappFavouriteRecommendReq$$serializer.INSTANCE.getDescriptor());
        }
        this.dappdynamicChainList = list;
    }

    public DappFavouriteRecommendReq(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappdynamicChainList = list;
    }
}

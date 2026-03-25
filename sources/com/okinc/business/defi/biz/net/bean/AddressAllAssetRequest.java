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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressAllAssetRequest implements Parcelable {
    private final String address;
    private final List<Long> chainIndexes;
    private final boolean forceRefresh;
    private final boolean hideValueless;
    private final int limit;
    private final int page;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressAllAssetRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AddressAllAssetRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new AddressAllAssetRequest(string, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetRequest[] newArray(int i) {
            return new AddressAllAssetRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressAllAssetRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressAllAssetRequest copy$default(AddressAllAssetRequest addressAllAssetRequest, String str, List list, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = addressAllAssetRequest.address;
        }
        if ((i3 & 2) != 0) {
            list = addressAllAssetRequest.chainIndexes;
        }
        List list2 = list;
        if ((i3 & 4) != 0) {
            z = addressAllAssetRequest.hideValueless;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = addressAllAssetRequest.forceRefresh;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            i = addressAllAssetRequest.page;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = addressAllAssetRequest.limit;
        }
        return addressAllAssetRequest.copy(str, list2, z3, z4, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hideValueless;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.forceRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAllAssetRequest copy(@NotNull String str, List<Long> list, boolean z, boolean z2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressAllAssetRequest(str, list, z, z2, i, i2);
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
        if (!(obj instanceof AddressAllAssetRequest)) {
            return false;
        }
        AddressAllAssetRequest addressAllAssetRequest = (AddressAllAssetRequest) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressAllAssetRequest.address) && Intrinsics.EZpvd(this.chainIndexes, addressAllAssetRequest.chainIndexes) && this.hideValueless == addressAllAssetRequest.hideValueless && this.forceRefresh == addressAllAssetRequest.forceRefresh && this.page == addressAllAssetRequest.page && this.limit == addressAllAssetRequest.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getChainIndexes() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideValueless() {
        return this.hideValueless;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        List<Long> list = this.chainIndexes;
        return (((((((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.hideValueless)) * 31) + Boolean.hashCode(this.forceRefresh)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAllAssetRequest(address=" + this.address + ", chainIndexes=" + this.chainIndexes + ", hideValueless=" + this.hideValueless + ", forceRefresh=" + this.forceRefresh + ", page=" + this.page + ", limit=" + this.limit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        List<Long> list = this.chainIndexes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        parcel.writeInt(this.hideValueless ? 1 : 0);
        parcel.writeInt(this.forceRefresh ? 1 : 0);
        parcel.writeInt(this.page);
        parcel.writeInt(this.limit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressAllAssetRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAllAssetRequest> serializer() {
            return AddressAllAssetRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressAllAssetRequest(int i, String str, List list, boolean z, boolean z2, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, AddressAllAssetRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.chainIndexes = list;
        this.hideValueless = z;
        this.forceRefresh = z2;
        this.page = i2;
        this.limit = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressAllAssetRequest addressAllAssetRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressAllAssetRequest.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressAllAssetRequest.chainIndexes);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, addressAllAssetRequest.hideValueless);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, addressAllAssetRequest.forceRefresh);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, addressAllAssetRequest.page);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, addressAllAssetRequest.limit);
    }

    public AddressAllAssetRequest(@NotNull String str, List<Long> list, boolean z, boolean z2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.chainIndexes = list;
        this.hideValueless = z;
        this.forceRefresh = z2;
        this.page = i;
        this.limit = i2;
    }
}

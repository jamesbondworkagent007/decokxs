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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressCheckResItem implements Parcelable {
    private final List<String> causeRiskItem;
    private final Long chainId;
    private final Long chainIndex;
    private final String from;
    private final String to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCheckResItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AddressCheckResItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckResItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCheckResItem(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckResItem[] newArray(int i) {
            return new AddressCheckResItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCheckResItem() {
        this((Long) null, (Long) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressCheckResItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressCheckResItem copy$default(AddressCheckResItem addressCheckResItem, Long l, Long l2, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addressCheckResItem.chainIndex;
        }
        if ((i & 2) != 0) {
            l2 = addressCheckResItem.chainId;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = addressCheckResItem.from;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = addressCheckResItem.to;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = addressCheckResItem.causeRiskItem;
        }
        return addressCheckResItem.copy(l, l3, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCheckResItem copy(Long l, Long l2, String str, String str2, List<String> list) {
        return new AddressCheckResItem(l, l2, str, str2, list);
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
        if (!(obj instanceof AddressCheckResItem)) {
            return false;
        }
        AddressCheckResItem addressCheckResItem = (AddressCheckResItem) obj;
        return Intrinsics.EZpvd(this.chainIndex, addressCheckResItem.chainIndex) && Intrinsics.EZpvd(this.chainId, addressCheckResItem.chainId) && Intrinsics.EZpvd((Object) this.from, (Object) addressCheckResItem.from) && Intrinsics.EZpvd((Object) this.to, (Object) addressCheckResItem.to) && Intrinsics.EZpvd(this.causeRiskItem, addressCheckResItem.causeRiskItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCauseRiskItem() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainIndex;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.chainId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.from;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.to;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.causeRiskItem;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCheckResItem(chainIndex=" + this.chainIndex + ", chainId=" + this.chainId + ", from=" + this.from + ", to=" + this.to + ", causeRiskItem=" + this.causeRiskItem + ")";
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
        Long l2 = this.chainId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeStringList(this.causeRiskItem);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCheckResItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCheckResItem> serializer() {
            return AddressCheckResItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCheckResItem(int i, Long l, Long l2, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainIndex = (i & 1) == 0 ? -1L : l;
        if ((i & 2) == 0) {
            this.chainId = -1L;
        } else {
            this.chainId = l2;
        }
        if ((i & 4) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 8) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 16) == 0) {
            this.causeRiskItem = yDY.AhwBna();
        } else {
            this.causeRiskItem = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCheckResItem addressCheckResItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l2 = addressCheckResItem.chainIndex) == null || l2.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, addressCheckResItem.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = addressCheckResItem.chainId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, addressCheckResItem.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressCheckResItem.from, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressCheckResItem.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressCheckResItem.to, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, addressCheckResItem.to);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(addressCheckResItem.causeRiskItem, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], addressCheckResItem.causeRiskItem);
    }

    public AddressCheckResItem(Long l, Long l2, String str, String str2, List<String> list) {
        this.chainIndex = l;
        this.chainId = l2;
        this.from = str;
        this.to = str2;
        this.causeRiskItem = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressCheckResItem(Long l, Long l2, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l : l, (i & 2) == 0 ? l2 : -1L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? yDY.AhwBna() : list);
    }
}

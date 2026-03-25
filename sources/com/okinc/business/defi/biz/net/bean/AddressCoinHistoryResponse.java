package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressCoinHistoryResponse implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<AddressCoinHistoryDetail> content;
    private Map<String, String> explorerUrl;
    private Boolean hasViewMore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCoinHistoryResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressCoinHistoryResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddressCoinHistoryDetail.CREATOR.createFromParcel(parcel));
                }
            }
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AddressCoinHistoryResponse(arrayList, boolValueOf, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryResponse[] newArray(int i) {
            return new AddressCoinHistoryResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCoinHistoryResponse() {
        this((List) null, (Boolean) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressCoinHistoryResponse copy$default(AddressCoinHistoryResponse addressCoinHistoryResponse, List list, Boolean bool, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addressCoinHistoryResponse.content;
        }
        if ((i & 2) != 0) {
            bool = addressCoinHistoryResponse.hasViewMore;
        }
        if ((i & 4) != 0) {
            map = addressCoinHistoryResponse.explorerUrl;
        }
        return addressCoinHistoryResponse.copy(list, bool, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCoinHistoryDetail> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinHistoryResponse copy(List<AddressCoinHistoryDetail> list, Boolean bool, Map<String, String> map) {
        return new AddressCoinHistoryResponse(list, bool, map);
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
        if (!(obj instanceof AddressCoinHistoryResponse)) {
            return false;
        }
        AddressCoinHistoryResponse addressCoinHistoryResponse = (AddressCoinHistoryResponse) obj;
        return Intrinsics.EZpvd(this.content, addressCoinHistoryResponse.content) && Intrinsics.EZpvd(this.hasViewMore, addressCoinHistoryResponse.hasViewMore) && Intrinsics.EZpvd(this.explorerUrl, addressCoinHistoryResponse.explorerUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCoinHistoryDetail> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasViewMore() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AddressCoinHistoryDetail> list = this.content;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.hasViewMore;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Map<String, String> map = this.explorerUrl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(List<AddressCoinHistoryDetail> list) {
        this.content = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(Map<String, String> map) {
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasViewMore(Boolean bool) {
        this.hasViewMore = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinHistoryResponse(content=" + this.content + ", hasViewMore=" + this.hasViewMore + ", explorerUrl=" + this.explorerUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<AddressCoinHistoryDetail> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddressCoinHistoryDetail> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasViewMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Map<String, String> map = this.explorerUrl;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinHistoryResponse> serializer() {
            return AddressCoinHistoryResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(AddressCoinHistoryDetail$$serializer.INSTANCE), null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ AddressCoinHistoryResponse(int i, List list, Boolean bool, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
        if ((i & 2) == 0) {
            this.hasViewMore = Boolean.TRUE;
        } else {
            this.hasViewMore = bool;
        }
        if ((i & 4) == 0) {
            this.explorerUrl = null;
        } else {
            this.explorerUrl = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinHistoryResponse addressCoinHistoryResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressCoinHistoryResponse.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], addressCoinHistoryResponse.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(addressCoinHistoryResponse.hasViewMore, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, addressCoinHistoryResponse.hasViewMore);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && addressCoinHistoryResponse.explorerUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], addressCoinHistoryResponse.explorerUrl);
    }

    public AddressCoinHistoryResponse(List<AddressCoinHistoryDetail> list, Boolean bool, Map<String, String> map) {
        this.content = list;
        this.hasViewMore = bool;
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail>, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:1807) call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse.<init>(java.util.List, java.lang.Boolean, java.util.Map):void type: THIS */
    public /* synthetic */ AddressCoinHistoryResponse(List list, Boolean bool, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? null : map);
    }
}

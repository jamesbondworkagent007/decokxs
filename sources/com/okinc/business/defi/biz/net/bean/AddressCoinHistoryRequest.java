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
public final class AddressCoinHistoryRequest implements Parcelable {
    private final List<String> addressList;
    private final long chainId;
    private final String lastRowId;
    private final int limit;
    private final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCoinHistoryRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressCoinHistoryRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCoinHistoryRequest(parcel.createStringArrayList(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryRequest[] newArray(int i) {
            return new AddressCoinHistoryRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressCoinHistoryRequest copy$default(AddressCoinHistoryRequest addressCoinHistoryRequest, List list, long j, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = addressCoinHistoryRequest.addressList;
        }
        if ((i2 & 2) != 0) {
            j = addressCoinHistoryRequest.chainId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = addressCoinHistoryRequest.tokenAddress;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = addressCoinHistoryRequest.lastRowId;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = addressCoinHistoryRequest.limit;
        }
        return addressCoinHistoryRequest.copy(list, j2, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastRowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinHistoryRequest copy(@NotNull List<String> list, long j, String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressCoinHistoryRequest(list, j, str, str2, i);
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
        if (!(obj instanceof AddressCoinHistoryRequest)) {
            return false;
        }
        AddressCoinHistoryRequest addressCoinHistoryRequest = (AddressCoinHistoryRequest) obj;
        return Intrinsics.EZpvd(this.addressList, addressCoinHistoryRequest.addressList) && this.chainId == addressCoinHistoryRequest.chainId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) addressCoinHistoryRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.lastRowId, (Object) addressCoinHistoryRequest.lastRowId) && this.limit == addressCoinHistoryRequest.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastRowId() {
        return this.lastRowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.addressList.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        String str = this.tokenAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.lastRowId.hashCode()) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinHistoryRequest(addressList=" + this.addressList + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", lastRowId=" + this.lastRowId + ", limit=" + this.limit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.addressList);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.lastRowId);
        parcel.writeInt(this.limit);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinHistoryRequest> serializer() {
            return AddressCoinHistoryRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCoinHistoryRequest(int i, List list, long j, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AddressCoinHistoryRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.addressList = list;
        this.chainId = j;
        this.tokenAddress = str;
        if ((i & 8) == 0) {
            this.lastRowId = "";
        } else {
            this.lastRowId = str2;
        }
        if ((i & 16) == 0) {
            this.limit = 15;
        } else {
            this.limit = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinHistoryRequest addressCoinHistoryRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], addressCoinHistoryRequest.addressList);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, addressCoinHistoryRequest.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressCoinHistoryRequest.tokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressCoinHistoryRequest.lastRowId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, addressCoinHistoryRequest.lastRowId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && addressCoinHistoryRequest.limit == 15) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, addressCoinHistoryRequest.limit);
    }

    public AddressCoinHistoryRequest(@NotNull List<String> list, long j, String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.addressList = list;
        this.chainId = j;
        this.tokenAddress = str;
        this.lastRowId = str2;
        this.limit = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 java.util.List)
  (r9v0 long)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (15 int) : (r13v0 int))
 A[MD:(java.util.List<java.lang.String>, long, java.lang.String, java.lang.String, int):void (m)] (LINE:1796) call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryRequest.<init>(java.util.List, long, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ AddressCoinHistoryRequest(List list, long j, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j, str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 15 : i);
    }
}

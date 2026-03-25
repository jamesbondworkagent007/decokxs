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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressCoinDetailRequest implements Parcelable {
    private final List<String> addressList;
    private final Long chainId;
    private final String symbol;
    private final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCoinDetailRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressCoinDetailRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinDetailRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCoinDetailRequest(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinDetailRequest[] newArray(int i) {
            return new AddressCoinDetailRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressCoinDetailRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressCoinDetailRequest copy$default(AddressCoinDetailRequest addressCoinDetailRequest, String str, List list, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressCoinDetailRequest.symbol;
        }
        if ((i & 2) != 0) {
            list = addressCoinDetailRequest.addressList;
        }
        if ((i & 4) != 0) {
            l = addressCoinDetailRequest.chainId;
        }
        if ((i & 8) != 0) {
            str2 = addressCoinDetailRequest.tokenAddress;
        }
        return addressCoinDetailRequest.copy(str, list, l, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinDetailRequest copy(@NotNull String str, @NotNull List<String> list, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AddressCoinDetailRequest(str, list, l, str2);
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
        if (!(obj instanceof AddressCoinDetailRequest)) {
            return false;
        }
        AddressCoinDetailRequest addressCoinDetailRequest = (AddressCoinDetailRequest) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) addressCoinDetailRequest.symbol) && Intrinsics.EZpvd(this.addressList, addressCoinDetailRequest.addressList) && Intrinsics.EZpvd(this.chainId, addressCoinDetailRequest.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) addressCoinDetailRequest.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.symbol.hashCode();
        int iHashCode2 = this.addressList.hashCode();
        Long l = this.chainId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str = this.tokenAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinDetailRequest(symbol=" + this.symbol + ", addressList=" + this.addressList + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.symbol);
        parcel.writeStringList(this.addressList);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tokenAddress);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinDetailRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinDetailRequest> serializer() {
            return AddressCoinDetailRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCoinDetailRequest(int i, String str, List list, Long l, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, AddressCoinDetailRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.symbol = (i & 1) == 0 ? "" : str;
        this.addressList = list;
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinDetailRequest addressCoinDetailRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressCoinDetailRequest.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressCoinDetailRequest.symbol);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressCoinDetailRequest.addressList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressCoinDetailRequest.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, addressCoinDetailRequest.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && addressCoinDetailRequest.tokenAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, addressCoinDetailRequest.tokenAddress);
    }

    public AddressCoinDetailRequest(@NotNull String str, @NotNull List<String> list, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.symbol = str;
        this.addressList = list;
        this.chainId = l;
        this.tokenAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (r3v0 java.util.List)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.Long, java.lang.String):void (m)] (LINE:1839) call: com.okinc.business.defi.biz.net.bean.AddressCoinDetailRequest.<init>(java.lang.String, java.util.List, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ AddressCoinDetailRequest(String str, List list, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2);
    }
}

package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C59454zhO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SerialName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
@Keep
@Serializable
public final class AddressSearchHistory extends SearchHistoryItem {
    public final String address;
    public final List<Long> chainIndexes;
    public final boolean searchedByAddress;
    public final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSearchHistory copy$default(AddressSearchHistory addressSearchHistory, String str, List list, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressSearchHistory.address;
        }
        if ((i & 2) != 0) {
            list = addressSearchHistory.chainIndexes;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = addressSearchHistory.searchedByAddress;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = addressSearchHistory.timestamp;
        }
        return addressSearchHistory.KWHzl(str, list2, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> AEQbTJ() {
        return this.chainIndexes;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String AYXKKw() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public long AhwBna() {
        return this.timestamp;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressSearchHistory KWHzl(@NotNull String str, List<Long> list, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressSearchHistory(str, list, z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSearchHistory)) {
            return false;
        }
        AddressSearchHistory addressSearchHistory = (AddressSearchHistory) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressSearchHistory.address) && Intrinsics.EZpvd(this.chainIndexes, addressSearchHistory.chainIndexes) && this.searchedByAddress == addressSearchHistory.searchedByAddress && this.timestamp == addressSearchHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        List<Long> list = this.chainIndexes;
        return (((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.searchedByAddress)) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressSearchHistory(address=" + this.address + ", chainIndexes=" + this.chainIndexes + ", searchedByAddress=" + this.searchedByAddress + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressSearchHistory> serializer() {
            return AddressSearchHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSearchHistory(int i, String str, List list, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AddressSearchHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        if ((i & 2) == 0) {
            this.chainIndexes = null;
        } else {
            this.chainIndexes = list;
        }
        if ((i & 4) == 0) {
            this.searchedByAddress = false;
        } else {
            this.searchedByAddress = z;
        }
        if ((i & 8) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem.copydefault(com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void AEQbTJ(AddressSearchHistory addressSearchHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(addressSearchHistory, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressSearchHistory.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressSearchHistory.chainIndexes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressSearchHistory.chainIndexes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressSearchHistory.searchedByAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, addressSearchHistory.searchedByAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && addressSearchHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 3, addressSearchHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.util.List:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0010: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:17)) : (r10v0 long))
 A[MD:(java.lang.String, java.util.List<java.lang.Long>, boolean, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory.<init>(java.lang.String, java.util.List, boolean, long):void type: THIS */
    public /* synthetic */ AddressSearchHistory(String str, List list, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? System.currentTimeMillis() : j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSearchHistory(@NotNull String str, List<Long> list, boolean z, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.chainIndexes = list;
        this.searchedByAddress = z;
        this.timestamp = j;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String KWHzl() {
        return AEQbTJ(this.address);
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "address_" + this.address;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.ADDRESS;
    }

    public final String AEQbTJ(String str) {
        if (str.length() < 11) {
            return str;
        }
        return C59454zhO.AkhnZx(str, 6) + "..." + C59454zhO.isConnected(str, 4);
    }
}

package com.okinc.business.defi.biz.walletconnect;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncAllAddressesResponse {
    private final List<Address> addresses;
    private final String deriveName;
    private final int isEvm;
    private final int type;
    private final String walletName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SyncAllAddressesResponse$Address$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.walletconnect.SyncAllAddressesResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncAllAddressesResponse copy$default(SyncAllAddressesResponse syncAllAddressesResponse, int i, int i2, String str, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = syncAllAddressesResponse.type;
        }
        if ((i3 & 2) != 0) {
            i2 = syncAllAddressesResponse.isEvm;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = syncAllAddressesResponse.walletName;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = syncAllAddressesResponse.deriveName;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            list = syncAllAddressesResponse.addresses;
        }
        return syncAllAddressesResponse.copy(i, i4, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.isEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deriveName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component5() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncAllAddressesResponse copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SyncAllAddressesResponse(i, i2, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncAllAddressesResponse)) {
            return false;
        }
        SyncAllAddressesResponse syncAllAddressesResponse = (SyncAllAddressesResponse) obj;
        return this.type == syncAllAddressesResponse.type && this.isEvm == syncAllAddressesResponse.isEvm && Intrinsics.EZpvd((Object) this.walletName, (Object) syncAllAddressesResponse.walletName) && Intrinsics.EZpvd((Object) this.deriveName, (Object) syncAllAddressesResponse.deriveName) && Intrinsics.EZpvd(this.addresses, syncAllAddressesResponse.addresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeriveName() {
        return this.deriveName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.isEvm)) * 31) + this.walletName.hashCode()) * 31) + this.deriveName.hashCode()) * 31) + this.addresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isEvm() {
        return this.isEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncAllAddressesResponse(type=" + this.type + ", isEvm=" + this.isEvm + ", walletName=" + this.walletName + ", deriveName=" + this.deriveName + ", addresses=" + this.addresses + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.SyncAllAddressesResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncAllAddressesResponse> serializer() {
            return SyncAllAddressesResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncAllAddressesResponse(int i, int i2, int i3, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SyncAllAddressesResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.isEvm = i3;
        this.walletName = str;
        this.deriveName = str2;
        this.addresses = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncAllAddressesResponse syncAllAddressesResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, syncAllAddressesResponse.type);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, syncAllAddressesResponse.isEvm);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, syncAllAddressesResponse.walletName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, syncAllAddressesResponse.deriveName);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], syncAllAddressesResponse.addresses);
    }

    public SyncAllAddressesResponse(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = i;
        this.isEvm = i2;
        this.walletName = str;
        this.deriveName = str2;
        this.addresses = list;
    }

    @Serializable
    public static final class Address {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final long chainId;
        private final long coinId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Address copy$default(Address address, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = address.chainId;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = address.coinId;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = address.address;
            }
            return address.copy(j3, j4, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Address copy(long j, long j2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Address(j, j2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return this.chainId == address.chainId && this.coinId == address.coinId && Intrinsics.EZpvd((Object) this.address, (Object) address.address);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.chainId) * 31) + Long.hashCode(this.coinId)) * 31) + this.address.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Address(chainId=" + this.chainId + ", coinId=" + this.coinId + ", address=" + this.address + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.SyncAllAddressesResponse.Address.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Address> serializer() {
                return SyncAllAddressesResponse$Address$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Address(int i, long j, long j2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, SyncAllAddressesResponse$Address$$serializer.INSTANCE.getDescriptor());
            }
            this.chainId = j;
            this.coinId = j2;
            this.address = str;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Address address, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, address.chainId);
            compositeEncoder.encodeLongElement(serialDescriptor, 1, address.coinId);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, address.address);
        }

        public Address(long j, long j2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.chainId = j;
            this.coinId = j2;
            this.address = str;
        }
    }
}

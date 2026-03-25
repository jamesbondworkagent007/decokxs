package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.bytedance.applog.encryptor.IEncryptorType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncAllAddress {
    private final List<Address> addresses;
    private final String deriveName;
    private final String evmAddress;
    private final int isEvm;
    private final int type;
    private final String walletName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(SyncAllAddress$Address$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.SyncAllAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncAllAddress copy$default(SyncAllAddress syncAllAddress, int i, int i2, String str, String str2, String str3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = syncAllAddress.type;
        }
        if ((i3 & 2) != 0) {
            i2 = syncAllAddress.isEvm;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = syncAllAddress.walletName;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = syncAllAddress.deriveName;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = syncAllAddress.evmAddress;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            list = syncAllAddress.addresses;
        }
        return syncAllAddress.copy(i, i4, str4, str5, str6, list);
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
    public final String component5() {
        return this.evmAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component6() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncAllAddress copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SyncAllAddress(i, i2, str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncAllAddress)) {
            return false;
        }
        SyncAllAddress syncAllAddress = (SyncAllAddress) obj;
        return this.type == syncAllAddress.type && this.isEvm == syncAllAddress.isEvm && Intrinsics.EZpvd((Object) this.walletName, (Object) syncAllAddress.walletName) && Intrinsics.EZpvd((Object) this.deriveName, (Object) syncAllAddress.deriveName) && Intrinsics.EZpvd((Object) this.evmAddress, (Object) syncAllAddress.evmAddress) && Intrinsics.EZpvd(this.addresses, syncAllAddress.addresses);
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
    public final String getEvmAddress() {
        return this.evmAddress;
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
        return (((((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.isEvm)) * 31) + this.walletName.hashCode()) * 31) + this.deriveName.hashCode()) * 31) + this.evmAddress.hashCode()) * 31) + this.addresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isEvm() {
        return this.isEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncAllAddress(type=" + this.type + ", isEvm=" + this.isEvm + ", walletName=" + this.walletName + ", deriveName=" + this.deriveName + ", evmAddress=" + this.evmAddress + ", addresses=" + this.addresses + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.SyncAllAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncAllAddress> serializer() {
            return SyncAllAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncAllAddress(int i, int i2, int i3, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, SyncAllAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.isEvm = i3;
        this.walletName = str;
        this.deriveName = str2;
        this.evmAddress = str3;
        this.addresses = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncAllAddress syncAllAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, syncAllAddress.type);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, syncAllAddress.isEvm);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, syncAllAddress.walletName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, syncAllAddress.deriveName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, syncAllAddress.evmAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], syncAllAddress.addresses);
    }

    public SyncAllAddress(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = i;
        this.isEvm = i2;
        this.walletName = str;
        this.deriveName = str2;
        this.evmAddress = str3;
        this.addresses = list;
    }

    @Serializable
    public static final class Address {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final long coinId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Address copy$default(Address address, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = address.coinId;
            }
            if ((i & 2) != 0) {
                str = address.address;
            }
            return address.copy(j, str);
        }

        @SerialName(IEncryptorType.DEFAULT_ENCRYPTOR)
        @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
        public static /* synthetic */ void getAddress$annotations() {
        }

        @SerialName("ci")
        public static /* synthetic */ void getCoinId$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Address copy(long j, String str) {
            return new Address(j, str);
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
            return this.coinId == address.coinId && Intrinsics.EZpvd((Object) this.address, (Object) address.address);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.coinId);
            String str = this.address;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Address(coinId=" + this.coinId + ", address=" + this.address + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.SyncAllAddress.Address.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Address> serializer() {
                return SyncAllAddress$Address$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Address(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SyncAllAddress$Address$$serializer.INSTANCE.getDescriptor());
            }
            this.coinId = j;
            if ((i & 2) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Address address, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, address.coinId);
            String str = address.address;
            if (str != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str);
            }
        }

        public Address(long j, String str) {
            this.coinId = j;
            this.address = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(long, java.lang.String):void (m)] (LINE:22) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.SyncAllAddress.Address.<init>(long, java.lang.String):void type: THIS */
        public /* synthetic */ Address(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : str);
        }
    }
}

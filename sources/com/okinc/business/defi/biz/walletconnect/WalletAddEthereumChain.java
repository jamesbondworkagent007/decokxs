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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletAddEthereumChain {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<String> blockExplorerUrls;
    private final String chainId;
    private final String chainName;
    private final NativeCurrency nativeCurrency;
    private final List<String> rpcUrls;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAddEthereumChain copy$default(WalletAddEthereumChain walletAddEthereumChain, List list, String str, String str2, NativeCurrency nativeCurrency, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletAddEthereumChain.blockExplorerUrls;
        }
        if ((i & 2) != 0) {
            str = walletAddEthereumChain.chainId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = walletAddEthereumChain.chainName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            nativeCurrency = walletAddEthereumChain.nativeCurrency;
        }
        NativeCurrency nativeCurrency2 = nativeCurrency;
        if ((i & 16) != 0) {
            list2 = walletAddEthereumChain.rpcUrls;
        }
        return walletAddEthereumChain.copy(list, str3, str4, nativeCurrency2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.blockExplorerUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeCurrency component4() {
        return this.nativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.rpcUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddEthereumChain copy(List<String> list, String str, String str2, NativeCurrency nativeCurrency, List<String> list2) {
        return new WalletAddEthereumChain(list, str, str2, nativeCurrency, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddEthereumChain)) {
            return false;
        }
        WalletAddEthereumChain walletAddEthereumChain = (WalletAddEthereumChain) obj;
        return Intrinsics.EZpvd(this.blockExplorerUrls, walletAddEthereumChain.blockExplorerUrls) && Intrinsics.EZpvd((Object) this.chainId, (Object) walletAddEthereumChain.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) walletAddEthereumChain.chainName) && Intrinsics.EZpvd(this.nativeCurrency, walletAddEthereumChain.nativeCurrency) && Intrinsics.EZpvd(this.rpcUrls, walletAddEthereumChain.rpcUrls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBlockExplorerUrls() {
        return this.blockExplorerUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeCurrency getNativeCurrency() {
        return this.nativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRpcUrls() {
        return this.rpcUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.blockExplorerUrls;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.chainId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.chainName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        NativeCurrency nativeCurrency = this.nativeCurrency;
        int iHashCode4 = nativeCurrency == null ? 0 : nativeCurrency.hashCode();
        List<String> list2 = this.rpcUrls;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddEthereumChain(blockExplorerUrls=" + this.blockExplorerUrls + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", nativeCurrency=" + this.nativeCurrency + ", rpcUrls=" + this.rpcUrls + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddEthereumChain> serializer() {
            return WalletAddEthereumChain$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, null, null, new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ WalletAddEthereumChain(int i, List list, String str, String str2, NativeCurrency nativeCurrency, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, WalletAddEthereumChain$$serializer.INSTANCE.getDescriptor());
        }
        this.blockExplorerUrls = list;
        this.chainId = str;
        this.chainName = str2;
        this.nativeCurrency = nativeCurrency;
        this.rpcUrls = list2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletAddEthereumChain walletAddEthereumChain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletAddEthereumChain.blockExplorerUrls);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletAddEthereumChain.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletAddEthereumChain.chainName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, NativeCurrency$$serializer.INSTANCE, walletAddEthereumChain.nativeCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], walletAddEthereumChain.rpcUrls);
    }

    public WalletAddEthereumChain(List<String> list, String str, String str2, NativeCurrency nativeCurrency, List<String> list2) {
        this.blockExplorerUrls = list;
        this.chainId = str;
        this.chainName = str2;
        this.nativeCurrency = nativeCurrency;
        this.rpcUrls = list2;
    }
}

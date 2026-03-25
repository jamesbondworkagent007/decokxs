package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletSwitchEthereumChain {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSwitchEthereumChain copy$default(WalletSwitchEthereumChain walletSwitchEthereumChain, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSwitchEthereumChain.chainId;
        }
        return walletSwitchEthereumChain.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSwitchEthereumChain copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletSwitchEthereumChain(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletSwitchEthereumChain) && Intrinsics.EZpvd((Object) this.chainId, (Object) ((WalletSwitchEthereumChain) obj).chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chainId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSwitchEthereumChain(chainId=" + this.chainId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.WalletSwitchEthereumChain.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletSwitchEthereumChain> serializer() {
            return WalletSwitchEthereumChain$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletSwitchEthereumChain(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WalletSwitchEthereumChain$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
    }

    public WalletSwitchEthereumChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }
}

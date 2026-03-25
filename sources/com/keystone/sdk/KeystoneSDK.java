package com.keystone.sdk;

import com.keystone.module.Account;
import com.keystone.module.MultiAccounts;
import com.keystone.module.NativeResult;
import com.keystone.module.ZcashAccounts;
import com.sparrowwallet.hummingbird.UR;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneSDK extends KeystoneBaseSDK {
    public static final Companion Companion = new Companion(null);
    private static int maxFragmentLen = 200;
    private final InterfaceC56387yDm eth$delegate = C56392yDr.copydefault(new Function0<KeystoneEthereumSDK>() { // from class: com.keystone.sdk.KeystoneSDK$eth$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneEthereumSDK invoke() {
            return new KeystoneEthereumSDK();
        }
    });
    private final InterfaceC56387yDm sol$delegate = C56392yDr.copydefault(new Function0<KeystoneSolanaSDK>() { // from class: com.keystone.sdk.KeystoneSDK$sol$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneSolanaSDK invoke() {
            return new KeystoneSolanaSDK();
        }
    });
    private final InterfaceC56387yDm btc$delegate = C56392yDr.copydefault(new Function0<KeystoneBitcoinSDK>() { // from class: com.keystone.sdk.KeystoneSDK$btc$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneBitcoinSDK invoke() {
            return new KeystoneBitcoinSDK();
        }
    });
    private final InterfaceC56387yDm cosmos$delegate = C56392yDr.copydefault(new Function0<KeystoneCosmosSDK>() { // from class: com.keystone.sdk.KeystoneSDK$cosmos$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneCosmosSDK invoke() {
            return new KeystoneCosmosSDK();
        }
    });
    private final InterfaceC56387yDm evm$delegate = C56392yDr.copydefault(new Function0<KeystoneEvmSDK>() { // from class: com.keystone.sdk.KeystoneSDK$evm$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneEvmSDK invoke() {
            return new KeystoneEvmSDK();
        }
    });
    private final InterfaceC56387yDm tron$delegate = C56392yDr.copydefault(new Function0<KeystoneTronSDK>() { // from class: com.keystone.sdk.KeystoneSDK$tron$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneTronSDK invoke() {
            return new KeystoneTronSDK();
        }
    });
    private final InterfaceC56387yDm aptos$delegate = C56392yDr.copydefault(new Function0<KeystoneAptosSDK>() { // from class: com.keystone.sdk.KeystoneSDK$aptos$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneAptosSDK invoke() {
            return new KeystoneAptosSDK();
        }
    });
    private final InterfaceC56387yDm ltc$delegate = C56392yDr.copydefault(new Function0<KeystoneLtcSDK>() { // from class: com.keystone.sdk.KeystoneSDK$ltc$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneLtcSDK invoke() {
            return new KeystoneLtcSDK();
        }
    });
    private final InterfaceC56387yDm bch$delegate = C56392yDr.copydefault(new Function0<KeystoneBchSDK>() { // from class: com.keystone.sdk.KeystoneSDK$bch$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneBchSDK invoke() {
            return new KeystoneBchSDK();
        }
    });
    private final InterfaceC56387yDm dash$delegate = C56392yDr.copydefault(new Function0<KeystoneDashSDK>() { // from class: com.keystone.sdk.KeystoneSDK$dash$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneDashSDK invoke() {
            return new KeystoneDashSDK();
        }
    });
    private final InterfaceC56387yDm near$delegate = C56392yDr.copydefault(new Function0<KeystoneNearSDK>() { // from class: com.keystone.sdk.KeystoneSDK$near$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneNearSDK invoke() {
            return new KeystoneNearSDK();
        }
    });
    private final InterfaceC56387yDm arweave$delegate = C56392yDr.copydefault(new Function0<KeystoneArweaveSDK>() { // from class: com.keystone.sdk.KeystoneSDK$arweave$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneArweaveSDK invoke() {
            return new KeystoneArweaveSDK();
        }
    });
    private final InterfaceC56387yDm sui$delegate = C56392yDr.copydefault(new Function0<KeystoneSuiSDK>() { // from class: com.keystone.sdk.KeystoneSDK$sui$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneSuiSDK invoke() {
            return new KeystoneSuiSDK();
        }
    });
    private final InterfaceC56387yDm cardano$delegate = C56392yDr.copydefault(new Function0<KeystoneCardanoSDK>() { // from class: com.keystone.sdk.KeystoneSDK$cardano$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneCardanoSDK invoke() {
            return new KeystoneCardanoSDK();
        }
    });
    private final InterfaceC56387yDm zcash$delegate = C56392yDr.copydefault(new Function0<KeystoneZcashSDK>() { // from class: com.keystone.sdk.KeystoneSDK$zcash$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeystoneZcashSDK invoke() {
            return new KeystoneZcashSDK();
        }
    });

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.keystone.sdk.KeystoneSDK.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getMaxFragmentLen() {
            return KeystoneSDK.maxFragmentLen;
        }

        public final void setMaxFragmentLen(int i) {
            KeystoneSDK.maxFragmentLen = i;
        }
    }

    public final KeystoneEthereumSDK getEth() {
        return (KeystoneEthereumSDK) this.eth$delegate.getValue();
    }

    public final KeystoneSolanaSDK getSol() {
        return (KeystoneSolanaSDK) this.sol$delegate.getValue();
    }

    public final KeystoneBitcoinSDK getBtc() {
        return (KeystoneBitcoinSDK) this.btc$delegate.getValue();
    }

    public final KeystoneCosmosSDK getCosmos() {
        return (KeystoneCosmosSDK) this.cosmos$delegate.getValue();
    }

    public final KeystoneEvmSDK getEvm() {
        return (KeystoneEvmSDK) this.evm$delegate.getValue();
    }

    public final KeystoneTronSDK getTron() {
        return (KeystoneTronSDK) this.tron$delegate.getValue();
    }

    public final KeystoneAptosSDK getAptos() {
        return (KeystoneAptosSDK) this.aptos$delegate.getValue();
    }

    public final KeystoneLtcSDK getLtc() {
        return (KeystoneLtcSDK) this.ltc$delegate.getValue();
    }

    public final KeystoneBchSDK getBch() {
        return (KeystoneBchSDK) this.bch$delegate.getValue();
    }

    public final KeystoneDashSDK getDash() {
        return (KeystoneDashSDK) this.dash$delegate.getValue();
    }

    public final KeystoneNearSDK getNear() {
        return (KeystoneNearSDK) this.near$delegate.getValue();
    }

    public final KeystoneArweaveSDK getArweave() {
        return (KeystoneArweaveSDK) this.arweave$delegate.getValue();
    }

    public final KeystoneSuiSDK getSui() {
        return (KeystoneSuiSDK) this.sui$delegate.getValue();
    }

    public final KeystoneCardanoSDK getCardano() {
        return (KeystoneCardanoSDK) this.cardano$delegate.getValue();
    }

    public final KeystoneZcashSDK getZcash() {
        return (KeystoneZcashSDK) this.zcash$delegate.getValue();
    }

    public final MultiAccounts parseMultiAccounts(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cryptoMultiAccounts = native$library_release.parseCryptoMultiAccounts(type, toHexString(cborBytes));
        return (MultiAccounts) handleError(cryptoMultiAccounts, (MultiAccounts) KeystoneBaseSDK.fromJson$default(this, cryptoMultiAccounts, MultiAccounts.class, null, 4, null));
    }

    public final Account parseAccount(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cryptoHDKey = native$library_release.parseCryptoHDKey(type, toHexString(cborBytes));
        return (Account) handleError(cryptoHDKey, (Account) KeystoneBaseSDK.fromJson$default(this, cryptoHDKey, Account.class, null, 4, null));
    }

    public final MultiAccounts parseCryptoAccount(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String cryptoAccount = native$library_release.parseCryptoAccount(type, toHexString(cborBytes));
        return (MultiAccounts) handleError(cryptoAccount, (MultiAccounts) KeystoneBaseSDK.fromJson$default(this, cryptoAccount, MultiAccounts.class, null, 4, null));
    }

    public final ZcashAccounts parseZcashAccounts(@NotNull UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        KeystoneNativeSDK native$library_release = getNative$library_release();
        String type = ur.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        byte[] cborBytes = ur.getCborBytes();
        Intrinsics.checkNotNullExpressionValue(cborBytes, "");
        String zcashAccounts = native$library_release.parseZcashAccounts(type, toHexString(cborBytes));
        return (ZcashAccounts) handleError(zcashAccounts, (ZcashAccounts) KeystoneBaseSDK.fromJson$default(this, zcashAccounts, ZcashAccounts.class, null, 4, null));
    }

    public final String getUncompressedKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String uncompressedKey = getNative$library_release().getUncompressedKey(str);
        return ((NativeResult) handleError(uncompressedKey, (NativeResult) KeystoneBaseSDK.fromJson$default(this, uncompressedKey, NativeResult.class, null, 4, null))).getResult();
    }

    public final String derivePublicKey(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strDerivePublicKey = getNative$library_release().derivePublicKey(str, str2);
        return ((NativeResult) handleError(strDerivePublicKey, (NativeResult) KeystoneBaseSDK.fromJson$default(this, strDerivePublicKey, NativeResult.class, null, 4, null))).getResult();
    }
}

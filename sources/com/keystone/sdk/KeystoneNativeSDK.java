package com.keystone.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneNativeSDK {
    public static final Companion Companion = new Companion(null);

    public final native String derivePublicKey(@NotNull String str, @NotNull String str2);

    public final native String generateAptosSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i);

    public final native String generateArweaveSignRequest(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5);

    public final native String generateCardanoSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5);

    public final native String generateCosmosSignRequest(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4);

    public final native String generateCryptoPSBT(@NotNull String str);

    public final native String generateETHSignRequest(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6);

    public final native String generateEvmSignRequest(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4);

    public final native String generateKeystoneSignRequest(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j);

    public final native String generateNearSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6);

    public final native String generateSolSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i);

    public final native String generateSuiSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    public final native String generateTronSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j);

    public final native String generateZcashPczt(@NotNull String str);

    public final native String getUncompressedKey(@NotNull String str);

    public final native String parseAptosSignature(@NotNull String str, @NotNull String str2);

    public final native String parseArweaveAccount(@NotNull String str, @NotNull String str2);

    public final native String parseArweaveSignature(@NotNull String str, @NotNull String str2);

    public final native String parseCardanoSignature(@NotNull String str, @NotNull String str2);

    public final native String parseCosmosSignature(@NotNull String str, @NotNull String str2);

    public final native String parseCryptoAccount(@NotNull String str, @NotNull String str2);

    public final native String parseCryptoHDKey(@NotNull String str, @NotNull String str2);

    public final native String parseCryptoMultiAccounts(@NotNull String str, @NotNull String str2);

    public final native String parseCryptoPSBT(@NotNull String str, @NotNull String str2);

    public final native String parseETHSignature(@NotNull String str, @NotNull String str2);

    public final native String parseEvmSignature(@NotNull String str, @NotNull String str2);

    public final native String parseHDPath(@NotNull String str);

    public final native String parseKeystoneSignResult(@NotNull String str, @NotNull String str2);

    public final native String parseNearSignature(@NotNull String str, @NotNull String str2);

    public final native String parseSolSignature(@NotNull String str, @NotNull String str2);

    public final native String parseSuiSignature(@NotNull String str, @NotNull String str2);

    public final native String parseTronSignature(@NotNull String str, @NotNull String str2);

    public final native String parseZcashAccounts(@NotNull String str, @NotNull String str2);

    public final native String parseZcashPczt(@NotNull String str, @NotNull String str2);

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.keystone.sdk.KeystoneNativeSDK.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        System.loadLibrary("ur_registry_ffi");
    }
}

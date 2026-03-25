package com.okinc.web3.security.utils.internal;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.ibm.icu.text.DateFormat;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PublicKey;
import java.util.Map;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56390yDp;
import o.C56424yEw;
import o.YY;
import o.Zo;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class HybridImpl implements WrapUtilsBase {
    public static final int $stable;
    public static final Companion Companion;
    private static long KWHzl = 0;
    private static int OLrzqt = 0;
    private static final String TAG = "HybridImpl";
    private static final String sharedMessage = "wallet-core-ecdh-aes";
    private boolean eccFallbackActivated;
    private final SupportLevel supportLevel;
    private byte[] wrappedSecretCache;
    private static final byte[] $$a = {36, -15, -45, 66};
    private static final int $$b = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int EZpvd = 0;
    private static int copydefault = 1;
    private static int AEQbTJ = 1;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportLevel.values().length];
            try {
                iArr[SupportLevel.TEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SupportLevel.STRONGBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = (i * 3) + 117;
        byte[] bArr = $$a;
        int i5 = 1 - (b * 3);
        int i6 = (s * 2) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i4 = i5;
            i3 = 0;
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        OLrzqt = 0;
        OLrzqt();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        $stable = 8;
        int i = AEQbTJ + 83;
        OLrzqt = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public SupportLevel getSupportLevel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        EZpvd = i3 % 128;
        int i4 = i3 % 2;
        SupportLevel supportLevel = this.supportLevel;
        int i5 = i2 + 103;
        EZpvd = i5 % 128;
        int i6 = i5 % 2;
        return supportLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public boolean isHardwareBacked() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        EZpvd = i2 % 128;
        return true ^ (i2 % 2 != 0);
    }

    public HybridImpl(@NotNull SupportLevel supportLevel) {
        Intrinsics.checkNotNullParameter(supportLevel, "");
        this.supportLevel = supportLevel;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.internal.HybridImpl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public void init() {
        int i = 2 % 2;
        int i2 = EZpvd + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            pUU.KWHzl(TAG, "Initializing hybrid implementation: Hardware AES + Software ECC");
            initializeWithSoftwareECC();
            this.eccFallbackActivated = true;
            pUU.KWHzl(TAG, "Hybrid initialization successful: Software ECC + Hardware AES");
            int i4 = EZpvd + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.init", "Hybrid initialization failed: " + e.getMessage());
            throw new IllegalStateException("Hybrid initialization failed: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zo zo = new Zo();
        char[] cArrOLrzqt = Zo.OLrzqt(KWHzl ^ (-5747691001614856746L), cArr, i);
        zo.KWHzl = 4;
        while (zo.KWHzl < cArrOLrzqt.length) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            zo.OLrzqt = zo.KWHzl - 4;
            int i5 = zo.KWHzl;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4]), Long.valueOf(zo.OLrzqt), Long.valueOf(KWHzl)};
                Object objEZpvd = YY.EZpvd(1769962791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(368, 5, (char) 0, 1834987611, false, $$c(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOLrzqt[i5] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {zo, zo};
                Object objEZpvd2 = YY.EZpvd(-1024411099);
                if (objEZpvd2 == null) {
                    objEZpvd2 = YY.EZpvd(81, 4, (char) 0, -959416487, false, DateFormat.YEAR, new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd2).invoke(null, objArr3);
                int i6 = $11 + 71;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
    }

    private final void initializeWithSoftwareECC() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        EZpvd = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = deriveSharedSecretWithSoftwareECC(createSoftwareECCKeyPair()).getEncoded();
        try {
            Intrinsics.copydefault(encoded);
            this.wrappedSecretCache = wrapSecretWithHardwareAES(encoded);
            CryptoUtilities.INSTANCE.secureCleanup(encoded);
            int i4 = copydefault + 19;
            EZpvd = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            CryptoUtilities.INSTANCE.secureCleanup(encoded);
            throw th;
        }
    }

    private final KeyPair createSoftwareECCKeyPair() {
        int i = 2 % 2;
        int i2 = EZpvd + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        KeyPair keyPairCreateSoftwareECCKeyPair = CryptoUtilities.INSTANCE.createSoftwareECCKeyPair();
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return keyPairCreateSoftwareECCKeyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [125=5] */
    private final SecretKeySpec deriveSharedSecretWithSoftwareECC(KeyPair keyPair) throws Exception {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        EZpvd = i2 % 128;
        int i3 = i2 % 2;
        try {
            PublicKey publicKey = keyPair.getPublic();
            Intrinsics.checkNotNullExpressionValue(publicKey, "");
            Object objDispatch$default = Web3SecurityBridge.dispatch$default(Web3SecurityBridge.INSTANCE, "init_get_comm_publickey", C56424yEw.gEmmrt(C56390yDp.OLrzqt("peerPublicKey", ecPublicKeyToHex(publicKey)), C56390yDp.OLrzqt("forceRefresh", Boolean.TRUE)), false, 4, null);
            if (objDispatch$default == null) {
                throw new IllegalStateException("Web3SecurityBridge.dispatch returned null response");
            }
            String string = objDispatch$default.toString();
            if (!StringsKt__StringsKt.fARcdN((CharSequence) string)) {
                int i4 = copydefault + 35;
                EZpvd = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.EZpvd((Object) string, (Object) AbstractJsonLexerKt.NULL);
                    throw null;
                }
                if (!Intrinsics.EZpvd((Object) string, (Object) AbstractJsonLexerKt.NULL)) {
                    try {
                        Json.Default r3 = Json.Default;
                        r3.getSerializersModule();
                        JsonElement jsonElement = (JsonElement) ((JsonObject) r3.decodeFromString(JsonObject.Companion.serializer(), string)).get((Object) "publicKey");
                        if (jsonElement == null) {
                            throw new IllegalStateException("Response JSON missing 'publicKey' field");
                        }
                        int i5 = copydefault + 77;
                        EZpvd = i5 % 128;
                        int i6 = i5 % 2;
                        PublicKey publicKeyDecodePublicKeyHex = decodePublicKeyHex(JsonElementKt.getJsonPrimitive(jsonElement).getContent());
                        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                        keyAgreement.init(keyPair.getPrivate());
                        keyAgreement.doPhase(publicKeyDecodePublicKeyHex, true);
                        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                        try {
                            Intrinsics.copydefault(bArrGenerateSecret);
                            byte[] bytes = sharedMessage.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "");
                            SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey$default = hkdfDerivedSymmetricKey$default(this, bArrGenerateSecret, null, bytes, 0, 10, null);
                            CryptoUtilities.INSTANCE.secureCleanup(bArrGenerateSecret);
                            return secretKeySpecHkdfDerivedSymmetricKey$default;
                        } catch (Throwable th) {
                            CryptoUtilities.INSTANCE.secureCleanup(bArrGenerateSecret);
                            throw th;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException("Failed to parse JSON response: '" + string + "'", e);
                    }
                }
            }
            throw new IllegalStateException("Web3SecurityBridge.dispatch returned invalid response: '" + string + "'");
        } catch (Exception e2) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.deriveSharedSecret", "Software ECC derivation failed: " + e2.getMessage());
            throw e2;
        }
    }

    private final String ecPublicKeyToHex(PublicKey publicKey) {
        int i = 2 % 2;
        int i2 = EZpvd + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            CryptoUtilities.INSTANCE.ecPublicKeyToHex(publicKey);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strEcPublicKeyToHex = CryptoUtilities.INSTANCE.ecPublicKeyToHex(publicKey);
        int i3 = copydefault + 115;
        EZpvd = i3 % 128;
        int i4 = i3 % 2;
        return strEcPublicKeyToHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey decodePublicKeyHex(@NotNull String str) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        EZpvd = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            CryptoUtilities.INSTANCE.decodePublicKeyHex(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        PublicKey publicKeyDecodePublicKeyHex = CryptoUtilities.INSTANCE.decodePublicKeyHex(str);
        int i3 = EZpvd + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return publicKeyDecodePublicKeyHex;
    }

    public static /* synthetic */ SecretKeySpec hkdfDerivedSymmetricKey$default(HybridImpl hybridImpl, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            bArr2 = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = EZpvd + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            bArr3 = null;
        }
        if ((i2 & 8) != 0) {
            int i6 = copydefault + 91;
            EZpvd = i6 % 128;
            i = i6 % 2 != 0 ? 96 : 32;
        }
        return hybridImpl.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
    }

    private final SecretKeySpec hkdfDerivedSymmetricKey(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 97;
        EZpvd = i3 % 128;
        int i4 = i3 % 2;
        CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
        if (i4 == 0) {
            return cryptoUtilities.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
        }
        cryptoUtilities.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final byte[] wrapSecretWithHardwareAES(byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            byte[] bArrEncryptAESGCM = CryptoUtilities.INSTANCE.encryptAESGCM(bArr, new SecretKeySpec(getOrCreateHardwareAESKey().getEncoded(), BouncyCastleKeyManagementRepository.AES));
            int i2 = EZpvd + 11;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
            return bArrEncryptAESGCM;
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.wrapHardwareAES", "Hardware AES wrapping failed: " + e.getMessage());
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SecretKey getOrCreateHardwareAESKey() throws Throwable {
        int i = 2 % 2;
        String str = "hybrid_hardware_aes_key_level_" + this.supportLevel;
        Object[] objArr = new Object[1];
        a(new char[]{15508, 3110, 45834, 15573, 15838, 52831, 14144, 31721, 13479, 50748, 16356, 29492, 11337, 56976, 10175, 27479, 9711, 55167, 11821}, 1, objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        Key key = keyStore.getKey(str, null);
        if (key != null) {
            int i2 = copydefault;
            int i3 = i2 + 73;
            EZpvd = i3 % 128;
            int i4 = i3 % 2;
            SecretKey secretKey = (SecretKey) key;
            int i5 = i2 + 83;
            EZpvd = i5 % 128;
            int i6 = i5 % 2;
            return secretKey;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{15508, 3110, 45834, 15573, 15838, 52831, 14144, 31721, 13479, 50748, 16356, 29492, 11337, 56976, 10175, 27479, 9711, 55167, 11821}, 1, objArr2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((String) objArr2[0]).intern());
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.supportLevel.ordinal()];
        if (i7 != 1) {
            int i8 = EZpvd + 61;
            int i9 = i8 % 128;
            copydefault = i9;
            int i10 = i8 % 2;
            if (i7 != 2) {
                throw new IllegalArgumentException("No other support level allowed");
            }
            int i11 = i9 + 25;
            EZpvd = i11 % 128;
            int i12 = i11 % 2;
            if (Build.VERSION.SDK_INT >= 28) {
                int i13 = EZpvd + 105;
                copydefault = i13 % 128;
                int i14 = i13 % 2;
                try {
                    keySize.setIsStrongBoxBacked(true);
                    keySize.setUserAuthenticationRequired(false);
                } catch (Exception unused) {
                    keySize.setIsStrongBoxBacked(false);
                    keySize.setUserAuthenticationRequired(false);
                }
            } else {
                keySize.setUserAuthenticationRequired(false);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                keySize.setIsStrongBoxBacked(false);
            }
            keySize.setUserAuthenticationRequired(false);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = keySize.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        return secretKeyGenerateKey;
    }

    private final byte[] unwrapSecretWithHardwareAES(byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            byte[] bArrDecryptAESGCM = CryptoUtilities.INSTANCE.decryptAESGCM(bArr, new SecretKeySpec(getOrCreateHardwareAESKey().getEncoded(), BouncyCastleKeyManagementRepository.AES));
            int i2 = copydefault + 15;
            EZpvd = i2 % 128;
            if (i2 % 2 == 0) {
                return bArrDecryptAESGCM;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.unwrapHardwareAES", "Hardware AES unwrapping failed: " + e.getMessage());
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public byte[] wrap(@NotNull byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        EZpvd = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            byte[] bArr2 = this.wrappedSecretCache;
            if (bArr2 == null) {
                throw new IllegalStateException("Wrapped secret not available");
            }
            byte[] bArrUnwrapSecretWithHardwareAES = unwrapSecretWithHardwareAES(bArr2);
            try {
                CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
                byte[] bArrEncryptAESGCM = cryptoUtilities.encryptAESGCM(bArr, cryptoUtilities.createAESKey(bArrUnwrapSecretWithHardwareAES));
                cryptoUtilities.secureCleanup(bArrUnwrapSecretWithHardwareAES);
                int i3 = EZpvd + 53;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 65 / 0;
                }
                return bArrEncryptAESGCM;
            } catch (Throwable th) {
                CryptoUtilities.INSTANCE.secureCleanup(bArrUnwrapSecretWithHardwareAES);
                throw th;
            }
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.wrap", "Hybrid wrap failed: " + e.getMessage());
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0041 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.web3.security.utils.internal.HybridImpl */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [byte[]] */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public byte[] unwrap(@NotNull byte[] bArr) throws Exception {
        byte[] bArrDecryptAESGCM;
        int i = 2 % 2;
        int i2 = copydefault + 107;
        EZpvd = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            WrapUtilsImpl.INSTANCE.isAuthorizedUnwrapCaller();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
        if (!wrapUtilsImpl.isAuthorizedUnwrapCaller()) {
            wrapUtilsImpl.monitorSecurityAttack("Unauthorized access attempt to unwrap method", wrapUtilsImpl.getSecureStackTrace());
            if (wrapUtilsImpl.isCallerCheckHitGray()) {
                throw new SecurityException("Unauthorized caller for unwrap operation");
            }
        }
        try {
            byte[] bArr2 = this.wrappedSecretCache;
            if (bArr2 == 0) {
                throw new IllegalStateException("Wrapped secret not available");
            }
            int i3 = copydefault + 117;
            EZpvd = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    byte[] bArrUnwrapSecretWithHardwareAES = unwrapSecretWithHardwareAES(bArr2);
                    CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
                    bArrDecryptAESGCM = cryptoUtilities.decryptAESGCM(bArr, cryptoUtilities.createAESKey(bArrUnwrapSecretWithHardwareAES));
                    byte[][] bArr3 = new byte[1][];
                    bArr3[1] = bArrUnwrapSecretWithHardwareAES;
                    cryptoUtilities.secureCleanup(bArr3);
                } else {
                    byte[] bArrUnwrapSecretWithHardwareAES2 = unwrapSecretWithHardwareAES(bArr2);
                    CryptoUtilities cryptoUtilities2 = CryptoUtilities.INSTANCE;
                    bArrDecryptAESGCM = cryptoUtilities2.decryptAESGCM(bArr, cryptoUtilities2.createAESKey(bArrUnwrapSecretWithHardwareAES2));
                    cryptoUtilities2.secureCleanup(bArrUnwrapSecretWithHardwareAES2);
                }
                int i4 = EZpvd + 59;
                copydefault = i4 % 128;
                bArr2 = i4 % 2;
                return bArrDecryptAESGCM;
            } catch (Throwable th) {
                CryptoUtilities.INSTANCE.secureCleanup(bArr2);
                throw th;
            }
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("HybridImpl.unwrap", "Hybrid unwrap failed: " + e.getMessage());
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getHybridStatus() {
        int i = 2 % 2;
        int i2 = EZpvd + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("ecc_fallback_activated", Boolean.valueOf(this.eccFallbackActivated)), C56390yDp.OLrzqt("aes_provider", "hardware"), C56390yDp.OLrzqt("ecc_provider", "software"), C56390yDp.OLrzqt("support_level", this.supportLevel), C56390yDp.OLrzqt("implementation_type", "hybrid"));
        int i4 = EZpvd + 105;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return mapGEmmrt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void OLrzqt() {
        KWHzl = -6126663971308220479L;
    }
}

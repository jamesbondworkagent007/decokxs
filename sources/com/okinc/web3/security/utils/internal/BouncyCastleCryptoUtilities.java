package com.okinc.web3.security.utils.internal;

import android.os.Build;
import android.util.Base64;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56392yDr;
import o.C56529yIt;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.pUU;
import o.yDV;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BouncyCastleCryptoUtilities {
    private static final String BC_PROVIDER = "BC";
    private static final String EC_CURVE = "secp256r1";
    private static final String TAG = "BouncyCastleCryptoUtilities";
    public static final BouncyCastleCryptoUtilities INSTANCE = new BouncyCastleCryptoUtilities();
    private static final InterfaceC56387yDm externalBCProvider$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.utils.internal.BouncyCastleCryptoUtilities$$ExternalSyntheticLambda0
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BouncyCastleCryptoUtilities.externalBCProvider_delegate$lambda$0();
        }
    });
    public static final int $stable = 8;

    private BouncyCastleCryptoUtilities() {
    }

    private final BouncyCastleProvider getExternalBCProvider() {
        return (BouncyCastleProvider) externalBCProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BouncyCastleProvider externalBCProvider_delegate$lambda$0() {
        return new BouncyCastleProvider();
    }

    private final <T> T withTemporaryExternalBC(Function0<? extends T> function0) throws Exception {
        if (Build.VERSION.SDK_INT > 25) {
            return function0.invoke();
        }
        Provider[] providerArr = (Provider[]) Security.getProviders().clone();
        try {
            setupExternalBCForECOperations();
            T tInvoke = function0.invoke();
            if (verifyDefaultProviderAESGCMSupport()) {
                restoreOriginalProviders(providerArr);
            } else {
                pUU.valueOf(TAG, "⚠️ Keeping external BC - default provider lacks proper AES-GCM support");
            }
            return tInvoke;
        } catch (Exception e) {
            try {
                restoreOriginalProviders(providerArr);
            } catch (Exception e2) {
                pUU.copydefault(TAG, "Failed to restore providers after error: " + e2.getMessage());
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e2.getMessage());
            }
            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.withTemporaryExternalBC", "Temporary BC operation failed: " + e.getMessage());
            throw e;
        }
    }

    private final void setupExternalBCForECOperations() throws Exception {
        try {
            Security.removeProvider("BC");
            Security.insertProviderAt(new BouncyCastleProvider(), 1);
            Provider provider = Security.getProvider("BC");
            if (provider != null) {
                String name = provider.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (C59449zhJ.startsWith$default(name, "org.bouncycastle", false, 2, null)) {
                    return;
                }
            }
            pUU.valueOf(TAG, "⚠️ Warning: Expected external BC but got: " + (provider != null ? provider.getClass().getName() : null));
        } catch (Exception e) {
            pUU.copydefault(TAG, "Failed to set up external BouncyCastle provider: " + e.getMessage());
            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.setupExternalBCForECOperations", "External BC setup failed: " + e.getMessage());
            throw e;
        }
    }

    private final boolean verifyDefaultProviderAESGCMSupport() {
        try {
            try {
                try {
                    Security.removeProvider("BC");
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    byte[] bArr = new byte[32];
                    for (int i = 0; i < 32; i++) {
                        bArr[i] = (byte) i;
                    }
                    cipher.init(1, new SecretKeySpec(bArr, BouncyCastleKeyManagementRepository.AES));
                    cipher.getIV();
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = "test".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    cipher.updateAAD(bytes);
                    byte[] bytes2 = "test data".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    cipher.doFinal(bytes2);
                    return true;
                } finally {
                    Security.removeProvider("BC");
                    Security.insertProviderAt(new BouncyCastleProvider(), 1);
                }
            } catch (Exception e) {
                pUU.valueOf(TAG, "❌ Default provider lacks proper AES-GCM support: " + e.getMessage());
                Security.removeProvider("BC");
                Security.insertProviderAt(new BouncyCastleProvider(), 1);
                return false;
            }
        } catch (Exception e2) {
            pUU.copydefault(TAG, "Failed to verify AES-GCM support: " + e2.getMessage());
            return false;
        }
    }

    private final void restoreOriginalProviders(Provider[] providerArr) throws Exception {
        try {
            Provider[] providers = Security.getProviders();
            Intrinsics.copydefault(providers);
            for (Provider provider : providers) {
                try {
                    Security.removeProvider(provider.getName());
                } catch (Exception e) {
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.removeProvider", "Failed to remove provider " + provider.getName() + ": " + e.getMessage());
                }
            }
            int i = 0;
            for (Provider provider2 : providerArr) {
                i++;
                try {
                    Security.insertProviderAt(provider2, i);
                } catch (Exception e2) {
                    pUU.copydefault(TAG, "Failed to restore provider " + provider2.getName() + " at position " + i + ": " + e2.getMessage());
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.insertProvider", "Failed to restore provider " + provider2.getName() + " at position " + i + ": " + e2.getMessage());
                }
            }
        } catch (Exception e3) {
            pUU.copydefault(TAG, "Failed to restore original providers: " + e3.getMessage());
            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e3.getMessage());
            throw e3;
        }
    }

    private final PublicKey createKeyWithExternalBouncyCastle(BigInteger bigInteger, BigInteger bigInteger2) throws Exception {
        Exception exc;
        KeyFactory keyFactory;
        try {
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(EC_CURVE);
            try {
                try {
                    ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(parameterSpec.getCurve().createPoint(bigInteger, bigInteger2), parameterSpec);
                    try {
                        keyFactory = KeyFactory.getInstance("EC", "BC");
                        exc = null;
                    } catch (Exception e) {
                        try {
                            exc = e;
                            keyFactory = KeyFactory.getInstance("EC", getExternalBCProvider());
                        } catch (Exception e2) {
                            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.getKeyFactory", "Both BC KeyFactory approaches failed - Registry: " + e.getMessage() + ", Direct: " + e2.getMessage());
                            throw e2;
                        }
                    }
                    try {
                        Intrinsics.copydefault(keyFactory);
                        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(eCPublicKeySpec);
                        Intrinsics.copydefault(publicKeyGeneratePublic);
                        return publicKeyGeneratePublic;
                    } catch (Exception e3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to generate BC public key: " + e3.getMessage());
                        sb.append(" | Key spec class: " + ECPublicKeySpec.class.getName());
                        Intrinsics.copydefault(keyFactory);
                        sb.append(" | KeyFactory provider: " + keyFactory.getProvider().getClass().getName());
                        if (e3 instanceof InvalidKeySpecException) {
                            sb.append(" | Type: InvalidKeySpecException (key spec/provider mismatch)");
                            if (exc != null) {
                                sb.append(" | Original registry error: " + exc.getMessage());
                            }
                        } else {
                            sb.append(" | Exception type: " + e3.getClass().getSimpleName());
                        }
                        WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.generatePublicKey", sb.toString());
                        throw e3;
                    }
                } catch (Exception e4) {
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.createKeySpec", "Failed to create BC key spec: " + e4.getMessage());
                    throw e4;
                }
            } catch (Exception e5) {
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.createECPoint", "Failed to create BC EC point: " + e5.getMessage());
                throw e5;
            }
        } catch (Exception e6) {
            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.getCurveSpec", "Failed to get BC curve spec for secp256r1: " + e6.getMessage());
            throw e6;
        }
    }

    public final KeyPair createECCKeyPair() throws Exception {
        KeyPair keyPairGenerateKeyPair;
        KeyPair keyPairGenerateKeyPair2;
        if (Build.VERSION.SDK_INT > 25) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "BC");
                keyPairGenerator.initialize(new ECGenParameterSpec(EC_CURVE));
                keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            } catch (Exception e) {
                try {
                    KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance("EC", INSTANCE.getExternalBCProvider());
                    keyPairGenerator2.initialize(new ECGenParameterSpec(EC_CURVE));
                    keyPairGenerateKeyPair = keyPairGenerator2.generateKeyPair();
                } catch (Exception e2) {
                    String str = "Registry failed: " + e.getMessage() + ", Direct failed: " + e2.getMessage();
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.createECCKeyPair", "Both BouncyCastle approaches failed: " + str);
                    throw new IllegalStateException("All BouncyCastle EC keypair generation methods failed", e2);
                }
            }
            keyPairGenerateKeyPair2 = keyPairGenerateKeyPair;
        } else {
            Provider[] providerArr = (Provider[]) Security.getProviders().clone();
            try {
                setupExternalBCForECOperations();
                try {
                    KeyPairGenerator keyPairGenerator3 = KeyPairGenerator.getInstance("EC", "BC");
                    keyPairGenerator3.initialize(new ECGenParameterSpec(EC_CURVE));
                    keyPairGenerateKeyPair2 = keyPairGenerator3.generateKeyPair();
                } catch (Exception e3) {
                    try {
                        KeyPairGenerator keyPairGenerator4 = KeyPairGenerator.getInstance("EC", INSTANCE.getExternalBCProvider());
                        keyPairGenerator4.initialize(new ECGenParameterSpec(EC_CURVE));
                        keyPairGenerateKeyPair2 = keyPairGenerator4.generateKeyPair();
                    } catch (Exception e4) {
                        String str2 = "Registry failed: " + e3.getMessage() + ", Direct failed: " + e4.getMessage();
                        WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.createECCKeyPair", "Both BouncyCastle approaches failed: " + str2);
                        throw new IllegalStateException("All BouncyCastle EC keypair generation methods failed", e4);
                    }
                }
                if (verifyDefaultProviderAESGCMSupport()) {
                    restoreOriginalProviders(providerArr);
                } else {
                    pUU.valueOf(TAG, "⚠️ Keeping external BC - default provider lacks proper AES-GCM support");
                }
            } catch (Exception e5) {
                try {
                    restoreOriginalProviders(providerArr);
                } catch (Exception e6) {
                    pUU.copydefault(TAG, "Failed to restore providers after error: " + e6.getMessage());
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e6.getMessage());
                }
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.withTemporaryExternalBC", "Temporary BC operation failed: " + e5.getMessage());
                throw e5;
            }
        }
        Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair2, "");
        return keyPairGenerateKeyPair2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [226=4, 241=4] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041c A[Catch: Exception -> 0x0456, TryCatch #7 {Exception -> 0x0456, blocks: (B:113:0x038a, B:115:0x0395, B:117:0x03a1, B:119:0x03c0, B:121:0x03dc, B:126:0x03fd, B:130:0x0418, B:132:0x041c, B:134:0x0421, B:136:0x0424, B:118:0x03ba), top: B:153:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df A[Catch: Exception -> 0x021b, TryCatch #5 {Exception -> 0x021b, blocks: (B:45:0x014a, B:47:0x0155, B:49:0x0161, B:51:0x0180, B:53:0x019c, B:58:0x01bd, B:62:0x01db, B:64:0x01df, B:66:0x01e4, B:68:0x01e7, B:50:0x017a), top: B:150:0x014a, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PublicKey decodePublicKeyHex(@NotNull String str) throws Exception {
        byte[] bArrDecode;
        String str2;
        boolean z;
        int i;
        byte[] bArrDecode2;
        boolean z2;
        int i2;
        String str3;
        String str4;
        String str5;
        byte[] bArrDecode3;
        String str6;
        boolean z3;
        int i3;
        byte[] bArrDecode4;
        boolean z4;
        int i4;
        Intrinsics.checkNotNullParameter(str, "");
        String str7 = " | First byte: 0x";
        String str8 = "BouncyCastle public key decoding failed";
        String str9 = "BouncyCastleCryptoUtilities.decodePublicKeyHex";
        if (Build.VERSION.SDK_INT > 25) {
            String str10 = str9;
            try {
            } catch (Exception e) {
                e = e;
                str8 = str8;
                str9 = str10;
            }
            try {
                if (new Regex("(?i)^[0-9a-f]+$").matches(str)) {
                    int length = str.length() / 2;
                    bArrDecode2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = length;
                        int i7 = i5 * 2;
                        String str11 = str10;
                        String strSubstring = str.substring(i7, i7 + 2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        bArrDecode2[i5] = (byte) Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
                        i5++;
                        length = i6;
                        str10 = str11;
                    }
                } else {
                    bArrDecode2 = Base64.decode(str, 2);
                }
                Intrinsics.copydefault(bArrDecode2);
                if (bArrDecode2.length == 0) {
                    i2 = 1;
                    z2 = true;
                } else {
                    z2 = false;
                    i2 = 1;
                }
                if (!(!z2) || bArrDecode2[0] != 4) {
                    throw new IllegalArgumentException("Invalid uncompressed EC point".toString());
                }
                int length2 = ((bArrDecode2.length - i2) / 2) + i2;
                return INSTANCE.createKeyWithExternalBouncyCastle(new BigInteger(i2, Arrays.copyOfRange(bArrDecode2, i2, length2)), new BigInteger(i2, Arrays.copyOfRange(bArrDecode2, length2, bArrDecode2.length)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                StringBuilder sb = new StringBuilder();
                sb.append("BouncyCastle public key decoding failed: " + exc.getMessage());
                sb.append(" | Input length: " + str.length());
                sb.append(" | Input format: " + (new Regex("(?i)^[0-9a-f]+$").matches(str) ? "HEX" : "Base64/Other"));
                try {
                    if (new Regex("(?i)^[0-9a-f]+$").matches(str)) {
                        int length3 = str.length() / 2;
                        bArrDecode = new byte[length3];
                        for (int i8 = 0; i8 < length3; i8++) {
                            int i9 = i8 * 2;
                            String strSubstring2 = str.substring(i9, i9 + 2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            bArrDecode[i8] = (byte) Integer.parseInt(strSubstring2, CharsKt__CharJVMKt.checkRadix(16));
                        }
                    } else {
                        bArrDecode = Base64.decode(str, 2);
                    }
                    sb.append(" | Raw bytes: " + bArrDecode.length);
                    Intrinsics.copydefault(bArrDecode);
                    Byte bGEmmrt = yDV.gEmmrt(bArrDecode);
                    if (bGEmmrt != null) {
                        byte bByteValue = bGEmmrt.byteValue();
                        C56529yIt c56529yIt = C56529yIt.KWHzl;
                        String str12 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(bByteValue)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str12, "");
                        if (str12 == null) {
                            str2 = AbstractJsonLexerKt.NULL;
                            sb.append(" | First byte: 0x" + str2);
                            if (bArrDecode.length == 0) {
                                i = 1;
                                z = true;
                            } else {
                                z = false;
                                i = 1;
                            }
                            if ((!z) && bArrDecode[0] == 4 && bArrDecode.length > i) {
                                int length4 = (bArrDecode.length - i) / 2;
                                sb.append(" | Coord length: " + length4);
                                sb.append(" | Expected key size: " + (length4 * 8) + " bits");
                            }
                        } else {
                            str2 = str12;
                            sb.append(" | First byte: 0x" + str2);
                            if (bArrDecode.length == 0) {
                            }
                            if (!z) {
                                int length42 = (bArrDecode.length - i) / 2;
                                sb.append(" | Coord length: " + length42);
                                sb.append(" | Expected key size: " + (length42 * 8) + " bits");
                            }
                        }
                    } else {
                        str2 = AbstractJsonLexerKt.NULL;
                        sb.append(" | First byte: 0x" + str2);
                        if (bArrDecode.length == 0) {
                        }
                        if (!z) {
                        }
                    }
                } catch (Exception e3) {
                    sb.append(" | Parse failed: " + e3.getMessage());
                }
                WrapUtilsImpl.INSTANCE.monitorCallError(str9, sb.toString());
                throw new IllegalStateException(str8, exc);
            }
        }
        Provider[] providerArr = (Provider[]) Security.getProviders().clone();
        try {
            setupExternalBCForECOperations();
            try {
                try {
                    if (new Regex("(?i)^[0-9a-f]+$").matches(str)) {
                        int length5 = str.length() / 2;
                        str5 = " | Parse failed: ";
                        try {
                            bArrDecode4 = new byte[length5];
                            int i10 = 0;
                            while (i10 < length5) {
                                int i11 = length5;
                                int i12 = i10 * 2;
                                String str13 = str7;
                                String strSubstring3 = str.substring(i12, i12 + 2);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                                bArrDecode4[i10] = (byte) Integer.parseInt(strSubstring3, CharsKt__CharJVMKt.checkRadix(16));
                                i10++;
                                length5 = i11;
                                str7 = str13;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str3 = " | First byte: 0x";
                            str4 = " | Expected key size: ";
                            Exception exc2 = e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("BouncyCastle public key decoding failed: " + exc2.getMessage());
                            sb2.append(" | Input length: " + str.length());
                            sb2.append(" | Input format: " + (new Regex("(?i)^[0-9a-f]+$").matches(str) ? "HEX" : "Base64/Other"));
                            try {
                                if (new Regex("(?i)^[0-9a-f]+$").matches(str)) {
                                    int length6 = str.length() / 2;
                                    bArrDecode3 = new byte[length6];
                                    for (int i13 = 0; i13 < length6; i13++) {
                                        int i14 = i13 * 2;
                                        String strSubstring4 = str.substring(i14, i14 + 2);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                                        bArrDecode3[i13] = (byte) Integer.parseInt(strSubstring4, CharsKt__CharJVMKt.checkRadix(16));
                                    }
                                } else {
                                    bArrDecode3 = Base64.decode(str, 2);
                                }
                                sb2.append(" | Raw bytes: " + bArrDecode3.length);
                                Intrinsics.copydefault(bArrDecode3);
                                Byte bGEmmrt2 = yDV.gEmmrt(bArrDecode3);
                                if (bGEmmrt2 != null) {
                                    byte bByteValue2 = bGEmmrt2.byteValue();
                                    C56529yIt c56529yIt2 = C56529yIt.KWHzl;
                                    String str14 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(bByteValue2)}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str14, "");
                                    if (str14 == null) {
                                        str6 = AbstractJsonLexerKt.NULL;
                                        sb2.append(str3 + str6);
                                        if (bArrDecode3.length == 0) {
                                            i3 = 1;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                            i3 = 1;
                                        }
                                        if ((!z3) && bArrDecode3[0] == 4 && bArrDecode3.length > i3) {
                                            int length7 = (bArrDecode3.length - i3) / 2;
                                            sb2.append(" | Coord length: " + length7);
                                            sb2.append(str4 + (length7 * 8) + " bits");
                                        }
                                    } else {
                                        str6 = str14;
                                        sb2.append(str3 + str6);
                                        if (bArrDecode3.length == 0) {
                                        }
                                        if (!z3) {
                                            int length72 = (bArrDecode3.length - i3) / 2;
                                            sb2.append(" | Coord length: " + length72);
                                            sb2.append(str4 + (length72 * 8) + " bits");
                                        }
                                    }
                                } else {
                                    str6 = AbstractJsonLexerKt.NULL;
                                    sb2.append(str3 + str6);
                                    if (bArrDecode3.length == 0) {
                                    }
                                    if (!z3) {
                                    }
                                }
                            } catch (Exception e5) {
                                sb2.append(str5 + e5.getMessage());
                            }
                            WrapUtilsImpl.INSTANCE.monitorCallError(str9, sb2.toString());
                            throw new IllegalStateException(str8, exc2);
                        }
                    } else {
                        bArrDecode4 = Base64.decode(str, 2);
                    }
                    Intrinsics.copydefault(bArrDecode4);
                    if (bArrDecode4.length == 0) {
                        i4 = 1;
                        z4 = true;
                    } else {
                        z4 = false;
                        i4 = 1;
                    }
                    if (!(!z4) || bArrDecode4[0] != 4) {
                        throw new IllegalArgumentException("Invalid uncompressed EC point".toString());
                    }
                    int length8 = ((bArrDecode4.length - i4) / 2) + i4;
                    PublicKey publicKeyCreateKeyWithExternalBouncyCastle = INSTANCE.createKeyWithExternalBouncyCastle(new BigInteger(i4, Arrays.copyOfRange(bArrDecode4, i4, length8)), new BigInteger(i4, Arrays.copyOfRange(bArrDecode4, length8, bArrDecode4.length)));
                    if (verifyDefaultProviderAESGCMSupport()) {
                        restoreOriginalProviders(providerArr);
                        return publicKeyCreateKeyWithExternalBouncyCastle;
                    }
                    pUU.valueOf(TAG, "⚠️ Keeping external BC - default provider lacks proper AES-GCM support");
                    return publicKeyCreateKeyWithExternalBouncyCastle;
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                str3 = " | First byte: 0x";
                str4 = " | Expected key size: ";
                str5 = " | Parse failed: ";
            }
        } catch (Exception e8) {
            try {
                restoreOriginalProviders(providerArr);
            } catch (Exception e9) {
                pUU.copydefault(TAG, "Failed to restore providers after error: " + e9.getMessage());
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e9.getMessage());
            }
            WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.withTemporaryExternalBC", "Temporary BC operation failed: " + e8.getMessage());
            throw e8;
        }
    }

    public final byte[] performECDH(@NotNull PrivateKey privateKey, @NotNull PublicKey publicKey) throws Exception {
        byte[] bArrGenerateSecret;
        Intrinsics.checkNotNullParameter(privateKey, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        if (Build.VERSION.SDK_INT > 25) {
            try {
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH", "BC");
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(publicKey, true);
                bArrGenerateSecret = keyAgreement.generateSecret();
            } catch (Exception e) {
                try {
                    KeyAgreement keyAgreement2 = KeyAgreement.getInstance("ECDH", INSTANCE.getExternalBCProvider());
                    keyAgreement2.init(privateKey);
                    keyAgreement2.doPhase(publicKey, true);
                    bArrGenerateSecret = keyAgreement2.generateSecret();
                } catch (Exception e2) {
                    String str = "Registry failed: " + e.getMessage() + ", Direct failed: " + e2.getMessage();
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.performECDH", "Both BouncyCastle ECDH approaches failed: " + str);
                    throw new IllegalStateException("All BouncyCastle ECDH methods failed", e2);
                }
            }
        } else {
            Provider[] providerArr = (Provider[]) Security.getProviders().clone();
            try {
                setupExternalBCForECOperations();
                try {
                    KeyAgreement keyAgreement3 = KeyAgreement.getInstance("ECDH", "BC");
                    keyAgreement3.init(privateKey);
                    keyAgreement3.doPhase(publicKey, true);
                    bArrGenerateSecret = keyAgreement3.generateSecret();
                } catch (Exception e3) {
                    try {
                        KeyAgreement keyAgreement4 = KeyAgreement.getInstance("ECDH", INSTANCE.getExternalBCProvider());
                        keyAgreement4.init(privateKey);
                        keyAgreement4.doPhase(publicKey, true);
                        bArrGenerateSecret = keyAgreement4.generateSecret();
                    } catch (Exception e4) {
                        String str2 = "Registry failed: " + e3.getMessage() + ", Direct failed: " + e4.getMessage();
                        WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.performECDH", "Both BouncyCastle ECDH approaches failed: " + str2);
                        throw new IllegalStateException("All BouncyCastle ECDH methods failed", e4);
                    }
                }
                if (verifyDefaultProviderAESGCMSupport()) {
                    restoreOriginalProviders(providerArr);
                } else {
                    pUU.valueOf(TAG, "⚠️ Keeping external BC - default provider lacks proper AES-GCM support");
                }
            } catch (Exception e5) {
                try {
                    restoreOriginalProviders(providerArr);
                } catch (Exception e6) {
                    pUU.copydefault(TAG, "Failed to restore providers after error: " + e6.getMessage());
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e6.getMessage());
                }
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.withTemporaryExternalBC", "Temporary BC operation failed: " + e5.getMessage());
                throw e5;
            }
        }
        Intrinsics.checkNotNullExpressionValue(bArrGenerateSecret, "");
        return bArrGenerateSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [394=4, 414=4] */
    public final String ecPublicKeyToHex(@NotNull PublicKey publicKey) throws Exception {
        String strEncodeToString;
        Intrinsics.checkNotNullParameter(publicKey, "");
        if (Build.VERSION.SDK_INT <= 25) {
            Provider[] providerArr = (Provider[]) Security.getProviders().clone();
            try {
                setupExternalBCForECOperations();
                try {
                    KeyFactory keyFactory = KeyFactory.getInstance("EC", "BC");
                    ECPoint w = ((ECPublicKey) publicKey).getW();
                    PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new ECPublicKeySpec(ECNamedCurveTable.getParameterSpec(EC_CURVE).getCurve().createPoint(w.getAffineX(), w.getAffineY()), ECNamedCurveTable.getParameterSpec(EC_CURVE)));
                    Intrinsics.copydefault(publicKeyGeneratePublic);
                    strEncodeToString = Base64.encodeToString(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKeyGeneratePublic).getQ().getEncoded(false), 2);
                } catch (Exception e) {
                    pUU.valueOf(TAG, "⚠️ Registry-based key encoding failed, trying direct provider: " + e.getMessage());
                    try {
                        KeyFactory keyFactory2 = KeyFactory.getInstance("EC", INSTANCE.getExternalBCProvider());
                        ECPoint w2 = ((ECPublicKey) publicKey).getW();
                        PublicKey publicKeyGeneratePublic2 = keyFactory2.generatePublic(new ECPublicKeySpec(ECNamedCurveTable.getParameterSpec(EC_CURVE).getCurve().createPoint(w2.getAffineX(), w2.getAffineY()), ECNamedCurveTable.getParameterSpec(EC_CURVE)));
                        Intrinsics.copydefault(publicKeyGeneratePublic2);
                        strEncodeToString = Base64.encodeToString(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKeyGeneratePublic2).getQ().getEncoded(false), 2);
                    } catch (Exception e2) {
                        String str = "Registry failed: " + e.getMessage() + ", Direct failed: " + e2.getMessage();
                        WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.ecPublicKeyToHex", "Both BouncyCastle key encoding approaches failed: " + str);
                        throw new IllegalStateException("All BouncyCastle public key encoding methods failed", e2);
                    }
                }
                if (verifyDefaultProviderAESGCMSupport()) {
                    restoreOriginalProviders(providerArr);
                } else {
                    pUU.valueOf(TAG, "⚠️ Keeping external BC - default provider lacks proper AES-GCM support");
                }
            } catch (Exception e3) {
                try {
                    restoreOriginalProviders(providerArr);
                } catch (Exception e4) {
                    pUU.copydefault(TAG, "Failed to restore providers after error: " + e4.getMessage());
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.restoreOriginalProviders", "Provider restoration failed: " + e4.getMessage());
                }
                WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.withTemporaryExternalBC", "Temporary BC operation failed: " + e3.getMessage());
                throw e3;
            }
        } else {
            try {
                KeyFactory keyFactory3 = KeyFactory.getInstance("EC", "BC");
                ECPoint w3 = ((ECPublicKey) publicKey).getW();
                PublicKey publicKeyGeneratePublic3 = keyFactory3.generatePublic(new ECPublicKeySpec(ECNamedCurveTable.getParameterSpec(EC_CURVE).getCurve().createPoint(w3.getAffineX(), w3.getAffineY()), ECNamedCurveTable.getParameterSpec(EC_CURVE)));
                Intrinsics.copydefault(publicKeyGeneratePublic3);
                strEncodeToString = Base64.encodeToString(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKeyGeneratePublic3).getQ().getEncoded(false), 2);
            } catch (Exception e5) {
                pUU.valueOf(TAG, "⚠️ Registry-based key encoding failed, trying direct provider: " + e5.getMessage());
                try {
                    KeyFactory keyFactory4 = KeyFactory.getInstance("EC", INSTANCE.getExternalBCProvider());
                    ECPoint w4 = ((ECPublicKey) publicKey).getW();
                    PublicKey publicKeyGeneratePublic4 = keyFactory4.generatePublic(new ECPublicKeySpec(ECNamedCurveTable.getParameterSpec(EC_CURVE).getCurve().createPoint(w4.getAffineX(), w4.getAffineY()), ECNamedCurveTable.getParameterSpec(EC_CURVE)));
                    Intrinsics.copydefault(publicKeyGeneratePublic4);
                    strEncodeToString = Base64.encodeToString(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKeyGeneratePublic4).getQ().getEncoded(false), 2);
                } catch (Exception e6) {
                    String str2 = "Registry failed: " + e5.getMessage() + ", Direct failed: " + e6.getMessage();
                    WrapUtilsImpl.INSTANCE.monitorCallError("BouncyCastleCryptoUtilities.ecPublicKeyToHex", "Both BouncyCastle key encoding approaches failed: " + str2);
                    throw new IllegalStateException("All BouncyCastle public key encoding methods failed", e6);
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }
}

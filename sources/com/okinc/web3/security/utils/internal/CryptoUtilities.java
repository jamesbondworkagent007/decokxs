package com.okinc.web3.security.utils.internal;

import android.util.Base64;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import o.yDT;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CryptoUtilities {
    public static final int $stable = 0;
    private static final String EC_CURVE = "secp256r1";
    public static final CryptoUtilities INSTANCE = new CryptoUtilities();
    private static final String TAG = "CryptoUtilities";

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AESGCMMode.values().length];
            try {
                iArr[AESGCMMode.ENCRYPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AESGCMMode.DECRYPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CryptoUtilities() {
    }

    public final String ecPublicKeyToHex(@NotNull PublicKey publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "");
        try {
            if (!(publicKey instanceof ECPublicKey)) {
                throw new IllegalArgumentException(("PublicKey is not EC: " + publicKey.getClass()).toString());
            }
            ECPoint w = ((ECPublicKey) publicKey).getW();
            int fieldSize = (((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize() + 7) / 8;
            BigInteger affineX = w.getAffineX();
            Intrinsics.checkNotNullExpressionValue(affineX, "");
            byte[] bArrEcPublicKeyToHex$toFixed = ecPublicKeyToHex$toFixed(affineX, fieldSize);
            BigInteger affineY = w.getAffineY();
            Intrinsics.checkNotNullExpressionValue(affineY, "");
            String strEncodeToString = Base64.encodeToString(yDT.copydefault(yDT.copydefault(new byte[]{4}, bArrEcPublicKeyToHex$toFixed), ecPublicKeyToHex$toFixed(affineY, fieldSize)), 2);
            Intrinsics.copydefault((Object) strEncodeToString);
            return strEncodeToString;
        } catch (Exception e) {
            try {
                return BouncyCastleCryptoUtilities.INSTANCE.ecPublicKeyToHex(publicKey);
            } catch (Exception e2) {
                WrapUtilsImpl.INSTANCE.monitorCallError("CryptoUtilities.ecPublicKeyToHex", "Both native and BouncyCastle conversion failed: Native=" + e.getMessage() + ", BC=" + e2.getMessage());
                throw new IllegalStateException("All EC public key conversion methods failed", e2);
            }
        }
    }

    private static final byte[] ecPublicKeyToHex$toFixed(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > i && byteArray[0] == 0) {
            Intrinsics.copydefault(byteArray);
            byteArray = yDT.AEQbTJ(byteArray, 1, byteArray.length);
        }
        if (byteArray.length >= i) {
            Intrinsics.copydefault(byteArray);
            return byteArray;
        }
        byte[] bArr = new byte[i - byteArray.length];
        Intrinsics.copydefault(byteArray);
        return yDT.copydefault(bArr, byteArray);
    }

    public final PublicKey decodePublicKeyHex(@NotNull String str) {
        byte[] bArrDecode;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (new Regex("(?i)^[0-9a-f]+$").matches(str)) {
                int length = str.length() / 2;
                bArrDecode = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String strSubstring = str.substring(i2, i2 + 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    bArrDecode[i] = (byte) Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
                }
            } else {
                bArrDecode = Base64.decode(str, 2);
            }
            Intrinsics.copydefault(bArrDecode);
            if (!(!(bArrDecode.length == 0)) || bArrDecode[0] != 4) {
                throw new IllegalArgumentException("Invalid uncompressed EC point".toString());
            }
            int length2 = ((bArrDecode.length - 1) / 2) + 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 1, length2);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrDecode, length2, bArrDecode.length);
            BigInteger bigInteger = new BigInteger(1, bArrCopyOfRange);
            BigInteger bigInteger2 = new BigInteger(1, bArrCopyOfRange2);
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(EC_CURVE));
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
            Intrinsics.copydefault(publicKeyGeneratePublic);
            return publicKeyGeneratePublic;
        } catch (Exception e) {
            try {
                return BouncyCastleCryptoUtilities.INSTANCE.decodePublicKeyHex(str);
            } catch (Exception e2) {
                WrapUtilsImpl.INSTANCE.monitorCallError("CryptoUtilities.decodePublicKeyHex", "Both native and BouncyCastle decoding failed: Native=" + e.getMessage() + ", BC=" + e2.getMessage());
                throw new IllegalStateException("All EC public key decoding methods failed", e2);
            }
        }
    }

    public static /* synthetic */ SecretKeySpec hkdfDerivedSymmetricKey$default(CryptoUtilities cryptoUtilities, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bArr2 = null;
        }
        if ((i2 & 4) != 0) {
            bArr3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 32;
        }
        return cryptoUtilities.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
    }

    public final SecretKeySpec hkdfDerivedSymmetricKey(@NotNull byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4;
        byte[] bArrCopyOf;
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            if (bArr2 == null) {
                int macLength = mac.getMacLength();
                bArr4 = new byte[macLength];
                for (int i2 = 0; i2 < macLength; i2++) {
                    bArr4[i2] = 0;
                }
            } else {
                bArr4 = bArr2;
            }
            mac.init(new SecretKeySpec(bArr4, "HmacSHA256"));
            byte[] bArrDoFinal = mac.doFinal(bArr);
            try {
                byte[] bArr5 = new byte[i];
                byte[] bArr6 = new byte[0];
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, "HmacSHA256");
                byte b = 1;
                int i3 = 0;
                while (i3 < i) {
                    try {
                        mac.reset();
                        mac.init(secretKeySpec);
                        mac.update(bArr6);
                        if (bArr3 != null) {
                            mac.update(bArr3);
                        }
                        mac.update(b);
                        byte[] bArrDoFinal2 = mac.doFinal();
                        try {
                            int iMin = Math.min(bArrDoFinal2.length, i - i3);
                            System.arraycopy(bArrDoFinal2, 0, bArr5, i3, iMin);
                            i3 += iMin;
                            Arrays.fill(bArr6, (byte) 0);
                            Intrinsics.copydefault(bArrDoFinal2);
                            bArrCopyOf = Arrays.copyOf(bArrDoFinal2, bArrDoFinal2.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                            b = (byte) (b + 1);
                        } finally {
                            Arrays.fill(bArrDoFinal2, (byte) 0);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bArr6 = bArrCopyOf;
                    } catch (Throwable th2) {
                        th = th2;
                        bArr6 = bArrCopyOf;
                        Arrays.fill(bArr6, (byte) 0);
                        throw th;
                    }
                }
                SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr5, BouncyCastleKeyManagementRepository.AES);
                Arrays.fill(bArr6, (byte) 0);
                return secretKeySpec2;
            } finally {
                Arrays.fill(bArrDoFinal, (byte) 0);
                if (bArr2 == null) {
                    Arrays.fill(bArr4, (byte) 0);
                }
            }
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("CryptoUtilities.hkdfDerivedSymmetricKey", "HKDF derivation failed: " + e.getMessage());
            throw e;
        }
    }

    public final KeyPair createSoftwareECCKeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(EC_CURVE));
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            Intrinsics.copydefault(keyPairGenerateKeyPair);
            return keyPairGenerateKeyPair;
        } catch (Exception e) {
            try {
                return BouncyCastleCryptoUtilities.INSTANCE.createECCKeyPair();
            } catch (Exception e2) {
                WrapUtilsImpl.INSTANCE.monitorCallError("CryptoUtilities.createSoftwareECCKeyPair", "Both native and BouncyCastle keypair generation failed: Native=" + e.getMessage() + ", BC=" + e2.getMessage());
                throw new IllegalStateException("All EC keypair generation methods failed", e2);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AESGCMMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AESGCMMode[] $VALUES;
        public static final AESGCMMode ENCRYPT = new AESGCMMode("ENCRYPT", 0);
        public static final AESGCMMode DECRYPT = new AESGCMMode("DECRYPT", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AESGCMMode[] $values() {
            return new AESGCMMode[]{ENCRYPT, DECRYPT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AESGCMMode> getEntries() {
            return $ENTRIES;
        }

        private AESGCMMode(String str, int i) {
        }

        static {
            AESGCMMode[] aESGCMModeArr$values = $values();
            $VALUES = aESGCMModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(aESGCMModeArr$values);
        }

        public static AESGCMMode valueOf(String str) {
            return (AESGCMMode) Enum.valueOf(AESGCMMode.class, str);
        }

        public static AESGCMMode[] values() {
            return (AESGCMMode[]) $VALUES.clone();
        }
    }

    public final byte[] processAESGCM(@NotNull byte[] bArr, @NotNull SecretKeySpec secretKeySpec, @NotNull AESGCMMode aESGCMMode) throws Exception {
        String str;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(secretKeySpec, "");
        Intrinsics.checkNotNullParameter(aESGCMMode, "");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[aESGCMMode.ordinal()];
        if (i == 1) {
            str = "encryption";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "decryption";
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            int i2 = iArr[aESGCMMode.ordinal()];
            if (i2 == 1) {
                cipher.init(1, secretKeySpec);
                byte[] iv = cipher.getIV();
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                Intrinsics.copydefault(iv);
                Intrinsics.copydefault(bArrDoFinal);
                return yDT.copydefault(iv, bArrDoFinal);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (bArr.length <= 12) {
                throw new IllegalArgumentException("Encrypted data too short for decryption".toString());
            }
            byte[] bArrEZpvd = yDV.EZpvd(bArr, C56548yJl.AhwBna(0, 12));
            byte[] bArrEZpvd2 = yDV.EZpvd(bArr, C56548yJl.AhwBna(12, bArr.length));
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArrEZpvd));
            byte[] bArrDoFinal2 = cipher.doFinal(bArrEZpvd2);
            Intrinsics.copydefault(bArrDoFinal2);
            return bArrDoFinal2;
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError("CryptoUtilities.processAESGCM", "AES " + str + " failed: " + e.getMessage());
            throw e;
        }
    }

    public final byte[] encryptAESGCM(@NotNull byte[] bArr, @NotNull SecretKeySpec secretKeySpec) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(secretKeySpec, "");
        return processAESGCM(bArr, secretKeySpec, AESGCMMode.ENCRYPT);
    }

    public final byte[] decryptAESGCM(@NotNull byte[] bArr, @NotNull SecretKeySpec secretKeySpec) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(secretKeySpec, "");
        return processAESGCM(bArr, secretKeySpec, AESGCMMode.DECRYPT);
    }

    public final SecretKeySpec createAESKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new SecretKeySpec(bArr, 0, Math.min(bArr.length, 32), BouncyCastleKeyManagementRepository.AES);
    }

    public final void secureCleanup(@NotNull byte[]... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
            }
        }
    }
}

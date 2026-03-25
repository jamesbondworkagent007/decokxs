package o;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C34701nh;
import org.jetbrains.annotations.NotNull;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: renamed from: o.aGI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5955aGI {
    private static final byte[] $$a = {88, 37, -69, 48};
    private static final int $$b = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int EZpvd = 0;
    private static int KWHzl = 1;
    private static long copydefault = 6527405210692938914L;

    /* JADX DEBUG: Duplicate block (B:10:0x0026) to fix multi-entry loop: BACK_EDGE: B:9:0x0024 -> B:10:0x0026 */
    private static java.lang.String $$c(short s, byte b, short s2) {
        int i = (s * 3) + 4;
        int i2 = 117 - (b * 2);
        int i3 = s2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + i2;
            i++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i2 += bArr[i];
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object EZpvd(int i, int i2, java.lang.Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i2);
        int i9 = ~(i6 | i2);
        int i10 = ~i6;
        int i11 = ~i2;
        int i12 = i8 | i9 | (~(i10 | i11 | i4));
        int i13 = i8 | (~(i7 | i6)) | i9;
        int i14 = (~(i2 | i4)) | (~(i10 | i2)) | (~(i7 | i11 | i6));
        int i15 = i4 + i6 + i5 + (1880080305 * i3) + (458392769 * i);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i4) - Integer.MIN_VALUE) + (1582236324 * i6) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i5) + (1711276032 * i3) + ((-973078528) * i) + (68288512 * i16);
        int i18 = ((i4 * 319678698) - 2002258816) + (i6 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i5 * 319678491) + (i3 * (-161570901)) + (i * (-1160779685)) + (i16 * (-1109000192));
        int i19 = i17 + (i18 * i18 * (-1432485888));
        return i19 != 1 ? i19 != 2 ? EZpvd(objArr) : AEQbTJ(objArr) : KWHzl(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2 % 2;
        Zo zo = new Zo();
        char[] cArrOLrzqt = Zo.OLrzqt(copydefault ^ (-5747691001614856746L), cArr, i);
        zo.KWHzl = 4;
        while (zo.KWHzl < cArrOLrzqt.length) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            zo.OLrzqt = zo.KWHzl - 4;
            int i5 = zo.KWHzl;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4]), java.lang.Long.valueOf(zo.OLrzqt), java.lang.Long.valueOf(copydefault)};
                java.lang.Object objEZpvd = YY.EZpvd(1769962791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(368, 5, (char) 0, 1834987611, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                cArrOLrzqt[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {zo, zo};
                java.lang.Object objEZpvd2 = YY.EZpvd(-1024411099);
                if (objEZpvd2 == null) {
                    objEZpvd2 = YY.EZpvd(81, 4, (char) 0, -959416487, false, com.ibm.icu.text.DateFormat.YEAR, new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                int i6 = $10 + 107;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "makeUserRpKey " + str + " " + str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        java.lang.String string = sb.toString();
        int i2 = EZpvd + 41;
        KWHzl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final KeyPair AEQbTJ(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str, @NotNull java.lang.String str2) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "getOrCreateProtectionKey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{c5951aGE, str, str2}, C34701nh.TaskDescription.valueOf(), 830828767, iValueOf2, -830828766);
        KeyPair keyPairCopydefault = copydefault(c5951aGE, str3);
        if (keyPairCopydefault == null) {
            EZpvd(c5951aGE, str, str2);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{60262, 23866, 60199, 46854, 15392, 30090, 3295, 10481, 28377, 47639, 65498, 33430, 57507, 12375, 31197, 1913, 31353, 44972, 58171}, 0, objArr);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", ((java.lang.String) objArr[0]).intern());
            keyPairGenerator.initialize(OLrzqt(c5951aGE, str3));
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "");
            return keyPairGenerateKeyPair;
        }
        int i2 = KWHzl + 19;
        int i3 = i2 % 128;
        EZpvd = i3;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 69;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return keyPairCopydefault;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [951=4] */
    public static final PrivateKey KWHzl(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str, @NotNull java.lang.String str2) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "loadProtectionPrivateKey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{c5951aGE, str, str2}, C34701nh.TaskDescription.valueOf(), 830828767, iValueOf2, -830828766);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new char[]{60262, 23866, 60199, 46854, 15392, 30090, 3295, 10481, 28377, 47639, 65498, 33430, 57507, 12375, 31197, 1913, 31353, 44972, 58171}, 0, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        java.lang.Object obj = null;
        keyStore.load(null);
        java.security.Key key = keyStore.getKey(str3, null);
        if (key == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "loadProtectionPrivateKey: key not found for alias=" + str3);
            throw new OkxPasskeyException.KeyNotFound();
        }
        int i2 = EZpvd + 69;
        int i3 = i2 % 128;
        KWHzl = i3;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        PrivateKey privateKey = (PrivateKey) key;
        int i4 = i3 + 81;
        EZpvd = i4 % 128;
        int i5 = i4 % 2;
        return privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str, @NotNull java.lang.String str2) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "deleteProtectionKeyFromKeystore " + str + " " + str2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new char[]{60262, 23866, 60199, 46854, 15392, 30090, 3295, 10481, 28377, 47639, 65498, 33430, 57507, 12375, 31197, 1913, 31353, 44972, 58171}, 0, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        java.lang.Object obj = null;
        keyStore.load(null);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{c5951aGE, str, str2}, C34701nh.TaskDescription.valueOf(), 830828767, iValueOf2, -830828766);
        if (keyStore.containsAlias(str3)) {
            int i2 = KWHzl + 21;
            EZpvd = i2 % 128;
            int i3 = i2 % 2;
            keyStore.deleteEntry(str3);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = EZpvd + 15;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] copydefault(@NotNull C5951aGE c5951aGE, @NotNull KeyPair keyPair) throws OkxPasskeyException.KeyExportFailed {
        int i = 2 % 2;
        int i2 = KWHzl + 87;
        EZpvd = i2 % 128;
        ECPublicKey eCPublicKey = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(c5951aGE, "");
            Intrinsics.checkNotNullParameter(keyPair, "");
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "exportPublicKeyAsUncompressed");
            boolean z = keyPair.getPublic() instanceof ECPublicKey;
            eCPublicKey.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(keyPair, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "exportPublicKeyAsUncompressed");
        java.security.PublicKey publicKey = keyPair.getPublic();
        if (publicKey instanceof ECPublicKey) {
            eCPublicKey = (ECPublicKey) publicKey;
        } else {
            int i3 = EZpvd + 25;
            KWHzl = i3 % 128;
            int i4 = i3 % 2;
        }
        if (eCPublicKey == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "exportPublicKeyAsUncompressed: public key is not ECPublicKey");
            throw new OkxPasskeyException.KeyExportFailed();
        }
        java.security.spec.ECPoint w = eCPublicKey.getW();
        java.math.BigInteger affineX = w.getAffineX();
        Intrinsics.checkNotNullExpressionValue(affineX, "");
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        byte[] bArr = (byte[]) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{affineX, 32}, C34701nh.TaskDescription.valueOf(), 37491277, iValueOf2, -37491275);
        java.math.BigInteger affineY = w.getAffineY();
        Intrinsics.checkNotNullExpressionValue(affineY, "");
        int iValueOf3 = C34701nh.TaskDescription.valueOf();
        int iValueOf4 = C34701nh.TaskDescription.valueOf();
        return yDT.copydefault(yDT.copydefault(new byte[]{4}, bArr), (byte[]) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf3, new java.lang.Object[]{affineY, 32}, C34701nh.TaskDescription.valueOf(), 37491277, iValueOf4, -37491275));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] AEQbTJ(@NotNull C5951aGE c5951aGE, @NotNull PrivateKey privateKey, @NotNull byte[] bArr) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidParameterSpecException, InvalidKeyException {
        int i = 2 % 2;
        int i2 = EZpvd + 115;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(privateKey, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "performEcdh");
        java.security.PublicKey publicKeyOLrzqt = OLrzqt(EZpvd(bArr), AEQbTJ());
        javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKeyOLrzqt, true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        Intrinsics.checkNotNullExpressionValue(bArrGenerateSecret, "");
        int i4 = KWHzl + 75;
        EZpvd = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrGenerateSecret;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] KWHzl(@NotNull C5951aGE c5951aGE, @NotNull byte[] bArr) throws java.security.NoSuchAlgorithmException, InvalidKeyException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "deriveAesKey len=" + bArr.length);
        byte[] bytes = "okx-passkey-ecies".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrCopydefault = copydefault(bArr, new byte[0], bytes, 32);
        int i2 = KWHzl + 27;
        EZpvd = i2 % 128;
        int i3 = i2 % 2;
        return bArrCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        C5951aGE c5951aGE = (C5951aGE) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "protectionKeyAlias " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = "com.okx.passkey.v2.protection:" + ((java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698));
        int i2 = EZpvd + 103;
        KWHzl = i2 % 128;
        if (i2 % 2 != 0) {
            return str3;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final KeyGenParameterSpec OLrzqt(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "newProtectionKeySpec " + str);
        KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(str, 64).setAlgorithmParameterSpec(new java.security.spec.ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(30).setDigests("SHA-256", "SHA-512");
        Intrinsics.checkNotNullExpressionValue(digests, "");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = KWHzl + 101;
            EZpvd = i3 % 128;
            int i4 = i3 % 2;
            digests.setUnlockedDeviceRequired(true);
        }
        if (i2 >= 30) {
            int i5 = EZpvd + 85;
            KWHzl = i5 % 128;
            int i6 = i5 % 2;
            digests.setUserAuthenticationParameters(30, 3);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = digests.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        return keyGenParameterSpecBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final KeyPair copydefault(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c5951aGE, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "loadKeyPair " + str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new char[]{60262, 23866, 60199, 46854, 15392, 30090, 3295, 10481, 28377, 47639, 65498, 33430, 57507, 12375, 31197, 1913, 31353, 44972, 58171}, 0, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        keyStore.load(null);
        java.security.Key key = keyStore.getKey(str, null);
        if (key == null) {
            return null;
        }
        java.security.cert.Certificate certificate = keyStore.getCertificate(str);
        if (certificate != null) {
            int i2 = KWHzl + 27;
            EZpvd = i2 % 128;
            if (i2 % 2 != 0) {
                certificate.getPublicKey();
                throw null;
            }
            java.security.PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                KeyPair keyPair = new KeyPair(publicKey, (PrivateKey) key);
                int i3 = EZpvd + 3;
                KWHzl = i3 % 128;
                int i4 = i3 % 2;
                return keyPair;
            }
        }
        int i5 = KWHzl + 71;
        EZpvd = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(@NotNull PrivateKey privateKey) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(privateKey, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "requiresPerUseAuth");
        boolean z = false;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{60262, 23866, 60199, 46854, 15392, 30090, 3295, 10481, 28377, 47639, 65498, 33430, 57507, 12375, 31197, 1913, 31353, 44972, 58171}, 0, objArr);
            KeyInfo keyInfo = (KeyInfo) KeyFactory.getInstance("EC", ((java.lang.String) objArr[0]).intern()).getKeySpec(privateKey, KeyInfo.class);
            if (keyInfo.isUserAuthenticationRequired()) {
                if (keyInfo.getUserAuthenticationValidityDurationSeconds() == 0) {
                    int i2 = KWHzl + 5;
                    EZpvd = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "requiresPerUseAuth error: " + e.getMessage());
        }
        int i4 = EZpvd + 13;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final java.security.spec.ECParameterSpec AEQbTJ() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidParameterSpecException {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "ecParams");
        java.security.AlgorithmParameters algorithmParameters = java.security.AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new java.security.spec.ECGenParameterSpec("secp256r1"));
        java.security.spec.AlgorithmParameterSpec parameterSpec = algorithmParameters.getParameterSpec(java.security.spec.ECParameterSpec.class);
        Intrinsics.checkNotNullExpressionValue(parameterSpec, "");
        java.security.spec.ECParameterSpec eCParameterSpec = (java.security.spec.ECParameterSpec) parameterSpec;
        int i2 = KWHzl + 47;
        EZpvd = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return eCParameterSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.security.spec.ECPoint EZpvd(@NotNull byte[] bArr) throws OkxPasskeyException.KeyDataInvalid {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "decodeUncompressedPoint len=" + bArr.length);
        if (bArr.length == 65) {
            int i2 = EZpvd + 39;
            KWHzl = i2 % 128;
            if (i2 % 2 != 0 ? bArr[0] == 4 : bArr[0] == 3) {
                java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(new java.math.BigInteger(1, yDT.AEQbTJ(bArr, 1, 33)), new java.math.BigInteger(1, yDT.AEQbTJ(bArr, 33, 65)));
                int i3 = EZpvd + 67;
                KWHzl = i3 % 128;
                if (i3 % 2 != 0) {
                    return eCPoint;
                }
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        pUU.copydefault("NativePasskeyKeyProviderImpl", "decodeUncompressedPoint: invalid data size=" + bArr.length + " or prefix");
        throw new OkxPasskeyException.KeyDataInvalid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.security.PublicKey OLrzqt(@NotNull java.security.spec.ECPoint eCPoint, @NotNull java.security.spec.ECParameterSpec eCParameterSpec) throws java.security.spec.InvalidKeySpecException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eCPoint, "");
        Intrinsics.checkNotNullParameter(eCParameterSpec, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "createPublicKey");
        java.security.PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new java.security.spec.ECPublicKeySpec(eCPoint, eCParameterSpec));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "");
        int i2 = EZpvd + 123;
        KWHzl = i2 % 128;
        if (i2 % 2 != 0) {
            return publicKeyGeneratePublic;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        java.math.BigInteger bigInteger = (java.math.BigInteger) objArr[0];
        int iIntValue = ((java.lang.Number) objArr[1]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bigInteger, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "toFixedLengthBytes " + iIntValue);
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == iIntValue) {
            int i2 = KWHzl + 39;
            EZpvd = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.copydefault(byteArray);
        } else if (byteArray.length > iIntValue) {
            Intrinsics.copydefault(byteArray);
            byteArray = yDT.AEQbTJ(byteArray, byteArray.length - iIntValue, byteArray.length);
        } else {
            byte[] bArr = new byte[iIntValue - byteArray.length];
            Intrinsics.copydefault(byteArray);
            byteArray = yDT.copydefault(bArr, byteArray);
        }
        int i4 = KWHzl + 87;
        EZpvd = i4 % 128;
        if (i4 % 2 == 0) {
            return byteArray;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] copydefault(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, int i) throws java.security.NoSuchAlgorithmException, InvalidKeyException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "hkdfSha256 len=" + i);
        if (bArr2.length == 0) {
            bArr2 = new byte[32];
        }
        byte[] bArrAEQbTJ = AEQbTJ(bArr2, bArr);
        byte[] bArrAEQbTJ2 = new byte[0];
        byte[] bArr4 = new byte[i];
        int i3 = 0;
        int i4 = 1;
        while (i3 < i) {
            int i5 = KWHzl + 77;
            EZpvd = i5 % 128;
            int i6 = i5 % 2;
            bArrAEQbTJ2 = AEQbTJ(bArrAEQbTJ, yDT.copydefault(yDT.copydefault(bArrAEQbTJ2, bArr3), new byte[]{(byte) i4}));
            int iMin = java.lang.Math.min(bArrAEQbTJ2.length, i - i3);
            java.lang.System.arraycopy(bArrAEQbTJ2, 0, bArr4, i3, iMin);
            i3 += iMin;
            i4++;
        }
        int i7 = KWHzl + 103;
        EZpvd = i7 % 128;
        int i8 = i7 % 2;
        return bArr4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] AEQbTJ(@NotNull byte[] bArr, @NotNull byte[] bArr2) throws java.security.NoSuchAlgorithmException, InvalidKeyException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "hmacSha256 key=" + bArr.length + " data=" + bArr2.length);
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
        mac.init(new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256"));
        byte[] bArrDoFinal = mac.doFinal(bArr2);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        int i2 = KWHzl + 41;
        EZpvd = i2 % 128;
        if (i2 % 2 == 0) {
            return bArrDoFinal;
        }
        throw null;
    }

    public static final byte[] AEQbTJ(@NotNull java.math.BigInteger bigInteger, int i) {
        java.lang.Object[] objArr = {bigInteger, java.lang.Integer.valueOf(i)};
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        return (byte[]) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, objArr, C34701nh.TaskDescription.valueOf(), 37491277, iValueOf2, -37491275);
    }

    public static final java.lang.String OLrzqt(@NotNull C5951aGE c5951aGE, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        int iValueOf3 = C34701nh.TaskDescription.valueOf();
        return (java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{c5951aGE, str, str2}, iValueOf3, 830828767, iValueOf2, -830828766);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        int iValueOf3 = C34701nh.TaskDescription.valueOf();
        return (java.lang.String) EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, iValueOf3, -1540279698, iValueOf2, 1540279698);
    }
}

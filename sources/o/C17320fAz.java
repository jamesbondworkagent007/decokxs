package o;

import com.google.common.base.Ascii;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import javax.crypto.spec.PSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17320fAz {
    private static char AYXKKw;
    public static final Application Companion;
    private static int KWHzl;
    public static final int OLrzqt;
    private static long copydefault;
    private static int gEmmrt;
    public final java.lang.String AEQbTJ;
    public KeyStore EZpvd;
    private static final byte[] $$a = {124, 59, 115, Ascii.VT};
    private static final int $$b = 39;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int valueOf = 0;
    private static int AhwBna = 1;
    private static int djBIcL = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = (s * 2) + 1;
        byte[] bArr = $$a;
        int i4 = 106 - (b * 4);
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 = (-i4) + i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            int i7 = i5 + 1;
            byte b3 = bArr[i7];
            i5 = i4;
            i4 = b3;
            i6 = i7;
            i4 = (-i4) + i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        gEmmrt = 1;
        valueOf();
        Companion = new Application(null);
        OLrzqt = 8;
        int i = djBIcL + 7;
        gEmmrt = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object EZpvd(int i, int i2, int i3, int i4, int i5, java.lang.Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~((~i5) | i7 | i4)) | (~(i8 | i3));
        int i12 = i3 + i4 + i2 + (531708263 * i) + ((-608630064) * i6);
        int i13 = i12 * i12;
        int i14 = (i3 * (-228234701)) + 730857472 + ((-228234701) * i4) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i2) + ((-45088768) * i) + ((-419430400) * i6) + ((-1471938560) * i13);
        int i15 = ((i3 * (-1679524527)) - 150938974) + (i4 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i2 * (-1679524245)) + (i * (-166744051)) + (i6 * 2062148848) + (i13 * (-865337344));
        return i14 + ((i15 * i15) * (-1617166336)) != 1 ? EZpvd(objArr) : OLrzqt(objArr);
    }

    public C17320fAz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strCopydefault;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                strCopydefault = copydefault(str, EZpvd(str2));
            } catch (java.lang.Exception e) {
                pUU.copydefault("KeyPairCipher", "encrypt error, error=" + e);
                return null;
            }
        }
        return strCopydefault;
    }

    public final java.security.PublicKey EZpvd(java.lang.String str) throws java.security.spec.InvalidKeySpecException {
        int i = 2 % 2;
        java.security.PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(new Regex("\\s").replace(C59449zhJ.replace$default(C59449zhJ.replace$default(str, "-----BEGIN PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), "-----END PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), ""), 0)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "");
        int i2 = AhwBna + 69;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return publicKeyGeneratePublic;
    }

    public static /* synthetic */ java.lang.String encrypt$default(C17320fAz c17320fAz, java.lang.String str, java.security.PublicKey publicKey, int i, java.lang.Object obj) {
        int i2 = 2 % 2;
        int i3 = valueOf + 7;
        int i4 = i3 % 128;
        AhwBna = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 75;
            valueOf = i6 % 128;
            int i7 = i6 % 2;
            publicKey = null;
        }
        java.lang.String strCopydefault = c17320fAz.copydefault(str, publicKey);
        int i8 = valueOf + 23;
        AhwBna = i8 % 128;
        int i9 = i8 % 2;
        return strCopydefault;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.security.PublicKey publicKey) {
        java.lang.String strEncodeToString;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                KWHzl();
                if (publicKey == null) {
                    KeyPair keyPairCopydefault = copydefault();
                    publicKey = keyPairCopydefault != null ? keyPairCopydefault.getPublic() : null;
                    if (publicKey == null) {
                        throw new java.lang.IllegalStateException("public key is null");
                    }
                }
                javax.crypto.SecretKey secretKeyAEQbTJ = AEQbTJ();
                javax.crypto.Cipher cipherDjBIcL = djBIcL();
                javax.crypto.spec.GCMParameterSpec gCMParameterSpecEZpvd = EZpvd();
                cipherDjBIcL.init(1, secretKeyAEQbTJ, gCMParameterSpecEZpvd);
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byte[] bArrDoFinal = cipherDjBIcL.doFinal(bytes);
                javax.crypto.Cipher cipher = (javax.crypto.Cipher) EZpvd(C32408mcY.AEQbTJ(), C32408mcY.AEQbTJ(), -975915623, 975915624, C32408mcY.AEQbTJ(), new java.lang.Object[]{this}, C32408mcY.AEQbTJ());
                cipher.init(1, publicKey, (javax.crypto.spec.OAEPParameterSpec) EZpvd(C32408mcY.AEQbTJ(), C32408mcY.AEQbTJ(), 885563443, -885563443, C32408mcY.AEQbTJ(), new java.lang.Object[]{this}, C32408mcY.AEQbTJ()));
                byte[] bArrDoFinal2 = cipher.doFinal(secretKeyAEQbTJ.getEncoded());
                Intrinsics.copydefault(bArrDoFinal2);
                byte[] iv = gCMParameterSpecEZpvd.getIV();
                Intrinsics.checkNotNullExpressionValue(iv, "");
                byte[] bArrCopydefault = yDT.copydefault(bArrDoFinal2, iv);
                Intrinsics.copydefault(bArrDoFinal);
                strEncodeToString = android.util.Base64.encodeToString(yDT.copydefault(bArrCopydefault, bArrDoFinal), 10);
                pUU.KWHzl("KeyPairCipher", "encrypt success");
            } catch (java.lang.Exception e) {
                pUU.copydefault("KeyPairCipher", "encrypt error, error=" + e);
                return null;
            }
        }
        return strEncodeToString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [127=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, char[] cArr2, int i, char c, char[] cArr3, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        Zq zq = new Zq();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length);
        java.lang.System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        zq.EZpvd = 0;
        while (zq.EZpvd < length3) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                java.lang.Object[] objArr2 = {zq};
                java.lang.Object objEZpvd = YY.EZpvd(1159686945);
                if (objEZpvd == null) {
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    objEZpvd = YY.EZpvd(262, 7, (char) 0, 1094690397, false, $$c(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Object.class});
                }
                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {zq};
                java.lang.Object objEZpvd2 = YY.EZpvd(-743671275);
                if (objEZpvd2 == null) {
                    objEZpvd2 = YY.EZpvd(45, 4, (char) 0, -678643863, false, "h", new java.lang.Class[]{java.lang.Object.class});
                }
                int iIntValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {zq, java.lang.Integer.valueOf(cArr4[zq.EZpvd % 4] * 32718), java.lang.Integer.valueOf(cArr5[iIntValue])};
                java.lang.Object objEZpvd3 = YY.EZpvd(1795123962);
                if (objEZpvd3 == null) {
                    objEZpvd3 = YY.EZpvd(65, 4, (char) 1318, 1860151174, false, "i", new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr4[iIntValue2] * 32718), java.lang.Integer.valueOf(cArr5[iIntValue])};
                java.lang.Object objEZpvd4 = YY.EZpvd(915863926);
                if (objEZpvd4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd4 = YY.EZpvd(600, 5, (char) 29201, 850801674, false, $$c(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr5[iIntValue2] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = zq.OLrzqt;
                cArr6[zq.EZpvd] = (char) (((((long) (cArr3[zq.EZpvd] ^ cArr4[iIntValue2])) ^ (copydefault ^ 9101507492151247063L)) ^ ((long) ((int) (((long) KWHzl) ^ 9101507492151247063L)))) ^ ((long) ((char) (((long) AYXKKw) ^ 9101507492151247063L))));
                zq.EZpvd++;
                int i6 = $11 + 9;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        int i = 2 % 2;
        javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec = new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        int i2 = valueOf + 47;
        AhwBna = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return oAEPParameterSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final javax.crypto.spec.GCMParameterSpec EZpvd() {
        int i = 2 % 2;
        byte[] bArr = new byte[12];
        new java.security.SecureRandom().nextBytes(bArr);
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec = new javax.crypto.spec.GCMParameterSpec(128, bArr);
        int i2 = AhwBna + 23;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return gCMParameterSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyPair copydefault() throws java.security.NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        int i = 2 % 2;
        KeyStore keyStore = this.EZpvd;
        if (keyStore == null) {
            int i2 = AhwBna + 65;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        java.security.Key key = keyStore.getKey(this.AEQbTJ, null);
        Intrinsics.copydefault(key, "");
        KeyPair keyPair = new KeyPair(keyStore.getCertificate(this.AEQbTJ).getPublicKey(), (PrivateKey) key);
        int i4 = AhwBna + 7;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return keyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 117;
        AhwBna = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
            if (this.EZpvd != null) {
                return;
            }
        } else if (this.EZpvd != null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new char[]{14728, 42598, 52206, 33446}, new char[]{32693, 58199, 47634, 57785}, 316888959, (char) 47546, new char[]{28329, 49879, 20910, 46500, 29532, 15145, 24780, 30997, 34186, 53372, 20014, 1939, 20106, 38370, 56315}, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        keyStore.load(null);
        this.EZpvd = keyStore;
        int i4 = valueOf + 101;
        AhwBna = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = AhwBna + 59;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/OAEPPadding");
        Intrinsics.checkNotNullExpressionValue(cipher, "");
        int i4 = AhwBna + 115;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return cipher;
        }
        throw null;
    }

    public final javax.crypto.Cipher djBIcL() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = valueOf + 19;
        AhwBna = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(javax.crypto.Cipher.getInstance("AES/GCM/NoPadding"), "");
            obj.hashCode();
            throw null;
        }
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        Intrinsics.checkNotNullExpressionValue(cipher, "");
        int i3 = AhwBna + 51;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return cipher;
        }
        obj.hashCode();
        throw null;
    }

    public final javax.crypto.SecretKey AEQbTJ() throws java.security.NoSuchAlgorithmException {
        javax.crypto.KeyGenerator keyGenerator;
        int i;
        int i2 = 2 % 2;
        int i3 = valueOf + 27;
        AhwBna = i3 % 128;
        if (i3 % 2 == 0) {
            keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES);
            i = 10945;
        } else {
            keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES);
            i = 256;
        }
        keyGenerator.init(i);
        javax.crypto.SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        int i4 = AhwBna + 49;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return secretKeyGenerateKey;
    }

    /* JADX INFO: renamed from: o.fAz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fAz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    static void valueOf() {
        copydefault = -222427658005415585L;
        KWHzl = -1640283945;
        AYXKKw = (char) 16599;
    }

    public final javax.crypto.spec.OAEPParameterSpec gEmmrt() {
        int iAEQbTJ = C32408mcY.AEQbTJ();
        int iAEQbTJ2 = C32408mcY.AEQbTJ();
        return (javax.crypto.spec.OAEPParameterSpec) EZpvd(C32408mcY.AEQbTJ(), iAEQbTJ2, 885563443, -885563443, iAEQbTJ, new java.lang.Object[]{this}, C32408mcY.AEQbTJ());
    }

    public final javax.crypto.Cipher OLrzqt() {
        int iAEQbTJ = C32408mcY.AEQbTJ();
        int iAEQbTJ2 = C32408mcY.AEQbTJ();
        return (javax.crypto.Cipher) EZpvd(C32408mcY.AEQbTJ(), iAEQbTJ2, -975915623, 975915624, iAEQbTJ, new java.lang.Object[]{this}, C32408mcY.AEQbTJ());
    }
}

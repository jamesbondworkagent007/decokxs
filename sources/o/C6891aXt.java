package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.security.KeyStore;
import java.security.PrivateKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6891aXt {
    private static int AhwBna;
    public static final InterfaceC56387yDm EZpvd;
    public static final C6891aXt KWHzl;
    public static final int OLrzqt;
    private static int copydefault;
    private static final byte[] $$a = {73, -5, -69, 92};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int djBIcL = 0;
    private static int AEQbTJ = 0;
    private static int valueOf = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, int i, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (b * 3);
        int i4 = i * 3;
        int i5 = 116 - s;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            i5 = i4;
            i2 = 0;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i3];
            i2++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeyStore EZpvd() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = AEQbTJ + 43;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            OLrzqt();
            throw null;
        }
        KeyStore keyStoreOLrzqt = OLrzqt();
        int i3 = AEQbTJ + 81;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return keyStoreOLrzqt;
    }

    private C6891aXt() {
    }

    static {
        AhwBna = 1;
        KWHzl();
        KWHzl = new C6891aXt();
        EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6891aXt.EZpvd();
            }
        });
        OLrzqt = 8;
        int i = djBIcL + 55;
        AhwBna = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyStore AEQbTJ() {
        int i = 2 % 2;
        int i2 = AEQbTJ + 115;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        KeyStore keyStore = (KeyStore) EZpvd.getValue();
        int i4 = valueOf + 93;
        AEQbTJ = i4 % 128;
        if (i4 % 2 == 0) {
            return keyStore;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final KeyStore OLrzqt() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 81;
        AEQbTJ = i2 % 128;
        int i3 = i2 % 2;
        KeyStore keyStoreCopydefault = KWHzl.copydefault();
        int i4 = AEQbTJ + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return keyStoreCopydefault;
    }

    public final KeyStore copydefault() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 103;
        AEQbTJ = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, 12, 15, new char[]{15, 65518, 20, 0, 65510, 65535, 4, '\n', '\r', 65535, '\t', 65500, 0, '\r', '\n'}, objArr);
            KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
            keyStore.load(null);
            int i4 = AEQbTJ + 73;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            return keyStore;
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKSignWithR1Util", "init key store error, error=" + e.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        java.security.cert.Certificate certificate;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryAEQbTJ = AEQbTJ(str);
            byte[] encoded = null;
            if (privateKeyEntryAEQbTJ != null) {
                int i2 = valueOf + 13;
                AEQbTJ = i2 % 128;
                if (i2 % 2 != 0) {
                    privateKeyEntryAEQbTJ.getCertificate();
                    throw null;
                }
                certificate = privateKeyEntryAEQbTJ.getCertificate();
            } else {
                certificate = null;
            }
            if (certificate != null) {
                int i3 = AEQbTJ + 81;
                valueOf = i3 % 128;
                if (i3 % 2 == 0) {
                    certificate.getPublicKey();
                    encoded.hashCode();
                    throw null;
                }
                java.security.PublicKey publicKey = certificate.getPublicKey();
                if (publicKey != null) {
                    encoded = publicKey.getEncoded();
                    int i4 = AEQbTJ + 97;
                    valueOf = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            java.lang.String strEncodeToString = android.util.Base64.encodeToString(encoded, 2);
            if (strEncodeToString == null) {
                return "";
            }
            int i6 = AEQbTJ + 121;
            valueOf = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 3;
            }
            return strEncodeToString;
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKSignWithR1Util", "get public key error, error=" + e.getMessage());
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrivateKey OLrzqt(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryAEQbTJ = AEQbTJ(str);
            if (privateKeyEntryAEQbTJ != null) {
                int i2 = valueOf + 89;
                AEQbTJ = i2 % 128;
                int i3 = i2 % 2;
                PrivateKey privateKey = privateKeyEntryAEQbTJ.getPrivateKey();
                int i4 = AEQbTJ + 123;
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                return privateKey;
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKSignWithR1Util", "get private key error, error=" + e.getMessage());
        }
        return null;
    }

    public final KeyStore.PrivateKeyEntry AEQbTJ(@NotNull java.lang.String str) {
        KeyStore.PrivateKeyEntry privateKeyEntry;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            privateKeyEntry = null;
            try {
                KeyStore keyStoreAEQbTJ = AEQbTJ();
                KeyStore.Entry entry = keyStoreAEQbTJ != null ? keyStoreAEQbTJ.getEntry(str, null) : null;
                if (entry instanceof KeyStore.PrivateKeyEntry) {
                    privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKSignWithR1Util", "getKeyPair error, error=" + e.getMessage());
            }
        }
        return privateKeyEntry;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i4 = 2 % 2;
        Zl zl = new Zl();
        char[] cArr2 = new char[i3];
        zl.OLrzqt = 0;
        while (zl.OLrzqt < i3) {
            zl.KWHzl = cArr[zl.OLrzqt];
            cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
            int i5 = zl.OLrzqt;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5]), java.lang.Integer.valueOf(copydefault)};
                java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                if (objEZpvd == null) {
                    byte b = (byte) ($$b - 2);
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {zl, zl};
                java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) ($$b - 1);
                    byte b4 = (byte) (b3 - 1);
                    objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            zl.AEQbTJ = i2;
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
            java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            zl.OLrzqt = 0;
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (zl.OLrzqt < i3) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[zl.OLrzqt] = cArr2[(i3 / zl.OLrzqt) - 1];
                    java.lang.Object[] objArr4 = {zl, zl};
                    java.lang.Object objEZpvd3 = YY.EZpvd(654343494);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$b - 1);
                        byte b6 = (byte) (b5 - 1);
                        objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                } else {
                    cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                    try {
                        java.lang.Object[] objArr5 = {zl, zl};
                        java.lang.Object objEZpvd4 = YY.EZpvd(654343494);
                        if (objEZpvd4 == null) {
                            byte b7 = (byte) ($$b - 1);
                            byte b8 = (byte) (b7 - 1);
                            objEZpvd4 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$c(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i9 = $11 + 3;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static void KWHzl() {
        copydefault = 1694165009;
    }
}

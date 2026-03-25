package o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47235tmH {
    private static int AEQbTJ;
    private static int AYXKKw;
    public static KeyStore EZpvd;
    private static int KWHzl;
    public static final C47235tmH OLrzqt;
    public static final int copydefault;
    private static short[] djBIcL;
    private static int gEmmrt;
    private static byte[] valueOf;
    private static final byte[] $$a = {49, -121, 80, -95};
    private static final int $$b = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int isConnected = 0;
    private static int DbNXlk = 1;
    private static int AhwBna = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, byte b, short s) {
        int i2;
        int i3 = (b * 2) + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i4 = i * 3;
        int i5 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i3 += -i7;
            i2 = i8;
            i5++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i7 = bArr[i5];
            i3 += -i7;
            i2 = i8;
            i5++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        AYXKKw = 1;
        OLrzqt();
        OLrzqt = new C47235tmH();
        copydefault = 8;
        int i = AhwBna + 59;
        AYXKKw = i % 128;
        int i2 = i % 2;
    }

    private C47235tmH() {
    }

    public final KeyStore copydefault() throws java.security.NoSuchAlgorithmException, java.io.IOException, KeyStoreException, CertificateException {
        KeyStore keyStore;
        synchronized (this) {
            if (EZpvd == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(-1723037389, -102, (byte) 58, (short) 39, -1355681810, objArr);
                KeyStore keyStore2 = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
                keyStore2.load(null);
                EZpvd = keyStore2;
            }
            keyStore = EZpvd;
        }
        return keyStore;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull KeyGenParameterSpec keyGenParameterSpec) throws java.security.NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(keyGenParameterSpec, "");
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(-1723037389, -102, (byte) 58, (short) 39, -1355681810, objArr);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, ((java.lang.String) objArr[0]).intern());
            keyPairGenerator.initialize(keyGenParameterSpec);
            keyPairGenerator.generateKeyPair();
        }
    }

    public static /* synthetic */ KeyStore.PrivateKeyEntry getKeyPair$default(C47235tmH c47235tmH, java.lang.String str, KeyStore.ProtectionParameter protectionParameter, int i, java.lang.Object obj) throws java.security.NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        int i2 = 2 % 2;
        int i3 = isConnected + 53;
        int i4 = i3 % 128;
        DbNXlk = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 51;
            int i7 = i6 % 128;
            isConnected = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 37;
            DbNXlk = i9 % 128;
            int i10 = i9 % 2;
            protectionParameter = null;
        }
        return c47235tmH.OLrzqt(str, protectionParameter);
    }

    public final KeyStore.PrivateKeyEntry OLrzqt(@NotNull java.lang.String str, KeyStore.ProtectionParameter protectionParameter) throws java.security.NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        KeyStore.PrivateKeyEntry privateKeyEntry;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            KeyStore keyStore = EZpvd;
            KeyStore.Entry entry = keyStore != null ? keyStore.getEntry(str, protectionParameter) : null;
            privateKeyEntry = entry instanceof KeyStore.PrivateKeyEntry ? (KeyStore.PrivateKeyEntry) entry : null;
        }
        return privateKeyEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=6, 223=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, int i2, byte b, short s, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
        char c;
        int i4 = 2 % 2;
        Zj zj = new Zj();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AEQbTJ)};
            java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
            if (objEZpvd == null) {
                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = valueOf;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $10 + 121;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                            java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                            if (objEZpvd2 == null) {
                                objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                            i5 %= 0;
                        } else {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i5])};
                            java.lang.Object objEZpvd3 = YY.EZpvd(1815080187);
                            if (objEZpvd3 == null) {
                                objEZpvd3 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).byteValue();
                            i5++;
                        }
                    }
                    int i7 = $11 + 79;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = valueOf;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(KWHzl)};
                    java.lang.Object objEZpvd4 = YY.EZpvd(-1048485176);
                    if (objEZpvd4 == null) {
                        objEZpvd4 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                } else {
                    iIntValue = (short) (((short) (((long) djBIcL[i3 + ((int) (((long) KWHzl) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                }
            }
            if (iIntValue > 0) {
                int i9 = $11 + 101;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                zj.OLrzqt = ((i3 + iIntValue) - 2) + ((int) (((long) KWHzl) ^ (-2166281683126510581L))) + (!(z ^ true) ? 1 : 0);
                java.lang.Object[] objArr6 = {zj, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(gEmmrt), sb};
                java.lang.Object objEZpvd5 = YY.EZpvd(-2015189563);
                if (objEZpvd5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objEZpvd5 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$c(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).append(zj.EZpvd);
                zj.AEQbTJ = zj.EZpvd;
                byte[] bArr4 = valueOf;
                if (bArr4 != null) {
                    int i11 = $11 + 117;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $10 + 3;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) | (-2166281683126510581L));
                        } else {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-2166281683126510581L));
                            i13++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                zj.KWHzl = 1;
                while (zj.KWHzl < iIntValue) {
                    if (z2) {
                        int i15 = $10 + 17;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            byte[] bArr6 = valueOf;
                            zj.OLrzqt = zj.OLrzqt + 1;
                            c = (char) (zj.AEQbTJ >>> (((byte) (((byte) (((long) bArr6[r7]) & (-2166281683126510581L))) << s)) ^ b));
                        } else {
                            byte[] bArr7 = valueOf;
                            zj.OLrzqt = zj.OLrzqt - 1;
                            c = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r7]) ^ (-2166281683126510581L))) + s)) ^ b));
                        }
                        zj.EZpvd = c;
                        int i16 = $10 + 3;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        short[] sArr = djBIcL;
                        zj.OLrzqt = zj.OLrzqt - 1;
                        zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r7]) ^ (-2166281683126510581L))) + s)) ^ b));
                    }
                    sb.append(zj.EZpvd);
                    zj.AEQbTJ = zj.EZpvd;
                    zj.KWHzl++;
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void OLrzqt() {
        KWHzl = 822152217;
        AEQbTJ = 1640963198;
        gEmmrt = 125594373;
        valueOf = new byte[]{-87, Ascii.EM, -111, -1, -78, Ascii.FF, -14, -67, -111, -110, -85, 6, -82, -5, Ascii.VT};
    }
}

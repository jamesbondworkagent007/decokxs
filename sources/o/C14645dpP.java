package o;

import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.gms.stats.CodePackage;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14645dpP {
    public static final KeyStore AEQbTJ;
    private static boolean AYXKKw;
    private static boolean AhwBna;
    private static char[] EZpvd;
    public static final int KWHzl;
    public static final C14645dpP OLrzqt;
    private static int copydefault;
    private static int gEmmrt;
    private static int valueOf;
    private static final byte[] $$a = {60, -23, -65, -5};
    private static final int $$b = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int djBIcL = 0;
    private static int AkhnZx = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = 101 - (b * 2);
        byte[] bArr = $$a;
        int i5 = (s * 3) + 1;
        int i6 = 3 - (i * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i6 + i7;
            i2 = i3;
            i6 = i8;
            i4 = i9;
            i3 = i2 + 1;
            int i10 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i7 = bArr[i10];
            i6 = i4;
            i8 = i10;
            int i92 = i6 + i7;
            i2 = i3;
            i6 = i8;
            i4 = i92;
            i3 = i2 + 1;
            int i102 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i1022 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private C14645dpP() {
    }

    static {
        valueOf = 0;
        gEmmrt = 1;
        OLrzqt();
        C14645dpP c14645dpP = new C14645dpP();
        OLrzqt = c14645dpP;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127, null, null, new byte[]{-120, -124, -123, -117, -118, -119, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        keyStore.load(null);
        AEQbTJ = keyStore;
        try {
            if (!keyStore.containsAlias("web3_referral_info_key")) {
                int i = gEmmrt + 25;
                valueOf = i % 128;
                if (i % 2 == 0) {
                    c14645dpP.KWHzl();
                    int i2 = 2 % 2;
                } else {
                    c14645dpP.KWHzl();
                    throw null;
                }
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to initialize encryption key", e);
        }
        KWHzl = 8;
        int i3 = valueOf + 89;
        gEmmrt = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void KWHzl() throws java.lang.Throwable {
        int i = 2 % 2;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(127, null, null, new byte[]{-120, -124, -123, -117, -118, -119, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr);
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((java.lang.String) objArr[0]).intern());
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("web3_referral_info_key", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).setKeySize(256).build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
            int i2 = AkhnZx + 49;
            djBIcL = i2 % 128;
            int i3 = i2 % 2;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to create encryption key", e);
            throw new java.lang.SecurityException("Failed to create encryption key", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = djBIcL + 39;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        java.security.Key key = AEQbTJ.getKey("web3_referral_info_key", null);
        Intrinsics.copydefault(key, "");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (javax.crypto.SecretKey) key);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] iv = cipher.getIV();
        Intrinsics.copydefault(iv);
        Intrinsics.copydefault(bArrDoFinal);
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(yDT.copydefault(iv, bArrDoFinal), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        int i4 = djBIcL + 73;
        AkhnZx = i4 % 128;
        if (i4 % 2 != 0) {
            return strEncodeToString;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(@NotNull java.lang.String str) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, UnrecoverableKeyException, InvalidKeyException, KeyStoreException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        java.security.Key key = AEQbTJ.getKey("web3_referral_info_key", null);
        Intrinsics.copydefault(key, "");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        Intrinsics.copydefault(bArrDecode);
        byte[] bArrEZpvd = yDV.EZpvd(bArrDecode, C56548yJl.AhwBna(0, 12));
        byte[] bArrEZpvd2 = yDV.EZpvd(bArrDecode, C56548yJl.AhwBna(12, bArrDecode.length));
        cipher.init(2, (javax.crypto.SecretKey) key, new javax.crypto.spec.GCMParameterSpec(128, bArrEZpvd));
        byte[] bArrDoFinal = cipher.doFinal(bArrEZpvd2);
        Intrinsics.copydefault(bArrDoFinal);
        java.lang.String str2 = new java.lang.String(bArrDoFinal, Charsets.UTF_8);
        int i2 = djBIcL + 9;
        AkhnZx = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [131=4, 139=5, 172=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, char[] cArr, int[] iArr, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        Ze ze = new Ze();
        char[] cArr3 = EZpvd;
        if (cArr3 != null) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 37;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object objEZpvd = YY.EZpvd(-855574269);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                    i5++;
                    int i8 = $11 + 89;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(copydefault)};
        java.lang.Object objEZpvd2 = YY.EZpvd(-1914793274);
        if (objEZpvd2 == null) {
            byte b = (byte) 0;
            byte b2 = (byte) (b + 1);
            objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$c(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
        int i10 = -1317980492;
        if (AYXKKw) {
            int i11 = $11 + 5;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                ze.copydefault = bArr.length;
                cArr2 = new char[ze.copydefault];
                ze.AEQbTJ = 1;
            } else {
                ze.copydefault = bArr.length;
                cArr2 = new char[ze.copydefault];
                ze.AEQbTJ = 0;
            }
            while (ze.AEQbTJ < ze.copydefault) {
                cArr2[ze.AEQbTJ] = (char) (cArr3[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                java.lang.Object[] objArr4 = {ze, ze};
                java.lang.Object objEZpvd3 = YY.EZpvd(i10);
                if (objEZpvd3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                i10 = -1317980492;
            }
            objArr[0] = new java.lang.String(cArr2);
            return;
        }
        if (!AhwBna) {
            ze.copydefault = iArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr3[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                ze.AEQbTJ++;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        int i12 = $10 + 59;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        ze.copydefault = cArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr3[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
            java.lang.Object[] objArr5 = {ze, ze};
            java.lang.Object objEZpvd4 = YY.EZpvd(-1317980492);
            if (objEZpvd4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    static void OLrzqt() {
        EZpvd = new char[]{62821, 62792, 62786, 62900, 62903, 62797, 62827, 62785, 62909, 62803, 62898};
        copydefault = 585626918;
        AhwBna = true;
        AYXKKw = true;
    }
}

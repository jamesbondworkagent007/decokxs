package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.YY;
import o.Zm;
import okio.Utf8;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes21.dex */
public class Utils {
    private static final byte[] $$a = {Utf8.REPLACEMENT_BYTE, 19, -108, 103};
    private static final int $$b = AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;
    private static int KWHzl = 1;
    private static int[] EZpvd = {-468333024, -202373777, -657039465, 1003353047, -1638223712, -173792056, 1651179456, -1783523946, -4747955, 1738610006, 2104470098, 1344896405, -736508943, -329264429, -623116622, 1745271088, 812102951, 1842258484};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b + 4;
        int i5 = 1 - (i * 4);
        int i6 = 110 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            i6 = (-i6) + i8;
            i4 = i7;
            i2 = i3;
            int i9 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = bArr[i9];
            i8 = i6;
            i6 = i10;
            i7 = i9;
            i6 = (-i6) + i8;
            i4 = i7;
            i2 = i3;
            int i92 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Context context) throws Throwable {
        int i = 2 % 2;
        String strA = new w0(context.getPackageManager()).a();
        int i2 = copydefault + 83;
        KWHzl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return strA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r7
  0x0033: PHI (r7v8 android.content.pm.Signature[]) = (r7v7 android.content.pm.Signature[]), (r7v15 android.content.pm.Signature[]) binds: [B:10:0x0031, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getSignature(Context context) {
        Signature[] signatureArr;
        int i = 2 % 2;
        int i2 = copydefault + 107;
        KWHzl = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 43).signatures;
                if (signatureArr != null) {
                    int i3 = copydefault + 77;
                    KWHzl = i3 % 128;
                    int i4 = i3 % 2;
                    if (signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
                        }
                        String string = sb.toString();
                        int i5 = copydefault + 55;
                        KWHzl = i5 % 128;
                        int i6 = i5 % 2;
                        return string;
                    }
                }
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                }
            }
        } catch (Throwable unused) {
        }
        int i7 = copydefault + 65;
        KWHzl = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[Catch: all -> 0x00ad, PHI: r1
  0x0058: PHI (r1v9 java.security.KeyStore) = (r1v8 java.security.KeyStore), (r1v19 java.security.KeyStore) binds: [B:8:0x0056, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00ad, blocks: (B:4:0x0017, B:11:0x0064, B:9:0x0058, B:7:0x0039), top: B:15:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCert() {
        KeyStore keyStore;
        int i = 2 % 2;
        int i2 = copydefault + 51;
        KWHzl = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new int[]{1535457256, 1641705812, 1071015299, -621845705, 1677818586, 216590053, -100389002, -41522266}, WalletImportError.ERROR_CODE_AA_CREATE_KEY, objArr);
                keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
                keyStore.load(null);
                if (keyStore.containsAlias("no506b3822wb")) {
                    keyStore.deleteEntry("no506b3822wb");
                    int i3 = copydefault + 5;
                    KWHzl = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{1535457256, 1641705812, 1071015299, -621845705, 1677818586, 216590053, -100389002, -41522266}, 15, objArr2);
                keyStore = KeyStore.getInstance(((String) objArr2[0]).intern());
                keyStore.load(null);
                if (keyStore.containsAlias("no506b3822wb")) {
                }
            }
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("no506b3822wb", 12);
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            builder.setAttestationChallenge(bArr);
            Object[] objArr3 = new Object[1];
            a(new int[]{1535457256, 1641705812, 1071015299, -621845705, 1677818586, 216590053, -100389002, -41522266}, 15, objArr3);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", ((String) objArr3[0]).intern());
            keyPairGenerator.initialize(builder.build());
            keyPairGenerator.generateKeyPair();
            return Base64.encodeToString(((X509Certificate) keyStore.getCertificateChain("no506b3822wb")[0]).getExtensionValue("1.3.6.1.4.1.11129.2.1.17"), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(Context context) {
        String str;
        int i = 2 % 2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            str = "";
        } else {
            try {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                b7 b7Var = new b7(atomicReference, countDownLatch);
                Intent intent = new Intent();
                intent.setAction("com.tencent.soter.soterserver.ISoterService");
                intent.setPackage("com.tencent.soter.soterserver");
                c7.a(context, intent, b7Var);
                if (countDownLatch.await(1L, TimeUnit.SECONDS)) {
                    str = (String) atomicReference.get();
                }
            } catch (Throwable unused) {
            }
        }
        if (str != null) {
            int i2 = copydefault + 53;
            KWHzl = i2 % 128;
            int i3 = i2 % 2;
            if (!str.isEmpty()) {
                int iIndexOf = str.indexOf(10);
                if (iIndexOf != -1) {
                    return str.substring(0, iIndexOf);
                }
                int i4 = KWHzl + 43;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = EZpvd;
        int i5 = 698602880;
        Object obj = null;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $10 + 27;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objEZpvd = YY.EZpvd(i5);
                        if (objEZpvd == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objEZpvd).invoke(obj, objArr2)).intValue();
                        i6++;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                    Object objEZpvd2 = YY.EZpvd(i5);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objEZpvd2).invoke(null, objArr3)).intValue();
                    i6++;
                    i3 = 2;
                    i5 = 698602880;
                    obj = null;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = EZpvd;
        if (iArr6 != null) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                Object objEZpvd3 = YY.EZpvd(698602880);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objEZpvd3 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
                i2++;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        zm.OLrzqt = 0;
        while (zm.OLrzqt < iArr.length) {
            cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
            cArr[1] = (char) iArr[zm.OLrzqt];
            cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
            cArr[3] = (char) iArr[zm.OLrzqt + 1];
            zm.copydefault = (cArr[0] << 16) + cArr[1];
            zm.KWHzl = (cArr[2] << 16) + cArr[3];
            Zm.EZpvd(iArr5);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                zm.copydefault ^= iArr5[i9];
                Object[] objArr5 = {zm, Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                Object objEZpvd4 = YY.EZpvd(984677556);
                if (objEZpvd4 == null) {
                    byte b7 = (byte) 3;
                    byte b8 = (byte) (b7 - 4);
                    objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue();
                zm.copydefault = zm.KWHzl;
                zm.KWHzl = iIntValue;
                i9++;
            }
            int i11 = zm.copydefault;
            zm.copydefault = zm.KWHzl;
            zm.KWHzl = i11;
            zm.KWHzl ^= iArr5[16];
            zm.copydefault ^= iArr5[17];
            int i12 = zm.copydefault;
            int i13 = zm.KWHzl;
            cArr[0] = (char) (zm.copydefault >>> 16);
            cArr[1] = (char) zm.copydefault;
            cArr[2] = (char) (zm.KWHzl >>> 16);
            cArr[3] = (char) zm.KWHzl;
            Zm.EZpvd(iArr5);
            cArr2[zm.OLrzqt * 2] = cArr[0];
            cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
            cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
            cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
            try {
                Object[] objArr6 = {zm, zm};
                Object objEZpvd5 = YY.EZpvd(-1770687495);
                if (objEZpvd5 == null) {
                    byte b9 = (byte) 1;
                    byte b10 = (byte) (-b9);
                    objEZpvd5 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd5).invoke(null, objArr6);
                int i14 = $11 + 39;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}

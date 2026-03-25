package com.geetest.gtc4;

import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import o.YY;
import o.Zm;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f526a;
    private static final byte[] $$a = {57, -85, -86, -123};
    private static final int $$b = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int OLrzqt = 0;
    private static int KWHzl = 1;
    private static int[] EZpvd = {325038370, -1077476308, -298974979, 9550878, -2145320937, -479840584, -842861401, 1351460740, 1963244753, -1705136519, 485489459, 266740395, -168197440, 668858976, 1913530928, -1043569616, -742742873, -806589411};

    /* JADX DEBUG: Duplicate block (B:10:0x002e) to fix multi-entry loop: BACK_EDGE: B:9:0x0027 -> B:10:0x002e */
    private static String $$c(byte b, short s, short s2) {
        int i = 4 - (s2 * 4);
        int i2 = s * 3;
        byte[] bArr = $$a;
        int i3 = b + 107;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i++;
            i3 += i;
            i5 = -1;
        }
        while (true) {
            int i6 = i;
            int i7 = i3;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                return new String(bArr2, 0);
            }
            i = i6 + 1;
            i3 = bArr[i6] + i7;
            i5 = i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w0(PackageManager packageManager) {
        if (Build.VERSION.SDK_INT < 28 || !packageManager.hasSystemFeature("android.hardware.strongbox_keystore")) {
            int i = KWHzl + 95;
            OLrzqt = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = OLrzqt + 23;
            KWHzl = i3 % 128;
            z = !(i3 % 2 == 0);
        }
        int i4 = 2 % 2;
        this.f526a = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void b(String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[1];
        c(new int[]{-2098581412, 165469072, 1199955101, -124013345, 2033002793, 751968865, 1480928336, 707574446}, 15, objArr);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", ((String) objArr[0]).intern());
        Date date = new Date();
        Date date2 = new Date(date.getTime() + 1000000);
        Date date3 = new Date(date.getTime() + 2000000);
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 4);
        builder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(date3).setAttestationChallenge(date.toString().getBytes(StandardCharsets.UTF_8));
        if (i2 >= 28) {
            int i3 = OLrzqt + 65;
            KWHzl = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (z) {
                builder.setIsStrongBoxBacked(true);
            }
        }
        builder.setDigests("NONE", "SHA-256");
        keyPairGenerator.initialize(builder.build());
        keyPairGenerator.generateKeyPair();
        int i4 = KWHzl + 89;
        OLrzqt = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String a() throws Throwable {
        String str;
        int i = 2 % 2;
        boolean z = this.f526a;
        try {
            z0 z0VarA = a("com.geetest.gtc4.attestation." + z, z);
            r6 r6VarB = z0VarA.f541a.b();
            StringBuilder sb = new StringBuilder();
            if (r6VarB.b) {
                int i2 = OLrzqt + 35;
                KWHzl = i2 % 128;
                int i3 = i2 % 2;
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(r6VarB.c);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(z0VarA.b);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(z0VarA.c);
            return sb.toString();
        } catch (x0 e) {
            String strValueOf = String.valueOf(e.getCode());
            int i4 = OLrzqt + 43;
            KWHzl = i4 % 128;
            if (i4 % 2 != 0) {
                return strValueOf;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [109=4] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014d, code lost:
    
        if (r11.getCause().getMessage().contains("device ids") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        if (r11.getCause().getMessage().contains("device ids") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        throw new com.geetest.gtc4.x0(-6, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z0 a(String str, boolean z) throws Throwable {
        int iA;
        String strReplace;
        int i = 2 % 2;
        try {
            b(str, z);
            Object[] objArr = new Object[1];
            c(new int[]{-2098581412, 165469072, 1199955101, -124013345, 2033002793, 751968865, 1480928336, 707574446}, 15, objArr);
            KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
            t0 t0VarA = null;
            keyStore.load(null);
            Certificate[] certificateChain = keyStore.getCertificateChain(str);
            if (certificateChain == null) {
                throw new CertificateException("Unable to get certificate chain");
            }
            ArrayList<Certificate> arrayList = new ArrayList(certificateChain.length);
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int length = certificateChain.length;
            int i2 = 0;
            while (i2 < length) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(certificateChain[i2].getEncoded())));
                i2++;
                int i3 = OLrzqt + 47;
                KWHzl = i3 % 128;
                int i4 = i3 % 2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Certificate certificate : arrayList) {
                if (!(!(certificate instanceof X509Certificate))) {
                    arrayList2.add((X509Certificate) certificate);
                }
            }
            try {
                iA = v7.a(arrayList2);
            } catch (GeneralSecurityException unused) {
                iA = -1;
            }
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int i5 = KWHzl + 85;
                    OLrzqt = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList3.add(((X509Certificate) it.next()).getSerialNumber().toString(16).toLowerCase());
                }
                strReplace = arrayList3.toString().replace(" ", "").replace("[", "").replace("]", "");
            } catch (GeneralSecurityException unused2) {
                strReplace = null;
            }
            int size = arrayList2.size() - 1;
            x0 x0Var = null;
            while (size >= 0) {
                try {
                    t0VarA = t0.a((X509Certificate) arrayList2.get(size));
                    break;
                } catch (CertificateParsingException e) {
                    size--;
                    x0Var = new x0(-4, e);
                }
            }
            if (t0VarA == null && x0Var != null) {
                throw x0Var;
            }
            z0 z0Var = new z0(t0VarA, iA, strReplace);
            int i7 = OLrzqt + 29;
            KWHzl = i7 % 128;
            int i8 = i7 % 2;
            return z0Var;
        } catch (ProviderException e2) {
            if (Build.VERSION.SDK_INT >= 28 && w0$$ExternalSyntheticApiModelOutline0.m(e2)) {
                throw new x0(-5, e2);
            }
            if (e2.getCause() != null && e2.getCause().getMessage() != null) {
                int i9 = KWHzl + 71;
                OLrzqt = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 71 / 0;
                }
            }
            throw new x0(-2, e2);
        } catch (Exception e3) {
            throw new x0(-2, e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = EZpvd;
        int i4 = 698602880;
        int i5 = 3;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objEZpvd = YY.EZpvd(i4);
                    if (objEZpvd == null) {
                        byte b = (byte) i5;
                        byte b2 = (byte) (b - 3);
                        objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 95;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 698602880;
                    i5 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = EZpvd;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 109;
                $10 = i10 % 128;
                int i11 = i10 % i2;
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                    Object objEZpvd2 = YY.EZpvd(698602880);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 3;
                        byte b4 = (byte) (b3 - 3);
                        objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objEZpvd2).invoke(null, objArr3)).intValue();
                    i9++;
                    i2 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        zm.OLrzqt = 0;
        while (zm.OLrzqt < iArr.length) {
            cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
            cArr[1] = (char) iArr[zm.OLrzqt];
            cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
            cArr[3] = (char) iArr[zm.OLrzqt + 1];
            zm.copydefault = (cArr[0] << 16) + cArr[1];
            zm.KWHzl = (cArr[2] << 16) + cArr[3];
            Zm.EZpvd(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = $11 + 57;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                zm.copydefault ^= iArr4[i12];
                Object[] objArr4 = {zm, Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                Object objEZpvd3 = YY.EZpvd(984677556);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$c(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
                zm.copydefault = zm.KWHzl;
                zm.KWHzl = iIntValue;
            }
            int i15 = zm.copydefault;
            zm.copydefault = zm.KWHzl;
            zm.KWHzl = i15;
            zm.KWHzl ^= iArr4[16];
            zm.copydefault ^= iArr4[17];
            int i16 = zm.copydefault;
            int i17 = zm.KWHzl;
            cArr[0] = (char) (zm.copydefault >>> 16);
            cArr[1] = (char) zm.copydefault;
            cArr[2] = (char) (zm.KWHzl >>> 16);
            cArr[3] = (char) zm.KWHzl;
            Zm.EZpvd(iArr4);
            cArr2[zm.OLrzqt * 2] = cArr[0];
            cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
            cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
            cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
            Object[] objArr5 = {zm, zm};
            Object objEZpvd4 = YY.EZpvd(-1770687495);
            if (objEZpvd4 == null) {
                byte b7 = (byte) 2;
                byte b8 = (byte) (b7 - 2);
                objEZpvd4 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}

package o;

import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;

/* JADX INFO: renamed from: o.mxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33514mxr {
    public static int AEQbTJ;
    public static int OLrzqt;

    public static java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str3);
        cipher.init(1, new javax.crypto.spec.SecretKeySpec(str4.getBytes(str2), BouncyCastleKeyManagementRepository.AES));
        return android.util.Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 2);
    }

    public static java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str4.getBytes(str2), BouncyCastleKeyManagementRepository.AES);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str3);
        cipher.init(2, secretKeySpec);
        return new java.lang.String(cipher.doFinal(android.util.Base64.decode(str, 0)), str2);
    }

    public static int EZpvd() {
        int i = AEQbTJ;
        int i2 = i % 8800732;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return OLrzqt;
        }
        int iUptimeMillis = (int) android.os.SystemClock.uptimeMillis();
        OLrzqt = iUptimeMillis;
        return iUptimeMillis;
    }
}

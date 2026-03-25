package o;

import com.okinc.okex.safety.NativeApi;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;

/* JADX INFO: renamed from: o.scw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44759scw {
    public static C44759scw AEQbTJ;
    public static byte[] EZpvd;
    public static byte[] KWHzl;

    public C44759scw() {
        try {
            EZpvd = EZpvd();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            for (int i = 0; i < 16; i++) {
                sb.append((char) 0);
            }
            KWHzl = sb.toString().getBytes();
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("CryptoHandler", "CryptoHandler: ", th);
        }
    }

    public static C44759scw AEQbTJ() {
        if (AEQbTJ == null) {
            AEQbTJ = new C44759scw();
        }
        return AEQbTJ;
    }

    public java.lang.String KWHzl(java.lang.String str) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(EZpvd, BouncyCastleKeyManagementRepository.AES);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(KWHzl);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new java.lang.String(cipher.doFinal(android.util.Base64.decode(str, 0)), "UTF8");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return "";
        }
    }

    public static byte[] EZpvd() throws java.io.UnsupportedEncodingException {
        return NativeApi.AEQbTJ().getBytes("UTF8");
    }
}

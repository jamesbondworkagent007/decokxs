package com.engagelab.privates.common.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.engagelab.privates.common.log.MTCommonLog;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public class RsaUitl {
    private static final String TAG = "RsaUitl";
    private static final String RSA_PUBLIC_KEY_HEX_STRING = Guard.string(new byte[]{69, 80, 102, 71, 100, 72, 81, 92, 90, 95, 122, 80, 96, 96, 114, 126, 97, 72, 77, 84, 83, 97, 97, 93, 91, 97, 80, 71, 115, 88, 66, 84, 80, 124, 16, 107, 98, 97, 103, 0, 77, 95, 123, 89, 40, 99, 112, SignedBytes.MAX_POWER_OF_TWO, 90, 47, 89, 90, Ascii.DC4, 95, 94, 47, 75, 125, 116, 120, 57, 82, 41, 65, 68, 125, 89, 93, 103, 70, 79, 119, 58, 84, 92, 104, 78, 90, 101, 100, 101, 0, 108, 67, 109, 99, 85, 4, Ascii.CAN, 67, 111, 125, 80, 74, 70, 79, 113, 100, 83, 97, 78, 65, 123, 114, 122, 92, 76, 123, 56, 84, 122, 114, 65, 86, 71, 32, 118, 123, 109, 90, 73, 97, 84, 113, 97, 72, 53, 43});
    private static final String RSA_MODE = Guard.string(new byte[]{68, 66, 113, Ascii.SI, 87, 103, 120, 116, Ascii.US, 112, 82, 75, 69, 32, 96, 65, 125, 108, 127, 127, 87});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String deRsa(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MTCommonLog.d(TAG, "decodeRsaPubKey " + decodeRsaPubKey());
            StringBuilder sb = new StringBuilder();
            sb.append("RSA_MODE ");
            String str2 = RSA_MODE;
            sb.append(str2);
            MTCommonLog.d(TAG, sb.toString());
            return rsaDecryptString(str, decodeRsaPubKey(), str2);
        } catch (Throwable th) {
            MTCommonLog.d(TAG, "deRsa " + th.getMessage());
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static RSAPublicKey loadRSAKey(String str) {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (Throwable th) {
            MTCommonLog.d(TAG, "rsa loadRSAKey e=" + th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] rsaDecrypt(String str, RSAPublicKey rSAPublicKey, String str2) throws Exception {
        byte[] bArrDecode;
        synchronized (RsaUitl.class) {
            byte[] bArrDecode2 = Base64.decode(str, 2);
            Cipher cipher = Cipher.getInstance(str2);
            cipher.init(2, rSAPublicKey);
            bArrDecode = Base64.decode(cipher.doFinal(bArrDecode2), 2);
        }
        return bArrDecode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String rsaDecryptString(String str, String str2, String str3) throws Exception {
        return new String(Base64.encode(rsaDecrypt(str, loadRSAKey(str2), str3), 2), C.UTF8_NAME);
    }

    private static String decodeRsaPubKey() {
        try {
            return RSA_PUBLIC_KEY_HEX_STRING;
        } catch (Throwable th) {
            MTCommonLog.d(TAG, "decodeRsaPubKey " + th.getMessage());
            return "";
        }
    }
}

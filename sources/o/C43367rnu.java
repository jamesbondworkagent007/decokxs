package o;

import com.okinc.okex.safety.NativeApi;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;

/* JADX INFO: renamed from: o.rnu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43367rnu {
    public static java.lang.String OLrzqt() {
        return NativeApi.getDohRsaPrivacy();
    }

    public static java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        byte[] bArrDoFinal;
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(android.util.Base64.decode(str2, 0)));
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, rSAPrivateKey);
        int length = bArrDecode.length;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - i;
            if (i3 > 0) {
                if (i3 > 128) {
                    bArrDoFinal = cipher.doFinal(bArrDecode, i, 128);
                } else {
                    bArrDoFinal = cipher.doFinal(bArrDecode, i, i3);
                }
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i2++;
                i = i2 * 128;
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return new java.lang.String(byteArray);
            }
        }
    }
}

package o;

import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* JADX INFO: renamed from: o.aYZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C6924aYZ {
    public static javax.crypto.Cipher OLrzqt;

    public static java.lang.String AEQbTJ(java.lang.String str) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (OLrzqt == null) {
            OLrzqt = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            byte[] bytes = "6ad8035a-1be1-43".getBytes(StandardCharsets.UTF_8);
            OLrzqt.init(1, new javax.crypto.spec.SecretKeySpec(bytes, BouncyCastleKeyManagementRepository.AES), new javax.crypto.spec.IvParameterSpec(bytes));
        }
        javax.crypto.Cipher cipher = OLrzqt;
        byte[] bArrDoFinal = cipher != null ? cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)) : null;
        return (bArrDoFinal == null || bArrDoFinal.length == 0) ? str : android.util.Base64.encodeToString(bArrDoFinal, 2);
    }
}

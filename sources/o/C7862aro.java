package o;

import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.aro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7862aro {
    public static java.lang.String copydefault(java.lang.String str) {
        return EZpvd(str.getBytes());
    }

    public static java.lang.String EZpvd(byte[] bArr) {
        return AEQbTJ(KWHzl(bArr, "MD5"));
    }

    public static byte[] KWHzl(byte[] bArr, java.lang.String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException e) {
            pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
            return null;
        }
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            java.lang.String string = java.lang.Integer.toString(b & UnsignedBytes.MAX_VALUE, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb.append(string);
        }
        return sb.toString();
    }
}

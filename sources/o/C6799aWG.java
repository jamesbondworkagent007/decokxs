package o;

import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.aWG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6799aWG {
    public static MessageDigest EZpvd;

    static {
        try {
            EZpvd = MessageDigest.getInstance("MD5");
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        try {
            byte[] bArrDigest = EZpvd.digest(str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            for (byte b : bArrDigest) {
                int i = b & UnsignedBytes.MAX_VALUE;
                if ((i >> 4) == 0) {
                    sb.append("0");
                    sb.append(java.lang.Integer.toHexString(i));
                } else {
                    sb.append(java.lang.Integer.toHexString(i));
                }
            }
            return sb.toString();
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}

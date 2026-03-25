package o;

import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.xWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54809xWc {
    public static final MessageDigest copydefault;

    static {
        try {
            copydefault = MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        byte[] bArrDigest = copydefault.digest(str.getBytes());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(java.lang.Integer.toString(b & UnsignedBytes.MAX_VALUE, 16));
        }
        return sb.toString();
    }
}

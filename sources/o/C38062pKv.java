package o;

import com.okinc.lib.utils.OkUtils;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.pKv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C38062pKv {
    public static final java.lang.String EZpvd = "MD5Utils";

    private C38062pKv() {
    }

    public static java.lang.String AEQbTJ(java.io.File file) {
        return C38056pKp.EZpvd(EZpvd(file));
    }

    public static byte[] EZpvd(java.io.File file) throws java.lang.Throwable {
        DigestInputStream digestInputStream;
        DigestInputStream digestInputStream2 = null;
        if (file == null) {
            return null;
        }
        try {
            digestInputStream = new DigestInputStream(new java.io.FileInputStream(file), MessageDigest.getInstance("MD5"));
        } catch (java.lang.Exception e) {
            e = e;
            digestInputStream = null;
        } catch (java.lang.Throwable th) {
            th = th;
            C38058pKr.copydefault(digestInputStream2);
            throw th;
        }
        try {
            try {
                while (digestInputStream.read(new byte[262144]) > 0) {
                }
                byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                C38058pKr.copydefault(digestInputStream);
                return bArrDigest;
            } catch (java.lang.Throwable th2) {
                th = th2;
                digestInputStream2 = digestInputStream;
                C38058pKr.copydefault(digestInputStream2);
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            OkUtils.AhwBna().copydefault(EZpvd, "getFileMD5", e);
            C38058pKr.copydefault(digestInputStream);
            return null;
        }
    }
}

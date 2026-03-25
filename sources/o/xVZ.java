package o;

import com.okinc.base.utils.OkUtils;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes19.dex */
public class xVZ {
    public static java.lang.String AEQbTJ;

    public static java.lang.String KWHzl() {
        java.lang.StringBuilder sb;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = "";
        try {
            try {
                str = OkUtils.AEQbTJ().getPackageManager().getApplicationInfo(C34703nhO.KWHzl(OkUtils.AEQbTJ()), 0).sourceDir;
                pUU.EZpvd("dexguard", "getBaseApkPath apkPath==>" + str);
                sb = new java.lang.StringBuilder();
            } catch (java.lang.Exception e) {
                pUU.EZpvd("dexguard", "getBaseApkPath fail==>" + e.getMessage());
                e.printStackTrace();
                sb = new java.lang.StringBuilder();
            }
            sb.append("getBaseApkPath cost time==>");
            sb.append(java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            pUU.EZpvd("dexguard", sb.toString());
            return str;
        } catch (java.lang.Throwable th) {
            pUU.EZpvd("dexguard", "getBaseApkPath cost time==>" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [88=4] */
    public static java.lang.String OLrzqt() {
        java.lang.StringBuilder sb;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
            } catch (java.lang.Exception e) {
                pUU.EZpvd("dexguard", "getApkSignaturePublicKey fail==>" + e.getMessage());
                e.printStackTrace();
                sb = new java.lang.StringBuilder();
            }
            if (!android.text.TextUtils.isEmpty(AEQbTJ)) {
                return AEQbTJ;
            }
            JarFile jarFile = new JarFile(new java.io.File(KWHzl()));
            java.io.InputStream inputStream = jarFile.getInputStream(jarFile.getJarEntry("META-INF/CERT.RSA"));
            java.util.Collection<? extends java.security.cert.Certificate> collectionGenerateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(inputStream);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            java.util.Iterator<? extends java.security.cert.Certificate> it = collectionGenerateCertificates.iterator();
            while (it.hasNext()) {
                byte[] bArrDigest = messageDigest.digest(it.next().getEncoded());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                for (byte b : bArrDigest) {
                    sb2.append(java.lang.String.format("%02X", java.lang.Byte.valueOf(b)));
                }
                arrayList.add(sb2.toString());
            }
            jarFile.close();
            inputStream.close();
            sb = new java.lang.StringBuilder();
            sb.append("getApkSignaturePublicKey cost time==>");
            sb.append(java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            pUU.EZpvd("dexguard", sb.toString());
            if (arrayList.size() <= 0) {
                return "";
            }
            java.lang.String str = (java.lang.String) arrayList.get(0);
            AEQbTJ = str;
            return str;
        } finally {
            pUU.EZpvd("dexguard", "getApkSignaturePublicKey cost time==>" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }
}

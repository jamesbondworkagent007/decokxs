package o;

import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6797aWE {
    public static final C6797aWE KWHzl = new C6797aWE();

    private C6797aWE() {
    }

    public final java.lang.String AEQbTJ(android.content.pm.Signature[] signatureArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (signatureArr != null) {
                java.util.Iterator itEZpvd = yHX.EZpvd(signatureArr);
                while (itEZpvd.hasNext()) {
                    android.content.pm.Signature signature = (android.content.pm.Signature) itEZpvd.next();
                    if (signature != null) {
                        messageDigest.update(signature.toByteArray());
                    }
                }
            }
            return C6829aWk.KWHzl(messageDigest.digest());
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String OLrzqt(android.content.pm.Signature[] signatureArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            if (signatureArr != null) {
                java.util.Iterator itEZpvd = yHX.EZpvd(signatureArr);
                while (itEZpvd.hasNext()) {
                    android.content.pm.Signature signature = (android.content.pm.Signature) itEZpvd.next();
                    if (signature != null) {
                        messageDigest.update(signature.toByteArray());
                    }
                }
            }
            return C6829aWk.KWHzl(messageDigest.digest());
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String copydefault(android.content.pm.Signature[] signatureArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (signatureArr != null) {
                java.util.Iterator itEZpvd = yHX.EZpvd(signatureArr);
                while (itEZpvd.hasNext()) {
                    android.content.pm.Signature signature = (android.content.pm.Signature) itEZpvd.next();
                    if (signature != null) {
                        messageDigest.update(signature.toByteArray());
                    }
                }
            }
            return C6829aWk.KWHzl(messageDigest.digest());
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o.aWE$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((ZipEntry) t).getSize()), java.lang.Long.valueOf(((ZipEntry) t2).getSize()));
        }
    }

    public final X509Certificate KWHzl(android.content.pm.Signature signature) {
        if (signature == null) {
            return null;
        }
        try {
            java.security.cert.Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()));
            Intrinsics.copydefault(certificateGenerateCertificate, "");
            return (X509Certificate) certificateGenerateCertificate;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> KWHzl(@NotNull android.content.pm.Signature[] signatureArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        java.lang.String strKWHzl;
        android.content.pm.Signature[] signatureArr2 = signatureArr;
        java.lang.String str4 = "line.separator";
        java.lang.String str5 = " to ";
        java.lang.String str6 = "toString(...)";
        Intrinsics.checkNotNullParameter(signatureArr2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault());
            int length = signatureArr2.length;
            int i = 0;
            while (i < length) {
                android.content.pm.Signature signature = signatureArr2[i];
                if (signature != null) {
                    try {
                        X509Certificate x509CertificateKWHzl = KWHzl(signature);
                        Intrinsics.copydefault(x509CertificateKWHzl);
                        Date notBefore = x509CertificateKWHzl.getNotBefore();
                        Date notAfter = x509CertificateKWHzl.getNotAfter();
                        java.lang.String str7 = simpleDateFormat.format(notBefore) + str5 + simpleDateFormat.format(notAfter) + java.lang.System.getProperty(str4) + java.lang.System.getProperty(str4) + notBefore + str5 + notAfter;
                        Intrinsics.checkNotNullExpressionValue(str7, str6);
                        try {
                            x509CertificateKWHzl.checkValidity();
                            z = false;
                        } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                            z = true;
                        }
                        java.lang.String string = x509CertificateKWHzl.getIssuerX500Principal().toString();
                        Intrinsics.checkNotNullExpressionValue(string, str6);
                        int version = x509CertificateKWHzl.getVersion();
                        java.lang.String sigAlgName = x509CertificateKWHzl.getSigAlgName();
                        java.lang.String sigAlgOID = x509CertificateKWHzl.getSigAlgOID();
                        java.lang.String string2 = x509CertificateKWHzl.getSerialNumber().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, str6);
                        try {
                            strKWHzl = C6829aWk.KWHzl(x509CertificateKWHzl.getTBSCertificate());
                        } catch (CertificateEncodingException unused2) {
                            strKWHzl = null;
                        }
                        str = str4;
                        java.lang.String str8 = strKWHzl;
                        java.lang.String string3 = x509CertificateKWHzl.getPublicKey().toString();
                        str2 = str5;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        str3 = str6;
                        linkedHashMap.put("Certificate Validity", str7);
                        linkedHashMap.put("Certificate Expiration Status", java.lang.String.valueOf(z));
                        linkedHashMap.put("Certificate Issuer", string);
                        linkedHashMap.put("Certificate Version", java.lang.String.valueOf(version));
                        linkedHashMap.put("Certificate Algorithm", sigAlgName);
                        linkedHashMap.put("OID of Certificate Algorithm", sigAlgOID);
                        linkedHashMap.put("Certificate Machine Code", string2);
                        linkedHashMap.put("Certificate DER Code", str8);
                        linkedHashMap.put("Certificate Public Key", string3);
                        arrayList.add(linkedHashMap);
                    } catch (java.lang.Exception unused3) {
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                }
                i++;
                signatureArr2 = signatureArr;
                str5 = str2;
                str4 = str;
                str6 = str3;
            }
        } catch (java.lang.Exception unused4) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x00b4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x00bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x000f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.zip.ZipFile] */
    public final java.lang.String copydefault(@NotNull android.content.Context context) throws java.lang.Throwable {
        ?? zipFile;
        java.util.Iterator it;
        boolean zHasNext;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strKWHzl = KWHzl(context);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        ?? r2 = 0;
        ?? r22 = 0;
        try {
            try {
                zipFile = new ZipFile(strKWHzl);
                try {
                    java.util.Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    Intrinsics.checkNotNullExpressionValue(enumerationEntries, "");
                    java.util.ArrayList list = Collections.list(enumerationEntries);
                    Intrinsics.checkNotNullExpressionValue(list, "");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        ZipEntry zipEntry = (ZipEntry) obj;
                        java.lang.String name = zipEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (!C59449zhJ.endsWith$default(name, ".dex", false, 2, null)) {
                            java.lang.String name2 = zipEntry.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "");
                            if (C59449zhJ.endsWith$default(name2, ".so", false, 2, null)) {
                            }
                        }
                        arrayList.add(obj);
                    }
                    it = CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator()).iterator();
                } catch (java.io.IOException e) {
                    e = e;
                    r22 = zipFile;
                    e.printStackTrace();
                    r2 = r22;
                    if (r22 != 0) {
                        r22.close();
                        r2 = r22;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (zipFile != 0) {
                        zipFile.close();
                    }
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
            while (true) {
                zHasNext = it.hasNext();
                if (!zHasNext) {
                    break;
                }
                ZipEntry zipEntry2 = (ZipEntry) it.next();
                stringBuffer.append(zipEntry2.getName() + "[" + zipEntry2.getCrc() + "," + zipEntry2.getSize() + "]");
                stringBuffer.append('\n');
                java.lang.String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            new CRC32();
            zipFile.close();
            r2 = zHasNext;
            java.lang.String string2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            zipFile = r2;
        }
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.publicSourceDir;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}

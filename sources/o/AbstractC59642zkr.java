package o;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: renamed from: o.zkr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59642zkr implements X509HostnameVerifier {
    public static final java.lang.String[] BAD_COUNTRY_2LDS;
    public final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    static {
        java.lang.String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        BAD_COUNTRY_2LDS = strArr;
        java.util.Arrays.sort(strArr);
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(java.lang.String str, SSLSocket sSLSocket) throws java.io.IOException {
        C59851zoo.AEQbTJ(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(java.lang.String str, X509Certificate x509Certificate) throws SSLException {
        java.util.List<C59645zku> listCopydefault = DefaultHostnameVerifier.copydefault(x509Certificate);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C59649zky.OLrzqt(str) || C59649zky.AEQbTJ(str)) {
            for (C59645zku c59645zku : listCopydefault) {
                if (c59645zku.AEQbTJ() == 7) {
                    arrayList.add(c59645zku.OLrzqt());
                }
            }
        } else {
            for (C59645zku c59645zku2 : listCopydefault) {
                if (c59645zku2.AEQbTJ() == 2) {
                    arrayList.add(c59645zku2.OLrzqt());
                }
            }
        }
        java.lang.String strEZpvd = DefaultHostnameVerifier.EZpvd(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        verify(str, strEZpvd != null ? new java.lang.String[]{strEZpvd} : null, arrayList.isEmpty() ? null : (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public final void verify(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, boolean z) throws SSLException {
        java.util.List<java.lang.String> listAsList = null;
        java.lang.String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            listAsList = java.util.Arrays.asList(strArr2);
        }
        java.lang.String strKWHzl = C59649zky.AEQbTJ(str) ? DefaultHostnameVerifier.KWHzl(str.toLowerCase(java.util.Locale.ROOT)) : str;
        if (listAsList != null) {
            for (java.lang.String strKWHzl2 : listAsList) {
                if (C59649zky.AEQbTJ(strKWHzl2)) {
                    strKWHzl2 = DefaultHostnameVerifier.KWHzl(strKWHzl2);
                }
                if (matchIdentity(strKWHzl, strKWHzl2, z)) {
                    return;
                }
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + listAsList);
        }
        if (str2 != null) {
            if (matchIdentity(strKWHzl, C59649zky.AEQbTJ(str2) ? DefaultHostnameVerifier.KWHzl(str2) : str2, z)) {
                return;
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
        }
        throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
    }

    public static boolean matchIdentity(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        java.lang.String lowerCase2 = str2.toLowerCase(locale);
        java.lang.String[] strArrSplit = lowerCase2.split("\\.");
        if (strArrSplit.length >= 3 && strArrSplit[0].endsWith("*") && (!z || validCountryWildcard(strArrSplit))) {
            java.lang.String str3 = strArrSplit[0];
            if (str3.length() > 1) {
                java.lang.String strSubstring = str3.substring(0, str3.length() - 1);
                java.lang.String strSubstring2 = lowerCase2.substring(str3.length());
                java.lang.String strSubstring3 = lowerCase.substring(strSubstring.length());
                if (!lowerCase.startsWith(strSubstring) || !strSubstring3.endsWith(strSubstring2)) {
                    return false;
                }
            } else if (!lowerCase.endsWith(lowerCase2.substring(1))) {
                return false;
            }
            return !z || countDots(lowerCase) == countDots(lowerCase2);
        }
        return lowerCase.equals(lowerCase2);
    }

    public static boolean validCountryWildcard(java.lang.String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && java.util.Arrays.binarySearch(BAD_COUNTRY_2LDS, strArr[1]) >= 0) ? false : true;
    }

    public static boolean acceptableCountryWildcard(java.lang.String str) {
        return validCountryWildcard(str.split("\\."));
    }

    public static java.lang.String[] getCNs(X509Certificate x509Certificate) {
        try {
            java.lang.String strEZpvd = DefaultHostnameVerifier.EZpvd(x509Certificate.getSubjectX500Principal().toString());
            if (strEZpvd != null) {
                return new java.lang.String[]{strEZpvd};
            }
        } catch (SSLException unused) {
        }
        return null;
    }

    public static java.lang.String[] getDNSSubjectAlts(X509Certificate x509Certificate) {
        java.util.List<C59645zku> listCopydefault = DefaultHostnameVerifier.copydefault(x509Certificate);
        if (listCopydefault == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C59645zku c59645zku : listCopydefault) {
            if (c59645zku.AEQbTJ() == 2) {
                arrayList.add(c59645zku.OLrzqt());
            }
        }
        if (arrayList.isEmpty()) {
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        return null;
    }

    public static int countDots(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }
}

package org.apache.http.conn.ssl;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.C59600zkB;
import o.C59645zku;
import o.C59649zky;
import o.InterfaceC59499ziG;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.util.DomainType;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultHostnameVerifier implements HostnameVerifier {
    public final InterfaceC59499ziG EZpvd;
    public final C59600zkB KWHzl;

    public enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);

        final int subjectType;

        HostNameType(int i) {
            this.subjectType = i;
        }
    }

    public DefaultHostnameVerifier(C59600zkB c59600zkB) {
        this.EZpvd = LogFactory.copydefault(DefaultHostnameVerifier.class);
        this.KWHzl = c59600zkB;
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            EZpvd(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.EZpvd.isDebugEnabled()) {
                this.EZpvd.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    public void EZpvd(String str, X509Certificate x509Certificate) throws SSLException {
        HostNameType hostNameTypeAEQbTJ = AEQbTJ(str);
        List<C59645zku> listCopydefault = copydefault(x509Certificate);
        if (listCopydefault != null && !listCopydefault.isEmpty()) {
            int i = AnonymousClass5.OLrzqt[hostNameTypeAEQbTJ.ordinal()];
            if (i == 1) {
                KWHzl(str, listCopydefault);
                return;
            } else if (i == 2) {
                copydefault(str, listCopydefault);
                return;
            } else {
                OLrzqt(str, listCopydefault, this.KWHzl);
                return;
            }
        }
        String strEZpvd = EZpvd(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (strEZpvd == null) {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
        }
        EZpvd(str, strEZpvd, this.KWHzl);
    }

    /* JADX INFO: renamed from: org.apache.http.conn.ssl.DefaultHostnameVerifier$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[HostNameType.values().length];
            OLrzqt = iArr;
            try {
                iArr[HostNameType.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[HostNameType.IPv6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void KWHzl(String str, List<C59645zku> list) throws SSLException {
        for (int i = 0; i < list.size(); i++) {
            C59645zku c59645zku = list.get(i);
            if (c59645zku.AEQbTJ() == 7 && str.equals(c59645zku.OLrzqt())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void copydefault(String str, List<C59645zku> list) throws SSLException {
        String strKWHzl = KWHzl(str);
        for (int i = 0; i < list.size(); i++) {
            C59645zku c59645zku = list.get(i);
            if (c59645zku.AEQbTJ() == 7 && strKWHzl.equals(KWHzl(c59645zku.OLrzqt()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void OLrzqt(String str, List<C59645zku> list, C59600zkB c59600zkB) throws SSLException {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < list.size(); i++) {
            C59645zku c59645zku = list.get(i);
            if (c59645zku.AEQbTJ() == 2 && OLrzqt(lowerCase, c59645zku.OLrzqt().toLowerCase(Locale.ROOT), c59600zkB)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void EZpvd(String str, String str2, C59600zkB c59600zkB) throws SSLException {
        Locale locale = Locale.ROOT;
        if (OLrzqt(str.toLowerCase(locale), str2.toLowerCase(locale), c59600zkB)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    public static boolean EZpvd(String str, String str2) {
        if (str2 != null && str.endsWith(str2)) {
            return str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.';
        }
        return false;
    }

    public static boolean OLrzqt(String str, String str2, C59600zkB c59600zkB, boolean z) {
        if (c59600zkB != null && str.contains(JwtUtilsKt.JWT_DELIMITER) && !EZpvd(str, c59600zkB.EZpvd(str2, DomainType.ICANN))) {
            return false;
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !str.startsWith(strSubstring)) {
                return false;
            }
            if (strSubstring2.isEmpty() || str.endsWith(strSubstring2)) {
                return (z && str.substring(strSubstring.length(), str.length() - strSubstring2.length()).contains(JwtUtilsKt.JWT_DELIMITER)) ? false : true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean OLrzqt(String str, String str2, C59600zkB c59600zkB) {
        return OLrzqt(str, str2, c59600zkB, true);
    }

    public static String EZpvd(String str) throws SSLException {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NoSuchElementException | NamingException unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused2) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    public static HostNameType AEQbTJ(String str) {
        if (C59649zky.OLrzqt(str)) {
            return HostNameType.IPv4;
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        if (C59649zky.AEQbTJ(str)) {
            return HostNameType.IPv6;
        }
        return HostNameType.DNS;
    }

    public static List<C59645zku> copydefault(X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new C59645zku((String) obj, num.intValue()));
                    } else {
                        boolean z = obj instanceof byte[];
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static String KWHzl(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }
}

package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59715zmK implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "domain";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (str.trim().isEmpty()) {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
        interfaceC59606zkH.setDomain(str);
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.lang.String domain = interfaceC59601zkC.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        }
        if (domain.equals(strCopydefault)) {
            return;
        }
        if (domain.indexOf(46) == -1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" does not match the host \"" + strCopydefault + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (!domain.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
        }
        int iIndexOf = domain.indexOf(46, 1);
        if (iIndexOf < 0 || iIndexOf == domain.length() - 1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
        }
        java.lang.String lowerCase = strCopydefault.toLowerCase(java.util.Locale.ROOT);
        if (!lowerCase.endsWith(domain)) {
            throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1) {
            return;
        }
        throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
    }

    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.lang.String domain = interfaceC59601zkC.getDomain();
        if (domain == null) {
            return false;
        }
        return strCopydefault.equals(domain) || (domain.startsWith(JwtUtilsKt.JWT_DELIMITER) && strCopydefault.endsWith(domain));
    }
}

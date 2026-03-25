package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59722zmR implements InterfaceC59650zkz {
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
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        if (!str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            lowerCase = '.' + lowerCase;
        }
        interfaceC59606zkH.setDomain(lowerCase);
    }

    public boolean copydefault(java.lang.String str, java.lang.String str2) {
        return str.equals(str2) || (str2.startsWith(JwtUtilsKt.JWT_DELIMITER) && str.endsWith(str2));
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
        if (interfaceC59601zkC.getDomain() == null) {
            throw new CookieRestrictionViolationException("Invalid cookie state: domain not specified");
        }
        java.lang.String lowerCase2 = interfaceC59601zkC.getDomain().toLowerCase(locale);
        if ((interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("domain")) {
            if (!lowerCase2.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
                throw new CookieRestrictionViolationException("Domain attribute \"" + interfaceC59601zkC.getDomain() + "\" violates RFC 2109: domain must start with a dot");
            }
            int iIndexOf = lowerCase2.indexOf(46, 1);
            if ((iIndexOf < 0 || iIndexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                throw new CookieRestrictionViolationException("Domain attribute \"" + interfaceC59601zkC.getDomain() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
            }
            if (!copydefault(lowerCase, lowerCase2)) {
                throw new CookieRestrictionViolationException("Domain attribute \"" + interfaceC59601zkC.getDomain() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
            }
            if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) == -1) {
                return;
            }
            throw new CookieRestrictionViolationException("Domain attribute \"" + interfaceC59601zkC.getDomain() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
        }
        if (interfaceC59601zkC.getDomain().equals(lowerCase)) {
            return;
        }
        throw new CookieRestrictionViolationException("Illegal domain attribute: \"" + interfaceC59601zkC.getDomain() + "\".Domain of origin: \"" + lowerCase + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String lowerCase = c59602zkD.copydefault().toLowerCase(java.util.Locale.ROOT);
        java.lang.String domain = interfaceC59601zkC.getDomain();
        return copydefault(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1;
    }
}

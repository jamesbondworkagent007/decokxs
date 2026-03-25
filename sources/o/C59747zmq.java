package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59747zmq implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "domain";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (C59853zoq.OLrzqt(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        }
        if (str.endsWith(JwtUtilsKt.JWT_DELIMITER)) {
            return;
        }
        if (str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            str = str.substring(1);
        }
        interfaceC59606zkH.setDomain(str.toLowerCase(java.util.Locale.ROOT));
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.lang.String domain = interfaceC59601zkC.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie 'domain' may not be null");
        }
        if (strCopydefault.equals(domain) || EZpvd(domain, strCopydefault)) {
            return;
        }
        throw new CookieRestrictionViolationException("Illegal 'domain' attribute \"" + domain + "\". Domain of origin: \"" + strCopydefault + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public static boolean EZpvd(java.lang.String str, java.lang.String str2) {
        if (C59649zky.OLrzqt(str2) || C59649zky.AEQbTJ(str2)) {
            return false;
        }
        if (str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            str = str.substring(1);
        }
        if (!str2.endsWith(str)) {
            return false;
        }
        int length = str2.length() - str.length();
        if (length == 0) {
            return true;
        }
        return length > 1 && str2.charAt(length - 1) == '.';
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
        if (domain.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            domain = domain.substring(1);
        }
        java.lang.String lowerCase = domain.toLowerCase(java.util.Locale.ROOT);
        if (strCopydefault.equals(lowerCase)) {
            return true;
        }
        if ((interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("domain")) {
            return EZpvd(lowerCase, strCopydefault);
        }
        return false;
    }
}

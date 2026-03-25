package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59712zmH extends C59747zmq {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59747zmq, o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "domain";
    }

    @Override // o.C59747zmq, o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (C59853zoq.OLrzqt(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        }
        interfaceC59606zkH.setDomain(str);
    }

    @Override // o.C59747zmq, o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.lang.String domain = interfaceC59601zkC.getDomain();
        if (!strCopydefault.equals(domain) && !C59747zmq.EZpvd(domain, strCopydefault)) {
            throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + strCopydefault + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (strCopydefault.contains(JwtUtilsKt.JWT_DELIMITER)) {
            int iCountTokens = new StringTokenizer(domain, JwtUtilsKt.JWT_DELIMITER).countTokens();
            if (!EZpvd(domain)) {
                if (iCountTokens >= 3) {
                    return;
                }
                throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates the Netscape cookie specification");
            }
            if (iCountTokens >= 2) {
                return;
            }
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates the Netscape cookie specification for special domains");
        }
    }

    public static boolean EZpvd(java.lang.String str) {
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    @Override // o.C59747zmq, o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.lang.String strCopydefault = c59602zkD.copydefault();
        java.lang.String domain = interfaceC59601zkC.getDomain();
        if (domain == null) {
            return false;
        }
        return strCopydefault.endsWith(domain);
    }
}

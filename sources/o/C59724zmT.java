package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59724zmT implements InterfaceC59650zkz {
    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "version";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        int i;
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new MalformedCookieException("Invalid cookie version.");
        }
        interfaceC59606zkH.setVersion(i);
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        if ((interfaceC59601zkC instanceof InterfaceC59609zkK) && (interfaceC59601zkC instanceof InterfaceC59648zkx) && !((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("version")) {
            throw new CookieRestrictionViolationException("Violates RFC 2965. Version attribute is required.");
        }
    }
}

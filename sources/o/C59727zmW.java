package o;

import com.google.common.net.HttpHeaders;
import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59727zmW implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "port";
    }

    public static int[] AEQbTJ(java.lang.String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                int i2 = java.lang.Integer.parseInt(stringTokenizer.nextToken().trim());
                iArr[i] = i2;
                if (i2 < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i++;
            } catch (java.lang.NumberFormatException e) {
                throw new MalformedCookieException("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    public static boolean copydefault(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (interfaceC59606zkH instanceof InterfaceC59609zkK) {
            InterfaceC59609zkK interfaceC59609zkK = (InterfaceC59609zkK) interfaceC59606zkH;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            interfaceC59609zkK.setPorts(AEQbTJ(str));
        }
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        int iEZpvd = c59602zkD.EZpvd();
        if ((interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("port") && !copydefault(iEZpvd, interfaceC59601zkC.getPorts())) {
            throw new CookieRestrictionViolationException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        int iEZpvd = c59602zkD.EZpvd();
        if ((interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("port")) {
            return interfaceC59601zkC.getPorts() != null && copydefault(iEZpvd, interfaceC59601zkC.getPorts());
        }
        return true;
    }
}

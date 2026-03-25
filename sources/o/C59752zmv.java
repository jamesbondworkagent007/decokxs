package o;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59752zmv extends AbstractC59749zms implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "max-age";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
        try {
            int i = java.lang.Integer.parseInt(str);
            if (i < 0) {
                throw new MalformedCookieException("Negative 'max-age' attribute: " + str);
            }
            interfaceC59606zkH.setExpiryDate(new Date(java.lang.System.currentTimeMillis() + (((long) i) * 1000)));
        } catch (java.lang.NumberFormatException unused) {
            throw new MalformedCookieException("Invalid 'max-age' attribute: " + str);
        }
    }
}

package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59706zmB extends AbstractC59749zms implements InterfaceC59650zkz {
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
            i = 0;
        }
        interfaceC59606zkH.setVersion(i);
    }
}

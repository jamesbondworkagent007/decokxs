package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59750zmt extends AbstractC59749zms implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "secure";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        interfaceC59606zkH.setSecure(true);
    }

    @Override // o.AbstractC59749zms, o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        return !interfaceC59601zkC.isSecure() || c59602zkD.AEQbTJ();
    }
}

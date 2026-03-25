package o;

import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59719zmO implements InterfaceC59650zkz {
    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "discard";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        if (interfaceC59606zkH instanceof InterfaceC59609zkK) {
            ((InterfaceC59609zkK) interfaceC59606zkH).setDiscard(true);
        }
    }
}

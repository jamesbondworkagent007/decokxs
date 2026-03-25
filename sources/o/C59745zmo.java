package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59745zmo extends AbstractC59749zms implements InterfaceC59650zkz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "comment";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        interfaceC59606zkH.setComment(str);
    }
}

package o;

import org.apache.http.ProtocolException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;

/* JADX INFO: renamed from: o.zlA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59652zlA implements RedirectStrategy {
    public final RedirectHandler KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RedirectHandler AEQbTJ() {
        return this.KWHzl;
    }

    public C59652zlA(RedirectHandler redirectHandler) {
        this.KWHzl = redirectHandler;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        return this.KWHzl.isRedirectRequested(interfaceC59584zjm, interfaceC59838zob);
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        java.net.URI locationURI = this.KWHzl.getLocationURI(interfaceC59584zjm, interfaceC59838zob);
        if (interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase("HEAD")) {
            return new HttpHead(locationURI);
        }
        return new HttpGet(locationURI);
    }
}

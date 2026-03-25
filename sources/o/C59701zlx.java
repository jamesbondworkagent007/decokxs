package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.auth.MalformedChallengeException;

/* JADX INFO: renamed from: o.zlx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public class C59701zlx extends AbstractC59689zll {
    @Override // org.apache.http.client.AuthenticationHandler
    public boolean isAuthenticationRequested(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        return interfaceC59584zjm.AEQbTJ().getStatusCode() == 407;
    }

    @Override // org.apache.http.client.AuthenticationHandler
    public java.util.Map<java.lang.String, InterfaceC59518ziZ> getChallenges(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        return OLrzqt(interfaceC59584zjm.getHeaders(HttpHeaders.PROXY_AUTHENTICATE));
    }

    @Override // o.AbstractC59689zll
    public java.util.List<java.lang.String> AEQbTJ(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        java.util.List<java.lang.String> list = (java.util.List) interfaceC59584zjm.getParams().getParameter("http.auth.proxy-scheme-pref");
        return list != null ? list : super.AEQbTJ(interfaceC59584zjm, interfaceC59838zob);
    }
}

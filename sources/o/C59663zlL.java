package o;

import com.google.common.net.HttpHeaders;
import java.util.Queue;
import org.apache.http.HttpHost;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.config.RequestConfig;

/* JADX INFO: renamed from: o.zlL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59663zlL extends AbstractC59697zlt {
    public static final C59663zlL KWHzl = new C59663zlL();

    @Override // o.AbstractC59697zlt, org.apache.http.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ void authFailed(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        super.authFailed(httpHost, interfaceC59588zjq, interfaceC59838zob);
    }

    @Override // o.AbstractC59697zlt, org.apache.http.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ void authSucceeded(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        super.authSucceeded(httpHost, interfaceC59588zjq, interfaceC59838zob);
    }

    @Override // o.AbstractC59697zlt, org.apache.http.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ java.util.Map getChallenges(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        return super.getChallenges(httpHost, interfaceC59584zjm, interfaceC59838zob);
    }

    @Override // o.AbstractC59697zlt, org.apache.http.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ boolean isAuthenticationRequested(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        return super.isAuthenticationRequested(httpHost, interfaceC59584zjm, interfaceC59838zob);
    }

    @Override // o.AbstractC59697zlt, org.apache.http.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ Queue select(java.util.Map map, HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        return super.select(map, httpHost, interfaceC59584zjm, interfaceC59838zob);
    }

    public C59663zlL() {
        super(401, HttpHeaders.WWW_AUTHENTICATE);
    }

    @Override // o.AbstractC59697zlt
    public java.util.Collection<java.lang.String> OLrzqt(RequestConfig requestConfig) {
        return requestConfig.getTargetPreferredAuthSchemes();
    }
}

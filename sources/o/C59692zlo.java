package o;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;

/* JADX INFO: renamed from: o.zlo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59692zlo implements AuthenticationStrategy {
    public final InterfaceC59499ziG AEQbTJ = LogFactory.copydefault(getClass());
    public final AuthenticationHandler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthenticationHandler KWHzl() {
        return this.copydefault;
    }

    public C59692zlo(AuthenticationHandler authenticationHandler) {
        this.copydefault = authenticationHandler;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public boolean isAuthenticationRequested(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        return this.copydefault.isAuthenticationRequested(interfaceC59584zjm, interfaceC59838zob);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public java.util.Map<java.lang.String, InterfaceC59518ziZ> getChallenges(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        return this.copydefault.getChallenges(interfaceC59584zjm, interfaceC59838zob);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public Queue<C59590zjs> select(java.util.Map<java.lang.String, InterfaceC59518ziZ> map, HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        C59851zoo.AEQbTJ(map, "Map of auth challenges");
        C59851zoo.AEQbTJ(httpHost, "Host");
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        LinkedList linkedList = new LinkedList();
        CredentialsProvider credentialsProvider = (CredentialsProvider) interfaceC59838zob.getAttribute("http.auth.credentials-provider");
        if (credentialsProvider == null) {
            this.AEQbTJ.debug("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            InterfaceC59588zjq interfaceC59588zjqSelectScheme = this.copydefault.selectScheme(map, interfaceC59584zjm, interfaceC59838zob);
            interfaceC59588zjqSelectScheme.processChallenge(map.get(interfaceC59588zjqSelectScheme.getSchemeName().toLowerCase(java.util.Locale.ROOT)));
            InterfaceC59597zjz credentials = credentialsProvider.getCredentials(new C59596zjy(httpHost.getHostName(), httpHost.getPort(), interfaceC59588zjqSelectScheme.getRealm(), interfaceC59588zjqSelectScheme.getSchemeName()));
            if (credentials != null) {
                linkedList.add(new C59590zjs(interfaceC59588zjqSelectScheme, credentials));
            }
            return linkedList;
        } catch (AuthenticationException e) {
            if (this.AEQbTJ.isWarnEnabled()) {
                this.AEQbTJ.warn(e.getMessage(), e);
            }
            return linkedList;
        }
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authSucceeded(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        AuthCache c59695zlr = (AuthCache) interfaceC59838zob.getAttribute("http.auth.auth-cache");
        if (AEQbTJ(interfaceC59588zjq)) {
            if (c59695zlr == null) {
                c59695zlr = new C59695zlr();
                interfaceC59838zob.setAttribute("http.auth.auth-cache", c59695zlr);
            }
            if (this.AEQbTJ.isDebugEnabled()) {
                this.AEQbTJ.debug("Caching '" + interfaceC59588zjq.getSchemeName() + "' auth scheme for " + httpHost);
            }
            c59695zlr.put(httpHost, interfaceC59588zjq);
        }
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authFailed(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        AuthCache authCache = (AuthCache) interfaceC59838zob.getAttribute("http.auth.auth-cache");
        if (authCache == null) {
            return;
        }
        if (this.AEQbTJ.isDebugEnabled()) {
            this.AEQbTJ.debug("Removing from cache '" + interfaceC59588zjq.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }

    private boolean AEQbTJ(InterfaceC59588zjq interfaceC59588zjq) {
        if (interfaceC59588zjq == null || !interfaceC59588zjq.isComplete()) {
            return false;
        }
        return interfaceC59588zjq.getSchemeName().equalsIgnoreCase("Basic");
    }
}

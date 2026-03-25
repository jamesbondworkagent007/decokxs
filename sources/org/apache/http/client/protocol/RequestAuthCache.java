package org.apache.http.client.protocol;

import java.io.IOException;
import o.C59593zjv;
import o.C59596zjy;
import o.C59851zoo;
import o.InterfaceC59499ziG;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59588zjq;
import o.InterfaceC59597zjz;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: loaded from: classes13.dex */
public class RequestAuthCache implements InterfaceC59580zji {
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        InterfaceC59588zjq interfaceC59588zjq;
        InterfaceC59588zjq interfaceC59588zjq2;
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        AuthCache authCache = httpClientContextAdapt.getAuthCache();
        if (authCache == null) {
            this.log.debug("Auth cache not set in the context");
            return;
        }
        CredentialsProvider credentialsProvider = httpClientContextAdapt.getCredentialsProvider();
        if (credentialsProvider == null) {
            this.log.debug("Credentials provider not set in the context");
            return;
        }
        RouteInfo httpRoute = httpClientContextAdapt.getHttpRoute();
        if (httpRoute == null) {
            this.log.debug("Route info not set in the context");
            return;
        }
        HttpHost targetHost = httpClientContextAdapt.getTargetHost();
        if (targetHost == null) {
            this.log.debug("Target host not set in the context");
            return;
        }
        if (targetHost.getPort() < 0) {
            targetHost = new HttpHost(targetHost.getHostName(), httpRoute.copydefault().getPort(), targetHost.getSchemeName());
        }
        C59593zjv targetAuthState = httpClientContextAdapt.getTargetAuthState();
        if (targetAuthState != null && targetAuthState.copydefault() == AuthProtocolState.UNCHALLENGED && (interfaceC59588zjq2 = authCache.get(targetHost)) != null) {
            doPreemptiveAuth(targetHost, interfaceC59588zjq2, targetAuthState, credentialsProvider);
        }
        HttpHost httpHostEZpvd = httpRoute.EZpvd();
        C59593zjv proxyAuthState = httpClientContextAdapt.getProxyAuthState();
        if (httpHostEZpvd == null || proxyAuthState == null || proxyAuthState.copydefault() != AuthProtocolState.UNCHALLENGED || (interfaceC59588zjq = authCache.get(httpHostEZpvd)) == null) {
            return;
        }
        doPreemptiveAuth(httpHostEZpvd, interfaceC59588zjq, proxyAuthState, credentialsProvider);
    }

    private void doPreemptiveAuth(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, C59593zjv c59593zjv, CredentialsProvider credentialsProvider) {
        String schemeName = interfaceC59588zjq.getSchemeName();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Re-using cached '" + schemeName + "' auth scheme for " + httpHost);
        }
        InterfaceC59597zjz credentials = credentialsProvider.getCredentials(new C59596zjy(httpHost, C59596zjy.EZpvd, schemeName));
        if (credentials != null) {
            c59593zjv.AEQbTJ(interfaceC59588zjq, credentials);
        } else {
            this.log.debug("No credentials for preemptive authentication");
        }
    }
}

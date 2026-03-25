package org.apache.http.client.params;

import java.net.InetAddress;
import java.util.Collection;
import o.InterfaceC59779znV;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public final class HttpClientParamConfig {
    private HttpClientParamConfig() {
    }

    public static RequestConfig getRequestConfig(InterfaceC59779znV interfaceC59779znV) {
        return getRequestConfig(interfaceC59779znV, RequestConfig.DEFAULT);
    }

    public static RequestConfig getRequestConfig(InterfaceC59779znV interfaceC59779znV, RequestConfig requestConfig) {
        RequestConfig.Builder relativeRedirectsAllowed = RequestConfig.copy(requestConfig).setSocketTimeout(interfaceC59779znV.getIntParameter("http.socket.timeout", requestConfig.getSocketTimeout())).setStaleConnectionCheckEnabled(interfaceC59779znV.getBooleanParameter("http.connection.stalecheck", requestConfig.isStaleConnectionCheckEnabled())).setConnectTimeout(interfaceC59779znV.getIntParameter("http.connection.timeout", requestConfig.getConnectTimeout())).setExpectContinueEnabled(interfaceC59779znV.getBooleanParameter("http.protocol.expect-continue", requestConfig.isExpectContinueEnabled())).setAuthenticationEnabled(interfaceC59779znV.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, requestConfig.isAuthenticationEnabled())).setCircularRedirectsAllowed(interfaceC59779znV.getBooleanParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, requestConfig.isCircularRedirectsAllowed())).setConnectionRequestTimeout((int) interfaceC59779znV.getLongParameter(ClientPNames.CONN_MANAGER_TIMEOUT, requestConfig.getConnectionRequestTimeout())).setMaxRedirects(interfaceC59779znV.getIntParameter(ClientPNames.MAX_REDIRECTS, requestConfig.getMaxRedirects())).setRedirectsEnabled(interfaceC59779znV.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, requestConfig.isRedirectsEnabled())).setRelativeRedirectsAllowed(!interfaceC59779znV.getBooleanParameter(ClientPNames.REJECT_RELATIVE_REDIRECT, !requestConfig.isRelativeRedirectsAllowed()));
        HttpHost httpHost = (HttpHost) interfaceC59779znV.getParameter("http.route.default-proxy");
        if (httpHost != null) {
            relativeRedirectsAllowed.setProxy(httpHost);
        }
        InetAddress inetAddress = (InetAddress) interfaceC59779znV.getParameter("http.route.local-address");
        if (inetAddress != null) {
            relativeRedirectsAllowed.setLocalAddress(inetAddress);
        }
        Collection<String> collection = (Collection) interfaceC59779znV.getParameter("http.auth.target-scheme-pref");
        if (collection != null) {
            relativeRedirectsAllowed.setTargetPreferredAuthSchemes(collection);
        }
        Collection<String> collection2 = (Collection) interfaceC59779znV.getParameter("http.auth.proxy-scheme-pref");
        if (collection2 != null) {
            relativeRedirectsAllowed.setProxyPreferredAuthSchemes(collection2);
        }
        String str = (String) interfaceC59779znV.getParameter(ClientPNames.COOKIE_POLICY);
        if (str != null) {
            relativeRedirectsAllowed.setCookieSpec(str);
        }
        return relativeRedirectsAllowed.build();
    }
}

package org.apache.http.client.protocol;

import java.net.URI;
import java.util.List;
import o.C59570zjY;
import o.C59593zjv;
import o.C59602zkD;
import o.C59782znY;
import o.C59840zod;
import o.InterfaceC59548zjC;
import o.InterfaceC59594zjw;
import o.InterfaceC59605zkG;
import o.InterfaceC59607zkI;
import o.InterfaceC59838zob;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: loaded from: classes13.dex */
public class HttpClientContext extends C59840zod {
    public static final String AUTHSCHEME_REGISTRY = "http.authscheme-registry";
    public static final String AUTH_CACHE = "http.auth.auth-cache";
    public static final String COOKIESPEC_REGISTRY = "http.cookiespec-registry";
    public static final String COOKIE_ORIGIN = "http.cookie-origin";
    public static final String COOKIE_SPEC = "http.cookie-spec";
    public static final String COOKIE_STORE = "http.cookie-store";
    public static final String CREDS_PROVIDER = "http.auth.credentials-provider";
    public static final String HTTP_ROUTE = "http.route";
    public static final String PROXY_AUTH_STATE = "http.auth.proxy-scope";
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public static final String REQUEST_CONFIG = "http.request-config";
    public static final String TARGET_AUTH_STATE = "http.auth.target-scope";
    public static final String USER_TOKEN = "http.user-token";

    public static HttpClientContext adapt(InterfaceC59838zob interfaceC59838zob) {
        if (interfaceC59838zob instanceof HttpClientContext) {
            return (HttpClientContext) interfaceC59838zob;
        }
        return new HttpClientContext(interfaceC59838zob);
    }

    public static HttpClientContext create() {
        return new HttpClientContext(new C59782znY());
    }

    public HttpClientContext(InterfaceC59838zob interfaceC59838zob) {
        super(interfaceC59838zob);
    }

    public HttpClientContext() {
    }

    public RouteInfo getHttpRoute() {
        return (RouteInfo) getAttribute("http.route", C59570zjY.class);
    }

    public List<URI> getRedirectLocations() {
        return (List) getAttribute(REDIRECT_LOCATIONS, List.class);
    }

    public CookieStore getCookieStore() {
        return (CookieStore) getAttribute("http.cookie-store", CookieStore.class);
    }

    public void setCookieStore(CookieStore cookieStore) {
        setAttribute("http.cookie-store", cookieStore);
    }

    public InterfaceC59605zkG getCookieSpec() {
        return (InterfaceC59605zkG) getAttribute("http.cookie-spec", InterfaceC59605zkG.class);
    }

    public C59602zkD getCookieOrigin() {
        return (C59602zkD) getAttribute("http.cookie-origin", C59602zkD.class);
    }

    private <T> InterfaceC59548zjC<T> getLookup(String str, Class<T> cls) {
        return (InterfaceC59548zjC) getAttribute(str, InterfaceC59548zjC.class);
    }

    public InterfaceC59548zjC<InterfaceC59607zkI> getCookieSpecRegistry() {
        return getLookup("http.cookiespec-registry", InterfaceC59607zkI.class);
    }

    public void setCookieSpecRegistry(InterfaceC59548zjC<InterfaceC59607zkI> interfaceC59548zjC) {
        setAttribute("http.cookiespec-registry", interfaceC59548zjC);
    }

    public InterfaceC59548zjC<InterfaceC59594zjw> getAuthSchemeRegistry() {
        return getLookup("http.authscheme-registry", InterfaceC59594zjw.class);
    }

    public void setAuthSchemeRegistry(InterfaceC59548zjC<InterfaceC59594zjw> interfaceC59548zjC) {
        setAttribute("http.authscheme-registry", interfaceC59548zjC);
    }

    public CredentialsProvider getCredentialsProvider() {
        return (CredentialsProvider) getAttribute("http.auth.credentials-provider", CredentialsProvider.class);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        setAttribute("http.auth.credentials-provider", credentialsProvider);
    }

    public AuthCache getAuthCache() {
        return (AuthCache) getAttribute("http.auth.auth-cache", AuthCache.class);
    }

    public void setAuthCache(AuthCache authCache) {
        setAttribute("http.auth.auth-cache", authCache);
    }

    public C59593zjv getTargetAuthState() {
        return (C59593zjv) getAttribute("http.auth.target-scope", C59593zjv.class);
    }

    public C59593zjv getProxyAuthState() {
        return (C59593zjv) getAttribute("http.auth.proxy-scope", C59593zjv.class);
    }

    public <T> T getUserToken(Class<T> cls) {
        return (T) getAttribute("http.user-token", cls);
    }

    public Object getUserToken() {
        return getAttribute("http.user-token");
    }

    public void setUserToken(Object obj) {
        setAttribute("http.user-token", obj);
    }

    public RequestConfig getRequestConfig() {
        RequestConfig requestConfig = (RequestConfig) getAttribute("http.request-config", RequestConfig.class);
        return requestConfig != null ? requestConfig : RequestConfig.DEFAULT;
    }

    public void setRequestConfig(RequestConfig requestConfig) {
        setAttribute("http.request-config", requestConfig);
    }
}

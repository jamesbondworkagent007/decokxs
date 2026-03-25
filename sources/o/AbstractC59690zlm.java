package o;

import java.lang.reflect.UndeclaredThrowableException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;

/* JADX INFO: renamed from: o.zlm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59690zlm extends AbstractC59694zlq {
    private BackoffManager backoffManager;
    private InterfaceC59551zjF connManager;
    private ConnectionBackoffStrategy connectionBackoffStrategy;
    private CookieStore cookieStore;
    private CredentialsProvider credsProvider;
    private InterfaceC59779znV defaultParams;
    private InterfaceC59557zjL keepAliveStrategy;
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());
    private C59783znZ mutableProcessor;
    private C59846zoj protocolProcessor;
    private AuthenticationStrategy proxyAuthStrategy;
    private RedirectStrategy redirectStrategy;
    private C59844zoh requestExec;
    private HttpRequestRetryHandler retryHandler;
    private InterfaceC59515ziW reuseStrategy;
    private InterfaceC59625zka routePlanner;
    private C59595zjx supportedAuthSchemes;
    private C59610zkL supportedCookieSpecs;
    private AuthenticationStrategy targetAuthStrategy;
    private UserTokenHandler userTokenHandler;

    public abstract InterfaceC59779znV createHttpParams();

    public abstract C59783znZ createHttpProcessor();

    public AbstractC59690zlm(InterfaceC59551zjF interfaceC59551zjF, InterfaceC59779znV interfaceC59779znV) {
        this.defaultParams = interfaceC59779znV;
        this.connManager = interfaceC59551zjF;
    }

    public InterfaceC59838zob createHttpContext() {
        C59782znY c59782znY = new C59782znY();
        c59782znY.setAttribute(ClientContext.SCHEME_REGISTRY, getConnectionManager().AEQbTJ());
        c59782znY.setAttribute("http.authscheme-registry", getAuthSchemes());
        c59782znY.setAttribute("http.cookiespec-registry", getCookieSpecs());
        c59782znY.setAttribute("http.cookie-store", getCookieStore());
        c59782znY.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return c59782znY;
    }

    public InterfaceC59551zjF createClientConnectionManager() {
        java.lang.Class<?> cls;
        InterfaceC59550zjE interfaceC59550zjE;
        C59636zkl c59636zklEZpvd = C59732zmb.EZpvd();
        InterfaceC59779znV params = getParams();
        java.lang.String str = (java.lang.String) params.getParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME);
        java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        if (str != null) {
            try {
                if (contextClassLoader != null) {
                    cls = java.lang.Class.forName(str, true, contextClassLoader);
                } else {
                    cls = java.lang.Class.forName(str);
                }
                interfaceC59550zjE = (InterfaceC59550zjE) cls.newInstance();
            } catch (java.lang.ClassNotFoundException unused) {
                throw new java.lang.IllegalStateException("Invalid class name: " + str);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.IllegalAccessError(e.getMessage());
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.InstantiationError(e2.getMessage());
            }
        } else {
            interfaceC59550zjE = null;
        }
        if (interfaceC59550zjE != null) {
            return interfaceC59550zjE.OLrzqt(params, c59636zklEZpvd);
        }
        return new C59667zlP(c59636zklEZpvd);
    }

    public C59595zjx createAuthSchemeRegistry() {
        C59595zjx c59595zjx = new C59595zjx();
        c59595zjx.KWHzl("Basic", new C59679zlb());
        c59595zjx.KWHzl("Digest", new C59680zlc());
        c59595zjx.KWHzl("NTLM", new C59684zlg());
        c59595zjx.KWHzl("Negotiate", new C59691zln());
        c59595zjx.KWHzl("Kerberos", new C59686zli());
        return c59595zjx;
    }

    public C59610zkL createCookieSpecRegistry() {
        C59610zkL c59610zkL = new C59610zkL();
        c59610zkL.copydefault("default", new C59751zmu());
        c59610zkL.copydefault("best-match", new C59751zmu());
        c59610zkL.copydefault("compatibility", new BrowserCompatSpecFactory());
        c59610zkL.copydefault("netscape", new C59716zmL());
        c59610zkL.copydefault(CookiePolicy.RFC_2109, new C59720zmP());
        c59610zkL.copydefault(CookiePolicy.RFC_2965, new C59725zmU());
        c59610zkL.copydefault("ignoreCookies", new C59710zmF());
        return c59610zkL;
    }

    public C59844zoh createRequestExecutor() {
        return new C59844zoh();
    }

    public InterfaceC59515ziW createConnectionReuseStrategy() {
        return new C59678zla();
    }

    public InterfaceC59557zjL createConnectionKeepAliveStrategy() {
        return new C59699zlv();
    }

    public HttpRequestRetryHandler createHttpRequestRetryHandler() {
        return new C59700zlw();
    }

    @java.lang.Deprecated
    public RedirectHandler createRedirectHandler() {
        return new C59655zlD();
    }

    public AuthenticationStrategy createTargetAuthenticationStrategy() {
        return new C59663zlL();
    }

    @java.lang.Deprecated
    public AuthenticationHandler createTargetAuthenticationHandler() {
        return new C59654zlC();
    }

    public AuthenticationStrategy createProxyAuthenticationStrategy() {
        return new C59660zlI();
    }

    @java.lang.Deprecated
    public AuthenticationHandler createProxyAuthenticationHandler() {
        return new C59701zlx();
    }

    public CookieStore createCookieStore() {
        return new BasicCookieStore();
    }

    public CredentialsProvider createCredentialsProvider() {
        return new C59698zlu();
    }

    public InterfaceC59625zka createHttpRoutePlanner() {
        return new C59673zlV(getConnectionManager().AEQbTJ());
    }

    public UserTokenHandler createUserTokenHandler() {
        return new C59657zlF();
    }

    @Override // org.apache.http.client.HttpClient
    public final InterfaceC59779znV getParams() {
        InterfaceC59779znV interfaceC59779znV;
        synchronized (this) {
            if (this.defaultParams == null) {
                this.defaultParams = createHttpParams();
            }
            interfaceC59779znV = this.defaultParams;
        }
        return interfaceC59779znV;
    }

    public void setParams(InterfaceC59779znV interfaceC59779znV) {
        synchronized (this) {
            this.defaultParams = interfaceC59779znV;
        }
    }

    @Override // org.apache.http.client.HttpClient
    public final InterfaceC59551zjF getConnectionManager() {
        InterfaceC59551zjF interfaceC59551zjF;
        synchronized (this) {
            if (this.connManager == null) {
                this.connManager = createClientConnectionManager();
            }
            interfaceC59551zjF = this.connManager;
        }
        return interfaceC59551zjF;
    }

    public final C59844zoh getRequestExecutor() {
        C59844zoh c59844zoh;
        synchronized (this) {
            if (this.requestExec == null) {
                this.requestExec = createRequestExecutor();
            }
            c59844zoh = this.requestExec;
        }
        return c59844zoh;
    }

    public final C59595zjx getAuthSchemes() {
        C59595zjx c59595zjx;
        synchronized (this) {
            if (this.supportedAuthSchemes == null) {
                this.supportedAuthSchemes = createAuthSchemeRegistry();
            }
            c59595zjx = this.supportedAuthSchemes;
        }
        return c59595zjx;
    }

    public void setAuthSchemes(C59595zjx c59595zjx) {
        synchronized (this) {
            this.supportedAuthSchemes = c59595zjx;
        }
    }

    public final ConnectionBackoffStrategy getConnectionBackoffStrategy() {
        ConnectionBackoffStrategy connectionBackoffStrategy;
        synchronized (this) {
            connectionBackoffStrategy = this.connectionBackoffStrategy;
        }
        return connectionBackoffStrategy;
    }

    public void setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy) {
        synchronized (this) {
            this.connectionBackoffStrategy = connectionBackoffStrategy;
        }
    }

    public final C59610zkL getCookieSpecs() {
        C59610zkL c59610zkL;
        synchronized (this) {
            if (this.supportedCookieSpecs == null) {
                this.supportedCookieSpecs = createCookieSpecRegistry();
            }
            c59610zkL = this.supportedCookieSpecs;
        }
        return c59610zkL;
    }

    public final BackoffManager getBackoffManager() {
        BackoffManager backoffManager;
        synchronized (this) {
            backoffManager = this.backoffManager;
        }
        return backoffManager;
    }

    public void setBackoffManager(BackoffManager backoffManager) {
        synchronized (this) {
            this.backoffManager = backoffManager;
        }
    }

    public void setCookieSpecs(C59610zkL c59610zkL) {
        synchronized (this) {
            this.supportedCookieSpecs = c59610zkL;
        }
    }

    public final InterfaceC59515ziW getConnectionReuseStrategy() {
        InterfaceC59515ziW interfaceC59515ziW;
        synchronized (this) {
            if (this.reuseStrategy == null) {
                this.reuseStrategy = createConnectionReuseStrategy();
            }
            interfaceC59515ziW = this.reuseStrategy;
        }
        return interfaceC59515ziW;
    }

    public void setReuseStrategy(InterfaceC59515ziW interfaceC59515ziW) {
        synchronized (this) {
            this.reuseStrategy = interfaceC59515ziW;
        }
    }

    public final InterfaceC59557zjL getConnectionKeepAliveStrategy() {
        InterfaceC59557zjL interfaceC59557zjL;
        synchronized (this) {
            if (this.keepAliveStrategy == null) {
                this.keepAliveStrategy = createConnectionKeepAliveStrategy();
            }
            interfaceC59557zjL = this.keepAliveStrategy;
        }
        return interfaceC59557zjL;
    }

    public void setKeepAliveStrategy(InterfaceC59557zjL interfaceC59557zjL) {
        synchronized (this) {
            this.keepAliveStrategy = interfaceC59557zjL;
        }
    }

    public final HttpRequestRetryHandler getHttpRequestRetryHandler() {
        HttpRequestRetryHandler httpRequestRetryHandler;
        synchronized (this) {
            if (this.retryHandler == null) {
                this.retryHandler = createHttpRequestRetryHandler();
            }
            httpRequestRetryHandler = this.retryHandler;
        }
        return httpRequestRetryHandler;
    }

    public void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        synchronized (this) {
            this.retryHandler = httpRequestRetryHandler;
        }
    }

    @java.lang.Deprecated
    public final RedirectHandler getRedirectHandler() {
        RedirectHandler redirectHandlerCreateRedirectHandler;
        synchronized (this) {
            redirectHandlerCreateRedirectHandler = createRedirectHandler();
        }
        return redirectHandlerCreateRedirectHandler;
    }

    @java.lang.Deprecated
    public void setRedirectHandler(RedirectHandler redirectHandler) {
        synchronized (this) {
            this.redirectStrategy = new C59652zlA(redirectHandler);
        }
    }

    public final RedirectStrategy getRedirectStrategy() {
        RedirectStrategy redirectStrategy;
        synchronized (this) {
            if (this.redirectStrategy == null) {
                this.redirectStrategy = new C59653zlB();
            }
            redirectStrategy = this.redirectStrategy;
        }
        return redirectStrategy;
    }

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        synchronized (this) {
            this.redirectStrategy = redirectStrategy;
        }
    }

    @java.lang.Deprecated
    public final AuthenticationHandler getTargetAuthenticationHandler() {
        AuthenticationHandler authenticationHandlerCreateTargetAuthenticationHandler;
        synchronized (this) {
            authenticationHandlerCreateTargetAuthenticationHandler = createTargetAuthenticationHandler();
        }
        return authenticationHandlerCreateTargetAuthenticationHandler;
    }

    @java.lang.Deprecated
    public void setTargetAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        synchronized (this) {
            this.targetAuthStrategy = new C59692zlo(authenticationHandler);
        }
    }

    public final AuthenticationStrategy getTargetAuthenticationStrategy() {
        AuthenticationStrategy authenticationStrategy;
        synchronized (this) {
            if (this.targetAuthStrategy == null) {
                this.targetAuthStrategy = createTargetAuthenticationStrategy();
            }
            authenticationStrategy = this.targetAuthStrategy;
        }
        return authenticationStrategy;
    }

    public void setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        synchronized (this) {
            this.targetAuthStrategy = authenticationStrategy;
        }
    }

    @java.lang.Deprecated
    public final AuthenticationHandler getProxyAuthenticationHandler() {
        AuthenticationHandler authenticationHandlerCreateProxyAuthenticationHandler;
        synchronized (this) {
            authenticationHandlerCreateProxyAuthenticationHandler = createProxyAuthenticationHandler();
        }
        return authenticationHandlerCreateProxyAuthenticationHandler;
    }

    @java.lang.Deprecated
    public void setProxyAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        synchronized (this) {
            this.proxyAuthStrategy = new C59692zlo(authenticationHandler);
        }
    }

    public final AuthenticationStrategy getProxyAuthenticationStrategy() {
        AuthenticationStrategy authenticationStrategy;
        synchronized (this) {
            if (this.proxyAuthStrategy == null) {
                this.proxyAuthStrategy = createProxyAuthenticationStrategy();
            }
            authenticationStrategy = this.proxyAuthStrategy;
        }
        return authenticationStrategy;
    }

    public void setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        synchronized (this) {
            this.proxyAuthStrategy = authenticationStrategy;
        }
    }

    public final CookieStore getCookieStore() {
        CookieStore cookieStore;
        synchronized (this) {
            if (this.cookieStore == null) {
                this.cookieStore = createCookieStore();
            }
            cookieStore = this.cookieStore;
        }
        return cookieStore;
    }

    public void setCookieStore(CookieStore cookieStore) {
        synchronized (this) {
            this.cookieStore = cookieStore;
        }
    }

    public final CredentialsProvider getCredentialsProvider() {
        CredentialsProvider credentialsProvider;
        synchronized (this) {
            if (this.credsProvider == null) {
                this.credsProvider = createCredentialsProvider();
            }
            credentialsProvider = this.credsProvider;
        }
        return credentialsProvider;
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        synchronized (this) {
            this.credsProvider = credentialsProvider;
        }
    }

    public final InterfaceC59625zka getRoutePlanner() {
        InterfaceC59625zka interfaceC59625zka;
        synchronized (this) {
            if (this.routePlanner == null) {
                this.routePlanner = createHttpRoutePlanner();
            }
            interfaceC59625zka = this.routePlanner;
        }
        return interfaceC59625zka;
    }

    public void setRoutePlanner(InterfaceC59625zka interfaceC59625zka) {
        synchronized (this) {
            this.routePlanner = interfaceC59625zka;
        }
    }

    public final UserTokenHandler getUserTokenHandler() {
        UserTokenHandler userTokenHandler;
        synchronized (this) {
            if (this.userTokenHandler == null) {
                this.userTokenHandler = createUserTokenHandler();
            }
            userTokenHandler = this.userTokenHandler;
        }
        return userTokenHandler;
    }

    public void setUserTokenHandler(UserTokenHandler userTokenHandler) {
        synchronized (this) {
            this.userTokenHandler = userTokenHandler;
        }
    }

    public final C59783znZ getHttpProcessor() {
        C59783znZ c59783znZ;
        synchronized (this) {
            if (this.mutableProcessor == null) {
                this.mutableProcessor = createHttpProcessor();
            }
            c59783znZ = this.mutableProcessor;
        }
        return c59783znZ;
    }

    public final InterfaceC59837zoa getProtocolProcessor() {
        C59846zoj c59846zoj;
        synchronized (this) {
            if (this.protocolProcessor == null) {
                C59783znZ httpProcessor = getHttpProcessor();
                int iEZpvd = httpProcessor.EZpvd();
                InterfaceC59580zji[] interfaceC59580zjiArr = new InterfaceC59580zji[iEZpvd];
                for (int i = 0; i < iEZpvd; i++) {
                    interfaceC59580zjiArr[i] = httpProcessor.KWHzl(i);
                }
                int iOLrzqt = httpProcessor.OLrzqt();
                InterfaceC59585zjn[] interfaceC59585zjnArr = new InterfaceC59585zjn[iOLrzqt];
                for (int i2 = 0; i2 < iOLrzqt; i2++) {
                    interfaceC59585zjnArr[i2] = httpProcessor.OLrzqt(i2);
                }
                this.protocolProcessor = new C59846zoj(interfaceC59580zjiArr, interfaceC59585zjnArr);
            }
            c59846zoj = this.protocolProcessor;
        }
        return c59846zoj;
    }

    public int getResponseInterceptorCount() {
        int iOLrzqt;
        synchronized (this) {
            iOLrzqt = getHttpProcessor().OLrzqt();
        }
        return iOLrzqt;
    }

    public InterfaceC59585zjn getResponseInterceptor(int i) {
        InterfaceC59585zjn interfaceC59585zjnOLrzqt;
        synchronized (this) {
            interfaceC59585zjnOLrzqt = getHttpProcessor().OLrzqt(i);
        }
        return interfaceC59585zjnOLrzqt;
    }

    public InterfaceC59580zji getRequestInterceptor(int i) {
        InterfaceC59580zji interfaceC59580zjiKWHzl;
        synchronized (this) {
            interfaceC59580zjiKWHzl = getHttpProcessor().KWHzl(i);
        }
        return interfaceC59580zjiKWHzl;
    }

    public int getRequestInterceptorCount() {
        int iEZpvd;
        synchronized (this) {
            iEZpvd = getHttpProcessor().EZpvd();
        }
        return iEZpvd;
    }

    public void addResponseInterceptor(InterfaceC59585zjn interfaceC59585zjn) {
        synchronized (this) {
            getHttpProcessor().AEQbTJ(interfaceC59585zjn);
            this.protocolProcessor = null;
        }
    }

    public void addResponseInterceptor(InterfaceC59585zjn interfaceC59585zjn, int i) {
        synchronized (this) {
            getHttpProcessor().AEQbTJ(interfaceC59585zjn, i);
            this.protocolProcessor = null;
        }
    }

    public void clearResponseInterceptors() {
        synchronized (this) {
            getHttpProcessor().KWHzl();
            this.protocolProcessor = null;
        }
    }

    public void removeResponseInterceptorByClass(java.lang.Class<? extends InterfaceC59585zjn> cls) {
        synchronized (this) {
            getHttpProcessor().KWHzl(cls);
            this.protocolProcessor = null;
        }
    }

    public void addRequestInterceptor(InterfaceC59580zji interfaceC59580zji) {
        synchronized (this) {
            getHttpProcessor().copydefault(interfaceC59580zji);
            this.protocolProcessor = null;
        }
    }

    public void addRequestInterceptor(InterfaceC59580zji interfaceC59580zji, int i) {
        synchronized (this) {
            getHttpProcessor().copydefault(interfaceC59580zji, i);
            this.protocolProcessor = null;
        }
    }

    public void clearRequestInterceptors() {
        synchronized (this) {
            getHttpProcessor().copydefault();
            this.protocolProcessor = null;
        }
    }

    public void removeRequestInterceptorByClass(java.lang.Class<? extends InterfaceC59580zji> cls) {
        synchronized (this) {
            getHttpProcessor().copydefault(cls);
            this.protocolProcessor = null;
        }
    }

    @Override // o.AbstractC59694zlq
    public final CloseableHttpResponse doExecute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws java.io.IOException {
        InterfaceC59838zob interfaceC59838zob2;
        RequestDirector requestDirectorCreateClientRequestDirector;
        InterfaceC59625zka routePlanner;
        ConnectionBackoffStrategy connectionBackoffStrategy;
        BackoffManager backoffManager;
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        synchronized (this) {
            InterfaceC59838zob interfaceC59838zobCreateHttpContext = createHttpContext();
            InterfaceC59838zob c59839zoc = interfaceC59838zob == null ? interfaceC59838zobCreateHttpContext : new C59839zoc(interfaceC59838zob, interfaceC59838zobCreateHttpContext);
            InterfaceC59779znV interfaceC59779znVDetermineParams = determineParams(interfaceC59577zjf);
            c59839zoc.setAttribute("http.request-config", HttpClientParamConfig.getRequestConfig(interfaceC59779znVDetermineParams));
            interfaceC59838zob2 = c59839zoc;
            requestDirectorCreateClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), getProtocolProcessor(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), interfaceC59779znVDetermineParams);
            routePlanner = getRoutePlanner();
            connectionBackoffStrategy = getConnectionBackoffStrategy();
            backoffManager = getBackoffManager();
        }
        try {
            if (connectionBackoffStrategy != null && backoffManager != null) {
                C59570zjY c59570zjYOLrzqt = routePlanner.OLrzqt(httpHost != null ? httpHost : (HttpHost) determineParams(interfaceC59577zjf).getParameter(ClientPNames.DEFAULT_HOST), interfaceC59577zjf, interfaceC59838zob2);
                try {
                    CloseableHttpResponse closeableHttpResponseAEQbTJ = C59703zlz.AEQbTJ(requestDirectorCreateClientRequestDirector.execute(httpHost, interfaceC59577zjf, interfaceC59838zob2));
                    if (connectionBackoffStrategy.shouldBackoff(closeableHttpResponseAEQbTJ)) {
                        backoffManager.backOff(c59570zjYOLrzqt);
                    } else {
                        backoffManager.probe(c59570zjYOLrzqt);
                    }
                    return closeableHttpResponseAEQbTJ;
                } catch (java.lang.RuntimeException e) {
                    if (connectionBackoffStrategy.shouldBackoff(e)) {
                        backoffManager.backOff(c59570zjYOLrzqt);
                    }
                    throw e;
                } catch (java.lang.Exception e2) {
                    if (connectionBackoffStrategy.shouldBackoff(e2)) {
                        backoffManager.backOff(c59570zjYOLrzqt);
                    }
                    if (e2 instanceof HttpException) {
                        throw ((HttpException) e2);
                    }
                    if (e2 instanceof java.io.IOException) {
                        throw ((java.io.IOException) e2);
                    }
                    throw new UndeclaredThrowableException(e2);
                }
            }
            return C59703zlz.AEQbTJ(requestDirectorCreateClientRequestDirector.execute(httpHost, interfaceC59577zjf, interfaceC59838zob2));
        } catch (HttpException e3) {
            throw new ClientProtocolException(e3);
        }
    }

    @java.lang.Deprecated
    public RequestDirector createClientRequestDirector(C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        return new C59656zlE(c59844zoh, interfaceC59551zjF, interfaceC59515ziW, interfaceC59557zjL, interfaceC59625zka, interfaceC59837zoa, httpRequestRetryHandler, redirectHandler, authenticationHandler, authenticationHandler2, userTokenHandler, interfaceC59779znV);
    }

    @java.lang.Deprecated
    public RequestDirector createClientRequestDirector(C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        return new C59656zlE(this.log, c59844zoh, interfaceC59551zjF, interfaceC59515ziW, interfaceC59557zjL, interfaceC59625zka, interfaceC59837zoa, httpRequestRetryHandler, redirectStrategy, authenticationHandler, authenticationHandler2, userTokenHandler, interfaceC59779znV);
    }

    public RequestDirector createClientRequestDirector(C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        return new C59656zlE(this.log, c59844zoh, interfaceC59551zjF, interfaceC59515ziW, interfaceC59557zjL, interfaceC59625zka, interfaceC59837zoa, httpRequestRetryHandler, redirectStrategy, authenticationStrategy, authenticationStrategy2, userTokenHandler, interfaceC59779znV);
    }

    public InterfaceC59779znV determineParams(InterfaceC59577zjf interfaceC59577zjf) {
        return new C59696zls(null, getParams(), interfaceC59577zjf.getParams(), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getConnectionManager().EZpvd();
    }
}

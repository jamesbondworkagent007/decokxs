package o;

import com.google.api.client.http.HttpMethods;
import java.net.URISyntaxException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.TunnelRefusedException;
import org.apache.http.impl.conn.ConnectionShutdownException;

/* JADX INFO: renamed from: o.zlE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59656zlE implements RequestDirector {
    public final C59659zlH AEQbTJ;
    public final int AYXKKw;
    public final InterfaceC59499ziG AhwBna;
    public int AkhnZx;
    public final InterfaceC59515ziW AuCTel;
    public final RedirectStrategy DbNXlk;
    public final InterfaceC59551zjF EZpvd;
    public final InterfaceC59837zoa KWHzl;
    public int OLrzqt;
    public final InterfaceC59557zjL copydefault;

    @java.lang.Deprecated
    public final AuthenticationHandler djBIcL;

    @java.lang.Deprecated
    public final AuthenticationHandler ejfBZ;
    public final HttpRequestRetryHandler fARcdN;
    public final InterfaceC59625zka fIwbmz;
    public final C59844zoh fJNWhG;
    public final C59593zjv fetchVPNInfo;
    public final InterfaceC59779znV gEmmrt;
    public HttpHost getFieldNames;
    public final UserTokenHandler getNewProxyInstance;
    public final AuthenticationStrategy hDKMBd;

    @java.lang.Deprecated
    public final RedirectHandler isConnected;
    public final C59593zjv uzCIH;
    public InterfaceC59560zjO valueOf;
    public final AuthenticationStrategy values;

    @java.lang.Deprecated
    public C59656zlE(C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        this(LogFactory.copydefault(C59656zlE.class), c59844zoh, interfaceC59551zjF, interfaceC59515ziW, interfaceC59557zjL, interfaceC59625zka, interfaceC59837zoa, httpRequestRetryHandler, new C59652zlA(redirectHandler), new C59692zlo(authenticationHandler), new C59692zlo(authenticationHandler2), userTokenHandler, interfaceC59779znV);
    }

    @java.lang.Deprecated
    public C59656zlE(InterfaceC59499ziG interfaceC59499ziG, C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        this(LogFactory.copydefault(C59656zlE.class), c59844zoh, interfaceC59551zjF, interfaceC59515ziW, interfaceC59557zjL, interfaceC59625zka, interfaceC59837zoa, httpRequestRetryHandler, redirectStrategy, new C59692zlo(authenticationHandler), new C59692zlo(authenticationHandler2), userTokenHandler, interfaceC59779znV);
    }

    public C59656zlE(InterfaceC59499ziG interfaceC59499ziG, C59844zoh c59844zoh, InterfaceC59551zjF interfaceC59551zjF, InterfaceC59515ziW interfaceC59515ziW, InterfaceC59557zjL interfaceC59557zjL, InterfaceC59625zka interfaceC59625zka, InterfaceC59837zoa interfaceC59837zoa, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59499ziG, "Log");
        C59851zoo.AEQbTJ(c59844zoh, "Request executor");
        C59851zoo.AEQbTJ(interfaceC59551zjF, "Client connection manager");
        C59851zoo.AEQbTJ(interfaceC59515ziW, "Connection reuse strategy");
        C59851zoo.AEQbTJ(interfaceC59557zjL, "Connection keep alive strategy");
        C59851zoo.AEQbTJ(interfaceC59625zka, "Route planner");
        C59851zoo.AEQbTJ(interfaceC59837zoa, "HTTP protocol processor");
        C59851zoo.AEQbTJ(httpRequestRetryHandler, "HTTP request retry handler");
        C59851zoo.AEQbTJ(redirectStrategy, "Redirect strategy");
        C59851zoo.AEQbTJ(authenticationStrategy, "Target authentication strategy");
        C59851zoo.AEQbTJ(authenticationStrategy2, "Proxy authentication strategy");
        C59851zoo.AEQbTJ(userTokenHandler, "User token handler");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        this.AhwBna = interfaceC59499ziG;
        this.AEQbTJ = new C59659zlH(interfaceC59499ziG);
        this.fJNWhG = c59844zoh;
        this.EZpvd = interfaceC59551zjF;
        this.AuCTel = interfaceC59515ziW;
        this.copydefault = interfaceC59557zjL;
        this.fIwbmz = interfaceC59625zka;
        this.KWHzl = interfaceC59837zoa;
        this.fARcdN = httpRequestRetryHandler;
        this.DbNXlk = redirectStrategy;
        this.hDKMBd = authenticationStrategy;
        this.values = authenticationStrategy2;
        this.getNewProxyInstance = userTokenHandler;
        this.gEmmrt = interfaceC59779znV;
        if (redirectStrategy instanceof C59652zlA) {
            this.isConnected = ((C59652zlA) redirectStrategy).AEQbTJ();
        } else {
            this.isConnected = null;
        }
        if (authenticationStrategy instanceof C59692zlo) {
            this.ejfBZ = ((C59692zlo) authenticationStrategy).KWHzl();
        } else {
            this.ejfBZ = null;
        }
        if (authenticationStrategy2 instanceof C59692zlo) {
            this.djBIcL = ((C59692zlo) authenticationStrategy2).KWHzl();
        } else {
            this.djBIcL = null;
        }
        this.valueOf = null;
        this.OLrzqt = 0;
        this.AkhnZx = 0;
        this.uzCIH = new C59593zjv();
        this.fetchVPNInfo = new C59593zjv();
        this.AYXKKw = interfaceC59779znV.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
    }

    public final C59666zlO KWHzl(InterfaceC59577zjf interfaceC59577zjf) throws ProtocolException {
        if (interfaceC59577zjf instanceof InterfaceC59578zjg) {
            return new C59658zlG((InterfaceC59578zjg) interfaceC59577zjf);
        }
        return new C59666zlO(interfaceC59577zjf);
    }

    public void copydefault(C59666zlO c59666zlO, C59570zjY c59570zjY) throws ProtocolException {
        java.net.URI uriRewriteURI;
        try {
            java.net.URI uri = c59666zlO.getURI();
            if (c59570zjY.EZpvd() != null && !c59570zjY.gEmmrt()) {
                if (!uri.isAbsolute()) {
                    uriRewriteURI = URIUtils.rewriteURI(uri, c59570zjY.copydefault(), true);
                } else {
                    uriRewriteURI = URIUtils.rewriteURI(uri);
                }
            } else if (uri.isAbsolute()) {
                uriRewriteURI = URIUtils.rewriteURI(uri, null, true);
            } else {
                uriRewriteURI = URIUtils.rewriteURI(uri);
            }
            c59666zlO.OLrzqt(uriRewriteURI);
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + c59666zlO.getRequestLine().getUri(), e);
        }
    }

    @Override // org.apache.http.client.RequestDirector
    public InterfaceC59584zjm execute(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        java.lang.String str;
        interfaceC59838zob.setAttribute("http.auth.target-scope", this.uzCIH);
        interfaceC59838zob.setAttribute("http.auth.proxy-scope", this.fetchVPNInfo);
        C59666zlO c59666zlOKWHzl = KWHzl(interfaceC59577zjf);
        c59666zlOKWHzl.setParams(this.gEmmrt);
        C59570zjY c59570zjYEZpvd = EZpvd(httpHost, c59666zlOKWHzl, interfaceC59838zob);
        HttpHost httpHost2 = (HttpHost) c59666zlOKWHzl.getParams().getParameter(ClientPNames.VIRTUAL_HOST);
        this.getFieldNames = httpHost2;
        if (httpHost2 != null && httpHost2.getPort() == -1) {
            int port = (httpHost != null ? httpHost : c59570zjYEZpvd.copydefault()).getPort();
            if (port != -1) {
                this.getFieldNames = new HttpHost(this.getFieldNames.getHostName(), port, this.getFieldNames.getSchemeName());
            }
        }
        C59665zlN c59665zlN = new C59665zlN(c59666zlOKWHzl, c59570zjYEZpvd);
        boolean z = false;
        C59665zlN c59665zlN2 = c59665zlN;
        InterfaceC59584zjm response = null;
        boolean zOLrzqt = false;
        while (!z) {
            try {
                C59666zlO c59666zlOAEQbTJ = c59665zlN2.AEQbTJ();
                C59570zjY c59570zjYOLrzqt = c59665zlN2.OLrzqt();
                java.lang.Object attribute = interfaceC59838zob.getAttribute("http.user-token");
                if (this.valueOf == null) {
                    InterfaceC59558zjM interfaceC59558zjMAEQbTJ = this.EZpvd.AEQbTJ(c59570zjYOLrzqt, attribute);
                    if (interfaceC59577zjf instanceof AbortableHttpRequest) {
                        ((AbortableHttpRequest) interfaceC59577zjf).setConnectionRequest(interfaceC59558zjMAEQbTJ);
                    }
                    try {
                        this.valueOf = interfaceC59558zjMAEQbTJ.AEQbTJ(HttpClientParams.getConnectionManagerTimeout(this.gEmmrt), java.util.concurrent.TimeUnit.MILLISECONDS);
                        if (C59776znS.valueOf(this.gEmmrt) && this.valueOf.KWHzl()) {
                            this.AhwBna.debug("Stale connection check");
                            if (this.valueOf.OLrzqt()) {
                                this.AhwBna.debug("Stale connection detected");
                                this.valueOf.close();
                            }
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException();
                    }
                }
                if (interfaceC59577zjf instanceof AbortableHttpRequest) {
                    ((AbortableHttpRequest) interfaceC59577zjf).setReleaseTrigger(this.valueOf);
                }
                try {
                    EZpvd(c59665zlN2, interfaceC59838zob);
                    java.lang.String userInfo = c59666zlOAEQbTJ.getURI().getUserInfo();
                    if (userInfo != null) {
                        this.uzCIH.AEQbTJ(new BasicScheme(), new UsernamePasswordCredentials(userInfo));
                    }
                    HttpHost httpHost3 = this.getFieldNames;
                    if (httpHost3 != null) {
                        httpHost = httpHost3;
                    } else {
                        java.net.URI uri = c59666zlOAEQbTJ.getURI();
                        if (uri.isAbsolute()) {
                            httpHost = URIUtils.extractHost(uri);
                        }
                    }
                    if (httpHost == null) {
                        httpHost = c59570zjYOLrzqt.copydefault();
                    }
                    c59666zlOAEQbTJ.copydefault();
                    copydefault(c59666zlOAEQbTJ, c59570zjYOLrzqt);
                    interfaceC59838zob.setAttribute(C59840zod.HTTP_TARGET_HOST, httpHost);
                    interfaceC59838zob.setAttribute("http.route", c59570zjYOLrzqt);
                    interfaceC59838zob.setAttribute(C59840zod.HTTP_CONNECTION, this.valueOf);
                    this.fJNWhG.AEQbTJ(c59666zlOAEQbTJ, this.KWHzl, interfaceC59838zob);
                    response = copydefault(c59665zlN2, interfaceC59838zob);
                    if (response != null) {
                        response.setParams(this.gEmmrt);
                        this.fJNWhG.EZpvd(response, this.KWHzl, interfaceC59838zob);
                        zOLrzqt = this.AuCTel.OLrzqt(response, interfaceC59838zob);
                        if (zOLrzqt) {
                            long jCopydefault = this.copydefault.copydefault(response, interfaceC59838zob);
                            if (this.AhwBna.isDebugEnabled()) {
                                if (jCopydefault > 0) {
                                    str = "for " + jCopydefault + " " + java.util.concurrent.TimeUnit.MILLISECONDS;
                                } else {
                                    str = "indefinitely";
                                }
                                this.AhwBna.debug("Connection can be kept alive " + str);
                            }
                            this.valueOf.EZpvd(jCopydefault, java.util.concurrent.TimeUnit.MILLISECONDS);
                        }
                        C59665zlN c59665zlNAEQbTJ = AEQbTJ(c59665zlN2, response, interfaceC59838zob);
                        if (c59665zlNAEQbTJ == null) {
                            z = true;
                        } else {
                            if (zOLrzqt) {
                                C59855zos.KWHzl(response.EZpvd());
                                this.valueOf.AhwBna();
                            } else {
                                this.valueOf.close();
                                AuthProtocolState authProtocolStateCopydefault = this.fetchVPNInfo.copydefault();
                                AuthProtocolState authProtocolState = AuthProtocolState.CHALLENGED;
                                if (authProtocolStateCopydefault.compareTo(authProtocolState) > 0 && this.fetchVPNInfo.KWHzl() != null && this.fetchVPNInfo.KWHzl().isConnectionBased()) {
                                    this.AhwBna.debug("Resetting proxy auth state");
                                    this.fetchVPNInfo.OLrzqt();
                                }
                                if (this.uzCIH.copydefault().compareTo(authProtocolState) > 0 && this.uzCIH.KWHzl() != null && this.uzCIH.KWHzl().isConnectionBased()) {
                                    this.AhwBna.debug("Resetting target auth state");
                                    this.uzCIH.OLrzqt();
                                }
                            }
                            if (!c59665zlNAEQbTJ.OLrzqt().equals(c59665zlN2.OLrzqt())) {
                                EZpvd();
                            }
                            c59665zlN2 = c59665zlNAEQbTJ;
                        }
                        if (this.valueOf != null) {
                            if (attribute == null) {
                                attribute = this.getNewProxyInstance.getUserToken(interfaceC59838zob);
                                interfaceC59838zob.setAttribute("http.user-token", attribute);
                            }
                            if (attribute != null) {
                                this.valueOf.EZpvd(attribute);
                            }
                        }
                    }
                } catch (TunnelRefusedException e) {
                    if (this.AhwBna.isDebugEnabled()) {
                        this.AhwBna.debug(e.getMessage());
                    }
                    response = e.getResponse();
                }
            } catch (java.io.IOException e2) {
                KWHzl();
                throw e2;
            } catch (HttpException e3) {
                KWHzl();
                throw e3;
            } catch (ConnectionShutdownException e4) {
                java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("Connection has been shut down");
                interruptedIOException.initCause(e4);
                throw interruptedIOException;
            } catch (java.lang.RuntimeException e5) {
                KWHzl();
                throw e5;
            }
        }
        if (response == null || response.EZpvd() == null || !response.EZpvd().isStreaming()) {
            if (zOLrzqt) {
                this.valueOf.AhwBna();
            }
            EZpvd();
        } else {
            response.OLrzqt(new C59553zjH(response.EZpvd(), this.valueOf, zOLrzqt));
        }
        return response;
    }

    public final void EZpvd(C59665zlN c59665zlN, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59570zjY c59570zjYOLrzqt = c59665zlN.OLrzqt();
        C59666zlO c59666zlOAEQbTJ = c59665zlN.AEQbTJ();
        int i = 0;
        while (true) {
            interfaceC59838zob.setAttribute(C59840zod.HTTP_REQUEST, c59666zlOAEQbTJ);
            i++;
            try {
                if (!this.valueOf.KWHzl()) {
                    this.valueOf.AEQbTJ(c59570zjYOLrzqt, interfaceC59838zob, this.gEmmrt);
                } else {
                    this.valueOf.KWHzl(C59776znS.OLrzqt(this.gEmmrt));
                }
                KWHzl(c59570zjYOLrzqt, interfaceC59838zob);
                return;
            } catch (java.io.IOException e) {
                try {
                    this.valueOf.close();
                } catch (java.io.IOException unused) {
                }
                if (this.fARcdN.retryRequest(e, i, interfaceC59838zob)) {
                    if (this.AhwBna.isInfoEnabled()) {
                        this.AhwBna.info("I/O exception (" + e.getClass().getName() + ") caught when connecting to " + c59570zjYOLrzqt + ": " + e.getMessage());
                        if (this.AhwBna.isDebugEnabled()) {
                            this.AhwBna.debug(e.getMessage(), e);
                        }
                        this.AhwBna.info("Retrying connect to " + c59570zjYOLrzqt);
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final InterfaceC59584zjm copydefault(C59665zlN c59665zlN, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59666zlO c59666zlOAEQbTJ = c59665zlN.AEQbTJ();
        C59570zjY c59570zjYOLrzqt = c59665zlN.OLrzqt();
        java.io.IOException e = null;
        while (true) {
            this.OLrzqt++;
            c59666zlOAEQbTJ.EZpvd();
            if (!c59666zlOAEQbTJ.OLrzqt()) {
                this.AhwBna.debug("Cannot retry non-repeatable request");
                if (e != null) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e);
                }
                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.valueOf.KWHzl()) {
                    if (!c59570zjYOLrzqt.gEmmrt()) {
                        this.AhwBna.debug("Reopening the direct connection.");
                        this.valueOf.AEQbTJ(c59570zjYOLrzqt, interfaceC59838zob, this.gEmmrt);
                    } else {
                        this.AhwBna.debug("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.AhwBna.isDebugEnabled()) {
                    this.AhwBna.debug("Attempt " + this.OLrzqt + " to execute request");
                }
                return this.fJNWhG.KWHzl(c59666zlOAEQbTJ, this.valueOf, interfaceC59838zob);
            } catch (java.io.IOException e2) {
                e = e2;
                this.AhwBna.debug("Closing the connection.");
                try {
                    this.valueOf.close();
                } catch (java.io.IOException unused) {
                }
                if (this.fARcdN.retryRequest(e, c59666zlOAEQbTJ.KWHzl(), interfaceC59838zob)) {
                    if (this.AhwBna.isInfoEnabled()) {
                        this.AhwBna.info("I/O exception (" + e.getClass().getName() + ") caught when processing request to " + c59570zjYOLrzqt + ": " + e.getMessage());
                    }
                    if (this.AhwBna.isDebugEnabled()) {
                        this.AhwBna.debug(e.getMessage(), e);
                    }
                    if (this.AhwBna.isInfoEnabled()) {
                        this.AhwBna.info("Retrying request to " + c59570zjYOLrzqt);
                    }
                } else {
                    if (e instanceof NoHttpResponseException) {
                        NoHttpResponseException noHttpResponseException = new NoHttpResponseException(c59570zjYOLrzqt.copydefault().toHostString() + " failed to respond");
                        noHttpResponseException.setStackTrace(e.getStackTrace());
                        throw noHttpResponseException;
                    }
                    throw e;
                }
            }
        }
    }

    public void EZpvd() {
        try {
            this.valueOf.ca_();
        } catch (java.io.IOException e) {
            this.AhwBna.debug("IOException releasing connection", e);
        }
        this.valueOf = null;
    }

    public C59570zjY EZpvd(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException {
        InterfaceC59625zka interfaceC59625zka = this.fIwbmz;
        if (httpHost == null) {
            httpHost = (HttpHost) interfaceC59577zjf.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        return interfaceC59625zka.OLrzqt(httpHost, interfaceC59577zjf, interfaceC59838zob);
    }

    public void KWHzl(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        int iEZpvd;
        C59626zkb c59626zkb = new C59626zkb();
        do {
            C59570zjY c59570zjYAYXKKw = this.valueOf.AYXKKw();
            iEZpvd = c59626zkb.EZpvd(c59570zjY, c59570zjYAYXKKw);
            switch (iEZpvd) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + c59570zjY + "; current = " + c59570zjYAYXKKw);
                case 0:
                    break;
                case 1:
                case 2:
                    this.valueOf.AEQbTJ(c59570zjY, interfaceC59838zob, this.gEmmrt);
                    break;
                case 3:
                    boolean zOLrzqt = OLrzqt(c59570zjY, interfaceC59838zob);
                    this.AhwBna.debug("Tunnel to target created.");
                    this.valueOf.AEQbTJ(zOLrzqt, this.gEmmrt);
                    break;
                case 4:
                    int iAEQbTJ = c59570zjYAYXKKw.AEQbTJ() - 1;
                    boolean zOLrzqt2 = OLrzqt(c59570zjY, iAEQbTJ, interfaceC59838zob);
                    this.AhwBna.debug("Tunnel to proxy created.");
                    this.valueOf.EZpvd(c59570zjY.AEQbTJ(iAEQbTJ), zOLrzqt2, this.gEmmrt);
                    break;
                case 5:
                    this.valueOf.KWHzl(interfaceC59838zob, this.gEmmrt);
                    break;
                default:
                    throw new java.lang.IllegalStateException("Unknown step indicator " + iEZpvd + " from RouteDirector.");
            }
        } while (iEZpvd > 0);
    }

    public boolean OLrzqt(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        InterfaceC59584zjm interfaceC59584zjmKWHzl;
        HttpHost httpHostEZpvd = c59570zjY.EZpvd();
        HttpHost httpHostCopydefault = c59570zjY.copydefault();
        while (true) {
            if (!this.valueOf.KWHzl()) {
                this.valueOf.AEQbTJ(c59570zjY, interfaceC59838zob, this.gEmmrt);
            }
            InterfaceC59577zjf interfaceC59577zjfAEQbTJ = AEQbTJ(c59570zjY, interfaceC59838zob);
            interfaceC59577zjfAEQbTJ.setParams(this.gEmmrt);
            interfaceC59838zob.setAttribute(C59840zod.HTTP_TARGET_HOST, httpHostCopydefault);
            interfaceC59838zob.setAttribute("http.route", c59570zjY);
            interfaceC59838zob.setAttribute("http.proxy_host", httpHostEZpvd);
            interfaceC59838zob.setAttribute(C59840zod.HTTP_CONNECTION, this.valueOf);
            interfaceC59838zob.setAttribute(C59840zod.HTTP_REQUEST, interfaceC59577zjfAEQbTJ);
            this.fJNWhG.AEQbTJ(interfaceC59577zjfAEQbTJ, this.KWHzl, interfaceC59838zob);
            interfaceC59584zjmKWHzl = this.fJNWhG.KWHzl(interfaceC59577zjfAEQbTJ, this.valueOf, interfaceC59838zob);
            interfaceC59584zjmKWHzl.setParams(this.gEmmrt);
            this.fJNWhG.EZpvd(interfaceC59584zjmKWHzl, this.KWHzl, interfaceC59838zob);
            if (interfaceC59584zjmKWHzl.AEQbTJ().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + interfaceC59584zjmKWHzl.AEQbTJ());
            }
            if (HttpClientParams.isAuthenticating(this.gEmmrt)) {
                if (!this.AEQbTJ.copydefault(httpHostEZpvd, interfaceC59584zjmKWHzl, this.values, this.fetchVPNInfo, interfaceC59838zob) || !this.AEQbTJ.OLrzqt(httpHostEZpvd, interfaceC59584zjmKWHzl, this.values, this.fetchVPNInfo, interfaceC59838zob)) {
                    break;
                }
                if (this.AuCTel.OLrzqt(interfaceC59584zjmKWHzl, interfaceC59838zob)) {
                    this.AhwBna.debug("Connection kept alive");
                    C59855zos.KWHzl(interfaceC59584zjmKWHzl.EZpvd());
                } else {
                    this.valueOf.close();
                }
            }
        }
        if (interfaceC59584zjmKWHzl.AEQbTJ().getStatusCode() > 299) {
            InterfaceC59576zje interfaceC59576zjeEZpvd = interfaceC59584zjmKWHzl.EZpvd();
            if (interfaceC59576zjeEZpvd != null) {
                interfaceC59584zjmKWHzl.OLrzqt(new C59611zkM(interfaceC59576zjeEZpvd));
            }
            this.valueOf.close();
            throw new TunnelRefusedException("CONNECT refused by proxy: " + interfaceC59584zjmKWHzl.AEQbTJ(), interfaceC59584zjmKWHzl);
        }
        this.valueOf.AhwBna();
        return false;
    }

    public boolean OLrzqt(C59570zjY c59570zjY, int i, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        throw new HttpException("Proxy chains are not supported.");
    }

    public InterfaceC59577zjf AEQbTJ(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob) {
        HttpHost httpHostCopydefault = c59570zjY.copydefault();
        java.lang.String hostName = httpHostCopydefault.getHostName();
        int port = httpHostCopydefault.getPort();
        if (port < 0) {
            port = this.EZpvd.AEQbTJ().AEQbTJ(httpHostCopydefault.getSchemeName()).OLrzqt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(java.lang.Integer.toString(port));
        return new C59768znK(HttpMethods.CONNECT, sb.toString(), C59781znX.copydefault(this.gEmmrt));
    }

    public C59665zlN AEQbTJ(C59665zlN c59665zlN, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        HttpHost httpHost;
        C59570zjY c59570zjYOLrzqt = c59665zlN.OLrzqt();
        C59666zlO c59666zlOAEQbTJ = c59665zlN.AEQbTJ();
        InterfaceC59779znV params = c59666zlOAEQbTJ.getParams();
        if (HttpClientParams.isAuthenticating(params)) {
            HttpHost httpHostCopydefault = (HttpHost) interfaceC59838zob.getAttribute(C59840zod.HTTP_TARGET_HOST);
            if (httpHostCopydefault == null) {
                httpHostCopydefault = c59570zjYOLrzqt.copydefault();
            }
            if (httpHostCopydefault.getPort() < 0) {
                httpHost = new HttpHost(httpHostCopydefault.getHostName(), this.EZpvd.AEQbTJ().EZpvd(httpHostCopydefault).OLrzqt(), httpHostCopydefault.getSchemeName());
            } else {
                httpHost = httpHostCopydefault;
            }
            boolean zCopydefault = this.AEQbTJ.copydefault(httpHost, interfaceC59584zjm, this.hDKMBd, this.uzCIH, interfaceC59838zob);
            HttpHost httpHostEZpvd = c59570zjYOLrzqt.EZpvd();
            if (httpHostEZpvd == null) {
                httpHostEZpvd = c59570zjYOLrzqt.copydefault();
            }
            HttpHost httpHost2 = httpHostEZpvd;
            boolean zCopydefault2 = this.AEQbTJ.copydefault(httpHost2, interfaceC59584zjm, this.values, this.fetchVPNInfo, interfaceC59838zob);
            if (zCopydefault) {
                if (this.AEQbTJ.OLrzqt(httpHost, interfaceC59584zjm, this.hDKMBd, this.uzCIH, interfaceC59838zob)) {
                    return c59665zlN;
                }
            }
            if (zCopydefault2 && this.AEQbTJ.OLrzqt(httpHost2, interfaceC59584zjm, this.values, this.fetchVPNInfo, interfaceC59838zob)) {
                return c59665zlN;
            }
        }
        if (!HttpClientParams.isRedirecting(params) || !this.DbNXlk.isRedirected(c59666zlOAEQbTJ, interfaceC59584zjm, interfaceC59838zob)) {
            return null;
        }
        int i = this.AkhnZx;
        if (i >= this.AYXKKw) {
            throw new RedirectException("Maximum redirects (" + this.AYXKKw + ") exceeded");
        }
        this.AkhnZx = i + 1;
        this.getFieldNames = null;
        HttpUriRequest redirect = this.DbNXlk.getRedirect(c59666zlOAEQbTJ, interfaceC59584zjm, interfaceC59838zob);
        redirect.setHeaders(c59666zlOAEQbTJ.AEQbTJ().getAllHeaders());
        java.net.URI uri = redirect.getURI();
        HttpHost httpHostExtractHost = URIUtils.extractHost(uri);
        if (httpHostExtractHost == null) {
            throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
        }
        if (!c59570zjYOLrzqt.copydefault().equals(httpHostExtractHost)) {
            this.AhwBna.debug("Resetting target auth state");
            this.uzCIH.OLrzqt();
            InterfaceC59588zjq interfaceC59588zjqKWHzl = this.fetchVPNInfo.KWHzl();
            if (interfaceC59588zjqKWHzl != null && interfaceC59588zjqKWHzl.isConnectionBased()) {
                this.AhwBna.debug("Resetting proxy auth state");
                this.fetchVPNInfo.OLrzqt();
            }
        }
        C59666zlO c59666zlOKWHzl = KWHzl(redirect);
        c59666zlOKWHzl.setParams(params);
        C59570zjY c59570zjYEZpvd = EZpvd(httpHostExtractHost, c59666zlOKWHzl, interfaceC59838zob);
        C59665zlN c59665zlN2 = new C59665zlN(c59666zlOKWHzl, c59570zjYEZpvd);
        if (this.AhwBna.isDebugEnabled()) {
            this.AhwBna.debug("Redirecting to '" + uri + "' via " + c59570zjYEZpvd);
        }
        return c59665zlN2;
    }

    public final void KWHzl() {
        InterfaceC59560zjO interfaceC59560zjO = this.valueOf;
        if (interfaceC59560zjO != null) {
            this.valueOf = null;
            try {
                interfaceC59560zjO.bZ_();
            } catch (java.io.IOException e) {
                if (this.AhwBna.isDebugEnabled()) {
                    this.AhwBna.debug(e.getMessage(), e);
                }
            }
            try {
                interfaceC59560zjO.ca_();
            } catch (java.io.IOException e2) {
                this.AhwBna.debug("Error releasing connection", e2);
            }
        }
    }
}

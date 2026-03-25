package o;

import java.net.URISyntaxException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;

/* JADX INFO: renamed from: o.zlB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59653zlB implements RedirectStrategy {
    public static final C59653zlB EZpvd = new C59653zlB();
    public static final java.lang.String[] KWHzl = {"GET", "HEAD"};
    public final InterfaceC59499ziG AEQbTJ = LogFactory.copydefault(getClass());

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        int statusCode = interfaceC59584zjm.AEQbTJ().getStatusCode();
        java.lang.String method = interfaceC59577zjf.getRequestLine().getMethod();
        InterfaceC59518ziZ firstHeader = interfaceC59584zjm.getFirstHeader("location");
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return AEQbTJ(method) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return AEQbTJ(method);
    }

    public java.net.URI KWHzl(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        InterfaceC59518ziZ firstHeader = interfaceC59584zjm.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + interfaceC59584zjm.AEQbTJ() + " but no location header");
        }
        java.lang.String value = firstHeader.getValue();
        if (this.AEQbTJ.isDebugEnabled()) {
            this.AEQbTJ.debug("Redirect requested to location '" + value + "'");
        }
        RequestConfig requestConfig = httpClientContextAdapt.getRequestConfig();
        java.net.URI uriOLrzqt = OLrzqt(value);
        try {
            if (!uriOLrzqt.isAbsolute()) {
                if (!requestConfig.isRelativeRedirectsAllowed()) {
                    throw new ProtocolException("Relative redirect location '" + uriOLrzqt + "' not allowed");
                }
                HttpHost targetHost = httpClientContextAdapt.getTargetHost();
                C59849zom.AEQbTJ(targetHost, "Target host");
                uriOLrzqt = URIUtils.resolve(URIUtils.rewriteURI(new java.net.URI(interfaceC59577zjf.getRequestLine().getUri()), targetHost, false), uriOLrzqt);
            }
            C59661zlJ c59661zlJ = (C59661zlJ) httpClientContextAdapt.getAttribute(HttpClientContext.REDIRECT_LOCATIONS);
            if (c59661zlJ == null) {
                c59661zlJ = new C59661zlJ();
                interfaceC59838zob.setAttribute(HttpClientContext.REDIRECT_LOCATIONS, c59661zlJ);
            }
            if (!requestConfig.isCircularRedirectsAllowed() && c59661zlJ.KWHzl(uriOLrzqt)) {
                throw new CircularRedirectException("Circular redirect to '" + uriOLrzqt + "'");
            }
            c59661zlJ.EZpvd(uriOLrzqt);
            return uriOLrzqt;
        } catch (URISyntaxException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    public java.net.URI OLrzqt(java.lang.String str) throws ProtocolException {
        try {
            URIBuilder uRIBuilder = new URIBuilder(new java.net.URI(str).normalize());
            java.lang.String host = uRIBuilder.getHost();
            if (host != null) {
                uRIBuilder.setHost(host.toLowerCase(java.util.Locale.ROOT));
            }
            if (C59853zoq.EZpvd(uRIBuilder.getPath())) {
                uRIBuilder.setPath("/");
            }
            return uRIBuilder.build();
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public boolean AEQbTJ(java.lang.String str) {
        for (java.lang.String str2 : KWHzl) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        java.net.URI uriKWHzl = KWHzl(interfaceC59577zjf, interfaceC59584zjm, interfaceC59838zob);
        java.lang.String method = interfaceC59577zjf.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("HEAD")) {
            return new HttpHead(uriKWHzl);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new HttpGet(uriKWHzl);
        }
        if (interfaceC59584zjm.AEQbTJ().getStatusCode() == 307) {
            return RequestBuilder.copy(interfaceC59577zjf).setUri(uriKWHzl).build();
        }
        return new HttpGet(uriKWHzl);
    }
}

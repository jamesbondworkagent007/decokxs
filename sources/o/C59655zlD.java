package o;

import java.net.URISyntaxException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;

/* JADX INFO: renamed from: o.zlD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public class C59655zlD implements RedirectHandler {
    public final InterfaceC59499ziG OLrzqt = LogFactory.copydefault(getClass());

    @Override // org.apache.http.client.RedirectHandler
    public boolean isRedirectRequested(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        int statusCode = interfaceC59584zjm.AEQbTJ().getStatusCode();
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                case 302:
                    break;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        java.lang.String method = ((InterfaceC59577zjf) interfaceC59838zob.getAttribute(C59840zod.HTTP_REQUEST)).getRequestLine().getMethod();
        return method.equalsIgnoreCase("GET") || method.equalsIgnoreCase("HEAD");
    }

    @Override // org.apache.http.client.RedirectHandler
    public java.net.URI getLocationURI(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws ProtocolException {
        java.net.URI uriRewriteURI;
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        InterfaceC59518ziZ firstHeader = interfaceC59584zjm.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + interfaceC59584zjm.AEQbTJ() + " but no location header");
        }
        java.lang.String value = firstHeader.getValue();
        if (this.OLrzqt.isDebugEnabled()) {
            this.OLrzqt.debug("Redirect requested to location '" + value + "'");
        }
        try {
            java.net.URI uri = new java.net.URI(value);
            InterfaceC59779znV params = interfaceC59584zjm.getParams();
            if (!uri.isAbsolute()) {
                if (params.isParameterTrue(ClientPNames.REJECT_RELATIVE_REDIRECT)) {
                    throw new ProtocolException("Relative redirect location '" + uri + "' not allowed");
                }
                HttpHost httpHost = (HttpHost) interfaceC59838zob.getAttribute(C59840zod.HTTP_TARGET_HOST);
                C59849zom.AEQbTJ(httpHost, "Target host");
                try {
                    uri = URIUtils.resolve(URIUtils.rewriteURI(new java.net.URI(((InterfaceC59577zjf) interfaceC59838zob.getAttribute(C59840zod.HTTP_REQUEST)).getRequestLine().getUri()), httpHost, true), uri);
                } catch (URISyntaxException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            }
            if (params.isParameterFalse(ClientPNames.ALLOW_CIRCULAR_REDIRECTS)) {
                C59661zlJ c59661zlJ = (C59661zlJ) interfaceC59838zob.getAttribute(HttpClientContext.REDIRECT_LOCATIONS);
                if (c59661zlJ == null) {
                    c59661zlJ = new C59661zlJ();
                    interfaceC59838zob.setAttribute(HttpClientContext.REDIRECT_LOCATIONS, c59661zlJ);
                }
                if (uri.getFragment() != null) {
                    try {
                        uriRewriteURI = URIUtils.rewriteURI(uri, new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), true);
                    } catch (URISyntaxException e2) {
                        throw new ProtocolException(e2.getMessage(), e2);
                    }
                } else {
                    uriRewriteURI = uri;
                }
                if (c59661zlJ.KWHzl(uriRewriteURI)) {
                    throw new CircularRedirectException("Circular redirect to '" + uriRewriteURI + "'");
                }
                c59661zlJ.EZpvd(uriRewriteURI);
            }
            return uri;
        } catch (URISyntaxException e3) {
            throw new ProtocolException("Invalid redirect URI: " + value, e3);
        }
    }
}

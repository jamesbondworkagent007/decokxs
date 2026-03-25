package org.apache.http.client.protocol;

import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.C59602zkD;
import o.C59851zoo;
import o.C59853zoq;
import o.InterfaceC59499ziG;
import o.InterfaceC59518ziZ;
import o.InterfaceC59548zjC;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59601zkC;
import o.InterfaceC59605zkG;
import o.InterfaceC59607zkI;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: loaded from: classes13.dex */
public class RequestAddCookies implements InterfaceC59580zji {
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        URI uri;
        InterfaceC59518ziZ interfaceC59518ziZOLrzqt;
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        if (interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            return;
        }
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        CookieStore cookieStore = httpClientContextAdapt.getCookieStore();
        if (cookieStore == null) {
            this.log.debug("Cookie store not specified in HTTP context");
            return;
        }
        InterfaceC59548zjC<InterfaceC59607zkI> cookieSpecRegistry = httpClientContextAdapt.getCookieSpecRegistry();
        if (cookieSpecRegistry == null) {
            this.log.debug("CookieSpec registry not specified in HTTP context");
            return;
        }
        HttpHost targetHost = httpClientContextAdapt.getTargetHost();
        if (targetHost == null) {
            this.log.debug("Target host not set in the context");
            return;
        }
        RouteInfo httpRoute = httpClientContextAdapt.getHttpRoute();
        if (httpRoute == null) {
            this.log.debug("Connection route not set in the context");
            return;
        }
        String cookieSpec = httpClientContextAdapt.getRequestConfig().getCookieSpec();
        if (cookieSpec == null) {
            cookieSpec = "default";
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("CookieSpec selected: " + cookieSpec);
        }
        if (interfaceC59577zjf instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) interfaceC59577zjf).getURI();
        } else {
            try {
                uri = new URI(interfaceC59577zjf.getRequestLine().getUri());
            } catch (URISyntaxException unused) {
                uri = null;
            }
        }
        String path = uri != null ? uri.getPath() : null;
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = httpRoute.copydefault().getPort();
        }
        boolean z = false;
        if (port < 0) {
            port = 0;
        }
        if (C59853zoq.EZpvd(path)) {
            path = "/";
        }
        C59602zkD c59602zkD = new C59602zkD(hostName, port, path, httpRoute.AYXKKw());
        InterfaceC59607zkI interfaceC59607zkIKWHzl = cookieSpecRegistry.KWHzl(cookieSpec);
        if (interfaceC59607zkIKWHzl == null) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Unsupported cookie policy: " + cookieSpec);
                return;
            }
            return;
        }
        InterfaceC59605zkG interfaceC59605zkGAEQbTJ = interfaceC59607zkIKWHzl.AEQbTJ(httpClientContextAdapt);
        List<InterfaceC59601zkC> cookies = cookieStore.getCookies();
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        for (InterfaceC59601zkC interfaceC59601zkC : cookies) {
            if (!interfaceC59601zkC.isExpired(date)) {
                if (interfaceC59605zkGAEQbTJ.KWHzl(interfaceC59601zkC, c59602zkD)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Cookie " + interfaceC59601zkC + " match " + c59602zkD);
                    }
                    arrayList.add(interfaceC59601zkC);
                }
            } else {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Cookie " + interfaceC59601zkC + " expired");
                }
                z = true;
            }
        }
        if (z) {
            cookieStore.clearExpired(date);
        }
        if (!arrayList.isEmpty()) {
            Iterator<InterfaceC59518ziZ> it = interfaceC59605zkGAEQbTJ.KWHzl(arrayList).iterator();
            while (it.hasNext()) {
                interfaceC59577zjf.addHeader(it.next());
            }
        }
        if (interfaceC59605zkGAEQbTJ.AEQbTJ() > 0 && (interfaceC59518ziZOLrzqt = interfaceC59605zkGAEQbTJ.OLrzqt()) != null) {
            interfaceC59577zjf.addHeader(interfaceC59518ziZOLrzqt);
        }
        interfaceC59838zob.setAttribute("http.cookie-spec", interfaceC59605zkGAEQbTJ);
        interfaceC59838zob.setAttribute("http.cookie-origin", c59602zkD);
    }
}

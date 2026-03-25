package org.apache.http.client.protocol;

import com.google.api.client.http.HttpMethods;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import o.C59851zoo;
import o.InterfaceC59499ziG;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.conn.routing.RouteInfo;

/* JADX INFO: loaded from: classes13.dex */
public class RequestClientConnControl implements InterfaceC59580zji {
    private static final String PROXY_CONN_DIRECTIVE = "Proxy-Connection";
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            interfaceC59577zjf.setHeader(PROXY_CONN_DIRECTIVE, HttpHeaders.KEEP_ALIVE);
            return;
        }
        RouteInfo httpRoute = HttpClientContext.adapt(interfaceC59838zob).getHttpRoute();
        if (httpRoute == null) {
            this.log.debug("Connection route not set in the context");
            return;
        }
        if ((httpRoute.AEQbTJ() == 1 || httpRoute.gEmmrt()) && !interfaceC59577zjf.containsHeader(HttpHeaders.CONNECTION)) {
            interfaceC59577zjf.addHeader(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (httpRoute.AEQbTJ() != 2 || httpRoute.gEmmrt() || interfaceC59577zjf.containsHeader(PROXY_CONN_DIRECTIVE)) {
            return;
        }
        interfaceC59577zjf.addHeader(PROXY_CONN_DIRECTIVE, HttpHeaders.KEEP_ALIVE);
    }
}

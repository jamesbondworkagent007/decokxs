package org.apache.http.client.protocol;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import o.C59593zjv;
import o.C59840zod;
import o.C59851zoo;
import o.InterfaceC59564zjS;
import o.InterfaceC59577zjf;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RequestProxyAuthentication extends RequestAuthenticationBase {
    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        if (interfaceC59577zjf.containsHeader(HttpHeaders.PROXY_AUTHORIZATION)) {
            return;
        }
        InterfaceC59564zjS interfaceC59564zjS = (InterfaceC59564zjS) interfaceC59838zob.getAttribute(C59840zod.HTTP_CONNECTION);
        if (interfaceC59564zjS == null) {
            this.log.debug("HTTP connection not set in the context");
            return;
        }
        if (interfaceC59564zjS.AYXKKw().gEmmrt()) {
            return;
        }
        C59593zjv c59593zjv = (C59593zjv) interfaceC59838zob.getAttribute("http.auth.proxy-scope");
        if (c59593zjv == null) {
            this.log.debug("Proxy auth state not set in the context");
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Proxy auth state: " + c59593zjv.copydefault());
        }
        process(c59593zjv, interfaceC59577zjf, interfaceC59838zob);
    }
}

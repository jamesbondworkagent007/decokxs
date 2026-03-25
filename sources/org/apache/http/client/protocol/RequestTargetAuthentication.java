package org.apache.http.client.protocol;

import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import o.C59593zjv;
import o.C59851zoo;
import o.InterfaceC59577zjf;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RequestTargetAuthentication extends RequestAuthenticationBase {
    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        if (interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT) || interfaceC59577zjf.containsHeader("Authorization")) {
            return;
        }
        C59593zjv c59593zjv = (C59593zjv) interfaceC59838zob.getAttribute("http.auth.target-scope");
        if (c59593zjv == null) {
            this.log.debug("Target auth state not set in the context");
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Target auth state: " + c59593zjv.copydefault());
        }
        process(c59593zjv, interfaceC59577zjf, interfaceC59838zob);
    }
}

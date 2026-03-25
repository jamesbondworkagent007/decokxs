package org.apache.http.client.protocol;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import o.C59851zoo;
import o.InterfaceC59576zje;
import o.InterfaceC59577zjf;
import o.InterfaceC59578zjg;
import o.InterfaceC59580zji;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

/* JADX INFO: loaded from: classes24.dex */
public class RequestExpectContinue implements InterfaceC59580zji {
    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf.containsHeader(HttpHeaders.EXPECT) || !(interfaceC59577zjf instanceof InterfaceC59578zjg)) {
            return;
        }
        ProtocolVersion protocolVersion = interfaceC59577zjf.getRequestLine().getProtocolVersion();
        InterfaceC59576zje entity = ((InterfaceC59578zjg) interfaceC59577zjf).getEntity();
        if (entity == null || entity.getContentLength() == 0 || protocolVersion.lessEquals(HttpVersion.HTTP_1_0) || !HttpClientContext.adapt(interfaceC59838zob).getRequestConfig().isExpectContinueEnabled()) {
            return;
        }
        interfaceC59577zjf.addHeader(HttpHeaders.EXPECT, "100-continue");
    }
}

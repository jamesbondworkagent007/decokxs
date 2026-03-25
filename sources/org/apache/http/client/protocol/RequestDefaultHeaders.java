package org.apache.http.client.protocol;

import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;
import org.apache.http.client.params.ClientPNames;

/* JADX INFO: loaded from: classes13.dex */
public class RequestDefaultHeaders implements InterfaceC59580zji {
    private final Collection<? extends InterfaceC59518ziZ> defaultHeaders;

    public RequestDefaultHeaders(Collection<? extends InterfaceC59518ziZ> collection) {
        this.defaultHeaders = collection;
    }

    public RequestDefaultHeaders() {
        this(null);
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            return;
        }
        Collection<? extends InterfaceC59518ziZ> collection = (Collection) interfaceC59577zjf.getParams().getParameter(ClientPNames.DEFAULT_HEADERS);
        if (collection == null) {
            collection = this.defaultHeaders;
        }
        if (collection != null) {
            Iterator<? extends InterfaceC59518ziZ> it = collection.iterator();
            while (it.hasNext()) {
                interfaceC59577zjf.addHeader(it.next());
            }
        }
    }
}

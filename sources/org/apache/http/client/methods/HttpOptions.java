package org.apache.http.client.methods;

import com.google.common.net.HttpHeaders;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import o.C59851zoo;
import o.InterfaceC59517ziY;
import o.InterfaceC59574zjc;
import o.InterfaceC59584zjm;

/* JADX INFO: loaded from: classes13.dex */
public class HttpOptions extends HttpRequestBase {
    public static final String METHOD_NAME = "OPTIONS";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return "OPTIONS";
    }

    public HttpOptions() {
    }

    public HttpOptions(URI uri) {
        setURI(uri);
    }

    public HttpOptions(String str) {
        setURI(URI.create(str));
    }

    public Set<String> getAllowedMethods(InterfaceC59584zjm interfaceC59584zjm) {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        InterfaceC59574zjc interfaceC59574zjcHeaderIterator = interfaceC59584zjm.headerIterator(HttpHeaders.ALLOW);
        HashSet hashSet = new HashSet();
        while (interfaceC59574zjcHeaderIterator.hasNext()) {
            for (InterfaceC59517ziY interfaceC59517ziY : interfaceC59574zjcHeaderIterator.OLrzqt().getElements()) {
                hashSet.add(interfaceC59517ziY.copydefault());
            }
        }
        return hashSet;
    }
}

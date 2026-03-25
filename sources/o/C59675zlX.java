package o;

import org.apache.http.HttpHost;
import org.apache.http.conn.UnsupportedSchemeException;

/* JADX INFO: renamed from: o.zlX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59675zlX implements InterfaceC59565zjT {
    public static final C59675zlX copydefault = new C59675zlX();

    @Override // o.InterfaceC59565zjT
    public int copydefault(HttpHost httpHost) throws UnsupportedSchemeException {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        int port = httpHost.getPort();
        if (port > 0) {
            return port;
        }
        java.lang.String schemeName = httpHost.getSchemeName();
        if (schemeName.equalsIgnoreCase("http")) {
            return 80;
        }
        if (schemeName.equalsIgnoreCase("https")) {
            return 443;
        }
        throw new UnsupportedSchemeException(schemeName + " protocol is not supported");
    }
}

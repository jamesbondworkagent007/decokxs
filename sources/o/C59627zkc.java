package o;

import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zkc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59627zkc {
    public static final C59570zjY AEQbTJ;
    public static final HttpHost EZpvd;

    static {
        HttpHost httpHost = new HttpHost("127.0.0.255", 0, "no-host");
        EZpvd = httpHost;
        AEQbTJ = new C59570zjY(httpHost);
    }

    private C59627zkc() {
    }

    public static HttpHost copydefault(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        HttpHost httpHost = (HttpHost) interfaceC59779znV.getParameter("http.route.default-proxy");
        if (httpHost == null || !EZpvd.equals(httpHost)) {
            return httpHost;
        }
        return null;
    }

    public static void AEQbTJ(InterfaceC59779znV interfaceC59779znV, HttpHost httpHost) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        interfaceC59779znV.setParameter("http.route.default-proxy", httpHost);
    }

    public static C59570zjY OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        C59570zjY c59570zjY = (C59570zjY) interfaceC59779znV.getParameter("http.route.forced-route");
        if (c59570zjY == null || !AEQbTJ.equals(c59570zjY)) {
            return c59570zjY;
        }
        return null;
    }

    public static java.net.InetAddress EZpvd(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        return (java.net.InetAddress) interfaceC59779znV.getParameter("http.route.local-address");
    }
}

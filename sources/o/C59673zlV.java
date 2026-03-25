package o;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zlV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59673zlV implements InterfaceC59625zka {
    public final C59636zkl OLrzqt;

    public C59673zlV(C59636zkl c59636zkl) {
        C59851zoo.AEQbTJ(c59636zkl, "Scheme registry");
        this.OLrzqt = c59636zkl;
    }

    @Override // o.InterfaceC59625zka
    public C59570zjY OLrzqt(HttpHost httpHost, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59570zjY c59570zjYOLrzqt = C59627zkc.OLrzqt(interfaceC59577zjf.getParams());
        if (c59570zjYOLrzqt != null) {
            return c59570zjYOLrzqt;
        }
        C59849zom.AEQbTJ(httpHost, "Target host");
        java.net.InetAddress inetAddressEZpvd = C59627zkc.EZpvd(interfaceC59577zjf.getParams());
        HttpHost httpHostCopydefault = C59627zkc.copydefault(interfaceC59577zjf.getParams());
        try {
            boolean zEZpvd = this.OLrzqt.AEQbTJ(httpHost.getSchemeName()).EZpvd();
            if (httpHostCopydefault == null) {
                return new C59570zjY(httpHost, inetAddressEZpvd, zEZpvd);
            }
            return new C59570zjY(httpHost, inetAddressEZpvd, httpHostCopydefault, zEZpvd);
        } catch (java.lang.IllegalStateException e) {
            throw new HttpException(e.getMessage());
        }
    }
}

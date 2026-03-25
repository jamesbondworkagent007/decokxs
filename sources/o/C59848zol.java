package o;

import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.zol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59848zol implements InterfaceC59580zji {
    public final java.lang.String EZpvd;

    public C59848zol(java.lang.String str) {
        this.EZpvd = str;
    }

    public C59848zol() {
        this(null);
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        if (interfaceC59577zjf.containsHeader("User-Agent")) {
            return;
        }
        InterfaceC59779znV params = interfaceC59577zjf.getParams();
        java.lang.String str = params != null ? (java.lang.String) params.getParameter("http.useragent") : null;
        if (str == null) {
            str = this.EZpvd;
        }
        if (str != null) {
            interfaceC59577zjf.addHeader("User-Agent", str);
        }
    }
}

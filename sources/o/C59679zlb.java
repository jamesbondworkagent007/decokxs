package o;

import org.apache.http.impl.auth.BasicScheme;

/* JADX INFO: renamed from: o.zlb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59679zlb implements InterfaceC59592zju, InterfaceC59594zjw {
    public final java.nio.charset.Charset AEQbTJ;

    public C59679zlb(java.nio.charset.Charset charset) {
        this.AEQbTJ = charset;
    }

    public C59679zlb() {
        this(null);
    }

    @Override // o.InterfaceC59592zju
    public InterfaceC59588zjq OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        return new BasicScheme();
    }

    @Override // o.InterfaceC59594zjw
    public InterfaceC59588zjq copydefault(InterfaceC59838zob interfaceC59838zob) {
        return new BasicScheme(this.AEQbTJ);
    }
}

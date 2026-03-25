package o;

import org.apache.http.impl.auth.DigestScheme;

/* JADX INFO: renamed from: o.zlc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59680zlc implements InterfaceC59592zju, InterfaceC59594zjw {
    public final java.nio.charset.Charset KWHzl;

    public C59680zlc(java.nio.charset.Charset charset) {
        this.KWHzl = charset;
    }

    public C59680zlc() {
        this(null);
    }

    @Override // o.InterfaceC59592zju
    public InterfaceC59588zjq OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        return new DigestScheme();
    }

    @Override // o.InterfaceC59594zjw
    public InterfaceC59588zjq copydefault(InterfaceC59838zob interfaceC59838zob) {
        return new DigestScheme(this.KWHzl);
    }
}

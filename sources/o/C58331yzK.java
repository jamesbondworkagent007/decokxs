package o;

/* JADX INFO: renamed from: o.yzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58331yzK<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58227yxM<? super InterfaceC58217yxC> AEQbTJ;
    public final InterfaceC58222yxH KWHzl;

    public C58331yzK(AbstractC58247yxg<T> abstractC58247yxg, InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM, InterfaceC58222yxH interfaceC58222yxH) {
        super(abstractC58247yxg);
        this.AEQbTJ = interfaceC58227yxM;
        this.KWHzl = interfaceC58222yxH;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new C58312yys(interfaceC58256yxp, this.AEQbTJ, this.KWHzl));
    }
}

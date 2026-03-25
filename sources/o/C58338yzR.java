package o;

/* JADX INFO: renamed from: o.yzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58338yzR<T> extends AbstractC58247yxg<T> {
    public final InterfaceC58255yxo<T> KWHzl;

    public C58338yzR(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.KWHzl = interfaceC58255yxo;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.KWHzl.subscribe(interfaceC58256yxp);
    }
}

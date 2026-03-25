package o;

/* JADX INFO: renamed from: o.auZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8005auZ<T> extends AbstractC58247yxg<T> {
    public abstract void AEQbTJ(InterfaceC58256yxp<? super T> interfaceC58256yxp);

    public abstract T OLrzqt();

    @Override // o.AbstractC58247yxg
    public final void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        AEQbTJ(interfaceC58256yxp);
        interfaceC58256yxp.onNext(OLrzqt());
    }
}

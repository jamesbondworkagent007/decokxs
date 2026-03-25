package o;

/* JADX INFO: renamed from: o.yAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56296yAc<R, T> extends AbstractC58349yzc<T, R> {
    public final InterfaceC58254yxn<? extends R, ? super T> KWHzl;

    public C56296yAc(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58254yxn<? extends R, ? super T> interfaceC58254yxn) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58254yxn;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        try {
            this.OLrzqt.subscribe((InterfaceC58256yxp) C58297yyd.AEQbTJ(this.KWHzl.EZpvd(interfaceC58256yxp), "Operator " + this.KWHzl + " returned a null Observer"));
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            yBG.copydefault(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}

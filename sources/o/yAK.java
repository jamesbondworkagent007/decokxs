package o;

/* JADX INFO: loaded from: classes13.dex */
public final class yAK<T, R> extends AbstractC58260yxt<R> {
    public final InterfaceC58261yxu<? extends T> AEQbTJ;
    public final InterfaceC58229yxO<? super T, ? extends R> OLrzqt;

    public yAK(InterfaceC58261yxu<? extends T> interfaceC58261yxu, InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        this.AEQbTJ = interfaceC58261yxu;
        this.OLrzqt = interfaceC58229yxO;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super R> interfaceC58258yxr) {
        this.AEQbTJ.copydefault(new StateListAnimator(interfaceC58258yxr, this.OLrzqt));
    }

    public static final class StateListAnimator<T, R> implements InterfaceC58258yxr<T> {
        public final InterfaceC58229yxO<? super T, ? extends R> EZpvd;
        public final InterfaceC58258yxr<? super R> OLrzqt;

        public StateListAnimator(InterfaceC58258yxr<? super R> interfaceC58258yxr, InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
            this.OLrzqt = interfaceC58258yxr;
            this.EZpvd = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.OLrzqt.onSubscribe(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58258yxr
        public void onSuccess(T t) {
            try {
                this.OLrzqt.onSuccess(C58297yyd.AEQbTJ(this.EZpvd.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                onError(th);
            }
        }

        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            this.OLrzqt.onError(th);
        }
    }
}

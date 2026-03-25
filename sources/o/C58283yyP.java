package o;

/* JADX INFO: renamed from: o.yyP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58283yyP<T> extends AbstractC58185ywX<T> {
    public final AbstractC58247yxg<T> OLrzqt;

    public C58283yyP(AbstractC58247yxg<T> abstractC58247yxg) {
        this.OLrzqt = abstractC58247yxg;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC60097zve));
    }

    /* JADX INFO: renamed from: o.yyP$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC60094zvb {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC60097zve<? super T> KWHzl;

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
        }

        public StateListAnimator(InterfaceC60097zve<? super T> interfaceC60097zve) {
            this.KWHzl = interfaceC60097zve;
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl.onComplete();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.KWHzl.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.AEQbTJ = interfaceC58217yxC;
            this.KWHzl.onSubscribe(this);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            this.AEQbTJ.dispose();
        }
    }
}

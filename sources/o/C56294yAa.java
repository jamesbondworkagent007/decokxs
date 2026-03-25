package o;

/* JADX INFO: renamed from: o.yAa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56294yAa<T, U> extends AbstractC58349yzc<T, U> {
    public final InterfaceC58229yxO<? super T, ? extends U> EZpvd;

    public C56294yAa(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends U> interfaceC58229yxO) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58229yxO;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAa$StateListAnimator */
    public static final class StateListAnimator<T, U> extends AbstractC58306yym<T, U> {
        public final InterfaceC58229yxO<? super T, ? extends U> djBIcL;

        public StateListAnimator(InterfaceC58256yxp<? super U> interfaceC58256yxp, InterfaceC58229yxO<? super T, ? extends U> interfaceC58229yxO) {
            super(interfaceC58256yxp);
            this.djBIcL = interfaceC58229yxO;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            if (this.KWHzl != 0) {
                this.EZpvd.onNext(null);
                return;
            }
            try {
                this.EZpvd.onNext((java.lang.Object) C58297yyd.AEQbTJ(this.djBIcL.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                AEQbTJ(th);
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public U poll() throws java.lang.Exception {
            T tPoll = this.copydefault.poll();
            if (tPoll != null) {
                return (U) C58297yyd.AEQbTJ(this.djBIcL.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}

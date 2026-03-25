package o;

/* JADX INFO: renamed from: o.yzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58324yzD<T, K> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58224yxJ<? super K, ? super K> KWHzl;
    public final InterfaceC58229yxO<? super T, K> copydefault;

    public C58324yzD(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, InterfaceC58224yxJ<? super K, ? super K> interfaceC58224yxJ) {
        super(interfaceC58255yxo);
        this.copydefault = interfaceC58229yxO;
        this.KWHzl = interfaceC58224yxJ;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp, this.copydefault, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yzD$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, K> extends AbstractC58306yym<T, T> {
        public boolean AYXKKw;
        public final InterfaceC58229yxO<? super T, K> djBIcL;
        public K gEmmrt;
        public final InterfaceC58224yxJ<? super K, ? super K> valueOf;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, InterfaceC58224yxJ<? super K, ? super K> interfaceC58224yxJ) {
            super(interfaceC58256yxp);
            this.djBIcL = interfaceC58229yxO;
            this.valueOf = interfaceC58224yxJ;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            if (this.KWHzl != 0) {
                this.EZpvd.onNext((java.lang.Object) t);
                return;
            }
            try {
                K kApply = this.djBIcL.apply(t);
                if (this.AYXKKw) {
                    boolean zAEQbTJ = this.valueOf.AEQbTJ(this.gEmmrt, kApply);
                    this.gEmmrt = kApply;
                    if (zAEQbTJ) {
                        return;
                    }
                } else {
                    this.AYXKKw = true;
                    this.gEmmrt = kApply;
                }
                this.EZpvd.onNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                AEQbTJ(th);
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            T tPoll;
            boolean zAEQbTJ;
            do {
                tPoll = this.copydefault.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.djBIcL.apply(tPoll);
                if (!this.AYXKKw) {
                    this.AYXKKw = true;
                    this.gEmmrt = kApply;
                    return tPoll;
                }
                zAEQbTJ = this.valueOf.AEQbTJ(this.gEmmrt, kApply);
                this.gEmmrt = kApply;
            } while (zAEQbTJ);
            return tPoll;
        }
    }
}

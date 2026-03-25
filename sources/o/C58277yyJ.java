package o;

/* JADX INFO: renamed from: o.yyJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58277yyJ<T, K> extends AbstractC58318yyy<T, T> {
    public final InterfaceC58224yxJ<? super K, ? super K> EZpvd;
    public final InterfaceC58229yxO<? super T, K> OLrzqt;

    public C58277yyJ(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, InterfaceC58224yxJ<? super K, ? super K> interfaceC58224yxJ) {
        super(abstractC58185ywX);
        this.OLrzqt = interfaceC58229yxO;
        this.EZpvd = interfaceC58224yxJ;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58296yyc) {
            this.KWHzl.copydefault(new Application((InterfaceC58296yyc) interfaceC60097zve, this.OLrzqt, this.EZpvd));
        } else {
            this.KWHzl.copydefault(new StateListAnimator(interfaceC60097zve, this.OLrzqt, this.EZpvd));
        }
    }

    /* JADX INFO: renamed from: o.yyJ$StateListAnimator */
    public static final class StateListAnimator<T, K> extends AbstractC56324yBd<T, T> implements InterfaceC58296yyc<T> {
        public boolean AEQbTJ;
        public final InterfaceC58224yxJ<? super K, ? super K> EZpvd;
        public K KWHzl;
        public final InterfaceC58229yxO<? super T, K> copydefault;

        public StateListAnimator(InterfaceC60097zve<? super T> interfaceC60097zve, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, InterfaceC58224yxJ<? super K, ? super K> interfaceC58224yxJ) {
            super(interfaceC60097zve);
            this.copydefault = interfaceC58229yxO;
            this.EZpvd = interfaceC58224yxJ;
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.gEmmrt.request(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58296yyc
        public boolean tryOnNext(T t) {
            if (this.AhwBna) {
                return false;
            }
            if (this.AYXKKw != 0) {
                this.valueOf.onNext((java.lang.Object) t);
                return true;
            }
            try {
                K kApply = this.copydefault.apply(t);
                if (this.AEQbTJ) {
                    boolean zAEQbTJ = this.EZpvd.AEQbTJ(this.KWHzl, kApply);
                    this.KWHzl = kApply;
                    if (zAEQbTJ) {
                        return false;
                    }
                } else {
                    this.AEQbTJ = true;
                    this.KWHzl = kApply;
                }
                this.valueOf.onNext((java.lang.Object) t);
                return true;
            } catch (java.lang.Throwable th) {
                OLrzqt(th);
                return true;
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            while (true) {
                T tPoll = this.djBIcL.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.copydefault.apply(tPoll);
                if (!this.AEQbTJ) {
                    this.AEQbTJ = true;
                    this.KWHzl = kApply;
                    return tPoll;
                }
                boolean zAEQbTJ = this.EZpvd.AEQbTJ(this.KWHzl, kApply);
                this.KWHzl = kApply;
                if (!zAEQbTJ) {
                    return tPoll;
                }
                if (this.AYXKKw != 1) {
                    this.gEmmrt.request(1L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yyJ$Application */
    public static final class Application<T, K> extends AbstractC56321yBa<T, T> {
        public K AEQbTJ;
        public final InterfaceC58224yxJ<? super K, ? super K> KWHzl;
        public final InterfaceC58229yxO<? super T, K> OLrzqt;
        public boolean copydefault;

        public Application(InterfaceC58296yyc<? super T> interfaceC58296yyc, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, InterfaceC58224yxJ<? super K, ? super K> interfaceC58224yxJ) {
            super(interfaceC58296yyc);
            this.OLrzqt = interfaceC58229yxO;
            this.KWHzl = interfaceC58224yxJ;
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.AhwBna.request(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58296yyc
        public boolean tryOnNext(T t) {
            if (this.valueOf) {
                return false;
            }
            if (this.djBIcL != 0) {
                return this.AYXKKw.tryOnNext((java.lang.Object) t);
            }
            try {
                K kApply = this.OLrzqt.apply(t);
                if (this.copydefault) {
                    boolean zAEQbTJ = this.KWHzl.AEQbTJ(this.AEQbTJ, kApply);
                    this.AEQbTJ = kApply;
                    if (zAEQbTJ) {
                        return false;
                    }
                } else {
                    this.copydefault = true;
                    this.AEQbTJ = kApply;
                }
                this.AYXKKw.onNext((java.lang.Object) t);
                return true;
            } catch (java.lang.Throwable th) {
                KWHzl(th);
                return true;
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            while (true) {
                T tPoll = this.gEmmrt.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.OLrzqt.apply(tPoll);
                if (!this.copydefault) {
                    this.copydefault = true;
                    this.AEQbTJ = kApply;
                    return tPoll;
                }
                boolean zAEQbTJ = this.KWHzl.AEQbTJ(this.AEQbTJ, kApply);
                this.AEQbTJ = kApply;
                if (!zAEQbTJ) {
                    return tPoll;
                }
                if (this.djBIcL != 1) {
                    this.AhwBna.request(1L);
                }
            }
        }
    }
}

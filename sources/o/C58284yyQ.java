package o;

/* JADX INFO: renamed from: o.yyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58284yyQ<T> extends AbstractC58318yyy<T, T> {
    public final InterfaceC58239yxY<? super T> OLrzqt;

    public C58284yyQ(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(abstractC58185ywX);
        this.OLrzqt = interfaceC58239yxY;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58296yyc) {
            this.KWHzl.copydefault(new ActionBar((InterfaceC58296yyc) interfaceC60097zve, this.OLrzqt));
        } else {
            this.KWHzl.copydefault(new Activity(interfaceC60097zve, this.OLrzqt));
        }
    }

    /* JADX INFO: renamed from: o.yyQ$Activity */
    public static final class Activity<T> extends AbstractC56324yBd<T, T> implements InterfaceC58296yyc<T> {
        public final InterfaceC58239yxY<? super T> KWHzl;

        public Activity(InterfaceC60097zve<? super T> interfaceC60097zve, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            super(interfaceC60097zve);
            this.KWHzl = interfaceC58239yxY;
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
                this.valueOf.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.KWHzl.test(t);
                if (zTest) {
                    this.valueOf.onNext((java.lang.Object) t);
                }
                return zTest;
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
            InterfaceC58298yye<T> interfaceC58298yye = this.djBIcL;
            InterfaceC58239yxY<? super T> interfaceC58239yxY = this.KWHzl;
            while (true) {
                T tPoll = interfaceC58298yye.poll();
                if (tPoll == null) {
                    return null;
                }
                if (interfaceC58239yxY.test(tPoll)) {
                    return tPoll;
                }
                if (this.AYXKKw == 2) {
                    interfaceC58298yye.request(1L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yyQ$ActionBar */
    public static final class ActionBar<T> extends AbstractC56321yBa<T, T> {
        public final InterfaceC58239yxY<? super T> OLrzqt;

        public ActionBar(InterfaceC58296yyc<? super T> interfaceC58296yyc, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            super(interfaceC58296yyc);
            this.OLrzqt = interfaceC58239yxY;
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
                return this.AYXKKw.tryOnNext(null);
            }
            try {
                return this.OLrzqt.test(t) && this.AYXKKw.tryOnNext((java.lang.Object) t);
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
            InterfaceC58298yye<T> interfaceC58298yye = this.gEmmrt;
            InterfaceC58239yxY<? super T> interfaceC58239yxY = this.OLrzqt;
            while (true) {
                T tPoll = interfaceC58298yye.poll();
                if (tPoll == null) {
                    return null;
                }
                if (interfaceC58239yxY.test(tPoll)) {
                    return tPoll;
                }
                if (this.djBIcL == 2) {
                    interfaceC58298yye.request(1L);
                }
            }
        }
    }
}

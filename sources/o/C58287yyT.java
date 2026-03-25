package o;

/* JADX INFO: renamed from: o.yyT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58287yyT<T, U> extends AbstractC58318yyy<T, U> {
    public final InterfaceC58229yxO<? super T, ? extends U> OLrzqt;

    public C58287yyT(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58229yxO<? super T, ? extends U> interfaceC58229yxO) {
        super(abstractC58185ywX);
        this.OLrzqt = interfaceC58229yxO;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super U> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58296yyc) {
            this.KWHzl.copydefault(new ActionBar((InterfaceC58296yyc) interfaceC60097zve, this.OLrzqt));
        } else {
            this.KWHzl.copydefault(new Activity(interfaceC60097zve, this.OLrzqt));
        }
    }

    /* JADX INFO: renamed from: o.yyT$Activity */
    public static final class Activity<T, U> extends AbstractC56324yBd<T, U> {
        public final InterfaceC58229yxO<? super T, ? extends U> OLrzqt;

        public Activity(InterfaceC60097zve<? super U> interfaceC60097zve, InterfaceC58229yxO<? super T, ? extends U> interfaceC58229yxO) {
            super(interfaceC60097zve);
            this.OLrzqt = interfaceC58229yxO;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (this.AhwBna) {
                return;
            }
            if (this.AYXKKw != 0) {
                this.valueOf.onNext(null);
                return;
            }
            try {
                this.valueOf.onNext((java.lang.Object) C58297yyd.AEQbTJ(this.OLrzqt.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                OLrzqt(th);
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public U poll() throws java.lang.Exception {
            T tPoll = this.djBIcL.poll();
            if (tPoll != null) {
                return (U) C58297yyd.AEQbTJ(this.OLrzqt.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.yyT$ActionBar */
    public static final class ActionBar<T, U> extends AbstractC56321yBa<T, U> {
        public final InterfaceC58229yxO<? super T, ? extends U> EZpvd;

        public ActionBar(InterfaceC58296yyc<? super U> interfaceC58296yyc, InterfaceC58229yxO<? super T, ? extends U> interfaceC58229yxO) {
            super(interfaceC58296yyc);
            this.EZpvd = interfaceC58229yxO;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (this.valueOf) {
                return;
            }
            if (this.djBIcL != 0) {
                this.AYXKKw.onNext(null);
                return;
            }
            try {
                this.AYXKKw.onNext((java.lang.Object) C58297yyd.AEQbTJ(this.EZpvd.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                KWHzl(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58296yyc
        public boolean tryOnNext(T t) {
            if (this.valueOf) {
                return false;
            }
            try {
                return this.AYXKKw.tryOnNext((java.lang.Object) C58297yyd.AEQbTJ(this.EZpvd.apply(t), "The mapper function returned a null value."));
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
        public U poll() throws java.lang.Exception {
            T tPoll = this.gEmmrt.poll();
            if (tPoll != null) {
                return (U) C58297yyd.AEQbTJ(this.EZpvd.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}

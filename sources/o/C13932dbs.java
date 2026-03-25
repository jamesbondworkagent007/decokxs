package o;

import com.okinc.network.okg.response.OKServerException;

/* JADX INFO: renamed from: o.dbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13932dbs<T> extends AbstractC58185ywX<T> {
    public final AbstractC58185ywX<T> AEQbTJ;
    public final Activity<T> OLrzqt;

    /* JADX INFO: renamed from: o.dbs$Activity */
    public interface Activity<T> {
        boolean EZpvd(OKServerException oKServerException, InterfaceC60097zve<T> interfaceC60097zve);
    }

    public C13932dbs(AbstractC58185ywX<T> abstractC58185ywX, Activity<T> activity) {
        this.AEQbTJ = (AbstractC58185ywX) C58297yyd.AEQbTJ(abstractC58185ywX, "source is null");
        this.OLrzqt = (Activity) C58297yyd.AEQbTJ(activity, "consumer is null");
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58296yyc) {
            this.AEQbTJ.copydefault(new StateListAnimator((InterfaceC58296yyc) interfaceC60097zve, this.OLrzqt));
        } else {
            this.AEQbTJ.copydefault(new Application(interfaceC60097zve, this.OLrzqt));
        }
    }

    /* JADX INFO: renamed from: o.dbs$Application */
    public static final class Application<T> extends AbstractC56324yBd<T, T> implements InterfaceC58296yyc<T> {
        public final Activity<T> OLrzqt;

        public Application(InterfaceC60097zve<? super T> interfaceC60097zve, Activity<T> activity) {
            super(interfaceC60097zve);
            this.OLrzqt = activity;
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.gEmmrt.request(1L);
        }

        @Override // o.AbstractC56324yBd, o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.AhwBna) {
                super.onError(th);
                return;
            }
            if (th instanceof OKServerException) {
                try {
                    if (this.OLrzqt.EZpvd((OKServerException) th, this)) {
                        return;
                    }
                    super.onError(th);
                    return;
                } catch (java.lang.Exception e) {
                    super.onError(new java.lang.Exception(e.getMessage(), th));
                    return;
                }
            }
            super.onError(th);
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
            this.valueOf.onNext((java.lang.Object) t);
            return true;
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            return this.djBIcL.poll();
        }
    }

    /* JADX INFO: renamed from: o.dbs$StateListAnimator */
    public static final class StateListAnimator<T> extends AbstractC56321yBa<T, T> {
        public final Activity<T> KWHzl;

        public StateListAnimator(InterfaceC58296yyc<? super T> interfaceC58296yyc, Activity<T> activity) {
            super(interfaceC58296yyc);
            this.KWHzl = activity;
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.AhwBna.request(1L);
        }

        @Override // o.AbstractC56321yBa, o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.valueOf) {
                super.onError(th);
                return;
            }
            if (th instanceof OKServerException) {
                try {
                    if (this.KWHzl.EZpvd((OKServerException) th, this)) {
                        return;
                    }
                    super.onError(th);
                    return;
                } catch (java.lang.Exception e) {
                    super.onError(new java.lang.Exception(e.getMessage(), th));
                    return;
                }
            }
            super.onError(th);
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
            return this.AYXKKw.tryOnNext((java.lang.Object) t);
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            return this.gEmmrt.poll();
        }
    }
}

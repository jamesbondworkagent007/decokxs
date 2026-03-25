package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: renamed from: o.yyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58279yyL<T> extends AbstractC58318yyy<T, T> {
    public final InterfaceC58227yxM<? super T> AEQbTJ;
    public final InterfaceC58222yxH EZpvd;
    public final InterfaceC58227yxM<? super java.lang.Throwable> OLrzqt;
    public final InterfaceC58222yxH copydefault;

    public C58279yyL(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
        super(abstractC58185ywX);
        this.AEQbTJ = interfaceC58227yxM;
        this.OLrzqt = interfaceC58227yxM2;
        this.EZpvd = interfaceC58222yxH;
        this.copydefault = interfaceC58222yxH2;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58296yyc) {
            this.KWHzl.copydefault(new Activity((InterfaceC58296yyc) interfaceC60097zve, this.AEQbTJ, this.OLrzqt, this.EZpvd, this.copydefault));
        } else {
            this.KWHzl.copydefault(new TaskDescription(interfaceC60097zve, this.AEQbTJ, this.OLrzqt, this.EZpvd, this.copydefault));
        }
    }

    /* JADX INFO: renamed from: o.yyL$TaskDescription */
    public static final class TaskDescription<T> extends AbstractC56324yBd<T, T> {
        public final InterfaceC58222yxH AEQbTJ;
        public final InterfaceC58227yxM<? super java.lang.Throwable> EZpvd;
        public final InterfaceC58227yxM<? super T> KWHzl;
        public final InterfaceC58222yxH copydefault;

        public TaskDescription(InterfaceC60097zve<? super T> interfaceC60097zve, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
            super(interfaceC60097zve);
            this.KWHzl = interfaceC58227yxM;
            this.EZpvd = interfaceC58227yxM2;
            this.AEQbTJ = interfaceC58222yxH;
            this.copydefault = interfaceC58222yxH2;
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
                this.KWHzl.accept(t);
                this.valueOf.onNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                OLrzqt(th);
            }
        }

        @Override // o.AbstractC56324yBd, o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.AhwBna) {
                yBG.copydefault(th);
                return;
            }
            this.AhwBna = true;
            try {
                this.EZpvd.accept(th);
                this.valueOf.onError(th);
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                this.valueOf.onError(new CompositeException(th, th2));
            }
            try {
                this.copydefault.run();
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                yBG.copydefault(th3);
            }
        }

        @Override // o.AbstractC56324yBd, o.InterfaceC60097zve
        public void onComplete() {
            if (this.AhwBna) {
                return;
            }
            try {
                this.AEQbTJ.run();
                this.AhwBna = true;
                this.valueOf.onComplete();
                try {
                    this.copydefault.run();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    yBG.copydefault(th);
                }
            } catch (java.lang.Throwable th2) {
                OLrzqt(th2);
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            CompositeException compositeException;
            try {
                T tPoll = this.djBIcL.poll();
                if (tPoll != null) {
                    try {
                        this.KWHzl.accept(tPoll);
                    } catch (java.lang.Throwable th) {
                        try {
                            C58218yxD.AEQbTJ(th);
                            try {
                                this.EZpvd.accept(th);
                                throw ExceptionHelper.copydefault(th);
                            } finally {
                            }
                        } finally {
                            this.copydefault.run();
                        }
                    }
                } else if (this.AYXKKw == 1) {
                    this.AEQbTJ.run();
                }
                return tPoll;
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                try {
                    this.EZpvd.accept(th2);
                    throw ExceptionHelper.copydefault(th2);
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yyL$Activity */
    public static final class Activity<T> extends AbstractC56321yBa<T, T> {
        public final InterfaceC58222yxH AEQbTJ;
        public final InterfaceC58227yxM<? super java.lang.Throwable> EZpvd;
        public final InterfaceC58227yxM<? super T> OLrzqt;
        public final InterfaceC58222yxH copydefault;

        public Activity(InterfaceC58296yyc<? super T> interfaceC58296yyc, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
            super(interfaceC58296yyc);
            this.OLrzqt = interfaceC58227yxM;
            this.EZpvd = interfaceC58227yxM2;
            this.AEQbTJ = interfaceC58222yxH;
            this.copydefault = interfaceC58222yxH2;
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
                this.OLrzqt.accept(t);
                this.AYXKKw.onNext((java.lang.Object) t);
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
                this.OLrzqt.accept(t);
                return this.AYXKKw.tryOnNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                KWHzl(th);
                return false;
            }
        }

        @Override // o.AbstractC56321yBa, o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.valueOf) {
                yBG.copydefault(th);
                return;
            }
            this.valueOf = true;
            try {
                this.EZpvd.accept(th);
                this.AYXKKw.onError(th);
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                this.AYXKKw.onError(new CompositeException(th, th2));
            }
            try {
                this.copydefault.run();
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                yBG.copydefault(th3);
            }
        }

        @Override // o.AbstractC56321yBa, o.InterfaceC60097zve
        public void onComplete() {
            if (this.valueOf) {
                return;
            }
            try {
                this.AEQbTJ.run();
                this.valueOf = true;
                this.AYXKKw.onComplete();
                try {
                    this.copydefault.run();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    yBG.copydefault(th);
                }
            } catch (java.lang.Throwable th2) {
                KWHzl(th2);
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            CompositeException compositeException;
            try {
                T tPoll = this.gEmmrt.poll();
                if (tPoll != null) {
                    try {
                        this.OLrzqt.accept(tPoll);
                    } catch (java.lang.Throwable th) {
                        try {
                            C58218yxD.AEQbTJ(th);
                            try {
                                this.EZpvd.accept(th);
                                throw ExceptionHelper.copydefault(th);
                            } finally {
                            }
                        } finally {
                            this.copydefault.run();
                        }
                    }
                } else if (this.djBIcL == 1) {
                    this.AEQbTJ.run();
                }
                return tPoll;
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                try {
                    this.EZpvd.accept(th2);
                    throw ExceptionHelper.copydefault(th2);
                } finally {
                }
            }
        }
    }
}

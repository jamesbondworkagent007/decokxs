package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yzm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58359yzm<T, U extends java.util.Collection<? super T>, B> extends AbstractC58349yzc<T, U> {
    public final Callable<? extends InterfaceC58255yxo<B>> EZpvd;
    public final Callable<U> KWHzl;

    public C58359yzm(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<? extends InterfaceC58255yxo<B>> callable, Callable<U> callable2) {
        super(interfaceC58255yxo);
        this.EZpvd = callable;
        this.KWHzl = callable2;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(new yBE(interfaceC58256yxp), this.KWHzl, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzm$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, U extends java.util.Collection<? super T>, B> extends AbstractC58316yyw<T, U, U> implements InterfaceC58217yxC {
        public U AYXKKw;
        public final Callable<U> AhwBna;
        public InterfaceC58217yxC DbNXlk;
        public final AtomicReference<InterfaceC58217yxC> gEmmrt;
        public final Callable<? extends InterfaceC58255yxo<B>> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public StateListAnimator(InterfaceC58256yxp<? super U> interfaceC58256yxp, Callable<U> callable, Callable<? extends InterfaceC58255yxo<B>> callable2) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.gEmmrt = new AtomicReference<>();
            this.AhwBna = callable;
            this.valueOf = callable2;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.DbNXlk, interfaceC58217yxC)) {
                this.DbNXlk = interfaceC58217yxC;
                InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
                try {
                    this.AYXKKw = (U) C58297yyd.AEQbTJ(this.AhwBna.call(), "The buffer supplied is null");
                    try {
                        InterfaceC58255yxo interfaceC58255yxo = (InterfaceC58255yxo) C58297yyd.AEQbTJ(this.valueOf.call(), "The boundary ObservableSource supplied is null");
                        Activity activity = new Activity(this);
                        this.gEmmrt.set(activity);
                        interfaceC58256yxp.onSubscribe(this);
                        if (this.KWHzl) {
                            return;
                        }
                        interfaceC58255yxo.subscribe(activity);
                    } catch (java.lang.Throwable th) {
                        C58218yxD.AEQbTJ(th);
                        this.KWHzl = true;
                        interfaceC58217yxC.dispose();
                        EmptyDisposable.error(th, interfaceC58256yxp);
                    }
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    this.KWHzl = true;
                    interfaceC58217yxC.dispose();
                    EmptyDisposable.error(th2, interfaceC58256yxp);
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            synchronized (this) {
                U u = this.AYXKKw;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            dispose();
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            synchronized (this) {
                U u = this.AYXKKw;
                if (u == null) {
                    return;
                }
                this.AYXKKw = null;
                this.EZpvd.offer(u);
                this.copydefault = true;
                if (KWHzl()) {
                    yBB.copydefault((InterfaceC58299yyf) this.EZpvd, (InterfaceC58256yxp) this.OLrzqt, false, (InterfaceC58217yxC) this, (InterfaceC56342yBv) this);
                }
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.DbNXlk.dispose();
            djBIcL();
            if (KWHzl()) {
                this.EZpvd.clear();
            }
        }

        public void djBIcL() {
            DisposableHelper.dispose(this.gEmmrt);
        }

        public void gEmmrt() {
            try {
                U u = (U) C58297yyd.AEQbTJ(this.AhwBna.call(), "The buffer supplied is null");
                try {
                    InterfaceC58255yxo interfaceC58255yxo = (InterfaceC58255yxo) C58297yyd.AEQbTJ(this.valueOf.call(), "The boundary ObservableSource supplied is null");
                    Activity activity = new Activity(this);
                    if (DisposableHelper.replace(this.gEmmrt, activity)) {
                        synchronized (this) {
                            U u2 = this.AYXKKw;
                            if (u2 == null) {
                                return;
                            }
                            this.AYXKKw = u;
                            interfaceC58255yxo.subscribe(activity);
                            KWHzl(u2, false, this);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.KWHzl = true;
                    this.DbNXlk.dispose();
                    this.OLrzqt.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                dispose();
                this.OLrzqt.onError(th2);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yxp;Ljava/lang/Object;)V */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            this.OLrzqt.onNext((java.lang.Object) u);
        }
    }

    /* JADX INFO: renamed from: o.yzm$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, U extends java.util.Collection<? super T>, B> extends AbstractC56345yBy<B> {
        public final StateListAnimator<T, U, B> AEQbTJ;
        public boolean copydefault;

        public Activity(StateListAnimator<T, U, B> stateListAnimator) {
            this.AEQbTJ = stateListAnimator;
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(B b) {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            dispose();
            this.AEQbTJ.gEmmrt();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
            } else {
                this.copydefault = true;
                this.AEQbTJ.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.AEQbTJ.gEmmrt();
        }
    }
}

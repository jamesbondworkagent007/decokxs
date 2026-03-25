package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58360yzn<T, U extends java.util.Collection<? super T>, B> extends AbstractC58349yzc<T, U> {
    public final Callable<U> KWHzl;
    public final InterfaceC58255yxo<B> copydefault;

    public C58360yzn(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58255yxo<B> interfaceC58255yxo2, Callable<U> callable) {
        super(interfaceC58255yxo);
        this.copydefault = interfaceC58255yxo2;
        this.KWHzl = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Activity(new yBE(interfaceC58256yxp), this.KWHzl, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yzn$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, U extends java.util.Collection<? super T>, B> extends AbstractC58316yyw<T, U, U> implements InterfaceC58217yxC {
        public final Callable<U> AYXKKw;
        public U AhwBna;
        public InterfaceC58217yxC DbNXlk;
        public final InterfaceC58255yxo<B> gEmmrt;
        public InterfaceC58217yxC valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public Activity(InterfaceC58256yxp<? super U> interfaceC58256yxp, Callable<U> callable, InterfaceC58255yxo<B> interfaceC58255yxo) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.AYXKKw = callable;
            this.gEmmrt = interfaceC58255yxo;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.DbNXlk, interfaceC58217yxC)) {
                this.DbNXlk = interfaceC58217yxC;
                try {
                    this.AhwBna = (U) C58297yyd.AEQbTJ(this.AYXKKw.call(), "The buffer supplied is null");
                    StateListAnimator stateListAnimator = new StateListAnimator(this);
                    this.valueOf = stateListAnimator;
                    this.OLrzqt.onSubscribe(this);
                    if (this.KWHzl) {
                        return;
                    }
                    this.gEmmrt.subscribe(stateListAnimator);
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.KWHzl = true;
                    interfaceC58217yxC.dispose();
                    EmptyDisposable.error(th, this.OLrzqt);
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            synchronized (this) {
                U u = this.AhwBna;
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
                U u = this.AhwBna;
                if (u == null) {
                    return;
                }
                this.AhwBna = null;
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
            this.valueOf.dispose();
            this.DbNXlk.dispose();
            if (KWHzl()) {
                this.EZpvd.clear();
            }
        }

        public void djBIcL() {
            try {
                U u = (U) C58297yyd.AEQbTJ(this.AYXKKw.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.AhwBna;
                    if (u2 == null) {
                        return;
                    }
                    this.AhwBna = u;
                    KWHzl(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                dispose();
                this.OLrzqt.onError(th);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yxp;Ljava/lang/Object;)V */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            this.OLrzqt.onNext((java.lang.Object) u);
        }
    }

    /* JADX INFO: renamed from: o.yzn$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, U extends java.util.Collection<? super T>, B> extends AbstractC56345yBy<B> {
        public final Activity<T, U, B> KWHzl;

        public StateListAnimator(Activity<T, U, B> activity) {
            this.KWHzl = activity;
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(B b) {
            this.KWHzl.djBIcL();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl.onComplete();
        }
    }
}

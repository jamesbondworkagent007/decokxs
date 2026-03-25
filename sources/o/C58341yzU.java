package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58341yzU<T, S> extends AbstractC58247yxg<T> {
    public final Callable<S> AEQbTJ;
    public final InterfaceC58227yxM<? super S> EZpvd;
    public final InterfaceC58223yxI<S, InterfaceC58181ywT<T>, S> copydefault;

    public C58341yzU(Callable<S> callable, InterfaceC58223yxI<S, InterfaceC58181ywT<T>, S> interfaceC58223yxI, InterfaceC58227yxM<? super S> interfaceC58227yxM) {
        this.AEQbTJ = callable;
        this.copydefault = interfaceC58223yxI;
        this.EZpvd = interfaceC58227yxM;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        try {
            Activity activity = new Activity(interfaceC58256yxp, this.copydefault, this.EZpvd, this.AEQbTJ.call());
            interfaceC58256yxp.onSubscribe(activity);
            activity.copydefault();
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }

    /* JADX INFO: renamed from: o.yzU$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, S> implements InterfaceC58181ywT<T>, InterfaceC58217yxC {
        public volatile boolean AEQbTJ;
        public boolean AhwBna;
        public final InterfaceC58223yxI<S, ? super InterfaceC58181ywT<T>, S> EZpvd;
        public final InterfaceC58256yxp<? super T> KWHzl;
        public boolean OLrzqt;
        public final InterfaceC58227yxM<? super S> copydefault;
        public S valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ;
        }

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58223yxI<S, ? super InterfaceC58181ywT<T>, S> interfaceC58223yxI, InterfaceC58227yxM<? super S> interfaceC58227yxM, S s) {
            this.KWHzl = interfaceC58256yxp;
            this.EZpvd = interfaceC58223yxI;
            this.copydefault = interfaceC58227yxM;
            this.valueOf = s;
        }

        public void copydefault() {
            S sApply = this.valueOf;
            if (this.AEQbTJ) {
                this.valueOf = null;
                OLrzqt(sApply);
                return;
            }
            InterfaceC58223yxI<S, ? super InterfaceC58181ywT<T>, S> interfaceC58223yxI = this.EZpvd;
            while (!this.AEQbTJ) {
                this.OLrzqt = false;
                try {
                    sApply = interfaceC58223yxI.apply(sApply, this);
                    if (this.AhwBna) {
                        this.AEQbTJ = true;
                        this.valueOf = null;
                        OLrzqt(sApply);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.valueOf = null;
                    this.AEQbTJ = true;
                    onError(th);
                    OLrzqt(sApply);
                    return;
                }
            }
            this.valueOf = null;
            OLrzqt(sApply);
        }

        public final void OLrzqt(S s) {
            try {
                this.copydefault.accept(s);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(th);
            }
        }

        @Override // o.InterfaceC58181ywT
        public void onNext(T t) {
            if (this.AhwBna) {
                return;
            }
            if (this.OLrzqt) {
                onError(new java.lang.IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.OLrzqt = true;
                this.KWHzl.onNext(t);
            }
        }

        @Override // o.InterfaceC58181ywT
        public void onError(java.lang.Throwable th) {
            if (this.AhwBna) {
                yBG.copydefault(th);
                return;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.AhwBna = true;
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58181ywT
        public void onComplete() {
            if (this.AhwBna) {
                return;
            }
            this.AhwBna = true;
            this.KWHzl.onComplete();
        }
    }
}

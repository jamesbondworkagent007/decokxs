package o;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58337yzQ<T> extends AbstractC58247yxg<T> {
    public final java.lang.Iterable<? extends T> AEQbTJ;

    public C58337yzQ(java.lang.Iterable<? extends T> iterable) {
        this.AEQbTJ = iterable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        try {
            java.util.Iterator<? extends T> it = this.AEQbTJ.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(interfaceC58256yxp);
                    return;
                }
                Activity activity = new Activity(interfaceC58256yxp, it);
                interfaceC58256yxp.onSubscribe(activity);
                if (activity.OLrzqt) {
                    return;
                }
                activity.AEQbTJ();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                EmptyDisposable.error(th, interfaceC58256yxp);
            }
        } catch (java.lang.Throwable th2) {
            C58218yxD.AEQbTJ(th2);
            EmptyDisposable.error(th2, interfaceC58256yxp);
        }
    }

    /* JADX INFO: renamed from: o.yzQ$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity<T> extends AbstractC58307yyn<T> {
        public boolean AEQbTJ;
        public final InterfaceC58256yxp<? super T> EZpvd;
        public volatile boolean KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;
        public final java.util.Iterator<? extends T> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58305yyl
        public void clear() {
            this.copydefault = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58305yyl
        public boolean isEmpty() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.OLrzqt = true;
            return 1;
        }

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, java.util.Iterator<? extends T> it) {
            this.EZpvd = interfaceC58256yxp;
            this.gEmmrt = it;
        }

        public void AEQbTJ() {
            while (!isDisposed()) {
                try {
                    this.EZpvd.onNext(C58297yyd.AEQbTJ((java.lang.Object) this.gEmmrt.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.gEmmrt.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.EZpvd.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        C58218yxD.AEQbTJ(th);
                        this.EZpvd.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    this.EZpvd.onError(th2);
                    return;
                }
            }
        }

        @Override // o.InterfaceC58305yyl
        public T poll() {
            if (this.copydefault) {
                return null;
            }
            if (!this.AEQbTJ) {
                this.AEQbTJ = true;
            } else if (!this.gEmmrt.hasNext()) {
                this.copydefault = true;
                return null;
            }
            return (T) C58297yyd.AEQbTJ((java.lang.Object) this.gEmmrt.next(), "The iterator returned a null value");
        }
    }
}

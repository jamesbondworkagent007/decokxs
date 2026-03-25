package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: renamed from: o.yAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56303yAj<T> extends AbstractC58349yzc<T, T> {
    public final boolean EZpvd;
    public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends T>> KWHzl;

    public C56303yAj(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends T>> interfaceC58229yxO, boolean z) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58229yxO;
        this.EZpvd = z;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        Activity activity = new Activity(interfaceC58256yxp, this.KWHzl, this.EZpvd);
        interfaceC58256yxp.onSubscribe(activity.EZpvd);
        this.OLrzqt.subscribe(activity);
    }

    /* JADX INFO: renamed from: o.yAj$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T> {
        public boolean AEQbTJ;
        public final SequentialDisposable EZpvd = new SequentialDisposable();
        public final boolean KWHzl;
        public final InterfaceC58256yxp<? super T> OLrzqt;
        public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends T>> copydefault;
        public boolean gEmmrt;

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends T>> interfaceC58229yxO, boolean z) {
            this.OLrzqt = interfaceC58256yxp;
            this.copydefault = interfaceC58229yxO;
            this.KWHzl = z;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd.replace(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            this.OLrzqt.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.gEmmrt) {
                if (this.AEQbTJ) {
                    yBG.copydefault(th);
                    return;
                } else {
                    this.OLrzqt.onError(th);
                    return;
                }
            }
            this.gEmmrt = true;
            if (this.KWHzl && !(th instanceof java.lang.Exception)) {
                this.OLrzqt.onError(th);
                return;
            }
            try {
                InterfaceC58255yxo<? extends T> interfaceC58255yxoApply = this.copydefault.apply(th);
                if (interfaceC58255yxoApply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.OLrzqt.onError(nullPointerException);
                    return;
                }
                interfaceC58255yxoApply.subscribe(this);
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                this.OLrzqt.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            this.gEmmrt = true;
            this.OLrzqt.onComplete();
        }
    }
}

package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56301yAh<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> AEQbTJ;

    public C56301yAh(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO) {
        super(interfaceC58255yxo);
        this.AEQbTJ = interfaceC58229yxO;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58256yxp, this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yAh$TaskDescription */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> OLrzqt;
        public final InterfaceC58256yxp<? super T> copydefault;

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO) {
            this.copydefault = interfaceC58256yxp;
            this.OLrzqt = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.copydefault.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            try {
                T tApply = this.OLrzqt.apply(th);
                if (tApply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.copydefault.onError(nullPointerException);
                } else {
                    this.copydefault.onNext(tApply);
                    this.copydefault.onComplete();
                }
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                this.copydefault.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault.onComplete();
        }
    }
}

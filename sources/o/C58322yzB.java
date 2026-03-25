package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: renamed from: o.yzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58322yzB<T> extends AbstractC58349yzc<T, T> {
    public C58322yzB(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzB$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58256yxp<? super T> EZpvd;
        public InterfaceC58217yxC OLrzqt;

        public StateListAnimator(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.EZpvd = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
            this.OLrzqt = EmptyComponent.INSTANCE;
            this.EZpvd = EmptyComponent.asObserver();
            interfaceC58217yxC.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.EZpvd.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            InterfaceC58256yxp<? super T> interfaceC58256yxp = this.EZpvd;
            this.OLrzqt = EmptyComponent.INSTANCE;
            this.EZpvd = EmptyComponent.asObserver();
            interfaceC58256yxp.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            InterfaceC58256yxp<? super T> interfaceC58256yxp = this.EZpvd;
            this.OLrzqt = EmptyComponent.INSTANCE;
            this.EZpvd = EmptyComponent.asObserver();
            interfaceC58256yxp.onComplete();
        }
    }
}

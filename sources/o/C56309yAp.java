package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56309yAp<T> extends AbstractC58260yxt<T> {
    public final T EZpvd;
    public final InterfaceC58255yxo<? extends T> KWHzl;

    public C56309yAp(InterfaceC58255yxo<? extends T> interfaceC58255yxo, T t) {
        this.KWHzl = interfaceC58255yxo;
        this.EZpvd = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.KWHzl.subscribe(new StateListAnimator(interfaceC58258yxr, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAp$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super T> AEQbTJ;
        public boolean EZpvd;
        public final T KWHzl;
        public T OLrzqt;
        public InterfaceC58217yxC copydefault;

        public StateListAnimator(InterfaceC58258yxr<? super T> interfaceC58258yxr, T t) {
            this.AEQbTJ = interfaceC58258yxr;
            this.KWHzl = t;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.copydefault, interfaceC58217yxC)) {
                this.copydefault = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.EZpvd) {
                return;
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = t;
                return;
            }
            this.EZpvd = true;
            this.copydefault.dispose();
            this.AEQbTJ.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.EZpvd) {
                yBG.copydefault(th);
            } else {
                this.EZpvd = true;
                this.AEQbTJ.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            T t = this.OLrzqt;
            this.OLrzqt = null;
            if (t == null) {
                t = this.KWHzl;
            }
            if (t != null) {
                this.AEQbTJ.onSuccess(t);
            } else {
                this.AEQbTJ.onError(new NoSuchElementException());
            }
        }
    }
}

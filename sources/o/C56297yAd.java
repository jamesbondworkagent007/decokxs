package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yAd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56297yAd<T> extends AbstractC58260yxt<T> {
    public final InterfaceC58255yxo<T> OLrzqt;
    public final T copydefault;

    public C56297yAd(InterfaceC58255yxo<T> interfaceC58255yxo, T t) {
        this.OLrzqt = interfaceC58255yxo;
        this.copydefault = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58258yxr, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yAd$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final T KWHzl;
        public final InterfaceC58258yxr<? super T> OLrzqt;
        public T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.copydefault = t;
        }

        public TaskDescription(InterfaceC58258yxr<? super T> interfaceC58258yxr, T t) {
            this.OLrzqt = interfaceC58258yxr;
            this.KWHzl = t;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
            this.AEQbTJ = DisposableHelper.DISPOSED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ == DisposableHelper.DISPOSED;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AEQbTJ = DisposableHelper.DISPOSED;
            this.copydefault = null;
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.AEQbTJ = DisposableHelper.DISPOSED;
            T t = this.copydefault;
            if (t != null) {
                this.copydefault = null;
                this.OLrzqt.onSuccess(t);
                return;
            }
            T t2 = this.KWHzl;
            if (t2 != null) {
                this.OLrzqt.onSuccess(t2);
            } else {
                this.OLrzqt.onError(new NoSuchElementException());
            }
        }
    }
}

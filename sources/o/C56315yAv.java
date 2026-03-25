package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yAv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56315yAv<T> extends AbstractC58349yzc<T, T> {
    public final long KWHzl;

    public C56315yAv(InterfaceC58255yxo<T> interfaceC58255yxo, long j) {
        super(interfaceC58255yxo);
        this.KWHzl = j;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Application(interfaceC58256yxp, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yAv$Application */
    public static final class Application<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public long KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public boolean copydefault;

        public Application(InterfaceC58256yxp<? super T> interfaceC58256yxp, long j) {
            this.AEQbTJ = interfaceC58256yxp;
            this.KWHzl = j;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                if (this.KWHzl == 0) {
                    this.copydefault = true;
                    interfaceC58217yxC.dispose();
                    EmptyDisposable.complete(this.AEQbTJ);
                    return;
                }
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            long j = this.KWHzl;
            long j2 = j - 1;
            this.KWHzl = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.AEQbTJ.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
                return;
            }
            this.copydefault = true;
            this.OLrzqt.dispose();
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.OLrzqt.dispose();
            this.AEQbTJ.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.OLrzqt.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }
    }
}

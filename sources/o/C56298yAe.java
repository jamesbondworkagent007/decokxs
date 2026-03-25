package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56298yAe<T> extends AbstractC58349yzc<T, C58248yxh<T>> {
    public C56298yAe(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super C58248yxh<T>> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yAe$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super C58248yxh<T>> EZpvd;
        public InterfaceC58217yxC KWHzl;

        public TaskDescription(InterfaceC58256yxp<? super C58248yxh<T>> interfaceC58256yxp) {
            this.EZpvd = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.KWHzl, interfaceC58217yxC)) {
                this.KWHzl = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.EZpvd.onNext(C58248yxh.AEQbTJ(t));
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.EZpvd.onNext(C58248yxh.OLrzqt(th));
            this.EZpvd.onComplete();
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.EZpvd.onNext(C58248yxh.AEQbTJ());
            this.EZpvd.onComplete();
        }
    }
}

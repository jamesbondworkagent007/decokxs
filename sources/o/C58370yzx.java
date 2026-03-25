package o;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: renamed from: o.yzx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58370yzx<T, U> extends AbstractC58247yxg<T> {
    public final InterfaceC58255yxo<U> OLrzqt;
    public final InterfaceC58255yxo<? extends T> copydefault;

    public C58370yzx(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<U> interfaceC58255yxo2) {
        this.copydefault = interfaceC58255yxo;
        this.OLrzqt = interfaceC58255yxo2;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        interfaceC58256yxp.onSubscribe(sequentialDisposable);
        this.OLrzqt.subscribe(new TaskDescription(sequentialDisposable, interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzx$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public final class TaskDescription implements InterfaceC58256yxp<U> {
        public final SequentialDisposable EZpvd;
        public final InterfaceC58256yxp<? super T> KWHzl;
        public boolean OLrzqt;

        public TaskDescription(SequentialDisposable sequentialDisposable, InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.EZpvd = sequentialDisposable;
            this.KWHzl = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd.update(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(U u) {
            onComplete();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.OLrzqt) {
                yBG.copydefault(th);
            } else {
                this.OLrzqt = true;
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            C58370yzx.this.copydefault.subscribe(new C1021TaskDescription());
        }

        /* JADX INFO: renamed from: o.yzx$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final class C1021TaskDescription implements InterfaceC58256yxp<T> {
            public C1021TaskDescription() {
            }

            @Override // o.InterfaceC58256yxp
            public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
                TaskDescription.this.EZpvd.update(interfaceC58217yxC);
            }

            @Override // o.InterfaceC58256yxp
            public void onNext(T t) {
                TaskDescription.this.KWHzl.onNext(t);
            }

            @Override // o.InterfaceC58256yxp
            public void onError(java.lang.Throwable th) {
                TaskDescription.this.KWHzl.onError(th);
            }

            @Override // o.InterfaceC58256yxp
            public void onComplete() {
                TaskDescription.this.KWHzl.onComplete();
            }
        }
    }
}

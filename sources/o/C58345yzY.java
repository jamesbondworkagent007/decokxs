package o;

/* JADX INFO: renamed from: o.yzY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58345yzY<T> extends AbstractC58349yzc<T, T> {
    public C58345yzY(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzY$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> EZpvd;
        public InterfaceC58217yxC copydefault;

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
        }

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.EZpvd = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.copydefault = interfaceC58217yxC;
            this.EZpvd.onSubscribe(this);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.EZpvd.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.EZpvd.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault.isDisposed();
        }
    }
}

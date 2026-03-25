package o;

/* JADX INFO: loaded from: classes13.dex */
public final class yAG<T> extends AbstractC58260yxt<T> {
    public final InterfaceC58227yxM<? super T> EZpvd;
    public final InterfaceC58261yxu<T> KWHzl;

    public yAG(InterfaceC58261yxu<T> interfaceC58261yxu, InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        this.KWHzl = interfaceC58261yxu;
        this.EZpvd = interfaceC58227yxM;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.KWHzl.copydefault(new TaskDescription(interfaceC58258yxr));
    }

    public final class TaskDescription implements InterfaceC58258yxr<T> {
        public final InterfaceC58258yxr<? super T> KWHzl;

        public TaskDescription(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
            this.KWHzl = interfaceC58258yxr;
        }

        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.KWHzl.onSubscribe(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58258yxr
        public void onSuccess(T t) {
            try {
                yAG.this.EZpvd.accept(t);
                this.KWHzl.onSuccess(t);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            this.KWHzl.onError(th);
        }
    }
}

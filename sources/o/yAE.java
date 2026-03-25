package o;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes13.dex */
public final class yAE<T> extends AbstractC58260yxt<T> {
    public final InterfaceC58227yxM<? super java.lang.Throwable> AEQbTJ;
    public final InterfaceC58261yxu<T> copydefault;

    public yAE(InterfaceC58261yxu<T> interfaceC58261yxu, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        this.copydefault = interfaceC58261yxu;
        this.AEQbTJ = interfaceC58227yxM;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.copydefault.copydefault(new Application(interfaceC58258yxr));
    }

    public final class Application implements InterfaceC58258yxr<T> {
        public final InterfaceC58258yxr<? super T> EZpvd;

        public Application(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
            this.EZpvd = interfaceC58258yxr;
        }

        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd.onSubscribe(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58258yxr
        public void onSuccess(T t) {
            this.EZpvd.onSuccess(t);
        }

        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            try {
                yAE.this.AEQbTJ.accept(th);
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                th = new CompositeException(th, th2);
            }
            this.EZpvd.onError(th);
        }
    }
}

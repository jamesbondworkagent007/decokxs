package o;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes13.dex */
public final class yAS<T> extends AbstractC58260yxt<T> {
    public final InterfaceC58261yxu<? extends T> AEQbTJ;
    public final T EZpvd;
    public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> copydefault;

    public yAS(InterfaceC58261yxu<? extends T> interfaceC58261yxu, InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO, T t) {
        this.AEQbTJ = interfaceC58261yxu;
        this.copydefault = interfaceC58229yxO;
        this.EZpvd = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.AEQbTJ.copydefault(new ActionBar(interfaceC58258yxr));
    }

    public final class ActionBar implements InterfaceC58258yxr<T> {
        public final InterfaceC58258yxr<? super T> AEQbTJ;

        public ActionBar(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
            this.AEQbTJ = interfaceC58258yxr;
        }

        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            T tApply;
            yAS yas = yAS.this;
            InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO = yas.copydefault;
            if (interfaceC58229yxO != null) {
                try {
                    tApply = interfaceC58229yxO.apply(th);
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    this.AEQbTJ.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                tApply = yas.EZpvd;
            }
            if (tApply == null) {
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.AEQbTJ.onError(nullPointerException);
                return;
            }
            this.AEQbTJ.onSuccess(tApply);
        }

        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.AEQbTJ.onSubscribe(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58258yxr
        public void onSuccess(T t) {
            this.AEQbTJ.onSuccess(t);
        }
    }
}

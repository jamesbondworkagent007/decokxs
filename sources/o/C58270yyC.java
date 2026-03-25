package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yyC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58270yyC<T> extends AbstractC58260yxt<T> {
    public final T AEQbTJ;
    public final Callable<? extends T> OLrzqt;
    public final InterfaceC58180ywS copydefault;

    public C58270yyC(InterfaceC58180ywS interfaceC58180ywS, Callable<? extends T> callable, T t) {
        this.copydefault = interfaceC58180ywS;
        this.AEQbTJ = t;
        this.OLrzqt = callable;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.copydefault.copydefault(new StateListAnimator(interfaceC58258yxr));
    }

    /* JADX INFO: renamed from: o.yyC$StateListAnimator */
    public final class StateListAnimator implements InterfaceC58179ywR {
        public final InterfaceC58258yxr<? super T> EZpvd;

        public StateListAnimator(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
            this.EZpvd = interfaceC58258yxr;
        }

        @Override // o.InterfaceC58179ywR
        public void onComplete() {
            T tCall;
            C58270yyC c58270yyC = C58270yyC.this;
            Callable<? extends T> callable = c58270yyC.OLrzqt;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.EZpvd.onError(th);
                    return;
                }
            } else {
                tCall = c58270yyC.AEQbTJ;
            }
            if (tCall == null) {
                this.EZpvd.onError(new java.lang.NullPointerException("The value supplied is null"));
            } else {
                this.EZpvd.onSuccess(tCall);
            }
        }

        @Override // o.InterfaceC58179ywR
        public void onError(java.lang.Throwable th) {
            this.EZpvd.onError(th);
        }

        @Override // o.InterfaceC58179ywR
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd.onSubscribe(interfaceC58217yxC);
        }
    }
}

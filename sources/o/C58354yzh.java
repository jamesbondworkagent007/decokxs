package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58354yzh<T> extends AbstractC58260yxt<java.lang.Boolean> implements InterfaceC58240yxZ<java.lang.Boolean> {
    public final InterfaceC58239yxY<? super T> KWHzl;
    public final InterfaceC58255yxo<T> OLrzqt;

    public C58354yzh(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        this.OLrzqt = interfaceC58255yxo;
        this.KWHzl = interfaceC58239yxY;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super java.lang.Boolean> interfaceC58258yxr) {
        this.OLrzqt.subscribe(new Activity(interfaceC58258yxr, this.KWHzl));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<java.lang.Boolean> copydefault() {
        return yBG.EZpvd(new C58357yzk(this.OLrzqt, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yzh$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super java.lang.Boolean> EZpvd;
        public boolean KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public final InterfaceC58239yxY<? super T> copydefault;

        public Activity(InterfaceC58258yxr<? super java.lang.Boolean> interfaceC58258yxr, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.EZpvd = interfaceC58258yxr;
            this.copydefault = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl) {
                return;
            }
            try {
                if (this.copydefault.test(t)) {
                    return;
                }
                this.KWHzl = true;
                this.OLrzqt.dispose();
                this.EZpvd.onSuccess(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.KWHzl) {
                yBG.copydefault(th);
            } else {
                this.KWHzl = true;
                this.EZpvd.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.EZpvd.onSuccess(java.lang.Boolean.TRUE);
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

package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58362yzp<T> extends AbstractC58260yxt<java.lang.Boolean> implements InterfaceC58240yxZ<java.lang.Boolean> {
    public final InterfaceC58239yxY<? super T> AEQbTJ;
    public final InterfaceC58255yxo<T> KWHzl;

    public C58362yzp(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        this.KWHzl = interfaceC58255yxo;
        this.AEQbTJ = interfaceC58239yxY;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super java.lang.Boolean> interfaceC58258yxr) {
        this.KWHzl.subscribe(new TaskDescription(interfaceC58258yxr, this.AEQbTJ));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<java.lang.Boolean> copydefault() {
        return yBG.EZpvd(new C58363yzq(this.KWHzl, this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yzp$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super java.lang.Boolean> EZpvd;
        public final InterfaceC58239yxY<? super T> KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public boolean copydefault;

        public TaskDescription(InterfaceC58258yxr<? super java.lang.Boolean> interfaceC58258yxr, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.EZpvd = interfaceC58258yxr;
            this.KWHzl = interfaceC58239yxY;
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
            if (this.copydefault) {
                return;
            }
            try {
                if (this.KWHzl.test(t)) {
                    this.copydefault = true;
                    this.OLrzqt.dispose();
                    this.EZpvd.onSuccess(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
            } else {
                this.copydefault = true;
                this.EZpvd.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.EZpvd.onSuccess(java.lang.Boolean.FALSE);
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

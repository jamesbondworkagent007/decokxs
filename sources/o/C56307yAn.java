package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56307yAn<T, R> extends AbstractC58260yxt<R> {
    public final R AEQbTJ;
    public final InterfaceC58223yxI<R, ? super T, R> EZpvd;
    public final InterfaceC58255yxo<T> OLrzqt;

    public C56307yAn(InterfaceC58255yxo<T> interfaceC58255yxo, R r, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        this.OLrzqt = interfaceC58255yxo;
        this.AEQbTJ = r;
        this.EZpvd = interfaceC58223yxI;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super R> interfaceC58258yxr) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58258yxr, this.EZpvd, this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yAn$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, R> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super R> EZpvd;
        public InterfaceC58217yxC KWHzl;
        public R OLrzqt;
        public final InterfaceC58223yxI<R, ? super T, R> copydefault;

        public ActionBar(InterfaceC58258yxr<? super R> interfaceC58258yxr, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI, R r) {
            this.EZpvd = interfaceC58258yxr;
            this.OLrzqt = r;
            this.copydefault = interfaceC58223yxI;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.KWHzl, interfaceC58217yxC)) {
                this.KWHzl = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            R r = this.OLrzqt;
            if (r != null) {
                try {
                    this.OLrzqt = (R) C58297yyd.AEQbTJ(this.copydefault.apply(r, t), "The reducer returned a null value");
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.KWHzl.dispose();
                    onError(th);
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.OLrzqt != null) {
                this.OLrzqt = null;
                this.EZpvd.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            R r = this.OLrzqt;
            if (r != null) {
                this.OLrzqt = null;
                this.EZpvd.onSuccess(r);
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
    }
}

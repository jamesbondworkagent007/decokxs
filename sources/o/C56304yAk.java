package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56304yAk<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58223yxI<T, T, T> EZpvd;

    public C56304yAk(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58223yxI;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAk$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58223yxI<T, T, T> AEQbTJ;
        public final InterfaceC58256yxp<? super T> EZpvd;
        public boolean KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public T copydefault;

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
            this.EZpvd = interfaceC58256yxp;
            this.AEQbTJ = interfaceC58223yxI;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.OLrzqt.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl) {
                return;
            }
            InterfaceC58256yxp<? super T> interfaceC58256yxp = this.EZpvd;
            T t2 = this.copydefault;
            if (t2 == null) {
                this.copydefault = t;
                interfaceC58256yxp.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) C58297yyd.AEQbTJ((java.lang.Object) this.AEQbTJ.apply(t2, t), "The value returned by the accumulator is null");
                this.copydefault = r4;
                interfaceC58256yxp.onNext(r4);
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
            this.EZpvd.onComplete();
        }
    }
}

package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58329yzI<T> extends AbstractC58349yzc<T, T> {
    public final long AEQbTJ;
    public final T EZpvd;
    public final boolean copydefault;

    public C58329yzI(InterfaceC58255yxo<T> interfaceC58255yxo, long j, T t, boolean z) {
        super(interfaceC58255yxo);
        this.AEQbTJ = j;
        this.EZpvd = t;
        this.copydefault = z;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp, this.AEQbTJ, this.EZpvd, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yzI$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public final T EZpvd;
        public long KWHzl;
        public final boolean OLrzqt;
        public boolean copydefault;
        public final long djBIcL;
        public InterfaceC58217yxC gEmmrt;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp, long j, T t, boolean z) {
            this.AEQbTJ = interfaceC58256yxp;
            this.djBIcL = j;
            this.EZpvd = t;
            this.OLrzqt = z;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.gEmmrt, interfaceC58217yxC)) {
                this.gEmmrt = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.gEmmrt.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.gEmmrt.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            long j = this.KWHzl;
            if (j != this.djBIcL) {
                this.KWHzl = j + 1;
                return;
            }
            this.copydefault = true;
            this.gEmmrt.dispose();
            this.AEQbTJ.onNext(t);
            this.AEQbTJ.onComplete();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
            } else {
                this.copydefault = true;
                this.AEQbTJ.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            T t = this.EZpvd;
            if (t == null && this.OLrzqt) {
                this.AEQbTJ.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.AEQbTJ.onNext(t);
            }
            this.AEQbTJ.onComplete();
        }
    }
}

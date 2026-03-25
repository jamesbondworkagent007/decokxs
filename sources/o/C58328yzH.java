package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58328yzH<T> extends AbstractC58260yxt<T> implements InterfaceC58240yxZ<T> {
    public final T AEQbTJ;
    public final InterfaceC58255yxo<T> OLrzqt;
    public final long copydefault;

    public C58328yzH(InterfaceC58255yxo<T> interfaceC58255yxo, long j, T t) {
        this.OLrzqt = interfaceC58255yxo;
        this.copydefault = j;
        this.AEQbTJ = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.OLrzqt.subscribe(new Activity(interfaceC58258yxr, this.copydefault, this.AEQbTJ));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<T> copydefault() {
        return yBG.EZpvd(new C58329yzI(this.OLrzqt, this.copydefault, this.AEQbTJ, true));
    }

    /* JADX INFO: renamed from: o.yzH$Activity */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final long AEQbTJ;
        public final InterfaceC58258yxr<? super T> EZpvd;
        public long KWHzl;
        public final T OLrzqt;
        public boolean copydefault;
        public InterfaceC58217yxC djBIcL;

        public Activity(InterfaceC58258yxr<? super T> interfaceC58258yxr, long j, T t) {
            this.EZpvd = interfaceC58258yxr;
            this.AEQbTJ = j;
            this.OLrzqt = t;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.djBIcL, interfaceC58217yxC)) {
                this.djBIcL = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.djBIcL.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.djBIcL.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            long j = this.KWHzl;
            if (j != this.AEQbTJ) {
                this.KWHzl = j + 1;
                return;
            }
            this.copydefault = true;
            this.djBIcL.dispose();
            this.EZpvd.onSuccess(t);
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
            T t = this.OLrzqt;
            if (t != null) {
                this.EZpvd.onSuccess(t);
            } else {
                this.EZpvd.onError(new NoSuchElementException());
            }
        }
    }
}

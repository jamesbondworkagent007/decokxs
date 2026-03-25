package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: renamed from: o.yBd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56324yBd<T, R> implements InterfaceC58186ywY<T>, InterfaceC58298yye<R> {
    public int AYXKKw;
    public boolean AhwBna;
    public InterfaceC58298yye<T> djBIcL;
    public InterfaceC60094zvb gEmmrt;
    public final InterfaceC60097zve<? super R> valueOf;

    public boolean EZpvd() {
        return true;
    }

    public void OLrzqt() {
    }

    public AbstractC56324yBd(InterfaceC60097zve<? super R> interfaceC60097zve) {
        this.valueOf = interfaceC60097zve;
    }

    @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
    public final void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (SubscriptionHelper.validate(this.gEmmrt, interfaceC60094zvb)) {
            this.gEmmrt = interfaceC60094zvb;
            if (interfaceC60094zvb instanceof InterfaceC58298yye) {
                this.djBIcL = (InterfaceC58298yye) interfaceC60094zvb;
            }
            if (EZpvd()) {
                this.valueOf.onSubscribe(this);
                OLrzqt();
            }
        }
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        if (this.AhwBna) {
            yBG.copydefault(th);
        } else {
            this.AhwBna = true;
            this.valueOf.onError(th);
        }
    }

    public final void OLrzqt(java.lang.Throwable th) {
        C58218yxD.AEQbTJ(th);
        this.gEmmrt.cancel();
        onError(th);
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        this.valueOf.onComplete();
    }

    public final int KWHzl(int i) {
        InterfaceC58298yye<T> interfaceC58298yye = this.djBIcL;
        if (interfaceC58298yye == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = interfaceC58298yye.requestFusion(i);
        if (iRequestFusion != 0) {
            this.AYXKKw = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.InterfaceC60094zvb
    public void request(long j) {
        this.gEmmrt.request(j);
    }

    @Override // o.InterfaceC60094zvb
    public void cancel() {
        this.gEmmrt.cancel();
    }

    @Override // o.InterfaceC58305yyl
    public boolean isEmpty() {
        return this.djBIcL.isEmpty();
    }

    @Override // o.InterfaceC58305yyl
    public void clear() {
        this.djBIcL.clear();
    }

    @Override // o.InterfaceC58305yyl
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}

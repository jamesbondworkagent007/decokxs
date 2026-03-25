package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: renamed from: o.yBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56321yBa<T, R> implements InterfaceC58296yyc<T>, InterfaceC58298yye<R> {
    public final InterfaceC58296yyc<? super R> AYXKKw;
    public InterfaceC60094zvb AhwBna;
    public int djBIcL;
    public InterfaceC58298yye<T> gEmmrt;
    public boolean valueOf;

    public boolean EZpvd() {
        return true;
    }

    public void copydefault() {
    }

    public AbstractC56321yBa(InterfaceC58296yyc<? super R> interfaceC58296yyc) {
        this.AYXKKw = interfaceC58296yyc;
    }

    @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
    public final void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (SubscriptionHelper.validate(this.AhwBna, interfaceC60094zvb)) {
            this.AhwBna = interfaceC60094zvb;
            if (interfaceC60094zvb instanceof InterfaceC58298yye) {
                this.gEmmrt = (InterfaceC58298yye) interfaceC60094zvb;
            }
            if (EZpvd()) {
                this.AYXKKw.onSubscribe(this);
                copydefault();
            }
        }
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        if (this.valueOf) {
            yBG.copydefault(th);
        } else {
            this.valueOf = true;
            this.AYXKKw.onError(th);
        }
    }

    public final void KWHzl(java.lang.Throwable th) {
        C58218yxD.AEQbTJ(th);
        this.AhwBna.cancel();
        onError(th);
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        this.AYXKKw.onComplete();
    }

    public final int KWHzl(int i) {
        InterfaceC58298yye<T> interfaceC58298yye = this.gEmmrt;
        if (interfaceC58298yye == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = interfaceC58298yye.requestFusion(i);
        if (iRequestFusion != 0) {
            this.djBIcL = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.InterfaceC60094zvb
    public void request(long j) {
        this.AhwBna.request(j);
    }

    @Override // o.InterfaceC60094zvb
    public void cancel() {
        this.AhwBna.cancel();
    }

    @Override // o.InterfaceC58305yyl
    public boolean isEmpty() {
        return this.gEmmrt.isEmpty();
    }

    @Override // o.InterfaceC58305yyl
    public void clear() {
        this.gEmmrt.clear();
    }

    @Override // o.InterfaceC58305yyl
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}

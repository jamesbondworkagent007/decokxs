package o;

/* JADX INFO: renamed from: o.yzZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58346yzZ<T> extends AbstractC58177ywP implements InterfaceC58240yxZ<T> {
    public final InterfaceC58255yxo<T> EZpvd;

    public C58346yzZ(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.EZpvd = interfaceC58255yxo;
    }

    @Override // o.AbstractC58177ywP
    public void KWHzl(InterfaceC58179ywR interfaceC58179ywR) {
        this.EZpvd.subscribe(new Application(interfaceC58179ywR));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<T> copydefault() {
        return yBG.EZpvd(new C58345yzY(this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzZ$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58179ywR KWHzl;

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
        }

        public Application(InterfaceC58179ywR interfaceC58179ywR) {
            this.KWHzl = interfaceC58179ywR;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.AEQbTJ = interfaceC58217yxC;
            this.KWHzl.onSubscribe(this);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }
    }
}

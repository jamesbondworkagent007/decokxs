package o;

/* JADX INFO: renamed from: o.yzL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58332yzL<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58239yxY<? super T> AEQbTJ;

    public C58332yzL(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.AEQbTJ = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Application(interfaceC58256yxp, this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yzL$Application */
    public static final class Application<T> extends AbstractC58306yym<T, T> {
        public final InterfaceC58239yxY<? super T> gEmmrt;

        public Application(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            super(interfaceC58256yxp);
            this.gEmmrt = interfaceC58239yxY;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl == 0) {
                try {
                    if (this.gEmmrt.test(t)) {
                        this.EZpvd.onNext((java.lang.Object) t);
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    AEQbTJ(th);
                    return;
                }
            }
            this.EZpvd.onNext(null);
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            T tPoll;
            do {
                tPoll = this.copydefault.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.gEmmrt.test(tPoll));
            return tPoll;
        }
    }
}

package o;

/* JADX INFO: renamed from: o.yzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58323yzC<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58227yxM<? super T> EZpvd;

    public C58323yzC(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58227yxM;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new TaskDescription(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzC$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> extends AbstractC58306yym<T, T> {
        public final InterfaceC58227yxM<? super T> AhwBna;

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58227yxM<? super T> interfaceC58227yxM) {
            super(interfaceC58256yxp);
            this.AhwBna = interfaceC58227yxM;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.EZpvd.onNext((java.lang.Object) t);
            if (this.KWHzl == 0) {
                try {
                    this.AhwBna.accept(t);
                } catch (java.lang.Throwable th) {
                    AEQbTJ(th);
                }
            }
        }

        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            return KWHzl(i);
        }

        @Override // o.InterfaceC58305yyl
        public T poll() throws java.lang.Exception {
            T tPoll = this.copydefault.poll();
            if (tPoll != null) {
                this.AhwBna.accept(tPoll);
            }
            return tPoll;
        }
    }
}

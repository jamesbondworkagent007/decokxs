package o;

/* JADX INFO: renamed from: o.yzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58333yzM<T> extends AbstractC58247yxg<T> {
    public final T[] KWHzl;

    public C58333yzM(T[] tArr) {
        this.KWHzl = tArr;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        StateListAnimator stateListAnimator = new StateListAnimator(interfaceC58256yxp, this.KWHzl);
        interfaceC58256yxp.onSubscribe(stateListAnimator);
        if (stateListAnimator.copydefault) {
            return;
        }
        stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.yzM$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator<T> extends AbstractC58307yyn<T> {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public volatile boolean EZpvd;
        public int KWHzl;
        public final T[] OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58302yyi
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.copydefault = true;
            return 1;
        }

        public StateListAnimator(InterfaceC58256yxp<? super T> interfaceC58256yxp, T[] tArr) {
            this.AEQbTJ = interfaceC58256yxp;
            this.OLrzqt = tArr;
        }

        @Override // o.InterfaceC58305yyl
        public T poll() {
            int i = this.KWHzl;
            T[] tArr = this.OLrzqt;
            if (i == tArr.length) {
                return null;
            }
            this.KWHzl = i + 1;
            return (T) C58297yyd.AEQbTJ((java.lang.Object) tArr[i], "The array element is null");
        }

        @Override // o.InterfaceC58305yyl
        public boolean isEmpty() {
            return this.KWHzl == this.OLrzqt.length;
        }

        @Override // o.InterfaceC58305yyl
        public void clear() {
            this.KWHzl = this.OLrzqt.length;
        }

        public void EZpvd() {
            T[] tArr = this.OLrzqt;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.AEQbTJ.onError(new java.lang.NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.AEQbTJ.onNext(t);
            }
            if (isDisposed()) {
                return;
            }
            this.AEQbTJ.onComplete();
        }
    }
}

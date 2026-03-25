package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58325yzE<T, K> extends AbstractC58349yzc<T, T> {
    public final Callable<? extends java.util.Collection<? super K>> EZpvd;
    public final InterfaceC58229yxO<? super T, K> copydefault;

    public C58325yzE(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, Callable<? extends java.util.Collection<? super K>> callable) {
        super(interfaceC58255yxo);
        this.copydefault = interfaceC58229yxO;
        this.EZpvd = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        try {
            this.OLrzqt.subscribe(new Activity(interfaceC58256yxp, this.copydefault, (java.util.Collection) C58297yyd.AEQbTJ(this.EZpvd.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }

    /* JADX INFO: renamed from: o.yzE$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, K> extends AbstractC58306yym<T, T> {
        public final java.util.Collection<? super K> djBIcL;
        public final InterfaceC58229yxO<? super T, K> valueOf;

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58229yxO<? super T, K> interfaceC58229yxO, java.util.Collection<? super K> collection) {
            super(interfaceC58256yxp);
            this.valueOf = interfaceC58229yxO;
            this.djBIcL = collection;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            if (this.KWHzl == 0) {
                try {
                    if (this.djBIcL.add(C58297yyd.AEQbTJ(this.valueOf.apply(t), "The keySelector returned a null key"))) {
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

        @Override // o.AbstractC58306yym, o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.AEQbTJ) {
                yBG.copydefault(th);
                return;
            }
            this.AEQbTJ = true;
            this.djBIcL.clear();
            this.EZpvd.onError(th);
        }

        @Override // o.AbstractC58306yym, o.InterfaceC58256yxp
        public void onComplete() {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            this.djBIcL.clear();
            this.EZpvd.onComplete();
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
            } while (!this.djBIcL.add((java.lang.Object) C58297yyd.AEQbTJ(this.valueOf.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        @Override // o.AbstractC58306yym, o.InterfaceC58305yyl
        public void clear() {
            this.djBIcL.clear();
            super.clear();
        }
    }
}

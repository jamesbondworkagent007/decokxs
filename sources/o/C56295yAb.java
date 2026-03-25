package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56295yAb<T, R> extends AbstractC58349yzc<T, InterfaceC58255yxo<? extends R>> {
    public final InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> AEQbTJ;
    public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> EZpvd;
    public final Callable<? extends InterfaceC58255yxo<? extends R>> KWHzl;

    public C56295yAb(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO2, Callable<? extends InterfaceC58255yxo<? extends R>> callable) {
        super(interfaceC58255yxo);
        this.AEQbTJ = interfaceC58229yxO;
        this.EZpvd = interfaceC58229yxO2;
        this.KWHzl = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super InterfaceC58255yxo<? extends R>> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp, this.AEQbTJ, this.EZpvd, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yAb$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, R> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> AEQbTJ;
        public InterfaceC58217yxC EZpvd;
        public final Callable<? extends InterfaceC58255yxo<? extends R>> KWHzl;
        public final InterfaceC58256yxp<? super InterfaceC58255yxo<? extends R>> OLrzqt;
        public final InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> copydefault;

        public ActionBar(InterfaceC58256yxp<? super InterfaceC58255yxo<? extends R>> interfaceC58256yxp, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO2, Callable<? extends InterfaceC58255yxo<? extends R>> callable) {
            this.OLrzqt = interfaceC58256yxp;
            this.AEQbTJ = interfaceC58229yxO;
            this.copydefault = interfaceC58229yxO2;
            this.KWHzl = callable;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            try {
                this.OLrzqt.onNext((InterfaceC58255yxo) C58297yyd.AEQbTJ(this.AEQbTJ.apply(t), "The onNext ObservableSource returned is null"));
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            try {
                this.OLrzqt.onNext((InterfaceC58255yxo) C58297yyd.AEQbTJ(this.copydefault.apply(th), "The onError ObservableSource returned is null"));
                this.OLrzqt.onComplete();
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                this.OLrzqt.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            try {
                this.OLrzqt.onNext((InterfaceC58255yxo) C58297yyd.AEQbTJ(this.KWHzl.call(), "The onComplete ObservableSource returned is null"));
                this.OLrzqt.onComplete();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.onError(th);
            }
        }
    }
}

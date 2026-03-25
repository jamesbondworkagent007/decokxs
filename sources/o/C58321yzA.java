package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58321yzA<T, U> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> KWHzl;

    public C58321yzA(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> interfaceC58229yxO) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58229yxO;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(new yBE(interfaceC58256yxp), this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yzA$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, U> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public boolean AEQbTJ;
        public final InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> EZpvd;
        public final InterfaceC58256yxp<? super T> KWHzl;
        public volatile long OLrzqt;
        public final AtomicReference<InterfaceC58217yxC> copydefault = new AtomicReference<>();
        public InterfaceC58217yxC valueOf;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> interfaceC58229yxO) {
            this.KWHzl = interfaceC58256yxp;
            this.EZpvd = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.valueOf, interfaceC58217yxC)) {
                this.valueOf = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            long j = this.OLrzqt + 1;
            this.OLrzqt = j;
            InterfaceC58217yxC interfaceC58217yxC = this.copydefault.get();
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            try {
                InterfaceC58255yxo interfaceC58255yxo = (InterfaceC58255yxo) C58297yyd.AEQbTJ(this.EZpvd.apply(t), "The ObservableSource supplied is null");
                C1019ActionBar c1019ActionBar = new C1019ActionBar(this, j, t);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.copydefault, interfaceC58217yxC, c1019ActionBar)) {
                    interfaceC58255yxo.subscribe(c1019ActionBar);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                dispose();
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            DisposableHelper.dispose(this.copydefault);
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            InterfaceC58217yxC interfaceC58217yxC = this.copydefault.get();
            if (interfaceC58217yxC != DisposableHelper.DISPOSED) {
                C1019ActionBar c1019ActionBar = (C1019ActionBar) interfaceC58217yxC;
                if (c1019ActionBar != null) {
                    c1019ActionBar.copydefault();
                }
                DisposableHelper.dispose(this.copydefault);
                this.KWHzl.onComplete();
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.valueOf.dispose();
            DisposableHelper.dispose(this.copydefault);
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.valueOf.isDisposed();
        }

        public void KWHzl(long j, T t) {
            if (j == this.OLrzqt) {
                this.KWHzl.onNext(t);
            }
        }

        /* JADX INFO: renamed from: o.yzA$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C1019ActionBar<T, U> extends AbstractC56345yBy<U> {
            public final long AEQbTJ;
            public final AtomicBoolean EZpvd = new AtomicBoolean();
            public boolean KWHzl;
            public final T OLrzqt;
            public final ActionBar<T, U> copydefault;

            public C1019ActionBar(ActionBar<T, U> actionBar, long j, T t) {
                this.copydefault = actionBar;
                this.AEQbTJ = j;
                this.OLrzqt = t;
            }

            @Override // o.InterfaceC58256yxp
            public void onNext(U u) {
                if (this.KWHzl) {
                    return;
                }
                this.KWHzl = true;
                dispose();
                copydefault();
            }

            public void copydefault() {
                if (this.EZpvd.compareAndSet(false, true)) {
                    this.copydefault.KWHzl(this.AEQbTJ, this.OLrzqt);
                }
            }

            @Override // o.InterfaceC58256yxp
            public void onError(java.lang.Throwable th) {
                if (this.KWHzl) {
                    yBG.copydefault(th);
                } else {
                    this.KWHzl = true;
                    this.copydefault.onError(th);
                }
            }

            @Override // o.InterfaceC58256yxp
            public void onComplete() {
                if (this.KWHzl) {
                    return;
                }
                this.KWHzl = true;
                copydefault();
            }
        }
    }
}

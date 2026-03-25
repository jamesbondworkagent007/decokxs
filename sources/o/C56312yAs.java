package o;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56312yAs<T, U> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58255yxo<U> AEQbTJ;

    public C56312yAs(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58255yxo<U> interfaceC58255yxo2) {
        super(interfaceC58255yxo);
        this.AEQbTJ = interfaceC58255yxo2;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        yBE ybe = new yBE(interfaceC58256yxp);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        ybe.onSubscribe(arrayCompositeDisposable);
        TaskDescription taskDescription = new TaskDescription(ybe, arrayCompositeDisposable);
        this.AEQbTJ.subscribe(new StateListAnimator(arrayCompositeDisposable, taskDescription, ybe));
        this.OLrzqt.subscribe(taskDescription);
    }

    /* JADX INFO: renamed from: o.yAs$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58256yxp<T> {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public volatile boolean EZpvd;
        public boolean KWHzl;
        public final ArrayCompositeDisposable OLrzqt;
        public InterfaceC58217yxC copydefault;

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.AEQbTJ = interfaceC58256yxp;
            this.OLrzqt = arrayCompositeDisposable;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.copydefault, interfaceC58217yxC)) {
                this.copydefault = interfaceC58217yxC;
                this.OLrzqt.setResource(0, interfaceC58217yxC);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl) {
                this.AEQbTJ.onNext(t);
            } else if (this.EZpvd) {
                this.KWHzl = true;
                this.AEQbTJ.onNext(t);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.OLrzqt.dispose();
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.OLrzqt.dispose();
            this.AEQbTJ.onComplete();
        }
    }

    /* JADX INFO: renamed from: o.yAs$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public final class StateListAnimator implements InterfaceC58256yxp<U> {
        public final yBE<T> AEQbTJ;
        public InterfaceC58217yxC EZpvd;
        public final TaskDescription<T> KWHzl;
        public final ArrayCompositeDisposable copydefault;

        public StateListAnimator(ArrayCompositeDisposable arrayCompositeDisposable, TaskDescription<T> taskDescription, yBE<T> ybe) {
            this.copydefault = arrayCompositeDisposable;
            this.KWHzl = taskDescription;
            this.AEQbTJ = ybe;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.copydefault.setResource(1, interfaceC58217yxC);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(U u) {
            this.EZpvd.dispose();
            this.KWHzl.EZpvd = true;
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault.dispose();
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl.EZpvd = true;
        }
    }
}

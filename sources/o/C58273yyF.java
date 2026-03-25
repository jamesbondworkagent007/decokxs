package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58273yyF<T> extends AbstractC58318yyy<T, T> {
    public final long AEQbTJ;
    public final java.util.concurrent.TimeUnit EZpvd;
    public final AbstractC58253yxm OLrzqt;
    public final boolean copydefault;

    public C58273yyF(AbstractC58185ywX<T> abstractC58185ywX, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        super(abstractC58185ywX);
        this.AEQbTJ = j;
        this.EZpvd = timeUnit;
        this.OLrzqt = abstractC58253yxm;
        this.copydefault = z;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this.KWHzl.copydefault(new StateListAnimator(this.copydefault ? interfaceC60097zve : new yBT(interfaceC60097zve), this.AEQbTJ, this.EZpvd, this.OLrzqt.createWorker(), this.copydefault));
    }

    /* JADX INFO: renamed from: o.yyF$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator<T> implements InterfaceC58186ywY<T>, InterfaceC60094zvb {
        public final boolean AEQbTJ;
        public InterfaceC60094zvb EZpvd;
        public final InterfaceC60097zve<? super T> KWHzl;
        public final java.util.concurrent.TimeUnit OLrzqt;
        public final long copydefault;
        public final AbstractC58253yxm.StateListAnimator gEmmrt;

        public StateListAnimator(InterfaceC60097zve<? super T> interfaceC60097zve, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm.StateListAnimator stateListAnimator, boolean z) {
            this.KWHzl = interfaceC60097zve;
            this.copydefault = j;
            this.OLrzqt = timeUnit;
            this.gEmmrt = stateListAnimator;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.EZpvd, interfaceC60094zvb)) {
                this.EZpvd = interfaceC60094zvb;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            this.gEmmrt.schedule(new RunnableC1018StateListAnimator(t), this.copydefault, this.OLrzqt);
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            this.gEmmrt.schedule(new TaskDescription(th), this.AEQbTJ ? this.copydefault : 0L, this.OLrzqt);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            this.gEmmrt.schedule(new ActionBar(), this.copydefault, this.OLrzqt);
        }

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
            this.EZpvd.request(j);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            this.EZpvd.cancel();
            this.gEmmrt.dispose();
        }

        /* JADX INFO: renamed from: o.yyF$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public final class RunnableC1018StateListAnimator implements java.lang.Runnable {
            public final T copydefault;

            public RunnableC1018StateListAnimator(T t) {
                this.copydefault = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                StateListAnimator.this.KWHzl.onNext(this.copydefault);
            }
        }

        /* JADX INFO: renamed from: o.yyF$StateListAnimator$TaskDescription */
        public final class TaskDescription implements java.lang.Runnable {
            public final java.lang.Throwable AEQbTJ;

            public TaskDescription(java.lang.Throwable th) {
                this.AEQbTJ = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    StateListAnimator.this.KWHzl.onError(this.AEQbTJ);
                } finally {
                    StateListAnimator.this.gEmmrt.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: o.yyF$StateListAnimator$ActionBar */
        public final class ActionBar implements java.lang.Runnable {
            public ActionBar() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    StateListAnimator.this.KWHzl.onComplete();
                } finally {
                    StateListAnimator.this.gEmmrt.dispose();
                }
            }
        }
    }
}

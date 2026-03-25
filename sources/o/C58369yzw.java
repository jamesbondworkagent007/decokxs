package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58369yzw<T> extends AbstractC58349yzc<T, T> {
    public final boolean AEQbTJ;
    public final AbstractC58253yxm EZpvd;
    public final java.util.concurrent.TimeUnit KWHzl;
    public final long copydefault;

    public C58369yzw(InterfaceC58255yxo<T> interfaceC58255yxo, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        super(interfaceC58255yxo);
        this.copydefault = j;
        this.KWHzl = timeUnit;
        this.EZpvd = abstractC58253yxm;
        this.AEQbTJ = z;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(this.AEQbTJ ? interfaceC58256yxp : new yBE(interfaceC58256yxp), this.copydefault, this.KWHzl, this.EZpvd.createWorker(), this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yzw$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final boolean AEQbTJ;
        public final AbstractC58253yxm.StateListAnimator AYXKKw;
        public final java.util.concurrent.TimeUnit EZpvd;
        public InterfaceC58217yxC KWHzl;
        public final long OLrzqt;
        public final InterfaceC58256yxp<? super T> copydefault;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm.StateListAnimator stateListAnimator, boolean z) {
            this.copydefault = interfaceC58256yxp;
            this.OLrzqt = j;
            this.EZpvd = timeUnit;
            this.AYXKKw = stateListAnimator;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.KWHzl, interfaceC58217yxC)) {
                this.KWHzl = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.AYXKKw.schedule(new TaskDescription(t), this.OLrzqt, this.EZpvd);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AYXKKw.schedule(new Activity(th), this.AEQbTJ ? this.OLrzqt : 0L, this.EZpvd);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.AYXKKw.schedule(new RunnableC1020ActionBar(), this.OLrzqt, this.EZpvd);
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl.dispose();
            this.AYXKKw.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AYXKKw.isDisposed();
        }

        /* JADX INFO: renamed from: o.yzw$ActionBar$TaskDescription */
        public final class TaskDescription implements java.lang.Runnable {
            public final T KWHzl;

            public TaskDescription(T t) {
                this.KWHzl = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                ActionBar.this.copydefault.onNext(this.KWHzl);
            }
        }

        /* JADX INFO: renamed from: o.yzw$ActionBar$Activity */
        public final class Activity implements java.lang.Runnable {
            public final java.lang.Throwable KWHzl;

            public Activity(java.lang.Throwable th) {
                this.KWHzl = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActionBar.this.copydefault.onError(this.KWHzl);
                } finally {
                    ActionBar.this.AYXKKw.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: o.yzw$ActionBar$ActionBar, reason: collision with other inner class name */
        public final class RunnableC1020ActionBar implements java.lang.Runnable {
            public RunnableC1020ActionBar() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActionBar.this.copydefault.onComplete();
                } finally {
                    ActionBar.this.AYXKKw.dispose();
                }
            }
        }
    }
}

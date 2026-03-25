package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yyH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58275yyH<T, U extends java.util.Collection<? super T>> extends AbstractC58318yyy<T, U> {
    public final Callable<U> AEQbTJ;
    public final long AYXKKw;
    public final java.util.concurrent.TimeUnit AhwBna;
    public final AbstractC58253yxm EZpvd;
    public final int OLrzqt;
    public final boolean copydefault;
    public final long gEmmrt;

    public C58275yyH(AbstractC58185ywX<T> abstractC58185ywX, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, Callable<U> callable, int i, boolean z) {
        super(abstractC58185ywX);
        this.gEmmrt = j;
        this.AYXKKw = j2;
        this.AhwBna = timeUnit;
        this.EZpvd = abstractC58253yxm;
        this.AEQbTJ = callable;
        this.OLrzqt = i;
        this.copydefault = z;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super U> interfaceC60097zve) {
        if (this.gEmmrt == this.AYXKKw && this.OLrzqt == Integer.MAX_VALUE) {
            this.KWHzl.copydefault(new StateListAnimator(new yBT(interfaceC60097zve), this.AEQbTJ, this.gEmmrt, this.AhwBna, this.EZpvd));
            return;
        }
        AbstractC58253yxm.StateListAnimator stateListAnimatorCreateWorker = this.EZpvd.createWorker();
        if (this.gEmmrt == this.AYXKKw) {
            this.KWHzl.copydefault(new ActionBar(new yBT(interfaceC60097zve), this.AEQbTJ, this.gEmmrt, this.AhwBna, this.OLrzqt, this.copydefault, stateListAnimatorCreateWorker));
        } else {
            this.KWHzl.copydefault(new Activity(new yBT(interfaceC60097zve), this.AEQbTJ, this.gEmmrt, this.AYXKKw, this.AhwBna, stateListAnimatorCreateWorker));
        }
    }

    /* JADX INFO: renamed from: o.yyH$StateListAnimator */
    public static final class StateListAnimator<T, U extends java.util.Collection<? super T>> extends AbstractC56325yBe<T, U, U> implements InterfaceC60094zvb, java.lang.Runnable, InterfaceC58217yxC {
        public final AbstractC58253yxm AEQbTJ;
        public InterfaceC60094zvb AhwBna;
        public final AtomicReference<InterfaceC58217yxC> EZpvd;
        public U KWHzl;
        public final Callable<U> OLrzqt;
        public final long copydefault;
        public final java.util.concurrent.TimeUnit djBIcL;

        @Override // o.AbstractC56325yBe, o.InterfaceC56340yBt
        public /* bridge */ /* synthetic */ boolean EZpvd(InterfaceC60097zve interfaceC60097zve, java.lang.Object obj) {
            return EZpvd((InterfaceC60097zve<? super java.util.Collection>) interfaceC60097zve, (java.util.Collection) obj);
        }

        public StateListAnimator(InterfaceC60097zve<? super U> interfaceC60097zve, Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
            super(interfaceC60097zve, new MpscLinkedQueue());
            this.EZpvd = new AtomicReference<>();
            this.OLrzqt = callable;
            this.copydefault = j;
            this.djBIcL = timeUnit;
            this.AEQbTJ = abstractC58253yxm;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.AhwBna, interfaceC60094zvb)) {
                this.AhwBna = interfaceC60094zvb;
                try {
                    this.KWHzl = (U) C58297yyd.AEQbTJ(this.OLrzqt.call(), "The supplied buffer is null");
                    this.DbNXlk.onSubscribe(this);
                    if (this.isConnected) {
                        return;
                    }
                    interfaceC60094zvb.request(Long.MAX_VALUE);
                    AbstractC58253yxm abstractC58253yxm = this.AEQbTJ;
                    long j = this.copydefault;
                    InterfaceC58217yxC interfaceC58217yxCSchedulePeriodicallyDirect = abstractC58253yxm.schedulePeriodicallyDirect(this, j, j, this.djBIcL);
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.EZpvd, null, interfaceC58217yxCSchedulePeriodicallyDirect)) {
                        return;
                    }
                    interfaceC58217yxCSchedulePeriodicallyDirect.dispose();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    cancel();
                    EmptySubscription.error(th, this.DbNXlk);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            synchronized (this) {
                U u = this.KWHzl;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            DisposableHelper.dispose(this.EZpvd);
            synchronized (this) {
                this.KWHzl = null;
            }
            this.DbNXlk.onError(th);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            DisposableHelper.dispose(this.EZpvd);
            synchronized (this) {
                U u = this.KWHzl;
                if (u == null) {
                    return;
                }
                this.KWHzl = null;
                this.ejfBZ.offer(u);
                this.AkhnZx = true;
                if (OLrzqt()) {
                    yBB.KWHzl(this.ejfBZ, this.DbNXlk, false, null, this);
                }
            }
        }

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
            copydefault(j);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            this.isConnected = true;
            this.AhwBna.cancel();
            DisposableHelper.dispose(this.EZpvd);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C58297yyd.AEQbTJ(this.OLrzqt.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.KWHzl;
                    if (u2 == null) {
                        return;
                    }
                    this.KWHzl = u;
                    AEQbTJ(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                cancel();
                this.DbNXlk.onError(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean EZpvd(InterfaceC60097zve<? super U> interfaceC60097zve, U u) {
            this.DbNXlk.onNext((java.lang.Object) u);
            return true;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            cancel();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.get() == DisposableHelper.DISPOSED;
        }
    }

    /* JADX INFO: renamed from: o.yyH$Activity */
    public static final class Activity<T, U extends java.util.Collection<? super T>> extends AbstractC56325yBe<T, U, U> implements InterfaceC60094zvb, java.lang.Runnable {
        public final Callable<U> AEQbTJ;
        public final AbstractC58253yxm.StateListAnimator AYXKKw;
        public final long EZpvd;
        public final long KWHzl;
        public final java.util.List<U> OLrzqt;
        public final java.util.concurrent.TimeUnit copydefault;
        public InterfaceC60094zvb djBIcL;

        @Override // o.AbstractC56325yBe, o.InterfaceC56340yBt
        public /* bridge */ /* synthetic */ boolean EZpvd(InterfaceC60097zve interfaceC60097zve, java.lang.Object obj) {
            return EZpvd((InterfaceC60097zve<? super java.util.Collection>) interfaceC60097zve, (java.util.Collection) obj);
        }

        public Activity(InterfaceC60097zve<? super U> interfaceC60097zve, Callable<U> callable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm.StateListAnimator stateListAnimator) {
            super(interfaceC60097zve, new MpscLinkedQueue());
            this.AEQbTJ = callable;
            this.EZpvd = j;
            this.KWHzl = j2;
            this.copydefault = timeUnit;
            this.AYXKKw = stateListAnimator;
            this.OLrzqt = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.djBIcL, interfaceC60094zvb)) {
                this.djBIcL = interfaceC60094zvb;
                try {
                    java.util.Collection collection = (java.util.Collection) C58297yyd.AEQbTJ(this.AEQbTJ.call(), "The supplied buffer is null");
                    this.OLrzqt.add((U) collection);
                    this.DbNXlk.onSubscribe(this);
                    interfaceC60094zvb.request(Long.MAX_VALUE);
                    AbstractC58253yxm.StateListAnimator stateListAnimator = this.AYXKKw;
                    long j = this.KWHzl;
                    stateListAnimator.schedulePeriodically(this, j, j, this.copydefault);
                    this.AYXKKw.schedule(new ActionBar(collection), this.EZpvd, this.copydefault);
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.AYXKKw.dispose();
                    interfaceC60094zvb.cancel();
                    EmptySubscription.error(th, this.DbNXlk);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<U> it = this.OLrzqt.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            this.AkhnZx = true;
            this.AYXKKw.dispose();
            copydefault();
            this.DbNXlk.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC60097zve
        public void onComplete() {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.OLrzqt);
                this.OLrzqt.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.ejfBZ.offer((U) ((java.util.Collection) it.next()));
            }
            this.AkhnZx = true;
            if (OLrzqt()) {
                yBB.KWHzl(this.ejfBZ, this.DbNXlk, false, this.AYXKKw, this);
            }
        }

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
            copydefault(j);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            this.isConnected = true;
            this.djBIcL.cancel();
            this.AYXKKw.dispose();
            copydefault();
        }

        public void copydefault() {
            synchronized (this) {
                this.OLrzqt.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.isConnected) {
                return;
            }
            try {
                java.util.Collection collection = (java.util.Collection) C58297yyd.AEQbTJ(this.AEQbTJ.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.isConnected) {
                        return;
                    }
                    this.OLrzqt.add((U) collection);
                    this.AYXKKw.schedule(new ActionBar(collection), this.EZpvd, this.copydefault);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                cancel();
                this.DbNXlk.onError(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: U extends java.util.Collection<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public boolean EZpvd(InterfaceC60097zve<? super U> interfaceC60097zve, U u) {
            interfaceC60097zve.onNext(u);
            return true;
        }

        /* JADX INFO: renamed from: o.yyH$Activity$ActionBar */
        public final class ActionBar implements java.lang.Runnable {
            public final U KWHzl;

            public ActionBar(U u) {
                this.KWHzl = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (Activity.this) {
                    Activity.this.OLrzqt.remove(this.KWHzl);
                }
                Activity activity = Activity.this;
                activity.KWHzl(this.KWHzl, false, activity.AYXKKw);
            }
        }
    }

    /* JADX INFO: renamed from: o.yyH$ActionBar */
    public static final class ActionBar<T, U extends java.util.Collection<? super T>> extends AbstractC56325yBe<T, U, U> implements InterfaceC60094zvb, java.lang.Runnable, InterfaceC58217yxC {
        public final int AEQbTJ;
        public final java.util.concurrent.TimeUnit AYXKKw;
        public InterfaceC58217yxC AhwBna;
        public final Callable<U> EZpvd;
        public long KWHzl;
        public U OLrzqt;
        public long copydefault;
        public final long djBIcL;
        public InterfaceC60094zvb gEmmrt;
        public final boolean valueOf;
        public final AbstractC58253yxm.StateListAnimator values;

        public ActionBar(InterfaceC60097zve<? super U> interfaceC60097zve, Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, int i, boolean z, AbstractC58253yxm.StateListAnimator stateListAnimator) {
            super(interfaceC60097zve, new MpscLinkedQueue());
            this.EZpvd = callable;
            this.djBIcL = j;
            this.AYXKKw = timeUnit;
            this.AEQbTJ = i;
            this.valueOf = z;
            this.values = stateListAnimator;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.gEmmrt, interfaceC60094zvb)) {
                this.gEmmrt = interfaceC60094zvb;
                try {
                    this.OLrzqt = (U) C58297yyd.AEQbTJ(this.EZpvd.call(), "The supplied buffer is null");
                    this.DbNXlk.onSubscribe(this);
                    AbstractC58253yxm.StateListAnimator stateListAnimator = this.values;
                    long j = this.djBIcL;
                    this.AhwBna = stateListAnimator.schedulePeriodically(this, j, j, this.AYXKKw);
                    interfaceC60094zvb.request(Long.MAX_VALUE);
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.values.dispose();
                    interfaceC60094zvb.cancel();
                    EmptySubscription.error(th, this.DbNXlk);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            synchronized (this) {
                U u = this.OLrzqt;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.AEQbTJ) {
                    return;
                }
                this.OLrzqt = null;
                this.copydefault++;
                if (this.valueOf) {
                    this.AhwBna.dispose();
                }
                KWHzl(u, false, this);
                try {
                    U u2 = (U) C58297yyd.AEQbTJ(this.EZpvd.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.OLrzqt = u2;
                        this.KWHzl++;
                    }
                    if (this.valueOf) {
                        AbstractC58253yxm.StateListAnimator stateListAnimator = this.values;
                        long j = this.djBIcL;
                        this.AhwBna = stateListAnimator.schedulePeriodically(this, j, j, this.AYXKKw);
                    }
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    cancel();
                    this.DbNXlk.onError(th);
                }
            }
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.OLrzqt = null;
            }
            this.DbNXlk.onError(th);
            this.values.dispose();
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.OLrzqt;
                this.OLrzqt = null;
            }
            if (u != null) {
                this.ejfBZ.offer(u);
                this.AkhnZx = true;
                if (OLrzqt()) {
                    yBB.KWHzl(this.ejfBZ, this.DbNXlk, false, this, this);
                }
                this.values.dispose();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zve;Ljava/lang/Object;)Z */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: U extends java.util.Collection<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC56325yBe, o.InterfaceC56340yBt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean EZpvd(InterfaceC60097zve<? super U> interfaceC60097zve, U u) {
            interfaceC60097zve.onNext(u);
            return true;
        }

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
            copydefault(j);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            if (this.isConnected) {
                return;
            }
            this.isConnected = true;
            dispose();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            synchronized (this) {
                this.OLrzqt = null;
            }
            this.gEmmrt.cancel();
            this.values.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.values.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C58297yyd.AEQbTJ(this.EZpvd.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.OLrzqt;
                    if (u2 != null && this.copydefault == this.KWHzl) {
                        this.OLrzqt = u;
                        KWHzl(u2, false, this);
                    }
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                cancel();
                this.DbNXlk.onError(th);
            }
        }
    }
}

package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58367yzu<T, U extends java.util.Collection<? super T>> extends AbstractC58349yzc<T, U> {
    public final boolean AEQbTJ;
    public final java.util.concurrent.TimeUnit AYXKKw;
    public final long AhwBna;
    public final AbstractC58253yxm EZpvd;
    public final Callable<U> KWHzl;
    public final int copydefault;
    public final long djBIcL;

    public C58367yzu(InterfaceC58255yxo<T> interfaceC58255yxo, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, Callable<U> callable, int i, boolean z) {
        super(interfaceC58255yxo);
        this.djBIcL = j;
        this.AhwBna = j2;
        this.AYXKKw = timeUnit;
        this.EZpvd = abstractC58253yxm;
        this.KWHzl = callable;
        this.copydefault = i;
        this.AEQbTJ = z;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        if (this.djBIcL == this.AhwBna && this.copydefault == Integer.MAX_VALUE) {
            this.OLrzqt.subscribe(new ActionBar(new yBE(interfaceC58256yxp), this.KWHzl, this.djBIcL, this.AYXKKw, this.EZpvd));
            return;
        }
        AbstractC58253yxm.StateListAnimator stateListAnimatorCreateWorker = this.EZpvd.createWorker();
        if (this.djBIcL == this.AhwBna) {
            this.OLrzqt.subscribe(new Activity(new yBE(interfaceC58256yxp), this.KWHzl, this.djBIcL, this.AYXKKw, this.copydefault, this.AEQbTJ, stateListAnimatorCreateWorker));
        } else {
            this.OLrzqt.subscribe(new StateListAnimator(new yBE(interfaceC58256yxp), this.KWHzl, this.djBIcL, this.AhwBna, this.AYXKKw, stateListAnimatorCreateWorker));
        }
    }

    /* JADX INFO: renamed from: o.yzu$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, U extends java.util.Collection<? super T>> extends AbstractC58316yyw<T, U, U> implements java.lang.Runnable, InterfaceC58217yxC {
        public U AYXKKw;
        public final Callable<U> AhwBna;
        public InterfaceC58217yxC AkhnZx;
        public final java.util.concurrent.TimeUnit DbNXlk;
        public final AtomicReference<InterfaceC58217yxC> gEmmrt;
        public final AbstractC58253yxm valueOf;
        public final long values;

        public ActionBar(InterfaceC58256yxp<? super U> interfaceC58256yxp, Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.gEmmrt = new AtomicReference<>();
            this.AhwBna = callable;
            this.values = j;
            this.DbNXlk = timeUnit;
            this.valueOf = abstractC58253yxm;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AkhnZx, interfaceC58217yxC)) {
                this.AkhnZx = interfaceC58217yxC;
                try {
                    this.AYXKKw = (U) C58297yyd.AEQbTJ(this.AhwBna.call(), "The buffer supplied is null");
                    this.OLrzqt.onSubscribe(this);
                    if (this.KWHzl) {
                        return;
                    }
                    AbstractC58253yxm abstractC58253yxm = this.valueOf;
                    long j = this.values;
                    InterfaceC58217yxC interfaceC58217yxCSchedulePeriodicallyDirect = abstractC58253yxm.schedulePeriodicallyDirect(this, j, j, this.DbNXlk);
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.gEmmrt, null, interfaceC58217yxCSchedulePeriodicallyDirect)) {
                        return;
                    }
                    interfaceC58217yxCSchedulePeriodicallyDirect.dispose();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    dispose();
                    EmptyDisposable.error(th, this.OLrzqt);
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            synchronized (this) {
                U u = this.AYXKKw;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.AYXKKw = null;
            }
            this.OLrzqt.onError(th);
            DisposableHelper.dispose(this.gEmmrt);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.AYXKKw;
                this.AYXKKw = null;
            }
            if (u != null) {
                this.EZpvd.offer(u);
                this.copydefault = true;
                if (KWHzl()) {
                    yBB.copydefault((InterfaceC58299yyf) this.EZpvd, (InterfaceC58256yxp) this.OLrzqt, false, (InterfaceC58217yxC) null, (InterfaceC56342yBv) this);
                }
            }
            DisposableHelper.dispose(this.gEmmrt);
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            DisposableHelper.dispose(this.gEmmrt);
            this.AkhnZx.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.gEmmrt.get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) C58297yyd.AEQbTJ(this.AhwBna.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.AYXKKw;
                    if (u != null) {
                        this.AYXKKw = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.dispose(this.gEmmrt);
                } else {
                    KWHzl(u, false, this);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.onError(th);
                dispose();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yxp;Ljava/lang/Object;)V */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            this.OLrzqt.onNext((java.lang.Object) u);
        }
    }

    /* JADX INFO: renamed from: o.yzu$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, U extends java.util.Collection<? super T>> extends AbstractC58316yyw<T, U, U> implements java.lang.Runnable, InterfaceC58217yxC {
        public final long AYXKKw;
        public final long AhwBna;
        public InterfaceC58217yxC AkhnZx;
        public final AbstractC58253yxm.StateListAnimator fetchVPNInfo;
        public final java.util.List<U> gEmmrt;
        public final java.util.concurrent.TimeUnit isConnected;
        public final Callable<U> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public StateListAnimator(InterfaceC58256yxp<? super U> interfaceC58256yxp, Callable<U> callable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm.StateListAnimator stateListAnimator) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.valueOf = callable;
            this.AhwBna = j;
            this.AYXKKw = j2;
            this.isConnected = timeUnit;
            this.fetchVPNInfo = stateListAnimator;
            this.gEmmrt = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AkhnZx, interfaceC58217yxC)) {
                this.AkhnZx = interfaceC58217yxC;
                try {
                    java.util.Collection collection = (java.util.Collection) C58297yyd.AEQbTJ(this.valueOf.call(), "The buffer supplied is null");
                    this.gEmmrt.add((U) collection);
                    this.OLrzqt.onSubscribe(this);
                    AbstractC58253yxm.StateListAnimator stateListAnimator = this.fetchVPNInfo;
                    long j = this.AYXKKw;
                    stateListAnimator.schedulePeriodically(this, j, j, this.isConnected);
                    this.fetchVPNInfo.schedule(new Application(collection), this.AhwBna, this.isConnected);
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    interfaceC58217yxC.dispose();
                    EmptyDisposable.error(th, this.OLrzqt);
                    this.fetchVPNInfo.dispose();
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<U> it = this.gEmmrt.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault = true;
            valueOf();
            this.OLrzqt.onError(th);
            this.fetchVPNInfo.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.gEmmrt);
                this.gEmmrt.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.EZpvd.offer((U) ((java.util.Collection) it.next()));
            }
            this.copydefault = true;
            if (KWHzl()) {
                yBB.copydefault((InterfaceC58299yyf) this.EZpvd, (InterfaceC58256yxp) this.OLrzqt, false, (InterfaceC58217yxC) this.fetchVPNInfo, (InterfaceC56342yBv) this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            valueOf();
            this.AkhnZx.dispose();
            this.fetchVPNInfo.dispose();
        }

        public void valueOf() {
            synchronized (this) {
                this.gEmmrt.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.KWHzl) {
                return;
            }
            try {
                java.util.Collection collection = (java.util.Collection) C58297yyd.AEQbTJ(this.valueOf.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.KWHzl) {
                        return;
                    }
                    this.gEmmrt.add((U) collection);
                    this.fetchVPNInfo.schedule(new ActionBar(collection), this.AhwBna, this.isConnected);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.onError(th);
                dispose();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yxp;Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: U extends java.util.Collection<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            interfaceC58256yxp.onNext(u);
        }

        /* JADX INFO: renamed from: o.yzu$StateListAnimator$ActionBar */
        public final class ActionBar implements java.lang.Runnable {
            public final U KWHzl;

            public ActionBar(U u) {
                this.KWHzl = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (StateListAnimator.this) {
                    StateListAnimator.this.gEmmrt.remove(this.KWHzl);
                }
                StateListAnimator stateListAnimator = StateListAnimator.this;
                stateListAnimator.copydefault(this.KWHzl, false, stateListAnimator.fetchVPNInfo);
            }
        }

        /* JADX INFO: renamed from: o.yzu$StateListAnimator$Application */
        public final class Application implements java.lang.Runnable {
            public final U copydefault;

            public Application(U u) {
                this.copydefault = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (StateListAnimator.this) {
                    StateListAnimator.this.gEmmrt.remove(this.copydefault);
                }
                StateListAnimator stateListAnimator = StateListAnimator.this;
                stateListAnimator.copydefault(this.copydefault, false, stateListAnimator.fetchVPNInfo);
            }
        }
    }

    /* JADX INFO: renamed from: o.yzu$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, U extends java.util.Collection<? super T>> extends AbstractC58316yyw<T, U, U> implements java.lang.Runnable, InterfaceC58217yxC {
        public final int AYXKKw;
        public long AhwBna;
        public final boolean AkhnZx;
        public final java.util.concurrent.TimeUnit DbNXlk;
        public final AbstractC58253yxm.StateListAnimator fARcdN;
        public InterfaceC58217yxC fJNWhG;
        public InterfaceC58217yxC fetchVPNInfo;
        public U gEmmrt;
        public long isConnected;
        public final Callable<U> valueOf;
        public final long values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public Activity(InterfaceC58256yxp<? super U> interfaceC58256yxp, Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, int i, boolean z, AbstractC58253yxm.StateListAnimator stateListAnimator) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.valueOf = callable;
            this.values = j;
            this.DbNXlk = timeUnit;
            this.AYXKKw = i;
            this.AkhnZx = z;
            this.fARcdN = stateListAnimator;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.fJNWhG, interfaceC58217yxC)) {
                this.fJNWhG = interfaceC58217yxC;
                try {
                    this.gEmmrt = (U) C58297yyd.AEQbTJ(this.valueOf.call(), "The buffer supplied is null");
                    this.OLrzqt.onSubscribe(this);
                    AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
                    long j = this.values;
                    this.fetchVPNInfo = stateListAnimator.schedulePeriodically(this, j, j, this.DbNXlk);
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    interfaceC58217yxC.dispose();
                    EmptyDisposable.error(th, this.OLrzqt);
                    this.fARcdN.dispose();
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            synchronized (this) {
                U u = this.gEmmrt;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.AYXKKw) {
                    return;
                }
                this.gEmmrt = null;
                this.isConnected++;
                if (this.AkhnZx) {
                    this.fetchVPNInfo.dispose();
                }
                copydefault(u, false, this);
                try {
                    U u2 = (U) C58297yyd.AEQbTJ(this.valueOf.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.gEmmrt = u2;
                        this.AhwBna++;
                    }
                    if (this.AkhnZx) {
                        AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
                        long j = this.values;
                        this.fetchVPNInfo = stateListAnimator.schedulePeriodically(this, j, j, this.DbNXlk);
                    }
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    this.OLrzqt.onError(th);
                    dispose();
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.gEmmrt = null;
            }
            this.OLrzqt.onError(th);
            this.fARcdN.dispose();
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            U u;
            this.fARcdN.dispose();
            synchronized (this) {
                u = this.gEmmrt;
                this.gEmmrt = null;
            }
            if (u != null) {
                this.EZpvd.offer(u);
                this.copydefault = true;
                if (KWHzl()) {
                    yBB.copydefault((InterfaceC58299yyf) this.EZpvd, (InterfaceC58256yxp) this.OLrzqt, false, (InterfaceC58217yxC) this, (InterfaceC56342yBv) this);
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yxp;Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: U extends java.util.Collection<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            interfaceC58256yxp.onNext(u);
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.fJNWhG.dispose();
            this.fARcdN.dispose();
            synchronized (this) {
                this.gEmmrt = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) C58297yyd.AEQbTJ(this.valueOf.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.gEmmrt;
                    if (u2 != null && this.isConnected == this.AhwBna) {
                        this.gEmmrt = u;
                        copydefault(u2, false, this);
                    }
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                dispose();
                this.OLrzqt.onError(th);
            }
        }
    }
}

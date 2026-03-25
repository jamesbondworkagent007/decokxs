package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedList;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56319yAz<T> extends AbstractC58349yzc<T, AbstractC58247yxg<T>> {
    public final AbstractC58253yxm AEQbTJ;
    public final long AhwBna;
    public final int EZpvd;
    public final boolean KWHzl;
    public final long copydefault;
    public final long gEmmrt;
    public final java.util.concurrent.TimeUnit valueOf;

    public C56319yAz(InterfaceC58255yxo<T> interfaceC58255yxo, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, long j3, int i, boolean z) {
        super(interfaceC58255yxo);
        this.AhwBna = j;
        this.gEmmrt = j2;
        this.valueOf = timeUnit;
        this.AEQbTJ = abstractC58253yxm;
        this.copydefault = j3;
        this.EZpvd = i;
        this.KWHzl = z;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp) {
        yBE ybe = new yBE(interfaceC58256yxp);
        long j = this.AhwBna;
        long j2 = this.gEmmrt;
        if (j != j2) {
            this.OLrzqt.subscribe(new TaskDescription(ybe, j, j2, this.valueOf, this.AEQbTJ.createWorker(), this.EZpvd));
            return;
        }
        long j3 = this.copydefault;
        if (j3 == Long.MAX_VALUE) {
            this.OLrzqt.subscribe(new ActionBar(ybe, this.AhwBna, this.valueOf, this.AEQbTJ, this.EZpvd));
        } else {
            this.OLrzqt.subscribe(new Activity(ybe, j, this.valueOf, this.AEQbTJ, this.EZpvd, j3, this.KWHzl));
        }
    }

    /* JADX INFO: renamed from: o.yAz$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> extends AbstractC58316yyw<T, java.lang.Object, AbstractC58247yxg<T>> implements InterfaceC58217yxC, java.lang.Runnable {
        public static final java.lang.Object AhwBna = new java.lang.Object();
        public volatile boolean AYXKKw;
        public final SequentialDisposable AkhnZx;
        public final java.util.concurrent.TimeUnit DbNXlk;
        public UnicastSubject<T> fetchVPNInfo;
        public final int gEmmrt;
        public final long isConnected;
        public final AbstractC58253yxm valueOf;
        public InterfaceC58217yxC values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public ActionBar(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.AkhnZx = new SequentialDisposable();
            this.isConnected = j;
            this.DbNXlk = timeUnit;
            this.valueOf = abstractC58253yxm;
            this.gEmmrt = i;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.values, interfaceC58217yxC)) {
                this.values = interfaceC58217yxC;
                this.fetchVPNInfo = UnicastSubject.AEQbTJ(this.gEmmrt);
                InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
                interfaceC58256yxp.onSubscribe(this);
                interfaceC58256yxp.onNext(this.fetchVPNInfo);
                if (this.KWHzl) {
                    return;
                }
                AbstractC58253yxm abstractC58253yxm = this.valueOf;
                long j = this.isConnected;
                this.AkhnZx.replace(abstractC58253yxm.schedulePeriodicallyDirect(this, j, j, this.DbNXlk));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AYXKKw) {
                return;
            }
            if (OLrzqt()) {
                this.fetchVPNInfo.onNext(t);
                if (AEQbTJ(-1) == 0) {
                    return;
                }
            } else {
                this.EZpvd.offer((U) NotificationLite.next(t));
                if (!KWHzl()) {
                    return;
                }
            }
            AYXKKw();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AEQbTJ = th;
            this.copydefault = true;
            if (KWHzl()) {
                AYXKKw();
            }
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault = true;
            if (KWHzl()) {
                AYXKKw();
            }
            this.OLrzqt.onComplete();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.KWHzl) {
                this.AYXKKw = true;
            }
            this.EZpvd.offer((U) AhwBna);
            if (KWHzl()) {
                AYXKKw();
            }
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0009 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0009 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: com.immomo.mls.fun.ud.view.UDWebSvgView$2$2 */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r7.AkhnZx.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.fetchVPNInfo = null;
            r0.clear();
            r0 = r7.AEQbTJ;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void AYXKKw() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.EZpvd;
            InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
            UnicastSubject<T> unicastSubject = this.fetchVPNInfo;
            int iAEQbTJ = 1;
            while (true) {
                boolean z = this.AYXKKw;
                boolean z2 = this.copydefault;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                if (z2 && (objPoll == null || objPoll == AhwBna)) {
                    break;
                }
                if (objPoll == null) {
                    iAEQbTJ = AEQbTJ(-iAEQbTJ);
                    if (iAEQbTJ == 0) {
                        return;
                    }
                } else if (objPoll == AhwBna) {
                    unicastSubject.onComplete();
                    if (!z) {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.AEQbTJ(this.gEmmrt);
                        this.fetchVPNInfo = unicastSubject;
                        interfaceC58256yxp.onNext(unicastSubject);
                    } else {
                        this.values.dispose();
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yAz$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> extends AbstractC58316yyw<T, java.lang.Object, AbstractC58247yxg<T>> implements InterfaceC58217yxC {
        public final long AYXKKw;
        public final int AhwBna;
        public volatile boolean AkhnZx;
        public final java.util.concurrent.TimeUnit AuCTel;
        public final AbstractC58253yxm DbNXlk;
        public final AbstractC58253yxm.StateListAnimator fARcdN;
        public InterfaceC58217yxC fIwbmz;
        public UnicastSubject<T> fJNWhG;
        public final long fetchVPNInfo;
        public long gEmmrt;
        public final SequentialDisposable isConnected;
        public long valueOf;
        public final boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public Activity(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i, long j2, boolean z) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.isConnected = new SequentialDisposable();
            this.fetchVPNInfo = j;
            this.AuCTel = timeUnit;
            this.DbNXlk = abstractC58253yxm;
            this.AhwBna = i;
            this.AYXKKw = j2;
            this.values = z;
            this.fARcdN = z ? abstractC58253yxm.createWorker() : null;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            InterfaceC58217yxC interfaceC58217yxCSchedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.fIwbmz, interfaceC58217yxC)) {
                this.fIwbmz = interfaceC58217yxC;
                InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
                interfaceC58256yxp.onSubscribe(this);
                if (this.KWHzl) {
                    return;
                }
                UnicastSubject<T> unicastSubjectAEQbTJ = UnicastSubject.AEQbTJ(this.AhwBna);
                this.fJNWhG = unicastSubjectAEQbTJ;
                interfaceC58256yxp.onNext(unicastSubjectAEQbTJ);
                Application application = new Application(this.gEmmrt, this);
                if (this.values) {
                    AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
                    long j = this.fetchVPNInfo;
                    interfaceC58217yxCSchedulePeriodicallyDirect = stateListAnimator.schedulePeriodically(application, j, j, this.AuCTel);
                } else {
                    AbstractC58253yxm abstractC58253yxm = this.DbNXlk;
                    long j2 = this.fetchVPNInfo;
                    interfaceC58217yxCSchedulePeriodicallyDirect = abstractC58253yxm.schedulePeriodicallyDirect(application, j2, j2, this.AuCTel);
                }
                this.isConnected.replace(interfaceC58217yxCSchedulePeriodicallyDirect);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AkhnZx) {
                return;
            }
            if (OLrzqt()) {
                UnicastSubject<T> unicastSubject = this.fJNWhG;
                unicastSubject.onNext(t);
                long j = this.valueOf + 1;
                if (j >= this.AYXKKw) {
                    this.gEmmrt++;
                    this.valueOf = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectAEQbTJ = UnicastSubject.AEQbTJ(this.AhwBna);
                    this.fJNWhG = unicastSubjectAEQbTJ;
                    this.OLrzqt.onNext(unicastSubjectAEQbTJ);
                    if (this.values) {
                        this.isConnected.get().dispose();
                        AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
                        Application application = new Application(this.gEmmrt, this);
                        long j2 = this.fetchVPNInfo;
                        DisposableHelper.replace(this.isConnected, stateListAnimator.schedulePeriodically(application, j2, j2, this.AuCTel));
                    }
                } else {
                    this.valueOf = j;
                }
                if (AEQbTJ(-1) == 0) {
                    return;
                }
            } else {
                this.EZpvd.offer((U) NotificationLite.next(t));
                if (!KWHzl()) {
                    return;
                }
            }
            valueOf();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AEQbTJ = th;
            this.copydefault = true;
            if (KWHzl()) {
                valueOf();
            }
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault = true;
            if (KWHzl()) {
                valueOf();
            }
            this.OLrzqt.onComplete();
        }

        public void gEmmrt() {
            DisposableHelper.dispose(this.isConnected);
            AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
            if (stateListAnimator != null) {
                stateListAnimator.dispose();
            }
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x000a */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x000a */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: io.reactivex.subjects.UnicastSubject<T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: com.immomo.mls.fun.ud.view.UDWebSvgView$2$2 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void valueOf() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.EZpvd;
            InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
            UnicastSubject<T> unicastSubject = this.fJNWhG;
            int iAEQbTJ = 1;
            while (!this.AkhnZx) {
                boolean z = this.copydefault;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof Application;
                if (z && (z2 || z3)) {
                    this.fJNWhG = null;
                    mpscLinkedQueue.clear();
                    java.lang.Throwable th = this.AEQbTJ;
                    if (th != null) {
                        unicastSubject.onError(th);
                    } else {
                        unicastSubject.onComplete();
                    }
                    gEmmrt();
                    return;
                }
                if (z2) {
                    iAEQbTJ = AEQbTJ(-iAEQbTJ);
                    if (iAEQbTJ == 0) {
                        return;
                    }
                } else if (z3) {
                    Application application = (Application) objPoll;
                    if (!this.values || this.gEmmrt == application.EZpvd) {
                        unicastSubject.onComplete();
                        this.valueOf = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.AEQbTJ(this.AhwBna);
                        this.fJNWhG = unicastSubject;
                        interfaceC58256yxp.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j = this.valueOf + 1;
                    if (j >= this.AYXKKw) {
                        this.gEmmrt++;
                        this.valueOf = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.AEQbTJ(this.AhwBna);
                        this.fJNWhG = unicastSubject;
                        this.OLrzqt.onNext(unicastSubject);
                        if (this.values) {
                            InterfaceC58217yxC interfaceC58217yxC = this.isConnected.get();
                            interfaceC58217yxC.dispose();
                            AbstractC58253yxm.StateListAnimator stateListAnimator = this.fARcdN;
                            Application application2 = new Application(this.gEmmrt, this);
                            long j2 = this.fetchVPNInfo;
                            InterfaceC58217yxC interfaceC58217yxCSchedulePeriodically = stateListAnimator.schedulePeriodically(application2, j2, j2, this.AuCTel);
                            if (!this.isConnected.compareAndSet(interfaceC58217yxC, interfaceC58217yxCSchedulePeriodically)) {
                                interfaceC58217yxCSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.valueOf = j;
                    }
                }
            }
            this.fIwbmz.dispose();
            mpscLinkedQueue.clear();
            gEmmrt();
        }

        /* JADX INFO: renamed from: o.yAz$Activity$Application */
        public static final class Application implements java.lang.Runnable {
            public final long EZpvd;
            public final Activity<?> copydefault;

            public Application(long j, Activity<?> activity) {
                this.EZpvd = j;
                this.copydefault = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity<?> activity = this.copydefault;
                if (!activity.KWHzl) {
                    activity.EZpvd.offer(this);
                } else {
                    activity.AkhnZx = true;
                }
                if (activity.KWHzl()) {
                    activity.valueOf();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yAz$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> extends AbstractC58316yyw<T, java.lang.Object, AbstractC58247yxg<T>> implements InterfaceC58217yxC, java.lang.Runnable {
        public final long AYXKKw;
        public final long AhwBna;
        public InterfaceC58217yxC AkhnZx;
        public final java.util.concurrent.TimeUnit fetchVPNInfo;
        public final int gEmmrt;
        public final AbstractC58253yxm.StateListAnimator isConnected;
        public volatile boolean valueOf;
        public final java.util.List<UnicastSubject<T>> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl;
        }

        public TaskDescription(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp, long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm.StateListAnimator stateListAnimator, int i) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.AYXKKw = j;
            this.AhwBna = j2;
            this.fetchVPNInfo = timeUnit;
            this.isConnected = stateListAnimator;
            this.gEmmrt = i;
            this.values = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AkhnZx, interfaceC58217yxC)) {
                this.AkhnZx = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
                if (this.KWHzl) {
                    return;
                }
                UnicastSubject<T> unicastSubjectAEQbTJ = UnicastSubject.AEQbTJ(this.gEmmrt);
                this.values.add(unicastSubjectAEQbTJ);
                this.OLrzqt.onNext(unicastSubjectAEQbTJ);
                this.isConnected.schedule(new Activity(unicastSubjectAEQbTJ), this.AYXKKw, this.fetchVPNInfo);
                AbstractC58253yxm.StateListAnimator stateListAnimator = this.isConnected;
                long j = this.AhwBna;
                stateListAnimator.schedulePeriodically(this, j, j, this.fetchVPNInfo);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (OLrzqt()) {
                java.util.Iterator<UnicastSubject<T>> it = this.values.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (AEQbTJ(-1) == 0) {
                    return;
                }
            } else {
                this.EZpvd.offer((U) t);
                if (!KWHzl()) {
                    return;
                }
            }
            AhwBna();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AEQbTJ = th;
            this.copydefault = true;
            if (KWHzl()) {
                AhwBna();
            }
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault = true;
            if (KWHzl()) {
                AhwBna();
            }
            this.OLrzqt.onComplete();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void copydefault(UnicastSubject<T> unicastSubject) {
            this.EZpvd.offer((U) new C0999TaskDescription(unicastSubject, false));
            if (KWHzl()) {
                AhwBna();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: io.reactivex.subjects.UnicastSubject */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void AhwBna() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.EZpvd;
            InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
            java.util.List<UnicastSubject<T>> list = this.values;
            int iAEQbTJ = 1;
            while (!this.valueOf) {
                boolean z = this.copydefault;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof C0999TaskDescription;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    java.lang.Throwable th = this.AEQbTJ;
                    if (th != null) {
                        java.util.Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.isConnected.dispose();
                    return;
                }
                if (z2) {
                    iAEQbTJ = AEQbTJ(-iAEQbTJ);
                    if (iAEQbTJ == 0) {
                        return;
                    }
                } else if (z3) {
                    C0999TaskDescription c0999TaskDescription = (C0999TaskDescription) objPoll;
                    if (!c0999TaskDescription.KWHzl) {
                        list.remove(c0999TaskDescription.EZpvd);
                        c0999TaskDescription.EZpvd.onComplete();
                        if (list.isEmpty() && this.KWHzl) {
                            this.valueOf = true;
                        }
                    } else if (!this.KWHzl) {
                        UnicastSubject<T> unicastSubjectAEQbTJ = UnicastSubject.AEQbTJ(this.gEmmrt);
                        list.add(unicastSubjectAEQbTJ);
                        interfaceC58256yxp.onNext(unicastSubjectAEQbTJ);
                        this.isConnected.schedule(new Activity(unicastSubjectAEQbTJ), this.AYXKKw, this.fetchVPNInfo);
                    }
                } else {
                    java.util.Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.AkhnZx.dispose();
            mpscLinkedQueue.clear();
            list.clear();
            this.isConnected.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object c0999TaskDescription = new C0999TaskDescription(UnicastSubject.AEQbTJ(this.gEmmrt), true);
            if (!this.KWHzl) {
                this.EZpvd.offer((U) c0999TaskDescription);
            }
            if (KWHzl()) {
                AhwBna();
            }
        }

        /* JADX INFO: renamed from: o.yAz$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0999TaskDescription<T> {
            public final UnicastSubject<T> EZpvd;
            public final boolean KWHzl;

            public C0999TaskDescription(UnicastSubject<T> unicastSubject, boolean z) {
                this.EZpvd = unicastSubject;
                this.KWHzl = z;
            }
        }

        /* JADX INFO: renamed from: o.yAz$TaskDescription$Activity */
        public final class Activity implements java.lang.Runnable {
            public final UnicastSubject<T> KWHzl;

            public Activity(UnicastSubject<T> unicastSubject) {
                this.KWHzl = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                TaskDescription.this.copydefault(this.KWHzl);
            }
        }
    }
}

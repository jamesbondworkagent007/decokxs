package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.CallbackException;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.atomic.AtomicInteger;
import o.C5362Ou;
import o.SL;

/* JADX INFO: renamed from: o.Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5359Or<R> implements DecodeJob.StateListAnimator<R>, SL.TaskDescription {
    public static final ActionBar copydefault = new ActionBar();
    public final ExecutorServiceC5373Pf AEQbTJ;
    public final ActionBar AYXKKw;
    public C5362Ou<?> AhwBna;
    public boolean AkhnZx;
    public NH AuCTel;
    public boolean DbNXlk;
    public final TaskDescription EZpvd;
    public com.bumptech.glide.load.DataSource KWHzl;
    public DecodeJob<R> OLrzqt;
    public GlideException djBIcL;
    public final Pools.Pool<C5359Or<?>> ejfBZ;
    public OC<?> fARcdN;
    public final AtomicInteger fIwbmz;
    public boolean fJNWhG;
    public volatile boolean fetchVPNInfo;
    public final ExecutorServiceC5373Pf gEmmrt;
    public final ExecutorServiceC5373Pf getFieldNames;
    public final C5362Ou.Activity getNewProxyInstance;
    public final ExecutorServiceC5373Pf hDKMBd;
    public boolean isConnected;
    public boolean iwGUEr;
    public final SJ uzCIH;
    public final InterfaceC5361Ot valueOf;
    public boolean values;
    public boolean zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.isConnected || this.values || this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExecutorServiceC5373Pf OLrzqt() {
        return this.zsXlph ? this.hDKMBd : this.iwGUEr ? this.AEQbTJ : this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.SL.TaskDescription
    public SJ valueOf() {
        return this.uzCIH;
    }

    public C5359Or(ExecutorServiceC5373Pf executorServiceC5373Pf, ExecutorServiceC5373Pf executorServiceC5373Pf2, ExecutorServiceC5373Pf executorServiceC5373Pf3, ExecutorServiceC5373Pf executorServiceC5373Pf4, InterfaceC5361Ot interfaceC5361Ot, C5362Ou.Activity activity, Pools.Pool<C5359Or<?>> pool) {
        this(executorServiceC5373Pf, executorServiceC5373Pf2, executorServiceC5373Pf3, executorServiceC5373Pf4, interfaceC5361Ot, activity, pool, copydefault);
    }

    public C5359Or(ExecutorServiceC5373Pf executorServiceC5373Pf, ExecutorServiceC5373Pf executorServiceC5373Pf2, ExecutorServiceC5373Pf executorServiceC5373Pf3, ExecutorServiceC5373Pf executorServiceC5373Pf4, InterfaceC5361Ot interfaceC5361Ot, C5362Ou.Activity activity, Pools.Pool<C5359Or<?>> pool, ActionBar actionBar) {
        this.EZpvd = new TaskDescription();
        this.uzCIH = SJ.copydefault();
        this.fIwbmz = new AtomicInteger();
        this.gEmmrt = executorServiceC5373Pf;
        this.getFieldNames = executorServiceC5373Pf2;
        this.hDKMBd = executorServiceC5373Pf3;
        this.AEQbTJ = executorServiceC5373Pf4;
        this.valueOf = interfaceC5361Ot;
        this.getNewProxyInstance = activity;
        this.ejfBZ = pool;
        this.AYXKKw = actionBar;
    }

    public C5359Or<R> OLrzqt(NH nh, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.AuCTel = nh;
            this.DbNXlk = z;
            this.zsXlph = z2;
            this.iwGUEr = z3;
            this.fJNWhG = z4;
        }
        return this;
    }

    public void copydefault(DecodeJob<R> decodeJob) {
        synchronized (this) {
            this.OLrzqt = decodeJob;
            (decodeJob.values() ? this.gEmmrt : OLrzqt()).execute(decodeJob);
        }
    }

    public void copydefault(InterfaceC5446Sa interfaceC5446Sa, java.util.concurrent.Executor executor) {
        synchronized (this) {
            this.uzCIH.AEQbTJ();
            this.EZpvd.KWHzl(interfaceC5446Sa, executor);
            if (this.values) {
                KWHzl(1);
                executor.execute(new StateListAnimator(interfaceC5446Sa));
            } else if (this.isConnected) {
                KWHzl(1);
                executor.execute(new Activity(interfaceC5446Sa));
            } else {
                SE.copydefault(!this.fetchVPNInfo, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public void OLrzqt(InterfaceC5446Sa interfaceC5446Sa) {
        try {
            interfaceC5446Sa.OLrzqt(this.AhwBna, this.KWHzl, this.AkhnZx);
        } catch (java.lang.Throwable th) {
            throw new CallbackException(th);
        }
    }

    public void copydefault(InterfaceC5446Sa interfaceC5446Sa) {
        try {
            interfaceC5446Sa.copydefault(this.djBIcL);
        } catch (java.lang.Throwable th) {
            throw new CallbackException(th);
        }
    }

    public void KWHzl(InterfaceC5446Sa interfaceC5446Sa) {
        synchronized (this) {
            this.uzCIH.AEQbTJ();
            this.EZpvd.AEQbTJ(interfaceC5446Sa);
            if (this.EZpvd.KWHzl()) {
                copydefault();
                if ((this.values || this.isConnected) && this.fIwbmz.get() == 0) {
                    AYXKKw();
                }
            }
        }
    }

    public void copydefault() {
        if (EZpvd()) {
            return;
        }
        this.fetchVPNInfo = true;
        this.OLrzqt.OLrzqt();
        this.valueOf.KWHzl(this, this.AuCTel);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void gEmmrt() {
        synchronized (this) {
            this.uzCIH.AEQbTJ();
            if (this.fetchVPNInfo) {
                this.fARcdN.djBIcL();
                AYXKKw();
                return;
            }
            if (this.EZpvd.KWHzl()) {
                throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.values) {
                throw new java.lang.IllegalStateException("Already have resource");
            }
            this.AhwBna = this.AYXKKw.AEQbTJ(this.fARcdN, this.DbNXlk, this.AuCTel, this.getNewProxyInstance);
            this.values = true;
            TaskDescription taskDescriptionCopydefault = this.EZpvd.copydefault();
            KWHzl(taskDescriptionCopydefault.OLrzqt() + 1);
            this.valueOf.AEQbTJ(this, this.AuCTel, this.AhwBna);
            for (Application application : taskDescriptionCopydefault) {
                application.AEQbTJ.execute(new StateListAnimator(application.OLrzqt));
            }
            KWHzl();
        }
    }

    public void KWHzl(int i) {
        C5362Ou<?> c5362Ou;
        synchronized (this) {
            SE.copydefault(EZpvd(), "Not yet complete!");
            if (this.fIwbmz.getAndAdd(i) == 0 && (c5362Ou = this.AhwBna) != null) {
                c5362Ou.OLrzqt();
            }
        }
    }

    public void KWHzl() {
        C5362Ou<?> c5362Ou;
        synchronized (this) {
            this.uzCIH.AEQbTJ();
            SE.copydefault(EZpvd(), "Not yet complete!");
            int iDecrementAndGet = this.fIwbmz.decrementAndGet();
            SE.copydefault(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                c5362Ou = this.AhwBna;
                AYXKKw();
            } else {
                c5362Ou = null;
            }
        }
        if (c5362Ou != null) {
            c5362Ou.valueOf();
        }
    }

    private void AYXKKw() {
        synchronized (this) {
            if (this.AuCTel == null) {
                throw new java.lang.IllegalArgumentException();
            }
            this.EZpvd.AEQbTJ();
            this.AuCTel = null;
            this.AhwBna = null;
            this.fARcdN = null;
            this.isConnected = false;
            this.fetchVPNInfo = false;
            this.values = false;
            this.AkhnZx = false;
            this.OLrzqt.copydefault(false);
            this.OLrzqt = null;
            this.djBIcL = null;
            this.KWHzl = null;
            this.ejfBZ.release(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.OC<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.StateListAnimator
    public void OLrzqt(OC<R> oc, com.bumptech.glide.load.DataSource dataSource, boolean z) {
        synchronized (this) {
            this.fARcdN = oc;
            this.KWHzl = dataSource;
            this.AkhnZx = z;
        }
        gEmmrt();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.StateListAnimator
    public void copydefault(GlideException glideException) {
        synchronized (this) {
            this.djBIcL = glideException;
        }
        AEQbTJ();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.StateListAnimator
    public void EZpvd(DecodeJob<?> decodeJob) {
        OLrzqt().execute(decodeJob);
    }

    public void AEQbTJ() {
        synchronized (this) {
            this.uzCIH.AEQbTJ();
            if (this.fetchVPNInfo) {
                AYXKKw();
                return;
            }
            if (this.EZpvd.KWHzl()) {
                throw new java.lang.IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.isConnected) {
                throw new java.lang.IllegalStateException("Already failed once");
            }
            this.isConnected = true;
            NH nh = this.AuCTel;
            TaskDescription taskDescriptionCopydefault = this.EZpvd.copydefault();
            KWHzl(taskDescriptionCopydefault.OLrzqt() + 1);
            this.valueOf.AEQbTJ(this, nh, null);
            for (Application application : taskDescriptionCopydefault) {
                application.AEQbTJ.execute(new Activity(application.OLrzqt));
            }
            KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.Or$Activity */
    public class Activity implements java.lang.Runnable {
        public final InterfaceC5446Sa copydefault;

        public Activity(InterfaceC5446Sa interfaceC5446Sa) {
            this.copydefault = interfaceC5446Sa;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.copydefault.copydefault()) {
                synchronized (C5359Or.this) {
                    if (C5359Or.this.EZpvd.OLrzqt(this.copydefault)) {
                        C5359Or.this.copydefault(this.copydefault);
                    }
                    C5359Or.this.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.Or$StateListAnimator */
    public class StateListAnimator implements java.lang.Runnable {
        public final InterfaceC5446Sa AEQbTJ;

        public StateListAnimator(InterfaceC5446Sa interfaceC5446Sa) {
            this.AEQbTJ = interfaceC5446Sa;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.AEQbTJ.copydefault()) {
                synchronized (C5359Or.this) {
                    if (C5359Or.this.EZpvd.OLrzqt(this.AEQbTJ)) {
                        C5359Or.this.AhwBna.OLrzqt();
                        C5359Or.this.OLrzqt(this.AEQbTJ);
                        C5359Or.this.KWHzl(this.AEQbTJ);
                    }
                    C5359Or.this.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.Or$TaskDescription */
    public static final class TaskDescription implements java.lang.Iterable<Application> {
        public final java.util.List<Application> copydefault;

        public TaskDescription() {
            this(new java.util.ArrayList(2));
        }

        public TaskDescription(java.util.List<Application> list) {
            this.copydefault = list;
        }

        public void KWHzl(InterfaceC5446Sa interfaceC5446Sa, java.util.concurrent.Executor executor) {
            this.copydefault.add(new Application(interfaceC5446Sa, executor));
        }

        public void AEQbTJ(InterfaceC5446Sa interfaceC5446Sa) {
            this.copydefault.remove(copydefault(interfaceC5446Sa));
        }

        public boolean OLrzqt(InterfaceC5446Sa interfaceC5446Sa) {
            return this.copydefault.contains(copydefault(interfaceC5446Sa));
        }

        public boolean KWHzl() {
            return this.copydefault.isEmpty();
        }

        public int OLrzqt() {
            return this.copydefault.size();
        }

        public void AEQbTJ() {
            this.copydefault.clear();
        }

        public TaskDescription copydefault() {
            return new TaskDescription(new java.util.ArrayList(this.copydefault));
        }

        public static Application copydefault(InterfaceC5446Sa interfaceC5446Sa) {
            return new Application(interfaceC5446Sa, C5469Sx.OLrzqt());
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<Application> iterator() {
            return this.copydefault.iterator();
        }
    }

    /* JADX INFO: renamed from: o.Or$Application */
    public static final class Application {
        public final java.util.concurrent.Executor AEQbTJ;
        public final InterfaceC5446Sa OLrzqt;

        public Application(InterfaceC5446Sa interfaceC5446Sa, java.util.concurrent.Executor executor) {
            this.OLrzqt = interfaceC5446Sa;
            this.AEQbTJ = executor;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof Application) {
                return this.OLrzqt.equals(((Application) obj).OLrzqt);
            }
            return false;
        }

        public int hashCode() {
            return this.OLrzqt.hashCode();
        }
    }

    /* JADX INFO: renamed from: o.Or$ActionBar */
    public static class ActionBar {
        public <R> C5362Ou<R> AEQbTJ(OC<R> oc, boolean z, NH nh, C5362Ou.Activity activity) {
            return new C5362Ou<>(oc, z, true, nh, activity);
        }
    }
}

package o;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Objects;
import o.C5362Ou;
import o.InterfaceC5368Pa;
import o.OP;
import o.SL;

/* JADX INFO: renamed from: o.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5357Op implements InterfaceC5361Ot, InterfaceC5368Pa.ActionBar, C5362Ou.Activity {
    public static final boolean copydefault = android.util.Log.isLoggable("Engine", 2);
    public final C5348Og AEQbTJ;
    public final TaskDescription AYXKKw;
    public final C5365Ox AhwBna;
    public final ActionBar EZpvd;
    public final InterfaceC5368Pa KWHzl;
    public final Activity OLrzqt;
    public final C5366Oy gEmmrt;
    public final OB valueOf;

    public C5357Op(InterfaceC5368Pa interfaceC5368Pa, OP.Activity activity, ExecutorServiceC5373Pf executorServiceC5373Pf, ExecutorServiceC5373Pf executorServiceC5373Pf2, ExecutorServiceC5373Pf executorServiceC5373Pf3, ExecutorServiceC5373Pf executorServiceC5373Pf4, boolean z) {
        this(interfaceC5368Pa, activity, executorServiceC5373Pf, executorServiceC5373Pf2, executorServiceC5373Pf3, executorServiceC5373Pf4, null, null, null, null, null, null, z);
    }

    public C5357Op(InterfaceC5368Pa interfaceC5368Pa, OP.Activity activity, ExecutorServiceC5373Pf executorServiceC5373Pf, ExecutorServiceC5373Pf executorServiceC5373Pf2, ExecutorServiceC5373Pf executorServiceC5373Pf3, ExecutorServiceC5373Pf executorServiceC5373Pf4, C5366Oy c5366Oy, C5365Ox c5365Ox, C5348Og c5348Og, TaskDescription taskDescription, Activity activity2, OB ob, boolean z) {
        this.KWHzl = interfaceC5368Pa;
        ActionBar actionBar = new ActionBar(activity);
        this.EZpvd = actionBar;
        C5348Og c5348Og2 = c5348Og == null ? new C5348Og(z) : c5348Og;
        this.AEQbTJ = c5348Og2;
        c5348Og2.AEQbTJ(this);
        this.AhwBna = c5365Ox == null ? new C5365Ox() : c5365Ox;
        this.gEmmrt = c5366Oy == null ? new C5366Oy() : c5366Oy;
        this.AYXKKw = taskDescription == null ? new TaskDescription(executorServiceC5373Pf, executorServiceC5373Pf2, executorServiceC5373Pf3, executorServiceC5373Pf4, this, this) : taskDescription;
        this.OLrzqt = activity2 == null ? new Activity(actionBar) : activity2;
        this.valueOf = ob == null ? new OB() : ob;
        interfaceC5368Pa.KWHzl(this);
    }

    public <R> StateListAnimator OLrzqt(C5330No c5330No, java.lang.Object obj, NH nh, int i, int i2, java.lang.Class<?> cls, java.lang.Class<R> cls2, Priority priority, AbstractC5360Os abstractC5360Os, java.util.Map<java.lang.Class<?>, NN<?>> map, boolean z, boolean z2, NM nm, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC5446Sa interfaceC5446Sa, java.util.concurrent.Executor executor) {
        long jCopydefault = copydefault ? SF.copydefault() : 0L;
        C5358Oq c5358OqAEQbTJ = this.AhwBna.AEQbTJ(obj, nh, i, i2, map, cls, cls2, nm);
        synchronized (this) {
            C5362Ou<?> c5362OuAEQbTJ = AEQbTJ(c5358OqAEQbTJ, z3, jCopydefault);
            if (c5362OuAEQbTJ == null) {
                return KWHzl(c5330No, obj, nh, i, i2, cls, cls2, priority, abstractC5360Os, map, z, z2, nm, z3, z4, z5, z6, interfaceC5446Sa, executor, c5358OqAEQbTJ, jCopydefault);
            }
            interfaceC5446Sa.OLrzqt(c5362OuAEQbTJ, com.bumptech.glide.load.DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    public final <R> StateListAnimator KWHzl(C5330No c5330No, java.lang.Object obj, NH nh, int i, int i2, java.lang.Class<?> cls, java.lang.Class<R> cls2, Priority priority, AbstractC5360Os abstractC5360Os, java.util.Map<java.lang.Class<?>, NN<?>> map, boolean z, boolean z2, NM nm, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC5446Sa interfaceC5446Sa, java.util.concurrent.Executor executor, C5358Oq c5358Oq, long j) {
        C5359Or<?> c5359OrEZpvd = this.gEmmrt.EZpvd(c5358Oq, z6);
        if (c5359OrEZpvd != null) {
            c5359OrEZpvd.copydefault(interfaceC5446Sa, executor);
            if (copydefault) {
                AEQbTJ("Added to existing load", j, c5358Oq);
            }
            return new StateListAnimator(interfaceC5446Sa, c5359OrEZpvd);
        }
        C5359Or<R> c5359OrCopydefault = this.AYXKKw.copydefault(c5358Oq, z3, z4, z5, z6);
        DecodeJob<R> decodeJobOLrzqt = this.OLrzqt.OLrzqt(c5330No, obj, c5358Oq, nh, i, i2, cls, cls2, priority, abstractC5360Os, map, z, z2, z6, nm, c5359OrCopydefault);
        this.gEmmrt.copydefault(c5358Oq, c5359OrCopydefault);
        c5359OrCopydefault.copydefault(interfaceC5446Sa, executor);
        c5359OrCopydefault.copydefault(decodeJobOLrzqt);
        if (copydefault) {
            AEQbTJ("Started new load", j, c5358Oq);
        }
        return new StateListAnimator(interfaceC5446Sa, c5359OrCopydefault);
    }

    public final C5362Ou<?> AEQbTJ(C5358Oq c5358Oq, boolean z, long j) {
        if (!z) {
            return null;
        }
        C5362Ou<?> c5362OuKWHzl = KWHzl(c5358Oq);
        if (c5362OuKWHzl != null) {
            if (copydefault) {
                AEQbTJ("Loaded resource from active resources", j, c5358Oq);
            }
            return c5362OuKWHzl;
        }
        C5362Ou<?> c5362OuEZpvd = EZpvd(c5358Oq);
        if (c5362OuEZpvd == null) {
            return null;
        }
        if (copydefault) {
            AEQbTJ("Loaded resource from cache", j, c5358Oq);
        }
        return c5362OuEZpvd;
    }

    public static void AEQbTJ(java.lang.String str, long j, NH nh) {
        SF.OLrzqt(j);
        Objects.toString(nh);
    }

    public final C5362Ou<?> KWHzl(NH nh) {
        C5362Ou<?> c5362OuOLrzqt = this.AEQbTJ.OLrzqt(nh);
        if (c5362OuOLrzqt != null) {
            c5362OuOLrzqt.OLrzqt();
        }
        return c5362OuOLrzqt;
    }

    public final C5362Ou<?> EZpvd(NH nh) {
        C5362Ou<?> c5362OuOLrzqt = OLrzqt(nh);
        if (c5362OuOLrzqt != null) {
            c5362OuOLrzqt.OLrzqt();
            this.AEQbTJ.KWHzl(nh, c5362OuOLrzqt);
        }
        return c5362OuOLrzqt;
    }

    public final C5362Ou<?> OLrzqt(NH nh) {
        OC<?> ocCopydefault = this.KWHzl.copydefault(nh);
        if (ocCopydefault == null) {
            return null;
        }
        if (ocCopydefault instanceof C5362Ou) {
            return (C5362Ou) ocCopydefault;
        }
        return new C5362Ou<>(ocCopydefault, true, true, nh, this);
    }

    public void OLrzqt(OC<?> oc) {
        if (oc instanceof C5362Ou) {
            ((C5362Ou) oc).valueOf();
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // o.InterfaceC5361Ot
    public void AEQbTJ(C5359Or<?> c5359Or, NH nh, C5362Ou<?> c5362Ou) {
        synchronized (this) {
            if (c5362Ou != null) {
                if (c5362Ou.AhwBna()) {
                    this.AEQbTJ.KWHzl(nh, c5362Ou);
                }
                this.gEmmrt.KWHzl(nh, c5359Or);
            } else {
                this.gEmmrt.KWHzl(nh, c5359Or);
            }
        }
    }

    @Override // o.InterfaceC5361Ot
    public void KWHzl(C5359Or<?> c5359Or, NH nh) {
        synchronized (this) {
            this.gEmmrt.KWHzl(nh, c5359Or);
        }
    }

    @Override // o.InterfaceC5368Pa.ActionBar
    public void EZpvd(@androidx.annotation.NonNull OC<?> oc) {
        this.valueOf.KWHzl(oc, true);
    }

    @Override // o.C5362Ou.Activity
    public void EZpvd(NH nh, C5362Ou<?> c5362Ou) {
        this.AEQbTJ.EZpvd(nh);
        if (c5362Ou.AhwBna()) {
            this.KWHzl.KWHzl(nh, c5362Ou);
        } else {
            this.valueOf.KWHzl(c5362Ou, false);
        }
    }

    /* JADX INFO: renamed from: o.Op$StateListAnimator */
    public class StateListAnimator {
        public final InterfaceC5446Sa AEQbTJ;
        public final C5359Or<?> copydefault;

        public StateListAnimator(InterfaceC5446Sa interfaceC5446Sa, C5359Or<?> c5359Or) {
            this.AEQbTJ = interfaceC5446Sa;
            this.copydefault = c5359Or;
        }

        public void copydefault() {
            synchronized (C5357Op.this) {
                this.copydefault.KWHzl(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.Op$ActionBar */
    public static class ActionBar implements DecodeJob.TaskDescription {
        public volatile OP KWHzl;
        public final OP.Activity OLrzqt;

        public ActionBar(OP.Activity activity) {
            this.OLrzqt = activity;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.TaskDescription
        public OP KWHzl() {
            if (this.KWHzl == null) {
                synchronized (this) {
                    if (this.KWHzl == null) {
                        this.KWHzl = this.OLrzqt.EZpvd();
                    }
                    if (this.KWHzl == null) {
                        this.KWHzl = new OT();
                    }
                }
            }
            return this.KWHzl;
        }
    }

    /* JADX INFO: renamed from: o.Op$Activity */
    public static class Activity {
        public final Pools.Pool<DecodeJob<?>> EZpvd = SL.copydefault(150, new SL.StateListAnimator<DecodeJob<?>>() { // from class: o.Op.Activity.3
            /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
            @Override // o.SL.StateListAnimator
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> KWHzl() {
                Activity activity = Activity.this;
                return new DecodeJob<>(activity.copydefault, activity.EZpvd);
            }
        });
        public int KWHzl;
        public final DecodeJob.TaskDescription copydefault;

        public Activity(DecodeJob.TaskDescription taskDescription) {
            this.copydefault = taskDescription;
        }

        public <R> DecodeJob<R> OLrzqt(C5330No c5330No, java.lang.Object obj, C5358Oq c5358Oq, NH nh, int i, int i2, java.lang.Class<?> cls, java.lang.Class<R> cls2, Priority priority, AbstractC5360Os abstractC5360Os, java.util.Map<java.lang.Class<?>, NN<?>> map, boolean z, boolean z2, boolean z3, NM nm, DecodeJob.StateListAnimator<R> stateListAnimator) {
            DecodeJob decodeJob = (DecodeJob) SE.OLrzqt(this.EZpvd.acquire());
            int i3 = this.KWHzl;
            this.KWHzl = i3 + 1;
            return decodeJob.AEQbTJ(c5330No, obj, c5358Oq, nh, i, i2, cls, cls2, priority, abstractC5360Os, map, z, z2, z3, nm, stateListAnimator, i3);
        }
    }

    /* JADX INFO: renamed from: o.Op$TaskDescription */
    public static class TaskDescription {
        public final C5362Ou.Activity AEQbTJ;
        public final ExecutorServiceC5373Pf AYXKKw;
        public final ExecutorServiceC5373Pf AhwBna;
        public final InterfaceC5361Ot EZpvd;
        public final ExecutorServiceC5373Pf KWHzl;
        public final ExecutorServiceC5373Pf OLrzqt;
        public final Pools.Pool<C5359Or<?>> copydefault = SL.copydefault(150, new SL.StateListAnimator<C5359Or<?>>() { // from class: o.Op.TaskDescription.5
            /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
            @Override // o.SL.StateListAnimator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public C5359Or<?> KWHzl() {
                TaskDescription taskDescription = TaskDescription.this;
                return new C5359Or<>(taskDescription.OLrzqt, taskDescription.AhwBna, taskDescription.AYXKKw, taskDescription.KWHzl, taskDescription.EZpvd, taskDescription.AEQbTJ, taskDescription.copydefault);
            }
        });

        public TaskDescription(ExecutorServiceC5373Pf executorServiceC5373Pf, ExecutorServiceC5373Pf executorServiceC5373Pf2, ExecutorServiceC5373Pf executorServiceC5373Pf3, ExecutorServiceC5373Pf executorServiceC5373Pf4, InterfaceC5361Ot interfaceC5361Ot, C5362Ou.Activity activity) {
            this.OLrzqt = executorServiceC5373Pf;
            this.AhwBna = executorServiceC5373Pf2;
            this.AYXKKw = executorServiceC5373Pf3;
            this.KWHzl = executorServiceC5373Pf4;
            this.EZpvd = interfaceC5361Ot;
            this.AEQbTJ = activity;
        }

        public <R> C5359Or<R> copydefault(NH nh, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C5359Or) SE.OLrzqt(this.copydefault.acquire())).OLrzqt(nh, z, z2, z3, z4);
        }
    }
}

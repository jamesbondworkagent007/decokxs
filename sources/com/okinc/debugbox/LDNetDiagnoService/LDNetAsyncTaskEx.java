package com.okinc.debugbox.LDNetDiagnoService;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LDNetAsyncTaskEx<Params, Progress, Result> {
    public static final Application OLrzqt = new Application();
    public final StateListAnimator<Params, Result> AEQbTJ;
    public final FutureTask<Result> KWHzl;
    public volatile Status copydefault = Status.PENDING;

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public abstract Result EZpvd(Params... paramsArr);

    public abstract ExecutorService EZpvd();

    public void KWHzl() {
    }

    public void KWHzl(Result result) {
    }

    public void KWHzl(Progress... progressArr) {
    }

    public void OLrzqt() {
    }

    public LDNetAsyncTaskEx() {
        StateListAnimator<Params, Result> stateListAnimator = new StateListAnimator<Params, Result>() { // from class: com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx.2
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                return (Result) LDNetAsyncTaskEx.this.EZpvd(this.OLrzqt);
            }
        };
        this.AEQbTJ = stateListAnimator;
        this.KWHzl = new FutureTask<Result>(stateListAnimator) { // from class: com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx.3
            @Override // java.util.concurrent.FutureTask
            public void done() {
                Result result = null;
                try {
                    result = get();
                } catch (InterruptedException e) {
                    pUU.OLrzqt(getClass().getSimpleName(), e);
                } catch (CancellationException unused) {
                    LDNetAsyncTaskEx.OLrzqt.obtainMessage(3, new Activity(LDNetAsyncTaskEx.this, null)).sendToTarget();
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occured while executing doInBackground()", th);
                }
                LDNetAsyncTaskEx.OLrzqt.obtainMessage(1, new Activity(LDNetAsyncTaskEx.this, result)).sendToTarget();
            }
        };
    }

    public static class Application extends Handler {
        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx */
        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Activity activity = (Activity) message.obj;
            int i = message.what;
            if (i == 1) {
                activity.EZpvd.OLrzqt(activity.AEQbTJ[0]);
            } else if (i == 2) {
                activity.EZpvd.KWHzl((Object[]) activity.AEQbTJ);
            } else {
                if (i != 3) {
                    return;
                }
                activity.EZpvd.KWHzl();
            }
        }
    }

    public final boolean bh_() {
        return this.KWHzl.isCancelled();
    }

    public final boolean OLrzqt(boolean z) {
        return this.KWHzl.cancel(z);
    }

    /* JADX INFO: renamed from: com.okinc.debugbox.LDNetDiagnoService.LDNetAsyncTaskEx$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[Status.values().length];
            KWHzl = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final LDNetAsyncTaskEx<Params, Progress, Result> copydefault(Params... paramsArr) {
        if (this.copydefault != Status.PENDING) {
            int i = AnonymousClass4.KWHzl[this.copydefault.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.copydefault = Status.RUNNING;
        OLrzqt();
        this.AEQbTJ.OLrzqt = paramsArr;
        ExecutorService executorServiceEZpvd = EZpvd();
        if (executorServiceEZpvd == null) {
            return null;
        }
        executorServiceEZpvd.execute(this.KWHzl);
        return this;
    }

    public final void OLrzqt(Progress... progressArr) {
        OLrzqt.obtainMessage(2, new Activity(this, progressArr)).sendToTarget();
    }

    public void OLrzqt(Result result) {
        if (bh_()) {
            result = null;
        }
        KWHzl(result);
        this.copydefault = Status.FINISHED;
    }

    public static abstract class StateListAnimator<Params, Result> implements Callable<Result> {
        public Params[] OLrzqt;

        private StateListAnimator() {
        }
    }

    public static class Activity<Data> {
        public final Data[] AEQbTJ;
        public final LDNetAsyncTaskEx EZpvd;

        public Activity(LDNetAsyncTaskEx lDNetAsyncTaskEx, Data... dataArr) {
            this.EZpvd = lDNetAsyncTaskEx;
            this.AEQbTJ = dataArr;
        }
    }
}

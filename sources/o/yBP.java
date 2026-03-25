package o;

import io.reactivex.internal.schedulers.ExecutorScheduler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class yBP {
    public static final AbstractC58253yxm KWHzl = yBG.EZpvd(new Dialog());
    public static final AbstractC58253yxm OLrzqt = yBG.OLrzqt(new Activity());
    public static final AbstractC58253yxm EZpvd = yBG.copydefault(new Application());
    public static final AbstractC58253yxm AEQbTJ = C56323yBc.AEQbTJ();
    public static final AbstractC58253yxm copydefault = yBG.KWHzl(new LoaderManager());

    public static final class ActionBar {
        public static final AbstractC58253yxm KWHzl = new yAW();
    }

    public static final class PendingIntent {
        public static final AbstractC58253yxm copydefault = new yAY();
    }

    public static final class StateListAnimator {
        public static final AbstractC58253yxm copydefault = new yAR();
    }

    public static final class TaskDescription {
        public static final AbstractC58253yxm KWHzl = new yAU();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AbstractC58253yxm copydefault() {
        return AEQbTJ;
    }

    private yBP() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static AbstractC58253yxm KWHzl() {
        return yBG.EZpvd(OLrzqt);
    }

    public static AbstractC58253yxm AEQbTJ() {
        return yBG.KWHzl(EZpvd);
    }

    public static AbstractC58253yxm OLrzqt() {
        return yBG.OLrzqt(copydefault);
    }

    public static AbstractC58253yxm EZpvd() {
        return yBG.AEQbTJ(KWHzl);
    }

    public static AbstractC58253yxm KWHzl(java.util.concurrent.Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    public static final class Application implements Callable<AbstractC58253yxm> {
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public AbstractC58253yxm call() throws java.lang.Exception {
            return TaskDescription.KWHzl;
        }
    }

    public static final class LoaderManager implements Callable<AbstractC58253yxm> {
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public AbstractC58253yxm call() throws java.lang.Exception {
            return ActionBar.KWHzl;
        }
    }

    public static final class Dialog implements Callable<AbstractC58253yxm> {
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public AbstractC58253yxm call() throws java.lang.Exception {
            return PendingIntent.copydefault;
        }
    }

    public static final class Activity implements Callable<AbstractC58253yxm> {
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public AbstractC58253yxm call() throws java.lang.Exception {
            return StateListAnimator.copydefault;
        }
    }
}

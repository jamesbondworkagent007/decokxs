package o;

import com.immomo.mls.NativeBridge;
import com.immomo.mls.adapter.MLSThreadAdapter;
import com.immomo.mls.utils.AssertUtils;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.aht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7337aht {
    public static final Deque<Globals> copydefault = new ArrayDeque(10);
    public static final Lock KWHzl = new ReentrantLock(true);
    public static int OLrzqt = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl() {
        return OLrzqt;
    }

    public static Globals copydefault() {
        AssertUtils.AEQbTJ(C7840arS.KWHzl());
        try {
            Lock lock = KWHzl;
            lock.lock();
            Globals globalsPollFirst = copydefault.pollFirst();
            if (globalsPollFirst != null) {
                AEQbTJ();
            }
            lock.unlock();
            return globalsPollFirst;
        } catch (java.lang.Throwable th) {
            KWHzl.unlock();
            throw th;
        }
    }

    public static void copydefault(int i) {
        AssertUtils.AEQbTJ(C7840arS.KWHzl());
        if (i > 10) {
            i = 10;
        }
        OLrzqt += i;
        if (C7326ahi.valueOf() && Globals.AEQbTJ()) {
            C7326ahi.AhwBna.KWHzl();
            if (C7326ahi.AhwBna.AEQbTJ()) {
                while (i > 0) {
                    AEQbTJ();
                    i--;
                }
            }
        }
    }

    public static void AEQbTJ() {
        if (copydefault.size() == 10) {
            return;
        }
        final Globals globalsCopydefault = Globals.copydefault(C7788aqT.EZpvd());
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new java.lang.Runnable() { // from class: o.aht.1
            @Override // java.lang.Runnable
            public void run() {
                C7337aht.AEQbTJ(globalsCopydefault);
                try {
                    C7337aht.KWHzl.lock();
                    C7337aht.copydefault.addLast(globalsCopydefault);
                } finally {
                    C7337aht.KWHzl.unlock();
                }
            }
        });
    }

    public static Globals AEQbTJ(final Globals globals) {
        if (globals == null) {
            return null;
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            EZpvd(globals);
        } else {
            ReentrantLock reentrantLock = new ReentrantLock();
            java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
            C7840arS.copydefault(new StateListAnimator(reentrantLock, conditionNewCondition) { // from class: o.aht.2
                @Override // o.C7337aht.StateListAnimator
                public void KWHzl() {
                    C7337aht.EZpvd(globals);
                }
            });
            try {
                reentrantLock.lock();
                conditionNewCondition.await();
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
        }
        return globals;
    }

    public static void EZpvd(Globals globals) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        C7326ahi.AhwBna.copydefault(globals);
        long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
        if (C7326ahi.EZpvd) {
            C7323ahf.AEQbTJ().EZpvd("LuaViewManager", "init cast: " + (jUptimeMillis2 - jUptimeMillis), new java.lang.Object[0]);
        }
        if (C7326ahi.valueOf()) {
            NativeBridge.OLrzqt(globals);
        }
    }

    /* JADX INFO: renamed from: o.aht$StateListAnimator */
    public static abstract class StateListAnimator implements java.lang.Runnable {
        public final java.util.concurrent.locks.Condition EZpvd;
        public final Lock OLrzqt;

        public abstract void KWHzl();

        public StateListAnimator(Lock lock, java.util.concurrent.locks.Condition condition) {
            this.OLrzqt = lock;
            this.EZpvd = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.OLrzqt.lock();
                KWHzl();
                this.EZpvd.signal();
            } finally {
                this.OLrzqt.unlock();
            }
        }
    }
}

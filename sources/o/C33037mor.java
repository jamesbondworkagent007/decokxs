package o;

import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.util.Pools;
import androidx.core.view.LayoutInflaterCompat;
import com.okinc.base.utils.commmon.ThreadUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: o.mor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C33037mor {
    public static ExecutorService EZpvd = ThreadUtils.OLrzqt();
    public static final Pools.SynchronizedPool<StateListAnimator> copydefault = new Pools.SynchronizedPool<>(10);
    public final android.os.Handler AEQbTJ;
    public final android.view.LayoutInflater AYXKKw;
    public final Handler.Callback KWHzl;
    public Future<?> OLrzqt;
    public Activity gEmmrt;

    /* JADX INFO: renamed from: o.mor$Application */
    public interface Application {
        void AEQbTJ(android.view.View view, int i, android.view.ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: o.mor$StateListAnimator */
    public static class StateListAnimator {
        public C33037mor AEQbTJ;
        public android.view.View EZpvd;
        public android.view.ViewGroup KWHzl;
        public Application OLrzqt;
        public int copydefault;
    }

    public C33037mor(@androidx.annotation.NonNull android.content.Context context, LayoutInflater.Factory2 factory2) {
        Handler.Callback callback = new Handler.Callback() { // from class: o.mor.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                StateListAnimator stateListAnimator = (StateListAnimator) message.obj;
                if (stateListAnimator.EZpvd == null) {
                    stateListAnimator.EZpvd = C33037mor.this.AYXKKw.inflate(stateListAnimator.copydefault, stateListAnimator.KWHzl, false);
                }
                stateListAnimator.OLrzqt.AEQbTJ(stateListAnimator.EZpvd, stateListAnimator.copydefault, stateListAnimator.KWHzl);
                C33037mor.this.EZpvd(stateListAnimator);
                return true;
            }
        };
        this.KWHzl = callback;
        TaskDescription taskDescription = new TaskDescription(context);
        this.AYXKKw = taskDescription;
        LayoutInflaterCompat.setFactory2(taskDescription, factory2);
        this.AEQbTJ = new android.os.Handler(callback);
    }

    public void EZpvd(@androidx.annotation.LayoutRes int i, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, @androidx.annotation.NonNull Application application) {
        StateListAnimator stateListAnimatorKWHzl = KWHzl();
        stateListAnimatorKWHzl.AEQbTJ = this;
        stateListAnimatorKWHzl.copydefault = i;
        stateListAnimatorKWHzl.KWHzl = viewGroup;
        stateListAnimatorKWHzl.OLrzqt = application;
        Activity activity = new Activity(stateListAnimatorKWHzl);
        this.gEmmrt = activity;
        this.OLrzqt = EZpvd.submit(activity);
    }

    /* JADX INFO: renamed from: o.mor$Activity */
    public static class Activity implements java.lang.Runnable {
        public final StateListAnimator EZpvd;
        public boolean OLrzqt;

        public Activity(StateListAnimator stateListAnimator) {
            this.EZpvd = stateListAnimator;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.OLrzqt = true;
            try {
                StateListAnimator stateListAnimator = this.EZpvd;
                android.view.LayoutInflater layoutInflater = stateListAnimator.AEQbTJ.AYXKKw;
                StateListAnimator stateListAnimator2 = this.EZpvd;
                stateListAnimator.EZpvd = layoutInflater.inflate(stateListAnimator2.copydefault, stateListAnimator2.KWHzl, false);
            } catch (java.lang.RuntimeException unused) {
            }
            android.os.Message.obtain(this.EZpvd.AEQbTJ.AEQbTJ, 0, this.EZpvd).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: o.mor$TaskDescription */
    public static class TaskDescription extends android.view.LayoutInflater {
        public static final java.lang.String[] AEQbTJ = {"android.widget.", "android.webkit.", "android.app."};

        public TaskDescription(android.content.Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public android.view.LayoutInflater cloneInContext(android.content.Context context) {
            return new TaskDescription(context);
        }

        @Override // android.view.LayoutInflater
        public android.view.View onCreateView(java.lang.String str, android.util.AttributeSet attributeSet) throws java.lang.ClassNotFoundException {
            android.view.View viewCreateView;
            for (java.lang.String str2 : AEQbTJ) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (java.lang.ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public StateListAnimator KWHzl() {
        StateListAnimator stateListAnimatorAcquire = copydefault.acquire();
        return stateListAnimatorAcquire == null ? new StateListAnimator() : stateListAnimatorAcquire;
    }

    public void EZpvd(StateListAnimator stateListAnimator) {
        stateListAnimator.OLrzqt = null;
        stateListAnimator.AEQbTJ = null;
        stateListAnimator.KWHzl = null;
        stateListAnimator.copydefault = 0;
        stateListAnimator.EZpvd = null;
        copydefault.release(stateListAnimator);
    }
}

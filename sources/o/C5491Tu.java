package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5491Tu {
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public Application KWHzl;
    public final java.lang.Object OLrzqt;
    public final android.os.Handler copydefault;

    /* JADX INFO: renamed from: o.Tu$Application */
    public interface Application {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    public final void copydefault() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        Intrinsics.AEQbTJ(threadCurrentThread, "");
        sb.append(threadCurrentThread.getName());
        sb.append("- lock( ");
        sb.append(this.EZpvd);
        sb.append(" )");
        C5484Tn.EZpvd("LOCK_DETAIL", sb.toString());
        try {
            synchronized (this.OLrzqt) {
                this.copydefault.post(new StateListAnimator());
                this.OLrzqt.wait();
                Unit unit = Unit.INSTANCE;
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.Tu$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Application application = C5491Tu.this.KWHzl;
            if (application != null) {
                application.copydefault();
            }
        }
    }
}

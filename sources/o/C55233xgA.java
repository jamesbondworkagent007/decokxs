package o;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55233xgA {
    public static C55233xgA OLrzqt;
    public Activity AEQbTJ;
    public Activity AYXKKw;
    public final android.os.Handler EZpvd;
    public final java.lang.Object KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.xgA$Application */
    public interface Application {
        void EZpvd();

        void EZpvd(int i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C55233xgA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C55233xgA AEQbTJ() {
        return Companion.copydefault();
    }

    private C55233xgA() {
        this.KWHzl = new java.lang.Object();
        this.EZpvd = new android.os.Handler(android.os.Looper.getMainLooper(), new Handler.Callback() { // from class: o.xgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return C55233xgA.EZpvd(this.AEQbTJ, message);
            }
        });
    }

    public static final boolean EZpvd(C55233xgA c55233xgA, android.os.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        if (message.what != 0) {
            return false;
        }
        java.lang.Object obj = message.obj;
        Intrinsics.copydefault(obj, "");
        c55233xgA.OLrzqt((Activity) obj);
        return true;
    }

    public final void AEQbTJ(int i, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            if (EZpvd(application)) {
                Activity activity = this.AEQbTJ;
                if (activity != null) {
                    activity.AEQbTJ(i);
                    this.EZpvd.removeCallbacksAndMessages(activity);
                    copydefault(activity);
                }
                return;
            }
            if (OLrzqt(application)) {
                Activity activity2 = this.AYXKKw;
                if (activity2 != null) {
                    activity2.AEQbTJ(i);
                }
            } else {
                this.AYXKKw = new Activity(i, application);
            }
            Activity activity3 = this.AEQbTJ;
            if (activity3 != null) {
                Intrinsics.copydefault(activity3);
                if (OLrzqt(activity3, 4)) {
                    return;
                }
            }
            this.AEQbTJ = null;
            OLrzqt();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            if (EZpvd(application)) {
                Activity activity = this.AEQbTJ;
                Intrinsics.copydefault(activity);
                OLrzqt(activity, i);
            } else if (OLrzqt(application)) {
                Activity activity2 = this.AYXKKw;
                Intrinsics.copydefault(activity2);
                OLrzqt(activity2, i);
            } else {
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            if (EZpvd(application)) {
                this.AEQbTJ = null;
                if (this.AYXKKw != null) {
                    OLrzqt();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void AYXKKw(@NotNull Application application) {
        Activity activity;
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            if (EZpvd(application) && (activity = this.AEQbTJ) != null) {
                copydefault(activity);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void djBIcL(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            Activity activity = this.AEQbTJ;
            if (activity != null) {
                if (EZpvd(application) && !activity.copydefault()) {
                    activity.KWHzl(true);
                    this.EZpvd.removeCallbacksAndMessages(activity);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void AhwBna(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            Activity activity = this.AEQbTJ;
            if (activity != null) {
                if (EZpvd(application) && activity.copydefault()) {
                    Activity activity2 = this.AEQbTJ;
                    Intrinsics.copydefault(activity2);
                    activity2.KWHzl(false);
                    Activity activity3 = this.AEQbTJ;
                    Intrinsics.copydefault(activity3);
                    copydefault(activity3);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean KWHzl(@NotNull Application application) {
        boolean zEZpvd;
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            zEZpvd = EZpvd(application);
        }
        return zEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(@NotNull Application application) {
        boolean z;
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.KWHzl) {
            if (!EZpvd(application)) {
                z = OLrzqt(application);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: o.xgA$Activity */
    public static final class Activity {
        public final WeakReference<Application> AEQbTJ;
        public int EZpvd;
        public boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WeakReference<Application> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        public Activity(int i, @NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.EZpvd = i;
            this.AEQbTJ = new WeakReference<>(application);
        }

        public final boolean copydefault(Application application) {
            return application != null && this.AEQbTJ.get() == application;
        }
    }

    public final void OLrzqt() {
        WeakReference<Application> weakReferenceKWHzl;
        Activity activity = this.AYXKKw;
        if (activity != null) {
            this.AEQbTJ = activity;
            this.AYXKKw = null;
            Application application = (activity == null || (weakReferenceKWHzl = activity.KWHzl()) == null) ? null : weakReferenceKWHzl.get();
            if (application != null) {
                application.EZpvd();
            } else {
                this.AEQbTJ = null;
            }
        }
    }

    public final boolean OLrzqt(Activity activity, int i) {
        Application application = activity.KWHzl().get();
        if (application == null) {
            return false;
        }
        this.EZpvd.removeCallbacksAndMessages(activity);
        application.EZpvd(i);
        return true;
    }

    public final boolean EZpvd(Application application) {
        Activity activity = this.AEQbTJ;
        return activity != null && activity.copydefault(application);
    }

    public final boolean OLrzqt(Application application) {
        Activity activity = this.AYXKKw;
        return activity != null && activity.copydefault(application);
    }

    public final void copydefault(Activity activity) {
        int iOLrzqt;
        if (activity.OLrzqt() == -2) {
            return;
        }
        if (activity.OLrzqt() > 0) {
            iOLrzqt = activity.OLrzqt();
        } else {
            iOLrzqt = activity.OLrzqt() == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.EZpvd.removeCallbacksAndMessages(activity);
        android.os.Handler handler = this.EZpvd;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 0, activity), iOLrzqt);
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        synchronized (this.KWHzl) {
            if (this.AEQbTJ == activity || this.AYXKKw == activity) {
                OLrzqt(activity, 2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.xgA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C55233xgA copydefault() {
            C55233xgA c55233xgA = C55233xgA.OLrzqt;
            if (c55233xgA != null) {
                return c55233xgA;
            }
            C55233xgA c55233xgA2 = new C55233xgA(null);
            StateListAnimator stateListAnimator = C55233xgA.Companion;
            C55233xgA.OLrzqt = c55233xgA2;
            return c55233xgA2;
        }
    }
}

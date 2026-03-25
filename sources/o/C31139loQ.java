package o;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C31139loQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31139loQ {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public WeakReference<androidx.fragment.app.Fragment> AEQbTJ;
    public final java.util.Set<Activity> copydefault = new LinkedHashSet();

    /* JADX INFO: renamed from: o.loQ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.loQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull final android.view.View view, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = new WeakReference<>(fragment);
        view.post(new java.lang.Runnable() { // from class: o.loP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31139loQ.OLrzqt(this.AEQbTJ, view, function0);
            }
        });
    }

    public static final void OLrzqt(C31139loQ c31139loQ, android.view.View view, Function0 function0) {
        if (c31139loQ.EZpvd()) {
            c31139loQ.copydefault(view, function0);
        }
    }

    public final void AEQbTJ() {
        java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.copydefault).iterator();
        while (it.hasNext()) {
            AEQbTJ((Activity) it.next());
        }
        this.copydefault.clear();
        WeakReference<androidx.fragment.app.Fragment> weakReference = this.AEQbTJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.AEQbTJ = null;
    }

    public final void copydefault(final android.view.View view, final Function0<Unit> function0) {
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        Ref.IntRef intRef3 = new Ref.IntRef();
        intRef3.element = -1;
        final Activity activity = new Activity(view, null, null, 6, null);
        final Function0 function02 = new Function0() { // from class: o.loN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31139loQ.KWHzl(this.AEQbTJ, activity, view, function0);
            }
        };
        StateListAnimator stateListAnimator = new StateListAnimator(function02, view, intRef2, intRef3, intRef);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.loM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31139loQ.AEQbTJ(this.KWHzl, activity, function02);
            }
        };
        activity.copydefault(stateListAnimator);
        activity.AEQbTJ(runnable);
        this.copydefault.add(activity);
        view.getViewTreeObserver().addOnGlobalLayoutListener(stateListAnimator);
        view.postDelayed(runnable, 2000L);
    }

    public static final Unit KWHzl(C31139loQ c31139loQ, Activity activity, android.view.View view, Function0 function0) {
        c31139loQ.AEQbTJ(activity);
        if (c31139loQ.EZpvd() && view.getWidth() > 0 && view.getHeight() > 0) {
            try {
                function0.invoke();
            } catch (java.lang.Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.loQ$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Ref.IntRef AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Ref.IntRef OLrzqt;
        public final /* synthetic */ Ref.IntRef copydefault;

        public StateListAnimator(Function0<Unit> function0, android.view.View view, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3) {
            this.EZpvd = function0;
            this.KWHzl = view;
            this.OLrzqt = intRef;
            this.AEQbTJ = intRef2;
            this.copydefault = intRef3;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C31139loQ.this.EZpvd()) {
                this.EZpvd.invoke();
                return;
            }
            int width = this.KWHzl.getWidth();
            int height = this.KWHzl.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            Ref.IntRef intRef = this.OLrzqt;
            if (intRef.element == width && this.AEQbTJ.element == height) {
                Ref.IntRef intRef2 = this.copydefault;
                int i = intRef2.element + 1;
                intRef2.element = i;
                if (i >= 3) {
                    android.view.View view = this.KWHzl;
                    final Function0<Unit> function0 = this.EZpvd;
                    view.post(new java.lang.Runnable() { // from class: o.loO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C31139loQ.StateListAnimator.AEQbTJ(function0);
                        }
                    });
                    return;
                }
                return;
            }
            this.copydefault.element = 0;
            intRef.element = width;
            this.AEQbTJ.element = height;
        }

        public static final void AEQbTJ(Function0 function0) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(C31139loQ c31139loQ, Activity activity, Function0 function0) {
        if (c31139loQ.copydefault.contains(activity)) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(Activity activity) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerAEQbTJ = activity.AEQbTJ();
        if (onGlobalLayoutListenerAEQbTJ != null) {
            android.view.ViewTreeObserver viewTreeObserver = activity.EZpvd().getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                try {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListenerAEQbTJ);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        java.lang.Runnable runnableKWHzl = activity.KWHzl();
        if (runnableKWHzl != null) {
            activity.EZpvd().removeCallbacks(runnableKWHzl);
        }
        this.copydefault.remove(activity);
        activity.OLrzqt();
    }

    public final boolean EZpvd() {
        androidx.fragment.app.Fragment fragment;
        WeakReference<androidx.fragment.app.Fragment> weakReference = this.AEQbTJ;
        return (weakReference == null || (fragment = weakReference.get()) == null || !fragment.isAdded() || fragment.isDetached()) ? false : true;
    }

    /* JADX INFO: renamed from: o.loQ$Activity */
    public static final class Activity {
        public ViewTreeObserver.OnGlobalLayoutListener EZpvd;
        public final android.view.View KWHzl;
        public java.lang.Runnable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, android.view.View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, java.lang.Runnable runnable, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                view = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                onGlobalLayoutListener = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                runnable = activity.OLrzqt;
            }
            return activity.copydefault(view, onGlobalLayoutListener, runnable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewTreeObserver.OnGlobalLayoutListener AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Runnable runnable) {
            this.OLrzqt = runnable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Runnable KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt() {
            this.EZpvd = null;
            this.OLrzqt = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull android.view.View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, java.lang.Runnable runnable) {
            Intrinsics.checkNotNullParameter(view, "");
            return new Activity(view, onGlobalLayoutListener, runnable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.EZpvd = onGlobalLayoutListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.EZpvd;
            int iHashCode2 = onGlobalLayoutListener == null ? 0 : onGlobalLayoutListener.hashCode();
            java.lang.Runnable runnable = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (runnable != null ? runnable.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PendingListenerInfo(view=" + this.KWHzl + ", layoutListener=" + this.EZpvd + ", timeoutRunnable=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull android.view.View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, java.lang.Runnable runnable) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = view;
            this.EZpvd = onGlobalLayoutListener;
            this.OLrzqt = runnable;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 android.view.View)
  (wrap:android.view.ViewTreeObserver$OnGlobalLayoutListener:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.view.ViewTreeObserver$OnGlobalLayoutListener) : (r3v0 android.view.ViewTreeObserver$OnGlobalLayoutListener))
  (wrap:java.lang.Runnable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Runnable) : (r4v0 java.lang.Runnable))
 A[MD:(android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Runnable):void (m)] (LINE:184) call: o.loQ.Activity.<init>(android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Runnable):void type: THIS */
        public /* synthetic */ Activity(android.view.View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, java.lang.Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i & 2) != 0 ? null : onGlobalLayoutListener, (i & 4) != 0 ? null : runnable);
        }
    }
}

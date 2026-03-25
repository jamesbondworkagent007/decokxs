package o;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6767aVb implements Application.ActivityLifecycleCallbacks {
    public static C6767aVb OLrzqt;
    public java.util.List<WeakReference<android.app.Activity>> KWHzl = new LinkedList();
    public final java.util.HashMap<java.lang.String, java.util.List<WeakReference<androidx.fragment.app.Fragment>>> copydefault = new java.util.HashMap<>();
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX INFO: renamed from: o.aVb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aVb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6767aVb OLrzqt() {
            C6767aVb c6767aVb = C6767aVb.OLrzqt;
            if (c6767aVb != null) {
                return c6767aVb;
            }
            C6767aVb c6767aVb2 = new C6767aVb();
            Activity activity = C6767aVb.Companion;
            C6767aVb.OLrzqt = c6767aVb2;
            return c6767aVb2;
        }
    }

    public final void AEQbTJ(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    public final boolean EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect());
    }

    public final java.lang.String EZpvd() {
        java.util.List<WeakReference<androidx.fragment.app.Fragment>> list;
        android.view.View view;
        android.app.Activity activity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = "";
        synchronized (this.KWHzl) {
            if ((!this.KWHzl.isEmpty()) && (activity = (android.app.Activity) ((WeakReference) CollectionsKt___CollectionsKt.AubY(this.KWHzl)).get()) != null) {
                name = activity.getClass().getName();
                sb.append(name);
            }
            Unit unit = Unit.INSTANCE;
        }
        synchronized (this.copydefault) {
            if ((!this.copydefault.isEmpty()) && this.copydefault.containsKey(name) && (list = this.copydefault.get(name)) != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) weakReference.get();
                    if (fragment != null && (view = fragment.getView()) != null && EZpvd(view)) {
                        if (sb.length() > 0) {
                            sb.append("-");
                        }
                        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) weakReference.get();
                        sb.append(fragment2 != null ? fragment2.getClass().getName() : null);
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof FragmentActivity) {
            AEQbTJ((FragmentActivity) activity);
        }
        synchronized (this.KWHzl) {
            this.KWHzl.add(new WeakReference<>(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        synchronized (this.KWHzl) {
            java.util.Iterator<WeakReference<android.app.Activity>> it = this.KWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().get() == activity) {
                    it.remove();
                    break;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        synchronized (this.copydefault) {
            this.copydefault.remove(activity.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: o.aVb$ActionBar */
    public static final class ActionBar extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ FragmentActivity AEQbTJ;

        public ActionBar(FragmentActivity fragmentActivity) {
            this.AEQbTJ = fragmentActivity;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            java.util.List list;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            java.util.HashMap map = C6767aVb.this.copydefault;
            C6767aVb c6767aVb = C6767aVb.this;
            FragmentActivity fragmentActivity = this.AEQbTJ;
            synchronized (map) {
                if (c6767aVb.copydefault.containsKey(fragmentActivity.getClass().getName())) {
                    if (!c6767aVb.copydefault((java.util.List) c6767aVb.copydefault.get(fragmentActivity.getClass().getName()), fragment) && (list = (java.util.List) c6767aVb.copydefault.get(fragmentActivity.getClass().getName())) != null) {
                        list.add(new WeakReference(fragment));
                    }
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new WeakReference(fragment));
                    c6767aVb.copydefault.put(fragmentActivity.getClass().getName(), arrayList);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void AEQbTJ(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new ActionBar(fragmentActivity), false);
    }

    public final boolean copydefault(java.util.List<WeakReference<androidx.fragment.app.Fragment>> list, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(((WeakReference) it.next()).get(), fragment)) {
                    return true;
                }
            }
        }
        return false;
    }
}

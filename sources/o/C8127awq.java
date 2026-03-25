package o;

import android.app.Application;
import com.lzf.easyfloat.enums.ShowPattern;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8127awq {
    public static android.app.Application AEQbTJ;
    public static int KWHzl;
    public static WeakReference<android.app.Activity> OLrzqt;
    public static final C8127awq copydefault = new C8127awq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ int AEQbTJ(C8127awq c8127awq) {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ WeakReference OLrzqt(C8127awq c8127awq) {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return KWHzl > 0;
    }

    private C8127awq() {
    }

    public final android.app.Application OLrzqt() {
        android.app.Application application = AEQbTJ;
        if (application == null) {
            Intrinsics.gEmmrt("");
        }
        return application;
    }

    public final android.app.Activity copydefault() {
        WeakReference<android.app.Activity> weakReference = OLrzqt;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        AEQbTJ = application;
        application.registerActivityLifecycleCallbacks(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.awq$StateListAnimator */
    public static final class StateListAnimator implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            if (activity != null) {
                C8127awq.KWHzl = C8127awq.AEQbTJ(C8127awq.copydefault) + 1;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            if (activity != null) {
                C8127awq c8127awq = C8127awq.copydefault;
                WeakReference weakReferenceOLrzqt = C8127awq.OLrzqt(c8127awq);
                if (weakReferenceOLrzqt != null) {
                    weakReferenceOLrzqt.clear();
                }
                C8127awq.OLrzqt = new WeakReference(activity);
                c8127awq.KWHzl(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            if (activity != null) {
                C8127awq c8127awq = C8127awq.copydefault;
                C8127awq.KWHzl = C8127awq.AEQbTJ(c8127awq) - 1;
                c8127awq.copydefault(activity);
            }
        }
    }

    public final void KWHzl(android.app.Activity activity) {
        for (Map.Entry<java.lang.String, C8053avV> entry : C8056avY.OLrzqt.OLrzqt().entrySet()) {
            java.lang.String key = entry.getKey();
            C8055avX c8055avXEZpvd = entry.getValue().EZpvd();
            if (c8055avXEZpvd.uzCIH() != ShowPattern.CURRENT_ACTIVITY) {
                if (c8055avXEZpvd.uzCIH() == ShowPattern.BACKGROUND) {
                    copydefault.AEQbTJ(false, key);
                } else if (c8055avXEZpvd.fIwbmz()) {
                    C8127awq c8127awq = copydefault;
                    java.util.Set<java.lang.String> setGEmmrt = c8055avXEZpvd.gEmmrt();
                    Intrinsics.checkNotNullExpressionValue(activity.getComponentName(), "");
                    c8127awq.AEQbTJ(!setGEmmrt.contains(r4.getClassName()), key);
                }
            }
        }
    }

    public final void copydefault(android.app.Activity activity) {
        android.os.IBinder iBinder;
        android.view.View decorView;
        if (activity.isFinishing() || !EZpvd()) {
            for (Map.Entry<java.lang.String, C8053avV> entry : C8056avY.OLrzqt.OLrzqt().entrySet()) {
                java.lang.String key = entry.getKey();
                C8053avV value = entry.getValue();
                if (activity.isFinishing() && (iBinder = value.gEmmrt().token) != null) {
                    android.view.Window window = activity.getWindow();
                    if (Intrinsics.EZpvd(iBinder, (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getWindowToken())) {
                        C8056avY.OLrzqt.copydefault(key, true);
                    }
                }
                C8055avX c8055avXEZpvd = value.EZpvd();
                C8127awq c8127awq = copydefault;
                if (!c8127awq.EZpvd() && value.EZpvd().uzCIH() != ShowPattern.CURRENT_ACTIVITY) {
                    c8127awq.AEQbTJ(c8055avXEZpvd.uzCIH() != ShowPattern.FOREGROUND && c8055avXEZpvd.fIwbmz(), key);
                }
            }
        }
    }

    public static /* synthetic */ Unit setVisible$default(C8127awq c8127awq, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c8127awq.EZpvd();
        }
        return c8127awq.AEQbTJ(z, str);
    }

    public final Unit AEQbTJ(boolean z, java.lang.String str) {
        return C8056avY.visible$default(C8056avY.OLrzqt, z, str, false, 4, null);
    }
}

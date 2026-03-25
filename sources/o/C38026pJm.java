package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.lib.monitor.FragmentLifecycleState;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38026pJm extends FragmentManager.FragmentLifecycleCallbacks {
    public final java.lang.String EZpvd = "Monitor.Lifecycle";

    /* JADX INFO: renamed from: o.pJm$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FragmentLifecycleState.values().length];
            try {
                iArr[FragmentLifecycleState.CREATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FragmentLifecycleState.RESUMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FragmentLifecycleState.STOPPED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FragmentLifecycleState.VIEW_DESTROYED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[FragmentLifecycleState.DESTROYED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[FragmentLifecycleState.DETACHED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    public final void EZpvd(androidx.fragment.app.Fragment fragment) {
    }

    public final java.lang.String KWHzl(androidx.fragment.app.Fragment fragment) {
        try {
            java.lang.reflect.Field declaredField = androidx.fragment.app.Fragment.class.getDeclaredField("mWho");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(fragment);
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            return str == null ? "unknown" : str;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(fragment.getTag(), th.toString());
            return "error: " + th.getMessage();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(fragment, FragmentLifecycleState.ATTACHED);
        pJI.Companion.copydefault().KWHzl(fragment.getClass().getName());
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(fragment, FragmentLifecycleState.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.CREATED);
        if (fragment.isAdded()) {
            EZpvd(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(view, "");
        copydefault(fragment, FragmentLifecycleState.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.STARTED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.RESUMED);
        copydefault(fragment);
        pJI pjiCopydefault = pJI.Companion.copydefault();
        WeakReference<androidx.fragment.app.Fragment> weakReference = new WeakReference<>(fragment);
        FragmentActivity activity = fragment.getActivity();
        pjiCopydefault.EZpvd(weakReference, activity != null ? activity.getClass().getName() : null, fragment.getClass().getName());
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.VIEW_DESTROYED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.DESTROYED);
        copydefault(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment, FragmentLifecycleState.DETACHED);
    }

    public final void copydefault(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull FragmentLifecycleState fragmentLifecycleState) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentLifecycleState, "");
        try {
            final java.lang.String name = fragment.getClass().getName();
            switch (Activity.KWHzl[fragmentLifecycleState.ordinal()]) {
                case 1:
                    pUU.EZpvd(this.EZpvd, "onFragmentCreated " + name + ", isAdded=" + fragment.isAdded());
                    break;
                case 2:
                    pJI.Companion.copydefault().OLrzqt(new Function1() { // from class: o.pJn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38026pJm.KWHzl(this.OLrzqt, fragment, name, (java.lang.String) obj);
                        }
                    });
                    break;
                case 3:
                    pJI.Companion.copydefault().OLrzqt(new Function1() { // from class: o.pJo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38026pJm.copydefault(this.OLrzqt, fragment, name, (java.lang.String) obj);
                        }
                    });
                    break;
                case 4:
                    pUU.EZpvd(this.EZpvd, "onFragmentViewDestroyed " + name);
                    break;
                case 5:
                    pJI.Companion.copydefault().OLrzqt(new Function1() { // from class: o.pJp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38026pJm.valueOf(this.AEQbTJ, fragment, name, (java.lang.String) obj);
                        }
                    });
                    break;
                case 6:
                    pUU.EZpvd(this.EZpvd, "onFragmentDetached " + name);
                    break;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit KWHzl(C38026pJm c38026pJm, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = c38026pJm.KWHzl(fragment);
        pUU.KWHzl(c38026pJm.EZpvd, "onFragmentResumed " + str + ", " + str2 + ",visible=" + fragment.isVisible() + ", uuid=" + strKWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38026pJm c38026pJm, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = c38026pJm.KWHzl(fragment);
        pUU.KWHzl(c38026pJm.EZpvd, "onFragmentStopped " + str + ", " + str2 + ", uuid=" + strKWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C38026pJm c38026pJm, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = c38026pJm.KWHzl(fragment);
        pUU.KWHzl(c38026pJm.EZpvd, "onFragmentDestroyed " + str + ", " + str2 + ", uuid=" + strKWHzl);
        return Unit.INSTANCE;
    }

    public final void copydefault(androidx.fragment.app.Fragment fragment) {
        pJI.Companion.copydefault().EZpvd(fragment);
    }
}

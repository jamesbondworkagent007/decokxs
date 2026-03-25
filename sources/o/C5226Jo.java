package o;

import androidx.fragment.app.FragmentActivity;
import com.amplitude.common.Logger;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5226Jo {
    public static final C5226Jo copydefault = new C5226Jo();
    public static final WeakHashMap<FragmentActivity, java.util.List<C5225Jn>> EZpvd = new WeakHashMap<>();

    private C5226Jo() {
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(logger, "");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            C5225Jn c5225Jn = new C5225Jn(function2, logger);
            fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(c5225Jn, false);
            WeakHashMap<FragmentActivity, java.util.List<C5225Jn>> weakHashMap = EZpvd;
            java.util.List<C5225Jn> arrayList = weakHashMap.get(fragmentActivity);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                weakHashMap.put(fragmentActivity, arrayList);
            }
            arrayList.add(c5225Jn);
            return;
        }
        logger.OLrzqt("Activity is not a FragmentActivity");
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(logger, "");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            java.util.List<C5225Jn> listRemove = EZpvd.remove(fragmentActivity);
            if (listRemove != null) {
                java.util.Iterator<C5225Jn> it = listRemove.iterator();
                while (it.hasNext()) {
                    fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(it.next());
                }
                return;
            }
            return;
        }
        logger.OLrzqt("Activity is not a FragmentActivity");
    }
}

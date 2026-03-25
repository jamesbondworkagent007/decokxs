package o;

import androidx.fragment.app.FragmentManager;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42547rWx extends FragmentManager.FragmentLifecycleCallbacks {
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            AbstractC42536rWm.markBegin$default(abstractC42536rWmOLrzqt, copydefault(fragment), 0L, 2, null);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.CREATE, copydefault(fragment), java.lang.System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.START, copydefault(fragment), java.lang.System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.RESUME, copydefault(fragment), java.lang.System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.PAUSE, copydefault(fragment), java.lang.System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        AbstractC42536rWm abstractC42536rWmOLrzqt = OLrzqt(fragment);
        if (abstractC42536rWmOLrzqt != null) {
            abstractC42536rWmOLrzqt.copydefault(QPLType.LIFE_CYCLE, QPLMarker.DESTROYED, copydefault(fragment), java.lang.System.currentTimeMillis());
            AbstractC42536rWm.markEnd$default(abstractC42536rWmOLrzqt, copydefault(fragment), 0L, 2, null);
        }
    }

    public final AbstractC42536rWm OLrzqt(androidx.fragment.app.Fragment fragment) {
        Function1<androidx.fragment.app.Fragment, AbstractC42536rWm> function1DjBIcL = C42543rWt.KWHzl.djBIcL();
        if (function1DjBIcL != null) {
            return function1DjBIcL.invoke(fragment);
        }
        return null;
    }

    public final java.lang.String copydefault(androidx.fragment.app.Fragment fragment) {
        Function1<androidx.fragment.app.Fragment, java.lang.String> function1GEmmrt = C42543rWt.KWHzl.gEmmrt();
        return function1GEmmrt != null ? function1GEmmrt.invoke(fragment) : "";
    }
}

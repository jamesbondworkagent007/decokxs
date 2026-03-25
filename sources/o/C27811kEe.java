package o;

import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27811kEe {
    public static final InterfaceC27809kEc OLrzqt(@NotNull android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(view));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment != null) {
            return AEQbTJ(fragment);
        }
        return null;
    }

    public static final InterfaceC27809kEc AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof InterfaceC27809kEc;
        java.lang.Object obj = fragment;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof InterfaceC27809kEc)) {
                parentFragment = parentFragment.getParentFragment();
            }
            boolean z2 = parentFragment instanceof InterfaceC27809kEc;
            java.lang.Object obj2 = parentFragment;
            if (!z2) {
                obj2 = null;
            }
            obj = (InterfaceC27809kEc) obj2;
        }
        return (InterfaceC27809kEc) obj;
    }
}

package o;

import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46607taP {
    public static final InterfaceC46605taN KWHzl(@NotNull android.view.View view) {
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
            return OLrzqt(fragment);
        }
        return null;
    }

    public static final InterfaceC46605taN OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof InterfaceC46605taN;
        java.lang.Object obj = fragment;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof InterfaceC46605taN)) {
                parentFragment = parentFragment.getParentFragment();
            }
            boolean z2 = parentFragment instanceof InterfaceC46605taN;
            java.lang.Object obj2 = parentFragment;
            if (!z2) {
                obj2 = null;
            }
            obj = (InterfaceC46605taN) obj2;
        }
        return (InterfaceC46605taN) obj;
    }
}

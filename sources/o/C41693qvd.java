package o;

import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41693qvd {
    public static final InterfaceC41695qvf OLrzqt(@NotNull android.view.View view) {
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
            return KWHzl(fragment);
        }
        return null;
    }

    public static final InterfaceC41695qvf KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof InterfaceC41695qvf;
        java.lang.Object obj = fragment;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof InterfaceC41695qvf)) {
                parentFragment = parentFragment.getParentFragment();
            }
            boolean z2 = parentFragment instanceof InterfaceC41695qvf;
            java.lang.Object obj2 = parentFragment;
            if (!z2) {
                obj2 = null;
            }
            obj = (InterfaceC41695qvf) obj2;
        }
        return (InterfaceC41695qvf) obj;
    }
}

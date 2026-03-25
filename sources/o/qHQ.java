package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qHQ {
    public static final qHP AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof qHP;
        java.lang.Object obj = fragment;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof qHP)) {
                parentFragment = parentFragment.getParentFragment();
            }
            boolean z2 = parentFragment instanceof qHP;
            java.lang.Object obj2 = parentFragment;
            if (!z2) {
                obj2 = null;
            }
            obj = (qHP) obj2;
        }
        return (qHP) obj;
    }
}

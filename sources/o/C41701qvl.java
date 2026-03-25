package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41701qvl {
    public static final InterfaceC41634quX EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof InterfaceC41634quX;
        java.lang.Object obj = fragment;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof InterfaceC41634quX)) {
                parentFragment = parentFragment.getParentFragment();
            }
            boolean z2 = parentFragment instanceof InterfaceC41634quX;
            java.lang.Object obj2 = parentFragment;
            if (!z2) {
                obj2 = null;
            }
            obj = (InterfaceC41634quX) obj2;
        }
        return (InterfaceC41634quX) obj;
    }
}

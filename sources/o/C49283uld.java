package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49283uld {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC48892ueJ copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (fragment instanceof InterfaceC48892ueJ) {
            return (InterfaceC48892ueJ) fragment;
        }
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return copydefault(parentFragment);
        }
        return null;
    }
}

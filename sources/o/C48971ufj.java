package o;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48971ufj {
    public static final C48974ufm KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        InterfaceC48892ueJ interfaceC48892ueJEZpvd = EZpvd(fragment);
        if (interfaceC48892ueJEZpvd == null) {
            throw new java.lang.IllegalStateException("ShareDialog is required but not found. Ensure this Fragment is added under ShareDialog.");
        }
        return (C48974ufm) new ViewModelProvider(interfaceC48892ueJEZpvd.EZpvd()).get(C48974ufm.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC48892ueJ EZpvd(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        while (parentFragment != 0 && !(parentFragment instanceof InterfaceC48892ueJ)) {
            parentFragment = parentFragment.getParentFragment();
        }
        if (parentFragment instanceof InterfaceC48892ueJ) {
            return (InterfaceC48892ueJ) parentFragment;
        }
        return null;
    }
}

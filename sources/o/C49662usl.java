package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49662usl {
    public static final void EZpvd(@NotNull androidx.fragment.app.DialogFragment dialogFragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (fragmentManager.findFragmentByTag(str) != null || fragmentManager.isDestroyed()) {
            return;
        }
        dialogFragment.show(fragmentManager, str);
    }
}

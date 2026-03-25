package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46371tRw {
    public static final void AEQbTJ(@NotNull androidx.fragment.app.DialogFragment dialogFragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (fragmentManager.findFragmentByTag(str) != null || fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
            return;
        }
        dialogFragment.show(fragmentManager, str);
    }
}

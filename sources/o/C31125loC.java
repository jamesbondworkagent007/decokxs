package o;

import kotlin.jvm.internal.Intrinsics;
import o.C31172lox;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31125loC {
    public static final void copydefault(@NotNull android.os.Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putInt("meme_ui_style", i);
    }

    public static final int KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        android.os.Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return C31172lox.Companion.KWHzl();
        }
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        return taskDescription.OLrzqt(arguments.getInt("meme_ui_style", taskDescription.KWHzl()));
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32731mjC {
    public static final C32779mjy copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        C32730mjB c32730mjB = C32730mjB.AEQbTJ;
        android.content.Context applicationContext = fragment.requireContext().getApplicationContext();
        Intrinsics.copydefault(applicationContext, "");
        return c32730mjB.AEQbTJ((android.app.Application) applicationContext);
    }
}

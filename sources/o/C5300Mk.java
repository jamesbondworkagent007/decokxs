package o;

import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5300Mk {
    public static final C5302Mm OLrzqt(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull C5303Mn c5303Mn, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(c5303Mn, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C5302Mm c5302Mm = new C5302Mm(c5303Mn, scheduledExecutorService);
        c5302Mm.copydefault(function0);
        return c5302Mm;
    }
}

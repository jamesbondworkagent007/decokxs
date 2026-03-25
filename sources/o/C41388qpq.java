package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41388qpq {
    public static /* synthetic */ void check$default(java.lang.Boolean bool, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function03 = null;
        }
        EZpvd(bool, function0, function02, function03);
    }

    public static final void EZpvd(java.lang.Boolean bool, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            function0.invoke();
            return;
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            function02.invoke();
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (function03 != null) {
                function03.invoke();
            }
        }
    }

    public static final boolean KWHzl(java.lang.Boolean bool) {
        return Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
    }
}

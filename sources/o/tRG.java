package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRG {
    public static final void KWHzl(@NotNull C55251xgS c55251xgS, boolean z) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        if (z) {
            c55251xgS.setOKDSStyle(14);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            c55251xgS.setOKDSStyle(13);
        }
    }
}

package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.DQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DX {
    public static final <T> java.lang.Object AEQbTJ(@NotNull DQ<? extends T> dq) {
        Intrinsics.checkNotNullParameter(dq, "");
        if (dq instanceof DQ.ActionBar) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((DQ.ActionBar) dq).copydefault());
        }
        if (!(dq instanceof DQ.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(((DQ.Activity) dq).copydefault()));
    }
}

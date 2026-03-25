package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41359qpN {
    public static final boolean OLrzqt(@NotNull java.lang.Runtime runtime, float f) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(runtime, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C33129mqd.valueOf(C33129mqd.divS$default(java.lang.Long.valueOf(runtime.totalMemory() - runtime.freeMemory()), java.lang.Long.valueOf(runtime.maxMemory()), null, null, null, 14, null), java.lang.Float.valueOf(f))));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}

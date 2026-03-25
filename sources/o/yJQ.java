package o;

import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJQ {
    public static final boolean OLrzqt = false;

    static {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Class.forName("java.lang.ClassValue"));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = java.lang.Boolean.TRUE;
        }
        java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(objM7377constructorimpl);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = bool;
        }
        ((java.lang.Boolean) objM7377constructorimpl2).booleanValue();
    }

    public static final <V> yJM<V> EZpvd(@NotNull Function1<? super java.lang.Class<?>, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return OLrzqt ? new yJX(function1) : new C56568yKe(function1);
    }
}

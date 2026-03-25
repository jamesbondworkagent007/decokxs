package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42567rXq {
    public static final Unit AEQbTJ(C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void log$default(java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.rXt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C42567rXq.AEQbTJ((C42565rXo) obj2);
                }
            };
        }
        EZpvd(str, function1);
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final Function1<? super C42565rXo, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt(new Function1() { // from class: o.rXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42567rXq.EZpvd(str, function1, (C42565rXo) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, Function1 function1, C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        c42565rXo.AEQbTJ(str);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        c42565rXo.OLrzqt(name);
        c42565rXo.copydefault(android.os.SystemClock.elapsedRealtime());
        function1.invoke(c42565rXo);
        return Unit.INSTANCE;
    }

    public static final java.lang.Object OLrzqt(Function1<? super C42565rXo, Unit> function1) {
        try {
            Result.Application application = Result.Companion;
            C42565rXo c42565rXo = new C42565rXo();
            function1.invoke(c42565rXo);
            java.lang.String strAEQbTJ = c42565rXo.AEQbTJ();
            if (c42565rXo.KWHzl()) {
                pUU.copydefault("okcallkit", strAEQbTJ);
            } else {
                pUU.KWHzl("okcallkit", strAEQbTJ);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

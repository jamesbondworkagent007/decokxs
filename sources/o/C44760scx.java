package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44760scx {
    public static final Unit copydefault(C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void log$default(java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.scD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C44760scx.copydefault((C44761scy) obj2);
                }
            };
        }
        copydefault(str, function1);
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final Function1<? super C44761scy, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault((Function1<? super C44761scy, Unit>) new Function1() { // from class: o.scE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44760scx.EZpvd(str, function1, (C44761scy) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, Function1 function1, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.AEQbTJ(str);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        c44761scy.copydefault(name);
        c44761scy.KWHzl(android.os.SystemClock.elapsedRealtime());
        function1.invoke(c44761scy);
        return Unit.INSTANCE;
    }

    public static final java.lang.Object copydefault(Function1<? super C44761scy, Unit> function1) {
        try {
            Result.Application application = Result.Companion;
            C44761scy c44761scy = new C44761scy();
            function1.invoke(c44761scy);
            java.lang.String strOLrzqt = c44761scy.OLrzqt();
            if (c44761scy.KWHzl()) {
                pUU.copydefault("oksupport", strOLrzqt);
            } else {
                pUU.KWHzl("oksupport", strOLrzqt);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

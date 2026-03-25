package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56438yFj {
    public static final <R, T> Continuation<Unit> EZpvd(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends java.lang.Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        return new C56434yFf(C56441yFm.OLrzqt(C56441yFm.KWHzl(function2, r, continuation)), C56442yFn.copydefault());
    }

    public static final <R, T> void AEQbTJ(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends java.lang.Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        Continuation continuationOLrzqt = C56441yFm.OLrzqt(C56441yFm.KWHzl(function2, r, continuation));
        Result.Application application = Result.Companion;
        continuationOLrzqt.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
    }
}

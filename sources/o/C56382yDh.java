package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56382yDh {
    public static final java.lang.Object copydefault;

    public static final <T, R> R OLrzqt(@NotNull C56378yDd<T, R> c56378yDd, T t) {
        Intrinsics.checkNotNullParameter(c56378yDd, "");
        return (R) new C56380yDf(c56378yDd.OLrzqt(), t).copydefault();
    }

    static {
        Result.Application application = Result.Companion;
        copydefault = Result.m7377constructorimpl(C56442yFn.copydefault());
    }
}

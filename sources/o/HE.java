package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HE {
    public static final <T> HH<T> AEQbTJ(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new HF(function1);
    }
}

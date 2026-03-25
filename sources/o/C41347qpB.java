package o;

import com.okinc.market.ext.CoroutineExtKt$executeAsyncTasks$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41347qpB {
    public static final <T> java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object>[] function1Arr, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        return CoroutineScopeKt.coroutineScope(new CoroutineExtKt$executeAsyncTasks$2(function1Arr, null), continuation);
    }

    public static final <T> java.lang.Object AEQbTJ(@NotNull java.util.List<? extends Function1<? super Continuation<? super T>, ? extends java.lang.Object>> list, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        Function1[] function1Arr = (Function1[]) list.toArray(new Function1[0]);
        return EZpvd((Function1[]) java.util.Arrays.copyOf(function1Arr, function1Arr.length), continuation);
    }
}

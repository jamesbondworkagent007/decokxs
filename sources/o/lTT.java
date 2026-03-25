package o;

import com.okinc.buysell.util.AsyncHelperKt$executeApiTasks$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lTT {
    public static final java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, ? extends Function1<? super Continuation<? super AbstractC43419rot<?, ? extends java.lang.Exception>>, ? extends java.lang.Object>> map, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends AbstractC43419rot<?, ? extends java.lang.Exception>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new AsyncHelperKt$executeApiTasks$2(map, null), continuation);
    }
}

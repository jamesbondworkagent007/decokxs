package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC56105xwY<T> {
    public abstract java.lang.Object KWHzl(T t, @NotNull Continuation<? super Unit> continuation);

    public static final /* synthetic */ java.lang.Object EZpvd(Function1 function1, java.lang.Object obj, Continuation continuation) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}

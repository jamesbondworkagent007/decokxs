package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56432yFd<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.TaskDescription<E> {
    private final Function1<CoroutineContext.Element, E> safeCast;
    private final CoroutineContext.TaskDescription<?> topmostKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubKey$kotlin_stdlib(@NotNull CoroutineContext.TaskDescription<?> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return taskDescription == this || this.topmostKey == taskDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$TaskDescription<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public AbstractC56432yFd(@NotNull CoroutineContext.TaskDescription<B> taskDescription, @NotNull Function1<? super CoroutineContext.Element, ? extends E> function1) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.safeCast = function1;
        this.topmostKey = taskDescription instanceof AbstractC56432yFd ? (CoroutineContext.TaskDescription<B>) ((AbstractC56432yFd) taskDescription).topmostKey : taskDescription;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final CoroutineContext.Element tryCast$kotlin_stdlib(@NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "");
        return (CoroutineContext.Element) this.safeCast.invoke(element);
    }
}

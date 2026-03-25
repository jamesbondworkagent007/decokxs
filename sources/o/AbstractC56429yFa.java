package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56429yFa implements CoroutineContext.Element {
    private final CoroutineContext.TaskDescription<?> key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.TaskDescription<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.ActionBar.KWHzl(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.TaskDescription<E> taskDescription) {
        return (E) CoroutineContext.Element.ActionBar.AEQbTJ(this, taskDescription);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.TaskDescription<?> taskDescription) {
        return CoroutineContext.Element.ActionBar.KWHzl(this, taskDescription);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.ActionBar.AEQbTJ(this, coroutineContext);
    }

    public AbstractC56429yFa(@NotNull CoroutineContext.TaskDescription<?> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.key = taskDescription;
    }
}

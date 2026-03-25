package com.amplifyframework.statemachine;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcurrentEffectExecutor implements EffectExecutor {
    private final CoroutineDispatcher dispatcherQueue;

    public ConcurrentEffectExecutor(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.dispatcherQueue = coroutineDispatcher;
    }

    @Override // com.amplifyframework.statemachine.EffectExecutor
    public void execute(@NotNull List<? extends Action> list, @NotNull EventDispatcher eventDispatcher, @NotNull Environment environment) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(eventDispatcher, "");
        Intrinsics.checkNotNullParameter(environment, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.dispatcherQueue, null, new ConcurrentEffectExecutor$execute$1$1((Action) it.next(), eventDispatcher, environment, null), 2, null);
        }
    }
}

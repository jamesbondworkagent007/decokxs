package com.okinc.cruilib.compose.library.reorderable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mEL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableLazyListKt$ReorderableItem$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Object $key;
    final /* synthetic */ mEL $reorderableLazyListState;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyListKt$ReorderableItem$2$1(boolean z, mEL mel, Object obj, Continuation<? super ReorderableLazyListKt$ReorderableItem$2$1> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$reorderableLazyListState = mel;
        this.$key = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableLazyListKt$ReorderableItem$2$1(this.$enabled, this.$reorderableLazyListState, this.$key, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableLazyListKt$ReorderableItem$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$enabled) {
                this.$reorderableLazyListState.AhwBna().add(this.$key);
            } else {
                this.$reorderableLazyListState.AhwBna().remove(this.$key);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

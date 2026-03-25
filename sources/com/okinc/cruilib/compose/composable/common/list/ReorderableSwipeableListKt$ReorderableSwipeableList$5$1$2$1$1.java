package com.okinc.cruilib.compose.composable.common.list;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mDL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isItemBeingReordered$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onReorderStateChange;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState, Continuation<? super ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1> continuation) {
        super(2, continuation);
        this.$onReorderStateChange = function1;
        this.$isItemBeingReordered$delegate = mutableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1(this.$onReorderStateChange, this.$isItemBeingReordered$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$onReorderStateChange.invoke(C56443yFo.KWHzl(mDL.EZpvd((MutableState<Boolean>) this.$isItemBeingReordered$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

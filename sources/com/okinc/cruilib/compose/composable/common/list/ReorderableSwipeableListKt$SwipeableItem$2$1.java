package com.okinc.cruilib.compose.composable.common.list;

import androidx.compose.runtime.State;
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
public final class ReorderableSwipeableListKt$SwipeableItem$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isInDefaultState$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onItemRevealStateChange;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableSwipeableListKt$SwipeableItem$2$1(Function1<? super Boolean, Unit> function1, State<Boolean> state, Continuation<? super ReorderableSwipeableListKt$SwipeableItem$2$1> continuation) {
        super(2, continuation);
        this.$onItemRevealStateChange = function1;
        this.$isInDefaultState$delegate = state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableSwipeableListKt$SwipeableItem$2$1(this.$onItemRevealStateChange, this.$isInDefaultState$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableSwipeableListKt$SwipeableItem$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$onItemRevealStateChange.invoke(C56443yFo.KWHzl(!mDL.KWHzl((State<Boolean>) this.$isInDefaultState$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

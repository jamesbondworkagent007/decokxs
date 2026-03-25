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
import o.mDK;
import o.mDL;

/* JADX INFO: loaded from: classes23.dex */
public final class ReorderableSwipeableListKt$SwipeableItem$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isFullyRevealed$delegate;

    /* JADX INFO: Incorrect field signature: TItem; */
    final /* synthetic */ mDK $item;
    final /* synthetic */ Function1<Item, Unit> $onFullItemReveal;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TItem;Lkotlin/Unit;>;TItem;Landroidx/compose/runtime/State<Ljava/lang/Boolean;>;Lkotlin/coroutines/Continuation<-Lcom/okinc/cruilib/compose/composable/common/list/ReorderableSwipeableListKt$SwipeableItem$1$1;>;)V */
    public ReorderableSwipeableListKt$SwipeableItem$1$1(Function1 function1, mDK mdk, State state, Continuation continuation) {
        super(2, continuation);
        this.$onFullItemReveal = function1;
        this.$item = mdk;
        this.$isFullyRevealed$delegate = state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReorderableSwipeableListKt$SwipeableItem$1$1(this.$onFullItemReveal, this.$item, this.$isFullyRevealed$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReorderableSwipeableListKt$SwipeableItem$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (mDL.AEQbTJ((State<Boolean>) this.$isFullyRevealed$delegate)) {
                this.$onFullItemReveal.invoke((Item) this.$item);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

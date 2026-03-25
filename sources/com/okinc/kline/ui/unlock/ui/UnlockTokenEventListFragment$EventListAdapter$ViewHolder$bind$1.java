package com.okinc.kline.ui.unlock.ui;

import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39690pxB;
import o.C39784pyq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnlockTokenStageDataVo $item;
    int label;
    final /* synthetic */ C39690pxB.Application.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1(C39690pxB.Application.StateListAnimator stateListAnimator, UnlockTokenStageDataVo unlockTokenStageDataVo, Continuation<? super UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1> continuation) {
        super(2, continuation);
        this.this$0 = stateListAnimator;
        this.$item = unlockTokenStageDataVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39784pyq.AEQbTJ(this.this$0.EZpvd(), this.$item);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

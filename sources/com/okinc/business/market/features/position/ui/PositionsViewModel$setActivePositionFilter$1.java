package com.okinc.business.market.features.position.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28434kah;
import o.C28443kaq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$setActivePositionFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hideNativeToken;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$setActivePositionFilter$1(PositionsViewModel positionsViewModel, boolean z, Continuation<? super PositionsViewModel$setActivePositionFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$hideNativeToken = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$setActivePositionFilter$1(this.this$0, this.$hideNativeToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$setActivePositionFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28434kah c28434kah = this.this$0.valueOf;
            boolean z = this.$hideNativeToken;
            this.label = 1;
            if (c28434kah.KWHzl(z, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
        C28443kaq c28443kaq = (C28443kaq) this.this$0.EZpvd.getValue();
        mutableStateFlow.setValue(c28443kaq != null ? C28443kaq.copy$default(c28443kaq, false, null, this.$hideNativeToken, null, 11, null) : null);
        PositionsViewModel.triggerSortingFilter$default(this.this$0, null, 1, null);
        this.this$0.AEQbTJ(false);
        return Unit.INSTANCE;
    }
}

package com.okinc.unify_trade.core.base;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56132xwz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC55735xpZ;

/* JADX INFO: loaded from: classes12.dex */
public final class SharedViewModel$emitRatingPageSharedFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC55735xpZ $value;
    int label;
    final /* synthetic */ C56132xwz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedViewModel$emitRatingPageSharedFlow$1(C56132xwz c56132xwz, InterfaceC55735xpZ interfaceC55735xpZ, Continuation<? super SharedViewModel$emitRatingPageSharedFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c56132xwz;
        this.$value = interfaceC55735xpZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedViewModel$emitRatingPageSharedFlow$1(this.this$0, this.$value, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedViewModel$emitRatingPageSharedFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            InterfaceC55735xpZ interfaceC55735xpZ = this.$value;
            this.label = 1;
            if (mutableSharedFlow.emit(interfaceC55735xpZ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

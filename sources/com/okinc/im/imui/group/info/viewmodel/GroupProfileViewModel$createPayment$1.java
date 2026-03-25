package com.okinc.im.imui.group.info.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C34165nTv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$createPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$createPayment$1(GroupProfileViewModel groupProfileViewModel, Continuation<? super GroupProfileViewModel$createPayment$1> continuation) {
        super(2, continuation);
        this.this$0 = groupProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupProfileViewModel$createPayment$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupProfileViewModel$createPayment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            C34165nTv c34165nTv = this.this$0.gEmmrt;
            String strAYXKKw = this.this$0.AYXKKw();
            this.L$0 = mutableSharedFlow2;
            this.label = 1;
            Object objCheck$default = C34165nTv.check$default(c34165nTv, strAYXKKw, null, null, this, 6, null);
            if (objCheck$default == objCopydefault) {
                return objCopydefault;
            }
            mutableSharedFlow = mutableSharedFlow2;
            obj = objCheck$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        mutableSharedFlow.tryEmit(obj);
        return Unit.INSTANCE;
    }
}

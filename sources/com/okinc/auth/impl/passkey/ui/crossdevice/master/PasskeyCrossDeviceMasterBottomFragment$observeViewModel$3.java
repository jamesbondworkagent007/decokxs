package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C58761zOi;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3 extends SuspendLambda implements Function2<C58761zOi, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PasskeyCrossDeviceMasterBottomFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3(PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment, Continuation<? super PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceMasterBottomFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3 passkeyCrossDeviceMasterBottomFragment$observeViewModel$3 = new PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3(this.this$0, continuation);
        passkeyCrossDeviceMasterBottomFragment$observeViewModel$3.L$0 = obj;
        return passkeyCrossDeviceMasterBottomFragment$observeViewModel$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C58761zOi c58761zOi, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3) create(c58761zOi, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd((C58761zOi) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

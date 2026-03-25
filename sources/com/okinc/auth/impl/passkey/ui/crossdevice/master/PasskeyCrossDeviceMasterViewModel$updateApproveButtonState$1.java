package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C58761zOi;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyCrossDeviceMasterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1(PasskeyCrossDeviceMasterViewModel passkeyCrossDeviceMasterViewModel, Continuation<? super PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceMasterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C58761zOi c58761zOiAYXKKw = this.this$0.AYXKKw();
            if (c58761zOiAYXKKw == null) {
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd.setValue(C56443yFo.KWHzl(this.this$0.copydefault(c58761zOiAYXKKw)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

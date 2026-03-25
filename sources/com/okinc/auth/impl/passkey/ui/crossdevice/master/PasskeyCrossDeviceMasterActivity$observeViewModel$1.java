package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60238zyv;
import o.C56391yDq;
import o.C56442yFn;
import o.C58761zOi;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceMasterActivity$observeViewModel$1 extends SuspendLambda implements Function2<C58761zOi, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PasskeyCrossDeviceMasterActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceMasterActivity$observeViewModel$1(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity, Continuation<? super PasskeyCrossDeviceMasterActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceMasterActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyCrossDeviceMasterActivity$observeViewModel$1 passkeyCrossDeviceMasterActivity$observeViewModel$1 = new PasskeyCrossDeviceMasterActivity$observeViewModel$1(this.this$0, continuation);
        passkeyCrossDeviceMasterActivity$observeViewModel$1.L$0 = obj;
        return passkeyCrossDeviceMasterActivity$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C58761zOi c58761zOi, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceMasterActivity$observeViewModel$1) create(c58761zOi, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC60238zyv abstractC60238zyvEZpvd = ((C58761zOi) this.L$0).EZpvd();
            if (Intrinsics.EZpvd(abstractC60238zyvEZpvd, AbstractC60238zyv.TaskDescription.INSTANCE)) {
                this.this$0.showLoadingAtOnce();
            } else {
                if (!Intrinsics.EZpvd(abstractC60238zyvEZpvd, AbstractC60238zyv.StateListAnimator.INSTANCE) && !Intrinsics.EZpvd(abstractC60238zyvEZpvd, AbstractC60238zyv.ActionBar.INSTANCE) && !(abstractC60238zyvEZpvd instanceof AbstractC60238zyv.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.releaseLoading();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

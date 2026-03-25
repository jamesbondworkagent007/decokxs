package com.okinc.auth.impl.passkey.ui.sync.stepper;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.zQK;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ zQK $step;
    int label;
    final /* synthetic */ PasskeySyncStepperActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1(zQK zqk, PasskeySyncStepperActivity passkeySyncStepperActivity, Continuation<? super PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1> continuation) {
        super(2, continuation);
        this.$step = zqk;
        this.this$0 = passkeySyncStepperActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1(this.$step, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            zQK zqk = this.$step;
            if (!Intrinsics.EZpvd(zqk, zQK.Activity.INSTANCE)) {
                if (Intrinsics.EZpvd(zqk, zQK.TaskDescription.INSTANCE)) {
                    pUU.KWHzl(this.this$0.getTAG(), "Device list ready");
                } else if (Intrinsics.EZpvd(zqk, zQK.Application.INSTANCE)) {
                    pUU.KWHzl(this.this$0.getTAG(), "MFA in progress");
                } else if (Intrinsics.EZpvd(zqk, zQK.Fragment.INSTANCE)) {
                    this.this$0.AhwBna();
                } else if (Intrinsics.EZpvd(zqk, zQK.StateListAnimator.INSTANCE)) {
                    this.this$0.finish();
                } else {
                    if (!(zqk instanceof zQK.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithFailedIcon$default(((zQK.ActionBar) this.$step).copydefault(), 0, 1, (Object) null);
                    this.this$0.finish();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

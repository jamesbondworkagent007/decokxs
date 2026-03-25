package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import androidx.activity.result.ActivityResultLauncher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C6330aNM;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6330aNM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6(C6330aNM c6330aNM, Continuation<? super PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c6330aNM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6 passkeyPromotionServiceWIthPasskeyStepperFragment$initView$6 = new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6(this.this$0, continuation);
        passkeyPromotionServiceWIthPasskeyStepperFragment$initView$6.L$0 = obj;
        return passkeyPromotionServiceWIthPasskeyStepperFragment$initView$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            ActivityResultLauncher activityResultLauncher = this.this$0.isConnected;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(str);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

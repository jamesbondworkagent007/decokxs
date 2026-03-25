package com.okinc.auth.impl.passkey.ui.register.base;

import androidx.activity.result.ActivityResultLauncher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6268aMD;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceBaseFragment$initObserveEvent$7 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6268aMD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseFragment$initObserveEvent$7(C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseFragment$initObserveEvent$7> continuation) {
        super(2, continuation);
        this.this$0 = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyPromotionServiceBaseFragment$initObserveEvent$7 passkeyPromotionServiceBaseFragment$initObserveEvent$7 = new PasskeyPromotionServiceBaseFragment$initObserveEvent$7(this.this$0, continuation);
        passkeyPromotionServiceBaseFragment$initObserveEvent$7.L$0 = obj;
        return passkeyPromotionServiceBaseFragment$initObserveEvent$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseFragment$initObserveEvent$7) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " start mfa for result", 2, null);
            ActivityResultLauncher activityResultLauncher = this.this$0.DbNXlk;
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

package com.okinc.ok_kyc_core.extension;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C41988rCe;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8108awX;

/* JADX INFO: loaded from: classes16.dex */
public final class SimulateEntityFunctionBottomSheet$processLoginState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C52794wYp $primaryButton;
    final /* synthetic */ InterfaceC8108awX $userManager;
    int label;
    final /* synthetic */ C41988rCe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulateEntityFunctionBottomSheet$processLoginState$1(InterfaceC8108awX interfaceC8108awX, C41988rCe c41988rCe, C52794wYp c52794wYp, Continuation<? super SimulateEntityFunctionBottomSheet$processLoginState$1> continuation) {
        super(2, continuation);
        this.$userManager = interfaceC8108awX;
        this.this$0 = c41988rCe;
        this.$primaryButton = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SimulateEntityFunctionBottomSheet$processLoginState$1(this.$userManager, this.this$0, this.$primaryButton, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SimulateEntityFunctionBottomSheet$processLoginState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$userManager.copydefault()) {
                InterfaceC8108awX interfaceC8108awX = this.$userManager;
                this.label = 1;
                if (InterfaceC8108awX.Application.logoutCurrentUser$default(interfaceC8108awX, null, this, 1, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.copydefault(this.$primaryButton);
        return Unit.INSTANCE;
    }
}

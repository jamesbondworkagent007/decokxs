package com.okinc.auth.impl.passkey.ui.start;

import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyStartForAssetWithdrawViewModel$postRegister$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyRegisterState $state;
    int label;
    final /* synthetic */ PasskeyStartForAssetWithdrawViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyStartForAssetWithdrawViewModel$postRegister$1(PasskeyRegisterState passkeyRegisterState, PasskeyStartForAssetWithdrawViewModel passkeyStartForAssetWithdrawViewModel, Continuation<? super PasskeyStartForAssetWithdrawViewModel$postRegister$1> continuation) {
        super(2, continuation);
        this.$state = passkeyRegisterState;
        this.this$0 = passkeyStartForAssetWithdrawViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyStartForAssetWithdrawViewModel$postRegister$1(this.$state, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyStartForAssetWithdrawViewModel$postRegister$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object stateListAnimator = this.$state instanceof PasskeyRegisterState.Success ? PasskeyStartForAssetWithdrawViewModel.ActionBar.C0240ActionBar.copydefault : new PasskeyStartForAssetWithdrawViewModel.ActionBar.StateListAnimator(this.$state);
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            this.label = 1;
            if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
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

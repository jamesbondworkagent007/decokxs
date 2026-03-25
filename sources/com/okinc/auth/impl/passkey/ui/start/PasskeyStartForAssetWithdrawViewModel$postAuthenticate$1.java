package com.okinc.auth.impl.passkey.ui.start;

import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
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
public final class PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyAuthenticateState $state;
    int label;
    final /* synthetic */ PasskeyStartForAssetWithdrawViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1(PasskeyAuthenticateState passkeyAuthenticateState, PasskeyStartForAssetWithdrawViewModel passkeyStartForAssetWithdrawViewModel, Continuation<? super PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1> continuation) {
        super(2, continuation);
        this.$state = passkeyAuthenticateState;
        this.this$0 = passkeyStartForAssetWithdrawViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1(this.$state, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyStartForAssetWithdrawViewModel.ActionBar.Activity activity = new PasskeyStartForAssetWithdrawViewModel.ActionBar.Activity(this.$state);
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            this.label = 1;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
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

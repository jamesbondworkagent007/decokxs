package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PasskeyState>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityAuthenticateOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2(SecurityAuthenticateOkxPayPasskeyServiceViewModel securityAuthenticateOkxPayPasskeyServiceViewModel, Continuation<? super SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2> continuation) {
        super(2, continuation);
        this.this$0 = securityAuthenticateOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PasskeyState> continuation) {
        return ((SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator stateListAnimator = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator(true);
            this.label = 1;
            if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    PasskeyState passkeyState = (PasskeyState) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return passkeyState;
                }
                C56391yDq.AEQbTJ(obj);
                PasskeyState passkeyState2 = (PasskeyState) obj;
                MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator stateListAnimator2 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator(false);
                this.L$0 = passkeyState2;
                this.label = 3;
                return mutableSharedFlow2.emit(stateListAnimator2, this) != objCopydefault ? objCopydefault : passkeyState2;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC8196ayF interfaceC8196ayF = this.this$0.AYXKKw;
        this.label = 2;
        obj = interfaceC8196ayF.copydefault(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        PasskeyState passkeyState22 = (PasskeyState) obj;
        MutableSharedFlow mutableSharedFlow22 = this.this$0.EZpvd;
        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator stateListAnimator22 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator(false);
        this.L$0 = passkeyState22;
        this.label = 3;
        if (mutableSharedFlow22.emit(stateListAnimator22, this) != objCopydefault) {
        }
    }
}

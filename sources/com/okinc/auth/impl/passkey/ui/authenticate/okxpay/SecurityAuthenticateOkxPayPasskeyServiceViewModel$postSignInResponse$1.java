package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C6617aSi;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeySdkResult $result;
    int label;
    final /* synthetic */ SecurityAuthenticateOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1(PasskeySdkResult passkeySdkResult, SecurityAuthenticateOkxPayPasskeyServiceViewModel securityAuthenticateOkxPayPasskeyServiceViewModel, Continuation<? super SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1> continuation) {
        super(2, continuation);
        this.$result = passkeySdkResult;
        this.this$0 = securityAuthenticateOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeySdkResult passkeySdkResult = this.$result;
                if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
                    if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                        MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(new PasskeyState.Success(C6617aSi.EZpvd(((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt())));
                        this.label = 1;
                        if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                        if (((PasskeySdkResult.Failure) passkeySdkResult).djBIcL()) {
                            MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                            String strKWHzl = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                            String str = strKWHzl != null ? strKWHzl : "";
                            this.label = 2;
                            if (mutableSharedFlow2.emit(str, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                            String strKWHzl2 = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                            SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar2 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(new PasskeyState.AuthenticateError(strKWHzl2 != null ? strKWHzl2 : ""));
                            this.label = 3;
                            if (mutableSharedFlow3.emit(actionBar2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar3 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(new PasskeyState.AuthenticateError("Already existed"));
                        this.label = 4;
                        if (mutableSharedFlow4.emit(actionBar3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.EZpvd;
                        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar4 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(PasskeyState.Cancel.INSTANCE);
                        this.label = 5;
                        if (mutableSharedFlow5.emit(actionBar4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey) {
                        MutableSharedFlow mutableSharedFlow6 = this.this$0.EZpvd;
                        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar5 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(PasskeyState.NoValidPasskey.INSTANCE);
                        this.label = 6;
                        if (mutableSharedFlow6.emit(actionBar5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C56391yDq.AEQbTJ(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

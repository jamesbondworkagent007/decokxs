package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeySdkResult;
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
public final class PasskeyAuthenticateScenarioViewModel$postSdkAuth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeySdkResult $result;
    int label;
    final /* synthetic */ PasskeyAuthenticateScenarioViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateScenarioViewModel$postSdkAuth$1(PasskeySdkResult passkeySdkResult, PasskeyAuthenticateScenarioViewModel passkeyAuthenticateScenarioViewModel, Continuation<? super PasskeyAuthenticateScenarioViewModel$postSdkAuth$1> continuation) {
        super(2, continuation);
        this.$result = passkeySdkResult;
        this.this$0 = passkeyAuthenticateScenarioViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateScenarioViewModel$postSdkAuth$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateScenarioViewModel$postSdkAuth$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeySdkResult passkeySdkResult = this.$result;
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                    PasskeyAuthenticateResponse passkeyAuthenticateResponseEZpvd = C6617aSi.EZpvd(((PasskeySdkResult.SuccessWithPublicKeyCredential) passkeySdkResult).OLrzqt());
                    MutableSharedFlow mutableSharedFlow = this.this$0.djBIcL;
                    PasskeyAuthenticateState.Success success = new PasskeyAuthenticateState.Success(passkeyAuthenticateResponseEZpvd, passkeyAuthenticateResponseEZpvd.getIsExternalPasskey());
                    this.label = 1;
                    if (mutableSharedFlow.emit(success, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson) {
                    PasskeyAuthenticateResponse passkeyAuthenticateResponseCopydefault = C6617aSi.copydefault(((PasskeySdkResult.SuccessWithJson) passkeySdkResult).copydefault());
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.djBIcL;
                    PasskeyAuthenticateState.Success success2 = new PasskeyAuthenticateState.Success(passkeyAuthenticateResponseCopydefault, passkeyAuthenticateResponseCopydefault.getIsExternalPasskey());
                    this.label = 2;
                    if (mutableSharedFlow2.emit(success2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.djBIcL;
                    PasskeyAuthenticateState.Cancel cancel = PasskeyAuthenticateState.Cancel.copydefault;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(cancel, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                    if (((PasskeySdkResult.Failure) passkeySdkResult).AhwBna()) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                        String strKWHzl = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                        str = strKWHzl != null ? strKWHzl : "";
                        this.label = 4;
                        if (mutableSharedFlow4.emit(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).djBIcL()) {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.AEQbTJ;
                        String strKWHzl2 = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                        str = strKWHzl2 != null ? strKWHzl2 : "";
                        this.label = 5;
                        if (mutableSharedFlow5.emit(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow6 = this.this$0.djBIcL;
                        String strKWHzl3 = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                        PasskeyAuthenticateState.SdkError sdkError = new PasskeyAuthenticateState.SdkError(strKWHzl3 != null ? strKWHzl3 : "", false);
                        this.label = 6;
                        if (mutableSharedFlow6.emit(sdkError, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey) {
                    MutableSharedFlow mutableSharedFlow7 = this.this$0.djBIcL;
                    PasskeyAuthenticateState.NoValidPasskey noValidPasskey = PasskeyAuthenticateState.NoValidPasskey.OLrzqt;
                    this.label = 7;
                    if (mutableSharedFlow7.emit(noValidPasskey, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (!(passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted)) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

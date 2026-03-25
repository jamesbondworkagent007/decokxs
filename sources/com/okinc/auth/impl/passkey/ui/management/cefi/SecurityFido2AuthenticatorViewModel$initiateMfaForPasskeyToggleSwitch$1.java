package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInitiateResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5977aGe;
import o.C8206ayP;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $successMessage;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, String str, Continuation<? super SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
        this.$successMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1(this.this$0, this.$successMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel = this.this$0;
                String str = this.$successMessage;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    PasskeyToggleInitiateResponse passkeyToggleInitiateResponse = (PasskeyToggleInitiateResponse) objAEQbTJ;
                    securityFido2AuthenticatorViewModel.fIwbmz.setValue(str);
                    if (Intrinsics.EZpvd((Object) passkeyToggleInitiateResponse.getNextStep(), (Object) "MFA_VERIFICATION")) {
                        String business = passkeyToggleInitiateResponse.getBusiness();
                        if (business == null) {
                            business = "";
                        }
                        securityFido2AuthenticatorViewModel.AEQbTJ(business);
                    } else {
                        pUU.copydefault("SecurityFido2AuthenticatorViewModel", "initiateMfaForPasskeyToggleSwitch: nextStep: " + passkeyToggleInitiateResponse.getNextStep());
                        securityFido2AuthenticatorViewModel.EZpvd.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.FragmentManager(String.valueOf(C8206ayP.Dialog.DPHNDa))));
                    }
                }
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableLiveData mutableLiveData = securityFido2AuthenticatorViewModel2.EZpvd;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(message != null ? message : "")));
                }
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5977aGe c5977aGe = this.this$0.AwvSrB;
        this.label = 2;
        objAEQbTJ = c5977aGe.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel3 = this.this$0;
        String str2 = this.$successMessage;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
        }
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
        }
        mutableSharedFlow = this.this$0.gEmmrt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}

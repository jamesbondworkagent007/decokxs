package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;
import o.C8206ayP;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ C5790aDC $fragment;
    final /* synthetic */ MfaScenario $mfaScenario;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, C5790aDC c5790aDC, MfaScenario mfaScenario, String str, Continuation<? super VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$fragment = c5790aDC;
        this.$mfaScenario = mfaScenario;
        this.$errorMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1 verifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1 = new VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1(this.this$0, this.$fragment, this.$mfaScenario, this.$errorMessage, continuation);
        verifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1.L$0 = obj;
        return verifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AuthenticationStartResponse authenticationStartResponse;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel;
        C5790aDC c5790aDC;
        MfaScenario mfaScenario;
        AuthenticationStartResponse authenticationStartResponse2;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel2;
        MfaScenario mfaScenario2;
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                AuthenticationStartResponse authenticationStartResponse3 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                if (authenticationStartResponse3 != null) {
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel3 = this.this$0;
                    this.L$0 = authenticationStartResponse3;
                    this.label = 2;
                    Object objAEQbTJ = verifyMfaPasskeyViewModel3.AEQbTJ((Continuation<? super Boolean>) this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    authenticationStartResponse = authenticationStartResponse3;
                    obj = objAEQbTJ;
                    if (!((Boolean) obj).booleanValue()) {
                        verifyMfaPasskeyViewModel = this.this$0;
                        c5790aDC = this.$fragment;
                        mfaScenario = this.$mfaScenario;
                        this.L$0 = verifyMfaPasskeyViewModel;
                        this.L$1 = c5790aDC;
                        this.L$2 = mfaScenario;
                        this.L$3 = authenticationStartResponse;
                        this.label = 3;
                        obj = verifyMfaPasskeyViewModel.copydefault((Continuation<? super Boolean>) this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        authenticationStartResponse2 = authenticationStartResponse;
                        verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                        mfaScenario2 = mfaScenario;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        if (verifyMfaPasskeyViewModel2.OLrzqt(c5790aDC, mfaScenario2, authenticationStartResponse2, zBooleanValue, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel4 = this.this$0;
                    this.L$0 = authenticationStartResponse;
                    this.label = 5;
                    obj = verifyMfaPasskeyViewModel4.copydefault((Continuation<? super Boolean>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel5 = this.this$0;
                        this.L$0 = null;
                        this.label = 6;
                        if (verifyMfaPasskeyViewModel5.OLrzqt(authenticationStartResponse, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                        String str = this.$errorMessage;
                        this.L$0 = null;
                        this.label = 7;
                        if (mutableSharedFlow.emit(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel6 = this.this$0;
                pUU.copydefault("VerifyMfaPasskeyViewModel", "fido1v2ErrorFallbackToFido1v1 authenticationStartResponse is null");
                MutableSharedFlow mutableSharedFlow2 = verifyMfaPasskeyViewModel6.copydefault;
                String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                this.label = 1;
                if (mutableSharedFlow2.emit(strAYXKKw, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 2:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            case 3:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$3;
                mfaScenario = (MfaScenario) this.L$2;
                c5790aDC = (C5790aDC) this.L$1;
                verifyMfaPasskeyViewModel = (VerifyMfaPasskeyViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                authenticationStartResponse2 = authenticationStartResponse;
                verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                mfaScenario2 = mfaScenario;
                zBooleanValue = ((Boolean) obj).booleanValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                if (verifyMfaPasskeyViewModel2.OLrzqt(c5790aDC, mfaScenario2, authenticationStartResponse2, zBooleanValue, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

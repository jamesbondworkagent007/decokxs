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
public final class VerifyMfaPasskeyViewModel$startFido1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
    public VerifyMfaPasskeyViewModel$startFido1$1(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, C5790aDC c5790aDC, MfaScenario mfaScenario, Continuation<? super VerifyMfaPasskeyViewModel$startFido1$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$fragment = c5790aDC;
        this.$mfaScenario = mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyViewModel$startFido1$1 verifyMfaPasskeyViewModel$startFido1$1 = new VerifyMfaPasskeyViewModel$startFido1$1(this.this$0, this.$fragment, this.$mfaScenario, continuation);
        verifyMfaPasskeyViewModel$startFido1$1.L$0 = obj;
        return verifyMfaPasskeyViewModel$startFido1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$startFido1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
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
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel3;
        C5790aDC c5790aDC2;
        MfaScenario mfaScenario3;
        AuthenticationStartResponse authenticationStartResponse3;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel4;
        MfaScenario mfaScenario4;
        boolean zBooleanValue2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                AuthenticationStartResponse authenticationStartResponse4 = (AuthenticationStartResponse) this.this$0.AEQbTJ.getValue();
                if (authenticationStartResponse4 != null) {
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel5 = this.this$0;
                    this.L$0 = authenticationStartResponse4;
                    this.label = 2;
                    Object objKWHzl = verifyMfaPasskeyViewModel5.KWHzl((Continuation<? super Boolean>) this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    authenticationStartResponse = authenticationStartResponse4;
                    obj = objKWHzl;
                    if (!((Boolean) obj).booleanValue()) {
                        verifyMfaPasskeyViewModel = this.this$0;
                        c5790aDC = this.$fragment;
                        mfaScenario = this.$mfaScenario;
                        this.L$0 = verifyMfaPasskeyViewModel;
                        this.L$1 = c5790aDC;
                        this.L$2 = mfaScenario;
                        this.L$3 = authenticationStartResponse;
                        this.label = 3;
                        obj = verifyMfaPasskeyViewModel.OLrzqt((Continuation<? super Boolean>) this);
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
                        if (verifyMfaPasskeyViewModel2.KWHzl(c5790aDC, mfaScenario2, authenticationStartResponse2, zBooleanValue, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel6 = this.this$0;
                    this.L$0 = authenticationStartResponse;
                    this.label = 5;
                    obj = verifyMfaPasskeyViewModel6.OLrzqt((Continuation<? super Boolean>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel7 = this.this$0;
                        this.L$0 = null;
                        this.label = 6;
                        if (verifyMfaPasskeyViewModel7.KWHzl(authenticationStartResponse, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel8 = this.this$0;
                    this.L$0 = authenticationStartResponse;
                    this.label = 7;
                    obj = verifyMfaPasskeyViewModel8.AEQbTJ((Continuation<? super Boolean>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        verifyMfaPasskeyViewModel3 = this.this$0;
                        c5790aDC2 = this.$fragment;
                        mfaScenario3 = this.$mfaScenario;
                        this.L$0 = verifyMfaPasskeyViewModel3;
                        this.L$1 = c5790aDC2;
                        this.L$2 = mfaScenario3;
                        this.L$3 = authenticationStartResponse;
                        this.label = 8;
                        obj = verifyMfaPasskeyViewModel3.copydefault((Continuation<? super Boolean>) this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        authenticationStartResponse3 = authenticationStartResponse;
                        verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                        mfaScenario4 = mfaScenario3;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        if (verifyMfaPasskeyViewModel4.OLrzqt(c5790aDC2, mfaScenario4, authenticationStartResponse3, zBooleanValue2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel9 = this.this$0;
                    this.L$0 = authenticationStartResponse;
                    this.label = 10;
                    obj = verifyMfaPasskeyViewModel9.copydefault((Continuation<? super Boolean>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel10 = this.this$0;
                        this.L$0 = null;
                        this.label = 11;
                        if (verifyMfaPasskeyViewModel10.OLrzqt(authenticationStartResponse, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow = this.this$0.AkhnZx;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = null;
                        this.label = 12;
                        if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel11 = this.this$0;
                pUU.copydefault("VerifyMfaPasskeyViewModel", "startFido1 authenticationStartResponse is null");
                MutableSharedFlow mutableSharedFlow2 = verifyMfaPasskeyViewModel11.copydefault;
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
                if (verifyMfaPasskeyViewModel2.KWHzl(c5790aDC, mfaScenario2, authenticationStartResponse2, zBooleanValue, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
            case 6:
            case 9:
            case 11:
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            case 7:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            case 8:
                authenticationStartResponse = (AuthenticationStartResponse) this.L$3;
                mfaScenario3 = (MfaScenario) this.L$2;
                c5790aDC2 = (C5790aDC) this.L$1;
                verifyMfaPasskeyViewModel3 = (VerifyMfaPasskeyViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                authenticationStartResponse3 = authenticationStartResponse;
                verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                mfaScenario4 = mfaScenario3;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 9;
                if (verifyMfaPasskeyViewModel4.OLrzqt(c5790aDC2, mfaScenario4, authenticationStartResponse3, zBooleanValue2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
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

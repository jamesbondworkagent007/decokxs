package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5767aCg;
import o.C5768aCh;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel$clickVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceFido2Fallback;
    final /* synthetic */ MfaScenario $mfaScenario;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$clickVerify$1(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, MfaScenario mfaScenario, boolean z, Continuation<? super VerifyMfaPasskeyViewModel$clickVerify$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$mfaScenario = mfaScenario;
        this.$forceFido2Fallback = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyViewModel$clickVerify$1(this.this$0, this.$mfaScenario, this.$forceFido2Fallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$clickVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objAEQbTJ;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        MfaFailure.GenericFailure genericFailure;
        Object obj2;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel2;
        boolean z;
        AuthenticationStartResponse authenticationStartResponse;
        Object objKWHzl;
        Object obj3;
        MutableSharedFlow mutableSharedFlow2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow3 = this.this$0.gEmmrt;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow3.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5768aCh c5768aCh = this.this$0.aKErDB;
                str = (String) this.this$0.values.getValue();
                if (str == null) {
                    str = "";
                }
                SubdomainStrategy value = this.this$0.iwGUEr().getValue();
                MfaScenario mfaScenario = this.$mfaScenario;
                this.label = 2;
                objAEQbTJ = c5768aCh.AEQbTJ(str, value, mfaScenario, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                verifyMfaPasskeyViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow4 = verifyMfaPasskeyViewModel.gEmmrt;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = objAEQbTJ;
                    this.L$1 = verifyMfaPasskeyViewModel;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 3;
                    if (mutableSharedFlow4.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "clickVerify startPasskeyUseCase: " + thM7380exceptionOrNullimpl.getMessage());
                    mutableSharedFlow = verifyMfaPasskeyViewModel.djBIcL;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    genericFailure = new MfaFailure.GenericFailure(null, message != null ? message : "", 1, null);
                    this.L$0 = objAEQbTJ;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(genericFailure, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objAEQbTJ;
                    objAEQbTJ = obj2;
                }
                verifyMfaPasskeyViewModel2 = this.this$0;
                z = this.$forceFido2Fallback;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    authenticationStartResponse = (AuthenticationStartResponse) objAEQbTJ;
                    MutableSharedFlow mutableSharedFlow5 = verifyMfaPasskeyViewModel2.gEmmrt;
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.L$0 = objAEQbTJ;
                    this.L$1 = verifyMfaPasskeyViewModel2;
                    this.L$2 = authenticationStartResponse;
                    this.Z$0 = z;
                    this.label = 5;
                    if (mutableSharedFlow5.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    verifyMfaPasskeyViewModel2.AEQbTJ.setValue(authenticationStartResponse);
                    MutableSharedFlow mutableSharedFlow6 = verifyMfaPasskeyViewModel2.isConnected;
                    C5767aCg c5767aCg = verifyMfaPasskeyViewModel2.RcXXUw;
                    Boolean value2 = verifyMfaPasskeyViewModel2.ejfBZ().getValue();
                    boolean zBooleanValue = value2 != null ? value2.booleanValue() : false;
                    this.L$0 = objAEQbTJ;
                    this.L$1 = mutableSharedFlow6;
                    this.L$2 = null;
                    this.label = 6;
                    objKWHzl = c5767aCg.KWHzl(z, authenticationStartResponse, zBooleanValue, this);
                    if (objKWHzl != objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objAEQbTJ;
                    obj = objKWHzl;
                    mutableSharedFlow2 = mutableSharedFlow6;
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.label = 7;
                    if (mutableSharedFlow2.emit(obj, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5768aCh c5768aCh2 = this.this$0.aKErDB;
                str = (String) this.this$0.values.getValue();
                if (str == null) {
                }
                SubdomainStrategy value3 = this.this$0.iwGUEr().getValue();
                MfaScenario mfaScenario2 = this.$mfaScenario;
                this.label = 2;
                objAEQbTJ = c5768aCh2.AEQbTJ(str, value3, mfaScenario2, this);
                if (objAEQbTJ == objCopydefault) {
                }
                verifyMfaPasskeyViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                }
                verifyMfaPasskeyViewModel2 = this.this$0;
                z = this.$forceFido2Fallback;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                verifyMfaPasskeyViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                }
                verifyMfaPasskeyViewModel2 = this.this$0;
                z = this.$forceFido2Fallback;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                }
                return Unit.INSTANCE;
            case 3:
                thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                verifyMfaPasskeyViewModel = (VerifyMfaPasskeyViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj4;
                pUU.copydefault("VerifyMfaPasskeyViewModel", "clickVerify startPasskeyUseCase: " + thM7380exceptionOrNullimpl.getMessage());
                mutableSharedFlow = verifyMfaPasskeyViewModel.djBIcL;
                String message2 = thM7380exceptionOrNullimpl.getMessage();
                genericFailure = new MfaFailure.GenericFailure(null, message2 != null ? message2 : "", 1, null);
                this.L$0 = objAEQbTJ;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(genericFailure, this) != objCopydefault) {
                }
                break;
            case 4:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj2;
                verifyMfaPasskeyViewModel2 = this.this$0;
                z = this.$forceFido2Fallback;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                }
                return Unit.INSTANCE;
            case 5:
                z = this.Z$0;
                authenticationStartResponse = (AuthenticationStartResponse) this.L$2;
                verifyMfaPasskeyViewModel2 = (VerifyMfaPasskeyViewModel) this.L$1;
                Object obj5 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj5;
                verifyMfaPasskeyViewModel2.AEQbTJ.setValue(authenticationStartResponse);
                MutableSharedFlow mutableSharedFlow62 = verifyMfaPasskeyViewModel2.isConnected;
                C5767aCg c5767aCg2 = verifyMfaPasskeyViewModel2.RcXXUw;
                Boolean value22 = verifyMfaPasskeyViewModel2.ejfBZ().getValue();
                if (value22 != null) {
                }
                this.L$0 = objAEQbTJ;
                this.L$1 = mutableSharedFlow62;
                this.L$2 = null;
                this.label = 6;
                objKWHzl = c5767aCg2.KWHzl(z, authenticationStartResponse, zBooleanValue, this);
                if (objKWHzl != objCopydefault) {
                }
                break;
            case 6:
                mutableSharedFlow2 = (MutableSharedFlow) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = obj3;
                this.L$1 = null;
                this.label = 7;
                if (mutableSharedFlow2.emit(obj, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

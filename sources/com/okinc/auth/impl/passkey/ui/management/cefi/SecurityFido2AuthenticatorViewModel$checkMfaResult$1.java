package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.service.MfaCheckResultResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel$checkMfaResult$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32989mnw;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5763aCc;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$checkMfaResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$checkMfaResult$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, String str, Continuation<? super SecurityFido2AuthenticatorViewModel$checkMfaResult$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$checkMfaResult$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$checkMfaResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r5.equals("REMOVE_PASSKEY") == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8552invoke0E7RQCE$default;
        Object obj2;
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel;
        Object obj3;
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel2;
        String str;
        final SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel3;
        String str2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = this.this$0.gEmmrt;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5763aCc c5763aCc = this.this$0.uzCIH;
                String str3 = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc, str3, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objM8552invoke0E7RQCE$default;
                securityFido2AuthenticatorViewModel = this.this$0;
                String str4 = this.$sessionId;
                if (Result.m7384isSuccessimpl(obj2)) {
                    MfaCheckResultResponse mfaCheckResultResponse = (MfaCheckResultResponse) obj2;
                    String nextStep = mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null;
                    if (nextStep != null) {
                        int iHashCode = nextStep.hashCode();
                        if (iHashCode != -1664744304) {
                            if (iHashCode != 808267715) {
                                if (iHashCode == 1956696019) {
                                }
                            } else if (nextStep.equals("REG_PASSKEY")) {
                                MutableSharedFlow mutableSharedFlow2 = securityFido2AuthenticatorViewModel.gEmmrt;
                                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                                this.L$0 = obj2;
                                this.L$1 = securityFido2AuthenticatorViewModel;
                                this.L$2 = str4;
                                this.label = 3;
                                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                obj3 = obj2;
                                securityFido2AuthenticatorViewModel3 = securityFido2AuthenticatorViewModel;
                                str2 = str4;
                                securityFido2AuthenticatorViewModel3.AEQbTJ(str2, (Function0<Unit>) new Function0() { // from class: o.aKN
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return SecurityFido2AuthenticatorViewModel$checkMfaResult$1.invokeSuspend$lambda$1$lambda$0(securityFido2AuthenticatorViewModel3);
                                    }
                                });
                                obj2 = obj3;
                            }
                        } else if (nextStep.equals("SWITCH_PASSKEY_TOGGLE")) {
                            MutableSharedFlow mutableSharedFlow3 = securityFido2AuthenticatorViewModel.gEmmrt;
                            Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                            this.L$0 = obj2;
                            this.L$1 = securityFido2AuthenticatorViewModel;
                            this.L$2 = str4;
                            this.label = 4;
                            if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            obj3 = obj2;
                            securityFido2AuthenticatorViewModel2 = securityFido2AuthenticatorViewModel;
                            str = str4;
                            securityFido2AuthenticatorViewModel2.EZpvd(str);
                            obj2 = obj3;
                        }
                    }
                    MutableSharedFlow mutableSharedFlow4 = securityFido2AuthenticatorViewModel.gEmmrt;
                    Boolean boolKWHzl4 = C56443yFo.KWHzl(false);
                    this.L$0 = obj2;
                    this.L$1 = securityFido2AuthenticatorViewModel;
                    this.label = 5;
                    if (mutableSharedFlow4.emit(boolKWHzl4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    securityFido2AuthenticatorViewModel.EZpvd.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa))));
                    break;
                }
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableLiveData mutableLiveData = securityFido2AuthenticatorViewModel4.EZpvd;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(message)));
                    MutableSharedFlow mutableSharedFlow5 = securityFido2AuthenticatorViewModel4.gEmmrt;
                    Boolean boolKWHzl5 = C56443yFo.KWHzl(false);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    if (mutableSharedFlow5.emit(boolKWHzl5, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5763aCc c5763aCc2 = this.this$0.uzCIH;
                String str32 = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc2, str32, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                }
                obj2 = objM8552invoke0E7RQCE$default;
                securityFido2AuthenticatorViewModel = this.this$0;
                String str42 = this.$sessionId;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objM8552invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                obj2 = objM8552invoke0E7RQCE$default;
                securityFido2AuthenticatorViewModel = this.this$0;
                String str422 = this.$sessionId;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                str2 = (String) this.L$2;
                securityFido2AuthenticatorViewModel3 = (SecurityFido2AuthenticatorViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                securityFido2AuthenticatorViewModel3.AEQbTJ(str2, (Function0<Unit>) new Function0() { // from class: o.aKN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return SecurityFido2AuthenticatorViewModel$checkMfaResult$1.invokeSuspend$lambda$1$lambda$0(securityFido2AuthenticatorViewModel3);
                    }
                });
                obj2 = obj3;
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                str = (String) this.L$2;
                securityFido2AuthenticatorViewModel2 = (SecurityFido2AuthenticatorViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                securityFido2AuthenticatorViewModel2.EZpvd(str);
                obj2 = obj3;
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel42222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                securityFido2AuthenticatorViewModel = (SecurityFido2AuthenticatorViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                securityFido2AuthenticatorViewModel.EZpvd.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa))));
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel422222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel) {
        securityFido2AuthenticatorViewModel.fJNWhG();
        return Unit.INSTANCE;
    }
}

package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5762aCb;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationRequestViewModel$checkVerificationResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $challenge;
    final /* synthetic */ String $targetCredentialId;
    Object L$0;
    int label;
    final /* synthetic */ VerificationRequestViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestViewModel$checkVerificationResult$1(VerificationRequestViewModel verificationRequestViewModel, String str, String str2, Continuation<? super VerificationRequestViewModel$checkVerificationResult$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationRequestViewModel;
        this.$challenge = str;
        this.$targetCredentialId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationRequestViewModel$checkVerificationResult$1(this.this$0, this.$challenge, this.$targetCredentialId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationRequestViewModel$checkVerificationResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        C5762aCb.ActionBar actionBar;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5762aCb.TaskDescription taskDescription = new C5762aCb.TaskDescription(this.$challenge, this.$targetCredentialId, "[Send verification request][Verification]");
                C5762aCb c5762aCb = this.this$0.valueOf;
                this.label = 2;
                objKWHzl = c5762aCb.KWHzl(taskDescription, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                actionBar = (C5762aCb.ActionBar) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (actionBar != null) {
                    VerificationRequestViewModel verificationRequestViewModel = this.this$0;
                    if (Intrinsics.EZpvd(actionBar, C5762aCb.ActionBar.StateListAnimator.EZpvd)) {
                        MutableSharedFlow mutableSharedFlow3 = verificationRequestViewModel.AhwBna;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (actionBar instanceof C5762aCb.ActionBar.Application) {
                        MutableSharedFlow mutableSharedFlow4 = verificationRequestViewModel.KWHzl;
                        String strKWHzl = ((C5762aCb.ActionBar.Application) actionBar).KWHzl();
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(strKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (actionBar instanceof C5762aCb.ActionBar.TaskDescription) {
                        MutableSharedFlow mutableSharedFlow5 = verificationRequestViewModel.OLrzqt;
                        MfaFailure mfaFailureAEQbTJ = ((C5762aCb.ActionBar.TaskDescription) actionBar).AEQbTJ();
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(mfaFailureAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    VerificationRequestViewModel verificationRequestViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "check verification result error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow6 = verificationRequestViewModel2.KWHzl;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlow6.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5762aCb.TaskDescription taskDescription2 = new C5762aCb.TaskDescription(this.$challenge, this.$targetCredentialId, "[Send verification request][Verification]");
                C5762aCb c5762aCb2 = this.this$0.valueOf;
                this.label = 2;
                objKWHzl = c5762aCb2.KWHzl(taskDescription2, this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                actionBar = (C5762aCb.ActionBar) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (actionBar != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                actionBar = (C5762aCb.ActionBar) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (actionBar != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
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

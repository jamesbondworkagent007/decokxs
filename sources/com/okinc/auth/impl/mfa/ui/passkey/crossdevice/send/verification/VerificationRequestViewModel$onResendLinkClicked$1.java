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
import o.C5772aCl;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationRequestViewModel$onResendLinkClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $challenge;
    final /* synthetic */ String $targetCredentialId;
    Object L$0;
    int label;
    final /* synthetic */ VerificationRequestViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestViewModel$onResendLinkClicked$1(String str, String str2, VerificationRequestViewModel verificationRequestViewModel, Continuation<? super VerificationRequestViewModel$onResendLinkClicked$1> continuation) {
        super(2, continuation);
        this.$challenge = str;
        this.$targetCredentialId = str2;
        this.this$0 = verificationRequestViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationRequestViewModel$onResendLinkClicked$1(this.$challenge, this.$targetCredentialId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationRequestViewModel$onResendLinkClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "on resend link clicked, challenge=" + this.$challenge + ", targetCredentialId=" + this.$targetCredentialId);
            C5772aCl.StateListAnimator stateListAnimator = new C5772aCl.StateListAnimator(this.$challenge, this.$targetCredentialId, "[Send verification request][Verification]");
            C5772aCl c5772aCl = this.this$0.values;
            this.label = 1;
            objKWHzl = c5772aCl.KWHzl(stateListAnimator, (Continuation) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    VerificationRequestViewModel verificationRequestViewModel = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "start cross device verification error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow = verificationRequestViewModel.KWHzl;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        obj2 = objKWHzl;
        C5772aCl.TaskDescription taskDescription = (C5772aCl.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
        if (taskDescription != null) {
            VerificationRequestViewModel verificationRequestViewModel2 = this.this$0;
            if (Intrinsics.EZpvd(taskDescription, C5772aCl.TaskDescription.C0816TaskDescription.AEQbTJ)) {
                verificationRequestViewModel2.valueOf();
            } else if (taskDescription instanceof C5772aCl.TaskDescription.ActionBar) {
                MutableSharedFlow mutableSharedFlow2 = verificationRequestViewModel2.KWHzl;
                String strOLrzqt = ((C5772aCl.TaskDescription.ActionBar) taskDescription).OLrzqt();
                this.L$0 = obj2;
                this.label = 2;
                if (mutableSharedFlow2.emit(strOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (taskDescription instanceof C5772aCl.TaskDescription.StateListAnimator) {
                MutableSharedFlow mutableSharedFlow3 = verificationRequestViewModel2.OLrzqt;
                MfaFailure mfaFailureKWHzl = ((C5772aCl.TaskDescription.StateListAnimator) taskDescription).KWHzl();
                this.L$0 = obj2;
                this.label = 3;
                if (mutableSharedFlow3.emit(mfaFailureKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}

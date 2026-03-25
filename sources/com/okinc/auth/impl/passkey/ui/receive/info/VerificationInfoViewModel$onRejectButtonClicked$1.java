package com.okinc.auth.impl.passkey.ui.receive.info;

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
import o.C5770aCj;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationInfoViewModel$onRejectButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ VerificationInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoViewModel$onRejectButtonClicked$1(VerificationInfoViewModel verificationInfoViewModel, Continuation<? super VerificationInfoViewModel$onRejectButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationInfoViewModel$onRejectButtonClicked$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationInfoViewModel$onRejectButtonClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        C5770aCj.Application application;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "on reject button clicked");
                MutableSharedFlow mutableSharedFlow2 = this.this$0.AYXKKw;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5770aCj.TaskDescription taskDescription = new C5770aCj.TaskDescription((String) this.this$0.getNewProxyInstance.getValue(), "[Receive verification request][Info]");
                C5770aCj c5770aCj = this.this$0.iwGUEr;
                this.label = 2;
                objKWHzl = c5770aCj.KWHzl(taskDescription, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                application = (C5770aCj.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                    VerificationInfoViewModel verificationInfoViewModel = this.this$0;
                    if (Intrinsics.EZpvd(application, C5770aCj.Application.Activity.KWHzl)) {
                        MutableSharedFlow mutableSharedFlow3 = verificationInfoViewModel.valueOf;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (application instanceof C5770aCj.Application.StateListAnimator) {
                        MutableSharedFlow mutableSharedFlow4 = verificationInfoViewModel.gEmmrt;
                        String strEZpvd = ((C5770aCj.Application.StateListAnimator) application).EZpvd();
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(strEZpvd, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (Intrinsics.EZpvd(application, C5770aCj.Application.C0815Application.AEQbTJ)) {
                        MutableSharedFlow mutableSharedFlow5 = verificationInfoViewModel.djBIcL;
                        Unit unit2 = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(unit2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    VerificationInfoViewModel verificationInfoViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "on reject cross verification error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow6 = verificationInfoViewModel2.gEmmrt;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlow6.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5770aCj.TaskDescription taskDescription2 = new C5770aCj.TaskDescription((String) this.this$0.getNewProxyInstance.getValue(), "[Receive verification request][Info]");
                C5770aCj c5770aCj2 = this.this$0.iwGUEr;
                this.label = 2;
                objKWHzl = c5770aCj2.KWHzl(taskDescription2, this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                application = (C5770aCj.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AYXKKw;
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
                application = (C5770aCj.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AYXKKw;
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
                mutableSharedFlow = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.AYXKKw;
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

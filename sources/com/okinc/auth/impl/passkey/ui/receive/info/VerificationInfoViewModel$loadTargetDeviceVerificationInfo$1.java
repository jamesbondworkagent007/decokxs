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
import o.C5761aCa;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ VerificationInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1(VerificationInfoViewModel verificationInfoViewModel, String str, Continuation<? super VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationInfoViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        C5761aCa.Application application;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.AhwBna;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5761aCa.Activity activity = new C5761aCa.Activity(this.$sessionId, "[Receive verification request][Info]");
                C5761aCa c5761aCa = this.this$0.DbNXlk;
                this.label = 2;
                objKWHzl = c5761aCa.KWHzl(activity, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                application = (C5761aCa.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                    VerificationInfoViewModel verificationInfoViewModel = this.this$0;
                    if (application instanceof C5761aCa.Application.ActionBar) {
                        verificationInfoViewModel.values.setValue(((C5761aCa.Application.ActionBar) application).OLrzqt());
                    } else if (application instanceof C5761aCa.Application.StateListAnimator) {
                        MutableSharedFlow mutableSharedFlow3 = verificationInfoViewModel.gEmmrt;
                        String strOLrzqt = ((C5761aCa.Application.StateListAnimator) application).OLrzqt();
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(strOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (Intrinsics.EZpvd(application, C5761aCa.Application.C0813Application.OLrzqt)) {
                        MutableSharedFlow mutableSharedFlow4 = verificationInfoViewModel.djBIcL;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    VerificationInfoViewModel verificationInfoViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "load target device verification info error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow5 = verificationInfoViewModel2.gEmmrt;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow5.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.AhwBna;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5761aCa.Activity activity2 = new C5761aCa.Activity(this.$sessionId, "[Receive verification request][Info]");
                C5761aCa c5761aCa2 = this.this$0.DbNXlk;
                this.label = 2;
                objKWHzl = c5761aCa2.KWHzl(activity2, this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                application = (C5761aCa.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AhwBna;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                application = (C5761aCa.Application) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (application != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AhwBna;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AhwBna;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.AhwBna;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package com.okinc.auth.impl.passkey.ui.receive.info;

import androidx.fragment.app.Fragment;
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
import o.C5705aBX;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationInfoViewModel$onApproveButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    Object L$0;
    int label;
    final /* synthetic */ VerificationInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoViewModel$onApproveButtonClicked$1(VerificationInfoViewModel verificationInfoViewModel, Fragment fragment, Continuation<? super VerificationInfoViewModel$onApproveButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationInfoViewModel;
        this.$fragment = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationInfoViewModel$onApproveButtonClicked$1(this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationInfoViewModel$onApproveButtonClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        C5705aBX.Activity activity;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "on approve button clicked");
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5705aBX.ActionBar actionBar = new C5705aBX.ActionBar(this.$fragment, (String) this.this$0.getNewProxyInstance.getValue(), "[Receive verification request][Info]");
                C5705aBX c5705aBX = this.this$0.AkhnZx;
                this.label = 2;
                objKWHzl = c5705aBX.KWHzl(actionBar, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                activity = (C5705aBX.Activity) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (activity != null) {
                    VerificationInfoViewModel verificationInfoViewModel = this.this$0;
                    if (activity instanceof C5705aBX.Activity.Application) {
                        MutableSharedFlow mutableSharedFlow3 = verificationInfoViewModel.KWHzl;
                        Boolean boolKWHzl3 = C56443yFo.KWHzl(((C5705aBX.Activity.Application) activity).copydefault());
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (activity instanceof C5705aBX.Activity.C0809Activity) {
                        MutableSharedFlow mutableSharedFlow4 = verificationInfoViewModel.gEmmrt;
                        String strAEQbTJ = ((C5705aBX.Activity.C0809Activity) activity).AEQbTJ();
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(strAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (Intrinsics.EZpvd(activity, C5705aBX.Activity.StateListAnimator.copydefault)) {
                        MutableSharedFlow mutableSharedFlow5 = verificationInfoViewModel.OLrzqt;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (!Intrinsics.EZpvd(activity, C5705aBX.Activity.TaskDescription.EZpvd)) {
                        if (Intrinsics.EZpvd(activity, C5705aBX.Activity.ActionBar.KWHzl)) {
                            MutableSharedFlow mutableSharedFlow6 = verificationInfoViewModel.djBIcL;
                            Unit unit2 = Unit.INSTANCE;
                            this.L$0 = obj2;
                            this.label = 6;
                            if (mutableSharedFlow6.emit(unit2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    VerificationInfoViewModel verificationInfoViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "on approve cross verification error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow7 = verificationInfoViewModel2.gEmmrt;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 7;
                    if (mutableSharedFlow7.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.copydefault;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5705aBX.ActionBar actionBar2 = new C5705aBX.ActionBar(this.$fragment, (String) this.this$0.getNewProxyInstance.getValue(), "[Receive verification request][Info]");
                C5705aBX c5705aBX2 = this.this$0.AkhnZx;
                this.label = 2;
                objKWHzl = c5705aBX2.KWHzl(actionBar2, this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                activity = (C5705aBX.Activity) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (activity != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                activity = (C5705aBX.Activity) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (activity != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
            case 5:
            case 6:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.copydefault;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.copydefault;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

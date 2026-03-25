package com.okinc.auth.impl.passkey.ui.receive.kickout;

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
import o.C5706aBY;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class KickOutViewModel$kickOut$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    Object L$0;
    int label;
    final /* synthetic */ KickOutViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KickOutViewModel$kickOut$1(KickOutViewModel kickOutViewModel, Fragment fragment, Continuation<? super KickOutViewModel$kickOut$1> continuation) {
        super(2, continuation);
        this.this$0 = kickOutViewModel;
        this.$fragment = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KickOutViewModel$kickOut$1(this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KickOutViewModel$kickOut$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        C5706aBY.TaskDescription taskDescription;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C5882aEp.KWHzl.KWHzl("[Receive verification request][Kick out]", "on kick out button clicked");
                MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5706aBY.Activity activity = new C5706aBY.Activity(this.$fragment, (String) this.this$0.isConnected.getValue(), "[Receive verification request][Kick out]");
                C5706aBY c5706aBY = this.this$0.valueOf;
                this.label = 2;
                objKWHzl = c5706aBY.KWHzl(activity, (Continuation) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                taskDescription = (C5706aBY.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                    KickOutViewModel kickOutViewModel = this.this$0;
                    if (Intrinsics.EZpvd(taskDescription, C5706aBY.TaskDescription.StateListAnimator.KWHzl)) {
                        MutableSharedFlow mutableSharedFlow3 = kickOutViewModel.EZpvd;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (taskDescription instanceof C5706aBY.TaskDescription.Application) {
                        MutableSharedFlow mutableSharedFlow4 = kickOutViewModel.copydefault;
                        String strOLrzqt = ((C5706aBY.TaskDescription.Application) taskDescription).OLrzqt();
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(strOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (Intrinsics.EZpvd(taskDescription, C5706aBY.TaskDescription.Activity.KWHzl)) {
                        MutableSharedFlow mutableSharedFlow5 = kickOutViewModel.KWHzl;
                        Unit unit2 = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(unit2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (!Intrinsics.EZpvd(taskDescription, C5706aBY.TaskDescription.C0810TaskDescription.KWHzl)) {
                        if (Intrinsics.EZpvd(taskDescription, C5706aBY.TaskDescription.ActionBar.copydefault)) {
                            MutableSharedFlow mutableSharedFlow6 = kickOutViewModel.djBIcL;
                            Unit unit3 = Unit.INSTANCE;
                            this.L$0 = obj2;
                            this.label = 6;
                            if (mutableSharedFlow6.emit(unit3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    KickOutViewModel kickOutViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Receive verification request][Kick out]", "kick out error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow7 = kickOutViewModel2.copydefault;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 7;
                    if (mutableSharedFlow7.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5706aBY.Activity activity2 = new C5706aBY.Activity(this.$fragment, (String) this.this$0.isConnected.getValue(), "[Receive verification request][Kick out]");
                C5706aBY c5706aBY2 = this.this$0.valueOf;
                this.label = 2;
                objKWHzl = c5706aBY2.KWHzl(activity2, (Continuation) this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                taskDescription = (C5706aBY.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.OLrzqt;
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
                taskDescription = (C5706aBY.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.OLrzqt;
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
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.OLrzqt;
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

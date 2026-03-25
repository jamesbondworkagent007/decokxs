package com.okinc.im.imui.group.management.viewmodel;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35783oDn;
import o.C38307pTy;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTB;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$upgradeGroupSize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $capacity;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$upgradeGroupSize$1(GroupManagementViewModel groupManagementViewModel, int i, Continuation<? super GroupManagementViewModel$upgradeGroupSize$1> continuation) {
        super(2, continuation);
        this.this$0 = groupManagementViewModel;
        this.$capacity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupManagementViewModel$upgradeGroupSize$1(this.this$0, this.$capacity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$upgradeGroupSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        GroupManagementViewModel groupManagementViewModel;
        int i;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        GroupManagementViewModel.Activity.Application application;
        Object obj3;
        Throwable thM7380exceptionOrNullimpl;
        GroupManagementViewModel groupManagementViewModel2;
        MutableStateFlow mutableStateFlow;
        Throwable cause;
        GroupManagementViewModel.StateListAnimator.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription = new GroupManagementViewModel.StateListAnimator.TaskDescription(true);
                this.label = 1;
                if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                C35783oDn c35783oDn = this.this$0.DbNXlk;
                String strValueOf = this.this$0.valueOf();
                this.label = 2;
                objEZpvd = c35783oDn.EZpvd(strValueOf, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                groupManagementViewModel = this.this$0;
                i = this.$capacity;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    ((Boolean) objEZpvd).booleanValue();
                    groupManagementViewModel.copydefault();
                    MutableStateFlow mutableStateFlow3 = groupManagementViewModel.KWHzl;
                    GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription2 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                    this.L$0 = objEZpvd;
                    this.L$1 = groupManagementViewModel;
                    this.I$0 = i;
                    this.label = 3;
                    if (mutableStateFlow3.emit(taskDescription2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                    application = new GroupManagementViewModel.Activity.Application(pTB.formatICUNumber$default(C56443yFo.AEQbTJ(i), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null));
                    this.L$0 = objEZpvd;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(application, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objEZpvd;
                    obj2 = obj3;
                    GroupManagementViewModel groupManagementViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow4 = groupManagementViewModel3.KWHzl;
                        GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription3 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                        this.L$0 = obj2;
                        this.L$1 = groupManagementViewModel3;
                        this.L$2 = thM7380exceptionOrNullimpl;
                        this.label = 5;
                        if (mutableStateFlow4.emit(taskDescription3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        groupManagementViewModel2 = groupManagementViewModel3;
                        mutableStateFlow = groupManagementViewModel2.KWHzl;
                        cause = thM7380exceptionOrNullimpl.getCause();
                        if (cause == null) {
                            cause = new Exception(String.valueOf(C55688xof.Application.ejfBZ));
                        }
                        activity = new GroupManagementViewModel.StateListAnimator.Activity(cause);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                obj2 = objEZpvd;
                GroupManagementViewModel groupManagementViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C35783oDn c35783oDn2 = this.this$0.DbNXlk;
                String strValueOf2 = this.this$0.valueOf();
                this.label = 2;
                objEZpvd = c35783oDn2.EZpvd(strValueOf2, this);
                if (objEZpvd == objCopydefault) {
                }
                groupManagementViewModel = this.this$0;
                i = this.$capacity;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                groupManagementViewModel = this.this$0;
                i = this.$capacity;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                }
                break;
            case 3:
                i = this.I$0;
                groupManagementViewModel = (GroupManagementViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj4;
                mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                application = new GroupManagementViewModel.Activity.Application(pTB.formatICUNumber$default(C56443yFo.AEQbTJ(i), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null));
                this.L$0 = objEZpvd;
                this.L$1 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(application, this) != objCopydefault) {
                }
                break;
            case 4:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj3;
                GroupManagementViewModel groupManagementViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                groupManagementViewModel2 = (GroupManagementViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = groupManagementViewModel2.KWHzl;
                cause = thM7380exceptionOrNullimpl.getCause();
                if (cause == null) {
                }
                activity = new GroupManagementViewModel.StateListAnimator.Activity(cause);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (mutableStateFlow.emit(activity, this) == objCopydefault) {
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

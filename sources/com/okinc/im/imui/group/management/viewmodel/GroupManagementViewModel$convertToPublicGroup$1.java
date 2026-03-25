package com.okinc.im.imui.group.management.viewmodel;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sHZ;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$convertToPublicGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$convertToPublicGroup$1(GroupManagementViewModel groupManagementViewModel, String str, Continuation<? super GroupManagementViewModel$convertToPublicGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = groupManagementViewModel;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupManagementViewModel$convertToPublicGroup$1 groupManagementViewModel$convertToPublicGroup$1 = new GroupManagementViewModel$convertToPublicGroup$1(this.this$0, this.$groupId, continuation);
        groupManagementViewModel$convertToPublicGroup$1.L$0 = obj;
        return groupManagementViewModel$convertToPublicGroup$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$convertToPublicGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:10:0x003a, B:29:0x008e, B:31:0x0092, B:19:0x006a, B:21:0x0072, B:23:0x0078, B:26:0x0080), top: B:70:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        GroupManagementViewModel groupManagementViewModel;
        Throwable thM7380exceptionOrNullimpl;
        Integer numOLrzqt;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        GroupManagementViewModel.Activity.TaskDescription taskDescription;
        GroupManagementViewModel groupManagementViewModel2;
        Object obj3;
        MutableSharedFlow mutableSharedFlow2;
        GroupManagementViewModel.Activity.ActionBar actionBar;
        sIR sirCopydefault;
        Unit unit;
        sHZ shzAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription2 = new GroupManagementViewModel.StateListAnimator.TaskDescription(true);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableStateFlow.emit(taskDescription2, this) == objCopydefault) {
                    return objCopydefault;
                }
                GroupManagementViewModel groupManagementViewModel3 = this.this$0;
                String str = this.$groupId;
                Result.Application application2 = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU = groupManagementViewModel3.valueOf;
                sirCopydefault = (interfaceC35180nqU != null || (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) == null) ? null : shzAEQbTJ.copydefault();
                if (sirCopydefault != null) {
                    unit = null;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    groupManagementViewModel = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    groupManagementViewModel2 = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
                GroupPublicType groupPublicType = GroupPublicType.PUBLIC;
                this.L$0 = null;
                this.label = 2;
                if (sirCopydefault.EZpvd(str, groupPublicType, this) == objCopydefault) {
                    return objCopydefault;
                }
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                groupManagementViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow2 = groupManagementViewModel.KWHzl;
                    GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription3 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = groupManagementViewModel;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 3;
                    if (mutableStateFlow2.emit(taskDescription3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    numOLrzqt = C44157sFk.OLrzqt(thM7380exceptionOrNullimpl);
                    if (numOLrzqt != null && numOLrzqt.intValue() == 2023) {
                        mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                        taskDescription = GroupManagementViewModel.Activity.TaskDescription.copydefault;
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (numOLrzqt != null && numOLrzqt.intValue() == 2039) {
                        MutableSharedFlow mutableSharedFlow3 = groupManagementViewModel.AEQbTJ;
                        GroupManagementViewModel.Activity.C0437Activity c0437Activity = GroupManagementViewModel.Activity.C0437Activity.copydefault;
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (mutableSharedFlow3.emit(c0437Activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableStateFlow mutableStateFlow3 = groupManagementViewModel.KWHzl;
                        GroupManagementViewModel.StateListAnimator.Activity activity = new GroupManagementViewModel.StateListAnimator.Activity(thM7380exceptionOrNullimpl);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        if (mutableStateFlow3.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj2 = objM7377constructorimpl;
                    objM7377constructorimpl = obj2;
                }
                groupManagementViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    groupManagementViewModel2.copydefault();
                    MutableStateFlow mutableStateFlow4 = groupManagementViewModel2.KWHzl;
                    GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription4 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = groupManagementViewModel2;
                    this.label = 7;
                    if (mutableStateFlow4.emit(taskDescription4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objM7377constructorimpl;
                    mutableSharedFlow2 = groupManagementViewModel2.AEQbTJ;
                    actionBar = GroupManagementViewModel.Activity.ActionBar.copydefault;
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.label = 8;
                    if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                GroupManagementViewModel groupManagementViewModel32 = this.this$0;
                String str2 = this.$groupId;
                Result.Application application22 = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU2 = groupManagementViewModel32.valueOf;
                if (interfaceC35180nqU2 != null) {
                    if (sirCopydefault != null) {
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                groupManagementViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                groupManagementViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 3:
                thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                groupManagementViewModel = (GroupManagementViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = obj4;
                numOLrzqt = C44157sFk.OLrzqt(thM7380exceptionOrNullimpl);
                if (numOLrzqt != null) {
                    mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                    taskDescription = GroupManagementViewModel.Activity.TaskDescription.copydefault;
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                    }
                    obj2 = objM7377constructorimpl;
                    objM7377constructorimpl = obj2;
                    groupManagementViewModel2 = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    }
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = obj2;
                groupManagementViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 7:
                groupManagementViewModel2 = (GroupManagementViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = groupManagementViewModel2.AEQbTJ;
                actionBar = GroupManagementViewModel.Activity.ActionBar.copydefault;
                this.L$0 = obj3;
                this.L$1 = null;
                this.label = 8;
                if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault) {
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

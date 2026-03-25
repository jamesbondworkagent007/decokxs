package com.okinc.im.imui.group.management.viewmodel;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sHZ;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$updateGroupDescription$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $description;
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$updateGroupDescription$1(GroupManagementViewModel groupManagementViewModel, String str, String str2, Continuation<? super GroupManagementViewModel$updateGroupDescription$1> continuation) {
        super(2, continuation);
        this.this$0 = groupManagementViewModel;
        this.$groupId = str;
        this.$description = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupManagementViewModel$updateGroupDescription$1 groupManagementViewModel$updateGroupDescription$1 = new GroupManagementViewModel$updateGroupDescription$1(this.this$0, this.$groupId, this.$description, continuation);
        groupManagementViewModel$updateGroupDescription$1.L$0 = obj;
        return groupManagementViewModel$updateGroupDescription$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$updateGroupDescription$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object obj2;
        String str;
        GroupManagementViewModel groupManagementViewModel;
        MutableSharedFlow mutableSharedFlow;
        GroupManagementViewModel.Activity.StateListAnimator stateListAnimator;
        Unit unit;
        sHZ shzAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription = new GroupManagementViewModel.StateListAnimator.TaskDescription(true);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableStateFlow.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    GroupManagementViewModel groupManagementViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = groupManagementViewModel2.KWHzl;
                        GroupManagementViewModel.StateListAnimator.Activity activity = new GroupManagementViewModel.StateListAnimator.Activity(thM7380exceptionOrNullimpl);
                        this.L$0 = objM7377constructorimpl;
                        this.label = 3;
                        if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj2 = objM7377constructorimpl;
                    GroupManagementViewModel groupManagementViewModel3 = this.this$0;
                    str = this.$groupId;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    str = (String) this.L$2;
                    groupManagementViewModel = (GroupManagementViewModel) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                    stateListAnimator = new GroupManagementViewModel.Activity.StateListAnimator(str);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj3;
                GroupManagementViewModel groupManagementViewModel32 = this.this$0;
                str = this.$groupId;
                if (Result.m7384isSuccessimpl(obj2)) {
                    groupManagementViewModel32.copydefault();
                    MutableStateFlow mutableStateFlow3 = groupManagementViewModel32.KWHzl;
                    GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription2 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                    this.L$0 = obj2;
                    this.L$1 = groupManagementViewModel32;
                    this.L$2 = str;
                    this.label = 4;
                    if (mutableStateFlow3.emit(taskDescription2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    groupManagementViewModel = groupManagementViewModel32;
                    mutableSharedFlow = groupManagementViewModel.AEQbTJ;
                    stateListAnimator = new GroupManagementViewModel.Activity.StateListAnimator(str);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupManagementViewModel groupManagementViewModel4 = this.this$0;
        String str2 = this.$groupId;
        String str3 = this.$description;
        Result.Application application2 = Result.Companion;
        InterfaceC35180nqU interfaceC35180nqU = groupManagementViewModel4.valueOf;
        sIR sirCopydefault = (interfaceC35180nqU == null || (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) == null) ? null : shzAEQbTJ.copydefault();
        if (sirCopydefault == null) {
            unit = null;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            GroupManagementViewModel groupManagementViewModel22 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            obj2 = objM7377constructorimpl;
            GroupManagementViewModel groupManagementViewModel322 = this.this$0;
            str = this.$groupId;
            if (Result.m7384isSuccessimpl(obj2)) {
            }
            return Unit.INSTANCE;
        }
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) str3).toString();
        this.L$0 = null;
        this.label = 2;
        if (sirCopydefault.AEQbTJ(str2, string, this) == objCopydefault) {
            return objCopydefault;
        }
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        GroupManagementViewModel groupManagementViewModel222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        obj2 = objM7377constructorimpl;
        GroupManagementViewModel groupManagementViewModel3222 = this.this$0;
        str = this.$groupId;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        return Unit.INSTANCE;
    }
}

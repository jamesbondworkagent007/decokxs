package com.okinc.im.imui.group.management.viewmodel;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$executeGroupSettingsUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $apiCall;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupManagementViewModel$executeGroupSettingsUpdate$1(GroupManagementViewModel groupManagementViewModel, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super GroupManagementViewModel$executeGroupSettingsUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = groupManagementViewModel;
        this.$apiCall = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupManagementViewModel$executeGroupSettingsUpdate$1 groupManagementViewModel$executeGroupSettingsUpdate$1 = new GroupManagementViewModel$executeGroupSettingsUpdate$1(this.this$0, this.$apiCall, continuation);
        groupManagementViewModel$executeGroupSettingsUpdate$1.L$0 = obj;
        return groupManagementViewModel$executeGroupSettingsUpdate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$executeGroupSettingsUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
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
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    obj2 = objM7377constructorimpl;
                    GroupManagementViewModel groupManagementViewModel = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = groupManagementViewModel.KWHzl;
                        GroupManagementViewModel.StateListAnimator.Activity activity = new GroupManagementViewModel.StateListAnimator.Activity(thM7380exceptionOrNullimpl);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    GroupManagementViewModel groupManagementViewModel2 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    this.this$0.copydefault();
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.copydefault();
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                GroupManagementViewModel groupManagementViewModel22 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    MutableStateFlow mutableStateFlow3 = groupManagementViewModel22.KWHzl;
                    GroupManagementViewModel.StateListAnimator.TaskDescription taskDescription2 = new GroupManagementViewModel.StateListAnimator.TaskDescription(false);
                    this.L$0 = obj2;
                    this.label = 4;
                    if (mutableStateFlow3.emit(taskDescription2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                this.this$0.copydefault();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Function1<Continuation<? super Unit>, Object> function1 = this.$apiCall;
        Result.Application application2 = Result.Companion;
        this.L$0 = null;
        this.label = 2;
        if (function1.invoke(this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        obj2 = objM7377constructorimpl;
        GroupManagementViewModel groupManagementViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        GroupManagementViewModel groupManagementViewModel222 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        this.this$0.copydefault();
        return Unit.INSTANCE;
    }
}

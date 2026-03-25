package com.okinc.im.imui.group.management.viewmodel;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$refreshGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$refreshGroupInfo$1(GroupManagementViewModel groupManagementViewModel, Continuation<? super GroupManagementViewModel$refreshGroupInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = groupManagementViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupManagementViewModel$refreshGroupInfo$1 groupManagementViewModel$refreshGroupInfo$1 = new GroupManagementViewModel$refreshGroupInfo$1(this.this$0, continuation);
        groupManagementViewModel$refreshGroupInfo$1.L$0 = obj;
        return groupManagementViewModel$refreshGroupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$refreshGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupManagementViewModel groupManagementViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            oDA oda = groupManagementViewModel.copydefault;
            String strValueOf = groupManagementViewModel.valueOf();
            this.label = 1;
            obj = oda.copydefault(strValueOf, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                GroupManagementViewModel groupManagementViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    MutableSharedFlow mutableSharedFlow = groupManagementViewModel2.EZpvd;
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit((GroupInfo) obj2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((GroupInfo) obj);
        obj2 = objM7377constructorimpl;
        GroupManagementViewModel groupManagementViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = groupManagementViewModel3.KWHzl;
            GroupManagementViewModel.StateListAnimator.Activity activity = new GroupManagementViewModel.StateListAnimator.Activity(thM7380exceptionOrNullimpl);
            this.L$0 = obj2;
            this.label = 2;
            if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        GroupManagementViewModel groupManagementViewModel22 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        return Unit.INSTANCE;
    }
}

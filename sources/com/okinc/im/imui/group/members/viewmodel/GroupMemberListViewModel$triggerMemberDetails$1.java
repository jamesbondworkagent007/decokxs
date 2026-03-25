package com.okinc.im.imui.group.members.viewmodel;

import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$triggerMemberDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $memberId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$triggerMemberDetails$1(GroupMemberListViewModel groupMemberListViewModel, String str, Continuation<? super GroupMemberListViewModel$triggerMemberDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = groupMemberListViewModel;
        this.$memberId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupMemberListViewModel$triggerMemberDetails$1 groupMemberListViewModel$triggerMemberDetails$1 = new GroupMemberListViewModel$triggerMemberDetails$1(this.this$0, this.$memberId, continuation);
        groupMemberListViewModel$triggerMemberDetails$1.L$0 = obj;
        return groupMemberListViewModel$triggerMemberDetails$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMemberListViewModel$triggerMemberDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0028, B:22:0x006e, B:24:0x0072, B:25:0x0077, B:26:0x0082, B:19:0x0052), top: B:41:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0028, B:22:0x006e, B:24:0x0072, B:25:0x0077, B:26:0x0082, B:19:0x0052), top: B:41:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        RelationInfo relationInfo;
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
            MutableStateFlow mutableStateFlow = this.this$0.AhwBna;
            GroupMemberListViewModel.StateListAnimator.ActionBar actionBar = GroupMemberListViewModel.StateListAnimator.ActionBar.EZpvd;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    GroupMemberListViewModel groupMemberListViewModel = this.this$0;
                    String str = this.$memberId;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableStateFlow mutableStateFlow2 = groupMemberListViewModel.AhwBna;
                        GroupMemberListViewModel.StateListAnimator.Activity activity = new GroupMemberListViewModel.StateListAnimator.Activity(str, (RelationInfo) obj2);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                relationInfo = (RelationInfo) obj;
                if (relationInfo == null) {
                    objM7377constructorimpl = Result.m7377constructorimpl(relationInfo);
                    obj2 = objM7377constructorimpl;
                    String str2 = this.$memberId;
                    GroupMemberListViewModel groupMemberListViewModel2 = this.this$0;
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("GroupMembersViewModel", "Failed to fetch member details for " + str2, thM7380exceptionOrNullimpl);
                        MutableStateFlow mutableStateFlow3 = groupMemberListViewModel2.AhwBna;
                        GroupMemberListViewModel.StateListAnimator.TaskDescription taskDescription = new GroupMemberListViewModel.StateListAnimator.TaskDescription(thM7380exceptionOrNullimpl);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableStateFlow3.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    GroupMemberListViewModel groupMemberListViewModel3 = this.this$0;
                    String str3 = this.$memberId;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupMemberListViewModel groupMemberListViewModel4 = this.this$0;
        String str4 = this.$memberId;
        Result.Application application2 = Result.Companion;
        C35859oGi c35859oGi = groupMemberListViewModel4.ejfBZ;
        String str5 = (String) groupMemberListViewModel4.AEQbTJ.getValue();
        this.L$0 = null;
        this.label = 2;
        obj = c35859oGi.copydefault(str4, str5, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        relationInfo = (RelationInfo) obj;
        if (relationInfo == null) {
        }
    }
}

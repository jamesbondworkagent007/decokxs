package com.okinc.im.imui.group.members.viewmodel;

import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35798oEb;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$refreshGroupMemberInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$refreshGroupMemberInfo$1(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super GroupMemberListViewModel$refreshGroupMemberInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = groupMemberListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupMemberListViewModel$refreshGroupMemberInfo$1 groupMemberListViewModel$refreshGroupMemberInfo$1 = new GroupMemberListViewModel$refreshGroupMemberInfo$1(this.this$0, continuation);
        groupMemberListViewModel$refreshGroupMemberInfo$1.L$0 = obj;
        return groupMemberListViewModel$refreshGroupMemberInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMemberListViewModel$refreshGroupMemberInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:11:0x0024, B:26:0x008b, B:30:0x009c, B:21:0x0061, B:23:0x006e, B:29:0x0090, B:32:0x00a2, B:20:0x0059), top: B:44:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:11:0x0024, B:26:0x008b, B:30:0x009c, B:21:0x0061, B:23:0x006e, B:29:0x0090, B:32:0x00a2, B:20:0x0059), top: B:44:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {all -> 0x008e, blocks: (B:11:0x0024, B:26:0x008b, B:30:0x009c, B:21:0x0061, B:23:0x006e, B:29:0x0090, B:32:0x00a2, B:20:0x0059), top: B:44:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:26:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:30:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        GroupMemberListViewModel groupMemberListViewModel;
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object value = this.L$2;
                    mutableStateFlow = (MutableStateFlow) this.L$1;
                    groupMemberListViewModel = (GroupMemberListViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    List listEZpvd = (List) obj;
                    if (mutableStateFlow.compareAndSet(value, listEZpvd)) {
                        objM7377constructorimpl = Result.m7377constructorimpl(groupMemberListViewModel.copydefault());
                        GroupMemberListViewModel groupMemberListViewModel2 = this.this$0;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("GroupMembersViewModel", "Failed to refresh member info for group " + groupMemberListViewModel2.AEQbTJ.getValue(), thM7380exceptionOrNullimpl);
                            objM7377constructorimpl = new GroupMemberListViewModel.StateListAnimator.TaskDescription(thM7380exceptionOrNullimpl);
                        }
                        MutableStateFlow mutableStateFlow2 = this.this$0.AhwBna;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (mutableStateFlow2.emit((GroupMemberListViewModel.StateListAnimator) objM7377constructorimpl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    value = mutableStateFlow.getValue();
                    if (!groupMemberListViewModel.gEmmrt()) {
                        C35798oEb c35798oEb = groupMemberListViewModel.valueOf;
                        String str = (String) groupMemberListViewModel.AEQbTJ.getValue();
                        this.L$0 = groupMemberListViewModel;
                        this.L$1 = mutableStateFlow;
                        this.L$2 = value;
                        this.label = 2;
                        obj = c35798oEb.KWHzl(str, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        List listEZpvd2 = (List) obj;
                        if (mutableStateFlow.compareAndSet(value, listEZpvd2)) {
                        }
                        value = mutableStateFlow.getValue();
                        if (!groupMemberListViewModel.gEmmrt()) {
                            listEZpvd2 = C56402yEa.EZpvd(groupMemberListViewModel.valueOf.OLrzqt());
                            if (mutableStateFlow.compareAndSet(value, listEZpvd2)) {
                            }
                            value = mutableStateFlow.getValue();
                            if (!groupMemberListViewModel.gEmmrt()) {
                            }
                        }
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            if (StringsKt__StringsKt.fARcdN((CharSequence) this.this$0.AEQbTJ.getValue())) {
                MutableStateFlow mutableStateFlow3 = this.this$0.AhwBna;
                GroupMemberListViewModel.StateListAnimator.C0446StateListAnimator c0446StateListAnimator = GroupMemberListViewModel.StateListAnimator.C0446StateListAnimator.KWHzl;
                this.label = 1;
                if (mutableStateFlow3.emit(c0446StateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                GroupMemberListViewModel groupMemberListViewModel3 = this.this$0;
                Result.Application application2 = Result.Companion;
                groupMemberListViewModel = groupMemberListViewModel3;
                mutableStateFlow = groupMemberListViewModel3.KWHzl;
                value = mutableStateFlow.getValue();
                if (!groupMemberListViewModel.gEmmrt()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}

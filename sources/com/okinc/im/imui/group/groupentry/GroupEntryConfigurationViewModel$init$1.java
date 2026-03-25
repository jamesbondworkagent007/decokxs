package com.okinc.im.imui.group.groupentry;

import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC44412sOw;
import o.AbstractC44413sOx;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupEntryConfigurationViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$init$1(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, Continuation<? super GroupEntryConfigurationViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEntryConfigurationViewModel$init$1 groupEntryConfigurationViewModel$init$1 = new GroupEntryConfigurationViewModel$init$1(this.this$0, continuation);
        groupEntryConfigurationViewModel$init$1.L$0 = obj;
        return groupEntryConfigurationViewModel$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupEntryConfigurationViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel;
        AbstractC44412sOw abstractC44412sOw;
        AbstractC44413sOx abstractC44413sOx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryConfigurationViewModel groupEntryConfigurationViewModel2 = this.this$0;
            Result.Application application2 = Result.Companion;
            GroupEntryConfigurationViewModel.Fragment.Application application3 = GroupEntryConfigurationViewModel.Fragment.Application.copydefault;
            this.L$0 = groupEntryConfigurationViewModel2;
            this.label = 1;
            if (groupEntryConfigurationViewModel2.AEQbTJ(application3, this) == objCopydefault) {
                return objCopydefault;
            }
            groupEntryConfigurationViewModel = groupEntryConfigurationViewModel2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    groupEntryConfigurationViewModel = (GroupEntryConfigurationViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    Pair pair = (Pair) obj;
                    abstractC44412sOw = (AbstractC44412sOw) pair.component1();
                    abstractC44413sOx = (AbstractC44413sOx) pair.component2();
                    this.L$0 = null;
                    this.label = 3;
                    if (groupEntryConfigurationViewModel.EZpvd(abstractC44412sOw, abstractC44413sOx, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    GroupEntryConfigurationViewModel groupEntryConfigurationViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                GroupEntryConfigurationViewModel groupEntryConfigurationViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("GroupEntryConfigurationViewModel", thM7380exceptionOrNullimpl);
                    GroupEntryConfigurationViewModel.Fragment.Activity activity = GroupEntryConfigurationViewModel.Fragment.Activity.copydefault;
                    this.L$0 = objM7377constructorimpl;
                    this.label = 4;
                    if (groupEntryConfigurationViewModel32.AEQbTJ(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            groupEntryConfigurationViewModel = (GroupEntryConfigurationViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        GroupEntryConfigurationViewModel$init$1$1$1 groupEntryConfigurationViewModel$init$1$1$1 = new GroupEntryConfigurationViewModel$init$1$1$1(groupEntryConfigurationViewModel, null);
        this.L$0 = groupEntryConfigurationViewModel;
        this.label = 2;
        obj = CoroutineScopeKt.coroutineScope(groupEntryConfigurationViewModel$init$1$1$1, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Pair pair2 = (Pair) obj;
        abstractC44412sOw = (AbstractC44412sOw) pair2.component1();
        abstractC44413sOx = (AbstractC44413sOx) pair2.component2();
        this.L$0 = null;
        this.label = 3;
        if (groupEntryConfigurationViewModel.EZpvd(abstractC44412sOw, abstractC44413sOx, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel322 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.im.imui.group.members.viewmodel;

import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.oDV;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$removeSelectedMembers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$removeSelectedMembers$1(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super GroupMemberListViewModel$removeSelectedMembers$1> continuation) {
        super(2, continuation);
        this.this$0 = groupMemberListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMemberListViewModel$removeSelectedMembers$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMemberListViewModel$removeSelectedMembers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        oDV.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AhwBna;
            GroupMemberListViewModel.StateListAnimator.ActionBar actionBar = GroupMemberListViewModel.StateListAnimator.ActionBar.EZpvd;
            this.label = 1;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                application = (oDV.Application) obj;
                if (!(application instanceof oDV.Application.ActionBar)) {
                    MutableStateFlow mutableStateFlow2 = this.this$0.AhwBna;
                    GroupMemberListViewModel.StateListAnimator.FragmentManager fragmentManager = GroupMemberListViewModel.StateListAnimator.FragmentManager.OLrzqt;
                    this.label = 3;
                    if (mutableStateFlow2.emit(fragmentManager, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (application instanceof oDV.Application.StateListAnimator) {
                    MutableStateFlow mutableStateFlow3 = this.this$0.AhwBna;
                    GroupMemberListViewModel.StateListAnimator.Dialog dialog = new GroupMemberListViewModel.StateListAnimator.Dialog(((oDV.Application.StateListAnimator) application).OLrzqt());
                    this.label = 4;
                    if (mutableStateFlow3.emit(dialog, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<GroupMemberInfo> value = this.this$0.EZpvd().getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupMemberInfo) it.next()).getMemberId());
        }
        oDV odv = this.this$0.AuCTel;
        String str = (String) this.this$0.AEQbTJ.getValue();
        this.label = 2;
        obj = odv.KWHzl(str, arrayList, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        application = (oDV.Application) obj;
        if (!(application instanceof oDV.Application.ActionBar)) {
        }
        return Unit.INSTANCE;
    }
}

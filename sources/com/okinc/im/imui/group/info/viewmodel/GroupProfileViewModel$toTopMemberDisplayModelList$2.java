package com.okinc.im.imui.group.info.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC34158nTo;
import o.C35551nxW;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$toTopMemberDisplayModelList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC34158nTo>>, Object> {
    final /* synthetic */ List<GroupMemberInfo> $this_toTopMemberDisplayModelList;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$toTopMemberDisplayModelList$2(GroupProfileViewModel groupProfileViewModel, List<GroupMemberInfo> list, Continuation<? super GroupProfileViewModel$toTopMemberDisplayModelList$2> continuation) {
        super(2, continuation);
        this.this$0 = groupProfileViewModel;
        this.$this_toTopMemberDisplayModelList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupProfileViewModel$toTopMemberDisplayModelList$2(this.this$0, this.$this_toTopMemberDisplayModelList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC34158nTo>> continuation) {
        return ((GroupProfileViewModel$toTopMemberDisplayModelList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<GroupMemberInfo> listAYXKKw;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfoDjBIcL = this.this$0.djBIcL();
            boolean z = groupInfoDjBIcL != null && (groupInfoDjBIcL.isAllowAddMember() || groupInfoDjBIcL.isShowAddAffiliateMember());
            GroupInfo groupInfoDjBIcL2 = this.this$0.djBIcL();
            if (groupInfoDjBIcL2 != null) {
                Integer type = groupInfoDjBIcL2.getType();
                listAYXKKw = (type != null && type.intValue() == GroupTagType.RM_VIP_GROUP.getValue()) ? C35551nxW.copydefault.AYXKKw(this.$this_toTopMemberDisplayModelList) : this.$this_toTopMemberDisplayModelList;
            }
            if (z) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
                for (GroupMemberInfo groupMemberInfo : listAYXKKw) {
                    arrayList.add(new AbstractC34158nTo.ActionBar(groupMemberInfo, C44157sFk.EZpvd(groupMemberInfo)));
                }
                return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, 5), (Iterable) C56402yEa.EZpvd(AbstractC34158nTo.StateListAnimator.KWHzl));
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
            for (GroupMemberInfo groupMemberInfo2 : listAYXKKw) {
                arrayList2.add(new AbstractC34158nTo.ActionBar(groupMemberInfo2, C44157sFk.EZpvd(groupMemberInfo2)));
            }
            return CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList2, 6);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupSettingsFragment$getLatestGroupDescription$2 extends SuspendLambda implements Function2<GroupInfo, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $groupId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsFragment$getLatestGroupDescription$2(String str, Continuation<? super GroupSettingsFragment$getLatestGroupDescription$2> continuation) {
        super(2, continuation);
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupSettingsFragment$getLatestGroupDescription$2 groupSettingsFragment$getLatestGroupDescription$2 = new GroupSettingsFragment$getLatestGroupDescription$2(this.$groupId, continuation);
        groupSettingsFragment$getLatestGroupDescription$2.L$0 = obj;
        return groupSettingsFragment$getLatestGroupDescription$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GroupInfo groupInfo, Continuation<? super Boolean> continuation) {
        return ((GroupSettingsFragment$getLatestGroupDescription$2) create(groupInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56443yFo.KWHzl(Intrinsics.EZpvd((Object) ((GroupInfo) this.L$0).getGroupId(), (Object) this.$groupId));
    }
}

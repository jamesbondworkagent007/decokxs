package com.okinc.im.imui.impl;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.LongPressInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C35419nux;
import o.C36404oaN;
import o.C36426oaj;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.oDP;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ GroupInfo $groupInfo;
    final /* synthetic */ GroupMemberInfo $memberInfo;
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ String $senderId;
    int label;
    final /* synthetic */ C36426oaj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1(C36426oaj c36426oaj, OKMessage oKMessage, String str, GroupInfo groupInfo, GroupMemberInfo groupMemberInfo, AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c36426oaj;
        this.$message = oKMessage;
        this.$senderId = str;
        this.$groupInfo = groupInfo;
        this.$memberInfo = groupMemberInfo;
        this.$activity = abstractActivityC33041mov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1(this.this$0, this.$message, this.$senderId, this.$groupInfo, this.$memberInfo, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oDP odpKWHzl = this.this$0.KWHzl();
            String targetId = this.$message.getTargetId();
            String str = this.$senderId;
            this.label = 1;
            obj = odpKWHzl.OLrzqt(targetId, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C35419nux.Companion.AEQbTJ(new LongPressInfo(C56443yFo.KWHzl(Long.parseLong(this.$groupInfo.getGroupId())), C56443yFo.KWHzl(Long.parseLong(this.$memberInfo.getMemberId())), C44157sFk.EZpvd(this.$memberInfo)), this.$groupInfo, this.$message).show(this.$activity.getSupportFragmentManager(), "");
        } else {
            C36404oaN.EZpvd.EZpvd(C56402yEa.EZpvd(this.$memberInfo));
        }
        return Unit.INSTANCE;
    }
}

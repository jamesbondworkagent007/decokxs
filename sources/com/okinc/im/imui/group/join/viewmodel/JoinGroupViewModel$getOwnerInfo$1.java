package com.okinc.im.imui.group.join.viewmodel;

import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33129mqd;
import o.C35864oGn;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$getOwnerInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInvitationInfoResponse.GroupOwnerInfo $data;
    final /* synthetic */ int $totalMemberCount;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$getOwnerInfo$1(JoinGroupViewModel joinGroupViewModel, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i, Continuation<? super JoinGroupViewModel$getOwnerInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
        this.$data = groupOwnerInfo;
        this.$totalMemberCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$getOwnerInfo$1(this.this$0, this.$data, this.$totalMemberCount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$getOwnerInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String nickname;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35864oGn c35864oGn = this.this$0.ejfBZ;
            String strGEmmrt = C33129mqd.gEmmrt(this.$data.getUserUid());
            this.label = 1;
            obj = c35864oGn.AEQbTJ(strGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        RelationInfo relationInfo = (RelationInfo) obj;
        Long userUid = this.$data.getUserUid();
        String avatar = this.$data.getAvatar();
        if (relationInfo == null || (nickname = C44157sFk.getDisplayName$default(relationInfo, null, 1, null)) == null) {
            nickname = this.$data.getNickname();
        }
        JoinGroupViewModel.StateListAnimator.C0424StateListAnimator c0424StateListAnimator = new JoinGroupViewModel.StateListAnimator.C0424StateListAnimator(new GroupInvitationInfoResponse.GroupOwnerInfo(userUid, avatar, nickname), this.$totalMemberCount);
        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
        this.label = 2;
        if (mutableSharedFlow.emit(c0424StateListAnimator, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

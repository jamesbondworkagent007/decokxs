package com.okinc.im.usecase.group.voicecall;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.AbstractC44426sPj;
import o.C35797oEa;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44256sJb;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupVoiceCallUseCase$joinGroupVoiceCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44426sPj>, Object> {
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35797oEa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupVoiceCallUseCase$joinGroupVoiceCall$2(C35797oEa c35797oEa, String str, Continuation<? super GroupVoiceCallUseCase$joinGroupVoiceCall$2> continuation) {
        super(2, continuation);
        this.this$0 = c35797oEa;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupVoiceCallUseCase$joinGroupVoiceCall$2 groupVoiceCallUseCase$joinGroupVoiceCall$2 = new GroupVoiceCallUseCase$joinGroupVoiceCall$2(this.this$0, this.$groupId, continuation);
        groupVoiceCallUseCase$joinGroupVoiceCall$2.L$0 = obj;
        return groupVoiceCallUseCase$joinGroupVoiceCall$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44426sPj> continuation) {
        return ((GroupVoiceCallUseCase$joinGroupVoiceCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35797oEa c35797oEa = this.this$0;
                String str = this.$groupId;
                InterfaceC44256sJb interfaceC44256sJb = c35797oEa.EZpvd;
                this.label = 1;
                obj = interfaceC44256sJb.AEQbTJ(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            pUU.KWHzl("GroupVoiceCallUseCase", "join group voice call success");
            JoinGroupVoiceCallResponse joinGroupVoiceCallResponse = (JoinGroupVoiceCallResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            return new AbstractC44426sPj.Activity(joinGroupVoiceCallResponse.getAgoraUid(), joinGroupVoiceCallResponse.getToken(), joinGroupVoiceCallResponse.getChannelName());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.KWHzl("GroupVoiceCallUseCase", "join group voice call failed: " + actionBar2.KWHzl());
        return new AbstractC44426sPj.StateListAnimator(((OKServerException) actionBar2.KWHzl()).getCode(), (Throwable) actionBar2.KWHzl());
    }
}

package com.okinc.im.imui.messageinfo;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.ReadUser;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34282nYe;
import o.C56391yDq;
import o.C56442yFn;
import o.oDQ;
import o.sIR;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageInfoViewModel$buildReadUsersDisplayList$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C34282nYe>, Object> {
    final /* synthetic */ sIR $groupApi;
    final /* synthetic */ String $groupId;
    final /* synthetic */ ReadUser $readUser;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInfoViewModel$buildReadUsersDisplayList$2$1$1(sIR sir, String str, ReadUser readUser, Continuation<? super MessageInfoViewModel$buildReadUsersDisplayList$2$1$1> continuation) {
        super(2, continuation);
        this.$groupApi = sir;
        this.$groupId = str;
        this.$readUser = readUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageInfoViewModel$buildReadUsersDisplayList$2$1$1 messageInfoViewModel$buildReadUsersDisplayList$2$1$1 = new MessageInfoViewModel$buildReadUsersDisplayList$2$1$1(this.$groupApi, this.$groupId, this.$readUser, continuation);
        messageInfoViewModel$buildReadUsersDisplayList$2$1$1.L$0 = obj;
        return messageInfoViewModel$buildReadUsersDisplayList$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C34282nYe> continuation) {
        return ((MessageInfoViewModel$buildReadUsersDisplayList$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.$groupApi;
            String str = this.$groupId;
            ReadUser readUser = this.$readUser;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(sir.OLrzqt(str, readUser.getUserUid()));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            GroupMemberInfo groupMemberInfo = (GroupMemberInfo) objM7377constructorimpl;
            if (groupMemberInfo != null) {
                return oDQ.EZpvd(groupMemberInfo);
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
